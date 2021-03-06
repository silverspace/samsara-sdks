# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DvirBase(Model):
    """DvirBase.

    :param author_signature: The authors signature for the DVIR.
    :type author_signature: ~swagger.models.DvirBaseAuthorSignature
    :param defects_corrected: Signifies if the defects on the vehicle
     corrected after the DVIR is done.
    :type defects_corrected: bool
    :param defects_need_not_be_corrected: Signifies if the defects on this
     vehicle can be ignored.
    :type defects_need_not_be_corrected: bool
    :param id: The id of this DVIR record.
    :type id: long
    :param inspection_type: Inspection type of the DVIR.
    :type inspection_type: str
    :param mechanic_notes: The mechanics notes on the DVIR.
    :type mechanic_notes: str
    :param mechanic_or_agent_signature: The mechanic's or agent's signature
     for the DVIR.
    :type mechanic_or_agent_signature:
     ~swagger.models.DvirBaseMechanicOrAgentSignature
    :param next_driver_signature: The next driver signature for the DVIR.
    :type next_driver_signature: ~swagger.models.DvirBaseNextDriverSignature
    :param odometer_miles: The odometer reading in miles for the vehicle when
     the DVIR was done.
    :type odometer_miles: long
    :param time_ms: Timestamp of this DVIR in UNIX milliseconds.
    :type time_ms: long
    :param trailer_defects: Defects registered for the trailer which was part
     of the DVIR.
    :type trailer_defects: list[~swagger.models.DvirBaseTrailerDefectsItem]
    :param trailer_id: The id of the trailer which was part of the DVIR.
    :type trailer_id: int
    :param trailer_name: The name of the trailer which was part of the DVIR.
    :type trailer_name: str
    :param vehicle: The vehicle on which DVIR was done.
    :type vehicle: ~swagger.models.DvirBaseVehicle
    :param vehicle_condition: The condition of vechile on which DVIR was done.
    :type vehicle_condition: str
    :param vehicle_defects: Defects registered for the vehicle which was part
     of the DVIR.
    :type vehicle_defects: list[~swagger.models.DvirBaseVehicleDefectsItem]
    """

    _attribute_map = {
        'author_signature': {'key': 'authorSignature', 'type': 'DvirBaseAuthorSignature'},
        'defects_corrected': {'key': 'defectsCorrected', 'type': 'bool'},
        'defects_need_not_be_corrected': {'key': 'defectsNeedNotBeCorrected', 'type': 'bool'},
        'id': {'key': 'id', 'type': 'long'},
        'inspection_type': {'key': 'inspectionType', 'type': 'str'},
        'mechanic_notes': {'key': 'mechanicNotes', 'type': 'str'},
        'mechanic_or_agent_signature': {'key': 'mechanicOrAgentSignature', 'type': 'DvirBaseMechanicOrAgentSignature'},
        'next_driver_signature': {'key': 'nextDriverSignature', 'type': 'DvirBaseNextDriverSignature'},
        'odometer_miles': {'key': 'odometerMiles', 'type': 'long'},
        'time_ms': {'key': 'timeMs', 'type': 'long'},
        'trailer_defects': {'key': 'trailerDefects', 'type': '[DvirBaseTrailerDefectsItem]'},
        'trailer_id': {'key': 'trailerId', 'type': 'int'},
        'trailer_name': {'key': 'trailerName', 'type': 'str'},
        'vehicle': {'key': 'vehicle', 'type': 'DvirBaseVehicle'},
        'vehicle_condition': {'key': 'vehicleCondition', 'type': 'str'},
        'vehicle_defects': {'key': 'vehicleDefects', 'type': '[DvirBaseVehicleDefectsItem]'},
    }

    def __init__(self, author_signature=None, defects_corrected=None, defects_need_not_be_corrected=None, id=None, inspection_type=None, mechanic_notes=None, mechanic_or_agent_signature=None, next_driver_signature=None, odometer_miles=None, time_ms=None, trailer_defects=None, trailer_id=None, trailer_name=None, vehicle=None, vehicle_condition=None, vehicle_defects=None):
        super(DvirBase, self).__init__()
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
