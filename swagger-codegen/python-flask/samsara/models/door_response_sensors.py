# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class DoorResponseSensors(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, door_closed: bool=None, id: int=None, name: str=None):  # noqa: E501
        """DoorResponseSensors - a model defined in Swagger

        :param door_closed: The door_closed of this DoorResponseSensors.  # noqa: E501
        :type door_closed: bool
        :param id: The id of this DoorResponseSensors.  # noqa: E501
        :type id: int
        :param name: The name of this DoorResponseSensors.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'door_closed': bool,
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'door_closed': 'doorClosed',
            'id': 'id',
            'name': 'name'
        }

        self._door_closed = door_closed
        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'DoorResponseSensors':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DoorResponse_sensors of this DoorResponseSensors.  # noqa: E501
        :rtype: DoorResponseSensors
        """
        return util.deserialize_model(dikt, cls)

    @property
    def door_closed(self) -> bool:
        """Gets the door_closed of this DoorResponseSensors.

        Flag indicating whether the current door is closed or open.  # noqa: E501

        :return: The door_closed of this DoorResponseSensors.
        :rtype: bool
        """
        return self._door_closed

    @door_closed.setter
    def door_closed(self, door_closed: bool):
        """Sets the door_closed of this DoorResponseSensors.

        Flag indicating whether the current door is closed or open.  # noqa: E501

        :param door_closed: The door_closed of this DoorResponseSensors.
        :type door_closed: bool
        """

        self._door_closed = door_closed

    @property
    def id(self) -> int:
        """Gets the id of this DoorResponseSensors.

        ID of the sensor.  # noqa: E501

        :return: The id of this DoorResponseSensors.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this DoorResponseSensors.

        ID of the sensor.  # noqa: E501

        :param id: The id of this DoorResponseSensors.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this DoorResponseSensors.

        Name of the sensor.  # noqa: E501

        :return: The name of this DoorResponseSensors.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this DoorResponseSensors.

        Name of the sensor.  # noqa: E501

        :param name: The name of this DoorResponseSensors.
        :type name: str
        """

        self._name = name
