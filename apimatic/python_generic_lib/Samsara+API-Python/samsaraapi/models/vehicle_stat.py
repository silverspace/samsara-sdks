# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.aux_input_series
import samsaraapi.models.engine_state

class VehicleStat(object):

    """Implementation of the 'VehicleStat' model.

    TODO: type model description here.

    Attributes:
        aux_input_1 (AuxInputSeries): A list of aux input values over a
            timerange.
        aux_input_2 (AuxInputSeries): A list of aux input values over a
            timerange.
        engine_state (list of EngineState): TODO: type description here.
        vehicle_id (long|int): ID of the vehicle.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "vehicle_id":'vehicleId',
        "aux_input_1":'auxInput1',
        "aux_input_2":'auxInput2',
        "engine_state":'engineState'
    }

    def __init__(self,
                 vehicle_id=None,
                 aux_input_1=None,
                 aux_input_2=None,
                 engine_state=None):
        """Constructor for the VehicleStat class"""

        # Initialize members of the class
        self.aux_input_1 = aux_input_1
        self.aux_input_2 = aux_input_2
        self.engine_state = engine_state
        self.vehicle_id = vehicle_id


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
        vehicle_id = dictionary.get('vehicleId')
        aux_input_1 = samsaraapi.models.aux_input_series.AuxInputSeries.from_dictionary(dictionary.get('auxInput1')) if dictionary.get('auxInput1') else None
        aux_input_2 = samsaraapi.models.aux_input_series.AuxInputSeries.from_dictionary(dictionary.get('auxInput2')) if dictionary.get('auxInput2') else None
        engine_state = None
        if dictionary.get('engineState') != None:
            engine_state = list()
            for structure in dictionary.get('engineState'):
                engine_state.append(samsaraapi.models.engine_state.EngineState.from_dictionary(structure))

        # Return an object of this model
        return cls(vehicle_id,
                   aux_input_1,
                   aux_input_2,
                   engine_state)

