# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.tagged_driver_base import TaggedDriverBase  # noqa: F401,E501
from samsara import util


class TaggedDriver(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None):  # noqa: E501
        """TaggedDriver - a model defined in Swagger

        :param id: The id of this TaggedDriver.  # noqa: E501
        :type id: int
        :param name: The name of this TaggedDriver.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'TaggedDriver':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaggedDriver of this TaggedDriver.  # noqa: E501
        :rtype: TaggedDriver
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this TaggedDriver.

        The ID of the Driver being tagged.  # noqa: E501

        :return: The id of this TaggedDriver.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this TaggedDriver.

        The ID of the Driver being tagged.  # noqa: E501

        :param id: The id of this TaggedDriver.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this TaggedDriver.

        Name of the Driver being tagged.  # noqa: E501

        :return: The name of this TaggedDriver.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TaggedDriver.

        Name of the Driver being tagged.  # noqa: E501

        :param name: The name of this TaggedDriver.
        :type name: str
        """

        self._name = name
