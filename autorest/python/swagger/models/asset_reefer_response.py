# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AssetReeferResponse(Model):
    """Reefer-specific asset details.

    :param asset_type: Asset type
    :type asset_type: str
    :param id: Asset ID
    :type id: int
    :param name: Asset name
    :type name: str
    :param reefer_stats:
    :type reefer_stats: ~swagger.models.AssetReeferResponseReeferStats
    """

    _attribute_map = {
        'asset_type': {'key': 'assetType', 'type': 'str'},
        'id': {'key': 'id', 'type': 'int'},
        'name': {'key': 'name', 'type': 'str'},
        'reefer_stats': {'key': 'reeferStats', 'type': 'AssetReeferResponseReeferStats'},
    }

    def __init__(self, asset_type=None, id=None, name=None, reefer_stats=None):
        super(AssetReeferResponse, self).__init__()
        self.asset_type = asset_type
        self.id = id
        self.name = name
        self.reefer_stats = reefer_stats
