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


class DriverForCreate(object):
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
        'eld_adverse_weather_exemption_enabled': 'bool',
        'eld_big_day_exemption_enabled': 'bool',
        'eld_day_start_hour': 'int',
        'eld_exempt': 'bool',
        'eld_exempt_reason': 'str',
        'eld_pc_enabled': 'bool',
        'eld_ym_enabled': 'bool',
        'external_ids': 'dict(str, str)',
        'group_id': 'int',
        'license_number': 'str',
        'license_state': 'str',
        'name': 'str',
        'notes': 'str',
        'phone': 'str',
        'username': 'str',
        'vehicle_id': 'int',
        'password': 'str',
        'tag_ids': 'list[int]'
    }

    attribute_map = {
        'eld_adverse_weather_exemption_enabled': 'eldAdverseWeatherExemptionEnabled',
        'eld_big_day_exemption_enabled': 'eldBigDayExemptionEnabled',
        'eld_day_start_hour': 'eldDayStartHour',
        'eld_exempt': 'eldExempt',
        'eld_exempt_reason': 'eldExemptReason',
        'eld_pc_enabled': 'eldPcEnabled',
        'eld_ym_enabled': 'eldYmEnabled',
        'external_ids': 'externalIds',
        'group_id': 'groupId',
        'license_number': 'licenseNumber',
        'license_state': 'licenseState',
        'name': 'name',
        'notes': 'notes',
        'phone': 'phone',
        'username': 'username',
        'vehicle_id': 'vehicleId',
        'password': 'password',
        'tag_ids': 'tagIds'
    }

    def __init__(self, eld_adverse_weather_exemption_enabled=None, eld_big_day_exemption_enabled=None, eld_day_start_hour=None, eld_exempt=None, eld_exempt_reason=None, eld_pc_enabled=False, eld_ym_enabled=False, external_ids=None, group_id=None, license_number=None, license_state=None, name=None, notes=None, phone=None, username=None, vehicle_id=None, password=None, tag_ids=None):  # noqa: E501
        """DriverForCreate - a model defined in OpenAPI"""  # noqa: E501

        self._eld_adverse_weather_exemption_enabled = None
        self._eld_big_day_exemption_enabled = None
        self._eld_day_start_hour = None
        self._eld_exempt = None
        self._eld_exempt_reason = None
        self._eld_pc_enabled = None
        self._eld_ym_enabled = None
        self._external_ids = None
        self._group_id = None
        self._license_number = None
        self._license_state = None
        self._name = None
        self._notes = None
        self._phone = None
        self._username = None
        self._vehicle_id = None
        self._password = None
        self._tag_ids = None
        self.discriminator = None

        if eld_adverse_weather_exemption_enabled is not None:
            self.eld_adverse_weather_exemption_enabled = eld_adverse_weather_exemption_enabled
        if eld_big_day_exemption_enabled is not None:
            self.eld_big_day_exemption_enabled = eld_big_day_exemption_enabled
        if eld_day_start_hour is not None:
            self.eld_day_start_hour = eld_day_start_hour
        if eld_exempt is not None:
            self.eld_exempt = eld_exempt
        if eld_exempt_reason is not None:
            self.eld_exempt_reason = eld_exempt_reason
        if eld_pc_enabled is not None:
            self.eld_pc_enabled = eld_pc_enabled
        if eld_ym_enabled is not None:
            self.eld_ym_enabled = eld_ym_enabled
        if external_ids is not None:
            self.external_ids = external_ids
        if group_id is not None:
            self.group_id = group_id
        if license_number is not None:
            self.license_number = license_number
        if license_state is not None:
            self.license_state = license_state
        self.name = name
        if notes is not None:
            self.notes = notes
        if phone is not None:
            self.phone = phone
        if username is not None:
            self.username = username
        if vehicle_id is not None:
            self.vehicle_id = vehicle_id
        self.password = password
        if tag_ids is not None:
            self.tag_ids = tag_ids

    @property
    def eld_adverse_weather_exemption_enabled(self):
        """Gets the eld_adverse_weather_exemption_enabled of this DriverForCreate.  # noqa: E501

        Flag indicating this driver may use Adverse Weather exemptions in ELD logs.  # noqa: E501

        :return: The eld_adverse_weather_exemption_enabled of this DriverForCreate.  # noqa: E501
        :rtype: bool
        """
        return self._eld_adverse_weather_exemption_enabled

    @eld_adverse_weather_exemption_enabled.setter
    def eld_adverse_weather_exemption_enabled(self, eld_adverse_weather_exemption_enabled):
        """Sets the eld_adverse_weather_exemption_enabled of this DriverForCreate.

        Flag indicating this driver may use Adverse Weather exemptions in ELD logs.  # noqa: E501

        :param eld_adverse_weather_exemption_enabled: The eld_adverse_weather_exemption_enabled of this DriverForCreate.  # noqa: E501
        :type: bool
        """

        self._eld_adverse_weather_exemption_enabled = eld_adverse_weather_exemption_enabled

    @property
    def eld_big_day_exemption_enabled(self):
        """Gets the eld_big_day_exemption_enabled of this DriverForCreate.  # noqa: E501

        Flag indicating this driver may use Big Day excemptions in ELD logs.  # noqa: E501

        :return: The eld_big_day_exemption_enabled of this DriverForCreate.  # noqa: E501
        :rtype: bool
        """
        return self._eld_big_day_exemption_enabled

    @eld_big_day_exemption_enabled.setter
    def eld_big_day_exemption_enabled(self, eld_big_day_exemption_enabled):
        """Sets the eld_big_day_exemption_enabled of this DriverForCreate.

        Flag indicating this driver may use Big Day excemptions in ELD logs.  # noqa: E501

        :param eld_big_day_exemption_enabled: The eld_big_day_exemption_enabled of this DriverForCreate.  # noqa: E501
        :type: bool
        """

        self._eld_big_day_exemption_enabled = eld_big_day_exemption_enabled

    @property
    def eld_day_start_hour(self):
        """Gets the eld_day_start_hour of this DriverForCreate.  # noqa: E501

        0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.  # noqa: E501

        :return: The eld_day_start_hour of this DriverForCreate.  # noqa: E501
        :rtype: int
        """
        return self._eld_day_start_hour

    @eld_day_start_hour.setter
    def eld_day_start_hour(self, eld_day_start_hour):
        """Sets the eld_day_start_hour of this DriverForCreate.

        0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.  # noqa: E501

        :param eld_day_start_hour: The eld_day_start_hour of this DriverForCreate.  # noqa: E501
        :type: int
        """

        self._eld_day_start_hour = eld_day_start_hour

    @property
    def eld_exempt(self):
        """Gets the eld_exempt of this DriverForCreate.  # noqa: E501

        Flag indicating this driver is exempt from the Electronic Logging Mandate.  # noqa: E501

        :return: The eld_exempt of this DriverForCreate.  # noqa: E501
        :rtype: bool
        """
        return self._eld_exempt

    @eld_exempt.setter
    def eld_exempt(self, eld_exempt):
        """Sets the eld_exempt of this DriverForCreate.

        Flag indicating this driver is exempt from the Electronic Logging Mandate.  # noqa: E501

        :param eld_exempt: The eld_exempt of this DriverForCreate.  # noqa: E501
        :type: bool
        """

        self._eld_exempt = eld_exempt

    @property
    def eld_exempt_reason(self):
        """Gets the eld_exempt_reason of this DriverForCreate.  # noqa: E501

        Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).  # noqa: E501

        :return: The eld_exempt_reason of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._eld_exempt_reason

    @eld_exempt_reason.setter
    def eld_exempt_reason(self, eld_exempt_reason):
        """Sets the eld_exempt_reason of this DriverForCreate.

        Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).  # noqa: E501

        :param eld_exempt_reason: The eld_exempt_reason of this DriverForCreate.  # noqa: E501
        :type: str
        """

        self._eld_exempt_reason = eld_exempt_reason

    @property
    def eld_pc_enabled(self):
        """Gets the eld_pc_enabled of this DriverForCreate.  # noqa: E501

        Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.  # noqa: E501

        :return: The eld_pc_enabled of this DriverForCreate.  # noqa: E501
        :rtype: bool
        """
        return self._eld_pc_enabled

    @eld_pc_enabled.setter
    def eld_pc_enabled(self, eld_pc_enabled):
        """Sets the eld_pc_enabled of this DriverForCreate.

        Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.  # noqa: E501

        :param eld_pc_enabled: The eld_pc_enabled of this DriverForCreate.  # noqa: E501
        :type: bool
        """

        self._eld_pc_enabled = eld_pc_enabled

    @property
    def eld_ym_enabled(self):
        """Gets the eld_ym_enabled of this DriverForCreate.  # noqa: E501

        Flag indicating this driver may select the Yard Move duty status in ELD logs.  # noqa: E501

        :return: The eld_ym_enabled of this DriverForCreate.  # noqa: E501
        :rtype: bool
        """
        return self._eld_ym_enabled

    @eld_ym_enabled.setter
    def eld_ym_enabled(self, eld_ym_enabled):
        """Sets the eld_ym_enabled of this DriverForCreate.

        Flag indicating this driver may select the Yard Move duty status in ELD logs.  # noqa: E501

        :param eld_ym_enabled: The eld_ym_enabled of this DriverForCreate.  # noqa: E501
        :type: bool
        """

        self._eld_ym_enabled = eld_ym_enabled

    @property
    def external_ids(self):
        """Gets the external_ids of this DriverForCreate.  # noqa: E501

        Dictionary of external IDs (string key-value pairs)  # noqa: E501

        :return: The external_ids of this DriverForCreate.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._external_ids

    @external_ids.setter
    def external_ids(self, external_ids):
        """Sets the external_ids of this DriverForCreate.

        Dictionary of external IDs (string key-value pairs)  # noqa: E501

        :param external_ids: The external_ids of this DriverForCreate.  # noqa: E501
        :type: dict(str, str)
        """

        self._external_ids = external_ids

    @property
    def group_id(self):
        """Gets the group_id of this DriverForCreate.  # noqa: E501

        ID of the group if the organization has multiple groups (uncommon).  # noqa: E501

        :return: The group_id of this DriverForCreate.  # noqa: E501
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this DriverForCreate.

        ID of the group if the organization has multiple groups (uncommon).  # noqa: E501

        :param group_id: The group_id of this DriverForCreate.  # noqa: E501
        :type: int
        """

        self._group_id = group_id

    @property
    def license_number(self):
        """Gets the license_number of this DriverForCreate.  # noqa: E501

        Driver's state issued license number.  # noqa: E501

        :return: The license_number of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._license_number

    @license_number.setter
    def license_number(self, license_number):
        """Sets the license_number of this DriverForCreate.

        Driver's state issued license number.  # noqa: E501

        :param license_number: The license_number of this DriverForCreate.  # noqa: E501
        :type: str
        """

        self._license_number = license_number

    @property
    def license_state(self):
        """Gets the license_state of this DriverForCreate.  # noqa: E501

        Abbreviation of state that issued driver's license.  # noqa: E501

        :return: The license_state of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._license_state

    @license_state.setter
    def license_state(self, license_state):
        """Sets the license_state of this DriverForCreate.

        Abbreviation of state that issued driver's license.  # noqa: E501

        :param license_state: The license_state of this DriverForCreate.  # noqa: E501
        :type: str
        """

        self._license_state = license_state

    @property
    def name(self):
        """Gets the name of this DriverForCreate.  # noqa: E501

        Driver's name.  # noqa: E501

        :return: The name of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DriverForCreate.

        Driver's name.  # noqa: E501

        :param name: The name of this DriverForCreate.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def notes(self):
        """Gets the notes of this DriverForCreate.  # noqa: E501

        Notes about the driver.  # noqa: E501

        :return: The notes of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this DriverForCreate.

        Notes about the driver.  # noqa: E501

        :param notes: The notes of this DriverForCreate.  # noqa: E501
        :type: str
        """

        self._notes = notes

    @property
    def phone(self):
        """Gets the phone of this DriverForCreate.  # noqa: E501

        Driver's phone number. Please include only digits, ex. 4157771234  # noqa: E501

        :return: The phone of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """Sets the phone of this DriverForCreate.

        Driver's phone number. Please include only digits, ex. 4157771234  # noqa: E501

        :param phone: The phone of this DriverForCreate.  # noqa: E501
        :type: str
        """

        self._phone = phone

    @property
    def username(self):
        """Gets the username of this DriverForCreate.  # noqa: E501

        Driver's login username into the driver app.  # noqa: E501

        :return: The username of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this DriverForCreate.

        Driver's login username into the driver app.  # noqa: E501

        :param username: The username of this DriverForCreate.  # noqa: E501
        :type: str
        """

        self._username = username

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this DriverForCreate.  # noqa: E501

        ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).  # noqa: E501

        :return: The vehicle_id of this DriverForCreate.  # noqa: E501
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this DriverForCreate.

        ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).  # noqa: E501

        :param vehicle_id: The vehicle_id of this DriverForCreate.  # noqa: E501
        :type: int
        """

        self._vehicle_id = vehicle_id

    @property
    def password(self):
        """Gets the password of this DriverForCreate.  # noqa: E501

        Driver's password for the driver app.  # noqa: E501

        :return: The password of this DriverForCreate.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this DriverForCreate.

        Driver's password for the driver app.  # noqa: E501

        :param password: The password of this DriverForCreate.  # noqa: E501
        :type: str
        """
        if password is None:
            raise ValueError("Invalid value for `password`, must not be `None`")  # noqa: E501

        self._password = password

    @property
    def tag_ids(self):
        """Gets the tag_ids of this DriverForCreate.  # noqa: E501

        A list of tag IDs.  # noqa: E501

        :return: The tag_ids of this DriverForCreate.  # noqa: E501
        :rtype: list[int]
        """
        return self._tag_ids

    @tag_ids.setter
    def tag_ids(self, tag_ids):
        """Sets the tag_ids of this DriverForCreate.

        A list of tag IDs.  # noqa: E501

        :param tag_ids: The tag_ids of this DriverForCreate.  # noqa: E501
        :type: list[int]
        """

        self._tag_ids = tag_ids

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
        if not isinstance(other, DriverForCreate):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
