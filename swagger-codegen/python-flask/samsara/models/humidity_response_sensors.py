# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class HumidityResponseSensors(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, humidity: int=None, id: int=None, name: str=None):  # noqa: E501
        """HumidityResponseSensors - a model defined in Swagger

        :param humidity: The humidity of this HumidityResponseSensors.  # noqa: E501
        :type humidity: int
        :param id: The id of this HumidityResponseSensors.  # noqa: E501
        :type id: int
        :param name: The name of this HumidityResponseSensors.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            'humidity': int,
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'humidity': 'humidity',
            'id': 'id',
            'name': 'name'
        }

        self._humidity = humidity
        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'HumidityResponseSensors':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The HumidityResponse_sensors of this HumidityResponseSensors.  # noqa: E501
        :rtype: HumidityResponseSensors
        """
        return util.deserialize_model(dikt, cls)

    @property
    def humidity(self) -> int:
        """Gets the humidity of this HumidityResponseSensors.

        Currently reported relative humidity in percent, from 0-100.  # noqa: E501

        :return: The humidity of this HumidityResponseSensors.
        :rtype: int
        """
        return self._humidity

    @humidity.setter
    def humidity(self, humidity: int):
        """Sets the humidity of this HumidityResponseSensors.

        Currently reported relative humidity in percent, from 0-100.  # noqa: E501

        :param humidity: The humidity of this HumidityResponseSensors.
        :type humidity: int
        """

        self._humidity = humidity

    @property
    def id(self) -> int:
        """Gets the id of this HumidityResponseSensors.

        ID of the sensor.  # noqa: E501

        :return: The id of this HumidityResponseSensors.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this HumidityResponseSensors.

        ID of the sensor.  # noqa: E501

        :param id: The id of this HumidityResponseSensors.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this HumidityResponseSensors.

        Name of the sensor.  # noqa: E501

        :return: The name of this HumidityResponseSensors.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this HumidityResponseSensors.

        Name of the sensor.  # noqa: E501

        :param name: The name of this HumidityResponseSensors.
        :type name: str
        """

        self._name = name
