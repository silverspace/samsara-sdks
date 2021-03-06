# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.tag_1

class UserTagRole(object):

    """Implementation of the 'UserTagRole' model.

    TODO: type model description here.

    Attributes:
        role (string): The name of the role the user has been granted on this
            tag.
        role_id (string): The id of the role the user has been granted on this
            tag.
        tag (Tag1): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "role_id":'roleId',
        "tag":'tag',
        "role":'role'
    }

    def __init__(self,
                 role_id=None,
                 tag=None,
                 role=None):
        """Constructor for the UserTagRole class"""

        # Initialize members of the class
        self.role = role
        self.role_id = role_id
        self.tag = tag


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
        role_id = dictionary.get('roleId')
        tag = samsaraapi.models.tag_1.Tag1.from_dictionary(dictionary.get('tag')) if dictionary.get('tag') else None
        role = dictionary.get('role')

        # Return an object of this model
        return cls(role_id,
                   tag,
                   role)


