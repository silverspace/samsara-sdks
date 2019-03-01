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


class TripResponseTrips(object):
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
        'end_odometer': 'int',
        'distance_meters': 'int',
        'end_ms': 'int',
        'start_ms': 'int',
        'fuel_consumed_ml': 'int',
        'start_address': 'str',
        'start_coordinates': 'TripResponseStartCoordinates',
        'end_coordinates': 'TripResponseEndCoordinates',
        'start_odometer': 'int',
        'driver_id': 'int',
        'start_location': 'str',
        'toll_meters': 'int',
        'end_address': 'str',
        'end_location': 'str'
    }

    attribute_map = {
        'end_odometer': 'endOdometer',
        'distance_meters': 'distanceMeters',
        'end_ms': 'endMs',
        'start_ms': 'startMs',
        'fuel_consumed_ml': 'fuelConsumedMl',
        'start_address': 'startAddress',
        'start_coordinates': 'startCoordinates',
        'end_coordinates': 'endCoordinates',
        'start_odometer': 'startOdometer',
        'driver_id': 'driverId',
        'start_location': 'startLocation',
        'toll_meters': 'tollMeters',
        'end_address': 'endAddress',
        'end_location': 'endLocation'
    }

    def __init__(self, end_odometer=None, distance_meters=None, end_ms=None, start_ms=None, fuel_consumed_ml=None, start_address=None, start_coordinates=None, end_coordinates=None, start_odometer=None, driver_id=None, start_location=None, toll_meters=None, end_address=None, end_location=None):  # noqa: E501
        """TripResponseTrips - a model defined in OpenAPI"""  # noqa: E501

        self._end_odometer = None
        self._distance_meters = None
        self._end_ms = None
        self._start_ms = None
        self._fuel_consumed_ml = None
        self._start_address = None
        self._start_coordinates = None
        self._end_coordinates = None
        self._start_odometer = None
        self._driver_id = None
        self._start_location = None
        self._toll_meters = None
        self._end_address = None
        self._end_location = None
        self.discriminator = None

        if end_odometer is not None:
            self.end_odometer = end_odometer
        if distance_meters is not None:
            self.distance_meters = distance_meters
        if end_ms is not None:
            self.end_ms = end_ms
        if start_ms is not None:
            self.start_ms = start_ms
        if fuel_consumed_ml is not None:
            self.fuel_consumed_ml = fuel_consumed_ml
        if start_address is not None:
            self.start_address = start_address
        if start_coordinates is not None:
            self.start_coordinates = start_coordinates
        if end_coordinates is not None:
            self.end_coordinates = end_coordinates
        if start_odometer is not None:
            self.start_odometer = start_odometer
        if driver_id is not None:
            self.driver_id = driver_id
        if start_location is not None:
            self.start_location = start_location
        if toll_meters is not None:
            self.toll_meters = toll_meters
        if end_address is not None:
            self.end_address = end_address
        if end_location is not None:
            self.end_location = end_location

    @property
    def end_odometer(self):
        """Gets the end_odometer of this TripResponseTrips.  # noqa: E501

        Odometer reading at the end of the trip.  # noqa: E501

        :return: The end_odometer of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._end_odometer

    @end_odometer.setter
    def end_odometer(self, end_odometer):
        """Sets the end_odometer of this TripResponseTrips.

        Odometer reading at the end of the trip.  # noqa: E501

        :param end_odometer: The end_odometer of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._end_odometer = end_odometer

    @property
    def distance_meters(self):
        """Gets the distance_meters of this TripResponseTrips.  # noqa: E501

        Length of the trip in meters.  # noqa: E501

        :return: The distance_meters of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._distance_meters

    @distance_meters.setter
    def distance_meters(self, distance_meters):
        """Sets the distance_meters of this TripResponseTrips.

        Length of the trip in meters.  # noqa: E501

        :param distance_meters: The distance_meters of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._distance_meters = distance_meters

    @property
    def end_ms(self):
        """Gets the end_ms of this TripResponseTrips.  # noqa: E501

        End of the trip in UNIX milliseconds.  # noqa: E501

        :return: The end_ms of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._end_ms

    @end_ms.setter
    def end_ms(self, end_ms):
        """Sets the end_ms of this TripResponseTrips.

        End of the trip in UNIX milliseconds.  # noqa: E501

        :param end_ms: The end_ms of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._end_ms = end_ms

    @property
    def start_ms(self):
        """Gets the start_ms of this TripResponseTrips.  # noqa: E501

        Beginning of the trip in UNIX milliseconds.  # noqa: E501

        :return: The start_ms of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._start_ms

    @start_ms.setter
    def start_ms(self, start_ms):
        """Sets the start_ms of this TripResponseTrips.

        Beginning of the trip in UNIX milliseconds.  # noqa: E501

        :param start_ms: The start_ms of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._start_ms = start_ms

    @property
    def fuel_consumed_ml(self):
        """Gets the fuel_consumed_ml of this TripResponseTrips.  # noqa: E501

        Amount in milliliters of fuel consumed on this trip.  # noqa: E501

        :return: The fuel_consumed_ml of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._fuel_consumed_ml

    @fuel_consumed_ml.setter
    def fuel_consumed_ml(self, fuel_consumed_ml):
        """Sets the fuel_consumed_ml of this TripResponseTrips.

        Amount in milliliters of fuel consumed on this trip.  # noqa: E501

        :param fuel_consumed_ml: The fuel_consumed_ml of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._fuel_consumed_ml = fuel_consumed_ml

    @property
    def start_address(self):
        """Gets the start_address of this TripResponseTrips.  # noqa: E501

        Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.  # noqa: E501

        :return: The start_address of this TripResponseTrips.  # noqa: E501
        :rtype: str
        """
        return self._start_address

    @start_address.setter
    def start_address(self, start_address):
        """Sets the start_address of this TripResponseTrips.

        Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.  # noqa: E501

        :param start_address: The start_address of this TripResponseTrips.  # noqa: E501
        :type: str
        """

        self._start_address = start_address

    @property
    def start_coordinates(self):
        """Gets the start_coordinates of this TripResponseTrips.  # noqa: E501


        :return: The start_coordinates of this TripResponseTrips.  # noqa: E501
        :rtype: TripResponseStartCoordinates
        """
        return self._start_coordinates

    @start_coordinates.setter
    def start_coordinates(self, start_coordinates):
        """Sets the start_coordinates of this TripResponseTrips.


        :param start_coordinates: The start_coordinates of this TripResponseTrips.  # noqa: E501
        :type: TripResponseStartCoordinates
        """

        self._start_coordinates = start_coordinates

    @property
    def end_coordinates(self):
        """Gets the end_coordinates of this TripResponseTrips.  # noqa: E501


        :return: The end_coordinates of this TripResponseTrips.  # noqa: E501
        :rtype: TripResponseEndCoordinates
        """
        return self._end_coordinates

    @end_coordinates.setter
    def end_coordinates(self, end_coordinates):
        """Sets the end_coordinates of this TripResponseTrips.


        :param end_coordinates: The end_coordinates of this TripResponseTrips.  # noqa: E501
        :type: TripResponseEndCoordinates
        """

        self._end_coordinates = end_coordinates

    @property
    def start_odometer(self):
        """Gets the start_odometer of this TripResponseTrips.  # noqa: E501

        Odometer reading at the beginning of the trip.  # noqa: E501

        :return: The start_odometer of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._start_odometer

    @start_odometer.setter
    def start_odometer(self, start_odometer):
        """Sets the start_odometer of this TripResponseTrips.

        Odometer reading at the beginning of the trip.  # noqa: E501

        :param start_odometer: The start_odometer of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._start_odometer = start_odometer

    @property
    def driver_id(self):
        """Gets the driver_id of this TripResponseTrips.  # noqa: E501

        ID of the driver.  # noqa: E501

        :return: The driver_id of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this TripResponseTrips.

        ID of the driver.  # noqa: E501

        :param driver_id: The driver_id of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def start_location(self):
        """Gets the start_location of this TripResponseTrips.  # noqa: E501

        Geocoded street address of start (latitude, longitude) coordinates.  # noqa: E501

        :return: The start_location of this TripResponseTrips.  # noqa: E501
        :rtype: str
        """
        return self._start_location

    @start_location.setter
    def start_location(self, start_location):
        """Sets the start_location of this TripResponseTrips.

        Geocoded street address of start (latitude, longitude) coordinates.  # noqa: E501

        :param start_location: The start_location of this TripResponseTrips.  # noqa: E501
        :type: str
        """

        self._start_location = start_location

    @property
    def toll_meters(self):
        """Gets the toll_meters of this TripResponseTrips.  # noqa: E501

        Length in meters trip spent on toll roads.  # noqa: E501

        :return: The toll_meters of this TripResponseTrips.  # noqa: E501
        :rtype: int
        """
        return self._toll_meters

    @toll_meters.setter
    def toll_meters(self, toll_meters):
        """Sets the toll_meters of this TripResponseTrips.

        Length in meters trip spent on toll roads.  # noqa: E501

        :param toll_meters: The toll_meters of this TripResponseTrips.  # noqa: E501
        :type: int
        """

        self._toll_meters = toll_meters

    @property
    def end_address(self):
        """Gets the end_address of this TripResponseTrips.  # noqa: E501

        Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.  # noqa: E501

        :return: The end_address of this TripResponseTrips.  # noqa: E501
        :rtype: str
        """
        return self._end_address

    @end_address.setter
    def end_address(self, end_address):
        """Sets the end_address of this TripResponseTrips.

        Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.  # noqa: E501

        :param end_address: The end_address of this TripResponseTrips.  # noqa: E501
        :type: str
        """

        self._end_address = end_address

    @property
    def end_location(self):
        """Gets the end_location of this TripResponseTrips.  # noqa: E501

        Geocoded street address of start (latitude, longitude) coordinates.  # noqa: E501

        :return: The end_location of this TripResponseTrips.  # noqa: E501
        :rtype: str
        """
        return self._end_location

    @end_location.setter
    def end_location(self, end_location):
        """Sets the end_location of this TripResponseTrips.

        Geocoded street address of start (latitude, longitude) coordinates.  # noqa: E501

        :param end_location: The end_location of this TripResponseTrips.  # noqa: E501
        :type: str
        """

        self._end_location = end_location

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
        if not isinstance(other, TripResponseTrips):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
