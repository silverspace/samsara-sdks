# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.document_base import DocumentBase
from openapi_server.models.document_field import DocumentField
from openapi_server import util


class DocumentCreate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dispatch_job_id: int=None, notes: str=None, document_type_uuid: str=None, fields: List[DocumentField]=None):
        """DocumentCreate - a model defined in OpenAPI

        :param dispatch_job_id: The dispatch_job_id of this DocumentCreate.
        :param notes: The notes of this DocumentCreate.
        :param document_type_uuid: The document_type_uuid of this DocumentCreate.
        :param fields: The fields of this DocumentCreate.
        """
        self.openapi_types = {
            'dispatch_job_id': int,
            'notes': str,
            'document_type_uuid': str,
            'fields': List[DocumentField]
        }

        self.attribute_map = {
            'dispatch_job_id': 'dispatchJobId',
            'notes': 'notes',
            'document_type_uuid': 'documentTypeUuid',
            'fields': 'fields'
        }

        self._dispatch_job_id = dispatch_job_id
        self._notes = notes
        self._document_type_uuid = document_type_uuid
        self._fields = fields

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DocumentCreate':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DocumentCreate of this DocumentCreate.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dispatch_job_id(self):
        """Gets the dispatch_job_id of this DocumentCreate.

        ID of the Samsara dispatch job for which the document is submitted

        :return: The dispatch_job_id of this DocumentCreate.
        :rtype: int
        """
        return self._dispatch_job_id

    @dispatch_job_id.setter
    def dispatch_job_id(self, dispatch_job_id):
        """Sets the dispatch_job_id of this DocumentCreate.

        ID of the Samsara dispatch job for which the document is submitted

        :param dispatch_job_id: The dispatch_job_id of this DocumentCreate.
        :type dispatch_job_id: int
        """

        self._dispatch_job_id = dispatch_job_id

    @property
    def notes(self):
        """Gets the notes of this DocumentCreate.

        Notes submitted with this document.

        :return: The notes of this DocumentCreate.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this DocumentCreate.

        Notes submitted with this document.

        :param notes: The notes of this DocumentCreate.
        :type notes: str
        """

        self._notes = notes

    @property
    def document_type_uuid(self):
        """Gets the document_type_uuid of this DocumentCreate.

        Universally unique identifier for the document type this document is being created for.

        :return: The document_type_uuid of this DocumentCreate.
        :rtype: str
        """
        return self._document_type_uuid

    @document_type_uuid.setter
    def document_type_uuid(self, document_type_uuid):
        """Sets the document_type_uuid of this DocumentCreate.

        Universally unique identifier for the document type this document is being created for.

        :param document_type_uuid: The document_type_uuid of this DocumentCreate.
        :type document_type_uuid: str
        """
        if document_type_uuid is None:
            raise ValueError("Invalid value for `document_type_uuid`, must not be `None`")

        self._document_type_uuid = document_type_uuid

    @property
    def fields(self):
        """Gets the fields of this DocumentCreate.

        List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

        :return: The fields of this DocumentCreate.
        :rtype: List[DocumentField]
        """
        return self._fields

    @fields.setter
    def fields(self, fields):
        """Sets the fields of this DocumentCreate.

        List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

        :param fields: The fields of this DocumentCreate.
        :type fields: List[DocumentField]
        """
        if fields is None:
            raise ValueError("Invalid value for `fields`, must not be `None`")

        self._fields = fields
