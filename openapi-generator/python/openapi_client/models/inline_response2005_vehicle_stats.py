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


class InlineResponse2005VehicleStats(object):
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
        'engine_state': 'list[EngineState]',
        'aux_input2': 'AuxInputSeries',
        'vehicle_id': 'int',
        'aux_input1': 'AuxInputSeries'
    }

    attribute_map = {
        'engine_state': 'engineState',
        'aux_input2': 'auxInput2',
        'vehicle_id': 'vehicleId',
        'aux_input1': 'auxInput1'
    }

    def __init__(self, engine_state=None, aux_input2=None, vehicle_id=None, aux_input1=None):  # noqa: E501
        """InlineResponse2005VehicleStats - a model defined in OpenAPI"""  # noqa: E501

        self._engine_state = None
        self._aux_input2 = None
        self._vehicle_id = None
        self._aux_input1 = None
        self.discriminator = None

        if engine_state is not None:
            self.engine_state = engine_state
        if aux_input2 is not None:
            self.aux_input2 = aux_input2
        self.vehicle_id = vehicle_id
        if aux_input1 is not None:
            self.aux_input1 = aux_input1

    @property
    def engine_state(self):
        """Gets the engine_state of this InlineResponse2005VehicleStats.  # noqa: E501


        :return: The engine_state of this InlineResponse2005VehicleStats.  # noqa: E501
        :rtype: list[EngineState]
        """
        return self._engine_state

    @engine_state.setter
    def engine_state(self, engine_state):
        """Sets the engine_state of this InlineResponse2005VehicleStats.


        :param engine_state: The engine_state of this InlineResponse2005VehicleStats.  # noqa: E501
        :type: list[EngineState]
        """

        self._engine_state = engine_state

    @property
    def aux_input2(self):
        """Gets the aux_input2 of this InlineResponse2005VehicleStats.  # noqa: E501


        :return: The aux_input2 of this InlineResponse2005VehicleStats.  # noqa: E501
        :rtype: AuxInputSeries
        """
        return self._aux_input2

    @aux_input2.setter
    def aux_input2(self, aux_input2):
        """Sets the aux_input2 of this InlineResponse2005VehicleStats.


        :param aux_input2: The aux_input2 of this InlineResponse2005VehicleStats.  # noqa: E501
        :type: AuxInputSeries
        """

        self._aux_input2 = aux_input2

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this InlineResponse2005VehicleStats.  # noqa: E501

        ID of the vehicle.  # noqa: E501

        :return: The vehicle_id of this InlineResponse2005VehicleStats.  # noqa: E501
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this InlineResponse2005VehicleStats.

        ID of the vehicle.  # noqa: E501

        :param vehicle_id: The vehicle_id of this InlineResponse2005VehicleStats.  # noqa: E501
        :type: int
        """
        if vehicle_id is None:
            raise ValueError("Invalid value for `vehicle_id`, must not be `None`")  # noqa: E501

        self._vehicle_id = vehicle_id

    @property
    def aux_input1(self):
        """Gets the aux_input1 of this InlineResponse2005VehicleStats.  # noqa: E501


        :return: The aux_input1 of this InlineResponse2005VehicleStats.  # noqa: E501
        :rtype: AuxInputSeries
        """
        return self._aux_input1

    @aux_input1.setter
    def aux_input1(self, aux_input1):
        """Sets the aux_input1 of this InlineResponse2005VehicleStats.


        :param aux_input1: The aux_input1 of this InlineResponse2005VehicleStats.  # noqa: E501
        :type: AuxInputSeries
        """

        self._aux_input1 = aux_input1

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
        if not isinstance(other, InlineResponse2005VehicleStats):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
