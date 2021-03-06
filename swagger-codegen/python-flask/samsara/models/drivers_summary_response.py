# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.drivers_summary_response_summaries import DriversSummaryResponseSummaries  # noqa: F401,E501
from samsara import util


class DriversSummaryResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, summaries: List[DriversSummaryResponseSummaries]=None):  # noqa: E501
        """DriversSummaryResponse - a model defined in Swagger

        :param summaries: The summaries of this DriversSummaryResponse.  # noqa: E501
        :type summaries: List[DriversSummaryResponseSummaries]
        """
        self.swagger_types = {
            'summaries': List[DriversSummaryResponseSummaries]
        }

        self.attribute_map = {
            'summaries': 'Summaries'
        }

        self._summaries = summaries

    @classmethod
    def from_dict(cls, dikt) -> 'DriversSummaryResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DriversSummaryResponse of this DriversSummaryResponse.  # noqa: E501
        :rtype: DriversSummaryResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def summaries(self) -> List[DriversSummaryResponseSummaries]:
        """Gets the summaries of this DriversSummaryResponse.


        :return: The summaries of this DriversSummaryResponse.
        :rtype: List[DriversSummaryResponseSummaries]
        """
        return self._summaries

    @summaries.setter
    def summaries(self, summaries: List[DriversSummaryResponseSummaries]):
        """Sets the summaries of this DriversSummaryResponse.


        :param summaries: The summaries of this DriversSummaryResponse.
        :type summaries: List[DriversSummaryResponseSummaries]
        """

        self._summaries = summaries
