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


class HosLogsSummaryResponseDrivers(object):
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
        'cycle_remaining': 'int',
        'cycle_tomorrow': 'int',
        'driver_id': 'int',
        'driver_name': 'str',
        'driving_in_violation_cycle': 'int',
        'driving_in_violation_today': 'int',
        'duty_status': 'str',
        'shift_drive_remaining': 'int',
        'shift_remaining': 'int',
        'time_in_current_status': 'int',
        'time_until_break': 'int',
        'vehicle_name': 'str'
    }

    attribute_map = {
        'cycle_remaining': 'cycleRemaining',
        'cycle_tomorrow': 'cycleTomorrow',
        'driver_id': 'driverId',
        'driver_name': 'driverName',
        'driving_in_violation_cycle': 'drivingInViolationCycle',
        'driving_in_violation_today': 'drivingInViolationToday',
        'duty_status': 'dutyStatus',
        'shift_drive_remaining': 'shiftDriveRemaining',
        'shift_remaining': 'shiftRemaining',
        'time_in_current_status': 'timeInCurrentStatus',
        'time_until_break': 'timeUntilBreak',
        'vehicle_name': 'vehicleName'
    }

    def __init__(self, cycle_remaining=None, cycle_tomorrow=None, driver_id=None, driver_name=None, driving_in_violation_cycle=None, driving_in_violation_today=None, duty_status=None, shift_drive_remaining=None, shift_remaining=None, time_in_current_status=None, time_until_break=None, vehicle_name=None):  # noqa: E501
        """HosLogsSummaryResponseDrivers - a model defined in Swagger"""  # noqa: E501

        self._cycle_remaining = None
        self._cycle_tomorrow = None
        self._driver_id = None
        self._driver_name = None
        self._driving_in_violation_cycle = None
        self._driving_in_violation_today = None
        self._duty_status = None
        self._shift_drive_remaining = None
        self._shift_remaining = None
        self._time_in_current_status = None
        self._time_until_break = None
        self._vehicle_name = None
        self.discriminator = None

        if cycle_remaining is not None:
            self.cycle_remaining = cycle_remaining
        if cycle_tomorrow is not None:
            self.cycle_tomorrow = cycle_tomorrow
        if driver_id is not None:
            self.driver_id = driver_id
        if driver_name is not None:
            self.driver_name = driver_name
        if driving_in_violation_cycle is not None:
            self.driving_in_violation_cycle = driving_in_violation_cycle
        if driving_in_violation_today is not None:
            self.driving_in_violation_today = driving_in_violation_today
        if duty_status is not None:
            self.duty_status = duty_status
        if shift_drive_remaining is not None:
            self.shift_drive_remaining = shift_drive_remaining
        if shift_remaining is not None:
            self.shift_remaining = shift_remaining
        if time_in_current_status is not None:
            self.time_in_current_status = time_in_current_status
        if time_until_break is not None:
            self.time_until_break = time_until_break
        if vehicle_name is not None:
            self.vehicle_name = vehicle_name

    @property
    def cycle_remaining(self):
        """Gets the cycle_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of remaining cycle time (in ms).  # noqa: E501

        :return: The cycle_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._cycle_remaining

    @cycle_remaining.setter
    def cycle_remaining(self, cycle_remaining):
        """Sets the cycle_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining cycle time (in ms).  # noqa: E501

        :param cycle_remaining: The cycle_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._cycle_remaining = cycle_remaining

    @property
    def cycle_tomorrow(self):
        """Gets the cycle_tomorrow of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of cycle time (in ms) available tomorrow.  # noqa: E501

        :return: The cycle_tomorrow of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._cycle_tomorrow

    @cycle_tomorrow.setter
    def cycle_tomorrow(self, cycle_tomorrow):
        """Sets the cycle_tomorrow of this HosLogsSummaryResponseDrivers.

        The amount of cycle time (in ms) available tomorrow.  # noqa: E501

        :param cycle_tomorrow: The cycle_tomorrow of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._cycle_tomorrow = cycle_tomorrow

    @property
    def driver_id(self):
        """Gets the driver_id of this HosLogsSummaryResponseDrivers.  # noqa: E501

        ID of the driver.  # noqa: E501

        :return: The driver_id of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this HosLogsSummaryResponseDrivers.

        ID of the driver.  # noqa: E501

        :param driver_id: The driver_id of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def driver_name(self):
        """Gets the driver_name of this HosLogsSummaryResponseDrivers.  # noqa: E501

        Name of the driver.  # noqa: E501

        :return: The driver_name of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: str
        """
        return self._driver_name

    @driver_name.setter
    def driver_name(self, driver_name):
        """Sets the driver_name of this HosLogsSummaryResponseDrivers.

        Name of the driver.  # noqa: E501

        :param driver_name: The driver_name of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: str
        """

        self._driver_name = driver_name

    @property
    def driving_in_violation_cycle(self):
        """Gets the driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of driving time in violation in this cycle (in ms).  # noqa: E501

        :return: The driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._driving_in_violation_cycle

    @driving_in_violation_cycle.setter
    def driving_in_violation_cycle(self, driving_in_violation_cycle):
        """Sets the driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.

        The amount of driving time in violation in this cycle (in ms).  # noqa: E501

        :param driving_in_violation_cycle: The driving_in_violation_cycle of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._driving_in_violation_cycle = driving_in_violation_cycle

    @property
    def driving_in_violation_today(self):
        """Gets the driving_in_violation_today of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of driving time in violation today (in ms).  # noqa: E501

        :return: The driving_in_violation_today of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._driving_in_violation_today

    @driving_in_violation_today.setter
    def driving_in_violation_today(self, driving_in_violation_today):
        """Sets the driving_in_violation_today of this HosLogsSummaryResponseDrivers.

        The amount of driving time in violation today (in ms).  # noqa: E501

        :param driving_in_violation_today: The driving_in_violation_today of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._driving_in_violation_today = driving_in_violation_today

    @property
    def duty_status(self):
        """Gets the duty_status of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.  # noqa: E501

        :return: The duty_status of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: str
        """
        return self._duty_status

    @duty_status.setter
    def duty_status(self, duty_status):
        """Sets the duty_status of this HosLogsSummaryResponseDrivers.

        The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.  # noqa: E501

        :param duty_status: The duty_status of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: str
        """

        self._duty_status = duty_status

    @property
    def shift_drive_remaining(self):
        """Gets the shift_drive_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of remaining shift drive time (in ms).  # noqa: E501

        :return: The shift_drive_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._shift_drive_remaining

    @shift_drive_remaining.setter
    def shift_drive_remaining(self, shift_drive_remaining):
        """Sets the shift_drive_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining shift drive time (in ms).  # noqa: E501

        :param shift_drive_remaining: The shift_drive_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._shift_drive_remaining = shift_drive_remaining

    @property
    def shift_remaining(self):
        """Gets the shift_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of remaining shift time (in ms).  # noqa: E501

        :return: The shift_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._shift_remaining

    @shift_remaining.setter
    def shift_remaining(self, shift_remaining):
        """Sets the shift_remaining of this HosLogsSummaryResponseDrivers.

        The amount of remaining shift time (in ms).  # noqa: E501

        :param shift_remaining: The shift_remaining of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._shift_remaining = shift_remaining

    @property
    def time_in_current_status(self):
        """Gets the time_in_current_status of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of time (in ms) that the driver has been in the current `dutyStatus`.  # noqa: E501

        :return: The time_in_current_status of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._time_in_current_status

    @time_in_current_status.setter
    def time_in_current_status(self, time_in_current_status):
        """Sets the time_in_current_status of this HosLogsSummaryResponseDrivers.

        The amount of time (in ms) that the driver has been in the current `dutyStatus`.  # noqa: E501

        :param time_in_current_status: The time_in_current_status of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._time_in_current_status = time_in_current_status

    @property
    def time_until_break(self):
        """Gets the time_until_break of this HosLogsSummaryResponseDrivers.  # noqa: E501

        The amount of time (in ms) remaining until the driver cannot drive without a rest break.  # noqa: E501

        :return: The time_until_break of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: int
        """
        return self._time_until_break

    @time_until_break.setter
    def time_until_break(self, time_until_break):
        """Sets the time_until_break of this HosLogsSummaryResponseDrivers.

        The amount of time (in ms) remaining until the driver cannot drive without a rest break.  # noqa: E501

        :param time_until_break: The time_until_break of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: int
        """

        self._time_until_break = time_until_break

    @property
    def vehicle_name(self):
        """Gets the vehicle_name of this HosLogsSummaryResponseDrivers.  # noqa: E501

        Name of the vehicle.  # noqa: E501

        :return: The vehicle_name of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :rtype: str
        """
        return self._vehicle_name

    @vehicle_name.setter
    def vehicle_name(self, vehicle_name):
        """Sets the vehicle_name of this HosLogsSummaryResponseDrivers.

        Name of the vehicle.  # noqa: E501

        :param vehicle_name: The vehicle_name of this HosLogsSummaryResponseDrivers.  # noqa: E501
        :type: str
        """

        self._vehicle_name = vehicle_name

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
        if issubclass(HosLogsSummaryResponseDrivers, dict):
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
        if not isinstance(other, HosLogsSummaryResponseDrivers):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
