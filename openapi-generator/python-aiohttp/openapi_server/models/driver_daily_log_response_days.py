# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DriverDailyLogResponseDays(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, certified_at_ms: int=None, end_ms: int=None, start_ms: int=None, trailer_ids: object=None, active_hours: float=None, distance_miles: float=None, active_ms: int=None, certified: bool=None, vehicle_ids: object=None):
        """DriverDailyLogResponseDays - a model defined in OpenAPI

        :param certified_at_ms: The certified_at_ms of this DriverDailyLogResponseDays.
        :param end_ms: The end_ms of this DriverDailyLogResponseDays.
        :param start_ms: The start_ms of this DriverDailyLogResponseDays.
        :param trailer_ids: The trailer_ids of this DriverDailyLogResponseDays.
        :param active_hours: The active_hours of this DriverDailyLogResponseDays.
        :param distance_miles: The distance_miles of this DriverDailyLogResponseDays.
        :param active_ms: The active_ms of this DriverDailyLogResponseDays.
        :param certified: The certified of this DriverDailyLogResponseDays.
        :param vehicle_ids: The vehicle_ids of this DriverDailyLogResponseDays.
        """
        self.openapi_types = {
            'certified_at_ms': int,
            'end_ms': int,
            'start_ms': int,
            'trailer_ids': object,
            'active_hours': float,
            'distance_miles': float,
            'active_ms': int,
            'certified': bool,
            'vehicle_ids': object
        }

        self.attribute_map = {
            'certified_at_ms': 'certifiedAtMs',
            'end_ms': 'endMs',
            'start_ms': 'startMs',
            'trailer_ids': 'trailerIds',
            'active_hours': 'activeHours',
            'distance_miles': 'distanceMiles',
            'active_ms': 'activeMs',
            'certified': 'certified',
            'vehicle_ids': 'vehicleIds'
        }

        self._certified_at_ms = certified_at_ms
        self._end_ms = end_ms
        self._start_ms = start_ms
        self._trailer_ids = trailer_ids
        self._active_hours = active_hours
        self._distance_miles = distance_miles
        self._active_ms = active_ms
        self._certified = certified
        self._vehicle_ids = vehicle_ids

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DriverDailyLogResponseDays':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DriverDailyLogResponse_days of this DriverDailyLogResponseDays.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def certified_at_ms(self):
        """Gets the certified_at_ms of this DriverDailyLogResponseDays.

        Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.

        :return: The certified_at_ms of this DriverDailyLogResponseDays.
        :rtype: int
        """
        return self._certified_at_ms

    @certified_at_ms.setter
    def certified_at_ms(self, certified_at_ms):
        """Sets the certified_at_ms of this DriverDailyLogResponseDays.

        Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.

        :param certified_at_ms: The certified_at_ms of this DriverDailyLogResponseDays.
        :type certified_at_ms: int
        """

        self._certified_at_ms = certified_at_ms

    @property
    def end_ms(self):
        """Gets the end_ms of this DriverDailyLogResponseDays.

        End of the HOS day, specified in milliseconds UNIX time.

        :return: The end_ms of this DriverDailyLogResponseDays.
        :rtype: int
        """
        return self._end_ms

    @end_ms.setter
    def end_ms(self, end_ms):
        """Sets the end_ms of this DriverDailyLogResponseDays.

        End of the HOS day, specified in milliseconds UNIX time.

        :param end_ms: The end_ms of this DriverDailyLogResponseDays.
        :type end_ms: int
        """

        self._end_ms = end_ms

    @property
    def start_ms(self):
        """Gets the start_ms of this DriverDailyLogResponseDays.

        End of the HOS day, specified in milliseconds UNIX time.

        :return: The start_ms of this DriverDailyLogResponseDays.
        :rtype: int
        """
        return self._start_ms

    @start_ms.setter
    def start_ms(self, start_ms):
        """Sets the start_ms of this DriverDailyLogResponseDays.

        End of the HOS day, specified in milliseconds UNIX time.

        :param start_ms: The start_ms of this DriverDailyLogResponseDays.
        :type start_ms: int
        """

        self._start_ms = start_ms

    @property
    def trailer_ids(self):
        """Gets the trailer_ids of this DriverDailyLogResponseDays.

        List of trailer ID's associated with the driver for the day.

        :return: The trailer_ids of this DriverDailyLogResponseDays.
        :rtype: object
        """
        return self._trailer_ids

    @trailer_ids.setter
    def trailer_ids(self, trailer_ids):
        """Sets the trailer_ids of this DriverDailyLogResponseDays.

        List of trailer ID's associated with the driver for the day.

        :param trailer_ids: The trailer_ids of this DriverDailyLogResponseDays.
        :type trailer_ids: object
        """

        self._trailer_ids = trailer_ids

    @property
    def active_hours(self):
        """Gets the active_hours of this DriverDailyLogResponseDays.

        Hours spent on duty or driving, rounded to two decimal places.

        :return: The active_hours of this DriverDailyLogResponseDays.
        :rtype: float
        """
        return self._active_hours

    @active_hours.setter
    def active_hours(self, active_hours):
        """Sets the active_hours of this DriverDailyLogResponseDays.

        Hours spent on duty or driving, rounded to two decimal places.

        :param active_hours: The active_hours of this DriverDailyLogResponseDays.
        :type active_hours: float
        """

        self._active_hours = active_hours

    @property
    def distance_miles(self):
        """Gets the distance_miles of this DriverDailyLogResponseDays.

        Distance driven in miles, rounded to two decimal places.

        :return: The distance_miles of this DriverDailyLogResponseDays.
        :rtype: float
        """
        return self._distance_miles

    @distance_miles.setter
    def distance_miles(self, distance_miles):
        """Sets the distance_miles of this DriverDailyLogResponseDays.

        Distance driven in miles, rounded to two decimal places.

        :param distance_miles: The distance_miles of this DriverDailyLogResponseDays.
        :type distance_miles: float
        """

        self._distance_miles = distance_miles

    @property
    def active_ms(self):
        """Gets the active_ms of this DriverDailyLogResponseDays.

        Milliseconds spent on duty or driving.

        :return: The active_ms of this DriverDailyLogResponseDays.
        :rtype: int
        """
        return self._active_ms

    @active_ms.setter
    def active_ms(self, active_ms):
        """Sets the active_ms of this DriverDailyLogResponseDays.

        Milliseconds spent on duty or driving.

        :param active_ms: The active_ms of this DriverDailyLogResponseDays.
        :type active_ms: int
        """

        self._active_ms = active_ms

    @property
    def certified(self):
        """Gets the certified of this DriverDailyLogResponseDays.

        Whether this HOS day chart was certified by the driver.

        :return: The certified of this DriverDailyLogResponseDays.
        :rtype: bool
        """
        return self._certified

    @certified.setter
    def certified(self, certified):
        """Sets the certified of this DriverDailyLogResponseDays.

        Whether this HOS day chart was certified by the driver.

        :param certified: The certified of this DriverDailyLogResponseDays.
        :type certified: bool
        """

        self._certified = certified

    @property
    def vehicle_ids(self):
        """Gets the vehicle_ids of this DriverDailyLogResponseDays.

        List of vehicle ID's associated with the driver for the day.

        :return: The vehicle_ids of this DriverDailyLogResponseDays.
        :rtype: object
        """
        return self._vehicle_ids

    @vehicle_ids.setter
    def vehicle_ids(self, vehicle_ids):
        """Sets the vehicle_ids of this DriverDailyLogResponseDays.

        List of vehicle ID's associated with the driver for the day.

        :param vehicle_ids: The vehicle_ids of this DriverDailyLogResponseDays.
        :type vehicle_ids: object
        """

        self._vehicle_ids = vehicle_ids
