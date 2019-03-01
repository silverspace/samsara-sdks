# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.pagination import Pagination
from openapi_server.models.vehicle import Vehicle
from openapi_server import util


class InlineResponse2002(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pagination: Pagination=None, group_id: int=None, vehicles: List[Vehicle]=None):
        """InlineResponse2002 - a model defined in OpenAPI

        :param pagination: The pagination of this InlineResponse2002.
        :param group_id: The group_id of this InlineResponse2002.
        :param vehicles: The vehicles of this InlineResponse2002.
        """
        self.openapi_types = {
            'pagination': Pagination,
            'group_id': int,
            'vehicles': List[Vehicle]
        }

        self.attribute_map = {
            'pagination': 'pagination',
            'group_id': 'groupId',
            'vehicles': 'vehicles'
        }

        self._pagination = pagination
        self._group_id = group_id
        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineResponse2002':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_response_200_2 of this InlineResponse2002.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pagination(self):
        """Gets the pagination of this InlineResponse2002.


        :return: The pagination of this InlineResponse2002.
        :rtype: Pagination
        """
        return self._pagination

    @pagination.setter
    def pagination(self, pagination):
        """Sets the pagination of this InlineResponse2002.


        :param pagination: The pagination of this InlineResponse2002.
        :type pagination: Pagination
        """

        self._pagination = pagination

    @property
    def group_id(self):
        """Gets the group_id of this InlineResponse2002.

        Group ID to query.

        :return: The group_id of this InlineResponse2002.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this InlineResponse2002.

        Group ID to query.

        :param group_id: The group_id of this InlineResponse2002.
        :type group_id: int
        """

        self._group_id = group_id

    @property
    def vehicles(self):
        """Gets the vehicles of this InlineResponse2002.


        :return: The vehicles of this InlineResponse2002.
        :rtype: List[Vehicle]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles):
        """Sets the vehicles of this InlineResponse2002.


        :param vehicles: The vehicles of this InlineResponse2002.
        :type vehicles: List[Vehicle]
        """

        self._vehicles = vehicles
