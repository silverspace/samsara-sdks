/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import Address from './model/Address';
import AddressGeofence from './model/AddressGeofence';
import AddressGeofenceCircle from './model/AddressGeofenceCircle';
import AddressGeofencePolygon from './model/AddressGeofencePolygon';
import AddressGeofencePolygonVertices from './model/AddressGeofencePolygonVertices';
import AddressesAddresses from './model/AddressesAddresses';
import AllRouteJobUpdates from './model/AllRouteJobUpdates';
import Asset from './model/Asset';
import AssetCable from './model/AssetCable';
import AssetCurrentLocation from './model/AssetCurrentLocation';
import AssetCurrentLocationsResponse from './model/AssetCurrentLocationsResponse';
import AssetReeferResponse from './model/AssetReeferResponse';
import AssetReeferResponseReeferStats from './model/AssetReeferResponseReeferStats';
import AssetReeferResponseReeferStatsAlarms from './model/AssetReeferResponseReeferStatsAlarms';
import AssetReeferResponseReeferStatsAlarms1 from './model/AssetReeferResponseReeferStatsAlarms1';
import AssetReeferResponseReeferStatsEngineHours from './model/AssetReeferResponseReeferStatsEngineHours';
import AssetReeferResponseReeferStatsFuelPercentage from './model/AssetReeferResponseReeferStatsFuelPercentage';
import AssetReeferResponseReeferStatsPowerStatus from './model/AssetReeferResponseReeferStatsPowerStatus';
import AssetReeferResponseReeferStatsReturnAirTemp from './model/AssetReeferResponseReeferStatsReturnAirTemp';
import AssetReeferResponseReeferStatsSetPoint from './model/AssetReeferResponseReeferStatsSetPoint';
import AuxInput from './model/AuxInput';
import AuxInputSeries from './model/AuxInputSeries';
import CargoResponse from './model/CargoResponse';
import CargoResponseSensors from './model/CargoResponseSensors';
import Contact from './model/Contact';
import CurrentDriver from './model/CurrentDriver';
import DataInputHistoryResponse from './model/DataInputHistoryResponse';
import DataInputHistoryResponsePoints from './model/DataInputHistoryResponsePoints';
import DispatchJob from './model/DispatchJob';
import DispatchJobCreate from './model/DispatchJobCreate';
import DispatchRoute from './model/DispatchRoute';
import DispatchRouteBase from './model/DispatchRouteBase';
import DispatchRouteCreate from './model/DispatchRouteCreate';
import DispatchRouteHistoricalEntry from './model/DispatchRouteHistoricalEntry';
import DispatchRouteHistory from './model/DispatchRouteHistory';
import Document from './model/Document';
import DocumentBase from './model/DocumentBase';
import DocumentCreate from './model/DocumentCreate';
import DocumentField from './model/DocumentField';
import DocumentFieldCreate from './model/DocumentFieldCreate';
import DocumentFieldCreatePhotoValue from './model/DocumentFieldCreatePhotoValue';
import DocumentFieldType from './model/DocumentFieldType';
import DocumentFieldTypeNumberValueTypeMetadata from './model/DocumentFieldTypeNumberValueTypeMetadata';
import DocumentType from './model/DocumentType';
import DoorResponse from './model/DoorResponse';
import DoorResponseSensors from './model/DoorResponseSensors';
import Driver from './model/Driver';
import DriverBase from './model/DriverBase';
import DriverDailyLogResponse from './model/DriverDailyLogResponse';
import DriverDailyLogResponseDays from './model/DriverDailyLogResponseDays';
import DriverForCreate from './model/DriverForCreate';
import DriverSafetyScoreResponse from './model/DriverSafetyScoreResponse';
import DriversResponse from './model/DriversResponse';
import DriversSummaryResponse from './model/DriversSummaryResponse';
import DriversSummaryResponseSummaries from './model/DriversSummaryResponseSummaries';
import DvirBase from './model/DvirBase';
import DvirBaseAuthorSignature from './model/DvirBaseAuthorSignature';
import DvirBaseMechanicOrAgentSignature from './model/DvirBaseMechanicOrAgentSignature';
import DvirBaseNextDriverSignature from './model/DvirBaseNextDriverSignature';
import DvirBaseTrailerDefects from './model/DvirBaseTrailerDefects';
import DvirBaseVehicle from './model/DvirBaseVehicle';
import DvirListResponse from './model/DvirListResponse';
import EngineState from './model/EngineState';
import FleetVehicleLocation from './model/FleetVehicleLocation';
import FleetVehicleResponse from './model/FleetVehicleResponse';
import FleetVehicleResponseVehicleInfo from './model/FleetVehicleResponseVehicleInfo';
import HosAuthenticationLogsResponse from './model/HosAuthenticationLogsResponse';
import HosAuthenticationLogsResponseAuthenticationLogs from './model/HosAuthenticationLogsResponseAuthenticationLogs';
import HosLogsResponse from './model/HosLogsResponse';
import HosLogsResponseLogs from './model/HosLogsResponseLogs';
import HosLogsSummaryResponse from './model/HosLogsSummaryResponse';
import HosLogsSummaryResponseDrivers from './model/HosLogsSummaryResponseDrivers';
import HumidityResponse from './model/HumidityResponse';
import HumidityResponseSensors from './model/HumidityResponseSensors';
import InlineObject from './model/InlineObject';
import InlineObject1 from './model/InlineObject1';
import InlineObject10 from './model/InlineObject10';
import InlineObject11 from './model/InlineObject11';
import InlineObject12 from './model/InlineObject12';
import InlineObject13 from './model/InlineObject13';
import InlineObject14 from './model/InlineObject14';
import InlineObject15 from './model/InlineObject15';
import InlineObject16 from './model/InlineObject16';
import InlineObject17 from './model/InlineObject17';
import InlineObject18 from './model/InlineObject18';
import InlineObject19 from './model/InlineObject19';
import InlineObject2 from './model/InlineObject2';
import InlineObject20 from './model/InlineObject20';
import InlineObject21 from './model/InlineObject21';
import InlineObject22 from './model/InlineObject22';
import InlineObject23 from './model/InlineObject23';
import InlineObject24 from './model/InlineObject24';
import InlineObject3 from './model/InlineObject3';
import InlineObject4 from './model/InlineObject4';
import InlineObject5 from './model/InlineObject5';
import InlineObject6 from './model/InlineObject6';
import InlineObject7 from './model/InlineObject7';
import InlineObject8 from './model/InlineObject8';
import InlineObject9 from './model/InlineObject9';
import InlineResponse200 from './model/InlineResponse200';
import InlineResponse2001 from './model/InlineResponse2001';
import InlineResponse2002 from './model/InlineResponse2002';
import InlineResponse2003 from './model/InlineResponse2003';
import InlineResponse2004 from './model/InlineResponse2004';
import InlineResponse2005 from './model/InlineResponse2005';
import InlineResponse2005VehicleStats from './model/InlineResponse2005VehicleStats';
import InlineResponse2006 from './model/InlineResponse2006';
import InlineResponse2007 from './model/InlineResponse2007';
import InlineResponse2008 from './model/InlineResponse2008';
import InlineResponse2009 from './model/InlineResponse2009';
import JobStatus from './model/JobStatus';
import JobUpdateObject from './model/JobUpdateObject';
import Machine from './model/Machine';
import MachineHistoryResponse from './model/MachineHistoryResponse';
import MachineHistoryResponseMachines from './model/MachineHistoryResponseMachines';
import MachineHistoryResponseVibrations from './model/MachineHistoryResponseVibrations';
import Pagination from './model/Pagination';
import PrevJobStatus from './model/PrevJobStatus';
import SafetyReportHarshEvent from './model/SafetyReportHarshEvent';
import Sensor from './model/Sensor';
import SensorHistoryResponse from './model/SensorHistoryResponse';
import SensorHistoryResponseResults from './model/SensorHistoryResponseResults';
import SensorsHistorySeries from './model/SensorsHistorySeries';
import Tag from './model/Tag';
import TagCreate from './model/TagCreate';
import TagMetadata from './model/TagMetadata';
import TagModify from './model/TagModify';
import TagModifyAdd from './model/TagModifyAdd';
import TagModifyDelete from './model/TagModifyDelete';
import TagUpdate from './model/TagUpdate';
import TaggedAddress from './model/TaggedAddress';
import TaggedAddressBase from './model/TaggedAddressBase';
import TaggedAsset from './model/TaggedAsset';
import TaggedAssetBase from './model/TaggedAssetBase';
import TaggedDriver from './model/TaggedDriver';
import TaggedDriverBase from './model/TaggedDriverBase';
import TaggedMachine from './model/TaggedMachine';
import TaggedMachineBase from './model/TaggedMachineBase';
import TaggedSensor from './model/TaggedSensor';
import TaggedSensorBase from './model/TaggedSensorBase';
import TaggedVehicle from './model/TaggedVehicle';
import TaggedVehicleBase from './model/TaggedVehicleBase';
import TemperatureResponse from './model/TemperatureResponse';
import TemperatureResponseSensors from './model/TemperatureResponseSensors';
import TripResponse from './model/TripResponse';
import TripResponseEndCoordinates from './model/TripResponseEndCoordinates';
import TripResponseStartCoordinates from './model/TripResponseStartCoordinates';
import TripResponseTrips from './model/TripResponseTrips';
import User from './model/User';
import UserBase from './model/UserBase';
import UserRole from './model/UserRole';
import UserTagRole from './model/UserTagRole';
import UserTagRoleTag from './model/UserTagRoleTag';
import Vehicle from './model/Vehicle';
import VehicleHarshEventResponse from './model/VehicleHarshEventResponse';
import VehicleHarshEventResponseLocation from './model/VehicleHarshEventResponseLocation';
import VehicleLocation from './model/VehicleLocation';
import VehicleMaintenance from './model/VehicleMaintenance';
import VehicleMaintenanceJ1939 from './model/VehicleMaintenanceJ1939';
import VehicleMaintenanceJ1939CheckEngineLight from './model/VehicleMaintenanceJ1939CheckEngineLight';
import VehicleMaintenanceJ1939DiagnosticTroubleCodes from './model/VehicleMaintenanceJ1939DiagnosticTroubleCodes';
import VehicleMaintenancePassenger from './model/VehicleMaintenancePassenger';
import VehicleMaintenancePassengerCheckEngineLight from './model/VehicleMaintenancePassengerCheckEngineLight';
import VehicleMaintenancePassengerDiagnosticTroubleCodes from './model/VehicleMaintenancePassengerDiagnosticTroubleCodes';
import VehicleSafetyScoreResponse from './model/VehicleSafetyScoreResponse';
import AssetsApi from './api/AssetsApi';
import DriversApi from './api/DriversApi';
import FleetApi from './api/FleetApi';
import IndustrialApi from './api/IndustrialApi';
import RoutesApi from './api/RoutesApi';
import SafetyApi from './api/SafetyApi';
import SensorsApi from './api/SensorsApi';
import TagsApi from './api/TagsApi';
import UsersApi from './api/UsersApi';


/**
* _IntroductionSamsara_provides_API_endpoints_for_interacting_with_Samsara_Cloud_so_that_you_can_build_powerful_applications_and_custom_solutions_with_sensor_data__Samsara_has_endpoints_available_to_track_and_analyze_sensors_vehicles_and_entire_fleets_The_Samsara_Cloud_API_is_a__RESTful_API_httpsen_wikipedia_orgwikiRepresentational_state_transfer_accessed_by_an__HTTP_httpsen_wikipedia_orgwikiHypertext_Transfer_Protocol_client_such_as_wget_or_curl_or_HTTP_libraries_of_most_modern_programming_languages_including_python_ruby_java__We_use_built_in_HTTP_features_like_HTTP_authentication_and_HTTP_verbs_which_are_understood_by_off_the_shelf_HTTP_clients__We_allow_you_to_interact_securely_with_our_API_from_a_client_side_web_application__though_you_should_never_expose_your_secret_API_key___JSON_httpwww_json_org_is_returned_by_all_API_responses_including_errors__If_youre_familiar_with_what_you_can_build_with_a_REST_API_the_following_API_reference_guide_will_be_your_go_to_resource_API_access_to_the_Samsara_cloud_is_available_to_all_Samsara_administrators__To_start_developing_with_Samsara_APIs_you_will_need_to__obtain_your_API_keys_sectionAuthentication_to_authenticate_your_API_requests_If_you_have_any_questions_you_can_reach_out_to_us_on__supportsamsara_com_mailtosupportsamsara_com_EndpointsAll_our_APIs_can_be_accessed_through_HTTP_requests_to_URLs_likecurlhttpsapi_samsara_comversionendpointAll_our_APIs_are__versioned_sectionVersioning__If_we_intend_to_make_breaking_changes_to_an_API_which_either_changes_the_response_format_or_request_parameter_we_will_increment_the_version__AuthenticationTo_authenticate_your_API_request_you_will_need_to_include_your_secret_token__You_can_manage_your_API_tokens_in_the__Dashboard_httpscloud_samsara_com__They_are_visible_under_Settings_Organization_API_Tokens_Your_API_tokens_carry_many_privileges_so_be_sure_to_keep_them_secure__Do_not_share_your_secret_API_tokens_in_publicly_accessible_areas_such_as_GitHub_client_side_code_and_so_on_Authentication_to_the_API_is_performed_via__HTTP_Basic_Auth_httpsen_wikipedia_orgwikiBasic_access_authentication__Provide_your_API_token_as_the_basic_access_token_value_in_the_URL__You_do_not_need_to_provide_a_password_curlhttpsapi_samsara_comversionendpointaccess_tokenaccess_tokenAll_API_requests_must_be_made_over__HTTPS_httpsen_wikipedia_orgwikiHTTPS__Calls_made_over_plain_HTTP_or_without_authentication_will_fail__Request_MethodsOur_API_endpoints_use__HTTP_request_methods_httpsen_wikipedia_orgwikiHypertext_Transfer_ProtocolRequest_methods_to_specify_the_desired_operation_to_be_performed__The_documentation_below_specified_request_method_supported_by_each_endpoint_and_the_resulting_action__GETGET_requests_are_typically_used_for_fetching_data__like_data_for_a_particular_driver__POSTPOST_requests_are_typically_used_for_creating_or_updating_a_record__like_adding_new_tags_to_the_system__With_that_being_said_a_few_of_our_POST_requests_can_be_used_for_fetching_data__like_current_location_data_of_your_fleet__PUTPUT_requests_are_typically_used_for_updating_an_existing_record__like_updating_all_devices_associated_with_a_particular_tag__PATCHPATCH_requests_are_typically_used_for_modifying_an_existing_record__like_modifying_a_few_devices_associated_with_a_particular_tag__DELETEDELETE_requests_are_used_for_deleting_a_record__like_deleting_a_tag_from_the_system__Response_CodesAll_API_requests_will_respond_with_appropriate__HTTP_status_code_httpsen_wikipedia_orgwikiList_of_HTTP_status_codes__Your_API_client_should_handle_each_response_class_differently__2XXThese_are_successful_responses_and_indicate_that_the_API_request_returned_the_expected_response__4XXThese_indicate_that_there_was_a_problem_with_the_request_like_a_missing_parameter_or_invalid_values__Check_the_response_for_specific__error_details_sectionError_Responses__Requests_that_respond_with_a_4XX_status_code_should_be_modified_before_retrying__5XXThese_indicate_server_errors_when_the_server_is_unreachable_or_is_misconfigured__In_this_case_you_should_retry_the_API_request_after_some_delay__Error_ResponsesIn_case_of_a_4XX_status_code_the_body_of_the_response_will_contain_information_to_briefly_explain_the_error_reported__To_help_debugging_the_error_you_can_refer_to_the_following_table_for_understanding_the_error_message___Status_Code___Message___Description________________________________________________________________________________________________________401___Invalid_token___The_API_token_is_invalid_and_could_not_be_authenticated__Please_refer_to_the__authentication_section_sectionAuthentication_____404___Page_not_found___The_API_endpoint_being_accessed_is_invalid_____400___Bad_request___Default_response_for_an_invalid_request__Please_check_the_request_to_make_sure_it_follows_the_format_specified_in_the_documentation____VersioningAll_our_APIs_are_versioned__Our_current_API_version_is_v1_and_we_are_continuously_working_on_improving_it_further_and_provide_additional_endpoints__If_we_intend_to_make_breaking_changes_to_an_API_which_either_changes_the_response_format_or_request_parameter_we_will_increment_the_version__Thus_you_can_use_our_current_API_version_worry_free__FAQsCheck_out_our__responses_to_FAQs_here_httpskb_samsara_comhcen_ussections360000538054_APIs__Dont_see_an_answer_to_your_question_Reach_out_to_us_on__supportsamsara_com_mailtosupportsamsara_com_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var SamsaraApi = require('index'); // See note below*.
* var xxxSvc = new SamsaraApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new SamsaraApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new SamsaraApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new SamsaraApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Address model constructor.
     * @property {module:model/Address}
     */
    Address,

    /**
     * The AddressGeofence model constructor.
     * @property {module:model/AddressGeofence}
     */
    AddressGeofence,

    /**
     * The AddressGeofenceCircle model constructor.
     * @property {module:model/AddressGeofenceCircle}
     */
    AddressGeofenceCircle,

    /**
     * The AddressGeofencePolygon model constructor.
     * @property {module:model/AddressGeofencePolygon}
     */
    AddressGeofencePolygon,

    /**
     * The AddressGeofencePolygonVertices model constructor.
     * @property {module:model/AddressGeofencePolygonVertices}
     */
    AddressGeofencePolygonVertices,

    /**
     * The AddressesAddresses model constructor.
     * @property {module:model/AddressesAddresses}
     */
    AddressesAddresses,

    /**
     * The AllRouteJobUpdates model constructor.
     * @property {module:model/AllRouteJobUpdates}
     */
    AllRouteJobUpdates,

    /**
     * The Asset model constructor.
     * @property {module:model/Asset}
     */
    Asset,

    /**
     * The AssetCable model constructor.
     * @property {module:model/AssetCable}
     */
    AssetCable,

    /**
     * The AssetCurrentLocation model constructor.
     * @property {module:model/AssetCurrentLocation}
     */
    AssetCurrentLocation,

    /**
     * The AssetCurrentLocationsResponse model constructor.
     * @property {module:model/AssetCurrentLocationsResponse}
     */
    AssetCurrentLocationsResponse,

    /**
     * The AssetReeferResponse model constructor.
     * @property {module:model/AssetReeferResponse}
     */
    AssetReeferResponse,

    /**
     * The AssetReeferResponseReeferStats model constructor.
     * @property {module:model/AssetReeferResponseReeferStats}
     */
    AssetReeferResponseReeferStats,

    /**
     * The AssetReeferResponseReeferStatsAlarms model constructor.
     * @property {module:model/AssetReeferResponseReeferStatsAlarms}
     */
    AssetReeferResponseReeferStatsAlarms,

    /**
     * The AssetReeferResponseReeferStatsAlarms1 model constructor.
     * @property {module:model/AssetReeferResponseReeferStatsAlarms1}
     */
    AssetReeferResponseReeferStatsAlarms1,

    /**
     * The AssetReeferResponseReeferStatsEngineHours model constructor.
     * @property {module:model/AssetReeferResponseReeferStatsEngineHours}
     */
    AssetReeferResponseReeferStatsEngineHours,

    /**
     * The AssetReeferResponseReeferStatsFuelPercentage model constructor.
     * @property {module:model/AssetReeferResponseReeferStatsFuelPercentage}
     */
    AssetReeferResponseReeferStatsFuelPercentage,

    /**
     * The AssetReeferResponseReeferStatsPowerStatus model constructor.
     * @property {module:model/AssetReeferResponseReeferStatsPowerStatus}
     */
    AssetReeferResponseReeferStatsPowerStatus,

    /**
     * The AssetReeferResponseReeferStatsReturnAirTemp model constructor.
     * @property {module:model/AssetReeferResponseReeferStatsReturnAirTemp}
     */
    AssetReeferResponseReeferStatsReturnAirTemp,

    /**
     * The AssetReeferResponseReeferStatsSetPoint model constructor.
     * @property {module:model/AssetReeferResponseReeferStatsSetPoint}
     */
    AssetReeferResponseReeferStatsSetPoint,

    /**
     * The AuxInput model constructor.
     * @property {module:model/AuxInput}
     */
    AuxInput,

    /**
     * The AuxInputSeries model constructor.
     * @property {module:model/AuxInputSeries}
     */
    AuxInputSeries,

    /**
     * The CargoResponse model constructor.
     * @property {module:model/CargoResponse}
     */
    CargoResponse,

    /**
     * The CargoResponseSensors model constructor.
     * @property {module:model/CargoResponseSensors}
     */
    CargoResponseSensors,

    /**
     * The Contact model constructor.
     * @property {module:model/Contact}
     */
    Contact,

    /**
     * The CurrentDriver model constructor.
     * @property {module:model/CurrentDriver}
     */
    CurrentDriver,

    /**
     * The DataInputHistoryResponse model constructor.
     * @property {module:model/DataInputHistoryResponse}
     */
    DataInputHistoryResponse,

    /**
     * The DataInputHistoryResponsePoints model constructor.
     * @property {module:model/DataInputHistoryResponsePoints}
     */
    DataInputHistoryResponsePoints,

    /**
     * The DispatchJob model constructor.
     * @property {module:model/DispatchJob}
     */
    DispatchJob,

    /**
     * The DispatchJobCreate model constructor.
     * @property {module:model/DispatchJobCreate}
     */
    DispatchJobCreate,

    /**
     * The DispatchRoute model constructor.
     * @property {module:model/DispatchRoute}
     */
    DispatchRoute,

    /**
     * The DispatchRouteBase model constructor.
     * @property {module:model/DispatchRouteBase}
     */
    DispatchRouteBase,

    /**
     * The DispatchRouteCreate model constructor.
     * @property {module:model/DispatchRouteCreate}
     */
    DispatchRouteCreate,

    /**
     * The DispatchRouteHistoricalEntry model constructor.
     * @property {module:model/DispatchRouteHistoricalEntry}
     */
    DispatchRouteHistoricalEntry,

    /**
     * The DispatchRouteHistory model constructor.
     * @property {module:model/DispatchRouteHistory}
     */
    DispatchRouteHistory,

    /**
     * The Document model constructor.
     * @property {module:model/Document}
     */
    Document,

    /**
     * The DocumentBase model constructor.
     * @property {module:model/DocumentBase}
     */
    DocumentBase,

    /**
     * The DocumentCreate model constructor.
     * @property {module:model/DocumentCreate}
     */
    DocumentCreate,

    /**
     * The DocumentField model constructor.
     * @property {module:model/DocumentField}
     */
    DocumentField,

    /**
     * The DocumentFieldCreate model constructor.
     * @property {module:model/DocumentFieldCreate}
     */
    DocumentFieldCreate,

    /**
     * The DocumentFieldCreatePhotoValue model constructor.
     * @property {module:model/DocumentFieldCreatePhotoValue}
     */
    DocumentFieldCreatePhotoValue,

    /**
     * The DocumentFieldType model constructor.
     * @property {module:model/DocumentFieldType}
     */
    DocumentFieldType,

    /**
     * The DocumentFieldTypeNumberValueTypeMetadata model constructor.
     * @property {module:model/DocumentFieldTypeNumberValueTypeMetadata}
     */
    DocumentFieldTypeNumberValueTypeMetadata,

    /**
     * The DocumentType model constructor.
     * @property {module:model/DocumentType}
     */
    DocumentType,

    /**
     * The DoorResponse model constructor.
     * @property {module:model/DoorResponse}
     */
    DoorResponse,

    /**
     * The DoorResponseSensors model constructor.
     * @property {module:model/DoorResponseSensors}
     */
    DoorResponseSensors,

    /**
     * The Driver model constructor.
     * @property {module:model/Driver}
     */
    Driver,

    /**
     * The DriverBase model constructor.
     * @property {module:model/DriverBase}
     */
    DriverBase,

    /**
     * The DriverDailyLogResponse model constructor.
     * @property {module:model/DriverDailyLogResponse}
     */
    DriverDailyLogResponse,

    /**
     * The DriverDailyLogResponseDays model constructor.
     * @property {module:model/DriverDailyLogResponseDays}
     */
    DriverDailyLogResponseDays,

    /**
     * The DriverForCreate model constructor.
     * @property {module:model/DriverForCreate}
     */
    DriverForCreate,

    /**
     * The DriverSafetyScoreResponse model constructor.
     * @property {module:model/DriverSafetyScoreResponse}
     */
    DriverSafetyScoreResponse,

    /**
     * The DriversResponse model constructor.
     * @property {module:model/DriversResponse}
     */
    DriversResponse,

    /**
     * The DriversSummaryResponse model constructor.
     * @property {module:model/DriversSummaryResponse}
     */
    DriversSummaryResponse,

    /**
     * The DriversSummaryResponseSummaries model constructor.
     * @property {module:model/DriversSummaryResponseSummaries}
     */
    DriversSummaryResponseSummaries,

    /**
     * The DvirBase model constructor.
     * @property {module:model/DvirBase}
     */
    DvirBase,

    /**
     * The DvirBaseAuthorSignature model constructor.
     * @property {module:model/DvirBaseAuthorSignature}
     */
    DvirBaseAuthorSignature,

    /**
     * The DvirBaseMechanicOrAgentSignature model constructor.
     * @property {module:model/DvirBaseMechanicOrAgentSignature}
     */
    DvirBaseMechanicOrAgentSignature,

    /**
     * The DvirBaseNextDriverSignature model constructor.
     * @property {module:model/DvirBaseNextDriverSignature}
     */
    DvirBaseNextDriverSignature,

    /**
     * The DvirBaseTrailerDefects model constructor.
     * @property {module:model/DvirBaseTrailerDefects}
     */
    DvirBaseTrailerDefects,

    /**
     * The DvirBaseVehicle model constructor.
     * @property {module:model/DvirBaseVehicle}
     */
    DvirBaseVehicle,

    /**
     * The DvirListResponse model constructor.
     * @property {module:model/DvirListResponse}
     */
    DvirListResponse,

    /**
     * The EngineState model constructor.
     * @property {module:model/EngineState}
     */
    EngineState,

    /**
     * The FleetVehicleLocation model constructor.
     * @property {module:model/FleetVehicleLocation}
     */
    FleetVehicleLocation,

    /**
     * The FleetVehicleResponse model constructor.
     * @property {module:model/FleetVehicleResponse}
     */
    FleetVehicleResponse,

    /**
     * The FleetVehicleResponseVehicleInfo model constructor.
     * @property {module:model/FleetVehicleResponseVehicleInfo}
     */
    FleetVehicleResponseVehicleInfo,

    /**
     * The HosAuthenticationLogsResponse model constructor.
     * @property {module:model/HosAuthenticationLogsResponse}
     */
    HosAuthenticationLogsResponse,

    /**
     * The HosAuthenticationLogsResponseAuthenticationLogs model constructor.
     * @property {module:model/HosAuthenticationLogsResponseAuthenticationLogs}
     */
    HosAuthenticationLogsResponseAuthenticationLogs,

    /**
     * The HosLogsResponse model constructor.
     * @property {module:model/HosLogsResponse}
     */
    HosLogsResponse,

    /**
     * The HosLogsResponseLogs model constructor.
     * @property {module:model/HosLogsResponseLogs}
     */
    HosLogsResponseLogs,

    /**
     * The HosLogsSummaryResponse model constructor.
     * @property {module:model/HosLogsSummaryResponse}
     */
    HosLogsSummaryResponse,

    /**
     * The HosLogsSummaryResponseDrivers model constructor.
     * @property {module:model/HosLogsSummaryResponseDrivers}
     */
    HosLogsSummaryResponseDrivers,

    /**
     * The HumidityResponse model constructor.
     * @property {module:model/HumidityResponse}
     */
    HumidityResponse,

    /**
     * The HumidityResponseSensors model constructor.
     * @property {module:model/HumidityResponseSensors}
     */
    HumidityResponseSensors,

    /**
     * The InlineObject model constructor.
     * @property {module:model/InlineObject}
     */
    InlineObject,

    /**
     * The InlineObject1 model constructor.
     * @property {module:model/InlineObject1}
     */
    InlineObject1,

    /**
     * The InlineObject10 model constructor.
     * @property {module:model/InlineObject10}
     */
    InlineObject10,

    /**
     * The InlineObject11 model constructor.
     * @property {module:model/InlineObject11}
     */
    InlineObject11,

    /**
     * The InlineObject12 model constructor.
     * @property {module:model/InlineObject12}
     */
    InlineObject12,

    /**
     * The InlineObject13 model constructor.
     * @property {module:model/InlineObject13}
     */
    InlineObject13,

    /**
     * The InlineObject14 model constructor.
     * @property {module:model/InlineObject14}
     */
    InlineObject14,

    /**
     * The InlineObject15 model constructor.
     * @property {module:model/InlineObject15}
     */
    InlineObject15,

    /**
     * The InlineObject16 model constructor.
     * @property {module:model/InlineObject16}
     */
    InlineObject16,

    /**
     * The InlineObject17 model constructor.
     * @property {module:model/InlineObject17}
     */
    InlineObject17,

    /**
     * The InlineObject18 model constructor.
     * @property {module:model/InlineObject18}
     */
    InlineObject18,

    /**
     * The InlineObject19 model constructor.
     * @property {module:model/InlineObject19}
     */
    InlineObject19,

    /**
     * The InlineObject2 model constructor.
     * @property {module:model/InlineObject2}
     */
    InlineObject2,

    /**
     * The InlineObject20 model constructor.
     * @property {module:model/InlineObject20}
     */
    InlineObject20,

    /**
     * The InlineObject21 model constructor.
     * @property {module:model/InlineObject21}
     */
    InlineObject21,

    /**
     * The InlineObject22 model constructor.
     * @property {module:model/InlineObject22}
     */
    InlineObject22,

    /**
     * The InlineObject23 model constructor.
     * @property {module:model/InlineObject23}
     */
    InlineObject23,

    /**
     * The InlineObject24 model constructor.
     * @property {module:model/InlineObject24}
     */
    InlineObject24,

    /**
     * The InlineObject3 model constructor.
     * @property {module:model/InlineObject3}
     */
    InlineObject3,

    /**
     * The InlineObject4 model constructor.
     * @property {module:model/InlineObject4}
     */
    InlineObject4,

    /**
     * The InlineObject5 model constructor.
     * @property {module:model/InlineObject5}
     */
    InlineObject5,

    /**
     * The InlineObject6 model constructor.
     * @property {module:model/InlineObject6}
     */
    InlineObject6,

    /**
     * The InlineObject7 model constructor.
     * @property {module:model/InlineObject7}
     */
    InlineObject7,

    /**
     * The InlineObject8 model constructor.
     * @property {module:model/InlineObject8}
     */
    InlineObject8,

    /**
     * The InlineObject9 model constructor.
     * @property {module:model/InlineObject9}
     */
    InlineObject9,

    /**
     * The InlineResponse200 model constructor.
     * @property {module:model/InlineResponse200}
     */
    InlineResponse200,

    /**
     * The InlineResponse2001 model constructor.
     * @property {module:model/InlineResponse2001}
     */
    InlineResponse2001,

    /**
     * The InlineResponse2002 model constructor.
     * @property {module:model/InlineResponse2002}
     */
    InlineResponse2002,

    /**
     * The InlineResponse2003 model constructor.
     * @property {module:model/InlineResponse2003}
     */
    InlineResponse2003,

    /**
     * The InlineResponse2004 model constructor.
     * @property {module:model/InlineResponse2004}
     */
    InlineResponse2004,

    /**
     * The InlineResponse2005 model constructor.
     * @property {module:model/InlineResponse2005}
     */
    InlineResponse2005,

    /**
     * The InlineResponse2005VehicleStats model constructor.
     * @property {module:model/InlineResponse2005VehicleStats}
     */
    InlineResponse2005VehicleStats,

    /**
     * The InlineResponse2006 model constructor.
     * @property {module:model/InlineResponse2006}
     */
    InlineResponse2006,

    /**
     * The InlineResponse2007 model constructor.
     * @property {module:model/InlineResponse2007}
     */
    InlineResponse2007,

    /**
     * The InlineResponse2008 model constructor.
     * @property {module:model/InlineResponse2008}
     */
    InlineResponse2008,

    /**
     * The InlineResponse2009 model constructor.
     * @property {module:model/InlineResponse2009}
     */
    InlineResponse2009,

    /**
     * The JobStatus model constructor.
     * @property {module:model/JobStatus}
     */
    JobStatus,

    /**
     * The JobUpdateObject model constructor.
     * @property {module:model/JobUpdateObject}
     */
    JobUpdateObject,

    /**
     * The Machine model constructor.
     * @property {module:model/Machine}
     */
    Machine,

    /**
     * The MachineHistoryResponse model constructor.
     * @property {module:model/MachineHistoryResponse}
     */
    MachineHistoryResponse,

    /**
     * The MachineHistoryResponseMachines model constructor.
     * @property {module:model/MachineHistoryResponseMachines}
     */
    MachineHistoryResponseMachines,

    /**
     * The MachineHistoryResponseVibrations model constructor.
     * @property {module:model/MachineHistoryResponseVibrations}
     */
    MachineHistoryResponseVibrations,

    /**
     * The Pagination model constructor.
     * @property {module:model/Pagination}
     */
    Pagination,

    /**
     * The PrevJobStatus model constructor.
     * @property {module:model/PrevJobStatus}
     */
    PrevJobStatus,

    /**
     * The SafetyReportHarshEvent model constructor.
     * @property {module:model/SafetyReportHarshEvent}
     */
    SafetyReportHarshEvent,

    /**
     * The Sensor model constructor.
     * @property {module:model/Sensor}
     */
    Sensor,

    /**
     * The SensorHistoryResponse model constructor.
     * @property {module:model/SensorHistoryResponse}
     */
    SensorHistoryResponse,

    /**
     * The SensorHistoryResponseResults model constructor.
     * @property {module:model/SensorHistoryResponseResults}
     */
    SensorHistoryResponseResults,

    /**
     * The SensorsHistorySeries model constructor.
     * @property {module:model/SensorsHistorySeries}
     */
    SensorsHistorySeries,

    /**
     * The Tag model constructor.
     * @property {module:model/Tag}
     */
    Tag,

    /**
     * The TagCreate model constructor.
     * @property {module:model/TagCreate}
     */
    TagCreate,

    /**
     * The TagMetadata model constructor.
     * @property {module:model/TagMetadata}
     */
    TagMetadata,

    /**
     * The TagModify model constructor.
     * @property {module:model/TagModify}
     */
    TagModify,

    /**
     * The TagModifyAdd model constructor.
     * @property {module:model/TagModifyAdd}
     */
    TagModifyAdd,

    /**
     * The TagModifyDelete model constructor.
     * @property {module:model/TagModifyDelete}
     */
    TagModifyDelete,

    /**
     * The TagUpdate model constructor.
     * @property {module:model/TagUpdate}
     */
    TagUpdate,

    /**
     * The TaggedAddress model constructor.
     * @property {module:model/TaggedAddress}
     */
    TaggedAddress,

    /**
     * The TaggedAddressBase model constructor.
     * @property {module:model/TaggedAddressBase}
     */
    TaggedAddressBase,

    /**
     * The TaggedAsset model constructor.
     * @property {module:model/TaggedAsset}
     */
    TaggedAsset,

    /**
     * The TaggedAssetBase model constructor.
     * @property {module:model/TaggedAssetBase}
     */
    TaggedAssetBase,

    /**
     * The TaggedDriver model constructor.
     * @property {module:model/TaggedDriver}
     */
    TaggedDriver,

    /**
     * The TaggedDriverBase model constructor.
     * @property {module:model/TaggedDriverBase}
     */
    TaggedDriverBase,

    /**
     * The TaggedMachine model constructor.
     * @property {module:model/TaggedMachine}
     */
    TaggedMachine,

    /**
     * The TaggedMachineBase model constructor.
     * @property {module:model/TaggedMachineBase}
     */
    TaggedMachineBase,

    /**
     * The TaggedSensor model constructor.
     * @property {module:model/TaggedSensor}
     */
    TaggedSensor,

    /**
     * The TaggedSensorBase model constructor.
     * @property {module:model/TaggedSensorBase}
     */
    TaggedSensorBase,

    /**
     * The TaggedVehicle model constructor.
     * @property {module:model/TaggedVehicle}
     */
    TaggedVehicle,

    /**
     * The TaggedVehicleBase model constructor.
     * @property {module:model/TaggedVehicleBase}
     */
    TaggedVehicleBase,

    /**
     * The TemperatureResponse model constructor.
     * @property {module:model/TemperatureResponse}
     */
    TemperatureResponse,

    /**
     * The TemperatureResponseSensors model constructor.
     * @property {module:model/TemperatureResponseSensors}
     */
    TemperatureResponseSensors,

    /**
     * The TripResponse model constructor.
     * @property {module:model/TripResponse}
     */
    TripResponse,

    /**
     * The TripResponseEndCoordinates model constructor.
     * @property {module:model/TripResponseEndCoordinates}
     */
    TripResponseEndCoordinates,

    /**
     * The TripResponseStartCoordinates model constructor.
     * @property {module:model/TripResponseStartCoordinates}
     */
    TripResponseStartCoordinates,

    /**
     * The TripResponseTrips model constructor.
     * @property {module:model/TripResponseTrips}
     */
    TripResponseTrips,

    /**
     * The User model constructor.
     * @property {module:model/User}
     */
    User,

    /**
     * The UserBase model constructor.
     * @property {module:model/UserBase}
     */
    UserBase,

    /**
     * The UserRole model constructor.
     * @property {module:model/UserRole}
     */
    UserRole,

    /**
     * The UserTagRole model constructor.
     * @property {module:model/UserTagRole}
     */
    UserTagRole,

    /**
     * The UserTagRoleTag model constructor.
     * @property {module:model/UserTagRoleTag}
     */
    UserTagRoleTag,

    /**
     * The Vehicle model constructor.
     * @property {module:model/Vehicle}
     */
    Vehicle,

    /**
     * The VehicleHarshEventResponse model constructor.
     * @property {module:model/VehicleHarshEventResponse}
     */
    VehicleHarshEventResponse,

    /**
     * The VehicleHarshEventResponseLocation model constructor.
     * @property {module:model/VehicleHarshEventResponseLocation}
     */
    VehicleHarshEventResponseLocation,

    /**
     * The VehicleLocation model constructor.
     * @property {module:model/VehicleLocation}
     */
    VehicleLocation,

    /**
     * The VehicleMaintenance model constructor.
     * @property {module:model/VehicleMaintenance}
     */
    VehicleMaintenance,

    /**
     * The VehicleMaintenanceJ1939 model constructor.
     * @property {module:model/VehicleMaintenanceJ1939}
     */
    VehicleMaintenanceJ1939,

    /**
     * The VehicleMaintenanceJ1939CheckEngineLight model constructor.
     * @property {module:model/VehicleMaintenanceJ1939CheckEngineLight}
     */
    VehicleMaintenanceJ1939CheckEngineLight,

    /**
     * The VehicleMaintenanceJ1939DiagnosticTroubleCodes model constructor.
     * @property {module:model/VehicleMaintenanceJ1939DiagnosticTroubleCodes}
     */
    VehicleMaintenanceJ1939DiagnosticTroubleCodes,

    /**
     * The VehicleMaintenancePassenger model constructor.
     * @property {module:model/VehicleMaintenancePassenger}
     */
    VehicleMaintenancePassenger,

    /**
     * The VehicleMaintenancePassengerCheckEngineLight model constructor.
     * @property {module:model/VehicleMaintenancePassengerCheckEngineLight}
     */
    VehicleMaintenancePassengerCheckEngineLight,

    /**
     * The VehicleMaintenancePassengerDiagnosticTroubleCodes model constructor.
     * @property {module:model/VehicleMaintenancePassengerDiagnosticTroubleCodes}
     */
    VehicleMaintenancePassengerDiagnosticTroubleCodes,

    /**
     * The VehicleSafetyScoreResponse model constructor.
     * @property {module:model/VehicleSafetyScoreResponse}
     */
    VehicleSafetyScoreResponse,

    /**
    * The AssetsApi service constructor.
    * @property {module:api/AssetsApi}
    */
    AssetsApi,

    /**
    * The DriversApi service constructor.
    * @property {module:api/DriversApi}
    */
    DriversApi,

    /**
    * The FleetApi service constructor.
    * @property {module:api/FleetApi}
    */
    FleetApi,

    /**
    * The IndustrialApi service constructor.
    * @property {module:api/IndustrialApi}
    */
    IndustrialApi,

    /**
    * The RoutesApi service constructor.
    * @property {module:api/RoutesApi}
    */
    RoutesApi,

    /**
    * The SafetyApi service constructor.
    * @property {module:api/SafetyApi}
    */
    SafetyApi,

    /**
    * The SensorsApi service constructor.
    * @property {module:api/SensorsApi}
    */
    SensorsApi,

    /**
    * The TagsApi service constructor.
    * @property {module:api/TagsApi}
    */
    TagsApi,

    /**
    * The UsersApi service constructor.
    * @property {module:api/UsersApi}
    */
    UsersApi
};
