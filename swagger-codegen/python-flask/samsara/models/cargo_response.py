# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.cargo_response_sensors import CargoResponseSensors  # noqa: F401,E501
from samsara import util


class CargoResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, group_id: int=None, sensors: List[CargoResponseSensors]=None):  # noqa: E501
        """CargoResponse - a model defined in Swagger

        :param group_id: The group_id of this CargoResponse.  # noqa: E501
        :type group_id: int
        :param sensors: The sensors of this CargoResponse.  # noqa: E501
        :type sensors: List[CargoResponseSensors]
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'CargoResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CargoResponse of this CargoResponse.  # noqa: E501
        :rtype: CargoResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self) -> int:
        """Gets the group_id of this CargoResponse.


        :return: The group_id of this CargoResponse.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this CargoResponse.


        :param group_id: The group_id of this CargoResponse.
        :type group_id: int
        """

        self._group_id = group_id

    @property
    def sensors(self) -> List[CargoResponseSensors]:
        """Gets the sensors of this CargoResponse.


        :return: The sensors of this CargoResponse.
        :rtype: List[CargoResponseSensors]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors: List[CargoResponseSensors]):
        """Sets the sensors of this CargoResponse.


        :param sensors: The sensors of this CargoResponse.
        :type sensors: List[CargoResponseSensors]
        """

        self._sensors = sensors