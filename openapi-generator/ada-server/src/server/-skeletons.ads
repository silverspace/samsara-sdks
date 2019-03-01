--  Samsara API
--  # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built_in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off_the_shelf HTTP clients. We allow you to interact securely with our API from a client_side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go_to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings_>Organization_>API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client_side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error_Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |_____________|________________|___________________________________________________________________| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en_us/sections/360000538054_APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
--
--  OpenAPI spec version: 1.0.0
--  
--
--  NOTE: This package is auto generated by the swagger code generator 4.0.0-SNAPSHOT.
--  https://openapi-generator.tech
--  Do not edit the class manually.
with Swagger.Servers;
with .Models;
with Security.Permissions;
package .Skeletons is
   use .Models;
   type Server_Type is limited interface;



   --  /fleet/assets/locations
   --  Fetch current locations of all assets for the group.
   procedure Get_All_Asset_Current_Locations
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse2001Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/assets
   --  Fetch all of the assets for the group.
   procedure Get_All_Assets
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse200Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/assets/{assetId:[0_9]+}/locations
   --  Fetch the historical locations for the asset.
   procedure Get_Asset_Location
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out Swagger.Object_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/assets/{assetId:[0_9]+}/reefer
   --  Fetch the reefer-specific stats of an asset.
   procedure Get_Asset_Reefer
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out .Models.AssetReeferResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/create
   --  Create a new driver.
   procedure Create_Driver
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Create_Driver_Param : in DriverForCreateType;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Deactivate a driver with the given id.
   procedure Deactivate_Driver
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/inactive
   --  Fetch all deactivated drivers for the group.
   procedure Get_All_Deactivated_Drivers
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result  : out .Models.DriverType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch deactivated driver by id.
   procedure Get_Deactivated_Driver_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch driver by id.
   procedure Get_Driver_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Reactivate the inactive driver having id.
   procedure Reactivate_Driver_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Reactivate_Driver_Param : in InlineObject4Type;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/add_address
   --  This method adds an address book entry to the specified group.
   procedure Add_Fleet_Address
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Address_Param : in InlineObject2Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /addresses
   --  Add one or more addresses to the organization
   procedure Add_Organization_Addresses
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Addresses : in InlineObjectType;
       Result  : out .Models.AddressType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes
   --  Create a new dispatch route.
   procedure Create_Dispatch_Route
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Create_Dispatch_Route_Params : in DispatchRouteCreateType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/create
   --  Create a new driver.
   procedure Create_Driver
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Create_Driver_Param : in DriverForCreateType;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the driver with driver_id.
   procedure Create_Driver_Dispatch_Route
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in DispatchRouteCreateType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+}/documents
   --  Create a driver document for the given driver.
   procedure Create_Driver_Document
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Create_Document_Params : in DocumentCreateType;
       Result  : out .Models.DocumentType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/maintenance/dvirs
   --  Create a new dvir, marking a vehicle or trailer safe or unsafe.
   procedure Create_Dvir
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Create_Dvir_Param : in InlineObject12Type;
       Result  : out .Models.DvirBaseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the vehicle with vehicle_id.
   procedure Create_Vehicle_Dispatch_Route
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in DispatchRouteCreateType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Deactivate a driver with the given id.
   procedure Deactivate_Driver
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Delete a dispatch route and its associated jobs.
   procedure Delete_Dispatch_Route_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /addresses/{addressId}
   --  Delete an address.
   procedure Delete_Organization_Address
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Address_Id : in Swagger.Long;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes
   --  Fetch all of the dispatch routes for the group.
   procedure Fetch_All_Dispatch_Routes
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/job_updates
   --  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   procedure Fetch_All_Route_Job_Updates
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Sequence_Id : in Swagger.Nullable_UString;
       Include : in Swagger.Nullable_UString;
       Result  : out .Models.AllRouteJobUpdatesType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/assets/locations
   --  Fetch current locations of all assets for the group.
   procedure Get_All_Asset_Current_Locations
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse2001Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/assets
   --  Fetch all of the assets for the group.
   procedure Get_All_Assets
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse200Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/inactive
   --  Fetch all deactivated drivers for the group.
   procedure Get_All_Deactivated_Drivers
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result  : out .Models.DriverType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/assets/{assetId:[0_9]+}/locations
   --  Fetch the historical locations for the asset.
   procedure Get_Asset_Location
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out Swagger.Object_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/assets/{assetId:[0_9]+}/reefer
   --  Fetch the reefer-specific stats of an asset.
   procedure Get_Asset_Reefer
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out .Models.AssetReeferResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch deactivated driver by id.
   procedure Get_Deactivated_Driver_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}
   --  Fetch a dispatch route by id.
   procedure Get_Dispatch_Route_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
   --  Fetch the history of a dispatch route.
   procedure Get_Dispatch_Route_History
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Start_Time : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteHistoryType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given driver.
   procedure Get_Dispatch_Routes_By_Driver_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given vehicle.
   procedure Get_Dispatch_Routes_By_Vehicle_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch driver by id.
   procedure Get_Driver_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/document_types
   --  Fetch all of the document types.
   procedure Get_Driver_Document_Types_By_Org_Id
      (Server : in out Server_Type
       ;
       Result  : out .Models.DocumentTypeType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/documents
   --  Fetch all of the documents.
   procedure Get_Driver_Documents_By_Org_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       End_Ms : in Swagger.Nullable_Long;
       Duration_Ms : in Swagger.Nullable_Long;
       Result  : out .Models.DocumentType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driverId:[0_9]+}/safety/score
   --  Fetch the safety score for the driver.
   procedure Get_Driver_Safety_Score
      (Server : in out Server_Type;
       Driver_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out .Models.DriverSafetyScoreResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/maintenance/dvirs
   --  Get DVIRs for the org within provided time constraints
   procedure Get_Dvirs
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       End_Ms : in Integer;
       Duration_Ms : in Integer;
       Group_Id : in Swagger.Nullable_Integer;
       Result  : out .Models.DvirListResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers
   --  Get all the drivers for the specified group.
   procedure Get_Fleet_Drivers
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Drivers_Param : in InlineObject3Type;
       Result  : out .Models.DriversResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
   --  Get summarized daily HOS charts for a specified driver.
   procedure Get_Fleet_Drivers_Hos_Daily_Logs
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Hos_Logs_Param : in InlineObject6Type;
       Result  : out .Models.DriverDailyLogResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/summary
   --  Get the distance and time each driver in an organization has driven in a given time period.
   procedure Get_Fleet_Drivers_Summary
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Drivers_Summary_Param : in InlineObject5Type;
       Snap_To_Day_Bounds : in Swagger.Nullable_Boolean;
       Result  : out .Models.DriversSummaryResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/hos_authentication_logs
   --  Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   procedure Get_Fleet_Hos_Authentication_Logs
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Hos_Authentication_Logs_Param : in InlineObject7Type;
       Result  : out .Models.HosAuthenticationLogsResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/hos_logs
   --  Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   procedure Get_Fleet_Hos_Logs
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Hos_Logs_Param : in InlineObject8Type;
       Result  : out .Models.HosLogsResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/hos_logs_summary
   --  Get the current HOS status for all drivers in the group.
   procedure Get_Fleet_Hos_Logs_Summary
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Hos_Logs_Param : in InlineObject9Type;
       Result  : out .Models.HosLogsSummaryResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/locations
   --  Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   procedure Get_Fleet_Locations
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in InlineObject11Type;
       Result  : out .Models.InlineResponse2003Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/maintenance/list
   --  Get list of the vehicles with any engine faults or check light data.
   procedure Get_Fleet_Maintenance_List
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in InlineObject13Type;
       Result  : out .Models.InlineResponse2004Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/trips
   --  Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   procedure Get_Fleet_Trips
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Trips_Param : in InlineObject15Type;
       Result  : out .Models.TripResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Gets a specific vehicle.
   procedure Get_Fleet_Vehicle
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id_Or_External_Id : in Swagger.UString;
       Result  : out .Models.FleetVehicleResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /addresses/{addressId}
   --  Fetch an address by its id.
   procedure Get_Organization_Address
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Address_Id : in Swagger.Long;
       Result  : out .Models.AddressType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /addresses
   --  Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   procedure Get_Organization_Addresses
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Result  : out .Models.AddressType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /contacts/{contact_id}
   --  Fetch a contact by its id.
   procedure Get_Organization_Contact
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Contact_Id : in Swagger.Long;
       Result  : out .Models.ContactType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
   --  Fetch harsh event details for a vehicle.
   procedure Get_Vehicle_Harsh_Event
      (Server : in out Server_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Timestamp : in Swagger.Long;
       Result  : out .Models.VehicleHarshEventResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
   --  Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   procedure Get_Vehicle_Locations
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out .Models.FleetVehicleLocationType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
   --  Fetch the safety score for the vehicle.
   procedure Get_Vehicle_Safety_Score
      (Server : in out Server_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out .Models.VehicleSafetyScoreResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/stats
   --  Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
   procedure Get_Vehicle_Stats
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Start_Ms : in Integer;
       End_Ms : in Integer;
       Series : in Swagger.Nullable_UString;
       Tag_Ids : in Swagger.Nullable_UString;
       Starting_After : in Swagger.Nullable_UString;
       Ending_Before : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse2005Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/locations
   --  Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   procedure Get_Vehicles_Locations
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Start_Ms : in Integer;
       End_Ms : in Integer;
       Result  : out Swagger.Object_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /contacts
   --  Fetch all contacts for the organization.
   procedure List_Contacts
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Result  : out .Models.ContactType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/list
   --  Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   procedure List_Fleet
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in InlineObject10Type;
       Starting_After : in Swagger.Nullable_UString;
       Ending_Before : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse2002Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   procedure Patch_Fleet_Vehicle
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id_Or_External_Id : in Swagger.UString;
       Data : in InlineObject16Type;
       Result  : out .Models.FleetVehicleResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Reactivate the inactive driver having id.
   procedure Reactivate_Driver_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Reactivate_Driver_Param : in InlineObject4Type;
       Result  : out .Models.DriverType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Update a dispatch route and its associated jobs.
   procedure Update_Dispatch_Route_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Update_Dispatch_Route_Params : in DispatchRouteType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /addresses/{addressId}
   --  Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   procedure Update_Organization_Address
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Address_Id : in Swagger.Long;
       Address : in InlineObject1Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/set_data
   --  This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   procedure Update_Vehicles
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Update_Param : in InlineObject14Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /industrial/data
   --  Fetch all of the data inputs for a group.
   procedure Get_All_Data_Inputs
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Start_Ms : in Swagger.Nullable_Long;
       End_Ms : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse2006Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /industrial/data/{data_input_id:[0_9]+}
   --  Fetch datapoints from a given data input.
   procedure Get_Data_Input
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Data_Input_Id : in Swagger.Long;
       Start_Ms : in Swagger.Nullable_Long;
       End_Ms : in Swagger.Nullable_Long;
       Result  : out .Models.DataInputHistoryResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /machines/list
   --  Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
   procedure Get_Machines
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in InlineObject18Type;
       Result  : out .Models.InlineResponse2007Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /machines/history
   --  Get historical data for machine objects. This method returns a set of historical data for all machines in a group
   procedure Get_Machines_History
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       History_Param : in InlineObject17Type;
       Result  : out .Models.MachineHistoryResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes
   --  Create a new dispatch route.
   procedure Create_Dispatch_Route
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Create_Dispatch_Route_Params : in DispatchRouteCreateType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the driver with driver_id.
   procedure Create_Driver_Dispatch_Route
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in DispatchRouteCreateType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the vehicle with vehicle_id.
   procedure Create_Vehicle_Dispatch_Route
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in DispatchRouteCreateType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Delete a dispatch route and its associated jobs.
   procedure Delete_Dispatch_Route_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes
   --  Fetch all of the dispatch routes for the group.
   procedure Fetch_All_Dispatch_Routes
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/job_updates
   --  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   procedure Fetch_All_Route_Job_Updates
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Sequence_Id : in Swagger.Nullable_UString;
       Include : in Swagger.Nullable_UString;
       Result  : out .Models.AllRouteJobUpdatesType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}
   --  Fetch a dispatch route by id.
   procedure Get_Dispatch_Route_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
   --  Fetch the history of a dispatch route.
   procedure Get_Dispatch_Route_History
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Start_Time : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteHistoryType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given driver.
   procedure Get_Dispatch_Routes_By_Driver_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given vehicle.
   procedure Get_Dispatch_Routes_By_Vehicle_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result  : out .Models.DispatchRouteType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Update a dispatch route and its associated jobs.
   procedure Update_Dispatch_Route_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Update_Dispatch_Route_Params : in DispatchRouteType;
       Result  : out .Models.DispatchRouteType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/drivers/{driverId:[0_9]+}/safety/score
   --  Fetch the safety score for the driver.
   procedure Get_Driver_Safety_Score
      (Server : in out Server_Type;
       Driver_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out .Models.DriverSafetyScoreResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
   --  Fetch harsh event details for a vehicle.
   procedure Get_Vehicle_Harsh_Event
      (Server : in out Server_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Timestamp : in Swagger.Long;
       Result  : out .Models.VehicleHarshEventResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
   --  Fetch the safety score for the vehicle.
   procedure Get_Vehicle_Safety_Score
      (Server : in out Server_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result  : out .Models.VehicleSafetyScoreResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /sensors/list
   --  Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
   procedure Get_Sensors
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in InlineObject23Type;
       Result  : out .Models.InlineResponse2008Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /sensors/cargo
   --  Get cargo monitor status (empty / full) for requested sensors.
   procedure Get_Sensors_Cargo
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in InlineObject19Type;
       Result  : out .Models.CargoResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /sensors/door
   --  Get door monitor status (closed / open) for requested sensors.
   procedure Get_Sensors_Door
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in InlineObject20Type;
       Result  : out .Models.DoorResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /sensors/history
   --  Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
   procedure Get_Sensors_History
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       History_Param : in InlineObject21Type;
       Result  : out .Models.SensorHistoryResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /sensors/humidity
   --  Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
   procedure Get_Sensors_Humidity
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in InlineObject22Type;
       Result  : out .Models.HumidityResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /sensors/temperature
   --  Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
   procedure Get_Sensors_Temperature
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in InlineObject24Type;
       Result  : out .Models.TemperatureResponseType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /tags
   --  Create a new tag for the group.
   procedure Create_Tag
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Tag_Create_Params : in TagCreateType;
       Result  : out .Models.TagType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /tags/{tag_id:[0_9]+}
   --  Permanently deletes a tag.
   procedure Delete_Tag_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /tags
   --  Fetch all of the tags for a group.
   procedure Get_All_Tags
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result  : out .Models.InlineResponse2009Type;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /tags/{tag_id:[0_9]+}
   --  Fetch a tag by id.
   procedure Get_Tag_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long;
       Result  : out .Models.TagType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /tags/{tag_id:[0_9]+}
   --  Add or delete specific members from a tag, or modify the name of a tag.
   procedure Modify_Tag_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long;
       Tag_Modify_Params : in TagModifyType;
       Result  : out .Models.TagType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /tags/{tag_id:[0_9]+}
   --  Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
   procedure Update_Tag_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long;
       Update_Tag_Params : in TagUpdateType;
       Result  : out .Models.TagType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /users/{userId:[0_9]+}
   --  Remove a user from the organization.
   procedure Delete_User_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       User_Id : in Swagger.Long;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /users/{userId:[0_9]+}
   --  Get a user.
   procedure Get_User_By_Id
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       User_Id : in Swagger.Long;
       Result  : out .Models.UserType;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /user_roles
   --  Get all roles in the organization.
   procedure List_User_Roles
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Result  : out .Models.UserRoleType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   --  /users
   --  List all users in the organization.
   procedure List_Users
      (Server : in out Server_Type;
       Access_Token : in Swagger.UString;
       Result  : out .Models.UserType_Vectors.Vector;
       Context : in out Swagger.Servers.Context_Type) is abstract;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Skeleton is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/add_address
      procedure Add_Fleet_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses
      procedure Add_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/documents
      procedure Create_Driver_Document
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/maintenance/dvirs
      procedure Create_Dvir
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses/{addressId}
      procedure Delete_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/document_types
      procedure Get_Driver_Document_Types_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/documents
      procedure Get_Driver_Documents_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/maintenance/dvirs
      procedure Get_Dvirs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers
      procedure Get_Fleet_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
      procedure Get_Fleet_Drivers_Hos_Daily_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/summary
      procedure Get_Fleet_Drivers_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/hos_authentication_logs
      procedure Get_Fleet_Hos_Authentication_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/hos_logs
      procedure Get_Fleet_Hos_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/hos_logs_summary
      procedure Get_Fleet_Hos_Logs_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/locations
      procedure Get_Fleet_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/maintenance/list
      procedure Get_Fleet_Maintenance_List
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/trips
      procedure Get_Fleet_Trips
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses/{addressId}
      procedure Get_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses
      procedure Get_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /contacts/{contact_id}
      procedure Get_Organization_Contact
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
      procedure Get_Vehicle_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/stats
      procedure Get_Vehicle_Stats
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/locations
      procedure Get_Vehicles_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /contacts
      procedure List_Contacts
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/list
      procedure List_Fleet
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Patch_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses/{addressId}
      procedure Update_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/set_data
      procedure Update_Vehicles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /industrial/data
      procedure Get_All_Data_Inputs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /industrial/data/{data_input_id:[0_9]+}
      procedure Get_Data_Input
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /machines/list
      procedure Get_Machines
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /machines/history
      procedure Get_Machines_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/list
      procedure Get_Sensors
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/cargo
      procedure Get_Sensors_Cargo
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/door
      procedure Get_Sensors_Door
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/history
      procedure Get_Sensors_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/humidity
      procedure Get_Sensors_Humidity
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/temperature
      procedure Get_Sensors_Temperature
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags
      procedure Create_Tag
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Delete_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags
      procedure Get_All_Tags
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Get_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Modify_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Update_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /users/{userId:[0_9]+}
      procedure Delete_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /users/{userId:[0_9]+}
      procedure Get_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /user_roles
      procedure List_User_Roles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /users
      procedure List_Users
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);

   end Skeleton;

   generic
      type Implementation_Type is limited new Server_Type with private;
      URI_Prefix : String := "";
   package Shared_Instance is

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class);


      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/add_address
      procedure Add_Fleet_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses
      procedure Add_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/documents
      procedure Create_Driver_Document
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/maintenance/dvirs
      procedure Create_Dvir
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses/{addressId}
      procedure Delete_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/document_types
      procedure Get_Driver_Document_Types_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/documents
      procedure Get_Driver_Documents_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/maintenance/dvirs
      procedure Get_Dvirs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers
      procedure Get_Fleet_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
      procedure Get_Fleet_Drivers_Hos_Daily_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/summary
      procedure Get_Fleet_Drivers_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/hos_authentication_logs
      procedure Get_Fleet_Hos_Authentication_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/hos_logs
      procedure Get_Fleet_Hos_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/hos_logs_summary
      procedure Get_Fleet_Hos_Logs_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/locations
      procedure Get_Fleet_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/maintenance/list
      procedure Get_Fleet_Maintenance_List
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/trips
      procedure Get_Fleet_Trips
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses/{addressId}
      procedure Get_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses
      procedure Get_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /contacts/{contact_id}
      procedure Get_Organization_Contact
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
      procedure Get_Vehicle_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/stats
      procedure Get_Vehicle_Stats
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/locations
      procedure Get_Vehicles_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /contacts
      procedure List_Contacts
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/list
      procedure List_Fleet
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Patch_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /addresses/{addressId}
      procedure Update_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/set_data
      procedure Update_Vehicles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /industrial/data
      procedure Get_All_Data_Inputs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /industrial/data/{data_input_id:[0_9]+}
      procedure Get_Data_Input
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /machines/list
      procedure Get_Machines
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /machines/history
      procedure Get_Machines_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/list
      procedure Get_Sensors
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/cargo
      procedure Get_Sensors_Cargo
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/door
      procedure Get_Sensors_Door
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/history
      procedure Get_Sensors_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/humidity
      procedure Get_Sensors_Humidity
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /sensors/temperature
      procedure Get_Sensors_Temperature
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags
      procedure Create_Tag
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Delete_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags
      procedure Get_All_Tags
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Get_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Modify_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /tags/{tag_id:[0_9]+}
      procedure Update_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /users/{userId:[0_9]+}
      procedure Delete_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /users/{userId:[0_9]+}
      procedure Get_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /user_roles
      procedure List_User_Roles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


      --  /users
      procedure List_Users
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type);


   private
      protected Server is

         --  /fleet/assets/locations
         procedure Get_All_Asset_Current_Locations
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse2001Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/assets
         procedure Get_All_Assets
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse200Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/assets/{assetId:[0_9]+}/locations
         procedure Get_Asset_Location
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out Swagger.Object_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/assets/{assetId:[0_9]+}/reefer
         procedure Get_Asset_Reefer
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out .Models.AssetReeferResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/create
         procedure Create_Driver
            (Access_Token : in Swagger.UString;
             Create_Driver_Param : in DriverForCreateType;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Deactivate_Driver
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/inactive
         procedure Get_All_Deactivated_Drivers
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result  : out .Models.DriverType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Deactivated_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Reactivate_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Reactivate_Driver_Param : in InlineObject4Type;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/add_address
         procedure Add_Fleet_Address
            (Access_Token : in Swagger.UString;
             Address_Param : in InlineObject2Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /addresses
         procedure Add_Organization_Addresses
            (Access_Token : in Swagger.UString;
             Addresses : in InlineObjectType;
             Result  : out .Models.AddressType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes
         procedure Create_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/create
         procedure Create_Driver
            (Access_Token : in Swagger.UString;
             Create_Driver_Param : in DriverForCreateType;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Create_Driver_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+}/documents
         procedure Create_Driver_Document
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Create_Document_Params : in DocumentCreateType;
             Result  : out .Models.DocumentType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/maintenance/dvirs
         procedure Create_Dvir
            (Access_Token : in Swagger.UString;
             Create_Dvir_Param : in InlineObject12Type;
             Result  : out .Models.DvirBaseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Create_Vehicle_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Deactivate_Driver
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Delete_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type);

         --  /addresses/{addressId}
         procedure Delete_Organization_Address
            (Access_Token : in Swagger.UString;
             Address_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes
         procedure Fetch_All_Dispatch_Routes
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/job_updates
         procedure Fetch_All_Route_Job_Updates
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Sequence_Id : in Swagger.Nullable_UString;
             Include : in Swagger.Nullable_UString;
             Result  : out .Models.AllRouteJobUpdatesType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/assets/locations
         procedure Get_All_Asset_Current_Locations
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse2001Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/assets
         procedure Get_All_Assets
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse200Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/inactive
         procedure Get_All_Deactivated_Drivers
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result  : out .Models.DriverType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/assets/{assetId:[0_9]+}/locations
         procedure Get_Asset_Location
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out Swagger.Object_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/assets/{assetId:[0_9]+}/reefer
         procedure Get_Asset_Reefer
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out .Models.AssetReeferResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Deactivated_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}
         procedure Get_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
         procedure Get_Dispatch_Route_History
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Start_Time : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteHistoryType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Driver_Id
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/document_types
         procedure Get_Driver_Document_Types_By_Org_Id
            (Result  : out .Models.DocumentTypeType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/documents
         procedure Get_Driver_Documents_By_Org_Id
            (Access_Token : in Swagger.UString;
             End_Ms : in Swagger.Nullable_Long;
             Duration_Ms : in Swagger.Nullable_Long;
             Result  : out .Models.DocumentType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driverId:[0_9]+}/safety/score
         procedure Get_Driver_Safety_Score
            (Driver_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out .Models.DriverSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/maintenance/dvirs
         procedure Get_Dvirs
            (Access_Token : in Swagger.UString;
             End_Ms : in Integer;
             Duration_Ms : in Integer;
             Group_Id : in Swagger.Nullable_Integer;
             Result  : out .Models.DvirListResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers
         procedure Get_Fleet_Drivers
            (Access_Token : in Swagger.UString;
             Group_Drivers_Param : in InlineObject3Type;
             Result  : out .Models.DriversResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
         procedure Get_Fleet_Drivers_Hos_Daily_Logs
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Hos_Logs_Param : in InlineObject6Type;
             Result  : out .Models.DriverDailyLogResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/summary
         procedure Get_Fleet_Drivers_Summary
            (Access_Token : in Swagger.UString;
             Drivers_Summary_Param : in InlineObject5Type;
             Snap_To_Day_Bounds : in Swagger.Nullable_Boolean;
             Result  : out .Models.DriversSummaryResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/hos_authentication_logs
         procedure Get_Fleet_Hos_Authentication_Logs
            (Access_Token : in Swagger.UString;
             Hos_Authentication_Logs_Param : in InlineObject7Type;
             Result  : out .Models.HosAuthenticationLogsResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/hos_logs
         procedure Get_Fleet_Hos_Logs
            (Access_Token : in Swagger.UString;
             Hos_Logs_Param : in InlineObject8Type;
             Result  : out .Models.HosLogsResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/hos_logs_summary
         procedure Get_Fleet_Hos_Logs_Summary
            (Access_Token : in Swagger.UString;
             Hos_Logs_Param : in InlineObject9Type;
             Result  : out .Models.HosLogsSummaryResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/locations
         procedure Get_Fleet_Locations
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject11Type;
             Result  : out .Models.InlineResponse2003Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/maintenance/list
         procedure Get_Fleet_Maintenance_List
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject13Type;
             Result  : out .Models.InlineResponse2004Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/trips
         procedure Get_Fleet_Trips
            (Access_Token : in Swagger.UString;
             Trips_Param : in InlineObject15Type;
             Result  : out .Models.TripResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Fleet_Vehicle
            (Access_Token : in Swagger.UString;
             Vehicle_Id_Or_External_Id : in Swagger.UString;
             Result  : out .Models.FleetVehicleResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /addresses/{addressId}
         procedure Get_Organization_Address
            (Access_Token : in Swagger.UString;
             Address_Id : in Swagger.Long;
             Result  : out .Models.AddressType;
             Context : in out Swagger.Servers.Context_Type);

         --  /addresses
         procedure Get_Organization_Addresses
            (Access_Token : in Swagger.UString;
             Result  : out .Models.AddressType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /contacts/{contact_id}
         procedure Get_Organization_Contact
            (Access_Token : in Swagger.UString;
             Contact_Id : in Swagger.Long;
             Result  : out .Models.ContactType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
         procedure Get_Vehicle_Harsh_Event
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Timestamp : in Swagger.Long;
             Result  : out .Models.VehicleHarshEventResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
         procedure Get_Vehicle_Locations
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out .Models.FleetVehicleLocationType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
         procedure Get_Vehicle_Safety_Score
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out .Models.VehicleSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/stats
         procedure Get_Vehicle_Stats
            (Access_Token : in Swagger.UString;
             Start_Ms : in Integer;
             End_Ms : in Integer;
             Series : in Swagger.Nullable_UString;
             Tag_Ids : in Swagger.Nullable_UString;
             Starting_After : in Swagger.Nullable_UString;
             Ending_Before : in Swagger.Nullable_UString;
             Limit : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse2005Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/locations
         procedure Get_Vehicles_Locations
            (Access_Token : in Swagger.UString;
             Start_Ms : in Integer;
             End_Ms : in Integer;
             Result  : out Swagger.Object_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /contacts
         procedure List_Contacts
            (Access_Token : in Swagger.UString;
             Result  : out .Models.ContactType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/list
         procedure List_Fleet
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject10Type;
             Starting_After : in Swagger.Nullable_UString;
             Ending_Before : in Swagger.Nullable_UString;
             Limit : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse2002Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Patch_Fleet_Vehicle
            (Access_Token : in Swagger.UString;
             Vehicle_Id_Or_External_Id : in Swagger.UString;
             Data : in InlineObject16Type;
             Result  : out .Models.FleetVehicleResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Reactivate_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Reactivate_Driver_Param : in InlineObject4Type;
             Result  : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Update_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Update_Dispatch_Route_Params : in DispatchRouteType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /addresses/{addressId}
         procedure Update_Organization_Address
            (Access_Token : in Swagger.UString;
             Address_Id : in Swagger.Long;
             Address : in InlineObject1Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/set_data
         procedure Update_Vehicles
            (Access_Token : in Swagger.UString;
             Vehicle_Update_Param : in InlineObject14Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /industrial/data
         procedure Get_All_Data_Inputs
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Start_Ms : in Swagger.Nullable_Long;
             End_Ms : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse2006Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /industrial/data/{data_input_id:[0_9]+}
         procedure Get_Data_Input
            (Access_Token : in Swagger.UString;
             Data_Input_Id : in Swagger.Long;
             Start_Ms : in Swagger.Nullable_Long;
             End_Ms : in Swagger.Nullable_Long;
             Result  : out .Models.DataInputHistoryResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /machines/list
         procedure Get_Machines
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject18Type;
             Result  : out .Models.InlineResponse2007Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /machines/history
         procedure Get_Machines_History
            (Access_Token : in Swagger.UString;
             History_Param : in InlineObject17Type;
             Result  : out .Models.MachineHistoryResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes
         procedure Create_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Create_Driver_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Create_Vehicle_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Delete_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes
         procedure Fetch_All_Dispatch_Routes
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/job_updates
         procedure Fetch_All_Route_Job_Updates
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Sequence_Id : in Swagger.Nullable_UString;
             Include : in Swagger.Nullable_UString;
             Result  : out .Models.AllRouteJobUpdatesType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}
         procedure Get_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
         procedure Get_Dispatch_Route_History
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Start_Time : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteHistoryType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Driver_Id
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result  : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Update_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Update_Dispatch_Route_Params : in DispatchRouteType;
             Result  : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/drivers/{driverId:[0_9]+}/safety/score
         procedure Get_Driver_Safety_Score
            (Driver_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out .Models.DriverSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
         procedure Get_Vehicle_Harsh_Event
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Timestamp : in Swagger.Long;
             Result  : out .Models.VehicleHarshEventResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
         procedure Get_Vehicle_Safety_Score
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result  : out .Models.VehicleSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /sensors/list
         procedure Get_Sensors
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject23Type;
             Result  : out .Models.InlineResponse2008Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /sensors/cargo
         procedure Get_Sensors_Cargo
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject19Type;
             Result  : out .Models.CargoResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /sensors/door
         procedure Get_Sensors_Door
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject20Type;
             Result  : out .Models.DoorResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /sensors/history
         procedure Get_Sensors_History
            (Access_Token : in Swagger.UString;
             History_Param : in InlineObject21Type;
             Result  : out .Models.SensorHistoryResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /sensors/humidity
         procedure Get_Sensors_Humidity
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject22Type;
             Result  : out .Models.HumidityResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /sensors/temperature
         procedure Get_Sensors_Temperature
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject24Type;
             Result  : out .Models.TemperatureResponseType;
             Context : in out Swagger.Servers.Context_Type);

         --  /tags
         procedure Create_Tag
            (Access_Token : in Swagger.UString;
             Tag_Create_Params : in TagCreateType;
             Result  : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type);

         --  /tags/{tag_id:[0_9]+}
         procedure Delete_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type);

         --  /tags
         procedure Get_All_Tags
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result  : out .Models.InlineResponse2009Type;
             Context : in out Swagger.Servers.Context_Type);

         --  /tags/{tag_id:[0_9]+}
         procedure Get_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Result  : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type);

         --  /tags/{tag_id:[0_9]+}
         procedure Modify_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Tag_Modify_Params : in TagModifyType;
             Result  : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type);

         --  /tags/{tag_id:[0_9]+}
         procedure Update_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Update_Tag_Params : in TagUpdateType;
             Result  : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type);

         --  /users/{userId:[0_9]+}
         procedure Delete_User_By_Id
            (Access_Token : in Swagger.UString;
             User_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type);

         --  /users/{userId:[0_9]+}
         procedure Get_User_By_Id
            (Access_Token : in Swagger.UString;
             User_Id : in Swagger.Long;
             Result  : out .Models.UserType;
             Context : in out Swagger.Servers.Context_Type);

         --  /user_roles
         procedure List_User_Roles
            (Access_Token : in Swagger.UString;
             Result  : out .Models.UserRoleType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

         --  /users
         procedure List_Users
            (Access_Token : in Swagger.UString;
             Result  : out .Models.UserType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type);

      private
         Impl : Implementation_Type;
      end Server;
   end Shared_Instance;

end .Skeletons;
