# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class HosAuthenticationLogsParam(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, driver_id: int=None, end_ms: int=None, group_id: int=None, start_ms: int=None):  # noqa: E501
        """HosAuthenticationLogsParam - a model defined in Swagger

        :param driver_id: The driver_id of this HosAuthenticationLogsParam.  # noqa: E501
        :type driver_id: int
        :param end_ms: The end_ms of this HosAuthenticationLogsParam.  # noqa: E501
        :type end_ms: int
        :param group_id: The group_id of this HosAuthenticationLogsParam.  # noqa: E501
        :type group_id: int
        :param start_ms: The start_ms of this HosAuthenticationLogsParam.  # noqa: E501
        :type start_ms: int
        """
        self.swagger_types = {
            'driver_id': int,
            'end_ms': int,
            'group_id': int,
            'start_ms': int
        }

        self.attribute_map = {
            'driver_id': 'driverId',
            'end_ms': 'endMs',
            'group_id': 'groupId',
            'start_ms': 'startMs'
        }

        self._driver_id = driver_id
        self._end_ms = end_ms
        self._group_id = group_id
        self._start_ms = start_ms

    @classmethod
    def from_dict(cls, dikt) -> 'HosAuthenticationLogsParam':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The hosAuthenticationLogsParam of this HosAuthenticationLogsParam.  # noqa: E501
        :rtype: HosAuthenticationLogsParam
        """
        return util.deserialize_model(dikt, cls)

    @property
    def driver_id(self) -> int:
        """Gets the driver_id of this HosAuthenticationLogsParam.

        Driver ID to query.  # noqa: E501

        :return: The driver_id of this HosAuthenticationLogsParam.
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id: int):
        """Sets the driver_id of this HosAuthenticationLogsParam.

        Driver ID to query.  # noqa: E501

        :param driver_id: The driver_id of this HosAuthenticationLogsParam.
        :type driver_id: int
        """
        if driver_id is None:
            raise ValueError("Invalid value for `driver_id`, must not be `None`")  # noqa: E501

        self._driver_id = driver_id

    @property
    def end_ms(self) -> int:
        """Gets the end_ms of this HosAuthenticationLogsParam.

        End of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :return: The end_ms of this HosAuthenticationLogsParam.
        :rtype: int
        """
        return self._end_ms

    @end_ms.setter
    def end_ms(self, end_ms: int):
        """Sets the end_ms of this HosAuthenticationLogsParam.

        End of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :param end_ms: The end_ms of this HosAuthenticationLogsParam.
        :type end_ms: int
        """
        if end_ms is None:
            raise ValueError("Invalid value for `end_ms`, must not be `None`")  # noqa: E501

        self._end_ms = end_ms

    @property
    def group_id(self) -> int:
        """Gets the group_id of this HosAuthenticationLogsParam.

        Group ID to query.  # noqa: E501

        :return: The group_id of this HosAuthenticationLogsParam.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this HosAuthenticationLogsParam.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this HosAuthenticationLogsParam.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def start_ms(self) -> int:
        """Gets the start_ms of this HosAuthenticationLogsParam.

        Beginning of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :return: The start_ms of this HosAuthenticationLogsParam.
        :rtype: int
        """
        return self._start_ms

    @start_ms.setter
    def start_ms(self, start_ms: int):
        """Sets the start_ms of this HosAuthenticationLogsParam.

        Beginning of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :param start_ms: The start_ms of this HosAuthenticationLogsParam.
        :type start_ms: int
        """
        if start_ms is None:
            raise ValueError("Invalid value for `start_ms`, must not be `None`")  # noqa: E501

        self._start_ms = start_ms
