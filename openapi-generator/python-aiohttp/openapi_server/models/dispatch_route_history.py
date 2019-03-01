# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.dispatch_route_historical_entry import DispatchRouteHistoricalEntry
from openapi_server import util


class DispatchRouteHistory(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, history: List[DispatchRouteHistoricalEntry]=None):
        """DispatchRouteHistory - a model defined in OpenAPI

        :param history: The history of this DispatchRouteHistory.
        """
        self.openapi_types = {
            'history': List[DispatchRouteHistoricalEntry]
        }

        self.attribute_map = {
            'history': 'history'
        }

        self._history = history

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DispatchRouteHistory':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DispatchRouteHistory of this DispatchRouteHistory.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def history(self):
        """Gets the history of this DispatchRouteHistory.

        History of the route's state changes.

        :return: The history of this DispatchRouteHistory.
        :rtype: List[DispatchRouteHistoricalEntry]
        """
        return self._history

    @history.setter
    def history(self, history):
        """Sets the history of this DispatchRouteHistory.

        History of the route's state changes.

        :param history: The history of this DispatchRouteHistory.
        :type history: List[DispatchRouteHistoricalEntry]
        """

        self._history = history