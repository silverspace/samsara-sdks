# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class SensorParam(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, group_id: int=None, sensors: List[int]=None):  # noqa: E501
        """SensorParam - a model defined in Swagger

        :param group_id: The group_id of this SensorParam.  # noqa: E501
        :type group_id: int
        :param sensors: The sensors of this SensorParam.  # noqa: E501
        :type sensors: List[int]
        """
        self.swagger_types = {
            'group_id': int,
            'sensors': List[int]
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'sensors': 'sensors'
        }

        self._group_id = group_id
        self._sensors = sensors

    @classmethod
    def from_dict(cls, dikt) -> 'SensorParam':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The sensorParam of this SensorParam.  # noqa: E501
        :rtype: SensorParam
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self) -> int:
        """Gets the group_id of this SensorParam.

        Group ID to query.  # noqa: E501

        :return: The group_id of this SensorParam.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this SensorParam.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this SensorParam.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def sensors(self) -> List[int]:
        """Gets the sensors of this SensorParam.

        List of sensor IDs to query.  # noqa: E501

        :return: The sensors of this SensorParam.
        :rtype: List[int]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors: List[int]):
        """Sets the sensors of this SensorParam.

        List of sensor IDs to query.  # noqa: E501

        :param sensors: The sensors of this SensorParam.
        :type sensors: List[int]
        """
        if sensors is None:
            raise ValueError("Invalid value for `sensors`, must not be `None`")  # noqa: E501

        self._sensors = sensors