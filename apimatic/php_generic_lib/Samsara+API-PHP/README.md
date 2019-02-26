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

The generated code has dependencies over external libraries like UniRest. These dependencies are defined in the ```composer.json``` file that comes with the SDK. 
To resolve these dependencies, we use the Composer package manager which requires PHP greater than 5.3.2 installed in your system. 
Visit [https://getcomposer.org/download/](https://getcomposer.org/download/) to download the installer file for Composer and run it in your system. 
Open command prompt and type ```composer --version```. This should display the current version of the Composer installed if the installation was successful.

* Using command line, navigate to the directory containing the generated files (including ```composer.json```) for the SDK. 
* Run the command ```composer install```. This should install all the required dependencies and create the ```vendor``` directory in your project directory.

![Building SDK - Step 1](https://apidocs.io/illustration/php?step=installDependencies&workspaceFolder=Samsara%20API-PHP)

### [For Windows Users Only] Configuring CURL Certificate Path in php.ini

CURL used to include a list of accepted CAs, but no longer bundles ANY CA certs. So by default it will reject all SSL certificates as unverifiable. You will have to get your CA's cert and point curl at it. The steps are as follows:

1. Download the certificate bundle (.pem file) from [https://curl.haxx.se/docs/caextract.html](https://curl.haxx.se/docs/caextract.html) on to your system.
2. Add curl.cainfo = "PATH_TO/cacert.pem" to your php.ini file located in your php installation. “PATH_TO” must be an absolute path containing the .pem file.

```ini
[curl]
; A default value for the CURLOPT_CAINFO option. This is required to be an
; absolute path.
;curl.cainfo =
```

## How to Use

The following section explains how to use the SamsaraAPI library in a new project.

### 1. Open Project in an IDE

Open an IDE for PHP like PhpStorm. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

![Open project in PHPStorm - Step 1](https://apidocs.io/illustration/php?step=openIDE&workspaceFolder=Samsara%20API-PHP)

Click on ```Open``` in PhpStorm to browse to your generated SDK directory and then click ```OK```.

![Open project in PHPStorm - Step 2](https://apidocs.io/illustration/php?step=openProject0&workspaceFolder=Samsara%20API-PHP)     

### 2. Add a new Test Project

Create a new directory by right clicking on the solution name as shown below:

![Add a new project in PHPStorm - Step 1](https://apidocs.io/illustration/php?step=createDirectory&workspaceFolder=Samsara%20API-PHP)

Name the directory as "test"

![Add a new project in PHPStorm - Step 2](https://apidocs.io/illustration/php?step=nameDirectory&workspaceFolder=Samsara%20API-PHP)
   
Add a PHP file to this project

![Add a new project in PHPStorm - Step 3](https://apidocs.io/illustration/php?step=createFile&workspaceFolder=Samsara%20API-PHP)

Name it "testSDK"

![Add a new project in PHPStorm - Step 4](https://apidocs.io/illustration/php?step=nameFile&workspaceFolder=Samsara%20API-PHP)

Depending on your project setup, you might need to include composer's autoloader in your PHP code to enable auto loading of classes.

```PHP
require_once "../vendor/autoload.php";
```

It is important that the path inside require_once correctly points to the file ```autoload.php``` inside the vendor directory created during dependency installations.

![Add a new project in PHPStorm - Step 4](https://apidocs.io/illustration/php?step=projectFiles&workspaceFolder=Samsara%20API-PHP)

After this you can add code to initialize the client library and acquire the instance of a Controller class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

### 3. Run the Test Project

To run your project you must set the Interpreter for your project. Interpreter is the PHP engine installed on your computer.

Open ```Settings``` from ```File``` menu.

![Run Test Project - Step 1](https://apidocs.io/illustration/php?step=openSettings&workspaceFolder=Samsara%20API-PHP)

Select ```PHP``` from within ```Languages & Frameworks```

![Run Test Project - Step 2](https://apidocs.io/illustration/php?step=setInterpreter0&workspaceFolder=Samsara%20API-PHP)

Browse for Interpreters near the ```Interpreter``` option and choose your interpreter.

![Run Test Project - Step 3](https://apidocs.io/illustration/php?step=setInterpreter1&workspaceFolder=Samsara%20API-PHP)

Once the interpreter is selected, click ```OK```

![Run Test Project - Step 4](https://apidocs.io/illustration/php?step=setInterpreter2&workspaceFolder=Samsara%20API-PHP)

To run your project, right click on your PHP file inside your Test project and click on ```Run```

![Run Test Project - Step 5](https://apidocs.io/illustration/php?step=runProject&workspaceFolder=Samsara%20API-PHP)

## How to Test

Unit tests in this SDK can be run using PHPUnit. 

1. First install the dependencies using composer including the `require-dev` dependencies.
2. Run `vendor\bin\phpunit --verbose` from commandline to execute tests. If you have 
   installed PHPUnit globally, run tests using `phpunit --verbose` instead.

You can change the PHPUnit test configuration in the `phpunit.xml` file.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accessToken | API Access Token |



API client can be initialized as following.

```php
$accessToken = 'accessToken'; // API Access Token

$client = new SamsaraAPILib\SamsaraAPIClient($accessToken);
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

```php
$tags = $client->getTags();
```

### <a name="delete_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.deleteTagById") deleteTagById

> Permanently deletes a tag.


```php
function deleteTagById(
        $accessToken,
        $tagId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```php
$accessToken = 'access_token';
$tagId = 27;

$tags->deleteTagById($accessToken, $tagId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.getTagById") getTagById

> Fetch a tag by id.


```php
function getTagById(
        $accessToken,
        $tagId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```php
$accessToken = 'access_token';
$tagId = 27;

$result = $tags->getTagById($accessToken, $tagId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="modify_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.modifyTagById") modifyTagById

> Add or delete specific members from a tag, or modify the name of a tag.


```php
function modifyTagById(
        $accessToken,
        $tagId,
        $tagModifyParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| tagModifyParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$tagId = 27;
$tagModifyParams = new TagModify();

$result = $tags->modifyTagById($accessToken, $tagId, $tagModifyParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_tag"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.createTag") createTag

> Create a new tag for the group.


```php
function createTag(
        $accessToken,
        $tagCreateParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagCreateParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$tagCreateParams = new TagCreate();

$result = $tags->createTag($accessToken, $tagCreateParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.updateTagById") updateTagById

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


```php
function updateTagById(
        $accessToken,
        $tagId,
        $updateTagParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| updateTagParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$tagId = 27;
$updateTagParams = new TagUpdate();

$result = $tags->updateTagById($accessToken, $tagId, $updateTagParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_tags"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.getAllTags") getAllTags

> Fetch all of the tags for a group.


```php
function getAllTags(
        $accessToken,
        $groupId = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```php
$accessToken = 'access_token';
$groupId = 27;

$result = $tags->getAllTags($accessToken, $groupId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_controller"></a>![Class: ](https://apidocs.io/img/class.png ".FleetController") FleetController

### Get singleton instance

The singleton instance of the ``` FleetController ``` class can be accessed from the API Client.

```php
$fleet = $client->getFleet();
```

### <a name="get_driver_document_types_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverDocumentTypesByOrgId") getDriverDocumentTypesByOrgId

> Fetch all of the document types.


```php
function getDriverDocumentTypesByOrgId()
```

#### Example Usage

```php

$result = $fleet->getDriverDocumentTypesByOrgId();

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleLocations") getVehicleLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


```php
function getVehicleLocations(
        $accessToken,
        $vehicleId,
        $startMs,
        $endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |



#### Example Usage

```php
$accessToken = 'access_token';
$vehicleId = 27;
$startMs = 27;
$endMs = 27;

$result = $fleet->getVehicleLocations($accessToken, $vehicleId, $startMs, $endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_vehicle_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createVehicleDispatchRoute") createVehicleDispatchRoute

> Create a new dispatch route for the vehicle with vehicle_id.


```php
function createVehicleDispatchRoute(
        $createDispatchRouteParams,
        $accessToken,
        $vehicleId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |



#### Example Usage

```php
$createDispatchRouteParams = new DispatchRouteCreate();
$accessToken = 'access_token';
$vehicleId = 27;

$result = $fleet->createVehicleDispatchRoute($createDispatchRouteParams, $accessToken, $vehicleId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_vehicle_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRoutesByVehicleId") getDispatchRoutesByVehicleId

> Fetch all of the dispatch routes for a given vehicle.


```php
function getDispatchRoutesByVehicleId(
        $accessToken,
        $vehicleId,
        $endTime = null,
        $duration = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```php
$accessToken = 'access_token';
$vehicleId = 27;
$endTime = 27;
$duration = 27;

$result = $fleet->getDispatchRoutesByVehicleId($accessToken, $vehicleId, $endTime, $duration);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="patch_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.patchFleetVehicle") patchFleetVehicle

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


```php
function patchFleetVehicle(
        $accessToken,
        $vehicleIdOrExternalId,
        $data)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$vehicleIdOrExternalId = 'vehicle_id_or_external_id';
$data = new Data();

$result = $fleet->patchFleetVehicle($accessToken, $vehicleIdOrExternalId, $data);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleSafetyScore") getVehicleSafetyScore

> Fetch the safety score for the vehicle.


```php
function getVehicleSafetyScore(
        $accessToken,
        $startMs,
        $endMs,
        $vehicleId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| vehicleId |  ``` Required ```  | ID of the vehicle |



#### Example Usage

```php
$accessToken = 'access_token';
$startMs = 27;
$endMs = 27;
$vehicleId = 27;

$result = $fleet->getVehicleSafetyScore($accessToken, $startMs, $endMs, $vehicleId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_harsh_event"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleHarshEvent") getVehicleHarshEvent

> Fetch harsh event details for a vehicle.


```php
function getVehicleHarshEvent(
        $accessToken,
        $timestamp,
        $vehicleId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicleId |  ``` Required ```  | ID of the vehicle |



#### Example Usage

```php
$accessToken = 'access_token';
$timestamp = 27;
$vehicleId = 27;

$result = $fleet->getVehicleHarshEvent($accessToken, $timestamp, $vehicleId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicles_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehiclesLocations") getVehiclesLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


```php
function getVehiclesLocations(
        $accessToken,
        $startMs,
        $endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |



#### Example Usage

```php
$accessToken = 'access_token';
$startMs = 27;
$endMs = 27;

$result = $fleet->getVehiclesLocations($accessToken, $startMs, $endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dvirs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDvirs") getDvirs

> Get DVIRs for the org within provided time constraints


```php
function getDvirs(
        $accessToken,
        $endMs,
        $durationMs,
        $groupId = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Required ```  | time in millis until the last dvir log. |
| durationMs |  ``` Required ```  | time in millis which corresponds to the duration before the end_ms. |
| groupId |  ``` Optional ```  | Group ID to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$endMs = 27;
$durationMs = 27;
$groupId = 27;

$result = $fleet->getDvirs($accessToken, $endMs, $durationMs, $groupId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getFleetVehicle") getFleetVehicle

> Gets a specific vehicle.


```php
function getFleetVehicle(
        $accessToken,
        $vehicleIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |



#### Example Usage

```php
$accessToken = 'access_token';
$vehicleIdOrExternalId = 'vehicle_id_or_external_id';

$result = $fleet->getFleetVehicle($accessToken, $vehicleIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_list_fleet"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createListFleet") createListFleet

> Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.


```php
function createListFleet(
        $accessToken,
        $groupParam,
        $startingAfter = null,
        $endingBefore = null,
        $limit = null)
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

```php
$accessToken = 'access_token';
$groupParam = new GroupParam();
$startingAfter = 'startingAfter';
$endingBefore = 'endingBefore';
$limit = 118;

$result = $fleet->createListFleet($accessToken, $groupParam, $startingAfter, $endingBefore, $limit);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_hos_daily_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDriversHosDailyLogs") createGetFleetDriversHosDailyLogs

> Get summarized daily HOS charts for a specified driver.


```php
function createGetFleetDriversHosDailyLogs(
        $accessToken,
        $driverId,
        $hosLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with HOS logs. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$driverId = 118;
$hosLogsParam = new HosLogsParam();

$result = $fleet->createGetFleetDriversHosDailyLogs($accessToken, $driverId, $hosLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_document"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriverDocument") createDriverDocument

> Create a driver document for the given driver.


```php
function createDriverDocument(
        $createDocumentParams,
        $accessToken,
        $driverId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDocumentParams |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver for whom the document is created. |



#### Example Usage

```php
$createDocumentParams = new DocumentCreate();
$accessToken = 'access_token';
$driverId = 118;

$result = $fleet->createDriverDocument($createDocumentParams, $accessToken, $driverId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriverDispatchRoute") createDriverDispatchRoute

> Create a new dispatch route for the driver with driver_id.


```php
function createDriverDispatchRoute(
        $createDispatchRouteParams,
        $accessToken,
        $driverId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |



#### Example Usage

```php
$createDispatchRouteParams = new DispatchRouteCreate();
$accessToken = 'access_token';
$driverId = 118;

$result = $fleet->createDriverDispatchRoute($createDispatchRouteParams, $accessToken, $driverId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_trips"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetTrips") createGetFleetTrips

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


```php
function createGetFleetTrips(
        $accessToken,
        $tripsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tripsParam |  ``` Required ```  | Group ID, vehicle ID and time range to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$tripsParam = new TripsParam();

$result = $fleet->createGetFleetTrips($accessToken, $tripsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_vehicles"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateVehicles") updateVehicles

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.


```php
function updateVehicles(
        $accessToken,
        $vehicleUpdateParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleUpdateParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$vehicleUpdateParam = new VehicleUpdateParam();

$fleet->updateVehicles($accessToken, $vehicleUpdateParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_maintenance_list"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetMaintenanceList") createGetFleetMaintenanceList

> Get list of the vehicles with any engine faults or check light data.


```php
function createGetFleetMaintenanceList(
        $accessToken,
        $groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$groupParam = new GroupParam();

$result = $fleet->createGetFleetMaintenanceList($accessToken, $groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_driver_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRoutesByDriverId") getDispatchRoutesByDriverId

> Fetch all of the dispatch routes for a given driver.


```php
function getDispatchRoutesByDriverId(
        $accessToken,
        $driverId,
        $endTime = null,
        $duration = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```php
$accessToken = 'access_token';
$driverId = 118;
$endTime = 118;
$duration = 118;

$result = $fleet->getDispatchRoutesByDriverId($accessToken, $driverId, $endTime, $duration);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dvir"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDvir") createDvir

> Create a new dvir, marking a vehicle or trailer safe or unsafe.


```php
function createDvir(
        $accessToken,
        $createDvirParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDvirParam |  ``` Required ```  | DVIR creation body |



#### Example Usage

```php
$accessToken = 'access_token';
$createDvirParam = new CreateDvirParam();

$result = $fleet->createDvir($accessToken, $createDvirParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverSafetyScore") getDriverSafetyScore

> Fetch the safety score for the driver.


```php
function getDriverSafetyScore(
        $accessToken,
        $startMs,
        $endMs,
        $driverId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| driverId |  ``` Required ```  | ID of the driver |



#### Example Usage

```php
$accessToken = 'access_token';
$startMs = 118;
$endMs = 118;
$driverId = 118;

$result = $fleet->getDriverSafetyScore($accessToken, $startMs, $endMs, $driverId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetLocations") createGetFleetLocations

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


```php
function createGetFleetLocations(
        $accessToken,
        $groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$groupParam = new GroupParam();

$result = $fleet->createGetFleetLocations($accessToken, $groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosLogsSummary") createGetFleetHosLogsSummary

> Get the current HOS status for all drivers in the group.


```php
function createGetFleetHosLogsSummary(
        $accessToken,
        $hosLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$hosLogsParam = new HosLogsParam2();

$result = $fleet->createGetFleetHosLogsSummary($accessToken, $hosLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosLogs") createGetFleetHosLogs

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


```php
function createGetFleetHosLogs(
        $accessToken,
        $hosLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$hosLogsParam = new HosLogsParam();

$result = $fleet->createGetFleetHosLogs($accessToken, $hosLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_authentication_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosAuthenticationLogs") createGetFleetHosAuthenticationLogs

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


```php
function createGetFleetHosAuthenticationLogs(
        $accessToken,
        $hosAuthenticationLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosAuthenticationLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$hosAuthenticationLogsParam = new HosAuthenticationLogsParam();

$result = $fleet->createGetFleetHosAuthenticationLogs($accessToken, $hosAuthenticationLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDriversSummary") createGetFleetDriversSummary

> Get the distance and time each driver in an organization has driven in a given time period.


```php
function createGetFleetDriversSummary(
        $accessToken,
        $driversSummaryParam,
        $snapToDayBounds = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driversSummaryParam |  ``` Required ```  | Org ID and time range to query. |
| snapToDayBounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |



#### Example Usage

```php
$accessToken = 'access_token';
$driversSummaryParam = new DriversSummaryParam();
$snapToDayBounds = true;

$result = $fleet->createGetFleetDriversSummary($accessToken, $driversSummaryParam, $snapToDayBounds);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_stats"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleStats") getVehicleStats

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


```php
function getVehicleStats(
        $accessToken,
        $startMs,
        $endMs,
        $series = null,
        $tagIds = null,
        $startingAfter = null,
        $endingBefore = null,
        $limit = null)
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

```php
$accessToken = 'access_token';
$startMs = 210;
$endMs = 210;
$series = string::ENGINESTATE;
$tagIds = 'tagIds';
$startingAfter = 'startingAfter';
$endingBefore = 'endingBefore';
$limit = 210;

$result = $fleet->getVehicleStats($accessToken, $startMs, $endMs, $series, $tagIds, $startingAfter, $endingBefore, $limit);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_reactivate_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateReactivateDriverById") updateReactivateDriverById

> Reactivate the inactive driver having id.


```php
function updateReactivateDriverById(
        $reactivateDriverParam,
        $accessToken,
        $driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivateDriverParam |  ``` Required ```  | Driver reactivation body |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```php
$reactivateDriverParam = new ReactivateDriverParam();
$accessToken = 'access_token';
$driverIdOrExternalId = 'driver_id_or_external_id';

$result = $fleet->updateReactivateDriverById($reactivateDriverParam, $accessToken, $driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_documents_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverDocumentsByOrgId") getDriverDocumentsByOrgId

> Fetch all of the documents.


```php
function getDriverDocumentsByOrgId(
        $accessToken,
        $endMs = null,
        $durationMs = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| durationMs |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |



#### Example Usage

```php
$accessToken = 'access_token';
$endMs = 210;
$durationMs = 210;

$result = $fleet->getDriverDocumentsByOrgId($accessToken, $endMs, $durationMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_deactivate_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteDeactivateDriver") deleteDeactivateDriver

> Deactivate a driver with the given id.


```php
function deleteDeactivateDriver(
        $accessToken,
        $driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```php
$accessToken = 'access_token';
$driverIdOrExternalId = 'driver_id_or_external_id';

$fleet->deleteDeactivateDriver($accessToken, $driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_route_history"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRouteHistory") getDispatchRouteHistory

> Fetch the history of a dispatch route.


```php
function getDispatchRouteHistory(
        $accessToken,
        $routeId,
        $startTime = null,
        $endTime = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the route with history. |
| startTime |  ``` Optional ```  | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. |
| endTime |  ``` Optional ```  | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. |



#### Example Usage

```php
$accessToken = 'access_token';
$routeId = 210;
$startTime = 210;
$endTime = 210;

$result = $fleet->getDispatchRouteHistory($accessToken, $routeId, $startTime, $endTime);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateDispatchRouteById") updateDispatchRouteById

> Update a dispatch route and its associated jobs.


```php
function updateDispatchRouteById(
        $updateDispatchRouteParams,
        $accessToken,
        $routeId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```php
$updateDispatchRouteParams = new DispatchRoute();
$accessToken = 'access_token';
$routeId = 210;

$result = $fleet->updateDispatchRouteById($updateDispatchRouteParams, $accessToken, $routeId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="fetch_all_route_job_updates"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetchAllRouteJobUpdates") fetchAllRouteJobUpdates

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


```php
function fetchAllRouteJobUpdates(
        $accessToken,
        $groupId = null,
        $sequenceId = null,
        $minclude = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| sequenceId |  ``` Optional ```  | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. |
| minclude |  ``` Optional ```  | Optionally set include=route to include route object in response payload. |



#### Example Usage

```php
$accessToken = 'access_token';
$groupId = 210;
$sequenceId = 'sequence_id';
$minclude = 'include';

$result = $fleet->fetchAllRouteJobUpdates($accessToken, $groupId, $sequenceId, $minclude);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="fetch_all_dispatch_routes"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetchAllDispatchRoutes") fetchAllDispatchRoutes

> Fetch all of the dispatch routes for the group.


```php
function fetchAllDispatchRoutes(
        $accessToken,
        $groupId = null,
        $endTime = null,
        $duration = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```php
$accessToken = 'access_token';
$groupId = 210;
$endTime = 210;
$duration = 210;

$result = $fleet->fetchAllDispatchRoutes($accessToken, $groupId, $endTime, $duration);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_reefer"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAssetReefer") getAssetReefer

> Fetch the reefer-specific stats of an asset.


```php
function getAssetReefer(
        $accessToken,
        $assetId,
        $startMs,
        $endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |



#### Example Usage

```php
$accessToken = 'access_token';
$assetId = 210;
$startMs = 210;
$endMs = 210;

$result = $fleet->getAssetReefer($accessToken, $assetId, $startMs, $endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_location"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAssetLocation") getAssetLocation

> Fetch the historical locations for the asset.


```php
function getAssetLocation(
        $accessToken,
        $assetId,
        $startMs,
        $endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |



#### Example Usage

```php
$accessToken = 'access_token';
$assetId = 210;
$startMs = 210;
$endMs = 210;

$result = $fleet->getAssetLocation($accessToken, $assetId, $startMs, $endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverById") getDriverById

> Fetch driver by id.


```php
function getDriverById(
        $accessToken,
        $driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```php
$accessToken = 'access_token';
$driverIdOrExternalId = 'driver_id_or_external_id';

$result = $fleet->getDriverById($accessToken, $driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_deactivated_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDeactivatedDriverById") getDeactivatedDriverById

> Fetch deactivated driver by id.


```php
function getDeactivatedDriverById(
        $accessToken,
        $driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```php
$accessToken = 'access_token';
$driverIdOrExternalId = 'driver_id_or_external_id';

$result = $fleet->getDeactivatedDriverById($accessToken, $driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_deactivated_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllDeactivatedDrivers") getAllDeactivatedDrivers

> Fetch all deactivated drivers for the group.


```php
function getAllDeactivatedDrivers(
        $accessToken,
        $groupId = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```php
$accessToken = 'access_token';
$groupId = 210;

$result = $fleet->getAllDeactivatedDrivers($accessToken, $groupId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriver") createDriver

> Create a new driver.


```php
function createDriver(
        $accessToken,
        $createDriverParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDriverParam |  ``` Required ```  | Driver creation body |



#### Example Usage

```php
$accessToken = 'access_token';
$createDriverParam = new DriverForCreate();

$result = $fleet->createDriver($accessToken, $createDriverParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDrivers") createGetFleetDrivers

> Get all the drivers for the specified group.


```php
function createGetFleetDrivers(
        $accessToken,
        $groupDriversParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupDriversParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$groupDriversParam = new GroupDriversParam();

$result = $fleet->createGetFleetDrivers($accessToken, $groupDriversParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteDispatchRouteById") deleteDispatchRouteById

> Delete a dispatch route and its associated jobs.


```php
function deleteDispatchRouteById(
        $accessToken,
        $routeId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```php
$accessToken = 'access_token';
$routeId = 210;

$fleet->deleteDispatchRouteById($accessToken, $routeId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRouteById") getDispatchRouteById

> Fetch a dispatch route by id.


```php
function getDispatchRouteById(
        $accessToken,
        $routeId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```php
$accessToken = 'access_token';
$routeId = 210;

$result = $fleet->getDispatchRouteById($accessToken, $routeId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDispatchRoute") createDispatchRoute

> Create a new dispatch route.


```php
function createDispatchRoute(
        $accessToken,
        $createDispatchRouteParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$createDispatchRouteParams = new DispatchRouteCreate();

$result = $fleet->createDispatchRoute($accessToken, $createDispatchRouteParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_asset_current_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllAssetCurrentLocations") getAllAssetCurrentLocations

> Fetch current locations of all assets for the group.


```php
function getAllAssetCurrentLocations($accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```php
$accessToken = 'access_token';

$result = $fleet->getAllAssetCurrentLocations($accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_assets"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllAssets") getAllAssets

> Fetch all of the assets for the group.


```php
function getAllAssets($accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```php
$accessToken = 'access_token';

$result = $fleet->getAllAssets($accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_fleet_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.addFleetAddress") addFleetAddress

> This method adds an address book entry to the specified group.


```php
function addFleetAddress(
        $accessToken,
        $addressParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```php
$accessToken = 'access_token';
$addressParam = new AddressParam();

$fleet->addFleetAddress($accessToken, $addressParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_contact"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationContact") getOrganizationContact

> Fetch a contact by its id.


```php
function getOrganizationContact(
        $accessToken,
        $contactId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| contactId |  ``` Required ```  | ID of the contact |



#### Example Usage

```php
$accessToken = 'access_token';
$contactId = 168;

$result = $fleet->getOrganizationContact($accessToken, $contactId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_contacts"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.listContacts") listContacts

> Fetch all contacts for the organization.


```php
function listContacts($accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```php
$accessToken = 'access_token';

$result = $fleet->listContacts($accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteOrganizationAddress") deleteOrganizationAddress

> Delete an address.


```php
function deleteOrganizationAddress(
        $accessToken,
        $addressId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```php
$accessToken = 'access_token';
$addressId = 168;

$fleet->deleteOrganizationAddress($accessToken, $addressId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationAddress") getOrganizationAddress

> Fetch an address by its id.


```php
function getOrganizationAddress(
        $accessToken,
        $addressId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```php
$accessToken = 'access_token';
$addressId = 168;

$result = $fleet->getOrganizationAddress($accessToken, $addressId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateOrganizationAddress") updateOrganizationAddress

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


```php
function updateOrganizationAddress(
        $accessToken,
        $address,
        $addressId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```php
$accessToken = 'access_token';
$address = new Address1();
$addressId = 168;

$fleet->updateOrganizationAddress($accessToken, $address, $addressId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationAddresses") getOrganizationAddresses

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


```php
function getOrganizationAddresses($accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```php
$accessToken = 'access_token';

$result = $fleet->getOrganizationAddresses($accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.addOrganizationAddresses") addOrganizationAddresses

> Add one or more addresses to the organization


```php
function addOrganizationAddresses(
        $accessToken,
        $addresses)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |



#### Example Usage

```php
$accessToken = 'access_token';
$addresses = new Addresses();

$result = $fleet->addOrganizationAddresses($accessToken, $addresses);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png ".UsersController") UsersController

### Get singleton instance

The singleton instance of the ``` UsersController ``` class can be accessed from the API Client.

```php
$users = $client->getUsers();
```

### <a name="delete_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.deleteUserById") deleteUserById

> Remove a user from the organization.


```php
function deleteUserById(
        $accessToken,
        $userId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```php
$accessToken = 'access_token';
$userId = 168;

$users->deleteUserById($accessToken, $userId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.getUserById") getUserById

> Get a user.


```php
function getUserById(
        $accessToken,
        $userId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```php
$accessToken = 'access_token';
$userId = 168;

$result = $users->getUserById($accessToken, $userId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_users"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.listUsers") listUsers

> List all users in the organization.


```php
function listUsers($accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```php
$accessToken = 'access_token';

$result = $users->listUsers($accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_user_roles"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.listUserRoles") listUserRoles

> Get all roles in the organization.


```php
function listUserRoles($accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```php
$accessToken = 'access_token';

$result = $users->listUserRoles($accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_controller"></a>![Class: ](https://apidocs.io/img/class.png ".IndustrialController") IndustrialController

### Get singleton instance

The singleton instance of the ``` IndustrialController ``` class can be accessed from the API Client.

```php
$industrial = $client->getIndustrial();
```

### <a name="get_data_input"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.getDataInput") getDataInput

> Fetch datapoints from a given data input.


```php
function getDataInput(
        $accessToken,
        $dataInputId,
        $startMs = null,
        $endMs = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| dataInputId |  ``` Required ```  | ID of the data input |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |



#### Example Usage

```php
$accessToken = 'access_token';
$dataInputId = 168;
$startMs = 168;
$endMs = 168;

$result = $industrial->getDataInput($accessToken, $dataInputId, $startMs, $endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_data_inputs"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.getAllDataInputs") getAllDataInputs

> Fetch all of the data inputs for a group.


```php
function getAllDataInputs(
        $accessToken,
        $groupId = null,
        $startMs = null,
        $endMs = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |



#### Example Usage

```php
$accessToken = 'access_token';
$groupId = 168;
$startMs = 168;
$endMs = 168;

$result = $industrial->getAllDataInputs($accessToken, $groupId, $startMs, $endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.createGetMachines") createGetMachines

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


```php
function createGetMachines(
        $accessToken,
        $groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$groupParam = new GroupParam();

$result = $industrial->createGetMachines($accessToken, $groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines_history"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.createGetMachinesHistory") createGetMachinesHistory

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group


```php
function createGetMachinesHistory(
        $accessToken,
        $historyParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID and time range to query for events |



#### Example Usage

```php
$accessToken = 'access_token';
$historyParam = new HistoryParam();

$result = $industrial->createGetMachinesHistory($accessToken, $historyParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_controller"></a>![Class: ](https://apidocs.io/img/class.png ".SensorsController") SensorsController

### Get singleton instance

The singleton instance of the ``` SensorsController ``` class can be accessed from the API Client.

```php
$sensors = $client->getSensors();
```

### <a name="create_get_sensors_temperature"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsTemperature") createGetSensorsTemperature

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


```php
function createGetSensorsTemperature(
        $accessToken,
        $sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$sensorParam = new SensorParam();

$result = $sensors->createGetSensorsTemperature($accessToken, $sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensors") createGetSensors

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


```php
function createGetSensors(
        $accessToken,
        $groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$groupParam = new GroupParam();

$result = $sensors->createGetSensors($accessToken, $groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_humidity"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsHumidity") createGetSensorsHumidity

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


```php
function createGetSensorsHumidity(
        $accessToken,
        $sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$sensorParam = new SensorParam();

$result = $sensors->createGetSensorsHumidity($accessToken, $sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_history"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsHistory") createGetSensorsHistory

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


```php
function createGetSensorsHistory(
        $accessToken,
        $historyParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$historyParam = new HistoryParam1();

$result = $sensors->createGetSensorsHistory($accessToken, $historyParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_door"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsDoor") createGetSensorsDoor

> Get door monitor status (closed / open) for requested sensors.


```php
function createGetSensorsDoor(
        $accessToken,
        $sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$sensorParam = new SensorParam();

$result = $sensors->createGetSensorsDoor($accessToken, $sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_cargo"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsCargo") createGetSensorsCargo

> Get cargo monitor status (empty / full) for requested sensors.


```php
function createGetSensorsCargo(
        $accessToken,
        $sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```php
$accessToken = 'access_token';
$sensorParam = new SensorParam();

$result = $sensors->createGetSensorsCargo($accessToken, $sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)



