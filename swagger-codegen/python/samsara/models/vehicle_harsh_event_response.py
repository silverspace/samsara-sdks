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

from samsara.models.vehicle_harsh_event_response_location import VehicleHarshEventResponseLocation  # noqa: F401,E501


class VehicleHarshEventResponse(object):
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
        'download_forward_video_url': 'str',
        'download_inward_video_url': 'str',
        'download_tracked_inward_video_url': 'str',
        'harsh_event_type': 'str',
        'incident_report_url': 'str',
        'is_distracted': 'bool',
        'location': 'VehicleHarshEventResponseLocation'
    }

    attribute_map = {
        'download_forward_video_url': 'downloadForwardVideoUrl',
        'download_inward_video_url': 'downloadInwardVideoUrl',
        'download_tracked_inward_video_url': 'downloadTrackedInwardVideoUrl',
        'harsh_event_type': 'harshEventType',
        'incident_report_url': 'incidentReportUrl',
        'is_distracted': 'isDistracted',
        'location': 'location'
    }

    def __init__(self, download_forward_video_url=None, download_inward_video_url=None, download_tracked_inward_video_url=None, harsh_event_type=None, incident_report_url=None, is_distracted=None, location=None):  # noqa: E501
        """VehicleHarshEventResponse - a model defined in Swagger"""  # noqa: E501

        self._download_forward_video_url = None
        self._download_inward_video_url = None
        self._download_tracked_inward_video_url = None
        self._harsh_event_type = None
        self._incident_report_url = None
        self._is_distracted = None
        self._location = None
        self.discriminator = None

        if download_forward_video_url is not None:
            self.download_forward_video_url = download_forward_video_url
        if download_inward_video_url is not None:
            self.download_inward_video_url = download_inward_video_url
        if download_tracked_inward_video_url is not None:
            self.download_tracked_inward_video_url = download_tracked_inward_video_url
        self.harsh_event_type = harsh_event_type
        self.incident_report_url = incident_report_url
        if is_distracted is not None:
            self.is_distracted = is_distracted
        if location is not None:
            self.location = location

    @property
    def download_forward_video_url(self):
        """Gets the download_forward_video_url of this VehicleHarshEventResponse.  # noqa: E501

        URL for downloading the forward facing video  # noqa: E501

        :return: The download_forward_video_url of this VehicleHarshEventResponse.  # noqa: E501
        :rtype: str
        """
        return self._download_forward_video_url

    @download_forward_video_url.setter
    def download_forward_video_url(self, download_forward_video_url):
        """Sets the download_forward_video_url of this VehicleHarshEventResponse.

        URL for downloading the forward facing video  # noqa: E501

        :param download_forward_video_url: The download_forward_video_url of this VehicleHarshEventResponse.  # noqa: E501
        :type: str
        """

        self._download_forward_video_url = download_forward_video_url

    @property
    def download_inward_video_url(self):
        """Gets the download_inward_video_url of this VehicleHarshEventResponse.  # noqa: E501

        URL for downloading the inward facing video  # noqa: E501

        :return: The download_inward_video_url of this VehicleHarshEventResponse.  # noqa: E501
        :rtype: str
        """
        return self._download_inward_video_url

    @download_inward_video_url.setter
    def download_inward_video_url(self, download_inward_video_url):
        """Sets the download_inward_video_url of this VehicleHarshEventResponse.

        URL for downloading the inward facing video  # noqa: E501

        :param download_inward_video_url: The download_inward_video_url of this VehicleHarshEventResponse.  # noqa: E501
        :type: str
        """

        self._download_inward_video_url = download_inward_video_url

    @property
    def download_tracked_inward_video_url(self):
        """Gets the download_tracked_inward_video_url of this VehicleHarshEventResponse.  # noqa: E501

        URL for downloading the tracked inward facing video  # noqa: E501

        :return: The download_tracked_inward_video_url of this VehicleHarshEventResponse.  # noqa: E501
        :rtype: str
        """
        return self._download_tracked_inward_video_url

    @download_tracked_inward_video_url.setter
    def download_tracked_inward_video_url(self, download_tracked_inward_video_url):
        """Sets the download_tracked_inward_video_url of this VehicleHarshEventResponse.

        URL for downloading the tracked inward facing video  # noqa: E501

        :param download_tracked_inward_video_url: The download_tracked_inward_video_url of this VehicleHarshEventResponse.  # noqa: E501
        :type: str
        """

        self._download_tracked_inward_video_url = download_tracked_inward_video_url

    @property
    def harsh_event_type(self):
        """Gets the harsh_event_type of this VehicleHarshEventResponse.  # noqa: E501

        Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]  # noqa: E501

        :return: The harsh_event_type of this VehicleHarshEventResponse.  # noqa: E501
        :rtype: str
        """
        return self._harsh_event_type

    @harsh_event_type.setter
    def harsh_event_type(self, harsh_event_type):
        """Sets the harsh_event_type of this VehicleHarshEventResponse.

        Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]  # noqa: E501

        :param harsh_event_type: The harsh_event_type of this VehicleHarshEventResponse.  # noqa: E501
        :type: str
        """
        if harsh_event_type is None:
            raise ValueError("Invalid value for `harsh_event_type`, must not be `None`")  # noqa: E501

        self._harsh_event_type = harsh_event_type

    @property
    def incident_report_url(self):
        """Gets the incident_report_url of this VehicleHarshEventResponse.  # noqa: E501

        URL of the associated incident report page  # noqa: E501

        :return: The incident_report_url of this VehicleHarshEventResponse.  # noqa: E501
        :rtype: str
        """
        return self._incident_report_url

    @incident_report_url.setter
    def incident_report_url(self, incident_report_url):
        """Sets the incident_report_url of this VehicleHarshEventResponse.

        URL of the associated incident report page  # noqa: E501

        :param incident_report_url: The incident_report_url of this VehicleHarshEventResponse.  # noqa: E501
        :type: str
        """
        if incident_report_url is None:
            raise ValueError("Invalid value for `incident_report_url`, must not be `None`")  # noqa: E501

        self._incident_report_url = incident_report_url

    @property
    def is_distracted(self):
        """Gets the is_distracted of this VehicleHarshEventResponse.  # noqa: E501

        Whether the driver was deemed distracted during this harsh event  # noqa: E501

        :return: The is_distracted of this VehicleHarshEventResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_distracted

    @is_distracted.setter
    def is_distracted(self, is_distracted):
        """Sets the is_distracted of this VehicleHarshEventResponse.

        Whether the driver was deemed distracted during this harsh event  # noqa: E501

        :param is_distracted: The is_distracted of this VehicleHarshEventResponse.  # noqa: E501
        :type: bool
        """

        self._is_distracted = is_distracted

    @property
    def location(self):
        """Gets the location of this VehicleHarshEventResponse.  # noqa: E501


        :return: The location of this VehicleHarshEventResponse.  # noqa: E501
        :rtype: VehicleHarshEventResponseLocation
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this VehicleHarshEventResponse.


        :param location: The location of this VehicleHarshEventResponse.  # noqa: E501
        :type: VehicleHarshEventResponseLocation
        """

        self._location = location

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
        if issubclass(VehicleHarshEventResponse, dict):
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
        if not isinstance(other, VehicleHarshEventResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
