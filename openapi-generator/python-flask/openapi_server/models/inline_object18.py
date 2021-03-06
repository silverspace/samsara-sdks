# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class InlineObject18(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_id=None):  # noqa: E501
        """InlineObject18 - a model defined in OpenAPI

        :param group_id: The group_id of this InlineObject18.  # noqa: E501
        :type group_id: int
        """
        self.openapi_types = {
            'group_id': int
        }

        self.attribute_map = {
            'group_id': 'groupId'
        }

        self._group_id = group_id

    @classmethod
    def from_dict(cls, dikt) -> 'InlineObject18':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_object_18 of this InlineObject18.  # noqa: E501
        :rtype: InlineObject18
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self):
        """Gets the group_id of this InlineObject18.

        Group ID to query.  # noqa: E501

        :return: The group_id of this InlineObject18.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this InlineObject18.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this InlineObject18.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id
