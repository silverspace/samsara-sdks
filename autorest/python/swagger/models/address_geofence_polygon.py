# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AddressGeofencePolygon(Model):
    """Information about a polygon geofence. This field is only populated if the
    geofence is a polygon.

    :param vertices: The vertices of the polygon geofence. These geofence
     vertices describe the perimeter of the polygon, and must consist of at
     least 3 vertices and less than 40.
    :type vertices: list[~swagger.models.AddressGeofencePolygonVerticesItem]
    """

    _attribute_map = {
        'vertices': {'key': 'vertices', 'type': '[AddressGeofencePolygonVerticesItem]'},
    }

    def __init__(self, vertices=None):
        super(AddressGeofencePolygon, self).__init__()
        self.vertices = vertices
