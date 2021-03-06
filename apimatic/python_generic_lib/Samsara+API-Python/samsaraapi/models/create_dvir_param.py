# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class CreateDvirParam(object):

    """Implementation of the 'createDvirParam' model.

    TODO: type model description here.

    Attributes:
        inspection_type (string): Only type 'mechanic' is currently accepted.
        mechanic_notes (string): Any notes from the mechanic.
        odometer_miles (int): The current odometer of the vehicle.
        previous_defects_corrected (bool): Whether any previous defects were
            corrected. If this vehicle or trailer was previously marked
            unsafe, and this DVIR marks it as safe, either
            previousDefectsCorrected or previousDefectsIgnored must be true.
        previous_defects_ignored (bool): Whether any previous defects were
            ignored. If this vehicle or trailer was previously marked unsafe,
            and this DVIR marks it as safe, either previousDefectsCorrected or
            previousDefectsIgnored must be true.
        safe (SafeEnum): Whether or not this vehicle or trailer is safe to
            drive.
        trailer_id (int): Id of trailer being inspected. Either vehicleId or
            trailerId must be provided.
        user_email (string): The Samsara login email for the person creating
            the DVIR. The email must correspond to a Samsara user's email.
        vehicle_id (int): Id of vehicle being inspected. Either vehicleId or
            trailerId must be provided.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "inspection_type":'inspectionType',
        "safe":'safe',
        "user_email":'userEmail',
        "mechanic_notes":'mechanicNotes',
        "odometer_miles":'odometerMiles',
        "previous_defects_corrected":'previousDefectsCorrected',
        "previous_defects_ignored":'previousDefectsIgnored',
        "trailer_id":'trailerId',
        "vehicle_id":'vehicleId'
    }

    def __init__(self,
                 inspection_type='mechanic',
                 safe=None,
                 user_email=None,
                 mechanic_notes=None,
                 odometer_miles=None,
                 previous_defects_corrected=None,
                 previous_defects_ignored=None,
                 trailer_id=None,
                 vehicle_id=None):
        """Constructor for the CreateDvirParam class"""

        # Initialize members of the class
        self.inspection_type = inspection_type
        self.mechanic_notes = mechanic_notes
        self.odometer_miles = odometer_miles
        self.previous_defects_corrected = previous_defects_corrected
        self.previous_defects_ignored = previous_defects_ignored
        self.safe = safe
        self.trailer_id = trailer_id
        self.user_email = user_email
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
        inspection_type = dictionary.get("inspectionType") if dictionary.get("inspectionType") else 'mechanic'
        safe = dictionary.get('safe')
        user_email = dictionary.get('userEmail')
        mechanic_notes = dictionary.get('mechanicNotes')
        odometer_miles = dictionary.get('odometerMiles')
        previous_defects_corrected = dictionary.get('previousDefectsCorrected')
        previous_defects_ignored = dictionary.get('previousDefectsIgnored')
        trailer_id = dictionary.get('trailerId')
        vehicle_id = dictionary.get('vehicleId')

        # Return an object of this model
        return cls(inspection_type,
                   safe,
                   user_email,
                   mechanic_notes,
                   odometer_miles,
                   previous_defects_corrected,
                   previous_defects_ignored,
                   trailer_id,
                   vehicle_id)


