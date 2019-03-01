# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.document_base import DocumentBase
from openapi_server.models.document_field import DocumentField
from openapi_server import util

from openapi_server.models.document_base import DocumentBase  # noqa: E501
from openapi_server.models.document_field import DocumentField  # noqa: E501

class Document(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dispatch_job_id=None, notes=None, document_type=None, driver_created_at_ms=None, driver_id=None, fields=None, vehicle_id=None):  # noqa: E501
        """Document - a model defined in OpenAPI

        :param dispatch_job_id: The dispatch_job_id of this Document.  # noqa: E501
        :type dispatch_job_id: int
        :param notes: The notes of this Document.  # noqa: E501
        :type notes: str
        :param document_type: The document_type of this Document.  # noqa: E501
        :type document_type: str
        :param driver_created_at_ms: The driver_created_at_ms of this Document.  # noqa: E501
        :type driver_created_at_ms: int
        :param driver_id: The driver_id of this Document.  # noqa: E501
        :type driver_id: int
        :param fields: The fields of this Document.  # noqa: E501
        :type fields: List[DocumentField]
        :param vehicle_id: The vehicle_id of this Document.  # noqa: E501
        :type vehicle_id: int
        """
        self.openapi_types = {
            'dispatch_job_id': int,
            'notes': str,
            'document_type': str,
            'driver_created_at_ms': int,
            'driver_id': int,
            'fields': List[DocumentField],
            'vehicle_id': int
        }

        self.attribute_map = {
            'dispatch_job_id': 'dispatchJobId',
            'notes': 'notes',
            'document_type': 'documentType',
            'driver_created_at_ms': 'driverCreatedAtMs',
            'driver_id': 'driverId',
            'fields': 'fields',
            'vehicle_id': 'vehicleId'
        }

        self._dispatch_job_id = dispatch_job_id
        self._notes = notes
        self._document_type = document_type
        self._driver_created_at_ms = driver_created_at_ms
        self._driver_id = driver_id
        self._fields = fields
        self._vehicle_id = vehicle_id

    @classmethod
    def from_dict(cls, dikt) -> 'Document':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Document of this Document.  # noqa: E501
        :rtype: Document
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dispatch_job_id(self):
        """Gets the dispatch_job_id of this Document.

        ID of the Samsara dispatch job for which the document is submitted  # noqa: E501

        :return: The dispatch_job_id of this Document.
        :rtype: int
        """
        return self._dispatch_job_id

    @dispatch_job_id.setter
    def dispatch_job_id(self, dispatch_job_id):
        """Sets the dispatch_job_id of this Document.

        ID of the Samsara dispatch job for which the document is submitted  # noqa: E501

        :param dispatch_job_id: The dispatch_job_id of this Document.
        :type dispatch_job_id: int
        """

        self._dispatch_job_id = dispatch_job_id

    @property
    def notes(self):
        """Gets the notes of this Document.

        Notes submitted with this document.  # noqa: E501

        :return: The notes of this Document.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this Document.

        Notes submitted with this document.  # noqa: E501

        :param notes: The notes of this Document.
        :type notes: str
        """

        self._notes = notes

    @property
    def document_type(self):
        """Gets the document_type of this Document.

        Descriptive name of this type of document.  # noqa: E501

        :return: The document_type of this Document.
        :rtype: str
        """
        return self._document_type

    @document_type.setter
    def document_type(self, document_type):
        """Sets the document_type of this Document.

        Descriptive name of this type of document.  # noqa: E501

        :param document_type: The document_type of this Document.
        :type document_type: str
        """
        if document_type is None:
            raise ValueError("Invalid value for `document_type`, must not be `None`")  # noqa: E501

        self._document_type = document_type

    @property
    def driver_created_at_ms(self):
        """Gets the driver_created_at_ms of this Document.

        The time in Unix epoch milliseconds that the document is created.  # noqa: E501

        :return: The driver_created_at_ms of this Document.
        :rtype: int
        """
        return self._driver_created_at_ms

    @driver_created_at_ms.setter
    def driver_created_at_ms(self, driver_created_at_ms):
        """Sets the driver_created_at_ms of this Document.

        The time in Unix epoch milliseconds that the document is created.  # noqa: E501

        :param driver_created_at_ms: The driver_created_at_ms of this Document.
        :type driver_created_at_ms: int
        """
        if driver_created_at_ms is None:
            raise ValueError("Invalid value for `driver_created_at_ms`, must not be `None`")  # noqa: E501

        self._driver_created_at_ms = driver_created_at_ms

    @property
    def driver_id(self):
        """Gets the driver_id of this Document.

        ID of the driver for whom the document is submitted  # noqa: E501

        :return: The driver_id of this Document.
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this Document.

        ID of the driver for whom the document is submitted  # noqa: E501

        :param driver_id: The driver_id of this Document.
        :type driver_id: int
        """
        if driver_id is None:
            raise ValueError("Invalid value for `driver_id`, must not be `None`")  # noqa: E501

        self._driver_id = driver_id

    @property
    def fields(self):
        """Gets the fields of this Document.

        The fields associated with this document.  # noqa: E501

        :return: The fields of this Document.
        :rtype: List[DocumentField]
        """
        return self._fields

    @fields.setter
    def fields(self, fields):
        """Sets the fields of this Document.

        The fields associated with this document.  # noqa: E501

        :param fields: The fields of this Document.
        :type fields: List[DocumentField]
        """
        if fields is None:
            raise ValueError("Invalid value for `fields`, must not be `None`")  # noqa: E501

        self._fields = fields

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this Document.

        VehicleID of the driver at document creation.  # noqa: E501

        :return: The vehicle_id of this Document.
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this Document.

        VehicleID of the driver at document creation.  # noqa: E501

        :param vehicle_id: The vehicle_id of this Document.
        :type vehicle_id: int
        """

        self._vehicle_id = vehicle_id