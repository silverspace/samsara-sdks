import connexion
import six

from openapi_server.models.address import Address  # noqa: E501
from openapi_server.models.all_route_job_updates import AllRouteJobUpdates  # noqa: E501
from openapi_server.models.asset_reefer_response import AssetReeferResponse  # noqa: E501
from openapi_server.models.contact import Contact  # noqa: E501
from openapi_server.models.dispatch_route import DispatchRoute  # noqa: E501
from openapi_server.models.dispatch_route_create import DispatchRouteCreate  # noqa: E501
from openapi_server.models.dispatch_route_history import DispatchRouteHistory  # noqa: E501
from openapi_server.models.document import Document  # noqa: E501
from openapi_server.models.document_create import DocumentCreate  # noqa: E501
from openapi_server.models.document_type import DocumentType  # noqa: E501
from openapi_server.models.driver import Driver  # noqa: E501
from openapi_server.models.driver_daily_log_response import DriverDailyLogResponse  # noqa: E501
from openapi_server.models.driver_for_create import DriverForCreate  # noqa: E501
from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from openapi_server.models.drivers_response import DriversResponse  # noqa: E501
from openapi_server.models.drivers_summary_response import DriversSummaryResponse  # noqa: E501
from openapi_server.models.dvir_base import DvirBase  # noqa: E501
from openapi_server.models.dvir_list_response import DvirListResponse  # noqa: E501
from openapi_server.models.fleet_vehicle_location import FleetVehicleLocation  # noqa: E501
from openapi_server.models.fleet_vehicle_response import FleetVehicleResponse  # noqa: E501
from openapi_server.models.hos_authentication_logs_response import HosAuthenticationLogsResponse  # noqa: E501
from openapi_server.models.hos_logs_response import HosLogsResponse  # noqa: E501
from openapi_server.models.hos_logs_summary_response import HosLogsSummaryResponse  # noqa: E501
from openapi_server.models.inline_object import InlineObject  # noqa: E501
from openapi_server.models.inline_object1 import InlineObject1  # noqa: E501
from openapi_server.models.inline_object10 import InlineObject10  # noqa: E501
from openapi_server.models.inline_object11 import InlineObject11  # noqa: E501
from openapi_server.models.inline_object12 import InlineObject12  # noqa: E501
from openapi_server.models.inline_object13 import InlineObject13  # noqa: E501
from openapi_server.models.inline_object14 import InlineObject14  # noqa: E501
from openapi_server.models.inline_object15 import InlineObject15  # noqa: E501
from openapi_server.models.inline_object16 import InlineObject16  # noqa: E501
from openapi_server.models.inline_object2 import InlineObject2  # noqa: E501
from openapi_server.models.inline_object3 import InlineObject3  # noqa: E501
from openapi_server.models.inline_object4 import InlineObject4  # noqa: E501
from openapi_server.models.inline_object5 import InlineObject5  # noqa: E501
from openapi_server.models.inline_object6 import InlineObject6  # noqa: E501
from openapi_server.models.inline_object7 import InlineObject7  # noqa: E501
from openapi_server.models.inline_object8 import InlineObject8  # noqa: E501
from openapi_server.models.inline_object9 import InlineObject9  # noqa: E501
from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from openapi_server.models.inline_response2002 import InlineResponse2002  # noqa: E501
from openapi_server.models.inline_response2003 import InlineResponse2003  # noqa: E501
from openapi_server.models.inline_response2004 import InlineResponse2004  # noqa: E501
from openapi_server.models.inline_response2005 import InlineResponse2005  # noqa: E501
from openapi_server.models.trip_response import TripResponse  # noqa: E501
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from openapi_server import util


def add_fleet_address(access_token, address_param):  # noqa: E501
    """/fleet/add_address

    This method adds an address book entry to the specified group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_param: 
    :type address_param: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        address_param = InlineObject2.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_organization_addresses(access_token, addresses):  # noqa: E501
    """/addresses

    Add one or more addresses to the organization # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param addresses: 
    :type addresses: dict | bytes

    :rtype: List[Address]
    """
    if connexion.request.is_json:
        addresses = InlineObject.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_dispatch_route(access_token, create_dispatch_route_params):  # noqa: E501
    """/fleet/dispatch/routes

    Create a new dispatch route. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param create_dispatch_route_params: 
    :type create_dispatch_route_params: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        create_dispatch_route_params = DispatchRouteCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_driver(access_token, create_driver_param):  # noqa: E501
    """/fleet/drivers/create

    Create a new driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param create_driver_param: Driver creation body
    :type create_driver_param: dict | bytes

    :rtype: Driver
    """
    if connexion.request.is_json:
        create_driver_param = DriverForCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

    Create a new dispatch route for the driver with driver_id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with the associated routes.
    :type driver_id: int
    :param create_dispatch_route_params: 
    :type create_dispatch_route_params: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        create_dispatch_route_params = DispatchRouteCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_driver_document(access_token, driver_id, create_document_params):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+}/documents

    Create a driver document for the given driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver for whom the document is created.
    :type driver_id: int
    :param create_document_params: To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    :type create_document_params: dict | bytes

    :rtype: Document
    """
    if connexion.request.is_json:
        create_document_params = DocumentCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_dvir(access_token, create_dvir_param):  # noqa: E501
    """/fleet/maintenance/dvirs

    Create a new dvir, marking a vehicle or trailer safe or unsafe. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param create_dvir_param: 
    :type create_dvir_param: dict | bytes

    :rtype: DvirBase
    """
    if connexion.request.is_json:
        create_dvir_param = InlineObject12.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params):  # noqa: E501
    """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

    Create a new dispatch route for the vehicle with vehicle_id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param create_dispatch_route_params: 
    :type create_dispatch_route_params: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        create_dispatch_route_params = DispatchRouteCreate.from_dict(connexion.request.get_json())  # noqa: E501
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


def delete_organization_address(access_token, address_id):  # noqa: E501
    """/addresses/{addressId}

    Delete an address. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_id: ID of the address/geofence
    :type address_id: int

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

    :rtype: List[DispatchRoute]
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


def get_asset_location(access_token, asset_id, start_ms, end_ms):  # noqa: E501
    """/fleet/assets/{assetId:[0-9]+}/locations

    Fetch the historical locations for the asset. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    :rtype: List[object]
    """
    return 'do some magic!'


def get_asset_reefer(access_token, asset_id, start_ms, end_ms):  # noqa: E501
    """/fleet/assets/{assetId:[0-9]+}/reefer

    Fetch the reefer-specific stats of an asset. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

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

    :rtype: List[DispatchRoute]
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

    :rtype: List[DispatchRoute]
    """
    return 'do some magic!'


def get_driver_by_id(access_token, driver_id_or_external_id):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Fetch driver by id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    :rtype: Driver
    """
    return 'do some magic!'


def get_driver_document_types_by_org_id():  # noqa: E501
    """/fleet/drivers/document_types

    Fetch all of the document types. # noqa: E501


    :rtype: List[DocumentType]
    """
    return 'do some magic!'


def get_driver_documents_by_org_id(access_token, end_ms=None, duration_ms=None):  # noqa: E501
    """/fleet/drivers/documents

    Fetch all of the documents. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param end_ms: Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
    :type end_ms: int
    :param duration_ms: Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
    :type duration_ms: int

    :rtype: List[Document]
    """
    return 'do some magic!'


def get_driver_safety_score(driver_id, access_token, start_ms, end_ms):  # noqa: E501
    """/fleet/drivers/{driverId:[0-9]+}/safety/score

    Fetch the safety score for the driver. # noqa: E501

    :param driver_id: ID of the driver
    :type driver_id: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

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


def get_fleet_drivers(access_token, group_drivers_param):  # noqa: E501
    """/fleet/drivers

    Get all the drivers for the specified group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_drivers_param: 
    :type group_drivers_param: dict | bytes

    :rtype: DriversResponse
    """
    if connexion.request.is_json:
        group_drivers_param = InlineObject3.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

    Get summarized daily HOS charts for a specified driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with HOS logs.
    :type driver_id: int
    :param hos_logs_param: 
    :type hos_logs_param: dict | bytes

    :rtype: DriverDailyLogResponse
    """
    if connexion.request.is_json:
        hos_logs_param = InlineObject6.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_drivers_summary(access_token, drivers_summary_param, snap_to_day_bounds=None):  # noqa: E501
    """/fleet/drivers/summary

    Get the distance and time each driver in an organization has driven in a given time period. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param drivers_summary_param: 
    :type drivers_summary_param: dict | bytes
    :param snap_to_day_bounds: Snap query result to HOS day boundaries.
    :type snap_to_day_bounds: bool

    :rtype: DriversSummaryResponse
    """
    if connexion.request.is_json:
        drivers_summary_param = InlineObject5.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param):  # noqa: E501
    """/fleet/hos_authentication_logs

    Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hos_authentication_logs_param: 
    :type hos_authentication_logs_param: dict | bytes

    :rtype: HosAuthenticationLogsResponse
    """
    if connexion.request.is_json:
        hos_authentication_logs_param = InlineObject7.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_hos_logs(access_token, hos_logs_param):  # noqa: E501
    """/fleet/hos_logs

    Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hos_logs_param: 
    :type hos_logs_param: dict | bytes

    :rtype: HosLogsResponse
    """
    if connexion.request.is_json:
        hos_logs_param = InlineObject8.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_hos_logs_summary(access_token, hos_logs_param):  # noqa: E501
    """/fleet/hos_logs_summary

    Get the current HOS status for all drivers in the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hos_logs_param: 
    :type hos_logs_param: dict | bytes

    :rtype: HosLogsSummaryResponse
    """
    if connexion.request.is_json:
        hos_logs_param = InlineObject9.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_locations(access_token, group_param):  # noqa: E501
    """/fleet/locations

    Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    :rtype: InlineResponse2003
    """
    if connexion.request.is_json:
        group_param = InlineObject11.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_maintenance_list(access_token, group_param):  # noqa: E501
    """/fleet/maintenance/list

    Get list of the vehicles with any engine faults or check light data. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    :rtype: InlineResponse2004
    """
    if connexion.request.is_json:
        group_param = InlineObject13.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_fleet_trips(access_token, trips_param):  # noqa: E501
    """/fleet/trips

    Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param trips_param: 
    :type trips_param: dict | bytes

    :rtype: TripResponse
    """
    if connexion.request.is_json:
        trips_param = InlineObject15.from_dict(connexion.request.get_json())  # noqa: E501
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


def get_organization_address(access_token, address_id):  # noqa: E501
    """/addresses/{addressId}

    Fetch an address by its id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_id: ID of the address/geofence
    :type address_id: int

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


def get_vehicle_harsh_event(vehicle_id, access_token, timestamp):  # noqa: E501
    """/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

    Fetch harsh event details for a vehicle. # noqa: E501

    :param vehicle_id: ID of the vehicle
    :type vehicle_id: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param timestamp: Timestamp in milliseconds representing the timestamp of a harsh event.
    :type timestamp: int

    :rtype: VehicleHarshEventResponse
    """
    return 'do some magic!'


def get_vehicle_locations(access_token, vehicle_id, start_ms, end_ms):  # noqa: E501
    """/fleet/vehicles/{vehicle_id:[0-9]+}/locations

    Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
    :type start_ms: int
    :param end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
    :type end_ms: int

    :rtype: List[FleetVehicleLocation]
    """
    return 'do some magic!'


def get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms):  # noqa: E501
    """/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

    Fetch the safety score for the vehicle. # noqa: E501

    :param vehicle_id: ID of the vehicle
    :type vehicle_id: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    :rtype: VehicleSafetyScoreResponse
    """
    return 'do some magic!'


def get_vehicle_stats(access_token, start_ms, end_ms, series=None, tag_ids=None, starting_after=None, ending_before=None, limit=None):  # noqa: E501
    """/fleet/vehicles/stats

    Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param start_ms: Time in Unix epoch milliseconds for the start of the query.
    :type start_ms: int
    :param end_ms: Time in Unix epoch milliseconds for the end of the query.
    :type end_ms: int
    :param series: Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
    :type series: str
    :param tag_ids: Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3
    :type tag_ids: str
    :param starting_after: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
    :type starting_after: str
    :param ending_before: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
    :type ending_before: str
    :param limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
    :type limit: int

    :rtype: InlineResponse2005
    """
    return 'do some magic!'


def get_vehicles_locations(access_token, start_ms, end_ms):  # noqa: E501
    """/fleet/vehicles/locations

    Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
    :type start_ms: int
    :param end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
    :type end_ms: int

    :rtype: List[object]
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


def list_fleet(access_token, group_param, starting_after=None, ending_before=None, limit=None):  # noqa: E501
    """/fleet/list

    Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes
    :param starting_after: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.
    :type starting_after: str
    :param ending_before: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.
    :type ending_before: str
    :param limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.
    :type limit: int

    :rtype: InlineResponse2002
    """
    if connexion.request.is_json:
        group_param = InlineObject10.from_dict(connexion.request.get_json())  # noqa: E501
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
        data = InlineObject16.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivate_driver_param):  # noqa: E501
    """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Reactivate the inactive driver having id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str
    :param reactivate_driver_param: 
    :type reactivate_driver_param: dict | bytes

    :rtype: Driver
    """
    if connexion.request.is_json:
        reactivate_driver_param = InlineObject4.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params):  # noqa: E501
    """/fleet/dispatch/routes/{route_id:[0-9]+}/

    Update a dispatch route and its associated jobs. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int
    :param update_dispatch_route_params: 
    :type update_dispatch_route_params: dict | bytes

    :rtype: DispatchRoute
    """
    if connexion.request.is_json:
        update_dispatch_route_params = DispatchRoute.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_organization_address(access_token, address_id, address):  # noqa: E501
    """/addresses/{addressId}

    Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_id: ID of the address/geofence
    :type address_id: int
    :param address: 
    :type address: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        address = InlineObject1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_vehicles(access_token, vehicle_update_param):  # noqa: E501
    """/fleet/set_data

    This method enables the mutation of metadata for vehicles in the Samsara Cloud. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_update_param: 
    :type vehicle_update_param: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        vehicle_update_param = InlineObject14.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
