# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.asset import Asset
from openapi_server import util


class InlineResponse200(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assets: List[Asset]=None):
        """InlineResponse200 - a model defined in OpenAPI

        :param assets: The assets of this InlineResponse200.
        """
        self.openapi_types = {
            'assets': List[Asset]
        }

        self.attribute_map = {
            'assets': 'assets'
        }

        self._assets = assets

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineResponse200':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_response_200 of this InlineResponse200.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assets(self):
        """Gets the assets of this InlineResponse200.


        :return: The assets of this InlineResponse200.
        :rtype: List[Asset]
        """
        return self._assets

    @assets.setter
    def assets(self, assets):
        """Sets the assets of this InlineResponse200.


        :param assets: The assets of this InlineResponse200.
        :type assets: List[Asset]
        """

        self._assets = assets
