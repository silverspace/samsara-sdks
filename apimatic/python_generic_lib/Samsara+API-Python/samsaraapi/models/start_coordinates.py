# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class StartCoordinates(object):

    """Implementation of the 'StartCoordinates' model.

    Start (latitude, longitude) in decimal degrees.

    Attributes:
        latitude (float): TODO: type description here.
        longitude (float): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "latitude":'latitude',
        "longitude":'longitude'
    }

    def __init__(self,
                 latitude=None,
                 longitude=None):
        """Constructor for the StartCoordinates class"""

        # Initialize members of the class
        self.latitude = latitude
        self.longitude = longitude


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
        latitude = dictionary.get('latitude')
        longitude = dictionary.get('longitude')

        # Return an object of this model
        return cls(latitude,
                   longitude)


