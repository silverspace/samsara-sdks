# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class VehicleMaintenancePassengerDiagnosticTroubleCodesItem(Model):
    """VehicleMaintenancePassengerDiagnosticTroubleCodesItem.

    :param dtc_description:
    :type dtc_description: str
    :param dtc_id:
    :type dtc_id: int
    :param dtc_short_code:
    :type dtc_short_code: str
    """

    _attribute_map = {
        'dtc_description': {'key': 'dtcDescription', 'type': 'str'},
        'dtc_id': {'key': 'dtcId', 'type': 'int'},
        'dtc_short_code': {'key': 'dtcShortCode', 'type': 'str'},
    }

    def __init__(self, dtc_description=None, dtc_id=None, dtc_short_code=None):
        super(VehicleMaintenancePassengerDiagnosticTroubleCodesItem, self).__init__()
        self.dtc_description = dtc_description
        self.dtc_id = dtc_id
        self.dtc_short_code = dtc_short_code
