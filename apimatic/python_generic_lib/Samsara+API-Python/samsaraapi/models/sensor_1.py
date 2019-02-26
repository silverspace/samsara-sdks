# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class Sensor1(object):

    """Implementation of the 'Sensor1' model.

    TODO: type model description here.

    Attributes:
        door_closed (bool): Flag indicating whether the current door is closed
            or open.
        id (long|int): ID of the sensor.
        name (string): Name of the sensor.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "door_closed":'doorClosed',
        "id":'id',
        "name":'name'
    }

    def __init__(self,
                 door_closed=None,
                 id=None,
                 name=None):
        """Constructor for the Sensor1 class"""

        # Initialize members of the class
        self.door_closed = door_closed
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
        door_closed = dictionary.get('doorClosed')
        id = dictionary.get('id')
        name = dictionary.get('name')

        # Return an object of this model
        return cls(door_closed,
                   id,
                   name)


