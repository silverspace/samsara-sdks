# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class VehicleLocation(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, heading: float=None, id: int=None, latitude: float=None, location: str=None, longitude: float=None, name: str=None, odometer_meters: int=None, on_trip: bool=None, speed: float=None, time: int=None, vin: str=None):  # noqa: E501
        """VehicleLocation - a model defined in Swagger

        :param heading: The heading of this VehicleLocation.  # noqa: E501
        :type heading: float
        :param id: The id of this VehicleLocation.  # noqa: E501
        :type id: int
        :param latitude: The latitude of this VehicleLocation.  # noqa: E501
        :type latitude: float
        :param location: The location of this VehicleLocation.  # noqa: E501
        :type location: str
        :param longitude: The longitude of this VehicleLocation.  # noqa: E501
        :type longitude: float
        :param name: The name of this VehicleLocation.  # noqa: E501
        :type name: str
        :param odometer_meters: The odometer_meters of this VehicleLocation.  # noqa: E501
        :type odometer_meters: int
        :param on_trip: The on_trip of this VehicleLocation.  # noqa: E501
        :type on_trip: bool
        :param speed: The speed of this VehicleLocation.  # noqa: E501
        :type speed: float
        :param time: The time of this VehicleLocation.  # noqa: E501
        :type time: int
        :param vin: The vin of this VehicleLocation.  # noqa: E501
        :type vin: str
        """
        self.swagger_types = {
            'heading': float,
            'id': int,
            'latitude': float,
            'location': str,
            'longitude': float,
            'name': str,
            'odometer_meters': int,
            'on_trip': bool,
            'speed': float,
            'time': int,
            'vin': str
        }

        self.attribute_map = {
            'heading': 'heading',
            'id': 'id',
            'latitude': 'latitude',
            'location': 'location',
            'longitude': 'longitude',
            'name': 'name',
            'odometer_meters': 'odometerMeters',
            'on_trip': 'onTrip',
            'speed': 'speed',
            'time': 'time',
            'vin': 'vin'
        }

        self._heading = heading
        self._id = id
        self._latitude = latitude
        self._location = location
        self._longitude = longitude
        self._name = name
        self._odometer_meters = odometer_meters
        self._on_trip = on_trip
        self._speed = speed
        self._time = time
        self._vin = vin

    @classmethod
    def from_dict(cls, dikt) -> 'VehicleLocation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VehicleLocation of this VehicleLocation.  # noqa: E501
        :rtype: VehicleLocation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def heading(self) -> float:
        """Gets the heading of this VehicleLocation.

        Heading in degrees.  # noqa: E501

        :return: The heading of this VehicleLocation.
        :rtype: float
        """
        return self._heading

    @heading.setter
    def heading(self, heading: float):
        """Sets the heading of this VehicleLocation.

        Heading in degrees.  # noqa: E501

        :param heading: The heading of this VehicleLocation.
        :type heading: float
        """

        self._heading = heading

    @property
    def id(self) -> int:
        """Gets the id of this VehicleLocation.

        ID of the vehicle.  # noqa: E501

        :return: The id of this VehicleLocation.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this VehicleLocation.

        ID of the vehicle.  # noqa: E501

        :param id: The id of this VehicleLocation.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def latitude(self) -> float:
        """Gets the latitude of this VehicleLocation.

        Latitude in decimal degrees.  # noqa: E501

        :return: The latitude of this VehicleLocation.
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude: float):
        """Sets the latitude of this VehicleLocation.

        Latitude in decimal degrees.  # noqa: E501

        :param latitude: The latitude of this VehicleLocation.
        :type latitude: float
        """

        self._latitude = latitude

    @property
    def location(self) -> str:
        """Gets the location of this VehicleLocation.

        Text representation of nearest identifiable location to (latitude, longitude) coordinates.  # noqa: E501

        :return: The location of this VehicleLocation.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location: str):
        """Sets the location of this VehicleLocation.

        Text representation of nearest identifiable location to (latitude, longitude) coordinates.  # noqa: E501

        :param location: The location of this VehicleLocation.
        :type location: str
        """

        self._location = location

    @property
    def longitude(self) -> float:
        """Gets the longitude of this VehicleLocation.

        Longitude in decimal degrees.  # noqa: E501

        :return: The longitude of this VehicleLocation.
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude: float):
        """Sets the longitude of this VehicleLocation.

        Longitude in decimal degrees.  # noqa: E501

        :param longitude: The longitude of this VehicleLocation.
        :type longitude: float
        """

        self._longitude = longitude

    @property
    def name(self) -> str:
        """Gets the name of this VehicleLocation.

        Name of the vehicle.  # noqa: E501

        :return: The name of this VehicleLocation.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this VehicleLocation.

        Name of the vehicle.  # noqa: E501

        :param name: The name of this VehicleLocation.
        :type name: str
        """

        self._name = name

    @property
    def odometer_meters(self) -> int:
        """Gets the odometer_meters of this VehicleLocation.

        The number of meters reported by the odometer.  # noqa: E501

        :return: The odometer_meters of this VehicleLocation.
        :rtype: int
        """
        return self._odometer_meters

    @odometer_meters.setter
    def odometer_meters(self, odometer_meters: int):
        """Sets the odometer_meters of this VehicleLocation.

        The number of meters reported by the odometer.  # noqa: E501

        :param odometer_meters: The odometer_meters of this VehicleLocation.
        :type odometer_meters: int
        """

        self._odometer_meters = odometer_meters

    @property
    def on_trip(self) -> bool:
        """Gets the on_trip of this VehicleLocation.

        Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.  # noqa: E501

        :return: The on_trip of this VehicleLocation.
        :rtype: bool
        """
        return self._on_trip

    @on_trip.setter
    def on_trip(self, on_trip: bool):
        """Sets the on_trip of this VehicleLocation.

        Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.  # noqa: E501

        :param on_trip: The on_trip of this VehicleLocation.
        :type on_trip: bool
        """

        self._on_trip = on_trip

    @property
    def speed(self) -> float:
        """Gets the speed of this VehicleLocation.

        Speed in miles per hour.  # noqa: E501

        :return: The speed of this VehicleLocation.
        :rtype: float
        """
        return self._speed

    @speed.setter
    def speed(self, speed: float):
        """Sets the speed of this VehicleLocation.

        Speed in miles per hour.  # noqa: E501

        :param speed: The speed of this VehicleLocation.
        :type speed: float
        """

        self._speed = speed

    @property
    def time(self) -> int:
        """Gets the time of this VehicleLocation.

        The time the reported location was logged, reported as a UNIX timestamp in milliseconds.  # noqa: E501

        :return: The time of this VehicleLocation.
        :rtype: int
        """
        return self._time

    @time.setter
    def time(self, time: int):
        """Sets the time of this VehicleLocation.

        The time the reported location was logged, reported as a UNIX timestamp in milliseconds.  # noqa: E501

        :param time: The time of this VehicleLocation.
        :type time: int
        """

        self._time = time

    @property
    def vin(self) -> str:
        """Gets the vin of this VehicleLocation.

        Vehicle Identification Number (VIN) of the vehicle.  # noqa: E501

        :return: The vin of this VehicleLocation.
        :rtype: str
        """
        return self._vin

    @vin.setter
    def vin(self, vin: str):
        """Sets the vin of this VehicleLocation.

        Vehicle Identification Number (VIN) of the vehicle.  # noqa: E501

        :param vin: The vin of this VehicleLocation.
        :type vin: str
        """

        self._vin = vin
