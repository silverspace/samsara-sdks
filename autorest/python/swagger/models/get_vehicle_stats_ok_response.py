# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GetVehicleStatsOKResponse(Model):
    """GetVehicleStatsOKResponse.

    :param pagination:
    :type pagination: ~swagger.models.Pagination
    :param vehicle_stats:
    :type vehicle_stats:
     list[~swagger.models.GetVehicleStatsOKResponseVehicleStatsItem]
    """

    _validation = {
        'vehicle_stats': {'required': True},
    }

    _attribute_map = {
        'pagination': {'key': 'pagination', 'type': 'Pagination'},
        'vehicle_stats': {'key': 'vehicleStats', 'type': '[GetVehicleStatsOKResponseVehicleStatsItem]'},
    }

    def __init__(self, vehicle_stats, pagination=None):
        super(GetVehicleStatsOKResponse, self).__init__()
        self.pagination = pagination
        self.vehicle_stats = vehicle_stats
