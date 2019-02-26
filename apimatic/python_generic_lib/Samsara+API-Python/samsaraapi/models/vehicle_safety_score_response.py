# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.safety_report_harsh_event

class VehicleSafetyScoreResponse(object):

    """Implementation of the 'VehicleSafetyScoreResponse' model.

    Safety score details for a vehicle

    Attributes:
        crash_count (int): Crash event count
        harsh_accel_count (int): Harsh acceleration event count
        harsh_braking_count (int): Harsh braking event count
        harsh_events (list of SafetyReportHarshEvent): TODO: type description
            here.
        harsh_turning_count (int): Harsh turning event count
        safety_score (int): Safety Score
        safety_score_rank (string): Safety Score Rank
        time_over_speed_limit_ms (int): Amount of time driven over the speed
            limit in milliseconds
        total_distance_driven_meters (int): Total distance driven in meters
        total_harsh_event_count (int): Total harsh event count
        total_time_driven_ms (int): Amount of time driven in milliseconds
        vehicle_id (int): Vehicle ID

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "crash_count":'crashCount',
        "harsh_accel_count":'harshAccelCount',
        "harsh_braking_count":'harshBrakingCount',
        "harsh_events":'harshEvents',
        "harsh_turning_count":'harshTurningCount',
        "safety_score":'safetyScore',
        "safety_score_rank":'safetyScoreRank',
        "time_over_speed_limit_ms":'timeOverSpeedLimitMs',
        "total_distance_driven_meters":'totalDistanceDrivenMeters',
        "total_harsh_event_count":'totalHarshEventCount',
        "total_time_driven_ms":'totalTimeDrivenMs',
        "vehicle_id":'vehicleId'
    }

    def __init__(self,
                 crash_count=None,
                 harsh_accel_count=None,
                 harsh_braking_count=None,
                 harsh_events=None,
                 harsh_turning_count=None,
                 safety_score=None,
                 safety_score_rank=None,
                 time_over_speed_limit_ms=None,
                 total_distance_driven_meters=None,
                 total_harsh_event_count=None,
                 total_time_driven_ms=None,
                 vehicle_id=None):
        """Constructor for the VehicleSafetyScoreResponse class"""

        # Initialize members of the class
        self.crash_count = crash_count
        self.harsh_accel_count = harsh_accel_count
        self.harsh_braking_count = harsh_braking_count
        self.harsh_events = harsh_events
        self.harsh_turning_count = harsh_turning_count
        self.safety_score = safety_score
        self.safety_score_rank = safety_score_rank
        self.time_over_speed_limit_ms = time_over_speed_limit_ms
        self.total_distance_driven_meters = total_distance_driven_meters
        self.total_harsh_event_count = total_harsh_event_count
        self.total_time_driven_ms = total_time_driven_ms
        self.vehicle_id = vehicle_id


    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object as
            obtained from the deserialization of the server's response. The keys
            MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary
        crash_count = dictionary.get('crashCount')
        harsh_accel_count = dictionary.get('harshAccelCount')
        harsh_braking_count = dictionary.get('harshBrakingCount')
        harsh_events = None
        if dictionary.get('harshEvents') != None:
            harsh_events = list()
            for structure in dictionary.get('harshEvents'):
                harsh_events.append(samsaraapi.models.safety_report_harsh_event.SafetyReportHarshEvent.from_dictionary(structure))
        harsh_turning_count = dictionary.get('harshTurningCount')
        safety_score = dictionary.get('safetyScore')
        safety_score_rank = dictionary.get('safetyScoreRank')
        time_over_speed_limit_ms = dictionary.get('timeOverSpeedLimitMs')
        total_distance_driven_meters = dictionary.get('totalDistanceDrivenMeters')
        total_harsh_event_count = dictionary.get('totalHarshEventCount')
        total_time_driven_ms = dictionary.get('totalTimeDrivenMs')
        vehicle_id = dictionary.get('vehicleId')

        # Return an object of this model
        return cls(crash_count,
                   harsh_accel_count,
                   harsh_braking_count,
                   harsh_events,
                   harsh_turning_count,
                   safety_score,
                   safety_score_rank,
                   time_over_speed_limit_ms,
                   total_distance_driven_meters,
                   total_harsh_event_count,
                   total_time_driven_ms,
                   vehicle_id)


