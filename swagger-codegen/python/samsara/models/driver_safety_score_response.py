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

from samsara.models.safety_report_harsh_event import SafetyReportHarshEvent  # noqa: F401,E501


class DriverSafetyScoreResponse(object):
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
        'crash_count': 'int',
        'driver_id': 'int',
        'harsh_accel_count': 'int',
        'harsh_braking_count': 'int',
        'harsh_events': 'list[SafetyReportHarshEvent]',
        'harsh_turning_count': 'int',
        'safety_score': 'int',
        'safety_score_rank': 'str',
        'time_over_speed_limit_ms': 'int',
        'total_distance_driven_meters': 'int',
        'total_harsh_event_count': 'int',
        'total_time_driven_ms': 'int'
    }

    attribute_map = {
        'crash_count': 'crashCount',
        'driver_id': 'driverId',
        'harsh_accel_count': 'harshAccelCount',
        'harsh_braking_count': 'harshBrakingCount',
        'harsh_events': 'harshEvents',
        'harsh_turning_count': 'harshTurningCount',
        'safety_score': 'safetyScore',
        'safety_score_rank': 'safetyScoreRank',
        'time_over_speed_limit_ms': 'timeOverSpeedLimitMs',
        'total_distance_driven_meters': 'totalDistanceDrivenMeters',
        'total_harsh_event_count': 'totalHarshEventCount',
        'total_time_driven_ms': 'totalTimeDrivenMs'
    }

    def __init__(self, crash_count=None, driver_id=None, harsh_accel_count=None, harsh_braking_count=None, harsh_events=None, harsh_turning_count=None, safety_score=None, safety_score_rank=None, time_over_speed_limit_ms=None, total_distance_driven_meters=None, total_harsh_event_count=None, total_time_driven_ms=None):  # noqa: E501
        """DriverSafetyScoreResponse - a model defined in Swagger"""  # noqa: E501

        self._crash_count = None
        self._driver_id = None
        self._harsh_accel_count = None
        self._harsh_braking_count = None
        self._harsh_events = None
        self._harsh_turning_count = None
        self._safety_score = None
        self._safety_score_rank = None
        self._time_over_speed_limit_ms = None
        self._total_distance_driven_meters = None
        self._total_harsh_event_count = None
        self._total_time_driven_ms = None
        self.discriminator = None

        if crash_count is not None:
            self.crash_count = crash_count
        if driver_id is not None:
            self.driver_id = driver_id
        if harsh_accel_count is not None:
            self.harsh_accel_count = harsh_accel_count
        if harsh_braking_count is not None:
            self.harsh_braking_count = harsh_braking_count
        if harsh_events is not None:
            self.harsh_events = harsh_events
        if harsh_turning_count is not None:
            self.harsh_turning_count = harsh_turning_count
        if safety_score is not None:
            self.safety_score = safety_score
        if safety_score_rank is not None:
            self.safety_score_rank = safety_score_rank
        if time_over_speed_limit_ms is not None:
            self.time_over_speed_limit_ms = time_over_speed_limit_ms
        if total_distance_driven_meters is not None:
            self.total_distance_driven_meters = total_distance_driven_meters
        if total_harsh_event_count is not None:
            self.total_harsh_event_count = total_harsh_event_count
        if total_time_driven_ms is not None:
            self.total_time_driven_ms = total_time_driven_ms

    @property
    def crash_count(self):
        """Gets the crash_count of this DriverSafetyScoreResponse.  # noqa: E501

        Crash event count  # noqa: E501

        :return: The crash_count of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._crash_count

    @crash_count.setter
    def crash_count(self, crash_count):
        """Sets the crash_count of this DriverSafetyScoreResponse.

        Crash event count  # noqa: E501

        :param crash_count: The crash_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._crash_count = crash_count

    @property
    def driver_id(self):
        """Gets the driver_id of this DriverSafetyScoreResponse.  # noqa: E501

        Driver ID  # noqa: E501

        :return: The driver_id of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DriverSafetyScoreResponse.

        Driver ID  # noqa: E501

        :param driver_id: The driver_id of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def harsh_accel_count(self):
        """Gets the harsh_accel_count of this DriverSafetyScoreResponse.  # noqa: E501

        Harsh acceleration event count  # noqa: E501

        :return: The harsh_accel_count of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._harsh_accel_count

    @harsh_accel_count.setter
    def harsh_accel_count(self, harsh_accel_count):
        """Sets the harsh_accel_count of this DriverSafetyScoreResponse.

        Harsh acceleration event count  # noqa: E501

        :param harsh_accel_count: The harsh_accel_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._harsh_accel_count = harsh_accel_count

    @property
    def harsh_braking_count(self):
        """Gets the harsh_braking_count of this DriverSafetyScoreResponse.  # noqa: E501

        Harsh braking event count  # noqa: E501

        :return: The harsh_braking_count of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._harsh_braking_count

    @harsh_braking_count.setter
    def harsh_braking_count(self, harsh_braking_count):
        """Sets the harsh_braking_count of this DriverSafetyScoreResponse.

        Harsh braking event count  # noqa: E501

        :param harsh_braking_count: The harsh_braking_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._harsh_braking_count = harsh_braking_count

    @property
    def harsh_events(self):
        """Gets the harsh_events of this DriverSafetyScoreResponse.  # noqa: E501


        :return: The harsh_events of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: list[SafetyReportHarshEvent]
        """
        return self._harsh_events

    @harsh_events.setter
    def harsh_events(self, harsh_events):
        """Sets the harsh_events of this DriverSafetyScoreResponse.


        :param harsh_events: The harsh_events of this DriverSafetyScoreResponse.  # noqa: E501
        :type: list[SafetyReportHarshEvent]
        """

        self._harsh_events = harsh_events

    @property
    def harsh_turning_count(self):
        """Gets the harsh_turning_count of this DriverSafetyScoreResponse.  # noqa: E501

        Harsh turning event count  # noqa: E501

        :return: The harsh_turning_count of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._harsh_turning_count

    @harsh_turning_count.setter
    def harsh_turning_count(self, harsh_turning_count):
        """Sets the harsh_turning_count of this DriverSafetyScoreResponse.

        Harsh turning event count  # noqa: E501

        :param harsh_turning_count: The harsh_turning_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._harsh_turning_count = harsh_turning_count

    @property
    def safety_score(self):
        """Gets the safety_score of this DriverSafetyScoreResponse.  # noqa: E501

        Safety Score  # noqa: E501

        :return: The safety_score of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._safety_score

    @safety_score.setter
    def safety_score(self, safety_score):
        """Sets the safety_score of this DriverSafetyScoreResponse.

        Safety Score  # noqa: E501

        :param safety_score: The safety_score of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._safety_score = safety_score

    @property
    def safety_score_rank(self):
        """Gets the safety_score_rank of this DriverSafetyScoreResponse.  # noqa: E501

        Safety Score Rank  # noqa: E501

        :return: The safety_score_rank of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: str
        """
        return self._safety_score_rank

    @safety_score_rank.setter
    def safety_score_rank(self, safety_score_rank):
        """Sets the safety_score_rank of this DriverSafetyScoreResponse.

        Safety Score Rank  # noqa: E501

        :param safety_score_rank: The safety_score_rank of this DriverSafetyScoreResponse.  # noqa: E501
        :type: str
        """

        self._safety_score_rank = safety_score_rank

    @property
    def time_over_speed_limit_ms(self):
        """Gets the time_over_speed_limit_ms of this DriverSafetyScoreResponse.  # noqa: E501

        Amount of time driven over the speed limit in milliseconds  # noqa: E501

        :return: The time_over_speed_limit_ms of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._time_over_speed_limit_ms

    @time_over_speed_limit_ms.setter
    def time_over_speed_limit_ms(self, time_over_speed_limit_ms):
        """Sets the time_over_speed_limit_ms of this DriverSafetyScoreResponse.

        Amount of time driven over the speed limit in milliseconds  # noqa: E501

        :param time_over_speed_limit_ms: The time_over_speed_limit_ms of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._time_over_speed_limit_ms = time_over_speed_limit_ms

    @property
    def total_distance_driven_meters(self):
        """Gets the total_distance_driven_meters of this DriverSafetyScoreResponse.  # noqa: E501

        Total distance driven in meters  # noqa: E501

        :return: The total_distance_driven_meters of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._total_distance_driven_meters

    @total_distance_driven_meters.setter
    def total_distance_driven_meters(self, total_distance_driven_meters):
        """Sets the total_distance_driven_meters of this DriverSafetyScoreResponse.

        Total distance driven in meters  # noqa: E501

        :param total_distance_driven_meters: The total_distance_driven_meters of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._total_distance_driven_meters = total_distance_driven_meters

    @property
    def total_harsh_event_count(self):
        """Gets the total_harsh_event_count of this DriverSafetyScoreResponse.  # noqa: E501

        Total harsh event count  # noqa: E501

        :return: The total_harsh_event_count of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._total_harsh_event_count

    @total_harsh_event_count.setter
    def total_harsh_event_count(self, total_harsh_event_count):
        """Sets the total_harsh_event_count of this DriverSafetyScoreResponse.

        Total harsh event count  # noqa: E501

        :param total_harsh_event_count: The total_harsh_event_count of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._total_harsh_event_count = total_harsh_event_count

    @property
    def total_time_driven_ms(self):
        """Gets the total_time_driven_ms of this DriverSafetyScoreResponse.  # noqa: E501

        Amount of time driven in milliseconds  # noqa: E501

        :return: The total_time_driven_ms of this DriverSafetyScoreResponse.  # noqa: E501
        :rtype: int
        """
        return self._total_time_driven_ms

    @total_time_driven_ms.setter
    def total_time_driven_ms(self, total_time_driven_ms):
        """Sets the total_time_driven_ms of this DriverSafetyScoreResponse.

        Amount of time driven in milliseconds  # noqa: E501

        :param total_time_driven_ms: The total_time_driven_ms of this DriverSafetyScoreResponse.  # noqa: E501
        :type: int
        """

        self._total_time_driven_ms = total_time_driven_ms

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
        if issubclass(DriverSafetyScoreResponse, dict):
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
        if not isinstance(other, DriverSafetyScoreResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
