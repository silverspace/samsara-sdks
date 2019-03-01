import connexion
import six

from samsara.models.address import Address  # noqa: E501
from samsara.models.address_param import AddressParam  # noqa: E501
from samsara.models.addresses import Addresses  # noqa: E501
from samsara.models.all_route_job_updates import AllRouteJobUpdates  # noqa: E501
from samsara.models.asset_location_response import AssetLocationResponse  # noqa: E501
from samsara.models.asset_reefer_response import AssetReeferResponse  # noqa: E501
from samsara.models.contact import Contact  # noqa: E501
from samsara.models.create_dvir_param import CreateDvirParam  # noqa: E501
from samsara.models.current_driver import CurrentDriver  # noqa: E501
from samsara.models.data import Data  # noqa: E501
from samsara.models.dispatch_route import DispatchRoute  # noqa: E501
from samsara.models.dispatch_route_create import DispatchRouteCreate  # noqa: E501
from samsara.models.dispatch_route_history import DispatchRouteHistory  # noqa: E501
from samsara.models.dispatch_routes import DispatchRoutes  # noqa: E501
from samsara.models.document import Document  # noqa: E501
from samsara.models.document_create import DocumentCreate  # noqa: E501
from samsara.models.document_types import DocumentTypes  # noqa: E501
from samsara.models.documents import Documents  # noqa: E501
from samsara.models.driver import Driver  # noqa: E501
from samsara.models.driver_daily_log_response import DriverDailyLogResponse  # noqa: E501
from samsara.models.driver_for_create import DriverForCreate  # noqa: E501
from samsara.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from samsara.models.drivers_response import DriversResponse  # noqa: E501
from samsara.models.drivers_summary_param import DriversSummaryParam  # noqa: E501
from samsara.models.drivers_summary_response import DriversSummaryResponse  # noqa: E501
from samsara.models.dvir_base import DvirBase  # noqa: E501
from samsara.models.dvir_list_response import DvirListResponse  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.fleet_vehicle_locations import FleetVehicleLocations  # noqa: E501
from samsara.models.fleet_vehicle_response import FleetVehicleResponse  # noqa: E501
from samsara.models.fleet_vehicles_locations import FleetVehiclesLocations  # noqa: E501
from samsara.models.group_drivers_param import GroupDriversParam  # noqa: E501
from samsara.models.group_param import GroupParam  # noqa: E501
from samsara.models.hos_authentication_logs_param import HosAuthenticationLogsParam  # noqa: E501
from samsara.models.hos_authentication_logs_response import HosAuthenticationLogsResponse  # noqa: E501
from samsara.models.hos_logs_param import HosLogsParam  # noqa: E501
from samsara.models.hos_logs_param1 import HosLogsParam1  # noqa: E501
from samsara.models.hos_logs_param2 import HosLogsParam2  # noqa: E501
from samsara.models.hos_logs_response import HosLogsResponse  # noqa: E501
from samsara.models.hos_logs_summary_response import HosLogsSummaryResponse  # noqa: E501
from samsara.models.inline_response200 import InlineResponse200  # noqa: E501
from samsara.models.inline_response2001 import InlineResponse2001  # noqa: E501
from samsara.models.inline_response2002 import InlineResponse2002  # noqa: E501
from samsara.models.inline_response2003 import InlineResponse2003  # noqa: E501
from samsara.models.inline_response2004 import InlineResponse2004  # noqa: E501
from samsara.models.inline_response2005 import InlineResponse2005  # noqa: E501
from samsara.models.reactivate_driver_param import ReactivateDriverParam  # noqa: E501
from samsara.models.trip_response import TripResponse  # noqa: E501
from samsara.models.trips_param import TripsParam  # noqa: E501
from samsara.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from samsara.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from samsara.models.vehicle_update_param import VehicleUpdateParam  # noqa: E501
from samsara import util


def add_fleet_address(access_token, addressParam):  # noqa: E501
    """/fleet/add_address

    This method adds an address book entry to the specified group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param addressParam: 
    :type addressParam: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        addressParam = AddressParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_organization_addresses(access_token, addresses):  # noqa: E501
    """/addresses

    Add one or more addresses to the organization # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param addresses: List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.
    :type addresses: dict | bytes

    :rtype: List[Address]
    """
    if connexion.request.is_json:
        addresses = Addresses.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_dispatch_route(access_token, createDispatchRouteParams):  # noqa: E501
    """/fleet/dispatch/routes

    Create a new dispatch route. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param createDispatchRouteParams: 
    :type createDispatchRouteParams: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        createDispatchRouteParams = DispatchRouteCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_driver(access_token, createDriverParam):  # noqa: E501
    """/fleet/drivers/create

    Create a new driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param createDriverParam: Driver creation body
    :type createDriverParam: dict | bytes

    :rtype: Driver
    """
    if connexion.request.is_json:
        createDriverParam = DriverForCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_driver_dispatch_route(access_token, driver_id, createDispatchRouteParams):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

    Create a new dispatch route for the driver with driver_id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with the associated routes.
    :type driver_id: int
    :param createDispatchRouteParams: 
    :type createDispatchRouteParams: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        createDispatchRouteParams = DispatchRouteCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_driver_document(access_token, driver_id, createDocumentParams):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+}/documents

    Create a driver document for the given driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver for whom the document is created.
    :type driver_id: int
    :param createDocumentParams: To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    :type createDocumentParams: dict | bytes

    :rtype: Document
    """
    if connexion.request.is_json:
        createDocumentParams = DocumentCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_dvir(access_token, createDvirParam):  # noqa: E501
    """/fleet/maintenance/dvirs

    Create a new dvir, marking a vehicle or trailer safe or unsafe. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param createDvirParam: DVIR creation body
    :type createDvirParam: dict | bytes

    :rtype: DvirBase
    """
    if connexion.request.is_json:
        createDvirParam = CreateDvirParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_vehicle_dispatch_route(access_token, vehicle_id, createDispatchRouteParams):  # noqa: E501
    """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

    Create a new dispatch route for the vehicle with vehicle_id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param createDispatchRouteParams: 
    :type createDispatchRouteParams: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        createDispatchRouteParams = DispatchRouteCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def deactivate_driver(access_token, driver_id_or_external_id):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Deactivate a driver with the given id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    :rtype: None
    """
    return 'do some magic!'


def delete_dispatch_route_by_id(access_token, route_id):  # noqa: E501
    """/fleet/dispatch/routes/{route_id:[0-9]+}/

    Delete a dispatch route and its associated jobs. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int

    :rtype: None
    """
    return 'do some magic!'


def delete_organization_address(access_token, addressId):  # noqa: E501
    """/addresses/{addressId}

    Delete an address. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param addressId: ID of the address/geofence
    :type addressId: int

    :rtype: None
    """
    return 'do some magic!'


def fetch_all_dispatch_routes(access_token, group_id=None, end_time=None, duration=None):  # noqa: E501
    """/fleet/dispatch/routes

    Fetch all of the dispatch routes for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int
    :param end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    :type end_time: int
    :param duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    :type duration: int

    :rtype: DispatchRoutes
    """
    return 'do some magic!'


def fetch_all_route_job_updates(access_token, group_id=None, sequence_id=None, include=None):  # noqa: E501
    """/fleet/dispatch/routes/job_updates

    Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int
    :param sequence_id: Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
    :type sequence_id: str
    :param include: Optionally set include&#x3D;route to include route object in response payload.
    :type include: str

    :rtype: AllRouteJobUpdates
    """
    return 'do some magic!'


def get_all_asset_current_locations(access_token, group_id=None):  # noqa: E501
    """/fleet/assets/locations

    Fetch current locations of all assets for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    :rtype: InlineResponse2001
    """
    return 'do some magic!'


def get_all_assets(access_token, group_id=None):  # noqa: E501
    """/fleet/assets

    Fetch all of the assets for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    :rtype: InlineResponse200
    """
    return 'do some magic!'


def get_all_deactivated_drivers(access_token, group_id=None):  # noqa: E501
    """/fleet/drivers/inactive

    Fetch all deactivated drivers for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    :rtype: List[Driver]
    """
    return 'do some magic!'


def get_asset_location(access_token, asset_id, startMs, endMs):  # noqa: E501
    """/fleet/assets/{assetId:[0-9]+}/locations

    Fetch the historical locations for the asset. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param startMs: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type startMs: int
    :param endMs: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type endMs: int

    :rtype: AssetLocationResponse
    """
    return 'do some magic!'


def get_asset_reefer(access_token, asset_id, startMs, endMs):  # noqa: E501
    """/fleet/assets/{assetId:[0-9]+}/reefer

    Fetch the reefer-specific stats of an asset. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param startMs: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type startMs: int
    :param endMs: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type endMs: int

    :rtype: AssetReeferResponse
    """
    return 'do some magic!'


def get_deactivated_driver_by_id(access_token, driver_id_or_external_id):  # noqa: E501
    """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Fetch deactivated driver by id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    :rtype: Driver
    """
    return 'do some magic!'


def get_dispatch_route_by_id(access_token, route_id):  # noqa: E501
    """/fleet/dispatch/routes/{route_id:[0-9]+}

    Fetch a dispatch route by id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int

    :rtype: DispatchRoute
    """
    return 'do some magic!'


def get_dispatch_route_history(access_token, route_id, start_time=None, end_time=None):  # noqa: E501
    """/fleet/dispatch/routes/{route_id:[0-9]+}/history

    Fetch the history of a dispatch route. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the route with history.
    :type route_id: int
    :param start_time: Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
    :type start_time: int
    :param end_time: Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
    :type end_time: int

    :rtype: DispatchRouteHistory
    """
    return 'do some magic!'


def get_dispatch_routes_by_driver_id(access_token, driver_id, end_time=None, duration=None):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

    Fetch all of the dispatch routes for a given driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with the associated routes.
    :type driver_id: int
    :param end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    :type end_time: int
    :param duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    :type duration: int

    :rtype: DispatchRoutes
    """
    return 'do some magic!'


def get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, end_time=None, duration=None):  # noqa: E501
    """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

    Fetch all of the dispatch routes for a given vehicle. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    :type end_time: int
    :param duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    :type duration: int

    :rtype: DispatchRoutes
    """
    return 'do some magic!'


def get_driver_by_id(access_token, driver_id_or_external_id):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Fetch driver by id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    :rtype: CurrentDriver
    """
    return 'do some magic!'


def get_driver_document_types_by_org_id():  # noqa: E501
    """/fleet/drivers/document_types

    Fetch all of the document types. # noqa: E501


    :rtype: DocumentTypes
    """
    return 'do some magic!'


def get_driver_documents_by_org_id(access_token, endMs=None, durationMs=None):  # noqa: E501
    """/fleet/drivers/documents

    Fetch all of the documents. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param endMs: Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
    :type endMs: int
    :param durationMs: Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
    :type durationMs: int

    :rtype: Documents
    """
    return 'do some magic!'


def get_driver_safety_score(driverId, access_token, startMs, endMs):  # noqa: E501
    """/fleet/drivers/{driverId:[0-9]+}/safety/score

    Fetch the safety score for the driver. # noqa: E501

    :param driverId: ID of the driver
    :type driverId: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param startMs: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type startMs: int
    :param endMs: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type endMs: int

    :rtype: DriverSafetyScoreResponse
    """
    return 'do some magic!'


def get_dvirs(access_token, end_ms, duration_ms, group_id=None):  # noqa: E501
    """/fleet/maintenance/dvirs

    Get DVIRs for the org within provided time constraints # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param end_ms: time in millis until the last dvir log.
    :type end_ms: int
    :param duration_ms: time in millis which corresponds to the duration before the end_ms.
    :type duration_ms: int
    :param group_id: Group ID to query.
    :type group_id: int

    :rtype: DvirListResponse
    """
    return 'do some magic!'


def get_fleet_drivers(access_token, groupDriversParam):  # noqa: E501
    """/fleet/drivers

    Get all the drivers for the specified group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param groupDriversParam: 
    :type groupDriversParam: dict | bytes

    :rtype: DriversResponse
    """
    if connexion.request.is_json:
        groupDriversParam = GroupDriversParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_drivers_hos_daily_logs(access_token, driver_id, hosLogsParam):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

    Get summarized daily HOS charts for a specified driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with HOS logs.
    :type driver_id: int
    :param hosLogsParam: 
    :type hosLogsParam: dict | bytes

    :rtype: DriverDailyLogResponse
    """
    if connexion.request.is_json:
        hosLogsParam = HosLogsParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_drivers_summary(access_token, driversSummaryParam, snap_to_day_bounds=None):  # noqa: E501
    """/fleet/drivers/summary

    Get the distance and time each driver in an organization has driven in a given time period. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driversSummaryParam: Org ID and time range to query.
    :type driversSummaryParam: dict | bytes
    :param snap_to_day_bounds: Snap query result to HOS day boundaries.
    :type snap_to_day_bounds: bool

    :rtype: DriversSummaryResponse
    """
    if connexion.request.is_json:
        driversSummaryParam = DriversSummaryParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_hos_authentication_logs(access_token, hosAuthenticationLogsParam):  # noqa: E501
    """/fleet/hos_authentication_logs

    Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hosAuthenticationLogsParam: 
    :type hosAuthenticationLogsParam: dict | bytes

    :rtype: HosAuthenticationLogsResponse
    """
    if connexion.request.is_json:
        hosAuthenticationLogsParam = HosAuthenticationLogsParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_hos_logs(access_token, hosLogsParam):  # noqa: E501
    """/fleet/hos_logs

    Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hosLogsParam: 
    :type hosLogsParam: dict | bytes

    :rtype: HosLogsResponse
    """
    if connexion.request.is_json:
        hosLogsParam = HosLogsParam1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_hos_logs_summary(access_token, hosLogsParam):  # noqa: E501
    """/fleet/hos_logs_summary

    Get the current HOS status for all drivers in the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hosLogsParam: 
    :type hosLogsParam: dict | bytes

    :rtype: HosLogsSummaryResponse
    """
    if connexion.request.is_json:
        hosLogsParam = HosLogsParam2.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_locations(access_token, groupParam):  # noqa: E501
    """/fleet/locations

    Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param groupParam: Group ID to query.
    :type groupParam: dict | bytes

    :rtype: InlineResponse2003
    """
    if connexion.request.is_json:
        groupParam = GroupParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_maintenance_list(access_token, groupParam):  # noqa: E501
    """/fleet/maintenance/list

    Get list of the vehicles with any engine faults or check light data. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param groupParam: Group ID to query.
    :type groupParam: dict | bytes

    :rtype: InlineResponse2004
    """
    if connexion.request.is_json:
        groupParam = GroupParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_trips(access_token, tripsParam):  # noqa: E501
    """/fleet/trips

    Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param tripsParam: Group ID, vehicle ID and time range to query.
    :type tripsParam: dict | bytes

    :rtype: TripResponse
    """
    if connexion.request.is_json:
        tripsParam = TripsParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_vehicle(access_token, vehicle_id_or_external_id):  # noqa: E501
    """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Gets a specific vehicle. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    :type vehicle_id_or_external_id: str

    :rtype: FleetVehicleResponse
    """
    return 'do some magic!'


def get_organization_address(access_token, addressId):  # noqa: E501
    """/addresses/{addressId}

    Fetch an address by its id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param addressId: ID of the address/geofence
    :type addressId: int

    :rtype: Address
    """
    return 'do some magic!'


def get_organization_addresses(access_token):  # noqa: E501
    """/addresses

    Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str

    :rtype: List[Address]
    """
    return 'do some magic!'


def get_organization_contact(access_token, contact_id):  # noqa: E501
    """/contacts/{contact_id}

    Fetch a contact by its id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param contact_id: ID of the contact
    :type contact_id: int

    :rtype: Contact
    """
    return 'do some magic!'


def get_vehicle_harsh_event(vehicleId, access_token, timestamp):  # noqa: E501
    """/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

    Fetch harsh event details for a vehicle. # noqa: E501

    :param vehicleId: ID of the vehicle
    :type vehicleId: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param timestamp: Timestamp in milliseconds representing the timestamp of a harsh event.
    :type timestamp: int

    :rtype: VehicleHarshEventResponse
    """
    return 'do some magic!'


def get_vehicle_locations(access_token, vehicle_id, startMs, endMs):  # noqa: E501
    """/fleet/vehicles/{vehicle_id:[0-9]+}/locations

    Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param startMs: Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
    :type startMs: int
    :param endMs: Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
    :type endMs: int

    :rtype: FleetVehicleLocations
    """
    return 'do some magic!'


def get_vehicle_safety_score(vehicleId, access_token, startMs, endMs):  # noqa: E501
    """/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

    Fetch the safety score for the vehicle. # noqa: E501

    :param vehicleId: ID of the vehicle
    :type vehicleId: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param startMs: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type startMs: int
    :param endMs: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type endMs: int

    :rtype: VehicleSafetyScoreResponse
    """
    return 'do some magic!'


def get_vehicle_stats(access_token, startMs, endMs, series=None, tagIds=None, startingAfter=None, endingBefore=None, limit=None):  # noqa: E501
    """/fleet/vehicles/stats

    Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param startMs: Time in Unix epoch milliseconds for the start of the query.
    :type startMs: int
    :param endMs: Time in Unix epoch milliseconds for the end of the query.
    :type endMs: int
    :param series: Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
    :type series: str
    :param tagIds: Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
    :type tagIds: str
    :param startingAfter: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
    :type startingAfter: str
    :param endingBefore: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
    :type endingBefore: str
    :param limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
    :type limit: int

    :rtype: InlineResponse2005
    """
    return 'do some magic!'


def get_vehicles_locations(access_token, startMs, endMs):  # noqa: E501
    """/fleet/vehicles/locations

    Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param startMs: Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
    :type startMs: int
    :param endMs: Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
    :type endMs: int

    :rtype: FleetVehiclesLocations
    """
    return 'do some magic!'


def list_contacts(access_token):  # noqa: E501
    """/contacts

    Fetch all contacts for the organization. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str

    :rtype: List[Contact]
    """
    return 'do some magic!'


def list_fleet(access_token, groupParam, startingAfter=None, endingBefore=None, limit=None):  # noqa: E501
    """/fleet/list

    Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param groupParam: Group ID to query.
    :type groupParam: dict | bytes
    :param startingAfter: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
    :type startingAfter: str
    :param endingBefore: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
    :type endingBefore: str
    :param limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
    :type limit: int

    :rtype: InlineResponse2002
    """
    if connexion.request.is_json:
        groupParam = GroupParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def patch_fleet_vehicle(access_token, vehicle_id_or_external_id, data):  # noqa: E501
    """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    :type vehicle_id_or_external_id: str
    :param data: 
    :type data: dict | bytes

    :rtype: FleetVehicleResponse
    """
    if connexion.request.is_json:
        data = Data.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivateDriverParam):  # noqa: E501
    """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Reactivate the inactive driver having id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str
    :param reactivateDriverParam: Driver reactivation body
    :type reactivateDriverParam: dict | bytes

    :rtype: CurrentDriver
    """
    if connexion.request.is_json:
        reactivateDriverParam = ReactivateDriverParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_dispatch_route_by_id(access_token, route_id, updateDispatchRouteParams):  # noqa: E501
    """/fleet/dispatch/routes/{route_id:[0-9]+}/

    Update a dispatch route and its associated jobs. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int
    :param updateDispatchRouteParams: 
    :type updateDispatchRouteParams: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        updateDispatchRouteParams = DispatchRoute.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_organization_address(access_token, address, addressId):  # noqa: E501
    """/addresses/{addressId}

    Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address: Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.
    :type address: dict | bytes
    :param addressId: ID of the address/geofence
    :type addressId: int

    :rtype: None
    """
    if connexion.request.is_json:
        address = Address.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_vehicles(access_token, vehicleUpdateParam):  # noqa: E501
    """/fleet/set_data

    This method enables the mutation of metadata for vehicles in the Samsara Cloud. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicleUpdateParam: 
    :type vehicleUpdateParam: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        vehicleUpdateParam = VehicleUpdateParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
