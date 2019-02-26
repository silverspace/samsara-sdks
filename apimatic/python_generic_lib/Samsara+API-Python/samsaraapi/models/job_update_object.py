# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.dispatch_route

class JobUpdateObject(object):

    """Implementation of the 'jobUpdateObject' model.

    TODO: type model description here.

    Attributes:
        changed_at_ms (long|int): Timestamp that this event was updated,
            represented as Unix milliseconds since epoch.
        job_id (long|int): ID of the Samsara job.
        job_state (JobStatusEnum): The current state of the dispatch job.
        prev_job_state (PrevJobStatusEnum): The previous state of the dispatch
            job.
        route (DispatchRoute): TODO: type description here.
        route_id (long|int): ID of the Samsara dispatch route.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "changed_at_ms":'changed_at_ms',
        "job_id":'job_id',
        "job_state":'job_state',
        "prev_job_state":'prev_job_state',
        "route":'route',
        "route_id":'route_id'
    }

    def __init__(self,
                 changed_at_ms=None,
                 job_id=None,
                 job_state=None,
                 prev_job_state=None,
                 route=None,
                 route_id=None):
        """Constructor for the JobUpdateObject class"""

        # Initialize members of the class
        self.changed_at_ms = changed_at_ms
        self.job_id = job_id
        self.job_state = job_state
        self.prev_job_state = prev_job_state
        self.route = route
        self.route_id = route_id


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
        changed_at_ms = dictionary.get('changed_at_ms')
        job_id = dictionary.get('job_id')
        job_state = dictionary.get('job_state')
        prev_job_state = dictionary.get('prev_job_state')
        route = samsaraapi.models.dispatch_route.DispatchRoute.from_dictionary(dictionary.get('route')) if dictionary.get('route') else None
        route_id = dictionary.get('route_id')

        # Return an object of this model
        return cls(changed_at_ms,
                   job_id,
                   job_state,
                   prev_job_state,
                   route,
                   route_id)

