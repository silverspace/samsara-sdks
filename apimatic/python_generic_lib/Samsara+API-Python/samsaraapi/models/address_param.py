# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class AddressParam(object):

    """Implementation of the 'addressParam' model.

    TODO: type model description here.

    Attributes:
        address (string): The address of the entry to add, as it would be
            recognized if provided to maps.google.com.
        group_id (long|int): Group ID to query.
        name (string): Name of the location to add to the address book.
        radius (int): Radius in meters of the address (used for matching
            vehicle trip stops to this location).

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "address":'address',
        "group_id":'groupId',
        "name":'name',
        "radius":'radius'
    }

    def __init__(self,
                 address=None,
                 group_id=None,
                 name=None,
                 radius=None):
        """Constructor for the AddressParam class"""

        # Initialize members of the class
        self.address = address
        self.group_id = group_id
        self.name = name
        self.radius = radius


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
        address = dictionary.get('address')
        group_id = dictionary.get('groupId')
        name = dictionary.get('name')
        radius = dictionary.get('radius')

        # Return an object of this model
        return cls(address,
                   group_id,
                   name,
                   radius)


