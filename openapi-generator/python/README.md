# openapi-client
# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint


# create an instance of the API class
api_instance = openapi_client.AssetsApi(openapi_client.ApiClient(configuration))
access_token = 'access_token_example' # str | Samsara API access token.
group_id = 56 # int | Optional group ID if the organization has multiple groups (uncommon). (optional)

try:
    # /fleet/assets/locations
    api_response = api_instance.get_all_asset_current_locations(access_token, group_id=group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AssetsApi->get_all_asset_current_locations: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://api.samsara.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**get_all_asset_current_locations**](docs/AssetsApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*AssetsApi* | [**get_all_assets**](docs/AssetsApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
*AssetsApi* | [**get_asset_location**](docs/AssetsApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*AssetsApi* | [**get_asset_reefer**](docs/AssetsApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*DriversApi* | [**create_driver**](docs/DriversApi.md#create_driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*DriversApi* | [**deactivate_driver**](docs/DriversApi.md#deactivate_driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**get_all_deactivated_drivers**](docs/DriversApi.md#get_all_deactivated_drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*DriversApi* | [**get_deactivated_driver_by_id**](docs/DriversApi.md#get_deactivated_driver_by_id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**get_driver_by_id**](docs/DriversApi.md#get_driver_by_id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*DriversApi* | [**reactivate_driver_by_id**](docs/DriversApi.md#reactivate_driver_by_id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**add_fleet_address**](docs/FleetApi.md#add_fleet_address) | **POST** /fleet/add_address | /fleet/add_address
*FleetApi* | [**add_organization_addresses**](docs/FleetApi.md#add_organization_addresses) | **POST** /addresses | /addresses
*FleetApi* | [**create_dispatch_route**](docs/FleetApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**create_driver**](docs/FleetApi.md#create_driver) | **POST** /fleet/drivers/create | /fleet/drivers/create
*FleetApi* | [**create_driver_dispatch_route**](docs/FleetApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**create_driver_document**](docs/FleetApi.md#create_driver_document) | **POST** /fleet/drivers/{driver_id}/documents | /fleet/drivers/{driver_id:[0-9]+}/documents
*FleetApi* | [**create_dvir**](docs/FleetApi.md#create_dvir) | **POST** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**create_vehicle_dispatch_route**](docs/FleetApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**deactivate_driver**](docs/FleetApi.md#deactivate_driver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**delete_dispatch_route_by_id**](docs/FleetApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**delete_organization_address**](docs/FleetApi.md#delete_organization_address) | **DELETE** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**fetch_all_dispatch_routes**](docs/FleetApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*FleetApi* | [**fetch_all_route_job_updates**](docs/FleetApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*FleetApi* | [**get_all_asset_current_locations**](docs/FleetApi.md#get_all_asset_current_locations) | **GET** /fleet/assets/locations | /fleet/assets/locations
*FleetApi* | [**get_all_assets**](docs/FleetApi.md#get_all_assets) | **GET** /fleet/assets | /fleet/assets
*FleetApi* | [**get_all_deactivated_drivers**](docs/FleetApi.md#get_all_deactivated_drivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
*FleetApi* | [**get_asset_location**](docs/FleetApi.md#get_asset_location) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
*FleetApi* | [**get_asset_reefer**](docs/FleetApi.md#get_asset_reefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer
*FleetApi* | [**get_deactivated_driver_by_id**](docs/FleetApi.md#get_deactivated_driver_by_id) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**get_dispatch_route_by_id**](docs/FleetApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*FleetApi* | [**get_dispatch_route_history**](docs/FleetApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*FleetApi* | [**get_dispatch_routes_by_driver_id**](docs/FleetApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*FleetApi* | [**get_dispatch_routes_by_vehicle_id**](docs/FleetApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*FleetApi* | [**get_driver_by_id**](docs/FleetApi.md#get_driver_by_id) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**get_driver_document_types_by_org_id**](docs/FleetApi.md#get_driver_document_types_by_org_id) | **GET** /fleet/drivers/document_types | /fleet/drivers/document_types
*FleetApi* | [**get_driver_documents_by_org_id**](docs/FleetApi.md#get_driver_documents_by_org_id) | **GET** /fleet/drivers/documents | /fleet/drivers/documents
*FleetApi* | [**get_driver_safety_score**](docs/FleetApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*FleetApi* | [**get_dvirs**](docs/FleetApi.md#get_dvirs) | **GET** /fleet/maintenance/dvirs | /fleet/maintenance/dvirs
*FleetApi* | [**get_fleet_drivers**](docs/FleetApi.md#get_fleet_drivers) | **POST** /fleet/drivers | /fleet/drivers
*FleetApi* | [**get_fleet_drivers_hos_daily_logs**](docs/FleetApi.md#get_fleet_drivers_hos_daily_logs) | **POST** /fleet/drivers/{driver_id}/hos_daily_logs | /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
*FleetApi* | [**get_fleet_drivers_summary**](docs/FleetApi.md#get_fleet_drivers_summary) | **POST** /fleet/drivers/summary | /fleet/drivers/summary
*FleetApi* | [**get_fleet_hos_authentication_logs**](docs/FleetApi.md#get_fleet_hos_authentication_logs) | **POST** /fleet/hos_authentication_logs | /fleet/hos_authentication_logs
*FleetApi* | [**get_fleet_hos_logs**](docs/FleetApi.md#get_fleet_hos_logs) | **POST** /fleet/hos_logs | /fleet/hos_logs
*FleetApi* | [**get_fleet_hos_logs_summary**](docs/FleetApi.md#get_fleet_hos_logs_summary) | **POST** /fleet/hos_logs_summary | /fleet/hos_logs_summary
*FleetApi* | [**get_fleet_locations**](docs/FleetApi.md#get_fleet_locations) | **POST** /fleet/locations | /fleet/locations
*FleetApi* | [**get_fleet_maintenance_list**](docs/FleetApi.md#get_fleet_maintenance_list) | **POST** /fleet/maintenance/list | /fleet/maintenance/list
*FleetApi* | [**get_fleet_trips**](docs/FleetApi.md#get_fleet_trips) | **POST** /fleet/trips | /fleet/trips
*FleetApi* | [**get_fleet_vehicle**](docs/FleetApi.md#get_fleet_vehicle) | **GET** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**get_organization_address**](docs/FleetApi.md#get_organization_address) | **GET** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**get_organization_addresses**](docs/FleetApi.md#get_organization_addresses) | **GET** /addresses | /addresses
*FleetApi* | [**get_organization_contact**](docs/FleetApi.md#get_organization_contact) | **GET** /contacts/{contact_id} | /contacts/{contact_id}
*FleetApi* | [**get_vehicle_harsh_event**](docs/FleetApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*FleetApi* | [**get_vehicle_locations**](docs/FleetApi.md#get_vehicle_locations) | **GET** /fleet/vehicles/{vehicle_id}/locations | /fleet/vehicles/{vehicle_id:[0-9]+}/locations
*FleetApi* | [**get_vehicle_safety_score**](docs/FleetApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*FleetApi* | [**get_vehicle_stats**](docs/FleetApi.md#get_vehicle_stats) | **GET** /fleet/vehicles/stats | /fleet/vehicles/stats
*FleetApi* | [**get_vehicles_locations**](docs/FleetApi.md#get_vehicles_locations) | **GET** /fleet/vehicles/locations | /fleet/vehicles/locations
*FleetApi* | [**list_contacts**](docs/FleetApi.md#list_contacts) | **GET** /contacts | /contacts
*FleetApi* | [**list_fleet**](docs/FleetApi.md#list_fleet) | **POST** /fleet/list | /fleet/list
*FleetApi* | [**patch_fleet_vehicle**](docs/FleetApi.md#patch_fleet_vehicle) | **PATCH** /fleet/vehicles/{vehicle_id_or_external_id} | /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**reactivate_driver_by_id**](docs/FleetApi.md#reactivate_driver_by_id) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
*FleetApi* | [**update_dispatch_route_by_id**](docs/FleetApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*FleetApi* | [**update_organization_address**](docs/FleetApi.md#update_organization_address) | **PATCH** /addresses/{addressId} | /addresses/{addressId}
*FleetApi* | [**update_vehicles**](docs/FleetApi.md#update_vehicles) | **POST** /fleet/set_data | /fleet/set_data
*IndustrialApi* | [**get_all_data_inputs**](docs/IndustrialApi.md#get_all_data_inputs) | **GET** /industrial/data | /industrial/data
*IndustrialApi* | [**get_data_input**](docs/IndustrialApi.md#get_data_input) | **GET** /industrial/data/{data_input_id} | /industrial/data/{data_input_id:[0-9]+}
*IndustrialApi* | [**get_machines**](docs/IndustrialApi.md#get_machines) | **POST** /machines/list | /machines/list
*IndustrialApi* | [**get_machines_history**](docs/IndustrialApi.md#get_machines_history) | **POST** /machines/history | /machines/history
*RoutesApi* | [**create_dispatch_route**](docs/RoutesApi.md#create_dispatch_route) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**create_driver_dispatch_route**](docs/RoutesApi.md#create_driver_dispatch_route) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**create_vehicle_dispatch_route**](docs/RoutesApi.md#create_vehicle_dispatch_route) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**delete_dispatch_route_by_id**](docs/RoutesApi.md#delete_dispatch_route_by_id) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*RoutesApi* | [**fetch_all_dispatch_routes**](docs/RoutesApi.md#fetch_all_dispatch_routes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
*RoutesApi* | [**fetch_all_route_job_updates**](docs/RoutesApi.md#fetch_all_route_job_updates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
*RoutesApi* | [**get_dispatch_route_by_id**](docs/RoutesApi.md#get_dispatch_route_by_id) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
*RoutesApi* | [**get_dispatch_route_history**](docs/RoutesApi.md#get_dispatch_route_history) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
*RoutesApi* | [**get_dispatch_routes_by_driver_id**](docs/RoutesApi.md#get_dispatch_routes_by_driver_id) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**get_dispatch_routes_by_vehicle_id**](docs/RoutesApi.md#get_dispatch_routes_by_vehicle_id) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
*RoutesApi* | [**update_dispatch_route_by_id**](docs/RoutesApi.md#update_dispatch_route_by_id) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
*SafetyApi* | [**get_driver_safety_score**](docs/SafetyApi.md#get_driver_safety_score) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
*SafetyApi* | [**get_vehicle_harsh_event**](docs/SafetyApi.md#get_vehicle_harsh_event) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
*SafetyApi* | [**get_vehicle_safety_score**](docs/SafetyApi.md#get_vehicle_safety_score) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
*SensorsApi* | [**get_sensors**](docs/SensorsApi.md#get_sensors) | **POST** /sensors/list | /sensors/list
*SensorsApi* | [**get_sensors_cargo**](docs/SensorsApi.md#get_sensors_cargo) | **POST** /sensors/cargo | /sensors/cargo
*SensorsApi* | [**get_sensors_door**](docs/SensorsApi.md#get_sensors_door) | **POST** /sensors/door | /sensors/door
*SensorsApi* | [**get_sensors_history**](docs/SensorsApi.md#get_sensors_history) | **POST** /sensors/history | /sensors/history
*SensorsApi* | [**get_sensors_humidity**](docs/SensorsApi.md#get_sensors_humidity) | **POST** /sensors/humidity | /sensors/humidity
*SensorsApi* | [**get_sensors_temperature**](docs/SensorsApi.md#get_sensors_temperature) | **POST** /sensors/temperature | /sensors/temperature
*TagsApi* | [**create_tag**](docs/TagsApi.md#create_tag) | **POST** /tags | /tags
*TagsApi* | [**delete_tag_by_id**](docs/TagsApi.md#delete_tag_by_id) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**get_all_tags**](docs/TagsApi.md#get_all_tags) | **GET** /tags | /tags
*TagsApi* | [**get_tag_by_id**](docs/TagsApi.md#get_tag_by_id) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**modify_tag_by_id**](docs/TagsApi.md#modify_tag_by_id) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*TagsApi* | [**update_tag_by_id**](docs/TagsApi.md#update_tag_by_id) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
*UsersApi* | [**delete_user_by_id**](docs/UsersApi.md#delete_user_by_id) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**get_user_by_id**](docs/UsersApi.md#get_user_by_id) | **GET** /users/{userId} | /users/{userId:[0-9]+}
*UsersApi* | [**list_user_roles**](docs/UsersApi.md#list_user_roles) | **GET** /user_roles | /user_roles
*UsersApi* | [**list_users**](docs/UsersApi.md#list_users) | **GET** /users | /users


## Documentation For Models

 - [Address](docs/Address.md)
 - [AddressGeofence](docs/AddressGeofence.md)
 - [AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
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

 All endpoints do not require authorization.

## Author




