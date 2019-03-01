# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSafetyController(BaseTestCase):
    """SafetyController integration test stubs"""

    def test_get_driver_safety_score(self):
        """Test case for get_driver_safety_score

        /fleet/drivers/{driverId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/safety/score'.format(driver_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_harsh_event(self):
        """Test case for get_vehicle_harsh_event

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        """
        query_string = [('access_token', 'access_token_example'),
                        ('timestamp', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/safety/harsh_event'.format(vehicle_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_safety_score(self):
        """Test case for get_vehicle_safety_score

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/safety/score'.format(vehicle_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
