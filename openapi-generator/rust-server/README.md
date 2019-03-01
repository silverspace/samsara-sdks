# Rust API for openapi_client

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

## Overview
This client/server was generated by the [openapi-generator]
(https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate a server stub.
-

To see how to make this your own, look here:

[README]((https://openapi-generator.tech))

- API version: 1.0.0
- Build date: 2019-03-01T05:39:30.107Z[GMT]

This autogenerated project defines an API crate `openapi_client` which contains:
* An `Api` trait defining the API in Rust.
* Data types representing the underlying data model.
* A `Client` type which implements `Api` and issues HTTP requests for each operation.
* A router which accepts HTTP requests and invokes the appropriate `Api` method for each operation.

It also contains an example server and client which make use of `openapi_client`:
* The example server starts up a web server using the `openapi_client` router,
  and supplies a trivial implementation of `Api` which returns failure for every operation.
* The example client provides a CLI which lets you invoke any single operation on the
  `openapi_client` client by passing appropriate arguments on the command line.

You can use the example server and client as a basis for your own code.
See below for [more detail on implementing a server](#writing-a-server).


## Examples

Run examples with:

```
cargo run --example <example-name>
```

To pass in arguments to the examples, put them after `--`, for example:

```
cargo run --example client -- --help
```

### Running the server
To run the server, follow these simple steps:

```
cargo run --example server
```

### Running a client
To run a client, follow one of the following simple steps:

```
cargo run --example client GetAllAssetCurrentLocations
cargo run --example client GetAllAssets
cargo run --example client GetAssetLocation
cargo run --example client GetAssetReefer
cargo run --example client CreateDriver
cargo run --example client DeactivateDriver
cargo run --example client GetAllDeactivatedDrivers
cargo run --example client GetDeactivatedDriverById
cargo run --example client GetDriverById
cargo run --example client ReactivateDriverById
cargo run --example client AddFleetAddress
cargo run --example client AddOrganizationAddresses
cargo run --example client CreateDispatchRoute
cargo run --example client CreateDriver
cargo run --example client CreateDriverDispatchRoute
cargo run --example client CreateDriverDocument
cargo run --example client CreateDvir
cargo run --example client CreateVehicleDispatchRoute
cargo run --example client DeactivateDriver
cargo run --example client DeleteDispatchRouteById
cargo run --example client DeleteOrganizationAddress
cargo run --example client FetchAllDispatchRoutes
cargo run --example client FetchAllRouteJobUpdates
cargo run --example client GetAllAssetCurrentLocations
cargo run --example client GetAllAssets
cargo run --example client GetAllDeactivatedDrivers
cargo run --example client GetAssetLocation
cargo run --example client GetAssetReefer
cargo run --example client GetDeactivatedDriverById
cargo run --example client GetDispatchRouteById
cargo run --example client GetDispatchRouteHistory
cargo run --example client GetDispatchRoutesByDriverId
cargo run --example client GetDispatchRoutesByVehicleId
cargo run --example client GetDriverById
cargo run --example client GetDriverDocumentTypesByOrgId
cargo run --example client GetDriverDocumentsByOrgId
cargo run --example client GetDriverSafetyScore
cargo run --example client GetDvirs
cargo run --example client GetFleetDrivers
cargo run --example client GetFleetDriversHosDailyLogs
cargo run --example client GetFleetDriversSummary
cargo run --example client GetFleetHosAuthenticationLogs
cargo run --example client GetFleetHosLogs
cargo run --example client GetFleetHosLogsSummary
cargo run --example client GetFleetLocations
cargo run --example client GetFleetMaintenanceList
cargo run --example client GetFleetTrips
cargo run --example client GetFleetVehicle
cargo run --example client GetOrganizationAddress
cargo run --example client GetOrganizationAddresses
cargo run --example client GetOrganizationContact
cargo run --example client GetVehicleHarshEvent
cargo run --example client GetVehicleLocations
cargo run --example client GetVehicleSafetyScore
cargo run --example client GetVehicleStats
cargo run --example client GetVehiclesLocations
cargo run --example client ListContacts
cargo run --example client ListFleet
cargo run --example client PatchFleetVehicle
cargo run --example client ReactivateDriverById
cargo run --example client UpdateDispatchRouteById
cargo run --example client UpdateOrganizationAddress
cargo run --example client UpdateVehicles
cargo run --example client GetAllDataInputs
cargo run --example client GetDataInput
cargo run --example client GetMachines
cargo run --example client GetMachinesHistory
cargo run --example client CreateDispatchRoute
cargo run --example client CreateDriverDispatchRoute
cargo run --example client CreateVehicleDispatchRoute
cargo run --example client DeleteDispatchRouteById
cargo run --example client FetchAllDispatchRoutes
cargo run --example client FetchAllRouteJobUpdates
cargo run --example client GetDispatchRouteById
cargo run --example client GetDispatchRouteHistory
cargo run --example client GetDispatchRoutesByDriverId
cargo run --example client GetDispatchRoutesByVehicleId
cargo run --example client UpdateDispatchRouteById
cargo run --example client GetDriverSafetyScore
cargo run --example client GetVehicleHarshEvent
cargo run --example client GetVehicleSafetyScore
cargo run --example client GetSensors
cargo run --example client GetSensorsCargo
cargo run --example client GetSensorsDoor
cargo run --example client GetSensorsHistory
cargo run --example client GetSensorsHumidity
cargo run --example client GetSensorsTemperature
cargo run --example client CreateTag
cargo run --example client DeleteTagById
cargo run --example client GetAllTags
cargo run --example client GetTagById
cargo run --example client ModifyTagById
cargo run --example client UpdateTagById
cargo run --example client DeleteUserById
cargo run --example client GetUserById
cargo run --example client ListUserRoles
cargo run --example client ListUsers
```

### HTTPS
The examples can be run in HTTPS mode by passing in the flag `--https`, for example:

```
cargo run --example server -- --https
```

This will use the keys/certificates from the examples directory. Note that the server chain is signed with
`CN=localhost`.


## Writing a server

The server example is designed to form the basis for implementing your own server. Simply follow these steps.

* Set up a new Rust project, e.g., with `cargo init --bin`.
* Insert `openapi_client` into the `members` array under [workspace] in the root `Cargo.toml`, e.g., `members = [ "openapi_client" ]`.
* Add `openapi_client = {version = "1.0.0", path = "openapi_client"}` under `[dependencies]` in the root `Cargo.toml`.
* Copy the `[dependencies]` and `[dev-dependencies]` from `openapi_client/Cargo.toml` into the root `Cargo.toml`'s `[dependencies]` section.
  * Copy all of the `[dev-dependencies]`, but only the `[dependencies]` that are required by the example server. These should be clearly indicated by comments.
  * Remove `"optional = true"` from each of these lines if present.

Each autogenerated API will contain an implementation stub and main entry point, which should be copied into your project the first time:
```
cp openapi_client/examples/server.rs src/main.rs
cp openapi_client/examples/server_lib/mod.rs src/lib.rs
cp openapi_client/examples/server_lib/server.rs src/server.rs
```

Now

* From `src/main.rs`, remove the `mod server_lib;` line, and uncomment and fill in the `extern crate` line with the name of this server crate.
* Move the block of imports "required by the service library" from `src/main.rs` to `src/lib.rs` and uncomment.
* Change the `let server = server::Server {};` line to `let server = SERVICE_NAME::server().unwrap();` where `SERVICE_NAME` is the name of the server crate.
* Run `cargo build` to check it builds.
* Run `cargo fmt` to reformat the code.
* Commit the result before making any further changes (lest format changes get confused with your own updates).

Now replace the implementations in `src/server.rs` with your own code as required.

## Updating your server to track API changes

Later, if the API changes, you can copy new sections  from the autogenerated API stub into your implementation.
Alternatively, implement the now-missing methods based on the compiler's error messages.

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllAssetCurrentLocations**](docs/assets_api.md#GetAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](docs/assets_api.md#GetAllAssets) | **GET** /fleet/assets | /fleet/assets
[**GetAssetLocation**](docs/assets_api.md#GetAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](docs/assets_api.md#GetAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**createDriver**](docs/drivers_api.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**deactivateDriver**](docs/drivers_api.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getAllDeactivatedDrivers**](docs/drivers_api.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**getDeactivatedDriverById**](docs/drivers_api.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDriverById**](docs/drivers_api.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivateDriverById**](docs/drivers_api.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**add_fleet_address**](docs/fleet_api.md#add_fleet_address) | **POST** /fleet/add_address | /fleet/add_address
[**AddOrganizationAddresses**](docs/fleet_api.md#AddOrganizationAddresses) | **POST** /addresses | /addresses
[**createDispatchRoute**](docs/fleet_api.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriver**](docs/fleet_api.md#createDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**createDriverDispatchRoute**](docs/fleet_api.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createDriverDocument**](docs/fleet_api.md#createDriverDocument) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
[**create_dvir**](docs/fleet_api.md#create_dvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**createVehicleDispatchRoute**](docs/fleet_api.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deactivateDriver**](docs/fleet_api.md#deactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**deleteDispatchRouteById**](docs/fleet_api.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**DeleteOrganizationAddress**](docs/fleet_api.md#DeleteOrganizationAddress) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
[**fetchAllDispatchRoutes**](docs/fleet_api.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](docs/fleet_api.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetAllAssetCurrentLocations**](docs/fleet_api.md#GetAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](docs/fleet_api.md#GetAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAllDeactivatedDrivers**](docs/fleet_api.md#getAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**GetAssetLocation**](docs/fleet_api.md#GetAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](docs/fleet_api.md#GetAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
[**getDeactivatedDriverById**](docs/fleet_api.md#getDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDispatchRouteById**](docs/fleet_api.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](docs/fleet_api.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](docs/fleet_api.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](docs/fleet_api.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**getDriverById**](docs/fleet_api.md#getDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**getDriverDocumentTypesByOrgId**](docs/fleet_api.md#getDriverDocumentTypesByOrgId) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
[**getDriverDocumentsByOrgId**](docs/fleet_api.md#getDriverDocumentsByOrgId) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
[**GetDriverSafetyScore**](docs/fleet_api.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**get_dvirs**](docs/fleet_api.md#get_dvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
[**get_fleet_drivers**](docs/fleet_api.md#get_fleet_drivers) | **POST** /fleet/drivers | /fleet/drivers
[**get_fleet_drivers_hos_daily_logs**](docs/fleet_api.md#get_fleet_drivers_hos_daily_logs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
[**get_fleet_drivers_summary**](docs/fleet_api.md#get_fleet_drivers_summary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
[**get_fleet_hos_authentication_logs**](docs/fleet_api.md#get_fleet_hos_authentication_logs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
[**get_fleet_hos_logs**](docs/fleet_api.md#get_fleet_hos_logs) | **POST** /fleet/hos_logs | /fleet/hos_logs
[**get_fleet_hos_logs_summary**](docs/fleet_api.md#get_fleet_hos_logs_summary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
[**get_fleet_locations**](docs/fleet_api.md#get_fleet_locations) | **POST** /fleet/locations | /fleet/locations
[**get_fleet_maintenance_list**](docs/fleet_api.md#get_fleet_maintenance_list) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
[**get_fleet_trips**](docs/fleet_api.md#get_fleet_trips) | **POST** /fleet/trips | /fleet/trips
[**getFleetVehicle**](docs/fleet_api.md#getFleetVehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetOrganizationAddress**](docs/fleet_api.md#GetOrganizationAddress) | **GET** /addresses/{addressId} | /addresses/{addressId}
[**GetOrganizationAddresses**](docs/fleet_api.md#GetOrganizationAddresses) | **GET** /addresses | /addresses
[**GetOrganizationContact**](docs/fleet_api.md#GetOrganizationContact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
[**GetVehicleHarshEvent**](docs/fleet_api.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**getVehicleLocations**](docs/fleet_api.md#getVehicleLocations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
[**GetVehicleSafetyScore**](docs/fleet_api.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**GetVehicleStats**](docs/fleet_api.md#GetVehicleStats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
[**getVehiclesLocations**](docs/fleet_api.md#getVehiclesLocations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
[**ListContacts**](docs/fleet_api.md#ListContacts) | **GET** /contacts | /contacts
[**list_fleet**](docs/fleet_api.md#list_fleet) | **POST** /fleet/list | /fleet/list
[**patchFleetVehicle**](docs/fleet_api.md#patchFleetVehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**reactivateDriverById**](docs/fleet_api.md#reactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**updateDispatchRouteById**](docs/fleet_api.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**UpdateOrganizationAddress**](docs/fleet_api.md#UpdateOrganizationAddress) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
[**update_vehicles**](docs/fleet_api.md#update_vehicles) | **POST** /fleet/set_data | /fleet/set_data
[**GetAllDataInputs**](docs/industrial_api.md#GetAllDataInputs) | **GET** /industrial/data | /industrial/data
[**GetDataInput**](docs/industrial_api.md#GetDataInput) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
[**get_machines**](docs/industrial_api.md#get_machines) | **POST** /machines/list | /machines/list
[**get_machines_history**](docs/industrial_api.md#get_machines_history) | **POST** /machines/history | /machines/history
[**createDispatchRoute**](docs/routes_api.md#createDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**createDriverDispatchRoute**](docs/routes_api.md#createDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**createVehicleDispatchRoute**](docs/routes_api.md#createVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**deleteDispatchRouteById**](docs/routes_api.md#deleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**fetchAllDispatchRoutes**](docs/routes_api.md#fetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**fetchAllRouteJobUpdates**](docs/routes_api.md#fetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**getDispatchRouteById**](docs/routes_api.md#getDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**getDispatchRouteHistory**](docs/routes_api.md#getDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**getDispatchRoutesByDriverId**](docs/routes_api.md#getDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**getDispatchRoutesByVehicleId**](docs/routes_api.md#getDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**updateDispatchRouteById**](docs/routes_api.md#updateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**GetDriverSafetyScore**](docs/safety_api.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**GetVehicleHarshEvent**](docs/safety_api.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**GetVehicleSafetyScore**](docs/safety_api.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
[**get_sensors**](docs/sensors_api.md#get_sensors) | **POST** /sensors/list | /sensors/list
[**get_sensors_cargo**](docs/sensors_api.md#get_sensors_cargo) | **POST** /sensors/cargo | /sensors/cargo
[**get_sensors_door**](docs/sensors_api.md#get_sensors_door) | **POST** /sensors/door | /sensors/door
[**get_sensors_history**](docs/sensors_api.md#get_sensors_history) | **POST** /sensors/history | /sensors/history
[**get_sensors_humidity**](docs/sensors_api.md#get_sensors_humidity) | **POST** /sensors/humidity | /sensors/humidity
[**get_sensors_temperature**](docs/sensors_api.md#get_sensors_temperature) | **POST** /sensors/temperature | /sensors/temperature
[**CreateTag**](docs/tags_api.md#CreateTag) | **POST** /tags | /tags
[**deleteTagById**](docs/tags_api.md#deleteTagById) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**GetAllTags**](docs/tags_api.md#GetAllTags) | **GET** /tags | /tags
[**getTagById**](docs/tags_api.md#getTagById) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modifyTagById**](docs/tags_api.md#modifyTagById) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**updateTagById**](docs/tags_api.md#updateTagById) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**deleteUserById**](docs/users_api.md#deleteUserById) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**getUserById**](docs/users_api.md#getUserById) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**listUserRoles**](docs/users_api.md#listUserRoles) | **GET** /user_roles | /user_roles
[**list_users**](docs/users_api.md#list_users) | **GET** /users | /users


## Documentation For Models

 - [Address](docs/Address.md)
 - [AddressGeofence](docs/AddressGeofence.md)
 - [AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [AddressNotes](docs/AddressNotes.md)
 - [AddressesAddresses](docs/AddressesAddresses.md)
 - [AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [Asset](docs/Asset.md)
 - [AssetCable](docs/AssetCable.md)
 - [AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [AssetReeferResponse](docs/AssetReeferResponse.md)
 - [AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [AuxInput](docs/AuxInput.md)
 - [AuxInputSeries](docs/AuxInputSeries.md)
 - [CargoResponse](docs/CargoResponse.md)
 - [CargoResponseSensors](docs/CargoResponseSensors.md)
 - [Contact](docs/Contact.md)
 - [CurrentDriver](docs/CurrentDriver.md)
 - [DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [DispatchJob](docs/DispatchJob.md)
 - [DispatchJobCreate](docs/DispatchJobCreate.md)
 - [DispatchRoute](docs/DispatchRoute.md)
 - [DispatchRouteBase](docs/DispatchRouteBase.md)
 - [DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [Document](docs/Document.md)
 - [DocumentBase](docs/DocumentBase.md)
 - [DocumentCreate](docs/DocumentCreate.md)
 - [DocumentField](docs/DocumentField.md)
 - [DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [DocumentFieldType](docs/DocumentFieldType.md)
 - [DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [DocumentType](docs/DocumentType.md)
 - [DoorResponse](docs/DoorResponse.md)
 - [DoorResponseSensors](docs/DoorResponseSensors.md)
 - [Driver](docs/Driver.md)
 - [DriverBase](docs/DriverBase.md)
 - [DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [DriverForCreate](docs/DriverForCreate.md)
 - [DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [DriversResponse](docs/DriversResponse.md)
 - [DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [DvirBase](docs/DvirBase.md)
 - [DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [DvirListResponse](docs/DvirListResponse.md)
 - [EngineState](docs/EngineState.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [HosLogsResponse](docs/HosLogsResponse.md)
 - [HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [HumidityResponse](docs/HumidityResponse.md)
 - [HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [InlineObject10](docs/InlineObject10.md)
 - [InlineObject11](docs/InlineObject11.md)
 - [InlineObject12](docs/InlineObject12.md)
 - [InlineObject13](docs/InlineObject13.md)
 - [InlineObject14](docs/InlineObject14.md)
 - [InlineObject15](docs/InlineObject15.md)
 - [InlineObject16](docs/InlineObject16.md)
 - [InlineObject17](docs/InlineObject17.md)
 - [InlineObject18](docs/InlineObject18.md)
 - [InlineObject19](docs/InlineObject19.md)
 - [InlineObject2](docs/InlineObject2.md)
 - [InlineObject20](docs/InlineObject20.md)
 - [InlineObject21](docs/InlineObject21.md)
 - [InlineObject22](docs/InlineObject22.md)
 - [InlineObject23](docs/InlineObject23.md)
 - [InlineObject24](docs/InlineObject24.md)
 - [InlineObject3](docs/InlineObject3.md)
 - [InlineObject4](docs/InlineObject4.md)
 - [InlineObject5](docs/InlineObject5.md)
 - [InlineObject6](docs/InlineObject6.md)
 - [InlineObject7](docs/InlineObject7.md)
 - [InlineObject8](docs/InlineObject8.md)
 - [InlineObject9](docs/InlineObject9.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [JobStatus](docs/JobStatus.md)
 - [JobUpdateObject](docs/JobUpdateObject.md)
 - [Machine](docs/Machine.md)
 - [MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [Pagination](docs/Pagination.md)
 - [PrevJobStatus](docs/PrevJobStatus.md)
 - [SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [Sensor](docs/Sensor.md)
 - [SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [SensorsHistorySeries](docs/SensorsHistorySeries.md)
 - [Tag](docs/Tag.md)
 - [TagCreate](docs/TagCreate.md)
 - [TagMetadata](docs/TagMetadata.md)
 - [TagModify](docs/TagModify.md)
 - [TagModifyAdd](docs/TagModifyAdd.md)
 - [TagModifyDelete](docs/TagModifyDelete.md)
 - [TagUpdate](docs/TagUpdate.md)
 - [TaggedAddress](docs/TaggedAddress.md)
 - [TaggedAddressBase](docs/TaggedAddressBase.md)
 - [TaggedAsset](docs/TaggedAsset.md)
 - [TaggedAssetBase](docs/TaggedAssetBase.md)
 - [TaggedDriver](docs/TaggedDriver.md)
 - [TaggedDriverBase](docs/TaggedDriverBase.md)
 - [TaggedMachine](docs/TaggedMachine.md)
 - [TaggedMachineBase](docs/TaggedMachineBase.md)
 - [TaggedSensor](docs/TaggedSensor.md)
 - [TaggedSensorBase](docs/TaggedSensorBase.md)
 - [TaggedVehicle](docs/TaggedVehicle.md)
 - [TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [TemperatureResponse](docs/TemperatureResponse.md)
 - [TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [TripResponse](docs/TripResponse.md)
 - [TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [TripResponseTrips](docs/TripResponseTrips.md)
 - [User](docs/User.md)
 - [UserBase](docs/UserBase.md)
 - [UserRole](docs/UserRole.md)
 - [UserTagRole](docs/UserTagRole.md)
 - [UserTagRoleTag](docs/UserTagRoleTag.md)
 - [Vehicle](docs/Vehicle.md)
 - [VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [VehicleLocation](docs/VehicleLocation.md)
 - [VehicleMaintenance](docs/VehicleMaintenance.md)
 - [VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)


## Documentation For Authorization
 Endpoints do not require authorization.


## Author



