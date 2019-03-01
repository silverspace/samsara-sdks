import connexion
import six

from openapi_server.models.asset_reefer_response import AssetReeferResponse  # noqa: E501
from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from openapi_server import util


def get_all_asset_current_locations(access_token, group_id=None):  # noqa: E501
    """/fleet/assets/locations

    Fetch current locations of all assets for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    :rtype: InlineResponse2001
    """
    return 'do some magic!'


def get_all_assets(access_token, group_id=None):  # noqa: E501
    """/fleet/assets

    Fetch all of the assets for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    :rtype: InlineResponse200
    """
    return 'do some magic!'


def get_asset_location(access_token, asset_id, start_ms, end_ms):  # noqa: E501
    """/fleet/assets/{assetId:[0-9]+}/locations

    Fetch the historical locations for the asset. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    :rtype: List[object]
    """
    return 'do some magic!'


def get_asset_reefer(access_token, asset_id, start_ms, end_ms):  # noqa: E501
    """/fleet/assets/{assetId:[0-9]+}/reefer

    Fetch the reefer-specific stats of an asset. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param asset_id: ID of the asset
    :type asset_id: int
    :param start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
    :type start_ms: int
    :param end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
    :type end_ms: int

    :rtype: AssetReeferResponse
    """
    return 'do some magic!'
