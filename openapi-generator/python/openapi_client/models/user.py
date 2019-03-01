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


class User(object):
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
        'auth_type': 'str',
        'email': 'str',
        'name': 'str',
        'organization_role_id': 'str',
        'id': 'int',
        'organization_role': 'str',
        'tag_roles': 'list[UserTagRole]'
    }

    attribute_map = {
        'auth_type': 'authType',
        'email': 'email',
        'name': 'name',
        'organization_role_id': 'organizationRoleId',
        'id': 'id',
        'organization_role': 'organizationRole',
        'tag_roles': 'tagRoles'
    }

    def __init__(self, auth_type=None, email=None, name=None, organization_role_id=None, id=None, organization_role=None, tag_roles=None):  # noqa: E501
        """User - a model defined in OpenAPI"""  # noqa: E501

        self._auth_type = None
        self._email = None
        self._name = None
        self._organization_role_id = None
        self._id = None
        self._organization_role = None
        self._tag_roles = None
        self.discriminator = None

        self.auth_type = auth_type
        self.email = email
        if name is not None:
            self.name = name
        if organization_role_id is not None:
            self.organization_role_id = organization_role_id
        if id is not None:
            self.id = id
        if organization_role is not None:
            self.organization_role = organization_role
        if tag_roles is not None:
            self.tag_roles = tag_roles

    @property
    def auth_type(self):
        """Gets the auth_type of this User.  # noqa: E501

        The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.  # noqa: E501

        :return: The auth_type of this User.  # noqa: E501
        :rtype: str
        """
        return self._auth_type

    @auth_type.setter
    def auth_type(self, auth_type):
        """Sets the auth_type of this User.

        The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.  # noqa: E501

        :param auth_type: The auth_type of this User.  # noqa: E501
        :type: str
        """
        if auth_type is None:
            raise ValueError("Invalid value for `auth_type`, must not be `None`")  # noqa: E501
        allowed_values = ["default", "saml"]  # noqa: E501
        if auth_type not in allowed_values:
            raise ValueError(
                "Invalid value for `auth_type` ({0}), must be one of {1}"  # noqa: E501
                .format(auth_type, allowed_values)
            )

        self._auth_type = auth_type

    @property
    def email(self):
        """Gets the email of this User.  # noqa: E501

        The email address of this user.  # noqa: E501

        :return: The email of this User.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this User.

        The email address of this user.  # noqa: E501

        :param email: The email of this User.  # noqa: E501
        :type: str
        """
        if email is None:
            raise ValueError("Invalid value for `email`, must not be `None`")  # noqa: E501

        self._email = email

    @property
    def name(self):
        """Gets the name of this User.  # noqa: E501

        The first and last name of the user.  # noqa: E501

        :return: The name of this User.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this User.

        The first and last name of the user.  # noqa: E501

        :param name: The name of this User.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def organization_role_id(self):
        """Gets the organization_role_id of this User.  # noqa: E501

        The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.  # noqa: E501

        :return: The organization_role_id of this User.  # noqa: E501
        :rtype: str
        """
        return self._organization_role_id

    @organization_role_id.setter
    def organization_role_id(self, organization_role_id):
        """Sets the organization_role_id of this User.

        The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.  # noqa: E501

        :param organization_role_id: The organization_role_id of this User.  # noqa: E501
        :type: str
        """

        self._organization_role_id = organization_role_id

    @property
    def id(self):
        """Gets the id of this User.  # noqa: E501

        The ID of the User record.  # noqa: E501

        :return: The id of this User.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this User.

        The ID of the User record.  # noqa: E501

        :param id: The id of this User.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def organization_role(self):
        """Gets the organization_role of this User.  # noqa: E501

        The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.  # noqa: E501

        :return: The organization_role of this User.  # noqa: E501
        :rtype: str
        """
        return self._organization_role

    @organization_role.setter
    def organization_role(self, organization_role):
        """Sets the organization_role of this User.

        The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.  # noqa: E501

        :param organization_role: The organization_role of this User.  # noqa: E501
        :type: str
        """

        self._organization_role = organization_role

    @property
    def tag_roles(self):
        """Gets the tag_roles of this User.  # noqa: E501

        The specific tags this user has access to. This will be blank for users that have full access to the organization.  # noqa: E501

        :return: The tag_roles of this User.  # noqa: E501
        :rtype: list[UserTagRole]
        """
        return self._tag_roles

    @tag_roles.setter
    def tag_roles(self, tag_roles):
        """Sets the tag_roles of this User.

        The specific tags this user has access to. This will be blank for users that have full access to the organization.  # noqa: E501

        :param tag_roles: The tag_roles of this User.  # noqa: E501
        :type: list[UserTagRole]
        """

        self._tag_roles = tag_roles

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
        if not isinstance(other, User):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
