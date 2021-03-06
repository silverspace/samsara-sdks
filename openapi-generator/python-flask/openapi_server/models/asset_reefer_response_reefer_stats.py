# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.asset_reefer_response_reefer_stats_alarms1 import AssetReeferResponseReeferStatsAlarms1
from openapi_server.models.asset_reefer_response_reefer_stats_engine_hours import AssetReeferResponseReeferStatsEngineHours
from openapi_server.models.asset_reefer_response_reefer_stats_fuel_percentage import AssetReeferResponseReeferStatsFuelPercentage
from openapi_server.models.asset_reefer_response_reefer_stats_power_status import AssetReeferResponseReeferStatsPowerStatus
from openapi_server.models.asset_reefer_response_reefer_stats_return_air_temp import AssetReeferResponseReeferStatsReturnAirTemp
from openapi_server.models.asset_reefer_response_reefer_stats_set_point import AssetReeferResponseReeferStatsSetPoint
from openapi_server import util

from openapi_server.models.asset_reefer_response_reefer_stats_alarms1 import AssetReeferResponseReeferStatsAlarms1  # noqa: E501
from openapi_server.models.asset_reefer_response_reefer_stats_engine_hours import AssetReeferResponseReeferStatsEngineHours  # noqa: E501
from openapi_server.models.asset_reefer_response_reefer_stats_fuel_percentage import AssetReeferResponseReeferStatsFuelPercentage  # noqa: E501
from openapi_server.models.asset_reefer_response_reefer_stats_power_status import AssetReeferResponseReeferStatsPowerStatus  # noqa: E501
from openapi_server.models.asset_reefer_response_reefer_stats_return_air_temp import AssetReeferResponseReeferStatsReturnAirTemp  # noqa: E501
from openapi_server.models.asset_reefer_response_reefer_stats_set_point import AssetReeferResponseReeferStatsSetPoint  # noqa: E501

class AssetReeferResponseReeferStats(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, fuel_percentage=None, power_status=None, engine_hours=None, set_point=None, return_air_temp=None, alarms=None):  # noqa: E501
        """AssetReeferResponseReeferStats - a model defined in OpenAPI

        :param fuel_percentage: The fuel_percentage of this AssetReeferResponseReeferStats.  # noqa: E501
        :type fuel_percentage: List[AssetReeferResponseReeferStatsFuelPercentage]
        :param power_status: The power_status of this AssetReeferResponseReeferStats.  # noqa: E501
        :type power_status: List[AssetReeferResponseReeferStatsPowerStatus]
        :param engine_hours: The engine_hours of this AssetReeferResponseReeferStats.  # noqa: E501
        :type engine_hours: List[AssetReeferResponseReeferStatsEngineHours]
        :param set_point: The set_point of this AssetReeferResponseReeferStats.  # noqa: E501
        :type set_point: List[AssetReeferResponseReeferStatsSetPoint]
        :param return_air_temp: The return_air_temp of this AssetReeferResponseReeferStats.  # noqa: E501
        :type return_air_temp: List[AssetReeferResponseReeferStatsReturnAirTemp]
        :param alarms: The alarms of this AssetReeferResponseReeferStats.  # noqa: E501
        :type alarms: List[AssetReeferResponseReeferStatsAlarms1]
        """
        self.openapi_types = {
            'fuel_percentage': List[AssetReeferResponseReeferStatsFuelPercentage],
            'power_status': List[AssetReeferResponseReeferStatsPowerStatus],
            'engine_hours': List[AssetReeferResponseReeferStatsEngineHours],
            'set_point': List[AssetReeferResponseReeferStatsSetPoint],
            'return_air_temp': List[AssetReeferResponseReeferStatsReturnAirTemp],
            'alarms': List[AssetReeferResponseReeferStatsAlarms1]
        }

        self.attribute_map = {
            'fuel_percentage': 'fuelPercentage',
            'power_status': 'powerStatus',
            'engine_hours': 'engineHours',
            'set_point': 'setPoint',
            'return_air_temp': 'returnAirTemp',
            'alarms': 'alarms'
        }

        self._fuel_percentage = fuel_percentage
        self._power_status = power_status
        self._engine_hours = engine_hours
        self._set_point = set_point
        self._return_air_temp = return_air_temp
        self._alarms = alarms

    @classmethod
    def from_dict(cls, dikt) -> 'AssetReeferResponseReeferStats':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssetReeferResponse_reeferStats of this AssetReeferResponseReeferStats.  # noqa: E501
        :rtype: AssetReeferResponseReeferStats
        """
        return util.deserialize_model(dikt, cls)

    @property
    def fuel_percentage(self):
        """Gets the fuel_percentage of this AssetReeferResponseReeferStats.

        Fuel percentage of the reefer  # noqa: E501

        :return: The fuel_percentage of this AssetReeferResponseReeferStats.
        :rtype: List[AssetReeferResponseReeferStatsFuelPercentage]
        """
        return self._fuel_percentage

    @fuel_percentage.setter
    def fuel_percentage(self, fuel_percentage):
        """Sets the fuel_percentage of this AssetReeferResponseReeferStats.

        Fuel percentage of the reefer  # noqa: E501

        :param fuel_percentage: The fuel_percentage of this AssetReeferResponseReeferStats.
        :type fuel_percentage: List[AssetReeferResponseReeferStatsFuelPercentage]
        """

        self._fuel_percentage = fuel_percentage

    @property
    def power_status(self):
        """Gets the power_status of this AssetReeferResponseReeferStats.

        Power status of the reefer  # noqa: E501

        :return: The power_status of this AssetReeferResponseReeferStats.
        :rtype: List[AssetReeferResponseReeferStatsPowerStatus]
        """
        return self._power_status

    @power_status.setter
    def power_status(self, power_status):
        """Sets the power_status of this AssetReeferResponseReeferStats.

        Power status of the reefer  # noqa: E501

        :param power_status: The power_status of this AssetReeferResponseReeferStats.
        :type power_status: List[AssetReeferResponseReeferStatsPowerStatus]
        """

        self._power_status = power_status

    @property
    def engine_hours(self):
        """Gets the engine_hours of this AssetReeferResponseReeferStats.

        Engine hours of the reefer  # noqa: E501

        :return: The engine_hours of this AssetReeferResponseReeferStats.
        :rtype: List[AssetReeferResponseReeferStatsEngineHours]
        """
        return self._engine_hours

    @engine_hours.setter
    def engine_hours(self, engine_hours):
        """Sets the engine_hours of this AssetReeferResponseReeferStats.

        Engine hours of the reefer  # noqa: E501

        :param engine_hours: The engine_hours of this AssetReeferResponseReeferStats.
        :type engine_hours: List[AssetReeferResponseReeferStatsEngineHours]
        """

        self._engine_hours = engine_hours

    @property
    def set_point(self):
        """Gets the set_point of this AssetReeferResponseReeferStats.

        Set point temperature of the reefer  # noqa: E501

        :return: The set_point of this AssetReeferResponseReeferStats.
        :rtype: List[AssetReeferResponseReeferStatsSetPoint]
        """
        return self._set_point

    @set_point.setter
    def set_point(self, set_point):
        """Sets the set_point of this AssetReeferResponseReeferStats.

        Set point temperature of the reefer  # noqa: E501

        :param set_point: The set_point of this AssetReeferResponseReeferStats.
        :type set_point: List[AssetReeferResponseReeferStatsSetPoint]
        """

        self._set_point = set_point

    @property
    def return_air_temp(self):
        """Gets the return_air_temp of this AssetReeferResponseReeferStats.

        Return air temperature of the reefer  # noqa: E501

        :return: The return_air_temp of this AssetReeferResponseReeferStats.
        :rtype: List[AssetReeferResponseReeferStatsReturnAirTemp]
        """
        return self._return_air_temp

    @return_air_temp.setter
    def return_air_temp(self, return_air_temp):
        """Sets the return_air_temp of this AssetReeferResponseReeferStats.

        Return air temperature of the reefer  # noqa: E501

        :param return_air_temp: The return_air_temp of this AssetReeferResponseReeferStats.
        :type return_air_temp: List[AssetReeferResponseReeferStatsReturnAirTemp]
        """

        self._return_air_temp = return_air_temp

    @property
    def alarms(self):
        """Gets the alarms of this AssetReeferResponseReeferStats.

        Reefer alarms  # noqa: E501

        :return: The alarms of this AssetReeferResponseReeferStats.
        :rtype: List[AssetReeferResponseReeferStatsAlarms1]
        """
        return self._alarms

    @alarms.setter
    def alarms(self, alarms):
        """Sets the alarms of this AssetReeferResponseReeferStats.

        Reefer alarms  # noqa: E501

        :param alarms: The alarms of this AssetReeferResponseReeferStats.
        :type alarms: List[AssetReeferResponseReeferStatsAlarms1]
        """

        self._alarms = alarms
