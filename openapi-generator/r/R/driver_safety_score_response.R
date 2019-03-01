# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' DriverSafetyScoreResponse Class
#'
#' @field crashCount 
#' @field driverId 
#' @field harshAccelCount 
#' @field harshBrakingCount 
#' @field harshEvents 
#' @field harshTurningCount 
#' @field safetyScore 
#' @field safetyScoreRank 
#' @field timeOverSpeedLimitMs 
#' @field totalDistanceDrivenMeters 
#' @field totalHarshEventCount 
#' @field totalTimeDrivenMs 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DriverSafetyScoreResponse <- R6::R6Class(
  'DriverSafetyScoreResponse',
  public = list(
    `crashCount` = NULL,
    `driverId` = NULL,
    `harshAccelCount` = NULL,
    `harshBrakingCount` = NULL,
    `harshEvents` = NULL,
    `harshTurningCount` = NULL,
    `safetyScore` = NULL,
    `safetyScoreRank` = NULL,
    `timeOverSpeedLimitMs` = NULL,
    `totalDistanceDrivenMeters` = NULL,
    `totalHarshEventCount` = NULL,
    `totalTimeDrivenMs` = NULL,
    initialize = function(`crashCount`=NULL, `driverId`=NULL, `harshAccelCount`=NULL, `harshBrakingCount`=NULL, `harshEvents`=NULL, `harshTurningCount`=NULL, `safetyScore`=NULL, `safetyScoreRank`=NULL, `timeOverSpeedLimitMs`=NULL, `totalDistanceDrivenMeters`=NULL, `totalHarshEventCount`=NULL, `totalTimeDrivenMs`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`crashCount`)) {
        stopifnot(is.numeric(`crashCount`), length(`crashCount`) == 1)
        self$`crashCount` <- `crashCount`
      }
      if (!is.null(`driverId`)) {
        stopifnot(is.numeric(`driverId`), length(`driverId`) == 1)
        self$`driverId` <- `driverId`
      }
      if (!is.null(`harshAccelCount`)) {
        stopifnot(is.numeric(`harshAccelCount`), length(`harshAccelCount`) == 1)
        self$`harshAccelCount` <- `harshAccelCount`
      }
      if (!is.null(`harshBrakingCount`)) {
        stopifnot(is.numeric(`harshBrakingCount`), length(`harshBrakingCount`) == 1)
        self$`harshBrakingCount` <- `harshBrakingCount`
      }
      if (!is.null(`harshEvents`)) {
        stopifnot(is.vector(`harshEvents`), length(`harshEvents`) != 0)
        sapply(`harshEvents`, function(x) stopifnot(R6::is.R6(x)))
        self$`harshEvents` <- `harshEvents`
      }
      if (!is.null(`harshTurningCount`)) {
        stopifnot(is.numeric(`harshTurningCount`), length(`harshTurningCount`) == 1)
        self$`harshTurningCount` <- `harshTurningCount`
      }
      if (!is.null(`safetyScore`)) {
        stopifnot(is.numeric(`safetyScore`), length(`safetyScore`) == 1)
        self$`safetyScore` <- `safetyScore`
      }
      if (!is.null(`safetyScoreRank`)) {
        stopifnot(is.character(`safetyScoreRank`), length(`safetyScoreRank`) == 1)
        self$`safetyScoreRank` <- `safetyScoreRank`
      }
      if (!is.null(`timeOverSpeedLimitMs`)) {
        stopifnot(is.numeric(`timeOverSpeedLimitMs`), length(`timeOverSpeedLimitMs`) == 1)
        self$`timeOverSpeedLimitMs` <- `timeOverSpeedLimitMs`
      }
      if (!is.null(`totalDistanceDrivenMeters`)) {
        stopifnot(is.numeric(`totalDistanceDrivenMeters`), length(`totalDistanceDrivenMeters`) == 1)
        self$`totalDistanceDrivenMeters` <- `totalDistanceDrivenMeters`
      }
      if (!is.null(`totalHarshEventCount`)) {
        stopifnot(is.numeric(`totalHarshEventCount`), length(`totalHarshEventCount`) == 1)
        self$`totalHarshEventCount` <- `totalHarshEventCount`
      }
      if (!is.null(`totalTimeDrivenMs`)) {
        stopifnot(is.numeric(`totalTimeDrivenMs`), length(`totalTimeDrivenMs`) == 1)
        self$`totalTimeDrivenMs` <- `totalTimeDrivenMs`
      }
    },
    toJSON = function() {
      DriverSafetyScoreResponseObject <- list()
      if (!is.null(self$`crashCount`)) {
        DriverSafetyScoreResponseObject[['crashCount']] <-
          self$`crashCount`
      }
      if (!is.null(self$`driverId`)) {
        DriverSafetyScoreResponseObject[['driverId']] <-
          self$`driverId`
      }
      if (!is.null(self$`harshAccelCount`)) {
        DriverSafetyScoreResponseObject[['harshAccelCount']] <-
          self$`harshAccelCount`
      }
      if (!is.null(self$`harshBrakingCount`)) {
        DriverSafetyScoreResponseObject[['harshBrakingCount']] <-
          self$`harshBrakingCount`
      }
      if (!is.null(self$`harshEvents`)) {
        DriverSafetyScoreResponseObject[['harshEvents']] <-
          sapply(self$`harshEvents`, function(x) x$toJSON())
      }
      if (!is.null(self$`harshTurningCount`)) {
        DriverSafetyScoreResponseObject[['harshTurningCount']] <-
          self$`harshTurningCount`
      }
      if (!is.null(self$`safetyScore`)) {
        DriverSafetyScoreResponseObject[['safetyScore']] <-
          self$`safetyScore`
      }
      if (!is.null(self$`safetyScoreRank`)) {
        DriverSafetyScoreResponseObject[['safetyScoreRank']] <-
          self$`safetyScoreRank`
      }
      if (!is.null(self$`timeOverSpeedLimitMs`)) {
        DriverSafetyScoreResponseObject[['timeOverSpeedLimitMs']] <-
          self$`timeOverSpeedLimitMs`
      }
      if (!is.null(self$`totalDistanceDrivenMeters`)) {
        DriverSafetyScoreResponseObject[['totalDistanceDrivenMeters']] <-
          self$`totalDistanceDrivenMeters`
      }
      if (!is.null(self$`totalHarshEventCount`)) {
        DriverSafetyScoreResponseObject[['totalHarshEventCount']] <-
          self$`totalHarshEventCount`
      }
      if (!is.null(self$`totalTimeDrivenMs`)) {
        DriverSafetyScoreResponseObject[['totalTimeDrivenMs']] <-
          self$`totalTimeDrivenMs`
      }

      DriverSafetyScoreResponseObject
    },
    fromJSON = function(DriverSafetyScoreResponseJson) {
      DriverSafetyScoreResponseObject <- jsonlite::fromJSON(DriverSafetyScoreResponseJson)
      if (!is.null(DriverSafetyScoreResponseObject$`crashCount`)) {
        self$`crashCount` <- DriverSafetyScoreResponseObject$`crashCount`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`driverId`)) {
        self$`driverId` <- DriverSafetyScoreResponseObject$`driverId`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`harshAccelCount`)) {
        self$`harshAccelCount` <- DriverSafetyScoreResponseObject$`harshAccelCount`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`harshBrakingCount`)) {
        self$`harshBrakingCount` <- DriverSafetyScoreResponseObject$`harshBrakingCount`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`harshEvents`)) {
        self$`harshEvents` <- sapply(DriverSafetyScoreResponseObject$`harshEvents`, function(x) {
          harshEventsObject <- SafetyReportHarshEvent$new()
          harshEventsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          harshEventsObject
        })
      }
      if (!is.null(DriverSafetyScoreResponseObject$`harshTurningCount`)) {
        self$`harshTurningCount` <- DriverSafetyScoreResponseObject$`harshTurningCount`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`safetyScore`)) {
        self$`safetyScore` <- DriverSafetyScoreResponseObject$`safetyScore`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`safetyScoreRank`)) {
        self$`safetyScoreRank` <- DriverSafetyScoreResponseObject$`safetyScoreRank`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`timeOverSpeedLimitMs`)) {
        self$`timeOverSpeedLimitMs` <- DriverSafetyScoreResponseObject$`timeOverSpeedLimitMs`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`totalDistanceDrivenMeters`)) {
        self$`totalDistanceDrivenMeters` <- DriverSafetyScoreResponseObject$`totalDistanceDrivenMeters`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`totalHarshEventCount`)) {
        self$`totalHarshEventCount` <- DriverSafetyScoreResponseObject$`totalHarshEventCount`
      }
      if (!is.null(DriverSafetyScoreResponseObject$`totalTimeDrivenMs`)) {
        self$`totalTimeDrivenMs` <- DriverSafetyScoreResponseObject$`totalTimeDrivenMs`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "crashCount":
             %d,
           "driverId":
             %d,
           "harshAccelCount":
             %d,
           "harshBrakingCount":
             %d,
           "harshEvents":
             [%s],
           "harshTurningCount":
             %d,
           "safetyScore":
             %d,
           "safetyScoreRank":
             "%s",
           "timeOverSpeedLimitMs":
             %d,
           "totalDistanceDrivenMeters":
             %d,
           "totalHarshEventCount":
             %d,
           "totalTimeDrivenMs":
             %d
        }',
        self$`crashCount`,
        self$`driverId`,
        self$`harshAccelCount`,
        self$`harshBrakingCount`,
        paste(unlist(lapply(self$`harshEvents`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        self$`harshTurningCount`,
        self$`safetyScore`,
        self$`safetyScoreRank`,
        self$`timeOverSpeedLimitMs`,
        self$`totalDistanceDrivenMeters`,
        self$`totalHarshEventCount`,
        self$`totalTimeDrivenMs`
      )
    },
    fromJSONString = function(DriverSafetyScoreResponseJson) {
      DriverSafetyScoreResponseObject <- jsonlite::fromJSON(DriverSafetyScoreResponseJson)
      self$`crashCount` <- DriverSafetyScoreResponseObject$`crashCount`
      self$`driverId` <- DriverSafetyScoreResponseObject$`driverId`
      self$`harshAccelCount` <- DriverSafetyScoreResponseObject$`harshAccelCount`
      self$`harshBrakingCount` <- DriverSafetyScoreResponseObject$`harshBrakingCount`
      data.frame <- DriverSafetyScoreResponseObject$`harshEvents`
      self$`harshEvents` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          harshEvents.node <- SafetyReportHarshEvent$new()
          harshEvents.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`harshEvents`[[row]] <- harshEvents.node
      }
      self$`harshTurningCount` <- DriverSafetyScoreResponseObject$`harshTurningCount`
      self$`safetyScore` <- DriverSafetyScoreResponseObject$`safetyScore`
      self$`safetyScoreRank` <- DriverSafetyScoreResponseObject$`safetyScoreRank`
      self$`timeOverSpeedLimitMs` <- DriverSafetyScoreResponseObject$`timeOverSpeedLimitMs`
      self$`totalDistanceDrivenMeters` <- DriverSafetyScoreResponseObject$`totalDistanceDrivenMeters`
      self$`totalHarshEventCount` <- DriverSafetyScoreResponseObject$`totalHarshEventCount`
      self$`totalTimeDrivenMs` <- DriverSafetyScoreResponseObject$`totalTimeDrivenMs`
      self
    }
  )
)
