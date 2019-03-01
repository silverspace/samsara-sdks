package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class SensorsApiSimulation extends Simulation {

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
    val getSensorsPerSecond = config.getDouble("performance.operationsPerSecond.getSensors") * rateMultiplier * instanceMultiplier
    val getSensorsCargoPerSecond = config.getDouble("performance.operationsPerSecond.getSensorsCargo") * rateMultiplier * instanceMultiplier
    val getSensorsDoorPerSecond = config.getDouble("performance.operationsPerSecond.getSensorsDoor") * rateMultiplier * instanceMultiplier
    val getSensorsHistoryPerSecond = config.getDouble("performance.operationsPerSecond.getSensorsHistory") * rateMultiplier * instanceMultiplier
    val getSensorsHumidityPerSecond = config.getDouble("performance.operationsPerSecond.getSensorsHumidity") * rateMultiplier * instanceMultiplier
    val getSensorsTemperaturePerSecond = config.getDouble("performance.operationsPerSecond.getSensorsTemperature") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val get_sensorsQUERYFeeder = csv(userDataDirectory + File.separator + "getSensors-queryParams.csv").random
    val get_sensors_cargoQUERYFeeder = csv(userDataDirectory + File.separator + "getSensorsCargo-queryParams.csv").random
    val get_sensors_doorQUERYFeeder = csv(userDataDirectory + File.separator + "getSensorsDoor-queryParams.csv").random
    val get_sensors_historyQUERYFeeder = csv(userDataDirectory + File.separator + "getSensorsHistory-queryParams.csv").random
    val get_sensors_humidityQUERYFeeder = csv(userDataDirectory + File.separator + "getSensorsHumidity-queryParams.csv").random
    val get_sensors_temperatureQUERYFeeder = csv(userDataDirectory + File.separator + "getSensorsTemperature-queryParams.csv").random

    // Setup all scenarios

    
    val scngetSensors = scenario("getSensorsSimulation")
        .feed(get_sensorsQUERYFeeder)
        .exec(http("getSensors")
        .httpRequest("POST","/sensors/list")
        .queryParam("access_token","${access_token}")
)

    // Run scngetSensors with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSensors.inject(
        rampUsersPerSec(1) to(getSensorsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSensorsPerSecond) during(durationSeconds),
        rampUsersPerSec(getSensorsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSensorsCargo = scenario("getSensorsCargoSimulation")
        .feed(get_sensors_cargoQUERYFeeder)
        .exec(http("getSensorsCargo")
        .httpRequest("POST","/sensors/cargo")
        .queryParam("access_token","${access_token}")
)

    // Run scngetSensorsCargo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSensorsCargo.inject(
        rampUsersPerSec(1) to(getSensorsCargoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSensorsCargoPerSecond) during(durationSeconds),
        rampUsersPerSec(getSensorsCargoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSensorsDoor = scenario("getSensorsDoorSimulation")
        .feed(get_sensors_doorQUERYFeeder)
        .exec(http("getSensorsDoor")
        .httpRequest("POST","/sensors/door")
        .queryParam("access_token","${access_token}")
)

    // Run scngetSensorsDoor with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSensorsDoor.inject(
        rampUsersPerSec(1) to(getSensorsDoorPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSensorsDoorPerSecond) during(durationSeconds),
        rampUsersPerSec(getSensorsDoorPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSensorsHistory = scenario("getSensorsHistorySimulation")
        .feed(get_sensors_historyQUERYFeeder)
        .exec(http("getSensorsHistory")
        .httpRequest("POST","/sensors/history")
        .queryParam("access_token","${access_token}")
)

    // Run scngetSensorsHistory with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSensorsHistory.inject(
        rampUsersPerSec(1) to(getSensorsHistoryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSensorsHistoryPerSecond) during(durationSeconds),
        rampUsersPerSec(getSensorsHistoryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSensorsHumidity = scenario("getSensorsHumiditySimulation")
        .feed(get_sensors_humidityQUERYFeeder)
        .exec(http("getSensorsHumidity")
        .httpRequest("POST","/sensors/humidity")
        .queryParam("access_token","${access_token}")
)

    // Run scngetSensorsHumidity with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSensorsHumidity.inject(
        rampUsersPerSec(1) to(getSensorsHumidityPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSensorsHumidityPerSecond) during(durationSeconds),
        rampUsersPerSec(getSensorsHumidityPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetSensorsTemperature = scenario("getSensorsTemperatureSimulation")
        .feed(get_sensors_temperatureQUERYFeeder)
        .exec(http("getSensorsTemperature")
        .httpRequest("POST","/sensors/temperature")
        .queryParam("access_token","${access_token}")
)

    // Run scngetSensorsTemperature with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetSensorsTemperature.inject(
        rampUsersPerSec(1) to(getSensorsTemperaturePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getSensorsTemperaturePerSecond) during(durationSeconds),
        rampUsersPerSec(getSensorsTemperaturePerSecond) to(1) during(rampDownSeconds)
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
