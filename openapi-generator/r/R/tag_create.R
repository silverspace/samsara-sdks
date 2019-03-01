# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' TagCreate Class
#'
#' @field assets 
#' @field drivers 
#' @field machines 
#' @field name 
#' @field parentTagId 
#' @field sensors 
#' @field vehicles 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TagCreate <- R6::R6Class(
  'TagCreate',
  public = list(
    `assets` = NULL,
    `drivers` = NULL,
    `machines` = NULL,
    `name` = NULL,
    `parentTagId` = NULL,
    `sensors` = NULL,
    `vehicles` = NULL,
    initialize = function(`name`, `assets`=NULL, `drivers`=NULL, `machines`=NULL, `parentTagId`=NULL, `sensors`=NULL, `vehicles`=NULL, ...){
      local.optional.var <- list(...)
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!is.null(`assets`)) {
        stopifnot(is.vector(`assets`), length(`assets`) != 0)
        sapply(`assets`, function(x) stopifnot(R6::is.R6(x)))
        self$`assets` <- `assets`
      }
      if (!is.null(`drivers`)) {
        stopifnot(is.vector(`drivers`), length(`drivers`) != 0)
        sapply(`drivers`, function(x) stopifnot(R6::is.R6(x)))
        self$`drivers` <- `drivers`
      }
      if (!is.null(`machines`)) {
        stopifnot(is.vector(`machines`), length(`machines`) != 0)
        sapply(`machines`, function(x) stopifnot(R6::is.R6(x)))
        self$`machines` <- `machines`
      }
      if (!is.null(`parentTagId`)) {
        stopifnot(is.numeric(`parentTagId`), length(`parentTagId`) == 1)
        self$`parentTagId` <- `parentTagId`
      }
      if (!is.null(`sensors`)) {
        stopifnot(is.vector(`sensors`), length(`sensors`) != 0)
        sapply(`sensors`, function(x) stopifnot(R6::is.R6(x)))
        self$`sensors` <- `sensors`
      }
      if (!is.null(`vehicles`)) {
        stopifnot(is.vector(`vehicles`), length(`vehicles`) != 0)
        sapply(`vehicles`, function(x) stopifnot(R6::is.R6(x)))
        self$`vehicles` <- `vehicles`
      }
    },
    toJSON = function() {
      TagCreateObject <- list()
      if (!is.null(self$`assets`)) {
        TagCreateObject[['assets']] <-
          sapply(self$`assets`, function(x) x$toJSON())
      }
      if (!is.null(self$`drivers`)) {
        TagCreateObject[['drivers']] <-
          sapply(self$`drivers`, function(x) x$toJSON())
      }
      if (!is.null(self$`machines`)) {
        TagCreateObject[['machines']] <-
          sapply(self$`machines`, function(x) x$toJSON())
      }
      if (!is.null(self$`name`)) {
        TagCreateObject[['name']] <-
          self$`name`
      }
      if (!is.null(self$`parentTagId`)) {
        TagCreateObject[['parentTagId']] <-
          self$`parentTagId`
      }
      if (!is.null(self$`sensors`)) {
        TagCreateObject[['sensors']] <-
          sapply(self$`sensors`, function(x) x$toJSON())
      }
      if (!is.null(self$`vehicles`)) {
        TagCreateObject[['vehicles']] <-
          sapply(self$`vehicles`, function(x) x$toJSON())
      }

      TagCreateObject
    },
    fromJSON = function(TagCreateJson) {
      TagCreateObject <- jsonlite::fromJSON(TagCreateJson)
      if (!is.null(TagCreateObject$`assets`)) {
        self$`assets` <- sapply(TagCreateObject$`assets`, function(x) {
          assetsObject <- TaggedAssetBase$new()
          assetsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          assetsObject
        })
      }
      if (!is.null(TagCreateObject$`drivers`)) {
        self$`drivers` <- sapply(TagCreateObject$`drivers`, function(x) {
          driversObject <- TaggedDriverBase$new()
          driversObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          driversObject
        })
      }
      if (!is.null(TagCreateObject$`machines`)) {
        self$`machines` <- sapply(TagCreateObject$`machines`, function(x) {
          machinesObject <- TaggedMachineBase$new()
          machinesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          machinesObject
        })
      }
      if (!is.null(TagCreateObject$`name`)) {
        self$`name` <- TagCreateObject$`name`
      }
      if (!is.null(TagCreateObject$`parentTagId`)) {
        self$`parentTagId` <- TagCreateObject$`parentTagId`
      }
      if (!is.null(TagCreateObject$`sensors`)) {
        self$`sensors` <- sapply(TagCreateObject$`sensors`, function(x) {
          sensorsObject <- TaggedSensorBase$new()
          sensorsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          sensorsObject
        })
      }
      if (!is.null(TagCreateObject$`vehicles`)) {
        self$`vehicles` <- sapply(TagCreateObject$`vehicles`, function(x) {
          vehiclesObject <- TaggedVehicleBase$new()
          vehiclesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          vehiclesObject
        })
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "assets":
             [%s],
           "drivers":
             [%s],
           "machines":
             [%s],
           "name":
             "%s",
           "parentTagId":
             %d,
           "sensors":
             [%s],
           "vehicles":
             [%s]
        }',
        paste(unlist(lapply(self$`assets`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`drivers`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`machines`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        self$`name`,
        self$`parentTagId`,
        paste(unlist(lapply(self$`sensors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        paste(unlist(lapply(self$`vehicles`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=",")
      )
    },
    fromJSONString = function(TagCreateJson) {
      TagCreateObject <- jsonlite::fromJSON(TagCreateJson)
      data.frame <- TagCreateObject$`assets`
      self$`assets` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          assets.node <- TaggedAssetBase$new()
          assets.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`assets`[[row]] <- assets.node
      }
      data.frame <- TagCreateObject$`drivers`
      self$`drivers` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          drivers.node <- TaggedDriverBase$new()
          drivers.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`drivers`[[row]] <- drivers.node
      }
      data.frame <- TagCreateObject$`machines`
      self$`machines` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          machines.node <- TaggedMachineBase$new()
          machines.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`machines`[[row]] <- machines.node
      }
      self$`name` <- TagCreateObject$`name`
      self$`parentTagId` <- TagCreateObject$`parentTagId`
      data.frame <- TagCreateObject$`sensors`
      self$`sensors` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          sensors.node <- TaggedSensorBase$new()
          sensors.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`sensors`[[row]] <- sensors.node
      }
      data.frame <- TagCreateObject$`vehicles`
      self$`vehicles` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          vehicles.node <- TaggedVehicleBase$new()
          vehicles.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`vehicles`[[row]] <- vehicles.node
      }
      self
    }
  )
)
