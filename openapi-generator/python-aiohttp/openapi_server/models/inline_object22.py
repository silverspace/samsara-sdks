# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class InlineObject22(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_id: int=None, sensors: List[int]=None):
        """InlineObject22 - a model defined in OpenAPI

        :param group_id: The group_id of this InlineObject22.
        :param sensors: The sensors of this InlineObject22.
        """
        self.openapi_types = {
            'group_id': int,
            'sensors': List[int]
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'sensors': 'sensors'
        }

        self._group_id = group_id
        self._sensors = sensors

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineObject22':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_object_22 of this InlineObject22.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self):
        """Gets the group_id of this InlineObject22.

        Group ID to query.

        :return: The group_id of this InlineObject22.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this InlineObject22.

        Group ID to query.

        :param group_id: The group_id of this InlineObject22.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")

        self._group_id = group_id

    @property
    def sensors(self):
        """Gets the sensors of this InlineObject22.

        List of sensor IDs to query.

        :return: The sensors of this InlineObject22.
        :rtype: List[int]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors):
        """Sets the sensors of this InlineObject22.

        List of sensor IDs to query.

        :param sensors: The sensors of this InlineObject22.
        :type sensors: List[int]
        """
        if sensors is None:
            raise ValueError("Invalid value for `sensors`, must not be `None`")

        self._sensors = sensors
