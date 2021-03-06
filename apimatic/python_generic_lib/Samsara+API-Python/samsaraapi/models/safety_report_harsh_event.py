# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class SafetyReportHarshEvent(object):

    """Implementation of the 'SafetyReportHarshEvent' model.

    List of harsh events

    Attributes:
        harsh_event_type (string): Type of the harsh event
        timestamp_ms (long|int): Timestamp that the harsh event occurred in
            Unix milliseconds since epoch
        vehicle_id (long|int): Vehicle associated with the harsh event

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "harsh_event_type":'harshEventType',
        "timestamp_ms":'timestampMs',
        "vehicle_id":'vehicleId'
    }

    def __init__(self,
                 harsh_event_type=None,
                 timestamp_ms=None,
                 vehicle_id=None):
        """Constructor for the SafetyReportHarshEvent class"""

        # Initialize members of the class
        self.harsh_event_type = harsh_event_type
        self.timestamp_ms = timestamp_ms
        self.vehicle_id = vehicle_id


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
        harsh_event_type = dictionary.get('harshEventType')
        timestamp_ms = dictionary.get('timestampMs')
        vehicle_id = dictionary.get('vehicleId')

        # Return an object of this model
        return cls(harsh_event_type,
                   timestamp_ms,
                   vehicle_id)


