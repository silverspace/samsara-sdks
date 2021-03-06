# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.address_geofence import AddressGeofence  # noqa: F401,E501
from samsara.models.address_notes import AddressNotes  # noqa: F401,E501
from samsara.models.contact_ids import ContactIds  # noqa: F401,E501
from samsara.models.tag_ids import TagIds  # noqa: F401,E501
from samsara import util


class AddressesAddresses(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, contact_ids: ContactIds=None, formatted_address: str=None, geofence: AddressGeofence=None, name: str=None, notes: AddressNotes=None, tag_ids: TagIds=None):  # noqa: E501
        """AddressesAddresses - a model defined in Swagger

        :param contact_ids: The contact_ids of this AddressesAddresses.  # noqa: E501
        :type contact_ids: ContactIds
        :param formatted_address: The formatted_address of this AddressesAddresses.  # noqa: E501
        :type formatted_address: str
        :param geofence: The geofence of this AddressesAddresses.  # noqa: E501
        :type geofence: AddressGeofence
        :param name: The name of this AddressesAddresses.  # noqa: E501
        :type name: str
        :param notes: The notes of this AddressesAddresses.  # noqa: E501
        :type notes: AddressNotes
        :param tag_ids: The tag_ids of this AddressesAddresses.  # noqa: E501
        :type tag_ids: TagIds
        """
        self.swagger_types = {
            'contact_ids': ContactIds,
            'formatted_address': str,
            'geofence': AddressGeofence,
            'name': str,
            'notes': AddressNotes,
            'tag_ids': TagIds
        }

        self.attribute_map = {
            'contact_ids': 'contactIds',
            'formatted_address': 'formattedAddress',
            'geofence': 'geofence',
            'name': 'name',
            'notes': 'notes',
            'tag_ids': 'tagIds'
        }

        self._contact_ids = contact_ids
        self._formatted_address = formatted_address
        self._geofence = geofence
        self._name = name
        self._notes = notes
        self._tag_ids = tag_ids

    @classmethod
    def from_dict(cls, dikt) -> 'AddressesAddresses':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The addresses_addresses of this AddressesAddresses.  # noqa: E501
        :rtype: AddressesAddresses
        """
        return util.deserialize_model(dikt, cls)

    @property
    def contact_ids(self) -> ContactIds:
        """Gets the contact_ids of this AddressesAddresses.


        :return: The contact_ids of this AddressesAddresses.
        :rtype: ContactIds
        """
        return self._contact_ids

    @contact_ids.setter
    def contact_ids(self, contact_ids: ContactIds):
        """Sets the contact_ids of this AddressesAddresses.


        :param contact_ids: The contact_ids of this AddressesAddresses.
        :type contact_ids: ContactIds
        """

        self._contact_ids = contact_ids

    @property
    def formatted_address(self) -> str:
        """Gets the formatted_address of this AddressesAddresses.

        The full address associated with this address/geofence, as it might be recognized by maps.google.com  # noqa: E501

        :return: The formatted_address of this AddressesAddresses.
        :rtype: str
        """
        return self._formatted_address

    @formatted_address.setter
    def formatted_address(self, formatted_address: str):
        """Sets the formatted_address of this AddressesAddresses.

        The full address associated with this address/geofence, as it might be recognized by maps.google.com  # noqa: E501

        :param formatted_address: The formatted_address of this AddressesAddresses.
        :type formatted_address: str
        """
        if formatted_address is None:
            raise ValueError("Invalid value for `formatted_address`, must not be `None`")  # noqa: E501

        self._formatted_address = formatted_address

    @property
    def geofence(self) -> AddressGeofence:
        """Gets the geofence of this AddressesAddresses.


        :return: The geofence of this AddressesAddresses.
        :rtype: AddressGeofence
        """
        return self._geofence

    @geofence.setter
    def geofence(self, geofence: AddressGeofence):
        """Sets the geofence of this AddressesAddresses.


        :param geofence: The geofence of this AddressesAddresses.
        :type geofence: AddressGeofence
        """
        if geofence is None:
            raise ValueError("Invalid value for `geofence`, must not be `None`")  # noqa: E501

        self._geofence = geofence

    @property
    def name(self) -> str:
        """Gets the name of this AddressesAddresses.

        The name of this address/geofence  # noqa: E501

        :return: The name of this AddressesAddresses.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AddressesAddresses.

        The name of this address/geofence  # noqa: E501

        :param name: The name of this AddressesAddresses.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def notes(self) -> AddressNotes:
        """Gets the notes of this AddressesAddresses.


        :return: The notes of this AddressesAddresses.
        :rtype: AddressNotes
        """
        return self._notes

    @notes.setter
    def notes(self, notes: AddressNotes):
        """Sets the notes of this AddressesAddresses.


        :param notes: The notes of this AddressesAddresses.
        :type notes: AddressNotes
        """

        self._notes = notes

    @property
    def tag_ids(self) -> TagIds:
        """Gets the tag_ids of this AddressesAddresses.


        :return: The tag_ids of this AddressesAddresses.
        :rtype: TagIds
        """
        return self._tag_ids

    @tag_ids.setter
    def tag_ids(self, tag_ids: TagIds):
        """Sets the tag_ids of this AddressesAddresses.


        :param tag_ids: The tag_ids of this AddressesAddresses.
        :type tag_ids: TagIds
        """

        self._tag_ids = tag_ids
