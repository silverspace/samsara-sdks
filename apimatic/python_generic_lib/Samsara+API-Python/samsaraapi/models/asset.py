# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.cable

class Asset(object):

    """Implementation of the 'Asset' model.

    Basic information of an asset

    Attributes:
        asset_serial_number (string): Serial number of the host asset
        cable (list of Cable): The cable connected to the asset
        engine_hours (int): Engine hours
        id (long|int): Asset ID
        name (string): Asset name

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id":'id',
        "asset_serial_number":'assetSerialNumber',
        "cable":'cable',
        "engine_hours":'engineHours',
        "name":'name'
    }

    def __init__(self,
                 id=None,
                 asset_serial_number=None,
                 cable=None,
                 engine_hours=None,
                 name=None):
        """Constructor for the Asset class"""

        # Initialize members of the class
        self.asset_serial_number = asset_serial_number
        self.cable = cable
        self.engine_hours = engine_hours
        self.id = id
        self.name = name


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
        id = dictionary.get('id')
        asset_serial_number = dictionary.get('assetSerialNumber')
        cable = None
        if dictionary.get('cable') != None:
            cable = list()
            for structure in dictionary.get('cable'):
                cable.append(samsaraapi.models.cable.Cable.from_dictionary(structure))
        engine_hours = dictionary.get('engineHours')
        name = dictionary.get('name')

        # Return an object of this model
        return cls(id,
                   asset_serial_number,
                   cable,
                   engine_hours,
                   name)


