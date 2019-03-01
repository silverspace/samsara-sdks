# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DvirBaseVehicle(Model):
    """The vehicle on which DVIR was done.

    :param id: The vehicle id on which DVIR was done.
    :type id: long
    :param name: The vehicle on which DVIR was done.
    :type name: str
    """

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
        'name': {'key': 'name', 'type': 'str'},
    }

    def __init__(self, id=None, name=None):
        super(DvirBaseVehicle, self).__init__()
        self.id = id
        self.name = name
