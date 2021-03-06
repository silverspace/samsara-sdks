# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DvirListResponse(Model):
    """DvirListResponse.

    :param dvirs:
    :type dvirs: list[~swagger.models.DvirBase]
    """

    _attribute_map = {
        'dvirs': {'key': 'dvirs', 'type': '[DvirBase]'},
    }

    def __init__(self, dvirs=None):
        super(DvirListResponse, self).__init__()
        self.dvirs = dvirs
