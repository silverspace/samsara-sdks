# OAIFleetApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFleetAddress**](OAIFleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
[**addOrganizationAddresses**](OAIFleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
[**createDispatchRoute**](OAIFleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriver**](OAIFleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**createDriverDispatchRoute**](OAIFleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createDriverDocument**](OAIFleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**createDvir**](OAIFleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**createVehicleDispatchRoute**](OAIFleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivateDriver**](OAIFleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**deleteDispatchRouteById**](OAIFleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**deleteOrganizationAddress**](OAIFleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**fetchAllDispatchRoutes**](OAIFleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](OAIFleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getAllAssetCurrentLocations**](OAIFleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](OAIFleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
[**getAllDeactivatedDrivers**](OAIFleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**getAssetLocation**](OAIFleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](OAIFleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**getDeactivatedDriverById**](OAIFleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDispatchRouteById**](OAIFleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](OAIFleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](OAIFleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](OAIFleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**getDriverById**](OAIFleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDriverDocumentTypesByOrgId**](OAIFleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**getDriverDocumentsByOrgId**](OAIFleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**getDriverSafetyScore**](OAIFleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getDvirs**](OAIFleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**getFleetDrivers**](OAIFleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
[**getFleetDriversHosDailyLogs**](OAIFleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**getFleetDriversSummary**](OAIFleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**getFleetHosAuthenticationLogs**](OAIFleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**getFleetHosLogs**](OAIFleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**getFleetHosLogsSummary**](OAIFleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**getFleetLocations**](OAIFleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
[**getFleetMaintenanceList**](OAIFleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**getFleetTrips**](OAIFleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
[**getFleetVehicle**](OAIFleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getOrganizationAddress**](OAIFleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**getOrganizationAddresses**](OAIFleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
[**getOrganizationContact**](OAIFleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**getVehicleHarshEvent**](OAIFleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleLocations**](OAIFleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**getVehicleSafetyScore**](OAIFleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**getVehicleStats**](OAIFleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**getVehiclesLocations**](OAIFleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**listContacts**](OAIFleetApi.md#listcontacts) | **GET** /contacts | /contacts
[**listFleet**](OAIFleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
[**patchFleetVehicle**](OAIFleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivateDriverById**](OAIFleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**updateDispatchRouteById**](OAIFleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**updateOrganizationAddress**](OAIFleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**updateVehicles**](OAIFleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data


# **addFleetAddress**
```objc
-(NSURLSessionTask*) addFleetAddressWithAccessToken: (NSString*) accessToken
    addressParam: (OAIInlineObject2*) addressParam
        completionHandler: (void (^)(NSError* error)) handler;
```

/fleet/add_address

This method adds an address book entry to the specified group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject2* addressParam = [[OAIInlineObject2 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/add_address
[apiInstance addFleetAddressWithAccessToken:accessToken
              addressParam:addressParam
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->addFleetAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addressParam** | [**OAIInlineObject2***](OAIInlineObject2.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addOrganizationAddresses**
```objc
-(NSURLSessionTask*) addOrganizationAddressesWithAccessToken: (NSString*) accessToken
    addresses: (OAIInlineObject*) addresses
        completionHandler: (void (^)(NSArray<OAIAddress>* output, NSError* error)) handler;
```

/addresses

Add one or more addresses to the organization

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject* addresses = [[OAIInlineObject alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /addresses
[apiInstance addOrganizationAddressesWithAccessToken:accessToken
              addresses:addresses
          completionHandler: ^(NSArray<OAIAddress>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->addOrganizationAddresses: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addresses** | [**OAIInlineObject***](OAIInlineObject.md)|  | 

### Return type

[**NSArray<OAIAddress>***](OAIAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDispatchRoute**
```objc
-(NSURLSessionTask*) createDispatchRouteWithAccessToken: (NSString*) accessToken
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
        completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;
```

/fleet/dispatch/routes

Create a new dispatch route.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIDispatchRouteCreate* createDispatchRouteParams = [[OAIDispatchRouteCreate alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/dispatch/routes
[apiInstance createDispatchRouteWithAccessToken:accessToken
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(OAIDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->createDispatchRoute: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **createDispatchRouteParams** | [**OAIDispatchRouteCreate***](OAIDispatchRouteCreate.md)|  | 

### Return type

[**OAIDispatchRoute***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDriver**
```objc
-(NSURLSessionTask*) createDriverWithAccessToken: (NSString*) accessToken
    createDriverParam: (OAIDriverForCreate*) createDriverParam
        completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;
```

/fleet/drivers/create

Create a new driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIDriverForCreate* createDriverParam = [[OAIDriverForCreate alloc] init]; // Driver creation body

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/create
[apiInstance createDriverWithAccessToken:accessToken
              createDriverParam:createDriverParam
          completionHandler: ^(OAIDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->createDriver: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **createDriverParam** | [**OAIDriverForCreate***](OAIDriverForCreate.md)| Driver creation body | 

### Return type

[**OAIDriver***](OAIDriver.md)

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
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
        completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @56; // ID of the driver with the associated routes.
OAIDispatchRouteCreate* createDispatchRouteParams = [[OAIDispatchRouteCreate alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[apiInstance createDriverDispatchRouteWithAccessToken:accessToken
              driverId:driverId
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(OAIDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->createDriverDispatchRoute: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverId** | **NSNumber***| ID of the driver with the associated routes. | 
 **createDispatchRouteParams** | [**OAIDispatchRouteCreate***](OAIDispatchRouteCreate.md)|  | 

### Return type

[**OAIDispatchRoute***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDriverDocument**
```objc
-(NSURLSessionTask*) createDriverDocumentWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDocumentParams: (OAIDocumentCreate*) createDocumentParams
        completionHandler: (void (^)(OAIDocument* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @56; // ID of the driver for whom the document is created.
OAIDocumentCreate* createDocumentParams = [[OAIDocumentCreate alloc] init]; // To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/documents
[apiInstance createDriverDocumentWithAccessToken:accessToken
              driverId:driverId
              createDocumentParams:createDocumentParams
          completionHandler: ^(OAIDocument* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->createDriverDocument: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverId** | **NSNumber***| ID of the driver for whom the document is created. | 
 **createDocumentParams** | [**OAIDocumentCreate***](OAIDocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**OAIDocument***](OAIDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDvir**
```objc
-(NSURLSessionTask*) createDvirWithAccessToken: (NSString*) accessToken
    createDvirParam: (OAIInlineObject12*) createDvirParam
        completionHandler: (void (^)(OAIDvirBase* output, NSError* error)) handler;
```

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject12* createDvirParam = [[OAIInlineObject12 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/maintenance/dvirs
[apiInstance createDvirWithAccessToken:accessToken
              createDvirParam:createDvirParam
          completionHandler: ^(OAIDvirBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->createDvir: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **createDvirParam** | [**OAIInlineObject12***](OAIInlineObject12.md)|  | 

### Return type

[**OAIDvirBase***](OAIDvirBase.md)

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
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
        completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* vehicleId = @56; // ID of the vehicle with the associated routes.
OAIDispatchRouteCreate* createDispatchRouteParams = [[OAIDispatchRouteCreate alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[apiInstance createVehicleDispatchRouteWithAccessToken:accessToken
              vehicleId:vehicleId
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(OAIDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->createVehicleDispatchRoute: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleId** | **NSNumber***| ID of the vehicle with the associated routes. | 
 **createDispatchRouteParams** | [**OAIDispatchRouteCreate***](OAIDispatchRouteCreate.md)|  | 

### Return type

[**OAIDispatchRoute***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivateDriver**
```objc
-(NSURLSessionTask*) deactivateDriverWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
        completionHandler: (void (^)(NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* driverIdOrExternalId = @"driverIdOrExternalId_example"; // ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance deactivateDriverWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->deactivateDriver: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverIdOrExternalId** | **NSString***| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
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
NSNumber* routeId = @56; // ID of the dispatch route.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/
[apiInstance deleteDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->deleteDispatchRouteById: %@", error);
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteOrganizationAddress**
```objc
-(NSURLSessionTask*) deleteOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
        completionHandler: (void (^)(NSError* error)) handler;
```

/addresses/{addressId}

Delete an address.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* addressId = @56; // ID of the address/geofence

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /addresses/{addressId}
[apiInstance deleteOrganizationAddressWithAccessToken:accessToken
              addressId:addressId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->deleteOrganizationAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addressId** | **NSNumber***| ID of the address/geofence | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllDispatchRoutes**
```objc
-(NSURLSessionTask*) fetchAllDispatchRoutesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
        completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler;
```

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)
NSNumber* endTime = @56; // Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
NSNumber* duration = @56; // Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/dispatch/routes
[apiInstance fetchAllDispatchRoutesWithAccessToken:accessToken
              groupId:groupId
              endTime:endTime
              duration:duration
          completionHandler: ^(NSArray<OAIDispatchRoute>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->fetchAllDispatchRoutes: %@", error);
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

[**NSArray<OAIDispatchRoute>***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetchAllRouteJobUpdates**
```objc
-(NSURLSessionTask*) fetchAllRouteJobUpdatesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    sequenceId: (NSString*) sequenceId
    include: (NSString*) include
        completionHandler: (void (^)(OAIAllRouteJobUpdates* output, NSError* error)) handler;
```

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)
NSString* sequenceId = @"sequenceId_example"; // Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
NSString* include = @"include_example"; // Optionally set include=route to include route object in response payload. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/dispatch/routes/job_updates
[apiInstance fetchAllRouteJobUpdatesWithAccessToken:accessToken
              groupId:groupId
              sequenceId:sequenceId
              include:include
          completionHandler: ^(OAIAllRouteJobUpdates* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->fetchAllRouteJobUpdates: %@", error);
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

[**OAIAllRouteJobUpdates***](OAIAllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssetCurrentLocations**
```objc
-(NSURLSessionTask*) getAllAssetCurrentLocationsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(OAIInlineResponse2001* output, NSError* error)) handler;
```

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/assets/locations
[apiInstance getAllAssetCurrentLocationsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(OAIInlineResponse2001* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getAllAssetCurrentLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**OAIInlineResponse2001***](OAIInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssets**
```objc
-(NSURLSessionTask*) getAllAssetsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(OAIInlineResponse200* output, NSError* error)) handler;
```

/fleet/assets

Fetch all of the assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/assets
[apiInstance getAllAssetsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(OAIInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getAllAssets: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**OAIInlineResponse200***](OAIInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllDeactivatedDrivers**
```objc
-(NSURLSessionTask*) getAllDeactivatedDriversWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(NSArray<OAIDriver>* output, NSError* error)) handler;
```

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/inactive
[apiInstance getAllDeactivatedDriversWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(NSArray<OAIDriver>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getAllDeactivatedDrivers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**NSArray<OAIDriver>***](OAIDriver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetLocation**
```objc
-(NSURLSessionTask*) getAssetLocationWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @56; // ID of the asset
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/locations
[apiInstance getAssetLocationWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(NSArray<NSObject*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getAssetLocation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **assetId** | **NSNumber***| ID of the asset | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**NSArray<NSObject*>***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetReefer**
```objc
-(NSURLSessionTask*) getAssetReeferWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIAssetReeferResponse* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @56; // ID of the asset
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/reefer
[apiInstance getAssetReeferWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIAssetReeferResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getAssetReefer: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **assetId** | **NSNumber***| ID of the asset | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**OAIAssetReeferResponse***](OAIAssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDeactivatedDriverById**
```objc
-(NSURLSessionTask*) getDeactivatedDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
        completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;
```

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* driverIdOrExternalId = @"driverIdOrExternalId_example"; // ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance getDeactivatedDriverByIdWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
          completionHandler: ^(OAIDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDeactivatedDriverById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverIdOrExternalId** | **NSString***| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**OAIDriver***](OAIDriver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteById**
```objc
-(NSURLSessionTask*) getDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
        completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;
```

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* routeId = @56; // ID of the dispatch route.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}
[apiInstance getDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
          completionHandler: ^(OAIDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDispatchRouteById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **routeId** | **NSNumber***| ID of the dispatch route. | 

### Return type

[**OAIDispatchRoute***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRouteHistory**
```objc
-(NSURLSessionTask*) getDispatchRouteHistoryWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    startTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
        completionHandler: (void (^)(OAIDispatchRouteHistory* output, NSError* error)) handler;
```

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* routeId = @56; // ID of the route with history.
NSNumber* startTime = @56; // Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
NSNumber* endTime = @56; // Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/history
[apiInstance getDispatchRouteHistoryWithAccessToken:accessToken
              routeId:routeId
              startTime:startTime
              endTime:endTime
          completionHandler: ^(OAIDispatchRouteHistory* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDispatchRouteHistory: %@", error);
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

[**OAIDispatchRouteHistory***](OAIDispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByDriverId**
```objc
-(NSURLSessionTask*) getDispatchRoutesByDriverIdWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
        completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @56; // ID of the driver with the associated routes.
NSNumber* endTime = @56; // Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
NSNumber* duration = @56; // Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[apiInstance getDispatchRoutesByDriverIdWithAccessToken:accessToken
              driverId:driverId
              endTime:endTime
              duration:duration
          completionHandler: ^(NSArray<OAIDispatchRoute>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDispatchRoutesByDriverId: %@", error);
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

[**NSArray<OAIDispatchRoute>***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDispatchRoutesByVehicleId**
```objc
-(NSURLSessionTask*) getDispatchRoutesByVehicleIdWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
        completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* vehicleId = @56; // ID of the vehicle with the associated routes.
NSNumber* endTime = @56; // Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
NSNumber* duration = @56; // Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[apiInstance getDispatchRoutesByVehicleIdWithAccessToken:accessToken
              vehicleId:vehicleId
              endTime:endTime
              duration:duration
          completionHandler: ^(NSArray<OAIDispatchRoute>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDispatchRoutesByVehicleId: %@", error);
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

[**NSArray<OAIDispatchRoute>***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverById**
```objc
-(NSURLSessionTask*) getDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
        completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* driverIdOrExternalId = @"driverIdOrExternalId_example"; // ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance getDriverByIdWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
          completionHandler: ^(OAIDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDriverById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverIdOrExternalId** | **NSString***| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**OAIDriver***](OAIDriver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentTypesByOrgId**
```objc
-(NSURLSessionTask*) getDriverDocumentTypesByOrgIdWithCompletionHandler: 
        (void (^)(NSArray<OAIDocumentType>* output, NSError* error)) handler;
```

/fleet/drivers/document_types

Fetch all of the document types.

### Example 
```objc


OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/document_types
[apiInstance getDriverDocumentTypesByOrgIdWithCompletionHandler: 
          ^(NSArray<OAIDocumentType>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDriverDocumentTypesByOrgId: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<OAIDocumentType>***](OAIDocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentsByOrgId**
```objc
-(NSURLSessionTask*) getDriverDocumentsByOrgIdWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
        completionHandler: (void (^)(NSArray<OAIDocument>* output, NSError* error)) handler;
```

/fleet/drivers/documents

Fetch all of the documents.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* endMs = @56; // Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
NSNumber* durationMs = @56; // Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/documents
[apiInstance getDriverDocumentsByOrgIdWithAccessToken:accessToken
              endMs:endMs
              durationMs:durationMs
          completionHandler: ^(NSArray<OAIDocument>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDriverDocumentsByOrgId: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **endMs** | **NSNumber***| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] 
 **durationMs** | **NSNumber***| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] 

### Return type

[**NSArray<OAIDocument>***](OAIDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverSafetyScore**
```objc
-(NSURLSessionTask*) getDriverSafetyScoreWithDriverId: (NSNumber*) driverId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIDriverSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```objc

NSNumber* driverId = @56; // ID of the driver
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/{driverId:[0-9]+}/safety/score
[apiInstance getDriverSafetyScoreWithDriverId:driverId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIDriverSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDriverSafetyScore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **NSNumber***| ID of the driver | 
 **accessToken** | **NSString***| Samsara API access token. | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**OAIDriverSafetyScoreResponse***](OAIDriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDvirs**
```objc
-(NSURLSessionTask*) getDvirsWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(OAIDvirListResponse* output, NSError* error)) handler;
```

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* endMs = @56; // time in millis until the last dvir log.
NSNumber* durationMs = @56; // time in millis which corresponds to the duration before the end_ms.
NSNumber* groupId = @56; // Group ID to query. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/maintenance/dvirs
[apiInstance getDvirsWithAccessToken:accessToken
              endMs:endMs
              durationMs:durationMs
              groupId:groupId
          completionHandler: ^(OAIDvirListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getDvirs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **endMs** | **NSNumber***| time in millis until the last dvir log. | 
 **durationMs** | **NSNumber***| time in millis which corresponds to the duration before the end_ms. | 
 **groupId** | **NSNumber***| Group ID to query. | [optional] 

### Return type

[**OAIDvirListResponse***](OAIDvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDrivers**
```objc
-(NSURLSessionTask*) getFleetDriversWithAccessToken: (NSString*) accessToken
    groupDriversParam: (OAIInlineObject3*) groupDriversParam
        completionHandler: (void (^)(OAIDriversResponse* output, NSError* error)) handler;
```

/fleet/drivers

Get all the drivers for the specified group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject3* groupDriversParam = [[OAIInlineObject3 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers
[apiInstance getFleetDriversWithAccessToken:accessToken
              groupDriversParam:groupDriversParam
          completionHandler: ^(OAIDriversResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetDrivers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupDriversParam** | [**OAIInlineObject3***](OAIInlineObject3.md)|  | 

### Return type

[**OAIDriversResponse***](OAIDriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDriversHosDailyLogs**
```objc
-(NSURLSessionTask*) getFleetDriversHosDailyLogsWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    hosLogsParam: (OAIInlineObject6*) hosLogsParam
        completionHandler: (void (^)(OAIDriverDailyLogResponse* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @56; // ID of the driver with HOS logs.
OAIInlineObject6* hosLogsParam = [[OAIInlineObject6 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[apiInstance getFleetDriversHosDailyLogsWithAccessToken:accessToken
              driverId:driverId
              hosLogsParam:hosLogsParam
          completionHandler: ^(OAIDriverDailyLogResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetDriversHosDailyLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverId** | **NSNumber***| ID of the driver with HOS logs. | 
 **hosLogsParam** | [**OAIInlineObject6***](OAIInlineObject6.md)|  | 

### Return type

[**OAIDriverDailyLogResponse***](OAIDriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDriversSummary**
```objc
-(NSURLSessionTask*) getFleetDriversSummaryWithAccessToken: (NSString*) accessToken
    driversSummaryParam: (OAIInlineObject5*) driversSummaryParam
    snapToDayBounds: (NSNumber*) snapToDayBounds
        completionHandler: (void (^)(OAIDriversSummaryResponse* output, NSError* error)) handler;
```

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject5* driversSummaryParam = [[OAIInlineObject5 alloc] init]; // 
NSNumber* snapToDayBounds = @56; // Snap query result to HOS day boundaries. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/summary
[apiInstance getFleetDriversSummaryWithAccessToken:accessToken
              driversSummaryParam:driversSummaryParam
              snapToDayBounds:snapToDayBounds
          completionHandler: ^(OAIDriversSummaryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetDriversSummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driversSummaryParam** | [**OAIInlineObject5***](OAIInlineObject5.md)|  | 
 **snapToDayBounds** | **NSNumber***| Snap query result to HOS day boundaries. | [optional] 

### Return type

[**OAIDriversSummaryResponse***](OAIDriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosAuthenticationLogs**
```objc
-(NSURLSessionTask*) getFleetHosAuthenticationLogsWithAccessToken: (NSString*) accessToken
    hosAuthenticationLogsParam: (OAIInlineObject7*) hosAuthenticationLogsParam
        completionHandler: (void (^)(OAIHosAuthenticationLogsResponse* output, NSError* error)) handler;
```

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject7* hosAuthenticationLogsParam = [[OAIInlineObject7 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/hos_authentication_logs
[apiInstance getFleetHosAuthenticationLogsWithAccessToken:accessToken
              hosAuthenticationLogsParam:hosAuthenticationLogsParam
          completionHandler: ^(OAIHosAuthenticationLogsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetHosAuthenticationLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **hosAuthenticationLogsParam** | [**OAIInlineObject7***](OAIInlineObject7.md)|  | 

### Return type

[**OAIHosAuthenticationLogsResponse***](OAIHosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosLogs**
```objc
-(NSURLSessionTask*) getFleetHosLogsWithAccessToken: (NSString*) accessToken
    hosLogsParam: (OAIInlineObject8*) hosLogsParam
        completionHandler: (void (^)(OAIHosLogsResponse* output, NSError* error)) handler;
```

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject8* hosLogsParam = [[OAIInlineObject8 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/hos_logs
[apiInstance getFleetHosLogsWithAccessToken:accessToken
              hosLogsParam:hosLogsParam
          completionHandler: ^(OAIHosLogsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetHosLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **hosLogsParam** | [**OAIInlineObject8***](OAIInlineObject8.md)|  | 

### Return type

[**OAIHosLogsResponse***](OAIHosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosLogsSummary**
```objc
-(NSURLSessionTask*) getFleetHosLogsSummaryWithAccessToken: (NSString*) accessToken
    hosLogsParam: (OAIInlineObject9*) hosLogsParam
        completionHandler: (void (^)(OAIHosLogsSummaryResponse* output, NSError* error)) handler;
```

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject9* hosLogsParam = [[OAIInlineObject9 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/hos_logs_summary
[apiInstance getFleetHosLogsSummaryWithAccessToken:accessToken
              hosLogsParam:hosLogsParam
          completionHandler: ^(OAIHosLogsSummaryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetHosLogsSummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **hosLogsParam** | [**OAIInlineObject9***](OAIInlineObject9.md)|  | 

### Return type

[**OAIHosLogsSummaryResponse***](OAIHosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetLocations**
```objc
-(NSURLSessionTask*) getFleetLocationsWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject11*) groupParam
        completionHandler: (void (^)(OAIInlineResponse2003* output, NSError* error)) handler;
```

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject11* groupParam = [[OAIInlineObject11 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/locations
[apiInstance getFleetLocationsWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(OAIInlineResponse2003* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**OAIInlineObject11***](OAIInlineObject11.md)|  | 

### Return type

[**OAIInlineResponse2003***](OAIInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetMaintenanceList**
```objc
-(NSURLSessionTask*) getFleetMaintenanceListWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject13*) groupParam
        completionHandler: (void (^)(OAIInlineResponse2004* output, NSError* error)) handler;
```

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject13* groupParam = [[OAIInlineObject13 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/maintenance/list
[apiInstance getFleetMaintenanceListWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(OAIInlineResponse2004* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetMaintenanceList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**OAIInlineObject13***](OAIInlineObject13.md)|  | 

### Return type

[**OAIInlineResponse2004***](OAIInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetTrips**
```objc
-(NSURLSessionTask*) getFleetTripsWithAccessToken: (NSString*) accessToken
    tripsParam: (OAIInlineObject15*) tripsParam
        completionHandler: (void (^)(OAITripResponse* output, NSError* error)) handler;
```

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject15* tripsParam = [[OAIInlineObject15 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/trips
[apiInstance getFleetTripsWithAccessToken:accessToken
              tripsParam:tripsParam
          completionHandler: ^(OAITripResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetTrips: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tripsParam** | [**OAIInlineObject15***](OAIInlineObject15.md)|  | 

### Return type

[**OAITripResponse***](OAITripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetVehicle**
```objc
-(NSURLSessionTask*) getFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
        completionHandler: (void (^)(OAIFleetVehicleResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* vehicleIdOrExternalId = @"vehicleIdOrExternalId_example"; // ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance getFleetVehicleWithAccessToken:accessToken
              vehicleIdOrExternalId:vehicleIdOrExternalId
          completionHandler: ^(OAIFleetVehicleResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getFleetVehicle: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleIdOrExternalId** | **NSString***| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**OAIFleetVehicleResponse***](OAIFleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationAddress**
```objc
-(NSURLSessionTask*) getOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
        completionHandler: (void (^)(OAIAddress* output, NSError* error)) handler;
```

/addresses/{addressId}

Fetch an address by its id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* addressId = @56; // ID of the address/geofence

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /addresses/{addressId}
[apiInstance getOrganizationAddressWithAccessToken:accessToken
              addressId:addressId
          completionHandler: ^(OAIAddress* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getOrganizationAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addressId** | **NSNumber***| ID of the address/geofence | 

### Return type

[**OAIAddress***](OAIAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationAddresses**
```objc
-(NSURLSessionTask*) getOrganizationAddressesWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<OAIAddress>* output, NSError* error)) handler;
```

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /addresses
[apiInstance getOrganizationAddressesWithAccessToken:accessToken
          completionHandler: ^(NSArray<OAIAddress>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getOrganizationAddresses: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<OAIAddress>***](OAIAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationContact**
```objc
-(NSURLSessionTask*) getOrganizationContactWithAccessToken: (NSString*) accessToken
    contactId: (NSNumber*) contactId
        completionHandler: (void (^)(OAIContact* output, NSError* error)) handler;
```

/contacts/{contact_id}

Fetch a contact by its id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* contactId = @56; // ID of the contact

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /contacts/{contact_id}
[apiInstance getOrganizationContactWithAccessToken:accessToken
              contactId:contactId
          completionHandler: ^(OAIContact* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getOrganizationContact: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **contactId** | **NSNumber***| ID of the contact | 

### Return type

[**OAIContact***](OAIContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleHarshEvent**
```objc
-(NSURLSessionTask*) getVehicleHarshEventWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    timestamp: (NSNumber*) timestamp
        completionHandler: (void (^)(OAIVehicleHarshEventResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```objc

NSNumber* vehicleId = @56; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* timestamp = @56; // Timestamp in milliseconds representing the timestamp of a harsh event.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[apiInstance getVehicleHarshEventWithVehicleId:vehicleId
              accessToken:accessToken
              timestamp:timestamp
          completionHandler: ^(OAIVehicleHarshEventResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getVehicleHarshEvent: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **NSNumber***| ID of the vehicle | 
 **accessToken** | **NSString***| Samsara API access token. | 
 **timestamp** | **NSNumber***| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**OAIVehicleHarshEventResponse***](OAIVehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleLocations**
```objc
-(NSURLSessionTask*) getVehicleLocationsWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(NSArray<OAIFleetVehicleLocation>* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* vehicleId = @56; // ID of the vehicle with the associated routes.
NSNumber* startMs = @56; // Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
NSNumber* endMs = @56; // Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[apiInstance getVehicleLocationsWithAccessToken:accessToken
              vehicleId:vehicleId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(NSArray<OAIFleetVehicleLocation>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getVehicleLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleId** | **NSNumber***| ID of the vehicle with the associated routes. | 
 **startMs** | **NSNumber***| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | 
 **endMs** | **NSNumber***| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | 

### Return type

[**NSArray<OAIFleetVehicleLocation>***](OAIFleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleSafetyScore**
```objc
-(NSURLSessionTask*) getVehicleSafetyScoreWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIVehicleSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```objc

NSNumber* vehicleId = @56; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[apiInstance getVehicleSafetyScoreWithVehicleId:vehicleId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIVehicleSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getVehicleSafetyScore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **NSNumber***| ID of the vehicle | 
 **accessToken** | **NSString***| Samsara API access token. | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**OAIVehicleSafetyScoreResponse***](OAIVehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleStats**
```objc
-(NSURLSessionTask*) getVehicleStatsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    series: (NSString*) series
    tagIds: (NSString*) tagIds
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIInlineResponse2005* output, NSError* error)) handler;
```

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @56; // Time in Unix epoch milliseconds for the start of the query.
NSNumber* endMs = @56; // Time in Unix epoch milliseconds for the end of the query.
NSString* series = @"series_example"; // Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 (optional)
NSString* tagIds = @"tagIds_example"; // Comma-separated list of tag ids. Example: tagIds=1,2,3 (optional)
NSString* startingAfter = @"startingAfter_example"; // Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
NSString* endingBefore = @"endingBefore_example"; // Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
NSNumber* limit = @56; // Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/stats
[apiInstance getVehicleStatsWithAccessToken:accessToken
              startMs:startMs
              endMs:endMs
              series:series
              tagIds:tagIds
              startingAfter:startingAfter
              endingBefore:endingBefore
              limit:limit
          completionHandler: ^(OAIInlineResponse2005* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getVehicleStats: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **startMs** | **NSNumber***| Time in Unix epoch milliseconds for the start of the query. | 
 **endMs** | **NSNumber***| Time in Unix epoch milliseconds for the end of the query. | 
 **series** | **NSString***| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] 
 **tagIds** | **NSString***| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] 
 **startingAfter** | **NSString***| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **endingBefore** | **NSString***| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **NSNumber***| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**OAIInlineResponse2005***](OAIInlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehiclesLocations**
```objc
-(NSURLSessionTask*) getVehiclesLocationsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler;
```

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @56; // Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
NSNumber* endMs = @56; // Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/locations
[apiInstance getVehiclesLocationsWithAccessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(NSArray<NSObject*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->getVehiclesLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **startMs** | **NSNumber***| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | 
 **endMs** | **NSNumber***| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | 

### Return type

**NSArray<NSObject*>***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listContacts**
```objc
-(NSURLSessionTask*) listContactsWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<OAIContact>* output, NSError* error)) handler;
```

/contacts

Fetch all contacts for the organization.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /contacts
[apiInstance listContactsWithAccessToken:accessToken
          completionHandler: ^(NSArray<OAIContact>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->listContacts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<OAIContact>***](OAIContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFleet**
```objc
-(NSURLSessionTask*) listFleetWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject10*) groupParam
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIInlineResponse2002* output, NSError* error)) handler;
```

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject10* groupParam = [[OAIInlineObject10 alloc] init]; // 
NSString* startingAfter = @"startingAfter_example"; // Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
NSString* endingBefore = @"endingBefore_example"; // Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
NSNumber* limit = @56; // Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/list
[apiInstance listFleetWithAccessToken:accessToken
              groupParam:groupParam
              startingAfter:startingAfter
              endingBefore:endingBefore
              limit:limit
          completionHandler: ^(OAIInlineResponse2002* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->listFleet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**OAIInlineObject10***](OAIInlineObject10.md)|  | 
 **startingAfter** | **NSString***| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **endingBefore** | **NSString***| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **NSNumber***| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**OAIInlineResponse2002***](OAIInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchFleetVehicle**
```objc
-(NSURLSessionTask*) patchFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
    data: (OAIInlineObject16*) data
        completionHandler: (void (^)(OAIFleetVehicleResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* vehicleIdOrExternalId = @"vehicleIdOrExternalId_example"; // ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
OAIInlineObject16* data = [[OAIInlineObject16 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance patchFleetVehicleWithAccessToken:accessToken
              vehicleIdOrExternalId:vehicleIdOrExternalId
              data:data
          completionHandler: ^(OAIFleetVehicleResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->patchFleetVehicle: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleIdOrExternalId** | **NSString***| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
 **data** | [**OAIInlineObject16***](OAIInlineObject16.md)|  | 

### Return type

[**OAIFleetVehicleResponse***](OAIFleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivateDriverById**
```objc
-(NSURLSessionTask*) reactivateDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    reactivateDriverParam: (OAIInlineObject4*) reactivateDriverParam
        completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler;
```

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* driverIdOrExternalId = @"driverIdOrExternalId_example"; // ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
OAIInlineObject4* reactivateDriverParam = [[OAIInlineObject4 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance reactivateDriverByIdWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
              reactivateDriverParam:reactivateDriverParam
          completionHandler: ^(OAIDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->reactivateDriverById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverIdOrExternalId** | **NSString***| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
 **reactivateDriverParam** | [**OAIInlineObject4***](OAIInlineObject4.md)|  | 

### Return type

[**OAIDriver***](OAIDriver.md)

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
    updateDispatchRouteParams: (OAIDispatchRoute*) updateDispatchRouteParams
        completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler;
```

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* routeId = @56; // ID of the dispatch route.
OAIDispatchRoute* updateDispatchRouteParams = [[OAIDispatchRoute alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/
[apiInstance updateDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
              updateDispatchRouteParams:updateDispatchRouteParams
          completionHandler: ^(OAIDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->updateDispatchRouteById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **routeId** | **NSNumber***| ID of the dispatch route. | 
 **updateDispatchRouteParams** | [**OAIDispatchRoute***](OAIDispatchRoute.md)|  | 

### Return type

[**OAIDispatchRoute***](OAIDispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateOrganizationAddress**
```objc
-(NSURLSessionTask*) updateOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    address: (OAIInlineObject1*) address
        completionHandler: (void (^)(NSError* error)) handler;
```

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* addressId = @56; // ID of the address/geofence
OAIInlineObject1* address = [[OAIInlineObject1 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /addresses/{addressId}
[apiInstance updateOrganizationAddressWithAccessToken:accessToken
              addressId:addressId
              address:address
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->updateOrganizationAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addressId** | **NSNumber***| ID of the address/geofence | 
 **address** | [**OAIInlineObject1***](OAIInlineObject1.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateVehicles**
```objc
-(NSURLSessionTask*) updateVehiclesWithAccessToken: (NSString*) accessToken
    vehicleUpdateParam: (OAIInlineObject14*) vehicleUpdateParam
        completionHandler: (void (^)(NSError* error)) handler;
```

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAIInlineObject14* vehicleUpdateParam = [[OAIInlineObject14 alloc] init]; // 

OAIFleetApi*apiInstance = [[OAIFleetApi alloc] init];

// /fleet/set_data
[apiInstance updateVehiclesWithAccessToken:accessToken
              vehicleUpdateParam:vehicleUpdateParam
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIFleetApi->updateVehicles: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleUpdateParam** | [**OAIInlineObject14***](OAIInlineObject14.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

