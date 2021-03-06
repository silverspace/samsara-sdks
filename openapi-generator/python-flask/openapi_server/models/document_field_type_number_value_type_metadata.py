# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DocumentFieldTypeNumberValueTypeMetadata(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, num_decimal_places=None):  # noqa: E501
        """DocumentFieldTypeNumberValueTypeMetadata - a model defined in OpenAPI

        :param num_decimal_places: The num_decimal_places of this DocumentFieldTypeNumberValueTypeMetadata.  # noqa: E501
        :type num_decimal_places: int
        """
        self.openapi_types = {
            'num_decimal_places': int
        }

        self.attribute_map = {
            'num_decimal_places': 'numDecimalPlaces'
        }

        self._num_decimal_places = num_decimal_places

    @classmethod
    def from_dict(cls, dikt) -> 'DocumentFieldTypeNumberValueTypeMetadata':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DocumentFieldType_numberValueTypeMetadata of this DocumentFieldTypeNumberValueTypeMetadata.  # noqa: E501
        :rtype: DocumentFieldTypeNumberValueTypeMetadata
        """
        return util.deserialize_model(dikt, cls)

    @property
    def num_decimal_places(self):
        """Gets the num_decimal_places of this DocumentFieldTypeNumberValueTypeMetadata.

        Number of decimal places that values for this field type can have.  # noqa: E501

        :return: The num_decimal_places of this DocumentFieldTypeNumberValueTypeMetadata.
        :rtype: int
        """
        return self._num_decimal_places

    @num_decimal_places.setter
    def num_decimal_places(self, num_decimal_places):
        """Sets the num_decimal_places of this DocumentFieldTypeNumberValueTypeMetadata.

        Number of decimal places that values for this field type can have.  # noqa: E501

        :param num_decimal_places: The num_decimal_places of this DocumentFieldTypeNumberValueTypeMetadata.
        :type num_decimal_places: int
        """

        self._num_decimal_places = num_decimal_places
