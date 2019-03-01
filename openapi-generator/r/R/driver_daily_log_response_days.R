# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' DriverDailyLogResponseDays Class
#'
#' @field certifiedAtMs 
#' @field endMs 
#' @field startMs 
#' @field trailerIds 
#' @field activeHours 
#' @field distanceMiles 
#' @field activeMs 
#' @field certified 
#' @field vehicleIds 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DriverDailyLogResponseDays <- R6::R6Class(
  'DriverDailyLogResponseDays',
  public = list(
    `certifiedAtMs` = NULL,
    `endMs` = NULL,
    `startMs` = NULL,
    `trailerIds` = NULL,
    `activeHours` = NULL,
    `distanceMiles` = NULL,
    `activeMs` = NULL,
    `certified` = NULL,
    `vehicleIds` = NULL,
    initialize = function(`certifiedAtMs`=NULL, `endMs`=NULL, `startMs`=NULL, `trailerIds`=NULL, `activeHours`=NULL, `distanceMiles`=NULL, `activeMs`=NULL, `certified`=NULL, `vehicleIds`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`certifiedAtMs`)) {
        stopifnot(is.numeric(`certifiedAtMs`), length(`certifiedAtMs`) == 1)
        self$`certifiedAtMs` <- `certifiedAtMs`
      }
      if (!is.null(`endMs`)) {
        stopifnot(is.numeric(`endMs`), length(`endMs`) == 1)
        self$`endMs` <- `endMs`
      }
      if (!is.null(`startMs`)) {
        stopifnot(is.numeric(`startMs`), length(`startMs`) == 1)
        self$`startMs` <- `startMs`
      }
      if (!is.null(`trailerIds`)) {
        stopifnot(R6::is.R6(`trailerIds`))
        self$`trailerIds` <- `trailerIds`
      }
      if (!is.null(`activeHours`)) {
        stopifnot(is.numeric(`activeHours`), length(`activeHours`) == 1)
        self$`activeHours` <- `activeHours`
      }
      if (!is.null(`distanceMiles`)) {
        stopifnot(is.numeric(`distanceMiles`), length(`distanceMiles`) == 1)
        self$`distanceMiles` <- `distanceMiles`
      }
      if (!is.null(`activeMs`)) {
        stopifnot(is.numeric(`activeMs`), length(`activeMs`) == 1)
        self$`activeMs` <- `activeMs`
      }
      if (!is.null(`certified`)) {
        self$`certified` <- `certified`
      }
      if (!is.null(`vehicleIds`)) {
        stopifnot(R6::is.R6(`vehicleIds`))
        self$`vehicleIds` <- `vehicleIds`
      }
    },
    toJSON = function() {
      DriverDailyLogResponseDaysObject <- list()
      if (!is.null(self$`certifiedAtMs`)) {
        DriverDailyLogResponseDaysObject[['certifiedAtMs']] <-
          self$`certifiedAtMs`
      }
      if (!is.null(self$`endMs`)) {
        DriverDailyLogResponseDaysObject[['endMs']] <-
          self$`endMs`
      }
      if (!is.null(self$`startMs`)) {
        DriverDailyLogResponseDaysObject[['startMs']] <-
          self$`startMs`
      }
      if (!is.null(self$`trailerIds`)) {
        DriverDailyLogResponseDaysObject[['trailerIds']] <-
          self$`trailerIds`$toJSON()
      }
      if (!is.null(self$`activeHours`)) {
        DriverDailyLogResponseDaysObject[['activeHours']] <-
          self$`activeHours`
      }
      if (!is.null(self$`distanceMiles`)) {
        DriverDailyLogResponseDaysObject[['distanceMiles']] <-
          self$`distanceMiles`
      }
      if (!is.null(self$`activeMs`)) {
        DriverDailyLogResponseDaysObject[['activeMs']] <-
          self$`activeMs`
      }
      if (!is.null(self$`certified`)) {
        DriverDailyLogResponseDaysObject[['certified']] <-
          self$`certified`
      }
      if (!is.null(self$`vehicleIds`)) {
        DriverDailyLogResponseDaysObject[['vehicleIds']] <-
          self$`vehicleIds`$toJSON()
      }

      DriverDailyLogResponseDaysObject
    },
    fromJSON = function(DriverDailyLogResponseDaysJson) {
      DriverDailyLogResponseDaysObject <- jsonlite::fromJSON(DriverDailyLogResponseDaysJson)
      if (!is.null(DriverDailyLogResponseDaysObject$`certifiedAtMs`)) {
        self$`certifiedAtMs` <- DriverDailyLogResponseDaysObject$`certifiedAtMs`
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`endMs`)) {
        self$`endMs` <- DriverDailyLogResponseDaysObject$`endMs`
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`startMs`)) {
        self$`startMs` <- DriverDailyLogResponseDaysObject$`startMs`
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`trailerIds`)) {
        trailerIdsObject <- object$new()
        trailerIdsObject$fromJSON(jsonlite::toJSON(DriverDailyLogResponseDaysObject$trailerIds, auto_unbox = TRUE))
        self$`trailerIds` <- trailerIdsObject
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`activeHours`)) {
        self$`activeHours` <- DriverDailyLogResponseDaysObject$`activeHours`
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`distanceMiles`)) {
        self$`distanceMiles` <- DriverDailyLogResponseDaysObject$`distanceMiles`
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`activeMs`)) {
        self$`activeMs` <- DriverDailyLogResponseDaysObject$`activeMs`
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`certified`)) {
        self$`certified` <- DriverDailyLogResponseDaysObject$`certified`
      }
      if (!is.null(DriverDailyLogResponseDaysObject$`vehicleIds`)) {
        vehicleIdsObject <- object$new()
        vehicleIdsObject$fromJSON(jsonlite::toJSON(DriverDailyLogResponseDaysObject$vehicleIds, auto_unbox = TRUE))
        self$`vehicleIds` <- vehicleIdsObject
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "certifiedAtMs":
             %d,
           "endMs":
             %d,
           "startMs":
             %d,
           "trailerIds":
             %s,
           "activeHours":
             %d,
           "distanceMiles":
             %d,
           "activeMs":
             %d,
           "certified":
             "%s",
           "vehicleIds":
             %s
        }',
        self$`certifiedAtMs`,
        self$`endMs`,
        self$`startMs`,
        jsonlite::toJSON(self$`trailerIds`$toJSON(), auto_unbox=TRUE),
        self$`activeHours`,
        self$`distanceMiles`,
        self$`activeMs`,
        self$`certified`,
        jsonlite::toJSON(self$`vehicleIds`$toJSON(), auto_unbox=TRUE)
      )
    },
    fromJSONString = function(DriverDailyLogResponseDaysJson) {
      DriverDailyLogResponseDaysObject <- jsonlite::fromJSON(DriverDailyLogResponseDaysJson)
      self$`certifiedAtMs` <- DriverDailyLogResponseDaysObject$`certifiedAtMs`
      self$`endMs` <- DriverDailyLogResponseDaysObject$`endMs`
      self$`startMs` <- DriverDailyLogResponseDaysObject$`startMs`
      self$`trailerIds` <- object$new()$fromJSON(jsonlite::toJSON(DriverDailyLogResponseDaysObject$trailerIds, auto_unbox = TRUE))
      self$`activeHours` <- DriverDailyLogResponseDaysObject$`activeHours`
      self$`distanceMiles` <- DriverDailyLogResponseDaysObject$`distanceMiles`
      self$`activeMs` <- DriverDailyLogResponseDaysObject$`activeMs`
      self$`certified` <- DriverDailyLogResponseDaysObject$`certified`
      self$`vehicleIds` <- object$new()$fromJSON(jsonlite::toJSON(DriverDailyLogResponseDaysObject$vehicleIds, auto_unbox = TRUE))
      self
    }
  )
)
