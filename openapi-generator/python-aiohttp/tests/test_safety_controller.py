# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse


async def test_get_driver_safety_score(client):
    """Test case for get_driver_safety_score

    /fleet/drivers/{driverId:[0-9]+}/safety/score
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/{driver_id}/safety/score'.format(driver_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vehicle_harsh_event(client):
    """Test case for get_vehicle_harsh_event

    /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    """
    params = [('access_token', 'access_token_example'),
                    ('timestamp', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id}/safety/harsh_event'.format(vehicle_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vehicle_safety_score(client):
    """Test case for get_vehicle_safety_score

    /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id}/safety/score'.format(vehicle_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

