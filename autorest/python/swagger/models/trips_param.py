# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class TripsParam(Model):
    """TripsParam.

    :param end_ms: End of the time range, specified in milliseconds UNIX time.
    :type end_ms: int
    :param group_id: Group ID to query.
    :type group_id: long
    :param start_ms: Beginning of the time range, specified in milliseconds
     UNIX time. Limited to a 90 day window with respect to startMs and endMs
    :type start_ms: int
    :param vehicle_id: Vehicle ID to query.
    :type vehicle_id: long
    """

    _validation = {
        'end_ms': {'required': True},
        'group_id': {'required': True},
        'start_ms': {'required': True},
        'vehicle_id': {'required': True},
    }

    _attribute_map = {
        'end_ms': {'key': 'endMs', 'type': 'int'},
        'group_id': {'key': 'groupId', 'type': 'long'},
        'start_ms': {'key': 'startMs', 'type': 'int'},
        'vehicle_id': {'key': 'vehicleId', 'type': 'long'},
    }

    def __init__(self, end_ms, group_id, start_ms, vehicle_id):
        super(TripsParam, self).__init__()
        self.end_ms = end_ms
        self.group_id = group_id
        self.start_ms = start_ms
        self.vehicle_id = vehicle_id
