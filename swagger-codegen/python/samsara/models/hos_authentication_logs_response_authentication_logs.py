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


class HosAuthenticationLogsResponseAuthenticationLogs(object):
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
        'action_type': 'str',
        'address': 'str',
        'address_name': 'str',
        'city': 'str',
        'happened_at_ms': 'int',
        'state': 'str'
    }

    attribute_map = {
        'action_type': 'actionType',
        'address': 'address',
        'address_name': 'addressName',
        'city': 'city',
        'happened_at_ms': 'happenedAtMs',
        'state': 'state'
    }

    def __init__(self, action_type=None, address=None, address_name=None, city=None, happened_at_ms=None, state=None):  # noqa: E501
        """HosAuthenticationLogsResponseAuthenticationLogs - a model defined in Swagger"""  # noqa: E501

        self._action_type = None
        self._address = None
        self._address_name = None
        self._city = None
        self._happened_at_ms = None
        self._state = None
        self.discriminator = None

        if action_type is not None:
            self.action_type = action_type
        if address is not None:
            self.address = address
        if address_name is not None:
            self.address_name = address_name
        if city is not None:
            self.city = city
        if happened_at_ms is not None:
            self.happened_at_ms = happened_at_ms
        if state is not None:
            self.state = state

    @property
    def action_type(self):
        """Gets the action_type of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501

        The log type - one of 'signin' or 'signout'  # noqa: E501

        :return: The action_type of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :rtype: str
        """
        return self._action_type

    @action_type.setter
    def action_type(self, action_type):
        """Sets the action_type of this HosAuthenticationLogsResponseAuthenticationLogs.

        The log type - one of 'signin' or 'signout'  # noqa: E501

        :param action_type: The action_type of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :type: str
        """

        self._action_type = action_type

    @property
    def address(self):
        """Gets the address of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501

        Address at which the log was recorded, if applicable.  # noqa: E501

        :return: The address of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :rtype: str
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this HosAuthenticationLogsResponseAuthenticationLogs.

        Address at which the log was recorded, if applicable.  # noqa: E501

        :param address: The address of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :type: str
        """

        self._address = address

    @property
    def address_name(self):
        """Gets the address_name of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501

        Address name from the group address book at which the log was recorded, if applicable.  # noqa: E501

        :return: The address_name of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :rtype: str
        """
        return self._address_name

    @address_name.setter
    def address_name(self, address_name):
        """Sets the address_name of this HosAuthenticationLogsResponseAuthenticationLogs.

        Address name from the group address book at which the log was recorded, if applicable.  # noqa: E501

        :param address_name: The address_name of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :type: str
        """

        self._address_name = address_name

    @property
    def city(self):
        """Gets the city of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501

        City in which the log was recorded, if applicable.  # noqa: E501

        :return: The city of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :rtype: str
        """
        return self._city

    @city.setter
    def city(self, city):
        """Sets the city of this HosAuthenticationLogsResponseAuthenticationLogs.

        City in which the log was recorded, if applicable.  # noqa: E501

        :param city: The city of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :type: str
        """

        self._city = city

    @property
    def happened_at_ms(self):
        """Gets the happened_at_ms of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501

        The time at which the event was recorded in UNIX milliseconds.  # noqa: E501

        :return: The happened_at_ms of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :rtype: int
        """
        return self._happened_at_ms

    @happened_at_ms.setter
    def happened_at_ms(self, happened_at_ms):
        """Sets the happened_at_ms of this HosAuthenticationLogsResponseAuthenticationLogs.

        The time at which the event was recorded in UNIX milliseconds.  # noqa: E501

        :param happened_at_ms: The happened_at_ms of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :type: int
        """

        self._happened_at_ms = happened_at_ms

    @property
    def state(self):
        """Gets the state of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501

        State in which the log was recorded, if applicable.  # noqa: E501

        :return: The state of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this HosAuthenticationLogsResponseAuthenticationLogs.

        State in which the log was recorded, if applicable.  # noqa: E501

        :param state: The state of this HosAuthenticationLogsResponseAuthenticationLogs.  # noqa: E501
        :type: str
        """

        self._state = state

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
        if issubclass(HosAuthenticationLogsResponseAuthenticationLogs, dict):
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
        if not isinstance(other, HosAuthenticationLogsResponseAuthenticationLogs):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
