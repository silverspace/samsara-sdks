# Org.OpenAPITools.Api.FleetApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddFleetAddress**](FleetApi.md#addfleetaddress) | **POST** /fleet/add_address | /fleet/add_address
[**AddOrganizationAddresses**](FleetApi.md#addorganizationaddresses) | **POST** /addresses | /addresses
[**CreateDispatchRoute**](FleetApi.md#createdispatchroute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**CreateDriver**](FleetApi.md#createdriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**CreateDriverDispatchRoute**](FleetApi.md#createdriverdispatchroute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**CreateDriverDocument**](FleetApi.md#createdriverdocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**CreateDvir**](FleetApi.md#createdvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**CreateVehicleDispatchRoute**](FleetApi.md#createvehicledispatchroute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**DeactivateDriver**](FleetApi.md#deactivatedriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**DeleteDispatchRouteById**](FleetApi.md#deletedispatchroutebyid) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**DeleteOrganizationAddress**](FleetApi.md#deleteorganizationaddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**FetchAllDispatchRoutes**](FleetApi.md#fetchalldispatchroutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**FetchAllRouteJobUpdates**](FleetApi.md#fetchallroutejobupdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetAllAssetCurrentLocations**](FleetApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](FleetApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
[**GetAllDeactivatedDrivers**](FleetApi.md#getalldeactivateddrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**GetAssetLocation**](FleetApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](FleetApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**GetDeactivatedDriverById**](FleetApi.md#getdeactivateddriverbyid) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetDispatchRouteById**](FleetApi.md#getdispatchroutebyid) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**GetDispatchRouteHistory**](FleetApi.md#getdispatchroutehistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**GetDispatchRoutesByDriverId**](FleetApi.md#getdispatchroutesbydriverid) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**GetDispatchRoutesByVehicleId**](FleetApi.md#getdispatchroutesbyvehicleid) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**GetDriverById**](FleetApi.md#getdriverbyid) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetDriverDocumentTypesByOrgId**](FleetApi.md#getdriverdocumenttypesbyorgid) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**GetDriverDocumentsByOrgId**](FleetApi.md#getdriverdocumentsbyorgid) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**GetDriverSafetyScore**](FleetApi.md#getdriversafetyscore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**GetDvirs**](FleetApi.md#getdvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**GetFleetDrivers**](FleetApi.md#getfleetdrivers) | **POST** /fleet/drivers | /fleet/drivers
[**GetFleetDriversHosDailyLogs**](FleetApi.md#getfleetdrivershosdailylogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**GetFleetDriversSummary**](FleetApi.md#getfleetdriverssummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**GetFleetHosAuthenticationLogs**](FleetApi.md#getfleethosauthenticationlogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**GetFleetHosLogs**](FleetApi.md#getfleethoslogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**GetFleetHosLogsSummary**](FleetApi.md#getfleethoslogssummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**GetFleetLocations**](FleetApi.md#getfleetlocations) | **POST** /fleet/locations | /fleet/locations
[**GetFleetMaintenanceList**](FleetApi.md#getfleetmaintenancelist) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**GetFleetTrips**](FleetApi.md#getfleettrips) | **POST** /fleet/trips | /fleet/trips
[**GetFleetVehicle**](FleetApi.md#getfleetvehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetOrganizationAddress**](FleetApi.md#getorganizationaddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**GetOrganizationAddresses**](FleetApi.md#getorganizationaddresses) | **GET** /addresses | /addresses
[**GetOrganizationContact**](FleetApi.md#getorganizationcontact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**GetVehicleHarshEvent**](FleetApi.md#getvehicleharshevent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**GetVehicleLocations**](FleetApi.md#getvehiclelocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**GetVehicleSafetyScore**](FleetApi.md#getvehiclesafetyscore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**GetVehicleStats**](FleetApi.md#getvehiclestats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**GetVehiclesLocations**](FleetApi.md#getvehicleslocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**ListContacts**](FleetApi.md#listcontacts) | **GET** /contacts | /contacts
[**ListFleet**](FleetApi.md#listfleet) | **POST** /fleet/list | /fleet/list
[**PatchFleetVehicle**](FleetApi.md#patchfleetvehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**ReactivateDriverById**](FleetApi.md#reactivatedriverbyid) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**UpdateDispatchRouteById**](FleetApi.md#updatedispatchroutebyid) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**UpdateOrganizationAddress**](FleetApi.md#updateorganizationaddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**UpdateVehicles**](FleetApi.md#updatevehicles) | **POST** /fleet/set_data | /fleet/set_data


<a name="addfleetaddress"></a>
# **AddFleetAddress**
> void AddFleetAddress (string accessToken, InlineObject2 addressParam)

/fleet/add_address

This method adds an address book entry to the specified group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AddFleetAddressExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var addressParam = new InlineObject2(); // InlineObject2 | 

            try
            {
                // /fleet/add_address
                apiInstance.AddFleetAddress(accessToken, addressParam);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.AddFleetAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **addressParam** | [**InlineObject2**](InlineObject2.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addorganizationaddresses"></a>
# **AddOrganizationAddresses**
> List<Address> AddOrganizationAddresses (string accessToken, InlineObject addresses)

/addresses

Add one or more addresses to the organization

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AddOrganizationAddressesExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var addresses = new InlineObject(); // InlineObject | 

            try
            {
                // /addresses
                List&lt;Address&gt; result = apiInstance.AddOrganizationAddresses(accessToken, addresses);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.AddOrganizationAddresses: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **addresses** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**List<Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdispatchroute"></a>
# **CreateDispatchRoute**
> DispatchRoute CreateDispatchRoute (string accessToken, DispatchRouteCreate createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDispatchRouteExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

            try
            {
                // /fleet/dispatch/routes
                DispatchRoute result = apiInstance.CreateDispatchRoute(accessToken, createDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.CreateDispatchRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdriver"></a>
# **CreateDriver**
> Driver CreateDriver (string accessToken, DriverForCreate createDriverParam)

/fleet/drivers/create

Create a new driver.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDriverExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var createDriverParam = new DriverForCreate(); // DriverForCreate | Driver creation body

            try
            {
                // /fleet/drivers/create
                Driver result = apiInstance.CreateDriver(accessToken, createDriverParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.CreateDriver: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **createDriverParam** | [**DriverForCreate**](DriverForCreate.md)| Driver creation body | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdriverdispatchroute"></a>
# **CreateDriverDispatchRoute**
> DispatchRoute CreateDriverDispatchRoute (string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDriverDispatchRouteExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverId = 789;  // long? | ID of the driver with the associated routes.
            var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
                DispatchRoute result = apiInstance.CreateDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.CreateDriverDispatchRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverId** | **long?**| ID of the driver with the associated routes. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdriverdocument"></a>
# **CreateDriverDocument**
> Document CreateDriverDocument (string accessToken, long? driverId, DocumentCreate createDocumentParams)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDriverDocumentExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverId = 789;  // long? | ID of the driver for whom the document is created.
            var createDocumentParams = new DocumentCreate(); // DocumentCreate | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+}/documents
                Document result = apiInstance.CreateDriverDocument(accessToken, driverId, createDocumentParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.CreateDriverDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverId** | **long?**| ID of the driver for whom the document is created. | 
 **createDocumentParams** | [**DocumentCreate**](DocumentCreate.md)| To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. | 

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdvir"></a>
# **CreateDvir**
> DvirBase CreateDvir (string accessToken, InlineObject12 createDvirParam)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDvirExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var createDvirParam = new InlineObject12(); // InlineObject12 | 

            try
            {
                // /fleet/maintenance/dvirs
                DvirBase result = apiInstance.CreateDvir(accessToken, createDvirParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.CreateDvir: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **createDvirParam** | [**InlineObject12**](InlineObject12.md)|  | 

### Return type

[**DvirBase**](DvirBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createvehicledispatchroute"></a>
# **CreateVehicleDispatchRoute**
> DispatchRoute CreateVehicleDispatchRoute (string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateVehicleDispatchRouteExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleId = 789;  // long? | ID of the vehicle with the associated routes.
            var createDispatchRouteParams = new DispatchRouteCreate(); // DispatchRouteCreate | 

            try
            {
                // /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
                DispatchRoute result = apiInstance.CreateVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.CreateVehicleDispatchRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleId** | **long?**| ID of the vehicle with the associated routes. | 
 **createDispatchRouteParams** | [**DispatchRouteCreate**](DispatchRouteCreate.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deactivatedriver"></a>
# **DeactivateDriver**
> void DeactivateDriver (string accessToken, string driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeactivateDriverExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverIdOrExternalId = driverIdOrExternalId_example;  // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
                apiInstance.DeactivateDriver(accessToken, driverIdOrExternalId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.DeactivateDriver: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletedispatchroutebyid"></a>
# **DeleteDispatchRouteById**
> void DeleteDispatchRouteById (string accessToken, long? routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteDispatchRouteByIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the dispatch route.

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}/
                apiInstance.DeleteDispatchRouteById(accessToken, routeId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.DeleteDispatchRouteById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the dispatch route. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteorganizationaddress"></a>
# **DeleteOrganizationAddress**
> void DeleteOrganizationAddress (string accessToken, long? addressId)

/addresses/{addressId}

Delete an address.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteOrganizationAddressExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var addressId = 789;  // long? | ID of the address/geofence

            try
            {
                // /addresses/{addressId}
                apiInstance.DeleteOrganizationAddress(accessToken, addressId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.DeleteOrganizationAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **addressId** | **long?**| ID of the address/geofence | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="fetchalldispatchroutes"></a>
# **FetchAllDispatchRoutes**
> List<DispatchRoute> FetchAllDispatchRoutes (string accessToken, long? groupId, long? endTime, long? duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FetchAllDispatchRoutesExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 
            var endTime = 789;  // long? | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
            var duration = 789;  // long? | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional) 

            try
            {
                // /fleet/dispatch/routes
                List&lt;DispatchRoute&gt; result = apiInstance.FetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.FetchAllDispatchRoutes: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **endTime** | **long?**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **long?**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="fetchallroutejobupdates"></a>
# **FetchAllRouteJobUpdates**
> AllRouteJobUpdates FetchAllRouteJobUpdates (string accessToken, long? groupId, string sequenceId, string include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FetchAllRouteJobUpdatesExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 
            var sequenceId = sequenceId_example;  // string | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional) 
            var include = include_example;  // string | Optionally set include=route to include route object in response payload. (optional) 

            try
            {
                // /fleet/dispatch/routes/job_updates
                AllRouteJobUpdates result = apiInstance.FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.FetchAllRouteJobUpdates: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 
 **sequenceId** | **string**| Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. | [optional] 
 **include** | **string**| Optionally set include&#x3D;route to include route object in response payload. | [optional] 

### Return type

[**AllRouteJobUpdates**](AllRouteJobUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallassetcurrentlocations"></a>
# **GetAllAssetCurrentLocations**
> InlineResponse2001 GetAllAssetCurrentLocations (string accessToken, long? groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAllAssetCurrentLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 

            try
            {
                // /fleet/assets/locations
                InlineResponse2001 result = apiInstance.GetAllAssetCurrentLocations(accessToken, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetAllAssetCurrentLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallassets"></a>
# **GetAllAssets**
> InlineResponse200 GetAllAssets (string accessToken, long? groupId)

/fleet/assets

Fetch all of the assets for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAllAssetsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 

            try
            {
                // /fleet/assets
                InlineResponse200 result = apiInstance.GetAllAssets(accessToken, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetAllAssets: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getalldeactivateddrivers"></a>
# **GetAllDeactivatedDrivers**
> List<Driver> GetAllDeactivatedDrivers (string accessToken, long? groupId)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAllDeactivatedDriversExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 

            try
            {
                // /fleet/drivers/inactive
                List&lt;Driver&gt; result = apiInstance.GetAllDeactivatedDrivers(accessToken, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetAllDeactivatedDrivers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**List<Driver>**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getassetlocation"></a>
# **GetAssetLocation**
> List<Object> GetAssetLocation (string accessToken, long? assetId, long? startMs, long? endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAssetLocationExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var assetId = 789;  // long? | ID of the asset
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/assets/{assetId:[0-9]+}/locations
                List&lt;Object&gt; result = apiInstance.GetAssetLocation(accessToken, assetId, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetAssetLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **assetId** | **long?**| ID of the asset | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**List<Object>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getassetreefer"></a>
# **GetAssetReefer**
> AssetReeferResponse GetAssetReefer (string accessToken, long? assetId, long? startMs, long? endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetAssetReeferExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var assetId = 789;  // long? | ID of the asset
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/assets/{assetId:[0-9]+}/reefer
                AssetReeferResponse result = apiInstance.GetAssetReefer(accessToken, assetId, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetAssetReefer: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **assetId** | **long?**| ID of the asset | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdeactivateddriverbyid"></a>
# **GetDeactivatedDriverById**
> Driver GetDeactivatedDriverById (string accessToken, string driverIdOrExternalId)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDeactivatedDriverByIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverIdOrExternalId = driverIdOrExternalId_example;  // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

            try
            {
                // /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
                Driver result = apiInstance.GetDeactivatedDriverById(accessToken, driverIdOrExternalId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDeactivatedDriverById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverIdOrExternalId** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutebyid"></a>
# **GetDispatchRouteById**
> DispatchRoute GetDispatchRouteById (string accessToken, long? routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRouteByIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the dispatch route.

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}
                DispatchRoute result = apiInstance.GetDispatchRouteById(accessToken, routeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDispatchRouteById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the dispatch route. | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutehistory"></a>
# **GetDispatchRouteHistory**
> DispatchRouteHistory GetDispatchRouteHistory (string accessToken, long? routeId, long? startTime, long? endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRouteHistoryExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the route with history.
            var startTime = 789;  // long? | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional) 
            var endTime = 789;  // long? | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional) 

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}/history
                DispatchRouteHistory result = apiInstance.GetDispatchRouteHistory(accessToken, routeId, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDispatchRouteHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the route with history. | 
 **startTime** | **long?**| Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. | [optional] 
 **endTime** | **long?**| Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. | [optional] 

### Return type

[**DispatchRouteHistory**](DispatchRouteHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutesbydriverid"></a>
# **GetDispatchRoutesByDriverId**
> List<DispatchRoute> GetDispatchRoutesByDriverId (string accessToken, long? driverId, long? endTime, long? duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRoutesByDriverIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverId = 789;  // long? | ID of the driver with the associated routes.
            var endTime = 789;  // long? | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
            var duration = 789;  // long? | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional) 

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
                List&lt;DispatchRoute&gt; result = apiInstance.GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDispatchRoutesByDriverId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverId** | **long?**| ID of the driver with the associated routes. | 
 **endTime** | **long?**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **long?**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdispatchroutesbyvehicleid"></a>
# **GetDispatchRoutesByVehicleId**
> List<DispatchRoute> GetDispatchRoutesByVehicleId (string accessToken, long? vehicleId, long? endTime, long? duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDispatchRoutesByVehicleIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleId = 789;  // long? | ID of the vehicle with the associated routes.
            var endTime = 789;  // long? | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional) 
            var duration = 789;  // long? | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional) 

            try
            {
                // /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
                List&lt;DispatchRoute&gt; result = apiInstance.GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDispatchRoutesByVehicleId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleId** | **long?**| ID of the vehicle with the associated routes. | 
 **endTime** | **long?**| Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. | [optional] 
 **duration** | **long?**| Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. | [optional] 

### Return type

[**List<DispatchRoute>**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdriverbyid"></a>
# **GetDriverById**
> Driver GetDriverById (string accessToken, string driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDriverByIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverIdOrExternalId = driverIdOrExternalId_example;  // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
                Driver result = apiInstance.GetDriverById(accessToken, driverIdOrExternalId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDriverById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverIdOrExternalId** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdriverdocumenttypesbyorgid"></a>
# **GetDriverDocumentTypesByOrgId**
> List<DocumentType> GetDriverDocumentTypesByOrgId ()

/fleet/drivers/document_types

Fetch all of the document types.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDriverDocumentTypesByOrgIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();

            try
            {
                // /fleet/drivers/document_types
                List&lt;DocumentType&gt; result = apiInstance.GetDriverDocumentTypesByOrgId();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDriverDocumentTypesByOrgId: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<DocumentType>**](DocumentType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdriverdocumentsbyorgid"></a>
# **GetDriverDocumentsByOrgId**
> List<Document> GetDriverDocumentsByOrgId (string accessToken, long? endMs, long? durationMs)

/fleet/drivers/documents

Fetch all of the documents.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDriverDocumentsByOrgIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var endMs = 789;  // long? | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional) 
            var durationMs = 789;  // long? | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional) 

            try
            {
                // /fleet/drivers/documents
                List&lt;Document&gt; result = apiInstance.GetDriverDocumentsByOrgId(accessToken, endMs, durationMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDriverDocumentsByOrgId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **endMs** | **long?**| Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. | [optional] 
 **durationMs** | **long?**| Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. | [optional] 

### Return type

[**List<Document>**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdriversafetyscore"></a>
# **GetDriverSafetyScore**
> DriverSafetyScoreResponse GetDriverSafetyScore (long? driverId, string accessToken, long? startMs, long? endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDriverSafetyScoreExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var driverId = 789;  // long? | ID of the driver
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/drivers/{driverId:[0-9]+}/safety/score
                DriverSafetyScoreResponse result = apiInstance.GetDriverSafetyScore(driverId, accessToken, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDriverSafetyScore: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverId** | **long?**| ID of the driver | 
 **accessToken** | **string**| Samsara API access token. | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**DriverSafetyScoreResponse**](DriverSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdvirs"></a>
# **GetDvirs**
> DvirListResponse GetDvirs (string accessToken, int? endMs, int? durationMs, int? groupId)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDvirsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var endMs = 56;  // int? | time in millis until the last dvir log.
            var durationMs = 56;  // int? | time in millis which corresponds to the duration before the end_ms.
            var groupId = 56;  // int? | Group ID to query. (optional) 

            try
            {
                // /fleet/maintenance/dvirs
                DvirListResponse result = apiInstance.GetDvirs(accessToken, endMs, durationMs, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetDvirs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **endMs** | **int?**| time in millis until the last dvir log. | 
 **durationMs** | **int?**| time in millis which corresponds to the duration before the end_ms. | 
 **groupId** | **int?**| Group ID to query. | [optional] 

### Return type

[**DvirListResponse**](DvirListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleetdrivers"></a>
# **GetFleetDrivers**
> DriversResponse GetFleetDrivers (string accessToken, InlineObject3 groupDriversParam)

/fleet/drivers

Get all the drivers for the specified group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetDriversExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupDriversParam = new InlineObject3(); // InlineObject3 | 

            try
            {
                // /fleet/drivers
                DriversResponse result = apiInstance.GetFleetDrivers(accessToken, groupDriversParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetDrivers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupDriversParam** | [**InlineObject3**](InlineObject3.md)|  | 

### Return type

[**DriversResponse**](DriversResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleetdrivershosdailylogs"></a>
# **GetFleetDriversHosDailyLogs**
> DriverDailyLogResponse GetFleetDriversHosDailyLogs (string accessToken, long? driverId, InlineObject6 hosLogsParam)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetDriversHosDailyLogsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverId = 789;  // long? | ID of the driver with HOS logs.
            var hosLogsParam = new InlineObject6(); // InlineObject6 | 

            try
            {
                // /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
                DriverDailyLogResponse result = apiInstance.GetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetDriversHosDailyLogs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverId** | **long?**| ID of the driver with HOS logs. | 
 **hosLogsParam** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**DriverDailyLogResponse**](DriverDailyLogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleetdriverssummary"></a>
# **GetFleetDriversSummary**
> DriversSummaryResponse GetFleetDriversSummary (string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetDriversSummaryExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driversSummaryParam = new InlineObject5(); // InlineObject5 | 
            var snapToDayBounds = true;  // bool? | Snap query result to HOS day boundaries. (optional) 

            try
            {
                // /fleet/drivers/summary
                DriversSummaryResponse result = apiInstance.GetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetDriversSummary: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driversSummaryParam** | [**InlineObject5**](InlineObject5.md)|  | 
 **snapToDayBounds** | **bool?**| Snap query result to HOS day boundaries. | [optional] 

### Return type

[**DriversSummaryResponse**](DriversSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleethosauthenticationlogs"></a>
# **GetFleetHosAuthenticationLogs**
> HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs (string accessToken, InlineObject7 hosAuthenticationLogsParam)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetHosAuthenticationLogsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var hosAuthenticationLogsParam = new InlineObject7(); // InlineObject7 | 

            try
            {
                // /fleet/hos_authentication_logs
                HosAuthenticationLogsResponse result = apiInstance.GetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetHosAuthenticationLogs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **hosAuthenticationLogsParam** | [**InlineObject7**](InlineObject7.md)|  | 

### Return type

[**HosAuthenticationLogsResponse**](HosAuthenticationLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleethoslogs"></a>
# **GetFleetHosLogs**
> HosLogsResponse GetFleetHosLogs (string accessToken, InlineObject8 hosLogsParam)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetHosLogsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var hosLogsParam = new InlineObject8(); // InlineObject8 | 

            try
            {
                // /fleet/hos_logs
                HosLogsResponse result = apiInstance.GetFleetHosLogs(accessToken, hosLogsParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetHosLogs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **hosLogsParam** | [**InlineObject8**](InlineObject8.md)|  | 

### Return type

[**HosLogsResponse**](HosLogsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleethoslogssummary"></a>
# **GetFleetHosLogsSummary**
> HosLogsSummaryResponse GetFleetHosLogsSummary (string accessToken, InlineObject9 hosLogsParam)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetHosLogsSummaryExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var hosLogsParam = new InlineObject9(); // InlineObject9 | 

            try
            {
                // /fleet/hos_logs_summary
                HosLogsSummaryResponse result = apiInstance.GetFleetHosLogsSummary(accessToken, hosLogsParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetHosLogsSummary: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **hosLogsParam** | [**InlineObject9**](InlineObject9.md)|  | 

### Return type

[**HosLogsSummaryResponse**](HosLogsSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleetlocations"></a>
# **GetFleetLocations**
> InlineResponse2003 GetFleetLocations (string accessToken, InlineObject11 groupParam)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupParam = new InlineObject11(); // InlineObject11 | 

            try
            {
                // /fleet/locations
                InlineResponse2003 result = apiInstance.GetFleetLocations(accessToken, groupParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupParam** | [**InlineObject11**](InlineObject11.md)|  | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleetmaintenancelist"></a>
# **GetFleetMaintenanceList**
> InlineResponse2004 GetFleetMaintenanceList (string accessToken, InlineObject13 groupParam)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetMaintenanceListExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupParam = new InlineObject13(); // InlineObject13 | 

            try
            {
                // /fleet/maintenance/list
                InlineResponse2004 result = apiInstance.GetFleetMaintenanceList(accessToken, groupParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetMaintenanceList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupParam** | [**InlineObject13**](InlineObject13.md)|  | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleettrips"></a>
# **GetFleetTrips**
> TripResponse GetFleetTrips (string accessToken, InlineObject15 tripsParam)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetTripsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var tripsParam = new InlineObject15(); // InlineObject15 | 

            try
            {
                // /fleet/trips
                TripResponse result = apiInstance.GetFleetTrips(accessToken, tripsParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetTrips: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **tripsParam** | [**InlineObject15**](InlineObject15.md)|  | 

### Return type

[**TripResponse**](TripResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfleetvehicle"></a>
# **GetFleetVehicle**
> FleetVehicleResponse GetFleetVehicle (string accessToken, string vehicleIdOrExternalId)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetFleetVehicleExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleIdOrExternalId = vehicleIdOrExternalId_example;  // string | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.

            try
            {
                // /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
                FleetVehicleResponse result = apiInstance.GetFleetVehicle(accessToken, vehicleIdOrExternalId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetFleetVehicle: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleIdOrExternalId** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getorganizationaddress"></a>
# **GetOrganizationAddress**
> Address GetOrganizationAddress (string accessToken, long? addressId)

/addresses/{addressId}

Fetch an address by its id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetOrganizationAddressExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var addressId = 789;  // long? | ID of the address/geofence

            try
            {
                // /addresses/{addressId}
                Address result = apiInstance.GetOrganizationAddress(accessToken, addressId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetOrganizationAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **addressId** | **long?**| ID of the address/geofence | 

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getorganizationaddresses"></a>
# **GetOrganizationAddresses**
> List<Address> GetOrganizationAddresses (string accessToken)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetOrganizationAddressesExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.

            try
            {
                // /addresses
                List&lt;Address&gt; result = apiInstance.GetOrganizationAddresses(accessToken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetOrganizationAddresses: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 

### Return type

[**List<Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getorganizationcontact"></a>
# **GetOrganizationContact**
> Contact GetOrganizationContact (string accessToken, long? contactId)

/contacts/{contact_id}

Fetch a contact by its id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetOrganizationContactExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var contactId = 789;  // long? | ID of the contact

            try
            {
                // /contacts/{contact_id}
                Contact result = apiInstance.GetOrganizationContact(accessToken, contactId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetOrganizationContact: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **contactId** | **long?**| ID of the contact | 

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvehicleharshevent"></a>
# **GetVehicleHarshEvent**
> VehicleHarshEventResponse GetVehicleHarshEvent (long? vehicleId, string accessToken, long? timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetVehicleHarshEventExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var vehicleId = 789;  // long? | ID of the vehicle
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var timestamp = 789;  // long? | Timestamp in milliseconds representing the timestamp of a harsh event.

            try
            {
                // /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
                VehicleHarshEventResponse result = apiInstance.GetVehicleHarshEvent(vehicleId, accessToken, timestamp);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetVehicleHarshEvent: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **long?**| ID of the vehicle | 
 **accessToken** | **string**| Samsara API access token. | 
 **timestamp** | **long?**| Timestamp in milliseconds representing the timestamp of a harsh event. | 

### Return type

[**VehicleHarshEventResponse**](VehicleHarshEventResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvehiclelocations"></a>
# **GetVehicleLocations**
> List<FleetVehicleLocation> GetVehicleLocations (string accessToken, long? vehicleId, long? startMs, long? endMs)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetVehicleLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleId = 789;  // long? | ID of the vehicle with the associated routes.
            var startMs = 789;  // long? | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
            var endMs = 789;  // long? | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)

            try
            {
                // /fleet/vehicles/{vehicle_id:[0-9]+}/locations
                List&lt;FleetVehicleLocation&gt; result = apiInstance.GetVehicleLocations(accessToken, vehicleId, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetVehicleLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleId** | **long?**| ID of the vehicle with the associated routes. | 
 **startMs** | **long?**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) | 
 **endMs** | **long?**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) | 

### Return type

[**List<FleetVehicleLocation>**](FleetVehicleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvehiclesafetyscore"></a>
# **GetVehicleSafetyScore**
> VehicleSafetyScoreResponse GetVehicleSafetyScore (long? vehicleId, string accessToken, long? startMs, long? endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetVehicleSafetyScoreExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var vehicleId = 789;  // long? | ID of the vehicle
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
                VehicleSafetyScoreResponse result = apiInstance.GetVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetVehicleSafetyScore: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **long?**| ID of the vehicle | 
 **accessToken** | **string**| Samsara API access token. | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**VehicleSafetyScoreResponse**](VehicleSafetyScoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvehiclestats"></a>
# **GetVehicleStats**
> InlineResponse2005 GetVehicleStats (string accessToken, int? startMs, int? endMs, string series, string tagIds, string startingAfter, string endingBefore, long? limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetVehicleStatsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var startMs = 56;  // int? | Time in Unix epoch milliseconds for the start of the query.
            var endMs = 56;  // int? | Time in Unix epoch milliseconds for the end of the query.
            var series = series_example;  // string | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 (optional) 
            var tagIds = tagIds_example;  // string | Comma-separated list of tag ids. Example: tagIds=1,2,3 (optional) 
            var startingAfter = startingAfter_example;  // string | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional) 
            var endingBefore = endingBefore_example;  // string | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional) 
            var limit = 789;  // long? | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional) 

            try
            {
                // /fleet/vehicles/stats
                InlineResponse2005 result = apiInstance.GetVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetVehicleStats: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **startMs** | **int?**| Time in Unix epoch milliseconds for the start of the query. | 
 **endMs** | **int?**| Time in Unix epoch milliseconds for the end of the query. | 
 **series** | **string**| Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 | [optional] 
 **tagIds** | **string**| Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 | [optional] 
 **startingAfter** | **string**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **endingBefore** | **string**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **long?**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvehicleslocations"></a>
# **GetVehiclesLocations**
> List<Object> GetVehiclesLocations (string accessToken, int? startMs, int? endMs)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetVehiclesLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var startMs = 56;  // int? | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
            var endMs = 56;  // int? | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)

            try
            {
                // /fleet/vehicles/locations
                List&lt;Object&gt; result = apiInstance.GetVehiclesLocations(accessToken, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.GetVehiclesLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **startMs** | **int?**| Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) | 
 **endMs** | **int?**| Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) | 

### Return type

**List<Object>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listcontacts"></a>
# **ListContacts**
> List<Contact> ListContacts (string accessToken)

/contacts

Fetch all contacts for the organization.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListContactsExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.

            try
            {
                // /contacts
                List&lt;Contact&gt; result = apiInstance.ListContacts(accessToken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.ListContacts: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 

### Return type

[**List<Contact>**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listfleet"></a>
# **ListFleet**
> InlineResponse2002 ListFleet (string accessToken, InlineObject10 groupParam, string startingAfter, string endingBefore, long? limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListFleetExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupParam = new InlineObject10(); // InlineObject10 | 
            var startingAfter = startingAfter_example;  // string | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional) 
            var endingBefore = endingBefore_example;  // string | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional) 
            var limit = 789;  // long? | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional) 

            try
            {
                // /fleet/list
                InlineResponse2002 result = apiInstance.ListFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.ListFleet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupParam** | [**InlineObject10**](InlineObject10.md)|  | 
 **startingAfter** | **string**| Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. | [optional] 
 **endingBefore** | **string**| Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. | [optional] 
 **limit** | **long?**| Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="patchfleetvehicle"></a>
# **PatchFleetVehicle**
> FleetVehicleResponse PatchFleetVehicle (string accessToken, string vehicleIdOrExternalId, InlineObject16 data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PatchFleetVehicleExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleIdOrExternalId = vehicleIdOrExternalId_example;  // string | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
            var data = new InlineObject16(); // InlineObject16 | 

            try
            {
                // /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
                FleetVehicleResponse result = apiInstance.PatchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.PatchFleetVehicle: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleIdOrExternalId** | **string**| ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. | 
 **data** | [**InlineObject16**](InlineObject16.md)|  | 

### Return type

[**FleetVehicleResponse**](FleetVehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="reactivatedriverbyid"></a>
# **ReactivateDriverById**
> Driver ReactivateDriverById (string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ReactivateDriverByIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var driverIdOrExternalId = driverIdOrExternalId_example;  // string | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
            var reactivateDriverParam = new InlineObject4(); // InlineObject4 | 

            try
            {
                // /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
                Driver result = apiInstance.ReactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.ReactivateDriverById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **driverIdOrExternalId** | **string**| ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. | 
 **reactivateDriverParam** | [**InlineObject4**](InlineObject4.md)|  | 

### Return type

[**Driver**](Driver.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatedispatchroutebyid"></a>
# **UpdateDispatchRouteById**
> DispatchRoute UpdateDispatchRouteById (string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateDispatchRouteByIdExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var routeId = 789;  // long? | ID of the dispatch route.
            var updateDispatchRouteParams = new DispatchRoute(); // DispatchRoute | 

            try
            {
                // /fleet/dispatch/routes/{route_id:[0-9]+}/
                DispatchRoute result = apiInstance.UpdateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.UpdateDispatchRouteById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **routeId** | **long?**| ID of the dispatch route. | 
 **updateDispatchRouteParams** | [**DispatchRoute**](DispatchRoute.md)|  | 

### Return type

[**DispatchRoute**](DispatchRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateorganizationaddress"></a>
# **UpdateOrganizationAddress**
> void UpdateOrganizationAddress (string accessToken, long? addressId, InlineObject1 address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateOrganizationAddressExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var addressId = 789;  // long? | ID of the address/geofence
            var address = new InlineObject1(); // InlineObject1 | 

            try
            {
                // /addresses/{addressId}
                apiInstance.UpdateOrganizationAddress(accessToken, addressId, address);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.UpdateOrganizationAddress: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **addressId** | **long?**| ID of the address/geofence | 
 **address** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatevehicles"></a>
# **UpdateVehicles**
> void UpdateVehicles (string accessToken, InlineObject14 vehicleUpdateParam)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UpdateVehiclesExample
    {
        public void main()
        {
            
            var apiInstance = new FleetApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var vehicleUpdateParam = new InlineObject14(); // InlineObject14 | 

            try
            {
                // /fleet/set_data
                apiInstance.UpdateVehicles(accessToken, vehicleUpdateParam);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling FleetApi.UpdateVehicles: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **vehicleUpdateParam** | [**InlineObject14**](InlineObject14.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

