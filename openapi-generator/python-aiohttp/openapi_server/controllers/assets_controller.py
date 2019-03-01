from typing import List, Dict
from aiohttp import web

from openapi_server.models.asset_reefer_response import AssetReeferResponse
from openapi_server.models.inline_response200 import InlineResponse200
from openapi_server.models.inline_response2001 import InlineResponse2001
from openapi_server import util


async def get_all_asset_current_locations(request: web.Request, access_token, group_id=None) -> web.Response:
    """/fleet/assets/locations

    Fetch current locations of all assets for the group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    """
    return web.Response(status=200)


async def get_all_assets(request: web.Request, access_token, group_id=None) -> web.Response:
    """/fleet/assets

    Fetch all of the assets for the group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    """
    return web.Response(status=200)


async def get_asset_location(request: web.Request, access_token, asset_id, start_ms, end_ms) -> web.Response:
    """/fleet/assets/{assetId:[0-9]+}/locations

    Fetch the historical locations for the asset.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_asset_reefer(request: web.Request, access_token, asset_id, start_ms, end_ms) -> web.Response:
    """/fleet/assets/{assetId:[0-9]+}/reefer

    Fetch the reefer-specific stats of an asset.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    """
    return web.Response(status=200)
