# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GetAllAssetsOKResponse(Model):
    """GetAllAssetsOKResponse.

    :param assets:
    :type assets: list[~swagger.models.Asset]
    """

    _attribute_map = {
        'assets': {'key': 'assets', 'type': '[Asset]'},
    }

    def __init__(self, assets=None):
        super(GetAllAssetsOKResponse, self).__init__()
        self.assets = assets
