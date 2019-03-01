# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.vehicle_maintenance import VehicleMaintenance
from openapi_server import util

from openapi_server.models.vehicle_maintenance import VehicleMaintenance  # noqa: E501

class InlineResponse2004(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, vehicles=None):  # noqa: E501
        """InlineResponse2004 - a model defined in OpenAPI

        :param vehicles: The vehicles of this InlineResponse2004.  # noqa: E501
        :type vehicles: List[VehicleMaintenance]
        """
        self.openapi_types = {
            'vehicles': List[VehicleMaintenance]
        }

        self.attribute_map = {
            'vehicles': 'vehicles'
        }

        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2004':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_4 of this InlineResponse2004.  # noqa: E501
        :rtype: InlineResponse2004
        """
        return util.deserialize_model(dikt, cls)

    @property
    def vehicles(self):
        """Gets the vehicles of this InlineResponse2004.


        :return: The vehicles of this InlineResponse2004.
        :rtype: List[VehicleMaintenance]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles):
        """Sets the vehicles of this InlineResponse2004.


        :param vehicles: The vehicles of this InlineResponse2004.
        :type vehicles: List[VehicleMaintenance]
        """

        self._vehicles = vehicles