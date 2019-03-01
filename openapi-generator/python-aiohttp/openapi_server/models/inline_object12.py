# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class InlineObject12(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, inspection_type: str=None, mechanic_notes: str=None, odometer_miles: int=None, previous_defects_corrected: bool=None, previous_defects_ignored: bool=None, safe: str=None, trailer_id: int=None, user_email: str=None, vehicle_id: int=None):
        """InlineObject12 - a model defined in OpenAPI

        :param inspection_type: The inspection_type of this InlineObject12.
        :param mechanic_notes: The mechanic_notes of this InlineObject12.
        :param odometer_miles: The odometer_miles of this InlineObject12.
        :param previous_defects_corrected: The previous_defects_corrected of this InlineObject12.
        :param previous_defects_ignored: The previous_defects_ignored of this InlineObject12.
        :param safe: The safe of this InlineObject12.
        :param trailer_id: The trailer_id of this InlineObject12.
        :param user_email: The user_email of this InlineObject12.
        :param vehicle_id: The vehicle_id of this InlineObject12.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'InlineObject12':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_object_12 of this InlineObject12.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def inspection_type(self):
        """Gets the inspection_type of this InlineObject12.

        Only type 'mechanic' is currently accepted.

        :return: The inspection_type of this InlineObject12.
        :rtype: str
        """
        return self._inspection_type

    @inspection_type.setter
    def inspection_type(self, inspection_type):
        """Sets the inspection_type of this InlineObject12.

        Only type 'mechanic' is currently accepted.

        :param inspection_type: The inspection_type of this InlineObject12.
        :type inspection_type: str
        """
        allowed_values = ["mechanic"]
        if inspection_type not in allowed_values:
            raise ValueError(
                "Invalid value for `inspection_type` ({0}), must be one of {1}"
                .format(inspection_type, allowed_values)
            )

        self._inspection_type = inspection_type

    @property
    def mechanic_notes(self):
        """Gets the mechanic_notes of this InlineObject12.

        Any notes from the mechanic.

        :return: The mechanic_notes of this InlineObject12.
        :rtype: str
        """
        return self._mechanic_notes

    @mechanic_notes.setter
    def mechanic_notes(self, mechanic_notes):
        """Sets the mechanic_notes of this InlineObject12.

        Any notes from the mechanic.

        :param mechanic_notes: The mechanic_notes of this InlineObject12.
        :type mechanic_notes: str
        """

        self._mechanic_notes = mechanic_notes

    @property
    def odometer_miles(self):
        """Gets the odometer_miles of this InlineObject12.

        The current odometer of the vehicle.

        :return: The odometer_miles of this InlineObject12.
        :rtype: int
        """
        return self._odometer_miles

    @odometer_miles.setter
    def odometer_miles(self, odometer_miles):
        """Sets the odometer_miles of this InlineObject12.

        The current odometer of the vehicle.

        :param odometer_miles: The odometer_miles of this InlineObject12.
        :type odometer_miles: int
        """

        self._odometer_miles = odometer_miles

    @property
    def previous_defects_corrected(self):
        """Gets the previous_defects_corrected of this InlineObject12.

        Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.

        :return: The previous_defects_corrected of this InlineObject12.
        :rtype: bool
        """
        return self._previous_defects_corrected

    @previous_defects_corrected.setter
    def previous_defects_corrected(self, previous_defects_corrected):
        """Sets the previous_defects_corrected of this InlineObject12.

        Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.

        :param previous_defects_corrected: The previous_defects_corrected of this InlineObject12.
        :type previous_defects_corrected: bool
        """

        self._previous_defects_corrected = previous_defects_corrected

    @property
    def previous_defects_ignored(self):
        """Gets the previous_defects_ignored of this InlineObject12.

        Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.

        :return: The previous_defects_ignored of this InlineObject12.
        :rtype: bool
        """
        return self._previous_defects_ignored

    @previous_defects_ignored.setter
    def previous_defects_ignored(self, previous_defects_ignored):
        """Sets the previous_defects_ignored of this InlineObject12.

        Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.

        :param previous_defects_ignored: The previous_defects_ignored of this InlineObject12.
        :type previous_defects_ignored: bool
        """

        self._previous_defects_ignored = previous_defects_ignored

    @property
    def safe(self):
        """Gets the safe of this InlineObject12.

        Whether or not this vehicle or trailer is safe to drive.

        :return: The safe of this InlineObject12.
        :rtype: str
        """
        return self._safe

    @safe.setter
    def safe(self, safe):
        """Sets the safe of this InlineObject12.

        Whether or not this vehicle or trailer is safe to drive.

        :param safe: The safe of this InlineObject12.
        :type safe: str
        """
        allowed_values = ["safe", "unsafe"]
        if safe not in allowed_values:
            raise ValueError(
                "Invalid value for `safe` ({0}), must be one of {1}"
                .format(safe, allowed_values)
            )

        self._safe = safe

    @property
    def trailer_id(self):
        """Gets the trailer_id of this InlineObject12.

        Id of trailer being inspected. Either vehicleId or trailerId must be provided.

        :return: The trailer_id of this InlineObject12.
        :rtype: int
        """
        return self._trailer_id

    @trailer_id.setter
    def trailer_id(self, trailer_id):
        """Sets the trailer_id of this InlineObject12.

        Id of trailer being inspected. Either vehicleId or trailerId must be provided.

        :param trailer_id: The trailer_id of this InlineObject12.
        :type trailer_id: int
        """

        self._trailer_id = trailer_id

    @property
    def user_email(self):
        """Gets the user_email of this InlineObject12.

        The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.

        :return: The user_email of this InlineObject12.
        :rtype: str
        """
        return self._user_email

    @user_email.setter
    def user_email(self, user_email):
        """Sets the user_email of this InlineObject12.

        The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.

        :param user_email: The user_email of this InlineObject12.
        :type user_email: str
        """
        if user_email is None:
            raise ValueError("Invalid value for `user_email`, must not be `None`")

        self._user_email = user_email

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this InlineObject12.

        Id of vehicle being inspected. Either vehicleId or trailerId must be provided.

        :return: The vehicle_id of this InlineObject12.
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this InlineObject12.

        Id of vehicle being inspected. Either vehicleId or trailerId must be provided.

        :param vehicle_id: The vehicle_id of this InlineObject12.
        :type vehicle_id: int
        """

        self._vehicle_id = vehicle_id
