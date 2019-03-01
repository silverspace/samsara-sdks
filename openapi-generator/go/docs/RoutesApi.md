# \RoutesApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDispatchRoute**](RoutesApi.md#CreateDispatchRoute) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
[**CreateDriverDispatchRoute**](RoutesApi.md#CreateDriverDispatchRoute) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**CreateVehicleDispatchRoute**](RoutesApi.md#CreateVehicleDispatchRoute) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**DeleteDispatchRouteById**](RoutesApi.md#DeleteDispatchRouteById) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**FetchAllDispatchRoutes**](RoutesApi.md#FetchAllDispatchRoutes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
[**FetchAllRouteJobUpdates**](RoutesApi.md#FetchAllRouteJobUpdates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetDispatchRouteById**](RoutesApi.md#GetDispatchRouteById) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**GetDispatchRouteHistory**](RoutesApi.md#GetDispatchRouteHistory) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**GetDispatchRoutesByDriverId**](RoutesApi.md#GetDispatchRoutesByDriverId) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**GetDispatchRoutesByVehicleId**](RoutesApi.md#GetDispatchRoutesByVehicleId) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**UpdateDispatchRouteById**](RoutesApi.md#UpdateDispatchRouteById) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


# **CreateDispatchRoute**
> DispatchRoute CreateDispatchRoute(ctx, accessToken, createDispatchRouteParams)
/fleet/dispatch/routes

Create a new dispatch route.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateDriverDispatchRoute**
> DispatchRoute CreateDriverDispatchRoute(ctx, accessToken, driverId, createDispatchRouteParams)
/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **driverId** | **int64**| ID of the driver with the associated routes. | 
  **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateVehicleDispatchRoute**
> DispatchRoute CreateVehicleDispatchRoute(ctx, accessToken, vehicleId, createDispatchRouteParams)
/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **vehicleId** | **int64**| ID of the vehicle with the associated routes. | 
  **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteDispatchRouteById**
> DeleteDispatchRouteById(ctx, accessToken, routeId)
/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **routeId** | **int64**| ID of the dispatch route. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FetchAllDispatchRoutes**
> []DispatchRoute FetchAllDispatchRoutes(ctx, accessToken, optional)
/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
 **optional** | ***FetchAllDispatchRoutesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FetchAllDispatchRoutesOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupId** | **optional.Int64**| Optional group ID if the organization has multiple groups (uncommon). | 
 **endTime** | **optional.Int64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | 
 **duration** | **optional.Int64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | 

### Return type

[**[]DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FetchAllRouteJobUpdates**
> AllRouteJobUpdates FetchAllRouteJobUpdates(ctx, accessToken, optional)
/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
 **optional** | ***FetchAllRouteJobUpdatesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FetchAllRouteJobUpdatesOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **groupId** | **optional.Int64**| Optional group ID if the organization has multiple groups (uncommon). | 
 **sequenceId** | **optional.String**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | 
 **include** | **optional.String**| Optionally set include&#x3D;route to include route object in response payload. | 

### Return type

[**AllRouteJobUpdates**](allRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDispatchRouteById**
> DispatchRoute GetDispatchRouteById(ctx, accessToken, routeId)
/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **routeId** | **int64**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDispatchRouteHistory**
> DispatchRouteHistory GetDispatchRouteHistory(ctx, accessToken, routeId, optional)
/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **routeId** | **int64**| ID of the route with history. | 
 **optional** | ***GetDispatchRouteHistoryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetDispatchRouteHistoryOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **startTime** | **optional.Int64**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | 
 **endTime** | **optional.Int64**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDispatchRoutesByDriverId**
> []DispatchRoute GetDispatchRoutesByDriverId(ctx, accessToken, driverId, optional)
/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **driverId** | **int64**| ID of the driver with the associated routes. | 
 **optional** | ***GetDispatchRoutesByDriverIdOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetDispatchRoutesByDriverIdOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endTime** | **optional.Int64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | 
 **duration** | **optional.Int64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | 

### Return type

[**[]DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDispatchRoutesByVehicleId**
> []DispatchRoute GetDispatchRoutesByVehicleId(ctx, accessToken, vehicleId, optional)
/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **vehicleId** | **int64**| ID of the vehicle with the associated routes. | 
 **optional** | ***GetDispatchRoutesByVehicleIdOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetDispatchRoutesByVehicleIdOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **endTime** | **optional.Int64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | 
 **duration** | **optional.Int64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | 

### Return type

[**[]DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateDispatchRouteById**
> DispatchRoute UpdateDispatchRouteById(ctx, accessToken, routeId, updateDispatchRouteParams)
/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **accessToken** | **string**| Samsara API access token. | 
  **routeId** | **int64**| ID of the dispatch route. | 
  **updateDispatchRouteParams** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

