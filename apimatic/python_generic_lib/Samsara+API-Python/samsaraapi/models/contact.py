# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""


class Contact(object):

    """Implementation of the 'Contact' model.

    Information about a notification contact for alerts.

    Attributes:
        email (string): Email address of the contact
        first_name (string): First name of the contact
        id (long|int): ID of the contact
        last_name (string): Last name of the contact
        phone (string): Phone number of the contact

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "email":'email',
        "first_name":'firstName',
        "id":'id',
        "last_name":'lastName',
        "phone":'phone'
    }

    def __init__(self,
                 email=None,
                 first_name=None,
                 id=None,
                 last_name=None,
                 phone=None):
        """Constructor for the Contact class"""

        # Initialize members of the class
        self.email = email
        self.first_name = first_name
        self.id = id
        self.last_name = last_name
        self.phone = phone


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
        email = dictionary.get('email')
        first_name = dictionary.get('firstName')
        id = dictionary.get('id')
        last_name = dictionary.get('lastName')
        phone = dictionary.get('phone')

        # Return an object of this model
        return cls(email,
                   first_name,
                   id,
                   last_name,
                   phone)


