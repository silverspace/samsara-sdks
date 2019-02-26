# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.sensor_1

class DoorResponse(object):

    """Implementation of the 'DoorResponse' model.

    Contains the current door status of a sensor.

    Attributes:
        group_id (long|int): TODO: type description here.
        sensors (list of Sensor1): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "group_id":'groupId',
        "sensors":'sensors'
    }

    def __init__(self,
                 group_id=None,
                 sensors=None):
        """Constructor for the DoorResponse class"""

        # Initialize members of the class
        self.group_id = group_id
        self.sensors = sensors


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
        sensors = None
        if dictionary.get('sensors') != None:
            sensors = list()
            for structure in dictionary.get('sensors'):
                sensors.append(samsaraapi.models.sensor_1.Sensor1.from_dictionary(structure))

        # Return an object of this model
        return cls(group_id,
                   sensors)


