# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' TripResponseTrips Class
#'
#' @field endOdometer 
#' @field distanceMeters 
#' @field endMs 
#' @field startMs 
#' @field fuelConsumedMl 
#' @field startAddress 
#' @field startCoordinates 
#' @field endCoordinates 
#' @field startOdometer 
#' @field driverId 
#' @field startLocation 
#' @field tollMeters 
#' @field endAddress 
#' @field endLocation 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TripResponseTrips <- R6::R6Class(
  'TripResponseTrips',
  public = list(
    `endOdometer` = NULL,
    `distanceMeters` = NULL,
    `endMs` = NULL,
    `startMs` = NULL,
    `fuelConsumedMl` = NULL,
    `startAddress` = NULL,
    `startCoordinates` = NULL,
    `endCoordinates` = NULL,
    `startOdometer` = NULL,
    `driverId` = NULL,
    `startLocation` = NULL,
    `tollMeters` = NULL,
    `endAddress` = NULL,
    `endLocation` = NULL,
    initialize = function(`endOdometer`=NULL, `distanceMeters`=NULL, `endMs`=NULL, `startMs`=NULL, `fuelConsumedMl`=NULL, `startAddress`=NULL, `startCoordinates`=NULL, `endCoordinates`=NULL, `startOdometer`=NULL, `driverId`=NULL, `startLocation`=NULL, `tollMeters`=NULL, `endAddress`=NULL, `endLocation`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`endOdometer`)) {
        stopifnot(is.numeric(`endOdometer`), length(`endOdometer`) == 1)
        self$`endOdometer` <- `endOdometer`
      }
      if (!is.null(`distanceMeters`)) {
        stopifnot(is.numeric(`distanceMeters`), length(`distanceMeters`) == 1)
        self$`distanceMeters` <- `distanceMeters`
      }
      if (!is.null(`endMs`)) {
        stopifnot(is.numeric(`endMs`), length(`endMs`) == 1)
        self$`endMs` <- `endMs`
      }
      if (!is.null(`startMs`)) {
        stopifnot(is.numeric(`startMs`), length(`startMs`) == 1)
        self$`startMs` <- `startMs`
      }
      if (!is.null(`fuelConsumedMl`)) {
        stopifnot(is.numeric(`fuelConsumedMl`), length(`fuelConsumedMl`) == 1)
        self$`fuelConsumedMl` <- `fuelConsumedMl`
      }
      if (!is.null(`startAddress`)) {
        stopifnot(is.character(`startAddress`), length(`startAddress`) == 1)
        self$`startAddress` <- `startAddress`
      }
      if (!is.null(`startCoordinates`)) {
        stopifnot(R6::is.R6(`startCoordinates`))
        self$`startCoordinates` <- `startCoordinates`
      }
      if (!is.null(`endCoordinates`)) {
        stopifnot(R6::is.R6(`endCoordinates`))
        self$`endCoordinates` <- `endCoordinates`
      }
      if (!is.null(`startOdometer`)) {
        stopifnot(is.numeric(`startOdometer`), length(`startOdometer`) == 1)
        self$`startOdometer` <- `startOdometer`
      }
      if (!is.null(`driverId`)) {
        stopifnot(is.numeric(`driverId`), length(`driverId`) == 1)
        self$`driverId` <- `driverId`
      }
      if (!is.null(`startLocation`)) {
        stopifnot(is.character(`startLocation`), length(`startLocation`) == 1)
        self$`startLocation` <- `startLocation`
      }
      if (!is.null(`tollMeters`)) {
        stopifnot(is.numeric(`tollMeters`), length(`tollMeters`) == 1)
        self$`tollMeters` <- `tollMeters`
      }
      if (!is.null(`endAddress`)) {
        stopifnot(is.character(`endAddress`), length(`endAddress`) == 1)
        self$`endAddress` <- `endAddress`
      }
      if (!is.null(`endLocation`)) {
        stopifnot(is.character(`endLocation`), length(`endLocation`) == 1)
        self$`endLocation` <- `endLocation`
      }
    },
    toJSON = function() {
      TripResponseTripsObject <- list()
      if (!is.null(self$`endOdometer`)) {
        TripResponseTripsObject[['endOdometer']] <-
          self$`endOdometer`
      }
      if (!is.null(self$`distanceMeters`)) {
        TripResponseTripsObject[['distanceMeters']] <-
          self$`distanceMeters`
      }
      if (!is.null(self$`endMs`)) {
        TripResponseTripsObject[['endMs']] <-
          self$`endMs`
      }
      if (!is.null(self$`startMs`)) {
        TripResponseTripsObject[['startMs']] <-
          self$`startMs`
      }
      if (!is.null(self$`fuelConsumedMl`)) {
        TripResponseTripsObject[['fuelConsumedMl']] <-
          self$`fuelConsumedMl`
      }
      if (!is.null(self$`startAddress`)) {
        TripResponseTripsObject[['startAddress']] <-
          self$`startAddress`
      }
      if (!is.null(self$`startCoordinates`)) {
        TripResponseTripsObject[['startCoordinates']] <-
          self$`startCoordinates`$toJSON()
      }
      if (!is.null(self$`endCoordinates`)) {
        TripResponseTripsObject[['endCoordinates']] <-
          self$`endCoordinates`$toJSON()
      }
      if (!is.null(self$`startOdometer`)) {
        TripResponseTripsObject[['startOdometer']] <-
          self$`startOdometer`
      }
      if (!is.null(self$`driverId`)) {
        TripResponseTripsObject[['driverId']] <-
          self$`driverId`
      }
      if (!is.null(self$`startLocation`)) {
        TripResponseTripsObject[['startLocation']] <-
          self$`startLocation`
      }
      if (!is.null(self$`tollMeters`)) {
        TripResponseTripsObject[['tollMeters']] <-
          self$`tollMeters`
      }
      if (!is.null(self$`endAddress`)) {
        TripResponseTripsObject[['endAddress']] <-
          self$`endAddress`
      }
      if (!is.null(self$`endLocation`)) {
        TripResponseTripsObject[['endLocation']] <-
          self$`endLocation`
      }

      TripResponseTripsObject
    },
    fromJSON = function(TripResponseTripsJson) {
      TripResponseTripsObject <- jsonlite::fromJSON(TripResponseTripsJson)
      if (!is.null(TripResponseTripsObject$`endOdometer`)) {
        self$`endOdometer` <- TripResponseTripsObject$`endOdometer`
      }
      if (!is.null(TripResponseTripsObject$`distanceMeters`)) {
        self$`distanceMeters` <- TripResponseTripsObject$`distanceMeters`
      }
      if (!is.null(TripResponseTripsObject$`endMs`)) {
        self$`endMs` <- TripResponseTripsObject$`endMs`
      }
      if (!is.null(TripResponseTripsObject$`startMs`)) {
        self$`startMs` <- TripResponseTripsObject$`startMs`
      }
      if (!is.null(TripResponseTripsObject$`fuelConsumedMl`)) {
        self$`fuelConsumedMl` <- TripResponseTripsObject$`fuelConsumedMl`
      }
      if (!is.null(TripResponseTripsObject$`startAddress`)) {
        self$`startAddress` <- TripResponseTripsObject$`startAddress`
      }
      if (!is.null(TripResponseTripsObject$`startCoordinates`)) {
        startCoordinatesObject <- TripResponseStartCoordinates$new()
        startCoordinatesObject$fromJSON(jsonlite::toJSON(TripResponseTripsObject$startCoordinates, auto_unbox = TRUE))
        self$`startCoordinates` <- startCoordinatesObject
      }
      if (!is.null(TripResponseTripsObject$`endCoordinates`)) {
        endCoordinatesObject <- TripResponseEndCoordinates$new()
        endCoordinatesObject$fromJSON(jsonlite::toJSON(TripResponseTripsObject$endCoordinates, auto_unbox = TRUE))
        self$`endCoordinates` <- endCoordinatesObject
      }
      if (!is.null(TripResponseTripsObject$`startOdometer`)) {
        self$`startOdometer` <- TripResponseTripsObject$`startOdometer`
      }
      if (!is.null(TripResponseTripsObject$`driverId`)) {
        self$`driverId` <- TripResponseTripsObject$`driverId`
      }
      if (!is.null(TripResponseTripsObject$`startLocation`)) {
        self$`startLocation` <- TripResponseTripsObject$`startLocation`
      }
      if (!is.null(TripResponseTripsObject$`tollMeters`)) {
        self$`tollMeters` <- TripResponseTripsObject$`tollMeters`
      }
      if (!is.null(TripResponseTripsObject$`endAddress`)) {
        self$`endAddress` <- TripResponseTripsObject$`endAddress`
      }
      if (!is.null(TripResponseTripsObject$`endLocation`)) {
        self$`endLocation` <- TripResponseTripsObject$`endLocation`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "endOdometer":
             %d,
           "distanceMeters":
             %d,
           "endMs":
             %d,
           "startMs":
             %d,
           "fuelConsumedMl":
             %d,
           "startAddress":
             "%s",
           "startCoordinates":
             %s,
           "endCoordinates":
             %s,
           "startOdometer":
             %d,
           "driverId":
             %d,
           "startLocation":
             "%s",
           "tollMeters":
             %d,
           "endAddress":
             "%s",
           "endLocation":
             "%s"
        }',
        self$`endOdometer`,
        self$`distanceMeters`,
        self$`endMs`,
        self$`startMs`,
        self$`fuelConsumedMl`,
        self$`startAddress`,
        jsonlite::toJSON(self$`startCoordinates`$toJSON(), auto_unbox=TRUE),
        jsonlite::toJSON(self$`endCoordinates`$toJSON(), auto_unbox=TRUE),
        self$`startOdometer`,
        self$`driverId`,
        self$`startLocation`,
        self$`tollMeters`,
        self$`endAddress`,
        self$`endLocation`
      )
    },
    fromJSONString = function(TripResponseTripsJson) {
      TripResponseTripsObject <- jsonlite::fromJSON(TripResponseTripsJson)
      self$`endOdometer` <- TripResponseTripsObject$`endOdometer`
      self$`distanceMeters` <- TripResponseTripsObject$`distanceMeters`
      self$`endMs` <- TripResponseTripsObject$`endMs`
      self$`startMs` <- TripResponseTripsObject$`startMs`
      self$`fuelConsumedMl` <- TripResponseTripsObject$`fuelConsumedMl`
      self$`startAddress` <- TripResponseTripsObject$`startAddress`
      self$`startCoordinates` <- TripResponseStartCoordinates$new()$fromJSON(jsonlite::toJSON(TripResponseTripsObject$startCoordinates, auto_unbox = TRUE))
      self$`endCoordinates` <- TripResponseEndCoordinates$new()$fromJSON(jsonlite::toJSON(TripResponseTripsObject$endCoordinates, auto_unbox = TRUE))
      self$`startOdometer` <- TripResponseTripsObject$`startOdometer`
      self$`driverId` <- TripResponseTripsObject$`driverId`
      self$`startLocation` <- TripResponseTripsObject$`startLocation`
      self$`tollMeters` <- TripResponseTripsObject$`tollMeters`
      self$`endAddress` <- TripResponseTripsObject$`endAddress`
      self$`endLocation` <- TripResponseTripsObject$`endLocation`
      self
    }
  )
)
