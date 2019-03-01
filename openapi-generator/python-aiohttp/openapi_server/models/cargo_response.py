# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.cargo_response_sensors import CargoResponseSensors
from openapi_server import util


class CargoResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_id: int=None, sensors: List[CargoResponseSensors]=None):
        """CargoResponse - a model defined in OpenAPI

        :param group_id: The group_id of this CargoResponse.
        :param sensors: The sensors of this CargoResponse.
        """
        self.openapi_types = {
            'group_id': int,
            'sensors': List[CargoResponseSensors]
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'sensors': 'sensors'
        }

        self._group_id = group_id
        self._sensors = sensors

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CargoResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CargoResponse of this CargoResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self):
        """Gets the group_id of this CargoResponse.


        :return: The group_id of this CargoResponse.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this CargoResponse.


        :param group_id: The group_id of this CargoResponse.
        :type group_id: int
        """

        self._group_id = group_id

    @property
    def sensors(self):
        """Gets the sensors of this CargoResponse.


        :return: The sensors of this CargoResponse.
        :rtype: List[CargoResponseSensors]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors):
        """Sets the sensors of this CargoResponse.


        :param sensors: The sensors of this CargoResponse.
        :type sensors: List[CargoResponseSensors]
        """

        self._sensors = sensors
