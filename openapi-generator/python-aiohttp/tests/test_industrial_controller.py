# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.data_input_history_response import DataInputHistoryResponse
from openapi_server.models.inline_object17 import InlineObject17
from openapi_server.models.inline_object18 import InlineObject18
from openapi_server.models.inline_response2006 import InlineResponse2006
from openapi_server.models.inline_response2007 import InlineResponse2007
from openapi_server.models.machine_history_response import MachineHistoryResponse


async def test_get_all_data_inputs(client):
    """Test case for get_all_data_inputs

    /industrial/data
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/industrial/data',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_data_input(client):
    """Test case for get_data_input

    /industrial/data/{data_input_id:[0-9]+}
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/industrial/data/{data_input_id}'.format(data_input_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_machines(client):
    """Test case for get_machines

    /machines/list
    """
    group_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/machines/list',
        headers=headers,
        json=group_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_machines_history(client):
    """Test case for get_machines_history

    /machines/history
    """
    history_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/machines/history',
        headers=headers,
        json=history_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

