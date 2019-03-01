# Samsara API
#
# # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' DvirBase Class
#'
#' @field authorSignature 
#' @field defectsCorrected 
#' @field defectsNeedNotBeCorrected 
#' @field id 
#' @field inspectionType 
#' @field mechanicNotes 
#' @field mechanicOrAgentSignature 
#' @field nextDriverSignature 
#' @field odometerMiles 
#' @field timeMs 
#' @field trailerDefects 
#' @field trailerId 
#' @field trailerName 
#' @field vehicle 
#' @field vehicleCondition 
#' @field vehicleDefects 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DvirBase <- R6::R6Class(
  'DvirBase',
  public = list(
    `authorSignature` = NULL,
    `defectsCorrected` = NULL,
    `defectsNeedNotBeCorrected` = NULL,
    `id` = NULL,
    `inspectionType` = NULL,
    `mechanicNotes` = NULL,
    `mechanicOrAgentSignature` = NULL,
    `nextDriverSignature` = NULL,
    `odometerMiles` = NULL,
    `timeMs` = NULL,
    `trailerDefects` = NULL,
    `trailerId` = NULL,
    `trailerName` = NULL,
    `vehicle` = NULL,
    `vehicleCondition` = NULL,
    `vehicleDefects` = NULL,
    initialize = function(`authorSignature`=NULL, `defectsCorrected`=NULL, `defectsNeedNotBeCorrected`=NULL, `id`=NULL, `inspectionType`=NULL, `mechanicNotes`=NULL, `mechanicOrAgentSignature`=NULL, `nextDriverSignature`=NULL, `odometerMiles`=NULL, `timeMs`=NULL, `trailerDefects`=NULL, `trailerId`=NULL, `trailerName`=NULL, `vehicle`=NULL, `vehicleCondition`=NULL, `vehicleDefects`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`authorSignature`)) {
        stopifnot(R6::is.R6(`authorSignature`))
        self$`authorSignature` <- `authorSignature`
      }
      if (!is.null(`defectsCorrected`)) {
        self$`defectsCorrected` <- `defectsCorrected`
      }
      if (!is.null(`defectsNeedNotBeCorrected`)) {
        self$`defectsNeedNotBeCorrected` <- `defectsNeedNotBeCorrected`
      }
      if (!is.null(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!is.null(`inspectionType`)) {
        stopifnot(is.character(`inspectionType`), length(`inspectionType`) == 1)
        self$`inspectionType` <- `inspectionType`
      }
      if (!is.null(`mechanicNotes`)) {
        stopifnot(is.character(`mechanicNotes`), length(`mechanicNotes`) == 1)
        self$`mechanicNotes` <- `mechanicNotes`
      }
      if (!is.null(`mechanicOrAgentSignature`)) {
        stopifnot(R6::is.R6(`mechanicOrAgentSignature`))
        self$`mechanicOrAgentSignature` <- `mechanicOrAgentSignature`
      }
      if (!is.null(`nextDriverSignature`)) {
        stopifnot(R6::is.R6(`nextDriverSignature`))
        self$`nextDriverSignature` <- `nextDriverSignature`
      }
      if (!is.null(`odometerMiles`)) {
        stopifnot(is.numeric(`odometerMiles`), length(`odometerMiles`) == 1)
        self$`odometerMiles` <- `odometerMiles`
      }
      if (!is.null(`timeMs`)) {
        stopifnot(is.numeric(`timeMs`), length(`timeMs`) == 1)
        self$`timeMs` <- `timeMs`
      }
      if (!is.null(`trailerDefects`)) {
        stopifnot(is.vector(`trailerDefects`), length(`trailerDefects`) != 0)
        sapply(`trailerDefects`, function(x) stopifnot(R6::is.R6(x)))
        self$`trailerDefects` <- `trailerDefects`
      }
      if (!is.null(`trailerId`)) {
        stopifnot(is.numeric(`trailerId`), length(`trailerId`) == 1)
        self$`trailerId` <- `trailerId`
      }
      if (!is.null(`trailerName`)) {
        stopifnot(is.character(`trailerName`), length(`trailerName`) == 1)
        self$`trailerName` <- `trailerName`
      }
      if (!is.null(`vehicle`)) {
        stopifnot(R6::is.R6(`vehicle`))
        self$`vehicle` <- `vehicle`
      }
      if (!is.null(`vehicleCondition`)) {
        stopifnot(is.character(`vehicleCondition`), length(`vehicleCondition`) == 1)
        self$`vehicleCondition` <- `vehicleCondition`
      }
      if (!is.null(`vehicleDefects`)) {
        stopifnot(is.vector(`vehicleDefects`), length(`vehicleDefects`) != 0)
        sapply(`vehicleDefects`, function(x) stopifnot(R6::is.R6(x)))
        self$`vehicleDefects` <- `vehicleDefects`
      }
    },
    toJSON = function() {
      DvirBaseObject <- list()
      if (!is.null(self$`authorSignature`)) {
        DvirBaseObject[['authorSignature']] <-
          self$`authorSignature`$toJSON()
      }
      if (!is.null(self$`defectsCorrected`)) {
        DvirBaseObject[['defectsCorrected']] <-
          self$`defectsCorrected`
      }
      if (!is.null(self$`defectsNeedNotBeCorrected`)) {
        DvirBaseObject[['defectsNeedNotBeCorrected']] <-
          self$`defectsNeedNotBeCorrected`
      }
      if (!is.null(self$`id`)) {
        DvirBaseObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`inspectionType`)) {
        DvirBaseObject[['inspectionType']] <-
          self$`inspectionType`
      }
      if (!is.null(self$`mechanicNotes`)) {
        DvirBaseObject[['mechanicNotes']] <-
          self$`mechanicNotes`
      }
      if (!is.null(self$`mechanicOrAgentSignature`)) {
        DvirBaseObject[['mechanicOrAgentSignature']] <-
          self$`mechanicOrAgentSignature`$toJSON()
      }
      if (!is.null(self$`nextDriverSignature`)) {
        DvirBaseObject[['nextDriverSignature']] <-
          self$`nextDriverSignature`$toJSON()
      }
      if (!is.null(self$`odometerMiles`)) {
        DvirBaseObject[['odometerMiles']] <-
          self$`odometerMiles`
      }
      if (!is.null(self$`timeMs`)) {
        DvirBaseObject[['timeMs']] <-
          self$`timeMs`
      }
      if (!is.null(self$`trailerDefects`)) {
        DvirBaseObject[['trailerDefects']] <-
          sapply(self$`trailerDefects`, function(x) x$toJSON())
      }
      if (!is.null(self$`trailerId`)) {
        DvirBaseObject[['trailerId']] <-
          self$`trailerId`
      }
      if (!is.null(self$`trailerName`)) {
        DvirBaseObject[['trailerName']] <-
          self$`trailerName`
      }
      if (!is.null(self$`vehicle`)) {
        DvirBaseObject[['vehicle']] <-
          self$`vehicle`$toJSON()
      }
      if (!is.null(self$`vehicleCondition`)) {
        DvirBaseObject[['vehicleCondition']] <-
          self$`vehicleCondition`
      }
      if (!is.null(self$`vehicleDefects`)) {
        DvirBaseObject[['vehicleDefects']] <-
          sapply(self$`vehicleDefects`, function(x) x$toJSON())
      }

      DvirBaseObject
    },
    fromJSON = function(DvirBaseJson) {
      DvirBaseObject <- jsonlite::fromJSON(DvirBaseJson)
      if (!is.null(DvirBaseObject$`authorSignature`)) {
        authorSignatureObject <- DvirBaseAuthorSignature$new()
        authorSignatureObject$fromJSON(jsonlite::toJSON(DvirBaseObject$authorSignature, auto_unbox = TRUE))
        self$`authorSignature` <- authorSignatureObject
      }
      if (!is.null(DvirBaseObject$`defectsCorrected`)) {
        self$`defectsCorrected` <- DvirBaseObject$`defectsCorrected`
      }
      if (!is.null(DvirBaseObject$`defectsNeedNotBeCorrected`)) {
        self$`defectsNeedNotBeCorrected` <- DvirBaseObject$`defectsNeedNotBeCorrected`
      }
      if (!is.null(DvirBaseObject$`id`)) {
        self$`id` <- DvirBaseObject$`id`
      }
      if (!is.null(DvirBaseObject$`inspectionType`)) {
        self$`inspectionType` <- DvirBaseObject$`inspectionType`
      }
      if (!is.null(DvirBaseObject$`mechanicNotes`)) {
        self$`mechanicNotes` <- DvirBaseObject$`mechanicNotes`
      }
      if (!is.null(DvirBaseObject$`mechanicOrAgentSignature`)) {
        mechanicOrAgentSignatureObject <- DvirBaseMechanicOrAgentSignature$new()
        mechanicOrAgentSignatureObject$fromJSON(jsonlite::toJSON(DvirBaseObject$mechanicOrAgentSignature, auto_unbox = TRUE))
        self$`mechanicOrAgentSignature` <- mechanicOrAgentSignatureObject
      }
      if (!is.null(DvirBaseObject$`nextDriverSignature`)) {
        nextDriverSignatureObject <- DvirBaseNextDriverSignature$new()
        nextDriverSignatureObject$fromJSON(jsonlite::toJSON(DvirBaseObject$nextDriverSignature, auto_unbox = TRUE))
        self$`nextDriverSignature` <- nextDriverSignatureObject
      }
      if (!is.null(DvirBaseObject$`odometerMiles`)) {
        self$`odometerMiles` <- DvirBaseObject$`odometerMiles`
      }
      if (!is.null(DvirBaseObject$`timeMs`)) {
        self$`timeMs` <- DvirBaseObject$`timeMs`
      }
      if (!is.null(DvirBaseObject$`trailerDefects`)) {
        self$`trailerDefects` <- sapply(DvirBaseObject$`trailerDefects`, function(x) {
          trailerDefectsObject <- DvirBaseTrailerDefects$new()
          trailerDefectsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          trailerDefectsObject
        })
      }
      if (!is.null(DvirBaseObject$`trailerId`)) {
        self$`trailerId` <- DvirBaseObject$`trailerId`
      }
      if (!is.null(DvirBaseObject$`trailerName`)) {
        self$`trailerName` <- DvirBaseObject$`trailerName`
      }
      if (!is.null(DvirBaseObject$`vehicle`)) {
        vehicleObject <- DvirBaseVehicle$new()
        vehicleObject$fromJSON(jsonlite::toJSON(DvirBaseObject$vehicle, auto_unbox = TRUE))
        self$`vehicle` <- vehicleObject
      }
      if (!is.null(DvirBaseObject$`vehicleCondition`)) {
        self$`vehicleCondition` <- DvirBaseObject$`vehicleCondition`
      }
      if (!is.null(DvirBaseObject$`vehicleDefects`)) {
        self$`vehicleDefects` <- sapply(DvirBaseObject$`vehicleDefects`, function(x) {
          vehicleDefectsObject <- DvirBaseTrailerDefects$new()
          vehicleDefectsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          vehicleDefectsObject
        })
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "authorSignature":
             %s,
           "defectsCorrected":
             "%s",
           "defectsNeedNotBeCorrected":
             "%s",
           "id":
             %d,
           "inspectionType":
             "%s",
           "mechanicNotes":
             "%s",
           "mechanicOrAgentSignature":
             %s,
           "nextDriverSignature":
             %s,
           "odometerMiles":
             %d,
           "timeMs":
             %d,
           "trailerDefects":
             [%s],
           "trailerId":
             %d,
           "trailerName":
             "%s",
           "vehicle":
             %s,
           "vehicleCondition":
             "%s",
           "vehicleDefects":
             [%s]
        }',
        jsonlite::toJSON(self$`authorSignature`$toJSON(), auto_unbox=TRUE),
        self$`defectsCorrected`,
        self$`defectsNeedNotBeCorrected`,
        self$`id`,
        self$`inspectionType`,
        self$`mechanicNotes`,
        jsonlite::toJSON(self$`mechanicOrAgentSignature`$toJSON(), auto_unbox=TRUE),
        jsonlite::toJSON(self$`nextDriverSignature`$toJSON(), auto_unbox=TRUE),
        self$`odometerMiles`,
        self$`timeMs`,
        paste(unlist(lapply(self$`trailerDefects`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=","),
        self$`trailerId`,
        self$`trailerName`,
        jsonlite::toJSON(self$`vehicle`$toJSON(), auto_unbox=TRUE),
        self$`vehicleCondition`,
        paste(unlist(lapply(self$`vehicleDefects`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE))), collapse=",")
      )
    },
    fromJSONString = function(DvirBaseJson) {
      DvirBaseObject <- jsonlite::fromJSON(DvirBaseJson)
      self$`authorSignature` <- DvirBaseAuthorSignature$new()$fromJSON(jsonlite::toJSON(DvirBaseObject$authorSignature, auto_unbox = TRUE))
      self$`defectsCorrected` <- DvirBaseObject$`defectsCorrected`
      self$`defectsNeedNotBeCorrected` <- DvirBaseObject$`defectsNeedNotBeCorrected`
      self$`id` <- DvirBaseObject$`id`
      self$`inspectionType` <- DvirBaseObject$`inspectionType`
      self$`mechanicNotes` <- DvirBaseObject$`mechanicNotes`
      self$`mechanicOrAgentSignature` <- DvirBaseMechanicOrAgentSignature$new()$fromJSON(jsonlite::toJSON(DvirBaseObject$mechanicOrAgentSignature, auto_unbox = TRUE))
      self$`nextDriverSignature` <- DvirBaseNextDriverSignature$new()$fromJSON(jsonlite::toJSON(DvirBaseObject$nextDriverSignature, auto_unbox = TRUE))
      self$`odometerMiles` <- DvirBaseObject$`odometerMiles`
      self$`timeMs` <- DvirBaseObject$`timeMs`
      data.frame <- DvirBaseObject$`trailerDefects`
      self$`trailerDefects` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          trailerDefects.node <- DvirBaseTrailerDefects$new()
          trailerDefects.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`trailerDefects`[[row]] <- trailerDefects.node
      }
      self$`trailerId` <- DvirBaseObject$`trailerId`
      self$`trailerName` <- DvirBaseObject$`trailerName`
      self$`vehicle` <- DvirBaseVehicle$new()$fromJSON(jsonlite::toJSON(DvirBaseObject$vehicle, auto_unbox = TRUE))
      self$`vehicleCondition` <- DvirBaseObject$`vehicleCondition`
      data.frame <- DvirBaseObject$`vehicleDefects`
      self$`vehicleDefects` <- vector("list", length = nrow(data.frame))
      for (row in 1:nrow(data.frame)) {
          vehicleDefects.node <- DvirBaseTrailerDefects$new()
          vehicleDefects.node$fromJSON(jsonlite::toJSON(data.frame[row,,drop = TRUE], auto_unbox = TRUE))
          self$`vehicleDefects`[[row]] <- vehicleDefects.node
      }
      self
    }
  )
)
