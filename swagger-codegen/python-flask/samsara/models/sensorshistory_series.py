# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class SensorshistorySeries(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, field: str=None, widget_id: int=None):  # noqa: E501
        """SensorshistorySeries - a model defined in Swagger

        :param field: The field of this SensorshistorySeries.  # noqa: E501
        :type field: str
        :param widget_id: The widget_id of this SensorshistorySeries.  # noqa: E501
        :type widget_id: int
        """
        self.swagger_types = {
            'field': str,
            'widget_id': int
        }

        self.attribute_map = {
            'field': 'field',
            'widget_id': 'widgetId'
        }

        self._field = field
        self._widget_id = widget_id

    @classmethod
    def from_dict(cls, dikt) -> 'SensorshistorySeries':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The sensorshistory_series of this SensorshistorySeries.  # noqa: E501
        :rtype: SensorshistorySeries
        """
        return util.deserialize_model(dikt, cls)

    @property
    def field(self) -> str:
        """Gets the field of this SensorshistorySeries.

        Field to query.  # noqa: E501

        :return: The field of this SensorshistorySeries.
        :rtype: str
        """
        return self._field

    @field.setter
    def field(self, field: str):
        """Sets the field of this SensorshistorySeries.

        Field to query.  # noqa: E501

        :param field: The field of this SensorshistorySeries.
        :type field: str
        """
        allowed_values = ["ambientTemperature", "probeTemperature", "currentLoop1Raw", "currentLoop1Mapped", "currentLoop2Raw", "currentLoop2Mapped", "pmPowerTotal", "pmPhase1Power", "pmPhase2Power", "pmPhase3Power", "pmPhase1PowerFactor", "pmPhase2PowerFactor", "pmPhase3PowerFactor"]  # noqa: E501
        if field not in allowed_values:
            raise ValueError(
                "Invalid value for `field` ({0}), must be one of {1}"
                .format(field, allowed_values)
            )

        self._field = field

    @property
    def widget_id(self) -> int:
        """Gets the widget_id of this SensorshistorySeries.

        Sensor ID to query.  # noqa: E501

        :return: The widget_id of this SensorshistorySeries.
        :rtype: int
        """
        return self._widget_id

    @widget_id.setter
    def widget_id(self, widget_id: int):
        """Sets the widget_id of this SensorshistorySeries.

        Sensor ID to query.  # noqa: E501

        :param widget_id: The widget_id of this SensorshistorySeries.
        :type widget_id: int
        """
        if widget_id is None:
            raise ValueError("Invalid value for `widget_id`, must not be `None`")  # noqa: E501

        self._widget_id = widget_id
