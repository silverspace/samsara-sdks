# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class GetAllDataInputsOKResponse(Model):
    """GetAllDataInputsOKResponse.

    :param data_inputs:
    :type data_inputs: list[~swagger.models.DataInputHistoryResponse]
    """

    _attribute_map = {
        'data_inputs': {'key': 'dataInputs', 'type': '[DataInputHistoryResponse]'},
    }

    def __init__(self, data_inputs=None):
        super(GetAllDataInputsOKResponse, self).__init__()
        self.data_inputs = data_inputs