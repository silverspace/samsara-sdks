# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.tag_modify_add import TagModifyAdd
from openapi_server.models.tag_modify_delete import TagModifyDelete
from openapi_server import util

from openapi_server.models.tag_modify_add import TagModifyAdd  # noqa: E501
from openapi_server.models.tag_modify_delete import TagModifyDelete  # noqa: E501

class TagModify(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, add=None, delete=None, name=None, parent_tag_id=None):  # noqa: E501
        """TagModify - a model defined in OpenAPI

        :param add: The add of this TagModify.  # noqa: E501
        :type add: TagModifyAdd
        :param delete: The delete of this TagModify.  # noqa: E501
        :type delete: TagModifyDelete
        :param name: The name of this TagModify.  # noqa: E501
        :type name: str
        :param parent_tag_id: The parent_tag_id of this TagModify.  # noqa: E501
        :type parent_tag_id: int
        """
        self.openapi_types = {
            'add': TagModifyAdd,
            'delete': TagModifyDelete,
            'name': str,
            'parent_tag_id': int
        }

        self.attribute_map = {
            'add': 'add',
            'delete': 'delete',
            'name': 'name',
            'parent_tag_id': 'parentTagId'
        }

        self._add = add
        self._delete = delete
        self._name = name
        self._parent_tag_id = parent_tag_id

    @classmethod
    def from_dict(cls, dikt) -> 'TagModify':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TagModify of this TagModify.  # noqa: E501
        :rtype: TagModify
        """
        return util.deserialize_model(dikt, cls)

    @property
    def add(self):
        """Gets the add of this TagModify.


        :return: The add of this TagModify.
        :rtype: TagModifyAdd
        """
        return self._add

    @add.setter
    def add(self, add):
        """Sets the add of this TagModify.


        :param add: The add of this TagModify.
        :type add: TagModifyAdd
        """

        self._add = add

    @property
    def delete(self):
        """Gets the delete of this TagModify.


        :return: The delete of this TagModify.
        :rtype: TagModifyDelete
        """
        return self._delete

    @delete.setter
    def delete(self, delete):
        """Sets the delete of this TagModify.


        :param delete: The delete of this TagModify.
        :type delete: TagModifyDelete
        """

        self._delete = delete

    @property
    def name(self):
        """Gets the name of this TagModify.

        Updated name of this tag.  # noqa: E501

        :return: The name of this TagModify.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TagModify.

        Updated name of this tag.  # noqa: E501

        :param name: The name of this TagModify.
        :type name: str
        """

        self._name = name

    @property
    def parent_tag_id(self):
        """Gets the parent_tag_id of this TagModify.

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :return: The parent_tag_id of this TagModify.
        :rtype: int
        """
        return self._parent_tag_id

    @parent_tag_id.setter
    def parent_tag_id(self, parent_tag_id):
        """Sets the parent_tag_id of this TagModify.

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :param parent_tag_id: The parent_tag_id of this TagModify.
        :type parent_tag_id: int
        """

        self._parent_tag_id = parent_tag_id