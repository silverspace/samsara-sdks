# SWGRoutesApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDispatchRoute**](SWGRoutesApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriverDispatchRoute**](SWGRoutesApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createVehicleDispatchRoute**](SWGRoutesApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deleteDispatchRouteById**](SWGRoutesApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**fetchAllDispatchRoutes**](SWGRoutesApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](SWGRoutesApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getDispatchRouteById**](SWGRoutesApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](SWGRoutesApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](SWGRoutesApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](SWGRoutesApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**updateDispatchRouteById**](SWGRoutesApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


# **createDispatchRoute**
```objc
-(NSURLSessionTask*) createDispatchRouteWithAccessToken: (NSString*) accessToken
    createDispatchRouteParams: (SWGDispatchRouteCreate*) createDispatchRouteParams
        completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;
```

/fleet/dispatch/routes

Create a new dispatch route.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGDispatchRouteCreate* createDispatchRouteParams = [[SWGDispatchRouteCreate alloc] init]; // 

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/dispatch/routes
[apiInstance createDispatchRouteWithAccessToken:accessToken
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->createDispatchRoute: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **createDispatchRouteParams** | [**SWGDispatchRouteCreate***](SWGDispatchRouteCreate.md)|  | 

### Return type

[**SWGDispatchRoute***](SWGDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDriverDispatchRoute**
```objc
-(NSURLSessionTask*) createDriverDispatchRouteWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDispatchRouteParams: (SWGDispatchRouteCreate*) createDispatchRouteParams
        completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @789; // ID of the driver with the associated routes.
SWGDispatchRouteCreate* createDispatchRouteParams = [[SWGDispatchRouteCreate alloc] init]; // 

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[apiInstance createDriverDispatchRouteWithAccessToken:accessToken
              driverId:driverId
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->createDriverDispatchRoute: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverId** | **NSNumber***| ID of the driver with the associated routes. | 
 **createDispatchRouteParams** | [**SWGDispatchRouteCreate***](SWGDispatchRouteCreate.md)|  | 

### Return type

[**SWGDispatchRoute***](SWGDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVehicleDispatchRoute**
```objc
-(NSURLSessionTask*) createVehicleDispatchRouteWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    createDispatchRouteParams: (SWGDispatchRouteCreate*) createDispatchRouteParams
        completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* vehicleId = @789; // ID of the vehicle with the associated routes.
SWGDispatchRouteCreate* createDispatchRouteParams = [[SWGDispatchRouteCreate alloc] init]; // 

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[apiInstance createVehicleDispatchRouteWithAccessToken:accessToken
              vehicleId:vehicleId
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->createVehicleDispatchRoute: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleId** | **NSNumber***| ID of the vehicle with the associated routes. | 
 **createDispatchRouteParams** | [**SWGDispatchRouteCreate***](SWGDispatchRouteCreate.md)|  | 

### Return type

[**SWGDispatchRoute***](SWGDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteDispatchRouteById**
```objc
-(NSURLSessionTask*) deleteDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
        completionHandler: (void (^)(NSError* error)) handler;
```

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* routeId = @789; // ID of the dispatch route.

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/
[apiInstance deleteDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->deleteDispatchRouteById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **routeId** | **NSNumber***| ID of the dispatch route. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllDispatchRoutes**
```objc
-(NSURLSessionTask*) fetchAllDispatchRoutesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
        completionHandler: (void (^)(SWGDispatchRoutes* output, NSError* error)) handler;
```

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)
NSNumber* endTime = @789; // Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
NSNumber* duration = @789; // Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/dispatch/routes
[apiInstance fetchAllDispatchRoutesWithAccessToken:accessToken
              groupId:groupId
              endTime:endTime
              duration:duration
          completionHandler: ^(SWGDispatchRoutes* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->fetchAllDispatchRoutes: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **endTime** | **NSNumber***| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **NSNumber***| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**SWGDispatchRoutes***](SWGDispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllRouteJobUpdates**
```objc
-(NSURLSessionTask*) fetchAllRouteJobUpdatesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    sequenceId: (NSString*) sequenceId
    include: (NSString*) include
        completionHandler: (void (^)(SWGAllRouteJobUpdates* output, NSError* error)) handler;
```

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)
NSString* sequenceId = @"sequenceId_example"; // Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
NSString* include = @"include_example"; // Optionally set include=route to include route object in response payload. (optional)

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/dispatch/routes/job_updates
[apiInstance fetchAllRouteJobUpdatesWithAccessToken:accessToken
              groupId:groupId
              sequenceId:sequenceId
              include:include
          completionHandler: ^(SWGAllRouteJobUpdates* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->fetchAllRouteJobUpdates: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequenceId** | **NSString***| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **NSString***| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**SWGAllRouteJobUpdates***](SWGAllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteById**
```objc
-(NSURLSessionTask*) getDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
        completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;
```

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* routeId = @789; // ID of the dispatch route.

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}
[apiInstance getDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->getDispatchRouteById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **routeId** | **NSNumber***| ID of the dispatch route. | 

### Return type

[**SWGDispatchRoute***](SWGDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteHistory**
```objc
-(NSURLSessionTask*) getDispatchRouteHistoryWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    startTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
        completionHandler: (void (^)(SWGDispatchRouteHistory* output, NSError* error)) handler;
```

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* routeId = @789; // ID of the route with history.
NSNumber* startTime = @789; // Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
NSNumber* endTime = @789; // Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/history
[apiInstance getDispatchRouteHistoryWithAccessToken:accessToken
              routeId:routeId
              startTime:startTime
              endTime:endTime
          completionHandler: ^(SWGDispatchRouteHistory* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->getDispatchRouteHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **routeId** | **NSNumber***| ID of the route with history. | 
 **startTime** | **NSNumber***| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **endTime** | **NSNumber***| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**SWGDispatchRouteHistory***](SWGDispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByDriverId**
```objc
-(NSURLSessionTask*) getDispatchRoutesByDriverIdWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
        completionHandler: (void (^)(SWGDispatchRoutes* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @789; // ID of the driver with the associated routes.
NSNumber* endTime = @789; // Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
NSNumber* duration = @789; // Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[apiInstance getDispatchRoutesByDriverIdWithAccessToken:accessToken
              driverId:driverId
              endTime:endTime
              duration:duration
          completionHandler: ^(SWGDispatchRoutes* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->getDispatchRoutesByDriverId: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverId** | **NSNumber***| ID of the driver with the associated routes. | 
 **endTime** | **NSNumber***| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **NSNumber***| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**SWGDispatchRoutes***](SWGDispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByVehicleId**
```objc
-(NSURLSessionTask*) getDispatchRoutesByVehicleIdWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
        completionHandler: (void (^)(SWGDispatchRoutes* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* vehicleId = @789; // ID of the vehicle with the associated routes.
NSNumber* endTime = @789; // Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
NSNumber* duration = @789; // Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[apiInstance getDispatchRoutesByVehicleIdWithAccessToken:accessToken
              vehicleId:vehicleId
              endTime:endTime
              duration:duration
          completionHandler: ^(SWGDispatchRoutes* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->getDispatchRoutesByVehicleId: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleId** | **NSNumber***| ID of the vehicle with the associated routes. | 
 **endTime** | **NSNumber***| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **NSNumber***| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**SWGDispatchRoutes***](SWGDispatchRoutes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateDispatchRouteById**
```objc
-(NSURLSessionTask*) updateDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    updateDispatchRouteParams: (SWGDispatchRoute*) updateDispatchRouteParams
        completionHandler: (void (^)(SWGDispatchRoute* output, NSError* error)) handler;
```

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* routeId = @789; // ID of the dispatch route.
SWGDispatchRoute* updateDispatchRouteParams = [[SWGDispatchRoute alloc] init]; // 

SWGRoutesApi*apiInstance = [[SWGRoutesApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/
[apiInstance updateDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
              updateDispatchRouteParams:updateDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRoutesApi->updateDispatchRouteById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **routeId** | **NSNumber***| ID of the dispatch route. | 
 **updateDispatchRouteParams** | [**SWGDispatchRoute***](SWGDispatchRoute.md)|  | 

### Return type

[**SWGDispatchRoute***](SWGDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

