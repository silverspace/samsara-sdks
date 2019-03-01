# \FleetApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_fleet_address**](FleetApi.md#add_fleet_address) | **Post** /fleet/add_address | /fleet/add_address
[**add_organization_addresses**](FleetApi.md#add_organization_addresses) | **Post** /addresses | /addresses
[**create_dispatch_route**](FleetApi.md#create_dispatch_route) | **Post** /fleet/dispatch/routes | /fleet/dispatch/routes
[**create_driver**](FleetApi.md#create_driver) | **Post** /fleet/drivers/create | /fleet/drivers/create
[**create_driver_dispatch_route**](FleetApi.md#create_driver_dispatch_route) | **Post** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**create_driver_document**](FleetApi.md#create_driver_document) | **Post** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**create_dvir**](FleetApi.md#create_dvir) | **Post** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**create_vehicle_dispatch_route**](FleetApi.md#create_vehicle_dispatch_route) | **Post** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivate_driver**](FleetApi.md#deactivate_driver) | **Delete** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**delete_dispatch_route_by_id**](FleetApi.md#delete_dispatch_route_by_id) | **Delete** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**delete_organization_address**](FleetApi.md#delete_organization_address) | **Delete** /addresses/{addressId} | /addresses/{addressId}
[**fetch_all_dispatch_routes**](FleetApi.md#fetch_all_dispatch_routes) | **Get** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetch_all_route_job_updates**](FleetApi.md#fetch_all_route_job_updates) | **Get** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**get_all_asset_current_locations**](FleetApi.md#get_all_asset_current_locations) | **Get** /fleet/assets/locations | /fleet/assets/locations
[**get_all_assets**](FleetApi.md#get_all_assets) | **Get** /fleet/assets | /fleet/assets
[**get_all_deactivated_drivers**](FleetApi.md#get_all_deactivated_drivers) | **Get** /fleet/drivers/inactive | /fleet/drivers/inactive
[**get_asset_location**](FleetApi.md#get_asset_location) | **Get** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**get_asset_reefer**](FleetApi.md#get_asset_reefer) | **Get** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**get_deactivated_driver_by_id**](FleetApi.md#get_deactivated_driver_by_id) | **Get** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**get_dispatch_route_by_id**](FleetApi.md#get_dispatch_route_by_id) | **Get** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**get_dispatch_route_history**](FleetApi.md#get_dispatch_route_history) | **Get** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**get_dispatch_routes_by_driver_id**](FleetApi.md#get_dispatch_routes_by_driver_id) | **Get** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**get_dispatch_routes_by_vehicle_id**](FleetApi.md#get_dispatch_routes_by_vehicle_id) | **Get** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**get_driver_by_id**](FleetApi.md#get_driver_by_id) | **Get** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**get_driver_document_types_by_org_id**](FleetApi.md#get_driver_document_types_by_org_id) | **Get** /fleet/drivers/document_types | /fleet/drivers/document_types
[**get_driver_documents_by_org_id**](FleetApi.md#get_driver_documents_by_org_id) | **Get** /fleet/drivers/documents | /fleet/drivers/documents
[**get_driver_safety_score**](FleetApi.md#get_driver_safety_score) | **Get** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**get_dvirs**](FleetApi.md#get_dvirs) | **Get** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**get_fleet_drivers**](FleetApi.md#get_fleet_drivers) | **Post** /fleet/drivers | /fleet/drivers
[**get_fleet_drivers_hos_daily_logs**](FleetApi.md#get_fleet_drivers_hos_daily_logs) | **Post** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**get_fleet_drivers_summary**](FleetApi.md#get_fleet_drivers_summary) | **Post** /fleet/drivers/summary | /fleet/drivers/summary
[**get_fleet_hos_authentication_logs**](FleetApi.md#get_fleet_hos_authentication_logs) | **Post** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**get_fleet_hos_logs**](FleetApi.md#get_fleet_hos_logs) | **Post** /fleet/hos_logs | /fleet/hos_logs
[**get_fleet_hos_logs_summary**](FleetApi.md#get_fleet_hos_logs_summary) | **Post** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**get_fleet_locations**](FleetApi.md#get_fleet_locations) | **Post** /fleet/locations | /fleet/locations
[**get_fleet_maintenance_list**](FleetApi.md#get_fleet_maintenance_list) | **Post** /fleet/maintenance/list | /fleet/maintenance/list
[**get_fleet_trips**](FleetApi.md#get_fleet_trips) | **Post** /fleet/trips | /fleet/trips
[**get_fleet_vehicle**](FleetApi.md#get_fleet_vehicle) | **Get** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**get_organization_address**](FleetApi.md#get_organization_address) | **Get** /addresses/{addressId} | /addresses/{addressId}
[**get_organization_addresses**](FleetApi.md#get_organization_addresses) | **Get** /addresses | /addresses
[**get_organization_contact**](FleetApi.md#get_organization_contact) | **Get** /contacts/{contact_id} | /contacts/{contact_id}
[**get_vehicle_harsh_event**](FleetApi.md#get_vehicle_harsh_event) | **Get** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**get_vehicle_locations**](FleetApi.md#get_vehicle_locations) | **Get** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**get_vehicle_safety_score**](FleetApi.md#get_vehicle_safety_score) | **Get** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**get_vehicle_stats**](FleetApi.md#get_vehicle_stats) | **Get** /fleet/vehicles/stats | /fleet/vehicles/stats
[**get_vehicles_locations**](FleetApi.md#get_vehicles_locations) | **Get** /fleet/vehicles/locations | /fleet/vehicles/locations
[**list_contacts**](FleetApi.md#list_contacts) | **Get** /contacts | /contacts
[**list_fleet**](FleetApi.md#list_fleet) | **Post** /fleet/list | /fleet/list
[**patch_fleet_vehicle**](FleetApi.md#patch_fleet_vehicle) | **Patch** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivate_driver_by_id**](FleetApi.md#reactivate_driver_by_id) | **Put** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**update_dispatch_route_by_id**](FleetApi.md#update_dispatch_route_by_id) | **Put** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**update_organization_address**](FleetApi.md#update_organization_address) | **Patch** /addresses/{addressId} | /addresses/{addressId}
[**update_vehicles**](FleetApi.md#update_vehicles) | **Post** /fleet/set_data | /fleet/set_data


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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_organization_addresses**
> Vec<::models::Address> add_organization_addresses(access_token, addresses)
/addresses

Add one or more addresses to the organization

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **addresses** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**Vec<::models::Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dispatch_route**
> ::models::DispatchRoute create_dispatch_route(access_token, create_dispatch_route_params)
/fleet/dispatch/routes

Create a new dispatch route.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver**
> ::models::Driver create_driver(access_token, create_driver_param)
/fleet/drivers/create

Create a new driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **create_driver_param** | [**DriverForCreate**](DriverForCreate.md)| Driver creation body | 

### Return type

[**::models::Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_dispatch_route**
> ::models::DispatchRoute create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params)
/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver with the associated routes. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_document**
> ::models::Document create_driver_document(access_token, driver_id, create_document_params)
/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver for whom the document is created. | 
  **create_document_params** | [**DocumentCreate**](DocumentCreate.md)| To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**::models::Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dvir**
> ::models::DvirBase create_dvir(access_token, create_dvir_param)
/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **create_dvir_param** | [**InlineObject12**](InlineObject12.md)|  | 

### Return type

[**::models::DvirBase**](DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vehicle_dispatch_route**
> ::models::DispatchRoute create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params)
/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id** | **i64**| ID of the vehicle with the associated routes. | 
  **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_driver**
> deactivate_driver(access_token, driver_id_or_external_id)
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dispatch_route_by_id**
> delete_dispatch_route_by_id(access_token, route_id)
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_organization_address**
> delete_organization_address(access_token, address_id)
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_dispatch_routes**
> Vec<::models::DispatchRoute> fetch_all_dispatch_routes(access_token, optional)
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

[**Vec<::models::DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_route_job_updates**
> ::models::AllRouteJobUpdates fetch_all_route_job_updates(access_token, optional)
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

[**::models::AllRouteJobUpdates**](allRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_asset_current_locations**
> ::models::InlineResponse2001 get_all_asset_current_locations(access_token, optional)
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

[**::models::InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_assets**
> ::models::InlineResponse200 get_all_assets(access_token, optional)
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

[**::models::InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_deactivated_drivers**
> Vec<::models::Driver> get_all_deactivated_drivers(access_token, optional)
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

[**Vec<::models::Driver>**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_location**
> Vec<Value> get_asset_location(access_token, asset_id, start_ms, end_ms)
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

[**Vec<Value>**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_reefer**
> ::models::AssetReeferResponse get_asset_reefer(access_token, asset_id, start_ms, end_ms)
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

[**::models::AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_deactivated_driver_by_id**
> ::models::Driver get_deactivated_driver_by_id(access_token, driver_id_or_external_id)
/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id_or_external_id** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**::models::Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_by_id**
> ::models::DispatchRoute get_dispatch_route_by_id(access_token, route_id)
/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the dispatch route. | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_history**
> ::models::DispatchRouteHistory get_dispatch_route_history(access_token, route_id, optional)
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

[**::models::DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_driver_id**
> Vec<::models::DispatchRoute> get_dispatch_routes_by_driver_id(access_token, driver_id, optional)
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

[**Vec<::models::DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_vehicle_id**
> Vec<::models::DispatchRoute> get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, optional)
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

[**Vec<::models::DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_by_id**
> ::models::Driver get_driver_by_id(access_token, driver_id_or_external_id)
/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id_or_external_id** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**::models::Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_document_types_by_org_id**
> Vec<::models::DocumentType> get_driver_document_types_by_org_id()
/fleet/drivers/document_types

Fetch all of the document types.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<::models::DocumentType>**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_documents_by_org_id**
> Vec<::models::Document> get_driver_documents_by_org_id(access_token, optional)
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

[**Vec<::models::Document>**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_safety_score**
> ::models::DriverSafetyScoreResponse get_driver_safety_score(driver_id, access_token, start_ms, end_ms)
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

[**::models::DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dvirs**
> ::models::DvirListResponse get_dvirs(access_token, end_ms, duration_ms, optional)
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

[**::models::DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers**
> ::models::DriversResponse get_fleet_drivers(access_token, group_drivers_param)
/fleet/drivers

Get all the drivers for the specified group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_drivers_param** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type

[**::models::DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers_hos_daily_logs**
> ::models::DriverDailyLogResponse get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param)
/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id** | **i64**| ID of the driver with HOS logs. | 
  **hos_logs_param** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**::models::DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers_summary**
> ::models::DriversSummaryResponse get_fleet_drivers_summary(access_token, drivers_summary_param, optional)
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

[**::models::DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_authentication_logs**
> ::models::HosAuthenticationLogsResponse get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param)
/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **hos_authentication_logs_param** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type

[**::models::HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_logs**
> ::models::HosLogsResponse get_fleet_hos_logs(access_token, hos_logs_param)
/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **hos_logs_param** | [**InlineObject8**](InlineObject8.md)|  | 

### Return type

[**::models::HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_logs_summary**
> ::models::HosLogsSummaryResponse get_fleet_hos_logs_summary(access_token, hos_logs_param)
/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **hos_logs_param** | [**InlineObject9**](InlineObject9.md)|  | 

### Return type

[**::models::HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_locations**
> ::models::InlineResponse2003 get_fleet_locations(access_token, group_param)
/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_param** | [**InlineObject11**](InlineObject11.md)|  | 

### Return type

[**::models::InlineResponse2003**](inline_response_200_3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_maintenance_list**
> ::models::InlineResponse2004 get_fleet_maintenance_list(access_token, group_param)
/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **group_param** | [**InlineObject13**](InlineObject13.md)|  | 

### Return type

[**::models::InlineResponse2004**](inline_response_200_4.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_trips**
> ::models::TripResponse get_fleet_trips(access_token, trips_param)
/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **trips_param** | [**InlineObject15**](InlineObject15.md)|  | 

### Return type

[**::models::TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_vehicle**
> ::models::FleetVehicleResponse get_fleet_vehicle(access_token, vehicle_id_or_external_id)
/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id_or_external_id** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**::models::FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_organization_address**
> ::models::Address get_organization_address(access_token, address_id)
/addresses/{addressId}

Fetch an address by its id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **address_id** | **i64**| ID of the address/geofence | 

### Return type

[**::models::Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_organization_addresses**
> Vec<::models::Address> get_organization_addresses(access_token)
/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<::models::Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_organization_contact**
> ::models::Contact get_organization_contact(access_token, contact_id)
/contacts/{contact_id}

Fetch a contact by its id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **contact_id** | **i64**| ID of the contact | 

### Return type

[**::models::Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_harsh_event**
> ::models::VehicleHarshEventResponse get_vehicle_harsh_event(vehicle_id, access_token, timestamp)
/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **vehicle_id** | **i64**| ID of the vehicle | 
  **access_token** | **String**| Samsara API access token. | 
  **timestamp** | **i64**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**::models::VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_locations**
> Vec<::models::FleetVehicleLocation> get_vehicle_locations(access_token, vehicle_id, start_ms, end_ms)
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

[**Vec<::models::FleetVehicleLocation>**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_safety_score**
> ::models::VehicleSafetyScoreResponse get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms)
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

[**::models::VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_stats**
> ::models::InlineResponse2005 get_vehicle_stats(access_token, start_ms, end_ms, optional)
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

[**::models::InlineResponse2005**](inline_response_200_5.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicles_locations**
> Vec<Value> get_vehicles_locations(access_token, start_ms, end_ms)
/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **start_ms** | **i32**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | 
  **end_ms** | **i32**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | 

### Return type

[**Vec<Value>**](Value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_contacts**
> Vec<::models::Contact> list_contacts(access_token)
/contacts

Fetch all contacts for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 

### Return type

[**Vec<::models::Contact>**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fleet**
> ::models::InlineResponse2002 list_fleet(access_token, group_param, optional)
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

[**::models::InlineResponse2002**](inline_response_200_2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_fleet_vehicle**
> ::models::FleetVehicleResponse patch_fleet_vehicle(access_token, vehicle_id_or_external_id, data)
/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **vehicle_id_or_external_id** | **String**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
  **data** | [**InlineObject16**](InlineObject16.md)|  | 

### Return type

[**::models::FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivate_driver_by_id**
> ::models::Driver reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivate_driver_param)
/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **driver_id_or_external_id** | **String**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
  **reactivate_driver_param** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type

[**::models::Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dispatch_route_by_id**
> ::models::DispatchRoute update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params)
/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_token** | **String**| Samsara API access token. | 
  **route_id** | **i64**| ID of the dispatch route. | 
  **update_dispatch_route_params** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**::models::DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_organization_address**
> update_organization_address(access_token, address_id, address)
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
 - **Accept**: application/json

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

