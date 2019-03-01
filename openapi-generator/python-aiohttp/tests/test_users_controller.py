# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.user import User
from openapi_server.models.user_role import UserRole


async def test_delete_user_by_id(client):
    """Test case for delete_user_by_id

    /users/{userId:[0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/users/{user_id}'.format(user_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_user_by_id(client):
    """Test case for get_user_by_id

    /users/{userId:[0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/users/{user_id}'.format(user_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_list_user_roles(client):
    """Test case for list_user_roles

    /user_roles
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/user_roles',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_list_users(client):
    """Test case for list_users

    /users
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/users',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

