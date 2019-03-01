# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech

#' @title Fleet operations
#' @description openapi.Fleet
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' AddFleetAddress /fleet/add_address
#'
#'
#' AddOrganizationAddresses /addresses
#'
#'
#' CreateDispatchRoute /fleet/dispatch/routes
#'
#'
#' CreateDriver /fleet/drivers/create
#'
#'
#' CreateDriverDispatchRoute /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
#'
#'
#' CreateDriverDocument /fleet/drivers/{driver_id:[0-9]+}/documents
#'
#'
#' CreateDvir /fleet/maintenance/dvirs
#'
#'
#' CreateVehicleDispatchRoute /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
#'
#'
#' DeactivateDriver /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
#'
#'
#' DeleteDispatchRouteById /fleet/dispatch/routes/{route_id:[0-9]+}/
#'
#'
#' DeleteOrganizationAddress /addresses/{addressId}
#'
#'
#' FetchAllDispatchRoutes /fleet/dispatch/routes
#'
#'
#' FetchAllRouteJobUpdates /fleet/dispatch/routes/job_updates
#'
#'
#' GetAllAssetCurrentLocations /fleet/assets/locations
#'
#'
#' GetAllAssets /fleet/assets
#'
#'
#' GetAllDeactivatedDrivers /fleet/drivers/inactive
#'
#'
#' GetAssetLocation /fleet/assets/{assetId:[0-9]+}/locations
#'
#'
#' GetAssetReefer /fleet/assets/{assetId:[0-9]+}/reefer
#'
#'
#' GetDeactivatedDriverById /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
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
#' GetDriverById /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
#'
#'
#' GetDriverDocumentTypesByOrgId /fleet/drivers/document_types
#'
#'
#' GetDriverDocumentsByOrgId /fleet/drivers/documents
#'
#'
#' GetDriverSafetyScore /fleet/drivers/{driverId:[0-9]+}/safety/score
#'
#'
#' GetDvirs /fleet/maintenance/dvirs
#'
#'
#' GetFleetDrivers /fleet/drivers
#'
#'
#' GetFleetDriversHosDailyLogs /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
#'
#'
#' GetFleetDriversSummary /fleet/drivers/summary
#'
#'
#' GetFleetHosAuthenticationLogs /fleet/hos_authentication_logs
#'
#'
#' GetFleetHosLogs /fleet/hos_logs
#'
#'
#' GetFleetHosLogsSummary /fleet/hos_logs_summary
#'
#'
#' GetFleetLocations /fleet/locations
#'
#'
#' GetFleetMaintenanceList /fleet/maintenance/list
#'
#'
#' GetFleetTrips /fleet/trips
#'
#'
#' GetFleetVehicle /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
#'
#'
#' GetOrganizationAddress /addresses/{addressId}
#'
#'
#' GetOrganizationAddresses /addresses
#'
#'
#' GetOrganizationContact /contacts/{contact_id}
#'
#'
#' GetVehicleHarshEvent /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
#'
#'
#' GetVehicleLocations /fleet/vehicles/{vehicle_id:[0-9]+}/locations
#'
#'
#' GetVehicleSafetyScore /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
#'
#'
#' GetVehicleStats /fleet/vehicles/stats
#'
#'
#' GetVehiclesLocations /fleet/vehicles/locations
#'
#'
#' ListContacts /contacts
#'
#'
#' ListFleet /fleet/list
#'
#'
#' PatchFleetVehicle /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
#'
#'
#' ReactivateDriverById /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
#'
#'
#' UpdateDispatchRouteById /fleet/dispatch/routes/{route_id:[0-9]+}/
#'
#'
#' UpdateOrganizationAddress /addresses/{addressId}
#'
#'
#' UpdateVehicles /fleet/set_data
#'
#' }
#'
#' @importFrom caTools base64encode
#' @export
FleetApi <- R6::R6Class(
  'FleetApi',
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
    AddFleetAddress = function(access.token, address.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`address.param`)) {
        stop("Missing required parameter `address.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`address.param`)) {
        body <- `address.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/add_address"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
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
    AddOrganizationAddresses = function(access.token, addresses, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`addresses`)) {
        stop("Missing required parameter `addresses`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`addresses`)) {
        body <- `addresses`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/addresses"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Address$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
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
    CreateDriver = function(access.token, create.driver.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`create.driver.param`)) {
        stop("Missing required parameter `create.driver.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`create.driver.param`)) {
        body <- `create.driver.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/drivers/create"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Driver$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
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
    CreateDriverDocument = function(access.token, driver.id, create.document.params, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id`)) {
        stop("Missing required parameter `driver.id`.")
      }

      if (missing(`create.document.params`)) {
        stop("Missing required parameter `create.document.params`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`create.document.params`)) {
        body <- `create.document.params`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/drivers/{driver_id}/documents"
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
        Document$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    CreateDvir = function(access.token, create.dvir.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`create.dvir.param`)) {
        stop("Missing required parameter `create.dvir.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`create.dvir.param`)) {
        body <- `create.dvir.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/maintenance/dvirs"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DvirBase$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
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
    DeactivateDriver = function(access.token, driver.id.or.external.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id.or.external.id`)) {
        stop("Missing required parameter `driver.id.or.external.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/fleet/drivers/{driver_id_or_external_id}"
      if (!missing(`driver.id.or.external.id`)) {
        urlPath <- gsub(paste0("\\{", "driver_id_or_external_id", "\\}"), `driver.id.or.external.id`, urlPath)
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
    DeleteOrganizationAddress = function(access.token, address.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`address.id`)) {
        stop("Missing required parameter `address.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/addresses/{addressId}"
      if (!missing(`address.id`)) {
        urlPath <- gsub(paste0("\\{", "addressId", "\\}"), `address.id`, urlPath)
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
    GetAllAssetCurrentLocations = function(access.token, group.id=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['group_id'] <- group.id

      urlPath <- "/fleet/assets/locations"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        InlineResponse2001$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetAllAssets = function(access.token, group.id=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['group_id'] <- group.id

      urlPath <- "/fleet/assets"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        InlineResponse200$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetAllDeactivatedDrivers = function(access.token, group.id=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['group_id'] <- group.id

      urlPath <- "/fleet/drivers/inactive"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Driver$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetAssetLocation = function(access.token, asset.id, start.ms, end.ms, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`asset.id`)) {
        stop("Missing required parameter `asset.id`.")
      }

      if (missing(`start.ms`)) {
        stop("Missing required parameter `start.ms`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startMs'] <- start.ms

      queryParams['endMs'] <- end.ms

      urlPath <- "/fleet/assets/{asset_id}/locations"
      if (!missing(`asset.id`)) {
        urlPath <- gsub(paste0("\\{", "asset_id", "\\}"), `asset.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        object$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetAssetReefer = function(access.token, asset.id, start.ms, end.ms, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`asset.id`)) {
        stop("Missing required parameter `asset.id`.")
      }

      if (missing(`start.ms`)) {
        stop("Missing required parameter `start.ms`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startMs'] <- start.ms

      queryParams['endMs'] <- end.ms

      urlPath <- "/fleet/assets/{asset_id}/reefer"
      if (!missing(`asset.id`)) {
        urlPath <- gsub(paste0("\\{", "asset_id", "\\}"), `asset.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        AssetReeferResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDeactivatedDriverById = function(access.token, driver.id.or.external.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id.or.external.id`)) {
        stop("Missing required parameter `driver.id.or.external.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/fleet/drivers/inactive/{driver_id_or_external_id}"
      if (!missing(`driver.id.or.external.id`)) {
        urlPath <- gsub(paste0("\\{", "driver_id_or_external_id", "\\}"), `driver.id.or.external.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Driver$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
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
    GetDriverById = function(access.token, driver.id.or.external.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id.or.external.id`)) {
        stop("Missing required parameter `driver.id.or.external.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/fleet/drivers/{driver_id_or_external_id}"
      if (!missing(`driver.id.or.external.id`)) {
        urlPath <- gsub(paste0("\\{", "driver_id_or_external_id", "\\}"), `driver.id.or.external.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Driver$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDriverDocumentTypesByOrgId = function(...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      urlPath <- "/fleet/drivers/document_types"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DocumentType$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDriverDocumentsByOrgId = function(access.token, end.ms=NULL, duration.ms=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['endMs'] <- end.ms

      queryParams['durationMs'] <- duration.ms

      urlPath <- "/fleet/drivers/documents"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Document$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDriverSafetyScore = function(driver.id, access.token, start.ms, end.ms, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`driver.id`)) {
        stop("Missing required parameter `driver.id`.")
      }

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`start.ms`)) {
        stop("Missing required parameter `start.ms`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startMs'] <- start.ms

      queryParams['endMs'] <- end.ms

      urlPath <- "/fleet/drivers/{driverId}/safety/score"
      if (!missing(`driver.id`)) {
        urlPath <- gsub(paste0("\\{", "driverId", "\\}"), `driver.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DriverSafetyScoreResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetDvirs = function(access.token, end.ms, duration.ms, group.id=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      if (missing(`duration.ms`)) {
        stop("Missing required parameter `duration.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['end_ms'] <- end.ms

      queryParams['duration_ms'] <- duration.ms

      queryParams['group_id'] <- group.id

      urlPath <- "/fleet/maintenance/dvirs"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DvirListResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetDrivers = function(access.token, group.drivers.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`group.drivers.param`)) {
        stop("Missing required parameter `group.drivers.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`group.drivers.param`)) {
        body <- `group.drivers.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/drivers"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DriversResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetDriversHosDailyLogs = function(access.token, driver.id, hos.logs.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id`)) {
        stop("Missing required parameter `driver.id`.")
      }

      if (missing(`hos.logs.param`)) {
        stop("Missing required parameter `hos.logs.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`hos.logs.param`)) {
        body <- `hos.logs.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/drivers/{driver_id}/hos_daily_logs"
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
        DriverDailyLogResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetDriversSummary = function(access.token, drivers.summary.param, snap.to.day.bounds=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`drivers.summary.param`)) {
        stop("Missing required parameter `drivers.summary.param`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['snap_to_day_bounds'] <- snap.to.day.bounds

      if (!missing(`drivers.summary.param`)) {
        body <- `drivers.summary.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/drivers/summary"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        DriversSummaryResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetHosAuthenticationLogs = function(access.token, hos.authentication.logs.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`hos.authentication.logs.param`)) {
        stop("Missing required parameter `hos.authentication.logs.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`hos.authentication.logs.param`)) {
        body <- `hos.authentication.logs.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/hos_authentication_logs"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        HosAuthenticationLogsResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetHosLogs = function(access.token, hos.logs.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`hos.logs.param`)) {
        stop("Missing required parameter `hos.logs.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`hos.logs.param`)) {
        body <- `hos.logs.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/hos_logs"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        HosLogsResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetHosLogsSummary = function(access.token, hos.logs.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`hos.logs.param`)) {
        stop("Missing required parameter `hos.logs.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`hos.logs.param`)) {
        body <- `hos.logs.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/hos_logs_summary"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        HosLogsSummaryResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetLocations = function(access.token, group.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`group.param`)) {
        stop("Missing required parameter `group.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`group.param`)) {
        body <- `group.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/locations"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        InlineResponse2003$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetMaintenanceList = function(access.token, group.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`group.param`)) {
        stop("Missing required parameter `group.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`group.param`)) {
        body <- `group.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/maintenance/list"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        InlineResponse2004$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetTrips = function(access.token, trips.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`trips.param`)) {
        stop("Missing required parameter `trips.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`trips.param`)) {
        body <- `trips.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/trips"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        TripResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetFleetVehicle = function(access.token, vehicle.id.or.external.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`vehicle.id.or.external.id`)) {
        stop("Missing required parameter `vehicle.id.or.external.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/fleet/vehicles/{vehicle_id_or_external_id}"
      if (!missing(`vehicle.id.or.external.id`)) {
        urlPath <- gsub(paste0("\\{", "vehicle_id_or_external_id", "\\}"), `vehicle.id.or.external.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        FleetVehicleResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetOrganizationAddress = function(access.token, address.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`address.id`)) {
        stop("Missing required parameter `address.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/addresses/{addressId}"
      if (!missing(`address.id`)) {
        urlPath <- gsub(paste0("\\{", "addressId", "\\}"), `address.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Address$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetOrganizationAddresses = function(access.token, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/addresses"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Address$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetOrganizationContact = function(access.token, contact.id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`contact.id`)) {
        stop("Missing required parameter `contact.id`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/contacts/{contact_id}"
      if (!missing(`contact.id`)) {
        urlPath <- gsub(paste0("\\{", "contact_id", "\\}"), `contact.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Contact$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetVehicleHarshEvent = function(vehicle.id, access.token, timestamp, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`vehicle.id`)) {
        stop("Missing required parameter `vehicle.id`.")
      }

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`timestamp`)) {
        stop("Missing required parameter `timestamp`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['timestamp'] <- timestamp

      urlPath <- "/fleet/vehicles/{vehicleId}/safety/harsh_event"
      if (!missing(`vehicle.id`)) {
        urlPath <- gsub(paste0("\\{", "vehicleId", "\\}"), `vehicle.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        VehicleHarshEventResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetVehicleLocations = function(access.token, vehicle.id, start.ms, end.ms, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`vehicle.id`)) {
        stop("Missing required parameter `vehicle.id`.")
      }

      if (missing(`start.ms`)) {
        stop("Missing required parameter `start.ms`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startMs'] <- start.ms

      queryParams['endMs'] <- end.ms

      urlPath <- "/fleet/vehicles/{vehicle_id}/locations"
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
        FleetVehicleLocation$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetVehicleSafetyScore = function(vehicle.id, access.token, start.ms, end.ms, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`vehicle.id`)) {
        stop("Missing required parameter `vehicle.id`.")
      }

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`start.ms`)) {
        stop("Missing required parameter `start.ms`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startMs'] <- start.ms

      queryParams['endMs'] <- end.ms

      urlPath <- "/fleet/vehicles/{vehicleId}/safety/score"
      if (!missing(`vehicle.id`)) {
        urlPath <- gsub(paste0("\\{", "vehicleId", "\\}"), `vehicle.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        VehicleSafetyScoreResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetVehicleStats = function(access.token, start.ms, end.ms, series=NULL, tag.ids=NULL, starting.after=NULL, ending.before=NULL, limit=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`start.ms`)) {
        stop("Missing required parameter `start.ms`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startMs'] <- start.ms

      queryParams['endMs'] <- end.ms

      queryParams['series'] <- series

      queryParams['tagIds'] <- tag.ids

      queryParams['startingAfter'] <- starting.after

      queryParams['endingBefore'] <- ending.before

      queryParams['limit'] <- limit

      urlPath <- "/fleet/vehicles/stats"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        InlineResponse2005$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    GetVehiclesLocations = function(access.token, start.ms, end.ms, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`start.ms`)) {
        stop("Missing required parameter `start.ms`.")
      }

      if (missing(`end.ms`)) {
        stop("Missing required parameter `end.ms`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startMs'] <- start.ms

      queryParams['endMs'] <- end.ms

      urlPath <- "/fleet/vehicles/locations"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        object$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    ListContacts = function(access.token, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      queryParams['access_token'] <- access.token

      urlPath <- "/contacts"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Contact$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    ListFleet = function(access.token, group.param, starting.after=NULL, ending.before=NULL, limit=NULL, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`group.param`)) {
        stop("Missing required parameter `group.param`.")
      }

      queryParams['access_token'] <- access.token

      queryParams['startingAfter'] <- starting.after

      queryParams['endingBefore'] <- ending.before

      queryParams['limit'] <- limit

      if (!missing(`group.param`)) {
        body <- `group.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/list"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        InlineResponse2002$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    PatchFleetVehicle = function(access.token, vehicle.id.or.external.id, data, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`vehicle.id.or.external.id`)) {
        stop("Missing required parameter `vehicle.id.or.external.id`.")
      }

      if (missing(`data`)) {
        stop("Missing required parameter `data`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`data`)) {
        body <- `data`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/vehicles/{vehicle_id_or_external_id}"
      if (!missing(`vehicle.id.or.external.id`)) {
        urlPath <- gsub(paste0("\\{", "vehicle_id_or_external_id", "\\}"), `vehicle.id.or.external.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PATCH",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        FleetVehicleResponse$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        ApiResponse$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        ApiResponse$new("API server error", resp)
      }

    },
    ReactivateDriverById = function(access.token, driver.id.or.external.id, reactivate.driver.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`driver.id.or.external.id`)) {
        stop("Missing required parameter `driver.id.or.external.id`.")
      }

      if (missing(`reactivate.driver.param`)) {
        stop("Missing required parameter `reactivate.driver.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`reactivate.driver.param`)) {
        body <- `reactivate.driver.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/drivers/inactive/{driver_id_or_external_id}"
      if (!missing(`driver.id.or.external.id`)) {
        urlPath <- gsub(paste0("\\{", "driver_id_or_external_id", "\\}"), `driver.id.or.external.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PUT",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)

      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        Driver$new()$fromJSONString(httr::content(resp, "text", encoding = "UTF-8"))
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

    },
    UpdateOrganizationAddress = function(access.token, address.id, address, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`address.id`)) {
        stop("Missing required parameter `address.id`.")
      }

      if (missing(`address`)) {
        stop("Missing required parameter `address`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`address`)) {
        body <- `address`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/addresses/{addressId}"
      if (!missing(`address.id`)) {
        urlPath <- gsub(paste0("\\{", "addressId", "\\}"), `address.id`, urlPath)
      }


      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PATCH",
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
    UpdateVehicles = function(access.token, vehicle.update.param, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- c()

      if (missing(`access.token`)) {
        stop("Missing required parameter `access.token`.")
      }

      if (missing(`vehicle.update.param`)) {
        stop("Missing required parameter `vehicle.update.param`.")
      }

      queryParams['access_token'] <- access.token

      if (!missing(`vehicle.update.param`)) {
        body <- `vehicle.update.param`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/fleet/set_data"

      resp <- self$apiClient$CallApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
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

    }
  )
)
