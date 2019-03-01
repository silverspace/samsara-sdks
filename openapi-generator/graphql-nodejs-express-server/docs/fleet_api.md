# fleet_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddFleetAddress**](fleet_api.md#AddFleetAddress) | **POST** /fleet/add_address | /fleet/add_address
[**AddOrganizationAddresses**](fleet_api.md#AddOrganizationAddresses) | **POST** /addresses | /addresses
[**CreateDispatchRoute**](fleet_api.md#CreateDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**CreateDriver**](fleet_api.md#CreateDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**CreateDriverDispatchRoute**](fleet_api.md#CreateDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**CreateDriverDocument**](fleet_api.md#CreateDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**CreateDvir**](fleet_api.md#CreateDvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**CreateVehicleDispatchRoute**](fleet_api.md#CreateVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**DeactivateDriver**](fleet_api.md#DeactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**DeleteDispatchRouteById**](fleet_api.md#DeleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**DeleteOrganizationAddress**](fleet_api.md#DeleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**FetchAllDispatchRoutes**](fleet_api.md#FetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**FetchAllRouteJobUpdates**](fleet_api.md#FetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetAllAssetCurrentLocations**](fleet_api.md#GetAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](fleet_api.md#GetAllAssets) | **GET** /fleet/assets | /fleet/assets
[**GetAllDeactivatedDrivers**](fleet_api.md#GetAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**GetAssetLocation**](fleet_api.md#GetAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](fleet_api.md#GetAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**GetDeactivatedDriverById**](fleet_api.md#GetDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetDispatchRouteById**](fleet_api.md#GetDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**GetDispatchRouteHistory**](fleet_api.md#GetDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**GetDispatchRoutesByDriverId**](fleet_api.md#GetDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**GetDispatchRoutesByVehicleId**](fleet_api.md#GetDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**GetDriverById**](fleet_api.md#GetDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetDriverDocumentTypesByOrgId**](fleet_api.md#GetDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**GetDriverDocumentsByOrgId**](fleet_api.md#GetDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**GetDriverSafetyScore**](fleet_api.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**GetDvirs**](fleet_api.md#GetDvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**GetFleetDrivers**](fleet_api.md#GetFleetDrivers) | **POST** /fleet/drivers | /fleet/drivers
[**GetFleetDriversHosDailyLogs**](fleet_api.md#GetFleetDriversHosDailyLogs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**GetFleetDriversSummary**](fleet_api.md#GetFleetDriversSummary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**GetFleetHosAuthenticationLogs**](fleet_api.md#GetFleetHosAuthenticationLogs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**GetFleetHosLogs**](fleet_api.md#GetFleetHosLogs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**GetFleetHosLogsSummary**](fleet_api.md#GetFleetHosLogsSummary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**GetFleetLocations**](fleet_api.md#GetFleetLocations) | **POST** /fleet/locations | /fleet/locations
[**GetFleetMaintenanceList**](fleet_api.md#GetFleetMaintenanceList) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**GetFleetTrips**](fleet_api.md#GetFleetTrips) | **POST** /fleet/trips | /fleet/trips
[**GetFleetVehicle**](fleet_api.md#GetFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetOrganizationAddress**](fleet_api.md#GetOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**GetOrganizationAddresses**](fleet_api.md#GetOrganizationAddresses) | **GET** /addresses | /addresses
[**GetOrganizationContact**](fleet_api.md#GetOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**GetVehicleHarshEvent**](fleet_api.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**GetVehicleLocations**](fleet_api.md#GetVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**GetVehicleSafetyScore**](fleet_api.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**GetVehicleStats**](fleet_api.md#GetVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**GetVehiclesLocations**](fleet_api.md#GetVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**ListContacts**](fleet_api.md#ListContacts) | **GET** /contacts | /contacts
[**ListFleet**](fleet_api.md#ListFleet) | **POST** /fleet/list | /fleet/list
[**PatchFleetVehicle**](fleet_api.md#PatchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**ReactivateDriverById**](fleet_api.md#ReactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**UpdateDispatchRouteById**](fleet_api.md#UpdateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**UpdateOrganizationAddress**](fleet_api.md#UpdateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**UpdateVehicles**](fleet_api.md#UpdateVehicles) | **POST** /fleet/set_data | /fleet/set_data


<a name="AddFleetAddress"></a>
# **AddFleetAddress**
> AddFleetAddress(accessToken, addressParam)

/fleet/add_address

This method adds an address book entry to the specified group.
<a name="AddOrganizationAddresses"></a>
# **AddOrganizationAddresses**
> Address AddOrganizationAddresses(accessToken, addresses)

/addresses

Add one or more addresses to the organization
<a name="CreateDispatchRoute"></a>
# **CreateDispatchRoute**
> DispatchRoute CreateDispatchRoute(accessToken, createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.
<a name="CreateDriver"></a>
# **CreateDriver**
> Driver CreateDriver(accessToken, createDriverParam)

/fleet/drivers/create

Create a new driver.
<a name="CreateDriverDispatchRoute"></a>
# **CreateDriverDispatchRoute**
> DispatchRoute CreateDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.
<a name="CreateDriverDocument"></a>
# **CreateDriverDocument**
> Document CreateDriverDocument(accessToken, driverId, createDocumentParams)

/fleet/drivers/{driver_id:[0-9]+}/documents

Create a driver document for the given driver.
<a name="CreateDvir"></a>
# **CreateDvir**
> DvirBase CreateDvir(accessToken, createDvirParam)

/fleet/maintenance/dvirs

Create a new dvir, marking a vehicle or trailer safe or unsafe.
<a name="CreateVehicleDispatchRoute"></a>
# **CreateVehicleDispatchRoute**
> DispatchRoute CreateVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.
<a name="DeactivateDriver"></a>
# **DeactivateDriver**
> DeactivateDriver(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.
<a name="DeleteDispatchRouteById"></a>
# **DeleteDispatchRouteById**
> DeleteDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.
<a name="DeleteOrganizationAddress"></a>
# **DeleteOrganizationAddress**
> DeleteOrganizationAddress(accessToken, addressId)

/addresses/{addressId}

Delete an address.
<a name="FetchAllDispatchRoutes"></a>
# **FetchAllDispatchRoutes**
> DispatchRoute FetchAllDispatchRoutes(accessToken, groupId, endTime, duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.
<a name="FetchAllRouteJobUpdates"></a>
# **FetchAllRouteJobUpdates**
> AllRouteJobUpdates FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
<a name="GetAllAssetCurrentLocations"></a>
# **GetAllAssetCurrentLocations**
> InlineResponse2001 GetAllAssetCurrentLocations(accessToken, groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.
<a name="GetAllAssets"></a>
# **GetAllAssets**
> InlineResponse200 GetAllAssets(accessToken, groupId)

/fleet/assets

Fetch all of the assets for the group.
<a name="GetAllDeactivatedDrivers"></a>
# **GetAllDeactivatedDrivers**
> Driver GetAllDeactivatedDrivers(accessToken, groupId)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.
<a name="GetAssetLocation"></a>
# **GetAssetLocation**
> TodoObjectMapping GetAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.
<a name="GetAssetReefer"></a>
# **GetAssetReefer**
> AssetReeferResponse GetAssetReefer(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.
<a name="GetDeactivatedDriverById"></a>
# **GetDeactivatedDriverById**
> Driver GetDeactivatedDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.
<a name="GetDispatchRouteById"></a>
# **GetDispatchRouteById**
> DispatchRoute GetDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.
<a name="GetDispatchRouteHistory"></a>
# **GetDispatchRouteHistory**
> DispatchRouteHistory GetDispatchRouteHistory(accessToken, routeId, startTime, endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.
<a name="GetDispatchRoutesByDriverId"></a>
# **GetDispatchRoutesByDriverId**
> DispatchRoute GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.
<a name="GetDispatchRoutesByVehicleId"></a>
# **GetDispatchRoutesByVehicleId**
> DispatchRoute GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.
<a name="GetDriverById"></a>
# **GetDriverById**
> Driver GetDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.
<a name="GetDriverDocumentTypesByOrgId"></a>
# **GetDriverDocumentTypesByOrgId**
> DocumentType GetDriverDocumentTypesByOrgId()

/fleet/drivers/document_types

Fetch all of the document types.
<a name="GetDriverDocumentsByOrgId"></a>
# **GetDriverDocumentsByOrgId**
> Document GetDriverDocumentsByOrgId(accessToken, endMs, durationMs)

/fleet/drivers/documents

Fetch all of the documents.
<a name="GetDriverSafetyScore"></a>
# **GetDriverSafetyScore**
> DriverSafetyScoreResponse GetDriverSafetyScore(driverId, accessToken, startMs, endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.
<a name="GetDvirs"></a>
# **GetDvirs**
> DvirListResponse GetDvirs(accessToken, endMs, durationMs, groupId)

/fleet/maintenance/dvirs

Get DVIRs for the org within provided time constraints
<a name="GetFleetDrivers"></a>
# **GetFleetDrivers**
> DriversResponse GetFleetDrivers(accessToken, groupDriversParam)

/fleet/drivers

Get all the drivers for the specified group.
<a name="GetFleetDriversHosDailyLogs"></a>
# **GetFleetDriversHosDailyLogs**
> DriverDailyLogResponse GetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam)

/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs

Get summarized daily HOS charts for a specified driver.
<a name="GetFleetDriversSummary"></a>
# **GetFleetDriversSummary**
> DriversSummaryResponse GetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds)

/fleet/drivers/summary

Get the distance and time each driver in an organization has driven in a given time period.
<a name="GetFleetHosAuthenticationLogs"></a>
# **GetFleetHosAuthenticationLogs**
> HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam)

/fleet/hos_authentication_logs

Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
<a name="GetFleetHosLogs"></a>
# **GetFleetHosLogs**
> HosLogsResponse GetFleetHosLogs(accessToken, hosLogsParam)

/fleet/hos_logs

Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
<a name="GetFleetHosLogsSummary"></a>
# **GetFleetHosLogsSummary**
> HosLogsSummaryResponse GetFleetHosLogsSummary(accessToken, hosLogsParam)

/fleet/hos_logs_summary

Get the current HOS status for all drivers in the group.
<a name="GetFleetLocations"></a>
# **GetFleetLocations**
> InlineResponse2003 GetFleetLocations(accessToken, groupParam)

/fleet/locations

Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
<a name="GetFleetMaintenanceList"></a>
# **GetFleetMaintenanceList**
> InlineResponse2004 GetFleetMaintenanceList(accessToken, groupParam)

/fleet/maintenance/list

Get list of the vehicles with any engine faults or check light data.
<a name="GetFleetTrips"></a>
# **GetFleetTrips**
> TripResponse GetFleetTrips(accessToken, tripsParam)

/fleet/trips

Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
<a name="GetFleetVehicle"></a>
# **GetFleetVehicle**
> FleetVehicleResponse GetFleetVehicle(accessToken, vehicleIdOrExternalId)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Gets a specific vehicle.
<a name="GetOrganizationAddress"></a>
# **GetOrganizationAddress**
> Address GetOrganizationAddress(accessToken, addressId)

/addresses/{addressId}

Fetch an address by its id.
<a name="GetOrganizationAddresses"></a>
# **GetOrganizationAddresses**
> Address GetOrganizationAddresses(accessToken)

/addresses

Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
<a name="GetOrganizationContact"></a>
# **GetOrganizationContact**
> Contact GetOrganizationContact(accessToken, contactId)

/contacts/{contact_id}

Fetch a contact by its id.
<a name="GetVehicleHarshEvent"></a>
# **GetVehicleHarshEvent**
> VehicleHarshEventResponse GetVehicleHarshEvent(vehicleId, accessToken, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.
<a name="GetVehicleLocations"></a>
# **GetVehicleLocations**
> FleetVehicleLocation GetVehicleLocations(accessToken, vehicleId, startMs, endMs)

/fleet/vehicles/{vehicle_id:[0-9]+}/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
<a name="GetVehicleSafetyScore"></a>
# **GetVehicleSafetyScore**
> VehicleSafetyScoreResponse GetVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.
<a name="GetVehicleStats"></a>
# **GetVehicleStats**
> InlineResponse2005 GetVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit)

/fleet/vehicles/stats

Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
<a name="GetVehiclesLocations"></a>
# **GetVehiclesLocations**
> TodoObjectMapping GetVehiclesLocations(accessToken, startMs, endMs)

/fleet/vehicles/locations

Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
<a name="ListContacts"></a>
# **ListContacts**
> Contact ListContacts(accessToken)

/contacts

Fetch all contacts for the organization.
<a name="ListFleet"></a>
# **ListFleet**
> InlineResponse2002 ListFleet(accessToken, groupParam, startingAfter, endingBefore, limit)

/fleet/list

Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
<a name="PatchFleetVehicle"></a>
# **PatchFleetVehicle**
> FleetVehicleResponse PatchFleetVehicle(accessToken, vehicleIdOrExternalId, data)

/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
<a name="ReactivateDriverById"></a>
# **ReactivateDriverById**
> Driver ReactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.
<a name="UpdateDispatchRouteById"></a>
# **UpdateDispatchRouteById**
> DispatchRoute UpdateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.
<a name="UpdateOrganizationAddress"></a>
# **UpdateOrganizationAddress**
> UpdateOrganizationAddress(accessToken, addressId, address)

/addresses/{addressId}

Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
<a name="UpdateVehicles"></a>
# **UpdateVehicles**
> UpdateVehicles(accessToken, vehicleUpdateParam)

/fleet/set_data

This method enables the mutation of metadata for vehicles in the Samsara Cloud.
