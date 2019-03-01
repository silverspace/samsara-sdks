# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.address_geofence_circle import AddressGeofenceCircle
from openapi_server.models.address_geofence_polygon import AddressGeofencePolygon
from openapi_server import util

from openapi_server.models.address_geofence_circle import AddressGeofenceCircle  # noqa: E501
from openapi_server.models.address_geofence_polygon import AddressGeofencePolygon  # noqa: E501

class AddressGeofence(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, circle=None, polygon=None):  # noqa: E501
        """AddressGeofence - a model defined in OpenAPI

        :param circle: The circle of this AddressGeofence.  # noqa: E501
        :type circle: AddressGeofenceCircle
        :param polygon: The polygon of this AddressGeofence.  # noqa: E501
        :type polygon: AddressGeofencePolygon
        """
        self.openapi_types = {
            'circle': AddressGeofenceCircle,
            'polygon': AddressGeofencePolygon
        }

        self.attribute_map = {
            'circle': 'circle',
            'polygon': 'polygon'
        }

        self._circle = circle
        self._polygon = polygon

    @classmethod
    def from_dict(cls, dikt) -> 'AddressGeofence':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AddressGeofence of this AddressGeofence.  # noqa: E501
        :rtype: AddressGeofence
        """
        return util.deserialize_model(dikt, cls)

    @property
    def circle(self):
        """Gets the circle of this AddressGeofence.


        :return: The circle of this AddressGeofence.
        :rtype: AddressGeofenceCircle
        """
        return self._circle

    @circle.setter
    def circle(self, circle):
        """Sets the circle of this AddressGeofence.


        :param circle: The circle of this AddressGeofence.
        :type circle: AddressGeofenceCircle
        """

        self._circle = circle

    @property
    def polygon(self):
        """Gets the polygon of this AddressGeofence.


        :return: The polygon of this AddressGeofence.
        :rtype: AddressGeofencePolygon
        """
        return self._polygon

    @polygon.setter
    def polygon(self, polygon):
        """Sets the polygon of this AddressGeofence.


        :param polygon: The polygon of this AddressGeofence.
        :type polygon: AddressGeofencePolygon
        """

        self._polygon = polygon
