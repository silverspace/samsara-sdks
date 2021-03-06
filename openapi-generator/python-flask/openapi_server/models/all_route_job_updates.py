# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.job_update_object import JobUpdateObject
from openapi_server import util

from openapi_server.models.job_update_object import JobUpdateObject  # noqa: E501

class AllRouteJobUpdates(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, job_updates=None, sequence_id=None):  # noqa: E501
        """AllRouteJobUpdates - a model defined in OpenAPI

        :param job_updates: The job_updates of this AllRouteJobUpdates.  # noqa: E501
        :type job_updates: List[JobUpdateObject]
        :param sequence_id: The sequence_id of this AllRouteJobUpdates.  # noqa: E501
        :type sequence_id: str
        """
        self.openapi_types = {
            'job_updates': List[JobUpdateObject],
            'sequence_id': str
        }

        self.attribute_map = {
            'job_updates': 'job_updates',
            'sequence_id': 'sequence_id'
        }

        self._job_updates = job_updates
        self._sequence_id = sequence_id

    @classmethod
    def from_dict(cls, dikt) -> 'AllRouteJobUpdates':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The allRouteJobUpdates of this AllRouteJobUpdates.  # noqa: E501
        :rtype: AllRouteJobUpdates
        """
        return util.deserialize_model(dikt, cls)

    @property
    def job_updates(self):
        """Gets the job_updates of this AllRouteJobUpdates.


        :return: The job_updates of this AllRouteJobUpdates.
        :rtype: List[JobUpdateObject]
        """
        return self._job_updates

    @job_updates.setter
    def job_updates(self, job_updates):
        """Sets the job_updates of this AllRouteJobUpdates.


        :param job_updates: The job_updates of this AllRouteJobUpdates.
        :type job_updates: List[JobUpdateObject]
        """

        self._job_updates = job_updates

    @property
    def sequence_id(self):
        """Gets the sequence_id of this AllRouteJobUpdates.

        Sequence ID of the last update returned in the response  # noqa: E501

        :return: The sequence_id of this AllRouteJobUpdates.
        :rtype: str
        """
        return self._sequence_id

    @sequence_id.setter
    def sequence_id(self, sequence_id):
        """Sets the sequence_id of this AllRouteJobUpdates.

        Sequence ID of the last update returned in the response  # noqa: E501

        :param sequence_id: The sequence_id of this AllRouteJobUpdates.
        :type sequence_id: str
        """

        self._sequence_id = sequence_id
