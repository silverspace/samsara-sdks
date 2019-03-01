# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class MachineHistoryResponseVibrations(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, x=None, y=None, z=None, time=None):  # noqa: E501
        """MachineHistoryResponseVibrations - a model defined in OpenAPI

        :param x: The x of this MachineHistoryResponseVibrations.  # noqa: E501
        :type x: float
        :param y: The y of this MachineHistoryResponseVibrations.  # noqa: E501
        :type y: float
        :param z: The z of this MachineHistoryResponseVibrations.  # noqa: E501
        :type z: float
        :param time: The time of this MachineHistoryResponseVibrations.  # noqa: E501
        :type time: int
        """
        self.openapi_types = {
            'x': float,
            'y': float,
            'z': float,
            'time': int
        }

        self.attribute_map = {
            'x': 'X',
            'y': 'Y',
            'z': 'Z',
            'time': 'time'
        }

        self._x = x
        self._y = y
        self._z = z
        self._time = time

    @classmethod
    def from_dict(cls, dikt) -> 'MachineHistoryResponseVibrations':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MachineHistoryResponse_vibrations of this MachineHistoryResponseVibrations.  # noqa: E501
        :rtype: MachineHistoryResponseVibrations
        """
        return util.deserialize_model(dikt, cls)

    @property
    def x(self):
        """Gets the x of this MachineHistoryResponseVibrations.


        :return: The x of this MachineHistoryResponseVibrations.
        :rtype: float
        """
        return self._x

    @x.setter
    def x(self, x):
        """Sets the x of this MachineHistoryResponseVibrations.


        :param x: The x of this MachineHistoryResponseVibrations.
        :type x: float
        """

        self._x = x

    @property
    def y(self):
        """Gets the y of this MachineHistoryResponseVibrations.


        :return: The y of this MachineHistoryResponseVibrations.
        :rtype: float
        """
        return self._y

    @y.setter
    def y(self, y):
        """Sets the y of this MachineHistoryResponseVibrations.


        :param y: The y of this MachineHistoryResponseVibrations.
        :type y: float
        """

        self._y = y

    @property
    def z(self):
        """Gets the z of this MachineHistoryResponseVibrations.


        :return: The z of this MachineHistoryResponseVibrations.
        :rtype: float
        """
        return self._z

    @z.setter
    def z(self, z):
        """Sets the z of this MachineHistoryResponseVibrations.


        :param z: The z of this MachineHistoryResponseVibrations.
        :type z: float
        """

        self._z = z

    @property
    def time(self):
        """Gets the time of this MachineHistoryResponseVibrations.


        :return: The time of this MachineHistoryResponseVibrations.
        :rtype: int
        """
        return self._time

    @time.setter
    def time(self, time):
        """Sets the time of this MachineHistoryResponseVibrations.


        :param time: The time of this MachineHistoryResponseVibrations.
        :type time: int
        """

        self._time = time
