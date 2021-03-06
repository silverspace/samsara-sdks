# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DriversSummaryParam(Model):
    """DriversSummaryParam.

    :param end_ms: End time (ms) of queried time period.
    :type end_ms: long
    :param org_id: Org ID to query.
    :type org_id: long
    :param start_ms: Start time (ms) of queried time period.
    :type start_ms: long
    """

    _validation = {
        'end_ms': {'required': True},
        'org_id': {'required': True},
        'start_ms': {'required': True},
    }

    _attribute_map = {
        'end_ms': {'key': 'endMs', 'type': 'long'},
        'org_id': {'key': 'orgId', 'type': 'long'},
        'start_ms': {'key': 'startMs', 'type': 'long'},
    }

    def __init__(self, end_ms, org_id, start_ms):
        super(DriversSummaryParam, self).__init__()
        self.end_ms = end_ms
        self.org_id = org_id
        self.start_ms = start_ms
