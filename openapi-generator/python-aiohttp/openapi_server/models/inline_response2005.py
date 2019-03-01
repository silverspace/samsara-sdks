# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.inline_response2005_vehicle_stats import InlineResponse2005VehicleStats
from openapi_server.models.pagination import Pagination
from openapi_server import util


class InlineResponse2005(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pagination: Pagination=None, vehicle_stats: List[InlineResponse2005VehicleStats]=None):
        """InlineResponse2005 - a model defined in OpenAPI

        :param pagination: The pagination of this InlineResponse2005.
        :param vehicle_stats: The vehicle_stats of this InlineResponse2005.
        """
        self.openapi_types = {
            'pagination': Pagination,
            'vehicle_stats': List[InlineResponse2005VehicleStats]
        }

        self.attribute_map = {
            'pagination': 'pagination',
            'vehicle_stats': 'vehicleStats'
        }

        self._pagination = pagination
        self._vehicle_stats = vehicle_stats

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineResponse2005':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_response_200_5 of this InlineResponse2005.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pagination(self):
        """Gets the pagination of this InlineResponse2005.


        :return: The pagination of this InlineResponse2005.
        :rtype: Pagination
        """
        return self._pagination

    @pagination.setter
    def pagination(self, pagination):
        """Sets the pagination of this InlineResponse2005.


        :param pagination: The pagination of this InlineResponse2005.
        :type pagination: Pagination
        """

        self._pagination = pagination

    @property
    def vehicle_stats(self):
        """Gets the vehicle_stats of this InlineResponse2005.


        :return: The vehicle_stats of this InlineResponse2005.
        :rtype: List[InlineResponse2005VehicleStats]
        """
        return self._vehicle_stats

    @vehicle_stats.setter
    def vehicle_stats(self, vehicle_stats):
        """Sets the vehicle_stats of this InlineResponse2005.


        :param vehicle_stats: The vehicle_stats of this InlineResponse2005.
        :type vehicle_stats: List[InlineResponse2005VehicleStats]
        """
        if vehicle_stats is None:
            raise ValueError("Invalid value for `vehicle_stats`, must not be `None`")

        self._vehicle_stats = vehicle_stats
