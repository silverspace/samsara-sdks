# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' AssetReeferResponseReeferStats Class
#'
#' @field fuelPercentage 
#' @field powerStatus 
#' @field engineHours 
#' @field setPoint 
#' @field returnAirTemp 
#' @field alarms 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssetReeferResponseReeferStats <- R6::R6Class(
  'AssetReeferResponseReeferStats',
  public = list(
    `fuelPercentage` = NULL,
    `powerStatus` = NULL,
    `engineHours` = NULL,
    `setPoint` = NULL,
    `returnAirTemp` = NULL,
    `alarms` = NULL,
    initialize = function(`fuelPercentage`=NULL, `powerStatus`=NULL, `engineHours`=NULL, `setPoint`=NULL, `returnAirTemp`=NULL, `alarms`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`fuelPercentage`)) {
        stopifnot(is.vector(`fuelPercentage`), length(`fuelPercentage`) != 0)
        sapply(`fuelPercentage`, function(x) stopifnot(R6::is.R6(x)))
        self$`fuelPercentage` <- `fuelPercentage`
      }
      if (!is.null(`powerStatus`)) {
        stopifnot(is.vector(`powerStatus`), length(`powerStatus`) != 0)
        sapply(`powerStatus`, function(x) stopifnot(R6::is.R6(x)))
        self$`powerStatus` <- `powerStatus`
      }
      if (!is.null(`engineHours`)) {
        stopifnot(is.vector(`engineHours`), length(`engineHours`) != 0)
        sapply(`engineHours`, function(x) stopifnot(R6::is.R6(x)))
        self$`engineHours` <- `engineHours`
      }
      if (!is.null(`setPoint`)) {
        stopifnot(is.vector(`setPoint`), length(`setPoint`) != 0)
        sapply(`setPoint`, function(x) stopifnot(R6::is.R6(x)))
        self$`setPoint` <- `setPoint`
      }
      if (!is.null(`returnAirTemp`)) {
        stopifnot(is.vector(`returnAirTemp`), length(`returnAirTemp`) != 0)
        sapply(`returnAirTemp`, function(x) stopifnot(R6::is.R6(x)))
        self$`returnAirTemp` <- `returnAirTemp`
      }
      if (!is.null(`alarms`)) {
        stopifnot(is.vector(`alarms`), length(`alarms`) != 0)
        sapply(`alarms`, function(x) stopifnot(R6::is.R6(x)))
        self$`alarms` <- `alarms`
      }
    },
    toJSON = function() {
      AssetReeferResponseReeferStatsObject <- list()
      if (!is.null(self$`fuelPercentage`)) {
        AssetReeferResponseReeferStatsObject[['fuelPercentage']] <-
          sapply(self$`fuelPercentage`, function(x) x$toJSON())
      }
      if (!is.null(self$`powerStatus`)) {
        AssetReeferResponseReeferStatsObject[['powerStatus']] <-
          sapply(self$`powerStatus`, function(x) x$toJSON())
      }
      if (!is.null(self$`engineHours`)) {
        AssetReeferResponseReeferStatsObject[['engineHours']] <-
          sapply(self$`engineHours`, function(x) x$toJSON())
      }
      if (!is.null(self$`setPoint`)) {
        AssetReeferResponseReeferStatsObject[['setPoint']] <-
          sapply(self$`setPoint`, function(x) x$toJSON())
      }
      if (!is.null(self$`returnAirTemp`)) {
        AssetReeferResponseReeferStatsObject[['returnAirTemp']] <-
          sapply(self$`returnAirTemp`, function(x) x$toJSON())
      }
      if (!is.null(self$`alarms`)) {
        AssetReeferResponseReeferStatsObject[['alarms']] <-
          sapply(self$`alarms`, function(x) x$toJSON())
      }

      AssetReeferResponseReeferStatsObject
    },
    fromJSON = function(AssetReeferResponseReeferStatsJson) {
      AssetReeferResponseReeferStatsObject <- jsonlite::fromJSON(AssetReeferResponseReeferStatsJson)
      if (!is.null(AssetReeferResponseReeferStatsObject$`fuelPercentage`)) {
        self$`fuelPercentage` <- sapply(AssetReeferResponseReeferStatsObject$`fuelPercentage`, function(x) {
          fuelPercentageObject <- AssetReeferResponseReeferStatsFuelPercentage$new()
          fuelPercentageObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          fuelPercentageObject
        })
      }
      if (!is.null(AssetReeferResponseReeferStatsObject$`powerStatus`)) {
        self$`powerStatus` <- sapply(AssetReeferResponseReeferStatsObject$`powerStatus`, function(x) {
          powerStatusObject <- AssetReeferResponseReeferStatsPowerStatus$new()
          powerStatusObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          powerStatusObject
        })
      }
      if (!is.null(AssetReeferResponseReeferStatsObject$`engineHours`)) {
        self$`engineHours` <- sapply(AssetReeferResponseReeferStatsObject$`engineHours`, function(x) {
          engineHoursObject <- AssetReeferResponseReeferStatsEngineHours$new()
          engineHoursObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          engineHoursObject
        })
      }
      if (!is.null(AssetReeferResponseReeferStatsObject$`setPoint`)) {
        self$`setPoint` <- sapply(AssetReeferResponseReeferStatsObject$`setPoint`, function(x) {
          setPointObject <- AssetReeferResponseReeferStatsSetPoint$new()
          setPointObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          setPointObject
        })
      }
      if (!is.null(AssetReeferResponseReeferStatsObject$`returnAirTemp`)) {
        self$`returnAirTemp` <- sapply(AssetReeferResponseReeferStatsObject$`returnAirTemp`, function(x) {
          returnAirTempObject <- AssetReeferResponseReeferStatsReturnAirTemp$new()
          returnAirTempObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          returnAirTempObject
        })
      }
      if (!is.null(AssetReeferResponseReeferStatsObject$`alarms`)) {
        self$`alarms` <- sapply(AssetReeferResponseReeferStatsObject$`alarms`, function(x) {
          alarmsObject <- AssetReeferResponseReeferStatsAlarms1$new()
          alarmsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          alarmsObject
        })
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "fuelPercentage":
             [%s],
           "powerStatus":
             [%s],
           "engineHours":
             [%s],
           "setPoint":
             [%s],
           "returnAirTemp":
             [%s],
           "alarms":
             [%s]
        }',
        paste(unlist(lapply(self$`fuelPercentage`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`powerStatus`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`engineHours`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`setPoint`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`returnAirTemp`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`alarms`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=",")
      )
    },
    fromJSONString = function(AssetReeferResponseReeferStatsJson) {
      AssetReeferResponseReeferStatsObject <- jsonlite::fromJSON(AssetReeferResponseReeferStatsJson)
      data.frame <- AssetReeferResponseReeferStatsObject$`fuelPercentage`
      self$`fuelPercentage` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          fuelPercentage.node <- AssetReeferResponseReeferStatsFuelPercentage$new()
          fuelPercentage.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`fuelPercentage`[[row]] <- fuelPercentage.node
      }
      data.frame <- AssetReeferResponseReeferStatsObject$`powerStatus`
      self$`powerStatus` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          powerStatus.node <- AssetReeferResponseReeferStatsPowerStatus$new()
          powerStatus.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`powerStatus`[[row]] <- powerStatus.node
      }
      data.frame <- AssetReeferResponseReeferStatsObject$`engineHours`
      self$`engineHours` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          engineHours.node <- AssetReeferResponseReeferStatsEngineHours$new()
          engineHours.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`engineHours`[[row]] <- engineHours.node
      }
      data.frame <- AssetReeferResponseReeferStatsObject$`setPoint`
      self$`setPoint` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          setPoint.node <- AssetReeferResponseReeferStatsSetPoint$new()
          setPoint.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`setPoint`[[row]] <- setPoint.node
      }
      data.frame <- AssetReeferResponseReeferStatsObject$`returnAirTemp`
      self$`returnAirTemp` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          returnAirTemp.node <- AssetReeferResponseReeferStatsReturnAirTemp$new()
          returnAirTemp.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`returnAirTemp`[[row]] <- returnAirTemp.node
      }
      data.frame <- AssetReeferResponseReeferStatsObject$`alarms`
      self$`alarms` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          alarms.node <- AssetReeferResponseReeferStatsAlarms1$new()
          alarms.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`alarms`[[row]] <- alarms.node
      }
      self
    }
  )
)
