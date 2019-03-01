# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.user import User  # noqa: E501
from samsara.models.user_role import UserRole  # noqa: E501
from samsara.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_delete_user_by_id(self):
        """Test case for delete_user_by_id

        /users/{userId:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/users/{userId}'.format(userId=789),
            method='DELETE',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_by_id(self):
        """Test case for get_user_by_id

        /users/{userId:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/users/{userId}'.format(userId=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_user_roles(self):
        """Test case for list_user_roles

        /user_roles
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/user_roles',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_users(self):
        """Test case for list_users

        /users
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/users',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
