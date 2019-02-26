# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

import samsaraapi.models.authentication_log

class HosAuthenticationLogsResponse(object):

    """Implementation of the 'HosAuthenticationLogsResponse' model.

    TODO: type model description here.

    Attributes:
        authentication_logs (list of AuthenticationLog): TODO: type
            description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "authentication_logs":'authenticationLogs'
    }

    def __init__(self,
                 authentication_logs=None):
        """Constructor for the HosAuthenticationLogsResponse class"""

        # Initialize members of the class
        self.authentication_logs = authentication_logs


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
        authentication_logs = None
        if dictionary.get('authenticationLogs') != None:
            authentication_logs = list()
            for structure in dictionary.get('authenticationLogs'):
                authentication_logs.append(samsaraapi.models.authentication_log.AuthenticationLog.from_dictionary(structure))

        # Return an object of this model
        return cls(authentication_logs)

