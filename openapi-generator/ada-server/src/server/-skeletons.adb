--  Samsara API
--  # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built_in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off_the_shelf HTTP clients. We allow you to interact securely with our API from a client_side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go_to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings_>Organization_>API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client_side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error_Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |_____________|________________|___________________________________________________________________| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en_us/sections/360000538054_APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
--
--  OpenAPI spec version: 1.0.0
--  
--
--  NOTE: This package is auto generated by the swagger code generator 4.0.0-SNAPSHOT.
--  https://openapi-generator.tech
--  Do not edit the class manually.
with Swagger.Streams;
with Swagger.Servers.Operation;
package body .Skeletons is

   package body Skeleton is


      package API_Get_All_Asset_Current_Locations is
         new Swagger.Servers.Operation (Handler => Get_All_Asset_Current_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/locations");

      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2001Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_All_Asset_Current_Locations
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Asset_Current_Locations;

      package API_Get_All_Assets is
         new Swagger.Servers.Operation (Handler => Get_All_Assets,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets");

      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse200Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_All_Assets
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Assets;

      package API_Get_Asset_Location is
         new Swagger.Servers.Operation (Handler => Get_Asset_Location,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/locations");

      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : Swagger.Object_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Impl.Get_Asset_Location
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Location;

      package API_Get_Asset_Reefer is
         new Swagger.Servers.Operation (Handler => Get_Asset_Reefer,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/reefer");

      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.AssetReeferResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Impl.Get_Asset_Reefer
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Reefer;

      package API_Create_Driver is
         new Swagger.Servers.Operation (Handler => Create_Driver,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/create");

      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Create_Driver_Param : DriverForCreateType;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDriverParam", Create_Driver_Param);
         Impl.Create_Driver
            (Access_Token,
             Create_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver;

      package API_Deactivate_Driver is
         new Swagger.Servers.Operation (Handler => Deactivate_Driver,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Impl.Deactivate_Driver
            (Access_Token,
             Driver_Id_Or_External_Id, Context);

      end Deactivate_Driver;

      package API_Get_All_Deactivated_Drivers is
         new Swagger.Servers.Operation (Handler => Get_All_Deactivated_Drivers,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive");

      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.DriverType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_All_Deactivated_Drivers
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Deactivated_Drivers;

      package API_Get_Deactivated_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Deactivated_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Impl.Get_Deactivated_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Deactivated_Driver_By_Id;

      package API_Get_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Impl.Get_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_By_Id;

      package API_Reactivate_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Reactivate_Driver_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Reactivate_Driver_Param : InlineObject4Type;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "reactivateDriverParam", Reactivate_Driver_Param);
         Impl.Reactivate_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id,
             Reactivate_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Reactivate_Driver_By_Id;

      package API_Add_Fleet_Address is
         new Swagger.Servers.Operation (Handler => Add_Fleet_Address,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/add_address");

      --  /fleet/add_address
      procedure Add_Fleet_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Address_Param : InlineObject2Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "addressParam", Address_Param);
         Impl.Add_Fleet_Address
            (Access_Token,
             Address_Param, Context);

      end Add_Fleet_Address;

      package API_Add_Organization_Addresses is
         new Swagger.Servers.Operation (Handler => Add_Organization_Addresses,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/addresses");

      --  /addresses
      procedure Add_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Addresses : InlineObjectType;
         Result : .Models.AddressType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "addresses", Addresses);
         Impl.Add_Organization_Addresses
            (Access_Token,
             Addresses, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Add_Organization_Addresses;

      package API_Create_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Impl.Create_Dispatch_Route
            (Access_Token,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Dispatch_Route;

      package API_Create_Driver is
         new Swagger.Servers.Operation (Handler => Create_Driver,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/create");

      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Create_Driver_Param : DriverForCreateType;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDriverParam", Create_Driver_Param);
         Impl.Create_Driver
            (Access_Token,
             Create_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver;

      package API_Create_Driver_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Driver_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Impl.Create_Driver_Dispatch_Route
            (Access_Token,
             Driver_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver_Dispatch_Route;

      package API_Create_Driver_Document is
         new Swagger.Servers.Operation (Handler => Create_Driver_Document,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/documents");

      --  /fleet/drivers/{driver_id:[0_9]+}/documents
      procedure Create_Driver_Document
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Create_Document_Params : DocumentCreateType;
         Result : .Models.DocumentType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDocumentParams", Create_Document_Params);
         Impl.Create_Driver_Document
            (Access_Token,
             Driver_Id,
             Create_Document_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver_Document;

      package API_Create_Dvir is
         new Swagger.Servers.Operation (Handler => Create_Dvir,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/maintenance/dvirs");

      --  /fleet/maintenance/dvirs
      procedure Create_Dvir
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Create_Dvir_Param : InlineObject12Type;
         Result : .Models.DvirBaseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDvirParam", Create_Dvir_Param);
         Impl.Create_Dvir
            (Access_Token,
             Create_Dvir_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Dvir;

      package API_Create_Vehicle_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Vehicle_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Impl.Create_Vehicle_Dispatch_Route
            (Access_Token,
             Vehicle_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Vehicle_Dispatch_Route;

      package API_Deactivate_Driver is
         new Swagger.Servers.Operation (Handler => Deactivate_Driver,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Impl.Deactivate_Driver
            (Access_Token,
             Driver_Id_Or_External_Id, Context);

      end Deactivate_Driver;

      package API_Delete_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Impl.Delete_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Context);

      end Delete_Dispatch_Route_By_Id;

      package API_Delete_Organization_Address is
         new Swagger.Servers.Operation (Handler => Delete_Organization_Address,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/addresses/{addressId}");

      --  /addresses/{addressId}
      procedure Delete_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Address_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Address_Id);
         Impl.Delete_Organization_Address
            (Access_Token,
             Address_Id, Context);

      end Delete_Organization_Address;

      package API_Fetch_All_Dispatch_Routes is
         new Swagger.Servers.Operation (Handler => Fetch_All_Dispatch_Routes,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Impl.Fetch_All_Dispatch_Routes
            (Access_Token,
             Group_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Dispatch_Routes;

      package API_Fetch_All_Route_Job_Updates is
         new Swagger.Servers.Operation (Handler => Fetch_All_Route_Job_Updates,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/job_updates");

      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Sequence_Id : Swagger.Nullable_UString;
         Include : Swagger.Nullable_UString;
         Result : .Models.AllRouteJobUpdatesType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "sequence_id", Sequence_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "include", Include);
         Impl.Fetch_All_Route_Job_Updates
            (Access_Token,
             Group_Id,
             Sequence_Id,
             Include, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Route_Job_Updates;

      package API_Get_All_Asset_Current_Locations is
         new Swagger.Servers.Operation (Handler => Get_All_Asset_Current_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/locations");

      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2001Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_All_Asset_Current_Locations
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Asset_Current_Locations;

      package API_Get_All_Assets is
         new Swagger.Servers.Operation (Handler => Get_All_Assets,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets");

      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse200Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_All_Assets
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Assets;

      package API_Get_All_Deactivated_Drivers is
         new Swagger.Servers.Operation (Handler => Get_All_Deactivated_Drivers,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive");

      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.DriverType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_All_Deactivated_Drivers
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Deactivated_Drivers;

      package API_Get_Asset_Location is
         new Swagger.Servers.Operation (Handler => Get_Asset_Location,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/locations");

      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : Swagger.Object_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Impl.Get_Asset_Location
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Location;

      package API_Get_Asset_Reefer is
         new Swagger.Servers.Operation (Handler => Get_Asset_Reefer,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/reefer");

      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.AssetReeferResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Impl.Get_Asset_Reefer
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Reefer;

      package API_Get_Deactivated_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Deactivated_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Impl.Get_Deactivated_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Deactivated_Driver_By_Id;

      package API_Get_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Impl.Get_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_By_Id;

      package API_Get_Dispatch_Route_History is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_History,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}/history");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Start_Time : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteHistoryType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "start_time", Start_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Impl.Get_Dispatch_Route_History
            (Access_Token,
             Route_Id,
             Start_Time,
             End_Time, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_History;

      package API_Get_Dispatch_Routes_By_Driver_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Driver_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Impl.Get_Dispatch_Routes_By_Driver_Id
            (Access_Token,
             Driver_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Driver_Id;

      package API_Get_Dispatch_Routes_By_Vehicle_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Vehicle_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Impl.Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token,
             Vehicle_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Vehicle_Id;

      package API_Get_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Impl.Get_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_By_Id;

      package API_Get_Driver_Document_Types_By_Org_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_Document_Types_By_Org_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/document_types");

      --  /fleet/drivers/document_types
      procedure Get_Driver_Document_Types_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Result : .Models.DocumentTypeType_Vectors.Vector;
      begin
         Impl.Get_Driver_Document_Types_By_Org_Id (Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Document_Types_By_Org_Id;

      package API_Get_Driver_Documents_By_Org_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_Documents_By_Org_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/documents");

      --  /fleet/drivers/documents
      procedure Get_Driver_Documents_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         End_Ms : Swagger.Nullable_Long;
         Duration_Ms : Swagger.Nullable_Long;
         Result : .Models.DocumentType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "durationMs", Duration_Ms);
         Impl.Get_Driver_Documents_By_Org_Id
            (Access_Token,
             End_Ms,
             Duration_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Documents_By_Org_Id;

      package API_Get_Driver_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Driver_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driverId}/safety/score");

      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Driver_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.DriverSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Impl.Get_Driver_Safety_Score
            (Driver_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Safety_Score;

      package API_Get_Dvirs is
         new Swagger.Servers.Operation (Handler => Get_Dvirs,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/maintenance/dvirs");

      --  /fleet/maintenance/dvirs
      procedure Get_Dvirs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         End_Ms : Integer;
         Duration_Ms : Integer;
         Group_Id : Swagger.Nullable_Integer;
         Result : .Models.DvirListResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_ms", End_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "duration_ms", Duration_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_Dvirs
            (Access_Token,
             End_Ms,
             Duration_Ms,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dvirs;

      package API_Get_Fleet_Drivers is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Drivers,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers");

      --  /fleet/drivers
      procedure Get_Fleet_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Drivers_Param : InlineObject3Type;
         Result : .Models.DriversResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupDriversParam", Group_Drivers_Param);
         Impl.Get_Fleet_Drivers
            (Access_Token,
             Group_Drivers_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Drivers;

      package API_Get_Fleet_Drivers_Hos_Daily_Logs is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Drivers_Hos_Daily_Logs,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/hos_daily_logs");

      --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
      procedure Get_Fleet_Drivers_Hos_Daily_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Hos_Logs_Param : InlineObject6Type;
         Result : .Models.DriverDailyLogResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosLogsParam", Hos_Logs_Param);
         Impl.Get_Fleet_Drivers_Hos_Daily_Logs
            (Access_Token,
             Driver_Id,
             Hos_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Drivers_Hos_Daily_Logs;

      package API_Get_Fleet_Drivers_Summary is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Drivers_Summary,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/summary");

      --  /fleet/drivers/summary
      procedure Get_Fleet_Drivers_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Drivers_Summary_Param : InlineObject5Type;
         Snap_To_Day_Bounds : Swagger.Nullable_Boolean;
         Result : .Models.DriversSummaryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "snap_to_day_bounds", Snap_To_Day_Bounds);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "driversSummaryParam", Drivers_Summary_Param);
         Impl.Get_Fleet_Drivers_Summary
            (Access_Token,
             Drivers_Summary_Param,
             Snap_To_Day_Bounds, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Drivers_Summary;

      package API_Get_Fleet_Hos_Authentication_Logs is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Hos_Authentication_Logs,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/hos_authentication_logs");

      --  /fleet/hos_authentication_logs
      procedure Get_Fleet_Hos_Authentication_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Hos_Authentication_Logs_Param : InlineObject7Type;
         Result : .Models.HosAuthenticationLogsResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosAuthenticationLogsParam", Hos_Authentication_Logs_Param);
         Impl.Get_Fleet_Hos_Authentication_Logs
            (Access_Token,
             Hos_Authentication_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Hos_Authentication_Logs;

      package API_Get_Fleet_Hos_Logs is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Hos_Logs,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/hos_logs");

      --  /fleet/hos_logs
      procedure Get_Fleet_Hos_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Hos_Logs_Param : InlineObject8Type;
         Result : .Models.HosLogsResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosLogsParam", Hos_Logs_Param);
         Impl.Get_Fleet_Hos_Logs
            (Access_Token,
             Hos_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Hos_Logs;

      package API_Get_Fleet_Hos_Logs_Summary is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Hos_Logs_Summary,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/hos_logs_summary");

      --  /fleet/hos_logs_summary
      procedure Get_Fleet_Hos_Logs_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Hos_Logs_Param : InlineObject9Type;
         Result : .Models.HosLogsSummaryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosLogsParam", Hos_Logs_Param);
         Impl.Get_Fleet_Hos_Logs_Summary
            (Access_Token,
             Hos_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Hos_Logs_Summary;

      package API_Get_Fleet_Locations is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Locations,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/locations");

      --  /fleet/locations
      procedure Get_Fleet_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject11Type;
         Result : .Models.InlineResponse2003Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Impl.Get_Fleet_Locations
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Locations;

      package API_Get_Fleet_Maintenance_List is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Maintenance_List,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/maintenance/list");

      --  /fleet/maintenance/list
      procedure Get_Fleet_Maintenance_List
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject13Type;
         Result : .Models.InlineResponse2004Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Impl.Get_Fleet_Maintenance_List
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Maintenance_List;

      package API_Get_Fleet_Trips is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Trips,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/trips");

      --  /fleet/trips
      procedure Get_Fleet_Trips
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Trips_Param : InlineObject15Type;
         Result : .Models.TripResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "tripsParam", Trips_Param);
         Impl.Get_Fleet_Trips
            (Access_Token,
             Trips_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Trips;

      package API_Get_Fleet_Vehicle is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Vehicle,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id_or_external_id}");

      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id_Or_External_Id : Swagger.UString;
         Result : .Models.FleetVehicleResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id_Or_External_Id);
         Impl.Get_Fleet_Vehicle
            (Access_Token,
             Vehicle_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Vehicle;

      package API_Get_Organization_Address is
         new Swagger.Servers.Operation (Handler => Get_Organization_Address,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/addresses/{addressId}");

      --  /addresses/{addressId}
      procedure Get_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Address_Id : Swagger.Long;
         Result : .Models.AddressType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Address_Id);
         Impl.Get_Organization_Address
            (Access_Token,
             Address_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Organization_Address;

      package API_Get_Organization_Addresses is
         new Swagger.Servers.Operation (Handler => Get_Organization_Addresses,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/addresses");

      --  /addresses
      procedure Get_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Result : .Models.AddressType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Impl.Get_Organization_Addresses
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Organization_Addresses;

      package API_Get_Organization_Contact is
         new Swagger.Servers.Operation (Handler => Get_Organization_Contact,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/contacts/{contact_id}");

      --  /contacts/{contact_id}
      procedure Get_Organization_Contact
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Contact_Id : Swagger.Long;
         Result : .Models.ContactType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Contact_Id);
         Impl.Get_Organization_Contact
            (Access_Token,
             Contact_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Organization_Contact;

      package API_Get_Vehicle_Harsh_Event is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Harsh_Event,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/harsh_event");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Timestamp : Swagger.Long;
         Result : .Models.VehicleHarshEventResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "timestamp", Timestamp);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Impl.Get_Vehicle_Harsh_Event
            (Vehicle_Id,
             Access_Token,
             Timestamp, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Harsh_Event;

      package API_Get_Vehicle_Locations is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/locations");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
      procedure Get_Vehicle_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.FleetVehicleLocationType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Impl.Get_Vehicle_Locations
            (Access_Token,
             Vehicle_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Locations;

      package API_Get_Vehicle_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/score");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.VehicleSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Impl.Get_Vehicle_Safety_Score
            (Vehicle_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Safety_Score;

      package API_Get_Vehicle_Stats is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Stats,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/stats");

      --  /fleet/vehicles/stats
      procedure Get_Vehicle_Stats
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Start_Ms : Integer;
         End_Ms : Integer;
         Series : Swagger.Nullable_UString;
         Tag_Ids : Swagger.Nullable_UString;
         Starting_After : Swagger.Nullable_UString;
         Ending_Before : Swagger.Nullable_UString;
         Limit : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2005Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "series", Series);
         Swagger.Servers.Get_Query_Parameter (Req, "tagIds", Tag_Ids);
         Swagger.Servers.Get_Query_Parameter (Req, "startingAfter", Starting_After);
         Swagger.Servers.Get_Query_Parameter (Req, "endingBefore", Ending_Before);
         Swagger.Servers.Get_Query_Parameter (Req, "limit", Limit);
         Impl.Get_Vehicle_Stats
            (Access_Token,
             Start_Ms,
             End_Ms,
             Series,
             Tag_Ids,
             Starting_After,
             Ending_Before,
             Limit, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Stats;

      package API_Get_Vehicles_Locations is
         new Swagger.Servers.Operation (Handler => Get_Vehicles_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/locations");

      --  /fleet/vehicles/locations
      procedure Get_Vehicles_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Start_Ms : Integer;
         End_Ms : Integer;
         Result : Swagger.Object_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Impl.Get_Vehicles_Locations
            (Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicles_Locations;

      package API_List_Contacts is
         new Swagger.Servers.Operation (Handler => List_Contacts,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/contacts");

      --  /contacts
      procedure List_Contacts
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Result : .Models.ContactType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Impl.List_Contacts
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_Contacts;

      package API_List_Fleet is
         new Swagger.Servers.Operation (Handler => List_Fleet,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/list");

      --  /fleet/list
      procedure List_Fleet
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject10Type;
         Starting_After : Swagger.Nullable_UString;
         Ending_Before : Swagger.Nullable_UString;
         Limit : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2002Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startingAfter", Starting_After);
         Swagger.Servers.Get_Query_Parameter (Req, "endingBefore", Ending_Before);
         Swagger.Servers.Get_Query_Parameter (Req, "limit", Limit);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Impl.List_Fleet
            (Access_Token,
             Group_Param,
             Starting_After,
             Ending_Before,
             Limit, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_Fleet;

      package API_Patch_Fleet_Vehicle is
         new Swagger.Servers.Operation (Handler => Patch_Fleet_Vehicle,
                                        Method  => Swagger.Servers.PATCH,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id_or_external_id}");

      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Patch_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id_Or_External_Id : Swagger.UString;
         Data : InlineObject16Type;
         Result : .Models.FleetVehicleResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id_Or_External_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "data", Data);
         Impl.Patch_Fleet_Vehicle
            (Access_Token,
             Vehicle_Id_Or_External_Id,
             Data, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Patch_Fleet_Vehicle;

      package API_Reactivate_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Reactivate_Driver_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Reactivate_Driver_Param : InlineObject4Type;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "reactivateDriverParam", Reactivate_Driver_Param);
         Impl.Reactivate_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id,
             Reactivate_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Reactivate_Driver_By_Id;

      package API_Update_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Update_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Update_Dispatch_Route_Params : DispatchRouteType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "updateDispatchRouteParams", Update_Dispatch_Route_Params);
         Impl.Update_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id,
             Update_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Update_Dispatch_Route_By_Id;

      package API_Update_Organization_Address is
         new Swagger.Servers.Operation (Handler => Update_Organization_Address,
                                        Method  => Swagger.Servers.PATCH,
                                        URI     => URI_Prefix & "/addresses/{addressId}");

      --  /addresses/{addressId}
      procedure Update_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Address_Id : Swagger.Long;
         Address : InlineObject1Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Address_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "address", Address);
         Impl.Update_Organization_Address
            (Access_Token,
             Address_Id,
             Address, Context);

      end Update_Organization_Address;

      package API_Update_Vehicles is
         new Swagger.Servers.Operation (Handler => Update_Vehicles,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/set_data");

      --  /fleet/set_data
      procedure Update_Vehicles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Update_Param : InlineObject14Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "vehicleUpdateParam", Vehicle_Update_Param);
         Impl.Update_Vehicles
            (Access_Token,
             Vehicle_Update_Param, Context);

      end Update_Vehicles;

      package API_Get_All_Data_Inputs is
         new Swagger.Servers.Operation (Handler => Get_All_Data_Inputs,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/industrial/data");

      --  /industrial/data
      procedure Get_All_Data_Inputs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Start_Ms : Swagger.Nullable_Long;
         End_Ms : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2006Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Impl.Get_All_Data_Inputs
            (Access_Token,
             Group_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Data_Inputs;

      package API_Get_Data_Input is
         new Swagger.Servers.Operation (Handler => Get_Data_Input,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/industrial/data/{data_input_id}");

      --  /industrial/data/{data_input_id:[0_9]+}
      procedure Get_Data_Input
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Data_Input_Id : Swagger.Long;
         Start_Ms : Swagger.Nullable_Long;
         End_Ms : Swagger.Nullable_Long;
         Result : .Models.DataInputHistoryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Data_Input_Id);
         Impl.Get_Data_Input
            (Access_Token,
             Data_Input_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Data_Input;

      package API_Get_Machines is
         new Swagger.Servers.Operation (Handler => Get_Machines,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/machines/list");

      --  /machines/list
      procedure Get_Machines
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject18Type;
         Result : .Models.InlineResponse2007Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Impl.Get_Machines
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Machines;

      package API_Get_Machines_History is
         new Swagger.Servers.Operation (Handler => Get_Machines_History,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/machines/history");

      --  /machines/history
      procedure Get_Machines_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         History_Param : InlineObject17Type;
         Result : .Models.MachineHistoryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "historyParam", History_Param);
         Impl.Get_Machines_History
            (Access_Token,
             History_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Machines_History;

      package API_Create_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Impl.Create_Dispatch_Route
            (Access_Token,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Dispatch_Route;

      package API_Create_Driver_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Driver_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Impl.Create_Driver_Dispatch_Route
            (Access_Token,
             Driver_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver_Dispatch_Route;

      package API_Create_Vehicle_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Vehicle_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Impl.Create_Vehicle_Dispatch_Route
            (Access_Token,
             Vehicle_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Vehicle_Dispatch_Route;

      package API_Delete_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Impl.Delete_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Context);

      end Delete_Dispatch_Route_By_Id;

      package API_Fetch_All_Dispatch_Routes is
         new Swagger.Servers.Operation (Handler => Fetch_All_Dispatch_Routes,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Impl.Fetch_All_Dispatch_Routes
            (Access_Token,
             Group_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Dispatch_Routes;

      package API_Fetch_All_Route_Job_Updates is
         new Swagger.Servers.Operation (Handler => Fetch_All_Route_Job_Updates,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/job_updates");

      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Sequence_Id : Swagger.Nullable_UString;
         Include : Swagger.Nullable_UString;
         Result : .Models.AllRouteJobUpdatesType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "sequence_id", Sequence_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "include", Include);
         Impl.Fetch_All_Route_Job_Updates
            (Access_Token,
             Group_Id,
             Sequence_Id,
             Include, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Route_Job_Updates;

      package API_Get_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Impl.Get_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_By_Id;

      package API_Get_Dispatch_Route_History is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_History,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}/history");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Start_Time : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteHistoryType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "start_time", Start_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Impl.Get_Dispatch_Route_History
            (Access_Token,
             Route_Id,
             Start_Time,
             End_Time, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_History;

      package API_Get_Dispatch_Routes_By_Driver_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Driver_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Impl.Get_Dispatch_Routes_By_Driver_Id
            (Access_Token,
             Driver_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Driver_Id;

      package API_Get_Dispatch_Routes_By_Vehicle_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Vehicle_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Impl.Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token,
             Vehicle_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Vehicle_Id;

      package API_Update_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Update_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Update_Dispatch_Route_Params : DispatchRouteType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "updateDispatchRouteParams", Update_Dispatch_Route_Params);
         Impl.Update_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id,
             Update_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Update_Dispatch_Route_By_Id;

      package API_Get_Driver_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Driver_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driverId}/safety/score");

      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Driver_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.DriverSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Impl.Get_Driver_Safety_Score
            (Driver_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Safety_Score;

      package API_Get_Vehicle_Harsh_Event is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Harsh_Event,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/harsh_event");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Timestamp : Swagger.Long;
         Result : .Models.VehicleHarshEventResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "timestamp", Timestamp);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Impl.Get_Vehicle_Harsh_Event
            (Vehicle_Id,
             Access_Token,
             Timestamp, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Harsh_Event;

      package API_Get_Vehicle_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/score");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.VehicleSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Impl.Get_Vehicle_Safety_Score
            (Vehicle_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Safety_Score;

      package API_Get_Sensors is
         new Swagger.Servers.Operation (Handler => Get_Sensors,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/list");

      --  /sensors/list
      procedure Get_Sensors
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject23Type;
         Result : .Models.InlineResponse2008Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Impl.Get_Sensors
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors;

      package API_Get_Sensors_Cargo is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Cargo,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/cargo");

      --  /sensors/cargo
      procedure Get_Sensors_Cargo
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject19Type;
         Result : .Models.CargoResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Impl.Get_Sensors_Cargo
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Cargo;

      package API_Get_Sensors_Door is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Door,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/door");

      --  /sensors/door
      procedure Get_Sensors_Door
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject20Type;
         Result : .Models.DoorResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Impl.Get_Sensors_Door
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Door;

      package API_Get_Sensors_History is
         new Swagger.Servers.Operation (Handler => Get_Sensors_History,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/history");

      --  /sensors/history
      procedure Get_Sensors_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         History_Param : InlineObject21Type;
         Result : .Models.SensorHistoryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "historyParam", History_Param);
         Impl.Get_Sensors_History
            (Access_Token,
             History_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_History;

      package API_Get_Sensors_Humidity is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Humidity,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/humidity");

      --  /sensors/humidity
      procedure Get_Sensors_Humidity
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject22Type;
         Result : .Models.HumidityResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Impl.Get_Sensors_Humidity
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Humidity;

      package API_Get_Sensors_Temperature is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Temperature,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/temperature");

      --  /sensors/temperature
      procedure Get_Sensors_Temperature
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject24Type;
         Result : .Models.TemperatureResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Impl.Get_Sensors_Temperature
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Temperature;

      package API_Create_Tag is
         new Swagger.Servers.Operation (Handler => Create_Tag,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/tags");

      --  /tags
      procedure Create_Tag
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Tag_Create_Params : TagCreateType;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "tagCreateParams", Tag_Create_Params);
         Impl.Create_Tag
            (Access_Token,
             Tag_Create_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Tag;

      package API_Delete_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_Tag_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /tags/{tag_id:[0_9]+}
      procedure Delete_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Impl.Delete_Tag_By_Id
            (Access_Token,
             Tag_Id, Context);

      end Delete_Tag_By_Id;

      package API_Get_All_Tags is
         new Swagger.Servers.Operation (Handler => Get_All_Tags,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/tags");

      --  /tags
      procedure Get_All_Tags
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2009Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Impl.Get_All_Tags
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Tags;

      package API_Get_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Tag_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /tags/{tag_id:[0_9]+}
      procedure Get_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Impl.Get_Tag_By_Id
            (Access_Token,
             Tag_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Tag_By_Id;

      package API_Modify_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Modify_Tag_By_Id,
                                        Method  => Swagger.Servers.PATCH,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /tags/{tag_id:[0_9]+}
      procedure Modify_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
         Tag_Modify_Params : TagModifyType;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "tagModifyParams", Tag_Modify_Params);
         Impl.Modify_Tag_By_Id
            (Access_Token,
             Tag_Id,
             Tag_Modify_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Modify_Tag_By_Id;

      package API_Update_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Update_Tag_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /tags/{tag_id:[0_9]+}
      procedure Update_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
         Update_Tag_Params : TagUpdateType;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "updateTagParams", Update_Tag_Params);
         Impl.Update_Tag_By_Id
            (Access_Token,
             Tag_Id,
             Update_Tag_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Update_Tag_By_Id;

      package API_Delete_User_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_User_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/users/{userId}");

      --  /users/{userId:[0_9]+}
      procedure Delete_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         User_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, User_Id);
         Impl.Delete_User_By_Id
            (Access_Token,
             User_Id, Context);

      end Delete_User_By_Id;

      package API_Get_User_By_Id is
         new Swagger.Servers.Operation (Handler => Get_User_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/users/{userId}");

      --  /users/{userId:[0_9]+}
      procedure Get_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         User_Id : Swagger.Long;
         Result : .Models.UserType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, User_Id);
         Impl.Get_User_By_Id
            (Access_Token,
             User_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_User_By_Id;

      package API_List_User_Roles is
         new Swagger.Servers.Operation (Handler => List_User_Roles,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/user_roles");

      --  /user_roles
      procedure List_User_Roles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Result : .Models.UserRoleType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Impl.List_User_Roles
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_User_Roles;

      package API_List_Users is
         new Swagger.Servers.Operation (Handler => List_Users,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/users");

      --  /users
      procedure List_Users
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Access_Token : Swagger.UString;
         Result : .Models.UserType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Impl.List_Users
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_Users;

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Get_All_Asset_Current_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Assets.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Location.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Reefer.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver.Definition);
         Swagger.Servers.Register (Server, API_Deactivate_Driver.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Deactivated_Drivers.Definition);
         Swagger.Servers.Register (Server, API_Get_Deactivated_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Reactivate_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Add_Fleet_Address.Definition);
         Swagger.Servers.Register (Server, API_Add_Organization_Addresses.Definition);
         Swagger.Servers.Register (Server, API_Create_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver_Document.Definition);
         Swagger.Servers.Register (Server, API_Create_Dvir.Definition);
         Swagger.Servers.Register (Server, API_Create_Vehicle_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Deactivate_Driver.Definition);
         Swagger.Servers.Register (Server, API_Delete_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Delete_Organization_Address.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Dispatch_Routes.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Route_Job_Updates.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Asset_Current_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Assets.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Deactivated_Drivers.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Location.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Reefer.Definition);
         Swagger.Servers.Register (Server, API_Get_Deactivated_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_History.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Driver_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Vehicle_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Document_Types_By_Org_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Documents_By_Org_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Dvirs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Drivers.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Drivers_Hos_Daily_Logs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Drivers_Summary.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Hos_Authentication_Logs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Hos_Logs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Hos_Logs_Summary.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Maintenance_List.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Trips.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Vehicle.Definition);
         Swagger.Servers.Register (Server, API_Get_Organization_Address.Definition);
         Swagger.Servers.Register (Server, API_Get_Organization_Addresses.Definition);
         Swagger.Servers.Register (Server, API_Get_Organization_Contact.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Harsh_Event.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Stats.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicles_Locations.Definition);
         Swagger.Servers.Register (Server, API_List_Contacts.Definition);
         Swagger.Servers.Register (Server, API_List_Fleet.Definition);
         Swagger.Servers.Register (Server, API_Patch_Fleet_Vehicle.Definition);
         Swagger.Servers.Register (Server, API_Reactivate_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Organization_Address.Definition);
         Swagger.Servers.Register (Server, API_Update_Vehicles.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Data_Inputs.Definition);
         Swagger.Servers.Register (Server, API_Get_Data_Input.Definition);
         Swagger.Servers.Register (Server, API_Get_Machines.Definition);
         Swagger.Servers.Register (Server, API_Get_Machines_History.Definition);
         Swagger.Servers.Register (Server, API_Create_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Vehicle_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Delete_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Dispatch_Routes.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Route_Job_Updates.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_History.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Driver_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Vehicle_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Harsh_Event.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Cargo.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Door.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_History.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Humidity.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Temperature.Definition);
         Swagger.Servers.Register (Server, API_Create_Tag.Definition);
         Swagger.Servers.Register (Server, API_Delete_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Tags.Definition);
         Swagger.Servers.Register (Server, API_Get_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Modify_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Delete_User_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_User_By_Id.Definition);
         Swagger.Servers.Register (Server, API_List_User_Roles.Definition);
         Swagger.Servers.Register (Server, API_List_Users.Definition);
      end Register;

   end Skeleton;

   package body Shared_Instance is


      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2001Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_All_Asset_Current_Locations
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Asset_Current_Locations;

      package API_Get_All_Asset_Current_Locations is
         new Swagger.Servers.Operation (Handler => Get_All_Asset_Current_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/locations");

      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse200Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_All_Assets
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Assets;

      package API_Get_All_Assets is
         new Swagger.Servers.Operation (Handler => Get_All_Assets,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets");

      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : Swagger.Object_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Server.Get_Asset_Location
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Location;

      package API_Get_Asset_Location is
         new Swagger.Servers.Operation (Handler => Get_Asset_Location,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/locations");

      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.AssetReeferResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Server.Get_Asset_Reefer
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Reefer;

      package API_Get_Asset_Reefer is
         new Swagger.Servers.Operation (Handler => Get_Asset_Reefer,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/reefer");

      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Create_Driver_Param : DriverForCreateType;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDriverParam", Create_Driver_Param);
         Server.Create_Driver
            (Access_Token,
             Create_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver;

      package API_Create_Driver is
         new Swagger.Servers.Operation (Handler => Create_Driver,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/create");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Server.Deactivate_Driver
            (Access_Token,
             Driver_Id_Or_External_Id, Context);

      end Deactivate_Driver;

      package API_Deactivate_Driver is
         new Swagger.Servers.Operation (Handler => Deactivate_Driver,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.DriverType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_All_Deactivated_Drivers
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Deactivated_Drivers;

      package API_Get_All_Deactivated_Drivers is
         new Swagger.Servers.Operation (Handler => Get_All_Deactivated_Drivers,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Server.Get_Deactivated_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Deactivated_Driver_By_Id;

      package API_Get_Deactivated_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Deactivated_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Server.Get_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_By_Id;

      package API_Get_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Reactivate_Driver_Param : InlineObject4Type;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "reactivateDriverParam", Reactivate_Driver_Param);
         Server.Reactivate_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id,
             Reactivate_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Reactivate_Driver_By_Id;

      package API_Reactivate_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Reactivate_Driver_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/add_address
      procedure Add_Fleet_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Address_Param : InlineObject2Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "addressParam", Address_Param);
         Server.Add_Fleet_Address
            (Access_Token,
             Address_Param, Context);

      end Add_Fleet_Address;

      package API_Add_Fleet_Address is
         new Swagger.Servers.Operation (Handler => Add_Fleet_Address,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/add_address");

      --  /addresses
      procedure Add_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Addresses : InlineObjectType;
         Result : .Models.AddressType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "addresses", Addresses);
         Server.Add_Organization_Addresses
            (Access_Token,
             Addresses, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Add_Organization_Addresses;

      package API_Add_Organization_Addresses is
         new Swagger.Servers.Operation (Handler => Add_Organization_Addresses,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/addresses");

      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Server.Create_Dispatch_Route
            (Access_Token,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Dispatch_Route;

      package API_Create_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/drivers/create
      procedure Create_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Create_Driver_Param : DriverForCreateType;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDriverParam", Create_Driver_Param);
         Server.Create_Driver
            (Access_Token,
             Create_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver;

      package API_Create_Driver is
         new Swagger.Servers.Operation (Handler => Create_Driver,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/create");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Server.Create_Driver_Dispatch_Route
            (Access_Token,
             Driver_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver_Dispatch_Route;

      package API_Create_Driver_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Driver_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+}/documents
      procedure Create_Driver_Document
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Create_Document_Params : DocumentCreateType;
         Result : .Models.DocumentType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDocumentParams", Create_Document_Params);
         Server.Create_Driver_Document
            (Access_Token,
             Driver_Id,
             Create_Document_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver_Document;

      package API_Create_Driver_Document is
         new Swagger.Servers.Operation (Handler => Create_Driver_Document,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/documents");

      --  /fleet/maintenance/dvirs
      procedure Create_Dvir
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Create_Dvir_Param : InlineObject12Type;
         Result : .Models.DvirBaseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDvirParam", Create_Dvir_Param);
         Server.Create_Dvir
            (Access_Token,
             Create_Dvir_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Dvir;

      package API_Create_Dvir is
         new Swagger.Servers.Operation (Handler => Create_Dvir,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/maintenance/dvirs");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Server.Create_Vehicle_Dispatch_Route
            (Access_Token,
             Vehicle_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Vehicle_Dispatch_Route;

      package API_Create_Vehicle_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Vehicle_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Deactivate_Driver
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Server.Deactivate_Driver
            (Access_Token,
             Driver_Id_Or_External_Id, Context);

      end Deactivate_Driver;

      package API_Deactivate_Driver is
         new Swagger.Servers.Operation (Handler => Deactivate_Driver,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Server.Delete_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Context);

      end Delete_Dispatch_Route_By_Id;

      package API_Delete_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /addresses/{addressId}
      procedure Delete_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Address_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Address_Id);
         Server.Delete_Organization_Address
            (Access_Token,
             Address_Id, Context);

      end Delete_Organization_Address;

      package API_Delete_Organization_Address is
         new Swagger.Servers.Operation (Handler => Delete_Organization_Address,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/addresses/{addressId}");

      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Server.Fetch_All_Dispatch_Routes
            (Access_Token,
             Group_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Dispatch_Routes;

      package API_Fetch_All_Dispatch_Routes is
         new Swagger.Servers.Operation (Handler => Fetch_All_Dispatch_Routes,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Sequence_Id : Swagger.Nullable_UString;
         Include : Swagger.Nullable_UString;
         Result : .Models.AllRouteJobUpdatesType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "sequence_id", Sequence_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "include", Include);
         Server.Fetch_All_Route_Job_Updates
            (Access_Token,
             Group_Id,
             Sequence_Id,
             Include, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Route_Job_Updates;

      package API_Fetch_All_Route_Job_Updates is
         new Swagger.Servers.Operation (Handler => Fetch_All_Route_Job_Updates,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/job_updates");

      --  /fleet/assets/locations
      procedure Get_All_Asset_Current_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2001Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_All_Asset_Current_Locations
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Asset_Current_Locations;

      package API_Get_All_Asset_Current_Locations is
         new Swagger.Servers.Operation (Handler => Get_All_Asset_Current_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/locations");

      --  /fleet/assets
      procedure Get_All_Assets
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse200Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_All_Assets
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Assets;

      package API_Get_All_Assets is
         new Swagger.Servers.Operation (Handler => Get_All_Assets,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets");

      --  /fleet/drivers/inactive
      procedure Get_All_Deactivated_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.DriverType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_All_Deactivated_Drivers
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Deactivated_Drivers;

      package API_Get_All_Deactivated_Drivers is
         new Swagger.Servers.Operation (Handler => Get_All_Deactivated_Drivers,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive");

      --  /fleet/assets/{assetId:[0_9]+}/locations
      procedure Get_Asset_Location
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : Swagger.Object_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Server.Get_Asset_Location
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Location;

      package API_Get_Asset_Location is
         new Swagger.Servers.Operation (Handler => Get_Asset_Location,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/locations");

      --  /fleet/assets/{assetId:[0_9]+}/reefer
      procedure Get_Asset_Reefer
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Asset_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.AssetReeferResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Asset_Id);
         Server.Get_Asset_Reefer
            (Access_Token,
             Asset_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Asset_Reefer;

      package API_Get_Asset_Reefer is
         new Swagger.Servers.Operation (Handler => Get_Asset_Reefer,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/assets/{asset_id}/reefer");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Deactivated_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Server.Get_Deactivated_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Deactivated_Driver_By_Id;

      package API_Get_Deactivated_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Deactivated_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Server.Get_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_By_Id;

      package API_Get_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Start_Time : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteHistoryType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "start_time", Start_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Server.Get_Dispatch_Route_History
            (Access_Token,
             Route_Id,
             Start_Time,
             End_Time, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_History;

      package API_Get_Dispatch_Route_History is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_History,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}/history");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Server.Get_Dispatch_Routes_By_Driver_Id
            (Access_Token,
             Driver_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Driver_Id;

      package API_Get_Dispatch_Routes_By_Driver_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Driver_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Server.Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token,
             Vehicle_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Vehicle_Id;

      package API_Get_Dispatch_Routes_By_Vehicle_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Vehicle_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Server.Get_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_By_Id;

      package API_Get_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id_or_external_id}");

      --  /fleet/drivers/document_types
      procedure Get_Driver_Document_Types_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Result : .Models.DocumentTypeType_Vectors.Vector;
      begin
         Server.Get_Driver_Document_Types_By_Org_Id (Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Document_Types_By_Org_Id;

      package API_Get_Driver_Document_Types_By_Org_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_Document_Types_By_Org_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/document_types");

      --  /fleet/drivers/documents
      procedure Get_Driver_Documents_By_Org_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         End_Ms : Swagger.Nullable_Long;
         Duration_Ms : Swagger.Nullable_Long;
         Result : .Models.DocumentType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "durationMs", Duration_Ms);
         Server.Get_Driver_Documents_By_Org_Id
            (Access_Token,
             End_Ms,
             Duration_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Documents_By_Org_Id;

      package API_Get_Driver_Documents_By_Org_Id is
         new Swagger.Servers.Operation (Handler => Get_Driver_Documents_By_Org_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/documents");

      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Driver_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.DriverSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Server.Get_Driver_Safety_Score
            (Driver_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Safety_Score;

      package API_Get_Driver_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Driver_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driverId}/safety/score");

      --  /fleet/maintenance/dvirs
      procedure Get_Dvirs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         End_Ms : Integer;
         Duration_Ms : Integer;
         Group_Id : Swagger.Nullable_Integer;
         Result : .Models.DvirListResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_ms", End_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "duration_ms", Duration_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_Dvirs
            (Access_Token,
             End_Ms,
             Duration_Ms,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dvirs;

      package API_Get_Dvirs is
         new Swagger.Servers.Operation (Handler => Get_Dvirs,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/maintenance/dvirs");

      --  /fleet/drivers
      procedure Get_Fleet_Drivers
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Group_Drivers_Param : InlineObject3Type;
         Result : .Models.DriversResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupDriversParam", Group_Drivers_Param);
         Server.Get_Fleet_Drivers
            (Access_Token,
             Group_Drivers_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Drivers;

      package API_Get_Fleet_Drivers is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Drivers,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers");

      --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
      procedure Get_Fleet_Drivers_Hos_Daily_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Hos_Logs_Param : InlineObject6Type;
         Result : .Models.DriverDailyLogResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosLogsParam", Hos_Logs_Param);
         Server.Get_Fleet_Drivers_Hos_Daily_Logs
            (Access_Token,
             Driver_Id,
             Hos_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Drivers_Hos_Daily_Logs;

      package API_Get_Fleet_Drivers_Hos_Daily_Logs is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Drivers_Hos_Daily_Logs,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/hos_daily_logs");

      --  /fleet/drivers/summary
      procedure Get_Fleet_Drivers_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Drivers_Summary_Param : InlineObject5Type;
         Snap_To_Day_Bounds : Swagger.Nullable_Boolean;
         Result : .Models.DriversSummaryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "snap_to_day_bounds", Snap_To_Day_Bounds);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "driversSummaryParam", Drivers_Summary_Param);
         Server.Get_Fleet_Drivers_Summary
            (Access_Token,
             Drivers_Summary_Param,
             Snap_To_Day_Bounds, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Drivers_Summary;

      package API_Get_Fleet_Drivers_Summary is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Drivers_Summary,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/summary");

      --  /fleet/hos_authentication_logs
      procedure Get_Fleet_Hos_Authentication_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Hos_Authentication_Logs_Param : InlineObject7Type;
         Result : .Models.HosAuthenticationLogsResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosAuthenticationLogsParam", Hos_Authentication_Logs_Param);
         Server.Get_Fleet_Hos_Authentication_Logs
            (Access_Token,
             Hos_Authentication_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Hos_Authentication_Logs;

      package API_Get_Fleet_Hos_Authentication_Logs is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Hos_Authentication_Logs,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/hos_authentication_logs");

      --  /fleet/hos_logs
      procedure Get_Fleet_Hos_Logs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Hos_Logs_Param : InlineObject8Type;
         Result : .Models.HosLogsResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosLogsParam", Hos_Logs_Param);
         Server.Get_Fleet_Hos_Logs
            (Access_Token,
             Hos_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Hos_Logs;

      package API_Get_Fleet_Hos_Logs is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Hos_Logs,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/hos_logs");

      --  /fleet/hos_logs_summary
      procedure Get_Fleet_Hos_Logs_Summary
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Hos_Logs_Param : InlineObject9Type;
         Result : .Models.HosLogsSummaryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "hosLogsParam", Hos_Logs_Param);
         Server.Get_Fleet_Hos_Logs_Summary
            (Access_Token,
             Hos_Logs_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Hos_Logs_Summary;

      package API_Get_Fleet_Hos_Logs_Summary is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Hos_Logs_Summary,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/hos_logs_summary");

      --  /fleet/locations
      procedure Get_Fleet_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject11Type;
         Result : .Models.InlineResponse2003Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Server.Get_Fleet_Locations
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Locations;

      package API_Get_Fleet_Locations is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Locations,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/locations");

      --  /fleet/maintenance/list
      procedure Get_Fleet_Maintenance_List
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject13Type;
         Result : .Models.InlineResponse2004Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Server.Get_Fleet_Maintenance_List
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Maintenance_List;

      package API_Get_Fleet_Maintenance_List is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Maintenance_List,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/maintenance/list");

      --  /fleet/trips
      procedure Get_Fleet_Trips
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Trips_Param : InlineObject15Type;
         Result : .Models.TripResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "tripsParam", Trips_Param);
         Server.Get_Fleet_Trips
            (Access_Token,
             Trips_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Trips;

      package API_Get_Fleet_Trips is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Trips,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/trips");

      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Get_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Vehicle_Id_Or_External_Id : Swagger.UString;
         Result : .Models.FleetVehicleResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id_Or_External_Id);
         Server.Get_Fleet_Vehicle
            (Access_Token,
             Vehicle_Id_Or_External_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Fleet_Vehicle;

      package API_Get_Fleet_Vehicle is
         new Swagger.Servers.Operation (Handler => Get_Fleet_Vehicle,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id_or_external_id}");

      --  /addresses/{addressId}
      procedure Get_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Address_Id : Swagger.Long;
         Result : .Models.AddressType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Address_Id);
         Server.Get_Organization_Address
            (Access_Token,
             Address_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Organization_Address;

      package API_Get_Organization_Address is
         new Swagger.Servers.Operation (Handler => Get_Organization_Address,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/addresses/{addressId}");

      --  /addresses
      procedure Get_Organization_Addresses
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Result : .Models.AddressType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Server.Get_Organization_Addresses
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Organization_Addresses;

      package API_Get_Organization_Addresses is
         new Swagger.Servers.Operation (Handler => Get_Organization_Addresses,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/addresses");

      --  /contacts/{contact_id}
      procedure Get_Organization_Contact
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Contact_Id : Swagger.Long;
         Result : .Models.ContactType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Contact_Id);
         Server.Get_Organization_Contact
            (Access_Token,
             Contact_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Organization_Contact;

      package API_Get_Organization_Contact is
         new Swagger.Servers.Operation (Handler => Get_Organization_Contact,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/contacts/{contact_id}");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Timestamp : Swagger.Long;
         Result : .Models.VehicleHarshEventResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "timestamp", Timestamp);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Server.Get_Vehicle_Harsh_Event
            (Vehicle_Id,
             Access_Token,
             Timestamp, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Harsh_Event;

      package API_Get_Vehicle_Harsh_Event is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Harsh_Event,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/harsh_event");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
      procedure Get_Vehicle_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.FleetVehicleLocationType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Server.Get_Vehicle_Locations
            (Access_Token,
             Vehicle_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Locations;

      package API_Get_Vehicle_Locations is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/locations");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.VehicleSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Server.Get_Vehicle_Safety_Score
            (Vehicle_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Safety_Score;

      package API_Get_Vehicle_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/score");

      --  /fleet/vehicles/stats
      procedure Get_Vehicle_Stats
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Start_Ms : Integer;
         End_Ms : Integer;
         Series : Swagger.Nullable_UString;
         Tag_Ids : Swagger.Nullable_UString;
         Starting_After : Swagger.Nullable_UString;
         Ending_Before : Swagger.Nullable_UString;
         Limit : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2005Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "series", Series);
         Swagger.Servers.Get_Query_Parameter (Req, "tagIds", Tag_Ids);
         Swagger.Servers.Get_Query_Parameter (Req, "startingAfter", Starting_After);
         Swagger.Servers.Get_Query_Parameter (Req, "endingBefore", Ending_Before);
         Swagger.Servers.Get_Query_Parameter (Req, "limit", Limit);
         Server.Get_Vehicle_Stats
            (Access_Token,
             Start_Ms,
             End_Ms,
             Series,
             Tag_Ids,
             Starting_After,
             Ending_Before,
             Limit, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Stats;

      package API_Get_Vehicle_Stats is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Stats,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/stats");

      --  /fleet/vehicles/locations
      procedure Get_Vehicles_Locations
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Start_Ms : Integer;
         End_Ms : Integer;
         Result : Swagger.Object_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Server.Get_Vehicles_Locations
            (Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicles_Locations;

      package API_Get_Vehicles_Locations is
         new Swagger.Servers.Operation (Handler => Get_Vehicles_Locations,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/locations");

      --  /contacts
      procedure List_Contacts
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Result : .Models.ContactType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Server.List_Contacts
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_Contacts;

      package API_List_Contacts is
         new Swagger.Servers.Operation (Handler => List_Contacts,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/contacts");

      --  /fleet/list
      procedure List_Fleet
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject10Type;
         Starting_After : Swagger.Nullable_UString;
         Ending_Before : Swagger.Nullable_UString;
         Limit : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2002Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startingAfter", Starting_After);
         Swagger.Servers.Get_Query_Parameter (Req, "endingBefore", Ending_Before);
         Swagger.Servers.Get_Query_Parameter (Req, "limit", Limit);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Server.List_Fleet
            (Access_Token,
             Group_Param,
             Starting_After,
             Ending_Before,
             Limit, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_Fleet;

      package API_List_Fleet is
         new Swagger.Servers.Operation (Handler => List_Fleet,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/list");

      --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Patch_Fleet_Vehicle
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id_Or_External_Id : Swagger.UString;
         Data : InlineObject16Type;
         Result : .Models.FleetVehicleResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id_Or_External_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "data", Data);
         Server.Patch_Fleet_Vehicle
            (Access_Token,
             Vehicle_Id_Or_External_Id,
             Data, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Patch_Fleet_Vehicle;

      package API_Patch_Fleet_Vehicle is
         new Swagger.Servers.Operation (Handler => Patch_Fleet_Vehicle,
                                        Method  => Swagger.Servers.PATCH,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id_or_external_id}");

      --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
      procedure Reactivate_Driver_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Driver_Id_Or_External_Id : Swagger.UString;
         Reactivate_Driver_Param : InlineObject4Type;
         Result : .Models.DriverType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id_Or_External_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "reactivateDriverParam", Reactivate_Driver_Param);
         Server.Reactivate_Driver_By_Id
            (Access_Token,
             Driver_Id_Or_External_Id,
             Reactivate_Driver_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Reactivate_Driver_By_Id;

      package API_Reactivate_Driver_By_Id is
         new Swagger.Servers.Operation (Handler => Reactivate_Driver_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/drivers/inactive/{driver_id_or_external_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Update_Dispatch_Route_Params : DispatchRouteType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "updateDispatchRouteParams", Update_Dispatch_Route_Params);
         Server.Update_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id,
             Update_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Update_Dispatch_Route_By_Id;

      package API_Update_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Update_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /addresses/{addressId}
      procedure Update_Organization_Address
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Address_Id : Swagger.Long;
         Address : InlineObject1Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Address_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "address", Address);
         Server.Update_Organization_Address
            (Access_Token,
             Address_Id,
             Address, Context);

      end Update_Organization_Address;

      package API_Update_Organization_Address is
         new Swagger.Servers.Operation (Handler => Update_Organization_Address,
                                        Method  => Swagger.Servers.PATCH,
                                        URI     => URI_Prefix & "/addresses/{addressId}");

      --  /fleet/set_data
      procedure Update_Vehicles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Vehicle_Update_Param : InlineObject14Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "vehicleUpdateParam", Vehicle_Update_Param);
         Server.Update_Vehicles
            (Access_Token,
             Vehicle_Update_Param, Context);

      end Update_Vehicles;

      package API_Update_Vehicles is
         new Swagger.Servers.Operation (Handler => Update_Vehicles,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/set_data");

      --  /industrial/data
      procedure Get_All_Data_Inputs
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Start_Ms : Swagger.Nullable_Long;
         End_Ms : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2006Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Server.Get_All_Data_Inputs
            (Access_Token,
             Group_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Data_Inputs;

      package API_Get_All_Data_Inputs is
         new Swagger.Servers.Operation (Handler => Get_All_Data_Inputs,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/industrial/data");

      --  /industrial/data/{data_input_id:[0_9]+}
      procedure Get_Data_Input
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Data_Input_Id : Swagger.Long;
         Start_Ms : Swagger.Nullable_Long;
         End_Ms : Swagger.Nullable_Long;
         Result : .Models.DataInputHistoryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Data_Input_Id);
         Server.Get_Data_Input
            (Access_Token,
             Data_Input_Id,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Data_Input;

      package API_Get_Data_Input is
         new Swagger.Servers.Operation (Handler => Get_Data_Input,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/industrial/data/{data_input_id}");

      --  /machines/list
      procedure Get_Machines
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject18Type;
         Result : .Models.InlineResponse2007Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Server.Get_Machines
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Machines;

      package API_Get_Machines is
         new Swagger.Servers.Operation (Handler => Get_Machines,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/machines/list");

      --  /machines/history
      procedure Get_Machines_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         History_Param : InlineObject17Type;
         Result : .Models.MachineHistoryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "historyParam", History_Param);
         Server.Get_Machines_History
            (Access_Token,
             History_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Machines_History;

      package API_Get_Machines_History is
         new Swagger.Servers.Operation (Handler => Get_Machines_History,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/machines/history");

      --  /fleet/dispatch/routes
      procedure Create_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Server.Create_Dispatch_Route
            (Access_Token,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Dispatch_Route;

      package API_Create_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Create_Driver_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Server.Create_Driver_Dispatch_Route
            (Access_Token,
             Driver_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Driver_Dispatch_Route;

      package API_Create_Driver_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Driver_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Create_Vehicle_Dispatch_Route
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         Create_Dispatch_Route_Params : DispatchRouteCreateType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "createDispatchRouteParams", Create_Dispatch_Route_Params);
         Server.Create_Vehicle_Dispatch_Route
            (Access_Token,
             Vehicle_Id,
             Create_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Vehicle_Dispatch_Route;

      package API_Create_Vehicle_Dispatch_Route is
         new Swagger.Servers.Operation (Handler => Create_Vehicle_Dispatch_Route,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Delete_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Server.Delete_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Context);

      end Delete_Dispatch_Route_By_Id;

      package API_Delete_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes
      procedure Fetch_All_Dispatch_Routes
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Server.Fetch_All_Dispatch_Routes
            (Access_Token,
             Group_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Dispatch_Routes;

      package API_Fetch_All_Dispatch_Routes is
         new Swagger.Servers.Operation (Handler => Fetch_All_Dispatch_Routes,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes");

      --  /fleet/dispatch/routes/job_updates
      procedure Fetch_All_Route_Job_Updates
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Sequence_Id : Swagger.Nullable_UString;
         Include : Swagger.Nullable_UString;
         Result : .Models.AllRouteJobUpdatesType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "sequence_id", Sequence_Id);
         Swagger.Servers.Get_Query_Parameter (Req, "include", Include);
         Server.Fetch_All_Route_Job_Updates
            (Access_Token,
             Group_Id,
             Sequence_Id,
             Include, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Fetch_All_Route_Job_Updates;

      package API_Fetch_All_Route_Job_Updates is
         new Swagger.Servers.Operation (Handler => Fetch_All_Route_Job_Updates,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/job_updates");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}
      procedure Get_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Server.Get_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_By_Id;

      package API_Get_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
      procedure Get_Dispatch_Route_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Start_Time : Swagger.Nullable_Long;
         End_Time : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteHistoryType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "start_time", Start_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Server.Get_Dispatch_Route_History
            (Access_Token,
             Route_Id,
             Start_Time,
             End_Time, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Route_History;

      package API_Get_Dispatch_Route_History is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Route_History,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}/history");

      --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Driver_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Driver_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Server.Get_Dispatch_Routes_By_Driver_Id
            (Access_Token,
             Driver_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Driver_Id;

      package API_Get_Dispatch_Routes_By_Driver_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Driver_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driver_id}/dispatch/routes");

      --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
      procedure Get_Dispatch_Routes_By_Vehicle_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Vehicle_Id : Swagger.Long;
         End_Time : Swagger.Nullable_Long;
         Duration : Swagger.Nullable_Long;
         Result : .Models.DispatchRouteType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "end_time", End_Time);
         Swagger.Servers.Get_Query_Parameter (Req, "duration", Duration);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Server.Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token,
             Vehicle_Id,
             End_Time,
             Duration, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Dispatch_Routes_By_Vehicle_Id;

      package API_Get_Dispatch_Routes_By_Vehicle_Id is
         new Swagger.Servers.Operation (Handler => Get_Dispatch_Routes_By_Vehicle_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicle_id}/dispatch/routes");

      --  /fleet/dispatch/routes/{route_id:[0_9]+}/
      procedure Update_Dispatch_Route_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Route_Id : Swagger.Long;
         Update_Dispatch_Route_Params : DispatchRouteType;
         Result : .Models.DispatchRouteType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Route_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "updateDispatchRouteParams", Update_Dispatch_Route_Params);
         Server.Update_Dispatch_Route_By_Id
            (Access_Token,
             Route_Id,
             Update_Dispatch_Route_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Update_Dispatch_Route_By_Id;

      package API_Update_Dispatch_Route_By_Id is
         new Swagger.Servers.Operation (Handler => Update_Dispatch_Route_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/fleet/dispatch/routes/{route_id}");

      --  /fleet/drivers/{driverId:[0_9]+}/safety/score
      procedure Get_Driver_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Driver_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.DriverSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Driver_Id);
         Server.Get_Driver_Safety_Score
            (Driver_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Driver_Safety_Score;

      package API_Get_Driver_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Driver_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/drivers/{driverId}/safety/score");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
      procedure Get_Vehicle_Harsh_Event
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Timestamp : Swagger.Long;
         Result : .Models.VehicleHarshEventResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "timestamp", Timestamp);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Server.Get_Vehicle_Harsh_Event
            (Vehicle_Id,
             Access_Token,
             Timestamp, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Harsh_Event;

      package API_Get_Vehicle_Harsh_Event is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Harsh_Event,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/harsh_event");

      --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
      procedure Get_Vehicle_Safety_Score
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Vehicle_Id : Swagger.Long;
         Access_Token : Swagger.UString;
         Start_Ms : Swagger.Long;
         End_Ms : Swagger.Long;
         Result : .Models.VehicleSafetyScoreResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "startMs", Start_Ms);
         Swagger.Servers.Get_Query_Parameter (Req, "endMs", End_Ms);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Vehicle_Id);
         Server.Get_Vehicle_Safety_Score
            (Vehicle_Id,
             Access_Token,
             Start_Ms,
             End_Ms, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Vehicle_Safety_Score;

      package API_Get_Vehicle_Safety_Score is
         new Swagger.Servers.Operation (Handler => Get_Vehicle_Safety_Score,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/fleet/vehicles/{vehicleId}/safety/score");

      --  /sensors/list
      procedure Get_Sensors
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Group_Param : InlineObject23Type;
         Result : .Models.InlineResponse2008Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "groupParam", Group_Param);
         Server.Get_Sensors
            (Access_Token,
             Group_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors;

      package API_Get_Sensors is
         new Swagger.Servers.Operation (Handler => Get_Sensors,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/list");

      --  /sensors/cargo
      procedure Get_Sensors_Cargo
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject19Type;
         Result : .Models.CargoResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Server.Get_Sensors_Cargo
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Cargo;

      package API_Get_Sensors_Cargo is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Cargo,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/cargo");

      --  /sensors/door
      procedure Get_Sensors_Door
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject20Type;
         Result : .Models.DoorResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Server.Get_Sensors_Door
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Door;

      package API_Get_Sensors_Door is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Door,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/door");

      --  /sensors/history
      procedure Get_Sensors_History
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         History_Param : InlineObject21Type;
         Result : .Models.SensorHistoryResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "historyParam", History_Param);
         Server.Get_Sensors_History
            (Access_Token,
             History_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_History;

      package API_Get_Sensors_History is
         new Swagger.Servers.Operation (Handler => Get_Sensors_History,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/history");

      --  /sensors/humidity
      procedure Get_Sensors_Humidity
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject22Type;
         Result : .Models.HumidityResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Server.Get_Sensors_Humidity
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Humidity;

      package API_Get_Sensors_Humidity is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Humidity,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/humidity");

      --  /sensors/temperature
      procedure Get_Sensors_Temperature
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Sensor_Param : InlineObject24Type;
         Result : .Models.TemperatureResponseType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "sensorParam", Sensor_Param);
         Server.Get_Sensors_Temperature
            (Access_Token,
             Sensor_Param, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Sensors_Temperature;

      package API_Get_Sensors_Temperature is
         new Swagger.Servers.Operation (Handler => Get_Sensors_Temperature,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/sensors/temperature");

      --  /tags
      procedure Create_Tag
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Tag_Create_Params : TagCreateType;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "tagCreateParams", Tag_Create_Params);
         Server.Create_Tag
            (Access_Token,
             Tag_Create_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Create_Tag;

      package API_Create_Tag is
         new Swagger.Servers.Operation (Handler => Create_Tag,
                                        Method  => Swagger.Servers.POST,
                                        URI     => URI_Prefix & "/tags");

      --  /tags/{tag_id:[0_9]+}
      procedure Delete_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Server.Delete_Tag_By_Id
            (Access_Token,
             Tag_Id, Context);

      end Delete_Tag_By_Id;

      package API_Delete_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_Tag_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /tags
      procedure Get_All_Tags
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Group_Id : Swagger.Nullable_Long;
         Result : .Models.InlineResponse2009Type;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Query_Parameter (Req, "group_id", Group_Id);
         Server.Get_All_Tags
            (Access_Token,
             Group_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_All_Tags;

      package API_Get_All_Tags is
         new Swagger.Servers.Operation (Handler => Get_All_Tags,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/tags");

      --  /tags/{tag_id:[0_9]+}
      procedure Get_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Server.Get_Tag_By_Id
            (Access_Token,
             Tag_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_Tag_By_Id;

      package API_Get_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Get_Tag_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /tags/{tag_id:[0_9]+}
      procedure Modify_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
         Tag_Modify_Params : TagModifyType;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "tagModifyParams", Tag_Modify_Params);
         Server.Modify_Tag_By_Id
            (Access_Token,
             Tag_Id,
             Tag_Modify_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Modify_Tag_By_Id;

      package API_Modify_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Modify_Tag_By_Id,
                                        Method  => Swagger.Servers.PATCH,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /tags/{tag_id:[0_9]+}
      procedure Update_Tag_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Input   : Swagger.Value_Type;
         Access_Token : Swagger.UString;
         Tag_Id : Swagger.Long;
         Update_Tag_Params : TagUpdateType;
         Result : .Models.TagType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, Tag_Id);
         Swagger.Servers.Read (Req, Input);
         
         .Models.Deserialize (Input, "updateTagParams", Update_Tag_Params);
         Server.Update_Tag_By_Id
            (Access_Token,
             Tag_Id,
             Update_Tag_Params, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Update_Tag_By_Id;

      package API_Update_Tag_By_Id is
         new Swagger.Servers.Operation (Handler => Update_Tag_By_Id,
                                        Method  => Swagger.Servers.PUT,
                                        URI     => URI_Prefix & "/tags/{tag_id}");

      --  /users/{userId:[0_9]+}
      procedure Delete_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         User_Id : Swagger.Long;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, User_Id);
         Server.Delete_User_By_Id
            (Access_Token,
             User_Id, Context);

      end Delete_User_By_Id;

      package API_Delete_User_By_Id is
         new Swagger.Servers.Operation (Handler => Delete_User_By_Id,
                                        Method  => Swagger.Servers.DELETE,
                                        URI     => URI_Prefix & "/users/{userId}");

      --  /users/{userId:[0_9]+}
      procedure Get_User_By_Id
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         User_Id : Swagger.Long;
         Result : .Models.UserType;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Swagger.Servers.Get_Path_Parameter (Req, 1, User_Id);
         Server.Get_User_By_Id
            (Access_Token,
             User_Id, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end Get_User_By_Id;

      package API_Get_User_By_Id is
         new Swagger.Servers.Operation (Handler => Get_User_By_Id,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/users/{userId}");

      --  /user_roles
      procedure List_User_Roles
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Result : .Models.UserRoleType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Server.List_User_Roles
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_User_Roles;

      package API_List_User_Roles is
         new Swagger.Servers.Operation (Handler => List_User_Roles,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/user_roles");

      --  /users
      procedure List_Users
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Access_Token : Swagger.UString;
         Result : .Models.UserType_Vectors.Vector;
      begin
         Swagger.Servers.Get_Query_Parameter (Req, "access_token", Access_Token);
         Server.List_Users
            (Access_Token, Result, Context);
         if Context.Get_Status = 200 then
            Stream.Start_Document;
            .Models.Serialize (Stream, "", Result);
            Stream.End_Document;
         end if;
      end List_Users;

      package API_List_Users is
         new Swagger.Servers.Operation (Handler => List_Users,
                                        Method  => Swagger.Servers.GET,
                                        URI     => URI_Prefix & "/users");

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Get_All_Asset_Current_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Assets.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Location.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Reefer.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver.Definition);
         Swagger.Servers.Register (Server, API_Deactivate_Driver.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Deactivated_Drivers.Definition);
         Swagger.Servers.Register (Server, API_Get_Deactivated_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Reactivate_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Add_Fleet_Address.Definition);
         Swagger.Servers.Register (Server, API_Add_Organization_Addresses.Definition);
         Swagger.Servers.Register (Server, API_Create_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver_Document.Definition);
         Swagger.Servers.Register (Server, API_Create_Dvir.Definition);
         Swagger.Servers.Register (Server, API_Create_Vehicle_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Deactivate_Driver.Definition);
         Swagger.Servers.Register (Server, API_Delete_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Delete_Organization_Address.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Dispatch_Routes.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Route_Job_Updates.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Asset_Current_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Assets.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Deactivated_Drivers.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Location.Definition);
         Swagger.Servers.Register (Server, API_Get_Asset_Reefer.Definition);
         Swagger.Servers.Register (Server, API_Get_Deactivated_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_History.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Driver_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Vehicle_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Document_Types_By_Org_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Documents_By_Org_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Dvirs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Drivers.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Drivers_Hos_Daily_Logs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Drivers_Summary.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Hos_Authentication_Logs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Hos_Logs.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Hos_Logs_Summary.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Maintenance_List.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Trips.Definition);
         Swagger.Servers.Register (Server, API_Get_Fleet_Vehicle.Definition);
         Swagger.Servers.Register (Server, API_Get_Organization_Address.Definition);
         Swagger.Servers.Register (Server, API_Get_Organization_Addresses.Definition);
         Swagger.Servers.Register (Server, API_Get_Organization_Contact.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Harsh_Event.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Locations.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Stats.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicles_Locations.Definition);
         Swagger.Servers.Register (Server, API_List_Contacts.Definition);
         Swagger.Servers.Register (Server, API_List_Fleet.Definition);
         Swagger.Servers.Register (Server, API_Patch_Fleet_Vehicle.Definition);
         Swagger.Servers.Register (Server, API_Reactivate_Driver_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Organization_Address.Definition);
         Swagger.Servers.Register (Server, API_Update_Vehicles.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Data_Inputs.Definition);
         Swagger.Servers.Register (Server, API_Get_Data_Input.Definition);
         Swagger.Servers.Register (Server, API_Get_Machines.Definition);
         Swagger.Servers.Register (Server, API_Get_Machines_History.Definition);
         Swagger.Servers.Register (Server, API_Create_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Driver_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Create_Vehicle_Dispatch_Route.Definition);
         Swagger.Servers.Register (Server, API_Delete_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Dispatch_Routes.Definition);
         Swagger.Servers.Register (Server, API_Fetch_All_Route_Job_Updates.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Route_History.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Driver_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Dispatch_Routes_By_Vehicle_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Dispatch_Route_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_Driver_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Harsh_Event.Definition);
         Swagger.Servers.Register (Server, API_Get_Vehicle_Safety_Score.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Cargo.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Door.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_History.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Humidity.Definition);
         Swagger.Servers.Register (Server, API_Get_Sensors_Temperature.Definition);
         Swagger.Servers.Register (Server, API_Create_Tag.Definition);
         Swagger.Servers.Register (Server, API_Delete_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_All_Tags.Definition);
         Swagger.Servers.Register (Server, API_Get_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Modify_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Update_Tag_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Delete_User_By_Id.Definition);
         Swagger.Servers.Register (Server, API_Get_User_By_Id.Definition);
         Swagger.Servers.Register (Server, API_List_User_Roles.Definition);
         Swagger.Servers.Register (Server, API_List_Users.Definition);
      end Register;

      protected body Server is
         --  /fleet/assets/locations
         procedure Get_All_Asset_Current_Locations
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result : out .Models.InlineResponse2001Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Asset_Current_Locations
               (Access_Token,
                Group_Id,
                Result,
                Context);
         end Get_All_Asset_Current_Locations;

         --  /fleet/assets
         procedure Get_All_Assets
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result : out .Models.InlineResponse200Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Assets
               (Access_Token,
                Group_Id,
                Result,
                Context);
         end Get_All_Assets;

         --  /fleet/assets/{assetId:[0_9]+}/locations
         procedure Get_Asset_Location
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out Swagger.Object_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Asset_Location
               (Access_Token,
                Asset_Id,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Asset_Location;

         --  /fleet/assets/{assetId:[0_9]+}/reefer
         procedure Get_Asset_Reefer
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out .Models.AssetReeferResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Asset_Reefer
               (Access_Token,
                Asset_Id,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Asset_Reefer;

         --  /fleet/drivers/create
         procedure Create_Driver
            (Access_Token : in Swagger.UString;
             Create_Driver_Param : in DriverForCreateType;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Driver
               (Access_Token,
                Create_Driver_Param,
                Result,
                Context);
         end Create_Driver;

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Deactivate_Driver
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Deactivate_Driver
               (Access_Token,
                Driver_Id_Or_External_Id,
                Context);
         end Deactivate_Driver;

         --  /fleet/drivers/inactive
         procedure Get_All_Deactivated_Drivers
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result : out .Models.DriverType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Deactivated_Drivers
               (Access_Token,
                Group_Id,
                Result,
                Context);
         end Get_All_Deactivated_Drivers;

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Deactivated_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Deactivated_Driver_By_Id
               (Access_Token,
                Driver_Id_Or_External_Id,
                Result,
                Context);
         end Get_Deactivated_Driver_By_Id;

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Driver_By_Id
               (Access_Token,
                Driver_Id_Or_External_Id,
                Result,
                Context);
         end Get_Driver_By_Id;

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Reactivate_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Reactivate_Driver_Param : in InlineObject4Type;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Reactivate_Driver_By_Id
               (Access_Token,
                Driver_Id_Or_External_Id,
                Reactivate_Driver_Param,
                Result,
                Context);
         end Reactivate_Driver_By_Id;

         --  /fleet/add_address
         procedure Add_Fleet_Address
            (Access_Token : in Swagger.UString;
             Address_Param : in InlineObject2Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Add_Fleet_Address
               (Access_Token,
                Address_Param,
                Context);
         end Add_Fleet_Address;

         --  /addresses
         procedure Add_Organization_Addresses
            (Access_Token : in Swagger.UString;
             Addresses : in InlineObjectType;
             Result : out .Models.AddressType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Add_Organization_Addresses
               (Access_Token,
                Addresses,
                Result,
                Context);
         end Add_Organization_Addresses;

         --  /fleet/dispatch/routes
         procedure Create_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Dispatch_Route
               (Access_Token,
                Create_Dispatch_Route_Params,
                Result,
                Context);
         end Create_Dispatch_Route;

         --  /fleet/drivers/create
         procedure Create_Driver
            (Access_Token : in Swagger.UString;
             Create_Driver_Param : in DriverForCreateType;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Driver
               (Access_Token,
                Create_Driver_Param,
                Result,
                Context);
         end Create_Driver;

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Create_Driver_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Driver_Dispatch_Route
               (Access_Token,
                Driver_Id,
                Create_Dispatch_Route_Params,
                Result,
                Context);
         end Create_Driver_Dispatch_Route;

         --  /fleet/drivers/{driver_id:[0_9]+}/documents
         procedure Create_Driver_Document
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Create_Document_Params : in DocumentCreateType;
             Result : out .Models.DocumentType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Driver_Document
               (Access_Token,
                Driver_Id,
                Create_Document_Params,
                Result,
                Context);
         end Create_Driver_Document;

         --  /fleet/maintenance/dvirs
         procedure Create_Dvir
            (Access_Token : in Swagger.UString;
             Create_Dvir_Param : in InlineObject12Type;
             Result : out .Models.DvirBaseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Dvir
               (Access_Token,
                Create_Dvir_Param,
                Result,
                Context);
         end Create_Dvir;

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Create_Vehicle_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Vehicle_Dispatch_Route
               (Access_Token,
                Vehicle_Id,
                Create_Dispatch_Route_Params,
                Result,
                Context);
         end Create_Vehicle_Dispatch_Route;

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Deactivate_Driver
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Deactivate_Driver
               (Access_Token,
                Driver_Id_Or_External_Id,
                Context);
         end Deactivate_Driver;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Delete_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Delete_Dispatch_Route_By_Id
               (Access_Token,
                Route_Id,
                Context);
         end Delete_Dispatch_Route_By_Id;

         --  /addresses/{addressId}
         procedure Delete_Organization_Address
            (Access_Token : in Swagger.UString;
             Address_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Delete_Organization_Address
               (Access_Token,
                Address_Id,
                Context);
         end Delete_Organization_Address;

         --  /fleet/dispatch/routes
         procedure Fetch_All_Dispatch_Routes
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Fetch_All_Dispatch_Routes
               (Access_Token,
                Group_Id,
                End_Time,
                Duration,
                Result,
                Context);
         end Fetch_All_Dispatch_Routes;

         --  /fleet/dispatch/routes/job_updates
         procedure Fetch_All_Route_Job_Updates
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Sequence_Id : in Swagger.Nullable_UString;
             Include : in Swagger.Nullable_UString;
             Result : out .Models.AllRouteJobUpdatesType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Fetch_All_Route_Job_Updates
               (Access_Token,
                Group_Id,
                Sequence_Id,
                Include,
                Result,
                Context);
         end Fetch_All_Route_Job_Updates;

         --  /fleet/assets/locations
         procedure Get_All_Asset_Current_Locations
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result : out .Models.InlineResponse2001Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Asset_Current_Locations
               (Access_Token,
                Group_Id,
                Result,
                Context);
         end Get_All_Asset_Current_Locations;

         --  /fleet/assets
         procedure Get_All_Assets
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result : out .Models.InlineResponse200Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Assets
               (Access_Token,
                Group_Id,
                Result,
                Context);
         end Get_All_Assets;

         --  /fleet/drivers/inactive
         procedure Get_All_Deactivated_Drivers
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result : out .Models.DriverType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Deactivated_Drivers
               (Access_Token,
                Group_Id,
                Result,
                Context);
         end Get_All_Deactivated_Drivers;

         --  /fleet/assets/{assetId:[0_9]+}/locations
         procedure Get_Asset_Location
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out Swagger.Object_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Asset_Location
               (Access_Token,
                Asset_Id,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Asset_Location;

         --  /fleet/assets/{assetId:[0_9]+}/reefer
         procedure Get_Asset_Reefer
            (Access_Token : in Swagger.UString;
             Asset_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out .Models.AssetReeferResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Asset_Reefer
               (Access_Token,
                Asset_Id,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Asset_Reefer;

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Deactivated_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Deactivated_Driver_By_Id
               (Access_Token,
                Driver_Id_Or_External_Id,
                Result,
                Context);
         end Get_Deactivated_Driver_By_Id;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}
         procedure Get_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Route_By_Id
               (Access_Token,
                Route_Id,
                Result,
                Context);
         end Get_Dispatch_Route_By_Id;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
         procedure Get_Dispatch_Route_History
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Start_Time : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteHistoryType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Route_History
               (Access_Token,
                Route_Id,
                Start_Time,
                End_Time,
                Result,
                Context);
         end Get_Dispatch_Route_History;

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Driver_Id
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Routes_By_Driver_Id
               (Access_Token,
                Driver_Id,
                End_Time,
                Duration,
                Result,
                Context);
         end Get_Dispatch_Routes_By_Driver_Id;

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Routes_By_Vehicle_Id
               (Access_Token,
                Vehicle_Id,
                End_Time,
                Duration,
                Result,
                Context);
         end Get_Dispatch_Routes_By_Vehicle_Id;

         --  /fleet/drivers/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Driver_By_Id
               (Access_Token,
                Driver_Id_Or_External_Id,
                Result,
                Context);
         end Get_Driver_By_Id;

         --  /fleet/drivers/document_types
         procedure Get_Driver_Document_Types_By_Org_Id (Result : out .Models.DocumentTypeType_Vectors.Vector;
         Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Driver_Document_Types_By_Org_Id (Result, Context);
         end Get_Driver_Document_Types_By_Org_Id;

         --  /fleet/drivers/documents
         procedure Get_Driver_Documents_By_Org_Id
            (Access_Token : in Swagger.UString;
             End_Ms : in Swagger.Nullable_Long;
             Duration_Ms : in Swagger.Nullable_Long;
             Result : out .Models.DocumentType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Driver_Documents_By_Org_Id
               (Access_Token,
                End_Ms,
                Duration_Ms,
                Result,
                Context);
         end Get_Driver_Documents_By_Org_Id;

         --  /fleet/drivers/{driverId:[0_9]+}/safety/score
         procedure Get_Driver_Safety_Score
            (Driver_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out .Models.DriverSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Driver_Safety_Score
               (Driver_Id,
                Access_Token,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Driver_Safety_Score;

         --  /fleet/maintenance/dvirs
         procedure Get_Dvirs
            (Access_Token : in Swagger.UString;
             End_Ms : in Integer;
             Duration_Ms : in Integer;
             Group_Id : in Swagger.Nullable_Integer;
             Result : out .Models.DvirListResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dvirs
               (Access_Token,
                End_Ms,
                Duration_Ms,
                Group_Id,
                Result,
                Context);
         end Get_Dvirs;

         --  /fleet/drivers
         procedure Get_Fleet_Drivers
            (Access_Token : in Swagger.UString;
             Group_Drivers_Param : in InlineObject3Type;
             Result : out .Models.DriversResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Drivers
               (Access_Token,
                Group_Drivers_Param,
                Result,
                Context);
         end Get_Fleet_Drivers;

         --  /fleet/drivers/{driver_id:[0_9]+}/hos_daily_logs
         procedure Get_Fleet_Drivers_Hos_Daily_Logs
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Hos_Logs_Param : in InlineObject6Type;
             Result : out .Models.DriverDailyLogResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Drivers_Hos_Daily_Logs
               (Access_Token,
                Driver_Id,
                Hos_Logs_Param,
                Result,
                Context);
         end Get_Fleet_Drivers_Hos_Daily_Logs;

         --  /fleet/drivers/summary
         procedure Get_Fleet_Drivers_Summary
            (Access_Token : in Swagger.UString;
             Drivers_Summary_Param : in InlineObject5Type;
             Snap_To_Day_Bounds : in Swagger.Nullable_Boolean;
             Result : out .Models.DriversSummaryResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Drivers_Summary
               (Access_Token,
                Drivers_Summary_Param,
                Snap_To_Day_Bounds,
                Result,
                Context);
         end Get_Fleet_Drivers_Summary;

         --  /fleet/hos_authentication_logs
         procedure Get_Fleet_Hos_Authentication_Logs
            (Access_Token : in Swagger.UString;
             Hos_Authentication_Logs_Param : in InlineObject7Type;
             Result : out .Models.HosAuthenticationLogsResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Hos_Authentication_Logs
               (Access_Token,
                Hos_Authentication_Logs_Param,
                Result,
                Context);
         end Get_Fleet_Hos_Authentication_Logs;

         --  /fleet/hos_logs
         procedure Get_Fleet_Hos_Logs
            (Access_Token : in Swagger.UString;
             Hos_Logs_Param : in InlineObject8Type;
             Result : out .Models.HosLogsResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Hos_Logs
               (Access_Token,
                Hos_Logs_Param,
                Result,
                Context);
         end Get_Fleet_Hos_Logs;

         --  /fleet/hos_logs_summary
         procedure Get_Fleet_Hos_Logs_Summary
            (Access_Token : in Swagger.UString;
             Hos_Logs_Param : in InlineObject9Type;
             Result : out .Models.HosLogsSummaryResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Hos_Logs_Summary
               (Access_Token,
                Hos_Logs_Param,
                Result,
                Context);
         end Get_Fleet_Hos_Logs_Summary;

         --  /fleet/locations
         procedure Get_Fleet_Locations
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject11Type;
             Result : out .Models.InlineResponse2003Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Locations
               (Access_Token,
                Group_Param,
                Result,
                Context);
         end Get_Fleet_Locations;

         --  /fleet/maintenance/list
         procedure Get_Fleet_Maintenance_List
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject13Type;
             Result : out .Models.InlineResponse2004Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Maintenance_List
               (Access_Token,
                Group_Param,
                Result,
                Context);
         end Get_Fleet_Maintenance_List;

         --  /fleet/trips
         procedure Get_Fleet_Trips
            (Access_Token : in Swagger.UString;
             Trips_Param : in InlineObject15Type;
             Result : out .Models.TripResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Trips
               (Access_Token,
                Trips_Param,
                Result,
                Context);
         end Get_Fleet_Trips;

         --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Get_Fleet_Vehicle
            (Access_Token : in Swagger.UString;
             Vehicle_Id_Or_External_Id : in Swagger.UString;
             Result : out .Models.FleetVehicleResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Fleet_Vehicle
               (Access_Token,
                Vehicle_Id_Or_External_Id,
                Result,
                Context);
         end Get_Fleet_Vehicle;

         --  /addresses/{addressId}
         procedure Get_Organization_Address
            (Access_Token : in Swagger.UString;
             Address_Id : in Swagger.Long;
             Result : out .Models.AddressType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Organization_Address
               (Access_Token,
                Address_Id,
                Result,
                Context);
         end Get_Organization_Address;

         --  /addresses
         procedure Get_Organization_Addresses
            (Access_Token : in Swagger.UString;
             Result : out .Models.AddressType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Organization_Addresses
               (Access_Token,
                Result,
                Context);
         end Get_Organization_Addresses;

         --  /contacts/{contact_id}
         procedure Get_Organization_Contact
            (Access_Token : in Swagger.UString;
             Contact_Id : in Swagger.Long;
             Result : out .Models.ContactType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Organization_Contact
               (Access_Token,
                Contact_Id,
                Result,
                Context);
         end Get_Organization_Contact;

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
         procedure Get_Vehicle_Harsh_Event
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Timestamp : in Swagger.Long;
             Result : out .Models.VehicleHarshEventResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Vehicle_Harsh_Event
               (Vehicle_Id,
                Access_Token,
                Timestamp,
                Result,
                Context);
         end Get_Vehicle_Harsh_Event;

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/locations
         procedure Get_Vehicle_Locations
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out .Models.FleetVehicleLocationType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Vehicle_Locations
               (Access_Token,
                Vehicle_Id,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Vehicle_Locations;

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
         procedure Get_Vehicle_Safety_Score
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out .Models.VehicleSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Vehicle_Safety_Score
               (Vehicle_Id,
                Access_Token,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Vehicle_Safety_Score;

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
             Result : out .Models.InlineResponse2005Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Vehicle_Stats
               (Access_Token,
                Start_Ms,
                End_Ms,
                Series,
                Tag_Ids,
                Starting_After,
                Ending_Before,
                Limit,
                Result,
                Context);
         end Get_Vehicle_Stats;

         --  /fleet/vehicles/locations
         procedure Get_Vehicles_Locations
            (Access_Token : in Swagger.UString;
             Start_Ms : in Integer;
             End_Ms : in Integer;
             Result : out Swagger.Object_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Vehicles_Locations
               (Access_Token,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Vehicles_Locations;

         --  /contacts
         procedure List_Contacts
            (Access_Token : in Swagger.UString;
             Result : out .Models.ContactType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.List_Contacts
               (Access_Token,
                Result,
                Context);
         end List_Contacts;

         --  /fleet/list
         procedure List_Fleet
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject10Type;
             Starting_After : in Swagger.Nullable_UString;
             Ending_Before : in Swagger.Nullable_UString;
             Limit : in Swagger.Nullable_Long;
             Result : out .Models.InlineResponse2002Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.List_Fleet
               (Access_Token,
                Group_Param,
                Starting_After,
                Ending_Before,
                Limit,
                Result,
                Context);
         end List_Fleet;

         --  /fleet/vehicles/{vehicle_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Patch_Fleet_Vehicle
            (Access_Token : in Swagger.UString;
             Vehicle_Id_Or_External_Id : in Swagger.UString;
             Data : in InlineObject16Type;
             Result : out .Models.FleetVehicleResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Patch_Fleet_Vehicle
               (Access_Token,
                Vehicle_Id_Or_External_Id,
                Data,
                Result,
                Context);
         end Patch_Fleet_Vehicle;

         --  /fleet/drivers/inactive/{driver_id:[0_9]+ | external_id:[a_zA_Z0_9]+}
         procedure Reactivate_Driver_By_Id
            (Access_Token : in Swagger.UString;
             Driver_Id_Or_External_Id : in Swagger.UString;
             Reactivate_Driver_Param : in InlineObject4Type;
             Result : out .Models.DriverType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Reactivate_Driver_By_Id
               (Access_Token,
                Driver_Id_Or_External_Id,
                Reactivate_Driver_Param,
                Result,
                Context);
         end Reactivate_Driver_By_Id;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Update_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Update_Dispatch_Route_Params : in DispatchRouteType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Update_Dispatch_Route_By_Id
               (Access_Token,
                Route_Id,
                Update_Dispatch_Route_Params,
                Result,
                Context);
         end Update_Dispatch_Route_By_Id;

         --  /addresses/{addressId}
         procedure Update_Organization_Address
            (Access_Token : in Swagger.UString;
             Address_Id : in Swagger.Long;
             Address : in InlineObject1Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Update_Organization_Address
               (Access_Token,
                Address_Id,
                Address,
                Context);
         end Update_Organization_Address;

         --  /fleet/set_data
         procedure Update_Vehicles
            (Access_Token : in Swagger.UString;
             Vehicle_Update_Param : in InlineObject14Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Update_Vehicles
               (Access_Token,
                Vehicle_Update_Param,
                Context);
         end Update_Vehicles;

         --  /industrial/data
         procedure Get_All_Data_Inputs
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Start_Ms : in Swagger.Nullable_Long;
             End_Ms : in Swagger.Nullable_Long;
             Result : out .Models.InlineResponse2006Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Data_Inputs
               (Access_Token,
                Group_Id,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_All_Data_Inputs;

         --  /industrial/data/{data_input_id:[0_9]+}
         procedure Get_Data_Input
            (Access_Token : in Swagger.UString;
             Data_Input_Id : in Swagger.Long;
             Start_Ms : in Swagger.Nullable_Long;
             End_Ms : in Swagger.Nullable_Long;
             Result : out .Models.DataInputHistoryResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Data_Input
               (Access_Token,
                Data_Input_Id,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Data_Input;

         --  /machines/list
         procedure Get_Machines
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject18Type;
             Result : out .Models.InlineResponse2007Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Machines
               (Access_Token,
                Group_Param,
                Result,
                Context);
         end Get_Machines;

         --  /machines/history
         procedure Get_Machines_History
            (Access_Token : in Swagger.UString;
             History_Param : in InlineObject17Type;
             Result : out .Models.MachineHistoryResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Machines_History
               (Access_Token,
                History_Param,
                Result,
                Context);
         end Get_Machines_History;

         --  /fleet/dispatch/routes
         procedure Create_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Dispatch_Route
               (Access_Token,
                Create_Dispatch_Route_Params,
                Result,
                Context);
         end Create_Dispatch_Route;

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Create_Driver_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Driver_Dispatch_Route
               (Access_Token,
                Driver_Id,
                Create_Dispatch_Route_Params,
                Result,
                Context);
         end Create_Driver_Dispatch_Route;

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Create_Vehicle_Dispatch_Route
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             Create_Dispatch_Route_Params : in DispatchRouteCreateType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Vehicle_Dispatch_Route
               (Access_Token,
                Vehicle_Id,
                Create_Dispatch_Route_Params,
                Result,
                Context);
         end Create_Vehicle_Dispatch_Route;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Delete_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Delete_Dispatch_Route_By_Id
               (Access_Token,
                Route_Id,
                Context);
         end Delete_Dispatch_Route_By_Id;

         --  /fleet/dispatch/routes
         procedure Fetch_All_Dispatch_Routes
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Fetch_All_Dispatch_Routes
               (Access_Token,
                Group_Id,
                End_Time,
                Duration,
                Result,
                Context);
         end Fetch_All_Dispatch_Routes;

         --  /fleet/dispatch/routes/job_updates
         procedure Fetch_All_Route_Job_Updates
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Sequence_Id : in Swagger.Nullable_UString;
             Include : in Swagger.Nullable_UString;
             Result : out .Models.AllRouteJobUpdatesType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Fetch_All_Route_Job_Updates
               (Access_Token,
                Group_Id,
                Sequence_Id,
                Include,
                Result,
                Context);
         end Fetch_All_Route_Job_Updates;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}
         procedure Get_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Route_By_Id
               (Access_Token,
                Route_Id,
                Result,
                Context);
         end Get_Dispatch_Route_By_Id;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/history
         procedure Get_Dispatch_Route_History
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Start_Time : in Swagger.Nullable_Long;
             End_Time : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteHistoryType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Route_History
               (Access_Token,
                Route_Id,
                Start_Time,
                End_Time,
                Result,
                Context);
         end Get_Dispatch_Route_History;

         --  /fleet/drivers/{driver_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Driver_Id
            (Access_Token : in Swagger.UString;
             Driver_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Routes_By_Driver_Id
               (Access_Token,
                Driver_Id,
                End_Time,
                Duration,
                Result,
                Context);
         end Get_Dispatch_Routes_By_Driver_Id;

         --  /fleet/vehicles/{vehicle_id:[0_9]+}/dispatch/routes
         procedure Get_Dispatch_Routes_By_Vehicle_Id
            (Access_Token : in Swagger.UString;
             Vehicle_Id : in Swagger.Long;
             End_Time : in Swagger.Nullable_Long;
             Duration : in Swagger.Nullable_Long;
             Result : out .Models.DispatchRouteType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Dispatch_Routes_By_Vehicle_Id
               (Access_Token,
                Vehicle_Id,
                End_Time,
                Duration,
                Result,
                Context);
         end Get_Dispatch_Routes_By_Vehicle_Id;

         --  /fleet/dispatch/routes/{route_id:[0_9]+}/
         procedure Update_Dispatch_Route_By_Id
            (Access_Token : in Swagger.UString;
             Route_Id : in Swagger.Long;
             Update_Dispatch_Route_Params : in DispatchRouteType;
             Result : out .Models.DispatchRouteType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Update_Dispatch_Route_By_Id
               (Access_Token,
                Route_Id,
                Update_Dispatch_Route_Params,
                Result,
                Context);
         end Update_Dispatch_Route_By_Id;

         --  /fleet/drivers/{driverId:[0_9]+}/safety/score
         procedure Get_Driver_Safety_Score
            (Driver_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out .Models.DriverSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Driver_Safety_Score
               (Driver_Id,
                Access_Token,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Driver_Safety_Score;

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/harsh_event
         procedure Get_Vehicle_Harsh_Event
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Timestamp : in Swagger.Long;
             Result : out .Models.VehicleHarshEventResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Vehicle_Harsh_Event
               (Vehicle_Id,
                Access_Token,
                Timestamp,
                Result,
                Context);
         end Get_Vehicle_Harsh_Event;

         --  /fleet/vehicles/{vehicleId:[0_9]+}/safety/score
         procedure Get_Vehicle_Safety_Score
            (Vehicle_Id : in Swagger.Long;
             Access_Token : in Swagger.UString;
             Start_Ms : in Swagger.Long;
             End_Ms : in Swagger.Long;
             Result : out .Models.VehicleSafetyScoreResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Vehicle_Safety_Score
               (Vehicle_Id,
                Access_Token,
                Start_Ms,
                End_Ms,
                Result,
                Context);
         end Get_Vehicle_Safety_Score;

         --  /sensors/list
         procedure Get_Sensors
            (Access_Token : in Swagger.UString;
             Group_Param : in InlineObject23Type;
             Result : out .Models.InlineResponse2008Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Sensors
               (Access_Token,
                Group_Param,
                Result,
                Context);
         end Get_Sensors;

         --  /sensors/cargo
         procedure Get_Sensors_Cargo
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject19Type;
             Result : out .Models.CargoResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Sensors_Cargo
               (Access_Token,
                Sensor_Param,
                Result,
                Context);
         end Get_Sensors_Cargo;

         --  /sensors/door
         procedure Get_Sensors_Door
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject20Type;
             Result : out .Models.DoorResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Sensors_Door
               (Access_Token,
                Sensor_Param,
                Result,
                Context);
         end Get_Sensors_Door;

         --  /sensors/history
         procedure Get_Sensors_History
            (Access_Token : in Swagger.UString;
             History_Param : in InlineObject21Type;
             Result : out .Models.SensorHistoryResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Sensors_History
               (Access_Token,
                History_Param,
                Result,
                Context);
         end Get_Sensors_History;

         --  /sensors/humidity
         procedure Get_Sensors_Humidity
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject22Type;
             Result : out .Models.HumidityResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Sensors_Humidity
               (Access_Token,
                Sensor_Param,
                Result,
                Context);
         end Get_Sensors_Humidity;

         --  /sensors/temperature
         procedure Get_Sensors_Temperature
            (Access_Token : in Swagger.UString;
             Sensor_Param : in InlineObject24Type;
             Result : out .Models.TemperatureResponseType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Sensors_Temperature
               (Access_Token,
                Sensor_Param,
                Result,
                Context);
         end Get_Sensors_Temperature;

         --  /tags
         procedure Create_Tag
            (Access_Token : in Swagger.UString;
             Tag_Create_Params : in TagCreateType;
             Result : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Create_Tag
               (Access_Token,
                Tag_Create_Params,
                Result,
                Context);
         end Create_Tag;

         --  /tags/{tag_id:[0_9]+}
         procedure Delete_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Delete_Tag_By_Id
               (Access_Token,
                Tag_Id,
                Context);
         end Delete_Tag_By_Id;

         --  /tags
         procedure Get_All_Tags
            (Access_Token : in Swagger.UString;
             Group_Id : in Swagger.Nullable_Long;
             Result : out .Models.InlineResponse2009Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_All_Tags
               (Access_Token,
                Group_Id,
                Result,
                Context);
         end Get_All_Tags;

         --  /tags/{tag_id:[0_9]+}
         procedure Get_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Result : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Tag_By_Id
               (Access_Token,
                Tag_Id,
                Result,
                Context);
         end Get_Tag_By_Id;

         --  /tags/{tag_id:[0_9]+}
         procedure Modify_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Tag_Modify_Params : in TagModifyType;
             Result : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Modify_Tag_By_Id
               (Access_Token,
                Tag_Id,
                Tag_Modify_Params,
                Result,
                Context);
         end Modify_Tag_By_Id;

         --  /tags/{tag_id:[0_9]+}
         procedure Update_Tag_By_Id
            (Access_Token : in Swagger.UString;
             Tag_Id : in Swagger.Long;
             Update_Tag_Params : in TagUpdateType;
             Result : out .Models.TagType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Update_Tag_By_Id
               (Access_Token,
                Tag_Id,
                Update_Tag_Params,
                Result,
                Context);
         end Update_Tag_By_Id;

         --  /users/{userId:[0_9]+}
         procedure Delete_User_By_Id
            (Access_Token : in Swagger.UString;
             User_Id : in Swagger.Long;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Delete_User_By_Id
               (Access_Token,
                User_Id,
                Context);
         end Delete_User_By_Id;

         --  /users/{userId:[0_9]+}
         procedure Get_User_By_Id
            (Access_Token : in Swagger.UString;
             User_Id : in Swagger.Long;
             Result : out .Models.UserType;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_User_By_Id
               (Access_Token,
                User_Id,
                Result,
                Context);
         end Get_User_By_Id;

         --  /user_roles
         procedure List_User_Roles
            (Access_Token : in Swagger.UString;
             Result : out .Models.UserRoleType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.List_User_Roles
               (Access_Token,
                Result,
                Context);
         end List_User_Roles;

         --  /users
         procedure List_Users
            (Access_Token : in Swagger.UString;
             Result : out .Models.UserType_Vectors.Vector;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.List_Users
               (Access_Token,
                Result,
                Context);
         end List_Users;

      end Server;

   end Shared_Instance;

end .Skeletons;
