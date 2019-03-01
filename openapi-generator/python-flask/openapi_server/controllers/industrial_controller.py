import connexion
import six

from openapi_server.models.data_input_history_response import DataInputHistoryResponse  # noqa: E501
from openapi_server.models.inline_object17 import InlineObject17  # noqa: E501
from openapi_server.models.inline_object18 import InlineObject18  # noqa: E501
from openapi_server.models.inline_response2006 import InlineResponse2006  # noqa: E501
from openapi_server.models.inline_response2007 import InlineResponse2007  # noqa: E501
from openapi_server.models.machine_history_response import MachineHistoryResponse  # noqa: E501
from openapi_server import util


def get_all_data_inputs(access_token, group_id=None, start_ms=None, end_ms=None):  # noqa: E501
    """/industrial/data

    Fetch all of the data inputs for a group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int
    :param start_ms: Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    :type start_ms: int
    :param end_ms: Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    :type end_ms: int

    :rtype: InlineResponse2006
    """
    return 'do some magic!'


def get_data_input(access_token, data_input_id, start_ms=None, end_ms=None):  # noqa: E501
    """/industrial/data/{data_input_id:[0-9]+}

    Fetch datapoints from a given data input. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param data_input_id: ID of the data input
    :type data_input_id: int
    :param start_ms: Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.
    :type start_ms: int
    :param end_ms: Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.
    :type end_ms: int

    :rtype: DataInputHistoryResponse
    """
    return 'do some magic!'


def get_machines(access_token, group_param):  # noqa: E501
    """/machines/list

    Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_param: 
    :type group_param: dict | bytes

    :rtype: InlineResponse2007
    """
    if connexion.request.is_json:
        group_param = InlineObject18.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_machines_history(access_token, history_param):  # noqa: E501
    """/machines/history

    Get historical data for machine objects. This method returns a set of historical data for all machines in a group # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param history_param: 
    :type history_param: dict | bytes

    :rtype: MachineHistoryResponse
    """
    if connexion.request.is_json:
        history_param = InlineObject17.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
