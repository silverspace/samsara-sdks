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

from samsara.models.address_geofence import AddressGeofence  # noqa: F401,E501
from samsara.models.address_notes import AddressNotes  # noqa: F401,E501
from samsara.models.contact_ids import ContactIds  # noqa: F401,E501
from samsara.models.tag_ids import TagIds  # noqa: F401,E501


class AddressesAddresses(object):
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
        'contact_ids': 'ContactIds',
        'formatted_address': 'str',
        'geofence': 'AddressGeofence',
        'name': 'str',
        'notes': 'AddressNotes',
        'tag_ids': 'TagIds'
    }

    attribute_map = {
        'contact_ids': 'contactIds',
        'formatted_address': 'formattedAddress',
        'geofence': 'geofence',
        'name': 'name',
        'notes': 'notes',
        'tag_ids': 'tagIds'
    }

    def __init__(self, contact_ids=None, formatted_address=None, geofence=None, name=None, notes=None, tag_ids=None):  # noqa: E501
        """AddressesAddresses - a model defined in Swagger"""  # noqa: E501

        self._contact_ids = None
        self._formatted_address = None
        self._geofence = None
        self._name = None
        self._notes = None
        self._tag_ids = None
        self.discriminator = None

        if contact_ids is not None:
            self.contact_ids = contact_ids
        self.formatted_address = formatted_address
        self.geofence = geofence
        self.name = name
        if notes is not None:
            self.notes = notes
        if tag_ids is not None:
            self.tag_ids = tag_ids

    @property
    def contact_ids(self):
        """Gets the contact_ids of this AddressesAddresses.  # noqa: E501


        :return: The contact_ids of this AddressesAddresses.  # noqa: E501
        :rtype: ContactIds
        """
        return self._contact_ids

    @contact_ids.setter
    def contact_ids(self, contact_ids):
        """Sets the contact_ids of this AddressesAddresses.


        :param contact_ids: The contact_ids of this AddressesAddresses.  # noqa: E501
        :type: ContactIds
        """

        self._contact_ids = contact_ids

    @property
    def formatted_address(self):
        """Gets the formatted_address of this AddressesAddresses.  # noqa: E501

        The full address associated with this address/geofence, as it might be recognized by maps.google.com  # noqa: E501

        :return: The formatted_address of this AddressesAddresses.  # noqa: E501
        :rtype: str
        """
        return self._formatted_address

    @formatted_address.setter
    def formatted_address(self, formatted_address):
        """Sets the formatted_address of this AddressesAddresses.

        The full address associated with this address/geofence, as it might be recognized by maps.google.com  # noqa: E501

        :param formatted_address: The formatted_address of this AddressesAddresses.  # noqa: E501
        :type: str
        """
        if formatted_address is None:
            raise ValueError("Invalid value for `formatted_address`, must not be `None`")  # noqa: E501

        self._formatted_address = formatted_address

    @property
    def geofence(self):
        """Gets the geofence of this AddressesAddresses.  # noqa: E501


        :return: The geofence of this AddressesAddresses.  # noqa: E501
        :rtype: AddressGeofence
        """
        return self._geofence

    @geofence.setter
    def geofence(self, geofence):
        """Sets the geofence of this AddressesAddresses.


        :param geofence: The geofence of this AddressesAddresses.  # noqa: E501
        :type: AddressGeofence
        """
        if geofence is None:
            raise ValueError("Invalid value for `geofence`, must not be `None`")  # noqa: E501

        self._geofence = geofence

    @property
    def name(self):
        """Gets the name of this AddressesAddresses.  # noqa: E501

        The name of this address/geofence  # noqa: E501

        :return: The name of this AddressesAddresses.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this AddressesAddresses.

        The name of this address/geofence  # noqa: E501

        :param name: The name of this AddressesAddresses.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def notes(self):
        """Gets the notes of this AddressesAddresses.  # noqa: E501


        :return: The notes of this AddressesAddresses.  # noqa: E501
        :rtype: AddressNotes
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this AddressesAddresses.


        :param notes: The notes of this AddressesAddresses.  # noqa: E501
        :type: AddressNotes
        """

        self._notes = notes

    @property
    def tag_ids(self):
        """Gets the tag_ids of this AddressesAddresses.  # noqa: E501


        :return: The tag_ids of this AddressesAddresses.  # noqa: E501
        :rtype: TagIds
        """
        return self._tag_ids

    @tag_ids.setter
    def tag_ids(self, tag_ids):
        """Sets the tag_ids of this AddressesAddresses.


        :param tag_ids: The tag_ids of this AddressesAddresses.  # noqa: E501
        :type: TagIds
        """

        self._tag_ids = tag_ids

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
        if issubclass(AddressesAddresses, dict):
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
        if not isinstance(other, AddressesAddresses):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other