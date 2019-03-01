# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class DocumentFieldCreatePhotoValue(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, url: str=None):
        """DocumentFieldCreatePhotoValue - a model defined in OpenAPI

        :param url: The url of this DocumentFieldCreatePhotoValue.
        """
        self.openapi_types = {
            'url': str
        }

        self.attribute_map = {
            'url': 'url'
        }

        self._url = url

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DocumentFieldCreatePhotoValue':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DocumentFieldCreate_photoValue of this DocumentFieldCreatePhotoValue.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def url(self):
        """Gets the url of this DocumentFieldCreatePhotoValue.

        Photo URL for a JPG image

        :return: The url of this DocumentFieldCreatePhotoValue.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this DocumentFieldCreatePhotoValue.

        Photo URL for a JPG image

        :param url: The url of this DocumentFieldCreatePhotoValue.
        :type url: str
        """

        self._url = url