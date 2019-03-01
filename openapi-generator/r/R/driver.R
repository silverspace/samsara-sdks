# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' Driver Class
#'
#' @field eldAdverseWeatherExemptionEnabled 
#' @field eldBigDayExemptionEnabled 
#' @field eldDayStartHour 
#' @field eldExempt 
#' @field eldExemptReason 
#' @field eldPcEnabled 
#' @field eldYmEnabled 
#' @field externalIds 
#' @field groupId 
#' @field licenseNumber 
#' @field licenseState 
#' @field name 
#' @field notes 
#' @field phone 
#' @field username 
#' @field vehicleId 
#' @field id 
#' @field isDeactivated 
#' @field tags 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Driver <- R6::R6Class(
  'Driver',
  public = list(
    `eldAdverseWeatherExemptionEnabled` = NULL,
    `eldBigDayExemptionEnabled` = NULL,
    `eldDayStartHour` = NULL,
    `eldExempt` = NULL,
    `eldExemptReason` = NULL,
    `eldPcEnabled` = NULL,
    `eldYmEnabled` = NULL,
    `externalIds` = NULL,
    `groupId` = NULL,
    `licenseNumber` = NULL,
    `licenseState` = NULL,
    `name` = NULL,
    `notes` = NULL,
    `phone` = NULL,
    `username` = NULL,
    `vehicleId` = NULL,
    `id` = NULL,
    `isDeactivated` = NULL,
    `tags` = NULL,
    initialize = function(`name`, `id`, `eldAdverseWeatherExemptionEnabled`=NULL, `eldBigDayExemptionEnabled`=NULL, `eldDayStartHour`=NULL, `eldExempt`=NULL, `eldExemptReason`=NULL, `eldPcEnabled`=FALSE, `eldYmEnabled`=FALSE, `externalIds`=NULL, `groupId`=NULL, `licenseNumber`=NULL, `licenseState`=NULL, `notes`=NULL, `phone`=NULL, `username`=NULL, `vehicleId`=NULL, `isDeactivated`=NULL, `tags`=NULL, ...){
      local.optional.var <- list(...)
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!is.null(`eldAdverseWeatherExemptionEnabled`)) {
        self$`eldAdverseWeatherExemptionEnabled` <- `eldAdverseWeatherExemptionEnabled`
      }
      if (!is.null(`eldBigDayExemptionEnabled`)) {
        self$`eldBigDayExemptionEnabled` <- `eldBigDayExemptionEnabled`
      }
      if (!is.null(`eldDayStartHour`)) {
        stopifnot(is.numeric(`eldDayStartHour`), length(`eldDayStartHour`) == 1)
        self$`eldDayStartHour` <- `eldDayStartHour`
      }
      if (!is.null(`eldExempt`)) {
        self$`eldExempt` <- `eldExempt`
      }
      if (!is.null(`eldExemptReason`)) {
        stopifnot(is.character(`eldExemptReason`), length(`eldExemptReason`) == 1)
        self$`eldExemptReason` <- `eldExemptReason`
      }
      if (!is.null(`eldPcEnabled`)) {
        self$`eldPcEnabled` <- `eldPcEnabled`
      }
      if (!is.null(`eldYmEnabled`)) {
        self$`eldYmEnabled` <- `eldYmEnabled`
      }
      if (!is.null(`externalIds`)) {
        self$`externalIds` <- `externalIds`
      }
      if (!is.null(`groupId`)) {
        stopifnot(is.numeric(`groupId`), length(`groupId`) == 1)
        self$`groupId` <- `groupId`
      }
      if (!is.null(`licenseNumber`)) {
        stopifnot(is.character(`licenseNumber`), length(`licenseNumber`) == 1)
        self$`licenseNumber` <- `licenseNumber`
      }
      if (!is.null(`licenseState`)) {
        stopifnot(is.character(`licenseState`), length(`licenseState`) == 1)
        self$`licenseState` <- `licenseState`
      }
      if (!is.null(`notes`)) {
        stopifnot(is.character(`notes`), length(`notes`) == 1)
        self$`notes` <- `notes`
      }
      if (!is.null(`phone`)) {
        stopifnot(is.character(`phone`), length(`phone`) == 1)
        self$`phone` <- `phone`
      }
      if (!is.null(`username`)) {
        stopifnot(is.character(`username`), length(`username`) == 1)
        self$`username` <- `username`
      }
      if (!is.null(`vehicleId`)) {
        stopifnot(is.numeric(`vehicleId`), length(`vehicleId`) == 1)
        self$`vehicleId` <- `vehicleId`
      }
      if (!is.null(`isDeactivated`)) {
        self$`isDeactivated` <- `isDeactivated`
      }
      if (!is.null(`tags`)) {
        stopifnot(is.vector(`tags`), length(`tags`) != 0)
        sapply(`tags`, function(x) stopifnot(R6::is.R6(x)))
        self$`tags` <- `tags`
      }
    },
    toJSON = function() {
      DriverObject <- list()
      if (!is.null(self$`eldAdverseWeatherExemptionEnabled`)) {
        DriverObject[['eldAdverseWeatherExemptionEnabled']] <-
          self$`eldAdverseWeatherExemptionEnabled`
      }
      if (!is.null(self$`eldBigDayExemptionEnabled`)) {
        DriverObject[['eldBigDayExemptionEnabled']] <-
          self$`eldBigDayExemptionEnabled`
      }
      if (!is.null(self$`eldDayStartHour`)) {
        DriverObject[['eldDayStartHour']] <-
          self$`eldDayStartHour`
      }
      if (!is.null(self$`eldExempt`)) {
        DriverObject[['eldExempt']] <-
          self$`eldExempt`
      }
      if (!is.null(self$`eldExemptReason`)) {
        DriverObject[['eldExemptReason']] <-
          self$`eldExemptReason`
      }
      if (!is.null(self$`eldPcEnabled`)) {
        DriverObject[['eldPcEnabled']] <-
          self$`eldPcEnabled`
      }
      if (!is.null(self$`eldYmEnabled`)) {
        DriverObject[['eldYmEnabled']] <-
          self$`eldYmEnabled`
      }
      if (!is.null(self$`externalIds`)) {
        DriverObject[['externalIds']] <-
          self$`externalIds`
      }
      if (!is.null(self$`groupId`)) {
        DriverObject[['groupId']] <-
          self$`groupId`
      }
      if (!is.null(self$`licenseNumber`)) {
        DriverObject[['licenseNumber']] <-
          self$`licenseNumber`
      }
      if (!is.null(self$`licenseState`)) {
        DriverObject[['licenseState']] <-
          self$`licenseState`
      }
      if (!is.null(self$`name`)) {
        DriverObject[['name']] <-
          self$`name`
      }
      if (!is.null(self$`notes`)) {
        DriverObject[['notes']] <-
          self$`notes`
      }
      if (!is.null(self$`phone`)) {
        DriverObject[['phone']] <-
          self$`phone`
      }
      if (!is.null(self$`username`)) {
        DriverObject[['username']] <-
          self$`username`
      }
      if (!is.null(self$`vehicleId`)) {
        DriverObject[['vehicleId']] <-
          self$`vehicleId`
      }
      if (!is.null(self$`id`)) {
        DriverObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`isDeactivated`)) {
        DriverObject[['isDeactivated']] <-
          self$`isDeactivated`
      }
      if (!is.null(self$`tags`)) {
        DriverObject[['tags']] <-
          sapply(self$`tags`, function(x) x$toJSON())
      }

      DriverObject
    },
    fromJSON = function(DriverJson) {
      DriverObject <- jsonlite::fromJSON(DriverJson)
      if (!is.null(DriverObject$`eldAdverseWeatherExemptionEnabled`)) {
        self$`eldAdverseWeatherExemptionEnabled` <- DriverObject$`eldAdverseWeatherExemptionEnabled`
      }
      if (!is.null(DriverObject$`eldBigDayExemptionEnabled`)) {
        self$`eldBigDayExemptionEnabled` <- DriverObject$`eldBigDayExemptionEnabled`
      }
      if (!is.null(DriverObject$`eldDayStartHour`)) {
        self$`eldDayStartHour` <- DriverObject$`eldDayStartHour`
      }
      if (!is.null(DriverObject$`eldExempt`)) {
        self$`eldExempt` <- DriverObject$`eldExempt`
      }
      if (!is.null(DriverObject$`eldExemptReason`)) {
        self$`eldExemptReason` <- DriverObject$`eldExemptReason`
      }
      if (!is.null(DriverObject$`eldPcEnabled`)) {
        self$`eldPcEnabled` <- DriverObject$`eldPcEnabled`
      }
      if (!is.null(DriverObject$`eldYmEnabled`)) {
        self$`eldYmEnabled` <- DriverObject$`eldYmEnabled`
      }
      if (!is.null(DriverObject$`externalIds`)) {
        self$`externalIds` <- DriverObject$`externalIds`
      }
      if (!is.null(DriverObject$`groupId`)) {
        self$`groupId` <- DriverObject$`groupId`
      }
      if (!is.null(DriverObject$`licenseNumber`)) {
        self$`licenseNumber` <- DriverObject$`licenseNumber`
      }
      if (!is.null(DriverObject$`licenseState`)) {
        self$`licenseState` <- DriverObject$`licenseState`
      }
      if (!is.null(DriverObject$`name`)) {
        self$`name` <- DriverObject$`name`
      }
      if (!is.null(DriverObject$`notes`)) {
        self$`notes` <- DriverObject$`notes`
      }
      if (!is.null(DriverObject$`phone`)) {
        self$`phone` <- DriverObject$`phone`
      }
      if (!is.null(DriverObject$`username`)) {
        self$`username` <- DriverObject$`username`
      }
      if (!is.null(DriverObject$`vehicleId`)) {
        self$`vehicleId` <- DriverObject$`vehicleId`
      }
      if (!is.null(DriverObject$`id`)) {
        self$`id` <- DriverObject$`id`
      }
      if (!is.null(DriverObject$`isDeactivated`)) {
        self$`isDeactivated` <- DriverObject$`isDeactivated`
      }
      if (!is.null(DriverObject$`tags`)) {
        self$`tags` <- sapply(DriverObject$`tags`, function(x) {
          tagsObject <- TagMetadata$new()
          tagsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          tagsObject
        })
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "eldAdverseWeatherExemptionEnabled":
             "%s",
           "eldBigDayExemptionEnabled":
             "%s",
           "eldDayStartHour":
             %d,
           "eldExempt":
             "%s",
           "eldExemptReason":
             "%s",
           "eldPcEnabled":
             "%s",
           "eldYmEnabled":
             "%s",
           "externalIds":
             "%s",
           "groupId":
             %d,
           "licenseNumber":
             "%s",
           "licenseState":
             "%s",
           "name":
             "%s",
           "notes":
             "%s",
           "phone":
             "%s",
           "username":
             "%s",
           "vehicleId":
             %d,
           "id":
             %d,
           "isDeactivated":
             "%s",
           "tags":
             [%s]
        }',
        self$`eldAdverseWeatherExemptionEnabled`,
        self$`eldBigDayExemptionEnabled`,
        self$`eldDayStartHour`,
        self$`eldExempt`,
        self$`eldExemptReason`,
        self$`eldPcEnabled`,
        self$`eldYmEnabled`,
        self$`externalIds`,
        self$`groupId`,
        self$`licenseNumber`,
        self$`licenseState`,
        self$`name`,
        self$`notes`,
        self$`phone`,
        self$`username`,
        self$`vehicleId`,
        self$`id`,
        self$`isDeactivated`,
        paste(unlist(lapply(self$`tags`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=",")
      )
    },
    fromJSONString = function(DriverJson) {
      DriverObject <- jsonlite::fromJSON(DriverJson)
      self$`eldAdverseWeatherExemptionEnabled` <- DriverObject$`eldAdverseWeatherExemptionEnabled`
      self$`eldBigDayExemptionEnabled` <- DriverObject$`eldBigDayExemptionEnabled`
      self$`eldDayStartHour` <- DriverObject$`eldDayStartHour`
      self$`eldExempt` <- DriverObject$`eldExempt`
      self$`eldExemptReason` <- DriverObject$`eldExemptReason`
      self$`eldPcEnabled` <- DriverObject$`eldPcEnabled`
      self$`eldYmEnabled` <- DriverObject$`eldYmEnabled`
      self$`externalIds` <- DriverObject$`externalIds`
      self$`groupId` <- DriverObject$`groupId`
      self$`licenseNumber` <- DriverObject$`licenseNumber`
      self$`licenseState` <- DriverObject$`licenseState`
      self$`name` <- DriverObject$`name`
      self$`notes` <- DriverObject$`notes`
      self$`phone` <- DriverObject$`phone`
      self$`username` <- DriverObject$`username`
      self$`vehicleId` <- DriverObject$`vehicleId`
      self$`id` <- DriverObject$`id`
      self$`isDeactivated` <- DriverObject$`isDeactivated`
      data.frame <- DriverObject$`tags`
      self$`tags` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          tags.node <- TagMetadata$new()
          tags.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`tags`[[row]] <- tags.node
      }
      self
    }
  )
)
