# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.inline_response2005_vehicle_stats import InlineResponse2005VehicleStats  # noqa: F401,E501
from samsara.models.pagination import Pagination  # noqa: F401,E501
from samsara import util


class InlineResponse2005(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, pagination: Pagination=None, vehicle_stats: List[InlineResponse2005VehicleStats]=None):  # noqa: E501
        """InlineResponse2005 - a model defined in Swagger

        :param pagination: The pagination of this InlineResponse2005.  # noqa: E501
        :type pagination: Pagination
        :param vehicle_stats: The vehicle_stats of this InlineResponse2005.  # noqa: E501
        :type vehicle_stats: List[InlineResponse2005VehicleStats]
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'InlineResponse2005':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_5 of this InlineResponse2005.  # noqa: E501
        :rtype: InlineResponse2005
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pagination(self) -> Pagination:
        """Gets the pagination of this InlineResponse2005.


        :return: The pagination of this InlineResponse2005.
        :rtype: Pagination
        """
        return self._pagination

    @pagination.setter
    def pagination(self, pagination: Pagination):
        """Sets the pagination of this InlineResponse2005.


        :param pagination: The pagination of this InlineResponse2005.
        :type pagination: Pagination
        """

        self._pagination = pagination

    @property
    def vehicle_stats(self) -> List[InlineResponse2005VehicleStats]:
        """Gets the vehicle_stats of this InlineResponse2005.


        :return: The vehicle_stats of this InlineResponse2005.
        :rtype: List[InlineResponse2005VehicleStats]
        """
        return self._vehicle_stats

    @vehicle_stats.setter
    def vehicle_stats(self, vehicle_stats: List[InlineResponse2005VehicleStats]):
        """Sets the vehicle_stats of this InlineResponse2005.


        :param vehicle_stats: The vehicle_stats of this InlineResponse2005.
        :type vehicle_stats: List[InlineResponse2005VehicleStats]
        """
        if vehicle_stats is None:
            raise ValueError("Invalid value for `vehicle_stats`, must not be `None`")  # noqa: E501

        self._vehicle_stats = vehicle_stats