# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.address_geofence

class Addresses1(object):

    """Implementation of the 'Addresses1' model.

    TODO: type model description here.

    Attributes:
        contact_ids (list of long|int): A list of IDs for contact book
            entries.
        formatted_address (string): The full address associated with this
            address/geofence, as it might be recognized by maps.google.com
        geofence (AddressGeofence): The geofence that defines this address and
            its bounds. This can either be a circle, or a polygon - only one
            key should be provided, depending on the geofence type.
        name (string): The name of this address/geofence
        notes (string): Notes associated with an address.
        tag_ids (list of long|int): A list of tag IDs.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "formatted_address":'formattedAddress',
        "geofence":'geofence',
        "name":'name',
        "contact_ids":'contactIds',
        "notes":'notes',
        "tag_ids":'tagIds'
    }

    def __init__(self,
                 formatted_address=None,
                 geofence=None,
                 name=None,
                 contact_ids=None,
                 notes=None,
                 tag_ids=None):
        """Constructor for the Addresses1 class"""

        # Initialize members of the class
        self.contact_ids = contact_ids
        self.formatted_address = formatted_address
        self.geofence = geofence
        self.name = name
        self.notes = notes
        self.tag_ids = tag_ids


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
        formatted_address = dictionary.get('formattedAddress')
        geofence = samsaraapi.models.address_geofence.AddressGeofence.from_dictionary(dictionary.get('geofence')) if dictionary.get('geofence') else None
        name = dictionary.get('name')
        contact_ids = dictionary.get('contactIds')
        notes = dictionary.get('notes')
        tag_ids = dictionary.get('tagIds')

        # Return an object of this model
        return cls(formatted_address,
                   geofence,
                   name,
                   contact_ids,
                   notes,
                   tag_ids)


