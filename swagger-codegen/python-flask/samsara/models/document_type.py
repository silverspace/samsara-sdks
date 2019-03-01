# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.document_field_types import DocumentFieldTypes  # noqa: F401,E501
from samsara import util


class DocumentType(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, field_types: List[DocumentFieldTypes]=None, name: str=None, org_id: int=None, uuid: str=None):  # noqa: E501
        """DocumentType - a model defined in Swagger

        :param field_types: The field_types of this DocumentType.  # noqa: E501
        :type field_types: List[DocumentFieldTypes]
        :param name: The name of this DocumentType.  # noqa: E501
        :type name: str
        :param org_id: The org_id of this DocumentType.  # noqa: E501
        :type org_id: int
        :param uuid: The uuid of this DocumentType.  # noqa: E501
        :type uuid: str
        """
        self.swagger_types = {
            'field_types': List[DocumentFieldTypes],
            'name': str,
            'org_id': int,
            'uuid': str
        }

        self.attribute_map = {
            'field_types': 'fieldTypes',
            'name': 'name',
            'org_id': 'orgId',
            'uuid': 'uuid'
        }

        self._field_types = field_types
        self._name = name
        self._org_id = org_id
        self._uuid = uuid

    @classmethod
    def from_dict(cls, dikt) -> 'DocumentType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DocumentType of this DocumentType.  # noqa: E501
        :rtype: DocumentType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def field_types(self) -> List[DocumentFieldTypes]:
        """Gets the field_types of this DocumentType.

        The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.  # noqa: E501

        :return: The field_types of this DocumentType.
        :rtype: List[DocumentFieldTypes]
        """
        return self._field_types

    @field_types.setter
    def field_types(self, field_types: List[DocumentFieldTypes]):
        """Sets the field_types of this DocumentType.

        The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.  # noqa: E501

        :param field_types: The field_types of this DocumentType.
        :type field_types: List[DocumentFieldTypes]
        """

        self._field_types = field_types

    @property
    def name(self) -> str:
        """Gets the name of this DocumentType.

        Name of the document type.  # noqa: E501

        :return: The name of this DocumentType.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this DocumentType.

        Name of the document type.  # noqa: E501

        :param name: The name of this DocumentType.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def org_id(self) -> int:
        """Gets the org_id of this DocumentType.

        ID for the organization this document belongs to.  # noqa: E501

        :return: The org_id of this DocumentType.
        :rtype: int
        """
        return self._org_id

    @org_id.setter
    def org_id(self, org_id: int):
        """Sets the org_id of this DocumentType.

        ID for the organization this document belongs to.  # noqa: E501

        :param org_id: The org_id of this DocumentType.
        :type org_id: int
        """
        if org_id is None:
            raise ValueError("Invalid value for `org_id`, must not be `None`")  # noqa: E501

        self._org_id = org_id

    @property
    def uuid(self) -> str:
        """Gets the uuid of this DocumentType.

        Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.  # noqa: E501

        :return: The uuid of this DocumentType.
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid: str):
        """Sets the uuid of this DocumentType.

        Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.  # noqa: E501

        :param uuid: The uuid of this DocumentType.
        :type uuid: str
        """
        if uuid is None:
            raise ValueError("Invalid value for `uuid`, must not be `None`")  # noqa: E501

        self._uuid = uuid