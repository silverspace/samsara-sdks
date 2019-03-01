# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class TaggedSensorBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None):
        """TaggedSensorBase - a model defined in OpenAPI

        :param id: The id of this TaggedSensorBase.
        """
        self.openapi_types = {
            'id': int
        }

        self.attribute_map = {
            'id': 'id'
        }

        self._id = id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'TaggedSensorBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The TaggedSensorBase of this TaggedSensorBase.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this TaggedSensorBase.

        The ID of the Sensor being tagged.

        :return: The id of this TaggedSensorBase.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this TaggedSensorBase.

        The ID of the Sensor being tagged.

        :param id: The id of this TaggedSensorBase.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id
