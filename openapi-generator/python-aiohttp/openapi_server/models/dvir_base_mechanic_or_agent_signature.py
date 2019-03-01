# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DvirBaseMechanicOrAgentSignature(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, mechanic_user_id: int=None, driver_id: int=None, name: str=None, signed_at: int=None, type: str=None, email: str=None, username: str=None):
        """DvirBaseMechanicOrAgentSignature - a model defined in OpenAPI

        :param mechanic_user_id: The mechanic_user_id of this DvirBaseMechanicOrAgentSignature.
        :param driver_id: The driver_id of this DvirBaseMechanicOrAgentSignature.
        :param name: The name of this DvirBaseMechanicOrAgentSignature.
        :param signed_at: The signed_at of this DvirBaseMechanicOrAgentSignature.
        :param type: The type of this DvirBaseMechanicOrAgentSignature.
        :param email: The email of this DvirBaseMechanicOrAgentSignature.
        :param username: The username of this DvirBaseMechanicOrAgentSignature.
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
    def from_dict(cls, dikt: dict) -> 'DvirBaseMechanicOrAgentSignature':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DvirBase_mechanicOrAgentSignature of this DvirBaseMechanicOrAgentSignature.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def mechanic_user_id(self):
        """Gets the mechanic_user_id of this DvirBaseMechanicOrAgentSignature.

        ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.

        :return: The mechanic_user_id of this DvirBaseMechanicOrAgentSignature.
        :rtype: int
        """
        return self._mechanic_user_id

    @mechanic_user_id.setter
    def mechanic_user_id(self, mechanic_user_id):
        """Sets the mechanic_user_id of this DvirBaseMechanicOrAgentSignature.

        ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.

        :param mechanic_user_id: The mechanic_user_id of this DvirBaseMechanicOrAgentSignature.
        :type mechanic_user_id: int
        """

        self._mechanic_user_id = mechanic_user_id

    @property
    def driver_id(self):
        """Gets the driver_id of this DvirBaseMechanicOrAgentSignature.

        ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.

        :return: The driver_id of this DvirBaseMechanicOrAgentSignature.
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DvirBaseMechanicOrAgentSignature.

        ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.

        :param driver_id: The driver_id of this DvirBaseMechanicOrAgentSignature.
        :type driver_id: int
        """

        self._driver_id = driver_id

    @property
    def name(self):
        """Gets the name of this DvirBaseMechanicOrAgentSignature.

        The name of the agent or mechanic who signed the DVIR.

        :return: The name of this DvirBaseMechanicOrAgentSignature.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DvirBaseMechanicOrAgentSignature.

        The name of the agent or mechanic who signed the DVIR.

        :param name: The name of this DvirBaseMechanicOrAgentSignature.
        :type name: str
        """

        self._name = name

    @property
    def signed_at(self):
        """Gets the signed_at of this DvirBaseMechanicOrAgentSignature.

        The time in millis when the DVIR was signed

        :return: The signed_at of this DvirBaseMechanicOrAgentSignature.
        :rtype: int
        """
        return self._signed_at

    @signed_at.setter
    def signed_at(self, signed_at):
        """Sets the signed_at of this DvirBaseMechanicOrAgentSignature.

        The time in millis when the DVIR was signed

        :param signed_at: The signed_at of this DvirBaseMechanicOrAgentSignature.
        :type signed_at: int
        """

        self._signed_at = signed_at

    @property
    def type(self):
        """Gets the type of this DvirBaseMechanicOrAgentSignature.

        Type corresponds to whether the signature corresponds to driver|mechanic.

        :return: The type of this DvirBaseMechanicOrAgentSignature.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this DvirBaseMechanicOrAgentSignature.

        Type corresponds to whether the signature corresponds to driver|mechanic.

        :param type: The type of this DvirBaseMechanicOrAgentSignature.
        :type type: str
        """

        self._type = type

    @property
    def email(self):
        """Gets the email of this DvirBaseMechanicOrAgentSignature.

        Email of the  agent|mechanic who signed the DVIR.

        :return: The email of this DvirBaseMechanicOrAgentSignature.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this DvirBaseMechanicOrAgentSignature.

        Email of the  agent|mechanic who signed the DVIR.

        :param email: The email of this DvirBaseMechanicOrAgentSignature.
        :type email: str
        """

        self._email = email

    @property
    def username(self):
        """Gets the username of this DvirBaseMechanicOrAgentSignature.

        Username of the  agent|mechanic who signed the DVIR.

        :return: The username of this DvirBaseMechanicOrAgentSignature.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this DvirBaseMechanicOrAgentSignature.

        Username of the  agent|mechanic who signed the DVIR.

        :param username: The username of this DvirBaseMechanicOrAgentSignature.
        :type username: str
        """

        self._username = username
