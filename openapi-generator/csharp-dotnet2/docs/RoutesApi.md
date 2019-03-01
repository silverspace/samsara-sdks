# Org.OpenAPITools.Api.RoutesApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDispatchRoute**](RoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**CreateDriverDispatchRoute**](RoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**CreateVehicleDispatchRoute**](RoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**DeleteDispatchRouteById**](RoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**FetchAllDispatchRoutes**](RoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**FetchAllRouteJobUpdates**](RoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetDispatchRouteById**](RoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**GetDispatchRouteHistory**](RoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**GetDispatchRoutesByDriverId**](RoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**GetDispatchRoutesByVehicleId**](RoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**UpdateDispatchRouteById**](RoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


<a name="createdispatchroute"></a>
# **CreateDispatchRoute**
> DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDispatchRouteExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

            try
            {
                // /fleet/dispatch/routes
                DispatchRoute result = apiInstance.CreateDispatchRoute(accessToken, createDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.CreateDispatchRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="createdriverdispatchroute"></a>
# **CreateDriverDispatchRoute**
> DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDriverDispatchRouteExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverId = 789;  // long? | ID of the driver with the associated routes.
            var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
                DispatchRoute result = apiInstance.CreateDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.CreateDriverDispatchRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverId** | **long?**| ID of the driver with the associated routes. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createvehicledispatchroute"></a>
# **CreateVehicleDispatchRoute**
> DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateVehicleDispatchRouteExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleId = 789;  // long? | ID of the vehicle with the associated routes.
            var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

            try
            {
                // /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
                DispatchRoute result = apiInstance.CreateVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.CreateVehicleDispatchRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleId** | **long?**| ID of the vehicle with the associated routes. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletedispatchroutebyid"></a>
# **DeleteDispatchRouteById**
> void DeleteDispatchRouteById (string accessToken, long? routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteDispatchRouteByIdExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the dispatch route.

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}/
                apiInstance.DeleteDispatchRouteById(accessToken, routeId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.DeleteDispatchRouteById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the dispatch route. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="fetchalldispatchroutes"></a>
# **FetchAllDispatchRoutes**
> List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId, long? endTime, long? duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FetchAllDispatchRoutesExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 
            var endTime = 789;  // long? | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
            var duration = 789;  // long? | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional) 

            try
            {
                // /fleet/dispatch/routes
                List&lt;DispatchRoute&gt; result = apiInstance.FetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.FetchAllDispatchRoutes: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **endTime** | **long?**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **long?**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="fetchallroutejobupdates"></a>
# **FetchAllRouteJobUpdates**
> AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId, string sequenceId, string include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FetchAllRouteJobUpdatesExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 
            var sequenceId = sequenceId_example;  // string | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional) 
            var include = include_example;  // string | Optionally set include=route to include route object in response payload. (optional) 

            try
            {
                // /fleet/dispatch/routes/job_updates
                AllRouteJobUpdates result = apiInstance.FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.FetchAllRouteJobUpdates: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequenceId** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutebyid"></a>
# **GetDispatchRouteById**
> DispatchRoute GetDispatchRouteById (string accessToken, long? routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRouteByIdExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the dispatch route.

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}
                DispatchRoute result = apiInstance.GetDispatchRouteById(accessToken, routeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.GetDispatchRouteById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutehistory"></a>
# **GetDispatchRouteHistory**
> DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime, long? endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRouteHistoryExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the route with history.
            var startTime = 789;  // long? | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional) 
            var endTime = 789;  // long? | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional) 

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}/history
                DispatchRouteHistory result = apiInstance.GetDispatchRouteHistory(accessToken, routeId, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.GetDispatchRouteHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the route with history. | 
 **startTime** | **long?**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **endTime** | **long?**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutesbydriverid"></a>
# **GetDispatchRoutesByDriverId**
> List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime, long? duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRoutesByDriverIdExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverId = 789;  // long? | ID of the driver with the associated routes.
            var endTime = 789;  // long? | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
            var duration = 789;  // long? | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional) 

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
                List&lt;DispatchRoute&gt; result = apiInstance.GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.GetDispatchRoutesByDriverId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverId** | **long?**| ID of the driver with the associated routes. | 
 **endTime** | **long?**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **long?**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutesbyvehicleid"></a>
# **GetDispatchRoutesByVehicleId**
> List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime, long? duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRoutesByVehicleIdExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleId = 789;  // long? | ID of the vehicle with the associated routes.
            var endTime = 789;  // long? | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
            var duration = 789;  // long? | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional) 

            try
            {
                // /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
                List&lt;DispatchRoute&gt; result = apiInstance.GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.GetDispatchRoutesByVehicleId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleId** | **long?**| ID of the vehicle with the associated routes. | 
 **endTime** | **long?**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **long?**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatedispatchroutebyid"></a>
# **UpdateDispatchRouteById**
> DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateDispatchRouteByIdExample
    {
        public void main()
        {
            
            var apiInstance = new RoutesApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the dispatch route.
            var updateDispatchRouteParams = new DispatchRoute(); // DispatchRoute | 

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}/
                DispatchRoute result = apiInstance.UpdateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.UpdateDispatchRouteById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the dispatch route. | 
 **updateDispatchRouteParams** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

