# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.document_base import DocumentBase  # noqa: F401,E501
from samsara.models.document_field import DocumentField  # noqa: F401,E501
from samsara import util


class DocumentCreate(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, dispatch_job_id: int=None, notes: str=None, document_type_uuid: str=None, fields: List[DocumentField]=None):  # noqa: E501
        """DocumentCreate - a model defined in Swagger

        :param dispatch_job_id: The dispatch_job_id of this DocumentCreate.  # noqa: E501
        :type dispatch_job_id: int
        :param notes: The notes of this DocumentCreate.  # noqa: E501
        :type notes: str
        :param document_type_uuid: The document_type_uuid of this DocumentCreate.  # noqa: E501
        :type document_type_uuid: str
        :param fields: The fields of this DocumentCreate.  # noqa: E501
        :type fields: List[DocumentField]
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'DocumentCreate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DocumentCreate of this DocumentCreate.  # noqa: E501
        :rtype: DocumentCreate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dispatch_job_id(self) -> int:
        """Gets the dispatch_job_id of this DocumentCreate.

        ID of the Samsara dispatch job for which the document is submitted  # noqa: E501

        :return: The dispatch_job_id of this DocumentCreate.
        :rtype: int
        """
        return self._dispatch_job_id

    @dispatch_job_id.setter
    def dispatch_job_id(self, dispatch_job_id: int):
        """Sets the dispatch_job_id of this DocumentCreate.

        ID of the Samsara dispatch job for which the document is submitted  # noqa: E501

        :param dispatch_job_id: The dispatch_job_id of this DocumentCreate.
        :type dispatch_job_id: int
        """

        self._dispatch_job_id = dispatch_job_id

    @property
    def notes(self) -> str:
        """Gets the notes of this DocumentCreate.

        Notes submitted with this document.  # noqa: E501

        :return: The notes of this DocumentCreate.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes: str):
        """Sets the notes of this DocumentCreate.

        Notes submitted with this document.  # noqa: E501

        :param notes: The notes of this DocumentCreate.
        :type notes: str
        """

        self._notes = notes

    @property
    def document_type_uuid(self) -> str:
        """Gets the document_type_uuid of this DocumentCreate.

        Universally unique identifier for the document type this document is being created for.  # noqa: E501

        :return: The document_type_uuid of this DocumentCreate.
        :rtype: str
        """
        return self._document_type_uuid

    @document_type_uuid.setter
    def document_type_uuid(self, document_type_uuid: str):
        """Sets the document_type_uuid of this DocumentCreate.

        Universally unique identifier for the document type this document is being created for.  # noqa: E501

        :param document_type_uuid: The document_type_uuid of this DocumentCreate.
        :type document_type_uuid: str
        """
        if document_type_uuid is None:
            raise ValueError("Invalid value for `document_type_uuid`, must not be `None`")  # noqa: E501

        self._document_type_uuid = document_type_uuid

    @property
    def fields(self) -> List[DocumentField]:
        """Gets the fields of this DocumentCreate.

        List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.  # noqa: E501

        :return: The fields of this DocumentCreate.
        :rtype: List[DocumentField]
        """
        return self._fields

    @fields.setter
    def fields(self, fields: List[DocumentField]):
        """Sets the fields of this DocumentCreate.

        List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.  # noqa: E501

        :param fields: The fields of this DocumentCreate.
        :type fields: List[DocumentField]
        """
        if fields is None:
            raise ValueError("Invalid value for `fields`, must not be `None`")  # noqa: E501

        self._fields = fields