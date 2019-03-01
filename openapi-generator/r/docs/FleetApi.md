# FleetApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddFleetAddress**](FleetApi.md#AddFleetAddress) | **POST** /fleet/add_address | /fleet/add_address
[**AddOrganizationAddresses**](FleetApi.md#AddOrganizationAddresses) | **POST** /addresses | /addresses
[**CreateDispatchRoute**](FleetApi.md#CreateDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**CreateDriver**](FleetApi.md#CreateDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**CreateDriverDispatchRoute**](FleetApi.md#CreateDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**CreateDriverDocument**](FleetApi.md#CreateDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**CreateDvir**](FleetApi.md#CreateDvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**CreateVehicleDispatchRoute**](FleetApi.md#CreateVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**DeactivateDriver**](FleetApi.md#DeactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**DeleteDispatchRouteById**](FleetApi.md#DeleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**DeleteOrganizationAddress**](FleetApi.md#DeleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**FetchAllDispatchRoutes**](FleetApi.md#FetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**FetchAllRouteJobUpdates**](FleetApi.md#FetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetAllAssetCurrentLocations**](FleetApi.md#GetAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](FleetApi.md#GetAllAssets) | **GET** /fleet/assets | /fleet/assets
[**GetAllDeactivatedDrivers**](FleetApi.md#GetAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**GetAssetLocation**](FleetApi.md#GetAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](FleetApi.md#GetAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**GetDeactivatedDriverById**](FleetApi.md#GetDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetDispatchRouteById**](FleetApi.md#GetDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**GetDispatchRouteHistory**](FleetApi.md#GetDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**GetDispatchRoutesByDriverId**](FleetApi.md#GetDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**GetDispatchRoutesByVehicleId**](FleetApi.md#GetDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**GetDriverById**](FleetApi.md#GetDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetDriverDocumentTypesByOrgId**](FleetApi.md#GetDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**GetDriverDocumentsByOrgId**](FleetApi.md#GetDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**GetDriverSafetyScore**](FleetApi.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**GetDvirs**](FleetApi.md#GetDvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**GetFleetDrivers**](FleetApi.md#GetFleetDrivers) | **POST** /fleet/drivers | /fleet/drivers
[**GetFleetDriversHosDailyLogs**](FleetApi.md#GetFleetDriversHosDailyLogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**GetFleetDriversSummary**](FleetApi.md#GetFleetDriversSummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**GetFleetHosAuthenticationLogs**](FleetApi.md#GetFleetHosAuthenticationLogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**GetFleetHosLogs**](FleetApi.md#GetFleetHosLogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**GetFleetHosLogsSummary**](FleetApi.md#GetFleetHosLogsSummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**GetFleetLocations**](FleetApi.md#GetFleetLocations) | **POST** /fleet/locations | /fleet/locations
[**GetFleetMaintenanceList**](FleetApi.md#GetFleetMaintenanceList) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**GetFleetTrips**](FleetApi.md#GetFleetTrips) | **POST** /fleet/trips | /fleet/trips
[**GetFleetVehicle**](FleetApi.md#GetFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetOrganizationAddress**](FleetApi.md#GetOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**GetOrganizationAddresses**](FleetApi.md#GetOrganizationAddresses) | **GET** /addresses | /addresses
[**GetOrganizationContact**](FleetApi.md#GetOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**GetVehicleHarshEvent**](FleetApi.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**GetVehicleLocations**](FleetApi.md#GetVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**GetVehicleSafetyScore**](FleetApi.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**GetVehicleStats**](FleetApi.md#GetVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**GetVehiclesLocations**](FleetApi.md#GetVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**ListContacts**](FleetApi.md#ListContacts) | **GET** /contacts | /contacts
[**ListFleet**](FleetApi.md#ListFleet) | **POST** /fleet/list | /fleet/list
[**PatchFleetVehicle**](FleetApi.md#PatchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**ReactivateDriverById**](FleetApi.md#ReactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**UpdateDispatchRouteById**](FleetApi.md#UpdateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**UpdateOrganizationAddress**](FleetApi.md#UpdateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**UpdateVehicles**](FleetApi.md#UpdateVehicles) | **POST** /fleet/set_data | /fleet/set_data


# **AddFleetAddress**
> AddFleetAddress(access.token, address.param)

/fleet/add_address

This method adds an address book entry to the specified group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.address.param <- InlineObject2$new() # InlineObject2 | 

#/fleet/add_address
api.instance <- FleetApi$new()
api.instance$AddFleetAddress(var.access.token, var.address.param)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **address.param** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **AddOrganizationAddresses**
> Address AddOrganizationAddresses(access.token, addresses)

/addresses

Add one or more addresses to the organization

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.addresses <- InlineObject$new() # InlineObject | 

#/addresses
api.instance <- FleetApi$new()
result <- api.instance$AddOrganizationAddresses(var.access.token, var.addresses)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **addresses** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



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
api.instance <- FleetApi$new()
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



# **CreateDriver**
> Driver CreateDriver(access.token, create.driver.param)

/fleet/drivers/create

Create a new driver.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.create.driver.param <- DriverForCreate$new() # DriverForCreate | Driver creation body

#/fleet/drivers/create
api.instance <- FleetApi$new()
result <- api.instance$CreateDriver(var.access.token, var.create.driver.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **create.driver.param** | [**DriverForCreate**](DriverForCreate.md)| Driver creation body | 

### Return type

[**Driver**](Driver.md)

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
api.instance <- FleetApi$new()
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



# **CreateDriverDocument**
> Document CreateDriverDocument(access.token, driver.id, create.document.params)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id <- 56 # integer | ID of the driver for whom the document is created.
var.create.document.params <- DocumentCreate$new() # DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

#/fleet/drivers/{driver_id:[0-9]+}/documents
api.instance <- FleetApi$new()
result <- api.instance$CreateDriverDocument(var.access.token, var.driver.id, var.create.document.params)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id** | **integer**| ID of the driver for whom the document is created. | 
 **create.document.params** | [**DocumentCreate**](DocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **CreateDvir**
> DvirBase CreateDvir(access.token, create.dvir.param)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.create.dvir.param <- InlineObject12$new() # InlineObject12 | 

#/fleet/maintenance/dvirs
api.instance <- FleetApi$new()
result <- api.instance$CreateDvir(var.access.token, var.create.dvir.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **create.dvir.param** | [**InlineObject12**](InlineObject12.md)|  | 

### Return type

[**DvirBase**](DvirBase.md)

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
api.instance <- FleetApi$new()
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



# **DeactivateDriver**
> DeactivateDriver(access.token, driver.id.or.external.id)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id.or.external.id <- 'driver.id.or.external.id_example' # character | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

#/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
api.instance <- FleetApi$new()
api.instance$DeactivateDriver(var.access.token, var.driver.id.or.external.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id.or.external.id** | **character**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
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
api.instance <- FleetApi$new()
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



# **DeleteOrganizationAddress**
> DeleteOrganizationAddress(access.token, address.id)

/addresses/{addressId}

Delete an address.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.address.id <- 56 # integer | ID of the address/geofence

#/addresses/{addressId}
api.instance <- FleetApi$new()
api.instance$DeleteOrganizationAddress(var.access.token, var.address.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **address.id** | **integer**| ID of the address/geofence | 

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
api.instance <- FleetApi$new()
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
api.instance <- FleetApi$new()
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



# **GetAllAssetCurrentLocations**
> InlineResponse2001 GetAllAssetCurrentLocations(access.token, group.id=var.group.id)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).

#/fleet/assets/locations
api.instance <- FleetApi$new()
result <- api.instance$GetAllAssetCurrentLocations(var.access.token, group.id=var.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAllAssets**
> InlineResponse200 GetAllAssets(access.token, group.id=var.group.id)

/fleet/assets

Fetch all of the assets for the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).

#/fleet/assets
api.instance <- FleetApi$new()
result <- api.instance$GetAllAssets(var.access.token, group.id=var.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAllDeactivatedDrivers**
> Driver GetAllDeactivatedDrivers(access.token, group.id=var.group.id)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.id <- 56 # integer | Optional group ID if the organization has multiple groups (uncommon).

#/fleet/drivers/inactive
api.instance <- FleetApi$new()
result <- api.instance$GetAllDeactivatedDrivers(var.access.token, group.id=var.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.id** | **integer**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAssetLocation**
> object GetAssetLocation(access.token, asset.id, start.ms, end.ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.asset.id <- 56 # integer | ID of the asset
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/assets/{assetId:[0-9]+}/locations
api.instance <- FleetApi$new()
result <- api.instance$GetAssetLocation(var.access.token, var.asset.id, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **asset.id** | **integer**| ID of the asset | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetAssetReefer**
> AssetReeferResponse GetAssetReefer(access.token, asset.id, start.ms, end.ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.asset.id <- 56 # integer | ID of the asset
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/assets/{assetId:[0-9]+}/reefer
api.instance <- FleetApi$new()
result <- api.instance$GetAssetReefer(var.access.token, var.asset.id, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **asset.id** | **integer**| ID of the asset | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDeactivatedDriverById**
> Driver GetDeactivatedDriverById(access.token, driver.id.or.external.id)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id.or.external.id <- 'driver.id.or.external.id_example' # character | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

#/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
api.instance <- FleetApi$new()
result <- api.instance$GetDeactivatedDriverById(var.access.token, var.driver.id.or.external.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id.or.external.id** | **character**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

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
api.instance <- FleetApi$new()
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
api.instance <- FleetApi$new()
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
api.instance <- FleetApi$new()
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
api.instance <- FleetApi$new()
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



# **GetDriverById**
> Driver GetDriverById(access.token, driver.id.or.external.id)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id.or.external.id <- 'driver.id.or.external.id_example' # character | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

#/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
api.instance <- FleetApi$new()
result <- api.instance$GetDriverById(var.access.token, var.driver.id.or.external.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id.or.external.id** | **character**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDriverDocumentTypesByOrgId**
> DocumentType GetDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.

### Example
```R
library(openapi)


#/fleet/drivers/document_types
api.instance <- FleetApi$new()
result <- api.instance$GetDriverDocumentTypesByOrgId()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DocumentType**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDriverDocumentsByOrgId**
> Document GetDriverDocumentsByOrgId(access.token, end.ms=var.end.ms, duration.ms=var.duration.ms)

/fleet/drivers/documents

Fetch all of the documents.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.end.ms <- 56 # integer | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
var.duration.ms <- 56 # integer | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.

#/fleet/drivers/documents
api.instance <- FleetApi$new()
result <- api.instance$GetDriverDocumentsByOrgId(var.access.token, end.ms=var.end.ms, duration.ms=var.duration.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **end.ms** | **integer**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] 
 **duration.ms** | **integer**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] 

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDriverSafetyScore**
> DriverSafetyScoreResponse GetDriverSafetyScore(driver.id, access.token, start.ms, end.ms)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```R
library(openapi)

var.driver.id <- 56 # integer | ID of the driver
var.access.token <- 'access.token_example' # character | Samsara API access token.
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/drivers/{driverId:[0-9]+}/safety/score
api.instance <- FleetApi$new()
result <- api.instance$GetDriverSafetyScore(var.driver.id, var.access.token, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver.id** | **integer**| ID of the driver | 
 **access.token** | **character**| Samsara API access token. | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetDvirs**
> DvirListResponse GetDvirs(access.token, end.ms, duration.ms, group.id=var.group.id)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.end.ms <- 56 # integer | time in millis until the last dvir log.
var.duration.ms <- 56 # integer | time in millis which corresponds to the duration before the end_ms.
var.group.id <- 56 # integer | Group ID to query.

#/fleet/maintenance/dvirs
api.instance <- FleetApi$new()
result <- api.instance$GetDvirs(var.access.token, var.end.ms, var.duration.ms, group.id=var.group.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **end.ms** | **integer**| time in millis until the last dvir log. | 
 **duration.ms** | **integer**| time in millis which corresponds to the duration before the end_ms. | 
 **group.id** | **integer**| Group ID to query. | [optional] 

### Return type

[**DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetFleetDrivers**
> DriversResponse GetFleetDrivers(access.token, group.drivers.param)

/fleet/drivers

Get all the drivers for the specified group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.drivers.param <- InlineObject3$new() # InlineObject3 | 

#/fleet/drivers
api.instance <- FleetApi$new()
result <- api.instance$GetFleetDrivers(var.access.token, var.group.drivers.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.drivers.param** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type

[**DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetDriversHosDailyLogs**
> DriverDailyLogResponse GetFleetDriversHosDailyLogs(access.token, driver.id, hos.logs.param)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id <- 56 # integer | ID of the driver with HOS logs.
var.hos.logs.param <- InlineObject6$new() # InlineObject6 | 

#/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
api.instance <- FleetApi$new()
result <- api.instance$GetFleetDriversHosDailyLogs(var.access.token, var.driver.id, var.hos.logs.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id** | **integer**| ID of the driver with HOS logs. | 
 **hos.logs.param** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetDriversSummary**
> DriversSummaryResponse GetFleetDriversSummary(access.token, drivers.summary.param, snap.to.day.bounds=var.snap.to.day.bounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.drivers.summary.param <- InlineObject5$new() # InlineObject5 | 
var.snap.to.day.bounds <- 'snap.to.day.bounds_example' # character | Snap query result to HOS day boundaries.

#/fleet/drivers/summary
api.instance <- FleetApi$new()
result <- api.instance$GetFleetDriversSummary(var.access.token, var.drivers.summary.param, snap.to.day.bounds=var.snap.to.day.bounds)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **drivers.summary.param** | [**InlineObject5**](InlineObject5.md)|  | 
 **snap.to.day.bounds** | **character**| Snap query result to HOS day boundaries. | [optional] 

### Return type

[**DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetHosAuthenticationLogs**
> HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs(access.token, hos.authentication.logs.param)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.hos.authentication.logs.param <- InlineObject7$new() # InlineObject7 | 

#/fleet/hos_authentication_logs
api.instance <- FleetApi$new()
result <- api.instance$GetFleetHosAuthenticationLogs(var.access.token, var.hos.authentication.logs.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **hos.authentication.logs.param** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type

[**HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetHosLogs**
> HosLogsResponse GetFleetHosLogs(access.token, hos.logs.param)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.hos.logs.param <- InlineObject8$new() # InlineObject8 | 

#/fleet/hos_logs
api.instance <- FleetApi$new()
result <- api.instance$GetFleetHosLogs(var.access.token, var.hos.logs.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **hos.logs.param** | [**InlineObject8**](InlineObject8.md)|  | 

### Return type

[**HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetHosLogsSummary**
> HosLogsSummaryResponse GetFleetHosLogsSummary(access.token, hos.logs.param)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.hos.logs.param <- InlineObject9$new() # InlineObject9 | 

#/fleet/hos_logs_summary
api.instance <- FleetApi$new()
result <- api.instance$GetFleetHosLogsSummary(var.access.token, var.hos.logs.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **hos.logs.param** | [**InlineObject9**](InlineObject9.md)|  | 

### Return type

[**HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetLocations**
> InlineResponse2003 GetFleetLocations(access.token, group.param)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.param <- InlineObject11$new() # InlineObject11 | 

#/fleet/locations
api.instance <- FleetApi$new()
result <- api.instance$GetFleetLocations(var.access.token, var.group.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.param** | [**InlineObject11**](InlineObject11.md)|  | 

### Return type

[**InlineResponse2003**](inline_response_200_3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetMaintenanceList**
> InlineResponse2004 GetFleetMaintenanceList(access.token, group.param)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.param <- InlineObject13$new() # InlineObject13 | 

#/fleet/maintenance/list
api.instance <- FleetApi$new()
result <- api.instance$GetFleetMaintenanceList(var.access.token, var.group.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.param** | [**InlineObject13**](InlineObject13.md)|  | 

### Return type

[**InlineResponse2004**](inline_response_200_4.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetTrips**
> TripResponse GetFleetTrips(access.token, trips.param)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.trips.param <- InlineObject15$new() # InlineObject15 | 

#/fleet/trips
api.instance <- FleetApi$new()
result <- api.instance$GetFleetTrips(var.access.token, var.trips.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **trips.param** | [**InlineObject15**](InlineObject15.md)|  | 

### Return type

[**TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **GetFleetVehicle**
> FleetVehicleResponse GetFleetVehicle(access.token, vehicle.id.or.external.id)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.vehicle.id.or.external.id <- 'vehicle.id.or.external.id_example' # character | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.

#/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
api.instance <- FleetApi$new()
result <- api.instance$GetFleetVehicle(var.access.token, var.vehicle.id.or.external.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **vehicle.id.or.external.id** | **character**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetOrganizationAddress**
> Address GetOrganizationAddress(access.token, address.id)

/addresses/{addressId}

Fetch an address by its id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.address.id <- 56 # integer | ID of the address/geofence

#/addresses/{addressId}
api.instance <- FleetApi$new()
result <- api.instance$GetOrganizationAddress(var.access.token, var.address.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **address.id** | **integer**| ID of the address/geofence | 

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetOrganizationAddresses**
> Address GetOrganizationAddresses(access.token)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.

#/addresses
api.instance <- FleetApi$new()
result <- api.instance$GetOrganizationAddresses(var.access.token)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetOrganizationContact**
> Contact GetOrganizationContact(access.token, contact.id)

/contacts/{contact_id}

Fetch a contact by its id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.contact.id <- 56 # integer | ID of the contact

#/contacts/{contact_id}
api.instance <- FleetApi$new()
result <- api.instance$GetOrganizationContact(var.access.token, var.contact.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **contact.id** | **integer**| ID of the contact | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetVehicleHarshEvent**
> VehicleHarshEventResponse GetVehicleHarshEvent(vehicle.id, access.token, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```R
library(openapi)

var.vehicle.id <- 56 # integer | ID of the vehicle
var.access.token <- 'access.token_example' # character | Samsara API access token.
var.timestamp <- 56 # integer | Timestamp in milliseconds representing the timestamp of a harsh event.

#/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
api.instance <- FleetApi$new()
result <- api.instance$GetVehicleHarshEvent(var.vehicle.id, var.access.token, var.timestamp)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle.id** | **integer**| ID of the vehicle | 
 **access.token** | **character**| Samsara API access token. | 
 **timestamp** | **integer**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetVehicleLocations**
> FleetVehicleLocation GetVehicleLocations(access.token, vehicle.id, start.ms, end.ms)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.vehicle.id <- 56 # integer | ID of the vehicle with the associated routes.
var.start.ms <- 56 # integer | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
var.end.ms <- 56 # integer | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)

#/fleet/vehicles/{vehicle_id:[0-9]+}/locations
api.instance <- FleetApi$new()
result <- api.instance$GetVehicleLocations(var.access.token, var.vehicle.id, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **vehicle.id** | **integer**| ID of the vehicle with the associated routes. | 
 **start.ms** | **integer**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | 
 **end.ms** | **integer**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | 

### Return type

[**FleetVehicleLocation**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetVehicleSafetyScore**
> VehicleSafetyScoreResponse GetVehicleSafetyScore(vehicle.id, access.token, start.ms, end.ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```R
library(openapi)

var.vehicle.id <- 56 # integer | ID of the vehicle
var.access.token <- 'access.token_example' # character | Samsara API access token.
var.start.ms <- 56 # integer | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
var.end.ms <- 56 # integer | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

#/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
api.instance <- FleetApi$new()
result <- api.instance$GetVehicleSafetyScore(var.vehicle.id, var.access.token, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle.id** | **integer**| ID of the vehicle | 
 **access.token** | **character**| Samsara API access token. | 
 **start.ms** | **integer**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end.ms** | **integer**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetVehicleStats**
> InlineResponse2005 GetVehicleStats(access.token, start.ms, end.ms, series=var.series, tag.ids=var.tag.ids, starting.after=var.starting.after, ending.before=var.ending.before, limit=var.limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.start.ms <- 56 # integer | Time in Unix epoch milliseconds for the start of the query.
var.end.ms <- 56 # integer | Time in Unix epoch milliseconds for the end of the query.
var.series <- 'series_example' # character | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
var.tag.ids <- 'tag.ids_example' # character | Comma-separated list of tag ids. Example: tagIds=1,2,3
var.starting.after <- 'starting.after_example' # character | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
var.ending.before <- 'ending.before_example' # character | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
var.limit <- 56 # integer | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

#/fleet/vehicles/stats
api.instance <- FleetApi$new()
result <- api.instance$GetVehicleStats(var.access.token, var.start.ms, var.end.ms, series=var.series, tag.ids=var.tag.ids, starting.after=var.starting.after, ending.before=var.ending.before, limit=var.limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **start.ms** | **integer**| Time in Unix epoch milliseconds for the start of the query. | 
 **end.ms** | **integer**| Time in Unix epoch milliseconds for the end of the query. | 
 **series** | **character**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] 
 **tag.ids** | **character**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] 
 **starting.after** | **character**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **ending.before** | **character**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **integer**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2005**](inline_response_200_5.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **GetVehiclesLocations**
> object GetVehiclesLocations(access.token, start.ms, end.ms)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.start.ms <- 56 # integer | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
var.end.ms <- 56 # integer | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)

#/fleet/vehicles/locations
api.instance <- FleetApi$new()
result <- api.instance$GetVehiclesLocations(var.access.token, var.start.ms, var.end.ms)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **start.ms** | **integer**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | 
 **end.ms** | **integer**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **ListContacts**
> Contact ListContacts(access.token)

/contacts

Fetch all contacts for the organization.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.

#/contacts
api.instance <- FleetApi$new()
result <- api.instance$ListContacts(var.access.token)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **ListFleet**
> InlineResponse2002 ListFleet(access.token, group.param, starting.after=var.starting.after, ending.before=var.ending.before, limit=var.limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.group.param <- InlineObject10$new() # InlineObject10 | 
var.starting.after <- 'starting.after_example' # character | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
var.ending.before <- 'ending.before_example' # character | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
var.limit <- 56 # integer | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

#/fleet/list
api.instance <- FleetApi$new()
result <- api.instance$ListFleet(var.access.token, var.group.param, starting.after=var.starting.after, ending.before=var.ending.before, limit=var.limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **group.param** | [**InlineObject10**](InlineObject10.md)|  | 
 **starting.after** | **character**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **ending.before** | **character**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **integer**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2002**](inline_response_200_2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **PatchFleetVehicle**
> FleetVehicleResponse PatchFleetVehicle(access.token, vehicle.id.or.external.id, data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.vehicle.id.or.external.id <- 'vehicle.id.or.external.id_example' # character | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
var.data <- InlineObject16$new() # InlineObject16 | 

#/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
api.instance <- FleetApi$new()
result <- api.instance$PatchFleetVehicle(var.access.token, var.vehicle.id.or.external.id, var.data)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **vehicle.id.or.external.id** | **character**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
 **data** | [**InlineObject16**](InlineObject16.md)|  | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json



# **ReactivateDriverById**
> Driver ReactivateDriverById(access.token, driver.id.or.external.id, reactivate.driver.param)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.driver.id.or.external.id <- 'driver.id.or.external.id_example' # character | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
var.reactivate.driver.param <- InlineObject4$new() # InlineObject4 | 

#/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
api.instance <- FleetApi$new()
result <- api.instance$ReactivateDriverById(var.access.token, var.driver.id.or.external.id, var.reactivate.driver.param)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **driver.id.or.external.id** | **character**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
 **reactivate.driver.param** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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
api.instance <- FleetApi$new()
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



# **UpdateOrganizationAddress**
> UpdateOrganizationAddress(access.token, address.id, address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.address.id <- 56 # integer | ID of the address/geofence
var.address <- InlineObject1$new() # InlineObject1 | 

#/addresses/{addressId}
api.instance <- FleetApi$new()
api.instance$UpdateOrganizationAddress(var.access.token, var.address.id, var.address)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **address.id** | **integer**| ID of the address/geofence | 
 **address** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **UpdateVehicles**
> UpdateVehicles(access.token, vehicle.update.param)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example
```R
library(openapi)

var.access.token <- 'access.token_example' # character | Samsara API access token.
var.vehicle.update.param <- InlineObject14$new() # InlineObject14 | 

#/fleet/set_data
api.instance <- FleetApi$new()
api.instance$UpdateVehicles(var.access.token, var.vehicle.update.param)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access.token** | **character**| Samsara API access token. | 
 **vehicle.update.param** | [**InlineObject14**](InlineObject14.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



