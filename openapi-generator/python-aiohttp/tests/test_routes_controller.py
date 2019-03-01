# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.all_route_job_updates import AllRouteJobUpdates
from openapi_server.models.dispatch_route import DispatchRoute
from openapi_server.models.dispatch_route_create import DispatchRouteCreate
from openapi_server.models.dispatch_route_history import DispatchRouteHistory


async def test_create_dispatch_route(client):
    """Test case for create_dispatch_route

    /fleet/dispatch/routes
    """
    create_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/dispatch/routes',
        headers=headers,
        json=create_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_driver_dispatch_route(client):
    """Test case for create_driver_dispatch_route

    /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    """
    create_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=56),
        headers=headers,
        json=create_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_vehicle_dispatch_route(client):
    """Test case for create_vehicle_dispatch_route

    /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    """
    create_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=56),
        headers=headers,
        json=create_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_dispatch_route_by_id(client):
    """Test case for delete_dispatch_route_by_id

    /fleet/dispatch/routes/{route_id:[0-9]+}/
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_fetch_all_dispatch_routes(client):
    """Test case for fetch_all_dispatch_routes

    /fleet/dispatch/routes
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56),
                    ('end_time', 56),
                    ('duration', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_fetch_all_route_job_updates(client):
    """Test case for fetch_all_route_job_updates

    /fleet/dispatch/routes/job_updates
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56),
                    ('sequence_id', 'sequence_id_example'),
                    ('include', 'include_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes/job_updates',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_route_by_id(client):
    """Test case for get_dispatch_route_by_id

    /fleet/dispatch/routes/{route_id:[0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_route_history(client):
    """Test case for get_dispatch_route_history

    /fleet/dispatch/routes/{route_id:[0-9]+}/history
    """
    params = [('access_token', 'access_token_example'),
                    ('start_time', 56),
                    ('end_time', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes/{route_id}/history'.format(route_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_routes_by_driver_id(client):
    """Test case for get_dispatch_routes_by_driver_id

    /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    """
    params = [('access_token', 'access_token_example'),
                    ('end_time', 56),
                    ('duration', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_routes_by_vehicle_id(client):
    """Test case for get_dispatch_routes_by_vehicle_id

    /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    """
    params = [('access_token', 'access_token_example'),
                    ('end_time', 56),
                    ('duration', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_dispatch_route_by_id(client):
    """Test case for update_dispatch_route_by_id

    /fleet/dispatch/routes/{route_id:[0-9]+}/
    """
    update_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PUT',
        path='/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
        headers=headers,
        json=update_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

