# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class Sensor(Model):
    """Contains information about a sensor.

    :param id: ID of the sensor.
    :type id: long
    :param mac_address: MAC address of the sensor.
    :type mac_address: str
    :param name: Name of the sensor.
    :type name: str
    """

    _validation = {
        'id': {'required': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
        'mac_address': {'key': 'macAddress', 'type': 'str'},
        'name': {'key': 'name', 'type': 'str'},
    }

    def __init__(self, id, mac_address=None, name=None):
        super(Sensor, self).__init__()
        self.id = id
        self.mac_address = mac_address
        self.name = name
