# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class AssetCurrentLocation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, latitude=None, location=None, longitude=None, speed_miles_per_hour=None, time_ms=None):  # noqa: E501
        """AssetCurrentLocation - a model defined in OpenAPI

        :param latitude: The latitude of this AssetCurrentLocation.  # noqa: E501
        :type latitude: float
        :param location: The location of this AssetCurrentLocation.  # noqa: E501
        :type location: str
        :param longitude: The longitude of this AssetCurrentLocation.  # noqa: E501
        :type longitude: float
        :param speed_miles_per_hour: The speed_miles_per_hour of this AssetCurrentLocation.  # noqa: E501
        :type speed_miles_per_hour: float
        :param time_ms: The time_ms of this AssetCurrentLocation.  # noqa: E501
        :type time_ms: int
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt) -> 'AssetCurrentLocation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssetCurrentLocation of this AssetCurrentLocation.  # noqa: E501
        :rtype: AssetCurrentLocation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latitude(self):
        """Gets the latitude of this AssetCurrentLocation.

        The latitude of the location in degrees.  # noqa: E501

        :return: The latitude of this AssetCurrentLocation.
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude):
        """Sets the latitude of this AssetCurrentLocation.

        The latitude of the location in degrees.  # noqa: E501

        :param latitude: The latitude of this AssetCurrentLocation.
        :type latitude: float
        """

        self._latitude = latitude

    @property
    def location(self):
        """Gets the location of this AssetCurrentLocation.

        The best effort (street,city,state) for the latitude and longitude.  # noqa: E501

        :return: The location of this AssetCurrentLocation.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this AssetCurrentLocation.

        The best effort (street,city,state) for the latitude and longitude.  # noqa: E501

        :param location: The location of this AssetCurrentLocation.
        :type location: str
        """

        self._location = location

    @property
    def longitude(self):
        """Gets the longitude of this AssetCurrentLocation.

        The longitude of the location in degrees.  # noqa: E501

        :return: The longitude of this AssetCurrentLocation.
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude):
        """Sets the longitude of this AssetCurrentLocation.

        The longitude of the location in degrees.  # noqa: E501

        :param longitude: The longitude of this AssetCurrentLocation.
        :type longitude: float
        """

        self._longitude = longitude

    @property
    def speed_miles_per_hour(self):
        """Gets the speed_miles_per_hour of this AssetCurrentLocation.

        The speed calculated from GPS that the asset was traveling at in miles per hour.  # noqa: E501

        :return: The speed_miles_per_hour of this AssetCurrentLocation.
        :rtype: float
        """
        return self._speed_miles_per_hour

    @speed_miles_per_hour.setter
    def speed_miles_per_hour(self, speed_miles_per_hour):
        """Sets the speed_miles_per_hour of this AssetCurrentLocation.

        The speed calculated from GPS that the asset was traveling at in miles per hour.  # noqa: E501

        :param speed_miles_per_hour: The speed_miles_per_hour of this AssetCurrentLocation.
        :type speed_miles_per_hour: float
        """

        self._speed_miles_per_hour = speed_miles_per_hour

    @property
    def time_ms(self):
        """Gets the time_ms of this AssetCurrentLocation.

        Time in Unix milliseconds since epoch when the asset was at the location.  # noqa: E501

        :return: The time_ms of this AssetCurrentLocation.
        :rtype: int
        """
        return self._time_ms

    @time_ms.setter
    def time_ms(self, time_ms):
        """Sets the time_ms of this AssetCurrentLocation.

        Time in Unix milliseconds since epoch when the asset was at the location.  # noqa: E501

        :param time_ms: The time_ms of this AssetCurrentLocation.
        :type time_ms: int
        """

        self._time_ms = time_ms