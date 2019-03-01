# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.asset_reefer_response import AssetReeferResponse
from openapi_server.models.inline_response200 import InlineResponse200
from openapi_server.models.inline_response2001 import InlineResponse2001


async def test_get_all_asset_current_locations(client):
    """Test case for get_all_asset_current_locations

    /fleet/assets/locations
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets/locations',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_assets(client):
    """Test case for get_all_assets

    /fleet/assets
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_asset_location(client):
    """Test case for get_asset_location

    /fleet/assets/{assetId:[0-9]+}/locations
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets/{asset_id}/locations'.format(asset_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_asset_reefer(client):
    """Test case for get_asset_reefer

    /fleet/assets/{assetId:[0-9]+}/reefer
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets/{asset_id}/reefer'.format(asset_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

