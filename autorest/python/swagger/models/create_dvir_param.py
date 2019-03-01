# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class CreateDvirParam(Model):
    """CreateDvirParam.

    Variables are only populated by the server, and will be ignored when
    sending a request.

    :ivar inspection_type: Only type 'mechanic' is currently accepted. Default
     value: "mechanic" .
    :vartype inspection_type: str
    :param mechanic_notes: Any notes from the mechanic.
    :type mechanic_notes: str
    :param odometer_miles: The current odometer of the vehicle.
    :type odometer_miles: int
    :param previous_defects_corrected: Whether any previous defects were
     corrected. If this vehicle or trailer was previously marked unsafe, and
     this DVIR marks it as safe, either previousDefectsCorrected or
     previousDefectsIgnored must be true.
    :type previous_defects_corrected: bool
    :param previous_defects_ignored: Whether any previous defects were
     ignored. If this vehicle or trailer was previously marked unsafe, and this
     DVIR marks it as safe, either previousDefectsCorrected or
     previousDefectsIgnored must be true.
    :type previous_defects_ignored: bool
    :param safe: Whether or not this vehicle or trailer is safe to drive.
     Possible values include: 'safe', 'unsafe'
    :type safe: str or ~swagger.models.enum
    :param trailer_id: Id of trailer being inspected. Either vehicleId or
     trailerId must be provided.
    :type trailer_id: int
    :param user_email: The Samsara login email for the person creating the
     DVIR. The email must correspond to a Samsara user's email.
    :type user_email: str
    :param vehicle_id: Id of vehicle being inspected. Either vehicleId or
     trailerId must be provided.
    :type vehicle_id: int
    """

    _validation = {
        'inspection_type': {'required': True, 'constant': True},
        'safe': {'required': True},
        'user_email': {'required': True},
    }

    _attribute_map = {
        'inspection_type': {'key': 'inspectionType', 'type': 'str'},
        'mechanic_notes': {'key': 'mechanicNotes', 'type': 'str'},
        'odometer_miles': {'key': 'odometerMiles', 'type': 'int'},
        'previous_defects_corrected': {'key': 'previousDefectsCorrected', 'type': 'bool'},
        'previous_defects_ignored': {'key': 'previousDefectsIgnored', 'type': 'bool'},
        'safe': {'key': 'safe', 'type': 'str'},
        'trailer_id': {'key': 'trailerId', 'type': 'int'},
        'user_email': {'key': 'userEmail', 'type': 'str'},
        'vehicle_id': {'key': 'vehicleId', 'type': 'int'},
    }

    inspection_type = "mechanic"

    def __init__(self, safe, user_email, mechanic_notes=None, odometer_miles=None, previous_defects_corrected=None, previous_defects_ignored=None, trailer_id=None, vehicle_id=None):
        super(CreateDvirParam, self).__init__()
        self.mechanic_notes = mechanic_notes
        self.odometer_miles = odometer_miles
        self.previous_defects_corrected = previous_defects_corrected
        self.previous_defects_ignored = previous_defects_ignored
        self.safe = safe
        self.trailer_id = trailer_id
        self.user_email = user_email
        self.vehicle_id = vehicle_id