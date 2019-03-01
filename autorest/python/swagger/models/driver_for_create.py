# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .driver_base import DriverBase


class DriverForCreate(DriverBase):
    """DriverForCreate.

    :param eld_adverse_weather_exemption_enabled: Flag indicating this driver
     may use Adverse Weather exemptions in ELD logs.
    :type eld_adverse_weather_exemption_enabled: bool
    :param eld_big_day_exemption_enabled: Flag indicating this driver may use
     Big Day excemptions in ELD logs.
    :type eld_big_day_exemption_enabled: bool
    :param eld_day_start_hour: 0 indicating midnight-to-midnight ELD driving
     hours, 12 to indicate noon-to-noon driving hours.
    :type eld_day_start_hour: int
    :param eld_exempt: Flag indicating this driver is exempt from the
     Electronic Logging Mandate.
    :type eld_exempt: bool
    :param eld_exempt_reason: Reason that this driver is exempt from the
     Electronic Logging Mandate (see eldExempt).
    :type eld_exempt_reason: str
    :param eld_pc_enabled: Flag indicating this driver may select the Personal
     Conveyance duty status in ELD logs. Default value: False .
    :type eld_pc_enabled: bool
    :param eld_ym_enabled: Flag indicating this driver may select the Yard
     Move duty status in ELD logs. Default value: False .
    :type eld_ym_enabled: bool
    :param external_ids: Dictionary of external IDs (string key-value pairs)
    :type external_ids: dict[str, str]
    :param group_id: ID of the group if the organization has multiple groups
     (uncommon).
    :type group_id: long
    :param license_number: Driver's state issued license number.
    :type license_number: str
    :param license_state: Abbreviation of state that issued driver's license.
    :type license_state: str
    :param name: Driver's name.
    :type name: str
    :param notes: Notes about the driver.
    :type notes: str
    :param phone: Driver's phone number. Please include only digits, ex.
     4157771234
    :type phone: str
    :param username: Driver's login username into the driver app.
    :type username: str
    :param vehicle_id: ID of the vehicle assigned to the driver for static
     vehicle assignments. (uncommon).
    :type vehicle_id: long
    :param password: Driver's password for the driver app.
    :type password: str
    :param tag_ids:
    :type tag_ids: list[float]
    """

    _validation = {
        'name': {'required': True},
        'password': {'required': True},
    }

    _attribute_map = {
        'eld_adverse_weather_exemption_enabled': {'key': 'eldAdverseWeatherExemptionEnabled', 'type': 'bool'},
        'eld_big_day_exemption_enabled': {'key': 'eldBigDayExemptionEnabled', 'type': 'bool'},
        'eld_day_start_hour': {'key': 'eldDayStartHour', 'type': 'int'},
        'eld_exempt': {'key': 'eldExempt', 'type': 'bool'},
        'eld_exempt_reason': {'key': 'eldExemptReason', 'type': 'str'},
        'eld_pc_enabled': {'key': 'eldPcEnabled', 'type': 'bool'},
        'eld_ym_enabled': {'key': 'eldYmEnabled', 'type': 'bool'},
        'external_ids': {'key': 'externalIds', 'type': '{str}'},
        'group_id': {'key': 'groupId', 'type': 'long'},
        'license_number': {'key': 'licenseNumber', 'type': 'str'},
        'license_state': {'key': 'licenseState', 'type': 'str'},
        'name': {'key': 'name', 'type': 'str'},
        'notes': {'key': 'notes', 'type': 'str'},
        'phone': {'key': 'phone', 'type': 'str'},
        'username': {'key': 'username', 'type': 'str'},
        'vehicle_id': {'key': 'vehicleId', 'type': 'long'},
        'password': {'key': 'password', 'type': 'str'},
        'tag_ids': {'key': 'tagIds', 'type': '[float]'},
    }

    def __init__(self, name, password, eld_adverse_weather_exemption_enabled=None, eld_big_day_exemption_enabled=None, eld_day_start_hour=None, eld_exempt=None, eld_exempt_reason=None, eld_pc_enabled=False, eld_ym_enabled=False, external_ids=None, group_id=None, license_number=None, license_state=None, notes=None, phone=None, username=None, vehicle_id=None, tag_ids=None):
        super(DriverForCreate, self).__init__(eld_adverse_weather_exemption_enabled=eld_adverse_weather_exemption_enabled, eld_big_day_exemption_enabled=eld_big_day_exemption_enabled, eld_day_start_hour=eld_day_start_hour, eld_exempt=eld_exempt, eld_exempt_reason=eld_exempt_reason, eld_pc_enabled=eld_pc_enabled, eld_ym_enabled=eld_ym_enabled, external_ids=external_ids, group_id=group_id, license_number=license_number, license_state=license_state, name=name, notes=notes, phone=phone, username=username, vehicle_id=vehicle_id)
        self.password = password
        self.tag_ids = tag_ids