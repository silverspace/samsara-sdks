import connexion
import six

from openapi_server.models.cargo_response import CargoResponse  # noqa: E501
from openapi_server.models.door_response import DoorResponse  # noqa: E501
from openapi_server.models.humidity_response import HumidityResponse  # noqa: E501
from openapi_server.models.inline_object19 import InlineObject19  # noqa: E501
from openapi_server.models.inline_object20 import InlineObject20  # noqa: E501
from openapi_server.models.inline_object21 import InlineObject21  # noqa: E501
from openapi_server.models.inline_object22 import InlineObject22  # noqa: E501
from openapi_server.models.inline_object23 import InlineObject23  # noqa: E501
from openapi_server.models.inline_object24 import InlineObject24  # noqa: E501
from openapi_server.models.inline_response2008 import InlineResponse2008  # noqa: E501
from openapi_server.models.sensor_history_response import SensorHistoryResponse  # noqa: E501
from openapi_server.models.temperature_response import TemperatureResponse  # noqa: E501
from openapi_server import util


def get_sensors(access_token, group_param):  # noqa: E501
    """/sensors/list

    Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    :rtype: InlineResponse2008
    """
    if connexion.request.is_json:
        group_param = InlineObject23.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_cargo(access_token, sensor_param):  # noqa: E501
    """/sensors/cargo

    Get cargo monitor status (empty / full) for requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    :rtype: CargoResponse
    """
    if connexion.request.is_json:
        sensor_param = InlineObject19.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_door(access_token, sensor_param):  # noqa: E501
    """/sensors/door

    Get door monitor status (closed / open) for requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    :rtype: DoorResponse
    """
    if connexion.request.is_json:
        sensor_param = InlineObject20.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_history(access_token, history_param):  # noqa: E501
    """/sensors/history

    Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param history_param: 
    :type history_param: dict | bytes

    :rtype: SensorHistoryResponse
    """
    if connexion.request.is_json:
        history_param = InlineObject21.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_humidity(access_token, sensor_param):  # noqa: E501
    """/sensors/humidity

    Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    :rtype: HumidityResponse
    """
    if connexion.request.is_json:
        sensor_param = InlineObject22.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_sensors_temperature(access_token, sensor_param):  # noqa: E501
    """/sensors/temperature

    Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    :rtype: TemperatureResponse
    """
    if connexion.request.is_json:
        sensor_param = InlineObject24.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
