# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.machine_history_response_vibrations import MachineHistoryResponseVibrations
from openapi_server import util


class MachineHistoryResponseMachines(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name: str=None, id: int=None, vibrations: List[MachineHistoryResponseVibrations]=None):
        """MachineHistoryResponseMachines - a model defined in OpenAPI

        :param name: The name of this MachineHistoryResponseMachines.
        :param id: The id of this MachineHistoryResponseMachines.
        :param vibrations: The vibrations of this MachineHistoryResponseMachines.
        """
        self.openapi_types = {
            'name': str,
            'id': int,
            'vibrations': List[MachineHistoryResponseVibrations]
        }

        self.attribute_map = {
            'name': 'name',
            'id': 'id',
            'vibrations': 'vibrations'
        }

        self._name = name
        self._id = id
        self._vibrations = vibrations

    @classmethod
    def from_dict(cls, dikt: dict) -> 'MachineHistoryResponseMachines':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The MachineHistoryResponse_machines of this MachineHistoryResponseMachines.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this MachineHistoryResponseMachines.

        Machine name

        :return: The name of this MachineHistoryResponseMachines.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this MachineHistoryResponseMachines.

        Machine name

        :param name: The name of this MachineHistoryResponseMachines.
        :type name: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this MachineHistoryResponseMachines.

        Machine ID

        :return: The id of this MachineHistoryResponseMachines.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this MachineHistoryResponseMachines.

        Machine ID

        :param id: The id of this MachineHistoryResponseMachines.
        :type id: int
        """

        self._id = id

    @property
    def vibrations(self):
        """Gets the vibrations of this MachineHistoryResponseMachines.

        List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s

        :return: The vibrations of this MachineHistoryResponseMachines.
        :rtype: List[MachineHistoryResponseVibrations]
        """
        return self._vibrations

    @vibrations.setter
    def vibrations(self, vibrations):
        """Sets the vibrations of this MachineHistoryResponseMachines.

        List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s

        :param vibrations: The vibrations of this MachineHistoryResponseMachines.
        :type vibrations: List[MachineHistoryResponseVibrations]
        """

        self._vibrations = vibrations
