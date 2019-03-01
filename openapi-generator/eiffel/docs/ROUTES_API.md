# ROUTES_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_dispatch_route**](ROUTES_API.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
[**create_driver_dispatch_route**](ROUTES_API.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**create_vehicle_dispatch_route**](ROUTES_API.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**delete_dispatch_route_by_id**](ROUTES_API.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**dispatch_route_by_id**](ROUTES_API.md#dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**dispatch_route_history**](ROUTES_API.md#dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**dispatch_routes_by_driver_id**](ROUTES_API.md#dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**dispatch_routes_by_vehicle_id**](ROUTES_API.md#dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**fetch_all_dispatch_routes**](ROUTES_API.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetch_all_route_job_updates**](ROUTES_API.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**update_dispatch_route_by_id**](ROUTES_API.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


# **create_dispatch_route**
> create_dispatch_route (access_token: STRING_32 ; create_dispatch_route_params: DISPATCH_ROUTE_CREATE ): detachable DISPATCH_ROUTE
	

/fleet/dispatch/routes

Create a new dispatch route.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **create_dispatch_route_params** | [**DISPATCH_ROUTE_CREATE**](DISPATCH_ROUTE_CREATE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_dispatch_route**
> create_driver_dispatch_route (access_token: STRING_32 ; driver_id: INTEGER_64 ; create_dispatch_route_params: DISPATCH_ROUTE_CREATE ): detachable DISPATCH_ROUTE
	

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id** | **INTEGER_64**| ID of the driver with the associated routes. | [default to null]
 **create_dispatch_route_params** | [**DISPATCH_ROUTE_CREATE**](DISPATCH_ROUTE_CREATE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vehicle_dispatch_route**
> create_vehicle_dispatch_route (access_token: STRING_32 ; vehicle_id: INTEGER_64 ; create_dispatch_route_params: DISPATCH_ROUTE_CREATE ): detachable DISPATCH_ROUTE
	

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_id** | **INTEGER_64**| ID of the vehicle with the associated routes. | [default to null]
 **create_dispatch_route_params** | [**DISPATCH_ROUTE_CREATE**](DISPATCH_ROUTE_CREATE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dispatch_route_by_id**
> delete_dispatch_route_by_id (access_token: STRING_32 ; route_id: INTEGER_64 )
	

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the dispatch route. | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_route_by_id**
> dispatch_route_by_id (access_token: STRING_32 ; route_id: INTEGER_64 ): detachable DISPATCH_ROUTE
	

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the dispatch route. | [default to null]

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_route_history**
> dispatch_route_history (access_token: STRING_32 ; route_id: INTEGER_64 ; start_time:  detachable INTEGER_64 ; end_time:  detachable INTEGER_64 ): detachable DISPATCH_ROUTE_HISTORY
	

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the route with history. | [default to null]
 **start_time** | **INTEGER_64**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] [default to null]
 **end_time** | **INTEGER_64**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DISPATCH_ROUTE_HISTORY**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_routes_by_driver_id**
> dispatch_routes_by_driver_id (access_token: STRING_32 ; driver_id: INTEGER_64 ; end_time:  detachable INTEGER_64 ; duration:  detachable INTEGER_64 ): detachable LIST [DISPATCH_ROUTE]
	

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id** | **INTEGER_64**| ID of the driver with the associated routes. | [default to null]
 **end_time** | **INTEGER_64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **INTEGER_64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**LIST [DISPATCH_ROUTE]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_routes_by_vehicle_id**
> dispatch_routes_by_vehicle_id (access_token: STRING_32 ; vehicle_id: INTEGER_64 ; end_time:  detachable INTEGER_64 ; duration:  detachable INTEGER_64 ): detachable LIST [DISPATCH_ROUTE]
	

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_id** | **INTEGER_64**| ID of the vehicle with the associated routes. | [default to null]
 **end_time** | **INTEGER_64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **INTEGER_64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**LIST [DISPATCH_ROUTE]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_dispatch_routes**
> fetch_all_dispatch_routes (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ; end_time:  detachable INTEGER_64 ; duration:  detachable INTEGER_64 ): detachable LIST [DISPATCH_ROUTE]
	

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **end_time** | **INTEGER_64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **INTEGER_64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**LIST [DISPATCH_ROUTE]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_route_job_updates**
> fetch_all_route_job_updates (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ; sequence_id:  detachable STRING_32 ; include:  detachable STRING_32 ): detachable ALL_ROUTE_JOB_UPDATES
	

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **sequence_id** | **STRING_32**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] [default to null]
 **include** | **STRING_32**| Optionally set include&#x3D;route to include route object in response payload. | [optional] [default to null]

### Return type

[**ALL_ROUTE_JOB_UPDATES**](allRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dispatch_route_by_id**
> update_dispatch_route_by_id (access_token: STRING_32 ; route_id: INTEGER_64 ; update_dispatch_route_params: DISPATCH_ROUTE ): detachable DISPATCH_ROUTE
	

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the dispatch route. | [default to null]
 **update_dispatch_route_params** | [**DISPATCH_ROUTE**](DISPATCH_ROUTE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

