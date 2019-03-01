# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.user import User  # noqa: E501
from openapi_server.models.user_role import UserRole  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_delete_user_by_id(self):
        """Test case for delete_user_by_id

        /users/{userId:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/users/{user_id}'.format(user_id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_by_id(self):
        """Test case for get_user_by_id

        /users/{userId:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/users/{user_id}'.format(user_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_user_roles(self):
        """Test case for list_user_roles

        /user_roles
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/user_roles',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_users(self):
        """Test case for list_users

        /users
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/users',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
