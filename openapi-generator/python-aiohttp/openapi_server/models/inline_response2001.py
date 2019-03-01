# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.asset_current_locations_response import AssetCurrentLocationsResponse
from openapi_server import util


class InlineResponse2001(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assets: List[AssetCurrentLocationsResponse]=None):
        """InlineResponse2001 - a model defined in OpenAPI

        :param assets: The assets of this InlineResponse2001.
        """
        self.openapi_types = {
            'assets': List[AssetCurrentLocationsResponse]
        }

        self.attribute_map = {
            'assets': 'assets'
        }

        self._assets = assets

    @classmethod
    def from_dict(cls, dikt: dict) -> 'InlineResponse2001':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The inline_response_200_1 of this InlineResponse2001.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assets(self):
        """Gets the assets of this InlineResponse2001.


        :return: The assets of this InlineResponse2001.
        :rtype: List[AssetCurrentLocationsResponse]
        """
        return self._assets

    @assets.setter
    def assets(self, assets):
        """Sets the assets of this InlineResponse2001.


        :param assets: The assets of this InlineResponse2001.
        :type assets: List[AssetCurrentLocationsResponse]
        """

        self._assets = assets