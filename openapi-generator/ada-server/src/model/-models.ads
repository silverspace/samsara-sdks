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
with Ada.Containers.Vectors;
package .Models is



   type VehicleMaintenancePassengerCheckEngineLightType is
     record
       Is_On : Boolean;
     end record;

   package VehicleMaintenancePassengerCheckEngineLightType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleMaintenancePassengerCheckEngineLightType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerCheckEngineLightType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerCheckEngineLightType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerCheckEngineLightType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerCheckEngineLightType_Vectors.Vector);




   type VehicleMaintenanceJ1939DiagnosticTroubleCodesType is
     record
       Spn_Description : Swagger.UString;
       Fmi_Text : Swagger.UString;
       Spn_Id : Integer;
       Occurrence_Count : Integer;
       Tx_Id : Integer;
       Fmi_Id : Integer;
     end record;

   package VehicleMaintenanceJ1939DiagnosticTroubleCodesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleMaintenanceJ1939DiagnosticTroubleCodesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939DiagnosticTroubleCodesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939DiagnosticTroubleCodesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939DiagnosticTroubleCodesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939DiagnosticTroubleCodesType_Vectors.Vector);




   type VehicleHarshEventResponseLocationType is
     record
       Address : Swagger.UString;
       Latitude : Swagger.UString;
       Longitude : Swagger.UString;
     end record;

   package VehicleHarshEventResponseLocationType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleHarshEventResponseLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseLocationType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseLocationType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseLocationType_Vectors.Vector);




   type VehicleHarshEventResponseType is
     record
       Download_Forward_Video_Url : Swagger.UString;
       Download_Inward_Video_Url : Swagger.UString;
       Download_Tracked_Inward_Video_Url : Swagger.UString;
       Harsh_Event_Type : Swagger.UString;
       Incident_Report_Url : Swagger.UString;
       Is_Distracted : Boolean;
       Location : .Models.VehicleHarshEventResponseLocationType;
     end record;

   package VehicleHarshEventResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleHarshEventResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleHarshEventResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleHarshEventResponseType_Vectors.Vector);




   type TripResponseStartCoordinatesType is
     record
       Latitude : double;
       Longitude : double;
     end record;

   package TripResponseStartCoordinatesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TripResponseStartCoordinatesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseStartCoordinatesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseStartCoordinatesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseStartCoordinatesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseStartCoordinatesType_Vectors.Vector);




   type SensorHistoryResponseResultsType is
     record
       Series : Swagger.Long_Vectors.Vector;
       Time_Ms : Integer;
     end record;

   package SensorHistoryResponseResultsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => SensorHistoryResponseResultsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseResultsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseResultsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseResultsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseResultsType_Vectors.Vector);




   type SensorHistoryResponseType is
     record
       Results : .Models.SensorHistoryResponseResultsType_Vectors.Vector;
     end record;

   package SensorHistoryResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => SensorHistoryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorHistoryResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorHistoryResponseType_Vectors.Vector);




   type MachineHistoryResponseVibrationsType is
     record
       X : double;
       Y : double;
       Z : double;
       Time : Swagger.Long;
     end record;

   package MachineHistoryResponseVibrationsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => MachineHistoryResponseVibrationsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseVibrationsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseVibrationsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseVibrationsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseVibrationsType_Vectors.Vector);




   type MachineHistoryResponseMachinesType is
     record
       Name : Swagger.UString;
       Id : Integer;
       Vibrations : .Models.MachineHistoryResponseVibrationsType_Vectors.Vector;
     end record;

   package MachineHistoryResponseMachinesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => MachineHistoryResponseMachinesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseMachinesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseMachinesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseMachinesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseMachinesType_Vectors.Vector);




   type MachineHistoryResponseType is
     record
       Machines : .Models.MachineHistoryResponseMachinesType_Vectors.Vector;
     end record;

   package MachineHistoryResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => MachineHistoryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineHistoryResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineHistoryResponseType_Vectors.Vector);




   type HosLogsSummaryResponseDriversType is
     record
       Time_Until_Break : Swagger.Long;
       Vehicle_Name : Swagger.UString;
       Driving_In_Violation_Today : Swagger.Long;
       Driver_Id : Swagger.Long;
       Cycle_Remaining : Swagger.Long;
       Driver_Name : Swagger.UString;
       Duty_Status : Swagger.UString;
       Cycle_Tomorrow : Swagger.Long;
       Shift_Drive_Remaining : Swagger.Long;
       Time_In_Current_Status : Swagger.Long;
       Driving_In_Violation_Cycle : Swagger.Long;
       Shift_Remaining : Swagger.Long;
     end record;

   package HosLogsSummaryResponseDriversType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HosLogsSummaryResponseDriversType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseDriversType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseDriversType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseDriversType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseDriversType_Vectors.Vector);




   type HosLogsSummaryResponseType is
     record
       Drivers : .Models.HosLogsSummaryResponseDriversType_Vectors.Vector;
     end record;

   package HosLogsSummaryResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HosLogsSummaryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsSummaryResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsSummaryResponseType_Vectors.Vector);




   type HosAuthenticationLogsResponseAuthenticationLogsType is
     record
       Action_Type : Swagger.UString;
       Address : Swagger.UString;
       City : Swagger.UString;
       Happened_At_Ms : Swagger.Long;
       Address_Name : Swagger.UString;
       State : Swagger.UString;
     end record;

   package HosAuthenticationLogsResponseAuthenticationLogsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HosAuthenticationLogsResponseAuthenticationLogsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseAuthenticationLogsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseAuthenticationLogsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseAuthenticationLogsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseAuthenticationLogsType_Vectors.Vector);




   type HosAuthenticationLogsResponseType is
     record
       Authentication_Logs : .Models.HosAuthenticationLogsResponseAuthenticationLogsType_Vectors.Vector;
     end record;

   package HosAuthenticationLogsResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HosAuthenticationLogsResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosAuthenticationLogsResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosAuthenticationLogsResponseType_Vectors.Vector);




   type DvirBaseVehicleType is
     record
       Name : Swagger.UString;
       Id : Swagger.Long;
     end record;

   package DvirBaseVehicleType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DvirBaseVehicleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseVehicleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseVehicleType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseVehicleType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseVehicleType_Vectors.Vector);




   type DvirBaseNextDriverSignatureType is
     record
       Driver_Id : Swagger.Long;
       Name : Swagger.UString;
       Signed_At : Swagger.Long;
       P_Type : Swagger.UString;
       Email : Swagger.UString;
       Username : Swagger.UString;
     end record;

   package DvirBaseNextDriverSignatureType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DvirBaseNextDriverSignatureType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseNextDriverSignatureType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseNextDriverSignatureType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseNextDriverSignatureType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseNextDriverSignatureType_Vectors.Vector);




   type DvirBaseAuthorSignatureType is
     record
       Mechanic_User_Id : Swagger.Long;
       Driver_Id : Swagger.Long;
       Name : Swagger.UString;
       Signed_At : Swagger.Long;
       P_Type : Swagger.UString;
       Email : Swagger.UString;
       Username : Swagger.UString;
     end record;

   package DvirBaseAuthorSignatureType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DvirBaseAuthorSignatureType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseAuthorSignatureType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseAuthorSignatureType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseAuthorSignatureType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseAuthorSignatureType_Vectors.Vector);




   type DocumentFieldTypeNumberValueTypeMetadataType is
     record
       Num_Decimal_Places : Swagger.Long;
     end record;

   package DocumentFieldTypeNumberValueTypeMetadataType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentFieldTypeNumberValueTypeMetadataType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeNumberValueTypeMetadataType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeNumberValueTypeMetadataType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeNumberValueTypeMetadataType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeNumberValueTypeMetadataType_Vectors.Vector);




   type DocumentFieldTypeType is
     record
       Label : Swagger.UString;
       Number_Value_Type_Metadata : .Models.DocumentFieldTypeNumberValueTypeMetadataType;
       Value_Type : Swagger.UString;
     end record;

   package DocumentFieldTypeType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentFieldTypeType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldTypeType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldTypeType_Vectors.Vector);




   type DataInputHistoryResponsePointsType is
     record
       Value : double;
       Time_Ms : Swagger.Long;
     end record;

   package DataInputHistoryResponsePointsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DataInputHistoryResponsePointsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponsePointsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponsePointsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponsePointsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponsePointsType_Vectors.Vector);




   type DataInputHistoryResponseType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
       Points : .Models.DataInputHistoryResponsePointsType_Vectors.Vector;
     end record;

   package DataInputHistoryResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DataInputHistoryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DataInputHistoryResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DataInputHistoryResponseType_Vectors.Vector);




   type InlineResponse2006Type is
     record
       Data_Inputs : .Models.DataInputHistoryResponseType_Vectors.Vector;
     end record;

   package InlineResponse2006Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2006Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2006Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2006Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2006Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2006Type_Vectors.Vector);




   type AssetReeferResponseReeferStatsAlarmsType is
     record
       Severity : Swagger.Long;
       Operator_Action : Swagger.UString;
       Description : Swagger.UString;
       Alarm_Code : Swagger.Long;
     end record;

   package AssetReeferResponseReeferStatsAlarmsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsAlarmsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarmsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarmsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarmsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarmsType_Vectors.Vector);




   type AssetReeferResponseReeferStatsAlarms1Type is
     record
       Alarms : .Models.AssetReeferResponseReeferStatsAlarmsType_Vectors.Vector;
       Changed_At_Ms : Swagger.Long;
     end record;

   package AssetReeferResponseReeferStatsAlarms1Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsAlarms1Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarms1Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsAlarms1Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarms1Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsAlarms1Type_Vectors.Vector);




   type AssetReeferResponseReeferStatsSetPointType is
     record
       Temp_In_Milli_C : Swagger.Long;
       Changed_At_Ms : Swagger.Long;
     end record;

   package AssetReeferResponseReeferStatsSetPointType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsSetPointType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsSetPointType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsSetPointType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsSetPointType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsSetPointType_Vectors.Vector);




   type AssetReeferResponseReeferStatsPowerStatusType is
     record
       Changed_At_Ms : Swagger.Long;
       Status : Swagger.UString;
     end record;

   package AssetReeferResponseReeferStatsPowerStatusType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsPowerStatusType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsPowerStatusType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsPowerStatusType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsPowerStatusType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsPowerStatusType_Vectors.Vector);




   type AssetCableType is
     record
       Asset_Type : Swagger.UString;
     end record;

   package AssetCableType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetCableType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCableType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCableType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCableType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCableType_Vectors.Vector);




   type AssetType is
     record
       Asset_Serial_Number : Swagger.UString;
       Cable : .Models.AssetCableType_Vectors.Vector;
       Engine_Hours : Integer;
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package AssetType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetType_Vectors.Vector);




   type InlineResponse200Type is
     record
       Assets : .Models.AssetType_Vectors.Vector;
     end record;

   package InlineResponse200Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse200Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse200Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse200Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse200Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse200Type_Vectors.Vector);




   type AddressGeofencePolygonVerticesType is
     record
       Latitude : double;
       Longitude : double;
     end record;

   package AddressGeofencePolygonVerticesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AddressGeofencePolygonVerticesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonVerticesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonVerticesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonVerticesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonVerticesType_Vectors.Vector);




   type AddressGeofencePolygonType is
     record
       Vertices : .Models.AddressGeofencePolygonVerticesType_Vectors.Vector;
     end record;

   package AddressGeofencePolygonType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AddressGeofencePolygonType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofencePolygonType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofencePolygonType_Vectors.Vector);




   type InlineObject22Type is
     record
       Group_Id : Swagger.Long;
       Sensors : Swagger.Long_Vectors.Vector;
     end record;

   package InlineObject22Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject22Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject22Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject22Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject22Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject22Type_Vectors.Vector);




   type SensorsHistorySeriesType is
     record
       Field : Swagger.UString;
       Widget_Id : Swagger.Long;
     end record;

   package SensorsHistorySeriesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => SensorsHistorySeriesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorsHistorySeriesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorsHistorySeriesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorsHistorySeriesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorsHistorySeriesType_Vectors.Vector);




   type InlineObject21Type is
     record
       End_Ms : Integer;
       Fill_Missing : Swagger.UString;
       Group_Id : Swagger.Long;
       Series : .Models.SensorsHistorySeriesType_Vectors.Vector;
       Start_Ms : Integer;
       Step_Ms : Integer;
     end record;

   package InlineObject21Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject21Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject21Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject21Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject21Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject21Type_Vectors.Vector);




   type InlineObject19Type is
     record
       Group_Id : Swagger.Long;
       Sensors : Swagger.Long_Vectors.Vector;
     end record;

   package InlineObject19Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject19Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject19Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject19Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject19Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject19Type_Vectors.Vector);




   type InlineObject18Type is
     record
       Group_Id : Swagger.Long;
     end record;

   package InlineObject18Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject18Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject18Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject18Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject18Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject18Type_Vectors.Vector);




   type InlineObject15Type is
     record
       End_Ms : Integer;
       Group_Id : Swagger.Long;
       Start_Ms : Integer;
       Vehicle_Id : Swagger.Long;
     end record;

   package InlineObject15Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject15Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject15Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject15Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject15Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject15Type_Vectors.Vector);




   type InlineObject12Type is
     record
       Inspection_Type : Swagger.UString;
       Mechanic_Notes : Swagger.UString;
       Odometer_Miles : Integer;
       Previous_Defects_Corrected : Boolean;
       Previous_Defects_Ignored : Boolean;
       Safe : Swagger.UString;
       Trailer_Id : Integer;
       User_Email : Swagger.UString;
       Vehicle_Id : Integer;
     end record;

   package InlineObject12Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject12Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject12Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject12Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject12Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject12Type_Vectors.Vector);




   type InlineObject11Type is
     record
       Group_Id : Swagger.Long;
     end record;

   package InlineObject11Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject11Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject11Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject11Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject11Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject11Type_Vectors.Vector);




   type InlineObject10Type is
     record
       Group_Id : Swagger.Long;
     end record;

   package InlineObject10Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject10Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject10Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject10Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject10Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject10Type_Vectors.Vector);




   type InlineObject8Type is
     record
       Driver_Id : Swagger.Long;
       End_Ms : Integer;
       Group_Id : Swagger.Long;
       Start_Ms : Integer;
     end record;

   package InlineObject8Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject8Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject8Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject8Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject8Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject8Type_Vectors.Vector);




   type InlineObject6Type is
     record
       Driver_Id : Swagger.Long;
       End_Ms : Integer;
       Group_Id : Swagger.Long;
       Start_Ms : Integer;
     end record;

   package InlineObject6Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject6Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject6Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject6Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject6Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject6Type_Vectors.Vector);




   type InlineObject4Type is
     record
       Reactivate : Boolean;
     end record;

   package InlineObject4Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject4Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject4Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject4Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject4Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject4Type_Vectors.Vector);




   type InlineObject2Type is
     record
       Address : Swagger.UString;
       Group_Id : Swagger.Long;
       Name : Swagger.UString;
       Radius : Integer;
     end record;

   package InlineObject2Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject2Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject2Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject2Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject2Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject2Type_Vectors.Vector);




   type PrevJobStatusType is
     record
     end record;

   package PrevJobStatusType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PrevJobStatusType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PrevJobStatusType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PrevJobStatusType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PrevJobStatusType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PrevJobStatusType_Vectors.Vector);




   type JobStatusType is
     record
     end record;

   package JobStatusType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => JobStatusType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobStatusType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobStatusType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobStatusType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobStatusType_Vectors.Vector);




   type DispatchJobType is
     record
       Destination_Address : Swagger.UString;
       Destination_Address_Id : Swagger.Long;
       Destination_Lat : double;
       Destination_Lng : double;
       Destination_Name : Swagger.UString;
       Notes : Swagger.UString;
       Scheduled_Arrival_Time_Ms : Swagger.Long;
       Scheduled_Departure_Time_Ms : Swagger.Long;
       Arrived_At_Ms : Swagger.Long;
       Completed_At_Ms : Swagger.Long;
       Dispatch_Route_Id : Swagger.Long;
       Driver_Id : Swagger.Long;
       En_Route_At_Ms : Swagger.Long;
       Estimated_Arrival_Ms : Swagger.Long;
       Fleet_Viewer_Url : Swagger.UString;
       Group_Id : Swagger.Long;
       Id : Swagger.Long;
       Job_State : .Models.JobStatusType;
       Skipped_At_Ms : Swagger.Long;
       Vehicle_Id : Swagger.Long;
     end record;

   package DispatchJobType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DispatchJobType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobType_Vectors.Vector);




   type DispatchRouteType is
     record
       Actual_End_Ms : Swagger.Long;
       Actual_Start_Ms : Swagger.Long;
       Driver_Id : Swagger.Long;
       Group_Id : Swagger.Long;
       Name : Swagger.UString;
       Scheduled_End_Ms : Swagger.Long;
       Scheduled_Meters : Swagger.Long;
       Scheduled_Start_Ms : Swagger.Long;
       Start_Location_Address : Swagger.UString;
       Start_Location_Address_Id : Swagger.Long;
       Start_Location_Lat : double;
       Start_Location_Lng : double;
       Start_Location_Name : Swagger.UString;
       Trailer_Id : Swagger.Long;
       Vehicle_Id : Swagger.Long;
       Dispatch_Jobs : .Models.DispatchJobType_Vectors.Vector;
       Id : Swagger.Long;
     end record;

   package DispatchRouteType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DispatchRouteType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteType_Vectors.Vector);




   type JobUpdateObjectType is
     record
       Changed_At_Ms : Swagger.Long;
       Job_Id : Swagger.Long;
       Job_State : .Models.JobStatusType;
       Prev_Job_State : .Models.PrevJobStatusType;
       Route : .Models.DispatchRouteType;
       Route_Id : Swagger.Long;
     end record;

   package JobUpdateObjectType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => JobUpdateObjectType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobUpdateObjectType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in JobUpdateObjectType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobUpdateObjectType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out JobUpdateObjectType_Vectors.Vector);




   type AllRouteJobUpdatesType is
     record
       Job_Updates : .Models.JobUpdateObjectType_Vectors.Vector;
       Sequence_Id : Swagger.UString;
     end record;

   package AllRouteJobUpdatesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AllRouteJobUpdatesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AllRouteJobUpdatesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AllRouteJobUpdatesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AllRouteJobUpdatesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AllRouteJobUpdatesType_Vectors.Vector);




   type DispatchRouteHistoricalEntryType is
     record
       Changed_At_Ms : Swagger.Long;
       Route : .Models.DispatchRouteType;
     end record;

   package DispatchRouteHistoricalEntryType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DispatchRouteHistoricalEntryType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoricalEntryType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoricalEntryType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoricalEntryType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoricalEntryType_Vectors.Vector);




   type DispatchRouteHistoryType is
     record
       History : .Models.DispatchRouteHistoricalEntryType_Vectors.Vector;
     end record;

   package DispatchRouteHistoryType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DispatchRouteHistoryType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoryType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteHistoryType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoryType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteHistoryType_Vectors.Vector);




   type VehicleLocationType is
     record
       Heading : double;
       Id : Swagger.Long;
       Latitude : double;
       Location : Swagger.UString;
       Longitude : double;
       Name : Swagger.UString;
       Odometer_Meters : Swagger.Long;
       On_Trip : Boolean;
       Speed : double;
       Time : Integer;
       Vin : Swagger.UString;
     end record;

   package VehicleLocationType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleLocationType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleLocationType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleLocationType_Vectors.Vector);




   type InlineResponse2003Type is
     record
       Group_Id : Swagger.Long;
       Vehicles : .Models.VehicleLocationType_Vectors.Vector;
     end record;

   package InlineResponse2003Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2003Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2003Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2003Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2003Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2003Type_Vectors.Vector);




   type VehicleType is
     record
       Engine_Hours : Swagger.Long;
       Fuel_Level_Percent : double;
       Id : Swagger.Long;
       Name : Swagger.UString;
       Note : Swagger.UString;
       Odometer_Meters : Swagger.Long;
       Vin : Swagger.UString;
     end record;

   package VehicleType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleType_Vectors.Vector);




   type InlineObject14Type is
     record
       Group_Id : Swagger.Long;
       Vehicles : .Models.VehicleType_Vectors.Vector;
     end record;

   package InlineObject14Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject14Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject14Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject14Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject14Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject14Type_Vectors.Vector);




   type UserRoleType is
     record
       Id : Swagger.UString;
       Name : Swagger.UString;
     end record;

   package UserRoleType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => UserRoleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserRoleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserRoleType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserRoleType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserRoleType_Vectors.Vector);




   type TaggedVehicleType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package TaggedVehicleType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedVehicleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleType_Vectors.Vector);




   type TaggedSensorType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package TaggedSensorType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedSensorType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorType_Vectors.Vector);




   type TaggedMachineType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package TaggedMachineType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedMachineType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineType_Vectors.Vector);




   type TaggedDriverType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package TaggedDriverType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedDriverType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverType_Vectors.Vector);




   type TaggedAssetType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package TaggedAssetType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedAssetType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetType_Vectors.Vector);




   type TaggedAddressType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package TaggedAddressType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedAddressType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressType_Vectors.Vector);




   type TagType is
     record
       Addresses : .Models.TaggedAddressType_Vectors.Vector;
       Assets : .Models.TaggedAssetType_Vectors.Vector;
       Drivers : .Models.TaggedDriverType_Vectors.Vector;
       Group_Id : Swagger.Long;
       Id : Swagger.Long;
       Machines : .Models.TaggedMachineType_Vectors.Vector;
       Name : Swagger.UString;
       Parent_Tag_Id : Swagger.Long;
       Sensors : .Models.TaggedSensorType_Vectors.Vector;
       Vehicles : .Models.TaggedVehicleType_Vectors.Vector;
     end record;

   package TagType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TagType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagType_Vectors.Vector);




   type InlineResponse2009Type is
     record
       Tags : .Models.TagType_Vectors.Vector;
     end record;

   package InlineResponse2009Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2009Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2009Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2009Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2009Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2009Type_Vectors.Vector);




   type SafetyReportHarshEventType is
     record
       Harsh_Event_Type : Swagger.UString;
       Timestamp_Ms : Integer;
       Vehicle_Id : Integer;
     end record;

   package SafetyReportHarshEventType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => SafetyReportHarshEventType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SafetyReportHarshEventType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SafetyReportHarshEventType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SafetyReportHarshEventType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SafetyReportHarshEventType_Vectors.Vector);




   type VehicleSafetyScoreResponseType is
     record
       Crash_Count : Integer;
       Harsh_Accel_Count : Integer;
       Harsh_Braking_Count : Integer;
       Harsh_Events : .Models.SafetyReportHarshEventType_Vectors.Vector;
       Harsh_Turning_Count : Integer;
       Safety_Score : Integer;
       Safety_Score_Rank : Swagger.UString;
       Time_Over_Speed_Limit_Ms : Integer;
       Total_Distance_Driven_Meters : Integer;
       Total_Harsh_Event_Count : Integer;
       Total_Time_Driven_Ms : Integer;
       Vehicle_Id : Integer;
     end record;

   package VehicleSafetyScoreResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleSafetyScoreResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleSafetyScoreResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleSafetyScoreResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleSafetyScoreResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleSafetyScoreResponseType_Vectors.Vector);




   type DriverSafetyScoreResponseType is
     record
       Crash_Count : Integer;
       Driver_Id : Integer;
       Harsh_Accel_Count : Integer;
       Harsh_Braking_Count : Integer;
       Harsh_Events : .Models.SafetyReportHarshEventType_Vectors.Vector;
       Harsh_Turning_Count : Integer;
       Safety_Score : Integer;
       Safety_Score_Rank : Swagger.UString;
       Time_Over_Speed_Limit_Ms : Integer;
       Total_Distance_Driven_Meters : Integer;
       Total_Harsh_Event_Count : Integer;
       Total_Time_Driven_Ms : Integer;
     end record;

   package DriverSafetyScoreResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriverSafetyScoreResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverSafetyScoreResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverSafetyScoreResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverSafetyScoreResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverSafetyScoreResponseType_Vectors.Vector);




   type ErrorResponseType is
     record
     end record;

   package ErrorResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => ErrorResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ErrorResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ErrorResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ErrorResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ErrorResponseType_Vectors.Vector);




   type DocumentTypeType is
     record
       Field_Types : Swagger.Vector_Vectors.Vector;
       Name : Swagger.UString;
       Org_Id : Swagger.Long;
       Uuid : Swagger.UString;
     end record;

   package DocumentTypeType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentTypeType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentTypeType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentTypeType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentTypeType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentTypeType_Vectors.Vector);




   type DispatchRouteBaseType is
     record
       Actual_End_Ms : Swagger.Long;
       Actual_Start_Ms : Swagger.Long;
       Driver_Id : Swagger.Long;
       Group_Id : Swagger.Long;
       Name : Swagger.UString;
       Scheduled_End_Ms : Swagger.Long;
       Scheduled_Meters : Swagger.Long;
       Scheduled_Start_Ms : Swagger.Long;
       Start_Location_Address : Swagger.UString;
       Start_Location_Address_Id : Swagger.Long;
       Start_Location_Lat : double;
       Start_Location_Lng : double;
       Start_Location_Name : Swagger.UString;
       Trailer_Id : Swagger.Long;
       Vehicle_Id : Swagger.Long;
     end record;

   package DispatchRouteBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DispatchRouteBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteBaseType_Vectors.Vector);




   type DispatchJobCreateType is
     record
       Destination_Address : Swagger.UString;
       Destination_Address_Id : Swagger.Long;
       Destination_Lat : double;
       Destination_Lng : double;
       Destination_Name : Swagger.UString;
       Notes : Swagger.UString;
       Scheduled_Arrival_Time_Ms : Swagger.Long;
       Scheduled_Departure_Time_Ms : Swagger.Long;
     end record;

   package DispatchJobCreateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DispatchJobCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchJobCreateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobCreateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchJobCreateType_Vectors.Vector);




   type DispatchRouteCreateType is
     record
       Actual_End_Ms : Swagger.Long;
       Actual_Start_Ms : Swagger.Long;
       Driver_Id : Swagger.Long;
       Group_Id : Swagger.Long;
       Name : Swagger.UString;
       Scheduled_End_Ms : Swagger.Long;
       Scheduled_Meters : Swagger.Long;
       Scheduled_Start_Ms : Swagger.Long;
       Start_Location_Address : Swagger.UString;
       Start_Location_Address_Id : Swagger.Long;
       Start_Location_Lat : double;
       Start_Location_Lng : double;
       Start_Location_Name : Swagger.UString;
       Trailer_Id : Swagger.Long;
       Vehicle_Id : Swagger.Long;
       Dispatch_Jobs : .Models.DispatchJobCreateType_Vectors.Vector;
     end record;

   package DispatchRouteCreateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DispatchRouteCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DispatchRouteCreateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteCreateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DispatchRouteCreateType_Vectors.Vector);




   type ContactType is
     record
       Email : Swagger.UString;
       First_Name : Swagger.UString;
       Id : Swagger.Long;
       Last_Name : Swagger.UString;
       Phone : Swagger.UString;
     end record;

   package ContactType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => ContactType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ContactType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ContactType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ContactType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out ContactType_Vectors.Vector);




   type AssetCurrentLocationType is
     record
       Latitude : double;
       Location : Swagger.UString;
       Longitude : double;
       Speed_Miles_Per_Hour : double;
       Time_Ms : Swagger.Long;
     end record;

   package AssetCurrentLocationType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetCurrentLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationType_Vectors.Vector);




   type AssetCurrentLocationsResponseType is
     record
       Cable : .Models.AssetCableType_Vectors.Vector;
       Engine_Hours : Integer;
       Id : Swagger.Long;
       Location : .Models.AssetCurrentLocationType_Vectors.Vector;
       Name : Swagger.UString;
     end record;

   package AssetCurrentLocationsResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetCurrentLocationsResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationsResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetCurrentLocationsResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationsResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetCurrentLocationsResponseType_Vectors.Vector);




   type InlineResponse2001Type is
     record
       Assets : .Models.AssetCurrentLocationsResponseType_Vectors.Vector;
     end record;

   package InlineResponse2001Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2001Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2001Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2001Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2001Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2001Type_Vectors.Vector);




   type AddressNotesType is
     record
     end record;

   package AddressNotesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AddressNotesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressNotesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressNotesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressNotesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressNotesType_Vectors.Vector);




   type CurrentDriverType is
     record
     end record;

   package CurrentDriverType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => CurrentDriverType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CurrentDriverType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CurrentDriverType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CurrentDriverType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CurrentDriverType_Vectors.Vector);




   type DocumentBaseType is
     record
       Dispatch_Job_Id : Swagger.Long;
       Notes : Swagger.UString;
     end record;

   package DocumentBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentBaseType_Vectors.Vector);




   type DriverBaseType is
     record
       Eld_Adverse_Weather_Exemption_Enabled : Boolean;
       Eld_Big_Day_Exemption_Enabled : Boolean;
       Eld_Day_Start_Hour : Integer;
       Eld_Exempt : Boolean;
       Eld_Exempt_Reason : Swagger.UString;
       Eld_Pc_Enabled : Boolean;
       Eld_Ym_Enabled : Boolean;
       External_Ids : Swagger.UString_Map;
       Group_Id : Swagger.Long;
       License_Number : Swagger.UString;
       License_State : Swagger.UString;
       Name : Swagger.UString;
       Notes : Swagger.UString;
       Phone : Swagger.UString;
       Username : Swagger.UString;
       Vehicle_Id : Swagger.Long;
     end record;

   package DriverBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriverBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverBaseType_Vectors.Vector);




   type DriverForCreateType is
     record
       Eld_Adverse_Weather_Exemption_Enabled : Boolean;
       Eld_Big_Day_Exemption_Enabled : Boolean;
       Eld_Day_Start_Hour : Integer;
       Eld_Exempt : Boolean;
       Eld_Exempt_Reason : Swagger.UString;
       Eld_Pc_Enabled : Boolean;
       Eld_Ym_Enabled : Boolean;
       External_Ids : Swagger.UString_Map;
       Group_Id : Swagger.Long;
       License_Number : Swagger.UString;
       License_State : Swagger.UString;
       Name : Swagger.UString;
       Notes : Swagger.UString;
       Phone : Swagger.UString;
       Username : Swagger.UString;
       Vehicle_Id : Swagger.Long;
       Password : Swagger.UString;
       Tag_Ids : Swagger.Long_Vectors.Vector;
     end record;

   package DriverForCreateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriverForCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverForCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverForCreateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverForCreateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverForCreateType_Vectors.Vector);




   type FleetVehicleLocationType is
     record
       Latitude : double;
       Location : Swagger.UString;
       Longitude : double;
       Speed_Miles_Per_Hour : double;
       Time_Ms : Swagger.Long;
     end record;

   package FleetVehicleLocationType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => FleetVehicleLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleLocationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleLocationType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleLocationType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleLocationType_Vectors.Vector);




   type MachineType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
       Notes : Swagger.UString;
     end record;

   package MachineType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => MachineType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in MachineType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out MachineType_Vectors.Vector);




   type InlineResponse2007Type is
     record
       Machines : .Models.MachineType_Vectors.Vector;
     end record;

   package InlineResponse2007Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2007Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2007Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2007Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2007Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2007Type_Vectors.Vector);




   type PaginationType is
     record
       End_Cursor : Swagger.UString;
       Has_Next_Page : Boolean;
       Has_Prev_Page : Boolean;
       Start_Cursor : Swagger.UString;
     end record;

   package PaginationType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => PaginationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PaginationType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in PaginationType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PaginationType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out PaginationType_Vectors.Vector);




   type InlineResponse2002Type is
     record
       Pagination : .Models.PaginationType;
       Group_Id : Swagger.Long;
       Vehicles : .Models.VehicleType_Vectors.Vector;
     end record;

   package InlineResponse2002Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2002Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2002Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2002Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2002Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2002Type_Vectors.Vector);




   type SensorType is
     record
       Id : Swagger.Long;
       Mac_Address : Swagger.UString;
       Name : Swagger.UString;
     end record;

   package SensorType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => SensorType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in SensorType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out SensorType_Vectors.Vector);




   type InlineResponse2008Type is
     record
       Sensors : .Models.SensorType_Vectors.Vector;
     end record;

   package InlineResponse2008Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2008Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2008Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2008Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2008Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2008Type_Vectors.Vector);




   type TagMetadataType is
     record
       Id : Swagger.Long;
       Name : Swagger.UString;
     end record;

   package TagMetadataType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TagMetadataType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagMetadataType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagMetadataType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagMetadataType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagMetadataType_Vectors.Vector);




   type DriverType is
     record
       Eld_Adverse_Weather_Exemption_Enabled : Boolean;
       Eld_Big_Day_Exemption_Enabled : Boolean;
       Eld_Day_Start_Hour : Integer;
       Eld_Exempt : Boolean;
       Eld_Exempt_Reason : Swagger.UString;
       Eld_Pc_Enabled : Boolean;
       Eld_Ym_Enabled : Boolean;
       External_Ids : Swagger.UString_Map;
       Group_Id : Swagger.Long;
       License_Number : Swagger.UString;
       License_State : Swagger.UString;
       Name : Swagger.UString;
       Notes : Swagger.UString;
       Phone : Swagger.UString;
       Username : Swagger.UString;
       Vehicle_Id : Swagger.Long;
       Id : Swagger.Long;
       Is_Deactivated : Boolean;
       Tags : .Models.TagMetadataType_Vectors.Vector;
     end record;

   package DriverType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriverType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverType_Vectors.Vector);




   type DriversResponseType is
     record
       Drivers : .Models.DriverType_Vectors.Vector;
     end record;

   package DriversResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriversResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversResponseType_Vectors.Vector);




   type TaggedAddressBaseType is
     record
       Id : Swagger.Long;
     end record;

   package TaggedAddressBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedAddressBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAddressBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAddressBaseType_Vectors.Vector);




   type TaggedAssetBaseType is
     record
       Id : Swagger.Long;
     end record;

   package TaggedAssetBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedAssetBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedAssetBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedAssetBaseType_Vectors.Vector);




   type TaggedDriverBaseType is
     record
       Id : Swagger.Long;
     end record;

   package TaggedDriverBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedDriverBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedDriverBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedDriverBaseType_Vectors.Vector);




   type TaggedMachineBaseType is
     record
       Id : Swagger.Long;
     end record;

   package TaggedMachineBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedMachineBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedMachineBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedMachineBaseType_Vectors.Vector);




   type TaggedSensorBaseType is
     record
       Id : Swagger.Long;
     end record;

   package TaggedSensorBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedSensorBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedSensorBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedSensorBaseType_Vectors.Vector);




   type TaggedVehicleBaseType is
     record
       Id : Swagger.Long;
     end record;

   package TaggedVehicleBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TaggedVehicleBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TaggedVehicleBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TaggedVehicleBaseType_Vectors.Vector);




   type TagModifyDeleteType is
     record
       Assets : .Models.TaggedAssetBaseType_Vectors.Vector;
       Sensors : .Models.TaggedSensorBaseType_Vectors.Vector;
       Vehicles : .Models.TaggedVehicleBaseType_Vectors.Vector;
       Machines : .Models.TaggedMachineBaseType_Vectors.Vector;
       Drivers : .Models.TaggedDriverBaseType_Vectors.Vector;
     end record;

   package TagModifyDeleteType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TagModifyDeleteType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyDeleteType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyDeleteType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyDeleteType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyDeleteType_Vectors.Vector);




   type TagCreateType is
     record
       Assets : .Models.TaggedAssetBaseType_Vectors.Vector;
       Drivers : .Models.TaggedDriverBaseType_Vectors.Vector;
       Machines : .Models.TaggedMachineBaseType_Vectors.Vector;
       Name : Swagger.UString;
       Parent_Tag_Id : Swagger.Long;
       Sensors : .Models.TaggedSensorBaseType_Vectors.Vector;
       Vehicles : .Models.TaggedVehicleBaseType_Vectors.Vector;
     end record;

   package TagCreateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TagCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagCreateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagCreateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagCreateType_Vectors.Vector);




   type TagUpdateType is
     record
       Assets : .Models.TaggedAssetBaseType_Vectors.Vector;
       Drivers : .Models.TaggedDriverBaseType_Vectors.Vector;
       Machines : .Models.TaggedMachineBaseType_Vectors.Vector;
       Name : Swagger.UString;
       Parent_Tag_Id : Swagger.Long;
       Sensors : .Models.TaggedSensorBaseType_Vectors.Vector;
       Vehicles : .Models.TaggedVehicleBaseType_Vectors.Vector;
     end record;

   package TagUpdateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TagUpdateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagUpdateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagUpdateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagUpdateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagUpdateType_Vectors.Vector);




   type TagModifyAddType is
     record
       Assets : .Models.TaggedAssetBaseType_Vectors.Vector;
       Sensors : .Models.TaggedSensorBaseType_Vectors.Vector;
       Vehicles : .Models.TaggedVehicleBaseType_Vectors.Vector;
       Machines : .Models.TaggedMachineBaseType_Vectors.Vector;
       Drivers : .Models.TaggedDriverBaseType_Vectors.Vector;
     end record;

   package TagModifyAddType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TagModifyAddType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyAddType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyAddType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyAddType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyAddType_Vectors.Vector);




   type TagModifyType is
     record
       Add : .Models.TagModifyAddType;
       Delete : .Models.TagModifyDeleteType;
       Name : Swagger.UString;
       Parent_Tag_Id : Swagger.Long;
     end record;

   package TagModifyType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TagModifyType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TagModifyType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TagModifyType_Vectors.Vector);




   type UserBaseType is
     record
       Auth_Type : Swagger.UString;
       Email : Swagger.UString;
       Name : Swagger.UString;
       Organization_Role_Id : Swagger.UString;
     end record;

   package UserBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => UserBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserBaseType_Vectors.Vector);




   type InlineObject3Type is
     record
       Group_Id : Swagger.Long;
     end record;

   package InlineObject3Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject3Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject3Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject3Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject3Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject3Type_Vectors.Vector);




   type InlineObject5Type is
     record
       End_Ms : Swagger.Long;
       Org_Id : Swagger.Long;
       Start_Ms : Swagger.Long;
     end record;

   package InlineObject5Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject5Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject5Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject5Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject5Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject5Type_Vectors.Vector);




   type InlineObject7Type is
     record
       Driver_Id : Swagger.Long;
       End_Ms : Integer;
       Group_Id : Swagger.Long;
       Start_Ms : Integer;
     end record;

   package InlineObject7Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject7Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject7Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject7Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject7Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject7Type_Vectors.Vector);




   type InlineObject9Type is
     record
       Group_Id : Swagger.Long;
     end record;

   package InlineObject9Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject9Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject9Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject9Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject9Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject9Type_Vectors.Vector);




   type InlineObject13Type is
     record
       Group_Id : Swagger.Long;
     end record;

   package InlineObject13Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject13Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject13Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject13Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject13Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject13Type_Vectors.Vector);




   type InlineObject16Type is
     record
       External_Ids : Swagger.UString_Map;
       Harsh_Accel_Setting : Integer;
       Name : Swagger.UString;
     end record;

   package InlineObject16Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject16Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject16Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject16Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject16Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject16Type_Vectors.Vector);




   type InlineObject17Type is
     record
       End_Ms : Integer;
       Group_Id : Swagger.Long;
       Start_Ms : Integer;
     end record;

   package InlineObject17Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject17Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject17Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject17Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject17Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject17Type_Vectors.Vector);




   type InlineObject20Type is
     record
       Group_Id : Swagger.Long;
       Sensors : Swagger.Long_Vectors.Vector;
     end record;

   package InlineObject20Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject20Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject20Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject20Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject20Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject20Type_Vectors.Vector);




   type InlineObject23Type is
     record
       Group_Id : Swagger.Long;
     end record;

   package InlineObject23Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject23Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject23Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject23Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject23Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject23Type_Vectors.Vector);




   type InlineObject24Type is
     record
       Group_Id : Swagger.Long;
       Sensors : Swagger.Long_Vectors.Vector;
     end record;

   package InlineObject24Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject24Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject24Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject24Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject24Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject24Type_Vectors.Vector);




   type AddressGeofenceCircleType is
     record
       Latitude : double;
       Radius_Meters : Swagger.Long;
       Longitude : double;
     end record;

   package AddressGeofenceCircleType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AddressGeofenceCircleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceCircleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceCircleType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceCircleType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceCircleType_Vectors.Vector);




   type AddressGeofenceType is
     record
       Circle : .Models.AddressGeofenceCircleType;
       Polygon : .Models.AddressGeofencePolygonType;
     end record;

   package AddressGeofenceType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AddressGeofenceType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressGeofenceType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressGeofenceType_Vectors.Vector);




   type AddressType is
     record
       Contacts : .Models.ContactType_Vectors.Vector;
       Formatted_Address : Swagger.UString;
       Geofence : .Models.AddressGeofenceType;
       Id : Swagger.Long;
       Name : Swagger.UString;
       Notes : Swagger.UString;
       Tags : .Models.TagMetadataType_Vectors.Vector;
     end record;

   package AddressType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AddressType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressType_Vectors.Vector);




   type AddressesAddressesType is
     record
       Notes : Swagger.UString;
       Formatted_Address : Swagger.UString;
       Geofence : .Models.AddressGeofenceType;
       Tag_Ids : Swagger.Long_Vectors.Vector;
       Name : Swagger.UString;
       Contact_Ids : Swagger.Long_Vectors.Vector;
     end record;

   package AddressesAddressesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AddressesAddressesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressesAddressesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AddressesAddressesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressesAddressesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AddressesAddressesType_Vectors.Vector);




   type InlineObjectType is
     record
       Addresses : .Models.AddressesAddressesType_Vectors.Vector;
     end record;

   package InlineObjectType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObjectType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObjectType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObjectType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObjectType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObjectType_Vectors.Vector);




   type InlineObject1Type is
     record
       Contact_Ids : Swagger.Long_Vectors.Vector;
       Formatted_Address : Swagger.UString;
       Geofence : .Models.AddressGeofenceType;
       Name : Swagger.UString;
       Notes : Swagger.UString;
       Tag_Ids : Swagger.Long_Vectors.Vector;
     end record;

   package InlineObject1Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineObject1Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject1Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineObject1Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject1Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineObject1Type_Vectors.Vector);




   type AssetReeferResponseReeferStatsFuelPercentageType is
     record
       Fuel_Percentage : Swagger.Long;
       Changed_At_Ms : Swagger.Long;
     end record;

   package AssetReeferResponseReeferStatsFuelPercentageType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsFuelPercentageType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsFuelPercentageType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsFuelPercentageType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsFuelPercentageType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsFuelPercentageType_Vectors.Vector);




   type AssetReeferResponseReeferStatsEngineHoursType is
     record
       Engine_Hours : Swagger.Long;
       Changed_At_Ms : Swagger.Long;
     end record;

   package AssetReeferResponseReeferStatsEngineHoursType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsEngineHoursType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsEngineHoursType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsEngineHoursType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsEngineHoursType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsEngineHoursType_Vectors.Vector);




   type AssetReeferResponseReeferStatsReturnAirTempType is
     record
       Temp_In_Milli_C : Swagger.Long;
       Changed_At_Ms : Swagger.Long;
     end record;

   package AssetReeferResponseReeferStatsReturnAirTempType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsReturnAirTempType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsReturnAirTempType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsReturnAirTempType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsReturnAirTempType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsReturnAirTempType_Vectors.Vector);




   type AssetReeferResponseReeferStatsType is
     record
       Fuel_Percentage : .Models.AssetReeferResponseReeferStatsFuelPercentageType_Vectors.Vector;
       Power_Status : .Models.AssetReeferResponseReeferStatsPowerStatusType_Vectors.Vector;
       Engine_Hours : .Models.AssetReeferResponseReeferStatsEngineHoursType_Vectors.Vector;
       Set_Point : .Models.AssetReeferResponseReeferStatsSetPointType_Vectors.Vector;
       Return_Air_Temp : .Models.AssetReeferResponseReeferStatsReturnAirTempType_Vectors.Vector;
       Alarms : .Models.AssetReeferResponseReeferStatsAlarms1Type_Vectors.Vector;
     end record;

   package AssetReeferResponseReeferStatsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseReeferStatsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseReeferStatsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseReeferStatsType_Vectors.Vector);




   type AssetReeferResponseType is
     record
       Asset_Type : Swagger.UString;
       Id : Integer;
       Name : Swagger.UString;
       Reefer_Stats : .Models.AssetReeferResponseReeferStatsType;
     end record;

   package AssetReeferResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AssetReeferResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AssetReeferResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AssetReeferResponseType_Vectors.Vector);




   type CargoResponseSensorsType is
     record
       Cargo_Empty : Boolean;
       Name : Swagger.UString;
       Id : Swagger.Long;
     end record;

   package CargoResponseSensorsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => CargoResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseSensorsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseSensorsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseSensorsType_Vectors.Vector);




   type CargoResponseType is
     record
       Group_Id : Swagger.Long;
       Sensors : .Models.CargoResponseSensorsType_Vectors.Vector;
     end record;

   package CargoResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => CargoResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CargoResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out CargoResponseType_Vectors.Vector);




   type DocumentFieldCreatePhotoValueType is
     record
       Url : Swagger.UString;
     end record;

   package DocumentFieldCreatePhotoValueType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentFieldCreatePhotoValueType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreatePhotoValueType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreatePhotoValueType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreatePhotoValueType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreatePhotoValueType_Vectors.Vector);




   type DocumentFieldCreateType is
     record
       Number_Value : double;
       Photo_Value : .Models.DocumentFieldCreatePhotoValueType_Vectors.Vector;
       String_Value : Swagger.UString;
       Value_Type : Swagger.UString;
     end record;

   package DocumentFieldCreateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentFieldCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldCreateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldCreateType_Vectors.Vector);




   type DoorResponseSensorsType is
     record
       Door_Closed : Boolean;
       Name : Swagger.UString;
       Id : Swagger.Long;
     end record;

   package DoorResponseSensorsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DoorResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseSensorsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseSensorsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseSensorsType_Vectors.Vector);




   type DoorResponseType is
     record
       Group_Id : Swagger.Long;
       Sensors : .Models.DoorResponseSensorsType_Vectors.Vector;
     end record;

   package DoorResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DoorResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DoorResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DoorResponseType_Vectors.Vector);




   type DriversSummaryResponseSummariesType is
     record
       Driver_Id : Swagger.Long;
       Distance_Miles : double;
       Drive_Ms : Swagger.Long;
       Active_Ms : Swagger.Long;
       Driver_Username : Swagger.UString;
       Group_Id : Swagger.Long;
       Driver_Name : Swagger.UString;
       On_Duty_Ms : Swagger.Long;
     end record;

   package DriversSummaryResponseSummariesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriversSummaryResponseSummariesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseSummariesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseSummariesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseSummariesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseSummariesType_Vectors.Vector);




   type DriversSummaryResponseType is
     record
       Summaries : .Models.DriversSummaryResponseSummariesType_Vectors.Vector;
     end record;

   package DriversSummaryResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriversSummaryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriversSummaryResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriversSummaryResponseType_Vectors.Vector);




   type DvirBaseMechanicOrAgentSignatureType is
     record
       Mechanic_User_Id : Swagger.Long;
       Driver_Id : Swagger.Long;
       Name : Swagger.UString;
       Signed_At : Swagger.Long;
       P_Type : Swagger.UString;
       Email : Swagger.UString;
       Username : Swagger.UString;
     end record;

   package DvirBaseMechanicOrAgentSignatureType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DvirBaseMechanicOrAgentSignatureType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseMechanicOrAgentSignatureType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseMechanicOrAgentSignatureType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseMechanicOrAgentSignatureType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseMechanicOrAgentSignatureType_Vectors.Vector);




   type DvirBaseTrailerDefectsType is
     record
       Comment : Swagger.UString;
       Defect_Type : Swagger.UString;
     end record;

   package DvirBaseTrailerDefectsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DvirBaseTrailerDefectsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseTrailerDefectsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseTrailerDefectsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseTrailerDefectsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseTrailerDefectsType_Vectors.Vector);




   type DvirBaseType is
     record
       Author_Signature : .Models.DvirBaseAuthorSignatureType;
       Defects_Corrected : Boolean;
       Defects_Need_Not_Be_Corrected : Boolean;
       Id : Swagger.Long;
       Inspection_Type : Swagger.UString;
       Mechanic_Notes : Swagger.UString;
       Mechanic_Or_Agent_Signature : .Models.DvirBaseMechanicOrAgentSignatureType;
       Next_Driver_Signature : .Models.DvirBaseNextDriverSignatureType;
       Odometer_Miles : Swagger.Long;
       Time_Ms : Swagger.Long;
       Trailer_Defects : .Models.DvirBaseTrailerDefectsType_Vectors.Vector;
       Trailer_Id : Integer;
       Trailer_Name : Swagger.UString;
       Vehicle : .Models.DvirBaseVehicleType;
       Vehicle_Condition : Swagger.UString;
       Vehicle_Defects : .Models.DvirBaseTrailerDefectsType_Vectors.Vector;
     end record;

   package DvirBaseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DvirBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirBaseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirBaseType_Vectors.Vector);




   type DvirListResponseType is
     record
       Dvirs : .Models.DvirBaseType_Vectors.Vector;
     end record;

   package DvirListResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DvirListResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirListResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DvirListResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirListResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DvirListResponseType_Vectors.Vector);




   type FleetVehicleResponseVehicleInfoType is
     record
       Year : Swagger.Long;
       Model : Swagger.UString;
       Vin : Swagger.UString;
       Make : Swagger.UString;
     end record;

   package FleetVehicleResponseVehicleInfoType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => FleetVehicleResponseVehicleInfoType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseVehicleInfoType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseVehicleInfoType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseVehicleInfoType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseVehicleInfoType_Vectors.Vector);




   type FleetVehicleResponseType is
     record
       External_Ids : Swagger.UString_Map;
       Harsh_Accel_Setting : Swagger.UString;
       Id : Swagger.Long;
       Name : Swagger.UString;
       Vehicle_Info : .Models.FleetVehicleResponseVehicleInfoType;
     end record;

   package FleetVehicleResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => FleetVehicleResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in FleetVehicleResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out FleetVehicleResponseType_Vectors.Vector);




   type HosLogsResponseLogsType is
     record
       Loc_Lng : double;
       Log_Start_Ms : Swagger.Long;
       Driver_Id : Swagger.Long;
       Status_Type : Swagger.UString;
       Loc_City : Swagger.UString;
       Group_Id : Swagger.Long;
       Loc_Name : Swagger.UString;
       Loc_Lat : double;
       Remark : Swagger.UString;
       Loc_State : Swagger.UString;
       Vehicle_Id : Swagger.Long;
       Codriver_Ids : Swagger.Long_Vectors.Vector;
     end record;

   package HosLogsResponseLogsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HosLogsResponseLogsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseLogsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseLogsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseLogsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseLogsType_Vectors.Vector);




   type HosLogsResponseType is
     record
       Logs : .Models.HosLogsResponseLogsType_Vectors.Vector;
     end record;

   package HosLogsResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HosLogsResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HosLogsResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HosLogsResponseType_Vectors.Vector);




   type HumidityResponseSensorsType is
     record
       Name : Swagger.UString;
       Humidity : Integer;
       Id : Swagger.Long;
     end record;

   package HumidityResponseSensorsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HumidityResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseSensorsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseSensorsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseSensorsType_Vectors.Vector);




   type HumidityResponseType is
     record
       Group_Id : Swagger.Long;
       Sensors : .Models.HumidityResponseSensorsType_Vectors.Vector;
     end record;

   package HumidityResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => HumidityResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in HumidityResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out HumidityResponseType_Vectors.Vector);




   type TemperatureResponseSensorsType is
     record
       Probe_Temperature : Integer;
       Name : Swagger.UString;
       Id : Swagger.Long;
       Ambient_Temperature : Integer;
     end record;

   package TemperatureResponseSensorsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TemperatureResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseSensorsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseSensorsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseSensorsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseSensorsType_Vectors.Vector);




   type TemperatureResponseType is
     record
       Group_Id : Swagger.Long;
       Sensors : .Models.TemperatureResponseSensorsType_Vectors.Vector;
     end record;

   package TemperatureResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TemperatureResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TemperatureResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TemperatureResponseType_Vectors.Vector);




   type TripResponseEndCoordinatesType is
     record
       Latitude : double;
       Longitude : double;
     end record;

   package TripResponseEndCoordinatesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TripResponseEndCoordinatesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseEndCoordinatesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseEndCoordinatesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseEndCoordinatesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseEndCoordinatesType_Vectors.Vector);




   type TripResponseTripsType is
     record
       End_Odometer : Integer;
       Distance_Meters : Integer;
       End_Ms : Integer;
       Start_Ms : Integer;
       Fuel_Consumed_Ml : Integer;
       Start_Address : Swagger.UString;
       Start_Coordinates : .Models.TripResponseStartCoordinatesType;
       End_Coordinates : .Models.TripResponseEndCoordinatesType;
       Start_Odometer : Integer;
       Driver_Id : Integer;
       Start_Location : Swagger.UString;
       Toll_Meters : Integer;
       End_Address : Swagger.UString;
       End_Location : Swagger.UString;
     end record;

   package TripResponseTripsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TripResponseTripsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseTripsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseTripsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseTripsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseTripsType_Vectors.Vector);




   type TripResponseType is
     record
       Trips : .Models.TripResponseTripsType_Vectors.Vector;
     end record;

   package TripResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => TripResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TripResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out TripResponseType_Vectors.Vector);




   type UserTagRoleTagType is
     record
       Parent_Tag_Id : Swagger.Long;
       Name : Swagger.UString;
       Id : Swagger.Long;
     end record;

   package UserTagRoleTagType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => UserTagRoleTagType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleTagType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleTagType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleTagType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleTagType_Vectors.Vector);




   type UserTagRoleType is
     record
       Role : Swagger.UString;
       Role_Id : Swagger.UString;
       Tag : .Models.UserTagRoleTagType;
     end record;

   package UserTagRoleType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => UserTagRoleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserTagRoleType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserTagRoleType_Vectors.Vector);




   type UserType is
     record
       Auth_Type : Swagger.UString;
       Email : Swagger.UString;
       Name : Swagger.UString;
       Organization_Role_Id : Swagger.UString;
       Id : Swagger.Long;
       Organization_Role : Swagger.UString;
       Tag_Roles : .Models.UserTagRoleType_Vectors.Vector;
     end record;

   package UserType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => UserType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in UserType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out UserType_Vectors.Vector);




   type VehicleMaintenanceJ1939CheckEngineLightType is
     record
       Protect_Is_On : Boolean;
       Stop_Is_On : Boolean;
       Warning_Is_On : Boolean;
       Emissions_Is_On : Boolean;
     end record;

   package VehicleMaintenanceJ1939CheckEngineLightType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleMaintenanceJ1939CheckEngineLightType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939CheckEngineLightType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939CheckEngineLightType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939CheckEngineLightType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939CheckEngineLightType_Vectors.Vector);




   type VehicleMaintenanceJ1939Type is
     record
       Check_Engine_Light : .Models.VehicleMaintenanceJ1939CheckEngineLightType;
       Diagnostic_Trouble_Codes : .Models.VehicleMaintenanceJ1939DiagnosticTroubleCodesType_Vectors.Vector;
     end record;

   package VehicleMaintenanceJ1939Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleMaintenanceJ1939Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceJ1939Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceJ1939Type_Vectors.Vector);




   type VehicleMaintenancePassengerDiagnosticTroubleCodesType is
     record
       Dtc_Short_Code : Swagger.UString;
       Dtc_Id : Integer;
       Dtc_Description : Swagger.UString;
     end record;

   package VehicleMaintenancePassengerDiagnosticTroubleCodesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleMaintenancePassengerDiagnosticTroubleCodesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerDiagnosticTroubleCodesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerDiagnosticTroubleCodesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerDiagnosticTroubleCodesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerDiagnosticTroubleCodesType_Vectors.Vector);




   type VehicleMaintenancePassengerType is
     record
       Check_Engine_Light : .Models.VehicleMaintenancePassengerCheckEngineLightType;
       Diagnostic_Trouble_Codes : .Models.VehicleMaintenancePassengerDiagnosticTroubleCodesType_Vectors.Vector;
     end record;

   package VehicleMaintenancePassengerType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleMaintenancePassengerType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenancePassengerType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenancePassengerType_Vectors.Vector);




   type VehicleMaintenanceType is
     record
       Id : Swagger.Long;
       J1939 : .Models.VehicleMaintenanceJ1939Type;
       Passenger : .Models.VehicleMaintenancePassengerType;
     end record;

   package VehicleMaintenanceType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => VehicleMaintenanceType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in VehicleMaintenanceType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out VehicleMaintenanceType_Vectors.Vector);




   type InlineResponse2004Type is
     record
       Vehicles : .Models.VehicleMaintenanceType_Vectors.Vector;
     end record;

   package InlineResponse2004Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2004Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2004Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2004Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2004Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2004Type_Vectors.Vector);




   type AuxInputType is
     record
       Time_Ms : Swagger.Object;
       Value : Boolean;
     end record;

   package AuxInputType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AuxInputType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputType_Vectors.Vector);




   type AuxInputSeriesType is
     record
       Name : Swagger.UString;
       Values : .Models.AuxInputType_Vectors.Vector;
     end record;

   package AuxInputSeriesType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => AuxInputSeriesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputSeriesType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in AuxInputSeriesType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputSeriesType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out AuxInputSeriesType_Vectors.Vector);




   type DocumentType is
     record
       Dispatch_Job_Id : Swagger.Long;
       Notes : Swagger.UString;
       Document_Type : Swagger.UString;
       Driver_Created_At_Ms : Swagger.Long;
       Driver_Id : Swagger.Long;
       Fields : .Models.DocumentFieldType_Vectors.Vector;
       Vehicle_Id : Swagger.Long;
     end record;

   package DocumentType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentType_Vectors.Vector);




   type DocumentCreateType is
     record
       Dispatch_Job_Id : Swagger.Long;
       Notes : Swagger.UString;
       Document_Type_Uuid : Swagger.UString;
       Fields : .Models.DocumentFieldType_Vectors.Vector;
     end record;

   package DocumentCreateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentCreateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentCreateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentCreateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentCreateType_Vectors.Vector);




   type DocumentFieldType is
     record
       Number_Value : double;
       Photo_Value : .Models.DocumentFieldCreatePhotoValueType_Vectors.Vector;
       String_Value : Swagger.UString;
       Value_Type : Swagger.UString;
       Label : Swagger.UString;
       Value : Swagger.Object;
     end record;

   package DocumentFieldType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DocumentFieldType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DocumentFieldType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DocumentFieldType_Vectors.Vector);




   type DriverDailyLogResponseType is
     record
       Days : .Models.DriverDailyLogResponseDaysType_Vectors.Vector;
     end record;

   package DriverDailyLogResponseType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriverDailyLogResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseType_Vectors.Vector);




   type EngineStateType is
     record
       Time_Ms : Swagger.Object;
       Value : Swagger.UString;
     end record;

   package EngineStateType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => EngineStateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in EngineStateType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in EngineStateType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out EngineStateType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out EngineStateType_Vectors.Vector);




   type InlineResponse2005VehicleStatsType is
     record
       Engine_State : .Models.EngineStateType_Vectors.Vector;
       Aux_Input2 : .Models.AuxInputSeriesType;
       Vehicle_Id : Swagger.Long;
       Aux_Input1 : .Models.AuxInputSeriesType;
     end record;

   package InlineResponse2005VehicleStatsType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2005VehicleStatsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005VehicleStatsType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005VehicleStatsType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005VehicleStatsType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005VehicleStatsType_Vectors.Vector);




   type InlineResponse2005Type is
     record
       Pagination : .Models.PaginationType;
       Vehicle_Stats : .Models.InlineResponse2005VehicleStatsType_Vectors.Vector;
     end record;

   package InlineResponse2005Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => InlineResponse2005Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in InlineResponse2005Type_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005Type);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out InlineResponse2005Type_Vectors.Vector);




   type DriverDailyLogResponseDaysType is
     record
       Certified_At_Ms : Swagger.Long;
       End_Ms : Integer;
       Start_Ms : Integer;
       Trailer_Ids : Swagger.Object;
       Active_Hours : double;
       Distance_Miles : double;
       Active_Ms : Swagger.Long;
       Certified : Boolean;
       Vehicle_Ids : Swagger.Object;
     end record;

   package DriverDailyLogResponseDaysType_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => DriverDailyLogResponseDaysType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseDaysType);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in DriverDailyLogResponseDaysType_Vectors.Vector);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseDaysType);

   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out DriverDailyLogResponseDaysType_Vectors.Vector);



end .Models;
