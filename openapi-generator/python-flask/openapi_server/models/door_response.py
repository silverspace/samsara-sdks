# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.door_response_sensors import DoorResponseSensors
from openapi_server import util

from openapi_server.models.door_response_sensors import DoorResponseSensors  # noqa: E501

class DoorResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_id=None, sensors=None):  # noqa: E501
        """DoorResponse - a model defined in OpenAPI

        :param group_id: The group_id of this DoorResponse.  # noqa: E501
        :type group_id: int
        :param sensors: The sensors of this DoorResponse.  # noqa: E501
        :type sensors: List[DoorResponseSensors]
        """
        self.openapi_types = {
            'group_id': int,
            'sensors': List[DoorResponseSensors]
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'sensors': 'sensors'
        }

        self._group_id = group_id
        self._sensors = sensors

    @classmethod
    def from_dict(cls, dikt) -> 'DoorResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DoorResponse of this DoorResponse.  # noqa: E501
        :rtype: DoorResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self):
        """Gets the group_id of this DoorResponse.


        :return: The group_id of this DoorResponse.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this DoorResponse.


        :param group_id: The group_id of this DoorResponse.
        :type group_id: int
        """

        self._group_id = group_id

    @property
    def sensors(self):
        """Gets the sensors of this DoorResponse.


        :return: The sensors of this DoorResponse.
        :rtype: List[DoorResponseSensors]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors):
        """Sets the sensors of this DoorResponse.


        :param sensors: The sensors of this DoorResponse.
        :type sensors: List[DoorResponseSensors]
        """

        self._sensors = sensors
