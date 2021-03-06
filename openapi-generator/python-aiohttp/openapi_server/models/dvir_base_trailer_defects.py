# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DvirBaseTrailerDefects(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, comment: str=None, defect_type: str=None):
        """DvirBaseTrailerDefects - a model defined in OpenAPI

        :param comment: The comment of this DvirBaseTrailerDefects.
        :param defect_type: The defect_type of this DvirBaseTrailerDefects.
        """
        self.openapi_types = {
            'comment': str,
            'defect_type': str
        }

        self.attribute_map = {
            'comment': 'comment',
            'defect_type': 'defectType'
        }

        self._comment = comment
        self._defect_type = defect_type

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DvirBaseTrailerDefects':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DvirBase_trailerDefects of this DvirBaseTrailerDefects.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def comment(self):
        """Gets the comment of this DvirBaseTrailerDefects.

        The comment describing the type of DVIR defect

        :return: The comment of this DvirBaseTrailerDefects.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """Sets the comment of this DvirBaseTrailerDefects.

        The comment describing the type of DVIR defect

        :param comment: The comment of this DvirBaseTrailerDefects.
        :type comment: str
        """

        self._comment = comment

    @property
    def defect_type(self):
        """Gets the defect_type of this DvirBaseTrailerDefects.

        The type of DVIR defect

        :return: The defect_type of this DvirBaseTrailerDefects.
        :rtype: str
        """
        return self._defect_type

    @defect_type.setter
    def defect_type(self, defect_type):
        """Sets the defect_type of this DvirBaseTrailerDefects.

        The type of DVIR defect

        :param defect_type: The defect_type of this DvirBaseTrailerDefects.
        :type defect_type: str
        """

        self._defect_type = defect_type
