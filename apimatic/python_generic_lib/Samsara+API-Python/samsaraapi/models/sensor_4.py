# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class Sensor4(object):

    """Implementation of the 'Sensor4' model.

    TODO: type model description here.

    Attributes:
        ambient_temperature (int): Currently reported ambient temperature in
            millidegrees celsius.
        id (long|int): ID of the sensor.
        name (string): Name of the sensor.
        probe_temperature (int): Currently reported probe temperature in
            millidegrees celsius. If no probe is connected, this parameter
            will not be reported.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "ambient_temperature":'ambientTemperature',
        "id":'id',
        "name":'name',
        "probe_temperature":'probeTemperature'
    }

    def __init__(self,
                 ambient_temperature=None,
                 id=None,
                 name=None,
                 probe_temperature=None):
        """Constructor for the Sensor4 class"""

        # Initialize members of the class
        self.ambient_temperature = ambient_temperature
        self.id = id
        self.name = name
        self.probe_temperature = probe_temperature


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
        ambient_temperature = dictionary.get('ambientTemperature')
        id = dictionary.get('id')
        name = dictionary.get('name')
        probe_temperature = dictionary.get('probeTemperature')

        # Return an object of this model
        return cls(ambient_temperature,
                   id,
                   name,
                   probe_temperature)


