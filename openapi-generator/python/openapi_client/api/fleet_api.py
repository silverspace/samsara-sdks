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


class FleetApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def add_fleet_address(self, access_token, address_param, **kwargs):  # noqa: E501
        """/fleet/add_address  # noqa: E501

        This method adds an address book entry to the specified group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_fleet_address(access_token, address_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject2 address_param: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.add_fleet_address_with_http_info(access_token, address_param, **kwargs)  # noqa: E501
        else:
            (data) = self.add_fleet_address_with_http_info(access_token, address_param, **kwargs)  # noqa: E501
            return data

    def add_fleet_address_with_http_info(self, access_token, address_param, **kwargs):  # noqa: E501
        """/fleet/add_address  # noqa: E501

        This method adds an address book entry to the specified group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_fleet_address_with_http_info(access_token, address_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject2 address_param: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'address_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method add_fleet_address" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `add_fleet_address`")  # noqa: E501
        # verify the required parameter 'address_param' is set
        if ('address_param' not in local_var_params or
                local_var_params['address_param'] is None):
            raise ValueError("Missing the required parameter `address_param` when calling `add_fleet_address`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'address_param' in local_var_params:
            body_params = local_var_params['address_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/add_address', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def add_organization_addresses(self, access_token, addresses, **kwargs):  # noqa: E501
        """/addresses  # noqa: E501

        Add one or more addresses to the organization  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_organization_addresses(access_token, addresses, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject addresses: (required)
        :return: list[Address]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.add_organization_addresses_with_http_info(access_token, addresses, **kwargs)  # noqa: E501
        else:
            (data) = self.add_organization_addresses_with_http_info(access_token, addresses, **kwargs)  # noqa: E501
            return data

    def add_organization_addresses_with_http_info(self, access_token, addresses, **kwargs):  # noqa: E501
        """/addresses  # noqa: E501

        Add one or more addresses to the organization  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.add_organization_addresses_with_http_info(access_token, addresses, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject addresses: (required)
        :return: list[Address]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'addresses']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method add_organization_addresses" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `add_organization_addresses`")  # noqa: E501
        # verify the required parameter 'addresses' is set
        if ('addresses' not in local_var_params or
                local_var_params['addresses'] is None):
            raise ValueError("Missing the required parameter `addresses` when calling `add_organization_addresses`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'addresses' in local_var_params:
            body_params = local_var_params['addresses']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/addresses', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[Address]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def create_dispatch_route(self, access_token, create_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes  # noqa: E501

        Create a new dispatch route.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_dispatch_route(access_token, create_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param DispatchRouteCreate create_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_dispatch_route_with_http_info(access_token, create_dispatch_route_params, **kwargs)  # noqa: E501
        else:
            (data) = self.create_dispatch_route_with_http_info(access_token, create_dispatch_route_params, **kwargs)  # noqa: E501
            return data

    def create_dispatch_route_with_http_info(self, access_token, create_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes  # noqa: E501

        Create a new dispatch route.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_dispatch_route_with_http_info(access_token, create_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param DispatchRouteCreate create_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'create_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_dispatch_route" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_dispatch_route`")  # noqa: E501
        # verify the required parameter 'create_dispatch_route_params' is set
        if ('create_dispatch_route_params' not in local_var_params or
                local_var_params['create_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `create_dispatch_route_params` when calling `create_dispatch_route`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_dispatch_route_params' in local_var_params:
            body_params = local_var_params['create_dispatch_route_params']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/dispatch/routes', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DispatchRoute',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def create_driver(self, access_token, create_driver_param, **kwargs):  # noqa: E501
        """/fleet/drivers/create  # noqa: E501

        Create a new driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_driver(access_token, create_driver_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param DriverForCreate create_driver_param: Driver creation body (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_driver_with_http_info(access_token, create_driver_param, **kwargs)  # noqa: E501
        else:
            (data) = self.create_driver_with_http_info(access_token, create_driver_param, **kwargs)  # noqa: E501
            return data

    def create_driver_with_http_info(self, access_token, create_driver_param, **kwargs):  # noqa: E501
        """/fleet/drivers/create  # noqa: E501

        Create a new driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_driver_with_http_info(access_token, create_driver_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param DriverForCreate create_driver_param: Driver creation body (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'create_driver_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_driver" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_driver`")  # noqa: E501
        # verify the required parameter 'create_driver_param' is set
        if ('create_driver_param' not in local_var_params or
                local_var_params['create_driver_param'] is None):
            raise ValueError("Missing the required parameter `create_driver_param` when calling `create_driver`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_driver_param' in local_var_params:
            body_params = local_var_params['create_driver_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/drivers/create', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Driver',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def create_driver_dispatch_route(self, access_token, driver_id, create_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes  # noqa: E501

        Create a new dispatch route for the driver with driver_id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver with the associated routes. (required)
        :param DispatchRouteCreate create_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_driver_dispatch_route_with_http_info(access_token, driver_id, create_dispatch_route_params, **kwargs)  # noqa: E501
        else:
            (data) = self.create_driver_dispatch_route_with_http_info(access_token, driver_id, create_dispatch_route_params, **kwargs)  # noqa: E501
            return data

    def create_driver_dispatch_route_with_http_info(self, access_token, driver_id, create_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes  # noqa: E501

        Create a new dispatch route for the driver with driver_id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_driver_dispatch_route_with_http_info(access_token, driver_id, create_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver with the associated routes. (required)
        :param DispatchRouteCreate create_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id', 'create_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_driver_dispatch_route" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_driver_dispatch_route`")  # noqa: E501
        # verify the required parameter 'driver_id' is set
        if ('driver_id' not in local_var_params or
                local_var_params['driver_id'] is None):
            raise ValueError("Missing the required parameter `driver_id` when calling `create_driver_dispatch_route`")  # noqa: E501
        # verify the required parameter 'create_dispatch_route_params' is set
        if ('create_dispatch_route_params' not in local_var_params or
                local_var_params['create_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `create_dispatch_route_params` when calling `create_driver_dispatch_route`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id' in local_var_params:
            path_params['driver_id'] = local_var_params['driver_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_dispatch_route_params' in local_var_params:
            body_params = local_var_params['create_dispatch_route_params']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/drivers/{driver_id}/dispatch/routes', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DispatchRoute',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def create_driver_document(self, access_token, driver_id, create_document_params, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/documents  # noqa: E501

        Create a driver document for the given driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_driver_document(access_token, driver_id, create_document_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver for whom the document is created. (required)
        :param DocumentCreate create_document_params: To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
        :return: Document
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_driver_document_with_http_info(access_token, driver_id, create_document_params, **kwargs)  # noqa: E501
        else:
            (data) = self.create_driver_document_with_http_info(access_token, driver_id, create_document_params, **kwargs)  # noqa: E501
            return data

    def create_driver_document_with_http_info(self, access_token, driver_id, create_document_params, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/documents  # noqa: E501

        Create a driver document for the given driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_driver_document_with_http_info(access_token, driver_id, create_document_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver for whom the document is created. (required)
        :param DocumentCreate create_document_params: To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
        :return: Document
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id', 'create_document_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_driver_document" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_driver_document`")  # noqa: E501
        # verify the required parameter 'driver_id' is set
        if ('driver_id' not in local_var_params or
                local_var_params['driver_id'] is None):
            raise ValueError("Missing the required parameter `driver_id` when calling `create_driver_document`")  # noqa: E501
        # verify the required parameter 'create_document_params' is set
        if ('create_document_params' not in local_var_params or
                local_var_params['create_document_params'] is None):
            raise ValueError("Missing the required parameter `create_document_params` when calling `create_driver_document`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id' in local_var_params:
            path_params['driver_id'] = local_var_params['driver_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_document_params' in local_var_params:
            body_params = local_var_params['create_document_params']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/drivers/{driver_id}/documents', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Document',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def create_dvir(self, access_token, create_dvir_param, **kwargs):  # noqa: E501
        """/fleet/maintenance/dvirs  # noqa: E501

        Create a new dvir, marking a vehicle or trailer safe or unsafe.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_dvir(access_token, create_dvir_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject12 create_dvir_param: (required)
        :return: DvirBase
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_dvir_with_http_info(access_token, create_dvir_param, **kwargs)  # noqa: E501
        else:
            (data) = self.create_dvir_with_http_info(access_token, create_dvir_param, **kwargs)  # noqa: E501
            return data

    def create_dvir_with_http_info(self, access_token, create_dvir_param, **kwargs):  # noqa: E501
        """/fleet/maintenance/dvirs  # noqa: E501

        Create a new dvir, marking a vehicle or trailer safe or unsafe.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_dvir_with_http_info(access_token, create_dvir_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject12 create_dvir_param: (required)
        :return: DvirBase
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'create_dvir_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_dvir" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_dvir`")  # noqa: E501
        # verify the required parameter 'create_dvir_param' is set
        if ('create_dvir_param' not in local_var_params or
                local_var_params['create_dvir_param'] is None):
            raise ValueError("Missing the required parameter `create_dvir_param` when calling `create_dvir`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_dvir_param' in local_var_params:
            body_params = local_var_params['create_dvir_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/maintenance/dvirs', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DvirBase',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def create_vehicle_dispatch_route(self, access_token, vehicle_id, create_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes  # noqa: E501

        Create a new dispatch route for the vehicle with vehicle_id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int vehicle_id: ID of the vehicle with the associated routes. (required)
        :param DispatchRouteCreate create_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_vehicle_dispatch_route_with_http_info(access_token, vehicle_id, create_dispatch_route_params, **kwargs)  # noqa: E501
        else:
            (data) = self.create_vehicle_dispatch_route_with_http_info(access_token, vehicle_id, create_dispatch_route_params, **kwargs)  # noqa: E501
            return data

    def create_vehicle_dispatch_route_with_http_info(self, access_token, vehicle_id, create_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes  # noqa: E501

        Create a new dispatch route for the vehicle with vehicle_id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_vehicle_dispatch_route_with_http_info(access_token, vehicle_id, create_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int vehicle_id: ID of the vehicle with the associated routes. (required)
        :param DispatchRouteCreate create_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'vehicle_id', 'create_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_vehicle_dispatch_route" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_vehicle_dispatch_route`")  # noqa: E501
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in local_var_params or
                local_var_params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `create_vehicle_dispatch_route`")  # noqa: E501
        # verify the required parameter 'create_dispatch_route_params' is set
        if ('create_dispatch_route_params' not in local_var_params or
                local_var_params['create_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `create_dispatch_route_params` when calling `create_vehicle_dispatch_route`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in local_var_params:
            path_params['vehicle_id'] = local_var_params['vehicle_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_dispatch_route_params' in local_var_params:
            body_params = local_var_params['create_dispatch_route_params']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/vehicles/{vehicle_id}/dispatch/routes', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DispatchRoute',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def deactivate_driver(self, access_token, driver_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Deactivate a driver with the given id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.deactivate_driver(access_token, driver_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.deactivate_driver_with_http_info(access_token, driver_id_or_external_id, **kwargs)  # noqa: E501
        else:
            (data) = self.deactivate_driver_with_http_info(access_token, driver_id_or_external_id, **kwargs)  # noqa: E501
            return data

    def deactivate_driver_with_http_info(self, access_token, driver_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Deactivate a driver with the given id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.deactivate_driver_with_http_info(access_token, driver_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id_or_external_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method deactivate_driver" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `deactivate_driver`")  # noqa: E501
        # verify the required parameter 'driver_id_or_external_id' is set
        if ('driver_id_or_external_id' not in local_var_params or
                local_var_params['driver_id_or_external_id'] is None):
            raise ValueError("Missing the required parameter `driver_id_or_external_id` when calling `deactivate_driver`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id_or_external_id' in local_var_params:
            path_params['driver_id_or_external_id'] = local_var_params['driver_id_or_external_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/fleet/drivers/{driver_id_or_external_id}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_dispatch_route_by_id(self, access_token, route_id, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}/  # noqa: E501

        Delete a dispatch route and its associated jobs.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_dispatch_route_by_id(access_token, route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the dispatch route. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_dispatch_route_by_id_with_http_info(access_token, route_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_dispatch_route_by_id_with_http_info(access_token, route_id, **kwargs)  # noqa: E501
            return data

    def delete_dispatch_route_by_id_with_http_info(self, access_token, route_id, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}/  # noqa: E501

        Delete a dispatch route and its associated jobs.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_dispatch_route_by_id_with_http_info(access_token, route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the dispatch route. (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'route_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_dispatch_route_by_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `delete_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in local_var_params or
                local_var_params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `delete_dispatch_route_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in local_var_params:
            path_params['route_id'] = local_var_params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/fleet/dispatch/routes/{route_id}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_organization_address(self, access_token, address_id, **kwargs):  # noqa: E501
        """/addresses/{addressId}  # noqa: E501

        Delete an address.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_organization_address(access_token, address_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int address_id: ID of the address/geofence (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_organization_address_with_http_info(access_token, address_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_organization_address_with_http_info(access_token, address_id, **kwargs)  # noqa: E501
            return data

    def delete_organization_address_with_http_info(self, access_token, address_id, **kwargs):  # noqa: E501
        """/addresses/{addressId}  # noqa: E501

        Delete an address.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_organization_address_with_http_info(access_token, address_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int address_id: ID of the address/geofence (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'address_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_organization_address" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `delete_organization_address`")  # noqa: E501
        # verify the required parameter 'address_id' is set
        if ('address_id' not in local_var_params or
                local_var_params['address_id'] is None):
            raise ValueError("Missing the required parameter `address_id` when calling `delete_organization_address`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'address_id' in local_var_params:
            path_params['addressId'] = local_var_params['address_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/addresses/{addressId}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def fetch_all_dispatch_routes(self, access_token, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes  # noqa: E501

        Fetch all of the dispatch routes for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.fetch_all_dispatch_routes(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :param int end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
        :param int duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
        :return: list[DispatchRoute]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.fetch_all_dispatch_routes_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.fetch_all_dispatch_routes_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def fetch_all_dispatch_routes_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes  # noqa: E501

        Fetch all of the dispatch routes for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.fetch_all_dispatch_routes_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :param int end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
        :param int duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
        :return: list[DispatchRoute]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_id', 'end_time', 'duration']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method fetch_all_dispatch_routes" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `fetch_all_dispatch_routes`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'group_id' in local_var_params:
            query_params.append(('group_id', local_var_params['group_id']))  # noqa: E501
        if 'end_time' in local_var_params:
            query_params.append(('end_time', local_var_params['end_time']))  # noqa: E501
        if 'duration' in local_var_params:
            query_params.append(('duration', local_var_params['duration']))  # noqa: E501

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
            '/fleet/dispatch/routes', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[DispatchRoute]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def fetch_all_route_job_updates(self, access_token, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/job_updates  # noqa: E501

        Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.fetch_all_route_job_updates(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :param str sequence_id: Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
        :param str include: Optionally set include=route to include route object in response payload.
        :return: AllRouteJobUpdates
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.fetch_all_route_job_updates_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.fetch_all_route_job_updates_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def fetch_all_route_job_updates_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/job_updates  # noqa: E501

        Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.fetch_all_route_job_updates_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :param str sequence_id: Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
        :param str include: Optionally set include=route to include route object in response payload.
        :return: AllRouteJobUpdates
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_id', 'sequence_id', 'include']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method fetch_all_route_job_updates" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `fetch_all_route_job_updates`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'group_id' in local_var_params:
            query_params.append(('group_id', local_var_params['group_id']))  # noqa: E501
        if 'sequence_id' in local_var_params:
            query_params.append(('sequence_id', local_var_params['sequence_id']))  # noqa: E501
        if 'include' in local_var_params:
            query_params.append(('include', local_var_params['include']))  # noqa: E501

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
            '/fleet/dispatch/routes/job_updates', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='AllRouteJobUpdates',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

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

    def get_all_deactivated_drivers(self, access_token, **kwargs):  # noqa: E501
        """/fleet/drivers/inactive  # noqa: E501

        Fetch all deactivated drivers for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_all_deactivated_drivers(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :return: list[Driver]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_all_deactivated_drivers_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.get_all_deactivated_drivers_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def get_all_deactivated_drivers_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/fleet/drivers/inactive  # noqa: E501

        Fetch all deactivated drivers for the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_all_deactivated_drivers_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int group_id: Optional group ID if the organization has multiple groups (uncommon).
        :return: list[Driver]
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
                    " to method get_all_deactivated_drivers" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_all_deactivated_drivers`")  # noqa: E501

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
            '/fleet/drivers/inactive', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[Driver]',  # noqa: E501
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

    def get_deactivated_driver_by_id(self, access_token, driver_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Fetch deactivated driver by id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_deactivated_driver_by_id(access_token, driver_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_deactivated_driver_by_id_with_http_info(access_token, driver_id_or_external_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_deactivated_driver_by_id_with_http_info(access_token, driver_id_or_external_id, **kwargs)  # noqa: E501
            return data

    def get_deactivated_driver_by_id_with_http_info(self, access_token, driver_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Fetch deactivated driver by id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_deactivated_driver_by_id_with_http_info(access_token, driver_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id_or_external_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_deactivated_driver_by_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_deactivated_driver_by_id`")  # noqa: E501
        # verify the required parameter 'driver_id_or_external_id' is set
        if ('driver_id_or_external_id' not in local_var_params or
                local_var_params['driver_id_or_external_id'] is None):
            raise ValueError("Missing the required parameter `driver_id_or_external_id` when calling `get_deactivated_driver_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id_or_external_id' in local_var_params:
            path_params['driver_id_or_external_id'] = local_var_params['driver_id_or_external_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/fleet/drivers/inactive/{driver_id_or_external_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Driver',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_dispatch_route_by_id(self, access_token, route_id, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}  # noqa: E501

        Fetch a dispatch route by id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_route_by_id(access_token, route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the dispatch route. (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dispatch_route_by_id_with_http_info(access_token, route_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dispatch_route_by_id_with_http_info(access_token, route_id, **kwargs)  # noqa: E501
            return data

    def get_dispatch_route_by_id_with_http_info(self, access_token, route_id, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}  # noqa: E501

        Fetch a dispatch route by id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_route_by_id_with_http_info(access_token, route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the dispatch route. (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'route_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_route_by_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in local_var_params or
                local_var_params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `get_dispatch_route_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in local_var_params:
            path_params['route_id'] = local_var_params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/fleet/dispatch/routes/{route_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DispatchRoute',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_dispatch_route_history(self, access_token, route_id, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}/history  # noqa: E501

        Fetch the history of a dispatch route.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_route_history(access_token, route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the route with history. (required)
        :param int start_time: Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
        :param int end_time: Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
        :return: DispatchRouteHistory
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dispatch_route_history_with_http_info(access_token, route_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dispatch_route_history_with_http_info(access_token, route_id, **kwargs)  # noqa: E501
            return data

    def get_dispatch_route_history_with_http_info(self, access_token, route_id, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}/history  # noqa: E501

        Fetch the history of a dispatch route.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_route_history_with_http_info(access_token, route_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the route with history. (required)
        :param int start_time: Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
        :param int end_time: Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
        :return: DispatchRouteHistory
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'route_id', 'start_time', 'end_time']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_route_history" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_route_history`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in local_var_params or
                local_var_params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `get_dispatch_route_history`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in local_var_params:
            path_params['route_id'] = local_var_params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'start_time' in local_var_params:
            query_params.append(('start_time', local_var_params['start_time']))  # noqa: E501
        if 'end_time' in local_var_params:
            query_params.append(('end_time', local_var_params['end_time']))  # noqa: E501

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
            '/fleet/dispatch/routes/{route_id}/history', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DispatchRouteHistory',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_dispatch_routes_by_driver_id(self, access_token, driver_id, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes  # noqa: E501

        Fetch all of the dispatch routes for a given driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_routes_by_driver_id(access_token, driver_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver with the associated routes. (required)
        :param int end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
        :param int duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
        :return: list[DispatchRoute]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dispatch_routes_by_driver_id_with_http_info(access_token, driver_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dispatch_routes_by_driver_id_with_http_info(access_token, driver_id, **kwargs)  # noqa: E501
            return data

    def get_dispatch_routes_by_driver_id_with_http_info(self, access_token, driver_id, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes  # noqa: E501

        Fetch all of the dispatch routes for a given driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_routes_by_driver_id_with_http_info(access_token, driver_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver with the associated routes. (required)
        :param int end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
        :param int duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
        :return: list[DispatchRoute]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id', 'end_time', 'duration']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_routes_by_driver_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_routes_by_driver_id`")  # noqa: E501
        # verify the required parameter 'driver_id' is set
        if ('driver_id' not in local_var_params or
                local_var_params['driver_id'] is None):
            raise ValueError("Missing the required parameter `driver_id` when calling `get_dispatch_routes_by_driver_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id' in local_var_params:
            path_params['driver_id'] = local_var_params['driver_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'end_time' in local_var_params:
            query_params.append(('end_time', local_var_params['end_time']))  # noqa: E501
        if 'duration' in local_var_params:
            query_params.append(('duration', local_var_params['duration']))  # noqa: E501

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
            '/fleet/drivers/{driver_id}/dispatch/routes', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[DispatchRoute]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_dispatch_routes_by_vehicle_id(self, access_token, vehicle_id, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes  # noqa: E501

        Fetch all of the dispatch routes for a given vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int vehicle_id: ID of the vehicle with the associated routes. (required)
        :param int end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
        :param int duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
        :return: list[DispatchRoute]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dispatch_routes_by_vehicle_id_with_http_info(access_token, vehicle_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dispatch_routes_by_vehicle_id_with_http_info(access_token, vehicle_id, **kwargs)  # noqa: E501
            return data

    def get_dispatch_routes_by_vehicle_id_with_http_info(self, access_token, vehicle_id, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes  # noqa: E501

        Fetch all of the dispatch routes for a given vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dispatch_routes_by_vehicle_id_with_http_info(access_token, vehicle_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int vehicle_id: ID of the vehicle with the associated routes. (required)
        :param int end_time: Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
        :param int duration: Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
        :return: list[DispatchRoute]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'vehicle_id', 'end_time', 'duration']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_routes_by_vehicle_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_routes_by_vehicle_id`")  # noqa: E501
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in local_var_params or
                local_var_params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `get_dispatch_routes_by_vehicle_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in local_var_params:
            path_params['vehicle_id'] = local_var_params['vehicle_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'end_time' in local_var_params:
            query_params.append(('end_time', local_var_params['end_time']))  # noqa: E501
        if 'duration' in local_var_params:
            query_params.append(('duration', local_var_params['duration']))  # noqa: E501

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
            '/fleet/vehicles/{vehicle_id}/dispatch/routes', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[DispatchRoute]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_driver_by_id(self, access_token, driver_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Fetch driver by id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_by_id(access_token, driver_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_driver_by_id_with_http_info(access_token, driver_id_or_external_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_driver_by_id_with_http_info(access_token, driver_id_or_external_id, **kwargs)  # noqa: E501
            return data

    def get_driver_by_id_with_http_info(self, access_token, driver_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Fetch driver by id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_by_id_with_http_info(access_token, driver_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id_or_external_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_driver_by_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_driver_by_id`")  # noqa: E501
        # verify the required parameter 'driver_id_or_external_id' is set
        if ('driver_id_or_external_id' not in local_var_params or
                local_var_params['driver_id_or_external_id'] is None):
            raise ValueError("Missing the required parameter `driver_id_or_external_id` when calling `get_driver_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id_or_external_id' in local_var_params:
            path_params['driver_id_or_external_id'] = local_var_params['driver_id_or_external_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/fleet/drivers/{driver_id_or_external_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Driver',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_driver_document_types_by_org_id(self, **kwargs):  # noqa: E501
        """/fleet/drivers/document_types  # noqa: E501

        Fetch all of the document types.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_document_types_by_org_id(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[DocumentType]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_driver_document_types_by_org_id_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_driver_document_types_by_org_id_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_driver_document_types_by_org_id_with_http_info(self, **kwargs):  # noqa: E501
        """/fleet/drivers/document_types  # noqa: E501

        Fetch all of the document types.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_document_types_by_org_id_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :return: list[DocumentType]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = []  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_driver_document_types_by_org_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []

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
            '/fleet/drivers/document_types', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[DocumentType]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_driver_documents_by_org_id(self, access_token, **kwargs):  # noqa: E501
        """/fleet/drivers/documents  # noqa: E501

        Fetch all of the documents.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_documents_by_org_id(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int end_ms: Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
        :param int duration_ms: Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
        :return: list[Document]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_driver_documents_by_org_id_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.get_driver_documents_by_org_id_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def get_driver_documents_by_org_id_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/fleet/drivers/documents  # noqa: E501

        Fetch all of the documents.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_documents_by_org_id_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int end_ms: Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
        :param int duration_ms: Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
        :return: list[Document]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'end_ms', 'duration_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_driver_documents_by_org_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_driver_documents_by_org_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'end_ms' in local_var_params:
            query_params.append(('endMs', local_var_params['end_ms']))  # noqa: E501
        if 'duration_ms' in local_var_params:
            query_params.append(('durationMs', local_var_params['duration_ms']))  # noqa: E501

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
            '/fleet/drivers/documents', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[Document]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_driver_safety_score(self, driver_id, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/drivers/{driverId:[0-9]+}/safety/score  # noqa: E501

        Fetch the safety score for the driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_safety_score(driver_id, access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int driver_id: ID of the driver (required)
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: DriverSafetyScoreResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_driver_safety_score_with_http_info(driver_id, access_token, start_ms, end_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_driver_safety_score_with_http_info(driver_id, access_token, start_ms, end_ms, **kwargs)  # noqa: E501
            return data

    def get_driver_safety_score_with_http_info(self, driver_id, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/drivers/{driverId:[0-9]+}/safety/score  # noqa: E501

        Fetch the safety score for the driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_driver_safety_score_with_http_info(driver_id, access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int driver_id: ID of the driver (required)
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: DriverSafetyScoreResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['driver_id', 'access_token', 'start_ms', 'end_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_driver_safety_score" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'driver_id' is set
        if ('driver_id' not in local_var_params or
                local_var_params['driver_id'] is None):
            raise ValueError("Missing the required parameter `driver_id` when calling `get_driver_safety_score`")  # noqa: E501
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_driver_safety_score`")  # noqa: E501
        # verify the required parameter 'start_ms' is set
        if ('start_ms' not in local_var_params or
                local_var_params['start_ms'] is None):
            raise ValueError("Missing the required parameter `start_ms` when calling `get_driver_safety_score`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_driver_safety_score`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id' in local_var_params:
            path_params['driverId'] = local_var_params['driver_id']  # noqa: E501

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
            '/fleet/drivers/{driverId}/safety/score', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DriverSafetyScoreResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_dvirs(self, access_token, end_ms, duration_ms, **kwargs):  # noqa: E501
        """/fleet/maintenance/dvirs  # noqa: E501

        Get DVIRs for the org within provided time constraints  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dvirs(access_token, end_ms, duration_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int end_ms: time in millis until the last dvir log. (required)
        :param int duration_ms: time in millis which corresponds to the duration before the end_ms. (required)
        :param int group_id: Group ID to query.
        :return: DvirListResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_dvirs_with_http_info(access_token, end_ms, duration_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_dvirs_with_http_info(access_token, end_ms, duration_ms, **kwargs)  # noqa: E501
            return data

    def get_dvirs_with_http_info(self, access_token, end_ms, duration_ms, **kwargs):  # noqa: E501
        """/fleet/maintenance/dvirs  # noqa: E501

        Get DVIRs for the org within provided time constraints  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_dvirs_with_http_info(access_token, end_ms, duration_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int end_ms: time in millis until the last dvir log. (required)
        :param int duration_ms: time in millis which corresponds to the duration before the end_ms. (required)
        :param int group_id: Group ID to query.
        :return: DvirListResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'end_ms', 'duration_ms', 'group_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dvirs" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dvirs`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_dvirs`")  # noqa: E501
        # verify the required parameter 'duration_ms' is set
        if ('duration_ms' not in local_var_params or
                local_var_params['duration_ms'] is None):
            raise ValueError("Missing the required parameter `duration_ms` when calling `get_dvirs`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'end_ms' in local_var_params:
            query_params.append(('end_ms', local_var_params['end_ms']))  # noqa: E501
        if 'duration_ms' in local_var_params:
            query_params.append(('duration_ms', local_var_params['duration_ms']))  # noqa: E501
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
            '/fleet/maintenance/dvirs', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DvirListResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_drivers(self, access_token, group_drivers_param, **kwargs):  # noqa: E501
        """/fleet/drivers  # noqa: E501

        Get all the drivers for the specified group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_drivers(access_token, group_drivers_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject3 group_drivers_param: (required)
        :return: DriversResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_drivers_with_http_info(access_token, group_drivers_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_drivers_with_http_info(access_token, group_drivers_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_drivers_with_http_info(self, access_token, group_drivers_param, **kwargs):  # noqa: E501
        """/fleet/drivers  # noqa: E501

        Get all the drivers for the specified group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_drivers_with_http_info(access_token, group_drivers_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject3 group_drivers_param: (required)
        :return: DriversResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_drivers_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_drivers" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_drivers`")  # noqa: E501
        # verify the required parameter 'group_drivers_param' is set
        if ('group_drivers_param' not in local_var_params or
                local_var_params['group_drivers_param'] is None):
            raise ValueError("Missing the required parameter `group_drivers_param` when calling `get_fleet_drivers`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'group_drivers_param' in local_var_params:
            body_params = local_var_params['group_drivers_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/drivers', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DriversResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_drivers_hos_daily_logs(self, access_token, driver_id, hos_logs_param, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs  # noqa: E501

        Get summarized daily HOS charts for a specified driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver with HOS logs. (required)
        :param InlineObject6 hos_logs_param: (required)
        :return: DriverDailyLogResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_drivers_hos_daily_logs_with_http_info(access_token, driver_id, hos_logs_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_drivers_hos_daily_logs_with_http_info(access_token, driver_id, hos_logs_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_drivers_hos_daily_logs_with_http_info(self, access_token, driver_id, hos_logs_param, **kwargs):  # noqa: E501
        """/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs  # noqa: E501

        Get summarized daily HOS charts for a specified driver.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_drivers_hos_daily_logs_with_http_info(access_token, driver_id, hos_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int driver_id: ID of the driver with HOS logs. (required)
        :param InlineObject6 hos_logs_param: (required)
        :return: DriverDailyLogResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id', 'hos_logs_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_drivers_hos_daily_logs" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_drivers_hos_daily_logs`")  # noqa: E501
        # verify the required parameter 'driver_id' is set
        if ('driver_id' not in local_var_params or
                local_var_params['driver_id'] is None):
            raise ValueError("Missing the required parameter `driver_id` when calling `get_fleet_drivers_hos_daily_logs`")  # noqa: E501
        # verify the required parameter 'hos_logs_param' is set
        if ('hos_logs_param' not in local_var_params or
                local_var_params['hos_logs_param'] is None):
            raise ValueError("Missing the required parameter `hos_logs_param` when calling `get_fleet_drivers_hos_daily_logs`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id' in local_var_params:
            path_params['driver_id'] = local_var_params['driver_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'hos_logs_param' in local_var_params:
            body_params = local_var_params['hos_logs_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/drivers/{driver_id}/hos_daily_logs', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DriverDailyLogResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_drivers_summary(self, access_token, drivers_summary_param, **kwargs):  # noqa: E501
        """/fleet/drivers/summary  # noqa: E501

        Get the distance and time each driver in an organization has driven in a given time period.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_drivers_summary(access_token, drivers_summary_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject5 drivers_summary_param: (required)
        :param bool snap_to_day_bounds: Snap query result to HOS day boundaries.
        :return: DriversSummaryResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_drivers_summary_with_http_info(access_token, drivers_summary_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_drivers_summary_with_http_info(access_token, drivers_summary_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_drivers_summary_with_http_info(self, access_token, drivers_summary_param, **kwargs):  # noqa: E501
        """/fleet/drivers/summary  # noqa: E501

        Get the distance and time each driver in an organization has driven in a given time period.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_drivers_summary_with_http_info(access_token, drivers_summary_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject5 drivers_summary_param: (required)
        :param bool snap_to_day_bounds: Snap query result to HOS day boundaries.
        :return: DriversSummaryResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'drivers_summary_param', 'snap_to_day_bounds']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_drivers_summary" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_drivers_summary`")  # noqa: E501
        # verify the required parameter 'drivers_summary_param' is set
        if ('drivers_summary_param' not in local_var_params or
                local_var_params['drivers_summary_param'] is None):
            raise ValueError("Missing the required parameter `drivers_summary_param` when calling `get_fleet_drivers_summary`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'snap_to_day_bounds' in local_var_params:
            query_params.append(('snap_to_day_bounds', local_var_params['snap_to_day_bounds']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'drivers_summary_param' in local_var_params:
            body_params = local_var_params['drivers_summary_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/drivers/summary', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DriversSummaryResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_hos_authentication_logs(self, access_token, hos_authentication_logs_param, **kwargs):  # noqa: E501
        """/fleet/hos_authentication_logs  # noqa: E501

        Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject7 hos_authentication_logs_param: (required)
        :return: HosAuthenticationLogsResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_hos_authentication_logs_with_http_info(access_token, hos_authentication_logs_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_hos_authentication_logs_with_http_info(access_token, hos_authentication_logs_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_hos_authentication_logs_with_http_info(self, access_token, hos_authentication_logs_param, **kwargs):  # noqa: E501
        """/fleet/hos_authentication_logs  # noqa: E501

        Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_hos_authentication_logs_with_http_info(access_token, hos_authentication_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject7 hos_authentication_logs_param: (required)
        :return: HosAuthenticationLogsResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'hos_authentication_logs_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_hos_authentication_logs" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_hos_authentication_logs`")  # noqa: E501
        # verify the required parameter 'hos_authentication_logs_param' is set
        if ('hos_authentication_logs_param' not in local_var_params or
                local_var_params['hos_authentication_logs_param'] is None):
            raise ValueError("Missing the required parameter `hos_authentication_logs_param` when calling `get_fleet_hos_authentication_logs`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'hos_authentication_logs_param' in local_var_params:
            body_params = local_var_params['hos_authentication_logs_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/hos_authentication_logs', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='HosAuthenticationLogsResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_hos_logs(self, access_token, hos_logs_param, **kwargs):  # noqa: E501
        """/fleet/hos_logs  # noqa: E501

        Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_hos_logs(access_token, hos_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject8 hos_logs_param: (required)
        :return: HosLogsResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_hos_logs_with_http_info(access_token, hos_logs_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_hos_logs_with_http_info(access_token, hos_logs_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_hos_logs_with_http_info(self, access_token, hos_logs_param, **kwargs):  # noqa: E501
        """/fleet/hos_logs  # noqa: E501

        Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_hos_logs_with_http_info(access_token, hos_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject8 hos_logs_param: (required)
        :return: HosLogsResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'hos_logs_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_hos_logs" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_hos_logs`")  # noqa: E501
        # verify the required parameter 'hos_logs_param' is set
        if ('hos_logs_param' not in local_var_params or
                local_var_params['hos_logs_param'] is None):
            raise ValueError("Missing the required parameter `hos_logs_param` when calling `get_fleet_hos_logs`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'hos_logs_param' in local_var_params:
            body_params = local_var_params['hos_logs_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/hos_logs', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='HosLogsResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_hos_logs_summary(self, access_token, hos_logs_param, **kwargs):  # noqa: E501
        """/fleet/hos_logs_summary  # noqa: E501

        Get the current HOS status for all drivers in the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_hos_logs_summary(access_token, hos_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject9 hos_logs_param: (required)
        :return: HosLogsSummaryResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_hos_logs_summary_with_http_info(access_token, hos_logs_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_hos_logs_summary_with_http_info(access_token, hos_logs_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_hos_logs_summary_with_http_info(self, access_token, hos_logs_param, **kwargs):  # noqa: E501
        """/fleet/hos_logs_summary  # noqa: E501

        Get the current HOS status for all drivers in the group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_hos_logs_summary_with_http_info(access_token, hos_logs_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject9 hos_logs_param: (required)
        :return: HosLogsSummaryResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'hos_logs_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_hos_logs_summary" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_hos_logs_summary`")  # noqa: E501
        # verify the required parameter 'hos_logs_param' is set
        if ('hos_logs_param' not in local_var_params or
                local_var_params['hos_logs_param'] is None):
            raise ValueError("Missing the required parameter `hos_logs_param` when calling `get_fleet_hos_logs_summary`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'hos_logs_param' in local_var_params:
            body_params = local_var_params['hos_logs_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/hos_logs_summary', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='HosLogsSummaryResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_locations(self, access_token, group_param, **kwargs):  # noqa: E501
        """/fleet/locations  # noqa: E501

        Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_locations(access_token, group_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject11 group_param: (required)
        :return: InlineResponse2003
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_locations_with_http_info(access_token, group_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_locations_with_http_info(access_token, group_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_locations_with_http_info(self, access_token, group_param, **kwargs):  # noqa: E501
        """/fleet/locations  # noqa: E501

        Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_locations_with_http_info(access_token, group_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject11 group_param: (required)
        :return: InlineResponse2003
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_locations" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_locations`")  # noqa: E501
        # verify the required parameter 'group_param' is set
        if ('group_param' not in local_var_params or
                local_var_params['group_param'] is None):
            raise ValueError("Missing the required parameter `group_param` when calling `get_fleet_locations`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'group_param' in local_var_params:
            body_params = local_var_params['group_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/locations', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse2003',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_maintenance_list(self, access_token, group_param, **kwargs):  # noqa: E501
        """/fleet/maintenance/list  # noqa: E501

        Get list of the vehicles with any engine faults or check light data.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_maintenance_list(access_token, group_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject13 group_param: (required)
        :return: InlineResponse2004
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_maintenance_list_with_http_info(access_token, group_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_maintenance_list_with_http_info(access_token, group_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_maintenance_list_with_http_info(self, access_token, group_param, **kwargs):  # noqa: E501
        """/fleet/maintenance/list  # noqa: E501

        Get list of the vehicles with any engine faults or check light data.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_maintenance_list_with_http_info(access_token, group_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject13 group_param: (required)
        :return: InlineResponse2004
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_maintenance_list" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_maintenance_list`")  # noqa: E501
        # verify the required parameter 'group_param' is set
        if ('group_param' not in local_var_params or
                local_var_params['group_param'] is None):
            raise ValueError("Missing the required parameter `group_param` when calling `get_fleet_maintenance_list`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'group_param' in local_var_params:
            body_params = local_var_params['group_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/maintenance/list', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse2004',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_trips(self, access_token, trips_param, **kwargs):  # noqa: E501
        """/fleet/trips  # noqa: E501

        Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_trips(access_token, trips_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject15 trips_param: (required)
        :return: TripResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_trips_with_http_info(access_token, trips_param, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_trips_with_http_info(access_token, trips_param, **kwargs)  # noqa: E501
            return data

    def get_fleet_trips_with_http_info(self, access_token, trips_param, **kwargs):  # noqa: E501
        """/fleet/trips  # noqa: E501

        Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_trips_with_http_info(access_token, trips_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject15 trips_param: (required)
        :return: TripResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'trips_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_trips" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_trips`")  # noqa: E501
        # verify the required parameter 'trips_param' is set
        if ('trips_param' not in local_var_params or
                local_var_params['trips_param'] is None):
            raise ValueError("Missing the required parameter `trips_param` when calling `get_fleet_trips`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'trips_param' in local_var_params:
            body_params = local_var_params['trips_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/trips', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='TripResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_fleet_vehicle(self, access_token, vehicle_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Gets a specific vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_vehicle(access_token, vehicle_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
        :return: FleetVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, **kwargs)  # noqa: E501
            return data

    def get_fleet_vehicle_with_http_info(self, access_token, vehicle_id_or_external_id, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Gets a specific vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
        :return: FleetVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'vehicle_id_or_external_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_fleet_vehicle" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_fleet_vehicle`")  # noqa: E501
        # verify the required parameter 'vehicle_id_or_external_id' is set
        if ('vehicle_id_or_external_id' not in local_var_params or
                local_var_params['vehicle_id_or_external_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id_or_external_id` when calling `get_fleet_vehicle`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id_or_external_id' in local_var_params:
            path_params['vehicle_id_or_external_id'] = local_var_params['vehicle_id_or_external_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/fleet/vehicles/{vehicle_id_or_external_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='FleetVehicleResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_organization_address(self, access_token, address_id, **kwargs):  # noqa: E501
        """/addresses/{addressId}  # noqa: E501

        Fetch an address by its id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_organization_address(access_token, address_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int address_id: ID of the address/geofence (required)
        :return: Address
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_organization_address_with_http_info(access_token, address_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_organization_address_with_http_info(access_token, address_id, **kwargs)  # noqa: E501
            return data

    def get_organization_address_with_http_info(self, access_token, address_id, **kwargs):  # noqa: E501
        """/addresses/{addressId}  # noqa: E501

        Fetch an address by its id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_organization_address_with_http_info(access_token, address_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int address_id: ID of the address/geofence (required)
        :return: Address
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'address_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_organization_address" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_organization_address`")  # noqa: E501
        # verify the required parameter 'address_id' is set
        if ('address_id' not in local_var_params or
                local_var_params['address_id'] is None):
            raise ValueError("Missing the required parameter `address_id` when calling `get_organization_address`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'address_id' in local_var_params:
            path_params['addressId'] = local_var_params['address_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/addresses/{addressId}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Address',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_organization_addresses(self, access_token, **kwargs):  # noqa: E501
        """/addresses  # noqa: E501

        Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_organization_addresses(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :return: list[Address]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_organization_addresses_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.get_organization_addresses_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def get_organization_addresses_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/addresses  # noqa: E501

        Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_organization_addresses_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :return: list[Address]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_organization_addresses" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_organization_addresses`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/addresses', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[Address]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_organization_contact(self, access_token, contact_id, **kwargs):  # noqa: E501
        """/contacts/{contact_id}  # noqa: E501

        Fetch a contact by its id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_organization_contact(access_token, contact_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int contact_id: ID of the contact (required)
        :return: Contact
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_organization_contact_with_http_info(access_token, contact_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_organization_contact_with_http_info(access_token, contact_id, **kwargs)  # noqa: E501
            return data

    def get_organization_contact_with_http_info(self, access_token, contact_id, **kwargs):  # noqa: E501
        """/contacts/{contact_id}  # noqa: E501

        Fetch a contact by its id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_organization_contact_with_http_info(access_token, contact_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int contact_id: ID of the contact (required)
        :return: Contact
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'contact_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_organization_contact" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_organization_contact`")  # noqa: E501
        # verify the required parameter 'contact_id' is set
        if ('contact_id' not in local_var_params or
                local_var_params['contact_id'] is None):
            raise ValueError("Missing the required parameter `contact_id` when calling `get_organization_contact`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'contact_id' in local_var_params:
            path_params['contact_id'] = local_var_params['contact_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/contacts/{contact_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Contact',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_vehicle_harsh_event(self, vehicle_id, access_token, timestamp, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event  # noqa: E501

        Fetch harsh event details for a vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_harsh_event(vehicle_id, access_token, timestamp, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int vehicle_id: ID of the vehicle (required)
        :param str access_token: Samsara API access token. (required)
        :param int timestamp: Timestamp in milliseconds representing the timestamp of a harsh event. (required)
        :return: VehicleHarshEventResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_vehicle_harsh_event_with_http_info(vehicle_id, access_token, timestamp, **kwargs)  # noqa: E501
        else:
            (data) = self.get_vehicle_harsh_event_with_http_info(vehicle_id, access_token, timestamp, **kwargs)  # noqa: E501
            return data

    def get_vehicle_harsh_event_with_http_info(self, vehicle_id, access_token, timestamp, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event  # noqa: E501

        Fetch harsh event details for a vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_harsh_event_with_http_info(vehicle_id, access_token, timestamp, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int vehicle_id: ID of the vehicle (required)
        :param str access_token: Samsara API access token. (required)
        :param int timestamp: Timestamp in milliseconds representing the timestamp of a harsh event. (required)
        :return: VehicleHarshEventResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['vehicle_id', 'access_token', 'timestamp']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_vehicle_harsh_event" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in local_var_params or
                local_var_params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `get_vehicle_harsh_event`")  # noqa: E501
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_vehicle_harsh_event`")  # noqa: E501
        # verify the required parameter 'timestamp' is set
        if ('timestamp' not in local_var_params or
                local_var_params['timestamp'] is None):
            raise ValueError("Missing the required parameter `timestamp` when calling `get_vehicle_harsh_event`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in local_var_params:
            path_params['vehicleId'] = local_var_params['vehicle_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'timestamp' in local_var_params:
            query_params.append(('timestamp', local_var_params['timestamp']))  # noqa: E501

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
            '/fleet/vehicles/{vehicleId}/safety/harsh_event', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='VehicleHarshEventResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_vehicle_locations(self, access_token, vehicle_id, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+}/locations  # noqa: E501

        Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_locations(access_token, vehicle_id, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int vehicle_id: ID of the vehicle with the associated routes. (required)
        :param int start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
        :param int end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
        :return: list[FleetVehicleLocation]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_vehicle_locations_with_http_info(access_token, vehicle_id, start_ms, end_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_vehicle_locations_with_http_info(access_token, vehicle_id, start_ms, end_ms, **kwargs)  # noqa: E501
            return data

    def get_vehicle_locations_with_http_info(self, access_token, vehicle_id, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+}/locations  # noqa: E501

        Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_locations_with_http_info(access_token, vehicle_id, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int vehicle_id: ID of the vehicle with the associated routes. (required)
        :param int start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
        :param int end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
        :return: list[FleetVehicleLocation]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'vehicle_id', 'start_ms', 'end_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_vehicle_locations" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_vehicle_locations`")  # noqa: E501
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in local_var_params or
                local_var_params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `get_vehicle_locations`")  # noqa: E501
        # verify the required parameter 'start_ms' is set
        if ('start_ms' not in local_var_params or
                local_var_params['start_ms'] is None):
            raise ValueError("Missing the required parameter `start_ms` when calling `get_vehicle_locations`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_vehicle_locations`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in local_var_params:
            path_params['vehicle_id'] = local_var_params['vehicle_id']  # noqa: E501

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
            '/fleet/vehicles/{vehicle_id}/locations', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[FleetVehicleLocation]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_vehicle_safety_score(self, vehicle_id, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicleId:[0-9]+}/safety/score  # noqa: E501

        Fetch the safety score for the vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int vehicle_id: ID of the vehicle (required)
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: VehicleSafetyScoreResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_vehicle_safety_score_with_http_info(vehicle_id, access_token, start_ms, end_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_vehicle_safety_score_with_http_info(vehicle_id, access_token, start_ms, end_ms, **kwargs)  # noqa: E501
            return data

    def get_vehicle_safety_score_with_http_info(self, vehicle_id, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicleId:[0-9]+}/safety/score  # noqa: E501

        Fetch the safety score for the vehicle.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_safety_score_with_http_info(vehicle_id, access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int vehicle_id: ID of the vehicle (required)
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
        :param int end_ms: Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
        :return: VehicleSafetyScoreResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['vehicle_id', 'access_token', 'start_ms', 'end_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_vehicle_safety_score" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in local_var_params or
                local_var_params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `get_vehicle_safety_score`")  # noqa: E501
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_vehicle_safety_score`")  # noqa: E501
        # verify the required parameter 'start_ms' is set
        if ('start_ms' not in local_var_params or
                local_var_params['start_ms'] is None):
            raise ValueError("Missing the required parameter `start_ms` when calling `get_vehicle_safety_score`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_vehicle_safety_score`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in local_var_params:
            path_params['vehicleId'] = local_var_params['vehicle_id']  # noqa: E501

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
            '/fleet/vehicles/{vehicleId}/safety/score', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='VehicleSafetyScoreResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_vehicle_stats(self, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/stats  # noqa: E501

        Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_stats(access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Time in Unix epoch milliseconds for the start of the query. (required)
        :param int end_ms: Time in Unix epoch milliseconds for the end of the query. (required)
        :param str series: Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
        :param str tag_ids: Comma-separated list of tag ids. Example: tagIds=1,2,3
        :param str starting_after: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
        :param str ending_before: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
        :param int limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
        :return: InlineResponse2005
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_vehicle_stats_with_http_info(access_token, start_ms, end_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_vehicle_stats_with_http_info(access_token, start_ms, end_ms, **kwargs)  # noqa: E501
            return data

    def get_vehicle_stats_with_http_info(self, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/stats  # noqa: E501

        Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicle_stats_with_http_info(access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Time in Unix epoch milliseconds for the start of the query. (required)
        :param int end_ms: Time in Unix epoch milliseconds for the end of the query. (required)
        :param str series: Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
        :param str tag_ids: Comma-separated list of tag ids. Example: tagIds=1,2,3
        :param str starting_after: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
        :param str ending_before: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
        :param int limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
        :return: InlineResponse2005
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'start_ms', 'end_ms', 'series', 'tag_ids', 'starting_after', 'ending_before', 'limit']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_vehicle_stats" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_vehicle_stats`")  # noqa: E501
        # verify the required parameter 'start_ms' is set
        if ('start_ms' not in local_var_params or
                local_var_params['start_ms'] is None):
            raise ValueError("Missing the required parameter `start_ms` when calling `get_vehicle_stats`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_vehicle_stats`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'start_ms' in local_var_params:
            query_params.append(('startMs', local_var_params['start_ms']))  # noqa: E501
        if 'end_ms' in local_var_params:
            query_params.append(('endMs', local_var_params['end_ms']))  # noqa: E501
        if 'series' in local_var_params:
            query_params.append(('series', local_var_params['series']))  # noqa: E501
        if 'tag_ids' in local_var_params:
            query_params.append(('tagIds', local_var_params['tag_ids']))  # noqa: E501
        if 'starting_after' in local_var_params:
            query_params.append(('startingAfter', local_var_params['starting_after']))  # noqa: E501
        if 'ending_before' in local_var_params:
            query_params.append(('endingBefore', local_var_params['ending_before']))  # noqa: E501
        if 'limit' in local_var_params:
            query_params.append(('limit', local_var_params['limit']))  # noqa: E501

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
            '/fleet/vehicles/stats', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse2005',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_vehicles_locations(self, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/locations  # noqa: E501

        Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicles_locations(access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
        :param int end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
        :return: list[object]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_vehicles_locations_with_http_info(access_token, start_ms, end_ms, **kwargs)  # noqa: E501
        else:
            (data) = self.get_vehicles_locations_with_http_info(access_token, start_ms, end_ms, **kwargs)  # noqa: E501
            return data

    def get_vehicles_locations_with_http_info(self, access_token, start_ms, end_ms, **kwargs):  # noqa: E501
        """/fleet/vehicles/locations  # noqa: E501

        Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_vehicles_locations_with_http_info(access_token, start_ms, end_ms, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int start_ms: Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
        :param int end_ms: Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
        :return: list[object]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'start_ms', 'end_ms']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_vehicles_locations" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_vehicles_locations`")  # noqa: E501
        # verify the required parameter 'start_ms' is set
        if ('start_ms' not in local_var_params or
                local_var_params['start_ms'] is None):
            raise ValueError("Missing the required parameter `start_ms` when calling `get_vehicles_locations`")  # noqa: E501
        # verify the required parameter 'end_ms' is set
        if ('end_ms' not in local_var_params or
                local_var_params['end_ms'] is None):
            raise ValueError("Missing the required parameter `end_ms` when calling `get_vehicles_locations`")  # noqa: E501

        collection_formats = {}

        path_params = {}

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
            '/fleet/vehicles/locations', 'GET',
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

    def list_contacts(self, access_token, **kwargs):  # noqa: E501
        """/contacts  # noqa: E501

        Fetch all contacts for the organization.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_contacts(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :return: list[Contact]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.list_contacts_with_http_info(access_token, **kwargs)  # noqa: E501
        else:
            (data) = self.list_contacts_with_http_info(access_token, **kwargs)  # noqa: E501
            return data

    def list_contacts_with_http_info(self, access_token, **kwargs):  # noqa: E501
        """/contacts  # noqa: E501

        Fetch all contacts for the organization.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_contacts_with_http_info(access_token, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :return: list[Contact]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method list_contacts" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `list_contacts`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

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
            '/contacts', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[Contact]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def list_fleet(self, access_token, group_param, **kwargs):  # noqa: E501
        """/fleet/list  # noqa: E501

        Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_fleet(access_token, group_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject10 group_param: (required)
        :param str starting_after: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
        :param str ending_before: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
        :param int limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
        :return: InlineResponse2002
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.list_fleet_with_http_info(access_token, group_param, **kwargs)  # noqa: E501
        else:
            (data) = self.list_fleet_with_http_info(access_token, group_param, **kwargs)  # noqa: E501
            return data

    def list_fleet_with_http_info(self, access_token, group_param, **kwargs):  # noqa: E501
        """/fleet/list  # noqa: E501

        Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_fleet_with_http_info(access_token, group_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject10 group_param: (required)
        :param str starting_after: Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
        :param str ending_before: Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
        :param int limit: Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
        :return: InlineResponse2002
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'group_param', 'starting_after', 'ending_before', 'limit']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method list_fleet" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `list_fleet`")  # noqa: E501
        # verify the required parameter 'group_param' is set
        if ('group_param' not in local_var_params or
                local_var_params['group_param'] is None):
            raise ValueError("Missing the required parameter `group_param` when calling `list_fleet`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501
        if 'starting_after' in local_var_params:
            query_params.append(('startingAfter', local_var_params['starting_after']))  # noqa: E501
        if 'ending_before' in local_var_params:
            query_params.append(('endingBefore', local_var_params['ending_before']))  # noqa: E501
        if 'limit' in local_var_params:
            query_params.append(('limit', local_var_params['limit']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'group_param' in local_var_params:
            body_params = local_var_params['group_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/list', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse2002',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def patch_fleet_vehicle(self, access_token, vehicle_id_or_external_id, data, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.patch_fleet_vehicle(access_token, vehicle_id_or_external_id, data, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
        :param InlineObject16 data: (required)
        :return: FleetVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.patch_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, data, **kwargs)  # noqa: E501
        else:
            (data) = self.patch_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, data, **kwargs)  # noqa: E501
            return data

    def patch_fleet_vehicle_with_http_info(self, access_token, vehicle_id_or_external_id, data, **kwargs):  # noqa: E501
        """/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.patch_fleet_vehicle_with_http_info(access_token, vehicle_id_or_external_id, data, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str vehicle_id_or_external_id: ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
        :param InlineObject16 data: (required)
        :return: FleetVehicleResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'vehicle_id_or_external_id', 'data']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method patch_fleet_vehicle" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `patch_fleet_vehicle`")  # noqa: E501
        # verify the required parameter 'vehicle_id_or_external_id' is set
        if ('vehicle_id_or_external_id' not in local_var_params or
                local_var_params['vehicle_id_or_external_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id_or_external_id` when calling `patch_fleet_vehicle`")  # noqa: E501
        # verify the required parameter 'data' is set
        if ('data' not in local_var_params or
                local_var_params['data'] is None):
            raise ValueError("Missing the required parameter `data` when calling `patch_fleet_vehicle`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id_or_external_id' in local_var_params:
            path_params['vehicle_id_or_external_id'] = local_var_params['vehicle_id_or_external_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'data' in local_var_params:
            body_params = local_var_params['data']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json', 'application/merge-patch+json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/vehicles/{vehicle_id_or_external_id}', 'PATCH',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='FleetVehicleResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def reactivate_driver_by_id(self, access_token, driver_id_or_external_id, reactivate_driver_param, **kwargs):  # noqa: E501
        """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Reactivate the inactive driver having id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivate_driver_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :param InlineObject4 reactivate_driver_param: (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.reactivate_driver_by_id_with_http_info(access_token, driver_id_or_external_id, reactivate_driver_param, **kwargs)  # noqa: E501
        else:
            (data) = self.reactivate_driver_by_id_with_http_info(access_token, driver_id_or_external_id, reactivate_driver_param, **kwargs)  # noqa: E501
            return data

    def reactivate_driver_by_id_with_http_info(self, access_token, driver_id_or_external_id, reactivate_driver_param, **kwargs):  # noqa: E501
        """/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501

        Reactivate the inactive driver having id.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.reactivate_driver_by_id_with_http_info(access_token, driver_id_or_external_id, reactivate_driver_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param str driver_id_or_external_id: ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
        :param InlineObject4 reactivate_driver_param: (required)
        :return: Driver
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'driver_id_or_external_id', 'reactivate_driver_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method reactivate_driver_by_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `reactivate_driver_by_id`")  # noqa: E501
        # verify the required parameter 'driver_id_or_external_id' is set
        if ('driver_id_or_external_id' not in local_var_params or
                local_var_params['driver_id_or_external_id'] is None):
            raise ValueError("Missing the required parameter `driver_id_or_external_id` when calling `reactivate_driver_by_id`")  # noqa: E501
        # verify the required parameter 'reactivate_driver_param' is set
        if ('reactivate_driver_param' not in local_var_params or
                local_var_params['reactivate_driver_param'] is None):
            raise ValueError("Missing the required parameter `reactivate_driver_param` when calling `reactivate_driver_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id_or_external_id' in local_var_params:
            path_params['driver_id_or_external_id'] = local_var_params['driver_id_or_external_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'reactivate_driver_param' in local_var_params:
            body_params = local_var_params['reactivate_driver_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/drivers/inactive/{driver_id_or_external_id}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Driver',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_dispatch_route_by_id(self, access_token, route_id, update_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}/  # noqa: E501

        Update a dispatch route and its associated jobs.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the dispatch route. (required)
        :param DispatchRoute update_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_dispatch_route_by_id_with_http_info(access_token, route_id, update_dispatch_route_params, **kwargs)  # noqa: E501
        else:
            (data) = self.update_dispatch_route_by_id_with_http_info(access_token, route_id, update_dispatch_route_params, **kwargs)  # noqa: E501
            return data

    def update_dispatch_route_by_id_with_http_info(self, access_token, route_id, update_dispatch_route_params, **kwargs):  # noqa: E501
        """/fleet/dispatch/routes/{route_id:[0-9]+}/  # noqa: E501

        Update a dispatch route and its associated jobs.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_dispatch_route_by_id_with_http_info(access_token, route_id, update_dispatch_route_params, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int route_id: ID of the dispatch route. (required)
        :param DispatchRoute update_dispatch_route_params: (required)
        :return: DispatchRoute
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'route_id', 'update_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_dispatch_route_by_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `update_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in local_var_params or
                local_var_params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `update_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'update_dispatch_route_params' is set
        if ('update_dispatch_route_params' not in local_var_params or
                local_var_params['update_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `update_dispatch_route_params` when calling `update_dispatch_route_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in local_var_params:
            path_params['route_id'] = local_var_params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'update_dispatch_route_params' in local_var_params:
            body_params = local_var_params['update_dispatch_route_params']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/dispatch/routes/{route_id}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='DispatchRoute',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_organization_address(self, access_token, address_id, address, **kwargs):  # noqa: E501
        """/addresses/{addressId}  # noqa: E501

        Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_organization_address(access_token, address_id, address, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int address_id: ID of the address/geofence (required)
        :param InlineObject1 address: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_organization_address_with_http_info(access_token, address_id, address, **kwargs)  # noqa: E501
        else:
            (data) = self.update_organization_address_with_http_info(access_token, address_id, address, **kwargs)  # noqa: E501
            return data

    def update_organization_address_with_http_info(self, access_token, address_id, address, **kwargs):  # noqa: E501
        """/addresses/{addressId}  # noqa: E501

        Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_organization_address_with_http_info(access_token, address_id, address, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param int address_id: ID of the address/geofence (required)
        :param InlineObject1 address: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'address_id', 'address']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_organization_address" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `update_organization_address`")  # noqa: E501
        # verify the required parameter 'address_id' is set
        if ('address_id' not in local_var_params or
                local_var_params['address_id'] is None):
            raise ValueError("Missing the required parameter `address_id` when calling `update_organization_address`")  # noqa: E501
        # verify the required parameter 'address' is set
        if ('address' not in local_var_params or
                local_var_params['address'] is None):
            raise ValueError("Missing the required parameter `address` when calling `update_organization_address`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'address_id' in local_var_params:
            path_params['addressId'] = local_var_params['address_id']  # noqa: E501

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'address' in local_var_params:
            body_params = local_var_params['address']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/addresses/{addressId}', 'PATCH',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_vehicles(self, access_token, vehicle_update_param, **kwargs):  # noqa: E501
        """/fleet/set_data  # noqa: E501

        This method enables the mutation of metadata for vehicles in the Samsara Cloud.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_vehicles(access_token, vehicle_update_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject14 vehicle_update_param: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_vehicles_with_http_info(access_token, vehicle_update_param, **kwargs)  # noqa: E501
        else:
            (data) = self.update_vehicles_with_http_info(access_token, vehicle_update_param, **kwargs)  # noqa: E501
            return data

    def update_vehicles_with_http_info(self, access_token, vehicle_update_param, **kwargs):  # noqa: E501
        """/fleet/set_data  # noqa: E501

        This method enables the mutation of metadata for vehicles in the Samsara Cloud.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_vehicles_with_http_info(access_token, vehicle_update_param, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str access_token: Samsara API access token. (required)
        :param InlineObject14 vehicle_update_param: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['access_token', 'vehicle_update_param']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_vehicles" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in local_var_params or
                local_var_params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `update_vehicles`")  # noqa: E501
        # verify the required parameter 'vehicle_update_param' is set
        if ('vehicle_update_param' not in local_var_params or
                local_var_params['vehicle_update_param'] is None):
            raise ValueError("Missing the required parameter `vehicle_update_param` when calling `update_vehicles`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in local_var_params:
            query_params.append(('access_token', local_var_params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'vehicle_update_param' in local_var_params:
            body_params = local_var_params['vehicle_update_param']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/fleet/set_data', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
