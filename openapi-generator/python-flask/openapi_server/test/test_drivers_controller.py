# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.driver import Driver  # noqa: E501
from openapi_server.models.driver_for_create import DriverForCreate  # noqa: E501
from openapi_server.models.inline_object4 import InlineObject4  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDriversController(BaseTestCase):
    """DriversController integration test stubs"""

    def test_create_driver(self):
        """Test case for create_driver

        /fleet/drivers/create
        """
        create_driver_param = null
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/create',
            method='POST',
            headers=headers,
            data=json.dumps(create_driver_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deactivate_driver(self):
        """Test case for deactivate_driver

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_deactivated_drivers(self):
        """Test case for get_all_deactivated_drivers

        /fleet/drivers/inactive
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/inactive',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_deactivated_driver_by_id(self):
        """Test case for get_deactivated_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_by_id(self):
        """Test case for get_driver_by_id

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reactivate_driver_by_id(self):
        """Test case for reactivate_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        reactivate_driver_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(reactivate_driver_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
