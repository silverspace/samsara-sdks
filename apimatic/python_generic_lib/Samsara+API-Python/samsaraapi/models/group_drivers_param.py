# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class GroupDriversParam(object):

    """Implementation of the 'groupDriversParam' model.

    TODO: type model description here.

    Attributes:
        group_id (long|int): Group ID to query.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "group_id":'groupId'
    }

    def __init__(self,
                 group_id=None):
        """Constructor for the GroupDriversParam class"""

        # Initialize members of the class
        self.group_id = group_id


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
        group_id = dictionary.get('groupId')

        # Return an object of this model
        return cls(group_id)

