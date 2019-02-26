# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class Vibration(object):

    """Implementation of the 'Vibration' model.

    TODO: type model description here.

    Attributes:
        x (float): TODO: type description here.
        y (float): TODO: type description here.
        z (float): TODO: type description here.
        time (long|int): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "x":'X',
        "y":'Y',
        "z":'Z',
        "time":'time'
    }

    def __init__(self,
                 x=None,
                 y=None,
                 z=None,
                 time=None):
        """Constructor for the Vibration class"""

        # Initialize members of the class
        self.x = x
        self.y = y
        self.z = z
        self.time = time


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
        x = dictionary.get('X')
        y = dictionary.get('Y')
        z = dictionary.get('Z')
        time = dictionary.get('time')

        # Return an object of this model
        return cls(x,
                   y,
                   z,
                   time)

