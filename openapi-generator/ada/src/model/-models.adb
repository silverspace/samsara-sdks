--  Samsara API
--  # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built_in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off_the_shelf HTTP clients. We allow you to interact securely with our API from a client_side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go_to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings_>Organization_>API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client_side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error_Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |_____________|________________|___________________________________________________________________| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en_us/sections/360000538054_APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
--
--  OpenAPI spec version: 1.0.0
--  
--
--  NOTE: This package is auto generated by the swagger code generator 4.0.0-SNAPSHOT.
--  https://openapi-generator.tech
--  Do not edit the class manually.

package body .Models is

   use Swagger.Streams;



   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerCheckEngineLightType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("isOn", Value.Is_On);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerCheckEngineLightType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerCheckEngineLightType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "isOn", Value.Is_On);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerCheckEngineLightType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleMaintenancePassengerCheckEngineLightType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939DiagnosticTroubleCodesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("spnDescription", Value.Spn_Description);
      Into.Write_Entity ("fmiText", Value.Fmi_Text);
      Into.Write_Entity ("spnId", Value.Spn_Id);
      Into.Write_Entity ("occurrenceCount", Value.Occurrence_Count);
      Into.Write_Entity ("txId", Value.Tx_Id);
      Into.Write_Entity ("fmiId", Value.Fmi_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939DiagnosticTroubleCodesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939DiagnosticTroubleCodesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "spnDescription", Value.Spn_Description);
      Swagger.Streams.Deserialize (Object, "fmiText", Value.Fmi_Text);
      Swagger.Streams.Deserialize (Object, "spnId", Value.Spn_Id);
      Swagger.Streams.Deserialize (Object, "occurrenceCount", Value.Occurrence_Count);
      Swagger.Streams.Deserialize (Object, "txId", Value.Tx_Id);
      Swagger.Streams.Deserialize (Object, "fmiId", Value.Fmi_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939DiagnosticTroubleCodesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleMaintenanceJ1939DiagnosticTroubleCodesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseLocationType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("address", Value.Address);
      Into.Write_Entity ("latitude", Value.Latitude);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseLocationType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseLocationType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "address", Value.Address);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseLocationType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleHarshEventResponseLocationType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("downloadForwardVideoUrl", Value.Download_Forward_Video_Url);
      Into.Write_Entity ("downloadInwardVideoUrl", Value.Download_Inward_Video_Url);
      Into.Write_Entity ("downloadTrackedInwardVideoUrl", Value.Download_Tracked_Inward_Video_Url);
      Into.Write_Entity ("harshEventType", Value.Harsh_Event_Type);
      Into.Write_Entity ("incidentReportUrl", Value.Incident_Report_Url);
      Into.Write_Entity ("isDistracted", Value.Is_Distracted);
      Serialize (Into, "location", Value.Location);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "downloadForwardVideoUrl", Value.Download_Forward_Video_Url);
      Swagger.Streams.Deserialize (Object, "downloadInwardVideoUrl", Value.Download_Inward_Video_Url);
      Swagger.Streams.Deserialize (Object, "downloadTrackedInwardVideoUrl", Value.Download_Tracked_Inward_Video_Url);
      Swagger.Streams.Deserialize (Object, "harshEventType", Value.Harsh_Event_Type);
      Swagger.Streams.Deserialize (Object, "incidentReportUrl", Value.Incident_Report_Url);
      Swagger.Streams.Deserialize (Object, "isDistracted", Value.Is_Distracted);
      Swagger.Streams.Deserialize (Object, "location", Value.Location);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleHarshEventResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseStartCoordinatesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("latitude", Value.Latitude);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseStartCoordinatesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseStartCoordinatesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseStartCoordinatesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TripResponseStartCoordinatesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseResultsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("series", Value.Series);
      Serialize (Into, "series", Value.Series);
      Into.Write_Entity ("timeMs", Value.Time_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseResultsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseResultsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "series", Value.Series);
      Swagger.Streams.Deserialize (Object, "timeMs", Value.Time_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseResultsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SensorHistoryResponseResultsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "results", Value.Results);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "results", Value.Results);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SensorHistoryResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseVibrationsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("X", Value.X);
      Into.Write_Entity ("Y", Value.Y);
      Into.Write_Entity ("Z", Value.Z);
      Serialize (Into, "time", Value.Time);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseVibrationsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseVibrationsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "X", Value.X);
      Swagger.Streams.Deserialize (Object, "Y", Value.Y);
      Swagger.Streams.Deserialize (Object, "Z", Value.Z);
      Swagger.Streams.Deserialize (Object, "time", Value.Time);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseVibrationsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : MachineHistoryResponseVibrationsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseMachinesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("id", Value.Id);
      Serialize (Into, "vibrations", Value.Vibrations);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseMachinesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseMachinesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "vibrations", Value.Vibrations);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseMachinesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : MachineHistoryResponseMachinesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "machines", Value.Machines);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "machines", Value.Machines);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : MachineHistoryResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseDriversType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "timeUntilBreak", Value.Time_Until_Break);
      Into.Write_Entity ("vehicleName", Value.Vehicle_Name);
      Serialize (Into, "drivingInViolationToday", Value.Driving_In_Violation_Today);
      Serialize (Into, "driverId", Value.Driver_Id);
      Serialize (Into, "cycleRemaining", Value.Cycle_Remaining);
      Into.Write_Entity ("driverName", Value.Driver_Name);
      Into.Write_Entity ("dutyStatus", Value.Duty_Status);
      Serialize (Into, "cycleTomorrow", Value.Cycle_Tomorrow);
      Serialize (Into, "shiftDriveRemaining", Value.Shift_Drive_Remaining);
      Serialize (Into, "timeInCurrentStatus", Value.Time_In_Current_Status);
      Serialize (Into, "drivingInViolationCycle", Value.Driving_In_Violation_Cycle);
      Serialize (Into, "shiftRemaining", Value.Shift_Remaining);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseDriversType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseDriversType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "timeUntilBreak", Value.Time_Until_Break);
      Swagger.Streams.Deserialize (Object, "vehicleName", Value.Vehicle_Name);
      Swagger.Streams.Deserialize (Object, "drivingInViolationToday", Value.Driving_In_Violation_Today);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "cycleRemaining", Value.Cycle_Remaining);
      Swagger.Streams.Deserialize (Object, "driverName", Value.Driver_Name);
      Swagger.Streams.Deserialize (Object, "dutyStatus", Value.Duty_Status);
      Swagger.Streams.Deserialize (Object, "cycleTomorrow", Value.Cycle_Tomorrow);
      Swagger.Streams.Deserialize (Object, "shiftDriveRemaining", Value.Shift_Drive_Remaining);
      Swagger.Streams.Deserialize (Object, "timeInCurrentStatus", Value.Time_In_Current_Status);
      Swagger.Streams.Deserialize (Object, "drivingInViolationCycle", Value.Driving_In_Violation_Cycle);
      Swagger.Streams.Deserialize (Object, "shiftRemaining", Value.Shift_Remaining);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseDriversType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HosLogsSummaryResponseDriversType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "drivers", Value.Drivers);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "drivers", Value.Drivers);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HosLogsSummaryResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseAuthenticationLogsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("actionType", Value.Action_Type);
      Into.Write_Entity ("address", Value.Address);
      Into.Write_Entity ("city", Value.City);
      Serialize (Into, "happenedAtMs", Value.Happened_At_Ms);
      Into.Write_Entity ("addressName", Value.Address_Name);
      Into.Write_Entity ("state", Value.State);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseAuthenticationLogsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseAuthenticationLogsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "actionType", Value.Action_Type);
      Swagger.Streams.Deserialize (Object, "address", Value.Address);
      Swagger.Streams.Deserialize (Object, "city", Value.City);
      Swagger.Streams.Deserialize (Object, "happenedAtMs", Value.Happened_At_Ms);
      Swagger.Streams.Deserialize (Object, "addressName", Value.Address_Name);
      Swagger.Streams.Deserialize (Object, "state", Value.State);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseAuthenticationLogsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HosAuthenticationLogsResponseAuthenticationLogsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "authenticationLogs", Value.Authentication_Logs);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "authenticationLogs", Value.Authentication_Logs);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HosAuthenticationLogsResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseVehicleType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseVehicleType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseVehicleType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseVehicleType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DvirBaseVehicleType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseNextDriverSignatureType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "signedAt", Value.Signed_At);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("email", Value.Email);
      Into.Write_Entity ("username", Value.Username);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseNextDriverSignatureType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseNextDriverSignatureType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "signedAt", Value.Signed_At);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "email", Value.Email);
      Swagger.Streams.Deserialize (Object, "username", Value.Username);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseNextDriverSignatureType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DvirBaseNextDriverSignatureType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseAuthorSignatureType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "mechanicUserId", Value.Mechanic_User_Id);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "signedAt", Value.Signed_At);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("email", Value.Email);
      Into.Write_Entity ("username", Value.Username);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseAuthorSignatureType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseAuthorSignatureType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "mechanicUserId", Value.Mechanic_User_Id);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "signedAt", Value.Signed_At);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "email", Value.Email);
      Swagger.Streams.Deserialize (Object, "username", Value.Username);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseAuthorSignatureType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DvirBaseAuthorSignatureType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeNumberValueTypeMetadataType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "numDecimalPlaces", Value.Num_Decimal_Places);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeNumberValueTypeMetadataType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeNumberValueTypeMetadataType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "numDecimalPlaces", Value.Num_Decimal_Places);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeNumberValueTypeMetadataType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentFieldTypeNumberValueTypeMetadataType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("label", Value.Label);
      Serialize (Into, "numberValueTypeMetadata", Value.Number_Value_Type_Metadata);
      Into.Write_Entity ("valueType", Value.Value_Type);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "label", Value.Label);
      Swagger.Streams.Deserialize (Object, "numberValueTypeMetadata", Value.Number_Value_Type_Metadata);
      Swagger.Streams.Deserialize (Object, "valueType", Value.Value_Type);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentFieldTypeType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponsePointsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("value", Value.Value);
      Serialize (Into, "timeMs", Value.Time_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponsePointsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponsePointsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
      Swagger.Streams.Deserialize (Object, "timeMs", Value.Time_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponsePointsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DataInputHistoryResponsePointsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "points", Value.Points);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "points", Value.Points);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DataInputHistoryResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2006Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "dataInputs", Value.Data_Inputs);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2006Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2006Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "dataInputs", Value.Data_Inputs);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2006Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2006Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarmsType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "severity", Value.Severity);
      Into.Write_Entity ("operatorAction", Value.Operator_Action);
      Into.Write_Entity ("description", Value.Description);
      Serialize (Into, "alarmCode", Value.Alarm_Code);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarmsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarmsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "severity", Value.Severity);
      Swagger.Streams.Deserialize (Object, "operatorAction", Value.Operator_Action);
      Swagger.Streams.Deserialize (Object, "description", Value.Description);
      Swagger.Streams.Deserialize (Object, "alarmCode", Value.Alarm_Code);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarmsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsAlarmsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarms1Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "alarms", Value.Alarms);
      Serialize (Into, "changedAtMs", Value.Changed_At_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarms1Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarms1Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "alarms", Value.Alarms);
      Swagger.Streams.Deserialize (Object, "changedAtMs", Value.Changed_At_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarms1Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsAlarms1Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsSetPointType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "tempInMilliC", Value.Temp_In_Milli_C);
      Serialize (Into, "changedAtMs", Value.Changed_At_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsSetPointType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsSetPointType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "tempInMilliC", Value.Temp_In_Milli_C);
      Swagger.Streams.Deserialize (Object, "changedAtMs", Value.Changed_At_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsSetPointType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsSetPointType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsPowerStatusType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "changedAtMs", Value.Changed_At_Ms);
      Into.Write_Entity ("status", Value.Status);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsPowerStatusType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsPowerStatusType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "changedAtMs", Value.Changed_At_Ms);
      Swagger.Streams.Deserialize (Object, "status", Value.Status);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsPowerStatusType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsPowerStatusType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCableType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("assetType", Value.Asset_Type);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCableType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCableType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assetType", Value.Asset_Type);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCableType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetCableType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("assetSerialNumber", Value.Asset_Serial_Number);
      Serialize (Into, "cable", Value.Cable);
      Into.Write_Entity ("engineHours", Value.Engine_Hours);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assetSerialNumber", Value.Asset_Serial_Number);
      Swagger.Streams.Deserialize (Object, "cable", Value.Cable);
      Swagger.Streams.Deserialize (Object, "engineHours", Value.Engine_Hours);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse200Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "assets", Value.Assets);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse200Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse200Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse200Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse200Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonVerticesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("latitude", Value.Latitude);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonVerticesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonVerticesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonVerticesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AddressGeofencePolygonVerticesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "vertices", Value.Vertices);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "vertices", Value.Vertices);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AddressGeofencePolygonType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject22Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("sensors", Value.Sensors);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject22Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject22Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject22Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject22Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorsHistorySeriesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("field", Value.Field);
      Serialize (Into, "widgetId", Value.Widget_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorsHistorySeriesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorsHistorySeriesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "field", Value.Field);
      Swagger.Streams.Deserialize (Object, "widgetId", Value.Widget_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorsHistorySeriesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SensorsHistorySeriesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject21Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Into.Write_Entity ("fillMissing", Value.Fill_Missing);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "series", Value.Series);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Into.Write_Entity ("stepMs", Value.Step_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject21Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject21Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "fillMissing", Value.Fill_Missing);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "series", Value.Series);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
      Swagger.Streams.Deserialize (Object, "stepMs", Value.Step_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject21Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject21Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject19Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("sensors", Value.Sensors);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject19Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject19Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject19Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject19Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject18Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject18Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject18Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject18Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject18Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject15Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Serialize (Into, "vehicleId", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject15Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject15Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject15Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject15Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject12Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("inspectionType", Value.Inspection_Type);
      Into.Write_Entity ("mechanicNotes", Value.Mechanic_Notes);
      Into.Write_Entity ("odometerMiles", Value.Odometer_Miles);
      Into.Write_Entity ("previousDefectsCorrected", Value.Previous_Defects_Corrected);
      Into.Write_Entity ("previousDefectsIgnored", Value.Previous_Defects_Ignored);
      Into.Write_Entity ("safe", Value.Safe);
      Into.Write_Entity ("trailerId", Value.Trailer_Id);
      Into.Write_Entity ("userEmail", Value.User_Email);
      Into.Write_Entity ("vehicleId", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject12Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject12Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "inspectionType", Value.Inspection_Type);
      Swagger.Streams.Deserialize (Object, "mechanicNotes", Value.Mechanic_Notes);
      Swagger.Streams.Deserialize (Object, "odometerMiles", Value.Odometer_Miles);
      Swagger.Streams.Deserialize (Object, "previousDefectsCorrected", Value.Previous_Defects_Corrected);
      Swagger.Streams.Deserialize (Object, "previousDefectsIgnored", Value.Previous_Defects_Ignored);
      Swagger.Streams.Deserialize (Object, "safe", Value.Safe);
      Swagger.Streams.Deserialize (Object, "trailerId", Value.Trailer_Id);
      Swagger.Streams.Deserialize (Object, "userEmail", Value.User_Email);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject12Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject12Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject11Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject11Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject11Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject11Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject11Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject10Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject10Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject10Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject10Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject10Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject8Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject8Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject8Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject8Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject8Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject6Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject6Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject6Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject6Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject6Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject4Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("reactivate", Value.Reactivate);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject4Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject4Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "reactivate", Value.Reactivate);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject4Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject4Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject2Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("address", Value.Address);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("radius", Value.Radius);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject2Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject2Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "address", Value.Address);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "radius", Value.Radius);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject2Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject2Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PrevJobStatusType) is
   begin
      Into.Start_Entity (Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PrevJobStatusType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PrevJobStatusType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PrevJobStatusType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : PrevJobStatusType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobStatusType) is
   begin
      Into.Start_Entity (Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobStatusType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobStatusType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobStatusType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : JobStatusType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("destination_address", Value.Destination_Address);
      Serialize (Into, "destination_address_id", Value.Destination_Address_Id);
      Into.Write_Entity ("destination_lat", Value.Destination_Lat);
      Into.Write_Entity ("destination_lng", Value.Destination_Lng);
      Into.Write_Entity ("destination_name", Value.Destination_Name);
      Into.Write_Entity ("notes", Value.Notes);
      Serialize (Into, "scheduled_arrival_time_ms", Value.Scheduled_Arrival_Time_Ms);
      Serialize (Into, "scheduled_departure_time_ms", Value.Scheduled_Departure_Time_Ms);
      Serialize (Into, "arrived_at_ms", Value.Arrived_At_Ms);
      Serialize (Into, "completed_at_ms", Value.Completed_At_Ms);
      Serialize (Into, "dispatch_route_id", Value.Dispatch_Route_Id);
      Serialize (Into, "driver_id", Value.Driver_Id);
      Serialize (Into, "en_route_at_ms", Value.En_Route_At_Ms);
      Serialize (Into, "estimated_arrival_ms", Value.Estimated_Arrival_Ms);
      Into.Write_Entity ("fleet_viewer_url", Value.Fleet_Viewer_Url);
      Serialize (Into, "group_id", Value.Group_Id);
      Serialize (Into, "id", Value.Id);
      Serialize (Into, "job_state", Value.Job_State);
      Serialize (Into, "skipped_at_ms", Value.Skipped_At_Ms);
      Serialize (Into, "vehicle_id", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "destination_address", Value.Destination_Address);
      Swagger.Streams.Deserialize (Object, "destination_address_id", Value.Destination_Address_Id);
      Swagger.Streams.Deserialize (Object, "destination_lat", Value.Destination_Lat);
      Swagger.Streams.Deserialize (Object, "destination_lng", Value.Destination_Lng);
      Swagger.Streams.Deserialize (Object, "destination_name", Value.Destination_Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "scheduled_arrival_time_ms", Value.Scheduled_Arrival_Time_Ms);
      Swagger.Streams.Deserialize (Object, "scheduled_departure_time_ms", Value.Scheduled_Departure_Time_Ms);
      Swagger.Streams.Deserialize (Object, "arrived_at_ms", Value.Arrived_At_Ms);
      Swagger.Streams.Deserialize (Object, "completed_at_ms", Value.Completed_At_Ms);
      Swagger.Streams.Deserialize (Object, "dispatch_route_id", Value.Dispatch_Route_Id);
      Swagger.Streams.Deserialize (Object, "driver_id", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "en_route_at_ms", Value.En_Route_At_Ms);
      Swagger.Streams.Deserialize (Object, "estimated_arrival_ms", Value.Estimated_Arrival_Ms);
      Swagger.Streams.Deserialize (Object, "fleet_viewer_url", Value.Fleet_Viewer_Url);
      Swagger.Streams.Deserialize (Object, "group_id", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "job_state", Value.Job_State);
      Swagger.Streams.Deserialize (Object, "skipped_at_ms", Value.Skipped_At_Ms);
      Swagger.Streams.Deserialize (Object, "vehicle_id", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DispatchJobType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "actual_end_ms", Value.Actual_End_Ms);
      Serialize (Into, "actual_start_ms", Value.Actual_Start_Ms);
      Serialize (Into, "driver_id", Value.Driver_Id);
      Serialize (Into, "group_id", Value.Group_Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "scheduled_end_ms", Value.Scheduled_End_Ms);
      Serialize (Into, "scheduled_meters", Value.Scheduled_Meters);
      Serialize (Into, "scheduled_start_ms", Value.Scheduled_Start_Ms);
      Into.Write_Entity ("start_location_address", Value.Start_Location_Address);
      Serialize (Into, "start_location_address_id", Value.Start_Location_Address_Id);
      Into.Write_Entity ("start_location_lat", Value.Start_Location_Lat);
      Into.Write_Entity ("start_location_lng", Value.Start_Location_Lng);
      Into.Write_Entity ("start_location_name", Value.Start_Location_Name);
      Serialize (Into, "trailer_id", Value.Trailer_Id);
      Serialize (Into, "vehicle_id", Value.Vehicle_Id);
      Serialize (Into, "dispatch_jobs", Value.Dispatch_Jobs);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "actual_end_ms", Value.Actual_End_Ms);
      Swagger.Streams.Deserialize (Object, "actual_start_ms", Value.Actual_Start_Ms);
      Swagger.Streams.Deserialize (Object, "driver_id", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "group_id", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "scheduled_end_ms", Value.Scheduled_End_Ms);
      Swagger.Streams.Deserialize (Object, "scheduled_meters", Value.Scheduled_Meters);
      Swagger.Streams.Deserialize (Object, "scheduled_start_ms", Value.Scheduled_Start_Ms);
      Swagger.Streams.Deserialize (Object, "start_location_address", Value.Start_Location_Address);
      Swagger.Streams.Deserialize (Object, "start_location_address_id", Value.Start_Location_Address_Id);
      Swagger.Streams.Deserialize (Object, "start_location_lat", Value.Start_Location_Lat);
      Swagger.Streams.Deserialize (Object, "start_location_lng", Value.Start_Location_Lng);
      Swagger.Streams.Deserialize (Object, "start_location_name", Value.Start_Location_Name);
      Swagger.Streams.Deserialize (Object, "trailer_id", Value.Trailer_Id);
      Swagger.Streams.Deserialize (Object, "vehicle_id", Value.Vehicle_Id);
      Swagger.Streams.Deserialize (Object, "dispatch_jobs", Value.Dispatch_Jobs);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DispatchRouteType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobUpdateObjectType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "changed_at_ms", Value.Changed_At_Ms);
      Serialize (Into, "job_id", Value.Job_Id);
      Serialize (Into, "job_state", Value.Job_State);
      Serialize (Into, "prev_job_state", Value.Prev_Job_State);
      Serialize (Into, "route", Value.Route);
      Serialize (Into, "route_id", Value.Route_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobUpdateObjectType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobUpdateObjectType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "changed_at_ms", Value.Changed_At_Ms);
      Swagger.Streams.Deserialize (Object, "job_id", Value.Job_Id);
      Swagger.Streams.Deserialize (Object, "job_state", Value.Job_State);
      Swagger.Streams.Deserialize (Object, "prev_job_state", Value.Prev_Job_State);
      Swagger.Streams.Deserialize (Object, "route", Value.Route);
      Swagger.Streams.Deserialize (Object, "route_id", Value.Route_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobUpdateObjectType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : JobUpdateObjectType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AllRouteJobUpdatesType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "job_updates", Value.Job_Updates);
      Into.Write_Entity ("sequence_id", Value.Sequence_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AllRouteJobUpdatesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AllRouteJobUpdatesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "job_updates", Value.Job_Updates);
      Swagger.Streams.Deserialize (Object, "sequence_id", Value.Sequence_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AllRouteJobUpdatesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AllRouteJobUpdatesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoricalEntryType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "changed_at_ms", Value.Changed_At_Ms);
      Serialize (Into, "route", Value.Route);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoricalEntryType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoricalEntryType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "changed_at_ms", Value.Changed_At_Ms);
      Swagger.Streams.Deserialize (Object, "route", Value.Route);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoricalEntryType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DispatchRouteHistoricalEntryType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoryType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "history", Value.History);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoryType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoryType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "history", Value.History);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoryType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DispatchRouteHistoryType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleLocationType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("heading", Value.Heading);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("latitude", Value.Latitude);
      Into.Write_Entity ("location", Value.Location);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "odometerMeters", Value.Odometer_Meters);
      Into.Write_Entity ("onTrip", Value.On_Trip);
      Into.Write_Entity ("speed", Value.Speed);
      Into.Write_Entity ("time", Value.Time);
      Into.Write_Entity ("vin", Value.Vin);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleLocationType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleLocationType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "heading", Value.Heading);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "location", Value.Location);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "odometerMeters", Value.Odometer_Meters);
      Swagger.Streams.Deserialize (Object, "onTrip", Value.On_Trip);
      Swagger.Streams.Deserialize (Object, "speed", Value.Speed);
      Swagger.Streams.Deserialize (Object, "time", Value.Time);
      Swagger.Streams.Deserialize (Object, "vin", Value.Vin);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleLocationType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleLocationType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2003Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "vehicles", Value.Vehicles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2003Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2003Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2003Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2003Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "engineHours", Value.Engine_Hours);
      Into.Write_Entity ("fuelLevelPercent", Value.Fuel_Level_Percent);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("note", Value.Note);
      Serialize (Into, "odometerMeters", Value.Odometer_Meters);
      Into.Write_Entity ("vin", Value.Vin);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "engineHours", Value.Engine_Hours);
      Swagger.Streams.Deserialize (Object, "fuelLevelPercent", Value.Fuel_Level_Percent);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "note", Value.Note);
      Swagger.Streams.Deserialize (Object, "odometerMeters", Value.Odometer_Meters);
      Swagger.Streams.Deserialize (Object, "vin", Value.Vin);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject14Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "vehicles", Value.Vehicles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject14Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject14Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject14Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject14Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserRoleType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserRoleType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserRoleType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserRoleType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : UserRoleType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedVehicleType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedSensorType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedMachineType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedDriverType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedAssetType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedAddressType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "addresses", Value.Addresses);
      Serialize (Into, "assets", Value.Assets);
      Serialize (Into, "drivers", Value.Drivers);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "id", Value.Id);
      Serialize (Into, "machines", Value.Machines);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "parentTagId", Value.Parent_Tag_Id);
      Serialize (Into, "sensors", Value.Sensors);
      Serialize (Into, "vehicles", Value.Vehicles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "addresses", Value.Addresses);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
      Swagger.Streams.Deserialize (Object, "drivers", Value.Drivers);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "machines", Value.Machines);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "parentTagId", Value.Parent_Tag_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TagType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2009Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "tags", Value.Tags);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2009Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2009Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "tags", Value.Tags);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2009Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2009Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SafetyReportHarshEventType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("harshEventType", Value.Harsh_Event_Type);
      Into.Write_Entity ("timestampMs", Value.Timestamp_Ms);
      Into.Write_Entity ("vehicleId", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SafetyReportHarshEventType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SafetyReportHarshEventType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "harshEventType", Value.Harsh_Event_Type);
      Swagger.Streams.Deserialize (Object, "timestampMs", Value.Timestamp_Ms);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SafetyReportHarshEventType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SafetyReportHarshEventType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleSafetyScoreResponseType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("crashCount", Value.Crash_Count);
      Into.Write_Entity ("harshAccelCount", Value.Harsh_Accel_Count);
      Into.Write_Entity ("harshBrakingCount", Value.Harsh_Braking_Count);
      Serialize (Into, "harshEvents", Value.Harsh_Events);
      Into.Write_Entity ("harshTurningCount", Value.Harsh_Turning_Count);
      Into.Write_Entity ("safetyScore", Value.Safety_Score);
      Into.Write_Entity ("safetyScoreRank", Value.Safety_Score_Rank);
      Into.Write_Entity ("timeOverSpeedLimitMs", Value.Time_Over_Speed_Limit_Ms);
      Into.Write_Entity ("totalDistanceDrivenMeters", Value.Total_Distance_Driven_Meters);
      Into.Write_Entity ("totalHarshEventCount", Value.Total_Harsh_Event_Count);
      Into.Write_Entity ("totalTimeDrivenMs", Value.Total_Time_Driven_Ms);
      Into.Write_Entity ("vehicleId", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleSafetyScoreResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleSafetyScoreResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "crashCount", Value.Crash_Count);
      Swagger.Streams.Deserialize (Object, "harshAccelCount", Value.Harsh_Accel_Count);
      Swagger.Streams.Deserialize (Object, "harshBrakingCount", Value.Harsh_Braking_Count);
      Swagger.Streams.Deserialize (Object, "harshEvents", Value.Harsh_Events);
      Swagger.Streams.Deserialize (Object, "harshTurningCount", Value.Harsh_Turning_Count);
      Swagger.Streams.Deserialize (Object, "safetyScore", Value.Safety_Score);
      Swagger.Streams.Deserialize (Object, "safetyScoreRank", Value.Safety_Score_Rank);
      Swagger.Streams.Deserialize (Object, "timeOverSpeedLimitMs", Value.Time_Over_Speed_Limit_Ms);
      Swagger.Streams.Deserialize (Object, "totalDistanceDrivenMeters", Value.Total_Distance_Driven_Meters);
      Swagger.Streams.Deserialize (Object, "totalHarshEventCount", Value.Total_Harsh_Event_Count);
      Swagger.Streams.Deserialize (Object, "totalTimeDrivenMs", Value.Total_Time_Driven_Ms);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleSafetyScoreResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleSafetyScoreResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverSafetyScoreResponseType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("crashCount", Value.Crash_Count);
      Into.Write_Entity ("driverId", Value.Driver_Id);
      Into.Write_Entity ("harshAccelCount", Value.Harsh_Accel_Count);
      Into.Write_Entity ("harshBrakingCount", Value.Harsh_Braking_Count);
      Serialize (Into, "harshEvents", Value.Harsh_Events);
      Into.Write_Entity ("harshTurningCount", Value.Harsh_Turning_Count);
      Into.Write_Entity ("safetyScore", Value.Safety_Score);
      Into.Write_Entity ("safetyScoreRank", Value.Safety_Score_Rank);
      Into.Write_Entity ("timeOverSpeedLimitMs", Value.Time_Over_Speed_Limit_Ms);
      Into.Write_Entity ("totalDistanceDrivenMeters", Value.Total_Distance_Driven_Meters);
      Into.Write_Entity ("totalHarshEventCount", Value.Total_Harsh_Event_Count);
      Into.Write_Entity ("totalTimeDrivenMs", Value.Total_Time_Driven_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverSafetyScoreResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverSafetyScoreResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "crashCount", Value.Crash_Count);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "harshAccelCount", Value.Harsh_Accel_Count);
      Swagger.Streams.Deserialize (Object, "harshBrakingCount", Value.Harsh_Braking_Count);
      Swagger.Streams.Deserialize (Object, "harshEvents", Value.Harsh_Events);
      Swagger.Streams.Deserialize (Object, "harshTurningCount", Value.Harsh_Turning_Count);
      Swagger.Streams.Deserialize (Object, "safetyScore", Value.Safety_Score);
      Swagger.Streams.Deserialize (Object, "safetyScoreRank", Value.Safety_Score_Rank);
      Swagger.Streams.Deserialize (Object, "timeOverSpeedLimitMs", Value.Time_Over_Speed_Limit_Ms);
      Swagger.Streams.Deserialize (Object, "totalDistanceDrivenMeters", Value.Total_Distance_Driven_Meters);
      Swagger.Streams.Deserialize (Object, "totalHarshEventCount", Value.Total_Harsh_Event_Count);
      Swagger.Streams.Deserialize (Object, "totalTimeDrivenMs", Value.Total_Time_Driven_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverSafetyScoreResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriverSafetyScoreResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ErrorResponseType) is
   begin
      Into.Start_Entity (Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ErrorResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ErrorResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ErrorResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : ErrorResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentTypeType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "fieldTypes", Value.Field_Types);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "orgId", Value.Org_Id);
      Into.Write_Entity ("uuid", Value.Uuid);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentTypeType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentTypeType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "fieldTypes", Value.Field_Types);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "orgId", Value.Org_Id);
      Swagger.Streams.Deserialize (Object, "uuid", Value.Uuid);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentTypeType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentTypeType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "actual_end_ms", Value.Actual_End_Ms);
      Serialize (Into, "actual_start_ms", Value.Actual_Start_Ms);
      Serialize (Into, "driver_id", Value.Driver_Id);
      Serialize (Into, "group_id", Value.Group_Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "scheduled_end_ms", Value.Scheduled_End_Ms);
      Serialize (Into, "scheduled_meters", Value.Scheduled_Meters);
      Serialize (Into, "scheduled_start_ms", Value.Scheduled_Start_Ms);
      Into.Write_Entity ("start_location_address", Value.Start_Location_Address);
      Serialize (Into, "start_location_address_id", Value.Start_Location_Address_Id);
      Into.Write_Entity ("start_location_lat", Value.Start_Location_Lat);
      Into.Write_Entity ("start_location_lng", Value.Start_Location_Lng);
      Into.Write_Entity ("start_location_name", Value.Start_Location_Name);
      Serialize (Into, "trailer_id", Value.Trailer_Id);
      Serialize (Into, "vehicle_id", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "actual_end_ms", Value.Actual_End_Ms);
      Swagger.Streams.Deserialize (Object, "actual_start_ms", Value.Actual_Start_Ms);
      Swagger.Streams.Deserialize (Object, "driver_id", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "group_id", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "scheduled_end_ms", Value.Scheduled_End_Ms);
      Swagger.Streams.Deserialize (Object, "scheduled_meters", Value.Scheduled_Meters);
      Swagger.Streams.Deserialize (Object, "scheduled_start_ms", Value.Scheduled_Start_Ms);
      Swagger.Streams.Deserialize (Object, "start_location_address", Value.Start_Location_Address);
      Swagger.Streams.Deserialize (Object, "start_location_address_id", Value.Start_Location_Address_Id);
      Swagger.Streams.Deserialize (Object, "start_location_lat", Value.Start_Location_Lat);
      Swagger.Streams.Deserialize (Object, "start_location_lng", Value.Start_Location_Lng);
      Swagger.Streams.Deserialize (Object, "start_location_name", Value.Start_Location_Name);
      Swagger.Streams.Deserialize (Object, "trailer_id", Value.Trailer_Id);
      Swagger.Streams.Deserialize (Object, "vehicle_id", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DispatchRouteBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobCreateType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("destination_address", Value.Destination_Address);
      Serialize (Into, "destination_address_id", Value.Destination_Address_Id);
      Into.Write_Entity ("destination_lat", Value.Destination_Lat);
      Into.Write_Entity ("destination_lng", Value.Destination_Lng);
      Into.Write_Entity ("destination_name", Value.Destination_Name);
      Into.Write_Entity ("notes", Value.Notes);
      Serialize (Into, "scheduled_arrival_time_ms", Value.Scheduled_Arrival_Time_Ms);
      Serialize (Into, "scheduled_departure_time_ms", Value.Scheduled_Departure_Time_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobCreateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobCreateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "destination_address", Value.Destination_Address);
      Swagger.Streams.Deserialize (Object, "destination_address_id", Value.Destination_Address_Id);
      Swagger.Streams.Deserialize (Object, "destination_lat", Value.Destination_Lat);
      Swagger.Streams.Deserialize (Object, "destination_lng", Value.Destination_Lng);
      Swagger.Streams.Deserialize (Object, "destination_name", Value.Destination_Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "scheduled_arrival_time_ms", Value.Scheduled_Arrival_Time_Ms);
      Swagger.Streams.Deserialize (Object, "scheduled_departure_time_ms", Value.Scheduled_Departure_Time_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobCreateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DispatchJobCreateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteCreateType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "actual_end_ms", Value.Actual_End_Ms);
      Serialize (Into, "actual_start_ms", Value.Actual_Start_Ms);
      Serialize (Into, "driver_id", Value.Driver_Id);
      Serialize (Into, "group_id", Value.Group_Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "scheduled_end_ms", Value.Scheduled_End_Ms);
      Serialize (Into, "scheduled_meters", Value.Scheduled_Meters);
      Serialize (Into, "scheduled_start_ms", Value.Scheduled_Start_Ms);
      Into.Write_Entity ("start_location_address", Value.Start_Location_Address);
      Serialize (Into, "start_location_address_id", Value.Start_Location_Address_Id);
      Into.Write_Entity ("start_location_lat", Value.Start_Location_Lat);
      Into.Write_Entity ("start_location_lng", Value.Start_Location_Lng);
      Into.Write_Entity ("start_location_name", Value.Start_Location_Name);
      Serialize (Into, "trailer_id", Value.Trailer_Id);
      Serialize (Into, "vehicle_id", Value.Vehicle_Id);
      Serialize (Into, "dispatch_jobs", Value.Dispatch_Jobs);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteCreateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteCreateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "actual_end_ms", Value.Actual_End_Ms);
      Swagger.Streams.Deserialize (Object, "actual_start_ms", Value.Actual_Start_Ms);
      Swagger.Streams.Deserialize (Object, "driver_id", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "group_id", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "scheduled_end_ms", Value.Scheduled_End_Ms);
      Swagger.Streams.Deserialize (Object, "scheduled_meters", Value.Scheduled_Meters);
      Swagger.Streams.Deserialize (Object, "scheduled_start_ms", Value.Scheduled_Start_Ms);
      Swagger.Streams.Deserialize (Object, "start_location_address", Value.Start_Location_Address);
      Swagger.Streams.Deserialize (Object, "start_location_address_id", Value.Start_Location_Address_Id);
      Swagger.Streams.Deserialize (Object, "start_location_lat", Value.Start_Location_Lat);
      Swagger.Streams.Deserialize (Object, "start_location_lng", Value.Start_Location_Lng);
      Swagger.Streams.Deserialize (Object, "start_location_name", Value.Start_Location_Name);
      Swagger.Streams.Deserialize (Object, "trailer_id", Value.Trailer_Id);
      Swagger.Streams.Deserialize (Object, "vehicle_id", Value.Vehicle_Id);
      Swagger.Streams.Deserialize (Object, "dispatch_jobs", Value.Dispatch_Jobs);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteCreateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DispatchRouteCreateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ContactType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("email", Value.Email);
      Into.Write_Entity ("firstName", Value.First_Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("lastName", Value.Last_Name);
      Into.Write_Entity ("phone", Value.Phone);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ContactType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ContactType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "email", Value.Email);
      Swagger.Streams.Deserialize (Object, "firstName", Value.First_Name);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "lastName", Value.Last_Name);
      Swagger.Streams.Deserialize (Object, "phone", Value.Phone);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ContactType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : ContactType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("latitude", Value.Latitude);
      Into.Write_Entity ("location", Value.Location);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.Write_Entity ("speedMilesPerHour", Value.Speed_Miles_Per_Hour);
      Serialize (Into, "timeMs", Value.Time_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "location", Value.Location);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
      Swagger.Streams.Deserialize (Object, "speedMilesPerHour", Value.Speed_Miles_Per_Hour);
      Swagger.Streams.Deserialize (Object, "timeMs", Value.Time_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetCurrentLocationType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationsResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "cable", Value.Cable);
      Into.Write_Entity ("engineHours", Value.Engine_Hours);
      Serialize (Into, "id", Value.Id);
      Serialize (Into, "location", Value.Location);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationsResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationsResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "cable", Value.Cable);
      Swagger.Streams.Deserialize (Object, "engineHours", Value.Engine_Hours);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "location", Value.Location);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationsResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetCurrentLocationsResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2001Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "assets", Value.Assets);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2001Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2001Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2001Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2001Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressNotesType) is
   begin
      Into.Start_Entity (Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressNotesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressNotesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressNotesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AddressNotesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CurrentDriverType) is
   begin
      Into.Start_Entity (Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CurrentDriverType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CurrentDriverType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CurrentDriverType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : CurrentDriverType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "dispatchJobId", Value.Dispatch_Job_Id);
      Into.Write_Entity ("notes", Value.Notes);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "dispatchJobId", Value.Dispatch_Job_Id);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverBaseType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("eldAdverseWeatherExemptionEnabled", Value.Eld_Adverse_Weather_Exemption_Enabled);
      Into.Write_Entity ("eldBigDayExemptionEnabled", Value.Eld_Big_Day_Exemption_Enabled);
      Into.Write_Entity ("eldDayStartHour", Value.Eld_Day_Start_Hour);
      Into.Write_Entity ("eldExempt", Value.Eld_Exempt);
      Into.Write_Entity ("eldExemptReason", Value.Eld_Exempt_Reason);
      Into.Write_Entity ("eldPcEnabled", Value.Eld_Pc_Enabled);
      Into.Write_Entity ("eldYmEnabled", Value.Eld_Ym_Enabled);
      Serialize (Into, "externalIds", Value.External_Ids);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("licenseNumber", Value.License_Number);
      Into.Write_Entity ("licenseState", Value.License_State);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("notes", Value.Notes);
      Into.Write_Entity ("phone", Value.Phone);
      Into.Write_Entity ("username", Value.Username);
      Serialize (Into, "vehicleId", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "eldAdverseWeatherExemptionEnabled", Value.Eld_Adverse_Weather_Exemption_Enabled);
      Swagger.Streams.Deserialize (Object, "eldBigDayExemptionEnabled", Value.Eld_Big_Day_Exemption_Enabled);
      Swagger.Streams.Deserialize (Object, "eldDayStartHour", Value.Eld_Day_Start_Hour);
      Swagger.Streams.Deserialize (Object, "eldExempt", Value.Eld_Exempt);
      Swagger.Streams.Deserialize (Object, "eldExemptReason", Value.Eld_Exempt_Reason);
      Swagger.Streams.Deserialize (Object, "eldPcEnabled", Value.Eld_Pc_Enabled);
      Swagger.Streams.Deserialize (Object, "eldYmEnabled", Value.Eld_Ym_Enabled);
      Swagger.Streams.Deserialize (Object, "externalIds", Value.External_Ids);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "licenseNumber", Value.License_Number);
      Swagger.Streams.Deserialize (Object, "licenseState", Value.License_State);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "phone", Value.Phone);
      Swagger.Streams.Deserialize (Object, "username", Value.Username);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriverBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverForCreateType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("eldAdverseWeatherExemptionEnabled", Value.Eld_Adverse_Weather_Exemption_Enabled);
      Into.Write_Entity ("eldBigDayExemptionEnabled", Value.Eld_Big_Day_Exemption_Enabled);
      Into.Write_Entity ("eldDayStartHour", Value.Eld_Day_Start_Hour);
      Into.Write_Entity ("eldExempt", Value.Eld_Exempt);
      Into.Write_Entity ("eldExemptReason", Value.Eld_Exempt_Reason);
      Into.Write_Entity ("eldPcEnabled", Value.Eld_Pc_Enabled);
      Into.Write_Entity ("eldYmEnabled", Value.Eld_Ym_Enabled);
      Serialize (Into, "externalIds", Value.External_Ids);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("licenseNumber", Value.License_Number);
      Into.Write_Entity ("licenseState", Value.License_State);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("notes", Value.Notes);
      Into.Write_Entity ("phone", Value.Phone);
      Into.Write_Entity ("username", Value.Username);
      Serialize (Into, "vehicleId", Value.Vehicle_Id);
      Into.Write_Entity ("password", Value.Password);
      Into.Write_Entity ("tagIds", Value.Tag_Ids);
      Serialize (Into, "tagIds", Value.Tag_Ids);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverForCreateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverForCreateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "eldAdverseWeatherExemptionEnabled", Value.Eld_Adverse_Weather_Exemption_Enabled);
      Swagger.Streams.Deserialize (Object, "eldBigDayExemptionEnabled", Value.Eld_Big_Day_Exemption_Enabled);
      Swagger.Streams.Deserialize (Object, "eldDayStartHour", Value.Eld_Day_Start_Hour);
      Swagger.Streams.Deserialize (Object, "eldExempt", Value.Eld_Exempt);
      Swagger.Streams.Deserialize (Object, "eldExemptReason", Value.Eld_Exempt_Reason);
      Swagger.Streams.Deserialize (Object, "eldPcEnabled", Value.Eld_Pc_Enabled);
      Swagger.Streams.Deserialize (Object, "eldYmEnabled", Value.Eld_Ym_Enabled);
      Swagger.Streams.Deserialize (Object, "externalIds", Value.External_Ids);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "licenseNumber", Value.License_Number);
      Swagger.Streams.Deserialize (Object, "licenseState", Value.License_State);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "phone", Value.Phone);
      Swagger.Streams.Deserialize (Object, "username", Value.Username);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
      Swagger.Streams.Deserialize (Object, "password", Value.Password);
      Swagger.Streams.Deserialize (Object, "tagIds", Value.Tag_Ids);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverForCreateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriverForCreateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleLocationType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("latitude", Value.Latitude);
      Into.Write_Entity ("location", Value.Location);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.Write_Entity ("speedMilesPerHour", Value.Speed_Miles_Per_Hour);
      Serialize (Into, "timeMs", Value.Time_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleLocationType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleLocationType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "location", Value.Location);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
      Swagger.Streams.Deserialize (Object, "speedMilesPerHour", Value.Speed_Miles_Per_Hour);
      Swagger.Streams.Deserialize (Object, "timeMs", Value.Time_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleLocationType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : FleetVehicleLocationType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("notes", Value.Notes);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : MachineType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2007Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "machines", Value.Machines);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2007Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2007Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "machines", Value.Machines);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2007Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2007Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PaginationType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("endCursor", Value.End_Cursor);
      Into.Write_Entity ("hasNextPage", Value.Has_Next_Page);
      Into.Write_Entity ("hasPrevPage", Value.Has_Prev_Page);
      Into.Write_Entity ("startCursor", Value.Start_Cursor);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PaginationType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PaginationType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "endCursor", Value.End_Cursor);
      Swagger.Streams.Deserialize (Object, "hasNextPage", Value.Has_Next_Page);
      Swagger.Streams.Deserialize (Object, "hasPrevPage", Value.Has_Prev_Page);
      Swagger.Streams.Deserialize (Object, "startCursor", Value.Start_Cursor);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PaginationType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : PaginationType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2002Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "pagination", Value.Pagination);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "vehicles", Value.Vehicles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2002Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2002Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "pagination", Value.Pagination);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2002Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2002Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("macAddress", Value.Mac_Address);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "macAddress", Value.Mac_Address);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : SensorType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2008Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2008Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2008Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2008Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2008Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagMetadataType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagMetadataType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagMetadataType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagMetadataType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TagMetadataType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("eldAdverseWeatherExemptionEnabled", Value.Eld_Adverse_Weather_Exemption_Enabled);
      Into.Write_Entity ("eldBigDayExemptionEnabled", Value.Eld_Big_Day_Exemption_Enabled);
      Into.Write_Entity ("eldDayStartHour", Value.Eld_Day_Start_Hour);
      Into.Write_Entity ("eldExempt", Value.Eld_Exempt);
      Into.Write_Entity ("eldExemptReason", Value.Eld_Exempt_Reason);
      Into.Write_Entity ("eldPcEnabled", Value.Eld_Pc_Enabled);
      Into.Write_Entity ("eldYmEnabled", Value.Eld_Ym_Enabled);
      Serialize (Into, "externalIds", Value.External_Ids);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("licenseNumber", Value.License_Number);
      Into.Write_Entity ("licenseState", Value.License_State);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("notes", Value.Notes);
      Into.Write_Entity ("phone", Value.Phone);
      Into.Write_Entity ("username", Value.Username);
      Serialize (Into, "vehicleId", Value.Vehicle_Id);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("isDeactivated", Value.Is_Deactivated);
      Serialize (Into, "tags", Value.Tags);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "eldAdverseWeatherExemptionEnabled", Value.Eld_Adverse_Weather_Exemption_Enabled);
      Swagger.Streams.Deserialize (Object, "eldBigDayExemptionEnabled", Value.Eld_Big_Day_Exemption_Enabled);
      Swagger.Streams.Deserialize (Object, "eldDayStartHour", Value.Eld_Day_Start_Hour);
      Swagger.Streams.Deserialize (Object, "eldExempt", Value.Eld_Exempt);
      Swagger.Streams.Deserialize (Object, "eldExemptReason", Value.Eld_Exempt_Reason);
      Swagger.Streams.Deserialize (Object, "eldPcEnabled", Value.Eld_Pc_Enabled);
      Swagger.Streams.Deserialize (Object, "eldYmEnabled", Value.Eld_Ym_Enabled);
      Swagger.Streams.Deserialize (Object, "externalIds", Value.External_Ids);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "licenseNumber", Value.License_Number);
      Swagger.Streams.Deserialize (Object, "licenseState", Value.License_State);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "phone", Value.Phone);
      Swagger.Streams.Deserialize (Object, "username", Value.Username);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "isDeactivated", Value.Is_Deactivated);
      Swagger.Streams.Deserialize (Object, "tags", Value.Tags);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriverType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "drivers", Value.Drivers);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "drivers", Value.Drivers);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriversResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedAddressBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedAssetBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedDriverBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedMachineBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedSensorBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TaggedVehicleBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyDeleteType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "assets", Value.Assets);
      Serialize (Into, "sensors", Value.Sensors);
      Serialize (Into, "vehicles", Value.Vehicles);
      Serialize (Into, "machines", Value.Machines);
      Serialize (Into, "drivers", Value.Drivers);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyDeleteType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyDeleteType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
      Swagger.Streams.Deserialize (Object, "machines", Value.Machines);
      Swagger.Streams.Deserialize (Object, "drivers", Value.Drivers);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyDeleteType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TagModifyDeleteType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagCreateType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "assets", Value.Assets);
      Serialize (Into, "drivers", Value.Drivers);
      Serialize (Into, "machines", Value.Machines);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "parentTagId", Value.Parent_Tag_Id);
      Serialize (Into, "sensors", Value.Sensors);
      Serialize (Into, "vehicles", Value.Vehicles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagCreateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagCreateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
      Swagger.Streams.Deserialize (Object, "drivers", Value.Drivers);
      Swagger.Streams.Deserialize (Object, "machines", Value.Machines);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "parentTagId", Value.Parent_Tag_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagCreateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TagCreateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagUpdateType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "assets", Value.Assets);
      Serialize (Into, "drivers", Value.Drivers);
      Serialize (Into, "machines", Value.Machines);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "parentTagId", Value.Parent_Tag_Id);
      Serialize (Into, "sensors", Value.Sensors);
      Serialize (Into, "vehicles", Value.Vehicles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagUpdateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagUpdateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
      Swagger.Streams.Deserialize (Object, "drivers", Value.Drivers);
      Swagger.Streams.Deserialize (Object, "machines", Value.Machines);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "parentTagId", Value.Parent_Tag_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagUpdateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TagUpdateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyAddType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "assets", Value.Assets);
      Serialize (Into, "sensors", Value.Sensors);
      Serialize (Into, "vehicles", Value.Vehicles);
      Serialize (Into, "machines", Value.Machines);
      Serialize (Into, "drivers", Value.Drivers);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyAddType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyAddType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assets", Value.Assets);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
      Swagger.Streams.Deserialize (Object, "machines", Value.Machines);
      Swagger.Streams.Deserialize (Object, "drivers", Value.Drivers);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyAddType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TagModifyAddType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "add", Value.Add);
      Serialize (Into, "delete", Value.Delete);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "parentTagId", Value.Parent_Tag_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "add", Value.Add);
      Swagger.Streams.Deserialize (Object, "delete", Value.Delete);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "parentTagId", Value.Parent_Tag_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TagModifyType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserBaseType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("authType", Value.Auth_Type);
      Into.Write_Entity ("email", Value.Email);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("organizationRoleId", Value.Organization_Role_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "authType", Value.Auth_Type);
      Swagger.Streams.Deserialize (Object, "email", Value.Email);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "organizationRoleId", Value.Organization_Role_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : UserBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject3Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject3Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject3Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject3Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject3Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject5Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "endMs", Value.End_Ms);
      Serialize (Into, "orgId", Value.Org_Id);
      Serialize (Into, "startMs", Value.Start_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject5Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject5Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "orgId", Value.Org_Id);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject5Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject5Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject7Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject7Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject7Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject7Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject7Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject9Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject9Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject9Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject9Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject9Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject13Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject13Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject13Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject13Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject13Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject16Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "externalIds", Value.External_Ids);
      Into.Write_Entity ("harsh_accel_setting", Value.Harsh_Accel_Setting);
      Into.Write_Entity ("name", Value.Name);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject16Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject16Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "externalIds", Value.External_Ids);
      Swagger.Streams.Deserialize (Object, "harsh_accel_setting", Value.Harsh_Accel_Setting);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject16Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject16Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject17Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject17Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject17Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject17Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject17Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject20Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("sensors", Value.Sensors);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject20Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject20Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject20Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject20Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject23Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject23Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject23Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject23Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject23Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject24Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("sensors", Value.Sensors);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject24Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject24Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject24Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject24Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceCircleType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("latitude", Value.Latitude);
      Serialize (Into, "radiusMeters", Value.Radius_Meters);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceCircleType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceCircleType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "radiusMeters", Value.Radius_Meters);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceCircleType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AddressGeofenceCircleType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "circle", Value.Circle);
      Serialize (Into, "polygon", Value.Polygon);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "circle", Value.Circle);
      Swagger.Streams.Deserialize (Object, "polygon", Value.Polygon);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AddressGeofenceType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "contacts", Value.Contacts);
      Into.Write_Entity ("formattedAddress", Value.Formatted_Address);
      Serialize (Into, "geofence", Value.Geofence);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("notes", Value.Notes);
      Serialize (Into, "tags", Value.Tags);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "contacts", Value.Contacts);
      Swagger.Streams.Deserialize (Object, "formattedAddress", Value.Formatted_Address);
      Swagger.Streams.Deserialize (Object, "geofence", Value.Geofence);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "tags", Value.Tags);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AddressType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressesAddressesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("notes", Value.Notes);
      Into.Write_Entity ("formattedAddress", Value.Formatted_Address);
      Serialize (Into, "geofence", Value.Geofence);
      Into.Write_Entity ("tagIds", Value.Tag_Ids);
      Serialize (Into, "tagIds", Value.Tag_Ids);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("contactIds", Value.Contact_Ids);
      Serialize (Into, "contactIds", Value.Contact_Ids);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressesAddressesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressesAddressesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "formattedAddress", Value.Formatted_Address);
      Swagger.Streams.Deserialize (Object, "geofence", Value.Geofence);
      Swagger.Streams.Deserialize (Object, "tagIds", Value.Tag_Ids);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "contactIds", Value.Contact_Ids);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressesAddressesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AddressesAddressesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObjectType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "addresses", Value.Addresses);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObjectType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObjectType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "addresses", Value.Addresses);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObjectType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObjectType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject1Type) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("contactIds", Value.Contact_Ids);
      Serialize (Into, "contactIds", Value.Contact_Ids);
      Into.Write_Entity ("formattedAddress", Value.Formatted_Address);
      Serialize (Into, "geofence", Value.Geofence);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("notes", Value.Notes);
      Into.Write_Entity ("tagIds", Value.Tag_Ids);
      Serialize (Into, "tagIds", Value.Tag_Ids);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject1Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject1Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "contactIds", Value.Contact_Ids);
      Swagger.Streams.Deserialize (Object, "formattedAddress", Value.Formatted_Address);
      Swagger.Streams.Deserialize (Object, "geofence", Value.Geofence);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "tagIds", Value.Tag_Ids);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject1Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineObject1Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsFuelPercentageType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "fuelPercentage", Value.Fuel_Percentage);
      Serialize (Into, "changedAtMs", Value.Changed_At_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsFuelPercentageType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsFuelPercentageType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "fuelPercentage", Value.Fuel_Percentage);
      Swagger.Streams.Deserialize (Object, "changedAtMs", Value.Changed_At_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsFuelPercentageType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsFuelPercentageType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsEngineHoursType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "engineHours", Value.Engine_Hours);
      Serialize (Into, "changedAtMs", Value.Changed_At_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsEngineHoursType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsEngineHoursType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "engineHours", Value.Engine_Hours);
      Swagger.Streams.Deserialize (Object, "changedAtMs", Value.Changed_At_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsEngineHoursType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsEngineHoursType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsReturnAirTempType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "tempInMilliC", Value.Temp_In_Milli_C);
      Serialize (Into, "changedAtMs", Value.Changed_At_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsReturnAirTempType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsReturnAirTempType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "tempInMilliC", Value.Temp_In_Milli_C);
      Swagger.Streams.Deserialize (Object, "changedAtMs", Value.Changed_At_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsReturnAirTempType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsReturnAirTempType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "fuelPercentage", Value.Fuel_Percentage);
      Serialize (Into, "powerStatus", Value.Power_Status);
      Serialize (Into, "engineHours", Value.Engine_Hours);
      Serialize (Into, "setPoint", Value.Set_Point);
      Serialize (Into, "returnAirTemp", Value.Return_Air_Temp);
      Serialize (Into, "alarms", Value.Alarms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "fuelPercentage", Value.Fuel_Percentage);
      Swagger.Streams.Deserialize (Object, "powerStatus", Value.Power_Status);
      Swagger.Streams.Deserialize (Object, "engineHours", Value.Engine_Hours);
      Swagger.Streams.Deserialize (Object, "setPoint", Value.Set_Point);
      Swagger.Streams.Deserialize (Object, "returnAirTemp", Value.Return_Air_Temp);
      Swagger.Streams.Deserialize (Object, "alarms", Value.Alarms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseReeferStatsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("assetType", Value.Asset_Type);
      Into.Write_Entity ("id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "reeferStats", Value.Reefer_Stats);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "assetType", Value.Asset_Type);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "reeferStats", Value.Reefer_Stats);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AssetReeferResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseSensorsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("cargoEmpty", Value.Cargo_Empty);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseSensorsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseSensorsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "cargoEmpty", Value.Cargo_Empty);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseSensorsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : CargoResponseSensorsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : CargoResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreatePhotoValueType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("url", Value.Url);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreatePhotoValueType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreatePhotoValueType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "url", Value.Url);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreatePhotoValueType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentFieldCreatePhotoValueType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreateType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("numberValue", Value.Number_Value);
      Serialize (Into, "photoValue", Value.Photo_Value);
      Into.Write_Entity ("stringValue", Value.String_Value);
      Into.Write_Entity ("valueType", Value.Value_Type);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "numberValue", Value.Number_Value);
      Swagger.Streams.Deserialize (Object, "photoValue", Value.Photo_Value);
      Swagger.Streams.Deserialize (Object, "stringValue", Value.String_Value);
      Swagger.Streams.Deserialize (Object, "valueType", Value.Value_Type);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentFieldCreateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseSensorsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("doorClosed", Value.Door_Closed);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseSensorsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseSensorsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "doorClosed", Value.Door_Closed);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseSensorsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DoorResponseSensorsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DoorResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseSummariesType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("distanceMiles", Value.Distance_Miles);
      Serialize (Into, "driveMs", Value.Drive_Ms);
      Serialize (Into, "activeMs", Value.Active_Ms);
      Into.Write_Entity ("driverUsername", Value.Driver_Username);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("driverName", Value.Driver_Name);
      Serialize (Into, "onDutyMs", Value.On_Duty_Ms);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseSummariesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseSummariesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "distanceMiles", Value.Distance_Miles);
      Swagger.Streams.Deserialize (Object, "driveMs", Value.Drive_Ms);
      Swagger.Streams.Deserialize (Object, "activeMs", Value.Active_Ms);
      Swagger.Streams.Deserialize (Object, "driverUsername", Value.Driver_Username);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "driverName", Value.Driver_Name);
      Swagger.Streams.Deserialize (Object, "onDutyMs", Value.On_Duty_Ms);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseSummariesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriversSummaryResponseSummariesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "Summaries", Value.Summaries);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "Summaries", Value.Summaries);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriversSummaryResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseMechanicOrAgentSignatureType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "mechanicUserId", Value.Mechanic_User_Id);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "signedAt", Value.Signed_At);
      Into.Write_Entity ("type", Value.P_Type);
      Into.Write_Entity ("email", Value.Email);
      Into.Write_Entity ("username", Value.Username);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseMechanicOrAgentSignatureType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseMechanicOrAgentSignatureType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "mechanicUserId", Value.Mechanic_User_Id);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "signedAt", Value.Signed_At);
      Swagger.Streams.Deserialize (Object, "type", Value.P_Type);
      Swagger.Streams.Deserialize (Object, "email", Value.Email);
      Swagger.Streams.Deserialize (Object, "username", Value.Username);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseMechanicOrAgentSignatureType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DvirBaseMechanicOrAgentSignatureType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseTrailerDefectsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("comment", Value.Comment);
      Into.Write_Entity ("defectType", Value.Defect_Type);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseTrailerDefectsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseTrailerDefectsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "comment", Value.Comment);
      Swagger.Streams.Deserialize (Object, "defectType", Value.Defect_Type);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseTrailerDefectsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DvirBaseTrailerDefectsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "authorSignature", Value.Author_Signature);
      Into.Write_Entity ("defectsCorrected", Value.Defects_Corrected);
      Into.Write_Entity ("defectsNeedNotBeCorrected", Value.Defects_Need_Not_Be_Corrected);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("inspectionType", Value.Inspection_Type);
      Into.Write_Entity ("mechanicNotes", Value.Mechanic_Notes);
      Serialize (Into, "mechanicOrAgentSignature", Value.Mechanic_Or_Agent_Signature);
      Serialize (Into, "nextDriverSignature", Value.Next_Driver_Signature);
      Serialize (Into, "odometerMiles", Value.Odometer_Miles);
      Serialize (Into, "timeMs", Value.Time_Ms);
      Serialize (Into, "trailerDefects", Value.Trailer_Defects);
      Into.Write_Entity ("trailerId", Value.Trailer_Id);
      Into.Write_Entity ("trailerName", Value.Trailer_Name);
      Serialize (Into, "vehicle", Value.Vehicle);
      Into.Write_Entity ("vehicleCondition", Value.Vehicle_Condition);
      Serialize (Into, "vehicleDefects", Value.Vehicle_Defects);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "authorSignature", Value.Author_Signature);
      Swagger.Streams.Deserialize (Object, "defectsCorrected", Value.Defects_Corrected);
      Swagger.Streams.Deserialize (Object, "defectsNeedNotBeCorrected", Value.Defects_Need_Not_Be_Corrected);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "inspectionType", Value.Inspection_Type);
      Swagger.Streams.Deserialize (Object, "mechanicNotes", Value.Mechanic_Notes);
      Swagger.Streams.Deserialize (Object, "mechanicOrAgentSignature", Value.Mechanic_Or_Agent_Signature);
      Swagger.Streams.Deserialize (Object, "nextDriverSignature", Value.Next_Driver_Signature);
      Swagger.Streams.Deserialize (Object, "odometerMiles", Value.Odometer_Miles);
      Swagger.Streams.Deserialize (Object, "timeMs", Value.Time_Ms);
      Swagger.Streams.Deserialize (Object, "trailerDefects", Value.Trailer_Defects);
      Swagger.Streams.Deserialize (Object, "trailerId", Value.Trailer_Id);
      Swagger.Streams.Deserialize (Object, "trailerName", Value.Trailer_Name);
      Swagger.Streams.Deserialize (Object, "vehicle", Value.Vehicle);
      Swagger.Streams.Deserialize (Object, "vehicleCondition", Value.Vehicle_Condition);
      Swagger.Streams.Deserialize (Object, "vehicleDefects", Value.Vehicle_Defects);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DvirBaseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirListResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "dvirs", Value.Dvirs);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirListResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirListResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "dvirs", Value.Dvirs);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirListResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DvirListResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseVehicleInfoType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "year", Value.Year);
      Into.Write_Entity ("model", Value.Model);
      Into.Write_Entity ("vin", Value.Vin);
      Into.Write_Entity ("make", Value.Make);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseVehicleInfoType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseVehicleInfoType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "year", Value.Year);
      Swagger.Streams.Deserialize (Object, "model", Value.Model);
      Swagger.Streams.Deserialize (Object, "vin", Value.Vin);
      Swagger.Streams.Deserialize (Object, "make", Value.Make);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseVehicleInfoType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : FleetVehicleResponseVehicleInfoType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "externalIds", Value.External_Ids);
      Into.Write_Entity ("harshAccelSetting", Value.Harsh_Accel_Setting);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "vehicleInfo", Value.Vehicle_Info);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "externalIds", Value.External_Ids);
      Swagger.Streams.Deserialize (Object, "harshAccelSetting", Value.Harsh_Accel_Setting);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "vehicleInfo", Value.Vehicle_Info);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : FleetVehicleResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseLogsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("locLng", Value.Loc_Lng);
      Serialize (Into, "logStartMs", Value.Log_Start_Ms);
      Serialize (Into, "driverId", Value.Driver_Id);
      Into.Write_Entity ("statusType", Value.Status_Type);
      Into.Write_Entity ("locCity", Value.Loc_City);
      Serialize (Into, "groupId", Value.Group_Id);
      Into.Write_Entity ("locName", Value.Loc_Name);
      Into.Write_Entity ("locLat", Value.Loc_Lat);
      Into.Write_Entity ("remark", Value.Remark);
      Into.Write_Entity ("locState", Value.Loc_State);
      Serialize (Into, "vehicleId", Value.Vehicle_Id);
      Into.Write_Entity ("codriverIds", Value.Codriver_Ids);
      Serialize (Into, "codriverIds", Value.Codriver_Ids);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseLogsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseLogsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "locLng", Value.Loc_Lng);
      Swagger.Streams.Deserialize (Object, "logStartMs", Value.Log_Start_Ms);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "statusType", Value.Status_Type);
      Swagger.Streams.Deserialize (Object, "locCity", Value.Loc_City);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "locName", Value.Loc_Name);
      Swagger.Streams.Deserialize (Object, "locLat", Value.Loc_Lat);
      Swagger.Streams.Deserialize (Object, "remark", Value.Remark);
      Swagger.Streams.Deserialize (Object, "locState", Value.Loc_State);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
      Swagger.Streams.Deserialize (Object, "codriverIds", Value.Codriver_Ids);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseLogsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HosLogsResponseLogsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "logs", Value.Logs);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "logs", Value.Logs);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HosLogsResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseSensorsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("humidity", Value.Humidity);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseSensorsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseSensorsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "humidity", Value.Humidity);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseSensorsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HumidityResponseSensorsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : HumidityResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseSensorsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("probeTemperature", Value.Probe_Temperature);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("ambientTemperature", Value.Ambient_Temperature);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseSensorsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseSensorsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "probeTemperature", Value.Probe_Temperature);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "ambientTemperature", Value.Ambient_Temperature);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseSensorsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TemperatureResponseSensorsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "groupId", Value.Group_Id);
      Serialize (Into, "sensors", Value.Sensors);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "groupId", Value.Group_Id);
      Swagger.Streams.Deserialize (Object, "sensors", Value.Sensors);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TemperatureResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseEndCoordinatesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("latitude", Value.Latitude);
      Into.Write_Entity ("longitude", Value.Longitude);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseEndCoordinatesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseEndCoordinatesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "latitude", Value.Latitude);
      Swagger.Streams.Deserialize (Object, "longitude", Value.Longitude);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseEndCoordinatesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TripResponseEndCoordinatesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseTripsType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("endOdometer", Value.End_Odometer);
      Into.Write_Entity ("distanceMeters", Value.Distance_Meters);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Into.Write_Entity ("fuelConsumedMl", Value.Fuel_Consumed_Ml);
      Into.Write_Entity ("startAddress", Value.Start_Address);
      Serialize (Into, "startCoordinates", Value.Start_Coordinates);
      Serialize (Into, "endCoordinates", Value.End_Coordinates);
      Into.Write_Entity ("startOdometer", Value.Start_Odometer);
      Into.Write_Entity ("driverId", Value.Driver_Id);
      Into.Write_Entity ("startLocation", Value.Start_Location);
      Into.Write_Entity ("tollMeters", Value.Toll_Meters);
      Into.Write_Entity ("endAddress", Value.End_Address);
      Into.Write_Entity ("endLocation", Value.End_Location);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseTripsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseTripsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "endOdometer", Value.End_Odometer);
      Swagger.Streams.Deserialize (Object, "distanceMeters", Value.Distance_Meters);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
      Swagger.Streams.Deserialize (Object, "fuelConsumedMl", Value.Fuel_Consumed_Ml);
      Swagger.Streams.Deserialize (Object, "startAddress", Value.Start_Address);
      Swagger.Streams.Deserialize (Object, "startCoordinates", Value.Start_Coordinates);
      Swagger.Streams.Deserialize (Object, "endCoordinates", Value.End_Coordinates);
      Swagger.Streams.Deserialize (Object, "startOdometer", Value.Start_Odometer);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "startLocation", Value.Start_Location);
      Swagger.Streams.Deserialize (Object, "tollMeters", Value.Toll_Meters);
      Swagger.Streams.Deserialize (Object, "endAddress", Value.End_Address);
      Swagger.Streams.Deserialize (Object, "endLocation", Value.End_Location);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseTripsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TripResponseTripsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "trips", Value.Trips);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "trips", Value.Trips);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : TripResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleTagType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "parentTagId", Value.Parent_Tag_Id);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "id", Value.Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleTagType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleTagType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "parentTagId", Value.Parent_Tag_Id);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleTagType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : UserTagRoleTagType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("role", Value.Role);
      Into.Write_Entity ("roleId", Value.Role_Id);
      Serialize (Into, "tag", Value.Tag);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "role", Value.Role);
      Swagger.Streams.Deserialize (Object, "roleId", Value.Role_Id);
      Swagger.Streams.Deserialize (Object, "tag", Value.Tag);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : UserTagRoleType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("authType", Value.Auth_Type);
      Into.Write_Entity ("email", Value.Email);
      Into.Write_Entity ("name", Value.Name);
      Into.Write_Entity ("organizationRoleId", Value.Organization_Role_Id);
      Serialize (Into, "id", Value.Id);
      Into.Write_Entity ("organizationRole", Value.Organization_Role);
      Serialize (Into, "tagRoles", Value.Tag_Roles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "authType", Value.Auth_Type);
      Swagger.Streams.Deserialize (Object, "email", Value.Email);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "organizationRoleId", Value.Organization_Role_Id);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "organizationRole", Value.Organization_Role);
      Swagger.Streams.Deserialize (Object, "tagRoles", Value.Tag_Roles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : UserType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939CheckEngineLightType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("protectIsOn", Value.Protect_Is_On);
      Into.Write_Entity ("stopIsOn", Value.Stop_Is_On);
      Into.Write_Entity ("warningIsOn", Value.Warning_Is_On);
      Into.Write_Entity ("emissionsIsOn", Value.Emissions_Is_On);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939CheckEngineLightType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939CheckEngineLightType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "protectIsOn", Value.Protect_Is_On);
      Swagger.Streams.Deserialize (Object, "stopIsOn", Value.Stop_Is_On);
      Swagger.Streams.Deserialize (Object, "warningIsOn", Value.Warning_Is_On);
      Swagger.Streams.Deserialize (Object, "emissionsIsOn", Value.Emissions_Is_On);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939CheckEngineLightType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleMaintenanceJ1939CheckEngineLightType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "checkEngineLight", Value.Check_Engine_Light);
      Serialize (Into, "diagnosticTroubleCodes", Value.Diagnostic_Trouble_Codes);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "checkEngineLight", Value.Check_Engine_Light);
      Swagger.Streams.Deserialize (Object, "diagnosticTroubleCodes", Value.Diagnostic_Trouble_Codes);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleMaintenanceJ1939Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerDiagnosticTroubleCodesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("dtcShortCode", Value.Dtc_Short_Code);
      Into.Write_Entity ("dtcId", Value.Dtc_Id);
      Into.Write_Entity ("dtcDescription", Value.Dtc_Description);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerDiagnosticTroubleCodesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerDiagnosticTroubleCodesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "dtcShortCode", Value.Dtc_Short_Code);
      Swagger.Streams.Deserialize (Object, "dtcId", Value.Dtc_Id);
      Swagger.Streams.Deserialize (Object, "dtcDescription", Value.Dtc_Description);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerDiagnosticTroubleCodesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleMaintenancePassengerDiagnosticTroubleCodesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "checkEngineLight", Value.Check_Engine_Light);
      Serialize (Into, "diagnosticTroubleCodes", Value.Diagnostic_Trouble_Codes);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "checkEngineLight", Value.Check_Engine_Light);
      Swagger.Streams.Deserialize (Object, "diagnosticTroubleCodes", Value.Diagnostic_Trouble_Codes);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleMaintenancePassengerType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "id", Value.Id);
      Serialize (Into, "j1939", Value.J1939);
      Serialize (Into, "passenger", Value.Passenger);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "id", Value.Id);
      Swagger.Streams.Deserialize (Object, "j1939", Value.J1939);
      Swagger.Streams.Deserialize (Object, "passenger", Value.Passenger);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : VehicleMaintenanceType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2004Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "vehicles", Value.Vehicles);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2004Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2004Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "vehicles", Value.Vehicles);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2004Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2004Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "timeMs", Value.Time_Ms);
      Into.Write_Entity ("value", Value.Value);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "timeMs", Value.Time_Ms);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AuxInputType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputSeriesType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("name", Value.Name);
      Serialize (Into, "values", Value.Values);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputSeriesType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputSeriesType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "name", Value.Name);
      Swagger.Streams.Deserialize (Object, "values", Value.Values);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputSeriesType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : AuxInputSeriesType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "dispatchJobId", Value.Dispatch_Job_Id);
      Into.Write_Entity ("notes", Value.Notes);
      Into.Write_Entity ("documentType", Value.Document_Type);
      Serialize (Into, "driverCreatedAtMs", Value.Driver_Created_At_Ms);
      Serialize (Into, "driverId", Value.Driver_Id);
      Serialize (Into, "fields", Value.Fields);
      Serialize (Into, "vehicleId", Value.Vehicle_Id);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "dispatchJobId", Value.Dispatch_Job_Id);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "documentType", Value.Document_Type);
      Swagger.Streams.Deserialize (Object, "driverCreatedAtMs", Value.Driver_Created_At_Ms);
      Swagger.Streams.Deserialize (Object, "driverId", Value.Driver_Id);
      Swagger.Streams.Deserialize (Object, "fields", Value.Fields);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentCreateType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "dispatchJobId", Value.Dispatch_Job_Id);
      Into.Write_Entity ("notes", Value.Notes);
      Into.Write_Entity ("documentTypeUuid", Value.Document_Type_Uuid);
      Serialize (Into, "fields", Value.Fields);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentCreateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentCreateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "dispatchJobId", Value.Dispatch_Job_Id);
      Swagger.Streams.Deserialize (Object, "notes", Value.Notes);
      Swagger.Streams.Deserialize (Object, "documentTypeUuid", Value.Document_Type_Uuid);
      Swagger.Streams.Deserialize (Object, "fields", Value.Fields);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentCreateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentCreateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldType) is
   begin
      Into.Start_Entity (Name);
      Into.Write_Entity ("numberValue", Value.Number_Value);
      Serialize (Into, "photoValue", Value.Photo_Value);
      Into.Write_Entity ("stringValue", Value.String_Value);
      Into.Write_Entity ("valueType", Value.Value_Type);
      Into.Write_Entity ("label", Value.Label);
      Serialize (Into, "value", Value.Value);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "numberValue", Value.Number_Value);
      Swagger.Streams.Deserialize (Object, "photoValue", Value.Photo_Value);
      Swagger.Streams.Deserialize (Object, "stringValue", Value.String_Value);
      Swagger.Streams.Deserialize (Object, "valueType", Value.Value_Type);
      Swagger.Streams.Deserialize (Object, "label", Value.Label);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DocumentFieldType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "days", Value.Days);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "days", Value.Days);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriverDailyLogResponseType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in EngineStateType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "timeMs", Value.Time_Ms);
      Into.Write_Entity ("value", Value.Value);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in EngineStateType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out EngineStateType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "timeMs", Value.Time_Ms);
      Swagger.Streams.Deserialize (Object, "value", Value.Value);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out EngineStateType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : EngineStateType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005VehicleStatsType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "engineState", Value.Engine_State);
      Serialize (Into, "auxInput2", Value.Aux_Input2);
      Serialize (Into, "vehicleId", Value.Vehicle_Id);
      Serialize (Into, "auxInput1", Value.Aux_Input1);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005VehicleStatsType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005VehicleStatsType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "engineState", Value.Engine_State);
      Swagger.Streams.Deserialize (Object, "auxInput2", Value.Aux_Input2);
      Swagger.Streams.Deserialize (Object, "vehicleId", Value.Vehicle_Id);
      Swagger.Streams.Deserialize (Object, "auxInput1", Value.Aux_Input1);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005VehicleStatsType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2005VehicleStatsType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005Type) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "pagination", Value.Pagination);
      Serialize (Into, "vehicleStats", Value.Vehicle_Stats);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005Type_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005Type) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "pagination", Value.Pagination);
      Swagger.Streams.Deserialize (Object, "vehicleStats", Value.Vehicle_Stats);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005Type_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : InlineResponse2005Type;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;




   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseDaysType) is
   begin
      Into.Start_Entity (Name);
      Serialize (Into, "certifiedAtMs", Value.Certified_At_Ms);
      Into.Write_Entity ("endMs", Value.End_Ms);
      Into.Write_Entity ("startMs", Value.Start_Ms);
      Serialize (Into, "trailerIds", Value.Trailer_Ids);
      Into.Write_Entity ("activeHours", Value.Active_Hours);
      Into.Write_Entity ("distanceMiles", Value.Distance_Miles);
      Serialize (Into, "activeMs", Value.Active_Ms);
      Into.Write_Entity ("certified", Value.Certified);
      Serialize (Into, "vehicleIds", Value.Vehicle_Ids);
      Into.End_Entity (Name);
   end Serialize;

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseDaysType_Vectors.Vector) is
   begin
      Into.Start_Array (Name);
      for Item of Value loop
         Serialize (Into, "", Item);
      end loop;
      Into.End_Array (Name);
   end Serialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseDaysType) is
      Object : Swagger.Value_Type;
   begin
      Swagger.Streams.Deserialize (From, Name, Object);
      Swagger.Streams.Deserialize (Object, "certifiedAtMs", Value.Certified_At_Ms);
      Swagger.Streams.Deserialize (Object, "endMs", Value.End_Ms);
      Swagger.Streams.Deserialize (Object, "startMs", Value.Start_Ms);
      Swagger.Streams.Deserialize (Object, "trailerIds", Value.Trailer_Ids);
      Swagger.Streams.Deserialize (Object, "activeHours", Value.Active_Hours);
      Swagger.Streams.Deserialize (Object, "distanceMiles", Value.Distance_Miles);
      Swagger.Streams.Deserialize (Object, "activeMs", Value.Active_Ms);
      Swagger.Streams.Deserialize (Object, "certified", Value.Certified);
      Swagger.Streams.Deserialize (Object, "vehicleIds", Value.Vehicle_Ids);
   end Deserialize;

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseDaysType_Vectors.Vector) is
      List : Swagger.Value_Array_Type;
      Item : DriverDailyLogResponseDaysType;
   begin
      Value.Clear;
      Swagger.Streams.Deserialize (From, Name, List);
      for Data of List loop
         Deserialize (Data, "", Item);
         Value.Append (Item);
      end loop;
   end Deserialize;



end .Models;
