# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.fleet_vehicle_response_vehicle_info import FleetVehicleResponseVehicleInfo
from openapi_server import util

from openapi_server.models.fleet_vehicle_response_vehicle_info import FleetVehicleResponseVehicleInfo  # noqa: E501

class FleetVehicleResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, external_ids=None, harsh_accel_setting=None, id=None, name=None, vehicle_info=None):  # noqa: E501
        """FleetVehicleResponse - a model defined in OpenAPI

        :param external_ids: The external_ids of this FleetVehicleResponse.  # noqa: E501
        :type external_ids: Dict[str, str]
        :param harsh_accel_setting: The harsh_accel_setting of this FleetVehicleResponse.  # noqa: E501
        :type harsh_accel_setting: str
        :param id: The id of this FleetVehicleResponse.  # noqa: E501
        :type id: int
        :param name: The name of this FleetVehicleResponse.  # noqa: E501
        :type name: str
        :param vehicle_info: The vehicle_info of this FleetVehicleResponse.  # noqa: E501
        :type vehicle_info: FleetVehicleResponseVehicleInfo
        """
        self.openapi_types = {
            'external_ids': Dict[str, str],
            'harsh_accel_setting': str,
            'id': int,
            'name': str,
            'vehicle_info': FleetVehicleResponseVehicleInfo
        }

        self.attribute_map = {
            'external_ids': 'externalIds',
            'harsh_accel_setting': 'harshAccelSetting',
            'id': 'id',
            'name': 'name',
            'vehicle_info': 'vehicleInfo'
        }

        self._external_ids = external_ids
        self._harsh_accel_setting = harsh_accel_setting
        self._id = id
        self._name = name
        self._vehicle_info = vehicle_info

    @classmethod
    def from_dict(cls, dikt) -> 'FleetVehicleResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FleetVehicleResponse of this FleetVehicleResponse.  # noqa: E501
        :rtype: FleetVehicleResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def external_ids(self):
        """Gets the external_ids of this FleetVehicleResponse.


        :return: The external_ids of this FleetVehicleResponse.
        :rtype: Dict[str, str]
        """
        return self._external_ids

    @external_ids.setter
    def external_ids(self, external_ids):
        """Sets the external_ids of this FleetVehicleResponse.


        :param external_ids: The external_ids of this FleetVehicleResponse.
        :type external_ids: Dict[str, str]
        """

        self._external_ids = external_ids

    @property
    def harsh_accel_setting(self):
        """Gets the harsh_accel_setting of this FleetVehicleResponse.

        Harsh event detection setting.  # noqa: E501

        :return: The harsh_accel_setting of this FleetVehicleResponse.
        :rtype: str
        """
        return self._harsh_accel_setting

    @harsh_accel_setting.setter
    def harsh_accel_setting(self, harsh_accel_setting):
        """Sets the harsh_accel_setting of this FleetVehicleResponse.

        Harsh event detection setting.  # noqa: E501

        :param harsh_accel_setting: The harsh_accel_setting of this FleetVehicleResponse.
        :type harsh_accel_setting: str
        """

        self._harsh_accel_setting = harsh_accel_setting

    @property
    def id(self):
        """Gets the id of this FleetVehicleResponse.

        ID of the vehicle.  # noqa: E501

        :return: The id of this FleetVehicleResponse.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this FleetVehicleResponse.

        ID of the vehicle.  # noqa: E501

        :param id: The id of this FleetVehicleResponse.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self):
        """Gets the name of this FleetVehicleResponse.

        Name of the vehicle.  # noqa: E501

        :return: The name of this FleetVehicleResponse.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this FleetVehicleResponse.

        Name of the vehicle.  # noqa: E501

        :param name: The name of this FleetVehicleResponse.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def vehicle_info(self):
        """Gets the vehicle_info of this FleetVehicleResponse.


        :return: The vehicle_info of this FleetVehicleResponse.
        :rtype: FleetVehicleResponseVehicleInfo
        """
        return self._vehicle_info

    @vehicle_info.setter
    def vehicle_info(self, vehicle_info):
        """Sets the vehicle_info of this FleetVehicleResponse.


        :param vehicle_info: The vehicle_info of this FleetVehicleResponse.
        :type vehicle_info: FleetVehicleResponseVehicleInfo
        """

        self._vehicle_info = vehicle_info
