# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class VehicleMaintenance(Model):
    """Contains any J1939/Passenger engine light warnings and engine faults.

    :param id: ID of the vehicle.
    :type id: long
    :param j1939: J1939 based data. Null if no data is available.
    :type j1939: ~swagger.models.VehicleMaintenanceJ1939
    :param passenger: Passenger vehicle data. Null if no data is available.
    :type passenger: ~swagger.models.VehicleMaintenancePassenger
    """

    _validation = {
        'id': {'required': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
        'j1939': {'key': 'j1939', 'type': 'VehicleMaintenanceJ1939'},
        'passenger': {'key': 'passenger', 'type': 'VehicleMaintenancePassenger'},
    }

    def __init__(self, id, j1939=None, passenger=None):
        super(VehicleMaintenance, self).__init__()
        self.id = id
        self.j1939 = j1939
        self.passenger = passenger
