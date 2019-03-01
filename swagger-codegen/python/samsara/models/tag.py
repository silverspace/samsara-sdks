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

from samsara.models.tagged_address import TaggedAddress  # noqa: F401,E501
from samsara.models.tagged_asset import TaggedAsset  # noqa: F401,E501
from samsara.models.tagged_driver import TaggedDriver  # noqa: F401,E501
from samsara.models.tagged_machine import TaggedMachine  # noqa: F401,E501
from samsara.models.tagged_sensor import TaggedSensor  # noqa: F401,E501
from samsara.models.tagged_vehicle import TaggedVehicle  # noqa: F401,E501


class Tag(object):
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
        'addresses': 'list[TaggedAddress]',
        'assets': 'list[TaggedAsset]',
        'drivers': 'list[TaggedDriver]',
        'group_id': 'int',
        'id': 'int',
        'machines': 'list[TaggedMachine]',
        'name': 'str',
        'parent_tag_id': 'int',
        'sensors': 'list[TaggedSensor]',
        'vehicles': 'list[TaggedVehicle]'
    }

    attribute_map = {
        'addresses': 'addresses',
        'assets': 'assets',
        'drivers': 'drivers',
        'group_id': 'groupId',
        'id': 'id',
        'machines': 'machines',
        'name': 'name',
        'parent_tag_id': 'parentTagId',
        'sensors': 'sensors',
        'vehicles': 'vehicles'
    }

    def __init__(self, addresses=None, assets=None, drivers=None, group_id=None, id=None, machines=None, name=None, parent_tag_id=None, sensors=None, vehicles=None):  # noqa: E501
        """Tag - a model defined in Swagger"""  # noqa: E501

        self._addresses = None
        self._assets = None
        self._drivers = None
        self._group_id = None
        self._id = None
        self._machines = None
        self._name = None
        self._parent_tag_id = None
        self._sensors = None
        self._vehicles = None
        self.discriminator = None

        if addresses is not None:
            self.addresses = addresses
        if assets is not None:
            self.assets = assets
        if drivers is not None:
            self.drivers = drivers
        if group_id is not None:
            self.group_id = group_id
        self.id = id
        if machines is not None:
            self.machines = machines
        self.name = name
        if parent_tag_id is not None:
            self.parent_tag_id = parent_tag_id
        if sensors is not None:
            self.sensors = sensors
        if vehicles is not None:
            self.vehicles = vehicles

    @property
    def addresses(self):
        """Gets the addresses of this Tag.  # noqa: E501

        The addresses that belong to this tag.  # noqa: E501

        :return: The addresses of this Tag.  # noqa: E501
        :rtype: list[TaggedAddress]
        """
        return self._addresses

    @addresses.setter
    def addresses(self, addresses):
        """Sets the addresses of this Tag.

        The addresses that belong to this tag.  # noqa: E501

        :param addresses: The addresses of this Tag.  # noqa: E501
        :type: list[TaggedAddress]
        """

        self._addresses = addresses

    @property
    def assets(self):
        """Gets the assets of this Tag.  # noqa: E501

        The assets that belong to this tag.  # noqa: E501

        :return: The assets of this Tag.  # noqa: E501
        :rtype: list[TaggedAsset]
        """
        return self._assets

    @assets.setter
    def assets(self, assets):
        """Sets the assets of this Tag.

        The assets that belong to this tag.  # noqa: E501

        :param assets: The assets of this Tag.  # noqa: E501
        :type: list[TaggedAsset]
        """

        self._assets = assets

    @property
    def drivers(self):
        """Gets the drivers of this Tag.  # noqa: E501

        The drivers that belong to this tag.  # noqa: E501

        :return: The drivers of this Tag.  # noqa: E501
        :rtype: list[TaggedDriver]
        """
        return self._drivers

    @drivers.setter
    def drivers(self, drivers):
        """Sets the drivers of this Tag.

        The drivers that belong to this tag.  # noqa: E501

        :param drivers: The drivers of this Tag.  # noqa: E501
        :type: list[TaggedDriver]
        """

        self._drivers = drivers

    @property
    def group_id(self):
        """Gets the group_id of this Tag.  # noqa: E501

        The GroupID that this tag belongs to.  # noqa: E501

        :return: The group_id of this Tag.  # noqa: E501
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this Tag.

        The GroupID that this tag belongs to.  # noqa: E501

        :param group_id: The group_id of this Tag.  # noqa: E501
        :type: int
        """

        self._group_id = group_id

    @property
    def id(self):
        """Gets the id of this Tag.  # noqa: E501

        The ID of this tag.  # noqa: E501

        :return: The id of this Tag.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Tag.

        The ID of this tag.  # noqa: E501

        :param id: The id of this Tag.  # noqa: E501
        :type: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def machines(self):
        """Gets the machines of this Tag.  # noqa: E501

        The machines that belong to this tag.  # noqa: E501

        :return: The machines of this Tag.  # noqa: E501
        :rtype: list[TaggedMachine]
        """
        return self._machines

    @machines.setter
    def machines(self, machines):
        """Sets the machines of this Tag.

        The machines that belong to this tag.  # noqa: E501

        :param machines: The machines of this Tag.  # noqa: E501
        :type: list[TaggedMachine]
        """

        self._machines = machines

    @property
    def name(self):
        """Gets the name of this Tag.  # noqa: E501

        Name of this tag.  # noqa: E501

        :return: The name of this Tag.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Tag.

        Name of this tag.  # noqa: E501

        :param name: The name of this Tag.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def parent_tag_id(self):
        """Gets the parent_tag_id of this Tag.  # noqa: E501

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :return: The parent_tag_id of this Tag.  # noqa: E501
        :rtype: int
        """
        return self._parent_tag_id

    @parent_tag_id.setter
    def parent_tag_id(self, parent_tag_id):
        """Sets the parent_tag_id of this Tag.

        If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.  # noqa: E501

        :param parent_tag_id: The parent_tag_id of this Tag.  # noqa: E501
        :type: int
        """

        self._parent_tag_id = parent_tag_id

    @property
    def sensors(self):
        """Gets the sensors of this Tag.  # noqa: E501

        The sensors that belong to this tag.  # noqa: E501

        :return: The sensors of this Tag.  # noqa: E501
        :rtype: list[TaggedSensor]
        """
        return self._sensors

    @sensors.setter
    def sensors(self, sensors):
        """Sets the sensors of this Tag.

        The sensors that belong to this tag.  # noqa: E501

        :param sensors: The sensors of this Tag.  # noqa: E501
        :type: list[TaggedSensor]
        """

        self._sensors = sensors

    @property
    def vehicles(self):
        """Gets the vehicles of this Tag.  # noqa: E501

        The vehicles that belong to this tag.  # noqa: E501

        :return: The vehicles of this Tag.  # noqa: E501
        :rtype: list[TaggedVehicle]
        """
        return self._vehicles

    @vehicles.setter
    def vehicles(self, vehicles):
        """Sets the vehicles of this Tag.

        The vehicles that belong to this tag.  # noqa: E501

        :param vehicles: The vehicles of this Tag.  # noqa: E501
        :type: list[TaggedVehicle]
        """

        self._vehicles = vehicles

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
        if issubclass(Tag, dict):
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
        if not isinstance(other, Tag):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
