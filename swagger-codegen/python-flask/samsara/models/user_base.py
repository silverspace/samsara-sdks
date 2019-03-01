# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class UserBase(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, auth_type: str=None, email: str=None, name: str=None, organization_role_id: str=None):  # noqa: E501
        """UserBase - a model defined in Swagger

        :param auth_type: The auth_type of this UserBase.  # noqa: E501
        :type auth_type: str
        :param email: The email of this UserBase.  # noqa: E501
        :type email: str
        :param name: The name of this UserBase.  # noqa: E501
        :type name: str
        :param organization_role_id: The organization_role_id of this UserBase.  # noqa: E501
        :type organization_role_id: str
        """
        self.swagger_types = {
            'auth_type': str,
            'email': str,
            'name': str,
            'organization_role_id': str
        }

        self.attribute_map = {
            'auth_type': 'authType',
            'email': 'email',
            'name': 'name',
            'organization_role_id': 'organizationRoleId'
        }

        self._auth_type = auth_type
        self._email = email
        self._name = name
        self._organization_role_id = organization_role_id

    @classmethod
    def from_dict(cls, dikt) -> 'UserBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserBase of this UserBase.  # noqa: E501
        :rtype: UserBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def auth_type(self) -> str:
        """Gets the auth_type of this UserBase.

        The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.  # noqa: E501

        :return: The auth_type of this UserBase.
        :rtype: str
        """
        return self._auth_type

    @auth_type.setter
    def auth_type(self, auth_type: str):
        """Sets the auth_type of this UserBase.

        The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.  # noqa: E501

        :param auth_type: The auth_type of this UserBase.
        :type auth_type: str
        """
        allowed_values = ["default", "saml"]  # noqa: E501
        if auth_type not in allowed_values:
            raise ValueError(
                "Invalid value for `auth_type` ({0}), must be one of {1}"
                .format(auth_type, allowed_values)
            )

        self._auth_type = auth_type

    @property
    def email(self) -> str:
        """Gets the email of this UserBase.

        The email address of this user.  # noqa: E501

        :return: The email of this UserBase.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this UserBase.

        The email address of this user.  # noqa: E501

        :param email: The email of this UserBase.
        :type email: str
        """
        if email is None:
            raise ValueError("Invalid value for `email`, must not be `None`")  # noqa: E501

        self._email = email

    @property
    def name(self) -> str:
        """Gets the name of this UserBase.

        The first and last name of the user.  # noqa: E501

        :return: The name of this UserBase.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this UserBase.

        The first and last name of the user.  # noqa: E501

        :param name: The name of this UserBase.
        :type name: str
        """

        self._name = name

    @property
    def organization_role_id(self) -> str:
        """Gets the organization_role_id of this UserBase.

        The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.  # noqa: E501

        :return: The organization_role_id of this UserBase.
        :rtype: str
        """
        return self._organization_role_id

    @organization_role_id.setter
    def organization_role_id(self, organization_role_id: str):
        """Sets the organization_role_id of this UserBase.

        The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.  # noqa: E501

        :param organization_role_id: The organization_role_id of this UserBase.
        :type organization_role_id: str
        """

        self._organization_role_id = organization_role_id