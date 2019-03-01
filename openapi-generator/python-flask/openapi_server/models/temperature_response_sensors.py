# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class TemperatureResponseSensors(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, probe_temperature=None, name=None, id=None, ambient_temperature=None):  # noqa: E501
        """TemperatureResponseSensors - a model defined in OpenAPI

        :param probe_temperature: The probe_temperature of this TemperatureResponseSensors.  # noqa: E501
        :type probe_temperature: int
        :param name: The name of this TemperatureResponseSensors.  # noqa: E501
        :type name: str
        :param id: The id of this TemperatureResponseSensors.  # noqa: E501
        :type id: int
        :param ambient_temperature: The ambient_temperature of this TemperatureResponseSensors.  # noqa: E501
        :type ambient_temperature: int
        """
        self.openapi_types = {
            'probe_temperature': int,
            'name': str,
            'id': int,
            'ambient_temperature': int
        }

        self.attribute_map = {
            'probe_temperature': 'probeTemperature',
            'name': 'name',
            'id': 'id',
            'ambient_temperature': 'ambientTemperature'
        }

        self._probe_temperature = probe_temperature
        self._name = name
        self._id = id
        self._ambient_temperature = ambient_temperature

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
    def probe_temperature(self):
        """Gets the probe_temperature of this TemperatureResponseSensors.

        Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.  # noqa: E501

        :return: The probe_temperature of this TemperatureResponseSensors.
        :rtype: int
        """
        return self._probe_temperature

    @probe_temperature.setter
    def probe_temperature(self, probe_temperature):
        """Sets the probe_temperature of this TemperatureResponseSensors.

        Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.  # noqa: E501

        :param probe_temperature: The probe_temperature of this TemperatureResponseSensors.
        :type probe_temperature: int
        """

        self._probe_temperature = probe_temperature

    @property
    def name(self):
        """Gets the name of this TemperatureResponseSensors.

        Name of the sensor.  # noqa: E501

        :return: The name of this TemperatureResponseSensors.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TemperatureResponseSensors.

        Name of the sensor.  # noqa: E501

        :param name: The name of this TemperatureResponseSensors.
        :type name: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this TemperatureResponseSensors.

        ID of the sensor.  # noqa: E501

        :return: The id of this TemperatureResponseSensors.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this TemperatureResponseSensors.

        ID of the sensor.  # noqa: E501

        :param id: The id of this TemperatureResponseSensors.
        :type id: int
        """

        self._id = id

    @property
    def ambient_temperature(self):
        """Gets the ambient_temperature of this TemperatureResponseSensors.

        Currently reported ambient temperature in millidegrees celsius.  # noqa: E501

        :return: The ambient_temperature of this TemperatureResponseSensors.
        :rtype: int
        """
        return self._ambient_temperature

    @ambient_temperature.setter
    def ambient_temperature(self, ambient_temperature):
        """Sets the ambient_temperature of this TemperatureResponseSensors.

        Currently reported ambient temperature in millidegrees celsius.  # noqa: E501

        :param ambient_temperature: The ambient_temperature of this TemperatureResponseSensors.
        :type ambient_temperature: int
        """

        self._ambient_temperature = ambient_temperature