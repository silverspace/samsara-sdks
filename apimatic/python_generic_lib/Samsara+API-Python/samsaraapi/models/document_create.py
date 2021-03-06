# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.document_field

class DocumentCreate(object):

    """Implementation of the 'DocumentCreate' model.

    TODO: type model description here.

    Attributes:
        document_type_uuid (string): Universally unique identifier for the
            document type this document is being created for.
        fields (list of DocumentField): List of fields should match the
            document type’s list of field types in the correct order. In other
            words, a field's valueType and value (i.e. only one of:
            stringValue, numberValue, or photoValue) at index _i_ should match
            with the document field type’s valueType at index _i_.
        dispatch_job_id (long|int): ID of the Samsara dispatch job for which
            the document is submitted
        notes (string): Notes submitted with this document.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "document_type_uuid":'documentTypeUuid',
        "fields":'fields',
        "dispatch_job_id":'dispatchJobId',
        "notes":'notes'
    }

    def __init__(self,
                 document_type_uuid=None,
                 fields=None,
                 dispatch_job_id=None,
                 notes=None):
        """Constructor for the DocumentCreate class"""

        # Initialize members of the class
        self.document_type_uuid = document_type_uuid
        self.fields = fields
        self.dispatch_job_id = dispatch_job_id
        self.notes = notes


    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object as
            obtained from the deserialization of the server's response. The keys
            MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary
        document_type_uuid = dictionary.get('documentTypeUuid')
        fields = None
        if dictionary.get('fields') != None:
            fields = list()
            for structure in dictionary.get('fields'):
                fields.append(samsaraapi.models.document_field.DocumentField.from_dictionary(structure))
        dispatch_job_id = dictionary.get('dispatchJobId')
        notes = dictionary.get('notes')

        # Return an object of this model
        return cls(document_type_uuid,
                   fields,
                   dispatch_job_id,
                   notes)


