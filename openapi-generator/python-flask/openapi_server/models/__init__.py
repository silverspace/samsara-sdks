# coding: utf-8

# flake8: noqa
from __future__ import absolute_import
# import models into model package
from openapi_server.models.address import Address
from openapi_server.models.address_geofence import AddressGeofence
from openapi_server.models.address_geofence_circle import AddressGeofenceCircle
from openapi_server.models.address_geofence_polygon import AddressGeofencePolygon
from openapi_server.models.address_geofence_polygon_vertices import AddressGeofencePolygonVertices
from openapi_server.models.addresses_addresses import AddressesAddresses
from openapi_server.models.all_route_job_updates import AllRouteJobUpdates
from openapi_server.models.asset import Asset
from openapi_server.models.asset_cable import AssetCable
from openapi_server.models.asset_current_location import AssetCurrentLocation
from openapi_server.models.asset_current_locations_response import AssetCurrentLocationsResponse
from openapi_server.models.asset_reefer_response import AssetReeferResponse
from openapi_server.models.asset_reefer_response_reefer_stats import AssetReeferResponseReeferStats
from openapi_server.models.asset_reefer_response_reefer_stats_alarms import AssetReeferResponseReeferStatsAlarms
from openapi_server.models.asset_reefer_response_reefer_stats_alarms1 import AssetReeferResponseReeferStatsAlarms1
from openapi_server.models.asset_reefer_response_reefer_stats_engine_hours import AssetReeferResponseReeferStatsEngineHours
from openapi_server.models.asset_reefer_response_reefer_stats_fuel_percentage import AssetReeferResponseReeferStatsFuelPercentage
from openapi_server.models.asset_reefer_response_reefer_stats_power_status import AssetReeferResponseReeferStatsPowerStatus
from openapi_server.models.asset_reefer_response_reefer_stats_return_air_temp import AssetReeferResponseReeferStatsReturnAirTemp
from openapi_server.models.asset_reefer_response_reefer_stats_set_point import AssetReeferResponseReeferStatsSetPoint
from openapi_server.models.aux_input import AuxInput
from openapi_server.models.aux_input_series import AuxInputSeries
from openapi_server.models.cargo_response import CargoResponse
from openapi_server.models.cargo_response_sensors import CargoResponseSensors
from openapi_server.models.contact import Contact
from openapi_server.models.current_driver import CurrentDriver
from openapi_server.models.data_input_history_response import DataInputHistoryResponse
from openapi_server.models.data_input_history_response_points import DataInputHistoryResponsePoints
from openapi_server.models.dispatch_job import DispatchJob
from openapi_server.models.dispatch_job_create import DispatchJobCreate
from openapi_server.models.dispatch_route import DispatchRoute
from openapi_server.models.dispatch_route_base import DispatchRouteBase
from openapi_server.models.dispatch_route_create import DispatchRouteCreate
from openapi_server.models.dispatch_route_historical_entry import DispatchRouteHistoricalEntry
from openapi_server.models.dispatch_route_history import DispatchRouteHistory
from openapi_server.models.document import Document
from openapi_server.models.document_base import DocumentBase
from openapi_server.models.document_create import DocumentCreate
from openapi_server.models.document_field import DocumentField
from openapi_server.models.document_field_create import DocumentFieldCreate
from openapi_server.models.document_field_create_photo_value import DocumentFieldCreatePhotoValue
from openapi_server.models.document_field_type import DocumentFieldType
from openapi_server.models.document_field_type_number_value_type_metadata import DocumentFieldTypeNumberValueTypeMetadata
from openapi_server.models.document_type import DocumentType
from openapi_server.models.door_response import DoorResponse
from openapi_server.models.door_response_sensors import DoorResponseSensors
from openapi_server.models.driver import Driver
from openapi_server.models.driver_base import DriverBase
from openapi_server.models.driver_daily_log_response import DriverDailyLogResponse
from openapi_server.models.driver_daily_log_response_days import DriverDailyLogResponseDays
from openapi_server.models.driver_for_create import DriverForCreate
from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse
from openapi_server.models.drivers_response import DriversResponse
from openapi_server.models.drivers_summary_response import DriversSummaryResponse
from openapi_server.models.drivers_summary_response_summaries import DriversSummaryResponseSummaries
from openapi_server.models.dvir_base import DvirBase
from openapi_server.models.dvir_base_author_signature import DvirBaseAuthorSignature
from openapi_server.models.dvir_base_mechanic_or_agent_signature import DvirBaseMechanicOrAgentSignature
from openapi_server.models.dvir_base_next_driver_signature import DvirBaseNextDriverSignature
from openapi_server.models.dvir_base_trailer_defects import DvirBaseTrailerDefects
from openapi_server.models.dvir_base_vehicle import DvirBaseVehicle
from openapi_server.models.dvir_list_response import DvirListResponse
from openapi_server.models.engine_state import EngineState
from openapi_server.models.fleet_vehicle_location import FleetVehicleLocation
from openapi_server.models.fleet_vehicle_response import FleetVehicleResponse
from openapi_server.models.fleet_vehicle_response_vehicle_info import FleetVehicleResponseVehicleInfo
from openapi_server.models.hos_authentication_logs_response import HosAuthenticationLogsResponse
from openapi_server.models.hos_authentication_logs_response_authentication_logs import HosAuthenticationLogsResponseAuthenticationLogs
from openapi_server.models.hos_logs_response import HosLogsResponse
from openapi_server.models.hos_logs_response_logs import HosLogsResponseLogs
from openapi_server.models.hos_logs_summary_response import HosLogsSummaryResponse
from openapi_server.models.hos_logs_summary_response_drivers import HosLogsSummaryResponseDrivers
from openapi_server.models.humidity_response import HumidityResponse
from openapi_server.models.humidity_response_sensors import HumidityResponseSensors
from openapi_server.models.inline_object import InlineObject
from openapi_server.models.inline_object1 import InlineObject1
from openapi_server.models.inline_object10 import InlineObject10
from openapi_server.models.inline_object11 import InlineObject11
from openapi_server.models.inline_object12 import InlineObject12
from openapi_server.models.inline_object13 import InlineObject13
from openapi_server.models.inline_object14 import InlineObject14
from openapi_server.models.inline_object15 import InlineObject15
from openapi_server.models.inline_object16 import InlineObject16
from openapi_server.models.inline_object17 import InlineObject17
from openapi_server.models.inline_object18 import InlineObject18
from openapi_server.models.inline_object19 import InlineObject19
from openapi_server.models.inline_object2 import InlineObject2
from openapi_server.models.inline_object20 import InlineObject20
from openapi_server.models.inline_object21 import InlineObject21
from openapi_server.models.inline_object22 import InlineObject22
from openapi_server.models.inline_object23 import InlineObject23
from openapi_server.models.inline_object24 import InlineObject24
from openapi_server.models.inline_object3 import InlineObject3
from openapi_server.models.inline_object4 import InlineObject4
from openapi_server.models.inline_object5 import InlineObject5
from openapi_server.models.inline_object6 import InlineObject6
from openapi_server.models.inline_object7 import InlineObject7
from openapi_server.models.inline_object8 import InlineObject8
from openapi_server.models.inline_object9 import InlineObject9
from openapi_server.models.inline_response200 import InlineResponse200
from openapi_server.models.inline_response2001 import InlineResponse2001
from openapi_server.models.inline_response2002 import InlineResponse2002
from openapi_server.models.inline_response2003 import InlineResponse2003
from openapi_server.models.inline_response2004 import InlineResponse2004
from openapi_server.models.inline_response2005 import InlineResponse2005
from openapi_server.models.inline_response2005_vehicle_stats import InlineResponse2005VehicleStats
from openapi_server.models.inline_response2006 import InlineResponse2006
from openapi_server.models.inline_response2007 import InlineResponse2007
from openapi_server.models.inline_response2008 import InlineResponse2008
from openapi_server.models.inline_response2009 import InlineResponse2009
from openapi_server.models.job_status import JobStatus
from openapi_server.models.job_update_object import JobUpdateObject
from openapi_server.models.machine import Machine
from openapi_server.models.machine_history_response import MachineHistoryResponse
from openapi_server.models.machine_history_response_machines import MachineHistoryResponseMachines
from openapi_server.models.machine_history_response_vibrations import MachineHistoryResponseVibrations
from openapi_server.models.pagination import Pagination
from openapi_server.models.prev_job_status import PrevJobStatus
from openapi_server.models.safety_report_harsh_event import SafetyReportHarshEvent
from openapi_server.models.sensor import Sensor
from openapi_server.models.sensor_history_response import SensorHistoryResponse
from openapi_server.models.sensor_history_response_results import SensorHistoryResponseResults
from openapi_server.models.sensors_history_series import SensorsHistorySeries
from openapi_server.models.tag import Tag
from openapi_server.models.tag_create import TagCreate
from openapi_server.models.tag_metadata import TagMetadata
from openapi_server.models.tag_modify import TagModify
from openapi_server.models.tag_modify_add import TagModifyAdd
from openapi_server.models.tag_modify_delete import TagModifyDelete
from openapi_server.models.tag_update import TagUpdate
from openapi_server.models.tagged_address import TaggedAddress
from openapi_server.models.tagged_address_base import TaggedAddressBase
from openapi_server.models.tagged_asset import TaggedAsset
from openapi_server.models.tagged_asset_base import TaggedAssetBase
from openapi_server.models.tagged_driver import TaggedDriver
from openapi_server.models.tagged_driver_base import TaggedDriverBase
from openapi_server.models.tagged_machine import TaggedMachine
from openapi_server.models.tagged_machine_base import TaggedMachineBase
from openapi_server.models.tagged_sensor import TaggedSensor
from openapi_server.models.tagged_sensor_base import TaggedSensorBase
from openapi_server.models.tagged_vehicle import TaggedVehicle
from openapi_server.models.tagged_vehicle_base import TaggedVehicleBase
from openapi_server.models.temperature_response import TemperatureResponse
from openapi_server.models.temperature_response_sensors import TemperatureResponseSensors
from openapi_server.models.trip_response import TripResponse
from openapi_server.models.trip_response_end_coordinates import TripResponseEndCoordinates
from openapi_server.models.trip_response_start_coordinates import TripResponseStartCoordinates
from openapi_server.models.trip_response_trips import TripResponseTrips
from openapi_server.models.user import User
from openapi_server.models.user_base import UserBase
from openapi_server.models.user_role import UserRole
from openapi_server.models.user_tag_role import UserTagRole
from openapi_server.models.user_tag_role_tag import UserTagRoleTag
from openapi_server.models.vehicle import Vehicle
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse
from openapi_server.models.vehicle_harsh_event_response_location import VehicleHarshEventResponseLocation
from openapi_server.models.vehicle_location import VehicleLocation
from openapi_server.models.vehicle_maintenance import VehicleMaintenance
from openapi_server.models.vehicle_maintenance_j1939 import VehicleMaintenanceJ1939
from openapi_server.models.vehicle_maintenance_j1939_check_engine_light import VehicleMaintenanceJ1939CheckEngineLight
from openapi_server.models.vehicle_maintenance_j1939_diagnostic_trouble_codes import VehicleMaintenanceJ1939DiagnosticTroubleCodes
from openapi_server.models.vehicle_maintenance_passenger import VehicleMaintenancePassenger
from openapi_server.models.vehicle_maintenance_passenger_check_engine_light import VehicleMaintenancePassengerCheckEngineLight
from openapi_server.models.vehicle_maintenance_passenger_diagnostic_trouble_codes import VehicleMaintenancePassengerDiagnosticTroubleCodes
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse
