# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class VehicleMaintenanceJ1939CheckEngineLight(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, emissions_is_on: bool=None, protect_is_on: bool=None, stop_is_on: bool=None, warning_is_on: bool=None):  # noqa: E501
        """VehicleMaintenanceJ1939CheckEngineLight - a model defined in Swagger

        :param emissions_is_on: The emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.  # noqa: E501
        :type emissions_is_on: bool
        :param protect_is_on: The protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.  # noqa: E501
        :type protect_is_on: bool
        :param stop_is_on: The stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.  # noqa: E501
        :type stop_is_on: bool
        :param warning_is_on: The warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.  # noqa: E501
        :type warning_is_on: bool
        """
        self.swagger_types = {
            'emissions_is_on': bool,
            'protect_is_on': bool,
            'stop_is_on': bool,
            'warning_is_on': bool
        }

        self.attribute_map = {
            'emissions_is_on': 'emissionsIsOn',
            'protect_is_on': 'protectIsOn',
            'stop_is_on': 'stopIsOn',
            'warning_is_on': 'warningIsOn'
        }

        self._emissions_is_on = emissions_is_on
        self._protect_is_on = protect_is_on
        self._stop_is_on = stop_is_on
        self._warning_is_on = warning_is_on

    @classmethod
    def from_dict(cls, dikt) -> 'VehicleMaintenanceJ1939CheckEngineLight':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VehicleMaintenance_j1939_checkEngineLight of this VehicleMaintenanceJ1939CheckEngineLight.  # noqa: E501
        :rtype: VehicleMaintenanceJ1939CheckEngineLight
        """
        return util.deserialize_model(dikt, cls)

    @property
    def emissions_is_on(self) -> bool:
        """Gets the emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._emissions_is_on

    @emissions_is_on.setter
    def emissions_is_on(self, emissions_is_on: bool):
        """Sets the emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param emissions_is_on: The emissions_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type emissions_is_on: bool
        """

        self._emissions_is_on = emissions_is_on

    @property
    def protect_is_on(self) -> bool:
        """Gets the protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._protect_is_on

    @protect_is_on.setter
    def protect_is_on(self, protect_is_on: bool):
        """Sets the protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param protect_is_on: The protect_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type protect_is_on: bool
        """

        self._protect_is_on = protect_is_on

    @property
    def stop_is_on(self) -> bool:
        """Gets the stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._stop_is_on

    @stop_is_on.setter
    def stop_is_on(self, stop_is_on: bool):
        """Sets the stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param stop_is_on: The stop_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type stop_is_on: bool
        """

        self._stop_is_on = stop_is_on

    @property
    def warning_is_on(self) -> bool:
        """Gets the warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :return: The warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :rtype: bool
        """
        return self._warning_is_on

    @warning_is_on.setter
    def warning_is_on(self, warning_is_on: bool):
        """Sets the warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.


        :param warning_is_on: The warning_is_on of this VehicleMaintenanceJ1939CheckEngineLight.
        :type warning_is_on: bool
        """

        self._warning_is_on = warning_is_on
