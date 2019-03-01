# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from samsara.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from samsara.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from samsara.test import BaseTestCase


class TestSafetyController(BaseTestCase):
    """SafetyController integration test stubs"""

    def test_get_driver_safety_score(self):
        """Test case for get_driver_safety_score

        /fleet/drivers/{driverId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/drivers/{driverId}/safety/score'.format(driverId=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_harsh_event(self):
        """Test case for get_vehicle_harsh_event

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        """
        query_string = [('access_token', 'access_token_example'),
                        ('timestamp', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicleId}/safety/harsh_event'.format(vehicleId=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_safety_score(self):
        """Test case for get_vehicle_safety_score

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicleId}/safety/score'.format(vehicleId=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
