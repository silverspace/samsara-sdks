# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.hos_logs_summary_response_drivers import HosLogsSummaryResponseDrivers  # noqa: F401,E501
from samsara import util


class HosLogsSummaryResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, drivers: List[HosLogsSummaryResponseDrivers]=None):  # noqa: E501
        """HosLogsSummaryResponse - a model defined in Swagger

        :param drivers: The drivers of this HosLogsSummaryResponse.  # noqa: E501
        :type drivers: List[HosLogsSummaryResponseDrivers]
        """
        self.swagger_types = {
            'drivers': List[HosLogsSummaryResponseDrivers]
        }

        self.attribute_map = {
            'drivers': 'drivers'
        }

        self._drivers = drivers

    @classmethod
    def from_dict(cls, dikt) -> 'HosLogsSummaryResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The HosLogsSummaryResponse of this HosLogsSummaryResponse.  # noqa: E501
        :rtype: HosLogsSummaryResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def drivers(self) -> List[HosLogsSummaryResponseDrivers]:
        """Gets the drivers of this HosLogsSummaryResponse.


        :return: The drivers of this HosLogsSummaryResponse.
        :rtype: List[HosLogsSummaryResponseDrivers]
        """
        return self._drivers

    @drivers.setter
    def drivers(self, drivers: List[HosLogsSummaryResponseDrivers]):
        """Sets the drivers of this HosLogsSummaryResponse.


        :param drivers: The drivers of this HosLogsSummaryResponse.
        :type drivers: List[HosLogsSummaryResponseDrivers]
        """

        self._drivers = drivers
