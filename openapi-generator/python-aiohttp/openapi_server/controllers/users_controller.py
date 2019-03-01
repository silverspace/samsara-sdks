from typing import List, Dict
from aiohttp import web

from openapi_server.models.user import User
from openapi_server.models.user_role import UserRole
from openapi_server import util


async def delete_user_by_id(request: web.Request, access_token, user_id) -> web.Response:
    """/users/{userId:[0-9]+}

    Remove a user from the organization.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param user_id: ID of the user.
    :type user_id: int

    """
    return web.Response(status=200)


async def get_user_by_id(request: web.Request, access_token, user_id) -> web.Response:
    """/users/{userId:[0-9]+}

    Get a user.

    :param access_token: Samsara API access token.
    :type access_token: str
    :param user_id: ID of the user.
    :type user_id: int

    """
    return web.Response(status=200)


async def list_user_roles(request: web.Request, access_token) -> web.Response:
    """/user_roles

    Get all roles in the organization.

    :param access_token: Samsara API access token.
    :type access_token: str

    """
    return web.Response(status=200)


async def list_users(request: web.Request, access_token) -> web.Response:
    """/users

    List all users in the organization.

    :param access_token: Samsara API access token.
    :type access_token: str

    """
    return web.Response(status=200)
