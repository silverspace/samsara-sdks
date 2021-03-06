# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class AssetReeferResponseReeferStatsAlarms(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, severity: int=None, operator_action: str=None, description: str=None, alarm_code: int=None):
        """AssetReeferResponseReeferStatsAlarms - a model defined in OpenAPI

        :param severity: The severity of this AssetReeferResponseReeferStatsAlarms.
        :param operator_action: The operator_action of this AssetReeferResponseReeferStatsAlarms.
        :param description: The description of this AssetReeferResponseReeferStatsAlarms.
        :param alarm_code: The alarm_code of this AssetReeferResponseReeferStatsAlarms.
        """
        self.openapi_types = {
            'severity': int,
            'operator_action': str,
            'description': str,
            'alarm_code': int
        }

        self.attribute_map = {
            'severity': 'severity',
            'operator_action': 'operatorAction',
            'description': 'description',
            'alarm_code': 'alarmCode'
        }

        self._severity = severity
        self._operator_action = operator_action
        self._description = description
        self._alarm_code = alarm_code

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AssetReeferResponseReeferStatsAlarms':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AssetReeferResponse_reeferStats_alarms of this AssetReeferResponseReeferStatsAlarms.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def severity(self):
        """Gets the severity of this AssetReeferResponseReeferStatsAlarms.

        Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action

        :return: The severity of this AssetReeferResponseReeferStatsAlarms.
        :rtype: int
        """
        return self._severity

    @severity.setter
    def severity(self, severity):
        """Sets the severity of this AssetReeferResponseReeferStatsAlarms.

        Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action

        :param severity: The severity of this AssetReeferResponseReeferStatsAlarms.
        :type severity: int
        """

        self._severity = severity

    @property
    def operator_action(self):
        """Gets the operator_action of this AssetReeferResponseReeferStatsAlarms.

        Recommended operator action

        :return: The operator_action of this AssetReeferResponseReeferStatsAlarms.
        :rtype: str
        """
        return self._operator_action

    @operator_action.setter
    def operator_action(self, operator_action):
        """Sets the operator_action of this AssetReeferResponseReeferStatsAlarms.

        Recommended operator action

        :param operator_action: The operator_action of this AssetReeferResponseReeferStatsAlarms.
        :type operator_action: str
        """

        self._operator_action = operator_action

    @property
    def description(self):
        """Gets the description of this AssetReeferResponseReeferStatsAlarms.

        Description of the alarm

        :return: The description of this AssetReeferResponseReeferStatsAlarms.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this AssetReeferResponseReeferStatsAlarms.

        Description of the alarm

        :param description: The description of this AssetReeferResponseReeferStatsAlarms.
        :type description: str
        """

        self._description = description

    @property
    def alarm_code(self):
        """Gets the alarm_code of this AssetReeferResponseReeferStatsAlarms.

        ID of the alarm

        :return: The alarm_code of this AssetReeferResponseReeferStatsAlarms.
        :rtype: int
        """
        return self._alarm_code

    @alarm_code.setter
    def alarm_code(self, alarm_code):
        """Sets the alarm_code of this AssetReeferResponseReeferStatsAlarms.

        ID of the alarm

        :param alarm_code: The alarm_code of this AssetReeferResponseReeferStatsAlarms.
        :type alarm_code: int
        """

        self._alarm_code = alarm_code
