# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class MachineHistoryResponseMachinesItemVibrationsItem(Model):
    """MachineHistoryResponseMachinesItemVibrationsItem.

    :param x:
    :type x: float
    :param y:
    :type y: float
    :param z:
    :type z: float
    :param time:
    :type time: long
    """

    _attribute_map = {
        'x': {'key': 'X', 'type': 'float'},
        'y': {'key': 'Y', 'type': 'float'},
        'z': {'key': 'Z', 'type': 'float'},
        'time': {'key': 'time', 'type': 'long'},
    }

    def __init__(self, x=None, y=None, z=None, time=None):
        super(MachineHistoryResponseMachinesItemVibrationsItem, self).__init__()
        self.x = x
        self.y = y
        self.z = z
        self.time = time