# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class FleetVehiclesLocationsItem(Model):
    """FleetVehiclesLocationsItem.

    :param id: ID of the vehicle.
    :type id: long
    :param locations:
    :type locations: list[~swagger.models.FleetVehicleLocation]
    :param name: Name of the vehicle.
    :type name: str
    """

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
        'locations': {'key': 'locations', 'type': '[FleetVehicleLocation]'},
        'name': {'key': 'name', 'type': 'str'},
    }

    def __init__(self, id=None, locations=None, name=None):
        super(FleetVehiclesLocationsItem, self).__init__()
        self.id = id
        self.locations = locations
        self.name = name
