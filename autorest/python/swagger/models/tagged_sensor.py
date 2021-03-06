# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .tagged_sensor_base import TaggedSensorBase


class TaggedSensor(TaggedSensorBase):
    """TaggedSensor.

    :param id: The ID of the Sensor being tagged.
    :type id: long
    :param name: Name of the Sensor being tagged.
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
        super(TaggedSensor, self).__init__(id=id)
        self.name = name
