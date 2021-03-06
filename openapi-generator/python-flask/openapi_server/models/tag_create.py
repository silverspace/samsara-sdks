# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.tagged_asset_base import TaggedAssetBase
from openapi_server.models.tagged_driver_base import TaggedDriverBase
from openapi_server.models.tagged_machine_base import TaggedMachineBase
from openapi_server.models.tagged_sensor_base import TaggedSensorBase
from openapi_server.models.tagged_vehicle_base import TaggedVehicleBase
from openapi_server import util

from openapi_server.models.tagged_asset_base import TaggedAssetBase  # noqa: E501
from openapi_server.models.tagged_driver_base import TaggedDriverBase  # noqa: E501
from openapi_server.models.tagged_machine_base import TaggedMachineBase  # noqa: E501
from openapi_server.models.tagged_sensor_base import TaggedSensorBase  # noqa: E501
from openapi_server.models.tagged_vehicle_base import TaggedVehicleBase  # noqa: E501

class TagCreate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assets=None, drivers=None, machines=None, name=None, parent_tag_id=None, sensors=None, vehicles=None):  # noqa: E501
        """TagCreate - a model defined in OpenAPI

        :param assets: The assets of this TagCreate.  # noqa: E501
        :type assets: List[TaggedAssetBase]
        :param drivers: The drivers of this TagCreate.  # noqa: E501
        :type drivers: List[TaggedDriverBase]
        :param machines: The machines of this TagCreate.  # noqa: E501
        :type machines: List[TaggedMachineBase]
        :param name: The name of this TagCreate.  # noqa: E501
        :type name: str
        :param parent_tag_id: The parent_tag_id of this TagCreate.  # noqa: E501
        :type parent_tag_id: int
        :param sensors: The sensors of this TagCreate.  # noqa: E501
        :type sensors: List[TaggedSensorBase]
        :param vehicles: The vehicles of this TagCreate.  # noqa: E501
        :type vehicles: List[TaggedVehicleBase]
        """
        self.openapi_types = {
            'assets': List[TaggedAssetBase],
            'drivers': List[TaggedDriverBase],
            'machines': List[TaggedMachineBase],
            'name': str,
            'parent_tag_id': int,
            'sensors': List[TaggedSensorBase],
            'vehicles': List[TaggedVehicleBase]
        }

        self.attribute_map = {
            'assets': 'assets',
            'drivers': 'drivers',
            'machines': 'machines',
            'name': 'name',
            'parent_tag_id': 'parentTagId',
            'sensors': 'sensors',
            'vehicles': 'vehicles'
        }

        self._assets = assets
        self._drivers = drivers
        self._machines = machines
        self._name = name
        self._parent_tag_id = parent_tag_id
        self._sensors = sensors
        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt) -> 'TagCreate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TagCreate of this TagCreate.  # noqa: E501
        :rtype: TagCreate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assets(self):
        """Gets the assets of this TagCreate.

        The assets that belong to this tag.  # noqa: E501

        :return: The assets of this TagCreate.
        :rtype: List[TaggedAssetBase]
        """
        return self._assets

    @assets.setter
    def assets(self, assets):
        """Sets the assets of this TagCreate.

        The assets that belong to this tag.  # noqa: E501

        :param assets: The assets of this TagCreate.
        :type assets: List[TaggedAssetBase]
        """

        self._assets = assets

    @property
    def drivers(self):
        """Gets the drivers of this TagCreate.

        The drivers that belong to this tag.  # noqa: E501

        :return: The drivers of this TagCreate.
        :rtype: List[TaggedDriverBase]
        """
        return self._drivers

    @drivers.setter
    def drivers(self, drivers):
        """Sets the drivers of this TagCreate.

        The drivers that belong to this tag.  # noqa: E501

        :param drivers: The drivers of this TagCreate.
        :type drivers: List[TaggedDriverBase]
        """

        self._drivers = drivers

    @property
    def machines(self):
        """Gets the machines of this TagCreate.

        The machines that belong to this tag.  # noqa: E501

        :return: The machines of this TagCreate.
        :rtype: List[TaggedMachineBase]
        """
        return self._machines

    @machines.setter
    def machines(self, machines):
        """Sets the machines of this TagCreate.

        The machines that belong to this tag.  # noqa: E501

        :param machines: The machines of this TagCreate.
        :type machines: List[TaggedMachineBase]
        """

        self._machines = machines

    @property
    def name(self):
        """Gets the name of this TagCreate.

        Name of this tag.  # noqa: E501

        :return: The name of this TagCreate.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TagCreate.

        Name of this tag.  # noqa: E501

        :param name: The name of this TagCreate.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def parent_tag_id(self):
        """Gets the parent_tag_id of this TagCreate.

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :return: The parent_tag_id of this TagCreate.
        :rtype: int
        """
        return self._parent_tag_id

    @parent_tag_id.setter
    def parent_tag_id(self, parent_tag_id):
        """Sets the parent_tag_id of this TagCreate.

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :param parent_tag_id: The parent_tag_id of this TagCreate.
        :type parent_tag_id: int
        """

        self._parent_tag_id = parent_tag_id

    @property
    def sensors(self):
        """Gets the sensors of this TagCreate.

        The sensors that belong to this tag.  # noqa: E501

        :return: The sensors of this TagCreate.
        :rtype: List[TaggedSensorBase]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors):
        """Sets the sensors of this TagCreate.

        The sensors that belong to this tag.  # noqa: E501

        :param sensors: The sensors of this TagCreate.
        :type sensors: List[TaggedSensorBase]
        """

        self._sensors = sensors

    @property
    def vehicles(self):
        """Gets the vehicles of this TagCreate.

        The vehicles that belong to this tag.  # noqa: E501

        :return: The vehicles of this TagCreate.
        :rtype: List[TaggedVehicleBase]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles):
        """Sets the vehicles of this TagCreate.

        The vehicles that belong to this tag.  # noqa: E501

        :param vehicles: The vehicles of this TagCreate.
        :type vehicles: List[TaggedVehicleBase]
        """

        self._vehicles = vehicles
