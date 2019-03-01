# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .tagged_vehicle_base import TaggedVehicleBase


class TaggedVehicle(TaggedVehicleBase):
    """TaggedVehicle.

    :param id: The ID of the Vehicle being tagged.
    :type id: long
    :param name: Name of the Vehicle being tagged.
    :type name: str
    """

    _validation = {
        'id': {'required': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
        'name': {'key': 'name', 'type': 'str'},
    }

    def __init__(self, id, name=None):
        super(TaggedVehicle, self).__init__(id=id)
        self.name = name