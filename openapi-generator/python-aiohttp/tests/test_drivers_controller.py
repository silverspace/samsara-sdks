# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.driver import Driver
from openapi_server.models.driver_for_create import DriverForCreate
from openapi_server.models.inline_object4 import InlineObject4


async def test_create_driver(client):
    """Test case for create_driver

    /fleet/drivers/create
    """
    create_driver_param = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers/create',
        headers=headers,
        json=create_driver_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_deactivate_driver(client):
    """Test case for deactivate_driver

    /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_deactivated_drivers(client):
    """Test case for get_all_deactivated_drivers

    /fleet/drivers/inactive
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/inactive',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_deactivated_driver_by_id(client):
    """Test case for get_deactivated_driver_by_id

    /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_driver_by_id(client):
    """Test case for get_driver_by_id

    /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_reactivate_driver_by_id(client):
    """Test case for reactivate_driver_by_id

    /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    reactivate_driver_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PUT',
        path='/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        json=reactivate_driver_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

