# RoutesApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDispatchRoute**](RoutesApi.md#CreateDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**CreateDriverDispatchRoute**](RoutesApi.md#CreateDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**CreateVehicleDispatchRoute**](RoutesApi.md#CreateVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**DeleteDispatchRouteById**](RoutesApi.md#DeleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**FetchAllDispatchRoutes**](RoutesApi.md#FetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**FetchAllRouteJobUpdates**](RoutesApi.md#FetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetDispatchRouteById**](RoutesApi.md#GetDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**GetDispatchRouteHistory**](RoutesApi.md#GetDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**GetDispatchRoutesByDriverId**](RoutesApi.md#GetDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**GetDispatchRoutesByVehicleId**](RoutesApi.md#GetDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**UpdateDispatchRouteById**](RoutesApi.md#UpdateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


# **CreateDispatchRoute**
> DispatchRoute CreateDispatchRoute(access.token, create.dispatch.route.params)

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.create.dispatch.route.params <- DispatchRouteCreate$new() # DispatchRouteCreate | 

#/fleet/dispatch/routes
api.instance <- RoutesApi$new()
result <- api.instance$CreateDispatchRoute(var.access.token, var.create.dispatch.route.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **create.dispatch.route.params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **CreateDriverDispatchRoute**
> DispatchRoute CreateDriverDispatchRoute(access.token, driver.id, create.dispatch.route.params)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id <- 56 # integer | ID of the driver with the associated routes.
var.create.dispatch.route.params <- DispatchRouteCreate$new() # DispatchRouteCreate | 

#/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
api.instance <- RoutesApi$new()
result <- api.instance$CreateDriverDispatchRoute(var.access.token, var.driver.id, var.create.dispatch.route.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id** | **integer**| ID of the driver with the associated routes. | 
 **create.dispatch.route.params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **CreateVehicleDispatchRoute**
> DispatchRoute CreateVehicleDispatchRoute(access.token, vehicle.id, create.dispatch.route.params)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.vehicle.id <- 56 # integer | ID of the vehicle with the associated routes.
var.create.dispatch.route.params <- DispatchRouteCreate$new() # DispatchRouteCreate | 

#/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
api.instance <- RoutesApi$new()
result <- api.instance$CreateVehicleDispatchRoute(var.access.token, var.vehicle.id, var.create.dispatch.route.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **vehicle.id** | **integer**| ID of the vehicle with the associated routes. | 
 **create.dispatch.route.params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **DeleteDispatchRouteById**
> DeleteDispatchRouteById(access.token, route.id)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.route.id <- 56 # integer | ID of the dispatch route.

#/fleet/dispatch/routes/{route_id:[0-9]+}/
api.instance <- RoutesApi$new()
api.instance$DeleteDispatchRouteById(var.access.token, var.route.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **route.id** | **integer**| ID of the dispatch route. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **FetchAllDispatchRoutes**
> DispatchRoute FetchAllDispatchRoutes(access.token, group.id=var.group.id, end.time=var.end.time, duration=var.duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).
var.end.time <- 56 # integer | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var.duration <- 56 # integer | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

#/fleet/dispatch/routes
api.instance <- RoutesApi$new()
result <- api.instance$FetchAllDispatchRoutes(var.access.token, group.id=var.group.id, end.time=var.end.time, duration=var.duration)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **end.time** | **integer**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **integer**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **FetchAllRouteJobUpdates**
> AllRouteJobUpdates FetchAllRouteJobUpdates(access.token, group.id=var.group.id, sequence.id=var.sequence.id, include=var.include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).
var.sequence.id <- 'sequence.id_example' # character | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
var.include <- 'include_example' # character | Optionally set include=route to include route object in response payload.

#/fleet/dispatch/routes/job_updates
api.instance <- RoutesApi$new()
result <- api.instance$FetchAllRouteJobUpdates(var.access.token, group.id=var.group.id, sequence.id=var.sequence.id, include=var.include)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequence.id** | **character**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **character**| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**AllRouteJobUpdates**](allRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDispatchRouteById**
> DispatchRoute GetDispatchRouteById(access.token, route.id)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.route.id <- 56 # integer | ID of the dispatch route.

#/fleet/dispatch/routes/{route_id:[0-9]+}
api.instance <- RoutesApi$new()
result <- api.instance$GetDispatchRouteById(var.access.token, var.route.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **route.id** | **integer**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDispatchRouteHistory**
> DispatchRouteHistory GetDispatchRouteHistory(access.token, route.id, start.time=var.start.time, end.time=var.end.time)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.route.id <- 56 # integer | ID of the route with history.
var.start.time <- 56 # integer | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
var.end.time <- 56 # integer | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.

#/fleet/dispatch/routes/{route_id:[0-9]+}/history
api.instance <- RoutesApi$new()
result <- api.instance$GetDispatchRouteHistory(var.access.token, var.route.id, start.time=var.start.time, end.time=var.end.time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **route.id** | **integer**| ID of the route with history. | 
 **start.time** | **integer**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **end.time** | **integer**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDispatchRoutesByDriverId**
> DispatchRoute GetDispatchRoutesByDriverId(access.token, driver.id, end.time=var.end.time, duration=var.duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id <- 56 # integer | ID of the driver with the associated routes.
var.end.time <- 56 # integer | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var.duration <- 56 # integer | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

#/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
api.instance <- RoutesApi$new()
result <- api.instance$GetDispatchRoutesByDriverId(var.access.token, var.driver.id, end.time=var.end.time, duration=var.duration)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id** | **integer**| ID of the driver with the associated routes. | 
 **end.time** | **integer**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **integer**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDispatchRoutesByVehicleId**
> DispatchRoute GetDispatchRoutesByVehicleId(access.token, vehicle.id, end.time=var.end.time, duration=var.duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.vehicle.id <- 56 # integer | ID of the vehicle with the associated routes.
var.end.time <- 56 # integer | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
var.duration <- 56 # integer | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

#/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
api.instance <- RoutesApi$new()
result <- api.instance$GetDispatchRoutesByVehicleId(var.access.token, var.vehicle.id, end.time=var.end.time, duration=var.duration)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **vehicle.id** | **integer**| ID of the vehicle with the associated routes. | 
 **end.time** | **integer**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **integer**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **UpdateDispatchRouteById**
> DispatchRoute UpdateDispatchRouteById(access.token, route.id, update.dispatch.route.params)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.route.id <- 56 # integer | ID of the dispatch route.
var.update.dispatch.route.params <- DispatchRoute$new() # DispatchRoute | 

#/fleet/dispatch/routes/{route_id:[0-9]+}/
api.instance <- RoutesApi$new()
result <- api.instance$UpdateDispatchRouteById(var.access.token, var.route.id, var.update.dispatch.route.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **route.id** | **integer**| ID of the dispatch route. | 
 **update.dispatch.route.params** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



