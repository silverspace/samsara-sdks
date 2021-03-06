# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.vehicle import Vehicle  # noqa: F401,E501
from samsara import util


class VehicleUpdateParam(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, group_id: int=None, vehicles: List[Vehicle]=None):  # noqa: E501
        """VehicleUpdateParam - a model defined in Swagger

        :param group_id: The group_id of this VehicleUpdateParam.  # noqa: E501
        :type group_id: int
        :param vehicles: The vehicles of this VehicleUpdateParam.  # noqa: E501
        :type vehicles: List[Vehicle]
        """
        self.swagger_types = {
            'group_id': int,
            'vehicles': List[Vehicle]
        }

        self.attribute_map = {
            'group_id': 'groupId',
            'vehicles': 'vehicles'
        }

        self._group_id = group_id
        self._vehicles = vehicles

    @classmethod
    def from_dict(cls, dikt) -> 'VehicleUpdateParam':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The vehicleUpdateParam of this VehicleUpdateParam.  # noqa: E501
        :rtype: VehicleUpdateParam
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self) -> int:
        """Gets the group_id of this VehicleUpdateParam.

        Group ID to query.  # noqa: E501

        :return: The group_id of this VehicleUpdateParam.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this VehicleUpdateParam.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this VehicleUpdateParam.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def vehicles(self) -> List[Vehicle]:
        """Gets the vehicles of this VehicleUpdateParam.


        :return: The vehicles of this VehicleUpdateParam.
        :rtype: List[Vehicle]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles: List[Vehicle]):
        """Sets the vehicles of this VehicleUpdateParam.


        :param vehicles: The vehicles of this VehicleUpdateParam.
        :type vehicles: List[Vehicle]
        """
        if vehicles is None:
            raise ValueError("Invalid value for `vehicles`, must not be `None`")  # noqa: E501

        self._vehicles = vehicles
