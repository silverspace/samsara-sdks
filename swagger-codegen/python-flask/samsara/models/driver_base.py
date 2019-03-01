# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class DriverBase(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, eld_adverse_weather_exemption_enabled: bool=None, eld_big_day_exemption_enabled: bool=None, eld_day_start_hour: int=None, eld_exempt: bool=None, eld_exempt_reason: str=None, eld_pc_enabled: bool=False, eld_ym_enabled: bool=False, external_ids: Dict[str, str]=None, group_id: int=None, license_number: str=None, license_state: str=None, name: str=None, notes: str=None, phone: str=None, username: str=None, vehicle_id: int=None):  # noqa: E501
        """DriverBase - a model defined in Swagger

        :param eld_adverse_weather_exemption_enabled: The eld_adverse_weather_exemption_enabled of this DriverBase.  # noqa: E501
        :type eld_adverse_weather_exemption_enabled: bool
        :param eld_big_day_exemption_enabled: The eld_big_day_exemption_enabled of this DriverBase.  # noqa: E501
        :type eld_big_day_exemption_enabled: bool
        :param eld_day_start_hour: The eld_day_start_hour of this DriverBase.  # noqa: E501
        :type eld_day_start_hour: int
        :param eld_exempt: The eld_exempt of this DriverBase.  # noqa: E501
        :type eld_exempt: bool
        :param eld_exempt_reason: The eld_exempt_reason of this DriverBase.  # noqa: E501
        :type eld_exempt_reason: str
        :param eld_pc_enabled: The eld_pc_enabled of this DriverBase.  # noqa: E501
        :type eld_pc_enabled: bool
        :param eld_ym_enabled: The eld_ym_enabled of this DriverBase.  # noqa: E501
        :type eld_ym_enabled: bool
        :param external_ids: The external_ids of this DriverBase.  # noqa: E501
        :type external_ids: Dict[str, str]
        :param group_id: The group_id of this DriverBase.  # noqa: E501
        :type group_id: int
        :param license_number: The license_number of this DriverBase.  # noqa: E501
        :type license_number: str
        :param license_state: The license_state of this DriverBase.  # noqa: E501
        :type license_state: str
        :param name: The name of this DriverBase.  # noqa: E501
        :type name: str
        :param notes: The notes of this DriverBase.  # noqa: E501
        :type notes: str
        :param phone: The phone of this DriverBase.  # noqa: E501
        :type phone: str
        :param username: The username of this DriverBase.  # noqa: E501
        :type username: str
        :param vehicle_id: The vehicle_id of this DriverBase.  # noqa: E501
        :type vehicle_id: int
        """
        self.swagger_types = {
            'eld_adverse_weather_exemption_enabled': bool,
            'eld_big_day_exemption_enabled': bool,
            'eld_day_start_hour': int,
            'eld_exempt': bool,
            'eld_exempt_reason': str,
            'eld_pc_enabled': bool,
            'eld_ym_enabled': bool,
            'external_ids': Dict[str, str],
            'group_id': int,
            'license_number': str,
            'license_state': str,
            'name': str,
            'notes': str,
            'phone': str,
            'username': str,
            'vehicle_id': int
        }

        self.attribute_map = {
            'eld_adverse_weather_exemption_enabled': 'eldAdverseWeatherExemptionEnabled',
            'eld_big_day_exemption_enabled': 'eldBigDayExemptionEnabled',
            'eld_day_start_hour': 'eldDayStartHour',
            'eld_exempt': 'eldExempt',
            'eld_exempt_reason': 'eldExemptReason',
            'eld_pc_enabled': 'eldPcEnabled',
            'eld_ym_enabled': 'eldYmEnabled',
            'external_ids': 'externalIds',
            'group_id': 'groupId',
            'license_number': 'licenseNumber',
            'license_state': 'licenseState',
            'name': 'name',
            'notes': 'notes',
            'phone': 'phone',
            'username': 'username',
            'vehicle_id': 'vehicleId'
        }

        self._eld_adverse_weather_exemption_enabled = eld_adverse_weather_exemption_enabled
        self._eld_big_day_exemption_enabled = eld_big_day_exemption_enabled
        self._eld_day_start_hour = eld_day_start_hour
        self._eld_exempt = eld_exempt
        self._eld_exempt_reason = eld_exempt_reason
        self._eld_pc_enabled = eld_pc_enabled
        self._eld_ym_enabled = eld_ym_enabled
        self._external_ids = external_ids
        self._group_id = group_id
        self._license_number = license_number
        self._license_state = license_state
        self._name = name
        self._notes = notes
        self._phone = phone
        self._username = username
        self._vehicle_id = vehicle_id

    @classmethod
    def from_dict(cls, dikt) -> 'DriverBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DriverBase of this DriverBase.  # noqa: E501
        :rtype: DriverBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def eld_adverse_weather_exemption_enabled(self) -> bool:
        """Gets the eld_adverse_weather_exemption_enabled of this DriverBase.

        Flag indicating this driver may use Adverse Weather exemptions in ELD logs.  # noqa: E501

        :return: The eld_adverse_weather_exemption_enabled of this DriverBase.
        :rtype: bool
        """
        return self._eld_adverse_weather_exemption_enabled

    @eld_adverse_weather_exemption_enabled.setter
    def eld_adverse_weather_exemption_enabled(self, eld_adverse_weather_exemption_enabled: bool):
        """Sets the eld_adverse_weather_exemption_enabled of this DriverBase.

        Flag indicating this driver may use Adverse Weather exemptions in ELD logs.  # noqa: E501

        :param eld_adverse_weather_exemption_enabled: The eld_adverse_weather_exemption_enabled of this DriverBase.
        :type eld_adverse_weather_exemption_enabled: bool
        """

        self._eld_adverse_weather_exemption_enabled = eld_adverse_weather_exemption_enabled

    @property
    def eld_big_day_exemption_enabled(self) -> bool:
        """Gets the eld_big_day_exemption_enabled of this DriverBase.

        Flag indicating this driver may use Big Day excemptions in ELD logs.  # noqa: E501

        :return: The eld_big_day_exemption_enabled of this DriverBase.
        :rtype: bool
        """
        return self._eld_big_day_exemption_enabled

    @eld_big_day_exemption_enabled.setter
    def eld_big_day_exemption_enabled(self, eld_big_day_exemption_enabled: bool):
        """Sets the eld_big_day_exemption_enabled of this DriverBase.

        Flag indicating this driver may use Big Day excemptions in ELD logs.  # noqa: E501

        :param eld_big_day_exemption_enabled: The eld_big_day_exemption_enabled of this DriverBase.
        :type eld_big_day_exemption_enabled: bool
        """

        self._eld_big_day_exemption_enabled = eld_big_day_exemption_enabled

    @property
    def eld_day_start_hour(self) -> int:
        """Gets the eld_day_start_hour of this DriverBase.

        0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.  # noqa: E501

        :return: The eld_day_start_hour of this DriverBase.
        :rtype: int
        """
        return self._eld_day_start_hour

    @eld_day_start_hour.setter
    def eld_day_start_hour(self, eld_day_start_hour: int):
        """Sets the eld_day_start_hour of this DriverBase.

        0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.  # noqa: E501

        :param eld_day_start_hour: The eld_day_start_hour of this DriverBase.
        :type eld_day_start_hour: int
        """

        self._eld_day_start_hour = eld_day_start_hour

    @property
    def eld_exempt(self) -> bool:
        """Gets the eld_exempt of this DriverBase.

        Flag indicating this driver is exempt from the Electronic Logging Mandate.  # noqa: E501

        :return: The eld_exempt of this DriverBase.
        :rtype: bool
        """
        return self._eld_exempt

    @eld_exempt.setter
    def eld_exempt(self, eld_exempt: bool):
        """Sets the eld_exempt of this DriverBase.

        Flag indicating this driver is exempt from the Electronic Logging Mandate.  # noqa: E501

        :param eld_exempt: The eld_exempt of this DriverBase.
        :type eld_exempt: bool
        """

        self._eld_exempt = eld_exempt

    @property
    def eld_exempt_reason(self) -> str:
        """Gets the eld_exempt_reason of this DriverBase.

        Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).  # noqa: E501

        :return: The eld_exempt_reason of this DriverBase.
        :rtype: str
        """
        return self._eld_exempt_reason

    @eld_exempt_reason.setter
    def eld_exempt_reason(self, eld_exempt_reason: str):
        """Sets the eld_exempt_reason of this DriverBase.

        Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).  # noqa: E501

        :param eld_exempt_reason: The eld_exempt_reason of this DriverBase.
        :type eld_exempt_reason: str
        """

        self._eld_exempt_reason = eld_exempt_reason

    @property
    def eld_pc_enabled(self) -> bool:
        """Gets the eld_pc_enabled of this DriverBase.

        Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.  # noqa: E501

        :return: The eld_pc_enabled of this DriverBase.
        :rtype: bool
        """
        return self._eld_pc_enabled

    @eld_pc_enabled.setter
    def eld_pc_enabled(self, eld_pc_enabled: bool):
        """Sets the eld_pc_enabled of this DriverBase.

        Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.  # noqa: E501

        :param eld_pc_enabled: The eld_pc_enabled of this DriverBase.
        :type eld_pc_enabled: bool
        """

        self._eld_pc_enabled = eld_pc_enabled

    @property
    def eld_ym_enabled(self) -> bool:
        """Gets the eld_ym_enabled of this DriverBase.

        Flag indicating this driver may select the Yard Move duty status in ELD logs.  # noqa: E501

        :return: The eld_ym_enabled of this DriverBase.
        :rtype: bool
        """
        return self._eld_ym_enabled

    @eld_ym_enabled.setter
    def eld_ym_enabled(self, eld_ym_enabled: bool):
        """Sets the eld_ym_enabled of this DriverBase.

        Flag indicating this driver may select the Yard Move duty status in ELD logs.  # noqa: E501

        :param eld_ym_enabled: The eld_ym_enabled of this DriverBase.
        :type eld_ym_enabled: bool
        """

        self._eld_ym_enabled = eld_ym_enabled

    @property
    def external_ids(self) -> Dict[str, str]:
        """Gets the external_ids of this DriverBase.

        Dictionary of external IDs (string key-value pairs)  # noqa: E501

        :return: The external_ids of this DriverBase.
        :rtype: Dict[str, str]
        """
        return self._external_ids

    @external_ids.setter
    def external_ids(self, external_ids: Dict[str, str]):
        """Sets the external_ids of this DriverBase.

        Dictionary of external IDs (string key-value pairs)  # noqa: E501

        :param external_ids: The external_ids of this DriverBase.
        :type external_ids: Dict[str, str]
        """

        self._external_ids = external_ids

    @property
    def group_id(self) -> int:
        """Gets the group_id of this DriverBase.

        ID of the group if the organization has multiple groups (uncommon).  # noqa: E501

        :return: The group_id of this DriverBase.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this DriverBase.

        ID of the group if the organization has multiple groups (uncommon).  # noqa: E501

        :param group_id: The group_id of this DriverBase.
        :type group_id: int
        """

        self._group_id = group_id

    @property
    def license_number(self) -> str:
        """Gets the license_number of this DriverBase.

        Driver's state issued license number.  # noqa: E501

        :return: The license_number of this DriverBase.
        :rtype: str
        """
        return self._license_number

    @license_number.setter
    def license_number(self, license_number: str):
        """Sets the license_number of this DriverBase.

        Driver's state issued license number.  # noqa: E501

        :param license_number: The license_number of this DriverBase.
        :type license_number: str
        """

        self._license_number = license_number

    @property
    def license_state(self) -> str:
        """Gets the license_state of this DriverBase.

        Abbreviation of state that issued driver's license.  # noqa: E501

        :return: The license_state of this DriverBase.
        :rtype: str
        """
        return self._license_state

    @license_state.setter
    def license_state(self, license_state: str):
        """Sets the license_state of this DriverBase.

        Abbreviation of state that issued driver's license.  # noqa: E501

        :param license_state: The license_state of this DriverBase.
        :type license_state: str
        """

        self._license_state = license_state

    @property
    def name(self) -> str:
        """Gets the name of this DriverBase.

        Driver's name.  # noqa: E501

        :return: The name of this DriverBase.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this DriverBase.

        Driver's name.  # noqa: E501

        :param name: The name of this DriverBase.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def notes(self) -> str:
        """Gets the notes of this DriverBase.

        Notes about the driver.  # noqa: E501

        :return: The notes of this DriverBase.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes: str):
        """Sets the notes of this DriverBase.

        Notes about the driver.  # noqa: E501

        :param notes: The notes of this DriverBase.
        :type notes: str
        """

        self._notes = notes

    @property
    def phone(self) -> str:
        """Gets the phone of this DriverBase.

        Driver's phone number. Please include only digits, ex. 4157771234  # noqa: E501

        :return: The phone of this DriverBase.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone: str):
        """Sets the phone of this DriverBase.

        Driver's phone number. Please include only digits, ex. 4157771234  # noqa: E501

        :param phone: The phone of this DriverBase.
        :type phone: str
        """

        self._phone = phone

    @property
    def username(self) -> str:
        """Gets the username of this DriverBase.

        Driver's login username into the driver app.  # noqa: E501

        :return: The username of this DriverBase.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username: str):
        """Sets the username of this DriverBase.

        Driver's login username into the driver app.  # noqa: E501

        :param username: The username of this DriverBase.
        :type username: str
        """

        self._username = username

    @property
    def vehicle_id(self) -> int:
        """Gets the vehicle_id of this DriverBase.

        ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).  # noqa: E501

        :return: The vehicle_id of this DriverBase.
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id: int):
        """Sets the vehicle_id of this DriverBase.

        ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).  # noqa: E501

        :param vehicle_id: The vehicle_id of this DriverBase.
        :type vehicle_id: int
        """

        self._vehicle_id = vehicle_id