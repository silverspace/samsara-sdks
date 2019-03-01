# coding: utf-8

import pytest
import json
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


async def test_get_sensors(client):
    """Test case for get_sensors

    /sensors/list
    """
    group_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/sensors/list',
        headers=headers,
        json=group_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_sensors_cargo(client):
    """Test case for get_sensors_cargo

    /sensors/cargo
    """
    sensor_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/sensors/cargo',
        headers=headers,
        json=sensor_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_sensors_door(client):
    """Test case for get_sensors_door

    /sensors/door
    """
    sensor_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/sensors/door',
        headers=headers,
        json=sensor_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_sensors_history(client):
    """Test case for get_sensors_history

    /sensors/history
    """
    history_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/sensors/history',
        headers=headers,
        json=history_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_sensors_humidity(client):
    """Test case for get_sensors_humidity

    /sensors/humidity
    """
    sensor_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/sensors/humidity',
        headers=headers,
        json=sensor_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_sensors_temperature(client):
    """Test case for get_sensors_temperature

    /sensors/temperature
    """
    sensor_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/sensors/temperature',
        headers=headers,
        json=sensor_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

