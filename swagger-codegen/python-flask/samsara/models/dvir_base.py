# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.dvir_base_author_signature import DvirBaseAuthorSignature  # noqa: F401,E501
from samsara.models.dvir_base_mechanic_or_agent_signature import DvirBaseMechanicOrAgentSignature  # noqa: F401,E501
from samsara.models.dvir_base_next_driver_signature import DvirBaseNextDriverSignature  # noqa: F401,E501
from samsara.models.dvir_base_trailer_defects import DvirBaseTrailerDefects  # noqa: F401,E501
from samsara.models.dvir_base_vehicle import DvirBaseVehicle  # noqa: F401,E501
from samsara import util


class DvirBase(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, author_signature: DvirBaseAuthorSignature=None, defects_corrected: bool=None, defects_need_not_be_corrected: bool=None, id: int=None, inspection_type: str=None, mechanic_notes: str=None, mechanic_or_agent_signature: DvirBaseMechanicOrAgentSignature=None, next_driver_signature: DvirBaseNextDriverSignature=None, odometer_miles: int=None, time_ms: int=None, trailer_defects: List[DvirBaseTrailerDefects]=None, trailer_id: int=None, trailer_name: str=None, vehicle: DvirBaseVehicle=None, vehicle_condition: str=None, vehicle_defects: List[DvirBaseTrailerDefects]=None):  # noqa: E501
        """DvirBase - a model defined in Swagger

        :param author_signature: The author_signature of this DvirBase.  # noqa: E501
        :type author_signature: DvirBaseAuthorSignature
        :param defects_corrected: The defects_corrected of this DvirBase.  # noqa: E501
        :type defects_corrected: bool
        :param defects_need_not_be_corrected: The defects_need_not_be_corrected of this DvirBase.  # noqa: E501
        :type defects_need_not_be_corrected: bool
        :param id: The id of this DvirBase.  # noqa: E501
        :type id: int
        :param inspection_type: The inspection_type of this DvirBase.  # noqa: E501
        :type inspection_type: str
        :param mechanic_notes: The mechanic_notes of this DvirBase.  # noqa: E501
        :type mechanic_notes: str
        :param mechanic_or_agent_signature: The mechanic_or_agent_signature of this DvirBase.  # noqa: E501
        :type mechanic_or_agent_signature: DvirBaseMechanicOrAgentSignature
        :param next_driver_signature: The next_driver_signature of this DvirBase.  # noqa: E501
        :type next_driver_signature: DvirBaseNextDriverSignature
        :param odometer_miles: The odometer_miles of this DvirBase.  # noqa: E501
        :type odometer_miles: int
        :param time_ms: The time_ms of this DvirBase.  # noqa: E501
        :type time_ms: int
        :param trailer_defects: The trailer_defects of this DvirBase.  # noqa: E501
        :type trailer_defects: List[DvirBaseTrailerDefects]
        :param trailer_id: The trailer_id of this DvirBase.  # noqa: E501
        :type trailer_id: int
        :param trailer_name: The trailer_name of this DvirBase.  # noqa: E501
        :type trailer_name: str
        :param vehicle: The vehicle of this DvirBase.  # noqa: E501
        :type vehicle: DvirBaseVehicle
        :param vehicle_condition: The vehicle_condition of this DvirBase.  # noqa: E501
        :type vehicle_condition: str
        :param vehicle_defects: The vehicle_defects of this DvirBase.  # noqa: E501
        :type vehicle_defects: List[DvirBaseTrailerDefects]
        """
        self.swagger_types = {
            'author_signature': DvirBaseAuthorSignature,
            'defects_corrected': bool,
            'defects_need_not_be_corrected': bool,
            'id': int,
            'inspection_type': str,
            'mechanic_notes': str,
            'mechanic_or_agent_signature': DvirBaseMechanicOrAgentSignature,
            'next_driver_signature': DvirBaseNextDriverSignature,
            'odometer_miles': int,
            'time_ms': int,
            'trailer_defects': List[DvirBaseTrailerDefects],
            'trailer_id': int,
            'trailer_name': str,
            'vehicle': DvirBaseVehicle,
            'vehicle_condition': str,
            'vehicle_defects': List[DvirBaseTrailerDefects]
        }

        self.attribute_map = {
            'author_signature': 'authorSignature',
            'defects_corrected': 'defectsCorrected',
            'defects_need_not_be_corrected': 'defectsNeedNotBeCorrected',
            'id': 'id',
            'inspection_type': 'inspectionType',
            'mechanic_notes': 'mechanicNotes',
            'mechanic_or_agent_signature': 'mechanicOrAgentSignature',
            'next_driver_signature': 'nextDriverSignature',
            'odometer_miles': 'odometerMiles',
            'time_ms': 'timeMs',
            'trailer_defects': 'trailerDefects',
            'trailer_id': 'trailerId',
            'trailer_name': 'trailerName',
            'vehicle': 'vehicle',
            'vehicle_condition': 'vehicleCondition',
            'vehicle_defects': 'vehicleDefects'
        }

        self._author_signature = author_signature
        self._defects_corrected = defects_corrected
        self._defects_need_not_be_corrected = defects_need_not_be_corrected
        self._id = id
        self._inspection_type = inspection_type
        self._mechanic_notes = mechanic_notes
        self._mechanic_or_agent_signature = mechanic_or_agent_signature
        self._next_driver_signature = next_driver_signature
        self._odometer_miles = odometer_miles
        self._time_ms = time_ms
        self._trailer_defects = trailer_defects
        self._trailer_id = trailer_id
        self._trailer_name = trailer_name
        self._vehicle = vehicle
        self._vehicle_condition = vehicle_condition
        self._vehicle_defects = vehicle_defects

    @classmethod
    def from_dict(cls, dikt) -> 'DvirBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DvirBase of this DvirBase.  # noqa: E501
        :rtype: DvirBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def author_signature(self) -> DvirBaseAuthorSignature:
        """Gets the author_signature of this DvirBase.


        :return: The author_signature of this DvirBase.
        :rtype: DvirBaseAuthorSignature
        """
        return self._author_signature

    @author_signature.setter
    def author_signature(self, author_signature: DvirBaseAuthorSignature):
        """Sets the author_signature of this DvirBase.


        :param author_signature: The author_signature of this DvirBase.
        :type author_signature: DvirBaseAuthorSignature
        """

        self._author_signature = author_signature

    @property
    def defects_corrected(self) -> bool:
        """Gets the defects_corrected of this DvirBase.

        Signifies if the defects on the vehicle corrected after the DVIR is done.  # noqa: E501

        :return: The defects_corrected of this DvirBase.
        :rtype: bool
        """
        return self._defects_corrected

    @defects_corrected.setter
    def defects_corrected(self, defects_corrected: bool):
        """Sets the defects_corrected of this DvirBase.

        Signifies if the defects on the vehicle corrected after the DVIR is done.  # noqa: E501

        :param defects_corrected: The defects_corrected of this DvirBase.
        :type defects_corrected: bool
        """

        self._defects_corrected = defects_corrected

    @property
    def defects_need_not_be_corrected(self) -> bool:
        """Gets the defects_need_not_be_corrected of this DvirBase.

        Signifies if the defects on this vehicle can be ignored.  # noqa: E501

        :return: The defects_need_not_be_corrected of this DvirBase.
        :rtype: bool
        """
        return self._defects_need_not_be_corrected

    @defects_need_not_be_corrected.setter
    def defects_need_not_be_corrected(self, defects_need_not_be_corrected: bool):
        """Sets the defects_need_not_be_corrected of this DvirBase.

        Signifies if the defects on this vehicle can be ignored.  # noqa: E501

        :param defects_need_not_be_corrected: The defects_need_not_be_corrected of this DvirBase.
        :type defects_need_not_be_corrected: bool
        """

        self._defects_need_not_be_corrected = defects_need_not_be_corrected

    @property
    def id(self) -> int:
        """Gets the id of this DvirBase.

        The id of this DVIR record.  # noqa: E501

        :return: The id of this DvirBase.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this DvirBase.

        The id of this DVIR record.  # noqa: E501

        :param id: The id of this DvirBase.
        :type id: int
        """

        self._id = id

    @property
    def inspection_type(self) -> str:
        """Gets the inspection_type of this DvirBase.

        Inspection type of the DVIR.  # noqa: E501

        :return: The inspection_type of this DvirBase.
        :rtype: str
        """
        return self._inspection_type

    @inspection_type.setter
    def inspection_type(self, inspection_type: str):
        """Sets the inspection_type of this DvirBase.

        Inspection type of the DVIR.  # noqa: E501

        :param inspection_type: The inspection_type of this DvirBase.
        :type inspection_type: str
        """

        self._inspection_type = inspection_type

    @property
    def mechanic_notes(self) -> str:
        """Gets the mechanic_notes of this DvirBase.

        The mechanics notes on the DVIR.  # noqa: E501

        :return: The mechanic_notes of this DvirBase.
        :rtype: str
        """
        return self._mechanic_notes

    @mechanic_notes.setter
    def mechanic_notes(self, mechanic_notes: str):
        """Sets the mechanic_notes of this DvirBase.

        The mechanics notes on the DVIR.  # noqa: E501

        :param mechanic_notes: The mechanic_notes of this DvirBase.
        :type mechanic_notes: str
        """

        self._mechanic_notes = mechanic_notes

    @property
    def mechanic_or_agent_signature(self) -> DvirBaseMechanicOrAgentSignature:
        """Gets the mechanic_or_agent_signature of this DvirBase.


        :return: The mechanic_or_agent_signature of this DvirBase.
        :rtype: DvirBaseMechanicOrAgentSignature
        """
        return self._mechanic_or_agent_signature

    @mechanic_or_agent_signature.setter
    def mechanic_or_agent_signature(self, mechanic_or_agent_signature: DvirBaseMechanicOrAgentSignature):
        """Sets the mechanic_or_agent_signature of this DvirBase.


        :param mechanic_or_agent_signature: The mechanic_or_agent_signature of this DvirBase.
        :type mechanic_or_agent_signature: DvirBaseMechanicOrAgentSignature
        """

        self._mechanic_or_agent_signature = mechanic_or_agent_signature

    @property
    def next_driver_signature(self) -> DvirBaseNextDriverSignature:
        """Gets the next_driver_signature of this DvirBase.


        :return: The next_driver_signature of this DvirBase.
        :rtype: DvirBaseNextDriverSignature
        """
        return self._next_driver_signature

    @next_driver_signature.setter
    def next_driver_signature(self, next_driver_signature: DvirBaseNextDriverSignature):
        """Sets the next_driver_signature of this DvirBase.


        :param next_driver_signature: The next_driver_signature of this DvirBase.
        :type next_driver_signature: DvirBaseNextDriverSignature
        """

        self._next_driver_signature = next_driver_signature

    @property
    def odometer_miles(self) -> int:
        """Gets the odometer_miles of this DvirBase.

        The odometer reading in miles for the vehicle when the DVIR was done.  # noqa: E501

        :return: The odometer_miles of this DvirBase.
        :rtype: int
        """
        return self._odometer_miles

    @odometer_miles.setter
    def odometer_miles(self, odometer_miles: int):
        """Sets the odometer_miles of this DvirBase.

        The odometer reading in miles for the vehicle when the DVIR was done.  # noqa: E501

        :param odometer_miles: The odometer_miles of this DvirBase.
        :type odometer_miles: int
        """

        self._odometer_miles = odometer_miles

    @property
    def time_ms(self) -> int:
        """Gets the time_ms of this DvirBase.

        Timestamp of this DVIR in UNIX milliseconds.  # noqa: E501

        :return: The time_ms of this DvirBase.
        :rtype: int
        """
        return self._time_ms

    @time_ms.setter
    def time_ms(self, time_ms: int):
        """Sets the time_ms of this DvirBase.

        Timestamp of this DVIR in UNIX milliseconds.  # noqa: E501

        :param time_ms: The time_ms of this DvirBase.
        :type time_ms: int
        """

        self._time_ms = time_ms

    @property
    def trailer_defects(self) -> List[DvirBaseTrailerDefects]:
        """Gets the trailer_defects of this DvirBase.

        Defects registered for the trailer which was part of the DVIR.  # noqa: E501

        :return: The trailer_defects of this DvirBase.
        :rtype: List[DvirBaseTrailerDefects]
        """
        return self._trailer_defects

    @trailer_defects.setter
    def trailer_defects(self, trailer_defects: List[DvirBaseTrailerDefects]):
        """Sets the trailer_defects of this DvirBase.

        Defects registered for the trailer which was part of the DVIR.  # noqa: E501

        :param trailer_defects: The trailer_defects of this DvirBase.
        :type trailer_defects: List[DvirBaseTrailerDefects]
        """

        self._trailer_defects = trailer_defects

    @property
    def trailer_id(self) -> int:
        """Gets the trailer_id of this DvirBase.

        The id of the trailer which was part of the DVIR.  # noqa: E501

        :return: The trailer_id of this DvirBase.
        :rtype: int
        """
        return self._trailer_id

    @trailer_id.setter
    def trailer_id(self, trailer_id: int):
        """Sets the trailer_id of this DvirBase.

        The id of the trailer which was part of the DVIR.  # noqa: E501

        :param trailer_id: The trailer_id of this DvirBase.
        :type trailer_id: int
        """

        self._trailer_id = trailer_id

    @property
    def trailer_name(self) -> str:
        """Gets the trailer_name of this DvirBase.

        The name of the trailer which was part of the DVIR.  # noqa: E501

        :return: The trailer_name of this DvirBase.
        :rtype: str
        """
        return self._trailer_name

    @trailer_name.setter
    def trailer_name(self, trailer_name: str):
        """Sets the trailer_name of this DvirBase.

        The name of the trailer which was part of the DVIR.  # noqa: E501

        :param trailer_name: The trailer_name of this DvirBase.
        :type trailer_name: str
        """

        self._trailer_name = trailer_name

    @property
    def vehicle(self) -> DvirBaseVehicle:
        """Gets the vehicle of this DvirBase.


        :return: The vehicle of this DvirBase.
        :rtype: DvirBaseVehicle
        """
        return self._vehicle

    @vehicle.setter
    def vehicle(self, vehicle: DvirBaseVehicle):
        """Sets the vehicle of this DvirBase.


        :param vehicle: The vehicle of this DvirBase.
        :type vehicle: DvirBaseVehicle
        """

        self._vehicle = vehicle

    @property
    def vehicle_condition(self) -> str:
        """Gets the vehicle_condition of this DvirBase.

        The condition of vechile on which DVIR was done.  # noqa: E501

        :return: The vehicle_condition of this DvirBase.
        :rtype: str
        """
        return self._vehicle_condition

    @vehicle_condition.setter
    def vehicle_condition(self, vehicle_condition: str):
        """Sets the vehicle_condition of this DvirBase.

        The condition of vechile on which DVIR was done.  # noqa: E501

        :param vehicle_condition: The vehicle_condition of this DvirBase.
        :type vehicle_condition: str
        """

        self._vehicle_condition = vehicle_condition

    @property
    def vehicle_defects(self) -> List[DvirBaseTrailerDefects]:
        """Gets the vehicle_defects of this DvirBase.

        Defects registered for the vehicle which was part of the DVIR.  # noqa: E501

        :return: The vehicle_defects of this DvirBase.
        :rtype: List[DvirBaseTrailerDefects]
        """
        return self._vehicle_defects

    @vehicle_defects.setter
    def vehicle_defects(self, vehicle_defects: List[DvirBaseTrailerDefects]):
        """Sets the vehicle_defects of this DvirBase.

        Defects registered for the vehicle which was part of the DVIR.  # noqa: E501

        :param vehicle_defects: The vehicle_defects of this DvirBase.
        :type vehicle_defects: List[DvirBaseTrailerDefects]
        """

        self._vehicle_defects = vehicle_defects