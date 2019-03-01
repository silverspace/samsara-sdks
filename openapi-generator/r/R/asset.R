# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' Asset Class
#'
#' @field assetSerialNumber 
#' @field cable 
#' @field engineHours 
#' @field id 
#' @field name 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Asset <- R6::R6Class(
  'Asset',
  public = list(
    `assetSerialNumber` = NULL,
    `cable` = NULL,
    `engineHours` = NULL,
    `id` = NULL,
    `name` = NULL,
    initialize = function(`id`, `assetSerialNumber`=NULL, `cable`=NULL, `engineHours`=NULL, `name`=NULL, ...){
      local.optional.var <- list(...)
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!is.null(`assetSerialNumber`)) {
        stopifnot(is.character(`assetSerialNumber`), length(`assetSerialNumber`) == 1)
        self$`assetSerialNumber` <- `assetSerialNumber`
      }
      if (!is.null(`cable`)) {
        stopifnot(is.vector(`cable`), length(`cable`) != 0)
        sapply(`cable`, function(x) stopifnot(R6::is.R6(x)))
        self$`cable` <- `cable`
      }
      if (!is.null(`engineHours`)) {
        stopifnot(is.numeric(`engineHours`), length(`engineHours`) == 1)
        self$`engineHours` <- `engineHours`
      }
      if (!is.null(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
    },
    toJSON = function() {
      AssetObject <- list()
      if (!is.null(self$`assetSerialNumber`)) {
        AssetObject[['assetSerialNumber']] <-
          self$`assetSerialNumber`
      }
      if (!is.null(self$`cable`)) {
        AssetObject[['cable']] <-
          sapply(self$`cable`, function(x) x$toJSON())
      }
      if (!is.null(self$`engineHours`)) {
        AssetObject[['engineHours']] <-
          self$`engineHours`
      }
      if (!is.null(self$`id`)) {
        AssetObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        AssetObject[['name']] <-
          self$`name`
      }

      AssetObject
    },
    fromJSON = function(AssetJson) {
      AssetObject <- jsonlite::fromJSON(AssetJson)
      if (!is.null(AssetObject$`assetSerialNumber`)) {
        self$`assetSerialNumber` <- AssetObject$`assetSerialNumber`
      }
      if (!is.null(AssetObject$`cable`)) {
        self$`cable` <- sapply(AssetObject$`cable`, function(x) {
          cableObject <- AssetCable$new()
          cableObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          cableObject
        })
      }
      if (!is.null(AssetObject$`engineHours`)) {
        self$`engineHours` <- AssetObject$`engineHours`
      }
      if (!is.null(AssetObject$`id`)) {
        self$`id` <- AssetObject$`id`
      }
      if (!is.null(AssetObject$`name`)) {
        self$`name` <- AssetObject$`name`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "assetSerialNumber":
             "%s",
           "cable":
             [%s],
           "engineHours":
             %d,
           "id":
             %d,
           "name":
             "%s"
        }',
        self$`assetSerialNumber`,
        paste(unlist(lapply(self$`cable`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        self$`engineHours`,
        self$`id`,
        self$`name`
      )
    },
    fromJSONString = function(AssetJson) {
      AssetObject <- jsonlite::fromJSON(AssetJson)
      self$`assetSerialNumber` <- AssetObject$`assetSerialNumber`
      data.frame <- AssetObject$`cable`
      self$`cable` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          cable.node <- AssetCable$new()
          cable.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`cable`[[row]] <- cable.node
      }
      self$`engineHours` <- AssetObject$`engineHours`
      self$`id` <- AssetObject$`id`
      self$`name` <- AssetObject$`name`
      self
    }
  )
)
