# -*- coding: utf-8 -*-

"""
    samsaraapi

    This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
"""

from samsaraapi.api_helper import APIHelper
from samsaraapi.configuration import Configuration
from samsaraapi.controllers.base_controller import BaseController
from samsaraapi.http.auth.custom_query_auth import CustomQueryAuth
from samsaraapi.models.tag import Tag
from samsaraapi.models.get_all_tags_response import GetAllTagsResponse
from samsaraapi.exceptions.api_exception import APIException

class TagsController(BaseController):

    """A Controller to access Endpoints in the samsaraapi API."""


    def delete_tag_by_id(self,
                         access_token,
                         tag_id):
        """Does a DELETE request to /tags/{tag_id}.

        Permanently deletes a tag.

        Args:
            access_token (string): Samsara API access token.
            tag_id (long|int): ID of the tag.

        Returns:
            void: Response from the API. Successfully deleted the tag. No
                response body is returned.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tags/{tag_id}'
        _url_path = APIHelper.append_url_with_template_parameters(_url_path, { 
            'tag_id': tag_id
        })
        _query_builder = Configuration.base_uri
        _query_builder += _url_path
        _query_parameters = {
            'access_token': access_token
        }
        _query_builder = APIHelper.append_url_with_query_parameters(_query_builder,
            _query_parameters, Configuration.array_serialization)
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare and execute request
        _request = self.http_client.delete(_query_url)
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

    def get_tag_by_id(self,
                      access_token,
                      tag_id):
        """Does a GET request to /tags/{tag_id}.

        Fetch a tag by id.

        Args:
            access_token (string): Samsara API access token.
            tag_id (long|int): ID of the tag.

        Returns:
            Tag: Response from the API. The tag corresponding to tag_id.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tags/{tag_id}'
        _url_path = APIHelper.append_url_with_template_parameters(_url_path, { 
            'tag_id': tag_id
        })
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
        return APIHelper.json_deserialize(_context.response.raw_body, Tag.from_dictionary)

    def modify_tag_by_id(self,
                         access_token,
                         tag_id,
                         tag_modify_params):
        """Does a PATCH request to /tags/{tag_id}.

        Add or delete specific members from a tag, or modify the name of a
        tag.

        Args:
            access_token (string): Samsara API access token.
            tag_id (long|int): ID of the tag.
            tag_modify_params (TagModify): TODO: type description here.
                Example: 

        Returns:
            Tag: Response from the API. The updated tag data.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tags/{tag_id}'
        _url_path = APIHelper.append_url_with_template_parameters(_url_path, { 
            'tag_id': tag_id
        })
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
        _request = self.http_client.patch(_query_url, headers=_headers, parameters=APIHelper.json_serialize(tag_modify_params))
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

        # Return appropriate type
        return APIHelper.json_deserialize(_context.response.raw_body, Tag.from_dictionary)

    def create_tag(self,
                   access_token,
                   tag_create_params):
        """Does a POST request to /tags.

        Create a new tag for the group.

        Args:
            access_token (string): Samsara API access token.
            tag_create_params (TagCreate): TODO: type description here.
                Example: 

        Returns:
            Tag: Response from the API. Newly created tag object, including
                the new tag ID.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tags'
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
        _request = self.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(tag_create_params))
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

        # Return appropriate type
        return APIHelper.json_deserialize(_context.response.raw_body, Tag.from_dictionary)

    def update_tag_by_id(self,
                         access_token,
                         tag_id,
                         update_tag_params):
        """Does a PUT request to /tags/{tag_id}.

        Update a tag with a new name and new members. This API call would
        replace all old members of a tag with new members specified in the
        request body. To modify only a few devices associated with a tag use
        the PATCH endpoint.

        Args:
            access_token (string): Samsara API access token.
            tag_id (long|int): ID of the tag.
            update_tag_params (TagUpdate): TODO: type description here.
                Example: 

        Returns:
            Tag: Response from the API. The updated tag data.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tags/{tag_id}'
        _url_path = APIHelper.append_url_with_template_parameters(_url_path, { 
            'tag_id': tag_id
        })
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
        _request = self.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(update_tag_params))
        CustomQueryAuth.apply(_request)
        _context = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _context.response.status_code == 0:
            raise APIException('Unexpected error.', _context)
        self.validate_response(_context)

        # Return appropriate type
        return APIHelper.json_deserialize(_context.response.raw_body, Tag.from_dictionary)

    def get_all_tags(self,
                     access_token,
                     group_id=None):
        """Does a GET request to /tags.

        Fetch all of the tags for a group.

        Args:
            access_token (string): Samsara API access token.
            group_id (long|int, optional): Optional group ID if the
                organization has multiple groups (uncommon).

        Returns:
            GetAllTagsResponse: Response from the API. List of tags.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/tags'
        _query_builder = Configuration.base_uri
        _query_builder += _url_path
        _query_parameters = {
            'access_token': access_token,
            'group_id': group_id
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
        return APIHelper.json_deserialize(_context.response.raw_body, GetAllTagsResponse.from_dictionary)
