# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class HosLogsSummaryResponse(Model):
    """HosLogsSummaryResponse.

    :param drivers:
    :type drivers: list[~swagger.models.HosLogsSummaryResponseDriversItem]
    """

    _attribute_map = {
        'drivers': {'key': 'drivers', 'type': '[HosLogsSummaryResponseDriversItem]'},
    }

    def __init__(self, drivers=None):
        super(HosLogsSummaryResponse, self).__init__()
        self.drivers = drivers
