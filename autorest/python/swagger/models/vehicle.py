# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class Vehicle(Model):
    """A vehicle object.

    :param engine_hours: Total engine hours for the vehicle.
    :type engine_hours: long
    :param fuel_level_percent: The fuel level of the vehicle as a percentage.
     (0.0 to 1.0)
    :type fuel_level_percent: float
    :param id: ID of the vehicle.
    :type id: long
    :param name: Name of the vehicle.
    :type name: str
    :param note:
    :type note: str
    :param odometer_meters: The number of meters reported by the odometer.
    :type odometer_meters: long
    :param vin: Vehicle Identification Number.
    :type vin: str
    """

    _validation = {
        'id': {'required': True},
    }

    _attribute_map = {
        'engine_hours': {'key': 'engineHours', 'type': 'long'},
        'fuel_level_percent': {'key': 'fuelLevelPercent', 'type': 'float'},
        'id': {'key': 'id', 'type': 'long'},
        'name': {'key': 'name', 'type': 'str'},
        'note': {'key': 'note', 'type': 'str'},
        'odometer_meters': {'key': 'odometerMeters', 'type': 'long'},
        'vin': {'key': 'vin', 'type': 'str'},
    }

    def __init__(self, id, engine_hours=None, fuel_level_percent=None, name=None, note=None, odometer_meters=None, vin=None):
        super(Vehicle, self).__init__()
        self.engine_hours = engine_hours
        self.fuel_level_percent = fuel_level_percent
        self.id = id
        self.name = name
        self.note = note
        self.odometer_meters = odometer_meters
        self.vin = vin
