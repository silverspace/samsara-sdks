# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.tagged_address import TaggedAddress  # noqa: F401,E501
from samsara.models.tagged_asset import TaggedAsset  # noqa: F401,E501
from samsara.models.tagged_driver import TaggedDriver  # noqa: F401,E501
from samsara.models.tagged_machine import TaggedMachine  # noqa: F401,E501
from samsara.models.tagged_sensor import TaggedSensor  # noqa: F401,E501
from samsara.models.tagged_vehicle import TaggedVehicle  # noqa: F401,E501
from samsara import util


class Tag(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, addresses: List[TaggedAddress]=None, assets: List[TaggedAsset]=None, drivers: List[TaggedDriver]=None, group_id: int=None, id: int=None, machines: List[TaggedMachine]=None, name: str=None, parent_tag_id: int=None, sensors: List[TaggedSensor]=None, vehicles: List[TaggedVehicle]=None):  # noqa: E501
        """Tag - a model defined in Swagger

        :param addresses: The addresses of this Tag.  # noqa: E501
        :type addresses: List[TaggedAddress]
        :param assets: The assets of this Tag.  # noqa: E501
        :type assets: List[TaggedAsset]
        :param drivers: The drivers of this Tag.  # noqa: E501
        :type drivers: List[TaggedDriver]
        :param group_id: The group_id of this Tag.  # noqa: E501
        :type group_id: int
        :param id: The id of this Tag.  # noqa: E501
        :type id: int
        :param machines: The machines of this Tag.  # noqa: E501
        :type machines: List[TaggedMachine]
        :param name: The name of this Tag.  # noqa: E501
        :type name: str
        :param parent_tag_id: The parent_tag_id of this Tag.  # noqa: E501
        :type parent_tag_id: int
        :param sensors: The sensors of this Tag.  # noqa: E501
        :type sensors: List[TaggedSensor]
        :param vehicles: The vehicles of this Tag.  # noqa: E501
        :type vehicles: List[TaggedVehicle]
        """
        self.swagger_types = {
            'addresses': List[TaggedAddress],
            'assets': List[TaggedAsset],
            'drivers': List[TaggedDriver],
            'group_id': int,
            'id': int,
            'machines': List[TaggedMachine],
            'name': str,
            'parent_tag_id': int,
            'sensors': List[TaggedSensor],
            'vehicles': List[TaggedVehicle]
        }

        self.attribute_map = {
            'addresses': 'addresses',
            'assets': 'assets',
            'drivers': 'drivers',
            'group_id': 'groupId',
            'id': 'id',
            'machines': 'machines',
            'name': 'name',
            'parent_tag_id': 'parentTagId',
            'sensors': 'sensors',
            'vehicles': 'vehicles'
        }

        self._addresses = addresses
        self._assets = assets
        self._drivers = drivers
        self._group_id = group_id
        self._id = id
        self._machines = machines
        self._name = name
        self._parent_tag_id = parent_tag_id
        self._sensors = sensors
        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt) -> 'Tag':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Tag of this Tag.  # noqa: E501
        :rtype: Tag
        """
        return util.deserialize_model(dikt, cls)

    @property
    def addresses(self) -> List[TaggedAddress]:
        """Gets the addresses of this Tag.

        The addresses that belong to this tag.  # noqa: E501

        :return: The addresses of this Tag.
        :rtype: List[TaggedAddress]
        """
        return self._addresses

    @addresses.setter
    def addresses(self, addresses: List[TaggedAddress]):
        """Sets the addresses of this Tag.

        The addresses that belong to this tag.  # noqa: E501

        :param addresses: The addresses of this Tag.
        :type addresses: List[TaggedAddress]
        """

        self._addresses = addresses

    @property
    def assets(self) -> List[TaggedAsset]:
        """Gets the assets of this Tag.

        The assets that belong to this tag.  # noqa: E501

        :return: The assets of this Tag.
        :rtype: List[TaggedAsset]
        """
        return self._assets

    @assets.setter
    def assets(self, assets: List[TaggedAsset]):
        """Sets the assets of this Tag.

        The assets that belong to this tag.  # noqa: E501

        :param assets: The assets of this Tag.
        :type assets: List[TaggedAsset]
        """

        self._assets = assets

    @property
    def drivers(self) -> List[TaggedDriver]:
        """Gets the drivers of this Tag.

        The drivers that belong to this tag.  # noqa: E501

        :return: The drivers of this Tag.
        :rtype: List[TaggedDriver]
        """
        return self._drivers

    @drivers.setter
    def drivers(self, drivers: List[TaggedDriver]):
        """Sets the drivers of this Tag.

        The drivers that belong to this tag.  # noqa: E501

        :param drivers: The drivers of this Tag.
        :type drivers: List[TaggedDriver]
        """

        self._drivers = drivers

    @property
    def group_id(self) -> int:
        """Gets the group_id of this Tag.

        The GroupID that this tag belongs to.  # noqa: E501

        :return: The group_id of this Tag.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this Tag.

        The GroupID that this tag belongs to.  # noqa: E501

        :param group_id: The group_id of this Tag.
        :type group_id: int
        """

        self._group_id = group_id

    @property
    def id(self) -> int:
        """Gets the id of this Tag.

        The ID of this tag.  # noqa: E501

        :return: The id of this Tag.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Tag.

        The ID of this tag.  # noqa: E501

        :param id: The id of this Tag.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def machines(self) -> List[TaggedMachine]:
        """Gets the machines of this Tag.

        The machines that belong to this tag.  # noqa: E501

        :return: The machines of this Tag.
        :rtype: List[TaggedMachine]
        """
        return self._machines

    @machines.setter
    def machines(self, machines: List[TaggedMachine]):
        """Sets the machines of this Tag.

        The machines that belong to this tag.  # noqa: E501

        :param machines: The machines of this Tag.
        :type machines: List[TaggedMachine]
        """

        self._machines = machines

    @property
    def name(self) -> str:
        """Gets the name of this Tag.

        Name of this tag.  # noqa: E501

        :return: The name of this Tag.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Tag.

        Name of this tag.  # noqa: E501

        :param name: The name of this Tag.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def parent_tag_id(self) -> int:
        """Gets the parent_tag_id of this Tag.

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :return: The parent_tag_id of this Tag.
        :rtype: int
        """
        return self._parent_tag_id

    @parent_tag_id.setter
    def parent_tag_id(self, parent_tag_id: int):
        """Sets the parent_tag_id of this Tag.

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :param parent_tag_id: The parent_tag_id of this Tag.
        :type parent_tag_id: int
        """

        self._parent_tag_id = parent_tag_id

    @property
    def sensors(self) -> List[TaggedSensor]:
        """Gets the sensors of this Tag.

        The sensors that belong to this tag.  # noqa: E501

        :return: The sensors of this Tag.
        :rtype: List[TaggedSensor]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors: List[TaggedSensor]):
        """Sets the sensors of this Tag.

        The sensors that belong to this tag.  # noqa: E501

        :param sensors: The sensors of this Tag.
        :type sensors: List[TaggedSensor]
        """

        self._sensors = sensors

    @property
    def vehicles(self) -> List[TaggedVehicle]:
        """Gets the vehicles of this Tag.

        The vehicles that belong to this tag.  # noqa: E501

        :return: The vehicles of this Tag.
        :rtype: List[TaggedVehicle]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles: List[TaggedVehicle]):
        """Sets the vehicles of this Tag.

        The vehicles that belong to this tag.  # noqa: E501

        :param vehicles: The vehicles of this Tag.
        :type vehicles: List[TaggedVehicle]
        """

        self._vehicles = vehicles