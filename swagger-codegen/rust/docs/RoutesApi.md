# \RoutesApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_dispatch_route**](RoutesApi.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
[**create_driver_dispatch_route**](RoutesApi.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**create_vehicle_dispatch_route**](RoutesApi.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**delete_dispatch_route_by_id**](RoutesApi.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**fetch_all_dispatch_routes**](RoutesApi.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetch_all_route_job_updates**](RoutesApi.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**get_dispatch_route_by_id**](RoutesApi.md#get_dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**get_dispatch_route_history**](RoutesApi.md#get_dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**get_dispatch_routes_by_driver_id**](RoutesApi.md#get_dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**get_dispatch_routes_by_vehicle_id**](RoutesApi.md#get_dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**update_dispatch_route_by_id**](RoutesApi.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


# **create_dispatch_route**
> ::models::DispatchRoute create_dispatch_route(access_token, create_dispatch_route_params)
/fleet/dispatch/routes

Create a new dispatch route.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_dispatch_route**
> ::models::DispatchRoute create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params)
/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver with the associated routes. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vehicle_dispatch_route**
> ::models::DispatchRoute create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params)
/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id** | **i64**| ID of the vehicle with the associated routes. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dispatch_route_by_id**
> delete_dispatch_route_by_id(access_token, route_id)
/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the dispatch route. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_dispatch_routes**
> ::models::DispatchRoutes fetch_all_dispatch_routes(access_token, optional)
/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **i64**| Optional group ID if the organization has multiple groups (uncommon). | 
 **end_time** | **i64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | 
 **duration** | **i64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | 

### Return type

[**::models::DispatchRoutes**](DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_route_job_updates**
> ::models::AllRouteJobUpdates fetch_all_route_job_updates(access_token, optional)
/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **i64**| Optional group ID if the organization has multiple groups (uncommon). | 
 **sequence_id** | **String**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | 
 **include** | **String**| Optionally set include&#x3D;route to include route object in response payload. | 

### Return type

[**::models::AllRouteJobUpdates**](allRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_by_id**
> ::models::DispatchRoute get_dispatch_route_by_id(access_token, route_id)
/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the dispatch route. | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_history**
> ::models::DispatchRouteHistory get_dispatch_route_history(access_token, route_id, optional)
/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the route with history. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **route_id** | **i64**| ID of the route with history. | 
 **start_time** | **i64**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | 
 **end_time** | **i64**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | 

### Return type

[**::models::DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_driver_id**
> ::models::DispatchRoutes get_dispatch_routes_by_driver_id(access_token, driver_id, optional)
/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver with the associated routes. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **driver_id** | **i64**| ID of the driver with the associated routes. | 
 **end_time** | **i64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | 
 **duration** | **i64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | 

### Return type

[**::models::DispatchRoutes**](DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_vehicle_id**
> ::models::DispatchRoutes get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, optional)
/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id** | **i64**| ID of the vehicle with the associated routes. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **vehicle_id** | **i64**| ID of the vehicle with the associated routes. | 
 **end_time** | **i64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | 
 **duration** | **i64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | 

### Return type

[**::models::DispatchRoutes**](DispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dispatch_route_by_id**
> ::models::DispatchRoute update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params)
/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the dispatch route. | 
  **update_dispatch_route_params** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

