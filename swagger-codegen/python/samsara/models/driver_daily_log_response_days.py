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


class DriverDailyLogResponseDays(object):
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
        'active_hours': 'float',
        'active_ms': 'int',
        'certified': 'bool',
        'certified_at_ms': 'int',
        'distance_miles': 'float',
        'end_ms': 'int',
        'start_ms': 'int',
        'trailer_ids': 'object',
        'vehicle_ids': 'object'
    }

    attribute_map = {
        'active_hours': 'activeHours',
        'active_ms': 'activeMs',
        'certified': 'certified',
        'certified_at_ms': 'certifiedAtMs',
        'distance_miles': 'distanceMiles',
        'end_ms': 'endMs',
        'start_ms': 'startMs',
        'trailer_ids': 'trailerIds',
        'vehicle_ids': 'vehicleIds'
    }

    def __init__(self, active_hours=None, active_ms=None, certified=None, certified_at_ms=None, distance_miles=None, end_ms=None, start_ms=None, trailer_ids=None, vehicle_ids=None):  # noqa: E501
        """DriverDailyLogResponseDays - a model defined in Swagger"""  # noqa: E501

        self._active_hours = None
        self._active_ms = None
        self._certified = None
        self._certified_at_ms = None
        self._distance_miles = None
        self._end_ms = None
        self._start_ms = None
        self._trailer_ids = None
        self._vehicle_ids = None
        self.discriminator = None

        if active_hours is not None:
            self.active_hours = active_hours
        if active_ms is not None:
            self.active_ms = active_ms
        if certified is not None:
            self.certified = certified
        if certified_at_ms is not None:
            self.certified_at_ms = certified_at_ms
        if distance_miles is not None:
            self.distance_miles = distance_miles
        if end_ms is not None:
            self.end_ms = end_ms
        if start_ms is not None:
            self.start_ms = start_ms
        if trailer_ids is not None:
            self.trailer_ids = trailer_ids
        if vehicle_ids is not None:
            self.vehicle_ids = vehicle_ids

    @property
    def active_hours(self):
        """Gets the active_hours of this DriverDailyLogResponseDays.  # noqa: E501

        Hours spent on duty or driving, rounded to two decimal places.  # noqa: E501

        :return: The active_hours of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: float
        """
        return self._active_hours

    @active_hours.setter
    def active_hours(self, active_hours):
        """Sets the active_hours of this DriverDailyLogResponseDays.

        Hours spent on duty or driving, rounded to two decimal places.  # noqa: E501

        :param active_hours: The active_hours of this DriverDailyLogResponseDays.  # noqa: E501
        :type: float
        """

        self._active_hours = active_hours

    @property
    def active_ms(self):
        """Gets the active_ms of this DriverDailyLogResponseDays.  # noqa: E501

        Milliseconds spent on duty or driving.  # noqa: E501

        :return: The active_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: int
        """
        return self._active_ms

    @active_ms.setter
    def active_ms(self, active_ms):
        """Sets the active_ms of this DriverDailyLogResponseDays.

        Milliseconds spent on duty or driving.  # noqa: E501

        :param active_ms: The active_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :type: int
        """

        self._active_ms = active_ms

    @property
    def certified(self):
        """Gets the certified of this DriverDailyLogResponseDays.  # noqa: E501

        Whether this HOS day chart was certified by the driver.  # noqa: E501

        :return: The certified of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: bool
        """
        return self._certified

    @certified.setter
    def certified(self, certified):
        """Sets the certified of this DriverDailyLogResponseDays.

        Whether this HOS day chart was certified by the driver.  # noqa: E501

        :param certified: The certified of this DriverDailyLogResponseDays.  # noqa: E501
        :type: bool
        """

        self._certified = certified

    @property
    def certified_at_ms(self):
        """Gets the certified_at_ms of this DriverDailyLogResponseDays.  # noqa: E501

        Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.  # noqa: E501

        :return: The certified_at_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: int
        """
        return self._certified_at_ms

    @certified_at_ms.setter
    def certified_at_ms(self, certified_at_ms):
        """Sets the certified_at_ms of this DriverDailyLogResponseDays.

        Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.  # noqa: E501

        :param certified_at_ms: The certified_at_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :type: int
        """

        self._certified_at_ms = certified_at_ms

    @property
    def distance_miles(self):
        """Gets the distance_miles of this DriverDailyLogResponseDays.  # noqa: E501

        Distance driven in miles, rounded to two decimal places.  # noqa: E501

        :return: The distance_miles of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: float
        """
        return self._distance_miles

    @distance_miles.setter
    def distance_miles(self, distance_miles):
        """Sets the distance_miles of this DriverDailyLogResponseDays.

        Distance driven in miles, rounded to two decimal places.  # noqa: E501

        :param distance_miles: The distance_miles of this DriverDailyLogResponseDays.  # noqa: E501
        :type: float
        """

        self._distance_miles = distance_miles

    @property
    def end_ms(self):
        """Gets the end_ms of this DriverDailyLogResponseDays.  # noqa: E501

        End of the HOS day, specified in milliseconds UNIX time.  # noqa: E501

        :return: The end_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: int
        """
        return self._end_ms

    @end_ms.setter
    def end_ms(self, end_ms):
        """Sets the end_ms of this DriverDailyLogResponseDays.

        End of the HOS day, specified in milliseconds UNIX time.  # noqa: E501

        :param end_ms: The end_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :type: int
        """

        self._end_ms = end_ms

    @property
    def start_ms(self):
        """Gets the start_ms of this DriverDailyLogResponseDays.  # noqa: E501

        End of the HOS day, specified in milliseconds UNIX time.  # noqa: E501

        :return: The start_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: int
        """
        return self._start_ms

    @start_ms.setter
    def start_ms(self, start_ms):
        """Sets the start_ms of this DriverDailyLogResponseDays.

        End of the HOS day, specified in milliseconds UNIX time.  # noqa: E501

        :param start_ms: The start_ms of this DriverDailyLogResponseDays.  # noqa: E501
        :type: int
        """

        self._start_ms = start_ms

    @property
    def trailer_ids(self):
        """Gets the trailer_ids of this DriverDailyLogResponseDays.  # noqa: E501

        List of trailer ID's associated with the driver for the day.  # noqa: E501

        :return: The trailer_ids of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: object
        """
        return self._trailer_ids

    @trailer_ids.setter
    def trailer_ids(self, trailer_ids):
        """Sets the trailer_ids of this DriverDailyLogResponseDays.

        List of trailer ID's associated with the driver for the day.  # noqa: E501

        :param trailer_ids: The trailer_ids of this DriverDailyLogResponseDays.  # noqa: E501
        :type: object
        """

        self._trailer_ids = trailer_ids

    @property
    def vehicle_ids(self):
        """Gets the vehicle_ids of this DriverDailyLogResponseDays.  # noqa: E501

        List of vehicle ID's associated with the driver for the day.  # noqa: E501

        :return: The vehicle_ids of this DriverDailyLogResponseDays.  # noqa: E501
        :rtype: object
        """
        return self._vehicle_ids

    @vehicle_ids.setter
    def vehicle_ids(self, vehicle_ids):
        """Sets the vehicle_ids of this DriverDailyLogResponseDays.

        List of vehicle ID's associated with the driver for the day.  # noqa: E501

        :param vehicle_ids: The vehicle_ids of this DriverDailyLogResponseDays.  # noqa: E501
        :type: object
        """

        self._vehicle_ids = vehicle_ids

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
        if issubclass(DriverDailyLogResponseDays, dict):
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
        if not isinstance(other, DriverDailyLogResponseDays):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
