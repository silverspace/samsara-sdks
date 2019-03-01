# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DocumentType(Model):
    """DocumentType.

    :param field_types: The field types determine the names of fields for this
     document type. They also determine the types of values a document
     submitted for this document type can have.
    :type field_types: list[list[~swagger.models.DocumentFieldType]]
    :param name: Name of the document type.
    :type name: str
    :param org_id: ID for the organization this document belongs to.
    :type org_id: long
    :param uuid: Universally unique identifier for the document type. Can be
     passed in as a documentTypeUuid when creating a document for this document
     type.
    :type uuid: str
    """

    _validation = {
        'name': {'required': True},
        'org_id': {'required': True},
        'uuid': {'required': True},
    }

    _attribute_map = {
        'field_types': {'key': 'fieldTypes', 'type': '[[DocumentFieldType]]'},
        'name': {'key': 'name', 'type': 'str'},
        'org_id': {'key': 'orgId', 'type': 'long'},
        'uuid': {'key': 'uuid', 'type': 'str'},
    }

    def __init__(self, name, org_id, uuid, field_types=None):
        super(DocumentType, self).__init__()
        self.field_types = field_types
        self.name = name
        self.org_id = org_id
        self.uuid = uuid