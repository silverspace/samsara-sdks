# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class JobStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    UNASSIGNED = "JobState_Unassigned"
    SCHEDULED = "JobState_Scheduled"
    ENROUTE = "JobState_EnRoute"
    ARRIVED = "JobState_Arrived"
    COMPLETED = "JobState_Completed"
    SKIPPED = "JobState_Skipped"

    def __init__(self):
        """JobStatus - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'JobStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The jobStatus of this JobStatus.
        """
        return util.deserialize_model(dikt, cls)