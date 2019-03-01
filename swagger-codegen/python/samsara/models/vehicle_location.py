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


class VehicleLocation(object):
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
        'heading': 'float',
        'id': 'int',
        'latitude': 'float',
        'location': 'str',
        'longitude': 'float',
        'name': 'str',
        'odometer_meters': 'int',
        'on_trip': 'bool',
        'speed': 'float',
        'time': 'int',
        'vin': 'str'
    }

    attribute_map = {
        'heading': 'heading',
        'id': 'id',
        'latitude': 'latitude',
        'location': 'location',
        'longitude': 'longitude',
        'name': 'name',
        'odometer_meters': 'odometerMeters',
        'on_trip': 'onTrip',
        'speed': 'speed',
        'time': 'time',
        'vin': 'vin'
    }

    def __init__(self, heading=None, id=None, latitude=None, location=None, longitude=None, name=None, odometer_meters=None, on_trip=None, speed=None, time=None, vin=None):  # noqa: E501
        """VehicleLocation - a model defined in Swagger"""  # noqa: E501

        self._heading = None
        self._id = None
        self._latitude = None
        self._location = None
        self._longitude = None
        self._name = None
        self._odometer_meters = None
        self._on_trip = None
        self._speed = None
        self._time = None
        self._vin = None
        self.discriminator = None

        if heading is not None:
            self.heading = heading
        self.id = id
        if latitude is not None:
            self.latitude = latitude
        if location is not None:
            self.location = location
        if longitude is not None:
            self.longitude = longitude
        if name is not None:
            self.name = name
        if odometer_meters is not None:
            self.odometer_meters = odometer_meters
        if on_trip is not None:
            self.on_trip = on_trip
        if speed is not None:
            self.speed = speed
        if time is not None:
            self.time = time
        if vin is not None:
            self.vin = vin

    @property
    def heading(self):
        """Gets the heading of this VehicleLocation.  # noqa: E501

        Heading in degrees.  # noqa: E501

        :return: The heading of this VehicleLocation.  # noqa: E501
        :rtype: float
        """
        return self._heading

    @heading.setter
    def heading(self, heading):
        """Sets the heading of this VehicleLocation.

        Heading in degrees.  # noqa: E501

        :param heading: The heading of this VehicleLocation.  # noqa: E501
        :type: float
        """

        self._heading = heading

    @property
    def id(self):
        """Gets the id of this VehicleLocation.  # noqa: E501

        ID of the vehicle.  # noqa: E501

        :return: The id of this VehicleLocation.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this VehicleLocation.

        ID of the vehicle.  # noqa: E501

        :param id: The id of this VehicleLocation.  # noqa: E501
        :type: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def latitude(self):
        """Gets the latitude of this VehicleLocation.  # noqa: E501

        Latitude in decimal degrees.  # noqa: E501

        :return: The latitude of this VehicleLocation.  # noqa: E501
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude):
        """Sets the latitude of this VehicleLocation.

        Latitude in decimal degrees.  # noqa: E501

        :param latitude: The latitude of this VehicleLocation.  # noqa: E501
        :type: float
        """

        self._latitude = latitude

    @property
    def location(self):
        """Gets the location of this VehicleLocation.  # noqa: E501

        Text representation of nearest identifiable location to (latitude, longitude) coordinates.  # noqa: E501

        :return: The location of this VehicleLocation.  # noqa: E501
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this VehicleLocation.

        Text representation of nearest identifiable location to (latitude, longitude) coordinates.  # noqa: E501

        :param location: The location of this VehicleLocation.  # noqa: E501
        :type: str
        """

        self._location = location

    @property
    def longitude(self):
        """Gets the longitude of this VehicleLocation.  # noqa: E501

        Longitude in decimal degrees.  # noqa: E501

        :return: The longitude of this VehicleLocation.  # noqa: E501
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude):
        """Sets the longitude of this VehicleLocation.

        Longitude in decimal degrees.  # noqa: E501

        :param longitude: The longitude of this VehicleLocation.  # noqa: E501
        :type: float
        """

        self._longitude = longitude

    @property
    def name(self):
        """Gets the name of this VehicleLocation.  # noqa: E501

        Name of the vehicle.  # noqa: E501

        :return: The name of this VehicleLocation.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this VehicleLocation.

        Name of the vehicle.  # noqa: E501

        :param name: The name of this VehicleLocation.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def odometer_meters(self):
        """Gets the odometer_meters of this VehicleLocation.  # noqa: E501

        The number of meters reported by the odometer.  # noqa: E501

        :return: The odometer_meters of this VehicleLocation.  # noqa: E501
        :rtype: int
        """
        return self._odometer_meters

    @odometer_meters.setter
    def odometer_meters(self, odometer_meters):
        """Sets the odometer_meters of this VehicleLocation.

        The number of meters reported by the odometer.  # noqa: E501

        :param odometer_meters: The odometer_meters of this VehicleLocation.  # noqa: E501
        :type: int
        """

        self._odometer_meters = odometer_meters

    @property
    def on_trip(self):
        """Gets the on_trip of this VehicleLocation.  # noqa: E501

        Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.  # noqa: E501

        :return: The on_trip of this VehicleLocation.  # noqa: E501
        :rtype: bool
        """
        return self._on_trip

    @on_trip.setter
    def on_trip(self, on_trip):
        """Sets the on_trip of this VehicleLocation.

        Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.  # noqa: E501

        :param on_trip: The on_trip of this VehicleLocation.  # noqa: E501
        :type: bool
        """

        self._on_trip = on_trip

    @property
    def speed(self):
        """Gets the speed of this VehicleLocation.  # noqa: E501

        Speed in miles per hour.  # noqa: E501

        :return: The speed of this VehicleLocation.  # noqa: E501
        :rtype: float
        """
        return self._speed

    @speed.setter
    def speed(self, speed):
        """Sets the speed of this VehicleLocation.

        Speed in miles per hour.  # noqa: E501

        :param speed: The speed of this VehicleLocation.  # noqa: E501
        :type: float
        """

        self._speed = speed

    @property
    def time(self):
        """Gets the time of this VehicleLocation.  # noqa: E501

        The time the reported location was logged, reported as a UNIX timestamp in milliseconds.  # noqa: E501

        :return: The time of this VehicleLocation.  # noqa: E501
        :rtype: int
        """
        return self._time

    @time.setter
    def time(self, time):
        """Sets the time of this VehicleLocation.

        The time the reported location was logged, reported as a UNIX timestamp in milliseconds.  # noqa: E501

        :param time: The time of this VehicleLocation.  # noqa: E501
        :type: int
        """

        self._time = time

    @property
    def vin(self):
        """Gets the vin of this VehicleLocation.  # noqa: E501

        Vehicle Identification Number (VIN) of the vehicle.  # noqa: E501

        :return: The vin of this VehicleLocation.  # noqa: E501
        :rtype: str
        """
        return self._vin

    @vin.setter
    def vin(self, vin):
        """Sets the vin of this VehicleLocation.

        Vehicle Identification Number (VIN) of the vehicle.  # noqa: E501

        :param vin: The vin of this VehicleLocation.  # noqa: E501
        :type: str
        """

        self._vin = vin

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
        if issubclass(VehicleLocation, dict):
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
        if not isinstance(other, VehicleLocation):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
