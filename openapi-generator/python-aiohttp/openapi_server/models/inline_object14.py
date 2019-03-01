# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.vehicle import Vehicle
from openapi_server import util


class InlineObject14(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_id: int=None, vehicles: List[Vehicle]=None):
        """InlineObject14 - a model defined in OpenAPI

        :param group_id: The group_id of this InlineObject14.
        :param vehicles: The vehicles of this InlineObject14.
        """
        self.openapi_types = {
            'group_id': int,
            'vehicles': List[Vehicle]
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'vehicles': 'vehicles'
        }

        self._group_id = group_id
        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineObject14':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_object_14 of this InlineObject14.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self):
        """Gets the group_id of this InlineObject14.

        Group ID to query.

        :return: The group_id of this InlineObject14.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this InlineObject14.

        Group ID to query.

        :param group_id: The group_id of this InlineObject14.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")

        self._group_id = group_id

    @property
    def vehicles(self):
        """Gets the vehicles of this InlineObject14.


        :return: The vehicles of this InlineObject14.
        :rtype: List[Vehicle]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles):
        """Sets the vehicles of this InlineObject14.


        :param vehicles: The vehicles of this InlineObject14.
        :type vehicles: List[Vehicle]
        """
        if vehicles is None:
            raise ValueError("Invalid value for `vehicles`, must not be `None`")

        self._vehicles = vehicles