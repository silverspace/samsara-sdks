# coding: utf-8

"""
    Samsara API

    # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from samsara.models.document_field_create_photo_value import DocumentFieldCreatePhotoValue  # noqa: F401,E501


class DocumentFieldCreate(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'number_value': 'float',
        'photo_value': 'list[DocumentFieldCreatePhotoValue]',
        'string_value': 'str',
        'value_type': 'str'
    }

    attribute_map = {
        'number_value': 'numberValue',
        'photo_value': 'photoValue',
        'string_value': 'stringValue',
        'value_type': 'valueType'
    }

    def __init__(self, number_value=None, photo_value=None, string_value=None, value_type=None):  # noqa: E501
        """DocumentFieldCreate - a model defined in Swagger"""  # noqa: E501

        self._number_value = None
        self._photo_value = None
        self._string_value = None
        self._value_type = None
        self.discriminator = None

        if number_value is not None:
            self.number_value = number_value
        if photo_value is not None:
            self.photo_value = photo_value
        if string_value is not None:
            self.string_value = string_value
        self.value_type = value_type

    @property
    def number_value(self):
        """Gets the number_value of this DocumentFieldCreate.  # noqa: E501

        Value of this field if this document field has valueType: ValueType_Number.  # noqa: E501

        :return: The number_value of this DocumentFieldCreate.  # noqa: E501
        :rtype: float
        """
        return self._number_value

    @number_value.setter
    def number_value(self, number_value):
        """Sets the number_value of this DocumentFieldCreate.

        Value of this field if this document field has valueType: ValueType_Number.  # noqa: E501

        :param number_value: The number_value of this DocumentFieldCreate.  # noqa: E501
        :type: float
        """

        self._number_value = number_value

    @property
    def photo_value(self):
        """Gets the photo_value of this DocumentFieldCreate.  # noqa: E501

        Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.  # noqa: E501

        :return: The photo_value of this DocumentFieldCreate.  # noqa: E501
        :rtype: list[DocumentFieldCreatePhotoValue]
        """
        return self._photo_value

    @photo_value.setter
    def photo_value(self, photo_value):
        """Sets the photo_value of this DocumentFieldCreate.

        Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.  # noqa: E501

        :param photo_value: The photo_value of this DocumentFieldCreate.  # noqa: E501
        :type: list[DocumentFieldCreatePhotoValue]
        """

        self._photo_value = photo_value

    @property
    def string_value(self):
        """Gets the string_value of this DocumentFieldCreate.  # noqa: E501

        Value of this field if this document field has valueType: ValueType_String.  # noqa: E501

        :return: The string_value of this DocumentFieldCreate.  # noqa: E501
        :rtype: str
        """
        return self._string_value

    @string_value.setter
    def string_value(self, string_value):
        """Sets the string_value of this DocumentFieldCreate.

        Value of this field if this document field has valueType: ValueType_String.  # noqa: E501

        :param string_value: The string_value of this DocumentFieldCreate.  # noqa: E501
        :type: str
        """

        self._string_value = string_value

    @property
    def value_type(self):
        """Gets the value_type of this DocumentFieldCreate.  # noqa: E501

        Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.  # noqa: E501

        :return: The value_type of this DocumentFieldCreate.  # noqa: E501
        :rtype: str
        """
        return self._value_type

    @value_type.setter
    def value_type(self, value_type):
        """Sets the value_type of this DocumentFieldCreate.

        Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.  # noqa: E501

        :param value_type: The value_type of this DocumentFieldCreate.  # noqa: E501
        :type: str
        """
        if value_type is None:
            raise ValueError("Invalid value for `value_type`, must not be `None`")  # noqa: E501

        self._value_type = value_type

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(DocumentFieldCreate, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, DocumentFieldCreate):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
