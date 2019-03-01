import connexion
import six

from openapi_server.models.driver import Driver  # noqa: E501
from openapi_server.models.driver_for_create import DriverForCreate  # noqa: E501
from openapi_server.models.inline_object4 import InlineObject4  # noqa: E501
from openapi_server import util


def create_driver(access_token, create_driver_param):  # noqa: E501
    """/fleet/drivers/create

    Create a new driver. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param create_driver_param: Driver creation body
    :type create_driver_param: dict | bytes

    :rtype: Driver
    """
    if connexion.request.is_json:
        create_driver_param = DriverForCreate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def deactivate_driver(access_token, driver_id_or_external_id):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Deactivate a driver with the given id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_all_deactivated_drivers(access_token, group_id=None):  # noqa: E501
    """/fleet/drivers/inactive

    Fetch all deactivated drivers for the group. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param group_id: Optional group ID if the organization has multiple groups (uncommon).
    :type group_id: int

    :rtype: List[Driver]
    """
    return 'do some magic!'


def get_deactivated_driver_by_id(access_token, driver_id_or_external_id):  # noqa: E501
    """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Fetch deactivated driver by id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    :rtype: Driver
    """
    return 'do some magic!'


def get_driver_by_id(access_token, driver_id_or_external_id):  # noqa: E501
    """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Fetch driver by id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str

    :rtype: Driver
    """
    return 'do some magic!'


def reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivate_driver_param):  # noqa: E501
    """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

    Reactivate the inactive driver having id. # noqa: E501

    :param access_token: Samsara API access token.
    :type access_token: str
    :param driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
    :type driver_id_or_external_id: str
    :param reactivate_driver_param: 
    :type reactivate_driver_param: dict | bytes

    :rtype: Driver
    """
    if connexion.request.is_json:
        reactivate_driver_param = InlineObject4.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
