# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.driver import Driver
from openapi_server import util


class DriversResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, drivers: List[Driver]=None):
        """DriversResponse - a model defined in OpenAPI

        :param drivers: The drivers of this DriversResponse.
        """
        self.openapi_types = {
            'drivers': List[Driver]
        }

        self.attribute_map = {
            'drivers': 'drivers'
        }

        self._drivers = drivers

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DriversResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DriversResponse of this DriversResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def drivers(self):
        """Gets the drivers of this DriversResponse.


        :return: The drivers of this DriversResponse.
        :rtype: List[Driver]
        """
        return self._drivers

    @drivers.setter
    def drivers(self, drivers):
        """Sets the drivers of this DriversResponse.


        :param drivers: The drivers of this DriversResponse.
        :type drivers: List[Driver]
        """

        self._drivers = drivers