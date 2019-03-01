# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.tagged_asset_base import TaggedAssetBase  # noqa: F401,E501
from samsara.models.tagged_driver_base import TaggedDriverBase  # noqa: F401,E501
from samsara.models.tagged_machine_base import TaggedMachineBase  # noqa: F401,E501
from samsara.models.tagged_sensor_base import TaggedSensorBase  # noqa: F401,E501
from samsara.models.tagged_vehicle_base import TaggedVehicleBase  # noqa: F401,E501
from samsara import util


class TagModifyDelete(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, assets: List[TaggedAssetBase]=None, drivers: List[TaggedDriverBase]=None, machines: List[TaggedMachineBase]=None, sensors: List[TaggedSensorBase]=None, vehicles: List[TaggedVehicleBase]=None):  # noqa: E501
        """TagModifyDelete - a model defined in Swagger

        :param assets: The assets of this TagModifyDelete.  # noqa: E501
        :type assets: List[TaggedAssetBase]
        :param drivers: The drivers of this TagModifyDelete.  # noqa: E501
        :type drivers: List[TaggedDriverBase]
        :param machines: The machines of this TagModifyDelete.  # noqa: E501
        :type machines: List[TaggedMachineBase]
        :param sensors: The sensors of this TagModifyDelete.  # noqa: E501
        :type sensors: List[TaggedSensorBase]
        :param vehicles: The vehicles of this TagModifyDelete.  # noqa: E501
        :type vehicles: List[TaggedVehicleBase]
        """
        self.swagger_types = {
            'assets': List[TaggedAssetBase],
            'drivers': List[TaggedDriverBase],
            'machines': List[TaggedMachineBase],
            'sensors': List[TaggedSensorBase],
            'vehicles': List[TaggedVehicleBase]
        }

        self.attribute_map = {
            'assets': 'assets',
            'drivers': 'drivers',
            'machines': 'machines',
            'sensors': 'sensors',
            'vehicles': 'vehicles'
        }

        self._assets = assets
        self._drivers = drivers
        self._machines = machines
        self._sensors = sensors
        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt) -> 'TagModifyDelete':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TagModify_delete of this TagModifyDelete.  # noqa: E501
        :rtype: TagModifyDelete
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assets(self) -> List[TaggedAssetBase]:
        """Gets the assets of this TagModifyDelete.

        The assets to be removed from this tag.  # noqa: E501

        :return: The assets of this TagModifyDelete.
        :rtype: List[TaggedAssetBase]
        """
        return self._assets

    @assets.setter
    def assets(self, assets: List[TaggedAssetBase]):
        """Sets the assets of this TagModifyDelete.

        The assets to be removed from this tag.  # noqa: E501

        :param assets: The assets of this TagModifyDelete.
        :type assets: List[TaggedAssetBase]
        """

        self._assets = assets

    @property
    def drivers(self) -> List[TaggedDriverBase]:
        """Gets the drivers of this TagModifyDelete.

        The drivers to be removed from this tag.  # noqa: E501

        :return: The drivers of this TagModifyDelete.
        :rtype: List[TaggedDriverBase]
        """
        return self._drivers

    @drivers.setter
    def drivers(self, drivers: List[TaggedDriverBase]):
        """Sets the drivers of this TagModifyDelete.

        The drivers to be removed from this tag.  # noqa: E501

        :param drivers: The drivers of this TagModifyDelete.
        :type drivers: List[TaggedDriverBase]
        """

        self._drivers = drivers

    @property
    def machines(self) -> List[TaggedMachineBase]:
        """Gets the machines of this TagModifyDelete.

        The machines to be removed from this tag.  # noqa: E501

        :return: The machines of this TagModifyDelete.
        :rtype: List[TaggedMachineBase]
        """
        return self._machines

    @machines.setter
    def machines(self, machines: List[TaggedMachineBase]):
        """Sets the machines of this TagModifyDelete.

        The machines to be removed from this tag.  # noqa: E501

        :param machines: The machines of this TagModifyDelete.
        :type machines: List[TaggedMachineBase]
        """

        self._machines = machines

    @property
    def sensors(self) -> List[TaggedSensorBase]:
        """Gets the sensors of this TagModifyDelete.

        The sensors to be removed from this tag.  # noqa: E501

        :return: The sensors of this TagModifyDelete.
        :rtype: List[TaggedSensorBase]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors: List[TaggedSensorBase]):
        """Sets the sensors of this TagModifyDelete.

        The sensors to be removed from this tag.  # noqa: E501

        :param sensors: The sensors of this TagModifyDelete.
        :type sensors: List[TaggedSensorBase]
        """

        self._sensors = sensors

    @property
    def vehicles(self) -> List[TaggedVehicleBase]:
        """Gets the vehicles of this TagModifyDelete.

        The vehicles to be removed from this tag.  # noqa: E501

        :return: The vehicles of this TagModifyDelete.
        :rtype: List[TaggedVehicleBase]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles: List[TaggedVehicleBase]):
        """Sets the vehicles of this TagModifyDelete.

        The vehicles to be removed from this tag.  # noqa: E501

        :param vehicles: The vehicles of this TagModifyDelete.
        :type vehicles: List[TaggedVehicleBase]
        """

        self._vehicles = vehicles
