import connexion
import six

from openapi_server.models.inline_response2009 import InlineResponse2009  # noqa: E501
from openapi_server.models.tag import Tag  # noqa: E501
from openapi_server.models.tag_create import TagCreate  # noqa: E501
from openapi_server.models.tag_modify import TagModify  # noqa: E501
from openapi_server.models.tag_update import TagUpdate  # noqa: E501
from openapi_server import util


def create_tag(access_token, tag_create_params):  # noqa: E501
    """/tags

    Create a new tag for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param tag_create_params: 
    :type tag_create_params: dict | bytes

    :rtype: Tag
    """
    if connexion.request.is_json:
        tag_create_params = TagCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_tag_by_id(access_token, tag_id):  # noqa: E501
    """/tags/{tag_id:[0-9]+}

    Permanently deletes a tag. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param tag_id: ID of the tag.
    :type tag_id: int

    :rtype: None
    """
    return 'do some magic!'


def get_all_tags(access_token, group_id=None):  # noqa: E501
    """/tags

    Fetch all of the tags for a group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    :rtype: InlineResponse2009
    """
    return 'do some magic!'


def get_tag_by_id(access_token, tag_id):  # noqa: E501
    """/tags/{tag_id:[0-9]+}

    Fetch a tag by id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param tag_id: ID of the tag.
    :type tag_id: int

    :rtype: Tag
    """
    return 'do some magic!'


def modify_tag_by_id(access_token, tag_id, tag_modify_params):  # noqa: E501
    """/tags/{tag_id:[0-9]+}

    Add or delete specific members from a tag, or modify the name of a tag. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param tag_id: ID of the tag.
    :type tag_id: int
    :param tag_modify_params: 
    :type tag_modify_params: dict | bytes

    :rtype: Tag
    """
    if connexion.request.is_json:
        tag_modify_params = TagModify.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_tag_by_id(access_token, tag_id, update_tag_params):  # noqa: E501
    """/tags/{tag_id:[0-9]+}

    Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param tag_id: ID of the tag.
    :type tag_id: int
    :param update_tag_params: 
    :type update_tag_params: dict | bytes

    :rtype: Tag
    """
    if connexion.request.is_json:
        update_tag_params = TagUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
