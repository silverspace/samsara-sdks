# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class AssetReeferResponseReeferStatsAlarms(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, alarm_code: int=None, description: str=None, operator_action: str=None, severity: int=None):  # noqa: E501
        """AssetReeferResponseReeferStatsAlarms - a model defined in Swagger

        :param alarm_code: The alarm_code of this AssetReeferResponseReeferStatsAlarms.  # noqa: E501
        :type alarm_code: int
        :param description: The description of this AssetReeferResponseReeferStatsAlarms.  # noqa: E501
        :type description: str
        :param operator_action: The operator_action of this AssetReeferResponseReeferStatsAlarms.  # noqa: E501
        :type operator_action: str
        :param severity: The severity of this AssetReeferResponseReeferStatsAlarms.  # noqa: E501
        :type severity: int
        """
        self.swagger_types = {
            'alarm_code': int,
            'description': str,
            'operator_action': str,
            'severity': int
        }

        self.attribute_map = {
            'alarm_code': 'alarmCode',
            'description': 'description',
            'operator_action': 'operatorAction',
            'severity': 'severity'
        }

        self._alarm_code = alarm_code
        self._description = description
        self._operator_action = operator_action
        self._severity = severity

    @classmethod
    def from_dict(cls, dikt) -> 'AssetReeferResponseReeferStatsAlarms':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssetReeferResponse_reeferStats_alarms of this AssetReeferResponseReeferStatsAlarms.  # noqa: E501
        :rtype: AssetReeferResponseReeferStatsAlarms
        """
        return util.deserialize_model(dikt, cls)

    @property
    def alarm_code(self) -> int:
        """Gets the alarm_code of this AssetReeferResponseReeferStatsAlarms.

        ID of the alarm  # noqa: E501

        :return: The alarm_code of this AssetReeferResponseReeferStatsAlarms.
        :rtype: int
        """
        return self._alarm_code

    @alarm_code.setter
    def alarm_code(self, alarm_code: int):
        """Sets the alarm_code of this AssetReeferResponseReeferStatsAlarms.

        ID of the alarm  # noqa: E501

        :param alarm_code: The alarm_code of this AssetReeferResponseReeferStatsAlarms.
        :type alarm_code: int
        """

        self._alarm_code = alarm_code

    @property
    def description(self) -> str:
        """Gets the description of this AssetReeferResponseReeferStatsAlarms.

        Description of the alarm  # noqa: E501

        :return: The description of this AssetReeferResponseReeferStatsAlarms.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this AssetReeferResponseReeferStatsAlarms.

        Description of the alarm  # noqa: E501

        :param description: The description of this AssetReeferResponseReeferStatsAlarms.
        :type description: str
        """

        self._description = description

    @property
    def operator_action(self) -> str:
        """Gets the operator_action of this AssetReeferResponseReeferStatsAlarms.

        Recommended operator action  # noqa: E501

        :return: The operator_action of this AssetReeferResponseReeferStatsAlarms.
        :rtype: str
        """
        return self._operator_action

    @operator_action.setter
    def operator_action(self, operator_action: str):
        """Sets the operator_action of this AssetReeferResponseReeferStatsAlarms.

        Recommended operator action  # noqa: E501

        :param operator_action: The operator_action of this AssetReeferResponseReeferStatsAlarms.
        :type operator_action: str
        """

        self._operator_action = operator_action

    @property
    def severity(self) -> int:
        """Gets the severity of this AssetReeferResponseReeferStatsAlarms.

        Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action  # noqa: E501

        :return: The severity of this AssetReeferResponseReeferStatsAlarms.
        :rtype: int
        """
        return self._severity

    @severity.setter
    def severity(self, severity: int):
        """Sets the severity of this AssetReeferResponseReeferStatsAlarms.

        Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action  # noqa: E501

        :param severity: The severity of this AssetReeferResponseReeferStatsAlarms.
        :type severity: int
        """

        self._severity = severity