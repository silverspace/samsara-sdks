# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class TemperatureResponseSensors(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, ambient_temperature: int=None, id: int=None, name: str=None, probe_temperature: int=None):  # noqa: E501
        """TemperatureResponseSensors - a model defined in Swagger

        :param ambient_temperature: The ambient_temperature of this TemperatureResponseSensors.  # noqa: E501
        :type ambient_temperature: int
        :param id: The id of this TemperatureResponseSensors.  # noqa: E501
        :type id: int
        :param name: The name of this TemperatureResponseSensors.  # noqa: E501
        :type name: str
        :param probe_temperature: The probe_temperature of this TemperatureResponseSensors.  # noqa: E501
        :type probe_temperature: int
        """
        self.swagger_types = {
            'ambient_temperature': int,
            'id': int,
            'name': str,
            'probe_temperature': int
        }

        self.attribute_map = {
            'ambient_temperature': 'ambientTemperature',
            'id': 'id',
            'name': 'name',
            'probe_temperature': 'probeTemperature'
        }

        self._ambient_temperature = ambient_temperature
        self._id = id
        self._name = name
        self._probe_temperature = probe_temperature

    @classmethod
    def from_dict(cls, dikt) -> 'TemperatureResponseSensors':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TemperatureResponse_sensors of this TemperatureResponseSensors.  # noqa: E501
        :rtype: TemperatureResponseSensors
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ambient_temperature(self) -> int:
        """Gets the ambient_temperature of this TemperatureResponseSensors.

        Currently reported ambient temperature in millidegrees celsius.  # noqa: E501

        :return: The ambient_temperature of this TemperatureResponseSensors.
        :rtype: int
        """
        return self._ambient_temperature

    @ambient_temperature.setter
    def ambient_temperature(self, ambient_temperature: int):
        """Sets the ambient_temperature of this TemperatureResponseSensors.

        Currently reported ambient temperature in millidegrees celsius.  # noqa: E501

        :param ambient_temperature: The ambient_temperature of this TemperatureResponseSensors.
        :type ambient_temperature: int
        """

        self._ambient_temperature = ambient_temperature

    @property
    def id(self) -> int:
        """Gets the id of this TemperatureResponseSensors.

        ID of the sensor.  # noqa: E501

        :return: The id of this TemperatureResponseSensors.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this TemperatureResponseSensors.

        ID of the sensor.  # noqa: E501

        :param id: The id of this TemperatureResponseSensors.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this TemperatureResponseSensors.

        Name of the sensor.  # noqa: E501

        :return: The name of this TemperatureResponseSensors.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TemperatureResponseSensors.

        Name of the sensor.  # noqa: E501

        :param name: The name of this TemperatureResponseSensors.
        :type name: str
        """

        self._name = name

    @property
    def probe_temperature(self) -> int:
        """Gets the probe_temperature of this TemperatureResponseSensors.

        Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.  # noqa: E501

        :return: The probe_temperature of this TemperatureResponseSensors.
        :rtype: int
        """
        return self._probe_temperature

    @probe_temperature.setter
    def probe_temperature(self, probe_temperature: int):
        """Sets the probe_temperature of this TemperatureResponseSensors.

        Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.  # noqa: E501

        :param probe_temperature: The probe_temperature of this TemperatureResponseSensors.
        :type probe_temperature: int
        """

        self._probe_temperature = probe_temperature
