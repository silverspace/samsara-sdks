# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class HosLogsSummaryResponseDrivers(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, time_until_break: int=None, vehicle_name: str=None, driving_in_violation_today: int=None, driver_id: int=None, cycle_remaining: int=None, driver_name: str=None, duty_status: str=None, cycle_tomorrow: int=None, shift_drive_remaining: int=None, time_in_current_status: int=None, driving_in_violation_cycle: int=None, shift_remaining: int=None):
        """HosLogsSummaryResponseDrivers - a model defined in OpenAPI

        :param time_until_break: The time_until_break of this HosLogsSummaryResponseDrivers.
        :param vehicle_name: The vehicle_name of this HosLogsSummaryResponseDrivers.
        :param driving_in_violation_today: The driving_in_violation_today of this HosLogsSummaryResponseDrivers.
        :param driver_id: The driver_id of this HosLogsSummaryResponseDrivers.
        :param cycle_remaining: The cycle_remaining of this HosLogsSummaryResponseDrivers.
        :param driver_name: The driver_name of this HosLogsSummaryResponseDrivers.
        :param duty_status: The duty_status of this HosLogsSummaryResponseDrivers.
        :param cycle_tomorrow: The cycle_tomorrow of this HosLogsSummaryResponseDrivers.
        :param shift_drive_remaining: The shift_drive_remaining of this HosLogsSummaryResponseDrivers.
        :param time_in_current_status: The time_in_current_status of this HosLogsSummaryResponseDrivers.
        :param driving_in_violation_cycle: The driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.
        :param shift_remaining: The shift_remaining of this HosLogsSummaryResponseDrivers.
        """
        self.openapi_types = {
            'time_until_break': int,
            'vehicle_name': str,
            'driving_in_violation_today': int,
            'driver_id': int,
            'cycle_remaining': int,
            'driver_name': str,
            'duty_status': str,
            'cycle_tomorrow': int,
            'shift_drive_remaining': int,
            'time_in_current_status': int,
            'driving_in_violation_cycle': int,
            'shift_remaining': int
        }

        self.attribute_map = {
            'time_until_break': 'timeUntilBreak',
            'vehicle_name': 'vehicleName',
            'driving_in_violation_today': 'drivingInViolationToday',
            'driver_id': 'driverId',
            'cycle_remaining': 'cycleRemaining',
            'driver_name': 'driverName',
            'duty_status': 'dutyStatus',
            'cycle_tomorrow': 'cycleTomorrow',
            'shift_drive_remaining': 'shiftDriveRemaining',
            'time_in_current_status': 'timeInCurrentStatus',
            'driving_in_violation_cycle': 'drivingInViolationCycle',
            'shift_remaining': 'shiftRemaining'
        }

        self._time_until_break = time_until_break
        self._vehicle_name = vehicle_name
        self._driving_in_violation_today = driving_in_violation_today
        self._driver_id = driver_id
        self._cycle_remaining = cycle_remaining
        self._driver_name = driver_name
        self._duty_status = duty_status
        self._cycle_tomorrow = cycle_tomorrow
        self._shift_drive_remaining = shift_drive_remaining
        self._time_in_current_status = time_in_current_status
        self._driving_in_violation_cycle = driving_in_violation_cycle
        self._shift_remaining = shift_remaining

    @classmethod
    def from_dict(cls, dikt: dict) -> 'HosLogsSummaryResponseDrivers':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The HosLogsSummaryResponse_drivers of this HosLogsSummaryResponseDrivers.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def time_until_break(self):
        """Gets the time_until_break of this HosLogsSummaryResponseDrivers.

        The amount of time (in ms) remaining until the driver cannot drive without a rest break.

        :return: The time_until_break of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._time_until_break

    @time_until_break.setter
    def time_until_break(self, time_until_break):
        """Sets the time_until_break of this HosLogsSummaryResponseDrivers.

        The amount of time (in ms) remaining until the driver cannot drive without a rest break.

        :param time_until_break: The time_until_break of this HosLogsSummaryResponseDrivers.
        :type time_until_break: int
        """

        self._time_until_break = time_until_break

    @property
    def vehicle_name(self):
        """Gets the vehicle_name of this HosLogsSummaryResponseDrivers.

        Name of the vehicle.

        :return: The vehicle_name of this HosLogsSummaryResponseDrivers.
        :rtype: str
        """
        return self._vehicle_name

    @vehicle_name.setter
    def vehicle_name(self, vehicle_name):
        """Sets the vehicle_name of this HosLogsSummaryResponseDrivers.

        Name of the vehicle.

        :param vehicle_name: The vehicle_name of this HosLogsSummaryResponseDrivers.
        :type vehicle_name: str
        """

        self._vehicle_name = vehicle_name

    @property
    def driving_in_violation_today(self):
        """Gets the driving_in_violation_today of this HosLogsSummaryResponseDrivers.

        The amount of driving time in violation today (in ms).

        :return: The driving_in_violation_today of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._driving_in_violation_today

    @driving_in_violation_today.setter
    def driving_in_violation_today(self, driving_in_violation_today):
        """Sets the driving_in_violation_today of this HosLogsSummaryResponseDrivers.

        The amount of driving time in violation today (in ms).

        :param driving_in_violation_today: The driving_in_violation_today of this HosLogsSummaryResponseDrivers.
        :type driving_in_violation_today: int
        """

        self._driving_in_violation_today = driving_in_violation_today

    @property
    def driver_id(self):
        """Gets the driver_id of this HosLogsSummaryResponseDrivers.

        ID of the driver.

        :return: The driver_id of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this HosLogsSummaryResponseDrivers.

        ID of the driver.

        :param driver_id: The driver_id of this HosLogsSummaryResponseDrivers.
        :type driver_id: int
        """

        self._driver_id = driver_id

    @property
    def cycle_remaining(self):
        """Gets the cycle_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining cycle time (in ms).

        :return: The cycle_remaining of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._cycle_remaining

    @cycle_remaining.setter
    def cycle_remaining(self, cycle_remaining):
        """Sets the cycle_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining cycle time (in ms).

        :param cycle_remaining: The cycle_remaining of this HosLogsSummaryResponseDrivers.
        :type cycle_remaining: int
        """

        self._cycle_remaining = cycle_remaining

    @property
    def driver_name(self):
        """Gets the driver_name of this HosLogsSummaryResponseDrivers.

        Name of the driver.

        :return: The driver_name of this HosLogsSummaryResponseDrivers.
        :rtype: str
        """
        return self._driver_name

    @driver_name.setter
    def driver_name(self, driver_name):
        """Sets the driver_name of this HosLogsSummaryResponseDrivers.

        Name of the driver.

        :param driver_name: The driver_name of this HosLogsSummaryResponseDrivers.
        :type driver_name: str
        """

        self._driver_name = driver_name

    @property
    def duty_status(self):
        """Gets the duty_status of this HosLogsSummaryResponseDrivers.

        The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.

        :return: The duty_status of this HosLogsSummaryResponseDrivers.
        :rtype: str
        """
        return self._duty_status

    @duty_status.setter
    def duty_status(self, duty_status):
        """Sets the duty_status of this HosLogsSummaryResponseDrivers.

        The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.

        :param duty_status: The duty_status of this HosLogsSummaryResponseDrivers.
        :type duty_status: str
        """

        self._duty_status = duty_status

    @property
    def cycle_tomorrow(self):
        """Gets the cycle_tomorrow of this HosLogsSummaryResponseDrivers.

        The amount of cycle time (in ms) available tomorrow.

        :return: The cycle_tomorrow of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._cycle_tomorrow

    @cycle_tomorrow.setter
    def cycle_tomorrow(self, cycle_tomorrow):
        """Sets the cycle_tomorrow of this HosLogsSummaryResponseDrivers.

        The amount of cycle time (in ms) available tomorrow.

        :param cycle_tomorrow: The cycle_tomorrow of this HosLogsSummaryResponseDrivers.
        :type cycle_tomorrow: int
        """

        self._cycle_tomorrow = cycle_tomorrow

    @property
    def shift_drive_remaining(self):
        """Gets the shift_drive_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining shift drive time (in ms).

        :return: The shift_drive_remaining of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._shift_drive_remaining

    @shift_drive_remaining.setter
    def shift_drive_remaining(self, shift_drive_remaining):
        """Sets the shift_drive_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining shift drive time (in ms).

        :param shift_drive_remaining: The shift_drive_remaining of this HosLogsSummaryResponseDrivers.
        :type shift_drive_remaining: int
        """

        self._shift_drive_remaining = shift_drive_remaining

    @property
    def time_in_current_status(self):
        """Gets the time_in_current_status of this HosLogsSummaryResponseDrivers.

        The amount of time (in ms) that the driver has been in the current `dutyStatus`.

        :return: The time_in_current_status of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._time_in_current_status

    @time_in_current_status.setter
    def time_in_current_status(self, time_in_current_status):
        """Sets the time_in_current_status of this HosLogsSummaryResponseDrivers.

        The amount of time (in ms) that the driver has been in the current `dutyStatus`.

        :param time_in_current_status: The time_in_current_status of this HosLogsSummaryResponseDrivers.
        :type time_in_current_status: int
        """

        self._time_in_current_status = time_in_current_status

    @property
    def driving_in_violation_cycle(self):
        """Gets the driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.

        The amount of driving time in violation in this cycle (in ms).

        :return: The driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._driving_in_violation_cycle

    @driving_in_violation_cycle.setter
    def driving_in_violation_cycle(self, driving_in_violation_cycle):
        """Sets the driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.

        The amount of driving time in violation in this cycle (in ms).

        :param driving_in_violation_cycle: The driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.
        :type driving_in_violation_cycle: int
        """

        self._driving_in_violation_cycle = driving_in_violation_cycle

    @property
    def shift_remaining(self):
        """Gets the shift_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining shift time (in ms).

        :return: The shift_remaining of this HosLogsSummaryResponseDrivers.
        :rtype: int
        """
        return self._shift_remaining

    @shift_remaining.setter
    def shift_remaining(self, shift_remaining):
        """Sets the shift_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining shift time (in ms).

        :param shift_remaining: The shift_remaining of this HosLogsSummaryResponseDrivers.
        :type shift_remaining: int
        """

        self._shift_remaining = shift_remaining
