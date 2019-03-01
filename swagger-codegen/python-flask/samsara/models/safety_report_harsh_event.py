# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class SafetyReportHarshEvent(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, harsh_event_type: str=None, timestamp_ms: int=None, vehicle_id: int=None):  # noqa: E501
        """SafetyReportHarshEvent - a model defined in Swagger

        :param harsh_event_type: The harsh_event_type of this SafetyReportHarshEvent.  # noqa: E501
        :type harsh_event_type: str
        :param timestamp_ms: The timestamp_ms of this SafetyReportHarshEvent.  # noqa: E501
        :type timestamp_ms: int
        :param vehicle_id: The vehicle_id of this SafetyReportHarshEvent.  # noqa: E501
        :type vehicle_id: int
        """
        self.swagger_types = {
            'harsh_event_type': str,
            'timestamp_ms': int,
            'vehicle_id': int
        }

        self.attribute_map = {
            'harsh_event_type': 'harshEventType',
            'timestamp_ms': 'timestampMs',
            'vehicle_id': 'vehicleId'
        }

        self._harsh_event_type = harsh_event_type
        self._timestamp_ms = timestamp_ms
        self._vehicle_id = vehicle_id

    @classmethod
    def from_dict(cls, dikt) -> 'SafetyReportHarshEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SafetyReportHarshEvent of this SafetyReportHarshEvent.  # noqa: E501
        :rtype: SafetyReportHarshEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def harsh_event_type(self) -> str:
        """Gets the harsh_event_type of this SafetyReportHarshEvent.

        Type of the harsh event  # noqa: E501

        :return: The harsh_event_type of this SafetyReportHarshEvent.
        :rtype: str
        """
        return self._harsh_event_type

    @harsh_event_type.setter
    def harsh_event_type(self, harsh_event_type: str):
        """Sets the harsh_event_type of this SafetyReportHarshEvent.

        Type of the harsh event  # noqa: E501

        :param harsh_event_type: The harsh_event_type of this SafetyReportHarshEvent.
        :type harsh_event_type: str
        """

        self._harsh_event_type = harsh_event_type

    @property
    def timestamp_ms(self) -> int:
        """Gets the timestamp_ms of this SafetyReportHarshEvent.

        Timestamp that the harsh event occurred in Unix milliseconds since epoch  # noqa: E501

        :return: The timestamp_ms of this SafetyReportHarshEvent.
        :rtype: int
        """
        return self._timestamp_ms

    @timestamp_ms.setter
    def timestamp_ms(self, timestamp_ms: int):
        """Sets the timestamp_ms of this SafetyReportHarshEvent.

        Timestamp that the harsh event occurred in Unix milliseconds since epoch  # noqa: E501

        :param timestamp_ms: The timestamp_ms of this SafetyReportHarshEvent.
        :type timestamp_ms: int
        """

        self._timestamp_ms = timestamp_ms

    @property
    def vehicle_id(self) -> int:
        """Gets the vehicle_id of this SafetyReportHarshEvent.

        Vehicle associated with the harsh event  # noqa: E501

        :return: The vehicle_id of this SafetyReportHarshEvent.
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id: int):
        """Sets the vehicle_id of this SafetyReportHarshEvent.

        Vehicle associated with the harsh event  # noqa: E501

        :param vehicle_id: The vehicle_id of this SafetyReportHarshEvent.
        :type vehicle_id: int
        """

        self._vehicle_id = vehicle_id
