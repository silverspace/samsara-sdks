# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class TagModifyDelete(Model):
    """Specify devices, etc. that should be removed from the tag.

    :param assets: The assets to be removed from this tag.
    :type assets: list[~swagger.models.TaggedAssetBase]
    :param drivers: The drivers to be removed from this tag.
    :type drivers: list[~swagger.models.TaggedDriverBase]
    :param machines: The machines to be removed from this tag.
    :type machines: list[~swagger.models.TaggedMachineBase]
    :param sensors: The sensors to be removed from this tag.
    :type sensors: list[~swagger.models.TaggedSensorBase]
    :param vehicles: The vehicles to be removed from this tag.
    :type vehicles: list[~swagger.models.TaggedVehicleBase]
    """

    _attribute_map = {
        'assets': {'key': 'assets', 'type': '[TaggedAssetBase]'},
        'drivers': {'key': 'drivers', 'type': '[TaggedDriverBase]'},
        'machines': {'key': 'machines', 'type': '[TaggedMachineBase]'},
        'sensors': {'key': 'sensors', 'type': '[TaggedSensorBase]'},
        'vehicles': {'key': 'vehicles', 'type': '[TaggedVehicleBase]'},
    }

    def __init__(self, assets=None, drivers=None, machines=None, sensors=None, vehicles=None):
        super(TagModifyDelete, self).__init__()
        self.assets = assets
        self.drivers = drivers
        self.machines = machines
        self.sensors = sensors
        self.vehicles = vehicles
