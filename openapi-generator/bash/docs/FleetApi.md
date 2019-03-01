# FleetApi

All URIs are relative to */v1*

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


## **addFleetAddress**

/fleet/add_address

This method adds an address book entry to the specified group.

### Example
```bash
 addFleetAddress  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **addressParam** | [**InlineObject2**](InlineObject2.md) |  |

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **addOrganizationAddresses**

/addresses

Add one or more addresses to the organization

### Example
```bash
 addOrganizationAddresses  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **addresses** | [**InlineObject**](InlineObject.md) |  |

### Return type

[**array[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **createDispatchRoute**

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```bash
 createDispatchRoute  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md) |  |

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **createDriver**

/fleet/drivers/create

Create a new driver.

### Example
```bash
 createDriver  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **createDriverParam** | [**DriverForCreate**](DriverForCreate.md) | Driver creation body |

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **createDriverDispatchRoute**

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```bash
 createDriverDispatchRoute  access_token=value driver_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverId** | **integer** | ID of the driver with the associated routes. | [default to null]
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md) |  |

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **createDriverDocument**

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example
```bash
 createDriverDocument  access_token=value driver_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverId** | **integer** | ID of the driver for whom the document is created. | [default to null]
 **createDocumentParams** | [**DocumentCreate**](DocumentCreate.md) | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **createDvir**

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example
```bash
 createDvir  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **createDvirParam** | [**InlineObject12**](InlineObject12.md) |  |

### Return type

[**DvirBase**](DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **createVehicleDispatchRoute**

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```bash
 createVehicleDispatchRoute  access_token=value vehicle_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **vehicleId** | **integer** | ID of the vehicle with the associated routes. | [default to null]
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md) |  |

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deactivateDriver**

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example
```bash
 deactivateDriver  access_token=value driver_id_or_external_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **string** | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteDispatchRouteById**

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```bash
 deleteDispatchRouteById  access_token=value route_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **routeId** | **integer** | ID of the dispatch route. | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **deleteOrganizationAddress**

/addresses/{addressId}

Delete an address.

### Example
```bash
 deleteOrganizationAddress  access_token=value addressId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **addressId** | **integer** | ID of the address/geofence | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **fetchAllDispatchRoutes**

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```bash
 fetchAllDispatchRoutes  access_token=value  group_id=value  end_time=value  duration=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupId** | **integer** | Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **endTime** | **integer** | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **integer** | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**array[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **fetchAllRouteJobUpdates**

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```bash
 fetchAllRouteJobUpdates  access_token=value  group_id=value  sequence_id=value  include=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupId** | **integer** | Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]
 **sequenceId** | **string** | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] [default to null]
 **include** | **string** | Optionally set include=route to include route object in response payload. | [optional] [default to null]

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAllAssetCurrentLocations**

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```bash
 getAllAssetCurrentLocations  access_token=value  group_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupId** | **integer** | Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAllAssets**

/fleet/assets

Fetch all of the assets for the group.

### Example
```bash
 getAllAssets  access_token=value  group_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupId** | **integer** | Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAllDeactivatedDrivers**

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example
```bash
 getAllDeactivatedDrivers  access_token=value  group_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupId** | **integer** | Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**array[Driver]**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAssetLocation**

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```bash
 getAssetLocation  access_token=value asset_id=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **assetId** | **integer** | ID of the asset | [default to null]
 **startMs** | **integer** | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **integer** | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

**array[map]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getAssetReefer**

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```bash
 getAssetReefer  access_token=value asset_id=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **assetId** | **integer** | ID of the asset | [default to null]
 **startMs** | **integer** | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **integer** | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDeactivatedDriverById**

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example
```bash
 getDeactivatedDriverById  access_token=value driver_id_or_external_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **string** | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDispatchRouteById**

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```bash
 getDispatchRouteById  access_token=value route_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **routeId** | **integer** | ID of the dispatch route. | [default to null]

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDispatchRouteHistory**

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```bash
 getDispatchRouteHistory  access_token=value route_id=value  start_time=value  end_time=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **routeId** | **integer** | ID of the route with history. | [default to null]
 **startTime** | **integer** | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] [default to null]
 **endTime** | **integer** | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] [default to null]

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDispatchRoutesByDriverId**

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```bash
 getDispatchRoutesByDriverId  access_token=value driver_id=value  end_time=value  duration=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverId** | **integer** | ID of the driver with the associated routes. | [default to null]
 **endTime** | **integer** | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **integer** | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**array[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDispatchRoutesByVehicleId**

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```bash
 getDispatchRoutesByVehicleId  access_token=value vehicle_id=value  end_time=value  duration=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **vehicleId** | **integer** | ID of the vehicle with the associated routes. | [default to null]
 **endTime** | **integer** | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] [default to null]
 **duration** | **integer** | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**array[DispatchRoute]**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDriverById**

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example
```bash
 getDriverById  access_token=value driver_id_or_external_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **string** | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDriverDocumentTypesByOrgId**

/fleet/drivers/document_types

Fetch all of the document types.

### Example
```bash
 getDriverDocumentTypesByOrgId
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**array[DocumentType]**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDriverDocumentsByOrgId**

/fleet/drivers/documents

Fetch all of the documents.

### Example
```bash
 getDriverDocumentsByOrgId  access_token=value  endMs=value  durationMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **endMs** | **integer** | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] [default to null]
 **durationMs** | **integer** | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] [default to null]

### Return type

[**array[Document]**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDriverSafetyScore**

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```bash
 getDriverSafetyScore driverId=value  access_token=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **integer** | ID of the driver | [default to null]
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **startMs** | **integer** | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **integer** | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getDvirs**

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example
```bash
 getDvirs  access_token=value  end_ms=value  duration_ms=value  group_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **endMs** | **integer** | time in millis until the last dvir log. | [default to null]
 **durationMs** | **integer** | time in millis which corresponds to the duration before the end_ms. | [default to null]
 **groupId** | **integer** | Group ID to query. | [optional] [default to null]

### Return type

[**DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetDrivers**

/fleet/drivers

Get all the drivers for the specified group.

### Example
```bash
 getFleetDrivers  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupDriversParam** | [**InlineObject3**](InlineObject3.md) |  |

### Return type

[**DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetDriversHosDailyLogs**

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example
```bash
 getFleetDriversHosDailyLogs  access_token=value driver_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverId** | **integer** | ID of the driver with HOS logs. | [default to null]
 **hosLogsParam** | [**InlineObject6**](InlineObject6.md) |  |

### Return type

[**DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetDriversSummary**

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example
```bash
 getFleetDriversSummary  access_token=value  snap_to_day_bounds=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driversSummaryParam** | [**InlineObject5**](InlineObject5.md) |  |
 **snapToDayBounds** | **boolean** | Snap query result to HOS day boundaries. | [optional] [default to null]

### Return type

[**DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetHosAuthenticationLogs**

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example
```bash
 getFleetHosAuthenticationLogs  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **hosAuthenticationLogsParam** | [**InlineObject7**](InlineObject7.md) |  |

### Return type

[**HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetHosLogs**

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example
```bash
 getFleetHosLogs  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **hosLogsParam** | [**InlineObject8**](InlineObject8.md) |  |

### Return type

[**HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetHosLogsSummary**

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example
```bash
 getFleetHosLogsSummary  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **hosLogsParam** | [**InlineObject9**](InlineObject9.md) |  |

### Return type

[**HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetLocations**

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example
```bash
 getFleetLocations  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject11**](InlineObject11.md) |  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetMaintenanceList**

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example
```bash
 getFleetMaintenanceList  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject13**](InlineObject13.md) |  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetTrips**

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example
```bash
 getFleetTrips  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **tripsParam** | [**InlineObject15**](InlineObject15.md) |  |

### Return type

[**TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getFleetVehicle**

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example
```bash
 getFleetVehicle  access_token=value vehicle_id_or_external_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **vehicleIdOrExternalId** | **string** | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getOrganizationAddress**

/addresses/{addressId}

Fetch an address by its id.

### Example
```bash
 getOrganizationAddress  access_token=value addressId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **addressId** | **integer** | ID of the address/geofence | [default to null]

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getOrganizationAddresses**

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example
```bash
 getOrganizationAddresses  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]

### Return type

[**array[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getOrganizationContact**

/contacts/{contact_id}

Fetch a contact by its id.

### Example
```bash
 getOrganizationContact  access_token=value contact_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **contactId** | **integer** | ID of the contact | [default to null]

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getVehicleHarshEvent**

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```bash
 getVehicleHarshEvent vehicleId=value  access_token=value  timestamp=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **integer** | ID of the vehicle | [default to null]
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **timestamp** | **integer** | Timestamp in milliseconds representing the timestamp of a harsh event. | [default to null]

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getVehicleLocations**

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example
```bash
 getVehicleLocations  access_token=value vehicle_id=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **vehicleId** | **integer** | ID of the vehicle with the associated routes. | [default to null]
 **startMs** | **integer** | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | [default to null]
 **endMs** | **integer** | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | [default to null]

### Return type

[**array[FleetVehicleLocation]**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getVehicleSafetyScore**

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```bash
 getVehicleSafetyScore vehicleId=value  access_token=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **integer** | ID of the vehicle | [default to null]
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **startMs** | **integer** | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **integer** | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getVehicleStats**

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example
```bash
 getVehicleStats  access_token=value  startMs=value  endMs=value  series=value  tagIds=value  startingAfter=value  endingBefore=value  limit=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **startMs** | **integer** | Time in Unix epoch milliseconds for the start of the query. | [default to null]
 **endMs** | **integer** | Time in Unix epoch milliseconds for the end of the query. | [default to null]
 **series** | **string** | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 | [optional] [default to null]
 **tagIds** | **string** | Comma-separated list of tag ids. Example: tagIds=1,2,3 | [optional] [default to null]
 **startingAfter** | **string** | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. | [optional] [default to null]
 **endingBefore** | **string** | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. | [optional] [default to null]
 **limit** | **integer** | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. | [optional] [default to null]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getVehiclesLocations**

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example
```bash
 getVehiclesLocations  access_token=value  startMs=value  endMs=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **startMs** | **integer** | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | [default to null]
 **endMs** | **integer** | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | [default to null]

### Return type

**array[map]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listContacts**

/contacts

Fetch all contacts for the organization.

### Example
```bash
 listContacts  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]

### Return type

[**array[Contact]**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **listFleet**

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example
```bash
 listFleet  access_token=value  startingAfter=value  endingBefore=value  limit=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **groupParam** | [**InlineObject10**](InlineObject10.md) |  |
 **startingAfter** | **string** | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. | [optional] [default to null]
 **endingBefore** | **string** | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. | [optional] [default to null]
 **limit** | **integer** | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. | [optional] [default to null]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **patchFleetVehicle**

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example
```bash
 patchFleetVehicle  access_token=value vehicle_id_or_external_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **vehicleIdOrExternalId** | **string** | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | [default to null]
 **data** | [**InlineObject16**](InlineObject16.md) |  |

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **reactivateDriverById**

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example
```bash
 reactivateDriverById  access_token=value driver_id_or_external_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **driverIdOrExternalId** | **string** | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | [default to null]
 **reactivateDriverParam** | [**InlineObject4**](InlineObject4.md) |  |

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateDispatchRouteById**

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```bash
 updateDispatchRouteById  access_token=value route_id=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **routeId** | **integer** | ID of the dispatch route. | [default to null]
 **updateDispatchRouteParams** | [**DispatchRoute**](DispatchRoute.md) |  |

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateOrganizationAddress**

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example
```bash
 updateOrganizationAddress  access_token=value addressId=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **addressId** | **integer** | ID of the address/geofence | [default to null]
 **address** | [**InlineObject1**](InlineObject1.md) |  |

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **updateVehicles**

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example
```bash
 updateVehicles  access_token=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string** | Samsara API access token. | [default to null]
 **vehicleUpdateParam** | [**InlineObject14**](InlineObject14.md) |  |

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

