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

from samsara.models.dvir_base_author_signature import DvirBaseAuthorSignature  # noqa: F401,E501
from samsara.models.dvir_base_mechanic_or_agent_signature import DvirBaseMechanicOrAgentSignature  # noqa: F401,E501
from samsara.models.dvir_base_next_driver_signature import DvirBaseNextDriverSignature  # noqa: F401,E501
from samsara.models.dvir_base_trailer_defects import DvirBaseTrailerDefects  # noqa: F401,E501
from samsara.models.dvir_base_vehicle import DvirBaseVehicle  # noqa: F401,E501


class DvirBase(object):
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
        'author_signature': 'DvirBaseAuthorSignature',
        'defects_corrected': 'bool',
        'defects_need_not_be_corrected': 'bool',
        'id': 'int',
        'inspection_type': 'str',
        'mechanic_notes': 'str',
        'mechanic_or_agent_signature': 'DvirBaseMechanicOrAgentSignature',
        'next_driver_signature': 'DvirBaseNextDriverSignature',
        'odometer_miles': 'int',
        'time_ms': 'int',
        'trailer_defects': 'list[DvirBaseTrailerDefects]',
        'trailer_id': 'int',
        'trailer_name': 'str',
        'vehicle': 'DvirBaseVehicle',
        'vehicle_condition': 'str',
        'vehicle_defects': 'list[DvirBaseTrailerDefects]'
    }

    attribute_map = {
        'author_signature': 'authorSignature',
        'defects_corrected': 'defectsCorrected',
        'defects_need_not_be_corrected': 'defectsNeedNotBeCorrected',
        'id': 'id',
        'inspection_type': 'inspectionType',
        'mechanic_notes': 'mechanicNotes',
        'mechanic_or_agent_signature': 'mechanicOrAgentSignature',
        'next_driver_signature': 'nextDriverSignature',
        'odometer_miles': 'odometerMiles',
        'time_ms': 'timeMs',
        'trailer_defects': 'trailerDefects',
        'trailer_id': 'trailerId',
        'trailer_name': 'trailerName',
        'vehicle': 'vehicle',
        'vehicle_condition': 'vehicleCondition',
        'vehicle_defects': 'vehicleDefects'
    }

    def __init__(self, author_signature=None, defects_corrected=None, defects_need_not_be_corrected=None, id=None, inspection_type=None, mechanic_notes=None, mechanic_or_agent_signature=None, next_driver_signature=None, odometer_miles=None, time_ms=None, trailer_defects=None, trailer_id=None, trailer_name=None, vehicle=None, vehicle_condition=None, vehicle_defects=None):  # noqa: E501
        """DvirBase - a model defined in Swagger"""  # noqa: E501

        self._author_signature = None
        self._defects_corrected = None
        self._defects_need_not_be_corrected = None
        self._id = None
        self._inspection_type = None
        self._mechanic_notes = None
        self._mechanic_or_agent_signature = None
        self._next_driver_signature = None
        self._odometer_miles = None
        self._time_ms = None
        self._trailer_defects = None
        self._trailer_id = None
        self._trailer_name = None
        self._vehicle = None
        self._vehicle_condition = None
        self._vehicle_defects = None
        self.discriminator = None

        if author_signature is not None:
            self.author_signature = author_signature
        if defects_corrected is not None:
            self.defects_corrected = defects_corrected
        if defects_need_not_be_corrected is not None:
            self.defects_need_not_be_corrected = defects_need_not_be_corrected
        if id is not None:
            self.id = id
        if inspection_type is not None:
            self.inspection_type = inspection_type
        if mechanic_notes is not None:
            self.mechanic_notes = mechanic_notes
        if mechanic_or_agent_signature is not None:
            self.mechanic_or_agent_signature = mechanic_or_agent_signature
        if next_driver_signature is not None:
            self.next_driver_signature = next_driver_signature
        if odometer_miles is not None:
            self.odometer_miles = odometer_miles
        if time_ms is not None:
            self.time_ms = time_ms
        if trailer_defects is not None:
            self.trailer_defects = trailer_defects
        if trailer_id is not None:
            self.trailer_id = trailer_id
        if trailer_name is not None:
            self.trailer_name = trailer_name
        if vehicle is not None:
            self.vehicle = vehicle
        if vehicle_condition is not None:
            self.vehicle_condition = vehicle_condition
        if vehicle_defects is not None:
            self.vehicle_defects = vehicle_defects

    @property
    def author_signature(self):
        """Gets the author_signature of this DvirBase.  # noqa: E501


        :return: The author_signature of this DvirBase.  # noqa: E501
        :rtype: DvirBaseAuthorSignature
        """
        return self._author_signature

    @author_signature.setter
    def author_signature(self, author_signature):
        """Sets the author_signature of this DvirBase.


        :param author_signature: The author_signature of this DvirBase.  # noqa: E501
        :type: DvirBaseAuthorSignature
        """

        self._author_signature = author_signature

    @property
    def defects_corrected(self):
        """Gets the defects_corrected of this DvirBase.  # noqa: E501

        Signifies if the defects on the vehicle corrected after the DVIR is done.  # noqa: E501

        :return: The defects_corrected of this DvirBase.  # noqa: E501
        :rtype: bool
        """
        return self._defects_corrected

    @defects_corrected.setter
    def defects_corrected(self, defects_corrected):
        """Sets the defects_corrected of this DvirBase.

        Signifies if the defects on the vehicle corrected after the DVIR is done.  # noqa: E501

        :param defects_corrected: The defects_corrected of this DvirBase.  # noqa: E501
        :type: bool
        """

        self._defects_corrected = defects_corrected

    @property
    def defects_need_not_be_corrected(self):
        """Gets the defects_need_not_be_corrected of this DvirBase.  # noqa: E501

        Signifies if the defects on this vehicle can be ignored.  # noqa: E501

        :return: The defects_need_not_be_corrected of this DvirBase.  # noqa: E501
        :rtype: bool
        """
        return self._defects_need_not_be_corrected

    @defects_need_not_be_corrected.setter
    def defects_need_not_be_corrected(self, defects_need_not_be_corrected):
        """Sets the defects_need_not_be_corrected of this DvirBase.

        Signifies if the defects on this vehicle can be ignored.  # noqa: E501

        :param defects_need_not_be_corrected: The defects_need_not_be_corrected of this DvirBase.  # noqa: E501
        :type: bool
        """

        self._defects_need_not_be_corrected = defects_need_not_be_corrected

    @property
    def id(self):
        """Gets the id of this DvirBase.  # noqa: E501

        The id of this DVIR record.  # noqa: E501

        :return: The id of this DvirBase.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DvirBase.

        The id of this DVIR record.  # noqa: E501

        :param id: The id of this DvirBase.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def inspection_type(self):
        """Gets the inspection_type of this DvirBase.  # noqa: E501

        Inspection type of the DVIR.  # noqa: E501

        :return: The inspection_type of this DvirBase.  # noqa: E501
        :rtype: str
        """
        return self._inspection_type

    @inspection_type.setter
    def inspection_type(self, inspection_type):
        """Sets the inspection_type of this DvirBase.

        Inspection type of the DVIR.  # noqa: E501

        :param inspection_type: The inspection_type of this DvirBase.  # noqa: E501
        :type: str
        """

        self._inspection_type = inspection_type

    @property
    def mechanic_notes(self):
        """Gets the mechanic_notes of this DvirBase.  # noqa: E501

        The mechanics notes on the DVIR.  # noqa: E501

        :return: The mechanic_notes of this DvirBase.  # noqa: E501
        :rtype: str
        """
        return self._mechanic_notes

    @mechanic_notes.setter
    def mechanic_notes(self, mechanic_notes):
        """Sets the mechanic_notes of this DvirBase.

        The mechanics notes on the DVIR.  # noqa: E501

        :param mechanic_notes: The mechanic_notes of this DvirBase.  # noqa: E501
        :type: str
        """

        self._mechanic_notes = mechanic_notes

    @property
    def mechanic_or_agent_signature(self):
        """Gets the mechanic_or_agent_signature of this DvirBase.  # noqa: E501


        :return: The mechanic_or_agent_signature of this DvirBase.  # noqa: E501
        :rtype: DvirBaseMechanicOrAgentSignature
        """
        return self._mechanic_or_agent_signature

    @mechanic_or_agent_signature.setter
    def mechanic_or_agent_signature(self, mechanic_or_agent_signature):
        """Sets the mechanic_or_agent_signature of this DvirBase.


        :param mechanic_or_agent_signature: The mechanic_or_agent_signature of this DvirBase.  # noqa: E501
        :type: DvirBaseMechanicOrAgentSignature
        """

        self._mechanic_or_agent_signature = mechanic_or_agent_signature

    @property
    def next_driver_signature(self):
        """Gets the next_driver_signature of this DvirBase.  # noqa: E501


        :return: The next_driver_signature of this DvirBase.  # noqa: E501
        :rtype: DvirBaseNextDriverSignature
        """
        return self._next_driver_signature

    @next_driver_signature.setter
    def next_driver_signature(self, next_driver_signature):
        """Sets the next_driver_signature of this DvirBase.


        :param next_driver_signature: The next_driver_signature of this DvirBase.  # noqa: E501
        :type: DvirBaseNextDriverSignature
        """

        self._next_driver_signature = next_driver_signature

    @property
    def odometer_miles(self):
        """Gets the odometer_miles of this DvirBase.  # noqa: E501

        The odometer reading in miles for the vehicle when the DVIR was done.  # noqa: E501

        :return: The odometer_miles of this DvirBase.  # noqa: E501
        :rtype: int
        """
        return self._odometer_miles

    @odometer_miles.setter
    def odometer_miles(self, odometer_miles):
        """Sets the odometer_miles of this DvirBase.

        The odometer reading in miles for the vehicle when the DVIR was done.  # noqa: E501

        :param odometer_miles: The odometer_miles of this DvirBase.  # noqa: E501
        :type: int
        """

        self._odometer_miles = odometer_miles

    @property
    def time_ms(self):
        """Gets the time_ms of this DvirBase.  # noqa: E501

        Timestamp of this DVIR in UNIX milliseconds.  # noqa: E501

        :return: The time_ms of this DvirBase.  # noqa: E501
        :rtype: int
        """
        return self._time_ms

    @time_ms.setter
    def time_ms(self, time_ms):
        """Sets the time_ms of this DvirBase.

        Timestamp of this DVIR in UNIX milliseconds.  # noqa: E501

        :param time_ms: The time_ms of this DvirBase.  # noqa: E501
        :type: int
        """

        self._time_ms = time_ms

    @property
    def trailer_defects(self):
        """Gets the trailer_defects of this DvirBase.  # noqa: E501

        Defects registered for the trailer which was part of the DVIR.  # noqa: E501

        :return: The trailer_defects of this DvirBase.  # noqa: E501
        :rtype: list[DvirBaseTrailerDefects]
        """
        return self._trailer_defects

    @trailer_defects.setter
    def trailer_defects(self, trailer_defects):
        """Sets the trailer_defects of this DvirBase.

        Defects registered for the trailer which was part of the DVIR.  # noqa: E501

        :param trailer_defects: The trailer_defects of this DvirBase.  # noqa: E501
        :type: list[DvirBaseTrailerDefects]
        """

        self._trailer_defects = trailer_defects

    @property
    def trailer_id(self):
        """Gets the trailer_id of this DvirBase.  # noqa: E501

        The id of the trailer which was part of the DVIR.  # noqa: E501

        :return: The trailer_id of this DvirBase.  # noqa: E501
        :rtype: int
        """
        return self._trailer_id

    @trailer_id.setter
    def trailer_id(self, trailer_id):
        """Sets the trailer_id of this DvirBase.

        The id of the trailer which was part of the DVIR.  # noqa: E501

        :param trailer_id: The trailer_id of this DvirBase.  # noqa: E501
        :type: int
        """

        self._trailer_id = trailer_id

    @property
    def trailer_name(self):
        """Gets the trailer_name of this DvirBase.  # noqa: E501

        The name of the trailer which was part of the DVIR.  # noqa: E501

        :return: The trailer_name of this DvirBase.  # noqa: E501
        :rtype: str
        """
        return self._trailer_name

    @trailer_name.setter
    def trailer_name(self, trailer_name):
        """Sets the trailer_name of this DvirBase.

        The name of the trailer which was part of the DVIR.  # noqa: E501

        :param trailer_name: The trailer_name of this DvirBase.  # noqa: E501
        :type: str
        """

        self._trailer_name = trailer_name

    @property
    def vehicle(self):
        """Gets the vehicle of this DvirBase.  # noqa: E501


        :return: The vehicle of this DvirBase.  # noqa: E501
        :rtype: DvirBaseVehicle
        """
        return self._vehicle

    @vehicle.setter
    def vehicle(self, vehicle):
        """Sets the vehicle of this DvirBase.


        :param vehicle: The vehicle of this DvirBase.  # noqa: E501
        :type: DvirBaseVehicle
        """

        self._vehicle = vehicle

    @property
    def vehicle_condition(self):
        """Gets the vehicle_condition of this DvirBase.  # noqa: E501

        The condition of vechile on which DVIR was done.  # noqa: E501

        :return: The vehicle_condition of this DvirBase.  # noqa: E501
        :rtype: str
        """
        return self._vehicle_condition

    @vehicle_condition.setter
    def vehicle_condition(self, vehicle_condition):
        """Sets the vehicle_condition of this DvirBase.

        The condition of vechile on which DVIR was done.  # noqa: E501

        :param vehicle_condition: The vehicle_condition of this DvirBase.  # noqa: E501
        :type: str
        """

        self._vehicle_condition = vehicle_condition

    @property
    def vehicle_defects(self):
        """Gets the vehicle_defects of this DvirBase.  # noqa: E501

        Defects registered for the vehicle which was part of the DVIR.  # noqa: E501

        :return: The vehicle_defects of this DvirBase.  # noqa: E501
        :rtype: list[DvirBaseTrailerDefects]
        """
        return self._vehicle_defects

    @vehicle_defects.setter
    def vehicle_defects(self, vehicle_defects):
        """Sets the vehicle_defects of this DvirBase.

        Defects registered for the vehicle which was part of the DVIR.  # noqa: E501

        :param vehicle_defects: The vehicle_defects of this DvirBase.  # noqa: E501
        :type: list[DvirBaseTrailerDefects]
        """

        self._vehicle_defects = vehicle_defects

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
        if issubclass(DvirBase, dict):
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
        if not isinstance(other, DvirBase):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
