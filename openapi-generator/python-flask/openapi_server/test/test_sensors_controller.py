# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

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
from openapi_server.test import BaseTestCase


class TestSensorsController(BaseTestCase):
    """SensorsController integration test stubs"""

    def test_get_sensors(self):
        """Test case for get_sensors

        /sensors/list
        """
        group_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/sensors/list',
            method='POST',
            headers=headers,
            data=json.dumps(group_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_cargo(self):
        """Test case for get_sensors_cargo

        /sensors/cargo
        """
        sensor_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/sensors/cargo',
            method='POST',
            headers=headers,
            data=json.dumps(sensor_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_door(self):
        """Test case for get_sensors_door

        /sensors/door
        """
        sensor_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/sensors/door',
            method='POST',
            headers=headers,
            data=json.dumps(sensor_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_history(self):
        """Test case for get_sensors_history

        /sensors/history
        """
        history_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/sensors/history',
            method='POST',
            headers=headers,
            data=json.dumps(history_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_humidity(self):
        """Test case for get_sensors_humidity

        /sensors/humidity
        """
        sensor_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/sensors/humidity',
            method='POST',
            headers=headers,
            data=json.dumps(sensor_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_temperature(self):
        """Test case for get_sensors_temperature

        /sensors/temperature
        """
        sensor_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/sensors/temperature',
            method='POST',
            headers=headers,
            data=json.dumps(sensor_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
