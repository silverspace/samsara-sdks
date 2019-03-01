# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class Contact(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, email: str=None, first_name: str=None, id: int=None, last_name: str=None, phone: str=None):  # noqa: E501
        """Contact - a model defined in Swagger

        :param email: The email of this Contact.  # noqa: E501
        :type email: str
        :param first_name: The first_name of this Contact.  # noqa: E501
        :type first_name: str
        :param id: The id of this Contact.  # noqa: E501
        :type id: int
        :param last_name: The last_name of this Contact.  # noqa: E501
        :type last_name: str
        :param phone: The phone of this Contact.  # noqa: E501
        :type phone: str
        """
        self.swagger_types = {
            'email': str,
            'first_name': str,
            'id': int,
            'last_name': str,
            'phone': str
        }

        self.attribute_map = {
            'email': 'email',
            'first_name': 'firstName',
            'id': 'id',
            'last_name': 'lastName',
            'phone': 'phone'
        }

        self._email = email
        self._first_name = first_name
        self._id = id
        self._last_name = last_name
        self._phone = phone

    @classmethod
    def from_dict(cls, dikt) -> 'Contact':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Contact of this Contact.  # noqa: E501
        :rtype: Contact
        """
        return util.deserialize_model(dikt, cls)

    @property
    def email(self) -> str:
        """Gets the email of this Contact.

        Email address of the contact  # noqa: E501

        :return: The email of this Contact.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this Contact.

        Email address of the contact  # noqa: E501

        :param email: The email of this Contact.
        :type email: str
        """

        self._email = email

    @property
    def first_name(self) -> str:
        """Gets the first_name of this Contact.

        First name of the contact  # noqa: E501

        :return: The first_name of this Contact.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name: str):
        """Sets the first_name of this Contact.

        First name of the contact  # noqa: E501

        :param first_name: The first_name of this Contact.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def id(self) -> int:
        """Gets the id of this Contact.

        ID of the contact  # noqa: E501

        :return: The id of this Contact.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Contact.

        ID of the contact  # noqa: E501

        :param id: The id of this Contact.
        :type id: int
        """

        self._id = id

    @property
    def last_name(self) -> str:
        """Gets the last_name of this Contact.

        Last name of the contact  # noqa: E501

        :return: The last_name of this Contact.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name: str):
        """Sets the last_name of this Contact.

        Last name of the contact  # noqa: E501

        :param last_name: The last_name of this Contact.
        :type last_name: str
        """

        self._last_name = last_name

    @property
    def phone(self) -> str:
        """Gets the phone of this Contact.

        Phone number of the contact  # noqa: E501

        :return: The phone of this Contact.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone: str):
        """Sets the phone of this Contact.

        Phone number of the contact  # noqa: E501

        :param phone: The phone of this Contact.
        :type phone: str
        """

        self._phone = phone