# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class VehicleHarshEventResponseLocation(Model):
    """VehicleHarshEventResponseLocation.

    :param address: Address of location where the harsh event occurred
    :type address: str
    :param latitude: Latitude of location where the harsh event occurred
    :type latitude: str
    :param longitude: Longitude of location where the harsh event occurred
    :type longitude: str
    """

    _attribute_map = {
        'address': {'key': 'address', 'type': 'str'},
        'latitude': {'key': 'latitude', 'type': 'str'},
        'longitude': {'key': 'longitude', 'type': 'str'},
    }

    def __init__(self, address=None, latitude=None, longitude=None):
        super(VehicleHarshEventResponseLocation, self).__init__()
        self.address = address
        self.latitude = latitude
        self.longitude = longitude
