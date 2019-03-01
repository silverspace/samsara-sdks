# FLEET_API

All URIs are relative to *https://api.samsara.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**add_fleet_address**](FLEET_API.md#add_fleet_address) | **Post** /fleet/add_address | /fleet/add_address
[**add_organization_addresses**](FLEET_API.md#add_organization_addresses) | **Post** /addresses | /addresses
[**all_asset_current_locations**](FLEET_API.md#all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
[**all_assets**](FLEET_API.md#all_assets) | **Get** /fleet/assets | /fleet/assets
[**all_deactivated_drivers**](FLEET_API.md#all_deactivated_drivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
[**asset_location**](FLEET_API.md#asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**asset_reefer**](FLEET_API.md#asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**create_dispatch_route**](FLEET_API.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
[**create_driver**](FLEET_API.md#create_driver) | **Post** /fleet/drivers/create | /fleet/drivers/create
[**create_driver_dispatch_route**](FLEET_API.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**create_driver_document**](FLEET_API.md#create_driver_document) | **Post** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**create_dvir**](FLEET_API.md#create_dvir) | **Post** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**create_vehicle_dispatch_route**](FLEET_API.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivate_driver**](FLEET_API.md#deactivate_driver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**deactivated_driver_by_id**](FLEET_API.md#deactivated_driver_by_id) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**delete_dispatch_route_by_id**](FLEET_API.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**delete_organization_address**](FLEET_API.md#delete_organization_address) | **Delete** /addresses/{addressId} | /addresses/{addressId}
[**dispatch_route_by_id**](FLEET_API.md#dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**dispatch_route_history**](FLEET_API.md#dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**dispatch_routes_by_driver_id**](FLEET_API.md#dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**dispatch_routes_by_vehicle_id**](FLEET_API.md#dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**driver_by_id**](FLEET_API.md#driver_by_id) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**driver_document_types_by_org_id**](FLEET_API.md#driver_document_types_by_org_id) | **Get** /fleet/drivers/document_types | /fleet/drivers/document_types
[**driver_documents_by_org_id**](FLEET_API.md#driver_documents_by_org_id) | **Get** /fleet/drivers/documents | /fleet/drivers/documents
[**driver_safety_score**](FLEET_API.md#driver_safety_score) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**dvirs**](FLEET_API.md#dvirs) | **Get** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**fetch_all_dispatch_routes**](FLEET_API.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetch_all_route_job_updates**](FLEET_API.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**fleet_drivers**](FLEET_API.md#fleet_drivers) | **Post** /fleet/drivers | /fleet/drivers
[**fleet_drivers_hos_daily_logs**](FLEET_API.md#fleet_drivers_hos_daily_logs) | **Post** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**fleet_drivers_summary**](FLEET_API.md#fleet_drivers_summary) | **Post** /fleet/drivers/summary | /fleet/drivers/summary
[**fleet_hos_authentication_logs**](FLEET_API.md#fleet_hos_authentication_logs) | **Post** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**fleet_hos_logs**](FLEET_API.md#fleet_hos_logs) | **Post** /fleet/hos_logs | /fleet/hos_logs
[**fleet_hos_logs_summary**](FLEET_API.md#fleet_hos_logs_summary) | **Post** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**fleet_locations**](FLEET_API.md#fleet_locations) | **Post** /fleet/locations | /fleet/locations
[**fleet_maintenance_list**](FLEET_API.md#fleet_maintenance_list) | **Post** /fleet/maintenance/list | /fleet/maintenance/list
[**fleet_trips**](FLEET_API.md#fleet_trips) | **Post** /fleet/trips | /fleet/trips
[**fleet_vehicle**](FLEET_API.md#fleet_vehicle) | **Get** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**list_contacts**](FLEET_API.md#list_contacts) | **Get** /contacts | /contacts
[**list_fleet**](FLEET_API.md#list_fleet) | **Post** /fleet/list | /fleet/list
[**organization_address**](FLEET_API.md#organization_address) | **Get** /addresses/{addressId} | /addresses/{addressId}
[**organization_addresses**](FLEET_API.md#organization_addresses) | **Get** /addresses | /addresses
[**organization_contact**](FLEET_API.md#organization_contact) | **Get** /contacts/{contact_id} | /contacts/{contact_id}
[**patch_fleet_vehicle**](FLEET_API.md#patch_fleet_vehicle) | **Patch** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivate_driver_by_id**](FLEET_API.md#reactivate_driver_by_id) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**update_dispatch_route_by_id**](FLEET_API.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**update_organization_address**](FLEET_API.md#update_organization_address) | **Patch** /addresses/{addressId} | /addresses/{addressId}
[**update_vehicles**](FLEET_API.md#update_vehicles) | **Post** /fleet/set_data | /fleet/set_data
[**vehicle_harsh_event**](FLEET_API.md#vehicle_harsh_event) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**vehicle_locations**](FLEET_API.md#vehicle_locations) | **Get** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**vehicle_safety_score**](FLEET_API.md#vehicle_safety_score) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**vehicle_stats**](FLEET_API.md#vehicle_stats) | **Get** /fleet/vehicles/stats | /fleet/vehicles/stats
[**vehicles_locations**](FLEET_API.md#vehicles_locations) | **Get** /fleet/vehicles/locations | /fleet/vehicles/locations


# **add_fleet_address**
> add_fleet_address (access_token: STRING_32 ; address_param: INLINE_OBJECT_2 )
	

/fleet/add_address

This method adds an address book entry to the specified group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **address_param** | [**INLINE_OBJECT_2**](INLINE_OBJECT_2.md)|  | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_organization_addresses**
> add_organization_addresses (access_token: STRING_32 ; addresses: INLINE_OBJECT ): detachable LIST [ADDRESS]
	

/addresses

Add one or more addresses to the organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **addresses** | [**INLINE_OBJECT**](INLINE_OBJECT.md)|  | 

### Return type

[**LIST [ADDRESS]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **all_asset_current_locations**
> all_asset_current_locations (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200_1
	

/fleet/assets/locations

Fetch current locations of all assets for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200_1**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **all_assets**
> all_assets (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200
	

/fleet/assets

Fetch all of the assets for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **all_deactivated_drivers**
> all_deactivated_drivers (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ): detachable LIST [DRIVER]
	

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**LIST [DRIVER]**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_location**
> asset_location (access_token: STRING_32 ; asset_id: INTEGER_64 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable LIST [ANY]
	

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **asset_id** | **INTEGER_64**| ID of the asset | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**LIST [ANY]**](ANY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_reefer**
> asset_reefer (access_token: STRING_32 ; asset_id: INTEGER_64 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable ASSET_REEFER_RESPONSE
	

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **asset_id** | **INTEGER_64**| ID of the asset | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**ASSET_REEFER_RESPONSE**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dispatch_route**
> create_dispatch_route (access_token: STRING_32 ; create_dispatch_route_params: DISPATCH_ROUTE_CREATE ): detachable DISPATCH_ROUTE
	

/fleet/dispatch/routes

Create a new dispatch route.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **create_dispatch_route_params** | [**DISPATCH_ROUTE_CREATE**](DISPATCH_ROUTE_CREATE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver**
> create_driver (access_token: STRING_32 ; create_driver_param: DRIVER_FOR_CREATE ): detachable DRIVER
	

/fleet/drivers/create

Create a new driver.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **create_driver_param** | [**DRIVER_FOR_CREATE**](DRIVER_FOR_CREATE.md)| Driver creation body | 

### Return type

[**DRIVER**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_dispatch_route**
> create_driver_dispatch_route (access_token: STRING_32 ; driver_id: INTEGER_64 ; create_dispatch_route_params: DISPATCH_ROUTE_CREATE ): detachable DISPATCH_ROUTE
	

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id** | **INTEGER_64**| ID of the driver with the associated routes. | [default to null]
 **create_dispatch_route_params** | [**DISPATCH_ROUTE_CREATE**](DISPATCH_ROUTE_CREATE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_document**
> create_driver_document (access_token: STRING_32 ; driver_id: INTEGER_64 ; create_document_params: DOCUMENT_CREATE ): detachable DOCUMENT
	

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id** | **INTEGER_64**| ID of the driver for whom the document is created. | [default to null]
 **create_document_params** | [**DOCUMENT_CREATE**](DOCUMENT_CREATE.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**DOCUMENT**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dvir**
> create_dvir (access_token: STRING_32 ; create_dvir_param: INLINE_OBJECT_12 ): detachable DVIR_BASE
	

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **create_dvir_param** | [**INLINE_OBJECT_12**](INLINE_OBJECT_12.md)|  | 

### Return type

[**DVIR_BASE**](DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vehicle_dispatch_route**
> create_vehicle_dispatch_route (access_token: STRING_32 ; vehicle_id: INTEGER_64 ; create_dispatch_route_params: DISPATCH_ROUTE_CREATE ): detachable DISPATCH_ROUTE
	

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_id** | **INTEGER_64**| ID of the vehicle with the associated routes. | [default to null]
 **create_dispatch_route_params** | [**DISPATCH_ROUTE_CREATE**](DISPATCH_ROUTE_CREATE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_driver**
> deactivate_driver (access_token: STRING_32 ; driver_id_or_external_id: STRING_32 )
	

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id_or_external_id** | **STRING_32**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivated_driver_by_id**
> deactivated_driver_by_id (access_token: STRING_32 ; driver_id_or_external_id: STRING_32 ): detachable DRIVER
	

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id_or_external_id** | **STRING_32**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**DRIVER**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dispatch_route_by_id**
> delete_dispatch_route_by_id (access_token: STRING_32 ; route_id: INTEGER_64 )
	

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the dispatch route. | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_organization_address**
> delete_organization_address (access_token: STRING_32 ; address_id: INTEGER_64 )
	

/addresses/{addressId}

Delete an address.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **address_id** | **INTEGER_64**| ID of the address/geofence | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_route_by_id**
> dispatch_route_by_id (access_token: STRING_32 ; route_id: INTEGER_64 ): detachable DISPATCH_ROUTE
	

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the dispatch route. | [default to null]

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_route_history**
> dispatch_route_history (access_token: STRING_32 ; route_id: INTEGER_64 ; start_time:  detachable INTEGER_64 ; end_time:  detachable INTEGER_64 ): detachable DISPATCH_ROUTE_HISTORY
	

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the route with history. | [default to null]
 **start_time** | **INTEGER_64**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] [default to null]
 **end_time** | **INTEGER_64**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DISPATCH_ROUTE_HISTORY**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_routes_by_driver_id**
> dispatch_routes_by_driver_id (access_token: STRING_32 ; driver_id: INTEGER_64 ; end_time:  detachable INTEGER_64 ; duration:  detachable INTEGER_64 ): detachable LIST [DISPATCH_ROUTE]
	

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id** | **INTEGER_64**| ID of the driver with the associated routes. | [default to null]
 **end_time** | **INTEGER_64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **INTEGER_64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**LIST [DISPATCH_ROUTE]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dispatch_routes_by_vehicle_id**
> dispatch_routes_by_vehicle_id (access_token: STRING_32 ; vehicle_id: INTEGER_64 ; end_time:  detachable INTEGER_64 ; duration:  detachable INTEGER_64 ): detachable LIST [DISPATCH_ROUTE]
	

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_id** | **INTEGER_64**| ID of the vehicle with the associated routes. | [default to null]
 **end_time** | **INTEGER_64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **INTEGER_64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**LIST [DISPATCH_ROUTE]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **driver_by_id**
> driver_by_id (access_token: STRING_32 ; driver_id_or_external_id: STRING_32 ): detachable DRIVER
	

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id_or_external_id** | **STRING_32**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**DRIVER**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **driver_document_types_by_org_id**
> driver_document_types_by_org_id : detachable LIST [DOCUMENT_TYPE]
	

/fleet/drivers/document_types

Fetch all of the document types.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [DOCUMENT_TYPE]**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **driver_documents_by_org_id**
> driver_documents_by_org_id (access_token: STRING_32 ; end_ms:  detachable INTEGER_64 ; duration_ms:  detachable INTEGER_64 ): detachable LIST [DOCUMENT]
	

/fleet/drivers/documents

Fetch all of the documents.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **end_ms** | **INTEGER_64**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] [default to null]
 **duration_ms** | **INTEGER_64**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**LIST [DOCUMENT]**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **driver_safety_score**
> driver_safety_score (driver_id: INTEGER_64 ; access_token: STRING_32 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable DRIVER_SAFETY_SCORE_RESPONSE
	

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **INTEGER_64**| ID of the driver | [default to null]
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**DRIVER_SAFETY_SCORE_RESPONSE**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dvirs**
> dvirs (access_token: STRING_32 ; end_ms: INTEGER_32 ; duration_ms: INTEGER_32 ; group_id:  detachable INTEGER_32 ): detachable DVIR_LIST_RESPONSE
	

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **end_ms** | **INTEGER_32**| time in millis until the last dvir log. | [default to null]
 **duration_ms** | **INTEGER_32**| time in millis which corresponds to the duration before the end_ms. | [default to null]
 **group_id** | **INTEGER_32**| Group ID to query. | [optional] [default to null]

### Return type

[**DVIR_LIST_RESPONSE**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_dispatch_routes**
> fetch_all_dispatch_routes (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ; end_time:  detachable INTEGER_64 ; duration:  detachable INTEGER_64 ): detachable LIST [DISPATCH_ROUTE]
	

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **end_time** | **INTEGER_64**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **INTEGER_64**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**LIST [DISPATCH_ROUTE]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_route_job_updates**
> fetch_all_route_job_updates (access_token: STRING_32 ; group_id:  detachable INTEGER_64 ; sequence_id:  detachable STRING_32 ; include:  detachable STRING_32 ): detachable ALL_ROUTE_JOB_UPDATES
	

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_id** | **INTEGER_64**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **sequence_id** | **STRING_32**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] [default to null]
 **include** | **STRING_32**| Optionally set include&#x3D;route to include route object in response payload. | [optional] [default to null]

### Return type

[**ALL_ROUTE_JOB_UPDATES**](allRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_drivers**
> fleet_drivers (access_token: STRING_32 ; group_drivers_param: INLINE_OBJECT_3 ): detachable DRIVERS_RESPONSE
	

/fleet/drivers

Get all the drivers for the specified group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_drivers_param** | [**INLINE_OBJECT_3**](INLINE_OBJECT_3.md)|  | 

### Return type

[**DRIVERS_RESPONSE**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_drivers_hos_daily_logs**
> fleet_drivers_hos_daily_logs (access_token: STRING_32 ; driver_id: INTEGER_64 ; hos_logs_param: INLINE_OBJECT_6 ): detachable DRIVER_DAILY_LOG_RESPONSE
	

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id** | **INTEGER_64**| ID of the driver with HOS logs. | [default to null]
 **hos_logs_param** | [**INLINE_OBJECT_6**](INLINE_OBJECT_6.md)|  | 

### Return type

[**DRIVER_DAILY_LOG_RESPONSE**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_drivers_summary**
> fleet_drivers_summary (access_token: STRING_32 ; drivers_summary_param: INLINE_OBJECT_5 ; snap_to_day_bounds:  detachable BOOLEAN ): detachable DRIVERS_SUMMARY_RESPONSE
	

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **drivers_summary_param** | [**INLINE_OBJECT_5**](INLINE_OBJECT_5.md)|  | 
 **snap_to_day_bounds** | **BOOLEAN**| Snap query result to HOS day boundaries. | [optional] [default to null]

### Return type

[**DRIVERS_SUMMARY_RESPONSE**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_hos_authentication_logs**
> fleet_hos_authentication_logs (access_token: STRING_32 ; hos_authentication_logs_param: INLINE_OBJECT_7 ): detachable HOS_AUTHENTICATION_LOGS_RESPONSE
	

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **hos_authentication_logs_param** | [**INLINE_OBJECT_7**](INLINE_OBJECT_7.md)|  | 

### Return type

[**HOS_AUTHENTICATION_LOGS_RESPONSE**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_hos_logs**
> fleet_hos_logs (access_token: STRING_32 ; hos_logs_param: INLINE_OBJECT_8 ): detachable HOS_LOGS_RESPONSE
	

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **hos_logs_param** | [**INLINE_OBJECT_8**](INLINE_OBJECT_8.md)|  | 

### Return type

[**HOS_LOGS_RESPONSE**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_hos_logs_summary**
> fleet_hos_logs_summary (access_token: STRING_32 ; hos_logs_param: INLINE_OBJECT_9 ): detachable HOS_LOGS_SUMMARY_RESPONSE
	

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **hos_logs_param** | [**INLINE_OBJECT_9**](INLINE_OBJECT_9.md)|  | 

### Return type

[**HOS_LOGS_SUMMARY_RESPONSE**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_locations**
> fleet_locations (access_token: STRING_32 ; group_param: INLINE_OBJECT_11 ): detachable INLINE_RESPONSE_200_3
	

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_param** | [**INLINE_OBJECT_11**](INLINE_OBJECT_11.md)|  | 

### Return type

[**INLINE_RESPONSE_200_3**](inline_response_200_3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_maintenance_list**
> fleet_maintenance_list (access_token: STRING_32 ; group_param: INLINE_OBJECT_13 ): detachable INLINE_RESPONSE_200_4
	

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_param** | [**INLINE_OBJECT_13**](INLINE_OBJECT_13.md)|  | 

### Return type

[**INLINE_RESPONSE_200_4**](inline_response_200_4.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_trips**
> fleet_trips (access_token: STRING_32 ; trips_param: INLINE_OBJECT_15 ): detachable TRIP_RESPONSE
	

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **trips_param** | [**INLINE_OBJECT_15**](INLINE_OBJECT_15.md)|  | 

### Return type

[**TRIP_RESPONSE**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fleet_vehicle**
> fleet_vehicle (access_token: STRING_32 ; vehicle_id_or_external_id: STRING_32 ): detachable FLEET_VEHICLE_RESPONSE
	

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_id_or_external_id** | **STRING_32**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**FLEET_VEHICLE_RESPONSE**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_contacts**
> list_contacts (access_token: STRING_32 ): detachable LIST [CONTACT]
	

/contacts

Fetch all contacts for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]

### Return type

[**LIST [CONTACT]**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fleet**
> list_fleet (access_token: STRING_32 ; group_param: INLINE_OBJECT_10 ; starting_after:  detachable STRING_32 ; ending_before:  detachable STRING_32 ; limit:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200_2
	

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **group_param** | [**INLINE_OBJECT_10**](INLINE_OBJECT_10.md)|  | 
 **starting_after** | **STRING_32**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] [default to null]
 **ending_before** | **STRING_32**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] [default to null]
 **limit** | **INTEGER_64**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200_2**](inline_response_200_2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **organization_address**
> organization_address (access_token: STRING_32 ; address_id: INTEGER_64 ): detachable ADDRESS
	

/addresses/{addressId}

Fetch an address by its id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **address_id** | **INTEGER_64**| ID of the address/geofence | [default to null]

### Return type

[**ADDRESS**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **organization_addresses**
> organization_addresses (access_token: STRING_32 ): detachable LIST [ADDRESS]
	

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]

### Return type

[**LIST [ADDRESS]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **organization_contact**
> organization_contact (access_token: STRING_32 ; contact_id: INTEGER_64 ): detachable CONTACT
	

/contacts/{contact_id}

Fetch a contact by its id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **contact_id** | **INTEGER_64**| ID of the contact | [default to null]

### Return type

[**CONTACT**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_fleet_vehicle**
> patch_fleet_vehicle (access_token: STRING_32 ; vehicle_id_or_external_id: STRING_32 ; data: INLINE_OBJECT_16 ): detachable FLEET_VEHICLE_RESPONSE
	

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_id_or_external_id** | **STRING_32**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]
 **data** | [**INLINE_OBJECT_16**](INLINE_OBJECT_16.md)|  | 

### Return type

[**FLEET_VEHICLE_RESPONSE**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivate_driver_by_id**
> reactivate_driver_by_id (access_token: STRING_32 ; driver_id_or_external_id: STRING_32 ; reactivate_driver_param: INLINE_OBJECT_4 ): detachable DRIVER
	

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **driver_id_or_external_id** | **STRING_32**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]
 **reactivate_driver_param** | [**INLINE_OBJECT_4**](INLINE_OBJECT_4.md)|  | 

### Return type

[**DRIVER**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dispatch_route_by_id**
> update_dispatch_route_by_id (access_token: STRING_32 ; route_id: INTEGER_64 ; update_dispatch_route_params: DISPATCH_ROUTE ): detachable DISPATCH_ROUTE
	

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **route_id** | **INTEGER_64**| ID of the dispatch route. | [default to null]
 **update_dispatch_route_params** | [**DISPATCH_ROUTE**](DISPATCH_ROUTE.md)|  | 

### Return type

[**DISPATCH_ROUTE**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_organization_address**
> update_organization_address (access_token: STRING_32 ; address_id: INTEGER_64 ; address: INLINE_OBJECT_1 )
	

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **address_id** | **INTEGER_64**| ID of the address/geofence | [default to null]
 **address** | [**INLINE_OBJECT_1**](INLINE_OBJECT_1.md)|  | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_vehicles**
> update_vehicles (access_token: STRING_32 ; vehicle_update_param: INLINE_OBJECT_14 )
	

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_update_param** | [**INLINE_OBJECT_14**](INLINE_OBJECT_14.md)|  | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vehicle_harsh_event**
> vehicle_harsh_event (vehicle_id: INTEGER_64 ; access_token: STRING_32 ; timestamp: INTEGER_64 ): detachable VEHICLE_HARSH_EVENT_RESPONSE
	

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **INTEGER_64**| ID of the vehicle | [default to null]
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **timestamp** | **INTEGER_64**| Timestamp in milliseconds representing the timestamp of a harsh event. | [default to null]

### Return type

[**VEHICLE_HARSH_EVENT_RESPONSE**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vehicle_locations**
> vehicle_locations (access_token: STRING_32 ; vehicle_id: INTEGER_64 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable LIST [FLEET_VEHICLE_LOCATION]
	

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **vehicle_id** | **INTEGER_64**| ID of the vehicle with the associated routes. | [default to null]
 **start_ms** | **INTEGER_64**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | [default to null]
 **end_ms** | **INTEGER_64**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | [default to null]

### Return type

[**LIST [FLEET_VEHICLE_LOCATION]**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vehicle_safety_score**
> vehicle_safety_score (vehicle_id: INTEGER_64 ; access_token: STRING_32 ; start_ms: INTEGER_64 ; end_ms: INTEGER_64 ): detachable VEHICLE_SAFETY_SCORE_RESPONSE
	

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **INTEGER_64**| ID of the vehicle | [default to null]
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **start_ms** | **INTEGER_64**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **end_ms** | **INTEGER_64**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**VEHICLE_SAFETY_SCORE_RESPONSE**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vehicle_stats**
> vehicle_stats (access_token: STRING_32 ; start_ms: INTEGER_32 ; end_ms: INTEGER_32 ; series:  detachable STRING_32 ; tag_ids:  detachable STRING_32 ; starting_after:  detachable STRING_32 ; ending_before:  detachable STRING_32 ; limit:  detachable INTEGER_64 ): detachable INLINE_RESPONSE_200_5
	

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **start_ms** | **INTEGER_32**| Time in Unix epoch milliseconds for the start of the query. | [default to null]
 **end_ms** | **INTEGER_32**| Time in Unix epoch milliseconds for the end of the query. | [default to null]
 **series** | **STRING_32**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] [default to null]
 **tag_ids** | **STRING_32**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] [default to null]
 **starting_after** | **STRING_32**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] [default to null]
 **ending_before** | **STRING_32**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] [default to null]
 **limit** | **INTEGER_64**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] [default to null]

### Return type

[**INLINE_RESPONSE_200_5**](inline_response_200_5.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vehicles_locations**
> vehicles_locations (access_token: STRING_32 ; start_ms: INTEGER_32 ; end_ms: INTEGER_32 ): detachable LIST [ANY]
	

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **STRING_32**| Samsara API access token. | [default to null]
 **start_ms** | **INTEGER_32**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | [default to null]
 **end_ms** | **INTEGER_32**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | [default to null]

### Return type

[**LIST [ANY]**](ANY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

