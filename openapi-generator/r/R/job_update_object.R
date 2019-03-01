# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' JobUpdateObject Class
#'
#' @field changed_at_ms 
#' @field job_id 
#' @field job_state 
#' @field prev_job_state 
#' @field route 
#' @field route_id 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
JobUpdateObject <- R6::R6Class(
  'JobUpdateObject',
  public = list(
    `changed_at_ms` = NULL,
    `job_id` = NULL,
    `job_state` = NULL,
    `prev_job_state` = NULL,
    `route` = NULL,
    `route_id` = NULL,
    initialize = function(`changed_at_ms`=NULL, `job_id`=NULL, `job_state`=NULL, `prev_job_state`=NULL, `route`=NULL, `route_id`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`changed_at_ms`)) {
        stopifnot(is.numeric(`changed_at_ms`), length(`changed_at_ms`) == 1)
        self$`changed_at_ms` <- `changed_at_ms`
      }
      if (!is.null(`job_id`)) {
        stopifnot(is.numeric(`job_id`), length(`job_id`) == 1)
        self$`job_id` <- `job_id`
      }
      if (!is.null(`job_state`)) {
        stopifnot(R6::is.R6(`job_state`))
        self$`job_state` <- `job_state`
      }
      if (!is.null(`prev_job_state`)) {
        stopifnot(R6::is.R6(`prev_job_state`))
        self$`prev_job_state` <- `prev_job_state`
      }
      if (!is.null(`route`)) {
        stopifnot(R6::is.R6(`route`))
        self$`route` <- `route`
      }
      if (!is.null(`route_id`)) {
        stopifnot(is.numeric(`route_id`), length(`route_id`) == 1)
        self$`route_id` <- `route_id`
      }
    },
    toJSON = function() {
      JobUpdateObjectObject <- list()
      if (!is.null(self$`changed_at_ms`)) {
        JobUpdateObjectObject[['changed_at_ms']] <-
          self$`changed_at_ms`
      }
      if (!is.null(self$`job_id`)) {
        JobUpdateObjectObject[['job_id']] <-
          self$`job_id`
      }
      if (!is.null(self$`job_state`)) {
        JobUpdateObjectObject[['job_state']] <-
          self$`job_state`$toJSON()
      }
      if (!is.null(self$`prev_job_state`)) {
        JobUpdateObjectObject[['prev_job_state']] <-
          self$`prev_job_state`$toJSON()
      }
      if (!is.null(self$`route`)) {
        JobUpdateObjectObject[['route']] <-
          self$`route`$toJSON()
      }
      if (!is.null(self$`route_id`)) {
        JobUpdateObjectObject[['route_id']] <-
          self$`route_id`
      }

      JobUpdateObjectObject
    },
    fromJSON = function(JobUpdateObjectJson) {
      JobUpdateObjectObject <- jsonlite::fromJSON(JobUpdateObjectJson)
      if (!is.null(JobUpdateObjectObject$`changed_at_ms`)) {
        self$`changed_at_ms` <- JobUpdateObjectObject$`changed_at_ms`
      }
      if (!is.null(JobUpdateObjectObject$`job_id`)) {
        self$`job_id` <- JobUpdateObjectObject$`job_id`
      }
      if (!is.null(JobUpdateObjectObject$`job_state`)) {
        job_stateObject <- JobStatus$new()
        job_stateObject$fromJSON(jsonlite::toJSON(JobUpdateObjectObject$job_state, auto_unbox = TRUE))
        self$`job_state` <- job_stateObject
      }
      if (!is.null(JobUpdateObjectObject$`prev_job_state`)) {
        prev_job_stateObject <- PrevJobStatus$new()
        prev_job_stateObject$fromJSON(jsonlite::toJSON(JobUpdateObjectObject$prev_job_state, auto_unbox = TRUE))
        self$`prev_job_state` <- prev_job_stateObject
      }
      if (!is.null(JobUpdateObjectObject$`route`)) {
        routeObject <- DispatchRoute$new()
        routeObject$fromJSON(jsonlite::toJSON(JobUpdateObjectObject$route, auto_unbox = TRUE))
        self$`route` <- routeObject
      }
      if (!is.null(JobUpdateObjectObject$`route_id`)) {
        self$`route_id` <- JobUpdateObjectObject$`route_id`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "changed_at_ms":
             %d,
           "job_id":
             %d,
           "job_state":
             %s,
           "prev_job_state":
             %s,
           "route":
             %s,
           "route_id":
             %d
        }',
        self$`changed_at_ms`,
        self$`job_id`,
        jsonlite::toJSON(self$`job_state`$toJSON(), auto_unbox=TRUE),
        jsonlite::toJSON(self$`prev_job_state`$toJSON(), auto_unbox=TRUE),
        jsonlite::toJSON(self$`route`$toJSON(), auto_unbox=TRUE),
        self$`route_id`
      )
    },
    fromJSONString = function(JobUpdateObjectJson) {
      JobUpdateObjectObject <- jsonlite::fromJSON(JobUpdateObjectJson)
      self$`changed_at_ms` <- JobUpdateObjectObject$`changed_at_ms`
      self$`job_id` <- JobUpdateObjectObject$`job_id`
      self$`job_state` <- JobStatus$new()$fromJSON(jsonlite::toJSON(JobUpdateObjectObject$job_state, auto_unbox = TRUE))
      self$`prev_job_state` <- PrevJobStatus$new()$fromJSON(jsonlite::toJSON(JobUpdateObjectObject$prev_job_state, auto_unbox = TRUE))
      self$`route` <- DispatchRoute$new()$fromJSON(jsonlite::toJSON(JobUpdateObjectObject$route, auto_unbox = TRUE))
      self$`route_id` <- JobUpdateObjectObject$`route_id`
      self
    }
  )
)
