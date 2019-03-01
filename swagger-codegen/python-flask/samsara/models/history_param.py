# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class HistoryParam(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, end_ms: int=None, group_id: int=None, start_ms: int=None):  # noqa: E501
        """HistoryParam - a model defined in Swagger

        :param end_ms: The end_ms of this HistoryParam.  # noqa: E501
        :type end_ms: int
        :param group_id: The group_id of this HistoryParam.  # noqa: E501
        :type group_id: int
        :param start_ms: The start_ms of this HistoryParam.  # noqa: E501
        :type start_ms: int
        """
        self.swagger_types = {
            'end_ms': int,
            'group_id': int,
            'start_ms': int
        }

        self.attribute_map = {
            'end_ms': 'endMs',
            'group_id': 'groupId',
            'start_ms': 'startMs'
        }

        self._end_ms = end_ms
        self._group_id = group_id
        self._start_ms = start_ms

    @classmethod
    def from_dict(cls, dikt) -> 'HistoryParam':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The historyParam of this HistoryParam.  # noqa: E501
        :rtype: HistoryParam
        """
        return util.deserialize_model(dikt, cls)

    @property
    def end_ms(self) -> int:
        """Gets the end_ms of this HistoryParam.

        End of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :return: The end_ms of this HistoryParam.
        :rtype: int
        """
        return self._end_ms

    @end_ms.setter
    def end_ms(self, end_ms: int):
        """Sets the end_ms of this HistoryParam.

        End of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :param end_ms: The end_ms of this HistoryParam.
        :type end_ms: int
        """
        if end_ms is None:
            raise ValueError("Invalid value for `end_ms`, must not be `None`")  # noqa: E501

        self._end_ms = end_ms

    @property
    def group_id(self) -> int:
        """Gets the group_id of this HistoryParam.

        Group ID to query.  # noqa: E501

        :return: The group_id of this HistoryParam.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this HistoryParam.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this HistoryParam.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def start_ms(self) -> int:
        """Gets the start_ms of this HistoryParam.

        Beginning of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :return: The start_ms of this HistoryParam.
        :rtype: int
        """
        return self._start_ms

    @start_ms.setter
    def start_ms(self, start_ms: int):
        """Sets the start_ms of this HistoryParam.

        Beginning of the time range, specified in milliseconds UNIX time.  # noqa: E501

        :param start_ms: The start_ms of this HistoryParam.
        :type start_ms: int
        """
        if start_ms is None:
            raise ValueError("Invalid value for `start_ms`, must not be `None`")  # noqa: E501

        self._start_ms = start_ms
