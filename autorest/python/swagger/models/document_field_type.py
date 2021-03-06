# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DocumentFieldType(Model):
    """DocumentFieldType.

    :param label: Descriptive name of this field type.
    :type label: str
    :param number_value_type_metadata: Additional metadata information for a
     number field type. Only defined when a field type has valueType:
     ValueType_Number.
    :type number_value_type_metadata:
     ~swagger.models.DocumentFieldTypeNumberValueTypeMetadata
    :param value_type: The kind of value that can be submitted for this
     fieldType. It should be either ValueType_Number, ValueType_String, or
     ValueType_Photo.
    :type value_type: str
    """

    _validation = {
        'label': {'required': True},
        'value_type': {'required': True},
    }

    _attribute_map = {
        'label': {'key': 'label', 'type': 'str'},
        'number_value_type_metadata': {'key': 'numberValueTypeMetadata', 'type': 'DocumentFieldTypeNumberValueTypeMetadata'},
        'value_type': {'key': 'valueType', 'type': 'str'},
    }

    def __init__(self, label, value_type, number_value_type_metadata=None):
        super(DocumentFieldType, self).__init__()
        self.label = label
        self.number_value_type_metadata = number_value_type_metadata
        self.value_type = value_type
