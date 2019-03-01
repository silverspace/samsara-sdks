# routes_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**createDispatchRoute**](routes_api.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
**createDriverDispatchRoute**](routes_api.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
**createVehicleDispatchRoute**](routes_api.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
**deleteDispatchRouteById**](routes_api.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
**fetchAllDispatchRoutes**](routes_api.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
**fetchAllRouteJobUpdates**](routes_api.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
**getDispatchRouteById**](routes_api.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
**getDispatchRouteHistory**](routes_api.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
**getDispatchRoutesByDriverId**](routes_api.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
**getDispatchRoutesByVehicleId**](routes_api.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
**updateDispatchRouteById**](routes_api.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


# **createDispatchRoute**
> models::DispatchRoute createDispatchRoute(access_token, create_dispatch_route_params)
/fleet/dispatch/routes

Create a new dispatch route.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDriverDispatchRoute**
> models::DispatchRoute createDriverDispatchRoute(access_token, driver_id, create_dispatch_route_params)
/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver with the associated routes. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVehicleDispatchRoute**
> models::DispatchRoute createVehicleDispatchRoute(access_token, vehicle_id, create_dispatch_route_params)
/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id** | **i64**| ID of the vehicle with the associated routes. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteDispatchRouteById**
> deleteDispatchRouteById(access_token, route_id)
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

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllDispatchRoutes**
> Vec<models::DispatchRoute> fetchAllDispatchRoutes(access_token, optional)
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

[**Vec<models::DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllRouteJobUpdates**
> models::AllRouteJobUpdates fetchAllRouteJobUpdates(access_token, optional)
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
 **include** | **String**| Optionally set include=route to include route object in response payload. | 

### Return type

[**models::AllRouteJobUpdates**](allRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteById**
> models::DispatchRoute getDispatchRouteById(access_token, route_id)
/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the dispatch route. | 

### Return type

[**models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteHistory**
> models::DispatchRouteHistory getDispatchRouteHistory(access_token, route_id, optional)
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

[**models::DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByDriverId**
> Vec<models::DispatchRoute> getDispatchRoutesByDriverId(access_token, driver_id, optional)
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

[**Vec<models::DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByVehicleId**
> Vec<models::DispatchRoute> getDispatchRoutesByVehicleId(access_token, vehicle_id, optional)
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

[**Vec<models::DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateDispatchRouteById**
> models::DispatchRoute updateDispatchRouteById(access_token, route_id, update_dispatch_route_params)
/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the dispatch route. | 
  **update_dispatch_route_params** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

