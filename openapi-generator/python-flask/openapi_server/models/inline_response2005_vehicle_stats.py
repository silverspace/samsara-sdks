# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.aux_input_series import AuxInputSeries
from openapi_server.models.engine_state import EngineState
from openapi_server import util

from openapi_server.models.aux_input_series import AuxInputSeries  # noqa: E501
from openapi_server.models.engine_state import EngineState  # noqa: E501

class InlineResponse2005VehicleStats(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, engine_state=None, aux_input2=None, vehicle_id=None, aux_input1=None):  # noqa: E501
        """InlineResponse2005VehicleStats - a model defined in OpenAPI

        :param engine_state: The engine_state of this InlineResponse2005VehicleStats.  # noqa: E501
        :type engine_state: List[EngineState]
        :param aux_input2: The aux_input2 of this InlineResponse2005VehicleStats.  # noqa: E501
        :type aux_input2: AuxInputSeries
        :param vehicle_id: The vehicle_id of this InlineResponse2005VehicleStats.  # noqa: E501
        :type vehicle_id: int
        :param aux_input1: The aux_input1 of this InlineResponse2005VehicleStats.  # noqa: E501
        :type aux_input1: AuxInputSeries
        """
        self.openapi_types = {
            'engine_state': List[EngineState],
            'aux_input2': AuxInputSeries,
            'vehicle_id': int,
            'aux_input1': AuxInputSeries
        }

        self.attribute_map = {
            'engine_state': 'engineState',
            'aux_input2': 'auxInput2',
            'vehicle_id': 'vehicleId',
            'aux_input1': 'auxInput1'
        }

        self._engine_state = engine_state
        self._aux_input2 = aux_input2
        self._vehicle_id = vehicle_id
        self._aux_input1 = aux_input1

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2005VehicleStats':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_5_vehicleStats of this InlineResponse2005VehicleStats.  # noqa: E501
        :rtype: InlineResponse2005VehicleStats
        """
        return util.deserialize_model(dikt, cls)

    @property
    def engine_state(self):
        """Gets the engine_state of this InlineResponse2005VehicleStats.


        :return: The engine_state of this InlineResponse2005VehicleStats.
        :rtype: List[EngineState]
        """
        return self._engine_state

    @engine_state.setter
    def engine_state(self, engine_state):
        """Sets the engine_state of this InlineResponse2005VehicleStats.


        :param engine_state: The engine_state of this InlineResponse2005VehicleStats.
        :type engine_state: List[EngineState]
        """

        self._engine_state = engine_state

    @property
    def aux_input2(self):
        """Gets the aux_input2 of this InlineResponse2005VehicleStats.


        :return: The aux_input2 of this InlineResponse2005VehicleStats.
        :rtype: AuxInputSeries
        """
        return self._aux_input2

    @aux_input2.setter
    def aux_input2(self, aux_input2):
        """Sets the aux_input2 of this InlineResponse2005VehicleStats.


        :param aux_input2: The aux_input2 of this InlineResponse2005VehicleStats.
        :type aux_input2: AuxInputSeries
        """

        self._aux_input2 = aux_input2

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this InlineResponse2005VehicleStats.

        ID of the vehicle.  # noqa: E501

        :return: The vehicle_id of this InlineResponse2005VehicleStats.
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this InlineResponse2005VehicleStats.

        ID of the vehicle.  # noqa: E501

        :param vehicle_id: The vehicle_id of this InlineResponse2005VehicleStats.
        :type vehicle_id: int
        """
        if vehicle_id is None:
            raise ValueError("Invalid value for `vehicle_id`, must not be `None`")  # noqa: E501

        self._vehicle_id = vehicle_id

    @property
    def aux_input1(self):
        """Gets the aux_input1 of this InlineResponse2005VehicleStats.


        :return: The aux_input1 of this InlineResponse2005VehicleStats.
        :rtype: AuxInputSeries
        """
        return self._aux_input1

    @aux_input1.setter
    def aux_input1(self, aux_input1):
        """Sets the aux_input1 of this InlineResponse2005VehicleStats.


        :param aux_input1: The aux_input1 of this InlineResponse2005VehicleStats.
        :type aux_input1: AuxInputSeries
        """

        self._aux_input1 = aux_input1
