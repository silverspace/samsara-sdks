{-
   Samsara API
   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI spec version: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Request.Routes exposing (createDispatchRoute, createDriverDispatchRoute, createVehicleDispatchRoute, deleteDispatchRouteById, fetchAllDispatchRoutes, fetchAllRouteJobUpdates, getDispatchRouteById, getDispatchRouteHistory, getDispatchRoutesByDriverId, getDispatchRoutesByVehicleId, updateDispatchRouteById)

import Data.AllRouteJobUpdates as AllRouteJobUpdates exposing (AllRouteJobUpdates)
import Data.DispatchRouteCreate as DispatchRouteCreate exposing (DispatchRouteCreate)
import Data.DispatchRoute as DispatchRoute exposing (DispatchRoute)
import Data.DispatchRouteHistory as DispatchRouteHistory exposing (DispatchRouteHistory)
import Dict
import Http
import Json.Decode as Decode
import Url.Builder as Url


basePath : String
basePath =
    "https://api.samsara.com/v1"


{-| Create a new dispatch route.
-}
createDispatchRoute :
    { onSend : Result Http.Error DispatchRoute -> msg


    , body : DispatchRouteCreate

    , accessToken : String
    }
    -> Cmd msg
createDispatchRoute params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "dispatch", "routes"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| DispatchRouteCreate.encode params.body
        , expect = Http.expectJson params.onSend DispatchRoute.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Create a new dispatch route for the driver with driver_id.
-}
createDriverDispatchRoute :
    { onSend : Result Http.Error DispatchRoute -> msg


    , body : DispatchRouteCreate
    , driverId : Int
    , accessToken : String
    }
    -> Cmd msg
createDriverDispatchRoute params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", {driver_id}, "dispatch", "routes"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| DispatchRouteCreate.encode params.body
        , expect = Http.expectJson params.onSend DispatchRoute.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Create a new dispatch route for the vehicle with vehicle_id.
-}
createVehicleDispatchRoute :
    { onSend : Result Http.Error DispatchRoute -> msg


    , body : DispatchRouteCreate
    , vehicleId : Int
    , accessToken : String
    }
    -> Cmd msg
createVehicleDispatchRoute params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles", {vehicle_id}, "dispatch", "routes"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| DispatchRouteCreate.encode params.body
        , expect = Http.expectJson params.onSend DispatchRoute.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Delete a dispatch route and its associated jobs.
-}
deleteDispatchRouteById :
    { onSend : Result Http.Error () -> msg



    , routeId : Int
    , accessToken : String
    }
    -> Cmd msg
deleteDispatchRouteById params =
    Http.request
        { method = "DELETE"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "dispatch", "routes", {route_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectWhatever params.onSend
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all of the dispatch routes for the group.
-}
fetchAllDispatchRoutes :
    { onSend : Result Http.Error (List DispatchRoute) -> msg




    , accessToken : String    , groupId : Maybe (Int)    , endTime : Maybe (Int)    , duration : Maybe (Int)
    }
    -> Cmd msg
fetchAllDispatchRoutes params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "dispatch", "routes"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "group_id" << String.fromInt) params.groupId, Maybe.map (Url.string "end_time" << String.fromInt) params.endTime, Maybe.map (Url.string "duration" << String.fromInt) params.duration])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list DispatchRoute.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
-}
fetchAllRouteJobUpdates :
    { onSend : Result Http.Error AllRouteJobUpdates -> msg




    , accessToken : String    , groupId : Maybe (Int)    , sequenceId : Maybe (String)    , include : Maybe (String)
    }
    -> Cmd msg
fetchAllRouteJobUpdates params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "dispatch", "routes", "job_updates"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "group_id" << String.fromInt) params.groupId, Maybe.map (Url.string "sequence_id" ) params.sequenceId, Maybe.map (Url.string "include" ) params.include])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend AllRouteJobUpdates.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch a dispatch route by id.
-}
getDispatchRouteById :
    { onSend : Result Http.Error DispatchRoute -> msg



    , routeId : Int
    , accessToken : String
    }
    -> Cmd msg
getDispatchRouteById params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "dispatch", "routes", {route_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend DispatchRoute.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch the history of a dispatch route.
-}
getDispatchRouteHistory :
    { onSend : Result Http.Error DispatchRouteHistory -> msg



    , routeId : Int
    , accessToken : String    , startTime : Maybe (Int)    , endTime : Maybe (Int)
    }
    -> Cmd msg
getDispatchRouteHistory params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "dispatch", "routes", {route_id}, "history"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "start_time" << String.fromInt) params.startTime, Maybe.map (Url.string "end_time" << String.fromInt) params.endTime])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend DispatchRouteHistory.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all of the dispatch routes for a given driver.
-}
getDispatchRoutesByDriverId :
    { onSend : Result Http.Error (List DispatchRoute) -> msg



    , driverId : Int
    , accessToken : String    , endTime : Maybe (Int)    , duration : Maybe (Int)
    }
    -> Cmd msg
getDispatchRoutesByDriverId params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", {driver_id}, "dispatch", "routes"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "end_time" << String.fromInt) params.endTime, Maybe.map (Url.string "duration" << String.fromInt) params.duration])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list DispatchRoute.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all of the dispatch routes for a given vehicle.
-}
getDispatchRoutesByVehicleId :
    { onSend : Result Http.Error (List DispatchRoute) -> msg



    , vehicleId : Int
    , accessToken : String    , endTime : Maybe (Int)    , duration : Maybe (Int)
    }
    -> Cmd msg
getDispatchRoutesByVehicleId params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles", {vehicle_id}, "dispatch", "routes"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "end_time" << String.fromInt) params.endTime, Maybe.map (Url.string "duration" << String.fromInt) params.duration])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list DispatchRoute.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Update a dispatch route and its associated jobs.
-}
updateDispatchRouteById :
    { onSend : Result Http.Error DispatchRoute -> msg


    , body : DispatchRoute
    , routeId : Int
    , accessToken : String
    }
    -> Cmd msg
updateDispatchRouteById params =
    Http.request
        { method = "PUT"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "dispatch", "routes", {route_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| DispatchRoute.encode params.body
        , expect = Http.expectJson params.onSend DispatchRoute.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }
