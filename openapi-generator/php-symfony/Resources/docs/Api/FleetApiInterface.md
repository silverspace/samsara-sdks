# OpenAPI\Server\Api\FleetApiInterface

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFleetAddress**](FleetApiInterface.md#addFleetAddress) | **POST** /fleet/add_address | /fleet/add_address
[**addOrganizationAddresses**](FleetApiInterface.md#addOrganizationAddresses) | **POST** /addresses | /addresses
[**createDispatchRoute**](FleetApiInterface.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriver**](FleetApiInterface.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**createDriverDispatchRoute**](FleetApiInterface.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createDriverDocument**](FleetApiInterface.md#createDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**createDvir**](FleetApiInterface.md#createDvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**createVehicleDispatchRoute**](FleetApiInterface.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivateDriver**](FleetApiInterface.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**deleteDispatchRouteById**](FleetApiInterface.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**deleteOrganizationAddress**](FleetApiInterface.md#deleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**fetchAllDispatchRoutes**](FleetApiInterface.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](FleetApiInterface.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getAllAssetCurrentLocations**](FleetApiInterface.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](FleetApiInterface.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAllDeactivatedDrivers**](FleetApiInterface.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**getAssetLocation**](FleetApiInterface.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](FleetApiInterface.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**getDeactivatedDriverById**](FleetApiInterface.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDispatchRouteById**](FleetApiInterface.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](FleetApiInterface.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](FleetApiInterface.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](FleetApiInterface.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**getDriverById**](FleetApiInterface.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDriverDocumentTypesByOrgId**](FleetApiInterface.md#getDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**getDriverDocumentsByOrgId**](FleetApiInterface.md#getDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**getDriverSafetyScore**](FleetApiInterface.md#getDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**getDvirs**](FleetApiInterface.md#getDvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**getFleetDrivers**](FleetApiInterface.md#getFleetDrivers) | **POST** /fleet/drivers | /fleet/drivers
[**getFleetDriversHosDailyLogs**](FleetApiInterface.md#getFleetDriversHosDailyLogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**getFleetDriversSummary**](FleetApiInterface.md#getFleetDriversSummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**getFleetHosAuthenticationLogs**](FleetApiInterface.md#getFleetHosAuthenticationLogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**getFleetHosLogs**](FleetApiInterface.md#getFleetHosLogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**getFleetHosLogsSummary**](FleetApiInterface.md#getFleetHosLogsSummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**getFleetLocations**](FleetApiInterface.md#getFleetLocations) | **POST** /fleet/locations | /fleet/locations
[**getFleetMaintenanceList**](FleetApiInterface.md#getFleetMaintenanceList) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**getFleetTrips**](FleetApiInterface.md#getFleetTrips) | **POST** /fleet/trips | /fleet/trips
[**getFleetVehicle**](FleetApiInterface.md#getFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getOrganizationAddress**](FleetApiInterface.md#getOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**getOrganizationAddresses**](FleetApiInterface.md#getOrganizationAddresses) | **GET** /addresses | /addresses
[**getOrganizationContact**](FleetApiInterface.md#getOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**getVehicleHarshEvent**](FleetApiInterface.md#getVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleLocations**](FleetApiInterface.md#getVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**getVehicleSafetyScore**](FleetApiInterface.md#getVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**getVehicleStats**](FleetApiInterface.md#getVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**getVehiclesLocations**](FleetApiInterface.md#getVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**listContacts**](FleetApiInterface.md#listContacts) | **GET** /contacts | /contacts
[**listFleet**](FleetApiInterface.md#listFleet) | **POST** /fleet/list | /fleet/list
[**patchFleetVehicle**](FleetApiInterface.md#patchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivateDriverById**](FleetApiInterface.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**updateDispatchRouteById**](FleetApiInterface.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**updateOrganizationAddress**](FleetApiInterface.md#updateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**updateVehicles**](FleetApiInterface.md#updateVehicles) | **POST** /fleet/set_data | /fleet/set_data


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.fleet:
        class: Acme\MyBundle\Api\FleetApi
        tags:
            - { name: "open_apiserver.api", api: "fleet" }
    # ...
```

## **addFleetAddress**
> addFleetAddress($accessToken, $addressParam)

/fleet/add_address

This method adds an address book entry to the specified group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#addFleetAddress
     */
    public function addFleetAddress($accessToken, InlineObject2 $addressParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **addressParam** | [**OpenAPI\Server\Model\InlineObject2**](../Model/InlineObject2.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **addOrganizationAddresses**
> OpenAPI\Server\Model\Address addOrganizationAddresses($accessToken, $addresses)

/addresses

Add one or more addresses to the organization

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#addOrganizationAddresses
     */
    public function addOrganizationAddresses($accessToken, InlineObject $addresses)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **addresses** | [**OpenAPI\Server\Model\InlineObject**](../Model/InlineObject.md)|  |

### Return type

[**OpenAPI\Server\Model\Address**](../Model/Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createDispatchRoute**
> OpenAPI\Server\Model\DispatchRoute createDispatchRoute($accessToken, $createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#createDispatchRoute
     */
    public function createDispatchRoute($accessToken, DispatchRouteCreate $createDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **createDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createDriver**
> OpenAPI\Server\Model\Driver createDriver($accessToken, $createDriverParam)

/fleet/drivers/create

Create a new driver.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#createDriver
     */
    public function createDriver($accessToken, DriverForCreate $createDriverParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **createDriverParam** | [**OpenAPI\Server\Model\DriverForCreate**](../Model/DriverForCreate.md)| Driver creation body |

### Return type

[**OpenAPI\Server\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createDriverDispatchRoute**
> OpenAPI\Server\Model\DispatchRoute createDriverDispatchRoute($accessToken, $driverId, $createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#createDriverDispatchRoute
     */
    public function createDriverDispatchRoute($accessToken, $driverId, DispatchRouteCreate $createDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverId** | **int**| ID of the driver with the associated routes. |
 **createDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createDriverDocument**
> OpenAPI\Server\Model\Document createDriverDocument($accessToken, $driverId, $createDocumentParams)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#createDriverDocument
     */
    public function createDriverDocument($accessToken, $driverId, DocumentCreate $createDocumentParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverId** | **int**| ID of the driver for whom the document is created. |
 **createDocumentParams** | [**OpenAPI\Server\Model\DocumentCreate**](../Model/DocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |

### Return type

[**OpenAPI\Server\Model\Document**](../Model/Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createDvir**
> OpenAPI\Server\Model\DvirBase createDvir($accessToken, $createDvirParam)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#createDvir
     */
    public function createDvir($accessToken, InlineObject12 $createDvirParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **createDvirParam** | [**OpenAPI\Server\Model\InlineObject12**](../Model/InlineObject12.md)|  |

### Return type

[**OpenAPI\Server\Model\DvirBase**](../Model/DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createVehicleDispatchRoute**
> OpenAPI\Server\Model\DispatchRoute createVehicleDispatchRoute($accessToken, $vehicleId, $createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#createVehicleDispatchRoute
     */
    public function createVehicleDispatchRoute($accessToken, $vehicleId, DispatchRouteCreate $createDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleId** | **int**| ID of the vehicle with the associated routes. |
 **createDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRouteCreate**](../Model/DispatchRouteCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deactivateDriver**
> deactivateDriver($accessToken, $driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#deactivateDriver
     */
    public function deactivateDriver($accessToken, $driverIdOrExternalId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverIdOrExternalId** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteDispatchRouteById**
> deleteDispatchRouteById($accessToken, $routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#deleteDispatchRouteById
     */
    public function deleteDispatchRouteById($accessToken, $routeId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the dispatch route. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteOrganizationAddress**
> deleteOrganizationAddress($accessToken, $addressId)

/addresses/{addressId}

Delete an address.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#deleteOrganizationAddress
     */
    public function deleteOrganizationAddress($accessToken, $addressId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **addressId** | **int**| ID of the address/geofence |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **fetchAllDispatchRoutes**
> OpenAPI\Server\Model\DispatchRoute fetchAllDispatchRoutes($accessToken, $groupId, $endTime, $duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#fetchAllDispatchRoutes
     */
    public function fetchAllDispatchRoutes($accessToken, $groupId = null, $endTime = null, $duration = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **fetchAllRouteJobUpdates**
> OpenAPI\Server\Model\AllRouteJobUpdates fetchAllRouteJobUpdates($accessToken, $groupId, $sequenceId, $include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#fetchAllRouteJobUpdates
     */
    public function fetchAllRouteJobUpdates($accessToken, $groupId = null, $sequenceId = null, $include = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]
 **sequenceId** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional]
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional]

### Return type

[**OpenAPI\Server\Model\AllRouteJobUpdates**](../Model/AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAllAssetCurrentLocations**
> OpenAPI\Server\Model\InlineResponse2001 getAllAssetCurrentLocations($accessToken, $groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getAllAssetCurrentLocations
     */
    public function getAllAssetCurrentLocations($accessToken, $groupId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAllAssets**
> OpenAPI\Server\Model\InlineResponse200 getAllAssets($accessToken, $groupId)

/fleet/assets

Fetch all of the assets for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getAllAssets
     */
    public function getAllAssets($accessToken, $groupId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAllDeactivatedDrivers**
> OpenAPI\Server\Model\Driver getAllDeactivatedDrivers($accessToken, $groupId)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getAllDeactivatedDrivers
     */
    public function getAllDeactivatedDrivers($accessToken, $groupId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupId** | **int**| Optional group ID if the organization has multiple groups (uncommon). | [optional]

### Return type

[**OpenAPI\Server\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAssetLocation**
> array getAssetLocation($accessToken, $assetId, $startMs, $endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getAssetLocation
     */
    public function getAssetLocation($accessToken, $assetId, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **assetId** | **int**| ID of the asset |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

**array**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAssetReefer**
> OpenAPI\Server\Model\AssetReeferResponse getAssetReefer($accessToken, $assetId, $startMs, $endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getAssetReefer
     */
    public function getAssetReefer($accessToken, $assetId, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **assetId** | **int**| ID of the asset |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**OpenAPI\Server\Model\AssetReeferResponse**](../Model/AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDeactivatedDriverById**
> OpenAPI\Server\Model\Driver getDeactivatedDriverById($accessToken, $driverIdOrExternalId)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDeactivatedDriverById
     */
    public function getDeactivatedDriverById($accessToken, $driverIdOrExternalId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverIdOrExternalId** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |

### Return type

[**OpenAPI\Server\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRouteById**
> OpenAPI\Server\Model\DispatchRoute getDispatchRouteById($accessToken, $routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDispatchRouteById
     */
    public function getDispatchRouteById($accessToken, $routeId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the dispatch route. |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRouteHistory**
> OpenAPI\Server\Model\DispatchRouteHistory getDispatchRouteHistory($accessToken, $routeId, $startTime, $endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDispatchRouteHistory
     */
    public function getDispatchRouteHistory($accessToken, $routeId, $startTime = null, $endTime = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the route with history. |
 **startTime** | **int**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional]
 **endTime** | **int**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRouteHistory**](../Model/DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRoutesByDriverId**
> OpenAPI\Server\Model\DispatchRoute getDispatchRoutesByDriverId($accessToken, $driverId, $endTime, $duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDispatchRoutesByDriverId
     */
    public function getDispatchRoutesByDriverId($accessToken, $driverId, $endTime = null, $duration = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverId** | **int**| ID of the driver with the associated routes. |
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDispatchRoutesByVehicleId**
> OpenAPI\Server\Model\DispatchRoute getDispatchRoutesByVehicleId($accessToken, $vehicleId, $endTime, $duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDispatchRoutesByVehicleId
     */
    public function getDispatchRoutesByVehicleId($accessToken, $vehicleId, $endTime = null, $duration = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleId** | **int**| ID of the vehicle with the associated routes. |
 **endTime** | **int**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional]
 **duration** | **int**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional]

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDriverById**
> OpenAPI\Server\Model\Driver getDriverById($accessToken, $driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDriverById
     */
    public function getDriverById($accessToken, $driverIdOrExternalId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverIdOrExternalId** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |

### Return type

[**OpenAPI\Server\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDriverDocumentTypesByOrgId**
> OpenAPI\Server\Model\DocumentType getDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDriverDocumentTypesByOrgId
     */
    public function getDriverDocumentTypesByOrgId()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\DocumentType**](../Model/DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDriverDocumentsByOrgId**
> OpenAPI\Server\Model\Document getDriverDocumentsByOrgId($accessToken, $endMs, $durationMs)

/fleet/drivers/documents

Fetch all of the documents.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDriverDocumentsByOrgId
     */
    public function getDriverDocumentsByOrgId($accessToken, $endMs = null, $durationMs = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **endMs** | **int**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional]
 **durationMs** | **int**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional]

### Return type

[**OpenAPI\Server\Model\Document**](../Model/Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDriverSafetyScore**
> OpenAPI\Server\Model\DriverSafetyScoreResponse getDriverSafetyScore($driverId, $accessToken, $startMs, $endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDriverSafetyScore
     */
    public function getDriverSafetyScore($driverId, $accessToken, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **int**| ID of the driver |
 **accessToken** | **string**| Samsara API access token. |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**OpenAPI\Server\Model\DriverSafetyScoreResponse**](../Model/DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDvirs**
> OpenAPI\Server\Model\DvirListResponse getDvirs($accessToken, $endMs, $durationMs, $groupId)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getDvirs
     */
    public function getDvirs($accessToken, $endMs, $durationMs, $groupId = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **endMs** | **int**| time in millis until the last dvir log. |
 **durationMs** | **int**| time in millis which corresponds to the duration before the end_ms. |
 **groupId** | **int**| Group ID to query. | [optional]

### Return type

[**OpenAPI\Server\Model\DvirListResponse**](../Model/DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetDrivers**
> OpenAPI\Server\Model\DriversResponse getFleetDrivers($accessToken, $groupDriversParam)

/fleet/drivers

Get all the drivers for the specified group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetDrivers
     */
    public function getFleetDrivers($accessToken, InlineObject3 $groupDriversParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupDriversParam** | [**OpenAPI\Server\Model\InlineObject3**](../Model/InlineObject3.md)|  |

### Return type

[**OpenAPI\Server\Model\DriversResponse**](../Model/DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetDriversHosDailyLogs**
> OpenAPI\Server\Model\DriverDailyLogResponse getFleetDriversHosDailyLogs($accessToken, $driverId, $hosLogsParam)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetDriversHosDailyLogs
     */
    public function getFleetDriversHosDailyLogs($accessToken, $driverId, InlineObject6 $hosLogsParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverId** | **int**| ID of the driver with HOS logs. |
 **hosLogsParam** | [**OpenAPI\Server\Model\InlineObject6**](../Model/InlineObject6.md)|  |

### Return type

[**OpenAPI\Server\Model\DriverDailyLogResponse**](../Model/DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetDriversSummary**
> OpenAPI\Server\Model\DriversSummaryResponse getFleetDriversSummary($accessToken, $driversSummaryParam, $snapToDayBounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetDriversSummary
     */
    public function getFleetDriversSummary($accessToken, InlineObject5 $driversSummaryParam, $snapToDayBounds = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driversSummaryParam** | [**OpenAPI\Server\Model\InlineObject5**](../Model/InlineObject5.md)|  |
 **snapToDayBounds** | **bool**| Snap query result to HOS day boundaries. | [optional]

### Return type

[**OpenAPI\Server\Model\DriversSummaryResponse**](../Model/DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetHosAuthenticationLogs**
> OpenAPI\Server\Model\HosAuthenticationLogsResponse getFleetHosAuthenticationLogs($accessToken, $hosAuthenticationLogsParam)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetHosAuthenticationLogs
     */
    public function getFleetHosAuthenticationLogs($accessToken, InlineObject7 $hosAuthenticationLogsParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **hosAuthenticationLogsParam** | [**OpenAPI\Server\Model\InlineObject7**](../Model/InlineObject7.md)|  |

### Return type

[**OpenAPI\Server\Model\HosAuthenticationLogsResponse**](../Model/HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetHosLogs**
> OpenAPI\Server\Model\HosLogsResponse getFleetHosLogs($accessToken, $hosLogsParam)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetHosLogs
     */
    public function getFleetHosLogs($accessToken, InlineObject8 $hosLogsParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **hosLogsParam** | [**OpenAPI\Server\Model\InlineObject8**](../Model/InlineObject8.md)|  |

### Return type

[**OpenAPI\Server\Model\HosLogsResponse**](../Model/HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetHosLogsSummary**
> OpenAPI\Server\Model\HosLogsSummaryResponse getFleetHosLogsSummary($accessToken, $hosLogsParam)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetHosLogsSummary
     */
    public function getFleetHosLogsSummary($accessToken, InlineObject9 $hosLogsParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **hosLogsParam** | [**OpenAPI\Server\Model\InlineObject9**](../Model/InlineObject9.md)|  |

### Return type

[**OpenAPI\Server\Model\HosLogsSummaryResponse**](../Model/HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetLocations**
> OpenAPI\Server\Model\InlineResponse2003 getFleetLocations($accessToken, $groupParam)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetLocations
     */
    public function getFleetLocations($accessToken, InlineObject11 $groupParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupParam** | [**OpenAPI\Server\Model\InlineObject11**](../Model/InlineObject11.md)|  |

### Return type

[**OpenAPI\Server\Model\InlineResponse2003**](../Model/InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetMaintenanceList**
> OpenAPI\Server\Model\InlineResponse2004 getFleetMaintenanceList($accessToken, $groupParam)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetMaintenanceList
     */
    public function getFleetMaintenanceList($accessToken, InlineObject13 $groupParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupParam** | [**OpenAPI\Server\Model\InlineObject13**](../Model/InlineObject13.md)|  |

### Return type

[**OpenAPI\Server\Model\InlineResponse2004**](../Model/InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetTrips**
> OpenAPI\Server\Model\TripResponse getFleetTrips($accessToken, $tripsParam)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetTrips
     */
    public function getFleetTrips($accessToken, InlineObject15 $tripsParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **tripsParam** | [**OpenAPI\Server\Model\InlineObject15**](../Model/InlineObject15.md)|  |

### Return type

[**OpenAPI\Server\Model\TripResponse**](../Model/TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getFleetVehicle**
> OpenAPI\Server\Model\FleetVehicleResponse getFleetVehicle($accessToken, $vehicleIdOrExternalId)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getFleetVehicle
     */
    public function getFleetVehicle($accessToken, $vehicleIdOrExternalId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleIdOrExternalId** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |

### Return type

[**OpenAPI\Server\Model\FleetVehicleResponse**](../Model/FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getOrganizationAddress**
> OpenAPI\Server\Model\Address getOrganizationAddress($accessToken, $addressId)

/addresses/{addressId}

Fetch an address by its id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getOrganizationAddress
     */
    public function getOrganizationAddress($accessToken, $addressId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **addressId** | **int**| ID of the address/geofence |

### Return type

[**OpenAPI\Server\Model\Address**](../Model/Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getOrganizationAddresses**
> OpenAPI\Server\Model\Address getOrganizationAddresses($accessToken)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getOrganizationAddresses
     */
    public function getOrganizationAddresses($accessToken)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |

### Return type

[**OpenAPI\Server\Model\Address**](../Model/Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getOrganizationContact**
> OpenAPI\Server\Model\Contact getOrganizationContact($accessToken, $contactId)

/contacts/{contact_id}

Fetch a contact by its id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getOrganizationContact
     */
    public function getOrganizationContact($accessToken, $contactId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **contactId** | **int**| ID of the contact |

### Return type

[**OpenAPI\Server\Model\Contact**](../Model/Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVehicleHarshEvent**
> OpenAPI\Server\Model\VehicleHarshEventResponse getVehicleHarshEvent($vehicleId, $accessToken, $timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getVehicleHarshEvent
     */
    public function getVehicleHarshEvent($vehicleId, $accessToken, $timestamp)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle |
 **accessToken** | **string**| Samsara API access token. |
 **timestamp** | **int**| Timestamp in milliseconds representing the timestamp of a harsh event. |

### Return type

[**OpenAPI\Server\Model\VehicleHarshEventResponse**](../Model/VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVehicleLocations**
> OpenAPI\Server\Model\FleetVehicleLocation getVehicleLocations($accessToken, $vehicleId, $startMs, $endMs)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getVehicleLocations
     */
    public function getVehicleLocations($accessToken, $vehicleId, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleId** | **int**| ID of the vehicle with the associated routes. |
 **startMs** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
 **endMs** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |

### Return type

[**OpenAPI\Server\Model\FleetVehicleLocation**](../Model/FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVehicleSafetyScore**
> OpenAPI\Server\Model\VehicleSafetyScoreResponse getVehicleSafetyScore($vehicleId, $accessToken, $startMs, $endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getVehicleSafetyScore
     */
    public function getVehicleSafetyScore($vehicleId, $accessToken, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **int**| ID of the vehicle |
 **accessToken** | **string**| Samsara API access token. |
 **startMs** | **int**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
 **endMs** | **int**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |

### Return type

[**OpenAPI\Server\Model\VehicleSafetyScoreResponse**](../Model/VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVehicleStats**
> OpenAPI\Server\Model\InlineResponse2005 getVehicleStats($accessToken, $startMs, $endMs, $series, $tagIds, $startingAfter, $endingBefore, $limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getVehicleStats
     */
    public function getVehicleStats($accessToken, $startMs, $endMs, $series = null, $tagIds = null, $startingAfter = null, $endingBefore = null, $limit = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **startMs** | **int**| Time in Unix epoch milliseconds for the start of the query. |
 **endMs** | **int**| Time in Unix epoch milliseconds for the end of the query. |
 **series** | **string**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional]
 **tagIds** | **string**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional]
 **startingAfter** | **string**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional]
 **endingBefore** | **string**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional]
 **limit** | **int**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse2005**](../Model/InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVehiclesLocations**
> array getVehiclesLocations($accessToken, $startMs, $endMs)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#getVehiclesLocations
     */
    public function getVehiclesLocations($accessToken, $startMs, $endMs)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **startMs** | **int**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
 **endMs** | **int**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |

### Return type

**array**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listContacts**
> OpenAPI\Server\Model\Contact listContacts($accessToken)

/contacts

Fetch all contacts for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#listContacts
     */
    public function listContacts($accessToken)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |

### Return type

[**OpenAPI\Server\Model\Contact**](../Model/Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFleet**
> OpenAPI\Server\Model\InlineResponse2002 listFleet($accessToken, $groupParam, $startingAfter, $endingBefore, $limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#listFleet
     */
    public function listFleet($accessToken, InlineObject10 $groupParam, $startingAfter = null, $endingBefore = null, $limit = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **groupParam** | [**OpenAPI\Server\Model\InlineObject10**](../Model/InlineObject10.md)|  |
 **startingAfter** | **string**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional]
 **endingBefore** | **string**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional]
 **limit** | **int**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional]

### Return type

[**OpenAPI\Server\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **patchFleetVehicle**
> OpenAPI\Server\Model\FleetVehicleResponse patchFleetVehicle($accessToken, $vehicleIdOrExternalId, $data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#patchFleetVehicle
     */
    public function patchFleetVehicle($accessToken, $vehicleIdOrExternalId, InlineObject16 $data)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleIdOrExternalId** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
 **data** | [**OpenAPI\Server\Model\InlineObject16**](../Model/InlineObject16.md)|  |

### Return type

[**OpenAPI\Server\Model\FleetVehicleResponse**](../Model/FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reactivateDriverById**
> OpenAPI\Server\Model\Driver reactivateDriverById($accessToken, $driverIdOrExternalId, $reactivateDriverParam)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#reactivateDriverById
     */
    public function reactivateDriverById($accessToken, $driverIdOrExternalId, InlineObject4 $reactivateDriverParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **driverIdOrExternalId** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |
 **reactivateDriverParam** | [**OpenAPI\Server\Model\InlineObject4**](../Model/InlineObject4.md)|  |

### Return type

[**OpenAPI\Server\Model\Driver**](../Model/Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateDispatchRouteById**
> OpenAPI\Server\Model\DispatchRoute updateDispatchRouteById($accessToken, $routeId, $updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#updateDispatchRouteById
     */
    public function updateDispatchRouteById($accessToken, $routeId, DispatchRoute $updateDispatchRouteParams)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **routeId** | **int**| ID of the dispatch route. |
 **updateDispatchRouteParams** | [**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)|  |

### Return type

[**OpenAPI\Server\Model\DispatchRoute**](../Model/DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateOrganizationAddress**
> updateOrganizationAddress($accessToken, $addressId, $address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#updateOrganizationAddress
     */
    public function updateOrganizationAddress($accessToken, $addressId, InlineObject1 $address)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **addressId** | **int**| ID of the address/geofence |
 **address** | [**OpenAPI\Server\Model\InlineObject1**](../Model/InlineObject1.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateVehicles**
> updateVehicles($accessToken, $vehicleUpdateParam)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FleetApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FleetApiInterface;

class FleetApi implements FleetApiInterface
{

    // ...

    /**
     * Implementation of FleetApiInterface#updateVehicles
     */
    public function updateVehicles($accessToken, InlineObject14 $vehicleUpdateParam)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. |
 **vehicleUpdateParam** | [**OpenAPI\Server\Model\InlineObject14**](../Model/InlineObject14.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

