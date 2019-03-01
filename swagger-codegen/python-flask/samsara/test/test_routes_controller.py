# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from samsara.models.all_route_job_updates import AllRouteJobUpdates  # noqa: E501
from samsara.models.dispatch_route import DispatchRoute  # noqa: E501
from samsara.models.dispatch_route_create import DispatchRouteCreate  # noqa: E501
from samsara.models.dispatch_route_history import DispatchRouteHistory  # noqa: E501
from samsara.models.dispatch_routes import DispatchRoutes  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.test import BaseTestCase


class TestRoutesController(BaseTestCase):
    """RoutesController integration test stubs"""

    def test_create_dispatch_route(self):
        """Test case for create_dispatch_route

        /fleet/dispatch/routes
        """
        createDispatchRouteParams = DispatchRouteCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes',
            method='POST',
            data=json.dumps(createDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_driver_dispatch_route(self):
        """Test case for create_driver_dispatch_route

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        """
        createDispatchRouteParams = DispatchRouteCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=789),
            method='POST',
            data=json.dumps(createDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_vehicle_dispatch_route(self):
        """Test case for create_vehicle_dispatch_route

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        """
        createDispatchRouteParams = DispatchRouteCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=789),
            method='POST',
            data=json.dumps(createDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dispatch_route_by_id(self):
        """Test case for delete_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=789),
            method='DELETE',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_all_dispatch_routes(self):
        """Test case for fetch_all_dispatch_routes

        /fleet/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789),
                        ('end_time', 789),
                        ('duration', 789)]
        response = self.client.open(
            '/v1/fleet/dispatch/routes',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_all_route_job_updates(self):
        """Test case for fetch_all_route_job_updates

        /fleet/dispatch/routes/job_updates
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789),
                        ('sequence_id', 'sequence_id_example'),
                        ('include', 'include_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/job_updates',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_route_by_id(self):
        """Test case for get_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_route_history(self):
        """Test case for get_dispatch_route_history

        /fleet/dispatch/routes/{route_id:[0-9]+}/history
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_time', 789),
                        ('end_time', 789)]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}/history'.format(route_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_routes_by_driver_id(self):
        """Test case for get_dispatch_routes_by_driver_id

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_time', 789),
                        ('duration', 789)]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_routes_by_vehicle_id(self):
        """Test case for get_dispatch_routes_by_vehicle_id

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_time', 789),
                        ('duration', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_dispatch_route_by_id(self):
        """Test case for update_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/
        """
        updateDispatchRouteParams = DispatchRoute()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=789),
            method='PUT',
            data=json.dumps(updateDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
