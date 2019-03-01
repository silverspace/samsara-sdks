<?php

/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Source files are located at:
 *
 * > swagger-codegen/modules/swagger-codegen/src/main/resources/php-laravel/
 */

/**
 * get getAllAssets
 * Summary: /fleet/assets
 * Notes: Fetch all of the assets for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets', 'AssetsController@getAllAssets');
/**
 * get getAllAssetCurrentLocations
 * Summary: /fleet/assets/locations
 * Notes: Fetch current locations of all assets for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets/locations', 'AssetsController@getAllAssetCurrentLocations');
/**
 * get getAssetLocation
 * Summary: /fleet/assets/{assetId:[0-9]+}/locations
 * Notes: Fetch the historical locations for the asset.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets/{asset_id}/locations', 'AssetsController@getAssetLocation');
/**
 * get getAssetReefer
 * Summary: /fleet/assets/{assetId:[0-9]+}/reefer
 * Notes: Fetch the reefer-specific stats of an asset.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets/{asset_id}/reefer', 'AssetsController@getAssetReefer');
/**
 * post createDriver
 * Summary: /fleet/drivers/create
 * Notes: Create a new driver.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers/create', 'DriversController@createDriver');
/**
 * get getAllDeactivatedDrivers
 * Summary: /fleet/drivers/inactive
 * Notes: Fetch all deactivated drivers for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/inactive', 'DriversController@getAllDeactivatedDrivers');
/**
 * get getDeactivatedDriverById
 * Summary: /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Fetch deactivated driver by id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/inactive/{driver_id_or_external_id}', 'DriversController@getDeactivatedDriverById');
/**
 * put reactivateDriverById
 * Summary: /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Reactivate the inactive driver having id.
 * Output-Formats: [application/json]
 */
Route::put('/v1/fleet/drivers/inactive/{driver_id_or_external_id}', 'DriversController@reactivateDriverById');
/**
 * delete deactivateDriver
 * Summary: /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Deactivate a driver with the given id.
 * Output-Formats: [application/json]
 */
Route::delete('/v1/fleet/drivers/{driver_id_or_external_id}', 'DriversController@deactivateDriver');
/**
 * get getDriverById
 * Summary: /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Fetch driver by id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/{driver_id_or_external_id}', 'DriversController@getDriverById');
/**
 * post addOrganizationAddresses
 * Summary: /addresses
 * Notes: Add one or more addresses to the organization
 * Output-Formats: [application/json]
 */
Route::post('/v1/addresses', 'FleetController@addOrganizationAddresses');
/**
 * get getOrganizationAddresses
 * Summary: /addresses
 * Notes: Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
 * Output-Formats: [application/json]
 */
Route::get('/v1/addresses', 'FleetController@getOrganizationAddresses');
/**
 * delete deleteOrganizationAddress
 * Summary: /addresses/{addressId}
 * Notes: Delete an address.
 * Output-Formats: [application/json]
 */
Route::delete('/v1/addresses/{addressId}', 'FleetController@deleteOrganizationAddress');
/**
 * get getOrganizationAddress
 * Summary: /addresses/{addressId}
 * Notes: Fetch an address by its id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/addresses/{addressId}', 'FleetController@getOrganizationAddress');
/**
 * patch updateOrganizationAddress
 * Summary: /addresses/{addressId}
 * Notes: Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
 * Output-Formats: [application/json]
 */
Route::patch('/v1/addresses/{addressId}', 'FleetController@updateOrganizationAddress');
/**
 * get listContacts
 * Summary: /contacts
 * Notes: Fetch all contacts for the organization.
 * Output-Formats: [application/json]
 */
Route::get('/v1/contacts', 'FleetController@listContacts');
/**
 * get getOrganizationContact
 * Summary: /contacts/{contact_id}
 * Notes: Fetch a contact by its id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/contacts/{contact_id}', 'FleetController@getOrganizationContact');
/**
 * post addFleetAddress
 * Summary: /fleet/add_address
 * Notes: This method adds an address book entry to the specified group.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/add_address', 'FleetController@addFleetAddress');
/**
 * get getAllAssets
 * Summary: /fleet/assets
 * Notes: Fetch all of the assets for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets', 'FleetController@getAllAssets');
/**
 * get getAllAssetCurrentLocations
 * Summary: /fleet/assets/locations
 * Notes: Fetch current locations of all assets for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets/locations', 'FleetController@getAllAssetCurrentLocations');
/**
 * get getAssetLocation
 * Summary: /fleet/assets/{assetId:[0-9]+}/locations
 * Notes: Fetch the historical locations for the asset.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets/{asset_id}/locations', 'FleetController@getAssetLocation');
/**
 * get getAssetReefer
 * Summary: /fleet/assets/{assetId:[0-9]+}/reefer
 * Notes: Fetch the reefer-specific stats of an asset.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/assets/{asset_id}/reefer', 'FleetController@getAssetReefer');
/**
 * post createDispatchRoute
 * Summary: /fleet/dispatch/routes
 * Notes: Create a new dispatch route.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/dispatch/routes', 'FleetController@createDispatchRoute');
/**
 * get fetchAllDispatchRoutes
 * Summary: /fleet/dispatch/routes
 * Notes: Fetch all of the dispatch routes for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes', 'FleetController@fetchAllDispatchRoutes');
/**
 * get fetchAllRouteJobUpdates
 * Summary: /fleet/dispatch/routes/job_updates
 * Notes: Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes/job_updates', 'FleetController@fetchAllRouteJobUpdates');
/**
 * delete deleteDispatchRouteById
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Notes: Delete a dispatch route and its associated jobs.
 * Output-Formats: [application/json]
 */
Route::delete('/v1/fleet/dispatch/routes/{route_id}', 'FleetController@deleteDispatchRouteById');
/**
 * get getDispatchRouteById
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}
 * Notes: Fetch a dispatch route by id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes/{route_id}', 'FleetController@getDispatchRouteById');
/**
 * put updateDispatchRouteById
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Notes: Update a dispatch route and its associated jobs.
 * Output-Formats: [application/json]
 */
Route::put('/v1/fleet/dispatch/routes/{route_id}', 'FleetController@updateDispatchRouteById');
/**
 * get getDispatchRouteHistory
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/history
 * Notes: Fetch the history of a dispatch route.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes/{route_id}/history', 'FleetController@getDispatchRouteHistory');
/**
 * post getFleetDrivers
 * Summary: /fleet/drivers
 * Notes: Get all the drivers for the specified group.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers', 'FleetController@getFleetDrivers');
/**
 * post createDriver
 * Summary: /fleet/drivers/create
 * Notes: Create a new driver.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers/create', 'FleetController@createDriver');
/**
 * get getDriverDocumentTypesByOrgId
 * Summary: /fleet/drivers/document_types
 * Notes: Fetch all of the document types.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/document_types', 'FleetController@getDriverDocumentTypesByOrgId');
/**
 * get getDriverDocumentsByOrgId
 * Summary: /fleet/drivers/documents
 * Notes: Fetch all of the documents.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/documents', 'FleetController@getDriverDocumentsByOrgId');
/**
 * get getAllDeactivatedDrivers
 * Summary: /fleet/drivers/inactive
 * Notes: Fetch all deactivated drivers for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/inactive', 'FleetController@getAllDeactivatedDrivers');
/**
 * get getDeactivatedDriverById
 * Summary: /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Fetch deactivated driver by id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/inactive/{driver_id_or_external_id}', 'FleetController@getDeactivatedDriverById');
/**
 * put reactivateDriverById
 * Summary: /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Reactivate the inactive driver having id.
 * Output-Formats: [application/json]
 */
Route::put('/v1/fleet/drivers/inactive/{driver_id_or_external_id}', 'FleetController@reactivateDriverById');
/**
 * post getFleetDriversSummary
 * Summary: /fleet/drivers/summary
 * Notes: Get the distance and time each driver in an organization has driven in a given time period.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers/summary', 'FleetController@getFleetDriversSummary');
/**
 * get getDriverSafetyScore
 * Summary: /fleet/drivers/{driverId:[0-9]+}/safety/score
 * Notes: Fetch the safety score for the driver.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/{driverId}/safety/score', 'FleetController@getDriverSafetyScore');
/**
 * delete deactivateDriver
 * Summary: /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Deactivate a driver with the given id.
 * Output-Formats: [application/json]
 */
Route::delete('/v1/fleet/drivers/{driver_id_or_external_id}', 'FleetController@deactivateDriver');
/**
 * get getDriverById
 * Summary: /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Fetch driver by id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/{driver_id_or_external_id}', 'FleetController@getDriverById');
/**
 * post createDriverDispatchRoute
 * Summary: /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Notes: Create a new dispatch route for the driver with driver_id.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers/{driver_id}/dispatch/routes', 'FleetController@createDriverDispatchRoute');
/**
 * get getDispatchRoutesByDriverId
 * Summary: /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Notes: Fetch all of the dispatch routes for a given driver.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/{driver_id}/dispatch/routes', 'FleetController@getDispatchRoutesByDriverId');
/**
 * post createDriverDocument
 * Summary: /fleet/drivers/{driver_id:[0-9]+}/documents
 * Notes: Create a driver document for the given driver.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers/{driver_id}/documents', 'FleetController@createDriverDocument');
/**
 * post getFleetDriversHosDailyLogs
 * Summary: /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
 * Notes: Get summarized daily HOS charts for a specified driver.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers/{driver_id}/hos_daily_logs', 'FleetController@getFleetDriversHosDailyLogs');
/**
 * post getFleetHosAuthenticationLogs
 * Summary: /fleet/hos_authentication_logs
 * Notes: Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/hos_authentication_logs', 'FleetController@getFleetHosAuthenticationLogs');
/**
 * post getFleetHosLogs
 * Summary: /fleet/hos_logs
 * Notes: Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/hos_logs', 'FleetController@getFleetHosLogs');
/**
 * post getFleetHosLogsSummary
 * Summary: /fleet/hos_logs_summary
 * Notes: Get the current HOS status for all drivers in the group.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/hos_logs_summary', 'FleetController@getFleetHosLogsSummary');
/**
 * post listFleet
 * Summary: /fleet/list
 * Notes: Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/list', 'FleetController@listFleet');
/**
 * post getFleetLocations
 * Summary: /fleet/locations
 * Notes: Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/locations', 'FleetController@getFleetLocations');
/**
 * post createDvir
 * Summary: /fleet/maintenance/dvirs
 * Notes: Create a new dvir, marking a vehicle or trailer safe or unsafe.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/maintenance/dvirs', 'FleetController@createDvir');
/**
 * get getDvirs
 * Summary: /fleet/maintenance/dvirs
 * Notes: Get DVIRs for the org within provided time constraints
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/maintenance/dvirs', 'FleetController@getDvirs');
/**
 * post getFleetMaintenanceList
 * Summary: /fleet/maintenance/list
 * Notes: Get list of the vehicles with any engine faults or check light data.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/maintenance/list', 'FleetController@getFleetMaintenanceList');
/**
 * post updateVehicles
 * Summary: /fleet/set_data
 * Notes: This method enables the mutation of metadata for vehicles in the Samsara Cloud.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/set_data', 'FleetController@updateVehicles');
/**
 * post getFleetTrips
 * Summary: /fleet/trips
 * Notes: Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/trips', 'FleetController@getFleetTrips');
/**
 * get getVehiclesLocations
 * Summary: /fleet/vehicles/locations
 * Notes: Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/locations', 'FleetController@getVehiclesLocations');
/**
 * get getVehicleStats
 * Summary: /fleet/vehicles/stats
 * Notes: Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/stats', 'FleetController@getVehicleStats');
/**
 * get getVehicleHarshEvent
 * Summary: /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
 * Notes: Fetch harsh event details for a vehicle.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicleId}/safety/harsh_event', 'FleetController@getVehicleHarshEvent');
/**
 * get getVehicleSafetyScore
 * Summary: /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
 * Notes: Fetch the safety score for the vehicle.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicleId}/safety/score', 'FleetController@getVehicleSafetyScore');
/**
 * get getFleetVehicle
 * Summary: /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Gets a specific vehicle.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicle_id_or_external_id}', 'FleetController@getFleetVehicle');
/**
 * patch patchFleetVehicle
 * Summary: /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
 * Notes: Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
 * Output-Formats: [application/json]
 */
Route::patch('/v1/fleet/vehicles/{vehicle_id_or_external_id}', 'FleetController@patchFleetVehicle');
/**
 * post createVehicleDispatchRoute
 * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Notes: Create a new dispatch route for the vehicle with vehicle_id.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/vehicles/{vehicle_id}/dispatch/routes', 'FleetController@createVehicleDispatchRoute');
/**
 * get getDispatchRoutesByVehicleId
 * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Notes: Fetch all of the dispatch routes for a given vehicle.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicle_id}/dispatch/routes', 'FleetController@getDispatchRoutesByVehicleId');
/**
 * get getVehicleLocations
 * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/locations
 * Notes: Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicle_id}/locations', 'FleetController@getVehicleLocations');
/**
 * get getAllDataInputs
 * Summary: /industrial/data
 * Notes: Fetch all of the data inputs for a group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/industrial/data', 'IndustrialController@getAllDataInputs');
/**
 * get getDataInput
 * Summary: /industrial/data/{data_input_id:[0-9]+}
 * Notes: Fetch datapoints from a given data input.
 * Output-Formats: [application/json]
 */
Route::get('/v1/industrial/data/{data_input_id}', 'IndustrialController@getDataInput');
/**
 * post getMachinesHistory
 * Summary: /machines/history
 * Notes: Get historical data for machine objects. This method returns a set of historical data for all machines in a group
 * Output-Formats: [application/json]
 */
Route::post('/v1/machines/history', 'IndustrialController@getMachinesHistory');
/**
 * post getMachines
 * Summary: /machines/list
 * Notes: Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
 * Output-Formats: [application/json]
 */
Route::post('/v1/machines/list', 'IndustrialController@getMachines');
/**
 * post createDispatchRoute
 * Summary: /fleet/dispatch/routes
 * Notes: Create a new dispatch route.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/dispatch/routes', 'RoutesController@createDispatchRoute');
/**
 * get fetchAllDispatchRoutes
 * Summary: /fleet/dispatch/routes
 * Notes: Fetch all of the dispatch routes for the group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes', 'RoutesController@fetchAllDispatchRoutes');
/**
 * get fetchAllRouteJobUpdates
 * Summary: /fleet/dispatch/routes/job_updates
 * Notes: Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes/job_updates', 'RoutesController@fetchAllRouteJobUpdates');
/**
 * delete deleteDispatchRouteById
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Notes: Delete a dispatch route and its associated jobs.
 * Output-Formats: [application/json]
 */
Route::delete('/v1/fleet/dispatch/routes/{route_id}', 'RoutesController@deleteDispatchRouteById');
/**
 * get getDispatchRouteById
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}
 * Notes: Fetch a dispatch route by id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes/{route_id}', 'RoutesController@getDispatchRouteById');
/**
 * put updateDispatchRouteById
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/
 * Notes: Update a dispatch route and its associated jobs.
 * Output-Formats: [application/json]
 */
Route::put('/v1/fleet/dispatch/routes/{route_id}', 'RoutesController@updateDispatchRouteById');
/**
 * get getDispatchRouteHistory
 * Summary: /fleet/dispatch/routes/{route_id:[0-9]+}/history
 * Notes: Fetch the history of a dispatch route.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/dispatch/routes/{route_id}/history', 'RoutesController@getDispatchRouteHistory');
/**
 * post createDriverDispatchRoute
 * Summary: /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Notes: Create a new dispatch route for the driver with driver_id.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/drivers/{driver_id}/dispatch/routes', 'RoutesController@createDriverDispatchRoute');
/**
 * get getDispatchRoutesByDriverId
 * Summary: /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
 * Notes: Fetch all of the dispatch routes for a given driver.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/{driver_id}/dispatch/routes', 'RoutesController@getDispatchRoutesByDriverId');
/**
 * post createVehicleDispatchRoute
 * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Notes: Create a new dispatch route for the vehicle with vehicle_id.
 * Output-Formats: [application/json]
 */
Route::post('/v1/fleet/vehicles/{vehicle_id}/dispatch/routes', 'RoutesController@createVehicleDispatchRoute');
/**
 * get getDispatchRoutesByVehicleId
 * Summary: /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
 * Notes: Fetch all of the dispatch routes for a given vehicle.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicle_id}/dispatch/routes', 'RoutesController@getDispatchRoutesByVehicleId');
/**
 * get getDriverSafetyScore
 * Summary: /fleet/drivers/{driverId:[0-9]+}/safety/score
 * Notes: Fetch the safety score for the driver.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/drivers/{driverId}/safety/score', 'SafetyController@getDriverSafetyScore');
/**
 * get getVehicleHarshEvent
 * Summary: /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
 * Notes: Fetch harsh event details for a vehicle.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicleId}/safety/harsh_event', 'SafetyController@getVehicleHarshEvent');
/**
 * get getVehicleSafetyScore
 * Summary: /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
 * Notes: Fetch the safety score for the vehicle.
 * Output-Formats: [application/json]
 */
Route::get('/v1/fleet/vehicles/{vehicleId}/safety/score', 'SafetyController@getVehicleSafetyScore');
/**
 * post getSensorsCargo
 * Summary: /sensors/cargo
 * Notes: Get cargo monitor status (empty / full) for requested sensors.
 * Output-Formats: [application/json]
 */
Route::post('/v1/sensors/cargo', 'SensorsController@getSensorsCargo');
/**
 * post getSensorsDoor
 * Summary: /sensors/door
 * Notes: Get door monitor status (closed / open) for requested sensors.
 * Output-Formats: [application/json]
 */
Route::post('/v1/sensors/door', 'SensorsController@getSensorsDoor');
/**
 * post getSensorsHistory
 * Summary: /sensors/history
 * Notes: Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
 * Output-Formats: [application/json]
 */
Route::post('/v1/sensors/history', 'SensorsController@getSensorsHistory');
/**
 * post getSensorsHumidity
 * Summary: /sensors/humidity
 * Notes: Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
 * Output-Formats: [application/json]
 */
Route::post('/v1/sensors/humidity', 'SensorsController@getSensorsHumidity');
/**
 * post getSensors
 * Summary: /sensors/list
 * Notes: Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
 * Output-Formats: [application/json]
 */
Route::post('/v1/sensors/list', 'SensorsController@getSensors');
/**
 * post getSensorsTemperature
 * Summary: /sensors/temperature
 * Notes: Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
 * Output-Formats: [application/json]
 */
Route::post('/v1/sensors/temperature', 'SensorsController@getSensorsTemperature');
/**
 * post createTag
 * Summary: /tags
 * Notes: Create a new tag for the group.
 * Output-Formats: [application/json]
 */
Route::post('/v1/tags', 'TagsController@createTag');
/**
 * get getAllTags
 * Summary: /tags
 * Notes: Fetch all of the tags for a group.
 * Output-Formats: [application/json]
 */
Route::get('/v1/tags', 'TagsController@getAllTags');
/**
 * delete deleteTagById
 * Summary: /tags/{tag_id:[0-9]+}
 * Notes: Permanently deletes a tag.
 * Output-Formats: [application/json]
 */
Route::delete('/v1/tags/{tag_id}', 'TagsController@deleteTagById');
/**
 * get getTagById
 * Summary: /tags/{tag_id:[0-9]+}
 * Notes: Fetch a tag by id.
 * Output-Formats: [application/json]
 */
Route::get('/v1/tags/{tag_id}', 'TagsController@getTagById');
/**
 * patch modifyTagById
 * Summary: /tags/{tag_id:[0-9]+}
 * Notes: Add or delete specific members from a tag, or modify the name of a tag.
 * Output-Formats: [application/json]
 */
Route::patch('/v1/tags/{tag_id}', 'TagsController@modifyTagById');
/**
 * put updateTagById
 * Summary: /tags/{tag_id:[0-9]+}
 * Notes: Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
 * Output-Formats: [application/json]
 */
Route::put('/v1/tags/{tag_id}', 'TagsController@updateTagById');
/**
 * get listUserRoles
 * Summary: /user_roles
 * Notes: Get all roles in the organization.
 * Output-Formats: [application/json]
 */
Route::get('/v1/user_roles', 'UsersController@listUserRoles');
/**
 * get listUsers
 * Summary: /users
 * Notes: List all users in the organization.
 * Output-Formats: [application/json]
 */
Route::get('/v1/users', 'UsersController@listUsers');
/**
 * delete deleteUserById
 * Summary: /users/{userId:[0-9]+}
 * Notes: Remove a user from the organization.
 * Output-Formats: [application/json]
 */
Route::delete('/v1/users/{userId}', 'UsersController@deleteUserById');
/**
 * get getUserById
 * Summary: /users/{userId:[0-9]+}
 * Notes: Get a user.
 * Output-Formats: [application/json]
 */
Route::get('/v1/users/{userId}', 'UsersController@getUserById');

