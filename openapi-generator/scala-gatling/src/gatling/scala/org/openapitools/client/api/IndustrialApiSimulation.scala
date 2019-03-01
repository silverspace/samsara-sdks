package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class IndustrialApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://api.samsara.com/v1")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val getAllDataInputsPerSecond = config.getDouble("performance.operationsPerSecond.getAllDataInputs") * rateMultiplier * instanceMultiplier
    val getDataInputPerSecond = config.getDouble("performance.operationsPerSecond.getDataInput") * rateMultiplier * instanceMultiplier
    val getMachinesPerSecond = config.getDouble("performance.operationsPerSecond.getMachines") * rateMultiplier * instanceMultiplier
    val getMachinesHistoryPerSecond = config.getDouble("performance.operationsPerSecond.getMachinesHistory") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val GetAllDataInputsQUERYFeeder = csv(userDataDirectory + File.separator + "getAllDataInputs-queryParams.csv").random
    val GetDataInputQUERYFeeder = csv(userDataDirectory + File.separator + "getDataInput-queryParams.csv").random
    val GetDataInputPATHFeeder = csv(userDataDirectory + File.separator + "getDataInput-pathParams.csv").random
    val get_machinesQUERYFeeder = csv(userDataDirectory + File.separator + "getMachines-queryParams.csv").random
    val get_machines_historyQUERYFeeder = csv(userDataDirectory + File.separator + "getMachinesHistory-queryParams.csv").random

    // Setup all scenarios

    
    val scngetAllDataInputs = scenario("getAllDataInputsSimulation")
        .feed(GetAllDataInputsQUERYFeeder)
        .exec(http("getAllDataInputs")
        .httpRequest("GET","/industrial/data")
        .queryParam("access_token","${access_token}")
        .queryParam("endMs","${endMs}")
        .queryParam("startMs","${startMs}")
        .queryParam("group_id","${group_id}")
)

    // Run scngetAllDataInputs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAllDataInputs.inject(
        rampUsersPerSec(1) to(getAllDataInputsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAllDataInputsPerSecond) during(durationSeconds),
        rampUsersPerSec(getAllDataInputsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetDataInput = scenario("getDataInputSimulation")
        .feed(GetDataInputQUERYFeeder)
        .feed(GetDataInputPATHFeeder)
        .exec(http("getDataInput")
        .httpRequest("GET","/industrial/data/${data_input_id}")
        .queryParam("access_token","${access_token}")
        .queryParam("endMs","${endMs}")
        .queryParam("startMs","${startMs}")
)

    // Run scngetDataInput with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetDataInput.inject(
        rampUsersPerSec(1) to(getDataInputPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getDataInputPerSecond) during(durationSeconds),
        rampUsersPerSec(getDataInputPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetMachines = scenario("getMachinesSimulation")
        .feed(get_machinesQUERYFeeder)
        .exec(http("getMachines")
        .httpRequest("POST","/machines/list")
        .queryParam("access_token","${access_token}")
)

    // Run scngetMachines with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetMachines.inject(
        rampUsersPerSec(1) to(getMachinesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getMachinesPerSecond) during(durationSeconds),
        rampUsersPerSec(getMachinesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetMachinesHistory = scenario("getMachinesHistorySimulation")
        .feed(get_machines_historyQUERYFeeder)
        .exec(http("getMachinesHistory")
        .httpRequest("POST","/machines/history")
        .queryParam("access_token","${access_token}")
)

    // Run scngetMachinesHistory with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetMachinesHistory.inject(
        rampUsersPerSec(1) to(getMachinesHistoryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getMachinesHistoryPerSecond) during(durationSeconds),
        rampUsersPerSec(getMachinesHistoryPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
