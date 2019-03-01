# WWW::SwaggerClient::RoutesApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::RoutesApi;
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_dispatch_route**](RoutesApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**create_driver_dispatch_route**](RoutesApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**create_vehicle_dispatch_route**](RoutesApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**delete_dispatch_route_by_id**](RoutesApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**fetch_all_dispatch_routes**](RoutesApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetch_all_route_job_updates**](RoutesApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**get_dispatch_route_by_id**](RoutesApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**get_dispatch_route_history**](RoutesApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**get_dispatch_routes_by_driver_id**](RoutesApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**get_dispatch_routes_by_vehicle_id**](RoutesApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**update_dispatch_route_by_id**](RoutesApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


# **create_dispatch_route**
> DispatchRoute create_dispatch_route(access_token => $access_token, create_dispatch_route_params => $create_dispatch_route_params)

/fleet/dispatch/routes

Create a new dispatch route.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $create_dispatch_route_params = WWW::SwaggerClient::Object::DispatchRouteCreate->new(); # DispatchRouteCreate | 

eval { 
    my $result = $api_instance->create_dispatch_route(access_token => $access_token, create_dispatch_route_params => $create_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->create_dispatch_route: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_dispatch_route**
> DispatchRoute create_driver_dispatch_route(access_token => $access_token, driver_id => $driver_id, create_dispatch_route_params => $create_dispatch_route_params)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $driver_id = 789; # int | ID of the driver with the associated routes.
my $create_dispatch_route_params = WWW::SwaggerClient::Object::DispatchRouteCreate->new(); # DispatchRouteCreate | 

eval { 
    my $result = $api_instance->create_driver_dispatch_route(access_token => $access_token, driver_id => $driver_id, create_dispatch_route_params => $create_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->create_driver_dispatch_route: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id** | **int**| ID of the driver with the associated routes. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vehicle_dispatch_route**
> DispatchRoute create_vehicle_dispatch_route(access_token => $access_token, vehicle_id => $vehicle_id, create_dispatch_route_params => $create_dispatch_route_params)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $vehicle_id = 789; # int | ID of the vehicle with the associated routes.
my $create_dispatch_route_params = WWW::SwaggerClient::Object::DispatchRouteCreate->new(); # DispatchRouteCreate | 

eval { 
    my $result = $api_instance->create_vehicle_dispatch_route(access_token => $access_token, vehicle_id => $vehicle_id, create_dispatch_route_params => $create_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->create_vehicle_dispatch_route: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dispatch_route_by_id**
> delete_dispatch_route_by_id(access_token => $access_token, route_id => $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $route_id = 789; # int | ID of the dispatch route.

eval { 
    $api_instance->delete_dispatch_route_by_id(access_token => $access_token, route_id => $route_id);
};
if ($@) {
    warn "Exception when calling RoutesApi->delete_dispatch_route_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the dispatch route. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_dispatch_routes**
> DispatchRoutes fetch_all_dispatch_routes(access_token => $access_token, group_id => $group_id, end_time => $end_time, duration => $duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).
my $end_time = 789; # int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
my $duration = 789; # int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

eval { 
    my $result = $api_instance->fetch_all_dispatch_routes(access_token => $access_token, group_id => $group_id, end_time => $end_time, duration => $duration);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->fetch_all_dispatch_routes: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**DispatchRoutes**](DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_route_job_updates**
> AllRouteJobUpdates fetch_all_route_job_updates(access_token => $access_token, group_id => $group_id, sequence_id => $sequence_id, include => $include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).
my $sequence_id = 'sequence_id_example'; # string | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
my $include = 'include_example'; # string | Optionally set include=route to include route object in response payload.

eval { 
    my $result = $api_instance->fetch_all_route_job_updates(access_token => $access_token, group_id => $group_id, sequence_id => $sequence_id, include => $include);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->fetch_all_route_job_updates: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequence_id** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_by_id**
> DispatchRoute get_dispatch_route_by_id(access_token => $access_token, route_id => $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $route_id = 789; # int | ID of the dispatch route.

eval { 
    my $result = $api_instance->get_dispatch_route_by_id(access_token => $access_token, route_id => $route_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->get_dispatch_route_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_history**
> DispatchRouteHistory get_dispatch_route_history(access_token => $access_token, route_id => $route_id, start_time => $start_time, end_time => $end_time)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $route_id = 789; # int | ID of the route with history.
my $start_time = 789; # int | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
my $end_time = 789; # int | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.

eval { 
    my $result = $api_instance->get_dispatch_route_history(access_token => $access_token, route_id => $route_id, start_time => $start_time, end_time => $end_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->get_dispatch_route_history: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the route with history. | 
 **start_time** | **int**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **end_time** | **int**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_driver_id**
> DispatchRoutes get_dispatch_routes_by_driver_id(access_token => $access_token, driver_id => $driver_id, end_time => $end_time, duration => $duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $driver_id = 789; # int | ID of the driver with the associated routes.
my $end_time = 789; # int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
my $duration = 789; # int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

eval { 
    my $result = $api_instance->get_dispatch_routes_by_driver_id(access_token => $access_token, driver_id => $driver_id, end_time => $end_time, duration => $duration);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->get_dispatch_routes_by_driver_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id** | **int**| ID of the driver with the associated routes. | 
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**DispatchRoutes**](DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_vehicle_id**
> DispatchRoutes get_dispatch_routes_by_vehicle_id(access_token => $access_token, vehicle_id => $vehicle_id, end_time => $end_time, duration => $duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $vehicle_id = 789; # int | ID of the vehicle with the associated routes.
my $end_time = 789; # int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
my $duration = 789; # int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

eval { 
    my $result = $api_instance->get_dispatch_routes_by_vehicle_id(access_token => $access_token, vehicle_id => $vehicle_id, end_time => $end_time, duration => $duration);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->get_dispatch_routes_by_vehicle_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. | 
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**DispatchRoutes**](DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dispatch_route_by_id**
> DispatchRoute update_dispatch_route_by_id(access_token => $access_token, route_id => $route_id, update_dispatch_route_params => $update_dispatch_route_params)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::RoutesApi;
my $api_instance = WWW::SwaggerClient::RoutesApi->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
my $route_id = 789; # int | ID of the dispatch route.
my $update_dispatch_route_params = WWW::SwaggerClient::Object::DispatchRoute->new(); # DispatchRoute | 

eval { 
    my $result = $api_instance->update_dispatch_route_by_id(access_token => $access_token, route_id => $route_id, update_dispatch_route_params => $update_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RoutesApi->update_dispatch_route_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the dispatch route. | 
 **update_dispatch_route_params** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

