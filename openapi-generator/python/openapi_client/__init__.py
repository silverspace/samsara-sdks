# coding: utf-8

# flake8: noqa

"""
    Samsara API

    # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).  # noqa: E501

    OpenAPI spec version: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

__version__ = "1.0.0"

# import apis into sdk package
from openapi_client.api.assets_api import AssetsApi
from openapi_client.api.drivers_api import DriversApi
from openapi_client.api.fleet_api import FleetApi
from openapi_client.api.industrial_api import IndustrialApi
from openapi_client.api.routes_api import RoutesApi
from openapi_client.api.safety_api import SafetyApi
from openapi_client.api.sensors_api import SensorsApi
from openapi_client.api.tags_api import TagsApi
from openapi_client.api.users_api import UsersApi

# import ApiClient
from openapi_client.api_client import ApiClient
from openapi_client.configuration import Configuration
# import models into sdk package
from openapi_client.models.address import Address
from openapi_client.models.address_geofence import AddressGeofence
from openapi_client.models.address_geofence_circle import AddressGeofenceCircle
from openapi_client.models.address_geofence_polygon import AddressGeofencePolygon
from openapi_client.models.address_geofence_polygon_vertices import AddressGeofencePolygonVertices
from openapi_client.models.addresses_addresses import AddressesAddresses
from openapi_client.models.all_route_job_updates import AllRouteJobUpdates
from openapi_client.models.asset import Asset
from openapi_client.models.asset_cable import AssetCable
from openapi_client.models.asset_current_location import AssetCurrentLocation
from openapi_client.models.asset_current_locations_response import AssetCurrentLocationsResponse
from openapi_client.models.asset_reefer_response import AssetReeferResponse
from openapi_client.models.asset_reefer_response_reefer_stats import AssetReeferResponseReeferStats
from openapi_client.models.asset_reefer_response_reefer_stats_alarms import AssetReeferResponseReeferStatsAlarms
from openapi_client.models.asset_reefer_response_reefer_stats_alarms1 import AssetReeferResponseReeferStatsAlarms1
from openapi_client.models.asset_reefer_response_reefer_stats_engine_hours import AssetReeferResponseReeferStatsEngineHours
from openapi_client.models.asset_reefer_response_reefer_stats_fuel_percentage import AssetReeferResponseReeferStatsFuelPercentage
from openapi_client.models.asset_reefer_response_reefer_stats_power_status import AssetReeferResponseReeferStatsPowerStatus
from openapi_client.models.asset_reefer_response_reefer_stats_return_air_temp import AssetReeferResponseReeferStatsReturnAirTemp
from openapi_client.models.asset_reefer_response_reefer_stats_set_point import AssetReeferResponseReeferStatsSetPoint
from openapi_client.models.aux_input import AuxInput
from openapi_client.models.aux_input_series import AuxInputSeries
from openapi_client.models.cargo_response import CargoResponse
from openapi_client.models.cargo_response_sensors import CargoResponseSensors
from openapi_client.models.contact import Contact
from openapi_client.models.current_driver import CurrentDriver
from openapi_client.models.data_input_history_response import DataInputHistoryResponse
from openapi_client.models.data_input_history_response_points import DataInputHistoryResponsePoints
from openapi_client.models.dispatch_job import DispatchJob
from openapi_client.models.dispatch_job_create import DispatchJobCreate
from openapi_client.models.dispatch_route import DispatchRoute
from openapi_client.models.dispatch_route_base import DispatchRouteBase
from openapi_client.models.dispatch_route_create import DispatchRouteCreate
from openapi_client.models.dispatch_route_historical_entry import DispatchRouteHistoricalEntry
from openapi_client.models.dispatch_route_history import DispatchRouteHistory
from openapi_client.models.document import Document
from openapi_client.models.document_base import DocumentBase
from openapi_client.models.document_create import DocumentCreate
from openapi_client.models.document_field import DocumentField
from openapi_client.models.document_field_create import DocumentFieldCreate
from openapi_client.models.document_field_create_photo_value import DocumentFieldCreatePhotoValue
from openapi_client.models.document_field_type import DocumentFieldType
from openapi_client.models.document_field_type_number_value_type_metadata import DocumentFieldTypeNumberValueTypeMetadata
from openapi_client.models.document_type import DocumentType
from openapi_client.models.door_response import DoorResponse
from openapi_client.models.door_response_sensors import DoorResponseSensors
from openapi_client.models.driver import Driver
from openapi_client.models.driver_base import DriverBase
from openapi_client.models.driver_daily_log_response import DriverDailyLogResponse
from openapi_client.models.driver_daily_log_response_days import DriverDailyLogResponseDays
from openapi_client.models.driver_for_create import DriverForCreate
from openapi_client.models.driver_safety_score_response import DriverSafetyScoreResponse
from openapi_client.models.drivers_response import DriversResponse
from openapi_client.models.drivers_summary_response import DriversSummaryResponse
from openapi_client.models.drivers_summary_response_summaries import DriversSummaryResponseSummaries
from openapi_client.models.dvir_base import DvirBase
from openapi_client.models.dvir_base_author_signature import DvirBaseAuthorSignature
from openapi_client.models.dvir_base_mechanic_or_agent_signature import DvirBaseMechanicOrAgentSignature
from openapi_client.models.dvir_base_next_driver_signature import DvirBaseNextDriverSignature
from openapi_client.models.dvir_base_trailer_defects import DvirBaseTrailerDefects
from openapi_client.models.dvir_base_vehicle import DvirBaseVehicle
from openapi_client.models.dvir_list_response import DvirListResponse
from openapi_client.models.engine_state import EngineState
from openapi_client.models.fleet_vehicle_location import FleetVehicleLocation
from openapi_client.models.fleet_vehicle_response import FleetVehicleResponse
from openapi_client.models.fleet_vehicle_response_vehicle_info import FleetVehicleResponseVehicleInfo
from openapi_client.models.hos_authentication_logs_response import HosAuthenticationLogsResponse
from openapi_client.models.hos_authentication_logs_response_authentication_logs import HosAuthenticationLogsResponseAuthenticationLogs
from openapi_client.models.hos_logs_response import HosLogsResponse
from openapi_client.models.hos_logs_response_logs import HosLogsResponseLogs
from openapi_client.models.hos_logs_summary_response import HosLogsSummaryResponse
from openapi_client.models.hos_logs_summary_response_drivers import HosLogsSummaryResponseDrivers
from openapi_client.models.humidity_response import HumidityResponse
from openapi_client.models.humidity_response_sensors import HumidityResponseSensors
from openapi_client.models.inline_object import InlineObject
from openapi_client.models.inline_object1 import InlineObject1
from openapi_client.models.inline_object10 import InlineObject10
from openapi_client.models.inline_object11 import InlineObject11
from openapi_client.models.inline_object12 import InlineObject12
from openapi_client.models.inline_object13 import InlineObject13
from openapi_client.models.inline_object14 import InlineObject14
from openapi_client.models.inline_object15 import InlineObject15
from openapi_client.models.inline_object16 import InlineObject16
from openapi_client.models.inline_object17 import InlineObject17
from openapi_client.models.inline_object18 import InlineObject18
from openapi_client.models.inline_object19 import InlineObject19
from openapi_client.models.inline_object2 import InlineObject2
from openapi_client.models.inline_object20 import InlineObject20
from openapi_client.models.inline_object21 import InlineObject21
from openapi_client.models.inline_object22 import InlineObject22
from openapi_client.models.inline_object23 import InlineObject23
from openapi_client.models.inline_object24 import InlineObject24
from openapi_client.models.inline_object3 import InlineObject3
from openapi_client.models.inline_object4 import InlineObject4
from openapi_client.models.inline_object5 import InlineObject5
from openapi_client.models.inline_object6 import InlineObject6
from openapi_client.models.inline_object7 import InlineObject7
from openapi_client.models.inline_object8 import InlineObject8
from openapi_client.models.inline_object9 import InlineObject9
from openapi_client.models.inline_response200 import InlineResponse200
from openapi_client.models.inline_response2001 import InlineResponse2001
from openapi_client.models.inline_response2002 import InlineResponse2002
from openapi_client.models.inline_response2003 import InlineResponse2003
from openapi_client.models.inline_response2004 import InlineResponse2004
from openapi_client.models.inline_response2005 import InlineResponse2005
from openapi_client.models.inline_response2005_vehicle_stats import InlineResponse2005VehicleStats
from openapi_client.models.inline_response2006 import InlineResponse2006
from openapi_client.models.inline_response2007 import InlineResponse2007
from openapi_client.models.inline_response2008 import InlineResponse2008
from openapi_client.models.inline_response2009 import InlineResponse2009
from openapi_client.models.job_status import JobStatus
from openapi_client.models.job_update_object import JobUpdateObject
from openapi_client.models.machine import Machine
from openapi_client.models.machine_history_response import MachineHistoryResponse
from openapi_client.models.machine_history_response_machines import MachineHistoryResponseMachines
from openapi_client.models.machine_history_response_vibrations import MachineHistoryResponseVibrations
from openapi_client.models.pagination import Pagination
from openapi_client.models.prev_job_status import PrevJobStatus
from openapi_client.models.safety_report_harsh_event import SafetyReportHarshEvent
from openapi_client.models.sensor import Sensor
from openapi_client.models.sensor_history_response import SensorHistoryResponse
from openapi_client.models.sensor_history_response_results import SensorHistoryResponseResults
from openapi_client.models.sensors_history_series import SensorsHistorySeries
from openapi_client.models.tag import Tag
from openapi_client.models.tag_create import TagCreate
from openapi_client.models.tag_metadata import TagMetadata
from openapi_client.models.tag_modify import TagModify
from openapi_client.models.tag_modify_add import TagModifyAdd
from openapi_client.models.tag_modify_delete import TagModifyDelete
from openapi_client.models.tag_update import TagUpdate
from openapi_client.models.tagged_address import TaggedAddress
from openapi_client.models.tagged_address_base import TaggedAddressBase
from openapi_client.models.tagged_asset import TaggedAsset
from openapi_client.models.tagged_asset_base import TaggedAssetBase
from openapi_client.models.tagged_driver import TaggedDriver
from openapi_client.models.tagged_driver_base import TaggedDriverBase
from openapi_client.models.tagged_machine import TaggedMachine
from openapi_client.models.tagged_machine_base import TaggedMachineBase
from openapi_client.models.tagged_sensor import TaggedSensor
from openapi_client.models.tagged_sensor_base import TaggedSensorBase
from openapi_client.models.tagged_vehicle import TaggedVehicle
from openapi_client.models.tagged_vehicle_base import TaggedVehicleBase
from openapi_client.models.temperature_response import TemperatureResponse
from openapi_client.models.temperature_response_sensors import TemperatureResponseSensors
from openapi_client.models.trip_response import TripResponse
from openapi_client.models.trip_response_end_coordinates import TripResponseEndCoordinates
from openapi_client.models.trip_response_start_coordinates import TripResponseStartCoordinates
from openapi_client.models.trip_response_trips import TripResponseTrips
from openapi_client.models.user import User
from openapi_client.models.user_base import UserBase
from openapi_client.models.user_role import UserRole
from openapi_client.models.user_tag_role import UserTagRole
from openapi_client.models.user_tag_role_tag import UserTagRoleTag
from openapi_client.models.vehicle import Vehicle
from openapi_client.models.vehicle_harsh_event_response import VehicleHarshEventResponse
from openapi_client.models.vehicle_harsh_event_response_location import VehicleHarshEventResponseLocation
from openapi_client.models.vehicle_location import VehicleLocation
from openapi_client.models.vehicle_maintenance import VehicleMaintenance
from openapi_client.models.vehicle_maintenance_j1939 import VehicleMaintenanceJ1939
from openapi_client.models.vehicle_maintenance_j1939_check_engine_light import VehicleMaintenanceJ1939CheckEngineLight
from openapi_client.models.vehicle_maintenance_j1939_diagnostic_trouble_codes import VehicleMaintenanceJ1939DiagnosticTroubleCodes
from openapi_client.models.vehicle_maintenance_passenger import VehicleMaintenancePassenger
from openapi_client.models.vehicle_maintenance_passenger_check_engine_light import VehicleMaintenancePassengerCheckEngineLight
from openapi_client.models.vehicle_maintenance_passenger_diagnostic_trouble_codes import VehicleMaintenancePassengerDiagnosticTroubleCodes
from openapi_client.models.vehicle_safety_score_response import VehicleSafetyScoreResponse
