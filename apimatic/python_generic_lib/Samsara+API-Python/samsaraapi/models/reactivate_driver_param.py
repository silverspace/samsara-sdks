# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class ReactivateDriverParam(object):

    """Implementation of the 'reactivateDriverParam' model.

    TODO: type model description here.

    Attributes:
        reactivate (bool): True indicates that this driver should be
            reactivated.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "reactivate":'reactivate'
    }

    def __init__(self,
                 reactivate=None):
        """Constructor for the ReactivateDriverParam class"""

        # Initialize members of the class
        self.reactivate = reactivate


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
        reactivate = dictionary.get('reactivate')

        # Return an object of this model
        return cls(reactivate)


