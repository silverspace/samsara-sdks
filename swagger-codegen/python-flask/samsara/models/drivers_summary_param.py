# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class DriversSummaryParam(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, end_ms: int=None, org_id: int=None, start_ms: int=None):  # noqa: E501
        """DriversSummaryParam - a model defined in Swagger

        :param end_ms: The end_ms of this DriversSummaryParam.  # noqa: E501
        :type end_ms: int
        :param org_id: The org_id of this DriversSummaryParam.  # noqa: E501
        :type org_id: int
        :param start_ms: The start_ms of this DriversSummaryParam.  # noqa: E501
        :type start_ms: int
        """
        self.swagger_types = {
            'end_ms': int,
            'org_id': int,
            'start_ms': int
        }

        self.attribute_map = {
            'end_ms': 'endMs',
            'org_id': 'orgId',
            'start_ms': 'startMs'
        }

        self._end_ms = end_ms
        self._org_id = org_id
        self._start_ms = start_ms

    @classmethod
    def from_dict(cls, dikt) -> 'DriversSummaryParam':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The driversSummaryParam of this DriversSummaryParam.  # noqa: E501
        :rtype: DriversSummaryParam
        """
        return util.deserialize_model(dikt, cls)

    @property
    def end_ms(self) -> int:
        """Gets the end_ms of this DriversSummaryParam.

        End time (ms) of queried time period.  # noqa: E501

        :return: The end_ms of this DriversSummaryParam.
        :rtype: int
        """
        return self._end_ms

    @end_ms.setter
    def end_ms(self, end_ms: int):
        """Sets the end_ms of this DriversSummaryParam.

        End time (ms) of queried time period.  # noqa: E501

        :param end_ms: The end_ms of this DriversSummaryParam.
        :type end_ms: int
        """
        if end_ms is None:
            raise ValueError("Invalid value for `end_ms`, must not be `None`")  # noqa: E501

        self._end_ms = end_ms

    @property
    def org_id(self) -> int:
        """Gets the org_id of this DriversSummaryParam.

        Org ID to query.  # noqa: E501

        :return: The org_id of this DriversSummaryParam.
        :rtype: int
        """
        return self._org_id

    @org_id.setter
    def org_id(self, org_id: int):
        """Sets the org_id of this DriversSummaryParam.

        Org ID to query.  # noqa: E501

        :param org_id: The org_id of this DriversSummaryParam.
        :type org_id: int
        """
        if org_id is None:
            raise ValueError("Invalid value for `org_id`, must not be `None`")  # noqa: E501

        self._org_id = org_id

    @property
    def start_ms(self) -> int:
        """Gets the start_ms of this DriversSummaryParam.

        Start time (ms) of queried time period.  # noqa: E501

        :return: The start_ms of this DriversSummaryParam.
        :rtype: int
        """
        return self._start_ms

    @start_ms.setter
    def start_ms(self, start_ms: int):
        """Sets the start_ms of this DriversSummaryParam.

        Start time (ms) of queried time period.  # noqa: E501

        :param start_ms: The start_ms of this DriversSummaryParam.
        :type start_ms: int
        """
        if start_ms is None:
            raise ValueError("Invalid value for `start_ms`, must not be `None`")  # noqa: E501

        self._start_ms = start_ms