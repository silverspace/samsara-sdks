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


class JobUpdateObject(object):
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
        'changed_at_ms': 'int',
        'job_id': 'int',
        'job_state': 'JobStatus',
        'prev_job_state': 'PrevJobStatus',
        'route': 'DispatchRoute',
        'route_id': 'int'
    }

    attribute_map = {
        'changed_at_ms': 'changed_at_ms',
        'job_id': 'job_id',
        'job_state': 'job_state',
        'prev_job_state': 'prev_job_state',
        'route': 'route',
        'route_id': 'route_id'
    }

    def __init__(self, changed_at_ms=None, job_id=None, job_state=None, prev_job_state=None, route=None, route_id=None):  # noqa: E501
        """JobUpdateObject - a model defined in OpenAPI"""  # noqa: E501

        self._changed_at_ms = None
        self._job_id = None
        self._job_state = None
        self._prev_job_state = None
        self._route = None
        self._route_id = None
        self.discriminator = None

        if changed_at_ms is not None:
            self.changed_at_ms = changed_at_ms
        if job_id is not None:
            self.job_id = job_id
        if job_state is not None:
            self.job_state = job_state
        if prev_job_state is not None:
            self.prev_job_state = prev_job_state
        if route is not None:
            self.route = route
        if route_id is not None:
            self.route_id = route_id

    @property
    def changed_at_ms(self):
        """Gets the changed_at_ms of this JobUpdateObject.  # noqa: E501

        Timestamp that this event was updated, represented as Unix milliseconds since epoch.  # noqa: E501

        :return: The changed_at_ms of this JobUpdateObject.  # noqa: E501
        :rtype: int
        """
        return self._changed_at_ms

    @changed_at_ms.setter
    def changed_at_ms(self, changed_at_ms):
        """Sets the changed_at_ms of this JobUpdateObject.

        Timestamp that this event was updated, represented as Unix milliseconds since epoch.  # noqa: E501

        :param changed_at_ms: The changed_at_ms of this JobUpdateObject.  # noqa: E501
        :type: int
        """

        self._changed_at_ms = changed_at_ms

    @property
    def job_id(self):
        """Gets the job_id of this JobUpdateObject.  # noqa: E501

        ID of the Samsara job.  # noqa: E501

        :return: The job_id of this JobUpdateObject.  # noqa: E501
        :rtype: int
        """
        return self._job_id

    @job_id.setter
    def job_id(self, job_id):
        """Sets the job_id of this JobUpdateObject.

        ID of the Samsara job.  # noqa: E501

        :param job_id: The job_id of this JobUpdateObject.  # noqa: E501
        :type: int
        """

        self._job_id = job_id

    @property
    def job_state(self):
        """Gets the job_state of this JobUpdateObject.  # noqa: E501


        :return: The job_state of this JobUpdateObject.  # noqa: E501
        :rtype: JobStatus
        """
        return self._job_state

    @job_state.setter
    def job_state(self, job_state):
        """Sets the job_state of this JobUpdateObject.


        :param job_state: The job_state of this JobUpdateObject.  # noqa: E501
        :type: JobStatus
        """

        self._job_state = job_state

    @property
    def prev_job_state(self):
        """Gets the prev_job_state of this JobUpdateObject.  # noqa: E501


        :return: The prev_job_state of this JobUpdateObject.  # noqa: E501
        :rtype: PrevJobStatus
        """
        return self._prev_job_state

    @prev_job_state.setter
    def prev_job_state(self, prev_job_state):
        """Sets the prev_job_state of this JobUpdateObject.


        :param prev_job_state: The prev_job_state of this JobUpdateObject.  # noqa: E501
        :type: PrevJobStatus
        """

        self._prev_job_state = prev_job_state

    @property
    def route(self):
        """Gets the route of this JobUpdateObject.  # noqa: E501


        :return: The route of this JobUpdateObject.  # noqa: E501
        :rtype: DispatchRoute
        """
        return self._route

    @route.setter
    def route(self, route):
        """Sets the route of this JobUpdateObject.


        :param route: The route of this JobUpdateObject.  # noqa: E501
        :type: DispatchRoute
        """

        self._route = route

    @property
    def route_id(self):
        """Gets the route_id of this JobUpdateObject.  # noqa: E501

        ID of the Samsara dispatch route.  # noqa: E501

        :return: The route_id of this JobUpdateObject.  # noqa: E501
        :rtype: int
        """
        return self._route_id

    @route_id.setter
    def route_id(self, route_id):
        """Sets the route_id of this JobUpdateObject.

        ID of the Samsara dispatch route.  # noqa: E501

        :param route_id: The route_id of this JobUpdateObject.  # noqa: E501
        :type: int
        """

        self._route_id = route_id

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
        if not isinstance(other, JobUpdateObject):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
