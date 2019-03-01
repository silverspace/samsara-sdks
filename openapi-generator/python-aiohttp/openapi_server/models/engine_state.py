# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class EngineState(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, time_ms: object=None, value: str=None):
        """EngineState - a model defined in OpenAPI

        :param time_ms: The time_ms of this EngineState.
        :param value: The value of this EngineState.
        """
        self.openapi_types = {
            'time_ms': object,
            'value': str
        }

        self.attribute_map = {
            'time_ms': 'timeMs',
            'value': 'value'
        }

        self._time_ms = time_ms
        self._value = value

    @classmethod
    def from_dict(cls, dikt: dict) -> 'EngineState':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The EngineState of this EngineState.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def time_ms(self):
        """Gets the time_ms of this EngineState.

        Timestamp in Unix epoch milliseconds.

        :return: The time_ms of this EngineState.
        :rtype: object
        """
        return self._time_ms

    @time_ms.setter
    def time_ms(self, time_ms):
        """Sets the time_ms of this EngineState.

        Timestamp in Unix epoch milliseconds.

        :param time_ms: The time_ms of this EngineState.
        :type time_ms: object
        """
        if time_ms is None:
            raise ValueError("Invalid value for `time_ms`, must not be `None`")

        self._time_ms = time_ms

    @property
    def value(self):
        """Gets the value of this EngineState.


        :return: The value of this EngineState.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this EngineState.


        :param value: The value of this EngineState.
        :type value: str
        """
        allowed_values = ["Running", "Off", "Idle"]
        if value not in allowed_values:
            raise ValueError(
                "Invalid value for `value` ({0}), must be one of {1}"
                .format(value, allowed_values)
            )

        self._value = value