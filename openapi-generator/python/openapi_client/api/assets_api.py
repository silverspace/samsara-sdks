# coding: utf-8

"""
    Samsara API

    # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).  # noqa: E501

    OpenAPI spec version: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from openapi_client.api_client import ApiClient


class AssetsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_all_asset_current_locations(self, access_token, **kwargs):  # noqa: E501
        """/fleet/assets/locations  # noqa: E501

        Fetch current locations of all assets for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_all_asset_current_locations(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :return: InlineResponse2001
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_all_asset_current_locations_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.get_all_asset_current_locations_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def get_all_asset_current_locations_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/fleet/assets/locations  # noqa: E501

        Fetch current locations of all assets for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_all_asset_current_locations_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :return: InlineResponse2001
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_all_asset_current_locations" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_all_asset_current_locations`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'group_id' in local_var_params:
            query_params.append(('group_id', local_var_params['group_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/assets/locations', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse2001',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_all_assets(self, access_token, **kwargs):  # noqa: E501
        """/fleet/assets  # noqa: E501

        Fetch all of the assets for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_all_assets(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_all_assets_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.get_all_assets_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def get_all_assets_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/fleet/assets  # noqa: E501

        Fetch all of the assets for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_all_assets_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_all_assets" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_all_assets`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'group_id' in local_var_params:
            query_params.append(('group_id', local_var_params['group_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/assets', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse200',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_asset_location(self, access_token, asset_id, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/assets/{assetId:[0-9]+}/locations  # noqa: E501

        Fetch the historical locations for the asset.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_asset_location(access_token, asset_id, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int asset_id: ID of the asset (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: list[object]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_asset_location_with_http_info(access_token, asset_id, start_ms, end_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_asset_location_with_http_info(access_token, asset_id, start_ms, end_ms, **kwargs)  # noqa: E501
            return data

    def get_asset_location_with_http_info(self, access_token, asset_id, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/assets/{assetId:[0-9]+}/locations  # noqa: E501

        Fetch the historical locations for the asset.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_asset_location_with_http_info(access_token, asset_id, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int asset_id: ID of the asset (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: list[object]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'asset_id', 'start_ms', 'end_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_asset_location" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_asset_location`")  # noqa: E501
        # verify the required parameter 'asset_id' is set
        if ('asset_id' not in local_var_params or
                local_var_params['asset_id'] is None):
            raise ValueError("Missing the required parameter `asset_id` when calling `get_asset_location`")  # noqa: E501
        # verify the required parameter 'start_ms' is set
        if ('start_ms' not in local_var_params or
                local_var_params['start_ms'] is None):
            raise ValueError("Missing the required parameter `start_ms` when calling `get_asset_location`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_asset_location`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'asset_id' in local_var_params:
            path_params['asset_id'] = local_var_params['asset_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'start_ms' in local_var_params:
            query_params.append(('startMs', local_var_params['start_ms']))  # noqa: E501
        if 'end_ms' in local_var_params:
            query_params.append(('endMs', local_var_params['end_ms']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/assets/{asset_id}/locations', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[object]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_asset_reefer(self, access_token, asset_id, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/assets/{assetId:[0-9]+}/reefer  # noqa: E501

        Fetch the reefer-specific stats of an asset.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_asset_reefer(access_token, asset_id, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int asset_id: ID of the asset (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: AssetReeferResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_asset_reefer_with_http_info(access_token, asset_id, start_ms, end_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_asset_reefer_with_http_info(access_token, asset_id, start_ms, end_ms, **kwargs)  # noqa: E501
            return data

    def get_asset_reefer_with_http_info(self, access_token, asset_id, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/assets/{assetId:[0-9]+}/reefer  # noqa: E501

        Fetch the reefer-specific stats of an asset.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_asset_reefer_with_http_info(access_token, asset_id, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int asset_id: ID of the asset (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: AssetReeferResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'asset_id', 'start_ms', 'end_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_asset_reefer" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_asset_reefer`")  # noqa: E501
        # verify the required parameter 'asset_id' is set
        if ('asset_id' not in local_var_params or
                local_var_params['asset_id'] is None):
            raise ValueError("Missing the required parameter `asset_id` when calling `get_asset_reefer`")  # noqa: E501
        # verify the required parameter 'start_ms' is set
        if ('start_ms' not in local_var_params or
                local_var_params['start_ms'] is None):
            raise ValueError("Missing the required parameter `start_ms` when calling `get_asset_reefer`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_asset_reefer`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'asset_id' in local_var_params:
            path_params['asset_id'] = local_var_params['asset_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'start_ms' in local_var_params:
            query_params.append(('startMs', local_var_params['start_ms']))  # noqa: E501
        if 'end_ms' in local_var_params:
            query_params.append(('endMs', local_var_params['end_ms']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/assets/{asset_id}/reefer', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='AssetReeferResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
