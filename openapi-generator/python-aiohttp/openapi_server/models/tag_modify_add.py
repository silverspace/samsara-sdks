# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.tagged_asset_base import TaggedAssetBase
from openapi_server.models.tagged_driver_base import TaggedDriverBase
from openapi_server.models.tagged_machine_base import TaggedMachineBase
from openapi_server.models.tagged_sensor_base import TaggedSensorBase
from openapi_server.models.tagged_vehicle_base import TaggedVehicleBase
from openapi_server import util


class TagModifyAdd(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assets: List[TaggedAssetBase]=None, sensors: List[TaggedSensorBase]=None, vehicles: List[TaggedVehicleBase]=None, machines: List[TaggedMachineBase]=None, drivers: List[TaggedDriverBase]=None):
        """TagModifyAdd - a model defined in OpenAPI

        :param assets: The assets of this TagModifyAdd.
        :param sensors: The sensors of this TagModifyAdd.
        :param vehicles: The vehicles of this TagModifyAdd.
        :param machines: The machines of this TagModifyAdd.
        :param drivers: The drivers of this TagModifyAdd.
        """
        self.openapi_types = {
            'assets': List[TaggedAssetBase],
            'sensors': List[TaggedSensorBase],
            'vehicles': List[TaggedVehicleBase],
            'machines': List[TaggedMachineBase],
            'drivers': List[TaggedDriverBase]
        }

        self.attribute_map = {
            'assets': 'assets',
            'sensors': 'sensors',
            'vehicles': 'vehicles',
            'machines': 'machines',
            'drivers': 'drivers'
        }

        self._assets = assets
        self._sensors = sensors
        self._vehicles = vehicles
        self._machines = machines
        self._drivers = drivers

    @classmethod
    def from_dict(cls, dikt: dict) -> 'TagModifyAdd':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The TagModify_add of this TagModifyAdd.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assets(self):
        """Gets the assets of this TagModifyAdd.

        The assets to be added to this tag.

        :return: The assets of this TagModifyAdd.
        :rtype: List[TaggedAssetBase]
        """
        return self._assets

    @assets.setter
    def assets(self, assets):
        """Sets the assets of this TagModifyAdd.

        The assets to be added to this tag.

        :param assets: The assets of this TagModifyAdd.
        :type assets: List[TaggedAssetBase]
        """

        self._assets = assets

    @property
    def sensors(self):
        """Gets the sensors of this TagModifyAdd.

        The sensors to be added to this tag.

        :return: The sensors of this TagModifyAdd.
        :rtype: List[TaggedSensorBase]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors):
        """Sets the sensors of this TagModifyAdd.

        The sensors to be added to this tag.

        :param sensors: The sensors of this TagModifyAdd.
        :type sensors: List[TaggedSensorBase]
        """

        self._sensors = sensors

    @property
    def vehicles(self):
        """Gets the vehicles of this TagModifyAdd.

        The vehicles to be added to this tag.

        :return: The vehicles of this TagModifyAdd.
        :rtype: List[TaggedVehicleBase]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles):
        """Sets the vehicles of this TagModifyAdd.

        The vehicles to be added to this tag.

        :param vehicles: The vehicles of this TagModifyAdd.
        :type vehicles: List[TaggedVehicleBase]
        """

        self._vehicles = vehicles

    @property
    def machines(self):
        """Gets the machines of this TagModifyAdd.

        The machines to be added to this tag.

        :return: The machines of this TagModifyAdd.
        :rtype: List[TaggedMachineBase]
        """
        return self._machines

    @machines.setter
    def machines(self, machines):
        """Sets the machines of this TagModifyAdd.

        The machines to be added to this tag.

        :param machines: The machines of this TagModifyAdd.
        :type machines: List[TaggedMachineBase]
        """

        self._machines = machines

    @property
    def drivers(self):
        """Gets the drivers of this TagModifyAdd.

        The drivers to be added to this tag.

        :return: The drivers of this TagModifyAdd.
        :rtype: List[TaggedDriverBase]
        """
        return self._drivers

    @drivers.setter
    def drivers(self, drivers):
        """Sets the drivers of this TagModifyAdd.

        The drivers to be added to this tag.

        :param drivers: The drivers of this TagModifyAdd.
        :type drivers: List[TaggedDriverBase]
        """

        self._drivers = drivers