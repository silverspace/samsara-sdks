import connexion
import six

from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from openapi_server import util


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
