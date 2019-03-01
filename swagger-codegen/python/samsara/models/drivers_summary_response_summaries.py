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


class DriversSummaryResponseSummaries(object):
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
        'active_ms': 'int',
        'distance_miles': 'float',
        'drive_ms': 'int',
        'driver_id': 'int',
        'driver_name': 'str',
        'driver_username': 'str',
        'group_id': 'int',
        'on_duty_ms': 'int'
    }

    attribute_map = {
        'active_ms': 'activeMs',
        'distance_miles': 'distanceMiles',
        'drive_ms': 'driveMs',
        'driver_id': 'driverId',
        'driver_name': 'driverName',
        'driver_username': 'driverUsername',
        'group_id': 'groupId',
        'on_duty_ms': 'onDutyMs'
    }

    def __init__(self, active_ms=None, distance_miles=None, drive_ms=None, driver_id=None, driver_name=None, driver_username=None, group_id=None, on_duty_ms=None):  # noqa: E501
        """DriversSummaryResponseSummaries - a model defined in Swagger"""  # noqa: E501

        self._active_ms = None
        self._distance_miles = None
        self._drive_ms = None
        self._driver_id = None
        self._driver_name = None
        self._driver_username = None
        self._group_id = None
        self._on_duty_ms = None
        self.discriminator = None

        if active_ms is not None:
            self.active_ms = active_ms
        if distance_miles is not None:
            self.distance_miles = distance_miles
        if drive_ms is not None:
            self.drive_ms = drive_ms
        if driver_id is not None:
            self.driver_id = driver_id
        if driver_name is not None:
            self.driver_name = driver_name
        if driver_username is not None:
            self.driver_username = driver_username
        if group_id is not None:
            self.group_id = group_id
        if on_duty_ms is not None:
            self.on_duty_ms = on_duty_ms

    @property
    def active_ms(self):
        """Gets the active_ms of this DriversSummaryResponseSummaries.  # noqa: E501

        Duration in milliseconds that driver was on duty or driving during the requested time range  # noqa: E501

        :return: The active_ms of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: int
        """
        return self._active_ms

    @active_ms.setter
    def active_ms(self, active_ms):
        """Sets the active_ms of this DriversSummaryResponseSummaries.

        Duration in milliseconds that driver was on duty or driving during the requested time range  # noqa: E501

        :param active_ms: The active_ms of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: int
        """

        self._active_ms = active_ms

    @property
    def distance_miles(self):
        """Gets the distance_miles of this DriversSummaryResponseSummaries.  # noqa: E501

        Distance driven in miles, rounded to two decimal places.  # noqa: E501

        :return: The distance_miles of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: float
        """
        return self._distance_miles

    @distance_miles.setter
    def distance_miles(self, distance_miles):
        """Sets the distance_miles of this DriversSummaryResponseSummaries.

        Distance driven in miles, rounded to two decimal places.  # noqa: E501

        :param distance_miles: The distance_miles of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: float
        """

        self._distance_miles = distance_miles

    @property
    def drive_ms(self):
        """Gets the drive_ms of this DriversSummaryResponseSummaries.  # noqa: E501

        Duration in milliseconds that driver was driving during the requested time range  # noqa: E501

        :return: The drive_ms of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: int
        """
        return self._drive_ms

    @drive_ms.setter
    def drive_ms(self, drive_ms):
        """Sets the drive_ms of this DriversSummaryResponseSummaries.

        Duration in milliseconds that driver was driving during the requested time range  # noqa: E501

        :param drive_ms: The drive_ms of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: int
        """

        self._drive_ms = drive_ms

    @property
    def driver_id(self):
        """Gets the driver_id of this DriversSummaryResponseSummaries.  # noqa: E501

        ID of the driver.  # noqa: E501

        :return: The driver_id of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DriversSummaryResponseSummaries.

        ID of the driver.  # noqa: E501

        :param driver_id: The driver_id of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def driver_name(self):
        """Gets the driver_name of this DriversSummaryResponseSummaries.  # noqa: E501

        Name of the driver.  # noqa: E501

        :return: The driver_name of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: str
        """
        return self._driver_name

    @driver_name.setter
    def driver_name(self, driver_name):
        """Sets the driver_name of this DriversSummaryResponseSummaries.

        Name of the driver.  # noqa: E501

        :param driver_name: The driver_name of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: str
        """

        self._driver_name = driver_name

    @property
    def driver_username(self):
        """Gets the driver_username of this DriversSummaryResponseSummaries.  # noqa: E501

        Username of the driver.  # noqa: E501

        :return: The driver_username of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: str
        """
        return self._driver_username

    @driver_username.setter
    def driver_username(self, driver_username):
        """Sets the driver_username of this DriversSummaryResponseSummaries.

        Username of the driver.  # noqa: E501

        :param driver_username: The driver_username of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: str
        """

        self._driver_username = driver_username

    @property
    def group_id(self):
        """Gets the group_id of this DriversSummaryResponseSummaries.  # noqa: E501

        Group of the driver.  # noqa: E501

        :return: The group_id of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this DriversSummaryResponseSummaries.

        Group of the driver.  # noqa: E501

        :param group_id: The group_id of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: int
        """

        self._group_id = group_id

    @property
    def on_duty_ms(self):
        """Gets the on_duty_ms of this DriversSummaryResponseSummaries.  # noqa: E501

        Duration in milliseconds that driver was on duty during the requested time range  # noqa: E501

        :return: The on_duty_ms of this DriversSummaryResponseSummaries.  # noqa: E501
        :rtype: int
        """
        return self._on_duty_ms

    @on_duty_ms.setter
    def on_duty_ms(self, on_duty_ms):
        """Sets the on_duty_ms of this DriversSummaryResponseSummaries.

        Duration in milliseconds that driver was on duty during the requested time range  # noqa: E501

        :param on_duty_ms: The on_duty_ms of this DriversSummaryResponseSummaries.  # noqa: E501
        :type: int
        """

        self._on_duty_ms = on_duty_ms

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
        if issubclass(DriversSummaryResponseSummaries, dict):
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
        if not isinstance(other, DriversSummaryResponseSummaries):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
