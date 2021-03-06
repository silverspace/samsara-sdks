# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.user_tag_role_tag import UserTagRoleTag
from openapi_server import util


class UserTagRole(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role: str=None, role_id: str=None, tag: UserTagRoleTag=None):
        """UserTagRole - a model defined in OpenAPI

        :param role: The role of this UserTagRole.
        :param role_id: The role_id of this UserTagRole.
        :param tag: The tag of this UserTagRole.
        """
        self.openapi_types = {
            'role': str,
            'role_id': str,
            'tag': UserTagRoleTag
        }

        self.attribute_map = {
            'role': 'role',
            'role_id': 'roleId',
            'tag': 'tag'
        }

        self._role = role
        self._role_id = role_id
        self._tag = tag

    @classmethod
    def from_dict(cls, dikt: dict) -> 'UserTagRole':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The UserTagRole of this UserTagRole.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role(self):
        """Gets the role of this UserTagRole.

        The name of the role the user has been granted on this tag.

        :return: The role of this UserTagRole.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this UserTagRole.

        The name of the role the user has been granted on this tag.

        :param role: The role of this UserTagRole.
        :type role: str
        """

        self._role = role

    @property
    def role_id(self):
        """Gets the role_id of this UserTagRole.

        The id of the role the user has been granted on this tag.

        :return: The role_id of this UserTagRole.
        :rtype: str
        """
        return self._role_id

    @role_id.setter
    def role_id(self, role_id):
        """Sets the role_id of this UserTagRole.

        The id of the role the user has been granted on this tag.

        :param role_id: The role_id of this UserTagRole.
        :type role_id: str
        """
        if role_id is None:
            raise ValueError("Invalid value for `role_id`, must not be `None`")

        self._role_id = role_id

    @property
    def tag(self):
        """Gets the tag of this UserTagRole.


        :return: The tag of this UserTagRole.
        :rtype: UserTagRoleTag
        """
        return self._tag

    @tag.setter
    def tag(self, tag):
        """Sets the tag of this UserTagRole.


        :param tag: The tag of this UserTagRole.
        :type tag: UserTagRoleTag
        """
        if tag is None:
            raise ValueError("Invalid value for `tag`, must not be `None`")

        self._tag = tag
