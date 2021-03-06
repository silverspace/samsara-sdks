# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.author_signature
import samsaraapi.models.mechanic_or_agent_signature
import samsaraapi.models.next_driver_signature
import samsaraapi.models.trailer_defect
import samsaraapi.models.vehicle_2
import samsaraapi.models.vehicle_defect

class DvirBase(object):

    """Implementation of the 'DvirBase' model.

    TODO: type model description here.

    Attributes:
        author_signature (AuthorSignature): The authors signature for the
            DVIR.
        defects_corrected (bool): Signifies if the defects on the vehicle
            corrected after the DVIR is done.
        defects_need_not_be_corrected (bool): Signifies if the defects on this
            vehicle can be ignored.
        id (long|int): The id of this DVIR record.
        inspection_type (string): Inspection type of the DVIR.
        mechanic_notes (string): The mechanics notes on the DVIR.
        mechanic_or_agent_signature (MechanicOrAgentSignature): The mechanic's
            or agent's signature for the DVIR.
        next_driver_signature (NextDriverSignature): The next driver signature
            for the DVIR.
        odometer_miles (long|int): The odometer reading in miles for the
            vehicle when the DVIR was done.
        time_ms (long|int): Timestamp of this DVIR in UNIX milliseconds.
        trailer_defects (list of TrailerDefect): Defects registered for the
            trailer which was part of the DVIR.
        trailer_id (int): The id of the trailer which was part of the DVIR.
        trailer_name (string): The name of the trailer which was part of the
            DVIR.
        vehicle (Vehicle2): The vehicle on which DVIR was done.
        vehicle_condition (string): The condition of vechile on which DVIR was
            done.
        vehicle_defects (list of VehicleDefect): Defects registered for the
            vehicle which was part of the DVIR.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "author_signature":'authorSignature',
        "defects_corrected":'defectsCorrected',
        "defects_need_not_be_corrected":'defectsNeedNotBeCorrected',
        "id":'id',
        "inspection_type":'inspectionType',
        "mechanic_notes":'mechanicNotes',
        "mechanic_or_agent_signature":'mechanicOrAgentSignature',
        "next_driver_signature":'nextDriverSignature',
        "odometer_miles":'odometerMiles',
        "time_ms":'timeMs',
        "trailer_defects":'trailerDefects',
        "trailer_id":'trailerId',
        "trailer_name":'trailerName',
        "vehicle":'vehicle',
        "vehicle_condition":'vehicleCondition',
        "vehicle_defects":'vehicleDefects'
    }

    def __init__(self,
                 author_signature=None,
                 defects_corrected=None,
                 defects_need_not_be_corrected=None,
                 id=None,
                 inspection_type=None,
                 mechanic_notes=None,
                 mechanic_or_agent_signature=None,
                 next_driver_signature=None,
                 odometer_miles=None,
                 time_ms=None,
                 trailer_defects=None,
                 trailer_id=None,
                 trailer_name=None,
                 vehicle=None,
                 vehicle_condition=None,
                 vehicle_defects=None):
        """Constructor for the DvirBase class"""

        # Initialize members of the class
        self.author_signature = author_signature
        self.defects_corrected = defects_corrected
        self.defects_need_not_be_corrected = defects_need_not_be_corrected
        self.id = id
        self.inspection_type = inspection_type
        self.mechanic_notes = mechanic_notes
        self.mechanic_or_agent_signature = mechanic_or_agent_signature
        self.next_driver_signature = next_driver_signature
        self.odometer_miles = odometer_miles
        self.time_ms = time_ms
        self.trailer_defects = trailer_defects
        self.trailer_id = trailer_id
        self.trailer_name = trailer_name
        self.vehicle = vehicle
        self.vehicle_condition = vehicle_condition
        self.vehicle_defects = vehicle_defects


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
        author_signature = samsaraapi.models.author_signature.AuthorSignature.from_dictionary(dictionary.get('authorSignature')) if dictionary.get('authorSignature') else None
        defects_corrected = dictionary.get('defectsCorrected')
        defects_need_not_be_corrected = dictionary.get('defectsNeedNotBeCorrected')
        id = dictionary.get('id')
        inspection_type = dictionary.get('inspectionType')
        mechanic_notes = dictionary.get('mechanicNotes')
        mechanic_or_agent_signature = samsaraapi.models.mechanic_or_agent_signature.MechanicOrAgentSignature.from_dictionary(dictionary.get('mechanicOrAgentSignature')) if dictionary.get('mechanicOrAgentSignature') else None
        next_driver_signature = samsaraapi.models.next_driver_signature.NextDriverSignature.from_dictionary(dictionary.get('nextDriverSignature')) if dictionary.get('nextDriverSignature') else None
        odometer_miles = dictionary.get('odometerMiles')
        time_ms = dictionary.get('timeMs')
        trailer_defects = None
        if dictionary.get('trailerDefects') != None:
            trailer_defects = list()
            for structure in dictionary.get('trailerDefects'):
                trailer_defects.append(samsaraapi.models.trailer_defect.TrailerDefect.from_dictionary(structure))
        trailer_id = dictionary.get('trailerId')
        trailer_name = dictionary.get('trailerName')
        vehicle = samsaraapi.models.vehicle_2.Vehicle2.from_dictionary(dictionary.get('vehicle')) if dictionary.get('vehicle') else None
        vehicle_condition = dictionary.get('vehicleCondition')
        vehicle_defects = None
        if dictionary.get('vehicleDefects') != None:
            vehicle_defects = list()
            for structure in dictionary.get('vehicleDefects'):
                vehicle_defects.append(samsaraapi.models.vehicle_defect.VehicleDefect.from_dictionary(structure))

        # Return an object of this model
        return cls(author_signature,
                   defects_corrected,
                   defects_need_not_be_corrected,
                   id,
                   inspection_type,
                   mechanic_notes,
                   mechanic_or_agent_signature,
                   next_driver_signature,
                   odometer_miles,
                   time_ms,
                   trailer_defects,
                   trailer_id,
                   trailer_name,
                   vehicle,
                   vehicle_condition,
                   vehicle_defects)


