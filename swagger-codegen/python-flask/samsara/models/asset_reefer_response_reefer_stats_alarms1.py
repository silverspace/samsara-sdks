# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.asset_reefer_response_reefer_stats_alarms import AssetReeferResponseReeferStatsAlarms  # noqa: F401,E501
from samsara import util


class AssetReeferResponseReeferStatsAlarms1(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, alarms: List[AssetReeferResponseReeferStatsAlarms]=None, changed_at_ms: int=None):  # noqa: E501
        """AssetReeferResponseReeferStatsAlarms1 - a model defined in Swagger

        :param alarms: The alarms of this AssetReeferResponseReeferStatsAlarms1.  # noqa: E501
        :type alarms: List[AssetReeferResponseReeferStatsAlarms]
        :param changed_at_ms: The changed_at_ms of this AssetReeferResponseReeferStatsAlarms1.  # noqa: E501
        :type changed_at_ms: int
        """
        self.swagger_types = {
            'alarms': List[AssetReeferResponseReeferStatsAlarms],
            'changed_at_ms': int
        }

        self.attribute_map = {
            'alarms': 'alarms',
            'changed_at_ms': 'changedAtMs'
        }

        self._alarms = alarms
        self._changed_at_ms = changed_at_ms

    @classmethod
    def from_dict(cls, dikt) -> 'AssetReeferResponseReeferStatsAlarms1':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssetReeferResponse_reeferStats_alarms_1 of this AssetReeferResponseReeferStatsAlarms1.  # noqa: E501
        :rtype: AssetReeferResponseReeferStatsAlarms1
        """
        return util.deserialize_model(dikt, cls)

    @property
    def alarms(self) -> List[AssetReeferResponseReeferStatsAlarms]:
        """Gets the alarms of this AssetReeferResponseReeferStatsAlarms1.


        :return: The alarms of this AssetReeferResponseReeferStatsAlarms1.
        :rtype: List[AssetReeferResponseReeferStatsAlarms]
        """
        return self._alarms

    @alarms.setter
    def alarms(self, alarms: List[AssetReeferResponseReeferStatsAlarms]):
        """Sets the alarms of this AssetReeferResponseReeferStatsAlarms1.


        :param alarms: The alarms of this AssetReeferResponseReeferStatsAlarms1.
        :type alarms: List[AssetReeferResponseReeferStatsAlarms]
        """

        self._alarms = alarms

    @property
    def changed_at_ms(self) -> int:
        """Gets the changed_at_ms of this AssetReeferResponseReeferStatsAlarms1.

        Timestamp when the alarms were reported, in Unix milliseconds since epoch  # noqa: E501

        :return: The changed_at_ms of this AssetReeferResponseReeferStatsAlarms1.
        :rtype: int
        """
        return self._changed_at_ms

    @changed_at_ms.setter
    def changed_at_ms(self, changed_at_ms: int):
        """Sets the changed_at_ms of this AssetReeferResponseReeferStatsAlarms1.

        Timestamp when the alarms were reported, in Unix milliseconds since epoch  # noqa: E501

        :param changed_at_ms: The changed_at_ms of this AssetReeferResponseReeferStatsAlarms1.
        :type changed_at_ms: int
        """

        self._changed_at_ms = changed_at_ms