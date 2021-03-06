# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class CargoResponse(Model):
    """Contains the current cargo status of a sensor.

    :param group_id:
    :type group_id: long
    :param sensors:
    :type sensors: list[~swagger.models.CargoResponseSensorsItem]
    """

    _attribute_map = {
        'group_id': {'key': 'groupId', 'type': 'long'},
        'sensors': {'key': 'sensors', 'type': '[CargoResponseSensorsItem]'},
    }

    def __init__(self, group_id=None, sensors=None):
        super(CargoResponse, self).__init__()
        self.group_id = group_id
        self.sensors = sensors
