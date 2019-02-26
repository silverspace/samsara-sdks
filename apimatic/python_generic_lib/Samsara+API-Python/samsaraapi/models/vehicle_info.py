# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class VehicleInfo(object):

    """Implementation of the 'VehicleInfo' model.

    TODO: type model description here.

    Attributes:
        make (string): Make of the vehicle.
        model (string): Model of the Vehicle.
        vin (string): Vehicle Identification Number.
        year (long|int): Year of the vehicle.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "make":'make',
        "model":'model',
        "vin":'vin',
        "year":'year'
    }

    def __init__(self,
                 make=None,
                 model=None,
                 vin=None,
                 year=None):
        """Constructor for the VehicleInfo class"""

        # Initialize members of the class
        self.make = make
        self.model = model
        self.vin = vin
        self.year = year


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
        make = dictionary.get('make')
        model = dictionary.get('model')
        vin = dictionary.get('vin')
        year = dictionary.get('year')

        # Return an object of this model
        return cls(make,
                   model,
                   vin,
                   year)

