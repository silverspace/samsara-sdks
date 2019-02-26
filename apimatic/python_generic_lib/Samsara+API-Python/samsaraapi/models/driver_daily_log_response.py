# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.day

class DriverDailyLogResponse(object):

    """Implementation of the 'DriverDailyLogResponse' model.

    TODO: type model description here.

    Attributes:
        days (list of Day): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "days":'days'
    }

    def __init__(self,
                 days=None):
        """Constructor for the DriverDailyLogResponse class"""

        # Initialize members of the class
        self.days = days


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
        days = None
        if dictionary.get('days') != None:
            days = list()
            for structure in dictionary.get('days'):
                days.append(samsaraapi.models.day.Day.from_dictionary(structure))

        # Return an object of this model
        return cls(days)

