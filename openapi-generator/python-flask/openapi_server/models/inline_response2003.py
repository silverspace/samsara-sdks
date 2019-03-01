# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.vehicle_location import VehicleLocation
from openapi_server import util

from openapi_server.models.vehicle_location import VehicleLocation  # noqa: E501

class InlineResponse2003(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_id=None, vehicles=None):  # noqa: E501
        """InlineResponse2003 - a model defined in OpenAPI

        :param group_id: The group_id of this InlineResponse2003.  # noqa: E501
        :type group_id: int
        :param vehicles: The vehicles of this InlineResponse2003.  # noqa: E501
        :type vehicles: List[VehicleLocation]
        """
        self.openapi_types = {
            'group_id': int,
            'vehicles': List[VehicleLocation]
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'vehicles': 'vehicles'
        }

        self._group_id = group_id
        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2003':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_3 of this InlineResponse2003.  # noqa: E501
        :rtype: InlineResponse2003
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self):
        """Gets the group_id of this InlineResponse2003.

        Group ID to query.  # noqa: E501

        :return: The group_id of this InlineResponse2003.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this InlineResponse2003.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this InlineResponse2003.
        :type group_id: int
        """

        self._group_id = group_id

    @property
    def vehicles(self):
        """Gets the vehicles of this InlineResponse2003.


        :return: The vehicles of this InlineResponse2003.
        :rtype: List[VehicleLocation]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles):
        """Sets the vehicles of this InlineResponse2003.


        :param vehicles: The vehicles of this InlineResponse2003.
        :type vehicles: List[VehicleLocation]
        """

        self._vehicles = vehicles