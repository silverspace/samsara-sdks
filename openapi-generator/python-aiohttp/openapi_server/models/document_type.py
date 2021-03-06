# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.document_field_type import DocumentFieldType
from openapi_server import util


class DocumentType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, field_types: List[List]=None, name: str=None, org_id: int=None, uuid: str=None):
        """DocumentType - a model defined in OpenAPI

        :param field_types: The field_types of this DocumentType.
        :param name: The name of this DocumentType.
        :param org_id: The org_id of this DocumentType.
        :param uuid: The uuid of this DocumentType.
        """
        self.openapi_types = {
            'field_types': List[List],
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
    def from_dict(cls, dikt: dict) -> 'DocumentType':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DocumentType of this DocumentType.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def field_types(self):
        """Gets the field_types of this DocumentType.

        The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.

        :return: The field_types of this DocumentType.
        :rtype: List[List]
        """
        return self._field_types

    @field_types.setter
    def field_types(self, field_types):
        """Sets the field_types of this DocumentType.

        The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.

        :param field_types: The field_types of this DocumentType.
        :type field_types: List[List]
        """

        self._field_types = field_types

    @property
    def name(self):
        """Gets the name of this DocumentType.

        Name of the document type.

        :return: The name of this DocumentType.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DocumentType.

        Name of the document type.

        :param name: The name of this DocumentType.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def org_id(self):
        """Gets the org_id of this DocumentType.

        ID for the organization this document belongs to.

        :return: The org_id of this DocumentType.
        :rtype: int
        """
        return self._org_id

    @org_id.setter
    def org_id(self, org_id):
        """Sets the org_id of this DocumentType.

        ID for the organization this document belongs to.

        :param org_id: The org_id of this DocumentType.
        :type org_id: int
        """
        if org_id is None:
            raise ValueError("Invalid value for `org_id`, must not be `None`")

        self._org_id = org_id

    @property
    def uuid(self):
        """Gets the uuid of this DocumentType.

        Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.

        :return: The uuid of this DocumentType.
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid):
        """Sets the uuid of this DocumentType.

        Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.

        :param uuid: The uuid of this DocumentType.
        :type uuid: str
        """
        if uuid is None:
            raise ValueError("Invalid value for `uuid`, must not be `None`")

        self._uuid = uuid
