# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.document_field_type_number_value_type_metadata import DocumentFieldTypeNumberValueTypeMetadata  # noqa: F401,E501
from samsara import util


class DocumentFieldType(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, label: str=None, number_value_type_metadata: DocumentFieldTypeNumberValueTypeMetadata=None, value_type: str=None):  # noqa: E501
        """DocumentFieldType - a model defined in Swagger

        :param label: The label of this DocumentFieldType.  # noqa: E501
        :type label: str
        :param number_value_type_metadata: The number_value_type_metadata of this DocumentFieldType.  # noqa: E501
        :type number_value_type_metadata: DocumentFieldTypeNumberValueTypeMetadata
        :param value_type: The value_type of this DocumentFieldType.  # noqa: E501
        :type value_type: str
        """
        self.swagger_types = {
            'label': str,
            'number_value_type_metadata': DocumentFieldTypeNumberValueTypeMetadata,
            'value_type': str
        }

        self.attribute_map = {
            'label': 'label',
            'number_value_type_metadata': 'numberValueTypeMetadata',
            'value_type': 'valueType'
        }

        self._label = label
        self._number_value_type_metadata = number_value_type_metadata
        self._value_type = value_type

    @classmethod
    def from_dict(cls, dikt) -> 'DocumentFieldType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DocumentFieldType of this DocumentFieldType.  # noqa: E501
        :rtype: DocumentFieldType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def label(self) -> str:
        """Gets the label of this DocumentFieldType.

        Descriptive name of this field type.  # noqa: E501

        :return: The label of this DocumentFieldType.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label: str):
        """Sets the label of this DocumentFieldType.

        Descriptive name of this field type.  # noqa: E501

        :param label: The label of this DocumentFieldType.
        :type label: str
        """
        if label is None:
            raise ValueError("Invalid value for `label`, must not be `None`")  # noqa: E501

        self._label = label

    @property
    def number_value_type_metadata(self) -> DocumentFieldTypeNumberValueTypeMetadata:
        """Gets the number_value_type_metadata of this DocumentFieldType.


        :return: The number_value_type_metadata of this DocumentFieldType.
        :rtype: DocumentFieldTypeNumberValueTypeMetadata
        """
        return self._number_value_type_metadata

    @number_value_type_metadata.setter
    def number_value_type_metadata(self, number_value_type_metadata: DocumentFieldTypeNumberValueTypeMetadata):
        """Sets the number_value_type_metadata of this DocumentFieldType.


        :param number_value_type_metadata: The number_value_type_metadata of this DocumentFieldType.
        :type number_value_type_metadata: DocumentFieldTypeNumberValueTypeMetadata
        """

        self._number_value_type_metadata = number_value_type_metadata

    @property
    def value_type(self) -> str:
        """Gets the value_type of this DocumentFieldType.

        The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.  # noqa: E501

        :return: The value_type of this DocumentFieldType.
        :rtype: str
        """
        return self._value_type

    @value_type.setter
    def value_type(self, value_type: str):
        """Sets the value_type of this DocumentFieldType.

        The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.  # noqa: E501

        :param value_type: The value_type of this DocumentFieldType.
        :type value_type: str
        """
        if value_type is None:
            raise ValueError("Invalid value for `value_type`, must not be `None`")  # noqa: E501

        self._value_type = value_type
