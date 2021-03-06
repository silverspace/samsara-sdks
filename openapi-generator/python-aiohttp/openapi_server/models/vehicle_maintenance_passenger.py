# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.vehicle_maintenance_passenger_check_engine_light import VehicleMaintenancePassengerCheckEngineLight
from openapi_server.models.vehicle_maintenance_passenger_diagnostic_trouble_codes import VehicleMaintenancePassengerDiagnosticTroubleCodes
from openapi_server import util


class VehicleMaintenancePassenger(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, check_engine_light: VehicleMaintenancePassengerCheckEngineLight=None, diagnostic_trouble_codes: List[VehicleMaintenancePassengerDiagnosticTroubleCodes]=None):
        """VehicleMaintenancePassenger - a model defined in OpenAPI

        :param check_engine_light: The check_engine_light of this VehicleMaintenancePassenger.
        :param diagnostic_trouble_codes: The diagnostic_trouble_codes of this VehicleMaintenancePassenger.
        """
        self.openapi_types = {
            'check_engine_light': VehicleMaintenancePassengerCheckEngineLight,
            'diagnostic_trouble_codes': List[VehicleMaintenancePassengerDiagnosticTroubleCodes]
        }

        self.attribute_map = {
            'check_engine_light': 'checkEngineLight',
            'diagnostic_trouble_codes': 'diagnosticTroubleCodes'
        }

        self._check_engine_light = check_engine_light
        self._diagnostic_trouble_codes = diagnostic_trouble_codes

    @classmethod
    def from_dict(cls, dikt: dict) -> 'VehicleMaintenancePassenger':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The VehicleMaintenance_passenger of this VehicleMaintenancePassenger.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def check_engine_light(self):
        """Gets the check_engine_light of this VehicleMaintenancePassenger.


        :return: The check_engine_light of this VehicleMaintenancePassenger.
        :rtype: VehicleMaintenancePassengerCheckEngineLight
        """
        return self._check_engine_light

    @check_engine_light.setter
    def check_engine_light(self, check_engine_light):
        """Sets the check_engine_light of this VehicleMaintenancePassenger.


        :param check_engine_light: The check_engine_light of this VehicleMaintenancePassenger.
        :type check_engine_light: VehicleMaintenancePassengerCheckEngineLight
        """

        self._check_engine_light = check_engine_light

    @property
    def diagnostic_trouble_codes(self):
        """Gets the diagnostic_trouble_codes of this VehicleMaintenancePassenger.

        Passenger vehicle DTCs.

        :return: The diagnostic_trouble_codes of this VehicleMaintenancePassenger.
        :rtype: List[VehicleMaintenancePassengerDiagnosticTroubleCodes]
        """
        return self._diagnostic_trouble_codes

    @diagnostic_trouble_codes.setter
    def diagnostic_trouble_codes(self, diagnostic_trouble_codes):
        """Sets the diagnostic_trouble_codes of this VehicleMaintenancePassenger.

        Passenger vehicle DTCs.

        :param diagnostic_trouble_codes: The diagnostic_trouble_codes of this VehicleMaintenancePassenger.
        :type diagnostic_trouble_codes: List[VehicleMaintenancePassengerDiagnosticTroubleCodes]
        """

        self._diagnostic_trouble_codes = diagnostic_trouble_codes
