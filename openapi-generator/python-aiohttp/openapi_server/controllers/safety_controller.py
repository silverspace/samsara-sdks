from typing import List, Dict
from aiohttp import web

from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse
from openapi_server import util


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
