import connexion
import six

from openapi_server.models.user import User  # noqa: E501
from openapi_server.models.user_role import UserRole  # noqa: E501
from openapi_server import util


def delete_user_by_id(access_token, user_id):  # noqa: E501
    """/users/{userId:[0-9]+}

    Remove a user from the organization. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param user_id: ID of the user.
    :type user_id: int

    :rtype: None
    """
    return 'do some magic!'


def get_user_by_id(access_token, user_id):  # noqa: E501
    """/users/{userId:[0-9]+}

    Get a user. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param user_id: ID of the user.
    :type user_id: int

    :rtype: User
    """
    return 'do some magic!'


def list_user_roles(access_token):  # noqa: E501
    """/user_roles

    Get all roles in the organization. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str

    :rtype: List[UserRole]
    """
    return 'do some magic!'


def list_users(access_token):  # noqa: E501
    """/users

    List all users in the organization. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str

    :rtype: List[User]
    """
    return 'do some magic!'
