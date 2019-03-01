# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AddressGeofence(Model):
    """The geofence that defines this address and its bounds. This can either be a
    circle, or a polygon - only one key should be provided, depending on the
    geofence type.

    :param circle: Information about a circular geofence. This field is only
     populated if the geofence is a circle.
    :type circle: ~swagger.models.AddressGeofenceCircle
    :param polygon: Information about a polygon geofence. This field is only
     populated if the geofence is a polygon.
    :type polygon: ~swagger.models.AddressGeofencePolygon
    """

    _attribute_map = {
        'circle': {'key': 'circle', 'type': 'AddressGeofenceCircle'},
        'polygon': {'key': 'polygon', 'type': 'AddressGeofencePolygon'},
    }

    def __init__(self, circle=None, polygon=None):
        super(AddressGeofence, self).__init__()
        self.circle = circle
        self.polygon = polygon