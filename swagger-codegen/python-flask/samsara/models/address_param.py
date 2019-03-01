# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class AddressParam(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, address: str=None, group_id: int=None, name: str=None, radius: int=None):  # noqa: E501
        """AddressParam - a model defined in Swagger

        :param address: The address of this AddressParam.  # noqa: E501
        :type address: str
        :param group_id: The group_id of this AddressParam.  # noqa: E501
        :type group_id: int
        :param name: The name of this AddressParam.  # noqa: E501
        :type name: str
        :param radius: The radius of this AddressParam.  # noqa: E501
        :type radius: int
        """
        self.swagger_types = {
            'address': str,
            'group_id': int,
            'name': str,
            'radius': int
        }

        self.attribute_map = {
            'address': 'address',
            'group_id': 'groupId',
            'name': 'name',
            'radius': 'radius'
        }

        self._address = address
        self._group_id = group_id
        self._name = name
        self._radius = radius

    @classmethod
    def from_dict(cls, dikt) -> 'AddressParam':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The addressParam of this AddressParam.  # noqa: E501
        :rtype: AddressParam
        """
        return util.deserialize_model(dikt, cls)

    @property
    def address(self) -> str:
        """Gets the address of this AddressParam.

        The address of the entry to add, as it would be recognized if provided to maps.google.com.  # noqa: E501

        :return: The address of this AddressParam.
        :rtype: str
        """
        return self._address

    @address.setter
    def address(self, address: str):
        """Sets the address of this AddressParam.

        The address of the entry to add, as it would be recognized if provided to maps.google.com.  # noqa: E501

        :param address: The address of this AddressParam.
        :type address: str
        """
        if address is None:
            raise ValueError("Invalid value for `address`, must not be `None`")  # noqa: E501

        self._address = address

    @property
    def group_id(self) -> int:
        """Gets the group_id of this AddressParam.

        Group ID to query.  # noqa: E501

        :return: The group_id of this AddressParam.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this AddressParam.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this AddressParam.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def name(self) -> str:
        """Gets the name of this AddressParam.

        Name of the location to add to the address book.  # noqa: E501

        :return: The name of this AddressParam.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AddressParam.

        Name of the location to add to the address book.  # noqa: E501

        :param name: The name of this AddressParam.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def radius(self) -> int:
        """Gets the radius of this AddressParam.

        Radius in meters of the address (used for matching vehicle trip stops to this location).  # noqa: E501

        :return: The radius of this AddressParam.
        :rtype: int
        """
        return self._radius

    @radius.setter
    def radius(self, radius: int):
        """Sets the radius of this AddressParam.

        Radius in meters of the address (used for matching vehicle trip stops to this location).  # noqa: E501

        :param radius: The radius of this AddressParam.
        :type radius: int
        """
        if radius is None:
            raise ValueError("Invalid value for `radius`, must not be `None`")  # noqa: E501

        self._radius = radius