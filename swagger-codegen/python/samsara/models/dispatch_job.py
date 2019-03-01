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

from samsara.models.dispatch_job_create import DispatchJobCreate  # noqa: F401,E501
from samsara.models.job_status import JobStatus  # noqa: F401,E501


class DispatchJob(object):
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
        'destination_address': 'str',
        'destination_address_id': 'int',
        'destination_lat': 'float',
        'destination_lng': 'float',
        'destination_name': 'str',
        'notes': 'str',
        'scheduled_arrival_time_ms': 'int',
        'scheduled_departure_time_ms': 'int',
        'arrived_at_ms': 'int',
        'completed_at_ms': 'int',
        'dispatch_route_id': 'int',
        'driver_id': 'int',
        'en_route_at_ms': 'int',
        'estimated_arrival_ms': 'int',
        'fleet_viewer_url': 'str',
        'group_id': 'int',
        'id': 'int',
        'job_state': 'JobStatus',
        'skipped_at_ms': 'int',
        'vehicle_id': 'int'
    }

    attribute_map = {
        'destination_address': 'destination_address',
        'destination_address_id': 'destination_address_id',
        'destination_lat': 'destination_lat',
        'destination_lng': 'destination_lng',
        'destination_name': 'destination_name',
        'notes': 'notes',
        'scheduled_arrival_time_ms': 'scheduled_arrival_time_ms',
        'scheduled_departure_time_ms': 'scheduled_departure_time_ms',
        'arrived_at_ms': 'arrived_at_ms',
        'completed_at_ms': 'completed_at_ms',
        'dispatch_route_id': 'dispatch_route_id',
        'driver_id': 'driver_id',
        'en_route_at_ms': 'en_route_at_ms',
        'estimated_arrival_ms': 'estimated_arrival_ms',
        'fleet_viewer_url': 'fleet_viewer_url',
        'group_id': 'group_id',
        'id': 'id',
        'job_state': 'job_state',
        'skipped_at_ms': 'skipped_at_ms',
        'vehicle_id': 'vehicle_id'
    }

    def __init__(self, destination_address=None, destination_address_id=None, destination_lat=None, destination_lng=None, destination_name=None, notes=None, scheduled_arrival_time_ms=None, scheduled_departure_time_ms=None, arrived_at_ms=None, completed_at_ms=None, dispatch_route_id=None, driver_id=None, en_route_at_ms=None, estimated_arrival_ms=None, fleet_viewer_url=None, group_id=None, id=None, job_state=None, skipped_at_ms=None, vehicle_id=None):  # noqa: E501
        """DispatchJob - a model defined in Swagger"""  # noqa: E501

        self._destination_address = None
        self._destination_address_id = None
        self._destination_lat = None
        self._destination_lng = None
        self._destination_name = None
        self._notes = None
        self._scheduled_arrival_time_ms = None
        self._scheduled_departure_time_ms = None
        self._arrived_at_ms = None
        self._completed_at_ms = None
        self._dispatch_route_id = None
        self._driver_id = None
        self._en_route_at_ms = None
        self._estimated_arrival_ms = None
        self._fleet_viewer_url = None
        self._group_id = None
        self._id = None
        self._job_state = None
        self._skipped_at_ms = None
        self._vehicle_id = None
        self.discriminator = None

        if destination_address is not None:
            self.destination_address = destination_address
        if destination_address_id is not None:
            self.destination_address_id = destination_address_id
        if destination_lat is not None:
            self.destination_lat = destination_lat
        if destination_lng is not None:
            self.destination_lng = destination_lng
        if destination_name is not None:
            self.destination_name = destination_name
        if notes is not None:
            self.notes = notes
        self.scheduled_arrival_time_ms = scheduled_arrival_time_ms
        if scheduled_departure_time_ms is not None:
            self.scheduled_departure_time_ms = scheduled_departure_time_ms
        if arrived_at_ms is not None:
            self.arrived_at_ms = arrived_at_ms
        if completed_at_ms is not None:
            self.completed_at_ms = completed_at_ms
        self.dispatch_route_id = dispatch_route_id
        if driver_id is not None:
            self.driver_id = driver_id
        if en_route_at_ms is not None:
            self.en_route_at_ms = en_route_at_ms
        if estimated_arrival_ms is not None:
            self.estimated_arrival_ms = estimated_arrival_ms
        if fleet_viewer_url is not None:
            self.fleet_viewer_url = fleet_viewer_url
        self.group_id = group_id
        self.id = id
        self.job_state = job_state
        if skipped_at_ms is not None:
            self.skipped_at_ms = skipped_at_ms
        if vehicle_id is not None:
            self.vehicle_id = vehicle_id

    @property
    def destination_address(self):
        """Gets the destination_address of this DispatchJob.  # noqa: E501

        The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.  # noqa: E501

        :return: The destination_address of this DispatchJob.  # noqa: E501
        :rtype: str
        """
        return self._destination_address

    @destination_address.setter
    def destination_address(self, destination_address):
        """Sets the destination_address of this DispatchJob.

        The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.  # noqa: E501

        :param destination_address: The destination_address of this DispatchJob.  # noqa: E501
        :type: str
        """

        self._destination_address = destination_address

    @property
    def destination_address_id(self):
        """Gets the destination_address_id of this DispatchJob.  # noqa: E501

        ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.  # noqa: E501

        :return: The destination_address_id of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._destination_address_id

    @destination_address_id.setter
    def destination_address_id(self, destination_address_id):
        """Sets the destination_address_id of this DispatchJob.

        ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.  # noqa: E501

        :param destination_address_id: The destination_address_id of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._destination_address_id = destination_address_id

    @property
    def destination_lat(self):
        """Gets the destination_lat of this DispatchJob.  # noqa: E501

        Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.  # noqa: E501

        :return: The destination_lat of this DispatchJob.  # noqa: E501
        :rtype: float
        """
        return self._destination_lat

    @destination_lat.setter
    def destination_lat(self, destination_lat):
        """Sets the destination_lat of this DispatchJob.

        Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.  # noqa: E501

        :param destination_lat: The destination_lat of this DispatchJob.  # noqa: E501
        :type: float
        """

        self._destination_lat = destination_lat

    @property
    def destination_lng(self):
        """Gets the destination_lng of this DispatchJob.  # noqa: E501

        Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.  # noqa: E501

        :return: The destination_lng of this DispatchJob.  # noqa: E501
        :rtype: float
        """
        return self._destination_lng

    @destination_lng.setter
    def destination_lng(self, destination_lng):
        """Sets the destination_lng of this DispatchJob.

        Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.  # noqa: E501

        :param destination_lng: The destination_lng of this DispatchJob.  # noqa: E501
        :type: float
        """

        self._destination_lng = destination_lng

    @property
    def destination_name(self):
        """Gets the destination_name of this DispatchJob.  # noqa: E501

        The name of the job destination. If provided, it will take precedence over the name of the address book entry.  # noqa: E501

        :return: The destination_name of this DispatchJob.  # noqa: E501
        :rtype: str
        """
        return self._destination_name

    @destination_name.setter
    def destination_name(self, destination_name):
        """Sets the destination_name of this DispatchJob.

        The name of the job destination. If provided, it will take precedence over the name of the address book entry.  # noqa: E501

        :param destination_name: The destination_name of this DispatchJob.  # noqa: E501
        :type: str
        """

        self._destination_name = destination_name

    @property
    def notes(self):
        """Gets the notes of this DispatchJob.  # noqa: E501

        Notes regarding the details of this job.  # noqa: E501

        :return: The notes of this DispatchJob.  # noqa: E501
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes):
        """Sets the notes of this DispatchJob.

        Notes regarding the details of this job.  # noqa: E501

        :param notes: The notes of this DispatchJob.  # noqa: E501
        :type: str
        """

        self._notes = notes

    @property
    def scheduled_arrival_time_ms(self):
        """Gets the scheduled_arrival_time_ms of this DispatchJob.  # noqa: E501

        The time at which the assigned driver is scheduled to arrive at the job destination.  # noqa: E501

        :return: The scheduled_arrival_time_ms of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._scheduled_arrival_time_ms

    @scheduled_arrival_time_ms.setter
    def scheduled_arrival_time_ms(self, scheduled_arrival_time_ms):
        """Sets the scheduled_arrival_time_ms of this DispatchJob.

        The time at which the assigned driver is scheduled to arrive at the job destination.  # noqa: E501

        :param scheduled_arrival_time_ms: The scheduled_arrival_time_ms of this DispatchJob.  # noqa: E501
        :type: int
        """
        if scheduled_arrival_time_ms is None:
            raise ValueError("Invalid value for `scheduled_arrival_time_ms`, must not be `None`")  # noqa: E501

        self._scheduled_arrival_time_ms = scheduled_arrival_time_ms

    @property
    def scheduled_departure_time_ms(self):
        """Gets the scheduled_departure_time_ms of this DispatchJob.  # noqa: E501

        The time at which the assigned driver is scheduled to depart from the job destination.  # noqa: E501

        :return: The scheduled_departure_time_ms of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._scheduled_departure_time_ms

    @scheduled_departure_time_ms.setter
    def scheduled_departure_time_ms(self, scheduled_departure_time_ms):
        """Sets the scheduled_departure_time_ms of this DispatchJob.

        The time at which the assigned driver is scheduled to depart from the job destination.  # noqa: E501

        :param scheduled_departure_time_ms: The scheduled_departure_time_ms of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._scheduled_departure_time_ms = scheduled_departure_time_ms

    @property
    def arrived_at_ms(self):
        """Gets the arrived_at_ms of this DispatchJob.  # noqa: E501

        The time at which the driver arrived at the job destination.  # noqa: E501

        :return: The arrived_at_ms of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._arrived_at_ms

    @arrived_at_ms.setter
    def arrived_at_ms(self, arrived_at_ms):
        """Sets the arrived_at_ms of this DispatchJob.

        The time at which the driver arrived at the job destination.  # noqa: E501

        :param arrived_at_ms: The arrived_at_ms of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._arrived_at_ms = arrived_at_ms

    @property
    def completed_at_ms(self):
        """Gets the completed_at_ms of this DispatchJob.  # noqa: E501

        The time at which the job was marked complete (e.g. started driving to the next destination).  # noqa: E501

        :return: The completed_at_ms of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._completed_at_ms

    @completed_at_ms.setter
    def completed_at_ms(self, completed_at_ms):
        """Sets the completed_at_ms of this DispatchJob.

        The time at which the job was marked complete (e.g. started driving to the next destination).  # noqa: E501

        :param completed_at_ms: The completed_at_ms of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._completed_at_ms = completed_at_ms

    @property
    def dispatch_route_id(self):
        """Gets the dispatch_route_id of this DispatchJob.  # noqa: E501

        ID of the route that this job belongs to.  # noqa: E501

        :return: The dispatch_route_id of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._dispatch_route_id

    @dispatch_route_id.setter
    def dispatch_route_id(self, dispatch_route_id):
        """Sets the dispatch_route_id of this DispatchJob.

        ID of the route that this job belongs to.  # noqa: E501

        :param dispatch_route_id: The dispatch_route_id of this DispatchJob.  # noqa: E501
        :type: int
        """
        if dispatch_route_id is None:
            raise ValueError("Invalid value for `dispatch_route_id`, must not be `None`")  # noqa: E501

        self._dispatch_route_id = dispatch_route_id

    @property
    def driver_id(self):
        """Gets the driver_id of this DispatchJob.  # noqa: E501

        ID of the driver assigned to the dispatch job.  # noqa: E501

        :return: The driver_id of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._driver_id

    @driver_id.setter
    def driver_id(self, driver_id):
        """Sets the driver_id of this DispatchJob.

        ID of the driver assigned to the dispatch job.  # noqa: E501

        :param driver_id: The driver_id of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._driver_id = driver_id

    @property
    def en_route_at_ms(self):
        """Gets the en_route_at_ms of this DispatchJob.  # noqa: E501

        The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).  # noqa: E501

        :return: The en_route_at_ms of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._en_route_at_ms

    @en_route_at_ms.setter
    def en_route_at_ms(self, en_route_at_ms):
        """Sets the en_route_at_ms of this DispatchJob.

        The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).  # noqa: E501

        :param en_route_at_ms: The en_route_at_ms of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._en_route_at_ms = en_route_at_ms

    @property
    def estimated_arrival_ms(self):
        """Gets the estimated_arrival_ms of this DispatchJob.  # noqa: E501

        The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.  # noqa: E501

        :return: The estimated_arrival_ms of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._estimated_arrival_ms

    @estimated_arrival_ms.setter
    def estimated_arrival_ms(self, estimated_arrival_ms):
        """Sets the estimated_arrival_ms of this DispatchJob.

        The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.  # noqa: E501

        :param estimated_arrival_ms: The estimated_arrival_ms of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._estimated_arrival_ms = estimated_arrival_ms

    @property
    def fleet_viewer_url(self):
        """Gets the fleet_viewer_url of this DispatchJob.  # noqa: E501

        Fleet viewer url of the dispatch job.  # noqa: E501

        :return: The fleet_viewer_url of this DispatchJob.  # noqa: E501
        :rtype: str
        """
        return self._fleet_viewer_url

    @fleet_viewer_url.setter
    def fleet_viewer_url(self, fleet_viewer_url):
        """Sets the fleet_viewer_url of this DispatchJob.

        Fleet viewer url of the dispatch job.  # noqa: E501

        :param fleet_viewer_url: The fleet_viewer_url of this DispatchJob.  # noqa: E501
        :type: str
        """

        self._fleet_viewer_url = fleet_viewer_url

    @property
    def group_id(self):
        """Gets the group_id of this DispatchJob.  # noqa: E501


        :return: The group_id of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this DispatchJob.


        :param group_id: The group_id of this DispatchJob.  # noqa: E501
        :type: int
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def id(self):
        """Gets the id of this DispatchJob.  # noqa: E501

        ID of the Samsara dispatch job.  # noqa: E501

        :return: The id of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DispatchJob.

        ID of the Samsara dispatch job.  # noqa: E501

        :param id: The id of this DispatchJob.  # noqa: E501
        :type: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def job_state(self):
        """Gets the job_state of this DispatchJob.  # noqa: E501


        :return: The job_state of this DispatchJob.  # noqa: E501
        :rtype: JobStatus
        """
        return self._job_state

    @job_state.setter
    def job_state(self, job_state):
        """Sets the job_state of this DispatchJob.


        :param job_state: The job_state of this DispatchJob.  # noqa: E501
        :type: JobStatus
        """
        if job_state is None:
            raise ValueError("Invalid value for `job_state`, must not be `None`")  # noqa: E501

        self._job_state = job_state

    @property
    def skipped_at_ms(self):
        """Gets the skipped_at_ms of this DispatchJob.  # noqa: E501

        The time at which the job was marked skipped.  # noqa: E501

        :return: The skipped_at_ms of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._skipped_at_ms

    @skipped_at_ms.setter
    def skipped_at_ms(self, skipped_at_ms):
        """Sets the skipped_at_ms of this DispatchJob.

        The time at which the job was marked skipped.  # noqa: E501

        :param skipped_at_ms: The skipped_at_ms of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._skipped_at_ms = skipped_at_ms

    @property
    def vehicle_id(self):
        """Gets the vehicle_id of this DispatchJob.  # noqa: E501

        ID of the vehicle used for the dispatch job.  # noqa: E501

        :return: The vehicle_id of this DispatchJob.  # noqa: E501
        :rtype: int
        """
        return self._vehicle_id

    @vehicle_id.setter
    def vehicle_id(self, vehicle_id):
        """Sets the vehicle_id of this DispatchJob.

        ID of the vehicle used for the dispatch job.  # noqa: E501

        :param vehicle_id: The vehicle_id of this DispatchJob.  # noqa: E501
        :type: int
        """

        self._vehicle_id = vehicle_id

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
        if issubclass(DispatchJob, dict):
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
        if not isinstance(other, DispatchJob):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
