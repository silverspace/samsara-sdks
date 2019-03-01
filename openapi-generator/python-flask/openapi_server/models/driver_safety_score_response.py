# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.safety_report_harsh_event import SafetyReportHarshEvent
from openapi_server import util

from openapi_server.models.safety_report_harsh_event import SafetyReportHarshEvent  # noqa: E501

class DriverSafetyScoreResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, crash_count=None, driver_id=None, harsh_accel_count=None, harsh_braking_count=None, harsh_events=None, harsh_turning_count=None, safety_score=None, safety_score_rank=None, time_over_speed_limit_ms=None, total_distance_driven_meters=None, total_harsh_event_count=None, total_time_driven_ms=None):  # noqa: E501
        """DriverSafetyScoreResponse - a model defined in OpenAPI

        :param crash_count: The crash_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type crash_count: int
        :param driver_id: The driver_id of this DriverSafetyScoreResponse.  # noqa: E501
        :type driver_id: int
        :param harsh_accel_count: The harsh_accel_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type harsh_accel_count: int
        :param harsh_braking_count: The harsh_braking_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type harsh_braking_count: int
        :param harsh_events: The harsh_events of this DriverSafetyScoreResponse.  # noqa: E501
        :type harsh_events: List[SafetyReportHarshEvent]
        :param harsh_turning_count: The harsh_turning_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type harsh_turning_count: int
        :param safety_score: The safety_score of this DriverSafetyScoreResponse.  # noqa: E501
        :type safety_score: int
        :param safety_score_rank: The safety_score_rank of this DriverSafetyScoreResponse.  # noqa: E501
        :type safety_score_rank: str
        :param time_over_speed_limit_ms: The time_over_speed_limit_ms of this DriverSafetyScoreResponse.  # noqa: E501
        :type time_over_speed_limit_ms: int
        :param total_distance_driven_meters: The total_distance_driven_meters of this DriverSafetyScoreResponse.  # noqa: E501
        :type total_distance_driven_meters: int
        :param total_harsh_event_count: The total_harsh_event_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type total_harsh_event_count: int
        :param total_time_driven_ms: The total_time_driven_ms of this DriverSafetyScoreResponse.  # noqa: E501
        :type total_time_driven_ms: int
        """
        self.openapi_types = {
            'crash_count': int,
            'driver_id': int,
            'harsh_accel_count': int,
            'harsh_braking_count': int,
            'harsh_events': List[SafetyReportHarshEvent],
            'harsh_turning_count': int,
            'safety_score': int,
            'safety_score_rank': str,
            'time_over_speed_limit_ms': int,
            'total_distance_driven_meters': int,
            'total_harsh_event_count': int,
            'total_time_driven_ms': int
        }

        self.attribute_map = {
            'crash_count': 'crashCount',
            'driver_id': 'driverId',
            'harsh_accel_count': 'harshAccelCount',
            'harsh_braking_count': 'harshBrakingCount',
            'harsh_events': 'harshEvents',
            'harsh_turning_count': 'harshTurningCount',
            'safety_score': 'safetyScore',
            'safety_score_rank': 'safetyScoreRank',
            'time_over_speed_limit_ms': 'timeOverSpeedLimitMs',
            'total_distance_driven_meters': 'totalDistanceDrivenMeters',
            'total_harsh_event_count': 'totalHarshEventCount',
            'total_time_driven_ms': 'totalTimeDrivenMs'
        }

        self._crash_count = crash_count
        self._driver_id = driver_id
        self._harsh_accel_count = harsh_accel_count
        self._harsh_braking_count = harsh_braking_count
        self._harsh_events = harsh_events
        self._harsh_turning_count = harsh_turning_count
        self._safety_score = safety_score
        self._safety_score_rank = safety_score_rank
        self._time_over_speed_limit_ms = time_over_speed_limit_ms
        self._total_distance_driven_meters = total_distance_driven_meters
        self._total_harsh_event_count = total_harsh_event_count
        self._total_time_driven_ms = total_time_driven_ms

    @classmethod
    def from_dict(cls, dikt) -> 'DriverSafetyScoreResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DriverSafetyScoreResponse of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: DriverSafetyScoreResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def crash_count(self):
        """Gets the crash_count of this DriverSafetyScoreResponse.

        Crash event count  # noqa: E501

        :return: The crash_count of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._crash_count

    @crash_count.setter
    def crash_count(self, crash_count):
        """Sets the crash_count of this DriverSafetyScoreResponse.

        Crash event count  # noqa: E501

        :param crash_count: The crash_count of this DriverSafetyScoreResponse.
        :type crash_count: int
        """

        self._crash_count = crash_count

    @property
    def driver_id(self):
        """Gets the driver_id of this DriverSafetyScoreResponse.

        Driver ID  # noqa: E501

        :return: The driver_id of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DriverSafetyScoreResponse.

        Driver ID  # noqa: E501

        :param driver_id: The driver_id of this DriverSafetyScoreResponse.
        :type driver_id: int
        """

        self._driver_id = driver_id

    @property
    def harsh_accel_count(self):
        """Gets the harsh_accel_count of this DriverSafetyScoreResponse.

        Harsh acceleration event count  # noqa: E501

        :return: The harsh_accel_count of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._harsh_accel_count

    @harsh_accel_count.setter
    def harsh_accel_count(self, harsh_accel_count):
        """Sets the harsh_accel_count of this DriverSafetyScoreResponse.

        Harsh acceleration event count  # noqa: E501

        :param harsh_accel_count: The harsh_accel_count of this DriverSafetyScoreResponse.
        :type harsh_accel_count: int
        """

        self._harsh_accel_count = harsh_accel_count

    @property
    def harsh_braking_count(self):
        """Gets the harsh_braking_count of this DriverSafetyScoreResponse.

        Harsh braking event count  # noqa: E501

        :return: The harsh_braking_count of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._harsh_braking_count

    @harsh_braking_count.setter
    def harsh_braking_count(self, harsh_braking_count):
        """Sets the harsh_braking_count of this DriverSafetyScoreResponse.

        Harsh braking event count  # noqa: E501

        :param harsh_braking_count: The harsh_braking_count of this DriverSafetyScoreResponse.
        :type harsh_braking_count: int
        """

        self._harsh_braking_count = harsh_braking_count

    @property
    def harsh_events(self):
        """Gets the harsh_events of this DriverSafetyScoreResponse.


        :return: The harsh_events of this DriverSafetyScoreResponse.
        :rtype: List[SafetyReportHarshEvent]
        """
        return self._harsh_events

    @harsh_events.setter
    def harsh_events(self, harsh_events):
        """Sets the harsh_events of this DriverSafetyScoreResponse.


        :param harsh_events: The harsh_events of this DriverSafetyScoreResponse.
        :type harsh_events: List[SafetyReportHarshEvent]
        """

        self._harsh_events = harsh_events

    @property
    def harsh_turning_count(self):
        """Gets the harsh_turning_count of this DriverSafetyScoreResponse.

        Harsh turning event count  # noqa: E501

        :return: The harsh_turning_count of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._harsh_turning_count

    @harsh_turning_count.setter
    def harsh_turning_count(self, harsh_turning_count):
        """Sets the harsh_turning_count of this DriverSafetyScoreResponse.

        Harsh turning event count  # noqa: E501

        :param harsh_turning_count: The harsh_turning_count of this DriverSafetyScoreResponse.
        :type harsh_turning_count: int
        """

        self._harsh_turning_count = harsh_turning_count

    @property
    def safety_score(self):
        """Gets the safety_score of this DriverSafetyScoreResponse.

        Safety Score  # noqa: E501

        :return: The safety_score of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._safety_score

    @safety_score.setter
    def safety_score(self, safety_score):
        """Sets the safety_score of this DriverSafetyScoreResponse.

        Safety Score  # noqa: E501

        :param safety_score: The safety_score of this DriverSafetyScoreResponse.
        :type safety_score: int
        """

        self._safety_score = safety_score

    @property
    def safety_score_rank(self):
        """Gets the safety_score_rank of this DriverSafetyScoreResponse.

        Safety Score Rank  # noqa: E501

        :return: The safety_score_rank of this DriverSafetyScoreResponse.
        :rtype: str
        """
        return self._safety_score_rank

    @safety_score_rank.setter
    def safety_score_rank(self, safety_score_rank):
        """Sets the safety_score_rank of this DriverSafetyScoreResponse.

        Safety Score Rank  # noqa: E501

        :param safety_score_rank: The safety_score_rank of this DriverSafetyScoreResponse.
        :type safety_score_rank: str
        """

        self._safety_score_rank = safety_score_rank

    @property
    def time_over_speed_limit_ms(self):
        """Gets the time_over_speed_limit_ms of this DriverSafetyScoreResponse.

        Amount of time driven over the speed limit in milliseconds  # noqa: E501

        :return: The time_over_speed_limit_ms of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._time_over_speed_limit_ms

    @time_over_speed_limit_ms.setter
    def time_over_speed_limit_ms(self, time_over_speed_limit_ms):
        """Sets the time_over_speed_limit_ms of this DriverSafetyScoreResponse.

        Amount of time driven over the speed limit in milliseconds  # noqa: E501

        :param time_over_speed_limit_ms: The time_over_speed_limit_ms of this DriverSafetyScoreResponse.
        :type time_over_speed_limit_ms: int
        """

        self._time_over_speed_limit_ms = time_over_speed_limit_ms

    @property
    def total_distance_driven_meters(self):
        """Gets the total_distance_driven_meters of this DriverSafetyScoreResponse.

        Total distance driven in meters  # noqa: E501

        :return: The total_distance_driven_meters of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._total_distance_driven_meters

    @total_distance_driven_meters.setter
    def total_distance_driven_meters(self, total_distance_driven_meters):
        """Sets the total_distance_driven_meters of this DriverSafetyScoreResponse.

        Total distance driven in meters  # noqa: E501

        :param total_distance_driven_meters: The total_distance_driven_meters of this DriverSafetyScoreResponse.
        :type total_distance_driven_meters: int
        """

        self._total_distance_driven_meters = total_distance_driven_meters

    @property
    def total_harsh_event_count(self):
        """Gets the total_harsh_event_count of this DriverSafetyScoreResponse.

        Total harsh event count  # noqa: E501

        :return: The total_harsh_event_count of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._total_harsh_event_count

    @total_harsh_event_count.setter
    def total_harsh_event_count(self, total_harsh_event_count):
        """Sets the total_harsh_event_count of this DriverSafetyScoreResponse.

        Total harsh event count  # noqa: E501

        :param total_harsh_event_count: The total_harsh_event_count of this DriverSafetyScoreResponse.
        :type total_harsh_event_count: int
        """

        self._total_harsh_event_count = total_harsh_event_count

    @property
    def total_time_driven_ms(self):
        """Gets the total_time_driven_ms of this DriverSafetyScoreResponse.

        Amount of time driven in milliseconds  # noqa: E501

        :return: The total_time_driven_ms of this DriverSafetyScoreResponse.
        :rtype: int
        """
        return self._total_time_driven_ms

    @total_time_driven_ms.setter
    def total_time_driven_ms(self, total_time_driven_ms):
        """Sets the total_time_driven_ms of this DriverSafetyScoreResponse.

        Amount of time driven in milliseconds  # noqa: E501

        :param total_time_driven_ms: The total_time_driven_ms of this DriverSafetyScoreResponse.
        :type total_time_driven_ms: int
        """

        self._total_time_driven_ms = total_time_driven_ms
