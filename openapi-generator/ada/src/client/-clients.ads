--  Samsara API
--  # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built_in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off_the_shelf HTTP clients. We allow you to interact securely with our API from a client_side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go_to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings_>Organization_>API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client_side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error_Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |_____________|________________|___________________________________________________________________| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en_us/sections/360000538054_APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
--
--  OpenAPI spec version: 1.0.0
--  
--
--  NOTE: This package is auto generated by the swagger code generator 4.0.0-SNAPSHOT.
--  https://openapi-generator.tech
--  Do not edit the class manually.
with .Models;
with Swagger.Clients;
package .Clients is

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  /fleet/assets/locations
   --  Fetch current locations of all assets for the group.
   procedure Get_All_Asset_Current_Locations
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse2001Type);

   --  /fleet/assets
   --  Fetch all of the assets for the group.
   procedure Get_All_Assets
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse200Type);

   --  /fleet/assets/{assetId:[0_9]+}/locations
   --  Fetch the historical locations for the asset.
   procedure Get_Asset_Location
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out Swagger.Object_Vectors.Vector);

   --  /fleet/assets/{assetId:[0_9]+}/reefer
   --  Fetch the reefer-specific stats of an asset.
   procedure Get_Asset_Reefer
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out .Models.AssetReeferResponseType);

   --  /fleet/drivers/create
   --  Create a new driver.
   procedure Create_Driver
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Create_Driver_Param : in .Models.DriverForCreateType;
       Result : out .Models.DriverType);

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Deactivate a driver with the given id.
   procedure Deactivate_Driver
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString);

   --  /fleet/drivers/inactive
   --  Fetch all deactivated drivers for the group.
   procedure Get_All_Deactivated_Drivers
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result : out .Models.DriverType_Vectors.Vector);

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch deactivated driver by id.
   procedure Get_Deactivated_Driver_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result : out .Models.DriverType);

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch driver by id.
   procedure Get_Driver_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result : out .Models.DriverType);

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Reactivate the inactive driver having id.
   procedure Reactivate_Driver_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Reactivate_Driver_Param : in .Models.InlineObject4Type;
       Result : out .Models.DriverType);

   --  /fleet/add_address
   --  This method adds an address book entry to the specified group.
   procedure Add_Fleet_Address
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Address_Param : in .Models.InlineObject2Type);

   --  /addresses
   --  Add one or more addresses to the organization
   procedure Add_Organization_Addresses
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Addresses : in .Models.InlineObjectType;
       Result : out .Models.AddressType_Vectors.Vector);

   --  /fleet/dispatch/routes
   --  Create a new dispatch route.
   procedure Create_Dispatch_Route
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Create_Dispatch_Route_Params : in .Models.DispatchRouteCreateType;
       Result : out .Models.DispatchRouteType);

   --  /fleet/drivers/create
   --  Create a new driver.
   procedure Create_Driver
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Create_Driver_Param : in .Models.DriverForCreateType;
       Result : out .Models.DriverType);

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the driver with driver_id.
   procedure Create_Driver_Dispatch_Route
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in .Models.DispatchRouteCreateType;
       Result : out .Models.DispatchRouteType);

   --  /fleet/drivers/{driver_id:[0_9]+}/documents
   --  Create a driver document for the given driver.
   procedure Create_Driver_Document
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Create_Document_Params : in .Models.DocumentCreateType;
       Result : out .Models.DocumentType);

   --  /fleet/maintenance/dvirs
   --  Create a new dvir, marking a vehicle or trailer safe or unsafe.
   procedure Create_Dvir
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Create_Dvir_Param : in .Models.InlineObject12Type;
       Result : out .Models.DvirBaseType);

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the vehicle with vehicle_id.
   procedure Create_Vehicle_Dispatch_Route
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in .Models.DispatchRouteCreateType;
       Result : out .Models.DispatchRouteType);

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Deactivate a driver with the given id.
   procedure Deactivate_Driver
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Delete a dispatch route and its associated jobs.
   procedure Delete_Dispatch_Route_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long);

   --  /addresses/{addressId}
   --  Delete an address.
   procedure Delete_Organization_Address
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Address_Id : in Swagger.Long);

   --  /fleet/dispatch/routes
   --  Fetch all of the dispatch routes for the group.
   procedure Fetch_All_Dispatch_Routes
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteType_Vectors.Vector);

   --  /fleet/dispatch/routes/job_updates
   --  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   procedure Fetch_All_Route_Job_Updates
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Sequence_Id : in Swagger.Nullable_UString;
       Include : in Swagger.Nullable_UString;
       Result : out .Models.AllRouteJobUpdatesType);

   --  /fleet/assets/locations
   --  Fetch current locations of all assets for the group.
   procedure Get_All_Asset_Current_Locations
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse2001Type);

   --  /fleet/assets
   --  Fetch all of the assets for the group.
   procedure Get_All_Assets
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse200Type);

   --  /fleet/drivers/inactive
   --  Fetch all deactivated drivers for the group.
   procedure Get_All_Deactivated_Drivers
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result : out .Models.DriverType_Vectors.Vector);

   --  /fleet/assets/{assetId:[0_9]+}/locations
   --  Fetch the historical locations for the asset.
   procedure Get_Asset_Location
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out Swagger.Object_Vectors.Vector);

   --  /fleet/assets/{assetId:[0_9]+}/reefer
   --  Fetch the reefer-specific stats of an asset.
   procedure Get_Asset_Reefer
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Asset_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out .Models.AssetReeferResponseType);

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch deactivated driver by id.
   procedure Get_Deactivated_Driver_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result : out .Models.DriverType);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}
   --  Fetch a dispatch route by id.
   procedure Get_Dispatch_Route_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Result : out .Models.DispatchRouteType);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
   --  Fetch the history of a dispatch route.
   procedure Get_Dispatch_Route_History
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Start_Time : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteHistoryType);

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given driver.
   procedure Get_Dispatch_Routes_By_Driver_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteType_Vectors.Vector);

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given vehicle.
   procedure Get_Dispatch_Routes_By_Vehicle_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteType_Vectors.Vector);

   --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Fetch driver by id.
   procedure Get_Driver_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Result : out .Models.DriverType);

   --  /fleet/drivers/document_types
   --  Fetch all of the document types.
   procedure Get_Driver_Document_Types_By_Org_Id
      (Client : in out Client_Type;
       Result : out .Models.DocumentTypeType_Vectors.Vector);

   --  /fleet/drivers/documents
   --  Fetch all of the documents.
   procedure Get_Driver_Documents_By_Org_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       End_Ms : in Swagger.Nullable_Long;
       Duration_Ms : in Swagger.Nullable_Long;
       Result : out .Models.DocumentType_Vectors.Vector);

   --  /fleet/drivers/{driverId:[0_9]+}/safety/score
   --  Fetch the safety score for the driver.
   procedure Get_Driver_Safety_Score
      (Client : in out Client_Type;
       Driver_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out .Models.DriverSafetyScoreResponseType);

   --  /fleet/maintenance/dvirs
   --  Get DVIRs for the org within provided time constraints
   procedure Get_Dvirs
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       End_Ms : in Integer;
       Duration_Ms : in Integer;
       Group_Id : in Swagger.Nullable_Integer;
       Result : out .Models.DvirListResponseType);

   --  /fleet/drivers
   --  Get all the drivers for the specified group.
   procedure Get_Fleet_Drivers
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Drivers_Param : in .Models.InlineObject3Type;
       Result : out .Models.DriversResponseType);

   --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
   --  Get summarized daily HOS charts for a specified driver.
   procedure Get_Fleet_Drivers_Hos_Daily_Logs
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Hos_Logs_Param : in .Models.InlineObject6Type;
       Result : out .Models.DriverDailyLogResponseType);

   --  /fleet/drivers/summary
   --  Get the distance and time each driver in an organization has driven in a given time period.
   procedure Get_Fleet_Drivers_Summary
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Drivers_Summary_Param : in .Models.InlineObject5Type;
       Snap_To_Day_Bounds : in Swagger.Nullable_Boolean;
       Result : out .Models.DriversSummaryResponseType);

   --  /fleet/hos_authentication_logs
   --  Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
   procedure Get_Fleet_Hos_Authentication_Logs
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Hos_Authentication_Logs_Param : in .Models.InlineObject7Type;
       Result : out .Models.HosAuthenticationLogsResponseType);

   --  /fleet/hos_logs
   --  Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
   procedure Get_Fleet_Hos_Logs
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Hos_Logs_Param : in .Models.InlineObject8Type;
       Result : out .Models.HosLogsResponseType);

   --  /fleet/hos_logs_summary
   --  Get the current HOS status for all drivers in the group.
   procedure Get_Fleet_Hos_Logs_Summary
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Hos_Logs_Param : in .Models.InlineObject9Type;
       Result : out .Models.HosLogsSummaryResponseType);

   --  /fleet/locations
   --  Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
   procedure Get_Fleet_Locations
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in .Models.InlineObject11Type;
       Result : out .Models.InlineResponse2003Type);

   --  /fleet/maintenance/list
   --  Get list of the vehicles with any engine faults or check light data.
   procedure Get_Fleet_Maintenance_List
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in .Models.InlineObject13Type;
       Result : out .Models.InlineResponse2004Type);

   --  /fleet/trips
   --  Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
   procedure Get_Fleet_Trips
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Trips_Param : in .Models.InlineObject15Type;
       Result : out .Models.TripResponseType);

   --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Gets a specific vehicle.
   procedure Get_Fleet_Vehicle
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id_Or_External_Id : in Swagger.UString;
       Result : out .Models.FleetVehicleResponseType);

   --  /addresses/{addressId}
   --  Fetch an address by its id.
   procedure Get_Organization_Address
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Address_Id : in Swagger.Long;
       Result : out .Models.AddressType);

   --  /addresses
   --  Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
   procedure Get_Organization_Addresses
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Result : out .Models.AddressType_Vectors.Vector);

   --  /contacts/{contact_id}
   --  Fetch a contact by its id.
   procedure Get_Organization_Contact
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Contact_Id : in Swagger.Long;
       Result : out .Models.ContactType);

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
   --  Fetch harsh event details for a vehicle.
   procedure Get_Vehicle_Harsh_Event
      (Client : in out Client_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Timestamp : in Swagger.Long;
       Result : out .Models.VehicleHarshEventResponseType);

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
   --  Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
   procedure Get_Vehicle_Locations
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out .Models.FleetVehicleLocationType_Vectors.Vector);

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
   --  Fetch the safety score for the vehicle.
   procedure Get_Vehicle_Safety_Score
      (Client : in out Client_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out .Models.VehicleSafetyScoreResponseType);

   --  /fleet/vehicles/stats
   --  Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
   procedure Get_Vehicle_Stats
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Start_Ms : in Integer;
       End_Ms : in Integer;
       Series : in Swagger.Nullable_UString;
       Tag_Ids : in Swagger.Nullable_UString;
       Starting_After : in Swagger.Nullable_UString;
       Ending_Before : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse2005Type);

   --  /fleet/vehicles/locations
   --  Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
   procedure Get_Vehicles_Locations
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Start_Ms : in Integer;
       End_Ms : in Integer;
       Result : out Swagger.Object_Vectors.Vector);

   --  /contacts
   --  Fetch all contacts for the organization.
   procedure List_Contacts
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Result : out .Models.ContactType_Vectors.Vector);

   --  /fleet/list
   --  Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
   procedure List_Fleet
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in .Models.InlineObject10Type;
       Starting_After : in Swagger.Nullable_UString;
       Ending_Before : in Swagger.Nullable_UString;
       Limit : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse2002Type);

   --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
   procedure Patch_Fleet_Vehicle
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id_Or_External_Id : in Swagger.UString;
       Data : in .Models.InlineObject16Type;
       Result : out .Models.FleetVehicleResponseType);

   --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
   --  Reactivate the inactive driver having id.
   procedure Reactivate_Driver_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id_Or_External_Id : in Swagger.UString;
       Reactivate_Driver_Param : in .Models.InlineObject4Type;
       Result : out .Models.DriverType);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Update a dispatch route and its associated jobs.
   procedure Update_Dispatch_Route_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Update_Dispatch_Route_Params : in .Models.DispatchRouteType;
       Result : out .Models.DispatchRouteType);

   --  /addresses/{addressId}
   --  Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
   procedure Update_Organization_Address
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Address_Id : in Swagger.Long;
       Address : in .Models.InlineObject1Type);

   --  /fleet/set_data
   --  This method enables the mutation of metadata for vehicles in the Samsara Cloud.
   procedure Update_Vehicles
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Update_Param : in .Models.InlineObject14Type);

   --  /industrial/data
   --  Fetch all of the data inputs for a group.
   procedure Get_All_Data_Inputs
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Start_Ms : in Swagger.Nullable_Long;
       End_Ms : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse2006Type);

   --  /industrial/data/{data_input_id:[0_9]+}
   --  Fetch datapoints from a given data input.
   procedure Get_Data_Input
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Data_Input_Id : in Swagger.Long;
       Start_Ms : in Swagger.Nullable_Long;
       End_Ms : in Swagger.Nullable_Long;
       Result : out .Models.DataInputHistoryResponseType);

   --  /machines/list
   --  Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
   procedure Get_Machines
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in .Models.InlineObject18Type;
       Result : out .Models.InlineResponse2007Type);

   --  /machines/history
   --  Get historical data for machine objects. This method returns a set of historical data for all machines in a group
   procedure Get_Machines_History
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       History_Param : in .Models.InlineObject17Type;
       Result : out .Models.MachineHistoryResponseType);

   --  /fleet/dispatch/routes
   --  Create a new dispatch route.
   procedure Create_Dispatch_Route
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Create_Dispatch_Route_Params : in .Models.DispatchRouteCreateType;
       Result : out .Models.DispatchRouteType);

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the driver with driver_id.
   procedure Create_Driver_Dispatch_Route
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in .Models.DispatchRouteCreateType;
       Result : out .Models.DispatchRouteType);

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Create a new dispatch route for the vehicle with vehicle_id.
   procedure Create_Vehicle_Dispatch_Route
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       Create_Dispatch_Route_Params : in .Models.DispatchRouteCreateType;
       Result : out .Models.DispatchRouteType);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Delete a dispatch route and its associated jobs.
   procedure Delete_Dispatch_Route_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long);

   --  /fleet/dispatch/routes
   --  Fetch all of the dispatch routes for the group.
   procedure Fetch_All_Dispatch_Routes
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteType_Vectors.Vector);

   --  /fleet/dispatch/routes/job_updates
   --  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
   procedure Fetch_All_Route_Job_Updates
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Sequence_Id : in Swagger.Nullable_UString;
       Include : in Swagger.Nullable_UString;
       Result : out .Models.AllRouteJobUpdatesType);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}
   --  Fetch a dispatch route by id.
   procedure Get_Dispatch_Route_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Result : out .Models.DispatchRouteType);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
   --  Fetch the history of a dispatch route.
   procedure Get_Dispatch_Route_History
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Start_Time : in Swagger.Nullable_Long;
       End_Time : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteHistoryType);

   --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given driver.
   procedure Get_Dispatch_Routes_By_Driver_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Driver_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteType_Vectors.Vector);

   --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
   --  Fetch all of the dispatch routes for a given vehicle.
   procedure Get_Dispatch_Routes_By_Vehicle_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Vehicle_Id : in Swagger.Long;
       End_Time : in Swagger.Nullable_Long;
       Duration : in Swagger.Nullable_Long;
       Result : out .Models.DispatchRouteType_Vectors.Vector);

   --  /fleet/dispatch/routes/{route_id:[0_9]+}/
   --  Update a dispatch route and its associated jobs.
   procedure Update_Dispatch_Route_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Route_Id : in Swagger.Long;
       Update_Dispatch_Route_Params : in .Models.DispatchRouteType;
       Result : out .Models.DispatchRouteType);

   --  /fleet/drivers/{driverId:[0_9]+}/safety/score
   --  Fetch the safety score for the driver.
   procedure Get_Driver_Safety_Score
      (Client : in out Client_Type;
       Driver_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out .Models.DriverSafetyScoreResponseType);

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
   --  Fetch harsh event details for a vehicle.
   procedure Get_Vehicle_Harsh_Event
      (Client : in out Client_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Timestamp : in Swagger.Long;
       Result : out .Models.VehicleHarshEventResponseType);

   --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
   --  Fetch the safety score for the vehicle.
   procedure Get_Vehicle_Safety_Score
      (Client : in out Client_Type;
       Vehicle_Id : in Swagger.Long;
       Access_Token : in Swagger.UString;
       Start_Ms : in Swagger.Long;
       End_Ms : in Swagger.Long;
       Result : out .Models.VehicleSafetyScoreResponseType);

   --  /sensors/list
   --  Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
   procedure Get_Sensors
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Param : in .Models.InlineObject23Type;
       Result : out .Models.InlineResponse2008Type);

   --  /sensors/cargo
   --  Get cargo monitor status (empty / full) for requested sensors.
   procedure Get_Sensors_Cargo
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in .Models.InlineObject19Type;
       Result : out .Models.CargoResponseType);

   --  /sensors/door
   --  Get door monitor status (closed / open) for requested sensors.
   procedure Get_Sensors_Door
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in .Models.InlineObject20Type;
       Result : out .Models.DoorResponseType);

   --  /sensors/history
   --  Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
   procedure Get_Sensors_History
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       History_Param : in .Models.InlineObject21Type;
       Result : out .Models.SensorHistoryResponseType);

   --  /sensors/humidity
   --  Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
   procedure Get_Sensors_Humidity
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in .Models.InlineObject22Type;
       Result : out .Models.HumidityResponseType);

   --  /sensors/temperature
   --  Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
   procedure Get_Sensors_Temperature
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Sensor_Param : in .Models.InlineObject24Type;
       Result : out .Models.TemperatureResponseType);

   --  /tags
   --  Create a new tag for the group.
   procedure Create_Tag
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Tag_Create_Params : in .Models.TagCreateType;
       Result : out .Models.TagType);

   --  /tags/{tag_id:[0_9]+}
   --  Permanently deletes a tag.
   procedure Delete_Tag_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long);

   --  /tags
   --  Fetch all of the tags for a group.
   procedure Get_All_Tags
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Group_Id : in Swagger.Nullable_Long;
       Result : out .Models.InlineResponse2009Type);

   --  /tags/{tag_id:[0_9]+}
   --  Fetch a tag by id.
   procedure Get_Tag_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long;
       Result : out .Models.TagType);

   --  /tags/{tag_id:[0_9]+}
   --  Add or delete specific members from a tag, or modify the name of a tag.
   procedure Modify_Tag_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long;
       Tag_Modify_Params : in .Models.TagModifyType;
       Result : out .Models.TagType);

   --  /tags/{tag_id:[0_9]+}
   --  Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
   procedure Update_Tag_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Tag_Id : in Swagger.Long;
       Update_Tag_Params : in .Models.TagUpdateType;
       Result : out .Models.TagType);

   --  /users/{userId:[0_9]+}
   --  Remove a user from the organization.
   procedure Delete_User_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       User_Id : in Swagger.Long);

   --  /users/{userId:[0_9]+}
   --  Get a user.
   procedure Get_User_By_Id
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       User_Id : in Swagger.Long;
       Result : out .Models.UserType);

   --  /user_roles
   --  Get all roles in the organization.
   procedure List_User_Roles
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Result : out .Models.UserRoleType_Vectors.Vector);

   --  /users
   --  List all users in the organization.
   procedure List_Users
      (Client : in out Client_Type;
       Access_Token : in Swagger.UString;
       Result : out .Models.UserType_Vectors.Vector);

end .Clients;
