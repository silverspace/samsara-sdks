# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara import util


class ContactIds(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self):  # noqa: E501
        """ContactIds - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ContactIds':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContactIds of this ContactIds.  # noqa: E501
        :rtype: ContactIds
        """
        return util.deserialize_model(dikt, cls)
