# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.data_input_history_response_points import DataInputHistoryResponsePoints
from openapi_server import util

from openapi_server.models.data_input_history_response_points import DataInputHistoryResponsePoints  # noqa: E501

class DataInputHistoryResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, name=None, points=None):  # noqa: E501
        """DataInputHistoryResponse - a model defined in OpenAPI

        :param id: The id of this DataInputHistoryResponse.  # noqa: E501
        :type id: int
        :param name: The name of this DataInputHistoryResponse.  # noqa: E501
        :type name: str
        :param points: The points of this DataInputHistoryResponse.  # noqa: E501
        :type points: List[DataInputHistoryResponsePoints]
        """
        self.openapi_types = {
            'id': int,
            'name': str,
            'points': List[DataInputHistoryResponsePoints]
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'points': 'points'
        }

        self._id = id
        self._name = name
        self._points = points

    @classmethod
    def from_dict(cls, dikt) -> 'DataInputHistoryResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DataInputHistoryResponse of this DataInputHistoryResponse.  # noqa: E501
        :rtype: DataInputHistoryResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this DataInputHistoryResponse.

        The ID of this data input  # noqa: E501

        :return: The id of this DataInputHistoryResponse.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DataInputHistoryResponse.

        The ID of this data input  # noqa: E501

        :param id: The id of this DataInputHistoryResponse.
        :type id: int
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this DataInputHistoryResponse.

        Name of this data input  # noqa: E501

        :return: The name of this DataInputHistoryResponse.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DataInputHistoryResponse.

        Name of this data input  # noqa: E501

        :param name: The name of this DataInputHistoryResponse.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def points(self):
        """Gets the points of this DataInputHistoryResponse.

        Data points from this data input  # noqa: E501

        :return: The points of this DataInputHistoryResponse.
        :rtype: List[DataInputHistoryResponsePoints]
        """
        return self._points

    @points.setter
    def points(self, points):
        """Sets the points of this DataInputHistoryResponse.

        Data points from this data input  # noqa: E501

        :param points: The points of this DataInputHistoryResponse.
        :type points: List[DataInputHistoryResponsePoints]
        """

        self._points = points
