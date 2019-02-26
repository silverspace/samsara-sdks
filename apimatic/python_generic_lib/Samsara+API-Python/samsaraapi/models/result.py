# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class Result(object):

    """Implementation of the 'Result' model.

    TODO: type model description here.

    Attributes:
        series (list of long|int): List of datapoints, one for each requested
            (sensor, field) pair.
        time_ms (long|int): Timestamp in UNIX milliseconds.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "series":'series',
        "time_ms":'timeMs'
    }

    def __init__(self,
                 series=None,
                 time_ms=None):
        """Constructor for the Result class"""

        # Initialize members of the class
        self.series = series
        self.time_ms = time_ms


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
        series = dictionary.get('series')
        time_ms = dictionary.get('timeMs')

        # Return an object of this model
        return cls(series,
                   time_ms)

