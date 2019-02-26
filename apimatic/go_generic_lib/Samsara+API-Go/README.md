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


* In order to successfully build and run your SDK files, you are required to have the following setup in your system:
    * **Go**  (Visit [https://golang.org/doc/install](https://golang.org/doc/install) for more details on how to install Go)
    * **Java VM** Version 8 or later
    * **Eclipse 4.6 (Neon)** or later ([http://www.eclipse.org/neon/](http://www.eclipse.org/neon/))
    * **GoClipse** setup within above installed Eclipse (Follow the instructions at [this link](https://github.com/GoClipse/goclipse/blob/latest/documentation/Installation.md#instructions) to setup GoClipse)
* Ensure that ```GOPATH``` environment variable is set in the system variables. If not, set it to your workspace directory where you will be adding your Go projects.
* The generated code uses unirest-go http library. Therefore, you will need internet access to resolve this dependency. If Go is properly installed and configured, run the following command to pull the dependency:

```Go
go get github.com/apimatic/unirest-go
```

This will install unirest-go in the ```GOPATH``` you specified in the system variables.

Now follow the steps mentioned below to build your SDK:

1. Open eclipse in the Go language perspective and click on the ```Import``` option in ```File``` menu.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/go?step=import0)

2. Select ```General -> Existing Projects into Workspace``` option from the tree list.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/go?step=import1)

3. In ```Select root directory```, provide path to the unzipped archive for the generated code. Once the path is set and the Project becomes visible under ```Projects``` click ```Finish```

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/go?step=import2&workspaceFolder=Samsara%20API-GoLang&projectName=samsaraapi_lib)

4. The Go library will be imported and its files will be visible in the Project Explorer

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/go?step=import3&projectName=samsaraapi_lib)

## How to Use

The following section explains how to use the SamsaraapiLib library in a new project.

### 1. Add a new Test Project

Create a new project in Eclipse by ```File``` -> ```New``` -> ```Go Project```

![Add a new project in Eclipse](https://apidocs.io/illustration/go?step=createNewProject0)

Name the Project as ```Test``` and click ```Finish```

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/go?step=createNewProject1)

Create a new directory in the ```src``` directory of this project

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/go?step=createNewProject2&projectName=samsaraapi_lib)

Name it ```test.com```

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/go?step=createNewProject3&projectName=samsaraapi_lib)

Now create a new file inside ```src/test.com```

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/go?step=createNewProject4&projectName=samsaraapi_lib)

Name it ```testsdk.go```

![Create a new Maven Project - Step 5](https://apidocs.io/illustration/go?step=createNewProject5&projectName=samsaraapi_lib)

In this Go file, you can start adding code to initialize the client library. Sample code to initialize the client library and using its methods is given in the subsequent sections.

### 2. Configure the Test Project

You need to import your generated library in this project in order to make use of its functions. In order to import the library, you can add its path in the ```GOPATH``` for this project. Follow the below steps:

Right click on the project name and click on ```Properties```

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/go?step=testProject0&projectName=samsaraapi_lib)

Choose ```Go Compiler``` from the side menu. Check ```Use project specific settings``` and uncheck ```Use same value as the GOPATH environment variable.```. By default, the GOPATH value from the environment variables will be visible in ```Eclipse GOPATH```. Do not remove this as this points to the unirest dependency.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/go?step=testProject1)

Append the library path to this GOPATH

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/go?step=testProject2&workspaceFolder=Samsara%20API-GoLang)

Once the path is appended, click on ```OK```

### 3. Build the Test Project

Right click on the project name and click on ```Build Project```

![Build Project](https://apidocs.io/illustration/go?step=buildProject&projectName=samsaraapi_lib)

### 4. Run the Test Project

If the build is successful, right click on your Go file and click on ```Run As``` -> ```Go Application```

![Run Project](https://apidocs.io/illustration/go?step=runProject&projectName=samsaraapi_lib)

## Initialization

### Authentication
In order to setup authentication of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accessToken | API Access Token |


To configure these for your generated code, open the file "Configuration.go" and edit it's contents.


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [tags_pkg](#tags_pkg)
* [fleet_pkg](#fleet_pkg)
* [users_pkg](#users_pkg)
* [industrial_pkg](#industrial_pkg)
* [sensors_pkg](#sensors_pkg)

## <a name="tags_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".tags_pkg") tags_pkg

### Get instance

Factory for the ``` TAGS ``` interface can be accessed from the package tags_pkg.

```go
tags := tags_pkg.NewTAGS()
```

### <a name="delete_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".tags_pkg.DeleteTagById") DeleteTagById

> Permanently deletes a tag.


```go
func (me *TAGS_IMPL) DeleteTagById(
            accessToken string,
            tagId int64)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |


#### Example Usage

```go
accessToken := "access_token"
tagId,_ := strconv.ParseInt("125", 10, 8)

var result 
result,_ = tags.DeleteTagById(accessToken, tagId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".tags_pkg.GetTagById") GetTagById

> Fetch a tag by id.


```go
func (me *TAGS_IMPL) GetTagById(
            accessToken string,
            tagId int64)(*models_pkg.Tag,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |


#### Example Usage

```go
accessToken := "access_token"
tagId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.Tag
result,_ = tags.GetTagById(accessToken, tagId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="modify_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".tags_pkg.ModifyTagById") ModifyTagById

> Add or delete specific members from a tag, or modify the name of a tag.


```go
func (me *TAGS_IMPL) ModifyTagById(
            accessToken string,
            tagId int64,
            tagModifyParams *models_pkg.TagModify)(*models_pkg.Tag,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| tagModifyParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
tagId,_ := strconv.ParseInt("125", 10, 8)
var tagModifyParams *models_pkg.TagModify

var result *models_pkg.Tag
result,_ = tags.ModifyTagById(accessToken, tagId, tagModifyParams)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_tag"></a>![Method: ](https://apidocs.io/img/method.png ".tags_pkg.CreateTag") CreateTag

> Create a new tag for the group.


```go
func (me *TAGS_IMPL) CreateTag(
            accessToken string,
            tagCreateParams *models_pkg.TagCreate)(*models_pkg.Tag,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagCreateParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var tagCreateParams *models_pkg.TagCreate

var result *models_pkg.Tag
result,_ = tags.CreateTag(accessToken, tagCreateParams)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".tags_pkg.UpdateTagById") UpdateTagById

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


```go
func (me *TAGS_IMPL) UpdateTagById(
            accessToken string,
            tagId int64,
            updateTagParams *models_pkg.TagUpdate)(*models_pkg.Tag,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| updateTagParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
tagId,_ := strconv.ParseInt("125", 10, 8)
var updateTagParams *models_pkg.TagUpdate

var result *models_pkg.Tag
result,_ = tags.UpdateTagById(accessToken, tagId, updateTagParams)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_tags"></a>![Method: ](https://apidocs.io/img/method.png ".tags_pkg.GetAllTags") GetAllTags

> Fetch all of the tags for a group.


```go
func (me *TAGS_IMPL) GetAllTags(
            accessToken string,
            groupId *int64)(*models_pkg.GetAllTagsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```go
accessToken := "access_token"
groupId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.GetAllTagsResponse
result,_ = tags.GetAllTags(accessToken, groupId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".fleet_pkg") fleet_pkg

### Get instance

Factory for the ``` FLEET ``` interface can be accessed from the package fleet_pkg.

```go
fleet := fleet_pkg.NewFLEET()
```

### <a name="get_driver_document_types_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDriverDocumentTypesByOrgId") GetDriverDocumentTypesByOrgId

> Fetch all of the document types.


```go
func (me *FLEET_IMPL) GetDriverDocumentTypesByOrgId()([]*models_pkg.DocumentType,error)
```

#### Example Usage

```go

var result []*models_pkg.DocumentType
result,_ = fleet.GetDriverDocumentTypesByOrgId()

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_locations"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetVehicleLocations") GetVehicleLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


```go
func (me *FLEET_IMPL) GetVehicleLocations(
            accessToken string,
            vehicleId int64,
            startMs int64,
            endMs int64)([]*models_pkg.FleetVehicleLocation,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |


#### Example Usage

```go
accessToken := "access_token"
vehicleId,_ := strconv.ParseInt("125", 10, 8)
startMs,_ := strconv.ParseInt("125", 10, 8)
endMs,_ := strconv.ParseInt("125", 10, 8)

var result []*models_pkg.FleetVehicleLocation
result,_ = fleet.GetVehicleLocations(accessToken, vehicleId, startMs, endMs)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_vehicle_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateVehicleDispatchRoute") CreateVehicleDispatchRoute

> Create a new dispatch route for the vehicle with vehicle_id.


```go
func (me *FLEET_IMPL) CreateVehicleDispatchRoute(
            createDispatchRouteParams *models_pkg.DispatchRouteCreate,
            accessToken string,
            vehicleId int64)(*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |


#### Example Usage

```go
var createDispatchRouteParams *models_pkg.DispatchRouteCreate
accessToken := "access_token"
vehicleId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.DispatchRoute
result,_ = fleet.CreateVehicleDispatchRoute(createDispatchRouteParams, accessToken, vehicleId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_vehicle_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDispatchRoutesByVehicleId") GetDispatchRoutesByVehicleId

> Fetch all of the dispatch routes for a given vehicle.


```go
func (me *FLEET_IMPL) GetDispatchRoutesByVehicleId(
            accessToken string,
            vehicleId int64,
            endTime *int64,
            duration *int64)([]*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```go
accessToken := "access_token"
vehicleId,_ := strconv.ParseInt("125", 10, 8)
endTime,_ := strconv.ParseInt("125", 10, 8)
duration,_ := strconv.ParseInt("125", 10, 8)

var result []*models_pkg.DispatchRoute
result,_ = fleet.GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="patch_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.PatchFleetVehicle") PatchFleetVehicle

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


```go
func (me *FLEET_IMPL) PatchFleetVehicle(
            accessToken string,
            vehicleIdOrExternalId string,
            data *models_pkg.Data)(*models_pkg.FleetVehicleResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
vehicleIdOrExternalId := "vehicle_id_or_external_id"
var data *models_pkg.Data

var result *models_pkg.FleetVehicleResponse
result,_ = fleet.PatchFleetVehicle(accessToken, vehicleIdOrExternalId, data)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetVehicleSafetyScore") GetVehicleSafetyScore

> Fetch the safety score for the vehicle.


```go
func (me *FLEET_IMPL) GetVehicleSafetyScore(
            accessToken string,
            startMs int64,
            endMs int64,
            vehicleId int64)(*models_pkg.VehicleSafetyScoreResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| vehicleId |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```go
accessToken := "access_token"
startMs,_ := strconv.ParseInt("125", 10, 8)
endMs,_ := strconv.ParseInt("125", 10, 8)
vehicleId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.VehicleSafetyScoreResponse
result,_ = fleet.GetVehicleSafetyScore(accessToken, startMs, endMs, vehicleId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_harsh_event"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetVehicleHarshEvent") GetVehicleHarshEvent

> Fetch harsh event details for a vehicle.


```go
func (me *FLEET_IMPL) GetVehicleHarshEvent(
            accessToken string,
            timestamp int64,
            vehicleId int64)(*models_pkg.VehicleHarshEventResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicleId |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```go
accessToken := "access_token"
timestamp,_ := strconv.ParseInt("125", 10, 8)
vehicleId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.VehicleHarshEventResponse
result,_ = fleet.GetVehicleHarshEvent(accessToken, timestamp, vehicleId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicles_locations"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetVehiclesLocations") GetVehiclesLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


```go
func (me *FLEET_IMPL) GetVehiclesLocations(
            accessToken string,
            startMs int64,
            endMs int64)([]*models_pkg.FleetVehiclesLocation,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |


#### Example Usage

```go
accessToken := "access_token"
startMs,_ := strconv.ParseInt("125", 10, 8)
endMs,_ := strconv.ParseInt("125", 10, 8)

var result []*models_pkg.FleetVehiclesLocation
result,_ = fleet.GetVehiclesLocations(accessToken, startMs, endMs)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dvirs"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDvirs") GetDvirs

> Get DVIRs for the org within provided time constraints


```go
func (me *FLEET_IMPL) GetDvirs(
            accessToken string,
            endMs int64,
            durationMs int64,
            groupId *int64)(*models_pkg.DvirListResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Required ```  | time in millis until the last dvir log. |
| durationMs |  ``` Required ```  | time in millis which corresponds to the duration before the end_ms. |
| groupId |  ``` Optional ```  | Group ID to query. |


#### Example Usage

```go
accessToken := "access_token"
endMs,_ := strconv.ParseInt("125", 10, 8)
durationMs,_ := strconv.ParseInt("125", 10, 8)
groupId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.DvirListResponse
result,_ = fleet.GetDvirs(accessToken, endMs, durationMs, groupId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetFleetVehicle") GetFleetVehicle

> Gets a specific vehicle.


```go
func (me *FLEET_IMPL) GetFleetVehicle(
            accessToken string,
            vehicleIdOrExternalId string)(*models_pkg.FleetVehicleResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |


#### Example Usage

```go
accessToken := "access_token"
vehicleIdOrExternalId := "vehicle_id_or_external_id"

var result *models_pkg.FleetVehicleResponse
result,_ = fleet.GetFleetVehicle(accessToken, vehicleIdOrExternalId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_list_fleet"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateListFleet") CreateListFleet

> Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.


```go
func (me *FLEET_IMPL) CreateListFleet(
            accessToken string,
            groupParam *models_pkg.GroupParam,
            startingAfter *string,
            endingBefore *string,
            limit *int64)(*models_pkg.ListFleetResponse,error)
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

```go
accessToken := "access_token"
var groupParam *models_pkg.GroupParam
startingAfter := "startingAfter"
endingBefore := "endingBefore"
limit,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.ListFleetResponse
result,_ = fleet.CreateListFleet(accessToken, groupParam, startingAfter, endingBefore, limit)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_hos_daily_logs"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetDriversHosDailyLogs") CreateGetFleetDriversHosDailyLogs

> Get summarized daily HOS charts for a specified driver.


```go
func (me *FLEET_IMPL) CreateGetFleetDriversHosDailyLogs(
            accessToken string,
            driverId int64,
            hosLogsParam *models_pkg.HosLogsParam)(*models_pkg.DriverDailyLogResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with HOS logs. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
driverId,_ := strconv.ParseInt("125", 10, 8)
var hosLogsParam *models_pkg.HosLogsParam

var result *models_pkg.DriverDailyLogResponse
result,_ = fleet.CreateGetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_document"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateDriverDocument") CreateDriverDocument

> Create a driver document for the given driver.


```go
func (me *FLEET_IMPL) CreateDriverDocument(
            createDocumentParams *models_pkg.DocumentCreate,
            accessToken string,
            driverId int64)(*models_pkg.Document,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDocumentParams |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver for whom the document is created. |


#### Example Usage

```go
var createDocumentParams *models_pkg.DocumentCreate
accessToken := "access_token"
driverId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.Document
result,_ = fleet.CreateDriverDocument(createDocumentParams, accessToken, driverId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateDriverDispatchRoute") CreateDriverDispatchRoute

> Create a new dispatch route for the driver with driver_id.


```go
func (me *FLEET_IMPL) CreateDriverDispatchRoute(
            createDispatchRouteParams *models_pkg.DispatchRouteCreate,
            accessToken string,
            driverId int64)(*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |


#### Example Usage

```go
var createDispatchRouteParams *models_pkg.DispatchRouteCreate
accessToken := "access_token"
driverId,_ := strconv.ParseInt("125", 10, 8)

var result *models_pkg.DispatchRoute
result,_ = fleet.CreateDriverDispatchRoute(createDispatchRouteParams, accessToken, driverId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_trips"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetTrips") CreateGetFleetTrips

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


```go
func (me *FLEET_IMPL) CreateGetFleetTrips(
            accessToken string,
            tripsParam *models_pkg.TripsParam)(*models_pkg.TripResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tripsParam |  ``` Required ```  | Group ID, vehicle ID and time range to query. |


#### Example Usage

```go
accessToken := "access_token"
var tripsParam *models_pkg.TripsParam

var result *models_pkg.TripResponse
result,_ = fleet.CreateGetFleetTrips(accessToken, tripsParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_vehicles"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.UpdateVehicles") UpdateVehicles

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.


```go
func (me *FLEET_IMPL) UpdateVehicles(
            accessToken string,
            vehicleUpdateParam *models_pkg.VehicleUpdateParam)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleUpdateParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var vehicleUpdateParam *models_pkg.VehicleUpdateParam

var result 
result,_ = fleet.UpdateVehicles(accessToken, vehicleUpdateParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_maintenance_list"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetMaintenanceList") CreateGetFleetMaintenanceList

> Get list of the vehicles with any engine faults or check light data.


```go
func (me *FLEET_IMPL) CreateGetFleetMaintenanceList(
            accessToken string,
            groupParam *models_pkg.GroupParam)(*models_pkg.GetFleetMaintenanceListResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```go
accessToken := "access_token"
var groupParam *models_pkg.GroupParam

var result *models_pkg.GetFleetMaintenanceListResponse
result,_ = fleet.CreateGetFleetMaintenanceList(accessToken, groupParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_driver_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDispatchRoutesByDriverId") GetDispatchRoutesByDriverId

> Fetch all of the dispatch routes for a given driver.


```go
func (me *FLEET_IMPL) GetDispatchRoutesByDriverId(
            accessToken string,
            driverId int64,
            endTime *int64,
            duration *int64)([]*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```go
accessToken := "access_token"
driverId,_ := strconv.ParseInt("175", 10, 8)
endTime,_ := strconv.ParseInt("175", 10, 8)
duration,_ := strconv.ParseInt("175", 10, 8)

var result []*models_pkg.DispatchRoute
result,_ = fleet.GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dvir"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateDvir") CreateDvir

> Create a new dvir, marking a vehicle or trailer safe or unsafe.


```go
func (me *FLEET_IMPL) CreateDvir(
            accessToken string,
            createDvirParam *models_pkg.CreateDvirParam)(*models_pkg.DvirBase,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDvirParam |  ``` Required ```  | DVIR creation body |


#### Example Usage

```go
accessToken := "access_token"
var createDvirParam *models_pkg.CreateDvirParam

var result *models_pkg.DvirBase
result,_ = fleet.CreateDvir(accessToken, createDvirParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDriverSafetyScore") GetDriverSafetyScore

> Fetch the safety score for the driver.


```go
func (me *FLEET_IMPL) GetDriverSafetyScore(
            accessToken string,
            startMs int64,
            endMs int64,
            driverId int64)(*models_pkg.DriverSafetyScoreResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| driverId |  ``` Required ```  | ID of the driver |


#### Example Usage

```go
accessToken := "access_token"
startMs,_ := strconv.ParseInt("175", 10, 8)
endMs,_ := strconv.ParseInt("175", 10, 8)
driverId,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.DriverSafetyScoreResponse
result,_ = fleet.GetDriverSafetyScore(accessToken, startMs, endMs, driverId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_locations"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetLocations") CreateGetFleetLocations

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


```go
func (me *FLEET_IMPL) CreateGetFleetLocations(
            accessToken string,
            groupParam *models_pkg.GroupParam)(*models_pkg.GetFleetLocationsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```go
accessToken := "access_token"
var groupParam *models_pkg.GroupParam

var result *models_pkg.GetFleetLocationsResponse
result,_ = fleet.CreateGetFleetLocations(accessToken, groupParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs_summary"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetHosLogsSummary") CreateGetFleetHosLogsSummary

> Get the current HOS status for all drivers in the group.


```go
func (me *FLEET_IMPL) CreateGetFleetHosLogsSummary(
            accessToken string,
            hosLogsParam *models_pkg.HosLogsParam2)(*models_pkg.HosLogsSummaryResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var hosLogsParam *models_pkg.HosLogsParam2

var result *models_pkg.HosLogsSummaryResponse
result,_ = fleet.CreateGetFleetHosLogsSummary(accessToken, hosLogsParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetHosLogs") CreateGetFleetHosLogs

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


```go
func (me *FLEET_IMPL) CreateGetFleetHosLogs(
            accessToken string,
            hosLogsParam *models_pkg.HosLogsParam)(*models_pkg.HosLogsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var hosLogsParam *models_pkg.HosLogsParam

var result *models_pkg.HosLogsResponse
result,_ = fleet.CreateGetFleetHosLogs(accessToken, hosLogsParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_authentication_logs"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetHosAuthenticationLogs") CreateGetFleetHosAuthenticationLogs

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


```go
func (me *FLEET_IMPL) CreateGetFleetHosAuthenticationLogs(
            accessToken string,
            hosAuthenticationLogsParam *models_pkg.HosAuthenticationLogsParam)(*models_pkg.HosAuthenticationLogsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosAuthenticationLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var hosAuthenticationLogsParam *models_pkg.HosAuthenticationLogsParam

var result *models_pkg.HosAuthenticationLogsResponse
result,_ = fleet.CreateGetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_summary"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetDriversSummary") CreateGetFleetDriversSummary

> Get the distance and time each driver in an organization has driven in a given time period.


```go
func (me *FLEET_IMPL) CreateGetFleetDriversSummary(
            accessToken string,
            driversSummaryParam *models_pkg.DriversSummaryParam,
            snapToDayBounds *bool)(*models_pkg.DriversSummaryResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driversSummaryParam |  ``` Required ```  | Org ID and time range to query. |
| snapToDayBounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |


#### Example Usage

```go
accessToken := "access_token"
var driversSummaryParam *models_pkg.DriversSummaryParam
snapToDayBounds := true

var result *models_pkg.DriversSummaryResponse
result,_ = fleet.CreateGetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_stats"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetVehicleStats") GetVehicleStats

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


```go
func (me *FLEET_IMPL) GetVehicleStats(
            accessToken string,
            startMs int64,
            endMs int64,
            series models_pkg.SeriesEnum,
            tagIds *string,
            startingAfter *string,
            endingBefore *string,
            limit *int64)(*models_pkg.GetVehicleStatsResponse,error)
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

```go
accessToken := "access_token"
startMs,_ := strconv.ParseInt("175", 10, 8)
endMs,_ := strconv.ParseInt("175", 10, 8)
series := models_pkg.series_ENGINESTATE
tagIds := "tagIds"
startingAfter := "startingAfter"
endingBefore := "endingBefore"
limit,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.GetVehicleStatsResponse
result,_ = fleet.GetVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_reactivate_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.UpdateReactivateDriverById") UpdateReactivateDriverById

> Reactivate the inactive driver having id.


```go
func (me *FLEET_IMPL) UpdateReactivateDriverById(
            reactivateDriverParam *models_pkg.ReactivateDriverParam,
            accessToken string,
            driverIdOrExternalId string)(*models_pkg.Driver,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivateDriverParam |  ``` Required ```  | Driver reactivation body |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```go
var reactivateDriverParam *models_pkg.ReactivateDriverParam
accessToken := "access_token"
driverIdOrExternalId := "driver_id_or_external_id"

var result *models_pkg.Driver
result,_ = fleet.UpdateReactivateDriverById(reactivateDriverParam, accessToken, driverIdOrExternalId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_documents_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDriverDocumentsByOrgId") GetDriverDocumentsByOrgId

> Fetch all of the documents.


```go
func (me *FLEET_IMPL) GetDriverDocumentsByOrgId(
            accessToken string,
            endMs *int64,
            durationMs *int64)([]*models_pkg.Document,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| durationMs |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |


#### Example Usage

```go
accessToken := "access_token"
endMs,_ := strconv.ParseInt("175", 10, 8)
durationMs,_ := strconv.ParseInt("175", 10, 8)

var result []*models_pkg.Document
result,_ = fleet.GetDriverDocumentsByOrgId(accessToken, endMs, durationMs)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_deactivate_driver"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.DeleteDeactivateDriver") DeleteDeactivateDriver

> Deactivate a driver with the given id.


```go
func (me *FLEET_IMPL) DeleteDeactivateDriver(
            accessToken string,
            driverIdOrExternalId string)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```go
accessToken := "access_token"
driverIdOrExternalId := "driver_id_or_external_id"

var result 
result,_ = fleet.DeleteDeactivateDriver(accessToken, driverIdOrExternalId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_route_history"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDispatchRouteHistory") GetDispatchRouteHistory

> Fetch the history of a dispatch route.


```go
func (me *FLEET_IMPL) GetDispatchRouteHistory(
            accessToken string,
            routeId int64,
            startTime *int64,
            endTime *int64)(*models_pkg.DispatchRouteHistory,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the route with history. |
| startTime |  ``` Optional ```  | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. |
| endTime |  ``` Optional ```  | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. |


#### Example Usage

```go
accessToken := "access_token"
routeId,_ := strconv.ParseInt("175", 10, 8)
startTime,_ := strconv.ParseInt("175", 10, 8)
endTime,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.DispatchRouteHistory
result,_ = fleet.GetDispatchRouteHistory(accessToken, routeId, startTime, endTime)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.UpdateDispatchRouteById") UpdateDispatchRouteById

> Update a dispatch route and its associated jobs.


```go
func (me *FLEET_IMPL) UpdateDispatchRouteById(
            updateDispatchRouteParams *models_pkg.DispatchRoute,
            accessToken string,
            routeId int64)(*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```go
var updateDispatchRouteParams *models_pkg.DispatchRoute
accessToken := "access_token"
routeId,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.DispatchRoute
result,_ = fleet.UpdateDispatchRouteById(updateDispatchRouteParams, accessToken, routeId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="fetch_all_route_job_updates"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.FetchAllRouteJobUpdates") FetchAllRouteJobUpdates

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


```go
func (me *FLEET_IMPL) FetchAllRouteJobUpdates(
            accessToken string,
            groupId *int64,
            sequenceId *string,
            include *string)(*models_pkg.AllRouteJobUpdates,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| sequenceId |  ``` Optional ```  | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. |
| include |  ``` Optional ```  | Optionally set include=route to include route object in response payload. |


#### Example Usage

```go
accessToken := "access_token"
groupId,_ := strconv.ParseInt("175", 10, 8)
sequenceId := "sequence_id"
include := "include"

var result *models_pkg.AllRouteJobUpdates
result,_ = fleet.FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="fetch_all_dispatch_routes"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.FetchAllDispatchRoutes") FetchAllDispatchRoutes

> Fetch all of the dispatch routes for the group.


```go
func (me *FLEET_IMPL) FetchAllDispatchRoutes(
            accessToken string,
            groupId *int64,
            endTime *int64,
            duration *int64)([]*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```go
accessToken := "access_token"
groupId,_ := strconv.ParseInt("175", 10, 8)
endTime,_ := strconv.ParseInt("175", 10, 8)
duration,_ := strconv.ParseInt("175", 10, 8)

var result []*models_pkg.DispatchRoute
result,_ = fleet.FetchAllDispatchRoutes(accessToken, groupId, endTime, duration)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_reefer"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetAssetReefer") GetAssetReefer

> Fetch the reefer-specific stats of an asset.


```go
func (me *FLEET_IMPL) GetAssetReefer(
            accessToken string,
            assetId int64,
            startMs int64,
            endMs int64)(*models_pkg.AssetReeferResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```go
accessToken := "access_token"
assetId,_ := strconv.ParseInt("175", 10, 8)
startMs,_ := strconv.ParseInt("175", 10, 8)
endMs,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.AssetReeferResponse
result,_ = fleet.GetAssetReefer(accessToken, assetId, startMs, endMs)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_location"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetAssetLocation") GetAssetLocation

> Fetch the historical locations for the asset.


```go
func (me *FLEET_IMPL) GetAssetLocation(
            accessToken string,
            assetId int64,
            startMs int64,
            endMs int64)([]*models_pkg.AssetLocationResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```go
accessToken := "access_token"
assetId,_ := strconv.ParseInt("175", 10, 8)
startMs,_ := strconv.ParseInt("175", 10, 8)
endMs,_ := strconv.ParseInt("175", 10, 8)

var result []*models_pkg.AssetLocationResponse
result,_ = fleet.GetAssetLocation(accessToken, assetId, startMs, endMs)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDriverById") GetDriverById

> Fetch driver by id.


```go
func (me *FLEET_IMPL) GetDriverById(
            accessToken string,
            driverIdOrExternalId string)(*models_pkg.Driver,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```go
accessToken := "access_token"
driverIdOrExternalId := "driver_id_or_external_id"

var result *models_pkg.Driver
result,_ = fleet.GetDriverById(accessToken, driverIdOrExternalId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_deactivated_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDeactivatedDriverById") GetDeactivatedDriverById

> Fetch deactivated driver by id.


```go
func (me *FLEET_IMPL) GetDeactivatedDriverById(
            accessToken string,
            driverIdOrExternalId string)(*models_pkg.Driver,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```go
accessToken := "access_token"
driverIdOrExternalId := "driver_id_or_external_id"

var result *models_pkg.Driver
result,_ = fleet.GetDeactivatedDriverById(accessToken, driverIdOrExternalId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_deactivated_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetAllDeactivatedDrivers") GetAllDeactivatedDrivers

> Fetch all deactivated drivers for the group.


```go
func (me *FLEET_IMPL) GetAllDeactivatedDrivers(
            accessToken string,
            groupId *int64)([]*models_pkg.Driver,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```go
accessToken := "access_token"
groupId,_ := strconv.ParseInt("175", 10, 8)

var result []*models_pkg.Driver
result,_ = fleet.GetAllDeactivatedDrivers(accessToken, groupId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateDriver") CreateDriver

> Create a new driver.


```go
func (me *FLEET_IMPL) CreateDriver(
            accessToken string,
            createDriverParam *models_pkg.DriverForCreate)(*models_pkg.Driver,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDriverParam |  ``` Required ```  | Driver creation body |


#### Example Usage

```go
accessToken := "access_token"
var createDriverParam *models_pkg.DriverForCreate

var result *models_pkg.Driver
result,_ = fleet.CreateDriver(accessToken, createDriverParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateGetFleetDrivers") CreateGetFleetDrivers

> Get all the drivers for the specified group.


```go
func (me *FLEET_IMPL) CreateGetFleetDrivers(
            accessToken string,
            groupDriversParam *models_pkg.GroupDriversParam)(*models_pkg.DriversResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupDriversParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var groupDriversParam *models_pkg.GroupDriversParam

var result *models_pkg.DriversResponse
result,_ = fleet.CreateGetFleetDrivers(accessToken, groupDriversParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.DeleteDispatchRouteById") DeleteDispatchRouteById

> Delete a dispatch route and its associated jobs.


```go
func (me *FLEET_IMPL) DeleteDispatchRouteById(
            accessToken string,
            routeId int64)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```go
accessToken := "access_token"
routeId,_ := strconv.ParseInt("175", 10, 8)

var result 
result,_ = fleet.DeleteDispatchRouteById(accessToken, routeId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetDispatchRouteById") GetDispatchRouteById

> Fetch a dispatch route by id.


```go
func (me *FLEET_IMPL) GetDispatchRouteById(
            accessToken string,
            routeId int64)(*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```go
accessToken := "access_token"
routeId,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.DispatchRoute
result,_ = fleet.GetDispatchRouteById(accessToken, routeId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.CreateDispatchRoute") CreateDispatchRoute

> Create a new dispatch route.


```go
func (me *FLEET_IMPL) CreateDispatchRoute(
            accessToken string,
            createDispatchRouteParams *models_pkg.DispatchRouteCreate)(*models_pkg.DispatchRoute,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var createDispatchRouteParams *models_pkg.DispatchRouteCreate

var result *models_pkg.DispatchRoute
result,_ = fleet.CreateDispatchRoute(accessToken, createDispatchRouteParams)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_asset_current_locations"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetAllAssetCurrentLocations") GetAllAssetCurrentLocations

> Fetch current locations of all assets for the group.


```go
func (me *FLEET_IMPL) GetAllAssetCurrentLocations(accessToken string)(*models_pkg.GetAllAssetCurrentLocationsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```go
accessToken := "access_token"

var result *models_pkg.GetAllAssetCurrentLocationsResponse
result,_ = fleet.GetAllAssetCurrentLocations(accessToken)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_assets"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetAllAssets") GetAllAssets

> Fetch all of the assets for the group.


```go
func (me *FLEET_IMPL) GetAllAssets(accessToken string)(*models_pkg.GetAllAssetsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```go
accessToken := "access_token"

var result *models_pkg.GetAllAssetsResponse
result,_ = fleet.GetAllAssets(accessToken)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_fleet_address"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.AddFleetAddress") AddFleetAddress

> This method adds an address book entry to the specified group.


```go
func (me *FLEET_IMPL) AddFleetAddress(
            accessToken string,
            addressParam *models_pkg.AddressParam)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```go
accessToken := "access_token"
var addressParam *models_pkg.AddressParam

var result 
result,_ = fleet.AddFleetAddress(accessToken, addressParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_contact"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetOrganizationContact") GetOrganizationContact

> Fetch a contact by its id.


```go
func (me *FLEET_IMPL) GetOrganizationContact(
            accessToken string,
            contactId int64)(*models_pkg.Contact,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| contactId |  ``` Required ```  | ID of the contact |


#### Example Usage

```go
accessToken := "access_token"
contactId,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.Contact
result,_ = fleet.GetOrganizationContact(accessToken, contactId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_contacts"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.ListContacts") ListContacts

> Fetch all contacts for the organization.


```go
func (me *FLEET_IMPL) ListContacts(accessToken string)([]*models_pkg.Contact,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```go
accessToken := "access_token"

var result []*models_pkg.Contact
result,_ = fleet.ListContacts(accessToken)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.DeleteOrganizationAddress") DeleteOrganizationAddress

> Delete an address.


```go
func (me *FLEET_IMPL) DeleteOrganizationAddress(
            accessToken string,
            addressId int64)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```go
accessToken := "access_token"
addressId,_ := strconv.ParseInt("175", 10, 8)

var result 
result,_ = fleet.DeleteOrganizationAddress(accessToken, addressId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetOrganizationAddress") GetOrganizationAddress

> Fetch an address by its id.


```go
func (me *FLEET_IMPL) GetOrganizationAddress(
            accessToken string,
            addressId int64)(*models_pkg.Address,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```go
accessToken := "access_token"
addressId,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.Address
result,_ = fleet.GetOrganizationAddress(accessToken, addressId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.UpdateOrganizationAddress") UpdateOrganizationAddress

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


```go
func (me *FLEET_IMPL) UpdateOrganizationAddress(
            accessToken string,
            address *models_pkg.Address1,
            addressId int64)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```go
accessToken := "access_token"
var address *models_pkg.Address1
addressId,_ := strconv.ParseInt("175", 10, 8)

var result 
result,_ = fleet.UpdateOrganizationAddress(accessToken, address, addressId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.GetOrganizationAddresses") GetOrganizationAddresses

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


```go
func (me *FLEET_IMPL) GetOrganizationAddresses(accessToken string)([]*models_pkg.Address,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```go
accessToken := "access_token"

var result []*models_pkg.Address
result,_ = fleet.GetOrganizationAddresses(accessToken)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".fleet_pkg.AddOrganizationAddresses") AddOrganizationAddresses

> Add one or more addresses to the organization


```go
func (me *FLEET_IMPL) AddOrganizationAddresses(
            accessToken string,
            addresses *models_pkg.Addresses)([]*models_pkg.Address,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |


#### Example Usage

```go
accessToken := "access_token"
var addresses *models_pkg.Addresses

var result []*models_pkg.Address
result,_ = fleet.AddOrganizationAddresses(accessToken, addresses)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="users_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".users_pkg") users_pkg

### Get instance

Factory for the ``` USERS ``` interface can be accessed from the package users_pkg.

```go
users := users_pkg.NewUSERS()
```

### <a name="delete_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".users_pkg.DeleteUserById") DeleteUserById

> Remove a user from the organization.


```go
func (me *USERS_IMPL) DeleteUserById(
            accessToken string,
            userId int64)(,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |


#### Example Usage

```go
accessToken := "access_token"
userId,_ := strconv.ParseInt("175", 10, 8)

var result 
result,_ = users.DeleteUserById(accessToken, userId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".users_pkg.GetUserById") GetUserById

> Get a user.


```go
func (me *USERS_IMPL) GetUserById(
            accessToken string,
            userId int64)(*models_pkg.User,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |


#### Example Usage

```go
accessToken := "access_token"
userId,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.User
result,_ = users.GetUserById(accessToken, userId)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_users"></a>![Method: ](https://apidocs.io/img/method.png ".users_pkg.ListUsers") ListUsers

> List all users in the organization.


```go
func (me *USERS_IMPL) ListUsers(accessToken string)([]*models_pkg.User,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```go
accessToken := "access_token"

var result []*models_pkg.User
result,_ = users.ListUsers(accessToken)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_user_roles"></a>![Method: ](https://apidocs.io/img/method.png ".users_pkg.ListUserRoles") ListUserRoles

> Get all roles in the organization.


```go
func (me *USERS_IMPL) ListUserRoles(accessToken string)([]*models_pkg.UserRole,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```go
accessToken := "access_token"

var result []*models_pkg.UserRole
result,_ = users.ListUserRoles(accessToken)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".industrial_pkg") industrial_pkg

### Get instance

Factory for the ``` INDUSTRIAL ``` interface can be accessed from the package industrial_pkg.

```go
industrial := industrial_pkg.NewINDUSTRIAL()
```

### <a name="get_data_input"></a>![Method: ](https://apidocs.io/img/method.png ".industrial_pkg.GetDataInput") GetDataInput

> Fetch datapoints from a given data input.


```go
func (me *INDUSTRIAL_IMPL) GetDataInput(
            accessToken string,
            dataInputId int64,
            startMs *int64,
            endMs *int64)(*models_pkg.DataInputHistoryResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| dataInputId |  ``` Required ```  | ID of the data input |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```go
accessToken := "access_token"
dataInputId,_ := strconv.ParseInt("175", 10, 8)
startMs,_ := strconv.ParseInt("175", 10, 8)
endMs,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.DataInputHistoryResponse
result,_ = industrial.GetDataInput(accessToken, dataInputId, startMs, endMs)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_data_inputs"></a>![Method: ](https://apidocs.io/img/method.png ".industrial_pkg.GetAllDataInputs") GetAllDataInputs

> Fetch all of the data inputs for a group.


```go
func (me *INDUSTRIAL_IMPL) GetAllDataInputs(
            accessToken string,
            groupId *int64,
            startMs *int64,
            endMs *int64)(*models_pkg.GetAllDataInputsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```go
accessToken := "access_token"
groupId,_ := strconv.ParseInt("175", 10, 8)
startMs,_ := strconv.ParseInt("175", 10, 8)
endMs,_ := strconv.ParseInt("175", 10, 8)

var result *models_pkg.GetAllDataInputsResponse
result,_ = industrial.GetAllDataInputs(accessToken, groupId, startMs, endMs)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines"></a>![Method: ](https://apidocs.io/img/method.png ".industrial_pkg.CreateGetMachines") CreateGetMachines

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


```go
func (me *INDUSTRIAL_IMPL) CreateGetMachines(
            accessToken string,
            groupParam *models_pkg.GroupParam)(*models_pkg.GetMachinesResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```go
accessToken := "access_token"
var groupParam *models_pkg.GroupParam

var result *models_pkg.GetMachinesResponse
result,_ = industrial.CreateGetMachines(accessToken, groupParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines_history"></a>![Method: ](https://apidocs.io/img/method.png ".industrial_pkg.CreateGetMachinesHistory") CreateGetMachinesHistory

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group


```go
func (me *INDUSTRIAL_IMPL) CreateGetMachinesHistory(
            accessToken string,
            historyParam *models_pkg.HistoryParam)(*models_pkg.MachineHistoryResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID and time range to query for events |


#### Example Usage

```go
accessToken := "access_token"
var historyParam *models_pkg.HistoryParam

var result *models_pkg.MachineHistoryResponse
result,_ = industrial.CreateGetMachinesHistory(accessToken, historyParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_pkg"></a>![Class: ](https://apidocs.io/img/class.png ".sensors_pkg") sensors_pkg

### Get instance

Factory for the ``` SENSORS ``` interface can be accessed from the package sensors_pkg.

```go
sensors := sensors_pkg.NewSENSORS()
```

### <a name="create_get_sensors_temperature"></a>![Method: ](https://apidocs.io/img/method.png ".sensors_pkg.CreateGetSensorsTemperature") CreateGetSensorsTemperature

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


```go
func (me *SENSORS_IMPL) CreateGetSensorsTemperature(
            accessToken string,
            sensorParam *models_pkg.SensorParam)(*models_pkg.TemperatureResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```go
accessToken := "access_token"
var sensorParam *models_pkg.SensorParam

var result *models_pkg.TemperatureResponse
result,_ = sensors.CreateGetSensorsTemperature(accessToken, sensorParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors"></a>![Method: ](https://apidocs.io/img/method.png ".sensors_pkg.CreateGetSensors") CreateGetSensors

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


```go
func (me *SENSORS_IMPL) CreateGetSensors(
            accessToken string,
            groupParam *models_pkg.GroupParam)(*models_pkg.GetSensorsResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```go
accessToken := "access_token"
var groupParam *models_pkg.GroupParam

var result *models_pkg.GetSensorsResponse
result,_ = sensors.CreateGetSensors(accessToken, groupParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_humidity"></a>![Method: ](https://apidocs.io/img/method.png ".sensors_pkg.CreateGetSensorsHumidity") CreateGetSensorsHumidity

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


```go
func (me *SENSORS_IMPL) CreateGetSensorsHumidity(
            accessToken string,
            sensorParam *models_pkg.SensorParam)(*models_pkg.HumidityResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```go
accessToken := "access_token"
var sensorParam *models_pkg.SensorParam

var result *models_pkg.HumidityResponse
result,_ = sensors.CreateGetSensorsHumidity(accessToken, sensorParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_history"></a>![Method: ](https://apidocs.io/img/method.png ".sensors_pkg.CreateGetSensorsHistory") CreateGetSensorsHistory

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


```go
func (me *SENSORS_IMPL) CreateGetSensorsHistory(
            accessToken string,
            historyParam *models_pkg.HistoryParam1)(*models_pkg.SensorHistoryResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |


#### Example Usage

```go
accessToken := "access_token"
var historyParam *models_pkg.HistoryParam1

var result *models_pkg.SensorHistoryResponse
result,_ = sensors.CreateGetSensorsHistory(accessToken, historyParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_door"></a>![Method: ](https://apidocs.io/img/method.png ".sensors_pkg.CreateGetSensorsDoor") CreateGetSensorsDoor

> Get door monitor status (closed / open) for requested sensors.


```go
func (me *SENSORS_IMPL) CreateGetSensorsDoor(
            accessToken string,
            sensorParam *models_pkg.SensorParam)(*models_pkg.DoorResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```go
accessToken := "access_token"
var sensorParam *models_pkg.SensorParam

var result *models_pkg.DoorResponse
result,_ = sensors.CreateGetSensorsDoor(accessToken, sensorParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_cargo"></a>![Method: ](https://apidocs.io/img/method.png ".sensors_pkg.CreateGetSensorsCargo") CreateGetSensorsCargo

> Get cargo monitor status (empty / full) for requested sensors.


```go
func (me *SENSORS_IMPL) CreateGetSensorsCargo(
            accessToken string,
            sensorParam *models_pkg.SensorParam)(*models_pkg.CargoResponse,error)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```go
accessToken := "access_token"
var sensorParam *models_pkg.SensorParam

var result *models_pkg.CargoResponse
result,_ = sensors.CreateGetSensorsCargo(accessToken, sensorParam)

```

#### Errors
 
| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)



