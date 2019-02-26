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

The generated code uses the Newtonsoft Json.NET NuGet Package. If the automatic NuGet package restore
is enabled, these dependencies will be installed automatically. Therefore,
you will need internet access for build.

1. Open the solution (SamsaraAPI.sln) file.
2. Invoke the build process using `Ctrl+Shift+B` shortcut key or using the `Build` menu as shown below.

![Building SDK using Visual Studio](https://apidocs.io/illustration/cs?step=buildSDK&workspaceFolder=Samsara%20API-CSharp&workspaceName=SamsaraAPI&projectName=SamsaraAPI.PCL)

## How to Use

The build process generates a portable class library, which can be used like a normal class library. The generated library is compatible with Windows Forms, Windows RT, Windows Phone 8,
Silverlight 5, Xamarin iOS, Xamarin Android and Mono. More information on how to use can be found at the [MSDN Portable Class Libraries documentation](http://msdn.microsoft.com/en-us/library/vstudio/gg597391%28v=vs.100%29.aspx).

The following section explains how to use the SamsaraAPI library in a new console project.

### 1. Starting a new project

For starting a new project, right click on the current solution from the *solution explorer* and choose  ``` Add -> New Project ```.

![Add a new project in the existing solution using Visual Studio](https://apidocs.io/illustration/cs?step=addProject&workspaceFolder=Samsara%20API-CSharp&workspaceName=SamsaraAPI&projectName=SamsaraAPI.PCL)

Next, choose "Console Application", provide a ``` TestConsoleProject ``` as the project name and click ``` OK ```.

![Create a new console project using Visual Studio](https://apidocs.io/illustration/cs?step=createProject&workspaceFolder=Samsara%20API-CSharp&workspaceName=SamsaraAPI&projectName=SamsaraAPI.PCL)

### 2. Set as startup project

The new console project is the entry point for the eventual execution. This requires us to set the ``` TestConsoleProject ``` as the start-up project. To do this, right-click on the  ``` TestConsoleProject ``` and choose  ``` Set as StartUp Project ``` form the context menu.

![Set the new cosole project as the start up project](https://apidocs.io/illustration/cs?step=setStartup&workspaceFolder=Samsara%20API-CSharp&workspaceName=SamsaraAPI&projectName=SamsaraAPI.PCL)

### 3. Add reference of the library project

In order to use the SamsaraAPI library in the new project, first we must add a projet reference to the ``` TestConsoleProject ```. First, right click on the ``` References ``` node in the *solution explorer* and click ``` Add Reference... ```.

![Open references of the TestConsoleProject](https://apidocs.io/illustration/cs?step=addReference&workspaceFolder=Samsara%20API-CSharp&workspaceName=SamsaraAPI&projectName=SamsaraAPI.PCL)

Next, a window will be displayed where we must set the ``` checkbox ``` on ``` SamsaraAPI.PCL ``` and click ``` OK ```. By doing this, we have added a reference of the ```SamsaraAPI.PCL``` project into the new ``` TestConsoleProject ```.

![Add a reference to the TestConsoleProject](https://apidocs.io/illustration/cs?step=createReference&workspaceFolder=Samsara%20API-CSharp&workspaceName=SamsaraAPI&projectName=SamsaraAPI.PCL)

### 4. Write sample code

Once the ``` TestConsoleProject ``` is created, a file named ``` Program.cs ``` will be visible in the *solution explorer* with an empty ``` Main ``` method. This is the entry point for the execution of the entire solution.
Here, you can add code to initialize the client library and acquire the instance of a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Add a reference to the TestConsoleProject](https://apidocs.io/illustration/cs?step=addCode&workspaceFolder=Samsara%20API-CSharp&workspaceName=SamsaraAPI&projectName=SamsaraAPI.PCL)

## How to Test

The generated SDK also contain one or more Tests, which are contained in the Tests project.
In order to invoke these test cases, you will need *NUnit 3.0 Test Adapter Extension for Visual Studio*.
Once the SDK is complied, the test cases should appear in the Test Explorer window.
Here, you can click *Run All* to execute these test cases.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accessToken | API Access Token |



API client can be initialized as following.

```csharp
// Configuration parameters and credentials
string accessToken = "accessToken"; // API Access Token

SamsaraAPIClient client = new SamsaraAPIClient(accessToken);
```



# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [TagsController](#tags_controller)
* [FleetController](#fleet_controller)
* [UsersController](#users_controller)
* [IndustrialController](#industrial_controller)
* [SensorsController](#sensors_controller)

## <a name="tags_controller"></a>![Class: ](https://apidocs.io/img/class.png "SamsaraAPI.PCL.Controllers.TagsController") TagsController

### Get singleton instance

The singleton instance of the ``` TagsController ``` class can be accessed from the API Client.

```csharp
TagsController tags = client.Tags;
```

### <a name="delete_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.TagsController.DeleteTagById") DeleteTagById

> Permanently deletes a tag.


```csharp
Task DeleteTagById(string accessToken, long tagId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |


#### Example Usage

```csharp
string accessToken = "access_token";
long tagId = 20;

await tags.DeleteTagById(accessToken, tagId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.TagsController.GetTagById") GetTagById

> Fetch a tag by id.


```csharp
Task<Models.Tag> GetTagById(string accessToken, long tagId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |


#### Example Usage

```csharp
string accessToken = "access_token";
long tagId = 20;

Models.Tag result = await tags.GetTagById(accessToken, tagId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="modify_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.TagsController.ModifyTagById") ModifyTagById

> Add or delete specific members from a tag, or modify the name of a tag.


```csharp
Task<Models.Tag> ModifyTagById(string accessToken, long tagId, Models.TagModify tagModifyParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| tagModifyParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
long tagId = 20;
var tagModifyParams = new Models.TagModify();

Models.Tag result = await tags.ModifyTagById(accessToken, tagId, tagModifyParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_tag"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.TagsController.CreateTag") CreateTag

> Create a new tag for the group.


```csharp
Task<Models.Tag> CreateTag(string accessToken, Models.TagCreate tagCreateParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagCreateParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var tagCreateParams = new Models.TagCreate();

Models.Tag result = await tags.CreateTag(accessToken, tagCreateParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="update_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.TagsController.UpdateTagById") UpdateTagById

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


```csharp
Task<Models.Tag> UpdateTagById(string accessToken, long tagId, Models.TagUpdate updateTagParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| updateTagParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
long tagId = 20;
var updateTagParams = new Models.TagUpdate();

Models.Tag result = await tags.UpdateTagById(accessToken, tagId, updateTagParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_all_tags"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.TagsController.GetAllTags") GetAllTags

> Fetch all of the tags for a group.


```csharp
Task<Models.GetAllTagsResponse> GetAllTags(string accessToken, long? groupId = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```csharp
string accessToken = "access_token";
long? groupId = 20;

Models.GetAllTagsResponse result = await tags.GetAllTags(accessToken, groupId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_controller"></a>![Class: ](https://apidocs.io/img/class.png "SamsaraAPI.PCL.Controllers.FleetController") FleetController

### Get singleton instance

The singleton instance of the ``` FleetController ``` class can be accessed from the API Client.

```csharp
FleetController fleet = client.Fleet;
```

### <a name="get_driver_document_types_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDriverDocumentTypesByOrgId") GetDriverDocumentTypesByOrgId

> Fetch all of the document types.


```csharp
Task<List<Models.DocumentType>> GetDriverDocumentTypesByOrgId()
```

#### Example Usage

```csharp

List<Models.DocumentType> result = await fleet.GetDriverDocumentTypesByOrgId();

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_vehicle_locations"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetVehicleLocations") GetVehicleLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


```csharp
Task<List<Models.FleetVehicleLocation>> GetVehicleLocations(
        string accessToken,
        long vehicleId,
        long startMs,
        long endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |


#### Example Usage

```csharp
string accessToken = "access_token";
long vehicleId = 20;
long startMs = 20;
long endMs = 20;

List<Models.FleetVehicleLocation> result = await fleet.GetVehicleLocations(accessToken, vehicleId, startMs, endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_vehicle_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateVehicleDispatchRoute") CreateVehicleDispatchRoute

> Create a new dispatch route for the vehicle with vehicle_id.


```csharp
Task<Models.DispatchRoute> CreateVehicleDispatchRoute(Models.DispatchRouteCreate createDispatchRouteParams, string accessToken, long vehicleId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |


#### Example Usage

```csharp
var createDispatchRouteParams = new Models.DispatchRouteCreate();
string accessToken = "access_token";
long vehicleId = 20;

Models.DispatchRoute result = await fleet.CreateVehicleDispatchRoute(createDispatchRouteParams, accessToken, vehicleId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_dispatch_routes_by_vehicle_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDispatchRoutesByVehicleId") GetDispatchRoutesByVehicleId

> Fetch all of the dispatch routes for a given vehicle.


```csharp
Task<List<Models.DispatchRoute>> GetDispatchRoutesByVehicleId(
        string accessToken,
        long vehicleId,
        long? endTime = null,
        long? duration = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```csharp
string accessToken = "access_token";
long vehicleId = 20;
long? endTime = 20;
long? duration = 20;

List<Models.DispatchRoute> result = await fleet.GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="patch_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.PatchFleetVehicle") PatchFleetVehicle

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


```csharp
Task<Models.FleetVehicleResponse> PatchFleetVehicle(string accessToken, string vehicleIdOrExternalId, Models.Data data)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
string vehicleIdOrExternalId = "vehicle_id_or_external_id";
var data = new Models.Data();

Models.FleetVehicleResponse result = await fleet.PatchFleetVehicle(accessToken, vehicleIdOrExternalId, data);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_vehicle_safety_score"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetVehicleSafetyScore") GetVehicleSafetyScore

> Fetch the safety score for the vehicle.


```csharp
Task<Models.VehicleSafetyScoreResponse> GetVehicleSafetyScore(
        string accessToken,
        long startMs,
        long endMs,
        long vehicleId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| vehicleId |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```csharp
string accessToken = "access_token";
long startMs = 20;
long endMs = 20;
long vehicleId = 20;

Models.VehicleSafetyScoreResponse result = await fleet.GetVehicleSafetyScore(accessToken, startMs, endMs, vehicleId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_vehicle_harsh_event"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetVehicleHarshEvent") GetVehicleHarshEvent

> Fetch harsh event details for a vehicle.


```csharp
Task<Models.VehicleHarshEventResponse> GetVehicleHarshEvent(string accessToken, long timestamp, long vehicleId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicleId |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```csharp
string accessToken = "access_token";
long timestamp = 20;
long vehicleId = 20;

Models.VehicleHarshEventResponse result = await fleet.GetVehicleHarshEvent(accessToken, timestamp, vehicleId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_vehicles_locations"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetVehiclesLocations") GetVehiclesLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


```csharp
Task<List<Models.FleetVehiclesLocation>> GetVehiclesLocations(string accessToken, int startMs, int endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |


#### Example Usage

```csharp
string accessToken = "access_token";
int startMs = 20;
int endMs = 20;

List<Models.FleetVehiclesLocation> result = await fleet.GetVehiclesLocations(accessToken, startMs, endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_dvirs"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDvirs") GetDvirs

> Get DVIRs for the org within provided time constraints


```csharp
Task<Models.DvirListResponse> GetDvirs(
        string accessToken,
        int endMs,
        int durationMs,
        int? groupId = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Required ```  | time in millis until the last dvir log. |
| durationMs |  ``` Required ```  | time in millis which corresponds to the duration before the end_ms. |
| groupId |  ``` Optional ```  | Group ID to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
int endMs = 20;
int durationMs = 20;
int? groupId = 20;

Models.DvirListResponse result = await fleet.GetDvirs(accessToken, endMs, durationMs, groupId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetFleetVehicle") GetFleetVehicle

> Gets a specific vehicle.


```csharp
Task<Models.FleetVehicleResponse> GetFleetVehicle(string accessToken, string vehicleIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |


#### Example Usage

```csharp
string accessToken = "access_token";
string vehicleIdOrExternalId = "vehicle_id_or_external_id";

Models.FleetVehicleResponse result = await fleet.GetFleetVehicle(accessToken, vehicleIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_list_fleet"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateListFleet") CreateListFleet

> Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.


```csharp
Task<Models.ListFleetResponse> CreateListFleet(
        string accessToken,
        Models.GroupParam groupParam,
        string startingAfter = null,
        string endingBefore = null,
        long? limit = null)
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

```csharp
string accessToken = "access_token";
var groupParam = new Models.GroupParam();
string startingAfter = "startingAfter";
string endingBefore = "endingBefore";
long? limit = 20;

Models.ListFleetResponse result = await fleet.CreateListFleet(accessToken, groupParam, startingAfter, endingBefore, limit);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_drivers_hos_daily_logs"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetDriversHosDailyLogs") CreateGetFleetDriversHosDailyLogs

> Get summarized daily HOS charts for a specified driver.


```csharp
Task<Models.DriverDailyLogResponse> CreateGetFleetDriversHosDailyLogs(string accessToken, long driverId, Models.HosLogsParam hosLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with HOS logs. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
long driverId = 20;
var hosLogsParam = new Models.HosLogsParam();

Models.DriverDailyLogResponse result = await fleet.CreateGetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_driver_document"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateDriverDocument") CreateDriverDocument

> Create a driver document for the given driver.


```csharp
Task<Models.Document> CreateDriverDocument(Models.DocumentCreate createDocumentParams, string accessToken, long driverId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDocumentParams |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver for whom the document is created. |


#### Example Usage

```csharp
var createDocumentParams = new Models.DocumentCreate();
string accessToken = "access_token";
long driverId = 20;

Models.Document result = await fleet.CreateDriverDocument(createDocumentParams, accessToken, driverId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_driver_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateDriverDispatchRoute") CreateDriverDispatchRoute

> Create a new dispatch route for the driver with driver_id.


```csharp
Task<Models.DispatchRoute> CreateDriverDispatchRoute(Models.DispatchRouteCreate createDispatchRouteParams, string accessToken, long driverId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |


#### Example Usage

```csharp
var createDispatchRouteParams = new Models.DispatchRouteCreate();
string accessToken = "access_token";
long driverId = 20;

Models.DispatchRoute result = await fleet.CreateDriverDispatchRoute(createDispatchRouteParams, accessToken, driverId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_trips"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetTrips") CreateGetFleetTrips

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


```csharp
Task<Models.TripResponse> CreateGetFleetTrips(string accessToken, Models.TripsParam tripsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tripsParam |  ``` Required ```  | Group ID, vehicle ID and time range to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var tripsParam = new Models.TripsParam();

Models.TripResponse result = await fleet.CreateGetFleetTrips(accessToken, tripsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="update_vehicles"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.UpdateVehicles") UpdateVehicles

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.


```csharp
Task UpdateVehicles(string accessToken, Models.VehicleUpdateParam vehicleUpdateParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleUpdateParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var vehicleUpdateParam = new Models.VehicleUpdateParam();

await fleet.UpdateVehicles(accessToken, vehicleUpdateParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_maintenance_list"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetMaintenanceList") CreateGetFleetMaintenanceList

> Get list of the vehicles with any engine faults or check light data.


```csharp
Task<Models.GetFleetMaintenanceListResponse> CreateGetFleetMaintenanceList(string accessToken, Models.GroupParam groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var groupParam = new Models.GroupParam();

Models.GetFleetMaintenanceListResponse result = await fleet.CreateGetFleetMaintenanceList(accessToken, groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_dispatch_routes_by_driver_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDispatchRoutesByDriverId") GetDispatchRoutesByDriverId

> Fetch all of the dispatch routes for a given driver.


```csharp
Task<List<Models.DispatchRoute>> GetDispatchRoutesByDriverId(
        string accessToken,
        long driverId,
        long? endTime = null,
        long? duration = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```csharp
string accessToken = "access_token";
long driverId = 20;
long? endTime = 20;
long? duration = 20;

List<Models.DispatchRoute> result = await fleet.GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_dvir"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateDvir") CreateDvir

> Create a new dvir, marking a vehicle or trailer safe or unsafe.


```csharp
Task<Models.DvirBase> CreateDvir(string accessToken, Models.CreateDvirParam createDvirParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDvirParam |  ``` Required ```  | DVIR creation body |


#### Example Usage

```csharp
string accessToken = "access_token";
var createDvirParam = new Models.CreateDvirParam();

Models.DvirBase result = await fleet.CreateDvir(accessToken, createDvirParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_driver_safety_score"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDriverSafetyScore") GetDriverSafetyScore

> Fetch the safety score for the driver.


```csharp
Task<Models.DriverSafetyScoreResponse> GetDriverSafetyScore(
        string accessToken,
        long startMs,
        long endMs,
        long driverId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| driverId |  ``` Required ```  | ID of the driver |


#### Example Usage

```csharp
string accessToken = "access_token";
long startMs = 233;
long endMs = 233;
long driverId = 233;

Models.DriverSafetyScoreResponse result = await fleet.GetDriverSafetyScore(accessToken, startMs, endMs, driverId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_locations"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetLocations") CreateGetFleetLocations

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


```csharp
Task<Models.GetFleetLocationsResponse> CreateGetFleetLocations(string accessToken, Models.GroupParam groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var groupParam = new Models.GroupParam();

Models.GetFleetLocationsResponse result = await fleet.CreateGetFleetLocations(accessToken, groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_hos_logs_summary"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetHosLogsSummary") CreateGetFleetHosLogsSummary

> Get the current HOS status for all drivers in the group.


```csharp
Task<Models.HosLogsSummaryResponse> CreateGetFleetHosLogsSummary(string accessToken, Models.HosLogsParam2 hosLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var hosLogsParam = new Models.HosLogsParam2();

Models.HosLogsSummaryResponse result = await fleet.CreateGetFleetHosLogsSummary(accessToken, hosLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_hos_logs"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetHosLogs") CreateGetFleetHosLogs

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


```csharp
Task<Models.HosLogsResponse> CreateGetFleetHosLogs(string accessToken, Models.HosLogsParam hosLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var hosLogsParam = new Models.HosLogsParam();

Models.HosLogsResponse result = await fleet.CreateGetFleetHosLogs(accessToken, hosLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_hos_authentication_logs"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetHosAuthenticationLogs") CreateGetFleetHosAuthenticationLogs

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


```csharp
Task<Models.HosAuthenticationLogsResponse> CreateGetFleetHosAuthenticationLogs(string accessToken, Models.HosAuthenticationLogsParam hosAuthenticationLogsParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosAuthenticationLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var hosAuthenticationLogsParam = new Models.HosAuthenticationLogsParam();

Models.HosAuthenticationLogsResponse result = await fleet.CreateGetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_drivers_summary"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetDriversSummary") CreateGetFleetDriversSummary

> Get the distance and time each driver in an organization has driven in a given time period.


```csharp
Task<Models.DriversSummaryResponse> CreateGetFleetDriversSummary(string accessToken, Models.DriversSummaryParam driversSummaryParam, bool? snapToDayBounds = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driversSummaryParam |  ``` Required ```  | Org ID and time range to query. |
| snapToDayBounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |


#### Example Usage

```csharp
string accessToken = "access_token";
var driversSummaryParam = new Models.DriversSummaryParam();
bool? snapToDayBounds = true;

Models.DriversSummaryResponse result = await fleet.CreateGetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_vehicle_stats"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetVehicleStats") GetVehicleStats

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


```csharp
Task<Models.GetVehicleStatsResponse> GetVehicleStats(
        string accessToken,
        int startMs,
        int endMs,
        Models.SeriesEnum? series = null,
        string tagIds = null,
        string startingAfter = null,
        string endingBefore = null,
        long? limit = null)
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

```csharp
string accessToken = "access_token";
int startMs = 233;
int endMs = 233;
var series = Models.SeriesEnum?Helper.ParseString("engineState");
string tagIds = "tagIds";
string startingAfter = "startingAfter";
string endingBefore = "endingBefore";
long? limit = 233;

Models.GetVehicleStatsResponse result = await fleet.GetVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="update_reactivate_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.UpdateReactivateDriverById") UpdateReactivateDriverById

> Reactivate the inactive driver having id.


```csharp
Task<Models.Driver> UpdateReactivateDriverById(Models.ReactivateDriverParam reactivateDriverParam, string accessToken, string driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivateDriverParam |  ``` Required ```  | Driver reactivation body |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```csharp
var reactivateDriverParam = new Models.ReactivateDriverParam();
string accessToken = "access_token";
string driverIdOrExternalId = "driver_id_or_external_id";

Models.Driver result = await fleet.UpdateReactivateDriverById(reactivateDriverParam, accessToken, driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_driver_documents_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDriverDocumentsByOrgId") GetDriverDocumentsByOrgId

> Fetch all of the documents.


```csharp
Task<List<Models.Document>> GetDriverDocumentsByOrgId(string accessToken, long? endMs = null, long? durationMs = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| durationMs |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |


#### Example Usage

```csharp
string accessToken = "access_token";
long? endMs = 233;
long? durationMs = 233;

List<Models.Document> result = await fleet.GetDriverDocumentsByOrgId(accessToken, endMs, durationMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="delete_deactivate_driver"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.DeleteDeactivateDriver") DeleteDeactivateDriver

> Deactivate a driver with the given id.


```csharp
Task DeleteDeactivateDriver(string accessToken, string driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```csharp
string accessToken = "access_token";
string driverIdOrExternalId = "driver_id_or_external_id";

await fleet.DeleteDeactivateDriver(accessToken, driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_dispatch_route_history"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDispatchRouteHistory") GetDispatchRouteHistory

> Fetch the history of a dispatch route.


```csharp
Task<Models.DispatchRouteHistory> GetDispatchRouteHistory(
        string accessToken,
        long routeId,
        long? startTime = null,
        long? endTime = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the route with history. |
| startTime |  ``` Optional ```  | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. |
| endTime |  ``` Optional ```  | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. |


#### Example Usage

```csharp
string accessToken = "access_token";
long routeId = 233;
long? startTime = 233;
long? endTime = 233;

Models.DispatchRouteHistory result = await fleet.GetDispatchRouteHistory(accessToken, routeId, startTime, endTime);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="update_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.UpdateDispatchRouteById") UpdateDispatchRouteById

> Update a dispatch route and its associated jobs.


```csharp
Task<Models.DispatchRoute> UpdateDispatchRouteById(Models.DispatchRoute updateDispatchRouteParams, string accessToken, long routeId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```csharp
var updateDispatchRouteParams = new Models.DispatchRoute();
string accessToken = "access_token";
long routeId = 233;

Models.DispatchRoute result = await fleet.UpdateDispatchRouteById(updateDispatchRouteParams, accessToken, routeId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="fetch_all_route_job_updates"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.FetchAllRouteJobUpdates") FetchAllRouteJobUpdates

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


```csharp
Task<Models.AllRouteJobUpdates> FetchAllRouteJobUpdates(
        string accessToken,
        long? groupId = null,
        string sequenceId = null,
        string include = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| sequenceId |  ``` Optional ```  | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. |
| include |  ``` Optional ```  | Optionally set include=route to include route object in response payload. |


#### Example Usage

```csharp
string accessToken = "access_token";
long? groupId = 233;
string sequenceId = "sequence_id";
string include = "include";

Models.AllRouteJobUpdates result = await fleet.FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="fetch_all_dispatch_routes"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.FetchAllDispatchRoutes") FetchAllDispatchRoutes

> Fetch all of the dispatch routes for the group.


```csharp
Task<List<Models.DispatchRoute>> FetchAllDispatchRoutes(
        string accessToken,
        long? groupId = null,
        long? endTime = null,
        long? duration = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```csharp
string accessToken = "access_token";
long? groupId = 233;
long? endTime = 233;
long? duration = 233;

List<Models.DispatchRoute> result = await fleet.FetchAllDispatchRoutes(accessToken, groupId, endTime, duration);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_asset_reefer"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetAssetReefer") GetAssetReefer

> Fetch the reefer-specific stats of an asset.


```csharp
Task<Models.AssetReeferResponse> GetAssetReefer(
        string accessToken,
        long assetId,
        long startMs,
        long endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```csharp
string accessToken = "access_token";
long assetId = 233;
long startMs = 233;
long endMs = 233;

Models.AssetReeferResponse result = await fleet.GetAssetReefer(accessToken, assetId, startMs, endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_asset_location"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetAssetLocation") GetAssetLocation

> Fetch the historical locations for the asset.


```csharp
Task<List<Models.AssetLocationResponse>> GetAssetLocation(
        string accessToken,
        long assetId,
        long startMs,
        long endMs)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```csharp
string accessToken = "access_token";
long assetId = 233;
long startMs = 233;
long endMs = 233;

List<Models.AssetLocationResponse> result = await fleet.GetAssetLocation(accessToken, assetId, startMs, endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDriverById") GetDriverById

> Fetch driver by id.


```csharp
Task<Models.Driver> GetDriverById(string accessToken, string driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```csharp
string accessToken = "access_token";
string driverIdOrExternalId = "driver_id_or_external_id";

Models.Driver result = await fleet.GetDriverById(accessToken, driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_deactivated_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDeactivatedDriverById") GetDeactivatedDriverById

> Fetch deactivated driver by id.


```csharp
Task<Models.Driver> GetDeactivatedDriverById(string accessToken, string driverIdOrExternalId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```csharp
string accessToken = "access_token";
string driverIdOrExternalId = "driver_id_or_external_id";

Models.Driver result = await fleet.GetDeactivatedDriverById(accessToken, driverIdOrExternalId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_all_deactivated_drivers"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetAllDeactivatedDrivers") GetAllDeactivatedDrivers

> Fetch all deactivated drivers for the group.


```csharp
Task<List<Models.Driver>> GetAllDeactivatedDrivers(string accessToken, long? groupId = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```csharp
string accessToken = "access_token";
long? groupId = 233;

List<Models.Driver> result = await fleet.GetAllDeactivatedDrivers(accessToken, groupId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_driver"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateDriver") CreateDriver

> Create a new driver.


```csharp
Task<Models.Driver> CreateDriver(string accessToken, Models.DriverForCreate createDriverParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDriverParam |  ``` Required ```  | Driver creation body |


#### Example Usage

```csharp
string accessToken = "access_token";
var createDriverParam = new Models.DriverForCreate();

Models.Driver result = await fleet.CreateDriver(accessToken, createDriverParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_fleet_drivers"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateGetFleetDrivers") CreateGetFleetDrivers

> Get all the drivers for the specified group.


```csharp
Task<Models.DriversResponse> CreateGetFleetDrivers(string accessToken, Models.GroupDriversParam groupDriversParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupDriversParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var groupDriversParam = new Models.GroupDriversParam();

Models.DriversResponse result = await fleet.CreateGetFleetDrivers(accessToken, groupDriversParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="delete_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.DeleteDispatchRouteById") DeleteDispatchRouteById

> Delete a dispatch route and its associated jobs.


```csharp
Task DeleteDispatchRouteById(string accessToken, long routeId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```csharp
string accessToken = "access_token";
long routeId = 233;

await fleet.DeleteDispatchRouteById(accessToken, routeId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetDispatchRouteById") GetDispatchRouteById

> Fetch a dispatch route by id.


```csharp
Task<Models.DispatchRoute> GetDispatchRouteById(string accessToken, long routeId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```csharp
string accessToken = "access_token";
long routeId = 233;

Models.DispatchRoute result = await fleet.GetDispatchRouteById(accessToken, routeId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.CreateDispatchRoute") CreateDispatchRoute

> Create a new dispatch route.


```csharp
Task<Models.DispatchRoute> CreateDispatchRoute(string accessToken, Models.DispatchRouteCreate createDispatchRouteParams)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var createDispatchRouteParams = new Models.DispatchRouteCreate();

Models.DispatchRoute result = await fleet.CreateDispatchRoute(accessToken, createDispatchRouteParams);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_all_asset_current_locations"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetAllAssetCurrentLocations") GetAllAssetCurrentLocations

> Fetch current locations of all assets for the group.


```csharp
Task<Models.GetAllAssetCurrentLocationsResponse> GetAllAssetCurrentLocations(string accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```csharp
string accessToken = "access_token";

Models.GetAllAssetCurrentLocationsResponse result = await fleet.GetAllAssetCurrentLocations(accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_all_assets"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetAllAssets") GetAllAssets

> Fetch all of the assets for the group.


```csharp
Task<Models.GetAllAssetsResponse> GetAllAssets(string accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```csharp
string accessToken = "access_token";

Models.GetAllAssetsResponse result = await fleet.GetAllAssets(accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="add_fleet_address"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.AddFleetAddress") AddFleetAddress

> This method adds an address book entry to the specified group.


```csharp
Task AddFleetAddress(string accessToken, Models.AddressParam addressParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```csharp
string accessToken = "access_token";
var addressParam = new Models.AddressParam();

await fleet.AddFleetAddress(accessToken, addressParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_organization_contact"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetOrganizationContact") GetOrganizationContact

> Fetch a contact by its id.


```csharp
Task<Models.Contact> GetOrganizationContact(string accessToken, long contactId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| contactId |  ``` Required ```  | ID of the contact |


#### Example Usage

```csharp
string accessToken = "access_token";
long contactId = 233;

Models.Contact result = await fleet.GetOrganizationContact(accessToken, contactId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="list_contacts"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.ListContacts") ListContacts

> Fetch all contacts for the organization.


```csharp
Task<List<Models.Contact>> ListContacts(string accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```csharp
string accessToken = "access_token";

List<Models.Contact> result = await fleet.ListContacts(accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="delete_organization_address"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.DeleteOrganizationAddress") DeleteOrganizationAddress

> Delete an address.


```csharp
Task DeleteOrganizationAddress(string accessToken, long addressId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```csharp
string accessToken = "access_token";
long addressId = 233;

await fleet.DeleteOrganizationAddress(accessToken, addressId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_organization_address"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetOrganizationAddress") GetOrganizationAddress

> Fetch an address by its id.


```csharp
Task<Models.Address> GetOrganizationAddress(string accessToken, long addressId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```csharp
string accessToken = "access_token";
long addressId = 233;

Models.Address result = await fleet.GetOrganizationAddress(accessToken, addressId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="update_organization_address"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.UpdateOrganizationAddress") UpdateOrganizationAddress

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


```csharp
Task UpdateOrganizationAddress(string accessToken, Models.Address1 address, long addressId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```csharp
string accessToken = "access_token";
var address = new Models.Address1();
long addressId = 233;

await fleet.UpdateOrganizationAddress(accessToken, address, addressId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.GetOrganizationAddresses") GetOrganizationAddresses

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


```csharp
Task<List<Models.Address>> GetOrganizationAddresses(string accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```csharp
string accessToken = "access_token";

List<Models.Address> result = await fleet.GetOrganizationAddresses(accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="add_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.FleetController.AddOrganizationAddresses") AddOrganizationAddresses

> Add one or more addresses to the organization


```csharp
Task<List<Models.Address>> AddOrganizationAddresses(string accessToken, Models.Addresses addresses)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |


#### Example Usage

```csharp
string accessToken = "access_token";
var addresses = new Models.Addresses();

List<Models.Address> result = await fleet.AddOrganizationAddresses(accessToken, addresses);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png "SamsaraAPI.PCL.Controllers.UsersController") UsersController

### Get singleton instance

The singleton instance of the ``` UsersController ``` class can be accessed from the API Client.

```csharp
UsersController users = client.Users;
```

### <a name="delete_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.UsersController.DeleteUserById") DeleteUserById

> Remove a user from the organization.


```csharp
Task DeleteUserById(string accessToken, long userId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |


#### Example Usage

```csharp
string accessToken = "access_token";
long userId = 233;

await users.DeleteUserById(accessToken, userId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.UsersController.GetUserById") GetUserById

> Get a user.


```csharp
Task<Models.User> GetUserById(string accessToken, long userId)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |


#### Example Usage

```csharp
string accessToken = "access_token";
long userId = 233;

Models.User result = await users.GetUserById(accessToken, userId);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="list_users"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.UsersController.ListUsers") ListUsers

> List all users in the organization.


```csharp
Task<List<Models.User>> ListUsers(string accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```csharp
string accessToken = "access_token";

List<Models.User> result = await users.ListUsers(accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="list_user_roles"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.UsersController.ListUserRoles") ListUserRoles

> Get all roles in the organization.


```csharp
Task<List<Models.UserRole>> ListUserRoles(string accessToken)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```csharp
string accessToken = "access_token";

List<Models.UserRole> result = await users.ListUserRoles(accessToken);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_controller"></a>![Class: ](https://apidocs.io/img/class.png "SamsaraAPI.PCL.Controllers.IndustrialController") IndustrialController

### Get singleton instance

The singleton instance of the ``` IndustrialController ``` class can be accessed from the API Client.

```csharp
IndustrialController industrial = client.Industrial;
```

### <a name="get_data_input"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.IndustrialController.GetDataInput") GetDataInput

> Fetch datapoints from a given data input.


```csharp
Task<Models.DataInputHistoryResponse> GetDataInput(
        string accessToken,
        long dataInputId,
        long? startMs = null,
        long? endMs = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| dataInputId |  ``` Required ```  | ID of the data input |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```csharp
string accessToken = "access_token";
long dataInputId = 233;
long? startMs = 233;
long? endMs = 233;

Models.DataInputHistoryResponse result = await industrial.GetDataInput(accessToken, dataInputId, startMs, endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="get_all_data_inputs"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.IndustrialController.GetAllDataInputs") GetAllDataInputs

> Fetch all of the data inputs for a group.


```csharp
Task<Models.GetAllDataInputsResponse> GetAllDataInputs(
        string accessToken,
        long? groupId = null,
        long? startMs = null,
        long? endMs = null)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```csharp
string accessToken = "access_token";
long? groupId = 233;
long? startMs = 233;
long? endMs = 233;

Models.GetAllDataInputsResponse result = await industrial.GetAllDataInputs(accessToken, groupId, startMs, endMs);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_machines"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.IndustrialController.CreateGetMachines") CreateGetMachines

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


```csharp
Task<Models.GetMachinesResponse> CreateGetMachines(string accessToken, Models.GroupParam groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var groupParam = new Models.GroupParam();

Models.GetMachinesResponse result = await industrial.CreateGetMachines(accessToken, groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_machines_history"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.IndustrialController.CreateGetMachinesHistory") CreateGetMachinesHistory

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group


```csharp
Task<Models.MachineHistoryResponse> CreateGetMachinesHistory(string accessToken, Models.HistoryParam historyParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID and time range to query for events |


#### Example Usage

```csharp
string accessToken = "access_token";
var historyParam = new Models.HistoryParam();

Models.MachineHistoryResponse result = await industrial.CreateGetMachinesHistory(accessToken, historyParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_controller"></a>![Class: ](https://apidocs.io/img/class.png "SamsaraAPI.PCL.Controllers.SensorsController") SensorsController

### Get singleton instance

The singleton instance of the ``` SensorsController ``` class can be accessed from the API Client.

```csharp
SensorsController sensors = client.Sensors;
```

### <a name="create_get_sensors_temperature"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.SensorsController.CreateGetSensorsTemperature") CreateGetSensorsTemperature

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


```csharp
Task<Models.TemperatureResponse> CreateGetSensorsTemperature(string accessToken, Models.SensorParam sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var sensorParam = new Models.SensorParam();

Models.TemperatureResponse result = await sensors.CreateGetSensorsTemperature(accessToken, sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_sensors"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.SensorsController.CreateGetSensors") CreateGetSensors

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


```csharp
Task<Models.GetSensorsResponse> CreateGetSensors(string accessToken, Models.GroupParam groupParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var groupParam = new Models.GroupParam();

Models.GetSensorsResponse result = await sensors.CreateGetSensors(accessToken, groupParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_sensors_humidity"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.SensorsController.CreateGetSensorsHumidity") CreateGetSensorsHumidity

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


```csharp
Task<Models.HumidityResponse> CreateGetSensorsHumidity(string accessToken, Models.SensorParam sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var sensorParam = new Models.SensorParam();

Models.HumidityResponse result = await sensors.CreateGetSensorsHumidity(accessToken, sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_sensors_history"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.SensorsController.CreateGetSensorsHistory") CreateGetSensorsHistory

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


```csharp
Task<Models.SensorHistoryResponse> CreateGetSensorsHistory(string accessToken, Models.HistoryParam1 historyParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var historyParam = new Models.HistoryParam1();

Models.SensorHistoryResponse result = await sensors.CreateGetSensorsHistory(accessToken, historyParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_sensors_door"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.SensorsController.CreateGetSensorsDoor") CreateGetSensorsDoor

> Get door monitor status (closed / open) for requested sensors.


```csharp
Task<Models.DoorResponse> CreateGetSensorsDoor(string accessToken, Models.SensorParam sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var sensorParam = new Models.SensorParam();

Models.DoorResponse result = await sensors.CreateGetSensorsDoor(accessToken, sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


### <a name="create_get_sensors_cargo"></a>![Method: ](https://apidocs.io/img/method.png "SamsaraAPI.PCL.Controllers.SensorsController.CreateGetSensorsCargo") CreateGetSensorsCargo

> Get cargo monitor status (empty / full) for requested sensors.


```csharp
Task<Models.CargoResponse> CreateGetSensorsCargo(string accessToken, Models.SensorParam sensorParam)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```csharp
string accessToken = "access_token";
var sensorParam = new Models.SensorParam();

Models.CargoResponse result = await sensors.CreateGetSensorsCargo(accessToken, sensorParam);

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |


[Back to List of Controllers](#list_of_controllers)



