# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class VehicleMaintenancePassenger(Model):
    """Passenger vehicle data. Null if no data is available.

    :param check_engine_light: Passenger vehicle check engine light.
    :type check_engine_light:
     ~swagger.models.VehicleMaintenancePassengerCheckEngineLight
    :param diagnostic_trouble_codes: Passenger vehicle DTCs.
    :type diagnostic_trouble_codes:
     list[~swagger.models.VehicleMaintenancePassengerDiagnosticTroubleCodesItem]
    """

    _attribute_map = {
        'check_engine_light': {'key': 'checkEngineLight', 'type': 'VehicleMaintenancePassengerCheckEngineLight'},
        'diagnostic_trouble_codes': {'key': 'diagnosticTroubleCodes', 'type': '[VehicleMaintenancePassengerDiagnosticTroubleCodesItem]'},
    }

    def __init__(self, check_engine_light=None, diagnostic_trouble_codes=None):
        super(VehicleMaintenancePassenger, self).__init__()
        self.check_engine_light = check_engine_light
        self.diagnostic_trouble_codes = diagnostic_trouble_codes
