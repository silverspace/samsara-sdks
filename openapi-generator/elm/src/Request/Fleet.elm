{-
   Samsara API
   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI spec version: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Request.Fleet exposing (addFleetAddress, addOrganizationAddresses, createDispatchRoute, createDriver, createDriverDispatchRoute, createDriverDocument, createDvir, createVehicleDispatchRoute, deactivateDriver, deleteDispatchRouteById, deleteOrganizationAddress, fetchAllDispatchRoutes, fetchAllRouteJobUpdates, getAllAssetCurrentLocations, getAllAssets, getAllDeactivatedDrivers, getAssetLocation, getAssetReefer, getDeactivatedDriverById, getDispatchRouteById, getDispatchRouteHistory, getDispatchRoutesByDriverId, getDispatchRoutesByVehicleId, getDriverById, getDriverDocumentTypesByOrgId, getDriverDocumentsByOrgId, getDriverSafetyScore, getDvirs, getFleetDrivers, getFleetDriversHosDailyLogs, getFleetDriversSummary, getFleetHosAuthenticationLogs, getFleetHosLogs, getFleetHosLogsSummary, getFleetLocations, getFleetMaintenanceList, getFleetTrips, getFleetVehicle, getOrganizationAddress, getOrganizationAddresses, getOrganizationContact, getVehicleHarshEvent, getVehicleLocations, getVehicleSafetyScore, getVehicleStats, getVehiclesLocations, listContacts, listFleet, patchFleetVehicle, reactivateDriverById, updateDispatchRouteById, updateOrganizationAddress, updateVehicles)

import Data.DocumentCreate as DocumentCreate exposing (DocumentCreate)
import Data.Address as Address exposing (Address)
import Data.HosLogsSummaryResponse as HosLogsSummaryResponse exposing (HosLogsSummaryResponse)
import Data.InlineObject7 as InlineObject7 exposing (InlineObject7)
import Data.VehicleHarshEventResponse as VehicleHarshEventResponse exposing (VehicleHarshEventResponse)
import Data.InlineObject6 as InlineObject6 exposing (InlineObject6)
import Data.InlineObject5 as InlineObject5 exposing (InlineObject5)
import Data.InlineObject4 as InlineObject4 exposing (InlineObject4)
import Data.Document as Document exposing (Document)
import Data.InlineObject3 as InlineObject3 exposing (InlineObject3)
import Data.InlineObject2 as InlineObject2 exposing (InlineObject2)
import Data.InlineObject1 as InlineObject1 exposing (InlineObject1)
import Data.AllRouteJobUpdates as AllRouteJobUpdates exposing (AllRouteJobUpdates)
import Data.DispatchRouteCreate as DispatchRouteCreate exposing (DispatchRouteCreate)
import Data.HosAuthenticationLogsResponse as HosAuthenticationLogsResponse exposing (HosAuthenticationLogsResponse)
import Data.DispatchRouteHistory as DispatchRouteHistory exposing (DispatchRouteHistory)
import Data.AssetReeferResponse as AssetReeferResponse exposing (AssetReeferResponse)
import Data.DriverDailyLogResponse as DriverDailyLogResponse exposing (DriverDailyLogResponse)
import Data.HosLogsResponse as HosLogsResponse exposing (HosLogsResponse)
import Data.DriversSummaryResponse as DriversSummaryResponse exposing (DriversSummaryResponse)
import Data.VehicleSafetyScoreResponse as VehicleSafetyScoreResponse exposing (VehicleSafetyScoreResponse)
import Data.InlineObject as InlineObject exposing (InlineObject)
import Data.DvirListResponse as DvirListResponse exposing (DvirListResponse)
import Data.InlineObject9 as InlineObject9 exposing (InlineObject9)
import Data.InlineObject8 as InlineObject8 exposing (InlineObject8)
import Data.Object as Object exposing (Object)
import Data.FleetVehicleLocation as FleetVehicleLocation exposing (FleetVehicleLocation)
import Data.Driver as Driver exposing (Driver)
import Data.InlineResponse200 as InlineResponse200 exposing (InlineResponse200)
import Data.DvirBase as DvirBase exposing (DvirBase)
import Data.DriverSafetyScoreResponse as DriverSafetyScoreResponse exposing (DriverSafetyScoreResponse)
import Data.InlineObject10 as InlineObject10 exposing (InlineObject10)
import Data.TripResponse as TripResponse exposing (TripResponse)
import Data.DriversResponse as DriversResponse exposing (DriversResponse)
import Data.FleetVehicleResponse as FleetVehicleResponse exposing (FleetVehicleResponse)
import Data.DocumentType as DocumentType exposing (DocumentType)
import Data.InlineObject16 as InlineObject16 exposing (InlineObject16)
import Data.InlineObject15 as InlineObject15 exposing (InlineObject15)
import Data.InlineObject14 as InlineObject14 exposing (InlineObject14)
import Data.InlineObject13 as InlineObject13 exposing (InlineObject13)
import Data.InlineObject12 as InlineObject12 exposing (InlineObject12)
import Data.InlineObject11 as InlineObject11 exposing (InlineObject11)
import Data.Contact as Contact exposing (Contact)
import Data.DispatchRoute as DispatchRoute exposing (DispatchRoute)
import Data.InlineResponse2001 as InlineResponse2001 exposing (InlineResponse2001)
import Data.DriverForCreate as DriverForCreate exposing (DriverForCreate)
import Data.InlineResponse2003 as InlineResponse2003 exposing (InlineResponse2003)
import Data.InlineResponse2002 as InlineResponse2002 exposing (InlineResponse2002)
import Data.InlineResponse2005 as InlineResponse2005 exposing (InlineResponse2005)
import Data.InlineResponse2004 as InlineResponse2004 exposing (InlineResponse2004)
import Dict
import Http
import Json.Decode as Decode
import Url.Builder as Url


basePath : String
basePath =
    "https://api.samsara.com/v1"


{-| This method adds an address book entry to the specified group.
-}
addFleetAddress :
    { onSend : Result Http.Error () -> msg


    , body : InlineObject2

    , accessToken : String
    }
    -> Cmd msg
addFleetAddress params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "add_address"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject2.encode params.body
        , expect = Http.expectWhatever params.onSend
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Add one or more addresses to the organization
-}
addOrganizationAddresses :
    { onSend : Result Http.Error (List Address) -> msg


    , body : InlineObject

    , accessToken : String
    }
    -> Cmd msg
addOrganizationAddresses params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["addresses"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject.encode params.body
        , expect = Http.expectJson params.onSend (Decode.list Address.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


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


{-| Create a new driver.
-}
createDriver :
    { onSend : Result Http.Error Driver -> msg


    , body : DriverForCreate

    , accessToken : String
    }
    -> Cmd msg
createDriver params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", "create"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| DriverForCreate.encode params.body
        , expect = Http.expectJson params.onSend Driver.decoder
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


{-| Create a driver document for the given driver.
-}
createDriverDocument :
    { onSend : Result Http.Error Document -> msg


    , body : DocumentCreate
    , driverId : Int
    , accessToken : String
    }
    -> Cmd msg
createDriverDocument params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", {driver_id}, "documents"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| DocumentCreate.encode params.body
        , expect = Http.expectJson params.onSend Document.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Create a new dvir, marking a vehicle or trailer safe or unsafe.
-}
createDvir :
    { onSend : Result Http.Error DvirBase -> msg


    , body : InlineObject12

    , accessToken : String
    }
    -> Cmd msg
createDvir params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "maintenance", "dvirs"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject12.encode params.body
        , expect = Http.expectJson params.onSend DvirBase.decoder
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


{-| Deactivate a driver with the given id.
-}
deactivateDriver :
    { onSend : Result Http.Error () -> msg



    , driverIdOrExternalId : String
    , accessToken : String
    }
    -> Cmd msg
deactivateDriver params =
    Http.request
        { method = "DELETE"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", {driver_id_or_external_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectWhatever params.onSend
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


{-| Delete an address.
-}
deleteOrganizationAddress :
    { onSend : Result Http.Error () -> msg



    , addressId : Int
    , accessToken : String
    }
    -> Cmd msg
deleteOrganizationAddress params =
    Http.request
        { method = "DELETE"
        , headers = []
        , url = Url.crossOrigin basePath
            ["addresses",  String.fromInt params.addressId]
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


{-| Fetch current locations of all assets for the group.
-}
getAllAssetCurrentLocations :
    { onSend : Result Http.Error InlineResponse2001 -> msg




    , accessToken : String    , groupId : Maybe (Int)
    }
    -> Cmd msg
getAllAssetCurrentLocations params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "assets", "locations"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "group_id" << String.fromInt) params.groupId])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend InlineResponse2001.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all of the assets for the group.
-}
getAllAssets :
    { onSend : Result Http.Error InlineResponse200 -> msg




    , accessToken : String    , groupId : Maybe (Int)
    }
    -> Cmd msg
getAllAssets params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "assets"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "group_id" << String.fromInt) params.groupId])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend InlineResponse200.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all deactivated drivers for the group.
-}
getAllDeactivatedDrivers :
    { onSend : Result Http.Error (List Driver) -> msg




    , accessToken : String    , groupId : Maybe (Int)
    }
    -> Cmd msg
getAllDeactivatedDrivers params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", "inactive"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "group_id" << String.fromInt) params.groupId])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list Driver.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch the historical locations for the asset.
-}
getAssetLocation :
    { onSend : Result Http.Error (List Object) -> msg



    , assetId : Int
    , accessToken : String    , startMs : Int    , endMs : Int
    }
    -> Cmd msg
getAssetLocation params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "assets", {asset_id}, "locations"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "startMs" <| String.fromInt params.startMs), Just (Url.string "endMs" <| String.fromInt params.endMs)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list Object.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch the reefer-specific stats of an asset.
-}
getAssetReefer :
    { onSend : Result Http.Error AssetReeferResponse -> msg



    , assetId : Int
    , accessToken : String    , startMs : Int    , endMs : Int
    }
    -> Cmd msg
getAssetReefer params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "assets", {asset_id}, "reefer"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "startMs" <| String.fromInt params.startMs), Just (Url.string "endMs" <| String.fromInt params.endMs)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend AssetReeferResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch deactivated driver by id.
-}
getDeactivatedDriverById :
    { onSend : Result Http.Error Driver -> msg



    , driverIdOrExternalId : String
    , accessToken : String
    }
    -> Cmd msg
getDeactivatedDriverById params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", "inactive", {driver_id_or_external_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend Driver.decoder
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


{-| Fetch driver by id.
-}
getDriverById :
    { onSend : Result Http.Error Driver -> msg



    , driverIdOrExternalId : String
    , accessToken : String
    }
    -> Cmd msg
getDriverById params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", {driver_id_or_external_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend Driver.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all of the document types.
-}
getDriverDocumentTypesByOrgId :
    { onSend : Result Http.Error (List DocumentType) -> msg





    }
    -> Cmd msg
getDriverDocumentTypesByOrgId params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", "document_types"]
            []
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list DocumentType.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all of the documents.
-}
getDriverDocumentsByOrgId :
    { onSend : Result Http.Error (List Document) -> msg




    , accessToken : String    , endMs : Maybe (Int)    , durationMs : Maybe (Int)
    }
    -> Cmd msg
getDriverDocumentsByOrgId params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", "documents"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "endMs" << String.fromInt) params.endMs, Maybe.map (Url.string "durationMs" << String.fromInt) params.durationMs])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list Document.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch the safety score for the driver.
-}
getDriverSafetyScore :
    { onSend : Result Http.Error DriverSafetyScoreResponse -> msg



    , driverId : Int
    , accessToken : String    , startMs : Int    , endMs : Int
    }
    -> Cmd msg
getDriverSafetyScore params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers",  String.fromInt params.driverId, "safety", "score"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "startMs" <| String.fromInt params.startMs), Just (Url.string "endMs" <| String.fromInt params.endMs)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend DriverSafetyScoreResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get DVIRs for the org within provided time constraints
-}
getDvirs :
    { onSend : Result Http.Error DvirListResponse -> msg




    , accessToken : String    , endMs : Int    , durationMs : Int    , groupId : Maybe (Int)
    }
    -> Cmd msg
getDvirs params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "maintenance", "dvirs"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "end_ms" <| String.fromInt params.endMs), Just (Url.string "duration_ms" <| String.fromInt params.durationMs), Maybe.map (Url.string "group_id" << String.fromInt) params.groupId])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend DvirListResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get all the drivers for the specified group.
-}
getFleetDrivers :
    { onSend : Result Http.Error DriversResponse -> msg


    , body : InlineObject3

    , accessToken : String
    }
    -> Cmd msg
getFleetDrivers params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject3.encode params.body
        , expect = Http.expectJson params.onSend DriversResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get summarized daily HOS charts for a specified driver.
-}
getFleetDriversHosDailyLogs :
    { onSend : Result Http.Error DriverDailyLogResponse -> msg


    , body : InlineObject6
    , driverId : Int
    , accessToken : String
    }
    -> Cmd msg
getFleetDriversHosDailyLogs params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", {driver_id}, "hos_daily_logs"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject6.encode params.body
        , expect = Http.expectJson params.onSend DriverDailyLogResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get the distance and time each driver in an organization has driven in a given time period.
-}
getFleetDriversSummary :
    { onSend : Result Http.Error DriversSummaryResponse -> msg


    , body : InlineObject5

    , accessToken : String    , snapToDayBounds : Maybe (Bool)
    }
    -> Cmd msg
getFleetDriversSummary params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", "summary"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "snap_to_day_bounds" << (\val -> if val then "true" else "false")) params.snapToDayBounds])
        , body = Http.jsonBody <| InlineObject5.encode params.body
        , expect = Http.expectJson params.onSend DriversSummaryResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
-}
getFleetHosAuthenticationLogs :
    { onSend : Result Http.Error HosAuthenticationLogsResponse -> msg


    , body : InlineObject7

    , accessToken : String
    }
    -> Cmd msg
getFleetHosAuthenticationLogs params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "hos_authentication_logs"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject7.encode params.body
        , expect = Http.expectJson params.onSend HosAuthenticationLogsResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
-}
getFleetHosLogs :
    { onSend : Result Http.Error HosLogsResponse -> msg


    , body : InlineObject8

    , accessToken : String
    }
    -> Cmd msg
getFleetHosLogs params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "hos_logs"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject8.encode params.body
        , expect = Http.expectJson params.onSend HosLogsResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get the current HOS status for all drivers in the group.
-}
getFleetHosLogsSummary :
    { onSend : Result Http.Error HosLogsSummaryResponse -> msg


    , body : InlineObject9

    , accessToken : String
    }
    -> Cmd msg
getFleetHosLogsSummary params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "hos_logs_summary"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject9.encode params.body
        , expect = Http.expectJson params.onSend HosLogsSummaryResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
-}
getFleetLocations :
    { onSend : Result Http.Error InlineResponse2003 -> msg


    , body : InlineObject11

    , accessToken : String
    }
    -> Cmd msg
getFleetLocations params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "locations"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject11.encode params.body
        , expect = Http.expectJson params.onSend InlineResponse2003.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get list of the vehicles with any engine faults or check light data.
-}
getFleetMaintenanceList :
    { onSend : Result Http.Error InlineResponse2004 -> msg


    , body : InlineObject13

    , accessToken : String
    }
    -> Cmd msg
getFleetMaintenanceList params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "maintenance", "list"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject13.encode params.body
        , expect = Http.expectJson params.onSend InlineResponse2004.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
-}
getFleetTrips :
    { onSend : Result Http.Error TripResponse -> msg


    , body : InlineObject15

    , accessToken : String
    }
    -> Cmd msg
getFleetTrips params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "trips"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject15.encode params.body
        , expect = Http.expectJson params.onSend TripResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Gets a specific vehicle.
-}
getFleetVehicle :
    { onSend : Result Http.Error FleetVehicleResponse -> msg



    , vehicleIdOrExternalId : String
    , accessToken : String
    }
    -> Cmd msg
getFleetVehicle params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles", {vehicle_id_or_external_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend FleetVehicleResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch an address by its id.
-}
getOrganizationAddress :
    { onSend : Result Http.Error Address -> msg



    , addressId : Int
    , accessToken : String
    }
    -> Cmd msg
getOrganizationAddress params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["addresses",  String.fromInt params.addressId]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend Address.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
-}
getOrganizationAddresses :
    { onSend : Result Http.Error (List Address) -> msg




    , accessToken : String
    }
    -> Cmd msg
getOrganizationAddresses params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["addresses"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list Address.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch a contact by its id.
-}
getOrganizationContact :
    { onSend : Result Http.Error Contact -> msg



    , contactId : Int
    , accessToken : String
    }
    -> Cmd msg
getOrganizationContact params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["contacts", {contact_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend Contact.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch harsh event details for a vehicle.
-}
getVehicleHarshEvent :
    { onSend : Result Http.Error VehicleHarshEventResponse -> msg



    , vehicleId : Int
    , accessToken : String    , timestamp : Int
    }
    -> Cmd msg
getVehicleHarshEvent params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles",  String.fromInt params.vehicleId, "safety", "harsh_event"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "timestamp" <| String.fromInt params.timestamp)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend VehicleHarshEventResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
-}
getVehicleLocations :
    { onSend : Result Http.Error (List FleetVehicleLocation) -> msg



    , vehicleId : Int
    , accessToken : String    , startMs : Int    , endMs : Int
    }
    -> Cmd msg
getVehicleLocations params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles", {vehicle_id}, "locations"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "startMs" <| String.fromInt params.startMs), Just (Url.string "endMs" <| String.fromInt params.endMs)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list FleetVehicleLocation.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch the safety score for the vehicle.
-}
getVehicleSafetyScore :
    { onSend : Result Http.Error VehicleSafetyScoreResponse -> msg



    , vehicleId : Int
    , accessToken : String    , startMs : Int    , endMs : Int
    }
    -> Cmd msg
getVehicleSafetyScore params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles",  String.fromInt params.vehicleId, "safety", "score"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "startMs" <| String.fromInt params.startMs), Just (Url.string "endMs" <| String.fromInt params.endMs)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend VehicleSafetyScoreResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
-}
getVehicleStats :
    { onSend : Result Http.Error InlineResponse2005 -> msg




    , accessToken : String    , startMs : Int    , endMs : Int    , series : Maybe (String)    , tagIds : Maybe (String)    , startingAfter : Maybe (String)    , endingBefore : Maybe (String)    , limit : Maybe (Int)
    }
    -> Cmd msg
getVehicleStats params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles", "stats"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "startMs" <| String.fromInt params.startMs), Just (Url.string "endMs" <| String.fromInt params.endMs), Maybe.map (Url.string "series" ) params.series, Maybe.map (Url.string "tagIds" ) params.tagIds, Maybe.map (Url.string "startingAfter" ) params.startingAfter, Maybe.map (Url.string "endingBefore" ) params.endingBefore, Maybe.map (Url.string "limit" << String.fromInt) params.limit])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend InlineResponse2005.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
-}
getVehiclesLocations :
    { onSend : Result Http.Error (List Object) -> msg




    , accessToken : String    , startMs : Int    , endMs : Int
    }
    -> Cmd msg
getVehiclesLocations params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles", "locations"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Just (Url.string "startMs" <| String.fromInt params.startMs), Just (Url.string "endMs" <| String.fromInt params.endMs)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list Object.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Fetch all contacts for the organization.
-}
listContacts :
    { onSend : Result Http.Error (List Contact) -> msg




    , accessToken : String
    }
    -> Cmd msg
listContacts params =
    Http.request
        { method = "GET"
        , headers = []
        , url = Url.crossOrigin basePath
            ["contacts"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list Contact.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
-}
listFleet :
    { onSend : Result Http.Error InlineResponse2002 -> msg


    , body : InlineObject10

    , accessToken : String    , startingAfter : Maybe (String)    , endingBefore : Maybe (String)    , limit : Maybe (Int)
    }
    -> Cmd msg
listFleet params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "list"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken), Maybe.map (Url.string "startingAfter" ) params.startingAfter, Maybe.map (Url.string "endingBefore" ) params.endingBefore, Maybe.map (Url.string "limit" << String.fromInt) params.limit])
        , body = Http.jsonBody <| InlineObject10.encode params.body
        , expect = Http.expectJson params.onSend InlineResponse2002.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
-}
patchFleetVehicle :
    { onSend : Result Http.Error FleetVehicleResponse -> msg


    , body : InlineObject16
    , vehicleIdOrExternalId : String
    , accessToken : String
    }
    -> Cmd msg
patchFleetVehicle params =
    Http.request
        { method = "PATCH"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "vehicles", {vehicle_id_or_external_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject16.encode params.body
        , expect = Http.expectJson params.onSend FleetVehicleResponse.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| Reactivate the inactive driver having id.
-}
reactivateDriverById :
    { onSend : Result Http.Error Driver -> msg


    , body : InlineObject4
    , driverIdOrExternalId : String
    , accessToken : String
    }
    -> Cmd msg
reactivateDriverById params =
    Http.request
        { method = "PUT"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "drivers", "inactive", {driver_id_or_external_id}]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject4.encode params.body
        , expect = Http.expectJson params.onSend Driver.decoder
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


{-| Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
-}
updateOrganizationAddress :
    { onSend : Result Http.Error () -> msg


    , body : InlineObject1
    , addressId : Int
    , accessToken : String
    }
    -> Cmd msg
updateOrganizationAddress params =
    Http.request
        { method = "PATCH"
        , headers = []
        , url = Url.crossOrigin basePath
            ["addresses",  String.fromInt params.addressId]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject1.encode params.body
        , expect = Http.expectWhatever params.onSend
        , timeout = Just 30000
        , tracker = Nothing
        }


{-| This method enables the mutation of metadata for vehicles in the Samsara Cloud.
-}
updateVehicles :
    { onSend : Result Http.Error () -> msg


    , body : InlineObject14

    , accessToken : String
    }
    -> Cmd msg
updateVehicles params =
    Http.request
        { method = "POST"
        , headers = []
        , url = Url.crossOrigin basePath
            ["fleet", "set_data"]
            (List.filterMap identity [Just (Url.string "access_token"  params.accessToken)])
        , body = Http.jsonBody <| InlineObject14.encode params.body
        , expect = Http.expectWhatever params.onSend
        , timeout = Just 30000
        , tracker = Nothing
        }
