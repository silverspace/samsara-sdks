# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class VehicleMaintenanceJ1939CheckEngineLight(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, protect_is_on: bool=None, stop_is_on: bool=None, warning_is_on: bool=None, emissions_is_on: bool=None):
        """VehicleMaintenanceJ1939CheckEngineLight - a model defined in OpenAPI

        :param protect_is_on: The protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :param stop_is_on: The stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :param warning_is_on: The warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :param emissions_is_on: The emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        """
        self.openapi_types = {
            'protect_is_on': bool,
            'stop_is_on': bool,
            'warning_is_on': bool,
            'emissions_is_on': bool
        }

        self.attribute_map = {
            'protect_is_on': 'protectIsOn',
            'stop_is_on': 'stopIsOn',
            'warning_is_on': 'warningIsOn',
            'emissions_is_on': 'emissionsIsOn'
        }

        self._protect_is_on = protect_is_on
        self._stop_is_on = stop_is_on
        self._warning_is_on = warning_is_on
        self._emissions_is_on = emissions_is_on

    @classmethod
    def from_dict(cls, dikt: dict) -> 'VehicleMaintenanceJ1939CheckEngineLight':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The VehicleMaintenance_j1939_checkEngineLight of this VehicleMaintenanceJ1939CheckEngineLight.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def protect_is_on(self):
        """Gets the protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._protect_is_on

    @protect_is_on.setter
    def protect_is_on(self, protect_is_on):
        """Sets the protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param protect_is_on: The protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type protect_is_on: bool
        """

        self._protect_is_on = protect_is_on

    @property
    def stop_is_on(self):
        """Gets the stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._stop_is_on

    @stop_is_on.setter
    def stop_is_on(self, stop_is_on):
        """Sets the stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param stop_is_on: The stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type stop_is_on: bool
        """

        self._stop_is_on = stop_is_on

    @property
    def warning_is_on(self):
        """Gets the warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._warning_is_on

    @warning_is_on.setter
    def warning_is_on(self, warning_is_on):
        """Sets the warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param warning_is_on: The warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type warning_is_on: bool
        """

        self._warning_is_on = warning_is_on

    @property
    def emissions_is_on(self):
        """Gets the emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._emissions_is_on

    @emissions_is_on.setter
    def emissions_is_on(self, emissions_is_on):
        """Sets the emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param emissions_is_on: The emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type emissions_is_on: bool
        """

        self._emissions_is_on = emissions_is_on
