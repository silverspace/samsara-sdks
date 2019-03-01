# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class TaggedVehicleBase(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None):  # noqa: E501
        """TaggedVehicleBase - a model defined in Swagger

        :param id: The id of this TaggedVehicleBase.  # noqa: E501
        :type id: int
        """
        self.swagger_types = {
            'id': int
        }

        self.attribute_map = {
            'id': 'id'
        }

        self._id = id

    @classmethod
    def from_dict(cls, dikt) -> 'TaggedVehicleBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaggedVehicleBase of this TaggedVehicleBase.  # noqa: E501
        :rtype: TaggedVehicleBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this TaggedVehicleBase.

        The ID of the Vehicle being tagged.  # noqa: E501

        :return: The id of this TaggedVehicleBase.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this TaggedVehicleBase.

        The ID of the Vehicle being tagged.  # noqa: E501

        :param id: The id of this TaggedVehicleBase.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id
