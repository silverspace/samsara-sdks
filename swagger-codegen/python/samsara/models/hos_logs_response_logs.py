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


class HosLogsResponseLogs(object):
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
        'codriver_ids': 'list[int]',
        'driver_id': 'int',
        'group_id': 'int',
        'loc_city': 'str',
        'loc_lat': 'float',
        'loc_lng': 'float',
        'loc_name': 'str',
        'loc_state': 'str',
        'log_start_ms': 'int',
        'remark': 'str',
        'status_type': 'str',
        'vehicle_id': 'int'
    }

    attribute_map = {
        'codriver_ids': 'codriverIds',
        'driver_id': 'driverId',
        'group_id': 'groupId',
        'loc_city': 'locCity',
        'loc_lat': 'locLat',
        'loc_lng': 'locLng',
        'loc_name': 'locName',
        'loc_state': 'locState',
        'log_start_ms': 'logStartMs',
        'remark': 'remark',
        'status_type': 'statusType',
        'vehicle_id': 'vehicleId'
    }

    def __init__(self, codriver_ids=None, driver_id=None, group_id=None, loc_city=None, loc_lat=None, loc_lng=None, loc_name=None, loc_state=None, log_start_ms=None, remark=None, status_type=None, vehicle_id=None):  # noqa: E501
        """HosLogsResponseLogs - a model defined in Swagger"""  # noqa: E501

        self._codriver_ids = None
        self._driver_id = None
        self._group_id = None
        self._loc_city = None
        self._loc_lat = None
        self._loc_lng = None
        self._loc_name = None
        self._loc_state = None
        self._log_start_ms = None
        self._remark = None
        self._status_type = None
        self._vehicle_id = None
        self.discriminator = None

        if codriver_ids is not None:
            self.codriver_ids = codriver_ids
        if driver_id is not None:
            self.driver_id = driver_id
        if group_id is not None:
            self.group_id = group_id
        if loc_city is not None:
            self.loc_city = loc_city
        if loc_lat is not None:
            self.loc_lat = loc_lat
        if loc_lng is not None:
            self.loc_lng = loc_lng
        if loc_name is not None:
            self.loc_name = loc_name
        if loc_state is not None:
            self.loc_state = loc_state
        if log_start_ms is not None:
            self.log_start_ms = log_start_ms
        if remark is not None:
            self.remark = remark
        if status_type is not None:
            self.status_type = status_type
        if vehicle_id is not None:
            self.vehicle_id = vehicle_id

    @property
    def codriver_ids(self):
        """Gets the codriver_ids of this HosLogsResponseLogs.  # noqa: E501


        :return: The codriver_ids of this HosLogsResponseLogs.  # noqa: E501
        :rtype: list[int]
        """
        return self._codriver_ids

    @codriver_ids.setter
    def codriver_ids(self, codriver_ids):
        """Sets the codriver_ids of this HosLogsResponseLogs.


        :param codriver_ids: The codriver_ids of this HosLogsResponseLogs.  # noqa: E501
        :type: list[int]
        """

        self._codriver_ids = codriver_ids

    @property
    def driver_id(self):
        """Gets the driver_id of this HosLogsResponseLogs.  # noqa: E501

        ID of the driver.  # noqa: E501

        :return: The driver_id of this HosLogsResponseLogs.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this HosLogsResponseLogs.

        ID of the driver.  # noqa: E501

        :param driver_id: The driver_id of this HosLogsResponseLogs.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def group_id(self):
        """Gets the group_id of this HosLogsResponseLogs.  # noqa: E501

        ID of the group.  # noqa: E501

        :return: The group_id of this HosLogsResponseLogs.  # noqa: E501
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this HosLogsResponseLogs.

        ID of the group.  # noqa: E501

        :param group_id: The group_id of this HosLogsResponseLogs.  # noqa: E501
        :type: int
        """

        self._group_id = group_id

    @property
    def loc_city(self):
        """Gets the loc_city of this HosLogsResponseLogs.  # noqa: E501

        City in which the log was recorded.  # noqa: E501

        :return: The loc_city of this HosLogsResponseLogs.  # noqa: E501
        :rtype: str
        """
        return self._loc_city

    @loc_city.setter
    def loc_city(self, loc_city):
        """Sets the loc_city of this HosLogsResponseLogs.

        City in which the log was recorded.  # noqa: E501

        :param loc_city: The loc_city of this HosLogsResponseLogs.  # noqa: E501
        :type: str
        """

        self._loc_city = loc_city

    @property
    def loc_lat(self):
        """Gets the loc_lat of this HosLogsResponseLogs.  # noqa: E501

        Latitude at which the log was recorded.  # noqa: E501

        :return: The loc_lat of this HosLogsResponseLogs.  # noqa: E501
        :rtype: float
        """
        return self._loc_lat

    @loc_lat.setter
    def loc_lat(self, loc_lat):
        """Sets the loc_lat of this HosLogsResponseLogs.

        Latitude at which the log was recorded.  # noqa: E501

        :param loc_lat: The loc_lat of this HosLogsResponseLogs.  # noqa: E501
        :type: float
        """

        self._loc_lat = loc_lat

    @property
    def loc_lng(self):
        """Gets the loc_lng of this HosLogsResponseLogs.  # noqa: E501

        Longitude at which the log was recorded.  # noqa: E501

        :return: The loc_lng of this HosLogsResponseLogs.  # noqa: E501
        :rtype: float
        """
        return self._loc_lng

    @loc_lng.setter
    def loc_lng(self, loc_lng):
        """Sets the loc_lng of this HosLogsResponseLogs.

        Longitude at which the log was recorded.  # noqa: E501

        :param loc_lng: The loc_lng of this HosLogsResponseLogs.  # noqa: E501
        :type: float
        """

        self._loc_lng = loc_lng

    @property
    def loc_name(self):
        """Gets the loc_name of this HosLogsResponseLogs.  # noqa: E501

        Name of location at which the log was recorded.  # noqa: E501

        :return: The loc_name of this HosLogsResponseLogs.  # noqa: E501
        :rtype: str
        """
        return self._loc_name

    @loc_name.setter
    def loc_name(self, loc_name):
        """Sets the loc_name of this HosLogsResponseLogs.

        Name of location at which the log was recorded.  # noqa: E501

        :param loc_name: The loc_name of this HosLogsResponseLogs.  # noqa: E501
        :type: str
        """

        self._loc_name = loc_name

    @property
    def loc_state(self):
        """Gets the loc_state of this HosLogsResponseLogs.  # noqa: E501

        State in which the log was recorded.  # noqa: E501

        :return: The loc_state of this HosLogsResponseLogs.  # noqa: E501
        :rtype: str
        """
        return self._loc_state

    @loc_state.setter
    def loc_state(self, loc_state):
        """Sets the loc_state of this HosLogsResponseLogs.

        State in which the log was recorded.  # noqa: E501

        :param loc_state: The loc_state of this HosLogsResponseLogs.  # noqa: E501
        :type: str
        """

        self._loc_state = loc_state

    @property
    def log_start_ms(self):
        """Gets the log_start_ms of this HosLogsResponseLogs.  # noqa: E501

        The time at which the log/HOS status started in UNIX milliseconds.  # noqa: E501

        :return: The log_start_ms of this HosLogsResponseLogs.  # noqa: E501
        :rtype: int
        """
        return self._log_start_ms

    @log_start_ms.setter
    def log_start_ms(self, log_start_ms):
        """Sets the log_start_ms of this HosLogsResponseLogs.

        The time at which the log/HOS status started in UNIX milliseconds.  # noqa: E501

        :param log_start_ms: The log_start_ms of this HosLogsResponseLogs.  # noqa: E501
        :type: int
        """

        self._log_start_ms = log_start_ms

    @property
    def remark(self):
        """Gets the remark of this HosLogsResponseLogs.  # noqa: E501

        Remark associated with the log entry.  # noqa: E501

        :return: The remark of this HosLogsResponseLogs.  # noqa: E501
        :rtype: str
        """
        return self._remark

    @remark.setter
    def remark(self, remark):
        """Sets the remark of this HosLogsResponseLogs.

        Remark associated with the log entry.  # noqa: E501

        :param remark: The remark of this HosLogsResponseLogs.  # noqa: E501
        :type: str
        """

        self._remark = remark

    @property
    def status_type(self):
        """Gets the status_type of this HosLogsResponseLogs.  # noqa: E501

        The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.  # noqa: E501

        :return: The status_type of this HosLogsResponseLogs.  # noqa: E501
        :rtype: str
        """
        return self._status_type

    @status_type.setter
    def status_type(self, status_type):
        """Sets the status_type of this HosLogsResponseLogs.

        The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.  # noqa: E501

        :param status_type: The status_type of this HosLogsResponseLogs.  # noqa: E501
        :type: str
        """

        self._status_type = status_type

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this HosLogsResponseLogs.  # noqa: E501

        ID of the vehicle.  # noqa: E501

        :return: The vehicle_id of this HosLogsResponseLogs.  # noqa: E501
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this HosLogsResponseLogs.

        ID of the vehicle.  # noqa: E501

        :param vehicle_id: The vehicle_id of this HosLogsResponseLogs.  # noqa: E501
        :type: int
        """

        self._vehicle_id = vehicle_id

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
        if issubclass(HosLogsResponseLogs, dict):
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
        if not isinstance(other, HosLogsResponseLogs):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
