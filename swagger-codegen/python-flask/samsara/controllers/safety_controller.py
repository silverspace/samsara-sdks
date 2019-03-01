import connexion
import six

from samsara.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from samsara.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from samsara import util


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
