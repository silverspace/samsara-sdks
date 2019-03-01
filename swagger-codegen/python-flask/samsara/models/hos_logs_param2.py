# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class HosLogsParam2(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, group_id: int=None):  # noqa: E501
        """HosLogsParam2 - a model defined in Swagger

        :param group_id: The group_id of this HosLogsParam2.  # noqa: E501
        :type group_id: int
        """
        self.swagger_types = {
            'group_id': int
        }

        self.attribute_map = {
            'group_id': 'groupId'
        }

        self._group_id = group_id

    @classmethod
    def from_dict(cls, dikt) -> 'HosLogsParam2':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The hosLogsParam_2 of this HosLogsParam2.  # noqa: E501
        :rtype: HosLogsParam2
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_id(self) -> int:
        """Gets the group_id of this HosLogsParam2.

        Group ID to query.  # noqa: E501

        :return: The group_id of this HosLogsParam2.
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: int):
        """Sets the group_id of this HosLogsParam2.

        Group ID to query.  # noqa: E501

        :param group_id: The group_id of this HosLogsParam2.
        :type group_id: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id
