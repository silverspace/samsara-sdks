# SWGFleetApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFleetAddress**](SWGFleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
[**addOrganizationAddresses**](SWGFleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
[**createDispatchRoute**](SWGFleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriver**](SWGFleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**createDriverDispatchRoute**](SWGFleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createDriverDocument**](SWGFleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**createDvir**](SWGFleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**createVehicleDispatchRoute**](SWGFleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivateDriver**](SWGFleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**deleteDispatchRouteById**](SWGFleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**deleteOrganizationAddress**](SWGFleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**fetchAllDispatchRoutes**](SWGFleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](SWGFleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getAllAssetCurrentLocations**](SWGFleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](SWGFleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
[**getAllDeactivatedDrivers**](SWGFleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**getAssetLocation**](SWGFleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](SWGFleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**getDeactivatedDriverById**](SWGFleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDispatchRouteById**](SWGFleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](SWGFleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](SWGFleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](SWGFleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**getDriverById**](SWGFleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDriverDocumentTypesByOrgId**](SWGFleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**getDriverDocumentsByOrgId**](SWGFleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**getDriverSafetyScore**](SWGFleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getDvirs**](SWGFleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**getFleetDrivers**](SWGFleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
[**getFleetDriversHosDailyLogs**](SWGFleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**getFleetDriversSummary**](SWGFleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**getFleetHosAuthenticationLogs**](SWGFleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**getFleetHosLogs**](SWGFleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**getFleetHosLogsSummary**](SWGFleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**getFleetLocations**](SWGFleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
[**getFleetMaintenanceList**](SWGFleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**getFleetTrips**](SWGFleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
[**getFleetVehicle**](SWGFleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getOrganizationAddress**](SWGFleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**getOrganizationAddresses**](SWGFleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
[**getOrganizationContact**](SWGFleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**getVehicleHarshEvent**](SWGFleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleLocations**](SWGFleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**getVehicleSafetyScore**](SWGFleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**getVehicleStats**](SWGFleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**getVehiclesLocations**](SWGFleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**listContacts**](SWGFleetApi.md#listcontacts) | **GET** /contacts | /contacts
[**listFleet**](SWGFleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
[**patchFleetVehicle**](SWGFleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivateDriverById**](SWGFleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**updateDispatchRouteById**](SWGFleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**updateOrganizationAddress**](SWGFleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**updateVehicles**](SWGFleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data


# **addFleetAddress**
```objc
-(NSURLSessionTask*) addFleetAddressWithAccessToken: (NSString*) accessToken
    addressParam: (SWGAddressParam*) addressParam
        completionHandler: (void (^)(NSError* error)) handler;
```

/fleet/add_address

This method adds an address book entry to the specified group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGAddressParam* addressParam = [[SWGAddressParam alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/add_address
[apiInstance addFleetAddressWithAccessToken:accessToken
              addressParam:addressParam
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->addFleetAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addressParam** | [**SWGAddressParam***](SWGAddressParam.md)|  | 

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
    addresses: (SWGAddresses*) addresses
        completionHandler: (void (^)(NSArray<SWGAddress>* output, NSError* error)) handler;
```

/addresses

Add one or more addresses to the organization

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGAddresses* addresses = [[SWGAddresses alloc] init]; // List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /addresses
[apiInstance addOrganizationAddressesWithAccessToken:accessToken
              addresses:addresses
          completionHandler: ^(NSArray<SWGAddress>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->addOrganizationAddresses: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addresses** | [**SWGAddresses***](SWGAddresses.md)| List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. | 

### Return type

[**NSArray<SWGAddress>***](SWGAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/dispatch/routes
[apiInstance createDispatchRouteWithAccessToken:accessToken
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->createDispatchRoute: %@", error);
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

# **createDriver**
```objc
-(NSURLSessionTask*) createDriverWithAccessToken: (NSString*) accessToken
    createDriverParam: (SWGDriverForCreate*) createDriverParam
        completionHandler: (void (^)(SWGDriver* output, NSError* error)) handler;
```

/fleet/drivers/create

Create a new driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGDriverForCreate* createDriverParam = [[SWGDriverForCreate alloc] init]; // Driver creation body

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/create
[apiInstance createDriverWithAccessToken:accessToken
              createDriverParam:createDriverParam
          completionHandler: ^(SWGDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->createDriver: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **createDriverParam** | [**SWGDriverForCreate***](SWGDriverForCreate.md)| Driver creation body | 

### Return type

[**SWGDriver***](SWGDriver.md)

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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[apiInstance createDriverDispatchRouteWithAccessToken:accessToken
              driverId:driverId
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->createDriverDispatchRoute: %@", error);
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

# **createDriverDocument**
```objc
-(NSURLSessionTask*) createDriverDocumentWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDocumentParams: (SWGDocumentCreate*) createDocumentParams
        completionHandler: (void (^)(SWGDocument* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @789; // ID of the driver for whom the document is created.
SWGDocumentCreate* createDocumentParams = [[SWGDocumentCreate alloc] init]; // To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/documents
[apiInstance createDriverDocumentWithAccessToken:accessToken
              driverId:driverId
              createDocumentParams:createDocumentParams
          completionHandler: ^(SWGDocument* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->createDriverDocument: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverId** | **NSNumber***| ID of the driver for whom the document is created. | 
 **createDocumentParams** | [**SWGDocumentCreate***](SWGDocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**SWGDocument***](SWGDocument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createDvir**
```objc
-(NSURLSessionTask*) createDvirWithAccessToken: (NSString*) accessToken
    createDvirParam: (SWGCreateDvirParam*) createDvirParam
        completionHandler: (void (^)(SWGDvirBase* output, NSError* error)) handler;
```

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGCreateDvirParam* createDvirParam = [[SWGCreateDvirParam alloc] init]; // DVIR creation body

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/maintenance/dvirs
[apiInstance createDvirWithAccessToken:accessToken
              createDvirParam:createDvirParam
          completionHandler: ^(SWGDvirBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->createDvir: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **createDvirParam** | [**SWGCreateDvirParam***](SWGCreateDvirParam.md)| DVIR creation body | 

### Return type

[**SWGDvirBase***](SWGDvirBase.md)

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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[apiInstance createVehicleDispatchRouteWithAccessToken:accessToken
              vehicleId:vehicleId
              createDispatchRouteParams:createDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->createVehicleDispatchRoute: %@", error);
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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance deactivateDriverWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->deactivateDriver: %@", error);
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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/
[apiInstance deleteDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->deleteDispatchRouteById: %@", error);
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
NSNumber* addressId = @789; // ID of the address/geofence

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /addresses/{addressId}
[apiInstance deleteOrganizationAddressWithAccessToken:accessToken
              addressId:addressId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->deleteOrganizationAddress: %@", error);
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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

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
                            NSLog(@"Error calling SWGFleetApi->fetchAllDispatchRoutes: %@", error);
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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

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
                            NSLog(@"Error calling SWGFleetApi->fetchAllRouteJobUpdates: %@", error);
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

# **getAllAssetCurrentLocations**
```objc
-(NSURLSessionTask*) getAllAssetCurrentLocationsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(SWGInlineResponse2001* output, NSError* error)) handler;
```

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/assets/locations
[apiInstance getAllAssetCurrentLocationsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(SWGInlineResponse2001* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getAllAssetCurrentLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**SWGInlineResponse2001***](SWGInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssets**
```objc
-(NSURLSessionTask*) getAllAssetsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;
```

/fleet/assets

Fetch all of the assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/assets
[apiInstance getAllAssetsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(SWGInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getAllAssets: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**SWGInlineResponse200***](SWGInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllDeactivatedDrivers**
```objc
-(NSURLSessionTask*) getAllDeactivatedDriversWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(NSArray<SWGDriver>* output, NSError* error)) handler;
```

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/inactive
[apiInstance getAllDeactivatedDriversWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(NSArray<SWGDriver>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getAllDeactivatedDrivers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**NSArray<SWGDriver>***](SWGDriver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetLocation**
```objc
-(NSURLSessionTask*) getAssetLocationWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGAssetLocationResponse* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @789; // ID of the asset
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/locations
[apiInstance getAssetLocationWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGAssetLocationResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getAssetLocation: %@", error);
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

[**SWGAssetLocationResponse***](SWGAssetLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetReefer**
```objc
-(NSURLSessionTask*) getAssetReeferWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGAssetReeferResponse* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @789; // ID of the asset
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/reefer
[apiInstance getAssetReeferWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGAssetReeferResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getAssetReefer: %@", error);
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

[**SWGAssetReeferResponse***](SWGAssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDeactivatedDriverById**
```objc
-(NSURLSessionTask*) getDeactivatedDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
        completionHandler: (void (^)(SWGDriver* output, NSError* error)) handler;
```

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* driverIdOrExternalId = @"driverIdOrExternalId_example"; // ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance getDeactivatedDriverByIdWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
          completionHandler: ^(SWGDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getDeactivatedDriverById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverIdOrExternalId** | **NSString***| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**SWGDriver***](SWGDriver.md)

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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}
[apiInstance getDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getDispatchRouteById: %@", error);
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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

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
                            NSLog(@"Error calling SWGFleetApi->getDispatchRouteHistory: %@", error);
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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

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
                            NSLog(@"Error calling SWGFleetApi->getDispatchRoutesByDriverId: %@", error);
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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

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
                            NSLog(@"Error calling SWGFleetApi->getDispatchRoutesByVehicleId: %@", error);
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

# **getDriverById**
```objc
-(NSURLSessionTask*) getDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
        completionHandler: (void (^)(SWGCurrentDriver* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* driverIdOrExternalId = @"driverIdOrExternalId_example"; // ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance getDriverByIdWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
          completionHandler: ^(SWGCurrentDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getDriverById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverIdOrExternalId** | **NSString***| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**SWGCurrentDriver***](SWGCurrentDriver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentTypesByOrgId**
```objc
-(NSURLSessionTask*) getDriverDocumentTypesByOrgIdWithCompletionHandler: 
        (void (^)(SWGDocumentTypes* output, NSError* error)) handler;
```

/fleet/drivers/document_types

Fetch all of the document types.

### Example 
```objc


SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/document_types
[apiInstance getDriverDocumentTypesByOrgIdWithCompletionHandler: 
          ^(SWGDocumentTypes* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getDriverDocumentTypesByOrgId: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SWGDocumentTypes***](SWGDocumentTypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentsByOrgId**
```objc
-(NSURLSessionTask*) getDriverDocumentsByOrgIdWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
        completionHandler: (void (^)(SWGDocuments* output, NSError* error)) handler;
```

/fleet/drivers/documents

Fetch all of the documents.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* endMs = @789; // Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
NSNumber* durationMs = @789; // Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/documents
[apiInstance getDriverDocumentsByOrgIdWithAccessToken:accessToken
              endMs:endMs
              durationMs:durationMs
          completionHandler: ^(SWGDocuments* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getDriverDocumentsByOrgId: %@", error);
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

[**SWGDocuments***](SWGDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverSafetyScore**
```objc
-(NSURLSessionTask*) getDriverSafetyScoreWithDriverId: (NSNumber*) driverId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGDriverSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```objc

NSNumber* driverId = @789; // ID of the driver
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/{driverId:[0-9]+}/safety/score
[apiInstance getDriverSafetyScoreWithDriverId:driverId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGDriverSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getDriverSafetyScore: %@", error);
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

[**SWGDriverSafetyScoreResponse***](SWGDriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDvirs**
```objc
-(NSURLSessionTask*) getDvirsWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(SWGDvirListResponse* output, NSError* error)) handler;
```

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* endMs = @56; // time in millis until the last dvir log.
NSNumber* durationMs = @56; // time in millis which corresponds to the duration before the end_ms.
NSNumber* groupId = @56; // Group ID to query. (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/maintenance/dvirs
[apiInstance getDvirsWithAccessToken:accessToken
              endMs:endMs
              durationMs:durationMs
              groupId:groupId
          completionHandler: ^(SWGDvirListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getDvirs: %@", error);
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

[**SWGDvirListResponse***](SWGDvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDrivers**
```objc
-(NSURLSessionTask*) getFleetDriversWithAccessToken: (NSString*) accessToken
    groupDriversParam: (SWGGroupDriversParam*) groupDriversParam
        completionHandler: (void (^)(SWGDriversResponse* output, NSError* error)) handler;
```

/fleet/drivers

Get all the drivers for the specified group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGGroupDriversParam* groupDriversParam = [[SWGGroupDriversParam alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers
[apiInstance getFleetDriversWithAccessToken:accessToken
              groupDriversParam:groupDriversParam
          completionHandler: ^(SWGDriversResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetDrivers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupDriversParam** | [**SWGGroupDriversParam***](SWGGroupDriversParam.md)|  | 

### Return type

[**SWGDriversResponse***](SWGDriversResponse.md)

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
    hosLogsParam: (SWGHosLogsParam*) hosLogsParam
        completionHandler: (void (^)(SWGDriverDailyLogResponse* output, NSError* error)) handler;
```

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* driverId = @789; // ID of the driver with HOS logs.
SWGHosLogsParam* hosLogsParam = [[SWGHosLogsParam alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[apiInstance getFleetDriversHosDailyLogsWithAccessToken:accessToken
              driverId:driverId
              hosLogsParam:hosLogsParam
          completionHandler: ^(SWGDriverDailyLogResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetDriversHosDailyLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverId** | **NSNumber***| ID of the driver with HOS logs. | 
 **hosLogsParam** | [**SWGHosLogsParam***](SWGHosLogsParam.md)|  | 

### Return type

[**SWGDriverDailyLogResponse***](SWGDriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetDriversSummary**
```objc
-(NSURLSessionTask*) getFleetDriversSummaryWithAccessToken: (NSString*) accessToken
    driversSummaryParam: (SWGDriversSummaryParam*) driversSummaryParam
    snapToDayBounds: (NSNumber*) snapToDayBounds
        completionHandler: (void (^)(SWGDriversSummaryResponse* output, NSError* error)) handler;
```

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGDriversSummaryParam* driversSummaryParam = [[SWGDriversSummaryParam alloc] init]; // Org ID and time range to query.
NSNumber* snapToDayBounds = @true; // Snap query result to HOS day boundaries. (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/summary
[apiInstance getFleetDriversSummaryWithAccessToken:accessToken
              driversSummaryParam:driversSummaryParam
              snapToDayBounds:snapToDayBounds
          completionHandler: ^(SWGDriversSummaryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetDriversSummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driversSummaryParam** | [**SWGDriversSummaryParam***](SWGDriversSummaryParam.md)| Org ID and time range to query. | 
 **snapToDayBounds** | **NSNumber***| Snap query result to HOS day boundaries. | [optional] 

### Return type

[**SWGDriversSummaryResponse***](SWGDriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosAuthenticationLogs**
```objc
-(NSURLSessionTask*) getFleetHosAuthenticationLogsWithAccessToken: (NSString*) accessToken
    hosAuthenticationLogsParam: (SWGHosAuthenticationLogsParam*) hosAuthenticationLogsParam
        completionHandler: (void (^)(SWGHosAuthenticationLogsResponse* output, NSError* error)) handler;
```

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGHosAuthenticationLogsParam* hosAuthenticationLogsParam = [[SWGHosAuthenticationLogsParam alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/hos_authentication_logs
[apiInstance getFleetHosAuthenticationLogsWithAccessToken:accessToken
              hosAuthenticationLogsParam:hosAuthenticationLogsParam
          completionHandler: ^(SWGHosAuthenticationLogsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetHosAuthenticationLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **hosAuthenticationLogsParam** | [**SWGHosAuthenticationLogsParam***](SWGHosAuthenticationLogsParam.md)|  | 

### Return type

[**SWGHosAuthenticationLogsResponse***](SWGHosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosLogs**
```objc
-(NSURLSessionTask*) getFleetHosLogsWithAccessToken: (NSString*) accessToken
    hosLogsParam: (SWGHosLogsParam1*) hosLogsParam
        completionHandler: (void (^)(SWGHosLogsResponse* output, NSError* error)) handler;
```

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGHosLogsParam1* hosLogsParam = [[SWGHosLogsParam1 alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/hos_logs
[apiInstance getFleetHosLogsWithAccessToken:accessToken
              hosLogsParam:hosLogsParam
          completionHandler: ^(SWGHosLogsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetHosLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **hosLogsParam** | [**SWGHosLogsParam1***](SWGHosLogsParam1.md)|  | 

### Return type

[**SWGHosLogsResponse***](SWGHosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetHosLogsSummary**
```objc
-(NSURLSessionTask*) getFleetHosLogsSummaryWithAccessToken: (NSString*) accessToken
    hosLogsParam: (SWGHosLogsParam2*) hosLogsParam
        completionHandler: (void (^)(SWGHosLogsSummaryResponse* output, NSError* error)) handler;
```

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGHosLogsParam2* hosLogsParam = [[SWGHosLogsParam2 alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/hos_logs_summary
[apiInstance getFleetHosLogsSummaryWithAccessToken:accessToken
              hosLogsParam:hosLogsParam
          completionHandler: ^(SWGHosLogsSummaryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetHosLogsSummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **hosLogsParam** | [**SWGHosLogsParam2***](SWGHosLogsParam2.md)|  | 

### Return type

[**SWGHosLogsSummaryResponse***](SWGHosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetLocations**
```objc
-(NSURLSessionTask*) getFleetLocationsWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
        completionHandler: (void (^)(SWGInlineResponse2003* output, NSError* error)) handler;
```

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGGroupParam* groupParam = [[SWGGroupParam alloc] init]; // Group ID to query.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/locations
[apiInstance getFleetLocationsWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(SWGInlineResponse2003* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**SWGGroupParam***](SWGGroupParam.md)| Group ID to query. | 

### Return type

[**SWGInlineResponse2003***](SWGInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetMaintenanceList**
```objc
-(NSURLSessionTask*) getFleetMaintenanceListWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
        completionHandler: (void (^)(SWGInlineResponse2004* output, NSError* error)) handler;
```

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGGroupParam* groupParam = [[SWGGroupParam alloc] init]; // Group ID to query.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/maintenance/list
[apiInstance getFleetMaintenanceListWithAccessToken:accessToken
              groupParam:groupParam
          completionHandler: ^(SWGInlineResponse2004* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetMaintenanceList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**SWGGroupParam***](SWGGroupParam.md)| Group ID to query. | 

### Return type

[**SWGInlineResponse2004***](SWGInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetTrips**
```objc
-(NSURLSessionTask*) getFleetTripsWithAccessToken: (NSString*) accessToken
    tripsParam: (SWGTripsParam*) tripsParam
        completionHandler: (void (^)(SWGTripResponse* output, NSError* error)) handler;
```

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGTripsParam* tripsParam = [[SWGTripsParam alloc] init]; // Group ID, vehicle ID and time range to query.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/trips
[apiInstance getFleetTripsWithAccessToken:accessToken
              tripsParam:tripsParam
          completionHandler: ^(SWGTripResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetTrips: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tripsParam** | [**SWGTripsParam***](SWGTripsParam.md)| Group ID, vehicle ID and time range to query. | 

### Return type

[**SWGTripResponse***](SWGTripResponse.md)

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
        completionHandler: (void (^)(SWGFleetVehicleResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* vehicleIdOrExternalId = @"vehicleIdOrExternalId_example"; // ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance getFleetVehicleWithAccessToken:accessToken
              vehicleIdOrExternalId:vehicleIdOrExternalId
          completionHandler: ^(SWGFleetVehicleResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getFleetVehicle: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleIdOrExternalId** | **NSString***| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**SWGFleetVehicleResponse***](SWGFleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationAddress**
```objc
-(NSURLSessionTask*) getOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
        completionHandler: (void (^)(SWGAddress* output, NSError* error)) handler;
```

/addresses/{addressId}

Fetch an address by its id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* addressId = @789; // ID of the address/geofence

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /addresses/{addressId}
[apiInstance getOrganizationAddressWithAccessToken:accessToken
              addressId:addressId
          completionHandler: ^(SWGAddress* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getOrganizationAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **addressId** | **NSNumber***| ID of the address/geofence | 

### Return type

[**SWGAddress***](SWGAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationAddresses**
```objc
-(NSURLSessionTask*) getOrganizationAddressesWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<SWGAddress>* output, NSError* error)) handler;
```

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /addresses
[apiInstance getOrganizationAddressesWithAccessToken:accessToken
          completionHandler: ^(NSArray<SWGAddress>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getOrganizationAddresses: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<SWGAddress>***](SWGAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOrganizationContact**
```objc
-(NSURLSessionTask*) getOrganizationContactWithAccessToken: (NSString*) accessToken
    contactId: (NSNumber*) contactId
        completionHandler: (void (^)(SWGContact* output, NSError* error)) handler;
```

/contacts/{contact_id}

Fetch a contact by its id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* contactId = @789; // ID of the contact

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /contacts/{contact_id}
[apiInstance getOrganizationContactWithAccessToken:accessToken
              contactId:contactId
          completionHandler: ^(SWGContact* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getOrganizationContact: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **contactId** | **NSNumber***| ID of the contact | 

### Return type

[**SWGContact***](SWGContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleHarshEvent**
```objc
-(NSURLSessionTask*) getVehicleHarshEventWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    timestamp: (NSNumber*) timestamp
        completionHandler: (void (^)(SWGVehicleHarshEventResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```objc

NSNumber* vehicleId = @789; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* timestamp = @789; // Timestamp in milliseconds representing the timestamp of a harsh event.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[apiInstance getVehicleHarshEventWithVehicleId:vehicleId
              accessToken:accessToken
              timestamp:timestamp
          completionHandler: ^(SWGVehicleHarshEventResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getVehicleHarshEvent: %@", error);
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

[**SWGVehicleHarshEventResponse***](SWGVehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleLocations**
```objc
-(NSURLSessionTask*) getVehicleLocationsWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGFleetVehicleLocations* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* vehicleId = @789; // ID of the vehicle with the associated routes.
NSNumber* startMs = @789; // Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
NSNumber* endMs = @789; // Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[apiInstance getVehicleLocationsWithAccessToken:accessToken
              vehicleId:vehicleId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGFleetVehicleLocations* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getVehicleLocations: %@", error);
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

[**SWGFleetVehicleLocations***](SWGFleetVehicleLocations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleSafetyScore**
```objc
-(NSURLSessionTask*) getVehicleSafetyScoreWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGVehicleSafetyScoreResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```objc

NSNumber* vehicleId = @789; // ID of the vehicle
NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[apiInstance getVehicleSafetyScoreWithVehicleId:vehicleId
              accessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGVehicleSafetyScoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getVehicleSafetyScore: %@", error);
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

[**SWGVehicleSafetyScoreResponse***](SWGVehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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
        completionHandler: (void (^)(SWGInlineResponse2005* output, NSError* error)) handler;
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
NSNumber* limit = @789; // Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/stats
[apiInstance getVehicleStatsWithAccessToken:accessToken
              startMs:startMs
              endMs:endMs
              series:series
              tagIds:tagIds
              startingAfter:startingAfter
              endingBefore:endingBefore
              limit:limit
          completionHandler: ^(SWGInlineResponse2005* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getVehicleStats: %@", error);
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

[**SWGInlineResponse2005***](SWGInlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehiclesLocations**
```objc
-(NSURLSessionTask*) getVehiclesLocationsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGFleetVehiclesLocations* output, NSError* error)) handler;
```

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* startMs = @56; // Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
NSNumber* endMs = @56; // Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/locations
[apiInstance getVehiclesLocationsWithAccessToken:accessToken
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGFleetVehiclesLocations* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->getVehiclesLocations: %@", error);
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

[**SWGFleetVehiclesLocations***](SWGFleetVehiclesLocations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listContacts**
```objc
-(NSURLSessionTask*) listContactsWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<SWGContact>* output, NSError* error)) handler;
```

/contacts

Fetch all contacts for the organization.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /contacts
[apiInstance listContactsWithAccessToken:accessToken
          completionHandler: ^(NSArray<SWGContact>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->listContacts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<SWGContact>***](SWGContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFleet**
```objc
-(NSURLSessionTask*) listFleetWithAccessToken: (NSString*) accessToken
    groupParam: (SWGGroupParam*) groupParam
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
        completionHandler: (void (^)(SWGInlineResponse2002* output, NSError* error)) handler;
```

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGGroupParam* groupParam = [[SWGGroupParam alloc] init]; // Group ID to query.
NSString* startingAfter = @"startingAfter_example"; // Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
NSString* endingBefore = @"endingBefore_example"; // Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
NSNumber* limit = @789; // Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/list
[apiInstance listFleetWithAccessToken:accessToken
              groupParam:groupParam
              startingAfter:startingAfter
              endingBefore:endingBefore
              limit:limit
          completionHandler: ^(SWGInlineResponse2002* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->listFleet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupParam** | [**SWGGroupParam***](SWGGroupParam.md)| Group ID to query. | 
 **startingAfter** | **NSString***| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **endingBefore** | **NSString***| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **NSNumber***| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**SWGInlineResponse2002***](SWGInlineResponse2002.md)

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
    data: (SWGData*) data
        completionHandler: (void (^)(SWGFleetVehicleResponse* output, NSError* error)) handler;
```

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* vehicleIdOrExternalId = @"vehicleIdOrExternalId_example"; // ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
SWGData* data = [[SWGData alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance patchFleetVehicleWithAccessToken:accessToken
              vehicleIdOrExternalId:vehicleIdOrExternalId
              data:data
          completionHandler: ^(SWGFleetVehicleResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->patchFleetVehicle: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleIdOrExternalId** | **NSString***| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
 **data** | [**SWGData***](SWGData.md)|  | 

### Return type

[**SWGFleetVehicleResponse***](SWGFleetVehicleResponse.md)

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
    reactivateDriverParam: (SWGReactivateDriverParam*) reactivateDriverParam
        completionHandler: (void (^)(SWGCurrentDriver* output, NSError* error)) handler;
```

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSString* driverIdOrExternalId = @"driverIdOrExternalId_example"; // ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
SWGReactivateDriverParam* reactivateDriverParam = [[SWGReactivateDriverParam alloc] init]; // Driver reactivation body

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[apiInstance reactivateDriverByIdWithAccessToken:accessToken
              driverIdOrExternalId:driverIdOrExternalId
              reactivateDriverParam:reactivateDriverParam
          completionHandler: ^(SWGCurrentDriver* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->reactivateDriverById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **driverIdOrExternalId** | **NSString***| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
 **reactivateDriverParam** | [**SWGReactivateDriverParam***](SWGReactivateDriverParam.md)| Driver reactivation body | 

### Return type

[**SWGCurrentDriver***](SWGCurrentDriver.md)

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

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/dispatch/routes/{route_id:[0-9]+}/
[apiInstance updateDispatchRouteByIdWithAccessToken:accessToken
              routeId:routeId
              updateDispatchRouteParams:updateDispatchRouteParams
          completionHandler: ^(SWGDispatchRoute* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->updateDispatchRouteById: %@", error);
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

# **updateOrganizationAddress**
```objc
-(NSURLSessionTask*) updateOrganizationAddressWithAccessToken: (NSString*) accessToken
    address: (SWGAddress*) address
    addressId: (NSNumber*) addressId
        completionHandler: (void (^)(NSError* error)) handler;
```

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGAddress* address = [[SWGAddress alloc] init]; // Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly.
NSNumber* addressId = @789; // ID of the address/geofence

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /addresses/{addressId}
[apiInstance updateOrganizationAddressWithAccessToken:accessToken
              address:address
              addressId:addressId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->updateOrganizationAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **address** | [**SWGAddress***](SWGAddress.md)| Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. | 
 **addressId** | **NSNumber***| ID of the address/geofence | 

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
    vehicleUpdateParam: (SWGVehicleUpdateParam*) vehicleUpdateParam
        completionHandler: (void (^)(NSError* error)) handler;
```

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGVehicleUpdateParam* vehicleUpdateParam = [[SWGVehicleUpdateParam alloc] init]; // 

SWGFleetApi*apiInstance = [[SWGFleetApi alloc] init];

// /fleet/set_data
[apiInstance updateVehiclesWithAccessToken:accessToken
              vehicleUpdateParam:vehicleUpdateParam
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGFleetApi->updateVehicles: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **vehicleUpdateParam** | [**SWGVehicleUpdateParam***](SWGVehicleUpdateParam.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

