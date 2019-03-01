# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class Machine(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None, notes: str=None):
        """Machine - a model defined in OpenAPI

        :param id: The id of this Machine.
        :param name: The name of this Machine.
        :param notes: The notes of this Machine.
        """
        self.openapi_types = {
            'id': int,
            'name': str,
            'notes': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'notes': 'notes'
        }

        self._id = id
        self._name = name
        self._notes = notes

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Machine':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Machine of this Machine.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Machine.

        ID of the machine.

        :return: The id of this Machine.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Machine.

        ID of the machine.

        :param id: The id of this Machine.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def name(self):
        """Gets the name of this Machine.

        Name of the machine.

        :return: The name of this Machine.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Machine.

        Name of the machine.

        :param name: The name of this Machine.
        :type name: str
        """

        self._name = name

    @property
    def notes(self):
        """Gets the notes of this Machine.

        Notes about the machine

        :return: The notes of this Machine.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this Machine.

        Notes about the machine

        :param notes: The notes of this Machine.
        :type notes: str
        """

        self._notes = notes