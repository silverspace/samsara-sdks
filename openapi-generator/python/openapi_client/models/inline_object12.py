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


class InlineObject12(object):
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
        'inspection_type': 'str',
        'mechanic_notes': 'str',
        'odometer_miles': 'int',
        'previous_defects_corrected': 'bool',
        'previous_defects_ignored': 'bool',
        'safe': 'str',
        'trailer_id': 'int',
        'user_email': 'str',
        'vehicle_id': 'int'
    }

    attribute_map = {
        'inspection_type': 'inspectionType',
        'mechanic_notes': 'mechanicNotes',
        'odometer_miles': 'odometerMiles',
        'previous_defects_corrected': 'previousDefectsCorrected',
        'previous_defects_ignored': 'previousDefectsIgnored',
        'safe': 'safe',
        'trailer_id': 'trailerId',
        'user_email': 'userEmail',
        'vehicle_id': 'vehicleId'
    }

    def __init__(self, inspection_type=None, mechanic_notes=None, odometer_miles=None, previous_defects_corrected=None, previous_defects_ignored=None, safe=None, trailer_id=None, user_email=None, vehicle_id=None):  # noqa: E501
        """InlineObject12 - a model defined in OpenAPI"""  # noqa: E501

        self._inspection_type = None
        self._mechanic_notes = None
        self._odometer_miles = None
        self._previous_defects_corrected = None
        self._previous_defects_ignored = None
        self._safe = None
        self._trailer_id = None
        self._user_email = None
        self._vehicle_id = None
        self.discriminator = None

        self.inspection_type = inspection_type
        if mechanic_notes is not None:
            self.mechanic_notes = mechanic_notes
        if odometer_miles is not None:
            self.odometer_miles = odometer_miles
        if previous_defects_corrected is not None:
            self.previous_defects_corrected = previous_defects_corrected
        if previous_defects_ignored is not None:
            self.previous_defects_ignored = previous_defects_ignored
        self.safe = safe
        if trailer_id is not None:
            self.trailer_id = trailer_id
        self.user_email = user_email
        if vehicle_id is not None:
            self.vehicle_id = vehicle_id

    @property
    def inspection_type(self):
        """Gets the inspection_type of this InlineObject12.  # noqa: E501

        Only type 'mechanic' is currently accepted.  # noqa: E501

        :return: The inspection_type of this InlineObject12.  # noqa: E501
        :rtype: str
        """
        return self._inspection_type

    @inspection_type.setter
    def inspection_type(self, inspection_type):
        """Sets the inspection_type of this InlineObject12.

        Only type 'mechanic' is currently accepted.  # noqa: E501

        :param inspection_type: The inspection_type of this InlineObject12.  # noqa: E501
        :type: str
        """
        if inspection_type is None:
            raise ValueError("Invalid value for `inspection_type`, must not be `None`")  # noqa: E501
        allowed_values = ["mechanic"]  # noqa: E501
        if inspection_type not in allowed_values:
            raise ValueError(
                "Invalid value for `inspection_type` ({0}), must be one of {1}"  # noqa: E501
                .format(inspection_type, allowed_values)
            )

        self._inspection_type = inspection_type

    @property
    def mechanic_notes(self):
        """Gets the mechanic_notes of this InlineObject12.  # noqa: E501

        Any notes from the mechanic.  # noqa: E501

        :return: The mechanic_notes of this InlineObject12.  # noqa: E501
        :rtype: str
        """
        return self._mechanic_notes

    @mechanic_notes.setter
    def mechanic_notes(self, mechanic_notes):
        """Sets the mechanic_notes of this InlineObject12.

        Any notes from the mechanic.  # noqa: E501

        :param mechanic_notes: The mechanic_notes of this InlineObject12.  # noqa: E501
        :type: str
        """

        self._mechanic_notes = mechanic_notes

    @property
    def odometer_miles(self):
        """Gets the odometer_miles of this InlineObject12.  # noqa: E501

        The current odometer of the vehicle.  # noqa: E501

        :return: The odometer_miles of this InlineObject12.  # noqa: E501
        :rtype: int
        """
        return self._odometer_miles

    @odometer_miles.setter
    def odometer_miles(self, odometer_miles):
        """Sets the odometer_miles of this InlineObject12.

        The current odometer of the vehicle.  # noqa: E501

        :param odometer_miles: The odometer_miles of this InlineObject12.  # noqa: E501
        :type: int
        """

        self._odometer_miles = odometer_miles

    @property
    def previous_defects_corrected(self):
        """Gets the previous_defects_corrected of this InlineObject12.  # noqa: E501

        Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :return: The previous_defects_corrected of this InlineObject12.  # noqa: E501
        :rtype: bool
        """
        return self._previous_defects_corrected

    @previous_defects_corrected.setter
    def previous_defects_corrected(self, previous_defects_corrected):
        """Sets the previous_defects_corrected of this InlineObject12.

        Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :param previous_defects_corrected: The previous_defects_corrected of this InlineObject12.  # noqa: E501
        :type: bool
        """

        self._previous_defects_corrected = previous_defects_corrected

    @property
    def previous_defects_ignored(self):
        """Gets the previous_defects_ignored of this InlineObject12.  # noqa: E501

        Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :return: The previous_defects_ignored of this InlineObject12.  # noqa: E501
        :rtype: bool
        """
        return self._previous_defects_ignored

    @previous_defects_ignored.setter
    def previous_defects_ignored(self, previous_defects_ignored):
        """Sets the previous_defects_ignored of this InlineObject12.

        Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.  # noqa: E501

        :param previous_defects_ignored: The previous_defects_ignored of this InlineObject12.  # noqa: E501
        :type: bool
        """

        self._previous_defects_ignored = previous_defects_ignored

    @property
    def safe(self):
        """Gets the safe of this InlineObject12.  # noqa: E501

        Whether or not this vehicle or trailer is safe to drive.  # noqa: E501

        :return: The safe of this InlineObject12.  # noqa: E501
        :rtype: str
        """
        return self._safe

    @safe.setter
    def safe(self, safe):
        """Sets the safe of this InlineObject12.

        Whether or not this vehicle or trailer is safe to drive.  # noqa: E501

        :param safe: The safe of this InlineObject12.  # noqa: E501
        :type: str
        """
        if safe is None:
            raise ValueError("Invalid value for `safe`, must not be `None`")  # noqa: E501
        allowed_values = ["safe", "unsafe"]  # noqa: E501
        if safe not in allowed_values:
            raise ValueError(
                "Invalid value for `safe` ({0}), must be one of {1}"  # noqa: E501
                .format(safe, allowed_values)
            )

        self._safe = safe

    @property
    def trailer_id(self):
        """Gets the trailer_id of this InlineObject12.  # noqa: E501

        Id of trailer being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :return: The trailer_id of this InlineObject12.  # noqa: E501
        :rtype: int
        """
        return self._trailer_id

    @trailer_id.setter
    def trailer_id(self, trailer_id):
        """Sets the trailer_id of this InlineObject12.

        Id of trailer being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :param trailer_id: The trailer_id of this InlineObject12.  # noqa: E501
        :type: int
        """

        self._trailer_id = trailer_id

    @property
    def user_email(self):
        """Gets the user_email of this InlineObject12.  # noqa: E501

        The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.  # noqa: E501

        :return: The user_email of this InlineObject12.  # noqa: E501
        :rtype: str
        """
        return self._user_email

    @user_email.setter
    def user_email(self, user_email):
        """Sets the user_email of this InlineObject12.

        The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.  # noqa: E501

        :param user_email: The user_email of this InlineObject12.  # noqa: E501
        :type: str
        """
        if user_email is None:
            raise ValueError("Invalid value for `user_email`, must not be `None`")  # noqa: E501

        self._user_email = user_email

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this InlineObject12.  # noqa: E501

        Id of vehicle being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :return: The vehicle_id of this InlineObject12.  # noqa: E501
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this InlineObject12.

        Id of vehicle being inspected. Either vehicleId or trailerId must be provided.  # noqa: E501

        :param vehicle_id: The vehicle_id of this InlineObject12.  # noqa: E501
        :type: int
        """

        self._vehicle_id = vehicle_id

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
        if not isinstance(other, InlineObject12):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
