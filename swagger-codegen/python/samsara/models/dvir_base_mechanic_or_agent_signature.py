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


class DvirBaseMechanicOrAgentSignature(object):
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
        'driver_id': 'int',
        'email': 'str',
        'mechanic_user_id': 'int',
        'name': 'str',
        'signed_at': 'int',
        'type': 'str',
        'username': 'str'
    }

    attribute_map = {
        'driver_id': 'driverId',
        'email': 'email',
        'mechanic_user_id': 'mechanicUserId',
        'name': 'name',
        'signed_at': 'signedAt',
        'type': 'type',
        'username': 'username'
    }

    def __init__(self, driver_id=None, email=None, mechanic_user_id=None, name=None, signed_at=None, type=None, username=None):  # noqa: E501
        """DvirBaseMechanicOrAgentSignature - a model defined in Swagger"""  # noqa: E501

        self._driver_id = None
        self._email = None
        self._mechanic_user_id = None
        self._name = None
        self._signed_at = None
        self._type = None
        self._username = None
        self.discriminator = None

        if driver_id is not None:
            self.driver_id = driver_id
        if email is not None:
            self.email = email
        if mechanic_user_id is not None:
            self.mechanic_user_id = mechanic_user_id
        if name is not None:
            self.name = name
        if signed_at is not None:
            self.signed_at = signed_at
        if type is not None:
            self.type = type
        if username is not None:
            self.username = username

    @property
    def driver_id(self):
        """Gets the driver_id of this DvirBaseMechanicOrAgentSignature.  # noqa: E501

        ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.  # noqa: E501

        :return: The driver_id of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DvirBaseMechanicOrAgentSignature.

        ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.  # noqa: E501

        :param driver_id: The driver_id of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def email(self):
        """Gets the email of this DvirBaseMechanicOrAgentSignature.  # noqa: E501

        Email of the  agent|mechanic who signed the DVIR.  # noqa: E501

        :return: The email of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this DvirBaseMechanicOrAgentSignature.

        Email of the  agent|mechanic who signed the DVIR.  # noqa: E501

        :param email: The email of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def mechanic_user_id(self):
        """Gets the mechanic_user_id of this DvirBaseMechanicOrAgentSignature.  # noqa: E501

        ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.  # noqa: E501

        :return: The mechanic_user_id of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :rtype: int
        """
        return self._mechanic_user_id

    @mechanic_user_id.setter
    def mechanic_user_id(self, mechanic_user_id):
        """Sets the mechanic_user_id of this DvirBaseMechanicOrAgentSignature.

        ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.  # noqa: E501

        :param mechanic_user_id: The mechanic_user_id of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :type: int
        """

        self._mechanic_user_id = mechanic_user_id

    @property
    def name(self):
        """Gets the name of this DvirBaseMechanicOrAgentSignature.  # noqa: E501

        The name of the agent or mechanic who signed the DVIR.  # noqa: E501

        :return: The name of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DvirBaseMechanicOrAgentSignature.

        The name of the agent or mechanic who signed the DVIR.  # noqa: E501

        :param name: The name of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def signed_at(self):
        """Gets the signed_at of this DvirBaseMechanicOrAgentSignature.  # noqa: E501

        The time in millis when the DVIR was signed  # noqa: E501

        :return: The signed_at of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :rtype: int
        """
        return self._signed_at

    @signed_at.setter
    def signed_at(self, signed_at):
        """Sets the signed_at of this DvirBaseMechanicOrAgentSignature.

        The time in millis when the DVIR was signed  # noqa: E501

        :param signed_at: The signed_at of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :type: int
        """

        self._signed_at = signed_at

    @property
    def type(self):
        """Gets the type of this DvirBaseMechanicOrAgentSignature.  # noqa: E501

        Type corresponds to whether the signature corresponds to driver|mechanic.  # noqa: E501

        :return: The type of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this DvirBaseMechanicOrAgentSignature.

        Type corresponds to whether the signature corresponds to driver|mechanic.  # noqa: E501

        :param type: The type of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def username(self):
        """Gets the username of this DvirBaseMechanicOrAgentSignature.  # noqa: E501

        Username of the  agent|mechanic who signed the DVIR.  # noqa: E501

        :return: The username of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this DvirBaseMechanicOrAgentSignature.

        Username of the  agent|mechanic who signed the DVIR.  # noqa: E501

        :param username: The username of this DvirBaseMechanicOrAgentSignature.  # noqa: E501
        :type: str
        """

        self._username = username

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
        if issubclass(DvirBaseMechanicOrAgentSignature, dict):
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
        if not isinstance(other, DvirBaseMechanicOrAgentSignature):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
