package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class TagsApiSimulation extends Simulation {

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
    val createTagPerSecond = config.getDouble("performance.operationsPerSecond.createTag") * rateMultiplier * instanceMultiplier
    val deleteTagByIdPerSecond = config.getDouble("performance.operationsPerSecond.deleteTagById") * rateMultiplier * instanceMultiplier
    val getAllTagsPerSecond = config.getDouble("performance.operationsPerSecond.getAllTags") * rateMultiplier * instanceMultiplier
    val getTagByIdPerSecond = config.getDouble("performance.operationsPerSecond.getTagById") * rateMultiplier * instanceMultiplier
    val modifyTagByIdPerSecond = config.getDouble("performance.operationsPerSecond.modifyTagById") * rateMultiplier * instanceMultiplier
    val updateTagByIdPerSecond = config.getDouble("performance.operationsPerSecond.updateTagById") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val CreateTagQUERYFeeder = csv(userDataDirectory + File.separator + "createTag-queryParams.csv").random
    val deleteTagByIdQUERYFeeder = csv(userDataDirectory + File.separator + "deleteTagById-queryParams.csv").random
    val deleteTagByIdPATHFeeder = csv(userDataDirectory + File.separator + "deleteTagById-pathParams.csv").random
    val GetAllTagsQUERYFeeder = csv(userDataDirectory + File.separator + "getAllTags-queryParams.csv").random
    val getTagByIdQUERYFeeder = csv(userDataDirectory + File.separator + "getTagById-queryParams.csv").random
    val getTagByIdPATHFeeder = csv(userDataDirectory + File.separator + "getTagById-pathParams.csv").random
    val modifyTagByIdQUERYFeeder = csv(userDataDirectory + File.separator + "modifyTagById-queryParams.csv").random
    val modifyTagByIdPATHFeeder = csv(userDataDirectory + File.separator + "modifyTagById-pathParams.csv").random
    val updateTagByIdQUERYFeeder = csv(userDataDirectory + File.separator + "updateTagById-queryParams.csv").random
    val updateTagByIdPATHFeeder = csv(userDataDirectory + File.separator + "updateTagById-pathParams.csv").random

    // Setup all scenarios

    
    val scncreateTag = scenario("createTagSimulation")
        .feed(CreateTagQUERYFeeder)
        .exec(http("createTag")
        .httpRequest("POST","/tags")
        .queryParam("access_token","${access_token}")
)

    // Run scncreateTag with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncreateTag.inject(
        rampUsersPerSec(1) to(createTagPerSecond) during(rampUpSeconds),
        constantUsersPerSec(createTagPerSecond) during(durationSeconds),
        rampUsersPerSec(createTagPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteTagById = scenario("deleteTagByIdSimulation")
        .feed(deleteTagByIdQUERYFeeder)
        .feed(deleteTagByIdPATHFeeder)
        .exec(http("deleteTagById")
        .httpRequest("DELETE","/tags/${tag_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scndeleteTagById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteTagById.inject(
        rampUsersPerSec(1) to(deleteTagByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteTagByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteTagByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAllTags = scenario("getAllTagsSimulation")
        .feed(GetAllTagsQUERYFeeder)
        .exec(http("getAllTags")
        .httpRequest("GET","/tags")
        .queryParam("access_token","${access_token}")
        .queryParam("group_id","${group_id}")
)

    // Run scngetAllTags with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAllTags.inject(
        rampUsersPerSec(1) to(getAllTagsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAllTagsPerSecond) during(durationSeconds),
        rampUsersPerSec(getAllTagsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetTagById = scenario("getTagByIdSimulation")
        .feed(getTagByIdQUERYFeeder)
        .feed(getTagByIdPATHFeeder)
        .exec(http("getTagById")
        .httpRequest("GET","/tags/${tag_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scngetTagById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetTagById.inject(
        rampUsersPerSec(1) to(getTagByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getTagByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(getTagByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmodifyTagById = scenario("modifyTagByIdSimulation")
        .feed(modifyTagByIdQUERYFeeder)
        .feed(modifyTagByIdPATHFeeder)
        .exec(http("modifyTagById")
        .httpRequest("PATCH","/tags/${tag_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scnmodifyTagById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmodifyTagById.inject(
        rampUsersPerSec(1) to(modifyTagByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(modifyTagByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(modifyTagByIdPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnupdateTagById = scenario("updateTagByIdSimulation")
        .feed(updateTagByIdQUERYFeeder)
        .feed(updateTagByIdPATHFeeder)
        .exec(http("updateTagById")
        .httpRequest("PUT","/tags/${tag_id}")
        .queryParam("access_token","${access_token}")
)

    // Run scnupdateTagById with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnupdateTagById.inject(
        rampUsersPerSec(1) to(updateTagByIdPerSecond) during(rampUpSeconds),
        constantUsersPerSec(updateTagByIdPerSecond) during(durationSeconds),
        rampUsersPerSec(updateTagByIdPerSecond) to(1) during(rampDownSeconds)
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
