# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

from samsaraapi.api_helper import APIHelper
from samsaraapi.configuration import Configuration
from samsaraapi.controllers.base_controller import BaseController
from samsaraapi.http.auth.custom_query_auth import CustomQueryAuth
from samsaraapi.models.data_input_history_response import DataInputHistoryResponse
from samsaraapi.models.get_all_data_inputs_response import GetAllDataInputsResponse
from samsaraapi.models.get_machines_response import GetMachinesResponse
from samsaraapi.models.machine_history_response import MachineHistoryResponse
from samsaraapi.exceptions.api_exception import APIException

class IndustrialController(BaseController):

    """A Controller to access Endpoints in the samsaraapi API."""


    def get_data_input(self,
                       access_token,
                       data_input_id,
                       start_ms=None,
                       end_ms=None):
        """Does a GET request to /industrial/data/{data_input_id}.

        Fetch datapoints from a given data input.

        Args:
            access_token (string): Samsara API access token.
            data_input_id (long|int): ID of the data input
            start_ms (long|int, optional): Timestamp in unix milliseconds
                representing the start of the period to fetch, inclusive. Used
                in combination with endMs. defaults to nowMs.
            end_ms (long|int, optional): Timestamp in unix milliseconds
                representing the end of the period to fetch, inclusive. Used
                in combination with startMs. Defaults to nowMs.

        Returns:
            DataInputHistoryResponse: Response from the API. Returns
                datapoints for the given data input

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/industrial/data/{data_input_id}'
        _url_path = APIHelper.append_url_with_template_parameters(_url_path, { 
            'data_input_id': data_input_id
        })
        _query_builder = Configuration.base_uri
        _query_builder += _url_path
        _query_parameters = {
            'access_token': access_token,
            'startMs': start_ms,
            'endMs': end_ms
        }
        _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
            _query_parameters, Configuration.array_serialization)
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json'
        }

        # Prepare and execute request
        _request = self.http_client.get(_query_url, headers=_headers)
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

        # Return appropriate type
        return APIHelper.json_deserialize(_context.response.raw_body, DataInputHistoryResponse.from_dictionary)

    def get_all_data_inputs(self,
                            access_token,
                            group_id=None,
                            start_ms=None,
                            end_ms=None):
        """Does a GET request to /industrial/data.

        Fetch all of the data inputs for a group.

        Args:
            access_token (string): Samsara API access token.
            group_id (long|int, optional): Optional group ID if the
                organization has multiple groups (uncommon).
            start_ms (long|int, optional): Timestamp in unix milliseconds
                representing the start of the period to fetch, inclusive. Used
                in combination with endMs. defaults to nowMs.
            end_ms (long|int, optional): Timestamp in unix milliseconds
                representing the end of the period to fetch, inclusive. Used
                in combination with startMs. Defaults to nowMs.

        Returns:
            GetAllDataInputsResponse: Response from the API. List of data
                inputs.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/industrial/data'
        _query_builder = Configuration.base_uri
        _query_builder += _url_path
        _query_parameters = {
            'access_token': access_token,
            'group_id': group_id,
            'startMs': start_ms,
            'endMs': end_ms
        }
        _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
            _query_parameters, Configuration.array_serialization)
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json'
        }

        # Prepare and execute request
        _request = self.http_client.get(_query_url, headers=_headers)
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

        # Return appropriate type
        return APIHelper.json_deserialize(_context.response.raw_body, GetAllDataInputsResponse.from_dictionary)

    def create_get_machines(self,
                            access_token,
                            group_param):
        """Does a POST request to /machines/list.

        Get machine objects. This method returns a list of the machine objects
        in the Samsara Cloud and information about them.

        Args:
            access_token (string): Samsara API access token.
            group_param (GroupParam): Group ID to query.

        Returns:
            GetMachinesResponse: Response from the API. List of machine
                objects.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/machines/list'
        _query_builder = Configuration.base_uri
        _query_builder += _url_path
        _query_parameters = {
            'access_token': access_token
        }
        _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
            _query_parameters, Configuration.array_serialization)
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'content-type': 'application/json; charset=utf-8'
        }

        # Prepare and execute request
        _request = self.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(group_param))
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

        # Return appropriate type
        return APIHelper.json_deserialize(_context.response.raw_body, GetMachinesResponse.from_dictionary)

    def create_get_machines_history(self,
                                    access_token,
                                    history_param):
        """Does a POST request to /machines/history.

        Get historical data for machine objects. This method returns a set of
        historical data for all machines in a group

        Args:
            access_token (string): Samsara API access token.
            history_param (HistoryParam): Group ID and time range to query for
                events

        Returns:
            MachineHistoryResponse: Response from the API. List of machine
                results objects, each containing a time and a datapoint.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/machines/history'
        _query_builder = Configuration.base_uri
        _query_builder += _url_path
        _query_parameters = {
            'access_token': access_token
        }
        _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
            _query_parameters, Configuration.array_serialization)
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'content-type': 'application/json; charset=utf-8'
        }

        # Prepare and execute request
        _request = self.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(history_param))
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

        # Return appropriate type
        return APIHelper.json_deserialize(_context.response.raw_body, MachineHistoryResponse.from_dictionary)
