# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.trip_response_trips import TripResponseTrips
from openapi_server import util


class TripResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, trips: List[TripResponseTrips]=None):
        """TripResponse - a model defined in OpenAPI

        :param trips: The trips of this TripResponse.
        """
        self.openapi_types = {
            'trips': List[TripResponseTrips]
        }

        self.attribute_map = {
            'trips': 'trips'
        }

        self._trips = trips

    @classmethod
    def from_dict(cls, dikt: dict) -> 'TripResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The TripResponse of this TripResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def trips(self):
        """Gets the trips of this TripResponse.


        :return: The trips of this TripResponse.
        :rtype: List[TripResponseTrips]
        """
        return self._trips

    @trips.setter
    def trips(self, trips):
        """Sets the trips of this TripResponse.


        :param trips: The trips of this TripResponse.
        :type trips: List[TripResponseTrips]
        """

        self._trips = trips
