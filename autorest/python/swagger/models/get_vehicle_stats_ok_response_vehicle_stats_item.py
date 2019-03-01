# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GetVehicleStatsOKResponseVehicleStatsItem(Model):
    """GetVehicleStatsOKResponseVehicleStatsItem.

    :param aux_input1:
    :type aux_input1: ~swagger.models.AuxInputSeries
    :param aux_input2:
    :type aux_input2: ~swagger.models.AuxInputSeries
    :param engine_state:
    :type engine_state: list[~swagger.models.EngineState]
    :param vehicle_id: ID of the vehicle.
    :type vehicle_id: long
    """

    _validation = {
        'vehicle_id': {'required': True},
    }

    _attribute_map = {
        'aux_input1': {'key': 'auxInput1', 'type': 'AuxInputSeries'},
        'aux_input2': {'key': 'auxInput2', 'type': 'AuxInputSeries'},
        'engine_state': {'key': 'engineState', 'type': '[EngineState]'},
        'vehicle_id': {'key': 'vehicleId', 'type': 'long'},
    }

    def __init__(self, vehicle_id, aux_input1=None, aux_input2=None, engine_state=None):
        super(GetVehicleStatsOKResponseVehicleStatsItem, self).__init__()
        self.aux_input1 = aux_input1
        self.aux_input2 = aux_input2
        self.engine_state = engine_state
        self.vehicle_id = vehicle_id
