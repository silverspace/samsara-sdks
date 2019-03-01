# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DvirBaseVehicleDefectsItem(Model):
    """DvirBaseVehicleDefectsItem.

    :param comment: The comment describing the type of DVIR defect
    :type comment: str
    :param defect_type: The type of DVIR defect
    :type defect_type: str
    """

    _attribute_map = {
        'comment': {'key': 'comment', 'type': 'str'},
        'defect_type': {'key': 'defectType', 'type': 'str'},
    }

    def __init__(self, comment=None, defect_type=None):
        super(DvirBaseVehicleDefectsItem, self).__init__()
        self.comment = comment
        self.defect_type = defect_type