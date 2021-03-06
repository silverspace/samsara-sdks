# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class AssetReeferResponseReeferStatsPowerStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, changed_at_ms=None, status=None):  # noqa: E501
        """AssetReeferResponseReeferStatsPowerStatus - a model defined in OpenAPI

        :param changed_at_ms: The changed_at_ms of this AssetReeferResponseReeferStatsPowerStatus.  # noqa: E501
        :type changed_at_ms: int
        :param status: The status of this AssetReeferResponseReeferStatsPowerStatus.  # noqa: E501
        :type status: str
        """
        self.openapi_types = {
            'changed_at_ms': int,
            'status': str
        }

        self.attribute_map = {
            'changed_at_ms': 'changedAtMs',
            'status': 'status'
        }

        self._changed_at_ms = changed_at_ms
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'AssetReeferResponseReeferStatsPowerStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssetReeferResponse_reeferStats_powerStatus of this AssetReeferResponseReeferStatsPowerStatus.  # noqa: E501
        :rtype: AssetReeferResponseReeferStatsPowerStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def changed_at_ms(self):
        """Gets the changed_at_ms of this AssetReeferResponseReeferStatsPowerStatus.

        Timestamp in Unix milliseconds since epoch.  # noqa: E501

        :return: The changed_at_ms of this AssetReeferResponseReeferStatsPowerStatus.
        :rtype: int
        """
        return self._changed_at_ms

    @changed_at_ms.setter
    def changed_at_ms(self, changed_at_ms):
        """Sets the changed_at_ms of this AssetReeferResponseReeferStatsPowerStatus.

        Timestamp in Unix milliseconds since epoch.  # noqa: E501

        :param changed_at_ms: The changed_at_ms of this AssetReeferResponseReeferStatsPowerStatus.
        :type changed_at_ms: int
        """

        self._changed_at_ms = changed_at_ms

    @property
    def status(self):
        """Gets the status of this AssetReeferResponseReeferStatsPowerStatus.

        Power status of the reefer.  # noqa: E501

        :return: The status of this AssetReeferResponseReeferStatsPowerStatus.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this AssetReeferResponseReeferStatsPowerStatus.

        Power status of the reefer.  # noqa: E501

        :param status: The status of this AssetReeferResponseReeferStatsPowerStatus.
        :type status: str
        """

        self._status = status
