import connexion
import six

from samsara.models.all_route_job_updates import AllRouteJobUpdates  # noqa: E501
from samsara.models.dispatch_route import DispatchRoute  # noqa: E501
from samsara.models.dispatch_route_create import DispatchRouteCreate  # noqa: E501
from samsara.models.dispatch_route_history import DispatchRouteHistory  # noqa: E501
from samsara.models.dispatch_routes import DispatchRoutes  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara import util


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
