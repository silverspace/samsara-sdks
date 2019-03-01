import connexion
import six

from samsara.models.cargo_response import CargoResponse  # noqa: E501
from samsara.models.door_response import DoorResponse  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.group_param import GroupParam  # noqa: E501
from samsara.models.history_param1 import HistoryParam1  # noqa: E501
from samsara.models.humidity_response import HumidityResponse  # noqa: E501
from samsara.models.inline_response2008 import InlineResponse2008  # noqa: E501
from samsara.models.sensor_history_response import SensorHistoryResponse  # noqa: E501
from samsara.models.sensor_param import SensorParam  # noqa: E501
from samsara.models.temperature_response import TemperatureResponse  # noqa: E501
from samsara import util


def get_sensors(access_token, groupParam):  # noqa: E501
    """/sensors/list

    Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param groupParam: Group ID to query.
    :type groupParam: dict | bytes

    :rtype: InlineResponse2008
    """
    if connexion.request.is_json:
        groupParam = GroupParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_cargo(access_token, sensorParam):  # noqa: E501
    """/sensors/cargo

    Get cargo monitor status (empty / full) for requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensorParam: Group ID and list of sensor IDs to query.
    :type sensorParam: dict | bytes

    :rtype: CargoResponse
    """
    if connexion.request.is_json:
        sensorParam = SensorParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_door(access_token, sensorParam):  # noqa: E501
    """/sensors/door

    Get door monitor status (closed / open) for requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensorParam: Group ID and list of sensor IDs to query.
    :type sensorParam: dict | bytes

    :rtype: DoorResponse
    """
    if connexion.request.is_json:
        sensorParam = SensorParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_history(access_token, historyParam):  # noqa: E501
    """/sensors/history

    Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param historyParam: Group ID, time range and resolution, and list of sensor ID, field pairs to query.
    :type historyParam: dict | bytes

    :rtype: SensorHistoryResponse
    """
    if connexion.request.is_json:
        historyParam = HistoryParam1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_humidity(access_token, sensorParam):  # noqa: E501
    """/sensors/humidity

    Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensorParam: Group ID and list of sensor IDs to query.
    :type sensorParam: dict | bytes

    :rtype: HumidityResponse
    """
    if connexion.request.is_json:
        sensorParam = SensorParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_temperature(access_token, sensorParam):  # noqa: E501
    """/sensors/temperature

    Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensorParam: Group ID and list of sensor IDs to query.
    :type sensorParam: dict | bytes

    :rtype: TemperatureResponse
    """
    if connexion.request.is_json:
        sensorParam = SensorParam.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
