# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class Vehicle(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, engine_hours: int=None, fuel_level_percent: float=None, id: int=None, name: str=None, note: str=None, odometer_meters: int=None, vin: str=None):
        """Vehicle - a model defined in OpenAPI

        :param engine_hours: The engine_hours of this Vehicle.
        :param fuel_level_percent: The fuel_level_percent of this Vehicle.
        :param id: The id of this Vehicle.
        :param name: The name of this Vehicle.
        :param note: The note of this Vehicle.
        :param odometer_meters: The odometer_meters of this Vehicle.
        :param vin: The vin of this Vehicle.
        """
        self.openapi_types = {
            'engine_hours': int,
            'fuel_level_percent': float,
            'id': int,
            'name': str,
            'note': str,
            'odometer_meters': int,
            'vin': str
        }

        self.attribute_map = {
            'engine_hours': 'engineHours',
            'fuel_level_percent': 'fuelLevelPercent',
            'id': 'id',
            'name': 'name',
            'note': 'note',
            'odometer_meters': 'odometerMeters',
            'vin': 'vin'
        }

        self._engine_hours = engine_hours
        self._fuel_level_percent = fuel_level_percent
        self._id = id
        self._name = name
        self._note = note
        self._odometer_meters = odometer_meters
        self._vin = vin

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Vehicle':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Vehicle of this Vehicle.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def engine_hours(self):
        """Gets the engine_hours of this Vehicle.

        Total engine hours for the vehicle.

        :return: The engine_hours of this Vehicle.
        :rtype: int
        """
        return self._engine_hours

    @engine_hours.setter
    def engine_hours(self, engine_hours):
        """Sets the engine_hours of this Vehicle.

        Total engine hours for the vehicle.

        :param engine_hours: The engine_hours of this Vehicle.
        :type engine_hours: int
        """

        self._engine_hours = engine_hours

    @property
    def fuel_level_percent(self):
        """Gets the fuel_level_percent of this Vehicle.

        The fuel level of the vehicle as a percentage. (0.0 to 1.0)

        :return: The fuel_level_percent of this Vehicle.
        :rtype: float
        """
        return self._fuel_level_percent

    @fuel_level_percent.setter
    def fuel_level_percent(self, fuel_level_percent):
        """Sets the fuel_level_percent of this Vehicle.

        The fuel level of the vehicle as a percentage. (0.0 to 1.0)

        :param fuel_level_percent: The fuel_level_percent of this Vehicle.
        :type fuel_level_percent: float
        """

        self._fuel_level_percent = fuel_level_percent

    @property
    def id(self):
        """Gets the id of this Vehicle.

        ID of the vehicle.

        :return: The id of this Vehicle.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Vehicle.

        ID of the vehicle.

        :param id: The id of this Vehicle.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def name(self):
        """Gets the name of this Vehicle.

        Name of the vehicle.

        :return: The name of this Vehicle.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Vehicle.

        Name of the vehicle.

        :param name: The name of this Vehicle.
        :type name: str
        """

        self._name = name

    @property
    def note(self):
        """Gets the note of this Vehicle.


        :return: The note of this Vehicle.
        :rtype: str
        """
        return self._note

    @note.setter
    def note(self, note):
        """Sets the note of this Vehicle.


        :param note: The note of this Vehicle.
        :type note: str
        """

        self._note = note

    @property
    def odometer_meters(self):
        """Gets the odometer_meters of this Vehicle.

        The number of meters reported by the odometer.

        :return: The odometer_meters of this Vehicle.
        :rtype: int
        """
        return self._odometer_meters

    @odometer_meters.setter
    def odometer_meters(self, odometer_meters):
        """Sets the odometer_meters of this Vehicle.

        The number of meters reported by the odometer.

        :param odometer_meters: The odometer_meters of this Vehicle.
        :type odometer_meters: int
        """

        self._odometer_meters = odometer_meters

    @property
    def vin(self):
        """Gets the vin of this Vehicle.

        Vehicle Identification Number.

        :return: The vin of this Vehicle.
        :rtype: str
        """
        return self._vin

    @vin.setter
    def vin(self, vin):
        """Sets the vin of this Vehicle.

        Vehicle Identification Number.

        :param vin: The vin of this Vehicle.
        :type vin: str
        """

        self._vin = vin
