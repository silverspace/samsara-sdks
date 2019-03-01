# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class CargoResponseSensors(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, cargo_empty: bool=None, id: int=None, name: str=None):  # noqa: E501
        """CargoResponseSensors - a model defined in Swagger

        :param cargo_empty: The cargo_empty of this CargoResponseSensors.  # noqa: E501
        :type cargo_empty: bool
        :param id: The id of this CargoResponseSensors.  # noqa: E501
        :type id: int
        :param name: The name of this CargoResponseSensors.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'cargo_empty': bool,
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'cargo_empty': 'cargoEmpty',
            'id': 'id',
            'name': 'name'
        }

        self._cargo_empty = cargo_empty
        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'CargoResponseSensors':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CargoResponse_sensors of this CargoResponseSensors.  # noqa: E501
        :rtype: CargoResponseSensors
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cargo_empty(self) -> bool:
        """Gets the cargo_empty of this CargoResponseSensors.

        Flag indicating whether the current cargo is empty or loaded.  # noqa: E501

        :return: The cargo_empty of this CargoResponseSensors.
        :rtype: bool
        """
        return self._cargo_empty

    @cargo_empty.setter
    def cargo_empty(self, cargo_empty: bool):
        """Sets the cargo_empty of this CargoResponseSensors.

        Flag indicating whether the current cargo is empty or loaded.  # noqa: E501

        :param cargo_empty: The cargo_empty of this CargoResponseSensors.
        :type cargo_empty: bool
        """

        self._cargo_empty = cargo_empty

    @property
    def id(self) -> int:
        """Gets the id of this CargoResponseSensors.

        ID of the sensor.  # noqa: E501

        :return: The id of this CargoResponseSensors.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this CargoResponseSensors.

        ID of the sensor.  # noqa: E501

        :param id: The id of this CargoResponseSensors.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this CargoResponseSensors.

        Name of the sensor.  # noqa: E501

        :return: The name of this CargoResponseSensors.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CargoResponseSensors.

        Name of the sensor.  # noqa: E501

        :param name: The name of this CargoResponseSensors.
        :type name: str
        """

        self._name = name
