# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class TaggedVehicleBase(Model):
    """TaggedVehicleBase.

    :param id: The ID of the Vehicle being tagged.
    :type id: long
    """

    _validation = {
        'id': {'required': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
    }

    def __init__(self, id):
        super(TaggedVehicleBase, self).__init__()
        self.id = id
