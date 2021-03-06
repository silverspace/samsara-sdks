# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.addresses_addresses import AddressesAddresses
from openapi_server import util


class InlineObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, addresses: List[AddressesAddresses]=None):
        """InlineObject - a model defined in OpenAPI

        :param addresses: The addresses of this InlineObject.
        """
        self.openapi_types = {
            'addresses': List[AddressesAddresses]
        }

        self.attribute_map = {
            'addresses': 'addresses'
        }

        self._addresses = addresses

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_object of this InlineObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def addresses(self):
        """Gets the addresses of this InlineObject.


        :return: The addresses of this InlineObject.
        :rtype: List[AddressesAddresses]
        """
        return self._addresses

    @addresses.setter
    def addresses(self, addresses):
        """Sets the addresses of this InlineObject.


        :param addresses: The addresses of this InlineObject.
        :type addresses: List[AddressesAddresses]
        """
        if addresses is None:
            raise ValueError("Invalid value for `addresses`, must not be `None`")

        self._addresses = addresses
