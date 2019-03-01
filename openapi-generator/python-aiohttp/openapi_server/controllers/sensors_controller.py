from typing import List, Dict
from aiohttp import web

from openapi_server.models.cargo_response import CargoResponse
from openapi_server.models.door_response import DoorResponse
from openapi_server.models.humidity_response import HumidityResponse
from openapi_server.models.inline_object19 import InlineObject19
from openapi_server.models.inline_object20 import InlineObject20
from openapi_server.models.inline_object21 import InlineObject21
from openapi_server.models.inline_object22 import InlineObject22
from openapi_server.models.inline_object23 import InlineObject23
from openapi_server.models.inline_object24 import InlineObject24
from openapi_server.models.inline_response2008 import InlineResponse2008
from openapi_server.models.sensor_history_response import SensorHistoryResponse
from openapi_server.models.temperature_response import TemperatureResponse
from openapi_server import util


async def get_sensors(request: web.Request, access_token, group_param) -> web.Response:
    """/sensors/list

    Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    """
    group_param = InlineObject23.from_dict(group_param)
    return web.Response(status=200)


async def get_sensors_cargo(request: web.Request, access_token, sensor_param) -> web.Response:
    """/sensors/cargo

    Get cargo monitor status (empty / full) for requested sensors.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    """
    sensor_param = InlineObject19.from_dict(sensor_param)
    return web.Response(status=200)


async def get_sensors_door(request: web.Request, access_token, sensor_param) -> web.Response:
    """/sensors/door

    Get door monitor status (closed / open) for requested sensors.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    """
    sensor_param = InlineObject20.from_dict(sensor_param)
    return web.Response(status=200)


async def get_sensors_history(request: web.Request, access_token, history_param) -> web.Response:
    """/sensors/history

    Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param history_param: 
    :type history_param: dict | bytes

    """
    history_param = InlineObject21.from_dict(history_param)
    return web.Response(status=200)


async def get_sensors_humidity(request: web.Request, access_token, sensor_param) -> web.Response:
    """/sensors/humidity

    Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    """
    sensor_param = InlineObject22.from_dict(sensor_param)
    return web.Response(status=200)


async def get_sensors_temperature(request: web.Request, access_token, sensor_param) -> web.Response:
    """/sensors/temperature

    Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param sensor_param: 
    :type sensor_param: dict | bytes

    """
    sensor_param = InlineObject24.from_dict(sensor_param)
    return web.Response(status=200)
