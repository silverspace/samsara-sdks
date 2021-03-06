# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class AddressGeofenceCircle(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, latitude: float=None, radius_meters: int=None, longitude: float=None):
        """AddressGeofenceCircle - a model defined in OpenAPI

        :param latitude: The latitude of this AddressGeofenceCircle.
        :param radius_meters: The radius_meters of this AddressGeofenceCircle.
        :param longitude: The longitude of this AddressGeofenceCircle.
        """
        self.openapi_types = {
            'latitude': float,
            'radius_meters': int,
            'longitude': float
        }

        self.attribute_map = {
            'latitude': 'latitude',
            'radius_meters': 'radiusMeters',
            'longitude': 'longitude'
        }

        self._latitude = latitude
        self._radius_meters = radius_meters
        self._longitude = longitude

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AddressGeofenceCircle':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AddressGeofence_circle of this AddressGeofenceCircle.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latitude(self):
        """Gets the latitude of this AddressGeofenceCircle.

        The latitude of the center of the circular geofence

        :return: The latitude of this AddressGeofenceCircle.
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude):
        """Sets the latitude of this AddressGeofenceCircle.

        The latitude of the center of the circular geofence

        :param latitude: The latitude of this AddressGeofenceCircle.
        :type latitude: float
        """

        self._latitude = latitude

    @property
    def radius_meters(self):
        """Gets the radius_meters of this AddressGeofenceCircle.

        The radius of the circular geofence

        :return: The radius_meters of this AddressGeofenceCircle.
        :rtype: int
        """
        return self._radius_meters

    @radius_meters.setter
    def radius_meters(self, radius_meters):
        """Sets the radius_meters of this AddressGeofenceCircle.

        The radius of the circular geofence

        :param radius_meters: The radius_meters of this AddressGeofenceCircle.
        :type radius_meters: int
        """

        self._radius_meters = radius_meters

    @property
    def longitude(self):
        """Gets the longitude of this AddressGeofenceCircle.

        The longitude of the center of the circular geofence

        :return: The longitude of this AddressGeofenceCircle.
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude):
        """Sets the longitude of this AddressGeofenceCircle.

        The longitude of the center of the circular geofence

        :param longitude: The longitude of this AddressGeofenceCircle.
        :type longitude: float
        """

        self._longitude = longitude
