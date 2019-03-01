# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' DispatchJob Class
#'
#' @field destination_address 
#' @field destination_address_id 
#' @field destination_lat 
#' @field destination_lng 
#' @field destination_name 
#' @field notes 
#' @field scheduled_arrival_time_ms 
#' @field scheduled_departure_time_ms 
#' @field arrived_at_ms 
#' @field completed_at_ms 
#' @field dispatch_route_id 
#' @field driver_id 
#' @field en_route_at_ms 
#' @field estimated_arrival_ms 
#' @field fleet_viewer_url 
#' @field group_id 
#' @field id 
#' @field job_state 
#' @field skipped_at_ms 
#' @field vehicle_id 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DispatchJob <- R6::R6Class(
  'DispatchJob',
  public = list(
    `destination_address` = NULL,
    `destination_address_id` = NULL,
    `destination_lat` = NULL,
    `destination_lng` = NULL,
    `destination_name` = NULL,
    `notes` = NULL,
    `scheduled_arrival_time_ms` = NULL,
    `scheduled_departure_time_ms` = NULL,
    `arrived_at_ms` = NULL,
    `completed_at_ms` = NULL,
    `dispatch_route_id` = NULL,
    `driver_id` = NULL,
    `en_route_at_ms` = NULL,
    `estimated_arrival_ms` = NULL,
    `fleet_viewer_url` = NULL,
    `group_id` = NULL,
    `id` = NULL,
    `job_state` = NULL,
    `skipped_at_ms` = NULL,
    `vehicle_id` = NULL,
    initialize = function(`scheduled_arrival_time_ms`, `dispatch_route_id`, `group_id`, `id`, `job_state`, `destination_address`=NULL, `destination_address_id`=NULL, `destination_lat`=NULL, `destination_lng`=NULL, `destination_name`=NULL, `notes`=NULL, `scheduled_departure_time_ms`=NULL, `arrived_at_ms`=NULL, `completed_at_ms`=NULL, `driver_id`=NULL, `en_route_at_ms`=NULL, `estimated_arrival_ms`=NULL, `fleet_viewer_url`=NULL, `skipped_at_ms`=NULL, `vehicle_id`=NULL, ...){
      local.optional.var <- list(...)
      if (!missing(`scheduled_arrival_time_ms`)) {
        stopifnot(is.numeric(`scheduled_arrival_time_ms`), length(`scheduled_arrival_time_ms`) == 1)
        self$`scheduled_arrival_time_ms` <- `scheduled_arrival_time_ms`
      }
      if (!missing(`dispatch_route_id`)) {
        stopifnot(is.numeric(`dispatch_route_id`), length(`dispatch_route_id`) == 1)
        self$`dispatch_route_id` <- `dispatch_route_id`
      }
      if (!missing(`group_id`)) {
        stopifnot(is.numeric(`group_id`), length(`group_id`) == 1)
        self$`group_id` <- `group_id`
      }
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`job_state`)) {
        stopifnot(R6::is.R6(`job_state`))
        self$`job_state` <- `job_state`
      }
      if (!is.null(`destination_address`)) {
        stopifnot(is.character(`destination_address`), length(`destination_address`) == 1)
        self$`destination_address` <- `destination_address`
      }
      if (!is.null(`destination_address_id`)) {
        stopifnot(is.numeric(`destination_address_id`), length(`destination_address_id`) == 1)
        self$`destination_address_id` <- `destination_address_id`
      }
      if (!is.null(`destination_lat`)) {
        stopifnot(is.numeric(`destination_lat`), length(`destination_lat`) == 1)
        self$`destination_lat` <- `destination_lat`
      }
      if (!is.null(`destination_lng`)) {
        stopifnot(is.numeric(`destination_lng`), length(`destination_lng`) == 1)
        self$`destination_lng` <- `destination_lng`
      }
      if (!is.null(`destination_name`)) {
        stopifnot(is.character(`destination_name`), length(`destination_name`) == 1)
        self$`destination_name` <- `destination_name`
      }
      if (!is.null(`notes`)) {
        stopifnot(is.character(`notes`), length(`notes`) == 1)
        self$`notes` <- `notes`
      }
      if (!is.null(`scheduled_departure_time_ms`)) {
        stopifnot(is.numeric(`scheduled_departure_time_ms`), length(`scheduled_departure_time_ms`) == 1)
        self$`scheduled_departure_time_ms` <- `scheduled_departure_time_ms`
      }
      if (!is.null(`arrived_at_ms`)) {
        stopifnot(is.numeric(`arrived_at_ms`), length(`arrived_at_ms`) == 1)
        self$`arrived_at_ms` <- `arrived_at_ms`
      }
      if (!is.null(`completed_at_ms`)) {
        stopifnot(is.numeric(`completed_at_ms`), length(`completed_at_ms`) == 1)
        self$`completed_at_ms` <- `completed_at_ms`
      }
      if (!is.null(`driver_id`)) {
        stopifnot(is.numeric(`driver_id`), length(`driver_id`) == 1)
        self$`driver_id` <- `driver_id`
      }
      if (!is.null(`en_route_at_ms`)) {
        stopifnot(is.numeric(`en_route_at_ms`), length(`en_route_at_ms`) == 1)
        self$`en_route_at_ms` <- `en_route_at_ms`
      }
      if (!is.null(`estimated_arrival_ms`)) {
        stopifnot(is.numeric(`estimated_arrival_ms`), length(`estimated_arrival_ms`) == 1)
        self$`estimated_arrival_ms` <- `estimated_arrival_ms`
      }
      if (!is.null(`fleet_viewer_url`)) {
        stopifnot(is.character(`fleet_viewer_url`), length(`fleet_viewer_url`) == 1)
        self$`fleet_viewer_url` <- `fleet_viewer_url`
      }
      if (!is.null(`skipped_at_ms`)) {
        stopifnot(is.numeric(`skipped_at_ms`), length(`skipped_at_ms`) == 1)
        self$`skipped_at_ms` <- `skipped_at_ms`
      }
      if (!is.null(`vehicle_id`)) {
        stopifnot(is.numeric(`vehicle_id`), length(`vehicle_id`) == 1)
        self$`vehicle_id` <- `vehicle_id`
      }
    },
    toJSON = function() {
      DispatchJobObject <- list()
      if (!is.null(self$`destination_address`)) {
        DispatchJobObject[['destination_address']] <-
          self$`destination_address`
      }
      if (!is.null(self$`destination_address_id`)) {
        DispatchJobObject[['destination_address_id']] <-
          self$`destination_address_id`
      }
      if (!is.null(self$`destination_lat`)) {
        DispatchJobObject[['destination_lat']] <-
          self$`destination_lat`
      }
      if (!is.null(self$`destination_lng`)) {
        DispatchJobObject[['destination_lng']] <-
          self$`destination_lng`
      }
      if (!is.null(self$`destination_name`)) {
        DispatchJobObject[['destination_name']] <-
          self$`destination_name`
      }
      if (!is.null(self$`notes`)) {
        DispatchJobObject[['notes']] <-
          self$`notes`
      }
      if (!is.null(self$`scheduled_arrival_time_ms`)) {
        DispatchJobObject[['scheduled_arrival_time_ms']] <-
          self$`scheduled_arrival_time_ms`
      }
      if (!is.null(self$`scheduled_departure_time_ms`)) {
        DispatchJobObject[['scheduled_departure_time_ms']] <-
          self$`scheduled_departure_time_ms`
      }
      if (!is.null(self$`arrived_at_ms`)) {
        DispatchJobObject[['arrived_at_ms']] <-
          self$`arrived_at_ms`
      }
      if (!is.null(self$`completed_at_ms`)) {
        DispatchJobObject[['completed_at_ms']] <-
          self$`completed_at_ms`
      }
      if (!is.null(self$`dispatch_route_id`)) {
        DispatchJobObject[['dispatch_route_id']] <-
          self$`dispatch_route_id`
      }
      if (!is.null(self$`driver_id`)) {
        DispatchJobObject[['driver_id']] <-
          self$`driver_id`
      }
      if (!is.null(self$`en_route_at_ms`)) {
        DispatchJobObject[['en_route_at_ms']] <-
          self$`en_route_at_ms`
      }
      if (!is.null(self$`estimated_arrival_ms`)) {
        DispatchJobObject[['estimated_arrival_ms']] <-
          self$`estimated_arrival_ms`
      }
      if (!is.null(self$`fleet_viewer_url`)) {
        DispatchJobObject[['fleet_viewer_url']] <-
          self$`fleet_viewer_url`
      }
      if (!is.null(self$`group_id`)) {
        DispatchJobObject[['group_id']] <-
          self$`group_id`
      }
      if (!is.null(self$`id`)) {
        DispatchJobObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`job_state`)) {
        DispatchJobObject[['job_state']] <-
          self$`job_state`$toJSON()
      }
      if (!is.null(self$`skipped_at_ms`)) {
        DispatchJobObject[['skipped_at_ms']] <-
          self$`skipped_at_ms`
      }
      if (!is.null(self$`vehicle_id`)) {
        DispatchJobObject[['vehicle_id']] <-
          self$`vehicle_id`
      }

      DispatchJobObject
    },
    fromJSON = function(DispatchJobJson) {
      DispatchJobObject <- jsonlite::fromJSON(DispatchJobJson)
      if (!is.null(DispatchJobObject$`destination_address`)) {
        self$`destination_address` <- DispatchJobObject$`destination_address`
      }
      if (!is.null(DispatchJobObject$`destination_address_id`)) {
        self$`destination_address_id` <- DispatchJobObject$`destination_address_id`
      }
      if (!is.null(DispatchJobObject$`destination_lat`)) {
        self$`destination_lat` <- DispatchJobObject$`destination_lat`
      }
      if (!is.null(DispatchJobObject$`destination_lng`)) {
        self$`destination_lng` <- DispatchJobObject$`destination_lng`
      }
      if (!is.null(DispatchJobObject$`destination_name`)) {
        self$`destination_name` <- DispatchJobObject$`destination_name`
      }
      if (!is.null(DispatchJobObject$`notes`)) {
        self$`notes` <- DispatchJobObject$`notes`
      }
      if (!is.null(DispatchJobObject$`scheduled_arrival_time_ms`)) {
        self$`scheduled_arrival_time_ms` <- DispatchJobObject$`scheduled_arrival_time_ms`
      }
      if (!is.null(DispatchJobObject$`scheduled_departure_time_ms`)) {
        self$`scheduled_departure_time_ms` <- DispatchJobObject$`scheduled_departure_time_ms`
      }
      if (!is.null(DispatchJobObject$`arrived_at_ms`)) {
        self$`arrived_at_ms` <- DispatchJobObject$`arrived_at_ms`
      }
      if (!is.null(DispatchJobObject$`completed_at_ms`)) {
        self$`completed_at_ms` <- DispatchJobObject$`completed_at_ms`
      }
      if (!is.null(DispatchJobObject$`dispatch_route_id`)) {
        self$`dispatch_route_id` <- DispatchJobObject$`dispatch_route_id`
      }
      if (!is.null(DispatchJobObject$`driver_id`)) {
        self$`driver_id` <- DispatchJobObject$`driver_id`
      }
      if (!is.null(DispatchJobObject$`en_route_at_ms`)) {
        self$`en_route_at_ms` <- DispatchJobObject$`en_route_at_ms`
      }
      if (!is.null(DispatchJobObject$`estimated_arrival_ms`)) {
        self$`estimated_arrival_ms` <- DispatchJobObject$`estimated_arrival_ms`
      }
      if (!is.null(DispatchJobObject$`fleet_viewer_url`)) {
        self$`fleet_viewer_url` <- DispatchJobObject$`fleet_viewer_url`
      }
      if (!is.null(DispatchJobObject$`group_id`)) {
        self$`group_id` <- DispatchJobObject$`group_id`
      }
      if (!is.null(DispatchJobObject$`id`)) {
        self$`id` <- DispatchJobObject$`id`
      }
      if (!is.null(DispatchJobObject$`job_state`)) {
        job_stateObject <- JobStatus$new()
        job_stateObject$fromJSON(jsonlite::toJSON(DispatchJobObject$job_state, auto_unbox = TRUE))
        self$`job_state` <- job_stateObject
      }
      if (!is.null(DispatchJobObject$`skipped_at_ms`)) {
        self$`skipped_at_ms` <- DispatchJobObject$`skipped_at_ms`
      }
      if (!is.null(DispatchJobObject$`vehicle_id`)) {
        self$`vehicle_id` <- DispatchJobObject$`vehicle_id`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "destination_address":
             "%s",
           "destination_address_id":
             %d,
           "destination_lat":
             %d,
           "destination_lng":
             %d,
           "destination_name":
             "%s",
           "notes":
             "%s",
           "scheduled_arrival_time_ms":
             %d,
           "scheduled_departure_time_ms":
             %d,
           "arrived_at_ms":
             %d,
           "completed_at_ms":
             %d,
           "dispatch_route_id":
             %d,
           "driver_id":
             %d,
           "en_route_at_ms":
             %d,
           "estimated_arrival_ms":
             %d,
           "fleet_viewer_url":
             "%s",
           "group_id":
             %d,
           "id":
             %d,
           "job_state":
             %s,
           "skipped_at_ms":
             %d,
           "vehicle_id":
             %d
        }',
        self$`destination_address`,
        self$`destination_address_id`,
        self$`destination_lat`,
        self$`destination_lng`,
        self$`destination_name`,
        self$`notes`,
        self$`scheduled_arrival_time_ms`,
        self$`scheduled_departure_time_ms`,
        self$`arrived_at_ms`,
        self$`completed_at_ms`,
        self$`dispatch_route_id`,
        self$`driver_id`,
        self$`en_route_at_ms`,
        self$`estimated_arrival_ms`,
        self$`fleet_viewer_url`,
        self$`group_id`,
        self$`id`,
        jsonlite::toJSON(self$`job_state`$toJSON(), auto_unbox=TRUE),
        self$`skipped_at_ms`,
        self$`vehicle_id`
      )
    },
    fromJSONString = function(DispatchJobJson) {
      DispatchJobObject <- jsonlite::fromJSON(DispatchJobJson)
      self$`destination_address` <- DispatchJobObject$`destination_address`
      self$`destination_address_id` <- DispatchJobObject$`destination_address_id`
      self$`destination_lat` <- DispatchJobObject$`destination_lat`
      self$`destination_lng` <- DispatchJobObject$`destination_lng`
      self$`destination_name` <- DispatchJobObject$`destination_name`
      self$`notes` <- DispatchJobObject$`notes`
      self$`scheduled_arrival_time_ms` <- DispatchJobObject$`scheduled_arrival_time_ms`
      self$`scheduled_departure_time_ms` <- DispatchJobObject$`scheduled_departure_time_ms`
      self$`arrived_at_ms` <- DispatchJobObject$`arrived_at_ms`
      self$`completed_at_ms` <- DispatchJobObject$`completed_at_ms`
      self$`dispatch_route_id` <- DispatchJobObject$`dispatch_route_id`
      self$`driver_id` <- DispatchJobObject$`driver_id`
      self$`en_route_at_ms` <- DispatchJobObject$`en_route_at_ms`
      self$`estimated_arrival_ms` <- DispatchJobObject$`estimated_arrival_ms`
      self$`fleet_viewer_url` <- DispatchJobObject$`fleet_viewer_url`
      self$`group_id` <- DispatchJobObject$`group_id`
      self$`id` <- DispatchJobObject$`id`
      self$`job_state` <- JobStatus$new()$fromJSON(jsonlite::toJSON(DispatchJobObject$job_state, auto_unbox = TRUE))
      self$`skipped_at_ms` <- DispatchJobObject$`skipped_at_ms`
      self$`vehicle_id` <- DispatchJobObject$`vehicle_id`
      self
    }
  )
)
