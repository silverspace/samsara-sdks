# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.sensor_history_response_results import SensorHistoryResponseResults
from openapi_server import util

from openapi_server.models.sensor_history_response_results import SensorHistoryResponseResults  # noqa: E501

class SensorHistoryResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, results=None):  # noqa: E501
        """SensorHistoryResponse - a model defined in OpenAPI

        :param results: The results of this SensorHistoryResponse.  # noqa: E501
        :type results: List[SensorHistoryResponseResults]
        """
        self.openapi_types = {
            'results': List[SensorHistoryResponseResults]
        }

        self.attribute_map = {
            'results': 'results'
        }

        self._results = results

    @classmethod
    def from_dict(cls, dikt) -> 'SensorHistoryResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SensorHistoryResponse of this SensorHistoryResponse.  # noqa: E501
        :rtype: SensorHistoryResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def results(self):
        """Gets the results of this SensorHistoryResponse.


        :return: The results of this SensorHistoryResponse.
        :rtype: List[SensorHistoryResponseResults]
        """
        return self._results

    @results.setter
    def results(self, results):
        """Sets the results of this SensorHistoryResponse.


        :param results: The results of this SensorHistoryResponse.
        :type results: List[SensorHistoryResponseResults]
        """

        self._results = results
