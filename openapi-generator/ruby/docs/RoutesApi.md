# OpenapiClient::RoutesApi

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
> DispatchRoute create_dispatch_route(access_token, create_dispatch_route_params)

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
create_dispatch_route_params = OpenapiClient::DispatchRouteCreate.new # DispatchRouteCreate | 

begin
  #/fleet/dispatch/routes
  result = api_instance.create_dispatch_route(access_token, create_dispatch_route_params)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->create_dispatch_route: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_driver_dispatch_route**
> DispatchRoute create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
driver_id = 56 # Integer | ID of the driver with the associated routes.
create_dispatch_route_params = OpenapiClient::DispatchRouteCreate.new # DispatchRouteCreate | 

begin
  #/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  result = api_instance.create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->create_driver_dispatch_route: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **driver_id** | **Integer**| ID of the driver with the associated routes. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_vehicle_dispatch_route**
> DispatchRoute create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
vehicle_id = 56 # Integer | ID of the vehicle with the associated routes.
create_dispatch_route_params = OpenapiClient::DispatchRouteCreate.new # DispatchRouteCreate | 

begin
  #/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  result = api_instance.create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->create_vehicle_dispatch_route: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **vehicle_id** | **Integer**| ID of the vehicle with the associated routes. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_dispatch_route_by_id**
> delete_dispatch_route_by_id(access_token, route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
route_id = 56 # Integer | ID of the dispatch route.

begin
  #/fleet/dispatch/routes/{route_id:[0-9]+}/
  api_instance.delete_dispatch_route_by_id(access_token, route_id)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->delete_dispatch_route_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **route_id** | **Integer**| ID of the dispatch route. | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **fetch_all_dispatch_routes**
> Array&lt;DispatchRoute&gt; fetch_all_dispatch_routes(access_token, opts)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
opts = {
  group_id: 56, # Integer | Optional group ID if the organization has multiple groups (uncommon).
  end_time: 56, # Integer | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  duration: 56 # Integer | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
}

begin
  #/fleet/dispatch/routes
  result = api_instance.fetch_all_dispatch_routes(access_token, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->fetch_all_dispatch_routes: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **Integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **end_time** | **Integer**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **Integer**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**Array&lt;DispatchRoute&gt;**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **fetch_all_route_job_updates**
> AllRouteJobUpdates fetch_all_route_job_updates(access_token, opts)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
opts = {
  group_id: 56, # Integer | Optional group ID if the organization has multiple groups (uncommon).
  sequence_id: 'sequence_id_example', # String | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
  include: 'include_example' # String | Optionally set include=route to include route object in response payload.
}

begin
  #/fleet/dispatch/routes/job_updates
  result = api_instance.fetch_all_route_job_updates(access_token, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->fetch_all_route_job_updates: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_id** | **Integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequence_id** | **String**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **String**| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_dispatch_route_by_id**
> DispatchRoute get_dispatch_route_by_id(access_token, route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
route_id = 56 # Integer | ID of the dispatch route.

begin
  #/fleet/dispatch/routes/{route_id:[0-9]+}
  result = api_instance.get_dispatch_route_by_id(access_token, route_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->get_dispatch_route_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **route_id** | **Integer**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_dispatch_route_history**
> DispatchRouteHistory get_dispatch_route_history(access_token, route_id, opts)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
route_id = 56 # Integer | ID of the route with history.
opts = {
  start_time: 56, # Integer | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
  end_time: 56 # Integer | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
}

begin
  #/fleet/dispatch/routes/{route_id:[0-9]+}/history
  result = api_instance.get_dispatch_route_history(access_token, route_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->get_dispatch_route_history: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **route_id** | **Integer**| ID of the route with history. | 
 **start_time** | **Integer**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **end_time** | **Integer**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_dispatch_routes_by_driver_id**
> Array&lt;DispatchRoute&gt; get_dispatch_routes_by_driver_id(access_token, driver_id, opts)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
driver_id = 56 # Integer | ID of the driver with the associated routes.
opts = {
  end_time: 56, # Integer | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  duration: 56 # Integer | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
}

begin
  #/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  result = api_instance.get_dispatch_routes_by_driver_id(access_token, driver_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->get_dispatch_routes_by_driver_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **driver_id** | **Integer**| ID of the driver with the associated routes. | 
 **end_time** | **Integer**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **Integer**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**Array&lt;DispatchRoute&gt;**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_dispatch_routes_by_vehicle_id**
> Array&lt;DispatchRoute&gt; get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, opts)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
vehicle_id = 56 # Integer | ID of the vehicle with the associated routes.
opts = {
  end_time: 56, # Integer | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
  duration: 56 # Integer | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
}

begin
  #/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  result = api_instance.get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->get_dispatch_routes_by_vehicle_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **vehicle_id** | **Integer**| ID of the vehicle with the associated routes. | 
 **end_time** | **Integer**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **Integer**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**Array&lt;DispatchRoute&gt;**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_dispatch_route_by_id**
> DispatchRoute update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::RoutesApi.new
access_token = 'access_token_example' # String | Samsara API access token.
route_id = 56 # Integer | ID of the dispatch route.
update_dispatch_route_params = OpenapiClient::DispatchRoute.new # DispatchRoute | 

begin
  #/fleet/dispatch/routes/{route_id:[0-9]+}/
  result = api_instance.update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling RoutesApi->update_dispatch_route_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **route_id** | **Integer**| ID of the dispatch route. | 
 **update_dispatch_route_params** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



