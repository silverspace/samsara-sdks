# WWW::OpenAPIClient::FleetApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::FleetApi;
```

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_fleet_address**](FleetApi.md#add_fleet_address) | **POST** /fleet/add_address | /fleet/add_address
[**add_organization_addresses**](FleetApi.md#add_organization_addresses) | **POST** /addresses | /addresses
[**create_dispatch_route**](FleetApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**create_driver**](FleetApi.md#create_driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**create_driver_dispatch_route**](FleetApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**create_driver_document**](FleetApi.md#create_driver_document) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**create_dvir**](FleetApi.md#create_dvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**create_vehicle_dispatch_route**](FleetApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivate_driver**](FleetApi.md#deactivate_driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**delete_dispatch_route_by_id**](FleetApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**delete_organization_address**](FleetApi.md#delete_organization_address) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**fetch_all_dispatch_routes**](FleetApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetch_all_route_job_updates**](FleetApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**get_all_asset_current_locations**](FleetApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**get_all_assets**](FleetApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
[**get_all_deactivated_drivers**](FleetApi.md#get_all_deactivated_drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**get_asset_location**](FleetApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**get_asset_reefer**](FleetApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**get_deactivated_driver_by_id**](FleetApi.md#get_deactivated_driver_by_id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**get_dispatch_route_by_id**](FleetApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**get_dispatch_route_history**](FleetApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**get_dispatch_routes_by_driver_id**](FleetApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**get_dispatch_routes_by_vehicle_id**](FleetApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**get_driver_by_id**](FleetApi.md#get_driver_by_id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**get_driver_document_types_by_org_id**](FleetApi.md#get_driver_document_types_by_org_id) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**get_driver_documents_by_org_id**](FleetApi.md#get_driver_documents_by_org_id) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**get_driver_safety_score**](FleetApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**get_dvirs**](FleetApi.md#get_dvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**get_fleet_drivers**](FleetApi.md#get_fleet_drivers) | **POST** /fleet/drivers | /fleet/drivers
[**get_fleet_drivers_hos_daily_logs**](FleetApi.md#get_fleet_drivers_hos_daily_logs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**get_fleet_drivers_summary**](FleetApi.md#get_fleet_drivers_summary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**get_fleet_hos_authentication_logs**](FleetApi.md#get_fleet_hos_authentication_logs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**get_fleet_hos_logs**](FleetApi.md#get_fleet_hos_logs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**get_fleet_hos_logs_summary**](FleetApi.md#get_fleet_hos_logs_summary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**get_fleet_locations**](FleetApi.md#get_fleet_locations) | **POST** /fleet/locations | /fleet/locations
[**get_fleet_maintenance_list**](FleetApi.md#get_fleet_maintenance_list) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**get_fleet_trips**](FleetApi.md#get_fleet_trips) | **POST** /fleet/trips | /fleet/trips
[**get_fleet_vehicle**](FleetApi.md#get_fleet_vehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**get_organization_address**](FleetApi.md#get_organization_address) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**get_organization_addresses**](FleetApi.md#get_organization_addresses) | **GET** /addresses | /addresses
[**get_organization_contact**](FleetApi.md#get_organization_contact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**get_vehicle_harsh_event**](FleetApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**get_vehicle_locations**](FleetApi.md#get_vehicle_locations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**get_vehicle_safety_score**](FleetApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**get_vehicle_stats**](FleetApi.md#get_vehicle_stats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**get_vehicles_locations**](FleetApi.md#get_vehicles_locations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**list_contacts**](FleetApi.md#list_contacts) | **GET** /contacts | /contacts
[**list_fleet**](FleetApi.md#list_fleet) | **POST** /fleet/list | /fleet/list
[**patch_fleet_vehicle**](FleetApi.md#patch_fleet_vehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivate_driver_by_id**](FleetApi.md#reactivate_driver_by_id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**update_dispatch_route_by_id**](FleetApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**update_organization_address**](FleetApi.md#update_organization_address) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**update_vehicles**](FleetApi.md#update_vehicles) | **POST** /fleet/set_data | /fleet/set_data


# **add_fleet_address**
> add_fleet_address(access_token => $access_token, address_param => $address_param)

/fleet/add_address

This method adds an address book entry to the specified group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $address_param = WWW::OpenAPIClient::Object::InlineObject2->new(); # InlineObject2 | 

eval { 
    $api_instance->add_fleet_address(access_token => $access_token, address_param => $address_param);
};
if ($@) {
    warn "Exception when calling FleetApi->add_fleet_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **address_param** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_organization_addresses**
> ARRAY[Address] add_organization_addresses(access_token => $access_token, addresses => $addresses)

/addresses

Add one or more addresses to the organization

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $addresses = WWW::OpenAPIClient::Object::InlineObject->new(); # InlineObject | 

eval { 
    my $result = $api_instance->add_organization_addresses(access_token => $access_token, addresses => $addresses);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->add_organization_addresses: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **addresses** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**ARRAY[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dispatch_route**
> DispatchRoute create_dispatch_route(access_token => $access_token, create_dispatch_route_params => $create_dispatch_route_params)

/fleet/dispatch/routes

Create a new dispatch route.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $create_dispatch_route_params = WWW::OpenAPIClient::Object::DispatchRouteCreate->new(); # DispatchRouteCreate | 

eval { 
    my $result = $api_instance->create_dispatch_route(access_token => $access_token, create_dispatch_route_params => $create_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->create_dispatch_route: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver**
> Driver create_driver(access_token => $access_token, create_driver_param => $create_driver_param)

/fleet/drivers/create

Create a new driver.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $create_driver_param = WWW::OpenAPIClient::Object::DriverForCreate->new(); # DriverForCreate | Driver creation body

eval { 
    my $result = $api_instance->create_driver(access_token => $access_token, create_driver_param => $create_driver_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->create_driver: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **create_driver_param** | [**DriverForCreate**](DriverForCreate.md)| Driver creation body | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_dispatch_route**
> DispatchRoute create_driver_dispatch_route(access_token => $access_token, driver_id => $driver_id, create_dispatch_route_params => $create_dispatch_route_params)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id = 789; # int | ID of the driver with the associated routes.
my $create_dispatch_route_params = WWW::OpenAPIClient::Object::DispatchRouteCreate->new(); # DispatchRouteCreate | 

eval { 
    my $result = $api_instance->create_driver_dispatch_route(access_token => $access_token, driver_id => $driver_id, create_dispatch_route_params => $create_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->create_driver_dispatch_route: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id** | **int**| ID of the driver with the associated routes. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_driver_document**
> Document create_driver_document(access_token => $access_token, driver_id => $driver_id, create_document_params => $create_document_params)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id = 789; # int | ID of the driver for whom the document is created.
my $create_document_params = WWW::OpenAPIClient::Object::DocumentCreate->new(); # DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

eval { 
    my $result = $api_instance->create_driver_document(access_token => $access_token, driver_id => $driver_id, create_document_params => $create_document_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->create_driver_document: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id** | **int**| ID of the driver for whom the document is created. | 
 **create_document_params** | [**DocumentCreate**](DocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dvir**
> DvirBase create_dvir(access_token => $access_token, create_dvir_param => $create_dvir_param)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $create_dvir_param = WWW::OpenAPIClient::Object::InlineObject12->new(); # InlineObject12 | 

eval { 
    my $result = $api_instance->create_dvir(access_token => $access_token, create_dvir_param => $create_dvir_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->create_dvir: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **create_dvir_param** | [**InlineObject12**](InlineObject12.md)|  | 

### Return type

[**DvirBase**](DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vehicle_dispatch_route**
> DispatchRoute create_vehicle_dispatch_route(access_token => $access_token, vehicle_id => $vehicle_id, create_dispatch_route_params => $create_dispatch_route_params)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $vehicle_id = 789; # int | ID of the vehicle with the associated routes.
my $create_dispatch_route_params = WWW::OpenAPIClient::Object::DispatchRouteCreate->new(); # DispatchRouteCreate | 

eval { 
    my $result = $api_instance->create_vehicle_dispatch_route(access_token => $access_token, vehicle_id => $vehicle_id, create_dispatch_route_params => $create_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->create_vehicle_dispatch_route: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. | 
 **create_dispatch_route_params** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deactivate_driver**
> deactivate_driver(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id_or_external_id = "driver_id_or_external_id_example"; # string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

eval { 
    $api_instance->deactivate_driver(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id);
};
if ($@) {
    warn "Exception when calling FleetApi->deactivate_driver: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id_or_external_id** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dispatch_route_by_id**
> delete_dispatch_route_by_id(access_token => $access_token, route_id => $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $route_id = 789; # int | ID of the dispatch route.

eval { 
    $api_instance->delete_dispatch_route_by_id(access_token => $access_token, route_id => $route_id);
};
if ($@) {
    warn "Exception when calling FleetApi->delete_dispatch_route_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the dispatch route. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_organization_address**
> delete_organization_address(access_token => $access_token, address_id => $address_id)

/addresses/{addressId}

Delete an address.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $address_id = 789; # int | ID of the address/geofence

eval { 
    $api_instance->delete_organization_address(access_token => $access_token, address_id => $address_id);
};
if ($@) {
    warn "Exception when calling FleetApi->delete_organization_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **address_id** | **int**| ID of the address/geofence | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_dispatch_routes**
> ARRAY[DispatchRoute] fetch_all_dispatch_routes(access_token => $access_token, group_id => $group_id, end_time => $end_time, duration => $duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).
my $end_time = 789; # int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
my $duration = 789; # int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

eval { 
    my $result = $api_instance->fetch_all_dispatch_routes(access_token => $access_token, group_id => $group_id, end_time => $end_time, duration => $duration);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->fetch_all_dispatch_routes: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**ARRAY[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_all_route_job_updates**
> AllRouteJobUpdates fetch_all_route_job_updates(access_token => $access_token, group_id => $group_id, sequence_id => $sequence_id, include => $include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).
my $sequence_id = "sequence_id_example"; # string | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
my $include = "include_example"; # string | Optionally set include=route to include route object in response payload.

eval { 
    my $result = $api_instance->fetch_all_route_job_updates(access_token => $access_token, group_id => $group_id, sequence_id => $sequence_id, include => $include);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->fetch_all_route_job_updates: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequence_id** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_asset_current_locations**
> InlineResponse2001 get_all_asset_current_locations(access_token => $access_token, group_id => $group_id)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).

eval { 
    my $result = $api_instance->get_all_asset_current_locations(access_token => $access_token, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_all_asset_current_locations: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_assets**
> InlineResponse200 get_all_assets(access_token => $access_token, group_id => $group_id)

/fleet/assets

Fetch all of the assets for the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).

eval { 
    my $result = $api_instance->get_all_assets(access_token => $access_token, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_all_assets: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_deactivated_drivers**
> ARRAY[Driver] get_all_deactivated_drivers(access_token => $access_token, group_id => $group_id)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).

eval { 
    my $result = $api_instance->get_all_deactivated_drivers(access_token => $access_token, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_all_deactivated_drivers: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**ARRAY[Driver]**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_location**
> ARRAY[object] get_asset_location(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $asset_id = 789; # int | ID of the asset
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_asset_location(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_asset_location: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **asset_id** | **int**| ID of the asset | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**ARRAY[object]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_reefer**
> AssetReeferResponse get_asset_reefer(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $asset_id = 789; # int | ID of the asset
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_asset_reefer(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_asset_reefer: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **asset_id** | **int**| ID of the asset | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_deactivated_driver_by_id**
> Driver get_deactivated_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id_or_external_id = "driver_id_or_external_id_example"; # string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

eval { 
    my $result = $api_instance->get_deactivated_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_deactivated_driver_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id_or_external_id** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_by_id**
> DispatchRoute get_dispatch_route_by_id(access_token => $access_token, route_id => $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $route_id = 789; # int | ID of the dispatch route.

eval { 
    my $result = $api_instance->get_dispatch_route_by_id(access_token => $access_token, route_id => $route_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_dispatch_route_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_route_history**
> DispatchRouteHistory get_dispatch_route_history(access_token => $access_token, route_id => $route_id, start_time => $start_time, end_time => $end_time)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $route_id = 789; # int | ID of the route with history.
my $start_time = 789; # int | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
my $end_time = 789; # int | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.

eval { 
    my $result = $api_instance->get_dispatch_route_history(access_token => $access_token, route_id => $route_id, start_time => $start_time, end_time => $end_time);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_dispatch_route_history: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the route with history. | 
 **start_time** | **int**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **end_time** | **int**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_driver_id**
> ARRAY[DispatchRoute] get_dispatch_routes_by_driver_id(access_token => $access_token, driver_id => $driver_id, end_time => $end_time, duration => $duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id = 789; # int | ID of the driver with the associated routes.
my $end_time = 789; # int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
my $duration = 789; # int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

eval { 
    my $result = $api_instance->get_dispatch_routes_by_driver_id(access_token => $access_token, driver_id => $driver_id, end_time => $end_time, duration => $duration);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_dispatch_routes_by_driver_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id** | **int**| ID of the driver with the associated routes. | 
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**ARRAY[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dispatch_routes_by_vehicle_id**
> ARRAY[DispatchRoute] get_dispatch_routes_by_vehicle_id(access_token => $access_token, vehicle_id => $vehicle_id, end_time => $end_time, duration => $duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $vehicle_id = 789; # int | ID of the vehicle with the associated routes.
my $end_time = 789; # int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
my $duration = 789; # int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

eval { 
    my $result = $api_instance->get_dispatch_routes_by_vehicle_id(access_token => $access_token, vehicle_id => $vehicle_id, end_time => $end_time, duration => $duration);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_dispatch_routes_by_vehicle_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. | 
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**ARRAY[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_by_id**
> Driver get_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id_or_external_id = "driver_id_or_external_id_example"; # string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

eval { 
    my $result = $api_instance->get_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_driver_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id_or_external_id** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_document_types_by_org_id**
> ARRAY[DocumentType] get_driver_document_types_by_org_id()

/fleet/drivers/document_types

Fetch all of the document types.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);


eval { 
    my $result = $api_instance->get_driver_document_types_by_org_id();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_driver_document_types_by_org_id: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ARRAY[DocumentType]**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_documents_by_org_id**
> ARRAY[Document] get_driver_documents_by_org_id(access_token => $access_token, end_ms => $end_ms, duration_ms => $duration_ms)

/fleet/drivers/documents

Fetch all of the documents.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $end_ms = 789; # int | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
my $duration_ms = 789; # int | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.

eval { 
    my $result = $api_instance->get_driver_documents_by_org_id(access_token => $access_token, end_ms => $end_ms, duration_ms => $duration_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_driver_documents_by_org_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **end_ms** | **int**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] 
 **duration_ms** | **int**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] 

### Return type

[**ARRAY[Document]**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_driver_safety_score**
> DriverSafetyScoreResponse get_driver_safety_score(driver_id => $driver_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $driver_id = 789; # int | ID of the driver
my $access_token = "access_token_example"; # string | Samsara API access token.
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_driver_safety_score(driver_id => $driver_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_driver_safety_score: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **int**| ID of the driver | 
 **access_token** | **string**| Samsara API access token. | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dvirs**
> DvirListResponse get_dvirs(access_token => $access_token, end_ms => $end_ms, duration_ms => $duration_ms, group_id => $group_id)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $end_ms = 56; # int | time in millis until the last dvir log.
my $duration_ms = 56; # int | time in millis which corresponds to the duration before the end_ms.
my $group_id = 56; # int | Group ID to query.

eval { 
    my $result = $api_instance->get_dvirs(access_token => $access_token, end_ms => $end_ms, duration_ms => $duration_ms, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_dvirs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **end_ms** | **int**| time in millis until the last dvir log. | 
 **duration_ms** | **int**| time in millis which corresponds to the duration before the end_ms. | 
 **group_id** | **int**| Group ID to query. | [optional] 

### Return type

[**DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers**
> DriversResponse get_fleet_drivers(access_token => $access_token, group_drivers_param => $group_drivers_param)

/fleet/drivers

Get all the drivers for the specified group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_drivers_param = WWW::OpenAPIClient::Object::InlineObject3->new(); # InlineObject3 | 

eval { 
    my $result = $api_instance->get_fleet_drivers(access_token => $access_token, group_drivers_param => $group_drivers_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_drivers: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_drivers_param** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type

[**DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers_hos_daily_logs**
> DriverDailyLogResponse get_fleet_drivers_hos_daily_logs(access_token => $access_token, driver_id => $driver_id, hos_logs_param => $hos_logs_param)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id = 789; # int | ID of the driver with HOS logs.
my $hos_logs_param = WWW::OpenAPIClient::Object::InlineObject6->new(); # InlineObject6 | 

eval { 
    my $result = $api_instance->get_fleet_drivers_hos_daily_logs(access_token => $access_token, driver_id => $driver_id, hos_logs_param => $hos_logs_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_drivers_hos_daily_logs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id** | **int**| ID of the driver with HOS logs. | 
 **hos_logs_param** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_drivers_summary**
> DriversSummaryResponse get_fleet_drivers_summary(access_token => $access_token, drivers_summary_param => $drivers_summary_param, snap_to_day_bounds => $snap_to_day_bounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $drivers_summary_param = WWW::OpenAPIClient::Object::InlineObject5->new(); # InlineObject5 | 
my $snap_to_day_bounds = null; # boolean | Snap query result to HOS day boundaries.

eval { 
    my $result = $api_instance->get_fleet_drivers_summary(access_token => $access_token, drivers_summary_param => $drivers_summary_param, snap_to_day_bounds => $snap_to_day_bounds);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_drivers_summary: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **drivers_summary_param** | [**InlineObject5**](InlineObject5.md)|  | 
 **snap_to_day_bounds** | **boolean**| Snap query result to HOS day boundaries. | [optional] 

### Return type

[**DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_authentication_logs**
> HosAuthenticationLogsResponse get_fleet_hos_authentication_logs(access_token => $access_token, hos_authentication_logs_param => $hos_authentication_logs_param)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $hos_authentication_logs_param = WWW::OpenAPIClient::Object::InlineObject7->new(); # InlineObject7 | 

eval { 
    my $result = $api_instance->get_fleet_hos_authentication_logs(access_token => $access_token, hos_authentication_logs_param => $hos_authentication_logs_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_hos_authentication_logs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **hos_authentication_logs_param** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type

[**HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_logs**
> HosLogsResponse get_fleet_hos_logs(access_token => $access_token, hos_logs_param => $hos_logs_param)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $hos_logs_param = WWW::OpenAPIClient::Object::InlineObject8->new(); # InlineObject8 | 

eval { 
    my $result = $api_instance->get_fleet_hos_logs(access_token => $access_token, hos_logs_param => $hos_logs_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_hos_logs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **hos_logs_param** | [**InlineObject8**](InlineObject8.md)|  | 

### Return type

[**HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_hos_logs_summary**
> HosLogsSummaryResponse get_fleet_hos_logs_summary(access_token => $access_token, hos_logs_param => $hos_logs_param)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $hos_logs_param = WWW::OpenAPIClient::Object::InlineObject9->new(); # InlineObject9 | 

eval { 
    my $result = $api_instance->get_fleet_hos_logs_summary(access_token => $access_token, hos_logs_param => $hos_logs_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_hos_logs_summary: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **hos_logs_param** | [**InlineObject9**](InlineObject9.md)|  | 

### Return type

[**HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_locations**
> InlineResponse2003 get_fleet_locations(access_token => $access_token, group_param => $group_param)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_param = WWW::OpenAPIClient::Object::InlineObject11->new(); # InlineObject11 | 

eval { 
    my $result = $api_instance->get_fleet_locations(access_token => $access_token, group_param => $group_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_locations: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_param** | [**InlineObject11**](InlineObject11.md)|  | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_maintenance_list**
> InlineResponse2004 get_fleet_maintenance_list(access_token => $access_token, group_param => $group_param)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_param = WWW::OpenAPIClient::Object::InlineObject13->new(); # InlineObject13 | 

eval { 
    my $result = $api_instance->get_fleet_maintenance_list(access_token => $access_token, group_param => $group_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_maintenance_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_param** | [**InlineObject13**](InlineObject13.md)|  | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_trips**
> TripResponse get_fleet_trips(access_token => $access_token, trips_param => $trips_param)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $trips_param = WWW::OpenAPIClient::Object::InlineObject15->new(); # InlineObject15 | 

eval { 
    my $result = $api_instance->get_fleet_trips(access_token => $access_token, trips_param => $trips_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_trips: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **trips_param** | [**InlineObject15**](InlineObject15.md)|  | 

### Return type

[**TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fleet_vehicle**
> FleetVehicleResponse get_fleet_vehicle(access_token => $access_token, vehicle_id_or_external_id => $vehicle_id_or_external_id)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $vehicle_id_or_external_id = "vehicle_id_or_external_id_example"; # string | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.

eval { 
    my $result = $api_instance->get_fleet_vehicle(access_token => $access_token, vehicle_id_or_external_id => $vehicle_id_or_external_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_fleet_vehicle: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_id_or_external_id** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_organization_address**
> Address get_organization_address(access_token => $access_token, address_id => $address_id)

/addresses/{addressId}

Fetch an address by its id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $address_id = 789; # int | ID of the address/geofence

eval { 
    my $result = $api_instance->get_organization_address(access_token => $access_token, address_id => $address_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_organization_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **address_id** | **int**| ID of the address/geofence | 

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_organization_addresses**
> ARRAY[Address] get_organization_addresses(access_token => $access_token)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.

eval { 
    my $result = $api_instance->get_organization_addresses(access_token => $access_token);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_organization_addresses: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 

### Return type

[**ARRAY[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_organization_contact**
> Contact get_organization_contact(access_token => $access_token, contact_id => $contact_id)

/contacts/{contact_id}

Fetch a contact by its id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $contact_id = 789; # int | ID of the contact

eval { 
    my $result = $api_instance->get_organization_contact(access_token => $access_token, contact_id => $contact_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_organization_contact: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **contact_id** | **int**| ID of the contact | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_harsh_event**
> VehicleHarshEventResponse get_vehicle_harsh_event(vehicle_id => $vehicle_id, access_token => $access_token, timestamp => $timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $vehicle_id = 789; # int | ID of the vehicle
my $access_token = "access_token_example"; # string | Samsara API access token.
my $timestamp = 789; # int | Timestamp in milliseconds representing the timestamp of a harsh event.

eval { 
    my $result = $api_instance->get_vehicle_harsh_event(vehicle_id => $vehicle_id, access_token => $access_token, timestamp => $timestamp);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_vehicle_harsh_event: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle | 
 **access_token** | **string**| Samsara API access token. | 
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_locations**
> ARRAY[FleetVehicleLocation] get_vehicle_locations(access_token => $access_token, vehicle_id => $vehicle_id, start_ms => $start_ms, end_ms => $end_ms)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $vehicle_id = 789; # int | ID of the vehicle with the associated routes.
my $start_ms = 789; # int | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
my $end_ms = 789; # int | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)

eval { 
    my $result = $api_instance->get_vehicle_locations(access_token => $access_token, vehicle_id => $vehicle_id, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_vehicle_locations: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. | 
 **start_ms** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | 
 **end_ms** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | 

### Return type

[**ARRAY[FleetVehicleLocation]**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_safety_score**
> VehicleSafetyScoreResponse get_vehicle_safety_score(vehicle_id => $vehicle_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $vehicle_id = 789; # int | ID of the vehicle
my $access_token = "access_token_example"; # string | Samsara API access token.
my $start_ms = 789; # int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
my $end_ms = 789; # int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

eval { 
    my $result = $api_instance->get_vehicle_safety_score(vehicle_id => $vehicle_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_vehicle_safety_score: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle | 
 **access_token** | **string**| Samsara API access token. | 
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicle_stats**
> InlineResponse2005 get_vehicle_stats(access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms, series => $series, tag_ids => $tag_ids, starting_after => $starting_after, ending_before => $ending_before, limit => $limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $start_ms = 56; # int | Time in Unix epoch milliseconds for the start of the query.
my $end_ms = 56; # int | Time in Unix epoch milliseconds for the end of the query.
my $series = "series_example"; # string | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
my $tag_ids = "tag_ids_example"; # string | Comma-separated list of tag ids. Example: tagIds=1,2,3
my $starting_after = "starting_after_example"; # string | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
my $ending_before = "ending_before_example"; # string | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
my $limit = 789; # int | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

eval { 
    my $result = $api_instance->get_vehicle_stats(access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms, series => $series, tag_ids => $tag_ids, starting_after => $starting_after, ending_before => $ending_before, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_vehicle_stats: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **start_ms** | **int**| Time in Unix epoch milliseconds for the start of the query. | 
 **end_ms** | **int**| Time in Unix epoch milliseconds for the end of the query. | 
 **series** | **string**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] 
 **tag_ids** | **string**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] 
 **starting_after** | **string**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **ending_before** | **string**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **int**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vehicles_locations**
> ARRAY[object] get_vehicles_locations(access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $start_ms = 56; # int | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
my $end_ms = 56; # int | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)

eval { 
    my $result = $api_instance->get_vehicles_locations(access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->get_vehicles_locations: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **start_ms** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | 
 **end_ms** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | 

### Return type

**ARRAY[object]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_contacts**
> ARRAY[Contact] list_contacts(access_token => $access_token)

/contacts

Fetch all contacts for the organization.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.

eval { 
    my $result = $api_instance->list_contacts(access_token => $access_token);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->list_contacts: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 

### Return type

[**ARRAY[Contact]**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fleet**
> InlineResponse2002 list_fleet(access_token => $access_token, group_param => $group_param, starting_after => $starting_after, ending_before => $ending_before, limit => $limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_param = WWW::OpenAPIClient::Object::InlineObject10->new(); # InlineObject10 | 
my $starting_after = "starting_after_example"; # string | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
my $ending_before = "ending_before_example"; # string | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
my $limit = 789; # int | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

eval { 
    my $result = $api_instance->list_fleet(access_token => $access_token, group_param => $group_param, starting_after => $starting_after, ending_before => $ending_before, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->list_fleet: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **group_param** | [**InlineObject10**](InlineObject10.md)|  | 
 **starting_after** | **string**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **ending_before** | **string**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **int**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_fleet_vehicle**
> FleetVehicleResponse patch_fleet_vehicle(access_token => $access_token, vehicle_id_or_external_id => $vehicle_id_or_external_id, data => $data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $vehicle_id_or_external_id = "vehicle_id_or_external_id_example"; # string | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
my $data = WWW::OpenAPIClient::Object::InlineObject16->new(); # InlineObject16 | 

eval { 
    my $result = $api_instance->patch_fleet_vehicle(access_token => $access_token, vehicle_id_or_external_id => $vehicle_id_or_external_id, data => $data);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->patch_fleet_vehicle: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_id_or_external_id** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
 **data** | [**InlineObject16**](InlineObject16.md)|  | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reactivate_driver_by_id**
> Driver reactivate_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id, reactivate_driver_param => $reactivate_driver_param)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $driver_id_or_external_id = "driver_id_or_external_id_example"; # string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
my $reactivate_driver_param = WWW::OpenAPIClient::Object::InlineObject4->new(); # InlineObject4 | 

eval { 
    my $result = $api_instance->reactivate_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id, reactivate_driver_param => $reactivate_driver_param);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->reactivate_driver_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **driver_id_or_external_id** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
 **reactivate_driver_param** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dispatch_route_by_id**
> DispatchRoute update_dispatch_route_by_id(access_token => $access_token, route_id => $route_id, update_dispatch_route_params => $update_dispatch_route_params)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $route_id = 789; # int | ID of the dispatch route.
my $update_dispatch_route_params = WWW::OpenAPIClient::Object::DispatchRoute->new(); # DispatchRoute | 

eval { 
    my $result = $api_instance->update_dispatch_route_by_id(access_token => $access_token, route_id => $route_id, update_dispatch_route_params => $update_dispatch_route_params);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FleetApi->update_dispatch_route_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **route_id** | **int**| ID of the dispatch route. | 
 **update_dispatch_route_params** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_organization_address**
> update_organization_address(access_token => $access_token, address_id => $address_id, address => $address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $address_id = 789; # int | ID of the address/geofence
my $address = WWW::OpenAPIClient::Object::InlineObject1->new(); # InlineObject1 | 

eval { 
    $api_instance->update_organization_address(access_token => $access_token, address_id => $address_id, address => $address);
};
if ($@) {
    warn "Exception when calling FleetApi->update_organization_address: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **address_id** | **int**| ID of the address/geofence | 
 **address** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_vehicles**
> update_vehicles(access_token => $access_token, vehicle_update_param => $vehicle_update_param)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FleetApi;
my $api_instance = WWW::OpenAPIClient::FleetApi->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $vehicle_update_param = WWW::OpenAPIClient::Object::InlineObject14->new(); # InlineObject14 | 

eval { 
    $api_instance->update_vehicles(access_token => $access_token, vehicle_update_param => $vehicle_update_param);
};
if ($@) {
    warn "Exception when calling FleetApi->update_vehicles: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. | 
 **vehicle_update_param** | [**InlineObject14**](InlineObject14.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

