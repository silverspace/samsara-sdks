# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DriversSummaryResponse(Model):
    """DriversSummaryResponse.

    :param summaries:
    :type summaries: list[~swagger.models.DriversSummaryResponseSummariesItem]
    """

    _attribute_map = {
        'summaries': {'key': 'Summaries', 'type': '[DriversSummaryResponseSummariesItem]'},
    }

    def __init__(self, summaries=None):
        super(DriversSummaryResponse, self).__init__()
        self.summaries = summaries
