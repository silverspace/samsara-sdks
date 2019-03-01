# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DvirBaseAuthorSignature(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, mechanic_user_id=None, driver_id=None, name=None, signed_at=None, type=None, email=None, username=None):  # noqa: E501
        """DvirBaseAuthorSignature - a model defined in OpenAPI

        :param mechanic_user_id: The mechanic_user_id of this DvirBaseAuthorSignature.  # noqa: E501
        :type mechanic_user_id: int
        :param driver_id: The driver_id of this DvirBaseAuthorSignature.  # noqa: E501
        :type driver_id: int
        :param name: The name of this DvirBaseAuthorSignature.  # noqa: E501
        :type name: str
        :param signed_at: The signed_at of this DvirBaseAuthorSignature.  # noqa: E501
        :type signed_at: int
        :param type: The type of this DvirBaseAuthorSignature.  # noqa: E501
        :type type: str
        :param email: The email of this DvirBaseAuthorSignature.  # noqa: E501
        :type email: str
        :param username: The username of this DvirBaseAuthorSignature.  # noqa: E501
        :type username: str
        """
        self.openapi_types = {
            'mechanic_user_id': int,
            'driver_id': int,
            'name': str,
            'signed_at': int,
            'type': str,
            'email': str,
            'username': str
        }

        self.attribute_map = {
            'mechanic_user_id': 'mechanicUserId',
            'driver_id': 'driverId',
            'name': 'name',
            'signed_at': 'signedAt',
            'type': 'type',
            'email': 'email',
            'username': 'username'
        }

        self._mechanic_user_id = mechanic_user_id
        self._driver_id = driver_id
        self._name = name
        self._signed_at = signed_at
        self._type = type
        self._email = email
        self._username = username

    @classmethod
    def from_dict(cls, dikt) -> 'DvirBaseAuthorSignature':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DvirBase_authorSignature of this DvirBaseAuthorSignature.  # noqa: E501
        :rtype: DvirBaseAuthorSignature
        """
        return util.deserialize_model(dikt, cls)

    @property
    def mechanic_user_id(self):
        """Gets the mechanic_user_id of this DvirBaseAuthorSignature.

        ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.  # noqa: E501

        :return: The mechanic_user_id of this DvirBaseAuthorSignature.
        :rtype: int
        """
        return self._mechanic_user_id

    @mechanic_user_id.setter
    def mechanic_user_id(self, mechanic_user_id):
        """Sets the mechanic_user_id of this DvirBaseAuthorSignature.

        ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.  # noqa: E501

        :param mechanic_user_id: The mechanic_user_id of this DvirBaseAuthorSignature.
        :type mechanic_user_id: int
        """

        self._mechanic_user_id = mechanic_user_id

    @property
    def driver_id(self):
        """Gets the driver_id of this DvirBaseAuthorSignature.

        ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.  # noqa: E501

        :return: The driver_id of this DvirBaseAuthorSignature.
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DvirBaseAuthorSignature.

        ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.  # noqa: E501

        :param driver_id: The driver_id of this DvirBaseAuthorSignature.
        :type driver_id: int
        """

        self._driver_id = driver_id

    @property
    def name(self):
        """Gets the name of this DvirBaseAuthorSignature.

        The name of the driver or mechanic who signed the DVIR.  # noqa: E501

        :return: The name of this DvirBaseAuthorSignature.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DvirBaseAuthorSignature.

        The name of the driver or mechanic who signed the DVIR.  # noqa: E501

        :param name: The name of this DvirBaseAuthorSignature.
        :type name: str
        """

        self._name = name

    @property
    def signed_at(self):
        """Gets the signed_at of this DvirBaseAuthorSignature.

        The time in millis when the DVIR was signed  # noqa: E501

        :return: The signed_at of this DvirBaseAuthorSignature.
        :rtype: int
        """
        return self._signed_at

    @signed_at.setter
    def signed_at(self, signed_at):
        """Sets the signed_at of this DvirBaseAuthorSignature.

        The time in millis when the DVIR was signed  # noqa: E501

        :param signed_at: The signed_at of this DvirBaseAuthorSignature.
        :type signed_at: int
        """

        self._signed_at = signed_at

    @property
    def type(self):
        """Gets the type of this DvirBaseAuthorSignature.

        Type corresponds to whether the signature corresponds to driver|mechanic.  # noqa: E501

        :return: The type of this DvirBaseAuthorSignature.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this DvirBaseAuthorSignature.

        Type corresponds to whether the signature corresponds to driver|mechanic.  # noqa: E501

        :param type: The type of this DvirBaseAuthorSignature.
        :type type: str
        """

        self._type = type

    @property
    def email(self):
        """Gets the email of this DvirBaseAuthorSignature.

        Email of the  driver|mechanic who signed the DVIR.  # noqa: E501

        :return: The email of this DvirBaseAuthorSignature.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this DvirBaseAuthorSignature.

        Email of the  driver|mechanic who signed the DVIR.  # noqa: E501

        :param email: The email of this DvirBaseAuthorSignature.
        :type email: str
        """

        self._email = email

    @property
    def username(self):
        """Gets the username of this DvirBaseAuthorSignature.

        Username of the  driver|mechanic who signed the DVIR.  # noqa: E501

        :return: The username of this DvirBaseAuthorSignature.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this DvirBaseAuthorSignature.

        Username of the  driver|mechanic who signed the DVIR.  # noqa: E501

        :param username: The username of this DvirBaseAuthorSignature.
        :type username: str
        """

        self._username = username
