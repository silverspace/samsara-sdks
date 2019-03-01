# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AllRouteJobUpdates(Model):
    """AllRouteJobUpdates.

    :param job_updates:
    :type job_updates: list[~swagger.models.JobUpdateObject]
    :param sequence_id: Sequence ID of the last update returned in the
     response
    :type sequence_id: str
    """

    _attribute_map = {
        'job_updates': {'key': 'job_updates', 'type': '[JobUpdateObject]'},
        'sequence_id': {'key': 'sequence_id', 'type': 'str'},
    }

    def __init__(self, job_updates=None, sequence_id=None):
        super(AllRouteJobUpdates, self).__init__()
        self.job_updates = job_updates
        self.sequence_id = sequence_id
