# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.drivers_summary_response_summaries import DriversSummaryResponseSummaries
from openapi_server import util


class DriversSummaryResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, summaries: List[DriversSummaryResponseSummaries]=None):
        """DriversSummaryResponse - a model defined in OpenAPI

        :param summaries: The summaries of this DriversSummaryResponse.
        """
        self.openapi_types = {
            'summaries': List[DriversSummaryResponseSummaries]
        }

        self.attribute_map = {
            'summaries': 'Summaries'
        }

        self._summaries = summaries

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DriversSummaryResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DriversSummaryResponse of this DriversSummaryResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def summaries(self):
        """Gets the summaries of this DriversSummaryResponse.


        :return: The summaries of this DriversSummaryResponse.
        :rtype: List[DriversSummaryResponseSummaries]
        """
        return self._summaries

    @summaries.setter
    def summaries(self, summaries):
        """Sets the summaries of this DriversSummaryResponse.


        :param summaries: The summaries of this DriversSummaryResponse.
        :type summaries: List[DriversSummaryResponseSummaries]
        """

        self._summaries = summaries
