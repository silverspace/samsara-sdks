# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from samsara.models.base_model_ import Model
from samsara.models.tag import Tag  # noqa: F401,E501
from samsara import util


class InlineResponse2009(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, tags: List[Tag]=None):  # noqa: E501
        """InlineResponse2009 - a model defined in Swagger

        :param tags: The tags of this InlineResponse2009.  # noqa: E501
        :type tags: List[Tag]
        """
        self.swagger_types = {
            'tags': List[Tag]
        }

        self.attribute_map = {
            'tags': 'tags'
        }

        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2009':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_9 of this InlineResponse2009.  # noqa: E501
        :rtype: InlineResponse2009
        """
        return util.deserialize_model(dikt, cls)

    @property
    def tags(self) -> List[Tag]:
        """Gets the tags of this InlineResponse2009.


        :return: The tags of this InlineResponse2009.
        :rtype: List[Tag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[Tag]):
        """Sets the tags of this InlineResponse2009.


        :param tags: The tags of this InlineResponse2009.
        :type tags: List[Tag]
        """

        self._tags = tags
