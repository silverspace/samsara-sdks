from typing import List, Dict
from aiohttp import web

from openapi_server.models.all_route_job_updates import AllRouteJobUpdates
from openapi_server.models.dispatch_route import DispatchRoute
from openapi_server.models.dispatch_route_create import DispatchRouteCreate
from openapi_server.models.dispatch_route_history import DispatchRouteHistory
from openapi_server import util


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


async def delete_dispatch_route_by_id(request: web.Request, access_token, route_id) -> web.Response:
    """/fleet/dispatch/routes/{route_id:[0-9]+}/

    Delete a dispatch route and its associated jobs.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param route_id: ID of the dispatch route.
    :type route_id: int

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
