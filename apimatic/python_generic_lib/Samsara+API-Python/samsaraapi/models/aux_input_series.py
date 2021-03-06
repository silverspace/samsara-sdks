# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.aux_input

class AuxInputSeries(object):

    """Implementation of the 'AuxInputSeries' model.

    A list of aux input values over a timerange.

    Attributes:
        name (NameEnum): The name of the aux input.
        values (list of AuxInput): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name":'name',
        "values":'values'
    }

    def __init__(self,
                 name=None,
                 values=None):
        """Constructor for the AuxInputSeries class"""

        # Initialize members of the class
        self.name = name
        self.values = values


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
        name = dictionary.get('name')
        values = None
        if dictionary.get('values') != None:
            values = list()
            for structure in dictionary.get('values'):
                values.append(samsaraapi.models.aux_input.AuxInput.from_dictionary(structure))

        # Return an object of this model
        return cls(name,
                   values)


