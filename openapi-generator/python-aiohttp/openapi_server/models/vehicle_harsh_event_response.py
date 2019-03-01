# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.vehicle_harsh_event_response_location import VehicleHarshEventResponseLocation
from openapi_server import util


class VehicleHarshEventResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, download_forward_video_url: str=None, download_inward_video_url: str=None, download_tracked_inward_video_url: str=None, harsh_event_type: str=None, incident_report_url: str=None, is_distracted: bool=None, location: VehicleHarshEventResponseLocation=None):
        """VehicleHarshEventResponse - a model defined in OpenAPI

        :param download_forward_video_url: The download_forward_video_url of this VehicleHarshEventResponse.
        :param download_inward_video_url: The download_inward_video_url of this VehicleHarshEventResponse.
        :param download_tracked_inward_video_url: The download_tracked_inward_video_url of this VehicleHarshEventResponse.
        :param harsh_event_type: The harsh_event_type of this VehicleHarshEventResponse.
        :param incident_report_url: The incident_report_url of this VehicleHarshEventResponse.
        :param is_distracted: The is_distracted of this VehicleHarshEventResponse.
        :param location: The location of this VehicleHarshEventResponse.
        """
        self.openapi_types = {
            'download_forward_video_url': str,
            'download_inward_video_url': str,
            'download_tracked_inward_video_url': str,
            'harsh_event_type': str,
            'incident_report_url': str,
            'is_distracted': bool,
            'location': VehicleHarshEventResponseLocation
        }

        self.attribute_map = {
            'download_forward_video_url': 'downloadForwardVideoUrl',
            'download_inward_video_url': 'downloadInwardVideoUrl',
            'download_tracked_inward_video_url': 'downloadTrackedInwardVideoUrl',
            'harsh_event_type': 'harshEventType',
            'incident_report_url': 'incidentReportUrl',
            'is_distracted': 'isDistracted',
            'location': 'location'
        }

        self._download_forward_video_url = download_forward_video_url
        self._download_inward_video_url = download_inward_video_url
        self._download_tracked_inward_video_url = download_tracked_inward_video_url
        self._harsh_event_type = harsh_event_type
        self._incident_report_url = incident_report_url
        self._is_distracted = is_distracted
        self._location = location

    @classmethod
    def from_dict(cls, dikt: dict) -> 'VehicleHarshEventResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The VehicleHarshEventResponse of this VehicleHarshEventResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def download_forward_video_url(self):
        """Gets the download_forward_video_url of this VehicleHarshEventResponse.

        URL for downloading the forward facing video

        :return: The download_forward_video_url of this VehicleHarshEventResponse.
        :rtype: str
        """
        return self._download_forward_video_url

    @download_forward_video_url.setter
    def download_forward_video_url(self, download_forward_video_url):
        """Sets the download_forward_video_url of this VehicleHarshEventResponse.

        URL for downloading the forward facing video

        :param download_forward_video_url: The download_forward_video_url of this VehicleHarshEventResponse.
        :type download_forward_video_url: str
        """

        self._download_forward_video_url = download_forward_video_url

    @property
    def download_inward_video_url(self):
        """Gets the download_inward_video_url of this VehicleHarshEventResponse.

        URL for downloading the inward facing video

        :return: The download_inward_video_url of this VehicleHarshEventResponse.
        :rtype: str
        """
        return self._download_inward_video_url

    @download_inward_video_url.setter
    def download_inward_video_url(self, download_inward_video_url):
        """Sets the download_inward_video_url of this VehicleHarshEventResponse.

        URL for downloading the inward facing video

        :param download_inward_video_url: The download_inward_video_url of this VehicleHarshEventResponse.
        :type download_inward_video_url: str
        """

        self._download_inward_video_url = download_inward_video_url

    @property
    def download_tracked_inward_video_url(self):
        """Gets the download_tracked_inward_video_url of this VehicleHarshEventResponse.

        URL for downloading the tracked inward facing video

        :return: The download_tracked_inward_video_url of this VehicleHarshEventResponse.
        :rtype: str
        """
        return self._download_tracked_inward_video_url

    @download_tracked_inward_video_url.setter
    def download_tracked_inward_video_url(self, download_tracked_inward_video_url):
        """Sets the download_tracked_inward_video_url of this VehicleHarshEventResponse.

        URL for downloading the tracked inward facing video

        :param download_tracked_inward_video_url: The download_tracked_inward_video_url of this VehicleHarshEventResponse.
        :type download_tracked_inward_video_url: str
        """

        self._download_tracked_inward_video_url = download_tracked_inward_video_url

    @property
    def harsh_event_type(self):
        """Gets the harsh_event_type of this VehicleHarshEventResponse.

        Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]

        :return: The harsh_event_type of this VehicleHarshEventResponse.
        :rtype: str
        """
        return self._harsh_event_type

    @harsh_event_type.setter
    def harsh_event_type(self, harsh_event_type):
        """Sets the harsh_event_type of this VehicleHarshEventResponse.

        Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]

        :param harsh_event_type: The harsh_event_type of this VehicleHarshEventResponse.
        :type harsh_event_type: str
        """
        if harsh_event_type is None:
            raise ValueError("Invalid value for `harsh_event_type`, must not be `None`")

        self._harsh_event_type = harsh_event_type

    @property
    def incident_report_url(self):
        """Gets the incident_report_url of this VehicleHarshEventResponse.

        URL of the associated incident report page

        :return: The incident_report_url of this VehicleHarshEventResponse.
        :rtype: str
        """
        return self._incident_report_url

    @incident_report_url.setter
    def incident_report_url(self, incident_report_url):
        """Sets the incident_report_url of this VehicleHarshEventResponse.

        URL of the associated incident report page

        :param incident_report_url: The incident_report_url of this VehicleHarshEventResponse.
        :type incident_report_url: str
        """
        if incident_report_url is None:
            raise ValueError("Invalid value for `incident_report_url`, must not be `None`")

        self._incident_report_url = incident_report_url

    @property
    def is_distracted(self):
        """Gets the is_distracted of this VehicleHarshEventResponse.

        Whether the driver was deemed distracted during this harsh event

        :return: The is_distracted of this VehicleHarshEventResponse.
        :rtype: bool
        """
        return self._is_distracted

    @is_distracted.setter
    def is_distracted(self, is_distracted):
        """Sets the is_distracted of this VehicleHarshEventResponse.

        Whether the driver was deemed distracted during this harsh event

        :param is_distracted: The is_distracted of this VehicleHarshEventResponse.
        :type is_distracted: bool
        """

        self._is_distracted = is_distracted

    @property
    def location(self):
        """Gets the location of this VehicleHarshEventResponse.


        :return: The location of this VehicleHarshEventResponse.
        :rtype: VehicleHarshEventResponseLocation
        """
        return self._location

    @location.setter
    def location(self, location):
        """Sets the location of this VehicleHarshEventResponse.


        :param location: The location of this VehicleHarshEventResponse.
        :type location: VehicleHarshEventResponseLocation
        """

        self._location = location
