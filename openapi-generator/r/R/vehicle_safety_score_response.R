# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' VehicleSafetyScoreResponse Class
#'
#' @field crashCount 
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
#' @field vehicleId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VehicleSafetyScoreResponse <- R6::R6Class(
  'VehicleSafetyScoreResponse',
  public = list(
    `crashCount` = NULL,
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
    `vehicleId` = NULL,
    initialize = function(`crashCount`=NULL, `harshAccelCount`=NULL, `harshBrakingCount`=NULL, `harshEvents`=NULL, `harshTurningCount`=NULL, `safetyScore`=NULL, `safetyScoreRank`=NULL, `timeOverSpeedLimitMs`=NULL, `totalDistanceDrivenMeters`=NULL, `totalHarshEventCount`=NULL, `totalTimeDrivenMs`=NULL, `vehicleId`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`crashCount`)) {
        stopifnot(is.numeric(`crashCount`), length(`crashCount`) == 1)
        self$`crashCount` <- `crashCount`
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
      if (!is.null(`vehicleId`)) {
        stopifnot(is.numeric(`vehicleId`), length(`vehicleId`) == 1)
        self$`vehicleId` <- `vehicleId`
      }
    },
    toJSON = function() {
      VehicleSafetyScoreResponseObject <- list()
      if (!is.null(self$`crashCount`)) {
        VehicleSafetyScoreResponseObject[['crashCount']] <-
          self$`crashCount`
      }
      if (!is.null(self$`harshAccelCount`)) {
        VehicleSafetyScoreResponseObject[['harshAccelCount']] <-
          self$`harshAccelCount`
      }
      if (!is.null(self$`harshBrakingCount`)) {
        VehicleSafetyScoreResponseObject[['harshBrakingCount']] <-
          self$`harshBrakingCount`
      }
      if (!is.null(self$`harshEvents`)) {
        VehicleSafetyScoreResponseObject[['harshEvents']] <-
          sapply(self$`harshEvents`, function(x) x$toJSON())
      }
      if (!is.null(self$`harshTurningCount`)) {
        VehicleSafetyScoreResponseObject[['harshTurningCount']] <-
          self$`harshTurningCount`
      }
      if (!is.null(self$`safetyScore`)) {
        VehicleSafetyScoreResponseObject[['safetyScore']] <-
          self$`safetyScore`
      }
      if (!is.null(self$`safetyScoreRank`)) {
        VehicleSafetyScoreResponseObject[['safetyScoreRank']] <-
          self$`safetyScoreRank`
      }
      if (!is.null(self$`timeOverSpeedLimitMs`)) {
        VehicleSafetyScoreResponseObject[['timeOverSpeedLimitMs']] <-
          self$`timeOverSpeedLimitMs`
      }
      if (!is.null(self$`totalDistanceDrivenMeters`)) {
        VehicleSafetyScoreResponseObject[['totalDistanceDrivenMeters']] <-
          self$`totalDistanceDrivenMeters`
      }
      if (!is.null(self$`totalHarshEventCount`)) {
        VehicleSafetyScoreResponseObject[['totalHarshEventCount']] <-
          self$`totalHarshEventCount`
      }
      if (!is.null(self$`totalTimeDrivenMs`)) {
        VehicleSafetyScoreResponseObject[['totalTimeDrivenMs']] <-
          self$`totalTimeDrivenMs`
      }
      if (!is.null(self$`vehicleId`)) {
        VehicleSafetyScoreResponseObject[['vehicleId']] <-
          self$`vehicleId`
      }

      VehicleSafetyScoreResponseObject
    },
    fromJSON = function(VehicleSafetyScoreResponseJson) {
      VehicleSafetyScoreResponseObject <- jsonlite::fromJSON(VehicleSafetyScoreResponseJson)
      if (!is.null(VehicleSafetyScoreResponseObject$`crashCount`)) {
        self$`crashCount` <- VehicleSafetyScoreResponseObject$`crashCount`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`harshAccelCount`)) {
        self$`harshAccelCount` <- VehicleSafetyScoreResponseObject$`harshAccelCount`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`harshBrakingCount`)) {
        self$`harshBrakingCount` <- VehicleSafetyScoreResponseObject$`harshBrakingCount`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`harshEvents`)) {
        self$`harshEvents` <- sapply(VehicleSafetyScoreResponseObject$`harshEvents`, function(x) {
          harshEventsObject <- SafetyReportHarshEvent$new()
          harshEventsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          harshEventsObject
        })
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`harshTurningCount`)) {
        self$`harshTurningCount` <- VehicleSafetyScoreResponseObject$`harshTurningCount`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`safetyScore`)) {
        self$`safetyScore` <- VehicleSafetyScoreResponseObject$`safetyScore`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`safetyScoreRank`)) {
        self$`safetyScoreRank` <- VehicleSafetyScoreResponseObject$`safetyScoreRank`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`timeOverSpeedLimitMs`)) {
        self$`timeOverSpeedLimitMs` <- VehicleSafetyScoreResponseObject$`timeOverSpeedLimitMs`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`totalDistanceDrivenMeters`)) {
        self$`totalDistanceDrivenMeters` <- VehicleSafetyScoreResponseObject$`totalDistanceDrivenMeters`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`totalHarshEventCount`)) {
        self$`totalHarshEventCount` <- VehicleSafetyScoreResponseObject$`totalHarshEventCount`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`totalTimeDrivenMs`)) {
        self$`totalTimeDrivenMs` <- VehicleSafetyScoreResponseObject$`totalTimeDrivenMs`
      }
      if (!is.null(VehicleSafetyScoreResponseObject$`vehicleId`)) {
        self$`vehicleId` <- VehicleSafetyScoreResponseObject$`vehicleId`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "crashCount":
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
             %d,
           "vehicleId":
             %d
        }',
        self$`crashCount`,
        self$`harshAccelCount`,
        self$`harshBrakingCount`,
        paste(unlist(lapply(self$`harshEvents`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        self$`harshTurningCount`,
        self$`safetyScore`,
        self$`safetyScoreRank`,
        self$`timeOverSpeedLimitMs`,
        self$`totalDistanceDrivenMeters`,
        self$`totalHarshEventCount`,
        self$`totalTimeDrivenMs`,
        self$`vehicleId`
      )
    },
    fromJSONString = function(VehicleSafetyScoreResponseJson) {
      VehicleSafetyScoreResponseObject <- jsonlite::fromJSON(VehicleSafetyScoreResponseJson)
      self$`crashCount` <- VehicleSafetyScoreResponseObject$`crashCount`
      self$`harshAccelCount` <- VehicleSafetyScoreResponseObject$`harshAccelCount`
      self$`harshBrakingCount` <- VehicleSafetyScoreResponseObject$`harshBrakingCount`
      data.frame <- VehicleSafetyScoreResponseObject$`harshEvents`
      self$`harshEvents` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          harshEvents.node <- SafetyReportHarshEvent$new()
          harshEvents.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`harshEvents`[[row]] <- harshEvents.node
      }
      self$`harshTurningCount` <- VehicleSafetyScoreResponseObject$`harshTurningCount`
      self$`safetyScore` <- VehicleSafetyScoreResponseObject$`safetyScore`
      self$`safetyScoreRank` <- VehicleSafetyScoreResponseObject$`safetyScoreRank`
      self$`timeOverSpeedLimitMs` <- VehicleSafetyScoreResponseObject$`timeOverSpeedLimitMs`
      self$`totalDistanceDrivenMeters` <- VehicleSafetyScoreResponseObject$`totalDistanceDrivenMeters`
      self$`totalHarshEventCount` <- VehicleSafetyScoreResponseObject$`totalHarshEventCount`
      self$`totalTimeDrivenMs` <- VehicleSafetyScoreResponseObject$`totalTimeDrivenMs`
      self$`vehicleId` <- VehicleSafetyScoreResponseObject$`vehicleId`
      self
    }
  )
)
