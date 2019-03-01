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

from samsara.models.asset_reefer_response_reefer_stats_alarms1 import AssetReeferResponseReeferStatsAlarms1  # noqa: F401,E501
from samsara.models.asset_reefer_response_reefer_stats_engine_hours import AssetReeferResponseReeferStatsEngineHours  # noqa: F401,E501
from samsara.models.asset_reefer_response_reefer_stats_fuel_percentage import AssetReeferResponseReeferStatsFuelPercentage  # noqa: F401,E501
from samsara.models.asset_reefer_response_reefer_stats_power_status import AssetReeferResponseReeferStatsPowerStatus  # noqa: F401,E501
from samsara.models.asset_reefer_response_reefer_stats_return_air_temp import AssetReeferResponseReeferStatsReturnAirTemp  # noqa: F401,E501
from samsara.models.asset_reefer_response_reefer_stats_set_point import AssetReeferResponseReeferStatsSetPoint  # noqa: F401,E501


class AssetReeferResponseReeferStats(object):
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
        'alarms': 'list[AssetReeferResponseReeferStatsAlarms1]',
        'engine_hours': 'list[AssetReeferResponseReeferStatsEngineHours]',
        'fuel_percentage': 'list[AssetReeferResponseReeferStatsFuelPercentage]',
        'power_status': 'list[AssetReeferResponseReeferStatsPowerStatus]',
        'return_air_temp': 'list[AssetReeferResponseReeferStatsReturnAirTemp]',
        'set_point': 'list[AssetReeferResponseReeferStatsSetPoint]'
    }

    attribute_map = {
        'alarms': 'alarms',
        'engine_hours': 'engineHours',
        'fuel_percentage': 'fuelPercentage',
        'power_status': 'powerStatus',
        'return_air_temp': 'returnAirTemp',
        'set_point': 'setPoint'
    }

    def __init__(self, alarms=None, engine_hours=None, fuel_percentage=None, power_status=None, return_air_temp=None, set_point=None):  # noqa: E501
        """AssetReeferResponseReeferStats - a model defined in Swagger"""  # noqa: E501

        self._alarms = None
        self._engine_hours = None
        self._fuel_percentage = None
        self._power_status = None
        self._return_air_temp = None
        self._set_point = None
        self.discriminator = None

        if alarms is not None:
            self.alarms = alarms
        if engine_hours is not None:
            self.engine_hours = engine_hours
        if fuel_percentage is not None:
            self.fuel_percentage = fuel_percentage
        if power_status is not None:
            self.power_status = power_status
        if return_air_temp is not None:
            self.return_air_temp = return_air_temp
        if set_point is not None:
            self.set_point = set_point

    @property
    def alarms(self):
        """Gets the alarms of this AssetReeferResponseReeferStats.  # noqa: E501

        Reefer alarms  # noqa: E501

        :return: The alarms of this AssetReeferResponseReeferStats.  # noqa: E501
        :rtype: list[AssetReeferResponseReeferStatsAlarms1]
        """
        return self._alarms

    @alarms.setter
    def alarms(self, alarms):
        """Sets the alarms of this AssetReeferResponseReeferStats.

        Reefer alarms  # noqa: E501

        :param alarms: The alarms of this AssetReeferResponseReeferStats.  # noqa: E501
        :type: list[AssetReeferResponseReeferStatsAlarms1]
        """

        self._alarms = alarms

    @property
    def engine_hours(self):
        """Gets the engine_hours of this AssetReeferResponseReeferStats.  # noqa: E501

        Engine hours of the reefer  # noqa: E501

        :return: The engine_hours of this AssetReeferResponseReeferStats.  # noqa: E501
        :rtype: list[AssetReeferResponseReeferStatsEngineHours]
        """
        return self._engine_hours

    @engine_hours.setter
    def engine_hours(self, engine_hours):
        """Sets the engine_hours of this AssetReeferResponseReeferStats.

        Engine hours of the reefer  # noqa: E501

        :param engine_hours: The engine_hours of this AssetReeferResponseReeferStats.  # noqa: E501
        :type: list[AssetReeferResponseReeferStatsEngineHours]
        """

        self._engine_hours = engine_hours

    @property
    def fuel_percentage(self):
        """Gets the fuel_percentage of this AssetReeferResponseReeferStats.  # noqa: E501

        Fuel percentage of the reefer  # noqa: E501

        :return: The fuel_percentage of this AssetReeferResponseReeferStats.  # noqa: E501
        :rtype: list[AssetReeferResponseReeferStatsFuelPercentage]
        """
        return self._fuel_percentage

    @fuel_percentage.setter
    def fuel_percentage(self, fuel_percentage):
        """Sets the fuel_percentage of this AssetReeferResponseReeferStats.

        Fuel percentage of the reefer  # noqa: E501

        :param fuel_percentage: The fuel_percentage of this AssetReeferResponseReeferStats.  # noqa: E501
        :type: list[AssetReeferResponseReeferStatsFuelPercentage]
        """

        self._fuel_percentage = fuel_percentage

    @property
    def power_status(self):
        """Gets the power_status of this AssetReeferResponseReeferStats.  # noqa: E501

        Power status of the reefer  # noqa: E501

        :return: The power_status of this AssetReeferResponseReeferStats.  # noqa: E501
        :rtype: list[AssetReeferResponseReeferStatsPowerStatus]
        """
        return self._power_status

    @power_status.setter
    def power_status(self, power_status):
        """Sets the power_status of this AssetReeferResponseReeferStats.

        Power status of the reefer  # noqa: E501

        :param power_status: The power_status of this AssetReeferResponseReeferStats.  # noqa: E501
        :type: list[AssetReeferResponseReeferStatsPowerStatus]
        """

        self._power_status = power_status

    @property
    def return_air_temp(self):
        """Gets the return_air_temp of this AssetReeferResponseReeferStats.  # noqa: E501

        Return air temperature of the reefer  # noqa: E501

        :return: The return_air_temp of this AssetReeferResponseReeferStats.  # noqa: E501
        :rtype: list[AssetReeferResponseReeferStatsReturnAirTemp]
        """
        return self._return_air_temp

    @return_air_temp.setter
    def return_air_temp(self, return_air_temp):
        """Sets the return_air_temp of this AssetReeferResponseReeferStats.

        Return air temperature of the reefer  # noqa: E501

        :param return_air_temp: The return_air_temp of this AssetReeferResponseReeferStats.  # noqa: E501
        :type: list[AssetReeferResponseReeferStatsReturnAirTemp]
        """

        self._return_air_temp = return_air_temp

    @property
    def set_point(self):
        """Gets the set_point of this AssetReeferResponseReeferStats.  # noqa: E501

        Set point temperature of the reefer  # noqa: E501

        :return: The set_point of this AssetReeferResponseReeferStats.  # noqa: E501
        :rtype: list[AssetReeferResponseReeferStatsSetPoint]
        """
        return self._set_point

    @set_point.setter
    def set_point(self, set_point):
        """Sets the set_point of this AssetReeferResponseReeferStats.

        Set point temperature of the reefer  # noqa: E501

        :param set_point: The set_point of this AssetReeferResponseReeferStats.  # noqa: E501
        :type: list[AssetReeferResponseReeferStatsSetPoint]
        """

        self._set_point = set_point

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
        if issubclass(AssetReeferResponseReeferStats, dict):
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
        if not isinstance(other, AssetReeferResponseReeferStats):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
