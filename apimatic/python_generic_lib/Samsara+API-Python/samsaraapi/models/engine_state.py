# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class EngineState(object):

    """Implementation of the 'EngineState' model.

    The state of the vehicle over time. State can be Running, Off, or Idle.

    Attributes:
        time_ms (long|int): Timestamp in Unix epoch milliseconds.
        value (ValueEnum): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "time_ms":'timeMs',
        "value":'value'
    }

    def __init__(self,
                 time_ms=None,
                 value=None):
        """Constructor for the EngineState class"""

        # Initialize members of the class
        self.time_ms = time_ms
        self.value = value


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
        time_ms = dictionary.get('timeMs')
        value = dictionary.get('value')

        # Return an object of this model
        return cls(time_ms,
                   value)


