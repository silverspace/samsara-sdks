# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AssetLocationResponseItem(Model):
    """Asset location details.

    :param latitude: The latitude of the location in degrees.
    :type latitude: float
    :param location: The best effort (street,city,state) for the latitude and
     longitude.
    :type location: str
    :param longitude: The longitude of the location in degrees.
    :type longitude: float
    :param speed_miles_per_hour: The speed calculated from GPS that the asset
     was traveling at in miles per hour.
    :type speed_miles_per_hour: float
    :param time: Time in Unix milliseconds since epoch when the asset was at
     the location.
    :type time: float
    """

    _attribute_map = {
        'latitude': {'key': 'latitude', 'type': 'float'},
        'location': {'key': 'location', 'type': 'str'},
        'longitude': {'key': 'longitude', 'type': 'float'},
        'speed_miles_per_hour': {'key': 'speedMilesPerHour', 'type': 'float'},
        'time': {'key': 'time', 'type': 'float'},
    }

    def __init__(self, latitude=None, location=None, longitude=None, speed_miles_per_hour=None, time=None):
        super(AssetLocationResponseItem, self).__init__()
        self.latitude = latitude
        self.location = location
        self.longitude = longitude
        self.speed_miles_per_hour = speed_miles_per_hour
        self.time = time
