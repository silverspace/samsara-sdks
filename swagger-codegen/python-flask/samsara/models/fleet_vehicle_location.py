# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class FleetVehicleLocation(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, latitude: float=None, location: str=None, longitude: float=None, speed_miles_per_hour: float=None, time_ms: int=None):  # noqa: E501
        """FleetVehicleLocation - a model defined in Swagger

        :param latitude: The latitude of this FleetVehicleLocation.  # noqa: E501
        :type latitude: float
        :param location: The location of this FleetVehicleLocation.  # noqa: E501
        :type location: str
        :param longitude: The longitude of this FleetVehicleLocation.  # noqa: E501
        :type longitude: float
        :param speed_miles_per_hour: The speed_miles_per_hour of this FleetVehicleLocation.  # noqa: E501
        :type speed_miles_per_hour: float
        :param time_ms: The time_ms of this FleetVehicleLocation.  # noqa: E501
        :type time_ms: int
        """
        self.swagger_types = {
            'latitude': float,
            'location': str,
            'longitude': float,
            'speed_miles_per_hour': float,
            'time_ms': int
        }

        self.attribute_map = {
            'latitude': 'latitude',
            'location': 'location',
            'longitude': 'longitude',
            'speed_miles_per_hour': 'speedMilesPerHour',
            'time_ms': 'timeMs'
        }

        self._latitude = latitude
        self._location = location
        self._longitude = longitude
        self._speed_miles_per_hour = speed_miles_per_hour
        self._time_ms = time_ms

    @classmethod
    def from_dict(cls, dikt) -> 'FleetVehicleLocation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FleetVehicleLocation of this FleetVehicleLocation.  # noqa: E501
        :rtype: FleetVehicleLocation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latitude(self) -> float:
        """Gets the latitude of this FleetVehicleLocation.

        The latitude of the location in degrees.  # noqa: E501

        :return: The latitude of this FleetVehicleLocation.
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude: float):
        """Sets the latitude of this FleetVehicleLocation.

        The latitude of the location in degrees.  # noqa: E501

        :param latitude: The latitude of this FleetVehicleLocation.
        :type latitude: float
        """

        self._latitude = latitude

    @property
    def location(self) -> str:
        """Gets the location of this FleetVehicleLocation.

        The best effort (street,city,state) for the latitude and longitude.  # noqa: E501

        :return: The location of this FleetVehicleLocation.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location: str):
        """Sets the location of this FleetVehicleLocation.

        The best effort (street,city,state) for the latitude and longitude.  # noqa: E501

        :param location: The location of this FleetVehicleLocation.
        :type location: str
        """

        self._location = location

    @property
    def longitude(self) -> float:
        """Gets the longitude of this FleetVehicleLocation.

        The longitude of the location in degrees.  # noqa: E501

        :return: The longitude of this FleetVehicleLocation.
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude: float):
        """Sets the longitude of this FleetVehicleLocation.

        The longitude of the location in degrees.  # noqa: E501

        :param longitude: The longitude of this FleetVehicleLocation.
        :type longitude: float
        """

        self._longitude = longitude

    @property
    def speed_miles_per_hour(self) -> float:
        """Gets the speed_miles_per_hour of this FleetVehicleLocation.

        The speed calculated from GPS that the asset was traveling at in miles per hour.  # noqa: E501

        :return: The speed_miles_per_hour of this FleetVehicleLocation.
        :rtype: float
        """
        return self._speed_miles_per_hour

    @speed_miles_per_hour.setter
    def speed_miles_per_hour(self, speed_miles_per_hour: float):
        """Sets the speed_miles_per_hour of this FleetVehicleLocation.

        The speed calculated from GPS that the asset was traveling at in miles per hour.  # noqa: E501

        :param speed_miles_per_hour: The speed_miles_per_hour of this FleetVehicleLocation.
        :type speed_miles_per_hour: float
        """

        self._speed_miles_per_hour = speed_miles_per_hour

    @property
    def time_ms(self) -> int:
        """Gets the time_ms of this FleetVehicleLocation.

        Time in Unix milliseconds since epoch when the asset was at the location.  # noqa: E501

        :return: The time_ms of this FleetVehicleLocation.
        :rtype: int
        """
        return self._time_ms

    @time_ms.setter
    def time_ms(self, time_ms: int):
        """Sets the time_ms of this FleetVehicleLocation.

        Time in Unix milliseconds since epoch when the asset was at the location.  # noqa: E501

        :param time_ms: The time_ms of this FleetVehicleLocation.
        :type time_ms: int
        """

        self._time_ms = time_ms