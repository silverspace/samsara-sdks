# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' DispatchRouteCreate Class
#'
#' @field actual_end_ms 
#' @field actual_start_ms 
#' @field driver_id 
#' @field group_id 
#' @field name 
#' @field scheduled_end_ms 
#' @field scheduled_meters 
#' @field scheduled_start_ms 
#' @field start_location_address 
#' @field start_location_address_id 
#' @field start_location_lat 
#' @field start_location_lng 
#' @field start_location_name 
#' @field trailer_id 
#' @field vehicle_id 
#' @field dispatch_jobs 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DispatchRouteCreate <- R6::R6Class(
  'DispatchRouteCreate',
  public = list(
    `actual_end_ms` = NULL,
    `actual_start_ms` = NULL,
    `driver_id` = NULL,
    `group_id` = NULL,
    `name` = NULL,
    `scheduled_end_ms` = NULL,
    `scheduled_meters` = NULL,
    `scheduled_start_ms` = NULL,
    `start_location_address` = NULL,
    `start_location_address_id` = NULL,
    `start_location_lat` = NULL,
    `start_location_lng` = NULL,
    `start_location_name` = NULL,
    `trailer_id` = NULL,
    `vehicle_id` = NULL,
    `dispatch_jobs` = NULL,
    initialize = function(`name`, `scheduled_end_ms`, `scheduled_start_ms`, `dispatch_jobs`, `actual_end_ms`=NULL, `actual_start_ms`=NULL, `driver_id`=NULL, `group_id`=NULL, `scheduled_meters`=NULL, `start_location_address`=NULL, `start_location_address_id`=NULL, `start_location_lat`=NULL, `start_location_lng`=NULL, `start_location_name`=NULL, `trailer_id`=NULL, `vehicle_id`=NULL, ...){
      local.optional.var <- list(...)
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`scheduled_end_ms`)) {
        stopifnot(is.numeric(`scheduled_end_ms`), length(`scheduled_end_ms`) == 1)
        self$`scheduled_end_ms` <- `scheduled_end_ms`
      }
      if (!missing(`scheduled_start_ms`)) {
        stopifnot(is.numeric(`scheduled_start_ms`), length(`scheduled_start_ms`) == 1)
        self$`scheduled_start_ms` <- `scheduled_start_ms`
      }
      if (!missing(`dispatch_jobs`)) {
        stopifnot(is.vector(`dispatch_jobs`), length(`dispatch_jobs`) != 0)
        sapply(`dispatch_jobs`, function(x) stopifnot(R6::is.R6(x)))
        self$`dispatch_jobs` <- `dispatch_jobs`
      }
      if (!is.null(`actual_end_ms`)) {
        stopifnot(is.numeric(`actual_end_ms`), length(`actual_end_ms`) == 1)
        self$`actual_end_ms` <- `actual_end_ms`
      }
      if (!is.null(`actual_start_ms`)) {
        stopifnot(is.numeric(`actual_start_ms`), length(`actual_start_ms`) == 1)
        self$`actual_start_ms` <- `actual_start_ms`
      }
      if (!is.null(`driver_id`)) {
        stopifnot(is.numeric(`driver_id`), length(`driver_id`) == 1)
        self$`driver_id` <- `driver_id`
      }
      if (!is.null(`group_id`)) {
        stopifnot(is.numeric(`group_id`), length(`group_id`) == 1)
        self$`group_id` <- `group_id`
      }
      if (!is.null(`scheduled_meters`)) {
        stopifnot(is.numeric(`scheduled_meters`), length(`scheduled_meters`) == 1)
        self$`scheduled_meters` <- `scheduled_meters`
      }
      if (!is.null(`start_location_address`)) {
        stopifnot(is.character(`start_location_address`), length(`start_location_address`) == 1)
        self$`start_location_address` <- `start_location_address`
      }
      if (!is.null(`start_location_address_id`)) {
        stopifnot(is.numeric(`start_location_address_id`), length(`start_location_address_id`) == 1)
        self$`start_location_address_id` <- `start_location_address_id`
      }
      if (!is.null(`start_location_lat`)) {
        stopifnot(is.numeric(`start_location_lat`), length(`start_location_lat`) == 1)
        self$`start_location_lat` <- `start_location_lat`
      }
      if (!is.null(`start_location_lng`)) {
        stopifnot(is.numeric(`start_location_lng`), length(`start_location_lng`) == 1)
        self$`start_location_lng` <- `start_location_lng`
      }
      if (!is.null(`start_location_name`)) {
        stopifnot(is.character(`start_location_name`), length(`start_location_name`) == 1)
        self$`start_location_name` <- `start_location_name`
      }
      if (!is.null(`trailer_id`)) {
        stopifnot(is.numeric(`trailer_id`), length(`trailer_id`) == 1)
        self$`trailer_id` <- `trailer_id`
      }
      if (!is.null(`vehicle_id`)) {
        stopifnot(is.numeric(`vehicle_id`), length(`vehicle_id`) == 1)
        self$`vehicle_id` <- `vehicle_id`
      }
    },
    toJSON = function() {
      DispatchRouteCreateObject <- list()
      if (!is.null(self$`actual_end_ms`)) {
        DispatchRouteCreateObject[['actual_end_ms']] <-
          self$`actual_end_ms`
      }
      if (!is.null(self$`actual_start_ms`)) {
        DispatchRouteCreateObject[['actual_start_ms']] <-
          self$`actual_start_ms`
      }
      if (!is.null(self$`driver_id`)) {
        DispatchRouteCreateObject[['driver_id']] <-
          self$`driver_id`
      }
      if (!is.null(self$`group_id`)) {
        DispatchRouteCreateObject[['group_id']] <-
          self$`group_id`
      }
      if (!is.null(self$`name`)) {
        DispatchRouteCreateObject[['name']] <-
          self$`name`
      }
      if (!is.null(self$`scheduled_end_ms`)) {
        DispatchRouteCreateObject[['scheduled_end_ms']] <-
          self$`scheduled_end_ms`
      }
      if (!is.null(self$`scheduled_meters`)) {
        DispatchRouteCreateObject[['scheduled_meters']] <-
          self$`scheduled_meters`
      }
      if (!is.null(self$`scheduled_start_ms`)) {
        DispatchRouteCreateObject[['scheduled_start_ms']] <-
          self$`scheduled_start_ms`
      }
      if (!is.null(self$`start_location_address`)) {
        DispatchRouteCreateObject[['start_location_address']] <-
          self$`start_location_address`
      }
      if (!is.null(self$`start_location_address_id`)) {
        DispatchRouteCreateObject[['start_location_address_id']] <-
          self$`start_location_address_id`
      }
      if (!is.null(self$`start_location_lat`)) {
        DispatchRouteCreateObject[['start_location_lat']] <-
          self$`start_location_lat`
      }
      if (!is.null(self$`start_location_lng`)) {
        DispatchRouteCreateObject[['start_location_lng']] <-
          self$`start_location_lng`
      }
      if (!is.null(self$`start_location_name`)) {
        DispatchRouteCreateObject[['start_location_name']] <-
          self$`start_location_name`
      }
      if (!is.null(self$`trailer_id`)) {
        DispatchRouteCreateObject[['trailer_id']] <-
          self$`trailer_id`
      }
      if (!is.null(self$`vehicle_id`)) {
        DispatchRouteCreateObject[['vehicle_id']] <-
          self$`vehicle_id`
      }
      if (!is.null(self$`dispatch_jobs`)) {
        DispatchRouteCreateObject[['dispatch_jobs']] <-
          sapply(self$`dispatch_jobs`, function(x) x$toJSON())
      }

      DispatchRouteCreateObject
    },
    fromJSON = function(DispatchRouteCreateJson) {
      DispatchRouteCreateObject <- jsonlite::fromJSON(DispatchRouteCreateJson)
      if (!is.null(DispatchRouteCreateObject$`actual_end_ms`)) {
        self$`actual_end_ms` <- DispatchRouteCreateObject$`actual_end_ms`
      }
      if (!is.null(DispatchRouteCreateObject$`actual_start_ms`)) {
        self$`actual_start_ms` <- DispatchRouteCreateObject$`actual_start_ms`
      }
      if (!is.null(DispatchRouteCreateObject$`driver_id`)) {
        self$`driver_id` <- DispatchRouteCreateObject$`driver_id`
      }
      if (!is.null(DispatchRouteCreateObject$`group_id`)) {
        self$`group_id` <- DispatchRouteCreateObject$`group_id`
      }
      if (!is.null(DispatchRouteCreateObject$`name`)) {
        self$`name` <- DispatchRouteCreateObject$`name`
      }
      if (!is.null(DispatchRouteCreateObject$`scheduled_end_ms`)) {
        self$`scheduled_end_ms` <- DispatchRouteCreateObject$`scheduled_end_ms`
      }
      if (!is.null(DispatchRouteCreateObject$`scheduled_meters`)) {
        self$`scheduled_meters` <- DispatchRouteCreateObject$`scheduled_meters`
      }
      if (!is.null(DispatchRouteCreateObject$`scheduled_start_ms`)) {
        self$`scheduled_start_ms` <- DispatchRouteCreateObject$`scheduled_start_ms`
      }
      if (!is.null(DispatchRouteCreateObject$`start_location_address`)) {
        self$`start_location_address` <- DispatchRouteCreateObject$`start_location_address`
      }
      if (!is.null(DispatchRouteCreateObject$`start_location_address_id`)) {
        self$`start_location_address_id` <- DispatchRouteCreateObject$`start_location_address_id`
      }
      if (!is.null(DispatchRouteCreateObject$`start_location_lat`)) {
        self$`start_location_lat` <- DispatchRouteCreateObject$`start_location_lat`
      }
      if (!is.null(DispatchRouteCreateObject$`start_location_lng`)) {
        self$`start_location_lng` <- DispatchRouteCreateObject$`start_location_lng`
      }
      if (!is.null(DispatchRouteCreateObject$`start_location_name`)) {
        self$`start_location_name` <- DispatchRouteCreateObject$`start_location_name`
      }
      if (!is.null(DispatchRouteCreateObject$`trailer_id`)) {
        self$`trailer_id` <- DispatchRouteCreateObject$`trailer_id`
      }
      if (!is.null(DispatchRouteCreateObject$`vehicle_id`)) {
        self$`vehicle_id` <- DispatchRouteCreateObject$`vehicle_id`
      }
      if (!is.null(DispatchRouteCreateObject$`dispatch_jobs`)) {
        self$`dispatch_jobs` <- sapply(DispatchRouteCreateObject$`dispatch_jobs`, function(x) {
          dispatch_jobsObject <- DispatchJobCreate$new()
          dispatch_jobsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          dispatch_jobsObject
        })
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "actual_end_ms":
             %d,
           "actual_start_ms":
             %d,
           "driver_id":
             %d,
           "group_id":
             %d,
           "name":
             "%s",
           "scheduled_end_ms":
             %d,
           "scheduled_meters":
             %d,
           "scheduled_start_ms":
             %d,
           "start_location_address":
             "%s",
           "start_location_address_id":
             %d,
           "start_location_lat":
             %d,
           "start_location_lng":
             %d,
           "start_location_name":
             "%s",
           "trailer_id":
             %d,
           "vehicle_id":
             %d,
           "dispatch_jobs":
             [%s]
        }',
        self$`actual_end_ms`,
        self$`actual_start_ms`,
        self$`driver_id`,
        self$`group_id`,
        self$`name`,
        self$`scheduled_end_ms`,
        self$`scheduled_meters`,
        self$`scheduled_start_ms`,
        self$`start_location_address`,
        self$`start_location_address_id`,
        self$`start_location_lat`,
        self$`start_location_lng`,
        self$`start_location_name`,
        self$`trailer_id`,
        self$`vehicle_id`,
        paste(unlist(lapply(self$`dispatch_jobs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=",")
      )
    },
    fromJSONString = function(DispatchRouteCreateJson) {
      DispatchRouteCreateObject <- jsonlite::fromJSON(DispatchRouteCreateJson)
      self$`actual_end_ms` <- DispatchRouteCreateObject$`actual_end_ms`
      self$`actual_start_ms` <- DispatchRouteCreateObject$`actual_start_ms`
      self$`driver_id` <- DispatchRouteCreateObject$`driver_id`
      self$`group_id` <- DispatchRouteCreateObject$`group_id`
      self$`name` <- DispatchRouteCreateObject$`name`
      self$`scheduled_end_ms` <- DispatchRouteCreateObject$`scheduled_end_ms`
      self$`scheduled_meters` <- DispatchRouteCreateObject$`scheduled_meters`
      self$`scheduled_start_ms` <- DispatchRouteCreateObject$`scheduled_start_ms`
      self$`start_location_address` <- DispatchRouteCreateObject$`start_location_address`
      self$`start_location_address_id` <- DispatchRouteCreateObject$`start_location_address_id`
      self$`start_location_lat` <- DispatchRouteCreateObject$`start_location_lat`
      self$`start_location_lng` <- DispatchRouteCreateObject$`start_location_lng`
      self$`start_location_name` <- DispatchRouteCreateObject$`start_location_name`
      self$`trailer_id` <- DispatchRouteCreateObject$`trailer_id`
      self$`vehicle_id` <- DispatchRouteCreateObject$`vehicle_id`
      data.frame <- DispatchRouteCreateObject$`dispatch_jobs`
      self$`dispatch_jobs` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          dispatch_jobs.node <- DispatchJobCreate$new()
          dispatch_jobs.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`dispatch_jobs`[[row]] <- dispatch_jobs.node
      }
      self
    }
  )
)
