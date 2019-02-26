# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.fleet_vehicle_location

class FleetVehiclesLocation(object):

    """Implementation of the 'FleetVehiclesLocation' model.

    TODO: type model description here.

    Attributes:
        id (long|int): ID of the vehicle.
        locations (list of FleetVehicleLocation): TODO: type description
            here.
        name (string): Name of the vehicle.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id":'id',
        "locations":'locations',
        "name":'name'
    }

    def __init__(self,
                 id=None,
                 locations=None,
                 name=None):
        """Constructor for the FleetVehiclesLocation class"""

        # Initialize members of the class
        self.id = id
        self.locations = locations
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
        locations = None
        if dictionary.get('locations') != None:
            locations = list()
            for structure in dictionary.get('locations'):
                locations.append(samsaraapi.models.fleet_vehicle_location.FleetVehicleLocation.from_dictionary(structure))
        name = dictionary.get('name')

        # Return an object of this model
        return cls(id,
                   locations,
                   name)

