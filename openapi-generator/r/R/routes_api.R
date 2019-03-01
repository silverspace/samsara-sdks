# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @title Routes operations
#' @description openapi.Routes
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' CreateDispatchRoute /fleet/dispatch/routes
#'
#'
#' CreateDriverDispatchRoute /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
#'
#'
#' CreateVehicleDispatchRoute /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
#'
#'
#' DeleteDispatchRouteById /fleet/dispatch/routes/{route_id:[0-9]+}/
#'
#'
#' FetchAllDispatchRoutes /fleet/dispatch/routes
#'
#'
#' FetchAllRouteJobUpdates /fleet/dispatch/routes/job_updates
#'
#'
#' GetDispatchRouteById /fleet/dispatch/routes/{route_id:[0-9]+}
#'
#'
#' GetDispatchRouteHistory /fleet/dispatch/routes/{route_id:[0-9]+}/history
#'
#'
#' GetDispatchRoutesByDriverId /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
#'
#'
#' GetDispatchRoutesByVehicleId /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
#'
#'
#' UpdateDispatchRouteById /fleet/dispatch/routes/{route_id:[0-9]+}/
#'
#' }
#'
#' @importFrom caTools base64encode
#' @export
RoutesApi <- R6::R6Class(
  'RoutesApi',
  public = list(
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    CreateDispatchRoute = function(access.token, create.dispatch.route.params, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`create.dispatch.route.params`)) {
        stop("Missing required parameter `create.dispatch.route.params`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`create.dispatch.route.params`)) {
        body <- `create.dispatch.route.params`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/dispatch/routes"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    CreateDriverDispatchRoute = function(access.token, driver.id, create.dispatch.route.params, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id`)) {
        stop("Missing required parameter `driver.id`.")
      }

      if (missing(`create.dispatch.route.params`)) {
        stop("Missing required parameter `create.dispatch.route.params`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`create.dispatch.route.params`)) {
        body <- `create.dispatch.route.params`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/drivers/{driver_id}/dispatch/routes"
      if (!missing(`driver.id`)) {
        urlPath <- gsub(paste0("\\{", "driver_id", "\\}"), `driver.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    CreateVehicleDispatchRoute = function(access.token, vehicle.id, create.dispatch.route.params, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`vehicle.id`)) {
        stop("Missing required parameter `vehicle.id`.")
      }

      if (missing(`create.dispatch.route.params`)) {
        stop("Missing required parameter `create.dispatch.route.params`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`create.dispatch.route.params`)) {
        body <- `create.dispatch.route.params`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/vehicles/{vehicle_id}/dispatch/routes"
      if (!missing(`vehicle.id`)) {
        urlPath <- gsub(paste0("\\{", "vehicle_id", "\\}"), `vehicle.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    DeleteDispatchRouteById = function(access.token, route.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`route.id`)) {
        stop("Missing required parameter `route.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/fleet/dispatch/routes/{route_id}"
      if (!missing(`route.id`)) {
        urlPath <- gsub(paste0("\\{", "route_id", "\\}"), `route.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "DELETE",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    FetchAllDispatchRoutes = function(access.token, group.id=NULL, end.time=NULL, duration=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['group_id'] <- group.id

      queryParams['end_time'] <- end.time

      queryParams['duration'] <- duration

      urlPath <- "/fleet/dispatch/routes"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    FetchAllRouteJobUpdates = function(access.token, group.id=NULL, sequence.id=NULL, include=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['group_id'] <- group.id

      queryParams['sequence_id'] <- sequence.id

      queryParams['include'] <- include

      urlPath <- "/fleet/dispatch/routes/job_updates"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        AllRouteJobUpdates$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDispatchRouteById = function(access.token, route.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`route.id`)) {
        stop("Missing required parameter `route.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/fleet/dispatch/routes/{route_id}"
      if (!missing(`route.id`)) {
        urlPath <- gsub(paste0("\\{", "route_id", "\\}"), `route.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDispatchRouteHistory = function(access.token, route.id, start.time=NULL, end.time=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`route.id`)) {
        stop("Missing required parameter `route.id`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['start_time'] <- start.time

      queryParams['end_time'] <- end.time

      urlPath <- "/fleet/dispatch/routes/{route_id}/history"
      if (!missing(`route.id`)) {
        urlPath <- gsub(paste0("\\{", "route_id", "\\}"), `route.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRouteHistory$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDispatchRoutesByDriverId = function(access.token, driver.id, end.time=NULL, duration=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id`)) {
        stop("Missing required parameter `driver.id`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['end_time'] <- end.time

      queryParams['duration'] <- duration

      urlPath <- "/fleet/drivers/{driver_id}/dispatch/routes"
      if (!missing(`driver.id`)) {
        urlPath <- gsub(paste0("\\{", "driver_id", "\\}"), `driver.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDispatchRoutesByVehicleId = function(access.token, vehicle.id, end.time=NULL, duration=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`vehicle.id`)) {
        stop("Missing required parameter `vehicle.id`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['end_time'] <- end.time

      queryParams['duration'] <- duration

      urlPath <- "/fleet/vehicles/{vehicle_id}/dispatch/routes"
      if (!missing(`vehicle.id`)) {
        urlPath <- gsub(paste0("\\{", "vehicle_id", "\\}"), `vehicle.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    UpdateDispatchRouteById = function(access.token, route.id, update.dispatch.route.params, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`route.id`)) {
        stop("Missing required parameter `route.id`.")
      }

      if (missing(`update.dispatch.route.params`)) {
        stop("Missing required parameter `update.dispatch.route.params`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`update.dispatch.route.params`)) {
        body <- `update.dispatch.route.params`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/dispatch/routes/{route_id}"
      if (!missing(`route.id`)) {
        urlPath <- gsub(paste0("\\{", "route_id", "\\}"), `route.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PUT",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DispatchRoute$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    }
  )
)
