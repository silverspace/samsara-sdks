# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DataInputHistoryResponse(Model):
    """DataInputHistoryResponse.

    :param id: The ID of this data input
    :type id: long
    :param name: Name of this data input
    :type name: str
    :param points: Data points from this data input
    :type points: list[~swagger.models.DataInputHistoryResponsePointsItem]
    """

    _validation = {
        'name': {'required': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'long'},
        'name': {'key': 'name', 'type': 'str'},
        'points': {'key': 'points', 'type': '[DataInputHistoryResponsePointsItem]'},
    }

    def __init__(self, name, id=None, points=None):
        super(DataInputHistoryResponse, self).__init__()
        self.id = id
        self.name = name
        self.points = points
