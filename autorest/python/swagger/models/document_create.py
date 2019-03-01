# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .document_base import DocumentBase


class DocumentCreate(DocumentBase):
    """DocumentCreate.

    :param dispatch_job_id: ID of the Samsara dispatch job for which the
     document is submitted
    :type dispatch_job_id: long
    :param notes: Notes submitted with this document.
    :type notes: str
    :param document_type_uuid: Universally unique identifier for the document
     type this document is being created for.
    :type document_type_uuid: str
    :param fields: List of fields should match the document type’s list of
     field types in the correct order. In other words, a field's valueType and
     value (i.e. only one of: stringValue, numberValue, or photoValue) at index
     _i_ should match with the document field type’s valueType at index _i_.
    :type fields: list[~swagger.models.DocumentField]
    """

    _validation = {
        'document_type_uuid': {'required': True},
        'fields': {'required': True},
    }

    _attribute_map = {
        'dispatch_job_id': {'key': 'dispatchJobId', 'type': 'long'},
        'notes': {'key': 'notes', 'type': 'str'},
        'document_type_uuid': {'key': 'documentTypeUuid', 'type': 'str'},
        'fields': {'key': 'fields', 'type': '[DocumentField]'},
    }

    def __init__(self, document_type_uuid, fields, dispatch_job_id=None, notes=None):
        super(DocumentCreate, self).__init__(dispatch_job_id=dispatch_job_id, notes=notes)
        self.document_type_uuid = document_type_uuid
        self.fields = fields
