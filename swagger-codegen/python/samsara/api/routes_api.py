# coding: utf-8

"""
    Samsara API

    # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from samsara.api_client import ApiClient


class RoutesApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

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

        all_params = ['access_token', 'create_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_dispatch_route" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_dispatch_route`")  # noqa: E501
        # verify the required parameter 'create_dispatch_route_params' is set
        if ('create_dispatch_route_params' not in params or
                params['create_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `create_dispatch_route_params` when calling `create_dispatch_route`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_dispatch_route_params' in params:
            body_params = params['create_dispatch_route_params']
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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

        all_params = ['access_token', 'driver_id', 'create_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_driver_dispatch_route" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_driver_dispatch_route`")  # noqa: E501
        # verify the required parameter 'driver_id' is set
        if ('driver_id' not in params or
                params['driver_id'] is None):
            raise ValueError("Missing the required parameter `driver_id` when calling `create_driver_dispatch_route`")  # noqa: E501
        # verify the required parameter 'create_dispatch_route_params' is set
        if ('create_dispatch_route_params' not in params or
                params['create_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `create_dispatch_route_params` when calling `create_driver_dispatch_route`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id' in params:
            path_params['driver_id'] = params['driver_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_dispatch_route_params' in params:
            body_params = params['create_dispatch_route_params']
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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

        all_params = ['access_token', 'vehicle_id', 'create_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_vehicle_dispatch_route" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `create_vehicle_dispatch_route`")  # noqa: E501
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in params or
                params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `create_vehicle_dispatch_route`")  # noqa: E501
        # verify the required parameter 'create_dispatch_route_params' is set
        if ('create_dispatch_route_params' not in params or
                params['create_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `create_dispatch_route_params` when calling `create_vehicle_dispatch_route`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in params:
            path_params['vehicle_id'] = params['vehicle_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'create_dispatch_route_params' in params:
            body_params = params['create_dispatch_route_params']
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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

        all_params = ['access_token', 'route_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_dispatch_route_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `delete_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in params or
                params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `delete_dispatch_route_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in params:
            path_params['route_id'] = params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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
        :return: DispatchRoutes
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
        :return: DispatchRoutes
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['access_token', 'group_id', 'end_time', 'duration']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method fetch_all_dispatch_routes" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `fetch_all_dispatch_routes`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501
        if 'group_id' in params:
            query_params.append(('group_id', params['group_id']))  # noqa: E501
        if 'end_time' in params:
            query_params.append(('end_time', params['end_time']))  # noqa: E501
        if 'duration' in params:
            query_params.append(('duration', params['duration']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
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
            response_type='DispatchRoutes',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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

        all_params = ['access_token', 'group_id', 'sequence_id', 'include']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method fetch_all_route_job_updates" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `fetch_all_route_job_updates`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501
        if 'group_id' in params:
            query_params.append(('group_id', params['group_id']))  # noqa: E501
        if 'sequence_id' in params:
            query_params.append(('sequence_id', params['sequence_id']))  # noqa: E501
        if 'include' in params:
            query_params.append(('include', params['include']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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

        all_params = ['access_token', 'route_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_route_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in params or
                params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `get_dispatch_route_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in params:
            path_params['route_id'] = params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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

        all_params = ['access_token', 'route_id', 'start_time', 'end_time']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_route_history" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_route_history`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in params or
                params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `get_dispatch_route_history`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in params:
            path_params['route_id'] = params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501
        if 'start_time' in params:
            query_params.append(('start_time', params['start_time']))  # noqa: E501
        if 'end_time' in params:
            query_params.append(('end_time', params['end_time']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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
        :return: DispatchRoutes
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
        :return: DispatchRoutes
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['access_token', 'driver_id', 'end_time', 'duration']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_routes_by_driver_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_routes_by_driver_id`")  # noqa: E501
        # verify the required parameter 'driver_id' is set
        if ('driver_id' not in params or
                params['driver_id'] is None):
            raise ValueError("Missing the required parameter `driver_id` when calling `get_dispatch_routes_by_driver_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'driver_id' in params:
            path_params['driver_id'] = params['driver_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501
        if 'end_time' in params:
            query_params.append(('end_time', params['end_time']))  # noqa: E501
        if 'duration' in params:
            query_params.append(('duration', params['duration']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
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
            response_type='DispatchRoutes',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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
        :return: DispatchRoutes
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
        :return: DispatchRoutes
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['access_token', 'vehicle_id', 'end_time', 'duration']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_dispatch_routes_by_vehicle_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `get_dispatch_routes_by_vehicle_id`")  # noqa: E501
        # verify the required parameter 'vehicle_id' is set
        if ('vehicle_id' not in params or
                params['vehicle_id'] is None):
            raise ValueError("Missing the required parameter `vehicle_id` when calling `get_dispatch_routes_by_vehicle_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'vehicle_id' in params:
            path_params['vehicle_id'] = params['vehicle_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501
        if 'end_time' in params:
            query_params.append(('end_time', params['end_time']))  # noqa: E501
        if 'duration' in params:
            query_params.append(('duration', params['duration']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
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
            response_type='DispatchRoutes',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
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

        all_params = ['access_token', 'route_id', 'update_dispatch_route_params']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_dispatch_route_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params or
                params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `update_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'route_id' is set
        if ('route_id' not in params or
                params['route_id'] is None):
            raise ValueError("Missing the required parameter `route_id` when calling `update_dispatch_route_by_id`")  # noqa: E501
        # verify the required parameter 'update_dispatch_route_params' is set
        if ('update_dispatch_route_params' not in params or
                params['update_dispatch_route_params'] is None):
            raise ValueError("Missing the required parameter `update_dispatch_route_params` when calling `update_dispatch_route_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'route_id' in params:
            path_params['route_id'] = params['route_id']  # noqa: E501

        query_params = []
        if 'access_token' in params:
            query_params.append(('access_token', params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'update_dispatch_route_params' in params:
            body_params = params['update_dispatch_route_params']
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
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
