# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' HosLogsResponseLogs Class
#'
#' @field locLng 
#' @field logStartMs 
#' @field driverId 
#' @field statusType 
#' @field locCity 
#' @field groupId 
#' @field locName 
#' @field locLat 
#' @field remark 
#' @field locState 
#' @field vehicleId 
#' @field codriverIds 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
HosLogsResponseLogs <- R6::R6Class(
  'HosLogsResponseLogs',
  public = list(
    `locLng` = NULL,
    `logStartMs` = NULL,
    `driverId` = NULL,
    `statusType` = NULL,
    `locCity` = NULL,
    `groupId` = NULL,
    `locName` = NULL,
    `locLat` = NULL,
    `remark` = NULL,
    `locState` = NULL,
    `vehicleId` = NULL,
    `codriverIds` = NULL,
    initialize = function(`locLng`=NULL, `logStartMs`=NULL, `driverId`=NULL, `statusType`=NULL, `locCity`=NULL, `groupId`=NULL, `locName`=NULL, `locLat`=NULL, `remark`=NULL, `locState`=NULL, `vehicleId`=NULL, `codriverIds`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`locLng`)) {
        stopifnot(is.numeric(`locLng`), length(`locLng`) == 1)
        self$`locLng` <- `locLng`
      }
      if (!is.null(`logStartMs`)) {
        stopifnot(is.numeric(`logStartMs`), length(`logStartMs`) == 1)
        self$`logStartMs` <- `logStartMs`
      }
      if (!is.null(`driverId`)) {
        stopifnot(is.numeric(`driverId`), length(`driverId`) == 1)
        self$`driverId` <- `driverId`
      }
      if (!is.null(`statusType`)) {
        stopifnot(is.character(`statusType`), length(`statusType`) == 1)
        self$`statusType` <- `statusType`
      }
      if (!is.null(`locCity`)) {
        stopifnot(is.character(`locCity`), length(`locCity`) == 1)
        self$`locCity` <- `locCity`
      }
      if (!is.null(`groupId`)) {
        stopifnot(is.numeric(`groupId`), length(`groupId`) == 1)
        self$`groupId` <- `groupId`
      }
      if (!is.null(`locName`)) {
        stopifnot(is.character(`locName`), length(`locName`) == 1)
        self$`locName` <- `locName`
      }
      if (!is.null(`locLat`)) {
        stopifnot(is.numeric(`locLat`), length(`locLat`) == 1)
        self$`locLat` <- `locLat`
      }
      if (!is.null(`remark`)) {
        stopifnot(is.character(`remark`), length(`remark`) == 1)
        self$`remark` <- `remark`
      }
      if (!is.null(`locState`)) {
        stopifnot(is.character(`locState`), length(`locState`) == 1)
        self$`locState` <- `locState`
      }
      if (!is.null(`vehicleId`)) {
        stopifnot(is.numeric(`vehicleId`), length(`vehicleId`) == 1)
        self$`vehicleId` <- `vehicleId`
      }
      if (!is.null(`codriverIds`)) {
        stopifnot(is.vector(`codriverIds`), length(`codriverIds`) != 0)
        sapply(`codriverIds`, function(x) stopifnot(is.character(x)))
        self$`codriverIds` <- `codriverIds`
      }
    },
    toJSON = function() {
      HosLogsResponseLogsObject <- list()
      if (!is.null(self$`locLng`)) {
        HosLogsResponseLogsObject[['locLng']] <-
          self$`locLng`
      }
      if (!is.null(self$`logStartMs`)) {
        HosLogsResponseLogsObject[['logStartMs']] <-
          self$`logStartMs`
      }
      if (!is.null(self$`driverId`)) {
        HosLogsResponseLogsObject[['driverId']] <-
          self$`driverId`
      }
      if (!is.null(self$`statusType`)) {
        HosLogsResponseLogsObject[['statusType']] <-
          self$`statusType`
      }
      if (!is.null(self$`locCity`)) {
        HosLogsResponseLogsObject[['locCity']] <-
          self$`locCity`
      }
      if (!is.null(self$`groupId`)) {
        HosLogsResponseLogsObject[['groupId']] <-
          self$`groupId`
      }
      if (!is.null(self$`locName`)) {
        HosLogsResponseLogsObject[['locName']] <-
          self$`locName`
      }
      if (!is.null(self$`locLat`)) {
        HosLogsResponseLogsObject[['locLat']] <-
          self$`locLat`
      }
      if (!is.null(self$`remark`)) {
        HosLogsResponseLogsObject[['remark']] <-
          self$`remark`
      }
      if (!is.null(self$`locState`)) {
        HosLogsResponseLogsObject[['locState']] <-
          self$`locState`
      }
      if (!is.null(self$`vehicleId`)) {
        HosLogsResponseLogsObject[['vehicleId']] <-
          self$`vehicleId`
      }
      if (!is.null(self$`codriverIds`)) {
        HosLogsResponseLogsObject[['codriverIds']] <-
          self$`codriverIds`
      }

      HosLogsResponseLogsObject
    },
    fromJSON = function(HosLogsResponseLogsJson) {
      HosLogsResponseLogsObject <- jsonlite::fromJSON(HosLogsResponseLogsJson)
      if (!is.null(HosLogsResponseLogsObject$`locLng`)) {
        self$`locLng` <- HosLogsResponseLogsObject$`locLng`
      }
      if (!is.null(HosLogsResponseLogsObject$`logStartMs`)) {
        self$`logStartMs` <- HosLogsResponseLogsObject$`logStartMs`
      }
      if (!is.null(HosLogsResponseLogsObject$`driverId`)) {
        self$`driverId` <- HosLogsResponseLogsObject$`driverId`
      }
      if (!is.null(HosLogsResponseLogsObject$`statusType`)) {
        self$`statusType` <- HosLogsResponseLogsObject$`statusType`
      }
      if (!is.null(HosLogsResponseLogsObject$`locCity`)) {
        self$`locCity` <- HosLogsResponseLogsObject$`locCity`
      }
      if (!is.null(HosLogsResponseLogsObject$`groupId`)) {
        self$`groupId` <- HosLogsResponseLogsObject$`groupId`
      }
      if (!is.null(HosLogsResponseLogsObject$`locName`)) {
        self$`locName` <- HosLogsResponseLogsObject$`locName`
      }
      if (!is.null(HosLogsResponseLogsObject$`locLat`)) {
        self$`locLat` <- HosLogsResponseLogsObject$`locLat`
      }
      if (!is.null(HosLogsResponseLogsObject$`remark`)) {
        self$`remark` <- HosLogsResponseLogsObject$`remark`
      }
      if (!is.null(HosLogsResponseLogsObject$`locState`)) {
        self$`locState` <- HosLogsResponseLogsObject$`locState`
      }
      if (!is.null(HosLogsResponseLogsObject$`vehicleId`)) {
        self$`vehicleId` <- HosLogsResponseLogsObject$`vehicleId`
      }
      if (!is.null(HosLogsResponseLogsObject$`codriverIds`)) {
        self$`codriverIds` <- HosLogsResponseLogsObject$`codriverIds`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "locLng":
             %d,
           "logStartMs":
             %d,
           "driverId":
             %d,
           "statusType":
             "%s",
           "locCity":
             "%s",
           "groupId":
             %d,
           "locName":
             "%s",
           "locLat":
             %d,
           "remark":
             "%s",
           "locState":
             "%s",
           "vehicleId":
             %d,
           "codriverIds":
             [%s]
        }',
        self$`locLng`,
        self$`logStartMs`,
        self$`driverId`,
        self$`statusType`,
        self$`locCity`,
        self$`groupId`,
        self$`locName`,
        self$`locLat`,
        self$`remark`,
        self$`locState`,
        self$`vehicleId`,
        paste(unlist(lapply(self$`codriverIds`, function(x) paste0('"', x, '"'))), collapse=",")
      )
    },
    fromJSONString = function(HosLogsResponseLogsJson) {
      HosLogsResponseLogsObject <- jsonlite::fromJSON(HosLogsResponseLogsJson)
      self$`locLng` <- HosLogsResponseLogsObject$`locLng`
      self$`logStartMs` <- HosLogsResponseLogsObject$`logStartMs`
      self$`driverId` <- HosLogsResponseLogsObject$`driverId`
      self$`statusType` <- HosLogsResponseLogsObject$`statusType`
      self$`locCity` <- HosLogsResponseLogsObject$`locCity`
      self$`groupId` <- HosLogsResponseLogsObject$`groupId`
      self$`locName` <- HosLogsResponseLogsObject$`locName`
      self$`locLat` <- HosLogsResponseLogsObject$`locLat`
      self$`remark` <- HosLogsResponseLogsObject$`remark`
      self$`locState` <- HosLogsResponseLogsObject$`locState`
      self$`vehicleId` <- HosLogsResponseLogsObject$`vehicleId`
      self$`codriverIds` <- lapply(HosLogsResponseLogsObject$`codriverIds`, function (x) x)
      self
    }
  )
)
