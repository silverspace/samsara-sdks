# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class AddressGeofencePolygonVertices(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, latitude=None, longitude=None):  # noqa: E501
        """AddressGeofencePolygonVertices - a model defined in OpenAPI

        :param latitude: The latitude of this AddressGeofencePolygonVertices.  # noqa: E501
        :type latitude: float
        :param longitude: The longitude of this AddressGeofencePolygonVertices.  # noqa: E501
        :type longitude: float
        """
        self.openapi_types = {
            'latitude': float,
            'longitude': float
        }

        self.attribute_map = {
            'latitude': 'latitude',
            'longitude': 'longitude'
        }

        self._latitude = latitude
        self._longitude = longitude

    @classmethod
    def from_dict(cls, dikt) -> 'AddressGeofencePolygonVertices':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AddressGeofence_polygon_vertices of this AddressGeofencePolygonVertices.  # noqa: E501
        :rtype: AddressGeofencePolygonVertices
        """
        return util.deserialize_model(dikt, cls)

    @property
    def latitude(self):
        """Gets the latitude of this AddressGeofencePolygonVertices.

        The longitude of a geofence vertex  # noqa: E501

        :return: The latitude of this AddressGeofencePolygonVertices.
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude):
        """Sets the latitude of this AddressGeofencePolygonVertices.

        The longitude of a geofence vertex  # noqa: E501

        :param latitude: The latitude of this AddressGeofencePolygonVertices.
        :type latitude: float
        """

        self._latitude = latitude

    @property
    def longitude(self):
        """Gets the longitude of this AddressGeofencePolygonVertices.

        The longitude of a geofence vertex  # noqa: E501

        :return: The longitude of this AddressGeofencePolygonVertices.
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude):
        """Sets the longitude of this AddressGeofencePolygonVertices.

        The longitude of a geofence vertex  # noqa: E501

        :param longitude: The longitude of this AddressGeofencePolygonVertices.
        :type longitude: float
        """

        self._longitude = longitude
