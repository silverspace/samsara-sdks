from typing import List, Dict
from aiohttp import web

from openapi_server.models.address import Address
from openapi_server.models.all_route_job_updates import AllRouteJobUpdates
from openapi_server.models.asset_reefer_response import AssetReeferResponse
from openapi_server.models.contact import Contact
from openapi_server.models.dispatch_route import DispatchRoute
from openapi_server.models.dispatch_route_create import DispatchRouteCreate
from openapi_server.models.dispatch_route_history import DispatchRouteHistory
from openapi_server.models.document import Document
from openapi_server.models.document_create import DocumentCreate
from openapi_server.models.document_type import DocumentType
from openapi_server.models.driver import Driver
from openapi_server.models.driver_daily_log_response import DriverDailyLogResponse
from openapi_server.models.driver_for_create import DriverForCreate
from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse
from openapi_server.models.drivers_response import DriversResponse
from openapi_server.models.drivers_summary_response import DriversSummaryResponse
from openapi_server.models.dvir_base import DvirBase
from openapi_server.models.dvir_list_response import DvirListResponse
from openapi_server.models.fleet_vehicle_location import FleetVehicleLocation
from openapi_server.models.fleet_vehicle_response import FleetVehicleResponse
from openapi_server.models.hos_authentication_logs_response import HosAuthenticationLogsResponse
from openapi_server.models.hos_logs_response import HosLogsResponse
from openapi_server.models.hos_logs_summary_response import HosLogsSummaryResponse
from openapi_server.models.inline_object import InlineObject
from openapi_server.models.inline_object1 import InlineObject1
from openapi_server.models.inline_object10 import InlineObject10
from openapi_server.models.inline_object11 import InlineObject11
from openapi_server.models.inline_object12 import InlineObject12
from openapi_server.models.inline_object13 import InlineObject13
from openapi_server.models.inline_object14 import InlineObject14
from openapi_server.models.inline_object15 import InlineObject15
from openapi_server.models.inline_object16 import InlineObject16
from openapi_server.models.inline_object2 import InlineObject2
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
from openapi_server.models.trip_response import TripResponse
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse
from openapi_server import util


async def add_fleet_address(request: web.Request, access_token, address_param) -> web.Response:
    """/fleet/add_address

    This method adds an address book entry to the specified group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_param: 
    :type address_param: dict | bytes

    """
    address_param = InlineObject2.from_dict(address_param)
    return web.Response(status=200)


async def add_organization_addresses(request: web.Request, access_token, addresses) -> web.Response:
    """/addresses

    Add one or more addresses to the organization

    :param access_token: Samsara API access token.
    :type access_token: str
    :param addresses: 
    :type addresses: dict | bytes

    """
    addresses = InlineObject.from_dict(addresses)
    return web.Response(status=200)


async def create_dispatch_route(request: web.Request, access_token, create_dispatch_route_params) -> web.Response:
    """/fleet/dispatch/routes

    Create a new dispatch route.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param create_dispatch_route_params: 
    :type create_dispatch_route_params: dict | bytes

    """
    create_dispatch_route_params = DispatchRouteCreate.from_dict(create_dispatch_route_params)
    return web.Response(status=200)


async def create_driver(request: web.Request, access_token, create_driver_param) -> web.Response:
    """/fleet/drivers/create

    Create a new driver.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param create_driver_param: Driver creation body
    :type create_driver_param: dict | bytes

    """
    create_driver_param = DriverForCreate.from_dict(create_driver_param)
    return web.Response(status=200)


async def create_driver_dispatch_route(request: web.Request, access_token, driver_id, create_dispatch_route_params) -> web.Response:
    """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

    Create a new dispatch route for the driver with driver_id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with the associated routes.
    :type driver_id: int
    :param create_dispatch_route_params: 
    :type create_dispatch_route_params: dict | bytes

    """
    create_dispatch_route_params = DispatchRouteCreate.from_dict(create_dispatch_route_params)
    return web.Response(status=200)


async def create_driver_document(request: web.Request, access_token, driver_id, create_document_params) -> web.Response:
    """/fleet/drivers/{driver_id:[0-9]+}/documents

    Create a driver document for the given driver.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver for whom the document is created.
    :type driver_id: int
    :param create_document_params: To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
    :type create_document_params: dict | bytes

    """
    create_document_params = DocumentCreate.from_dict(create_document_params)
    return web.Response(status=200)


async def create_dvir(request: web.Request, access_token, create_dvir_param) -> web.Response:
    """/fleet/maintenance/dvirs

    Create a new dvir, marking a vehicle or trailer safe or unsafe.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param create_dvir_param: 
    :type create_dvir_param: dict | bytes

    """
    create_dvir_param = InlineObject12.from_dict(create_dvir_param)
    return web.Response(status=200)


async def create_vehicle_dispatch_route(request: web.Request, access_token, vehicle_id, create_dispatch_route_params) -> web.Response:
    """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

    Create a new dispatch route for the vehicle with vehicle_id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param create_dispatch_route_params: 
    :type create_dispatch_route_params: dict | bytes

    """
    create_dispatch_route_params = DispatchRouteCreate.from_dict(create_dispatch_route_params)
    return web.Response(status=200)


async def deactivate_driver(request: web.Request, access_token, driver_id_or_external_id) -> web.Response:
    """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Deactivate a driver with the given id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    """
    return web.Response(status=200)


async def delete_dispatch_route_by_id(request: web.Request, access_token, route_id) -> web.Response:
    """/fleet/dispatch/routes/{route_id:[0-9]+}/

    Delete a dispatch route and its associated jobs.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int

    """
    return web.Response(status=200)


async def delete_organization_address(request: web.Request, access_token, address_id) -> web.Response:
    """/addresses/{addressId}

    Delete an address.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_id: ID of the address/geofence
    :type address_id: int

    """
    return web.Response(status=200)


async def fetch_all_dispatch_routes(request: web.Request, access_token, group_id=None, end_time=None, duration=None) -> web.Response:
    """/fleet/dispatch/routes

    Fetch all of the dispatch routes for the group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int
    :param end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    :type end_time: int
    :param duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    :type duration: int

    """
    return web.Response(status=200)


async def fetch_all_route_job_updates(request: web.Request, access_token, group_id=None, sequence_id=None, include=None) -> web.Response:
    """/fleet/dispatch/routes/job_updates

    Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int
    :param sequence_id: Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
    :type sequence_id: str
    :param include: Optionally set include&#x3D;route to include route object in response payload.
    :type include: str

    """
    return web.Response(status=200)


async def get_all_asset_current_locations(request: web.Request, access_token, group_id=None) -> web.Response:
    """/fleet/assets/locations

    Fetch current locations of all assets for the group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    """
    return web.Response(status=200)


async def get_all_assets(request: web.Request, access_token, group_id=None) -> web.Response:
    """/fleet/assets

    Fetch all of the assets for the group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    """
    return web.Response(status=200)


async def get_all_deactivated_drivers(request: web.Request, access_token, group_id=None) -> web.Response:
    """/fleet/drivers/inactive

    Fetch all deactivated drivers for the group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    """
    return web.Response(status=200)


async def get_asset_location(request: web.Request, access_token, asset_id, start_ms, end_ms) -> web.Response:
    """/fleet/assets/{assetId:[0-9]+}/locations

    Fetch the historical locations for the asset.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_asset_reefer(request: web.Request, access_token, asset_id, start_ms, end_ms) -> web.Response:
    """/fleet/assets/{assetId:[0-9]+}/reefer

    Fetch the reefer-specific stats of an asset.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_deactivated_driver_by_id(request: web.Request, access_token, driver_id_or_external_id) -> web.Response:
    """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Fetch deactivated driver by id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    """
    return web.Response(status=200)


async def get_dispatch_route_by_id(request: web.Request, access_token, route_id) -> web.Response:
    """/fleet/dispatch/routes/{route_id:[0-9]+}

    Fetch a dispatch route by id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int

    """
    return web.Response(status=200)


async def get_dispatch_route_history(request: web.Request, access_token, route_id, start_time=None, end_time=None) -> web.Response:
    """/fleet/dispatch/routes/{route_id:[0-9]+}/history

    Fetch the history of a dispatch route.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the route with history.
    :type route_id: int
    :param start_time: Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
    :type start_time: int
    :param end_time: Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
    :type end_time: int

    """
    return web.Response(status=200)


async def get_dispatch_routes_by_driver_id(request: web.Request, access_token, driver_id, end_time=None, duration=None) -> web.Response:
    """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

    Fetch all of the dispatch routes for a given driver.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with the associated routes.
    :type driver_id: int
    :param end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    :type end_time: int
    :param duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    :type duration: int

    """
    return web.Response(status=200)


async def get_dispatch_routes_by_vehicle_id(request: web.Request, access_token, vehicle_id, end_time=None, duration=None) -> web.Response:
    """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

    Fetch all of the dispatch routes for a given vehicle.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
    :type end_time: int
    :param duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
    :type duration: int

    """
    return web.Response(status=200)


async def get_driver_by_id(request: web.Request, access_token, driver_id_or_external_id) -> web.Response:
    """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Fetch driver by id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    """
    return web.Response(status=200)


async def get_driver_document_types_by_org_id(request: web.Request, ) -> web.Response:
    """/fleet/drivers/document_types

    Fetch all of the document types.


    """
    return web.Response(status=200)


async def get_driver_documents_by_org_id(request: web.Request, access_token, end_ms=None, duration_ms=None) -> web.Response:
    """/fleet/drivers/documents

    Fetch all of the documents.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param end_ms: Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
    :type end_ms: int
    :param duration_ms: Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
    :type duration_ms: int

    """
    return web.Response(status=200)


async def get_driver_safety_score(request: web.Request, driver_id, access_token, start_ms, end_ms) -> web.Response:
    """/fleet/drivers/{driverId:[0-9]+}/safety/score

    Fetch the safety score for the driver.

    :param driver_id: ID of the driver
    :type driver_id: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_dvirs(request: web.Request, access_token, end_ms, duration_ms, group_id=None) -> web.Response:
    """/fleet/maintenance/dvirs

    Get DVIRs for the org within provided time constraints

    :param access_token: Samsara API access token.
    :type access_token: str
    :param end_ms: time in millis until the last dvir log.
    :type end_ms: int
    :param duration_ms: time in millis which corresponds to the duration before the end_ms.
    :type duration_ms: int
    :param group_id: Group ID to query.
    :type group_id: int

    """
    return web.Response(status=200)


async def get_fleet_drivers(request: web.Request, access_token, group_drivers_param) -> web.Response:
    """/fleet/drivers

    Get all the drivers for the specified group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_drivers_param: 
    :type group_drivers_param: dict | bytes

    """
    group_drivers_param = InlineObject3.from_dict(group_drivers_param)
    return web.Response(status=200)


async def get_fleet_drivers_hos_daily_logs(request: web.Request, access_token, driver_id, hos_logs_param) -> web.Response:
    """/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

    Get summarized daily HOS charts for a specified driver.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id: ID of the driver with HOS logs.
    :type driver_id: int
    :param hos_logs_param: 
    :type hos_logs_param: dict | bytes

    """
    hos_logs_param = InlineObject6.from_dict(hos_logs_param)
    return web.Response(status=200)


async def get_fleet_drivers_summary(request: web.Request, access_token, drivers_summary_param, snap_to_day_bounds=None) -> web.Response:
    """/fleet/drivers/summary

    Get the distance and time each driver in an organization has driven in a given time period.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param drivers_summary_param: 
    :type drivers_summary_param: dict | bytes
    :param snap_to_day_bounds: Snap query result to HOS day boundaries.
    :type snap_to_day_bounds: bool

    """
    drivers_summary_param = InlineObject5.from_dict(drivers_summary_param)
    return web.Response(status=200)


async def get_fleet_hos_authentication_logs(request: web.Request, access_token, hos_authentication_logs_param) -> web.Response:
    """/fleet/hos_authentication_logs

    Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hos_authentication_logs_param: 
    :type hos_authentication_logs_param: dict | bytes

    """
    hos_authentication_logs_param = InlineObject7.from_dict(hos_authentication_logs_param)
    return web.Response(status=200)


async def get_fleet_hos_logs(request: web.Request, access_token, hos_logs_param) -> web.Response:
    """/fleet/hos_logs

    Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hos_logs_param: 
    :type hos_logs_param: dict | bytes

    """
    hos_logs_param = InlineObject8.from_dict(hos_logs_param)
    return web.Response(status=200)


async def get_fleet_hos_logs_summary(request: web.Request, access_token, hos_logs_param) -> web.Response:
    """/fleet/hos_logs_summary

    Get the current HOS status for all drivers in the group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param hos_logs_param: 
    :type hos_logs_param: dict | bytes

    """
    hos_logs_param = InlineObject9.from_dict(hos_logs_param)
    return web.Response(status=200)


async def get_fleet_locations(request: web.Request, access_token, group_param) -> web.Response:
    """/fleet/locations

    Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    """
    group_param = InlineObject11.from_dict(group_param)
    return web.Response(status=200)


async def get_fleet_maintenance_list(request: web.Request, access_token, group_param) -> web.Response:
    """/fleet/maintenance/list

    Get list of the vehicles with any engine faults or check light data.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    """
    group_param = InlineObject13.from_dict(group_param)
    return web.Response(status=200)


async def get_fleet_trips(request: web.Request, access_token, trips_param) -> web.Response:
    """/fleet/trips

    Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param trips_param: 
    :type trips_param: dict | bytes

    """
    trips_param = InlineObject15.from_dict(trips_param)
    return web.Response(status=200)


async def get_fleet_vehicle(request: web.Request, access_token, vehicle_id_or_external_id) -> web.Response:
    """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Gets a specific vehicle.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    :type vehicle_id_or_external_id: str

    """
    return web.Response(status=200)


async def get_organization_address(request: web.Request, access_token, address_id) -> web.Response:
    """/addresses/{addressId}

    Fetch an address by its id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_id: ID of the address/geofence
    :type address_id: int

    """
    return web.Response(status=200)


async def get_organization_addresses(request: web.Request, access_token) -> web.Response:
    """/addresses

    Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

    :param access_token: Samsara API access token.
    :type access_token: str

    """
    return web.Response(status=200)


async def get_organization_contact(request: web.Request, access_token, contact_id) -> web.Response:
    """/contacts/{contact_id}

    Fetch a contact by its id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param contact_id: ID of the contact
    :type contact_id: int

    """
    return web.Response(status=200)


async def get_vehicle_harsh_event(request: web.Request, vehicle_id, access_token, timestamp) -> web.Response:
    """/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

    Fetch harsh event details for a vehicle.

    :param vehicle_id: ID of the vehicle
    :type vehicle_id: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param timestamp: Timestamp in milliseconds representing the timestamp of a harsh event.
    :type timestamp: int

    """
    return web.Response(status=200)


async def get_vehicle_locations(request: web.Request, access_token, vehicle_id, start_ms, end_ms) -> web.Response:
    """/fleet/vehicles/{vehicle_id:[0-9]+}/locations

    Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id: ID of the vehicle with the associated routes.
    :type vehicle_id: int
    :param start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
    :type start_ms: int
    :param end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_vehicle_safety_score(request: web.Request, vehicle_id, access_token, start_ms, end_ms) -> web.Response:
    """/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

    Fetch the safety score for the vehicle.

    :param vehicle_id: ID of the vehicle
    :type vehicle_id: int
    :param access_token: Samsara API access token.
    :type access_token: str
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_vehicle_stats(request: web.Request, access_token, start_ms, end_ms, series=None, tag_ids=None, starting_after=None, ending_before=None, limit=None) -> web.Response:
    """/fleet/vehicles/stats

    Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

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

    """
    return web.Response(status=200)


async def get_vehicles_locations(request: web.Request, access_token, start_ms, end_ms) -> web.Response:
    """/fleet/vehicles/locations

    Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
    :type start_ms: int
    :param end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
    :type end_ms: int

    """
    return web.Response(status=200)


async def list_contacts(request: web.Request, access_token) -> web.Response:
    """/contacts

    Fetch all contacts for the organization.

    :param access_token: Samsara API access token.
    :type access_token: str

    """
    return web.Response(status=200)


async def list_fleet(request: web.Request, access_token, group_param, starting_after=None, ending_before=None, limit=None) -> web.Response:
    """/fleet/list

    Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

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

    """
    group_param = InlineObject10.from_dict(group_param)
    return web.Response(status=200)


async def patch_fleet_vehicle(request: web.Request, access_token, vehicle_id_or_external_id, data) -> web.Response:
    """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
    :type vehicle_id_or_external_id: str
    :param data: 
    :type data: dict | bytes

    """
    data = InlineObject16.from_dict(data)
    return web.Response(status=200)


async def reactivate_driver_by_id(request: web.Request, access_token, driver_id_or_external_id, reactivate_driver_param) -> web.Response:
    """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Reactivate the inactive driver having id.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str
    :param reactivate_driver_param: 
    :type reactivate_driver_param: dict | bytes

    """
    reactivate_driver_param = InlineObject4.from_dict(reactivate_driver_param)
    return web.Response(status=200)


async def update_dispatch_route_by_id(request: web.Request, access_token, route_id, update_dispatch_route_params) -> web.Response:
    """/fleet/dispatch/routes/{route_id:[0-9]+}/

    Update a dispatch route and its associated jobs.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int
    :param update_dispatch_route_params: 
    :type update_dispatch_route_params: dict | bytes

    """
    update_dispatch_route_params = DispatchRoute.from_dict(update_dispatch_route_params)
    return web.Response(status=200)


async def update_organization_address(request: web.Request, access_token, address_id, address) -> web.Response:
    """/addresses/{addressId}

    Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param address_id: ID of the address/geofence
    :type address_id: int
    :param address: 
    :type address: dict | bytes

    """
    address = InlineObject1.from_dict(address)
    return web.Response(status=200)


async def update_vehicles(request: web.Request, access_token, vehicle_update_param) -> web.Response:
    """/fleet/set_data

    This method enables the mutation of metadata for vehicles in the Samsara Cloud.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param vehicle_update_param: 
    :type vehicle_update_param: dict | bytes

    """
    vehicle_update_param = InlineObject14.from_dict(vehicle_update_param)
    return web.Response(status=200)
