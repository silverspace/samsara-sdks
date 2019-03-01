# fleet_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**add_fleet_address**](fleet_api.md#add_fleet_address) | **POST** /fleet/add_address | /fleet/add_address
**AddOrganizationAddresses**](fleet_api.md#AddOrganizationAddresses) | **POST** /addresses | /addresses
**createDispatchRoute**](fleet_api.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
**createDriver**](fleet_api.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
**createDriverDispatchRoute**](fleet_api.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
**createDriverDocument**](fleet_api.md#createDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
**create_dvir**](fleet_api.md#create_dvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
**createVehicleDispatchRoute**](fleet_api.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
**deactivateDriver**](fleet_api.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
**deleteDispatchRouteById**](fleet_api.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
**DeleteOrganizationAddress**](fleet_api.md#DeleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
**fetchAllDispatchRoutes**](fleet_api.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
**fetchAllRouteJobUpdates**](fleet_api.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
**GetAllAssetCurrentLocations**](fleet_api.md#GetAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
**GetAllAssets**](fleet_api.md#GetAllAssets) | **GET** /fleet/assets | /fleet/assets
**getAllDeactivatedDrivers**](fleet_api.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
**GetAssetLocation**](fleet_api.md#GetAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
**GetAssetReefer**](fleet_api.md#GetAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
**getDeactivatedDriverById**](fleet_api.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
**getDispatchRouteById**](fleet_api.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
**getDispatchRouteHistory**](fleet_api.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
**getDispatchRoutesByDriverId**](fleet_api.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
**getDispatchRoutesByVehicleId**](fleet_api.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
**getDriverById**](fleet_api.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
**getDriverDocumentTypesByOrgId**](fleet_api.md#getDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
**getDriverDocumentsByOrgId**](fleet_api.md#getDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
**GetDriverSafetyScore**](fleet_api.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
**get_dvirs**](fleet_api.md#get_dvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
**get_fleet_drivers**](fleet_api.md#get_fleet_drivers) | **POST** /fleet/drivers | /fleet/drivers
**get_fleet_drivers_hos_daily_logs**](fleet_api.md#get_fleet_drivers_hos_daily_logs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
**get_fleet_drivers_summary**](fleet_api.md#get_fleet_drivers_summary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
**get_fleet_hos_authentication_logs**](fleet_api.md#get_fleet_hos_authentication_logs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
**get_fleet_hos_logs**](fleet_api.md#get_fleet_hos_logs) | **POST** /fleet/hos_logs | /fleet/hos_logs
**get_fleet_hos_logs_summary**](fleet_api.md#get_fleet_hos_logs_summary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
**get_fleet_locations**](fleet_api.md#get_fleet_locations) | **POST** /fleet/locations | /fleet/locations
**get_fleet_maintenance_list**](fleet_api.md#get_fleet_maintenance_list) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
**get_fleet_trips**](fleet_api.md#get_fleet_trips) | **POST** /fleet/trips | /fleet/trips
**getFleetVehicle**](fleet_api.md#getFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
**GetOrganizationAddress**](fleet_api.md#GetOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
**GetOrganizationAddresses**](fleet_api.md#GetOrganizationAddresses) | **GET** /addresses | /addresses
**GetOrganizationContact**](fleet_api.md#GetOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
**GetVehicleHarshEvent**](fleet_api.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
**getVehicleLocations**](fleet_api.md#getVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
**GetVehicleSafetyScore**](fleet_api.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
**GetVehicleStats**](fleet_api.md#GetVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
**getVehiclesLocations**](fleet_api.md#getVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
**ListContacts**](fleet_api.md#ListContacts) | **GET** /contacts | /contacts
**list_fleet**](fleet_api.md#list_fleet) | **POST** /fleet/list | /fleet/list
**patchFleetVehicle**](fleet_api.md#patchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
**reactivateDriverById**](fleet_api.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
**updateDispatchRouteById**](fleet_api.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
**UpdateOrganizationAddress**](fleet_api.md#UpdateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
**update_vehicles**](fleet_api.md#update_vehicles) | **POST** /fleet/set_data | /fleet/set_data


# **add_fleet_address**
> add_fleet_address(access_token, address_param)
/fleet/add_address

This method adds an address book entry to the specified group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **address_param** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddOrganizationAddresses**
> Vec<models::Address> AddOrganizationAddresses(access_token, addresses)
/addresses

Add one or more addresses to the organization

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **addresses** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**Vec<models::Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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

# **createDriver**
> models::Driver createDriver(access_token, create_driver_param)
/fleet/drivers/create

Create a new driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **create_driver_param** | [**DriverForCreate**](DriverForCreate.md)| Driver creation body | 

### Return type

[**models::Driver**](Driver.md)

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

# **createDriverDocument**
> models::Document createDriverDocument(access_token, driver_id, create_document_params)
/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver for whom the document is created. | 
  **create_document_params** | [**DocumentCreate**](DocumentCreate.md)| To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**models::Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dvir**
> models::DvirBase create_dvir(access_token, create_dvir_param)
/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **create_dvir_param** | [**InlineObject12**](InlineObject12.md)|  | 

### Return type

[**models::DvirBase**](DvirBase.md)

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

# **deactivateDriver**
> deactivateDriver(access_token, driver_id_or_external_id)
/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id_or_external_id** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
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

# **DeleteOrganizationAddress**
> DeleteOrganizationAddress(access_token, address_id)
/addresses/{addressId}

Delete an address.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **address_id** | **i64**| ID of the address/geofence | 

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

# **GetAllAssetCurrentLocations**
> models::InlineResponse2001 GetAllAssetCurrentLocations(access_token, optional)
/fleet/assets/locations

Fetch current locations of all assets for the group.

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

### Return type

[**models::InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAllAssets**
> models::InlineResponse200 GetAllAssets(access_token, optional)
/fleet/assets

Fetch all of the assets for the group.

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

### Return type

[**models::InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllDeactivatedDrivers**
> Vec<models::Driver> getAllDeactivatedDrivers(access_token, optional)
/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

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

### Return type

[**Vec<models::Driver>**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAssetLocation**
> Vec<object> GetAssetLocation(access_token, asset_id, start_ms, end_ms)
/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **asset_id** | **i64**| ID of the asset | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**Vec<object>**](object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAssetReefer**
> models::AssetReeferResponse GetAssetReefer(access_token, asset_id, start_ms, end_ms)
/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **asset_id** | **i64**| ID of the asset | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**models::AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDeactivatedDriverById**
> models::Driver getDeactivatedDriverById(access_token, driver_id_or_external_id)
/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id_or_external_id** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**models::Driver**](Driver.md)

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

# **getDriverById**
> models::Driver getDriverById(access_token, driver_id_or_external_id)
/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id_or_external_id** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**models::Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentTypesByOrgId**
> Vec<models::DocumentType> getDriverDocumentTypesByOrgId()
/fleet/drivers/document_types

Fetch all of the document types.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<models::DocumentType>**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDriverDocumentsByOrgId**
> Vec<models::Document> getDriverDocumentsByOrgId(access_token, optional)
/fleet/drivers/documents

Fetch all of the documents.

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
 **end_ms** | **i64**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | 
 **duration_ms** | **i64**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | 

### Return type

[**Vec<models::Document>**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetDriverSafetyScore**
> models::DriverSafetyScoreResponse GetDriverSafetyScore(driver_id, access_token, start_ms, end_ms)
/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **driver_id** | **i64**| ID of the driver | 
  **access_token** | **String**| Samsara API access token. | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**models::DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dvirs**
> models::DvirListResponse get_dvirs(access_token, end_ms, duration_ms, optional)
/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **end_ms** | **i32**| time in millis until the last dvir log. | 
  **duration_ms** | **i32**| time in millis which corresponds to the duration before the end_ms. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **end_ms** | **i32**| time in millis until the last dvir log. | 
 **duration_ms** | **i32**| time in millis which corresponds to the duration before the end_ms. | 
 **group_id** | **i32**| Group ID to query. | 

### Return type

[**models::DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers**
> models::DriversResponse get_fleet_drivers(access_token, group_drivers_param)
/fleet/drivers

Get all the drivers for the specified group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_drivers_param** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type

[**models::DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers_hos_daily_logs**
> models::DriverDailyLogResponse get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param)
/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver with HOS logs. | 
  **hos_logs_param** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**models::DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers_summary**
> models::DriversSummaryResponse get_fleet_drivers_summary(access_token, drivers_summary_param, optional)
/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **drivers_summary_param** | [**InlineObject5**](InlineObject5.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **drivers_summary_param** | [**InlineObject5**](InlineObject5.md)|  | 
 **snap_to_day_bounds** | **bool**| Snap query result to HOS day boundaries. | 

### Return type

[**models::DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_authentication_logs**
> models::HosAuthenticationLogsResponse get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param)
/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **hos_authentication_logs_param** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type

[**models::HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_logs**
> models::HosLogsResponse get_fleet_hos_logs(access_token, hos_logs_param)
/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **hos_logs_param** | [**InlineObject8**](InlineObject8.md)|  | 

### Return type

[**models::HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_logs_summary**
> models::HosLogsSummaryResponse get_fleet_hos_logs_summary(access_token, hos_logs_param)
/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **hos_logs_param** | [**InlineObject9**](InlineObject9.md)|  | 

### Return type

[**models::HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_locations**
> models::InlineResponse2003 get_fleet_locations(access_token, group_param)
/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_param** | [**InlineObject11**](InlineObject11.md)|  | 

### Return type

[**models::InlineResponse2003**](inline_response_200_3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_maintenance_list**
> models::InlineResponse2004 get_fleet_maintenance_list(access_token, group_param)
/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_param** | [**InlineObject13**](InlineObject13.md)|  | 

### Return type

[**models::InlineResponse2004**](inline_response_200_4.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_trips**
> models::TripResponse get_fleet_trips(access_token, trips_param)
/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **trips_param** | [**InlineObject15**](InlineObject15.md)|  | 

### Return type

[**models::TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFleetVehicle**
> models::FleetVehicleResponse getFleetVehicle(access_token, vehicle_id_or_external_id)
/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id_or_external_id** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**models::FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetOrganizationAddress**
> models::Address GetOrganizationAddress(access_token, address_id)
/addresses/{addressId}

Fetch an address by its id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **address_id** | **i64**| ID of the address/geofence | 

### Return type

[**models::Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetOrganizationAddresses**
> Vec<models::Address> GetOrganizationAddresses(access_token)
/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<models::Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetOrganizationContact**
> models::Contact GetOrganizationContact(access_token, contact_id)
/contacts/{contact_id}

Fetch a contact by its id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **contact_id** | **i64**| ID of the contact | 

### Return type

[**models::Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetVehicleHarshEvent**
> models::VehicleHarshEventResponse GetVehicleHarshEvent(vehicle_id, access_token, timestamp)
/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **vehicle_id** | **i64**| ID of the vehicle | 
  **access_token** | **String**| Samsara API access token. | 
  **timestamp** | **i64**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**models::VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehicleLocations**
> Vec<models::FleetVehicleLocation> getVehicleLocations(access_token, vehicle_id, start_ms, end_ms)
/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id** | **i64**| ID of the vehicle with the associated routes. | 
  **start_ms** | **i64**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | 
  **end_ms** | **i64**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | 

### Return type

[**Vec<models::FleetVehicleLocation>**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetVehicleSafetyScore**
> models::VehicleSafetyScoreResponse GetVehicleSafetyScore(vehicle_id, access_token, start_ms, end_ms)
/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **vehicle_id** | **i64**| ID of the vehicle | 
  **access_token** | **String**| Samsara API access token. | 
  **start_ms** | **i64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
  **end_ms** | **i64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**models::VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetVehicleStats**
> models::InlineResponse2005 GetVehicleStats(access_token, start_ms, end_ms, optional)
/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **start_ms** | **i32**| Time in Unix epoch milliseconds for the start of the query. | 
  **end_ms** | **i32**| Time in Unix epoch milliseconds for the end of the query. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **start_ms** | **i32**| Time in Unix epoch milliseconds for the start of the query. | 
 **end_ms** | **i32**| Time in Unix epoch milliseconds for the end of the query. | 
 **series** | **String**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 | 
 **tag_ids** | **String**| Comma-separated list of tag ids. Example: tagIds=1,2,3 | 
 **starting_after** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. | 
 **ending_before** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. | 
 **limit** | **i64**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. | 

### Return type

[**models::InlineResponse2005**](inline_response_200_5.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVehiclesLocations**
> Vec<object> getVehiclesLocations(access_token, start_ms, end_ms)
/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **start_ms** | **i32**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | 
  **end_ms** | **i32**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | 

### Return type

[**Vec<object>**](object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListContacts**
> Vec<models::Contact> ListContacts(access_token)
/contacts

Fetch all contacts for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<models::Contact>**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fleet**
> models::InlineResponse2002 list_fleet(access_token, group_param, optional)
/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_param** | [**InlineObject10**](InlineObject10.md)|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **String**| Samsara API access token. | 
 **group_param** | [**InlineObject10**](InlineObject10.md)|  | 
 **starting_after** | **String**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. | 
 **ending_before** | **String**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. | 
 **limit** | **i64**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. | 

### Return type

[**models::InlineResponse2002**](inline_response_200_2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchFleetVehicle**
> models::FleetVehicleResponse patchFleetVehicle(access_token, vehicle_id_or_external_id, data)
/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id_or_external_id** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
  **data** | [**InlineObject16**](InlineObject16.md)|  | 

### Return type

[**models::FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivateDriverById**
> models::Driver reactivateDriverById(access_token, driver_id_or_external_id, reactivate_driver_param)
/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id_or_external_id** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
  **reactivate_driver_param** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type

[**models::Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateOrganizationAddress**
> UpdateOrganizationAddress(access_token, address_id, address)
/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **address_id** | **i64**| ID of the address/geofence | 
  **address** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_vehicles**
> update_vehicles(access_token, vehicle_update_param)
/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_update_param** | [**InlineObject14**](InlineObject14.md)|  | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

