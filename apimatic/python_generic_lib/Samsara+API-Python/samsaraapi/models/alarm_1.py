# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class Alarm1(object):

    """Implementation of the 'Alarm1' model.

    TODO: type model description here.

    Attributes:
        alarm_code (long|int): ID of the alarm
        description (string): Description of the alarm
        operator_action (string): Recommended operator action
        severity (long|int): Severity of the alarm: 1: OK to run, 2: Check as
            specified, 3: Take immediate action

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "alarm_code":'alarmCode',
        "description":'description',
        "operator_action":'operatorAction',
        "severity":'severity'
    }

    def __init__(self,
                 alarm_code=None,
                 description=None,
                 operator_action=None,
                 severity=None):
        """Constructor for the Alarm1 class"""

        # Initialize members of the class
        self.alarm_code = alarm_code
        self.description = description
        self.operator_action = operator_action
        self.severity = severity


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
        alarm_code = dictionary.get('alarmCode')
        description = dictionary.get('description')
        operator_action = dictionary.get('operatorAction')
        severity = dictionary.get('severity')

        # Return an object of this model
        return cls(alarm_code,
                   description,
                   operator_action,
                   severity)


