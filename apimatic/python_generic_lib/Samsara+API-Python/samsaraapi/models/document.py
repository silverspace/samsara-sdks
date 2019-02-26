# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.document_field

class Document(object):

    """Implementation of the 'Document' model.

    TODO: type model description here.

    Attributes:
        document_type (string): Descriptive name of this type of document.
        driver_created_at_ms (long|int): The time in Unix epoch milliseconds
            that the document is created.
        driver_id (long|int): ID of the driver for whom the document is
            submitted
        fields (list of DocumentField): The fields associated with this
            document.
        vehicle_id (long|int): VehicleID of the driver at document creation.
        dispatch_job_id (long|int): ID of the Samsara dispatch job for which
            the document is submitted
        notes (string): Notes submitted with this document.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "document_type":'documentType',
        "driver_created_at_ms":'driverCreatedAtMs',
        "driver_id":'driverId',
        "fields":'fields',
        "vehicle_id":'vehicleId',
        "dispatch_job_id":'dispatchJobId',
        "notes":'notes'
    }

    def __init__(self,
                 document_type=None,
                 driver_created_at_ms=None,
                 driver_id=None,
                 fields=None,
                 vehicle_id=None,
                 dispatch_job_id=None,
                 notes=None):
        """Constructor for the Document class"""

        # Initialize members of the class
        self.document_type = document_type
        self.driver_created_at_ms = driver_created_at_ms
        self.driver_id = driver_id
        self.fields = fields
        self.vehicle_id = vehicle_id
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
        document_type = dictionary.get('documentType')
        driver_created_at_ms = dictionary.get('driverCreatedAtMs')
        driver_id = dictionary.get('driverId')
        fields = None
        if dictionary.get('fields') != None:
            fields = list()
            for structure in dictionary.get('fields'):
                fields.append(samsaraapi.models.document_field.DocumentField.from_dictionary(structure))
        vehicle_id = dictionary.get('vehicleId')
        dispatch_job_id = dictionary.get('dispatchJobId')
        notes = dictionary.get('notes')

        # Return an object of this model
        return cls(document_type,
                   driver_created_at_ms,
                   driver_id,
                   fields,
                   vehicle_id,
                   dispatch_job_id,
                   notes)

