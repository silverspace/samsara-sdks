# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class Series1(object):

    """Implementation of the 'Series1' model.

    Sensor ID and field to query.

    Attributes:
        field (FieldEnum): Field to query.
        widget_id (long|int): Sensor ID to query.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "field":'field',
        "widget_id":'widgetId'
    }

    def __init__(self,
                 field=None,
                 widget_id=None):
        """Constructor for the Series1 class"""

        # Initialize members of the class
        self.field = field
        self.widget_id = widget_id


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
        field = dictionary.get('field')
        widget_id = dictionary.get('widgetId')

        # Return an object of this model
        return cls(field,
                   widget_id)


