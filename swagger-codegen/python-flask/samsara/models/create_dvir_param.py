# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class CreateDvirParam(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, inspection_type: str=None, mechanic_notes: str=None, odometer_miles: int=None, previous_defects_corrected: bool=None, previous_defects_ignored: bool=None, safe: str=None, trailer_id: int=None, user_email: str=None, vehicle_id: int=None):  # noqa: E501
        """CreateDvirParam - a model defined in Swagger

        :param inspection_type: The inspection_type of this CreateDvirParam.  # noqa: E501
        :type inspection_type: str
        :param mechanic_notes: The mechanic_notes of this CreateDvirParam.  # noqa: E501
        :type mechanic_notes: str
        :param odometer_miles: The odometer_miles of this CreateDvirParam.  # noqa: E501
        :type odometer_miles: int
        :param previous_defects_corrected: The previous_defects_corrected of this CreateDvirParam.  # noqa: E501
        :type previous_defects_corrected: bool
        :param previous_defects_ignored: The previous_defects_ignored of this CreateDvirParam.  # noqa: E501
        :type previous_defects_ignored: bool
        :param safe: The safe of this CreateDvirParam.  # noqa: E501
        :type safe: str
        :param trailer_id: The trailer_id of this CreateDvirParam.  # noqa: E501
        :type trailer_id: int
        :param user_email: The user_email of this CreateDvirParam.  # noqa: E501
        :type user_email: str
        :param vehicle_id: The vehicle_id of this CreateDvirParam.  # noqa: E501
        :type vehicle_id: int
        """
        self.swagger_types = {
            'inspection_type': str,
            'mechanic_notes': str,
            'odometer_miles': int,
            'previous_defects_corrected': bool,
            'previous_defects_ignored': bool,
            'safe': str,
            'trailer_id': int,
            'user_email': str,
            'vehicle_id': int
        }

        self.attribute_map = {
            'inspection_type': 'inspectionType',
            'mechanic_notes': 'mechanicNotes',
            'odometer_miles': 'odometerMiles',
            'previous_defects_corrected': 'previousDefectsCorrected',
            'previous_defects_ignored': 'previousDefectsIgnored',
            'safe': 'safe',
            'trailer_id': 'trailerId',
            'user_email': 'userEmail',
            'vehicle_id': 'vehicleId'
        }

        self._inspection_type = inspection_type
        self._mechanic_notes = mechanic_notes
        self._odometer_miles = odometer_miles
        self._previous_defects_corrected = previous_defects_corrected
        self._previous_defects_ignored = previous_defects_ignored
        self._safe = safe
        self._trailer_id = trailer_id
        self._user_email = user_email
        self._vehicle_id = vehicle_id

    @classmethod
    def from_dict(cls, dikt) -> 'CreateDvirParam':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createDvirParam of this CreateDvirParam.  # noqa: E501
        :rtype: CreateDvirParam
        """
        return util.deserialize_model(dikt, cls)

    @property
    def inspection_type(self) -> str:
        """Gets the inspection_type of this CreateDvirParam.

        Only type 'mechanic' is currently accepted.  # noqa: E501

        :return: The inspection_type of this CreateDvirParam.
        :rtype: str
        """
        return self._inspection_type

    @inspection_type.setter
    def inspection_type(self, inspection_type: str):
        """Sets the inspection_type of this CreateDvirParam.

        Only type 'mechanic' is currently accepted.  # noqa: E501

        :param inspection_type: The inspection_type of this CreateDvirParam.
        :type inspection_type: str
        """
        allowed_values = ["mechanic"]  # noqa: E501
        if inspection_type not in allowed_values:
            raise ValueError(
                "Invalid value for `inspection_type` ({0}), must be one of {1}"
                .format(inspection_type, allowed_values)
            )

        self._inspection_type = inspection_type

    @property
    def mechanic_notes(self) -> str:
        """Gets the mechanic_notes of this CreateDvirParam.

        Any notes from the mechanic.  # noqa: E501

        :return: The mechanic_notes of this CreateDvirParam.
        :rtype: str
        """
        return self._mechanic_notes

    @mechanic_notes.setter
    def mechanic_notes(self, mechanic_notes: str):
        """Sets the mechanic_notes of this CreateDvirParam.

        Any notes from the mechanic.  # noqa: E501

        :param mechanic_notes: The mechanic_notes of this CreateDvirParam.
        :type mechanic_notes: str
        """

        self._mechanic_notes = mechanic_notes

    @property
    def odometer_miles(self) -> int:
        """Gets the odometer_miles of this CreateDvirParam.

        The current odometer of the vehicle.  # noqa: E501

        :return: The odometer_miles of this CreateDvirParam.
        :rtype: int
        """
        return self._odometer_miles

    @odometer_miles.setter
    def odometer_miles(self, odometer_miles: int):
        """Sets the odometer_miles of this CreateDvirParam.

        The current odometer of the vehicle.  # noqa: E501

        :param odometer_miles: The odometer_miles of this CreateDvirParam.
        :type odometer_miles: int
        """

        self._odometer_miles = odometer_miles

    @property
    def previous_defects_corrected(self) -> bool:
        """Gets the previous_defects_corrected of this CreateDvirParam.

        Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :return: The previous_defects_corrected of this CreateDvirParam.
        :rtype: bool
        """
        return self._previous_defects_corrected

    @previous_defects_corrected.setter
    def previous_defects_corrected(self, previous_defects_corrected: bool):
        """Sets the previous_defects_corrected of this CreateDvirParam.

        Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :param previous_defects_corrected: The previous_defects_corrected of this CreateDvirParam.
        :type previous_defects_corrected: bool
        """

        self._previous_defects_corrected = previous_defects_corrected

    @property
    def previous_defects_ignored(self) -> bool:
        """Gets the previous_defects_ignored of this CreateDvirParam.

        Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :return: The previous_defects_ignored of this CreateDvirParam.
        :rtype: bool
        """
        return self._previous_defects_ignored

    @previous_defects_ignored.setter
    def previous_defects_ignored(self, previous_defects_ignored: bool):
        """Sets the previous_defects_ignored of this CreateDvirParam.

        Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :param previous_defects_ignored: The previous_defects_ignored of this CreateDvirParam.
        :type previous_defects_ignored: bool
        """

        self._previous_defects_ignored = previous_defects_ignored

    @property
    def safe(self) -> str:
        """Gets the safe of this CreateDvirParam.

        Whether or not this vehicle or trailer is safe to drive.  # noqa: E501

        :return: The safe of this CreateDvirParam.
        :rtype: str
        """
        return self._safe

    @safe.setter
    def safe(self, safe: str):
        """Sets the safe of this CreateDvirParam.

        Whether or not this vehicle or trailer is safe to drive.  # noqa: E501

        :param safe: The safe of this CreateDvirParam.
        :type safe: str
        """
        allowed_values = ["safe", "unsafe"]  # noqa: E501
        if safe not in allowed_values:
            raise ValueError(
                "Invalid value for `safe` ({0}), must be one of {1}"
                .format(safe, allowed_values)
            )

        self._safe = safe

    @property
    def trailer_id(self) -> int:
        """Gets the trailer_id of this CreateDvirParam.

        Id of trailer being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :return: The trailer_id of this CreateDvirParam.
        :rtype: int
        """
        return self._trailer_id

    @trailer_id.setter
    def trailer_id(self, trailer_id: int):
        """Sets the trailer_id of this CreateDvirParam.

        Id of trailer being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :param trailer_id: The trailer_id of this CreateDvirParam.
        :type trailer_id: int
        """

        self._trailer_id = trailer_id

    @property
    def user_email(self) -> str:
        """Gets the user_email of this CreateDvirParam.

        The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.  # noqa: E501

        :return: The user_email of this CreateDvirParam.
        :rtype: str
        """
        return self._user_email

    @user_email.setter
    def user_email(self, user_email: str):
        """Sets the user_email of this CreateDvirParam.

        The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.  # noqa: E501

        :param user_email: The user_email of this CreateDvirParam.
        :type user_email: str
        """
        if user_email is None:
            raise ValueError("Invalid value for `user_email`, must not be `None`")  # noqa: E501

        self._user_email = user_email

    @property
    def vehicle_id(self) -> int:
        """Gets the vehicle_id of this CreateDvirParam.

        Id of vehicle being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :return: The vehicle_id of this CreateDvirParam.
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id: int):
        """Sets the vehicle_id of this CreateDvirParam.

        Id of vehicle being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :param vehicle_id: The vehicle_id of this CreateDvirParam.
        :type vehicle_id: int
        """

        self._vehicle_id = vehicle_id
