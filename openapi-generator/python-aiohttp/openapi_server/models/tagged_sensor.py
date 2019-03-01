# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.tagged_sensor_base import TaggedSensorBase
from openapi_server import util


class TaggedSensor(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None):
        """TaggedSensor - a model defined in OpenAPI

        :param id: The id of this TaggedSensor.
        :param name: The name of this TaggedSensor.
        """
        self.openapi_types = {
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name'
        }

        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'TaggedSensor':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The TaggedSensor of this TaggedSensor.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this TaggedSensor.

        The ID of the Sensor being tagged.

        :return: The id of this TaggedSensor.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this TaggedSensor.

        The ID of the Sensor being tagged.

        :param id: The id of this TaggedSensor.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def name(self):
        """Gets the name of this TaggedSensor.

        Name of the Sensor being tagged.

        :return: The name of this TaggedSensor.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TaggedSensor.

        Name of the Sensor being tagged.

        :param name: The name of this TaggedSensor.
        :type name: str
        """

        self._name = name
