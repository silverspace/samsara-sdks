# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class InlineObject4(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, reactivate: bool=None):
        """InlineObject4 - a model defined in OpenAPI

        :param reactivate: The reactivate of this InlineObject4.
        """
        self.openapi_types = {
            'reactivate': bool
        }

        self.attribute_map = {
            'reactivate': 'reactivate'
        }

        self._reactivate = reactivate

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineObject4':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_object_4 of this InlineObject4.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def reactivate(self):
        """Gets the reactivate of this InlineObject4.

        True indicates that this driver should be reactivated.

        :return: The reactivate of this InlineObject4.
        :rtype: bool
        """
        return self._reactivate

    @reactivate.setter
    def reactivate(self, reactivate):
        """Sets the reactivate of this InlineObject4.

        True indicates that this driver should be reactivated.

        :param reactivate: The reactivate of this InlineObject4.
        :type reactivate: bool
        """
        if reactivate is None:
            raise ValueError("Invalid value for `reactivate`, must not be `None`")

        self._reactivate = reactivate
