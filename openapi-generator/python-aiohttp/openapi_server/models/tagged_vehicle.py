# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.tagged_vehicle_base import TaggedVehicleBase
from openapi_server import util


class TaggedVehicle(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None):
        """TaggedVehicle - a model defined in OpenAPI

        :param id: The id of this TaggedVehicle.
        :param name: The name of this TaggedVehicle.
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
    def from_dict(cls, dikt: dict) -> 'TaggedVehicle':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The TaggedVehicle of this TaggedVehicle.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this TaggedVehicle.

        The ID of the Vehicle being tagged.

        :return: The id of this TaggedVehicle.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this TaggedVehicle.

        The ID of the Vehicle being tagged.

        :param id: The id of this TaggedVehicle.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def name(self):
        """Gets the name of this TaggedVehicle.

        Name of the Vehicle being tagged.

        :return: The name of this TaggedVehicle.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TaggedVehicle.

        Name of the Vehicle being tagged.

        :param name: The name of this TaggedVehicle.
        :type name: str
        """

        self._name = name
