# Getting started

# Introduction

Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.

The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.

API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.

If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)

# Endpoints

All our APIs can be accessed through HTTP requests to URLs like:

```curl
https://api.samsara.com/<version>/<endpoint>
```

All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.

# Authentication

To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.

Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.

Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.

```curl
https://api.samsara.com/<version>/<endpoint>?access_token={access_token}
```

All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.

# Request Methods

Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.

## GET

GET requests are typically used for fetching data (like data for a particular driver).

## POST

POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).

## PUT

PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).

## PATCH

PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).

## DELETE

DELETE requests are used for deleting a record (like deleting a tag from the system).

# Response Codes

All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.

## 2XX

These are successful responses and indicate that the API request returned the expected response.

## 4XX

These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.

## 5XX

These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.

# Error Responses

In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.

| Status Code | Message | Description |
|-------------|----------------|-------------------------------------------------------------------|
| 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). |
| 404 | Page not found | The API endpoint being accessed is invalid. |
| 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |

# Versioning

All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.

# FAQs

Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

## How to Build

The generated SDK relies on [Node Package Manager](https://www.npmjs.com/) (NPM) being available to resolve dependencies. If you don't already have NPM installed, please go ahead and follow instructions to install NPM from [here](https://nodejs.org/en/download/).
The SDK also requires Node to be installed. If Node isn't already installed, please install it from [here](https://nodejs.org/en/download/)
> NPM is installed by default when Node is installed

To check if node and npm have been successfully installed, write the following commands in command prompt:

* `node --version`
* `npm -version`

![Version Check](https://apidocs.io/illustration/nodejs?step=versionCheck&workspaceFolder=Samsara%20API-Node)

Now use npm to resolve all dependencies by running the following command in the root directory (of the SDK folder):

```bash
npm install
```

![Resolve Dependencies](https://apidocs.io/illustration/nodejs?step=resolveDependency1&workspaceFolder=Samsara%20API-Node)

![Resolve Dependencies](https://apidocs.io/illustration/nodejs?step=resolveDependency2)

This will install all dependencies in the `node_modules` folder.

Once dependencies are resolved, you will need to move the folder `SamsaraAPILib ` in to your `node_modules` folder.

## How to Use

The following section explains how to use the library in a new project.

### 1. Open Project Folder
Open an IDE/Text Editor for JavaScript like Sublime Text. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

Click on `File` and select `Open Folder`.

![Open Folder](https://apidocs.io/illustration/nodejs?step=openFolder)

Select the folder of your SDK and click on `Select Folder` to open it up in Sublime Text. The folder will become visible in the bar on the left.

![Open Project](https://apidocs.io/illustration/nodejs?step=openProject&workspaceFolder=Samsara%20API-Node)

### 2. Creating a Test File

Now right click on the folder name and select the `New File` option to create a new test file. Save it as `index.js` Now import the generated NodeJS library using the following lines of code:

```js
var lib = require('lib');
```

Save changes.

![Create new file](https://apidocs.io/illustration/nodejs?step=createNewFile&workspaceFolder=Samsara%20API-Node)

![Save new file](https://apidocs.io/illustration/nodejs?step=saveNewFile&workspaceFolder=Samsara%20API-Node)

### 3. Running The Test File

To run the `index.js` file, open up the command prompt and navigate to the Path where the SDK folder resides. Type the following command to run the file:

```
node index.js
```

![Run file](https://apidocs.io/illustration/nodejs?step=runProject&workspaceFolder=Samsara%20API-Node)


## How to Test

These tests use Mocha framework for testing, coupled with Chai for assertions. These dependencies need to be installed for tests to run.
Tests can be run in a number of ways:

### Method 1 (Run all tests)

1. Navigate to the root directory of the SDK folder from command prompt.
2. Type `mocha --recursive` to run all the tests.

### Method 2 (Run all tests)

1. Navigate to the `../test/Controllers/` directory from command prompt.
2. Type `mocha *` to run all the tests.

### Method 3 (Run specific controller's tests)

1. Navigate to the `../test/Controllers/` directory from command prompt.
2. Type `mocha  Samsara APIController`  to run all the tests in that controller file.

> To increase mocha's default timeout, you can change the `TEST_TIMEOUT` parameter's value in `TestBootstrap.js`.

![Run Tests](https://apidocs.io/illustration/nodejs?step=runTests&controllerName=Samsara%20APIController)

## Initialization

### Authentication
In order to setup authentication in the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accessToken | API Access Token |



API client can be initialized as following:

```JavaScript
const lib = require('lib');

// Configuration parameters and credentials
lib.Configuration.accessToken = "accessToken"; // API Access Token

```



# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [TagsController](#tags_controller)
* [FleetController](#fleet_controller)
* [UsersController](#users_controller)
* [IndustrialController](#industrial_controller)
* [SensorsController](#sensors_controller)

## <a name="tags_controller"></a>![Class: ](https://apidocs.io/img/class.png ".TagsController") TagsController

### Get singleton instance

The singleton instance of the ``` TagsController ``` class can be accessed from the API Client.

```javascript
var controller = lib.TagsController;
```

### <a name="delete_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.deleteTagById") deleteTagById

> Permanently deletes a tag.


```javascript
function deleteTagById(accessToken, tagId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var tagId = 121;

    controller.deleteTagById(accessToken, tagId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.getTagById") getTagById

> Fetch a tag by id.


```javascript
function getTagById(accessToken, tagId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var tagId = 121;

    controller.getTagById(accessToken, tagId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="modify_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.modifyTagById") modifyTagById

> Add or delete specific members from a tag, or modify the name of a tag.


```javascript
function modifyTagById(accessToken, tagId, tagModifyParams, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| tagModifyParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var tagId = 121;
    var tagModifyParams = new TagModify({"key":"value"});

    controller.modifyTagById(accessToken, tagId, tagModifyParams, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_tag"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.createTag") createTag

> Create a new tag for the group.


```javascript
function createTag(accessToken, tagCreateParams, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagCreateParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var tagCreateParams = new TagCreate({"key":"value"});

    controller.createTag(accessToken, tagCreateParams, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.updateTagById") updateTagById

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


```javascript
function updateTagById(accessToken, tagId, updateTagParams, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| updateTagParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var tagId = 121;
    var updateTagParams = new TagUpdate({"key":"value"});

    controller.updateTagById(accessToken, tagId, updateTagParams, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_tags"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.getAllTags") getAllTags

> Fetch all of the tags for a group.


```javascript
function getAllTags(accessToken, groupId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupId = 121;

    controller.getAllTags(accessToken, groupId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_controller"></a>![Class: ](https://apidocs.io/img/class.png ".FleetController") FleetController

### Get singleton instance

The singleton instance of the ``` FleetController ``` class can be accessed from the API Client.

```javascript
var controller = lib.FleetController;
```

### <a name="get_driver_document_types_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverDocumentTypesByOrgId") getDriverDocumentTypesByOrgId

> Fetch all of the document types.


```javascript
function getDriverDocumentTypesByOrgId(callback)
```

#### Example Usage

```javascript


    controller.getDriverDocumentTypesByOrgId(function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleLocations") getVehicleLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


```javascript
function getVehicleLocations(accessToken, vehicleId, startMs, endMs, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |



#### Example Usage

```javascript

    var accessToken = access_token;
    var vehicleId = 121;
    var startMs = 121;
    var endMs = 121;

    controller.getVehicleLocations(accessToken, vehicleId, startMs, endMs, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_vehicle_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createVehicleDispatchRoute") createVehicleDispatchRoute

> Create a new dispatch route for the vehicle with vehicle_id.


```javascript
function createVehicleDispatchRoute(createDispatchRouteParams, accessToken, vehicleId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |



#### Example Usage

```javascript

    var createDispatchRouteParams = new DispatchRouteCreate({"key":"value"});
    var accessToken = access_token;
    var vehicleId = 121;

    controller.createVehicleDispatchRoute(createDispatchRouteParams, accessToken, vehicleId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_routes_by_vehicle_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRoutesByVehicleId") getDispatchRoutesByVehicleId

> Fetch all of the dispatch routes for a given vehicle.


```javascript
function getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var vehicleId = 121;
    var endTime = 121;
    var duration = 121;

    controller.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="patch_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.patchFleetVehicle") patchFleetVehicle

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


```javascript
function patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var vehicleIdOrExternalId = vehicle_id_or_external_id;
    var data = new Data({"key":"value"});

    controller.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleSafetyScore") getVehicleSafetyScore

> Fetch the safety score for the vehicle.


```javascript
function getVehicleSafetyScore(accessToken, startMs, endMs, vehicleId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| vehicleId |  ``` Required ```  | ID of the vehicle |



#### Example Usage

```javascript

    var accessToken = access_token;
    var startMs = 121;
    var endMs = 121;
    var vehicleId = 121;

    controller.getVehicleSafetyScore(accessToken, startMs, endMs, vehicleId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_harsh_event"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleHarshEvent") getVehicleHarshEvent

> Fetch harsh event details for a vehicle.


```javascript
function getVehicleHarshEvent(accessToken, timestamp, vehicleId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicleId |  ``` Required ```  | ID of the vehicle |



#### Example Usage

```javascript

    var accessToken = access_token;
    var timestamp = 121;
    var vehicleId = 121;

    controller.getVehicleHarshEvent(accessToken, timestamp, vehicleId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicles_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehiclesLocations") getVehiclesLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


```javascript
function getVehiclesLocations(accessToken, startMs, endMs, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |



#### Example Usage

```javascript

    var accessToken = access_token;
    var startMs = 121;
    var endMs = 121;

    controller.getVehiclesLocations(accessToken, startMs, endMs, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dvirs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDvirs") getDvirs

> Get DVIRs for the org within provided time constraints


```javascript
function getDvirs(accessToken, endMs, durationMs, groupId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Required ```  | time in millis until the last dvir log. |
| durationMs |  ``` Required ```  | time in millis which corresponds to the duration before the end_ms. |
| groupId |  ``` Optional ```  | Group ID to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var endMs = 121;
    var durationMs = 121;
    var groupId = 121;

    controller.getDvirs(accessToken, endMs, durationMs, groupId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getFleetVehicle") getFleetVehicle

> Gets a specific vehicle.


```javascript
function getFleetVehicle(accessToken, vehicleIdOrExternalId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var vehicleIdOrExternalId = vehicle_id_or_external_id;

    controller.getFleetVehicle(accessToken, vehicleIdOrExternalId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_list_fleet"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createListFleet") createListFleet

> Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.


```javascript
function createListFleet(accessToken, groupParam, startingAfter, endingBefore, limit, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |
| startingAfter |  ``` Optional ```  | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. |
| endingBefore |  ``` Optional ```  | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. |
| limit |  ``` Optional ```  | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupParam = new GroupParam({"key":"value"});
    var startingAfter = 'startingAfter';
    var endingBefore = 'endingBefore';
    var limit = 121;

    controller.createListFleet(accessToken, groupParam, startingAfter, endingBefore, limit, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers_hos_daily_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDriversHosDailyLogs") createGetFleetDriversHosDailyLogs

> Get summarized daily HOS charts for a specified driver.


```javascript
function createGetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with HOS logs. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var driverId = 121;
    var hosLogsParam = new HosLogsParam({"key":"value"});

    controller.createGetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver_document"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriverDocument") createDriverDocument

> Create a driver document for the given driver.


```javascript
function createDriverDocument(createDocumentParams, accessToken, driverId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDocumentParams |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver for whom the document is created. |



#### Example Usage

```javascript

    var createDocumentParams = new DocumentCreate({"key":"value"});
    var accessToken = access_token;
    var driverId = 121;

    controller.createDriverDocument(createDocumentParams, accessToken, driverId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriverDispatchRoute") createDriverDispatchRoute

> Create a new dispatch route for the driver with driver_id.


```javascript
function createDriverDispatchRoute(createDispatchRouteParams, accessToken, driverId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |



#### Example Usage

```javascript

    var createDispatchRouteParams = new DispatchRouteCreate({"key":"value"});
    var accessToken = access_token;
    var driverId = 121;

    controller.createDriverDispatchRoute(createDispatchRouteParams, accessToken, driverId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_trips"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetTrips") createGetFleetTrips

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


```javascript
function createGetFleetTrips(accessToken, tripsParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tripsParam |  ``` Required ```  | Group ID, vehicle ID and time range to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var tripsParam = new TripsParam({"key":"value"});

    controller.createGetFleetTrips(accessToken, tripsParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_vehicles"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateVehicles") updateVehicles

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.


```javascript
function updateVehicles(accessToken, vehicleUpdateParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleUpdateParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var vehicleUpdateParam = new VehicleUpdateParam({"key":"value"});

    controller.updateVehicles(accessToken, vehicleUpdateParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_maintenance_list"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetMaintenanceList") createGetFleetMaintenanceList

> Get list of the vehicles with any engine faults or check light data.


```javascript
function createGetFleetMaintenanceList(accessToken, groupParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupParam = new GroupParam({"key":"value"});

    controller.createGetFleetMaintenanceList(accessToken, groupParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_routes_by_driver_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRoutesByDriverId") getDispatchRoutesByDriverId

> Fetch all of the dispatch routes for a given driver.


```javascript
function getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var driverId = 121;
    var endTime = 121;
    var duration = 121;

    controller.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_dvir"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDvir") createDvir

> Create a new dvir, marking a vehicle or trailer safe or unsafe.


```javascript
function createDvir(accessToken, createDvirParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDvirParam |  ``` Required ```  | DVIR creation body |



#### Example Usage

```javascript

    var accessToken = access_token;
    var createDvirParam = new CreateDvirParam({"key":"value"});

    controller.createDvir(accessToken, createDvirParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverSafetyScore") getDriverSafetyScore

> Fetch the safety score for the driver.


```javascript
function getDriverSafetyScore(accessToken, startMs, endMs, driverId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| driverId |  ``` Required ```  | ID of the driver |



#### Example Usage

```javascript

    var accessToken = access_token;
    var startMs = 121;
    var endMs = 121;
    var driverId = 121;

    controller.getDriverSafetyScore(accessToken, startMs, endMs, driverId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetLocations") createGetFleetLocations

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


```javascript
function createGetFleetLocations(accessToken, groupParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupParam = new GroupParam({"key":"value"});

    controller.createGetFleetLocations(accessToken, groupParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_logs_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosLogsSummary") createGetFleetHosLogsSummary

> Get the current HOS status for all drivers in the group.


```javascript
function createGetFleetHosLogsSummary(accessToken, hosLogsParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var hosLogsParam = new HosLogsParam2({"key":"value"});

    controller.createGetFleetHosLogsSummary(accessToken, hosLogsParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosLogs") createGetFleetHosLogs

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


```javascript
function createGetFleetHosLogs(accessToken, hosLogsParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var hosLogsParam = new HosLogsParam({"key":"value"});

    controller.createGetFleetHosLogs(accessToken, hosLogsParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_authentication_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosAuthenticationLogs") createGetFleetHosAuthenticationLogs

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


```javascript
function createGetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosAuthenticationLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var hosAuthenticationLogsParam = new HosAuthenticationLogsParam({"key":"value"});

    controller.createGetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDriversSummary") createGetFleetDriversSummary

> Get the distance and time each driver in an organization has driven in a given time period.


```javascript
function createGetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driversSummaryParam |  ``` Required ```  | Org ID and time range to query. |
| snapToDayBounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var driversSummaryParam = new DriversSummaryParam({"key":"value"});
    var snapToDayBounds = false;

    controller.createGetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_stats"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleStats") getVehicleStats

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


```javascript
function getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query. |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query. |
| series |  ``` Optional ```  | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 |
| tagIds |  ``` Optional ```  | Comma-separated list of tag ids. Example: tagIds=1,2,3 |
| startingAfter |  ``` Optional ```  | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. |
| endingBefore |  ``` Optional ```  | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. |
| limit |  ``` Optional ```  | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var startMs = 121;
    var endMs = 121;
    var series = Object.keys(series)[0];
    var tagIds = 'tagIds';
    var startingAfter = 'startingAfter';
    var endingBefore = 'endingBefore';
    var limit = 121;

    controller.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_reactivate_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateReactivateDriverById") updateReactivateDriverById

> Reactivate the inactive driver having id.


```javascript
function updateReactivateDriverById(reactivateDriverParam, accessToken, driverIdOrExternalId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivateDriverParam |  ``` Required ```  | Driver reactivation body |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript

    var reactivateDriverParam = new ReactivateDriverParam({"key":"value"});
    var accessToken = access_token;
    var driverIdOrExternalId = driver_id_or_external_id;

    controller.updateReactivateDriverById(reactivateDriverParam, accessToken, driverIdOrExternalId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_documents_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverDocumentsByOrgId") getDriverDocumentsByOrgId

> Fetch all of the documents.


```javascript
function getDriverDocumentsByOrgId(accessToken, endMs, durationMs, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| durationMs |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var endMs = 121;
    var durationMs = 121;

    controller.getDriverDocumentsByOrgId(accessToken, endMs, durationMs, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_deactivate_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteDeactivateDriver") deleteDeactivateDriver

> Deactivate a driver with the given id.


```javascript
function deleteDeactivateDriver(accessToken, driverIdOrExternalId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var driverIdOrExternalId = driver_id_or_external_id;

    controller.deleteDeactivateDriver(accessToken, driverIdOrExternalId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_route_history"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRouteHistory") getDispatchRouteHistory

> Fetch the history of a dispatch route.


```javascript
function getDispatchRouteHistory(accessToken, routeId, startTime, endTime, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the route with history. |
| startTime |  ``` Optional ```  | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. |
| endTime |  ``` Optional ```  | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var routeId = 121;
    var startTime = 121;
    var endTime = 121;

    controller.getDispatchRouteHistory(accessToken, routeId, startTime, endTime, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateDispatchRouteById") updateDispatchRouteById

> Update a dispatch route and its associated jobs.


```javascript
function updateDispatchRouteById(updateDispatchRouteParams, accessToken, routeId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```javascript

    var updateDispatchRouteParams = new DispatchRoute({"key":"value"});
    var accessToken = access_token;
    var routeId = 121;

    controller.updateDispatchRouteById(updateDispatchRouteParams, accessToken, routeId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="fetch_all_route_job_updates"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetchAllRouteJobUpdates") fetchAllRouteJobUpdates

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


```javascript
function fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| sequenceId |  ``` Optional ```  | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. |
| include |  ``` Optional ```  | Optionally set include=route to include route object in response payload. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupId = 121;
    var sequenceId = sequence_id;
    var include = 'include';

    controller.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="fetch_all_dispatch_routes"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetchAllDispatchRoutes") fetchAllDispatchRoutes

> Fetch all of the dispatch routes for the group.


```javascript
function fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupId = 121;
    var endTime = 121;
    var duration = 121;

    controller.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_asset_reefer"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAssetReefer") getAssetReefer

> Fetch the reefer-specific stats of an asset.


```javascript
function getAssetReefer(accessToken, assetId, startMs, endMs, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var assetId = 121;
    var startMs = 121;
    var endMs = 121;

    controller.getAssetReefer(accessToken, assetId, startMs, endMs, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_asset_location"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAssetLocation") getAssetLocation

> Fetch the historical locations for the asset.


```javascript
function getAssetLocation(accessToken, assetId, startMs, endMs, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var assetId = 121;
    var startMs = 121;
    var endMs = 121;

    controller.getAssetLocation(accessToken, assetId, startMs, endMs, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverById") getDriverById

> Fetch driver by id.


```javascript
function getDriverById(accessToken, driverIdOrExternalId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var driverIdOrExternalId = driver_id_or_external_id;

    controller.getDriverById(accessToken, driverIdOrExternalId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_deactivated_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDeactivatedDriverById") getDeactivatedDriverById

> Fetch deactivated driver by id.


```javascript
function getDeactivatedDriverById(accessToken, driverIdOrExternalId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var driverIdOrExternalId = driver_id_or_external_id;

    controller.getDeactivatedDriverById(accessToken, driverIdOrExternalId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_deactivated_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllDeactivatedDrivers") getAllDeactivatedDrivers

> Fetch all deactivated drivers for the group.


```javascript
function getAllDeactivatedDrivers(accessToken, groupId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupId = 121;

    controller.getAllDeactivatedDrivers(accessToken, groupId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriver") createDriver

> Create a new driver.


```javascript
function createDriver(accessToken, createDriverParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDriverParam |  ``` Required ```  | Driver creation body |



#### Example Usage

```javascript

    var accessToken = access_token;
    var createDriverParam = new DriverForCreate({"key":"value"});

    controller.createDriver(accessToken, createDriverParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDrivers") createGetFleetDrivers

> Get all the drivers for the specified group.


```javascript
function createGetFleetDrivers(accessToken, groupDriversParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupDriversParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupDriversParam = new GroupDriversParam({"key":"value"});

    controller.createGetFleetDrivers(accessToken, groupDriversParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteDispatchRouteById") deleteDispatchRouteById

> Delete a dispatch route and its associated jobs.


```javascript
function deleteDispatchRouteById(accessToken, routeId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var routeId = 121;

    controller.deleteDispatchRouteById(accessToken, routeId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRouteById") getDispatchRouteById

> Fetch a dispatch route by id.


```javascript
function getDispatchRouteById(accessToken, routeId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var routeId = 121;

    controller.getDispatchRouteById(accessToken, routeId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDispatchRoute") createDispatchRoute

> Create a new dispatch route.


```javascript
function createDispatchRoute(accessToken, createDispatchRouteParams, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var createDispatchRouteParams = new DispatchRouteCreate({"key":"value"});

    controller.createDispatchRoute(accessToken, createDispatchRouteParams, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_asset_current_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllAssetCurrentLocations") getAllAssetCurrentLocations

> Fetch current locations of all assets for the group.


```javascript
function getAllAssetCurrentLocations(accessToken, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript

    var accessToken = access_token;

    controller.getAllAssetCurrentLocations(accessToken, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_assets"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllAssets") getAllAssets

> Fetch all of the assets for the group.


```javascript
function getAllAssets(accessToken, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript

    var accessToken = access_token;

    controller.getAllAssets(accessToken, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="add_fleet_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.addFleetAddress") addFleetAddress

> This method adds an address book entry to the specified group.


```javascript
function addFleetAddress(accessToken, addressParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript

    var accessToken = access_token;
    var addressParam = new AddressParam({"key":"value"});

    controller.addFleetAddress(accessToken, addressParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_contact"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationContact") getOrganizationContact

> Fetch a contact by its id.


```javascript
function getOrganizationContact(accessToken, contactId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| contactId |  ``` Required ```  | ID of the contact |



#### Example Usage

```javascript

    var accessToken = access_token;
    var contactId = 121;

    controller.getOrganizationContact(accessToken, contactId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_contacts"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.listContacts") listContacts

> Fetch all contacts for the organization.


```javascript
function listContacts(accessToken, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript

    var accessToken = access_token;

    controller.listContacts(accessToken, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteOrganizationAddress") deleteOrganizationAddress

> Delete an address.


```javascript
function deleteOrganizationAddress(accessToken, addressId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```javascript

    var accessToken = access_token;
    var addressId = 121;

    controller.deleteOrganizationAddress(accessToken, addressId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationAddress") getOrganizationAddress

> Fetch an address by its id.


```javascript
function getOrganizationAddress(accessToken, addressId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```javascript

    var accessToken = access_token;
    var addressId = 121;

    controller.getOrganizationAddress(accessToken, addressId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateOrganizationAddress") updateOrganizationAddress

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


```javascript
function updateOrganizationAddress(accessToken, address, addressId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```javascript

    var accessToken = access_token;
    var address = new Address1({"key":"value"});
    var addressId = 121;

    controller.updateOrganizationAddress(accessToken, address, addressId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationAddresses") getOrganizationAddresses

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


```javascript
function getOrganizationAddresses(accessToken, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript

    var accessToken = access_token;

    controller.getOrganizationAddresses(accessToken, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="add_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.addOrganizationAddresses") addOrganizationAddresses

> Add one or more addresses to the organization


```javascript
function addOrganizationAddresses(accessToken, addresses, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var addresses = new Addresses({"key":"value"});

    controller.addOrganizationAddresses(accessToken, addresses, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png ".UsersController") UsersController

### Get singleton instance

The singleton instance of the ``` UsersController ``` class can be accessed from the API Client.

```javascript
var controller = lib.UsersController;
```

### <a name="delete_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.deleteUserById") deleteUserById

> Remove a user from the organization.


```javascript
function deleteUserById(accessToken, userId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var userId = 121;

    controller.deleteUserById(accessToken, userId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.getUserById") getUserById

> Get a user.


```javascript
function getUserById(accessToken, userId, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var userId = 121;

    controller.getUserById(accessToken, userId, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_users"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.listUsers") listUsers

> List all users in the organization.


```javascript
function listUsers(accessToken, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript

    var accessToken = access_token;

    controller.listUsers(accessToken, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_user_roles"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.listUserRoles") listUserRoles

> Get all roles in the organization.


```javascript
function listUserRoles(accessToken, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript

    var accessToken = access_token;

    controller.listUserRoles(accessToken, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_controller"></a>![Class: ](https://apidocs.io/img/class.png ".IndustrialController") IndustrialController

### Get singleton instance

The singleton instance of the ``` IndustrialController ``` class can be accessed from the API Client.

```javascript
var controller = lib.IndustrialController;
```

### <a name="get_data_input"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.getDataInput") getDataInput

> Fetch datapoints from a given data input.


```javascript
function getDataInput(accessToken, dataInputId, startMs, endMs, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| dataInputId |  ``` Required ```  | ID of the data input |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var dataInputId = 121;
    var startMs = 121;
    var endMs = 121;

    controller.getDataInput(accessToken, dataInputId, startMs, endMs, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_data_inputs"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.getAllDataInputs") getAllDataInputs

> Fetch all of the data inputs for a group.


```javascript
function getAllDataInputs(accessToken, groupId, startMs, endMs, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupId = 121;
    var startMs = 121;
    var endMs = 121;

    controller.getAllDataInputs(accessToken, groupId, startMs, endMs, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_machines"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.createGetMachines") createGetMachines

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


```javascript
function createGetMachines(accessToken, groupParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupParam = new GroupParam({"key":"value"});

    controller.createGetMachines(accessToken, groupParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_machines_history"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.createGetMachinesHistory") createGetMachinesHistory

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group


```javascript
function createGetMachinesHistory(accessToken, historyParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID and time range to query for events |



#### Example Usage

```javascript

    var accessToken = access_token;
    var historyParam = new HistoryParam({"key":"value"});

    controller.createGetMachinesHistory(accessToken, historyParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_controller"></a>![Class: ](https://apidocs.io/img/class.png ".SensorsController") SensorsController

### Get singleton instance

The singleton instance of the ``` SensorsController ``` class can be accessed from the API Client.

```javascript
var controller = lib.SensorsController;
```

### <a name="create_get_sensors_temperature"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsTemperature") createGetSensorsTemperature

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


```javascript
function createGetSensorsTemperature(accessToken, sensorParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var sensorParam = new SensorParam({"key":"value"});

    controller.createGetSensorsTemperature(accessToken, sensorParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensors") createGetSensors

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


```javascript
function createGetSensors(accessToken, groupParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var groupParam = new GroupParam({"key":"value"});

    controller.createGetSensors(accessToken, groupParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_humidity"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsHumidity") createGetSensorsHumidity

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


```javascript
function createGetSensorsHumidity(accessToken, sensorParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var sensorParam = new SensorParam({"key":"value"});

    controller.createGetSensorsHumidity(accessToken, sensorParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_history"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsHistory") createGetSensorsHistory

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


```javascript
function createGetSensorsHistory(accessToken, historyParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var historyParam = new HistoryParam1({"key":"value"});

    controller.createGetSensorsHistory(accessToken, historyParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_door"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsDoor") createGetSensorsDoor

> Get door monitor status (closed / open) for requested sensors.


```javascript
function createGetSensorsDoor(accessToken, sensorParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var sensorParam = new SensorParam({"key":"value"});

    controller.createGetSensorsDoor(accessToken, sensorParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_cargo"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsCargo") createGetSensorsCargo

> Get cargo monitor status (empty / full) for requested sensors.


```javascript
function createGetSensorsCargo(accessToken, sensorParam, callback)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript

    var accessToken = access_token;
    var sensorParam = new SensorParam({"key":"value"});

    controller.createGetSensorsCargo(accessToken, sensorParam, function(error, response, context) {

    
    });
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)



