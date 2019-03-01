# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DocumentBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dispatch_job_id: int=None, notes: str=None):
        """DocumentBase - a model defined in OpenAPI

        :param dispatch_job_id: The dispatch_job_id of this DocumentBase.
        :param notes: The notes of this DocumentBase.
        """
        self.openapi_types = {
            'dispatch_job_id': int,
            'notes': str
        }

        self.attribute_map = {
            'dispatch_job_id': 'dispatchJobId',
            'notes': 'notes'
        }

        self._dispatch_job_id = dispatch_job_id
        self._notes = notes

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DocumentBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DocumentBase of this DocumentBase.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dispatch_job_id(self):
        """Gets the dispatch_job_id of this DocumentBase.

        ID of the Samsara dispatch job for which the document is submitted

        :return: The dispatch_job_id of this DocumentBase.
        :rtype: int
        """
        return self._dispatch_job_id

    @dispatch_job_id.setter
    def dispatch_job_id(self, dispatch_job_id):
        """Sets the dispatch_job_id of this DocumentBase.

        ID of the Samsara dispatch job for which the document is submitted

        :param dispatch_job_id: The dispatch_job_id of this DocumentBase.
        :type dispatch_job_id: int
        """

        self._dispatch_job_id = dispatch_job_id

    @property
    def notes(self):
        """Gets the notes of this DocumentBase.

        Notes submitted with this document.

        :return: The notes of this DocumentBase.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this DocumentBase.

        Notes submitted with this document.

        :param notes: The notes of this DocumentBase.
        :type notes: str
        """

        self._notes = notes