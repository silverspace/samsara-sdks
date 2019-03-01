# OpenAPI\Client\FleetApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFleetAddress**](FleetApi.md#addFleetAddress) | **POST** /fleet/add_address | /fleet/add_address
[**addOrganizationAddresses**](FleetApi.md#addOrganizationAddresses) | **POST** /addresses | /addresses
[**createDispatchRoute**](FleetApi.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriver**](FleetApi.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**createDriverDispatchRoute**](FleetApi.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createDriverDocument**](FleetApi.md#createDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**createDvir**](FleetApi.md#createDvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**createVehicleDispatchRoute**](FleetApi.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivateDriver**](FleetApi.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**deleteDispatchRouteById**](FleetApi.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**deleteOrganizationAddress**](FleetApi.md#deleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**fetchAllDispatchRoutes**](FleetApi.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](FleetApi.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getAllAssetCurrentLocations**](FleetApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](FleetApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAllDeactivatedDrivers**](FleetApi.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**getAssetLocation**](FleetApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](FleetApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**getDeactivatedDriverById**](FleetApi.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDispatchRouteById**](FleetApi.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](FleetApi.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](FleetApi.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](FleetApi.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**getDriverById**](FleetApi.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDriverDocumentTypesByOrgId**](FleetApi.md#getDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**getDriverDocumentsByOrgId**](FleetApi.md#getDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**getDriverSafetyScore**](FleetApi.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getDvirs**](FleetApi.md#getDvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**getFleetDrivers**](FleetApi.md#getFleetDrivers) | **POST** /fleet/drivers | /fleet/drivers
[**getFleetDriversHosDailyLogs**](FleetApi.md#getFleetDriversHosDailyLogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**getFleetDriversSummary**](FleetApi.md#getFleetDriversSummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**getFleetHosAuthenticationLogs**](FleetApi.md#getFleetHosAuthenticationLogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**getFleetHosLogs**](FleetApi.md#getFleetHosLogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**getFleetHosLogsSummary**](FleetApi.md#getFleetHosLogsSummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**getFleetLocations**](FleetApi.md#getFleetLocations) | **POST** /fleet/locations | /fleet/locations
[**getFleetMaintenanceList**](FleetApi.md#getFleetMaintenanceList) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**getFleetTrips**](FleetApi.md#getFleetTrips) | **POST** /fleet/trips | /fleet/trips
[**getFleetVehicle**](FleetApi.md#getFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getOrganizationAddress**](FleetApi.md#getOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**getOrganizationAddresses**](FleetApi.md#getOrganizationAddresses) | **GET** /addresses | /addresses
[**getOrganizationContact**](FleetApi.md#getOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**getVehicleHarshEvent**](FleetApi.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleLocations**](FleetApi.md#getVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**getVehicleSafetyScore**](FleetApi.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**getVehicleStats**](FleetApi.md#getVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**getVehiclesLocations**](FleetApi.md#getVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**listContacts**](FleetApi.md#listContacts) | **GET** /contacts | /contacts
[**listFleet**](FleetApi.md#listFleet) | **POST** /fleet/list | /fleet/list
[**patchFleetVehicle**](FleetApi.md#patchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivateDriverById**](FleetApi.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**updateDispatchRouteById**](FleetApi.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**updateOrganizationAddress**](FleetApi.md#updateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**updateVehicles**](FleetApi.md#updateVehicles) | **POST** /fleet/set_data | /fleet/set_data


# **addFleetAddress**
> addFleetAddress($access_token, $address_param)

/fleet/add_address

This method adds an address book entry to the specified group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$address_param = new \OpenAPI\Client\Model\InlineObject2(); // \OpenAPI\Client\Model\InlineObject2 | 

try {
    $apiInstance->addFleetAddress($access_token, $address_param);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->addFleetAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **address_param** | [**\OpenAPI\Client\Model\InlineObject2**](../Model/InlineObject2.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **addOrganizationAddresses**
> \OpenAPI\Client\Model\Address[] addOrganizationAddresses($access_token, $addresses)

/addresses

Add one or more addresses to the organization

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$addresses = new \OpenAPI\Client\Model\InlineObject(); // \OpenAPI\Client\Model\InlineObject | 

try {
    $result = $apiInstance->addOrganizationAddresses($access_token, $addresses);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->addOrganizationAddresses: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **addresses** | [**\OpenAPI\Client\Model\InlineObject**](../Model/InlineObject.md)|  |

### Return type

[**\OpenAPI\Client\Model\Address[]**](../Model/Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDispatchRoute**
> \OpenAPI\Client\Model\DispatchRoute createDispatchRoute($access_token, $create_dispatch_route_params)

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$create_dispatch_route_params = new \OpenAPI\Client\Model\DispatchRouteCreate(); // \OpenAPI\Client\Model\DispatchRouteCreate | 

try {
    $result = $apiInstance->createDispatchRoute($access_token, $create_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->createDispatchRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **create_dispatch_route_params** | [**\OpenAPI\Client\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**\OpenAPI\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDriver**
> \OpenAPI\Client\Model\Driver createDriver($access_token, $create_driver_param)

/fleet/drivers/create

Create a new driver.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$create_driver_param = new \OpenAPI\Client\Model\DriverForCreate(); // \OpenAPI\Client\Model\DriverForCreate | Driver creation body

try {
    $result = $apiInstance->createDriver($access_token, $create_driver_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->createDriver: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **create_driver_param** | [**\OpenAPI\Client\Model\DriverForCreate**](../Model/DriverForCreate.md)| Driver creation body |

### Return type

[**\OpenAPI\Client\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDriverDispatchRoute**
> \OpenAPI\Client\Model\DispatchRoute createDriverDispatchRoute($access_token, $driver_id, $create_dispatch_route_params)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id = 56; // int | ID of the driver with the associated routes.
$create_dispatch_route_params = new \OpenAPI\Client\Model\DispatchRouteCreate(); // \OpenAPI\Client\Model\DispatchRouteCreate | 

try {
    $result = $apiInstance->createDriverDispatchRoute($access_token, $driver_id, $create_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->createDriverDispatchRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id** | **int**| ID of the driver with the associated routes. |
 **create_dispatch_route_params** | [**\OpenAPI\Client\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**\OpenAPI\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDriverDocument**
> \OpenAPI\Client\Model\Document createDriverDocument($access_token, $driver_id, $create_document_params)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id = 56; // int | ID of the driver for whom the document is created.
$create_document_params = new \OpenAPI\Client\Model\DocumentCreate(); // \OpenAPI\Client\Model\DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

try {
    $result = $apiInstance->createDriverDocument($access_token, $driver_id, $create_document_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->createDriverDocument: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id** | **int**| ID of the driver for whom the document is created. |
 **create_document_params** | [**\OpenAPI\Client\Model\DocumentCreate**](../Model/DocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |

### Return type

[**\OpenAPI\Client\Model\Document**](../Model/Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createDvir**
> \OpenAPI\Client\Model\DvirBase createDvir($access_token, $create_dvir_param)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$create_dvir_param = new \OpenAPI\Client\Model\InlineObject12(); // \OpenAPI\Client\Model\InlineObject12 | 

try {
    $result = $apiInstance->createDvir($access_token, $create_dvir_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->createDvir: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **create_dvir_param** | [**\OpenAPI\Client\Model\InlineObject12**](../Model/InlineObject12.md)|  |

### Return type

[**\OpenAPI\Client\Model\DvirBase**](../Model/DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **createVehicleDispatchRoute**
> \OpenAPI\Client\Model\DispatchRoute createVehicleDispatchRoute($access_token, $vehicle_id, $create_dispatch_route_params)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$vehicle_id = 56; // int | ID of the vehicle with the associated routes.
$create_dispatch_route_params = new \OpenAPI\Client\Model\DispatchRouteCreate(); // \OpenAPI\Client\Model\DispatchRouteCreate | 

try {
    $result = $apiInstance->createVehicleDispatchRoute($access_token, $vehicle_id, $create_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->createVehicleDispatchRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. |
 **create_dispatch_route_params** | [**\OpenAPI\Client\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**\OpenAPI\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deactivateDriver**
> deactivateDriver($access_token, $driver_id_or_external_id)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id_or_external_id = 'driver_id_or_external_id_example'; // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

try {
    $apiInstance->deactivateDriver($access_token, $driver_id_or_external_id);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->deactivateDriver: ', $e->getMessage(), PHP_EOL;
}
?>
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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteDispatchRouteById**
> deleteDispatchRouteById($access_token, $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$route_id = 56; // int | ID of the dispatch route.

try {
    $apiInstance->deleteDispatchRouteById($access_token, $route_id);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->deleteDispatchRouteById: ', $e->getMessage(), PHP_EOL;
}
?>
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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteOrganizationAddress**
> deleteOrganizationAddress($access_token, $address_id)

/addresses/{addressId}

Delete an address.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$address_id = 56; // int | ID of the address/geofence

try {
    $apiInstance->deleteOrganizationAddress($access_token, $address_id);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->deleteOrganizationAddress: ', $e->getMessage(), PHP_EOL;
}
?>
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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **fetchAllDispatchRoutes**
> \OpenAPI\Client\Model\DispatchRoute[] fetchAllDispatchRoutes($access_token, $group_id, $end_time, $duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).
$end_time = 56; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
$duration = 56; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try {
    $result = $apiInstance->fetchAllDispatchRoutes($access_token, $group_id, $end_time, $duration);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->fetchAllDispatchRoutes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**\OpenAPI\Client\Model\DispatchRoute[]**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **fetchAllRouteJobUpdates**
> \OpenAPI\Client\Model\AllRouteJobUpdates fetchAllRouteJobUpdates($access_token, $group_id, $sequence_id, $include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).
$sequence_id = 'sequence_id_example'; // string | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
$include = 'include_example'; // string | Optionally set include=route to include route object in response payload.

try {
    $result = $apiInstance->fetchAllRouteJobUpdates($access_token, $group_id, $sequence_id, $include);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->fetchAllRouteJobUpdates: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **sequence_id** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional]
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional]

### Return type

[**\OpenAPI\Client\Model\AllRouteJobUpdates**](../Model/AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllAssetCurrentLocations**
> \OpenAPI\Client\Model\InlineResponse2001 getAllAssetCurrentLocations($access_token, $group_id)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    $result = $apiInstance->getAllAssetCurrentLocations($access_token, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getAllAssetCurrentLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllAssets**
> \OpenAPI\Client\Model\InlineResponse200 getAllAssets($access_token, $group_id)

/fleet/assets

Fetch all of the assets for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    $result = $apiInstance->getAllAssets($access_token, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getAllAssets: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAllDeactivatedDrivers**
> \OpenAPI\Client\Model\Driver[] getAllDeactivatedDrivers($access_token, $group_id)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_id = 56; // int | Optional group ID if the organization has multiple groups (uncommon).

try {
    $result = $apiInstance->getAllDeactivatedDrivers($access_token, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getAllDeactivatedDrivers: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_id** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**\OpenAPI\Client\Model\Driver[]**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAssetLocation**
> object[] getAssetLocation($access_token, $asset_id, $start_ms, $end_ms)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$asset_id = 56; // int | ID of the asset
$start_ms = 56; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 56; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getAssetLocation($access_token, $asset_id, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getAssetLocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **asset_id** | **int**| ID of the asset |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

**object[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAssetReefer**
> \OpenAPI\Client\Model\AssetReeferResponse getAssetReefer($access_token, $asset_id, $start_ms, $end_ms)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$asset_id = 56; // int | ID of the asset
$start_ms = 56; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 56; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getAssetReefer($access_token, $asset_id, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getAssetReefer: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **asset_id** | **int**| ID of the asset |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**\OpenAPI\Client\Model\AssetReeferResponse**](../Model/AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDeactivatedDriverById**
> \OpenAPI\Client\Model\Driver getDeactivatedDriverById($access_token, $driver_id_or_external_id)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id_or_external_id = 'driver_id_or_external_id_example'; // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

try {
    $result = $apiInstance->getDeactivatedDriverById($access_token, $driver_id_or_external_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDeactivatedDriverById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id_or_external_id** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |

### Return type

[**\OpenAPI\Client\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRouteById**
> \OpenAPI\Client\Model\DispatchRoute getDispatchRouteById($access_token, $route_id)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$route_id = 56; // int | ID of the dispatch route.

try {
    $result = $apiInstance->getDispatchRouteById($access_token, $route_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDispatchRouteById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **route_id** | **int**| ID of the dispatch route. |

### Return type

[**\OpenAPI\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRouteHistory**
> \OpenAPI\Client\Model\DispatchRouteHistory getDispatchRouteHistory($access_token, $route_id, $start_time, $end_time)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$route_id = 56; // int | ID of the route with history.
$start_time = 56; // int | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
$end_time = 56; // int | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.

try {
    $result = $apiInstance->getDispatchRouteHistory($access_token, $route_id, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDispatchRouteHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **route_id** | **int**| ID of the route with history. |
 **start_time** | **int**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional]
 **end_time** | **int**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional]

### Return type

[**\OpenAPI\Client\Model\DispatchRouteHistory**](../Model/DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRoutesByDriverId**
> \OpenAPI\Client\Model\DispatchRoute[] getDispatchRoutesByDriverId($access_token, $driver_id, $end_time, $duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id = 56; // int | ID of the driver with the associated routes.
$end_time = 56; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
$duration = 56; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try {
    $result = $apiInstance->getDispatchRoutesByDriverId($access_token, $driver_id, $end_time, $duration);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDispatchRoutesByDriverId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id** | **int**| ID of the driver with the associated routes. |
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**\OpenAPI\Client\Model\DispatchRoute[]**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDispatchRoutesByVehicleId**
> \OpenAPI\Client\Model\DispatchRoute[] getDispatchRoutesByVehicleId($access_token, $vehicle_id, $end_time, $duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$vehicle_id = 56; // int | ID of the vehicle with the associated routes.
$end_time = 56; // int | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
$duration = 56; // int | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.

try {
    $result = $apiInstance->getDispatchRoutesByVehicleId($access_token, $vehicle_id, $end_time, $duration);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDispatchRoutesByVehicleId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. |
 **end_time** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**\OpenAPI\Client\Model\DispatchRoute[]**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDriverById**
> \OpenAPI\Client\Model\Driver getDriverById($access_token, $driver_id_or_external_id)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id_or_external_id = 'driver_id_or_external_id_example'; // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

try {
    $result = $apiInstance->getDriverById($access_token, $driver_id_or_external_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDriverById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id_or_external_id** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |

### Return type

[**\OpenAPI\Client\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDriverDocumentTypesByOrgId**
> \OpenAPI\Client\Model\DocumentType[] getDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getDriverDocumentTypesByOrgId();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDriverDocumentTypesByOrgId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\DocumentType[]**](../Model/DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDriverDocumentsByOrgId**
> \OpenAPI\Client\Model\Document[] getDriverDocumentsByOrgId($access_token, $end_ms, $duration_ms)

/fleet/drivers/documents

Fetch all of the documents.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$end_ms = 56; // int | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
$duration_ms = 56; // int | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.

try {
    $result = $apiInstance->getDriverDocumentsByOrgId($access_token, $end_ms, $duration_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDriverDocumentsByOrgId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **end_ms** | **int**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional]
 **duration_ms** | **int**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional]

### Return type

[**\OpenAPI\Client\Model\Document[]**](../Model/Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDriverSafetyScore**
> \OpenAPI\Client\Model\DriverSafetyScoreResponse getDriverSafetyScore($driver_id, $access_token, $start_ms, $end_ms)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$driver_id = 56; // int | ID of the driver
$access_token = 'access_token_example'; // string | Samsara API access token.
$start_ms = 56; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 56; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getDriverSafetyScore($driver_id, $access_token, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDriverSafetyScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driver_id** | **int**| ID of the driver |
 **access_token** | **string**| Samsara API access token. |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**\OpenAPI\Client\Model\DriverSafetyScoreResponse**](../Model/DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getDvirs**
> \OpenAPI\Client\Model\DvirListResponse getDvirs($access_token, $end_ms, $duration_ms, $group_id)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$end_ms = 56; // int | time in millis until the last dvir log.
$duration_ms = 56; // int | time in millis which corresponds to the duration before the end_ms.
$group_id = 56; // int | Group ID to query.

try {
    $result = $apiInstance->getDvirs($access_token, $end_ms, $duration_ms, $group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getDvirs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **end_ms** | **int**| time in millis until the last dvir log. |
 **duration_ms** | **int**| time in millis which corresponds to the duration before the end_ms. |
 **group_id** | **int**| Group ID to query. | [optional]

### Return type

[**\OpenAPI\Client\Model\DvirListResponse**](../Model/DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetDrivers**
> \OpenAPI\Client\Model\DriversResponse getFleetDrivers($access_token, $group_drivers_param)

/fleet/drivers

Get all the drivers for the specified group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_drivers_param = new \OpenAPI\Client\Model\InlineObject3(); // \OpenAPI\Client\Model\InlineObject3 | 

try {
    $result = $apiInstance->getFleetDrivers($access_token, $group_drivers_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetDrivers: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_drivers_param** | [**\OpenAPI\Client\Model\InlineObject3**](../Model/InlineObject3.md)|  |

### Return type

[**\OpenAPI\Client\Model\DriversResponse**](../Model/DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetDriversHosDailyLogs**
> \OpenAPI\Client\Model\DriverDailyLogResponse getFleetDriversHosDailyLogs($access_token, $driver_id, $hos_logs_param)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id = 56; // int | ID of the driver with HOS logs.
$hos_logs_param = new \OpenAPI\Client\Model\InlineObject6(); // \OpenAPI\Client\Model\InlineObject6 | 

try {
    $result = $apiInstance->getFleetDriversHosDailyLogs($access_token, $driver_id, $hos_logs_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetDriversHosDailyLogs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id** | **int**| ID of the driver with HOS logs. |
 **hos_logs_param** | [**\OpenAPI\Client\Model\InlineObject6**](../Model/InlineObject6.md)|  |

### Return type

[**\OpenAPI\Client\Model\DriverDailyLogResponse**](../Model/DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetDriversSummary**
> \OpenAPI\Client\Model\DriversSummaryResponse getFleetDriversSummary($access_token, $drivers_summary_param, $snap_to_day_bounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$drivers_summary_param = new \OpenAPI\Client\Model\InlineObject5(); // \OpenAPI\Client\Model\InlineObject5 | 
$snap_to_day_bounds = True; // bool | Snap query result to HOS day boundaries.

try {
    $result = $apiInstance->getFleetDriversSummary($access_token, $drivers_summary_param, $snap_to_day_bounds);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetDriversSummary: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **drivers_summary_param** | [**\OpenAPI\Client\Model\InlineObject5**](../Model/InlineObject5.md)|  |
 **snap_to_day_bounds** | **bool**| Snap query result to HOS day boundaries. | [optional]

### Return type

[**\OpenAPI\Client\Model\DriversSummaryResponse**](../Model/DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetHosAuthenticationLogs**
> \OpenAPI\Client\Model\HosAuthenticationLogsResponse getFleetHosAuthenticationLogs($access_token, $hos_authentication_logs_param)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$hos_authentication_logs_param = new \OpenAPI\Client\Model\InlineObject7(); // \OpenAPI\Client\Model\InlineObject7 | 

try {
    $result = $apiInstance->getFleetHosAuthenticationLogs($access_token, $hos_authentication_logs_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetHosAuthenticationLogs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **hos_authentication_logs_param** | [**\OpenAPI\Client\Model\InlineObject7**](../Model/InlineObject7.md)|  |

### Return type

[**\OpenAPI\Client\Model\HosAuthenticationLogsResponse**](../Model/HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetHosLogs**
> \OpenAPI\Client\Model\HosLogsResponse getFleetHosLogs($access_token, $hos_logs_param)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$hos_logs_param = new \OpenAPI\Client\Model\InlineObject8(); // \OpenAPI\Client\Model\InlineObject8 | 

try {
    $result = $apiInstance->getFleetHosLogs($access_token, $hos_logs_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetHosLogs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **hos_logs_param** | [**\OpenAPI\Client\Model\InlineObject8**](../Model/InlineObject8.md)|  |

### Return type

[**\OpenAPI\Client\Model\HosLogsResponse**](../Model/HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetHosLogsSummary**
> \OpenAPI\Client\Model\HosLogsSummaryResponse getFleetHosLogsSummary($access_token, $hos_logs_param)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$hos_logs_param = new \OpenAPI\Client\Model\InlineObject9(); // \OpenAPI\Client\Model\InlineObject9 | 

try {
    $result = $apiInstance->getFleetHosLogsSummary($access_token, $hos_logs_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetHosLogsSummary: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **hos_logs_param** | [**\OpenAPI\Client\Model\InlineObject9**](../Model/InlineObject9.md)|  |

### Return type

[**\OpenAPI\Client\Model\HosLogsSummaryResponse**](../Model/HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetLocations**
> \OpenAPI\Client\Model\InlineResponse2003 getFleetLocations($access_token, $group_param)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_param = new \OpenAPI\Client\Model\InlineObject11(); // \OpenAPI\Client\Model\InlineObject11 | 

try {
    $result = $apiInstance->getFleetLocations($access_token, $group_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_param** | [**\OpenAPI\Client\Model\InlineObject11**](../Model/InlineObject11.md)|  |

### Return type

[**\OpenAPI\Client\Model\InlineResponse2003**](../Model/InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetMaintenanceList**
> \OpenAPI\Client\Model\InlineResponse2004 getFleetMaintenanceList($access_token, $group_param)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_param = new \OpenAPI\Client\Model\InlineObject13(); // \OpenAPI\Client\Model\InlineObject13 | 

try {
    $result = $apiInstance->getFleetMaintenanceList($access_token, $group_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetMaintenanceList: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_param** | [**\OpenAPI\Client\Model\InlineObject13**](../Model/InlineObject13.md)|  |

### Return type

[**\OpenAPI\Client\Model\InlineResponse2004**](../Model/InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetTrips**
> \OpenAPI\Client\Model\TripResponse getFleetTrips($access_token, $trips_param)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$trips_param = new \OpenAPI\Client\Model\InlineObject15(); // \OpenAPI\Client\Model\InlineObject15 | 

try {
    $result = $apiInstance->getFleetTrips($access_token, $trips_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetTrips: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **trips_param** | [**\OpenAPI\Client\Model\InlineObject15**](../Model/InlineObject15.md)|  |

### Return type

[**\OpenAPI\Client\Model\TripResponse**](../Model/TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getFleetVehicle**
> \OpenAPI\Client\Model\FleetVehicleResponse getFleetVehicle($access_token, $vehicle_id_or_external_id)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$vehicle_id_or_external_id = 'vehicle_id_or_external_id_example'; // string | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.

try {
    $result = $apiInstance->getFleetVehicle($access_token, $vehicle_id_or_external_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getFleetVehicle: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_id_or_external_id** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |

### Return type

[**\OpenAPI\Client\Model\FleetVehicleResponse**](../Model/FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrganizationAddress**
> \OpenAPI\Client\Model\Address getOrganizationAddress($access_token, $address_id)

/addresses/{addressId}

Fetch an address by its id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$address_id = 56; // int | ID of the address/geofence

try {
    $result = $apiInstance->getOrganizationAddress($access_token, $address_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getOrganizationAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **address_id** | **int**| ID of the address/geofence |

### Return type

[**\OpenAPI\Client\Model\Address**](../Model/Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrganizationAddresses**
> \OpenAPI\Client\Model\Address[] getOrganizationAddresses($access_token)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.

try {
    $result = $apiInstance->getOrganizationAddresses($access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getOrganizationAddresses: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |

### Return type

[**\OpenAPI\Client\Model\Address[]**](../Model/Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getOrganizationContact**
> \OpenAPI\Client\Model\Contact getOrganizationContact($access_token, $contact_id)

/contacts/{contact_id}

Fetch a contact by its id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$contact_id = 56; // int | ID of the contact

try {
    $result = $apiInstance->getOrganizationContact($access_token, $contact_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getOrganizationContact: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **contact_id** | **int**| ID of the contact |

### Return type

[**\OpenAPI\Client\Model\Contact**](../Model/Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVehicleHarshEvent**
> \OpenAPI\Client\Model\VehicleHarshEventResponse getVehicleHarshEvent($vehicle_id, $access_token, $timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$vehicle_id = 56; // int | ID of the vehicle
$access_token = 'access_token_example'; // string | Samsara API access token.
$timestamp = 56; // int | Timestamp in milliseconds representing the timestamp of a harsh event.

try {
    $result = $apiInstance->getVehicleHarshEvent($vehicle_id, $access_token, $timestamp);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getVehicleHarshEvent: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle |
 **access_token** | **string**| Samsara API access token. |
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. |

### Return type

[**\OpenAPI\Client\Model\VehicleHarshEventResponse**](../Model/VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVehicleLocations**
> \OpenAPI\Client\Model\FleetVehicleLocation[] getVehicleLocations($access_token, $vehicle_id, $start_ms, $end_ms)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$vehicle_id = 56; // int | ID of the vehicle with the associated routes.
$start_ms = 56; // int | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
$end_ms = 56; // int | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)

try {
    $result = $apiInstance->getVehicleLocations($access_token, $vehicle_id, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getVehicleLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_id** | **int**| ID of the vehicle with the associated routes. |
 **start_ms** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
 **end_ms** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |

### Return type

[**\OpenAPI\Client\Model\FleetVehicleLocation[]**](../Model/FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVehicleSafetyScore**
> \OpenAPI\Client\Model\VehicleSafetyScoreResponse getVehicleSafetyScore($vehicle_id, $access_token, $start_ms, $end_ms)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$vehicle_id = 56; // int | ID of the vehicle
$access_token = 'access_token_example'; // string | Samsara API access token.
$start_ms = 56; // int | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
$end_ms = 56; // int | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

try {
    $result = $apiInstance->getVehicleSafetyScore($vehicle_id, $access_token, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getVehicleSafetyScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicle_id** | **int**| ID of the vehicle |
 **access_token** | **string**| Samsara API access token. |
 **start_ms** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **end_ms** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**\OpenAPI\Client\Model\VehicleSafetyScoreResponse**](../Model/VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVehicleStats**
> \OpenAPI\Client\Model\InlineResponse2005 getVehicleStats($access_token, $start_ms, $end_ms, $series, $tag_ids, $starting_after, $ending_before, $limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$start_ms = 56; // int | Time in Unix epoch milliseconds for the start of the query.
$end_ms = 56; // int | Time in Unix epoch milliseconds for the end of the query.
$series = 'series_example'; // string | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
$tag_ids = 'tag_ids_example'; // string | Comma-separated list of tag ids. Example: tagIds=1,2,3
$starting_after = 'starting_after_example'; // string | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
$ending_before = 'ending_before_example'; // string | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
$limit = 56; // int | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

try {
    $result = $apiInstance->getVehicleStats($access_token, $start_ms, $end_ms, $series, $tag_ids, $starting_after, $ending_before, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getVehicleStats: ', $e->getMessage(), PHP_EOL;
}
?>
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

[**\OpenAPI\Client\Model\InlineResponse2005**](../Model/InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getVehiclesLocations**
> object[] getVehiclesLocations($access_token, $start_ms, $end_ms)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$start_ms = 56; // int | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
$end_ms = 56; // int | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)

try {
    $result = $apiInstance->getVehiclesLocations($access_token, $start_ms, $end_ms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->getVehiclesLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **start_ms** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
 **end_ms** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |

### Return type

**object[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listContacts**
> \OpenAPI\Client\Model\Contact[] listContacts($access_token)

/contacts

Fetch all contacts for the organization.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.

try {
    $result = $apiInstance->listContacts($access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->listContacts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |

### Return type

[**\OpenAPI\Client\Model\Contact[]**](../Model/Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listFleet**
> \OpenAPI\Client\Model\InlineResponse2002 listFleet($access_token, $group_param, $starting_after, $ending_before, $limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$group_param = new \OpenAPI\Client\Model\InlineObject10(); // \OpenAPI\Client\Model\InlineObject10 | 
$starting_after = 'starting_after_example'; // string | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
$ending_before = 'ending_before_example'; // string | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
$limit = 56; // int | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.

try {
    $result = $apiInstance->listFleet($access_token, $group_param, $starting_after, $ending_before, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->listFleet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **group_param** | [**\OpenAPI\Client\Model\InlineObject10**](../Model/InlineObject10.md)|  |
 **starting_after** | **string**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional]
 **ending_before** | **string**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional]
 **limit** | **int**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **patchFleetVehicle**
> \OpenAPI\Client\Model\FleetVehicleResponse patchFleetVehicle($access_token, $vehicle_id_or_external_id, $data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$vehicle_id_or_external_id = 'vehicle_id_or_external_id_example'; // string | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
$data = new \OpenAPI\Client\Model\InlineObject16(); // \OpenAPI\Client\Model\InlineObject16 | 

try {
    $result = $apiInstance->patchFleetVehicle($access_token, $vehicle_id_or_external_id, $data);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->patchFleetVehicle: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_id_or_external_id** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
 **data** | [**\OpenAPI\Client\Model\InlineObject16**](../Model/InlineObject16.md)|  |

### Return type

[**\OpenAPI\Client\Model\FleetVehicleResponse**](../Model/FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **reactivateDriverById**
> \OpenAPI\Client\Model\Driver reactivateDriverById($access_token, $driver_id_or_external_id, $reactivate_driver_param)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$driver_id_or_external_id = 'driver_id_or_external_id_example'; // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
$reactivate_driver_param = new \OpenAPI\Client\Model\InlineObject4(); // \OpenAPI\Client\Model\InlineObject4 | 

try {
    $result = $apiInstance->reactivateDriverById($access_token, $driver_id_or_external_id, $reactivate_driver_param);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->reactivateDriverById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **driver_id_or_external_id** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |
 **reactivate_driver_param** | [**\OpenAPI\Client\Model\InlineObject4**](../Model/InlineObject4.md)|  |

### Return type

[**\OpenAPI\Client\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateDispatchRouteById**
> \OpenAPI\Client\Model\DispatchRoute updateDispatchRouteById($access_token, $route_id, $update_dispatch_route_params)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$route_id = 56; // int | ID of the dispatch route.
$update_dispatch_route_params = new \OpenAPI\Client\Model\DispatchRoute(); // \OpenAPI\Client\Model\DispatchRoute | 

try {
    $result = $apiInstance->updateDispatchRouteById($access_token, $route_id, $update_dispatch_route_params);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->updateDispatchRouteById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **route_id** | **int**| ID of the dispatch route. |
 **update_dispatch_route_params** | [**\OpenAPI\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)|  |

### Return type

[**\OpenAPI\Client\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateOrganizationAddress**
> updateOrganizationAddress($access_token, $address_id, $address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$address_id = 56; // int | ID of the address/geofence
$address = new \OpenAPI\Client\Model\InlineObject1(); // \OpenAPI\Client\Model\InlineObject1 | 

try {
    $apiInstance->updateOrganizationAddress($access_token, $address_id, $address);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->updateOrganizationAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **address_id** | **int**| ID of the address/geofence |
 **address** | [**\OpenAPI\Client\Model\InlineObject1**](../Model/InlineObject1.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateVehicles**
> updateVehicles($access_token, $vehicle_update_param)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\FleetApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_token = 'access_token_example'; // string | Samsara API access token.
$vehicle_update_param = new \OpenAPI\Client\Model\InlineObject14(); // \OpenAPI\Client\Model\InlineObject14 | 

try {
    $apiInstance->updateVehicles($access_token, $vehicle_update_param);
} catch (Exception $e) {
    echo 'Exception when calling FleetApi->updateVehicles: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **string**| Samsara API access token. |
 **vehicle_update_param** | [**\OpenAPI\Client\Model\InlineObject14**](../Model/InlineObject14.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

