from typing import List, Dict
from aiohttp import web

from openapi_server.models.data_input_history_response import DataInputHistoryResponse
from openapi_server.models.inline_object17 import InlineObject17
from openapi_server.models.inline_object18 import InlineObject18
from openapi_server.models.inline_response2006 import InlineResponse2006
from openapi_server.models.inline_response2007 import InlineResponse2007
from openapi_server.models.machine_history_response import MachineHistoryResponse
from openapi_server import util


async def get_all_data_inputs(request: web.Request, access_token, group_id=None, start_ms=None, end_ms=None) -> web.Response:
    """/industrial/data

    Fetch all of the data inputs for a group.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int
    :param start_ms: Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    :type start_ms: int
    :param end_ms: Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_data_input(request: web.Request, access_token, data_input_id, start_ms=None, end_ms=None) -> web.Response:
    """/industrial/data/{data_input_id:[0-9]+}

    Fetch datapoints from a given data input.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param data_input_id: ID of the data input
    :type data_input_id: int
    :param start_ms: Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    :type start_ms: int
    :param end_ms: Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    :type end_ms: int

    """
    return web.Response(status=200)


async def get_machines(request: web.Request, access_token, group_param) -> web.Response:
    """/machines/list

    Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    """
    group_param = InlineObject18.from_dict(group_param)
    return web.Response(status=200)


async def get_machines_history(request: web.Request, access_token, history_param) -> web.Response:
    """/machines/history

    Get historical data for machine objects. This method returns a set of historical data for all machines in a group

    :param access_token: Samsara API access token.
    :type access_token: str
    :param history_param: 
    :type history_param: dict | bytes

    """
    history_param = InlineObject17.from_dict(history_param)
    return web.Response(status=200)
