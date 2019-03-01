# coding: utf-8

"""
    Samsara API

    # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).  # noqa: E501

    OpenAPI spec version: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class DispatchRouteCreate(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'actual_end_ms': 'int',
        'actual_start_ms': 'int',
        'driver_id': 'int',
        'group_id': 'int',
        'name': 'str',
        'scheduled_end_ms': 'int',
        'scheduled_meters': 'int',
        'scheduled_start_ms': 'int',
        'start_location_address': 'str',
        'start_location_address_id': 'int',
        'start_location_lat': 'float',
        'start_location_lng': 'float',
        'start_location_name': 'str',
        'trailer_id': 'int',
        'vehicle_id': 'int',
        'dispatch_jobs': 'list[DispatchJobCreate]'
    }

    attribute_map = {
        'actual_end_ms': 'actual_end_ms',
        'actual_start_ms': 'actual_start_ms',
        'driver_id': 'driver_id',
        'group_id': 'group_id',
        'name': 'name',
        'scheduled_end_ms': 'scheduled_end_ms',
        'scheduled_meters': 'scheduled_meters',
        'scheduled_start_ms': 'scheduled_start_ms',
        'start_location_address': 'start_location_address',
        'start_location_address_id': 'start_location_address_id',
        'start_location_lat': 'start_location_lat',
        'start_location_lng': 'start_location_lng',
        'start_location_name': 'start_location_name',
        'trailer_id': 'trailer_id',
        'vehicle_id': 'vehicle_id',
        'dispatch_jobs': 'dispatch_jobs'
    }

    def __init__(self, actual_end_ms=None, actual_start_ms=None, driver_id=None, group_id=None, name=None, scheduled_end_ms=None, scheduled_meters=None, scheduled_start_ms=None, start_location_address=None, start_location_address_id=None, start_location_lat=None, start_location_lng=None, start_location_name=None, trailer_id=None, vehicle_id=None, dispatch_jobs=None):  # noqa: E501
        """DispatchRouteCreate - a model defined in OpenAPI"""  # noqa: E501

        self._actual_end_ms = None
        self._actual_start_ms = None
        self._driver_id = None
        self._group_id = None
        self._name = None
        self._scheduled_end_ms = None
        self._scheduled_meters = None
        self._scheduled_start_ms = None
        self._start_location_address = None
        self._start_location_address_id = None
        self._start_location_lat = None
        self._start_location_lng = None
        self._start_location_name = None
        self._trailer_id = None
        self._vehicle_id = None
        self._dispatch_jobs = None
        self.discriminator = None

        if actual_end_ms is not None:
            self.actual_end_ms = actual_end_ms
        if actual_start_ms is not None:
            self.actual_start_ms = actual_start_ms
        if driver_id is not None:
            self.driver_id = driver_id
        if group_id is not None:
            self.group_id = group_id
        self.name = name
        self.scheduled_end_ms = scheduled_end_ms
        if scheduled_meters is not None:
            self.scheduled_meters = scheduled_meters
        self.scheduled_start_ms = scheduled_start_ms
        if start_location_address is not None:
            self.start_location_address = start_location_address
        if start_location_address_id is not None:
            self.start_location_address_id = start_location_address_id
        if start_location_lat is not None:
            self.start_location_lat = start_location_lat
        if start_location_lng is not None:
            self.start_location_lng = start_location_lng
        if start_location_name is not None:
            self.start_location_name = start_location_name
        if trailer_id is not None:
            self.trailer_id = trailer_id
        if vehicle_id is not None:
            self.vehicle_id = vehicle_id
        self.dispatch_jobs = dispatch_jobs

    @property
    def actual_end_ms(self):
        """Gets the actual_end_ms of this DispatchRouteCreate.  # noqa: E501

        The time in Unix epoch milliseconds that the route actually ended.  # noqa: E501

        :return: The actual_end_ms of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._actual_end_ms

    @actual_end_ms.setter
    def actual_end_ms(self, actual_end_ms):
        """Sets the actual_end_ms of this DispatchRouteCreate.

        The time in Unix epoch milliseconds that the route actually ended.  # noqa: E501

        :param actual_end_ms: The actual_end_ms of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._actual_end_ms = actual_end_ms

    @property
    def actual_start_ms(self):
        """Gets the actual_start_ms of this DispatchRouteCreate.  # noqa: E501

        The time in Unix epoch milliseconds that the route actually started.  # noqa: E501

        :return: The actual_start_ms of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._actual_start_ms

    @actual_start_ms.setter
    def actual_start_ms(self, actual_start_ms):
        """Sets the actual_start_ms of this DispatchRouteCreate.

        The time in Unix epoch milliseconds that the route actually started.  # noqa: E501

        :param actual_start_ms: The actual_start_ms of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._actual_start_ms = actual_start_ms

    @property
    def driver_id(self):
        """Gets the driver_id of this DispatchRouteCreate.  # noqa: E501

        ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.  # noqa: E501

        :return: The driver_id of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DispatchRouteCreate.

        ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.  # noqa: E501

        :param driver_id: The driver_id of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def group_id(self):
        """Gets the group_id of this DispatchRouteCreate.  # noqa: E501

        ID of the group if the organization has multiple groups (optional).  # noqa: E501

        :return: The group_id of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this DispatchRouteCreate.

        ID of the group if the organization has multiple groups (optional).  # noqa: E501

        :param group_id: The group_id of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._group_id = group_id

    @property
    def name(self):
        """Gets the name of this DispatchRouteCreate.  # noqa: E501

        Descriptive name of this route.  # noqa: E501

        :return: The name of this DispatchRouteCreate.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DispatchRouteCreate.

        Descriptive name of this route.  # noqa: E501

        :param name: The name of this DispatchRouteCreate.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def scheduled_end_ms(self):
        """Gets the scheduled_end_ms of this DispatchRouteCreate.  # noqa: E501

        The time in Unix epoch milliseconds that the last job in the route is scheduled to end.  # noqa: E501

        :return: The scheduled_end_ms of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._scheduled_end_ms

    @scheduled_end_ms.setter
    def scheduled_end_ms(self, scheduled_end_ms):
        """Sets the scheduled_end_ms of this DispatchRouteCreate.

        The time in Unix epoch milliseconds that the last job in the route is scheduled to end.  # noqa: E501

        :param scheduled_end_ms: The scheduled_end_ms of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """
        if scheduled_end_ms is None:
            raise ValueError("Invalid value for `scheduled_end_ms`, must not be `None`")  # noqa: E501

        self._scheduled_end_ms = scheduled_end_ms

    @property
    def scheduled_meters(self):
        """Gets the scheduled_meters of this DispatchRouteCreate.  # noqa: E501

        The distance expected to be traveled for this route in meters.  # noqa: E501

        :return: The scheduled_meters of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._scheduled_meters

    @scheduled_meters.setter
    def scheduled_meters(self, scheduled_meters):
        """Sets the scheduled_meters of this DispatchRouteCreate.

        The distance expected to be traveled for this route in meters.  # noqa: E501

        :param scheduled_meters: The scheduled_meters of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._scheduled_meters = scheduled_meters

    @property
    def scheduled_start_ms(self):
        """Gets the scheduled_start_ms of this DispatchRouteCreate.  # noqa: E501

        The time in Unix epoch milliseconds that the route is scheduled to start.  # noqa: E501

        :return: The scheduled_start_ms of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._scheduled_start_ms

    @scheduled_start_ms.setter
    def scheduled_start_ms(self, scheduled_start_ms):
        """Sets the scheduled_start_ms of this DispatchRouteCreate.

        The time in Unix epoch milliseconds that the route is scheduled to start.  # noqa: E501

        :param scheduled_start_ms: The scheduled_start_ms of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """
        if scheduled_start_ms is None:
            raise ValueError("Invalid value for `scheduled_start_ms`, must not be `None`")  # noqa: E501

        self._scheduled_start_ms = scheduled_start_ms

    @property
    def start_location_address(self):
        """Gets the start_location_address of this DispatchRouteCreate.  # noqa: E501

        The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.  # noqa: E501

        :return: The start_location_address of this DispatchRouteCreate.  # noqa: E501
        :rtype: str
        """
        return self._start_location_address

    @start_location_address.setter
    def start_location_address(self, start_location_address):
        """Sets the start_location_address of this DispatchRouteCreate.

        The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.  # noqa: E501

        :param start_location_address: The start_location_address of this DispatchRouteCreate.  # noqa: E501
        :type: str
        """

        self._start_location_address = start_location_address

    @property
    def start_location_address_id(self):
        """Gets the start_location_address_id of this DispatchRouteCreate.  # noqa: E501

        ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.  # noqa: E501

        :return: The start_location_address_id of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._start_location_address_id

    @start_location_address_id.setter
    def start_location_address_id(self, start_location_address_id):
        """Sets the start_location_address_id of this DispatchRouteCreate.

        ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.  # noqa: E501

        :param start_location_address_id: The start_location_address_id of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._start_location_address_id = start_location_address_id

    @property
    def start_location_lat(self):
        """Gets the start_location_lat of this DispatchRouteCreate.  # noqa: E501

        Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.  # noqa: E501

        :return: The start_location_lat of this DispatchRouteCreate.  # noqa: E501
        :rtype: float
        """
        return self._start_location_lat

    @start_location_lat.setter
    def start_location_lat(self, start_location_lat):
        """Sets the start_location_lat of this DispatchRouteCreate.

        Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.  # noqa: E501

        :param start_location_lat: The start_location_lat of this DispatchRouteCreate.  # noqa: E501
        :type: float
        """

        self._start_location_lat = start_location_lat

    @property
    def start_location_lng(self):
        """Gets the start_location_lng of this DispatchRouteCreate.  # noqa: E501

        Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.  # noqa: E501

        :return: The start_location_lng of this DispatchRouteCreate.  # noqa: E501
        :rtype: float
        """
        return self._start_location_lng

    @start_location_lng.setter
    def start_location_lng(self, start_location_lng):
        """Sets the start_location_lng of this DispatchRouteCreate.

        Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.  # noqa: E501

        :param start_location_lng: The start_location_lng of this DispatchRouteCreate.  # noqa: E501
        :type: float
        """

        self._start_location_lng = start_location_lng

    @property
    def start_location_name(self):
        """Gets the start_location_name of this DispatchRouteCreate.  # noqa: E501

        The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.  # noqa: E501

        :return: The start_location_name of this DispatchRouteCreate.  # noqa: E501
        :rtype: str
        """
        return self._start_location_name

    @start_location_name.setter
    def start_location_name(self, start_location_name):
        """Sets the start_location_name of this DispatchRouteCreate.

        The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.  # noqa: E501

        :param start_location_name: The start_location_name of this DispatchRouteCreate.  # noqa: E501
        :type: str
        """

        self._start_location_name = start_location_name

    @property
    def trailer_id(self):
        """Gets the trailer_id of this DispatchRouteCreate.  # noqa: E501

        ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.  # noqa: E501

        :return: The trailer_id of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._trailer_id

    @trailer_id.setter
    def trailer_id(self, trailer_id):
        """Sets the trailer_id of this DispatchRouteCreate.

        ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.  # noqa: E501

        :param trailer_id: The trailer_id of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._trailer_id = trailer_id

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this DispatchRouteCreate.  # noqa: E501

        ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.  # noqa: E501

        :return: The vehicle_id of this DispatchRouteCreate.  # noqa: E501
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this DispatchRouteCreate.

        ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.  # noqa: E501

        :param vehicle_id: The vehicle_id of this DispatchRouteCreate.  # noqa: E501
        :type: int
        """

        self._vehicle_id = vehicle_id

    @property
    def dispatch_jobs(self):
        """Gets the dispatch_jobs of this DispatchRouteCreate.  # noqa: E501

        The dispatch jobs to create for this route.  # noqa: E501

        :return: The dispatch_jobs of this DispatchRouteCreate.  # noqa: E501
        :rtype: list[DispatchJobCreate]
        """
        return self._dispatch_jobs

    @dispatch_jobs.setter
    def dispatch_jobs(self, dispatch_jobs):
        """Sets the dispatch_jobs of this DispatchRouteCreate.

        The dispatch jobs to create for this route.  # noqa: E501

        :param dispatch_jobs: The dispatch_jobs of this DispatchRouteCreate.  # noqa: E501
        :type: list[DispatchJobCreate]
        """
        if dispatch_jobs is None:
            raise ValueError("Invalid value for `dispatch_jobs`, must not be `None`")  # noqa: E501

        self._dispatch_jobs = dispatch_jobs

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
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

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, DispatchRouteCreate):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
