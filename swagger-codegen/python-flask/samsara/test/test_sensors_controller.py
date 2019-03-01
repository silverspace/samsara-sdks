# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

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
from samsara.test import BaseTestCase


class TestSensorsController(BaseTestCase):
    """SensorsController integration test stubs"""

    def test_get_sensors(self):
        """Test case for get_sensors

        /sensors/list
        """
        groupParam = GroupParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/sensors/list',
            method='POST',
            data=json.dumps(groupParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_cargo(self):
        """Test case for get_sensors_cargo

        /sensors/cargo
        """
        sensorParam = SensorParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/sensors/cargo',
            method='POST',
            data=json.dumps(sensorParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_door(self):
        """Test case for get_sensors_door

        /sensors/door
        """
        sensorParam = SensorParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/sensors/door',
            method='POST',
            data=json.dumps(sensorParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_history(self):
        """Test case for get_sensors_history

        /sensors/history
        """
        historyParam = HistoryParam1()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/sensors/history',
            method='POST',
            data=json.dumps(historyParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_humidity(self):
        """Test case for get_sensors_humidity

        /sensors/humidity
        """
        sensorParam = SensorParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/sensors/humidity',
            method='POST',
            data=json.dumps(sensorParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sensors_temperature(self):
        """Test case for get_sensors_temperature

        /sensors/temperature
        """
        sensorParam = SensorParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/sensors/temperature',
            method='POST',
            data=json.dumps(sensorParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
