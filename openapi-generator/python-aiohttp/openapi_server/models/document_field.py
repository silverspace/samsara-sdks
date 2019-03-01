# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.document_field_create import DocumentFieldCreate
from openapi_server.models.document_field_create_photo_value import DocumentFieldCreatePhotoValue
from openapi_server import util


class DocumentField(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, number_value: float=None, photo_value: List[DocumentFieldCreatePhotoValue]=None, string_value: str=None, value_type: str=None, label: str=None, value: object=None):
        """DocumentField - a model defined in OpenAPI

        :param number_value: The number_value of this DocumentField.
        :param photo_value: The photo_value of this DocumentField.
        :param string_value: The string_value of this DocumentField.
        :param value_type: The value_type of this DocumentField.
        :param label: The label of this DocumentField.
        :param value: The value of this DocumentField.
        """
        self.openapi_types = {
            'number_value': float,
            'photo_value': List[DocumentFieldCreatePhotoValue],
            'string_value': str,
            'value_type': str,
            'label': str,
            'value': object
        }

        self.attribute_map = {
            'number_value': 'numberValue',
            'photo_value': 'photoValue',
            'string_value': 'stringValue',
            'value_type': 'valueType',
            'label': 'label',
            'value': 'value'
        }

        self._number_value = number_value
        self._photo_value = photo_value
        self._string_value = string_value
        self._value_type = value_type
        self._label = label
        self._value = value

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DocumentField':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DocumentField of this DocumentField.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def number_value(self):
        """Gets the number_value of this DocumentField.

        Value of this field if this document field has valueType: ValueType_Number.

        :return: The number_value of this DocumentField.
        :rtype: float
        """
        return self._number_value

    @number_value.setter
    def number_value(self, number_value):
        """Sets the number_value of this DocumentField.

        Value of this field if this document field has valueType: ValueType_Number.

        :param number_value: The number_value of this DocumentField.
        :type number_value: float
        """

        self._number_value = number_value

    @property
    def photo_value(self):
        """Gets the photo_value of this DocumentField.

        Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.

        :return: The photo_value of this DocumentField.
        :rtype: List[DocumentFieldCreatePhotoValue]
        """
        return self._photo_value

    @photo_value.setter
    def photo_value(self, photo_value):
        """Sets the photo_value of this DocumentField.

        Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.

        :param photo_value: The photo_value of this DocumentField.
        :type photo_value: List[DocumentFieldCreatePhotoValue]
        """

        self._photo_value = photo_value

    @property
    def string_value(self):
        """Gets the string_value of this DocumentField.

        Value of this field if this document field has valueType: ValueType_String.

        :return: The string_value of this DocumentField.
        :rtype: str
        """
        return self._string_value

    @string_value.setter
    def string_value(self, string_value):
        """Sets the string_value of this DocumentField.

        Value of this field if this document field has valueType: ValueType_String.

        :param string_value: The string_value of this DocumentField.
        :type string_value: str
        """

        self._string_value = string_value

    @property
    def value_type(self):
        """Gets the value_type of this DocumentField.

        Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.

        :return: The value_type of this DocumentField.
        :rtype: str
        """
        return self._value_type

    @value_type.setter
    def value_type(self, value_type):
        """Sets the value_type of this DocumentField.

        Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.

        :param value_type: The value_type of this DocumentField.
        :type value_type: str
        """
        if value_type is None:
            raise ValueError("Invalid value for `value_type`, must not be `None`")

        self._value_type = value_type

    @property
    def label(self):
        """Gets the label of this DocumentField.

        Descriptive name of this field.

        :return: The label of this DocumentField.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """Sets the label of this DocumentField.

        Descriptive name of this field.

        :param label: The label of this DocumentField.
        :type label: str
        """
        if label is None:
            raise ValueError("Invalid value for `label`, must not be `None`")

        self._label = label

    @property
    def value(self):
        """Gets the value of this DocumentField.

        DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.

        :return: The value of this DocumentField.
        :rtype: object
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this DocumentField.

        DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.

        :param value: The value of this DocumentField.
        :type value: object
        """

        self._value = value