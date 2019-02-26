# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.dispatch_route

class DispatchRouteHistoricalEntry(object):

    """Implementation of the 'DispatchRouteHistoricalEntry' model.

    TODO: type model description here.

    Attributes:
        changed_at_ms (long|int): Timestamp that the route was updated,
            represented as Unix milliseconds since epoch.
        route (DispatchRoute): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "changed_at_ms":'changed_at_ms',
        "route":'route'
    }

    def __init__(self,
                 changed_at_ms=None,
                 route=None):
        """Constructor for the DispatchRouteHistoricalEntry class"""

        # Initialize members of the class
        self.changed_at_ms = changed_at_ms
        self.route = route


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
        route = samsaraapi.models.dispatch_route.DispatchRoute.from_dictionary(dictionary.get('route')) if dictionary.get('route') else None

        # Return an object of this model
        return cls(changed_at_ms,
                   route)

