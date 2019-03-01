# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class InlineObject15(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, end_ms=None, group_id=None, start_ms=None, vehicle_id=None):  # noqa: E501
        """InlineObject15 - a model defined in OpenAPI

        :param end_ms: The end_ms of this InlineObject15.  # noqa: E501
        :type end_ms: int
        :param group_id: The group_id of this InlineObject15.  # noqa: E501
        :type group_id: int
        :param start_ms: The start_ms of this InlineObject15.  # noqa: E501
        :type start_ms: int
        :param vehicle_id: The vehicle_id of this InlineObject15.  # noqa: E501
        :type vehicle_id: int
        """
        self.openapi_types = {
            'end_ms': int,
            'group_id': int,
            'start_ms': int,
            'vehicle_id': int
        }

        self.attribute_map = {
            'end_ms': 'endMs',
            'group_id': 'groupId',
            'start_ms': 'startMs',
            'vehicle_id': 'vehicleId'
        }

        self._end_ms = end_ms
        self._group_id = group_id
        self._start_ms = start_ms
        self._vehicle_id = vehicle_id

    @classmethod
    def from_dict(cls, dikt) -> 'InlineObject15':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_object_15 of this InlineObject15.  # noqa: E501
        :rtype: InlineObject15
        """
        return util.deserialize_model(dikt, cls)

    @property
    def end_ms(self):
        """Gets the end_ms of this InlineObject15.

        End of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :return: The end_ms of this InlineObject15.
        :rtype: int
        """
        return self._end_ms

    @end_ms.setter
    def end_ms(self, end_ms):
        """Sets the end_ms of this InlineObject15.

        End of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :param end_ms: The end_ms of this InlineObject15.
        :type end_ms: int
        """
        if end_ms is None:
            raise ValueError("Invalid value for `end_ms`, must not be `None`")  # noqa: E501

        self._end_ms = end_ms

    @property
    def group_id(self):
        """Gets the group_id of this InlineObject15.

        Group ID to query.  # noqa: E501

        :return: The group_id of this InlineObject15.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this InlineObject15.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this InlineObject15.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def start_ms(self):
        """Gets the start_ms of this InlineObject15.

        Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs  # noqa: E501

        :return: The start_ms of this InlineObject15.
        :rtype: int
        """
        return self._start_ms

    @start_ms.setter
    def start_ms(self, start_ms):
        """Sets the start_ms of this InlineObject15.

        Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs  # noqa: E501

        :param start_ms: The start_ms of this InlineObject15.
        :type start_ms: int
        """
        if start_ms is None:
            raise ValueError("Invalid value for `start_ms`, must not be `None`")  # noqa: E501

        self._start_ms = start_ms

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this InlineObject15.

        Vehicle ID to query.  # noqa: E501

        :return: The vehicle_id of this InlineObject15.
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this InlineObject15.

        Vehicle ID to query.  # noqa: E501

        :param vehicle_id: The vehicle_id of this InlineObject15.
        :type vehicle_id: int
        """
        if vehicle_id is None:
            raise ValueError("Invalid value for `vehicle_id`, must not be `None`")  # noqa: E501

        self._vehicle_id = vehicle_id
