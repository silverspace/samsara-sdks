# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DataInputHistoryResponsePoints(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, value=None, time_ms=None):  # noqa: E501
        """DataInputHistoryResponsePoints - a model defined in OpenAPI

        :param value: The value of this DataInputHistoryResponsePoints.  # noqa: E501
        :type value: float
        :param time_ms: The time_ms of this DataInputHistoryResponsePoints.  # noqa: E501
        :type time_ms: int
        """
        self.openapi_types = {
            'value': float,
            'time_ms': int
        }

        self.attribute_map = {
            'value': 'value',
            'time_ms': 'timeMs'
        }

        self._value = value
        self._time_ms = time_ms

    @classmethod
    def from_dict(cls, dikt) -> 'DataInputHistoryResponsePoints':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DataInputHistoryResponse_points of this DataInputHistoryResponsePoints.  # noqa: E501
        :rtype: DataInputHistoryResponsePoints
        """
        return util.deserialize_model(dikt, cls)

    @property
    def value(self):
        """Gets the value of this DataInputHistoryResponsePoints.


        :return: The value of this DataInputHistoryResponsePoints.
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this DataInputHistoryResponsePoints.


        :param value: The value of this DataInputHistoryResponsePoints.
        :type value: float
        """

        self._value = value

    @property
    def time_ms(self):
        """Gets the time_ms of this DataInputHistoryResponsePoints.


        :return: The time_ms of this DataInputHistoryResponsePoints.
        :rtype: int
        """
        return self._time_ms

    @time_ms.setter
    def time_ms(self, time_ms):
        """Sets the time_ms of this DataInputHistoryResponsePoints.


        :param time_ms: The time_ms of this DataInputHistoryResponsePoints.
        :type time_ms: int
        """

        self._time_ms = time_ms
