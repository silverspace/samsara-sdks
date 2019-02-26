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

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

* Browse to locate the folder containing the source code. Select the location of the SamsaraAPI gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

## How to Use

The following section explains how to use the SamsaraAPI library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':SamsaraAPILib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':SamsaraAPILib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=Samsara%20API&workspaceName=SamsaraAPI&projectName=SamsaraAPILib&rootNamespace=com.samsara.api)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > SamsaraAPILib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accessToken | API Access Token |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String accessToken = "accessToken"; // API Access Token

com.samsara.api.Configuration.initialize(appContext);
SamsaraAPIClient client = new SamsaraAPIClient(accessToken);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [TagsController](#tags_controller)
* [FleetController](#fleet_controller)
* [UsersController](#users_controller)
* [IndustrialController](#industrial_controller)
* [SensorsController](#sensors_controller)

## <a name="tags_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.samsara.api.controllers.TagsController") TagsController

### Get singleton instance

The singleton instance of the ``` TagsController ``` class can be accessed from the API Client.

```java
TagsController tags = client.getTags();
```

### <a name="delete_tag_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.TagsController.deleteTagByIdAsync") deleteTagByIdAsync

> Permanently deletes a tag.


```java
void deleteTagByIdAsync(
        final String accessToken,
        final long tagId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |


#### Example Usage

```java
String accessToken = "access_token";
long tagId = 18;
// Invoking the API call with sample inputs
tags.deleteTagByIdAsync(accessToken, tagId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_tag_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.TagsController.getTagByIdAsync") getTagByIdAsync

> Fetch a tag by id.


```java
void getTagByIdAsync(
        final String accessToken,
        final long tagId,
        final APICallBack<Tag> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |


#### Example Usage

```java
String accessToken = "access_token";
long tagId = 18;
// Invoking the API call with sample inputs
tags.getTagByIdAsync(accessToken, tagId, new APICallBack<Tag>() {
    public void onSuccess(HttpContext context, Tag response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="modify_tag_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.TagsController.modifyTagByIdAsync") modifyTagByIdAsync

> Add or delete specific members from a tag, or modify the name of a tag.


```java
void modifyTagByIdAsync(
        final String accessToken,
        final long tagId,
        final TagModify tagModifyParams,
        final APICallBack<Tag> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| tagModifyParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    long tagId = 18;
    TagModify tagModifyParams = new TagModify();
    // Invoking the API call with sample inputs
    tags.modifyTagByIdAsync(accessToken, tagId, tagModifyParams, new APICallBack<Tag>() {
        public void onSuccess(HttpContext context, Tag response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_tag_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.TagsController.createTagAsync") createTagAsync

> Create a new tag for the group.


```java
void createTagAsync(
        final String accessToken,
        final TagCreate tagCreateParams,
        final APICallBack<Tag> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagCreateParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    TagCreate tagCreateParams = new TagCreate();
    // Invoking the API call with sample inputs
    tags.createTagAsync(accessToken, tagCreateParams, new APICallBack<Tag>() {
        public void onSuccess(HttpContext context, Tag response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_tag_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.TagsController.updateTagByIdAsync") updateTagByIdAsync

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


```java
void updateTagByIdAsync(
        final String accessToken,
        final long tagId,
        final TagUpdate updateTagParams,
        final APICallBack<Tag> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| updateTagParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    long tagId = 18;
    TagUpdate updateTagParams = new TagUpdate();
    // Invoking the API call with sample inputs
    tags.updateTagByIdAsync(accessToken, tagId, updateTagParams, new APICallBack<Tag>() {
        public void onSuccess(HttpContext context, Tag response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_tags_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.TagsController.getAllTagsAsync") getAllTagsAsync

> Fetch all of the tags for a group.


```java
void getAllTagsAsync(
        final String accessToken,
        final Long groupId,
        final APICallBack<GetAllTagsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```java
String accessToken = "access_token";
Long groupId = 18;
// Invoking the API call with sample inputs
tags.getAllTagsAsync(accessToken, groupId, new APICallBack<GetAllTagsResponse>() {
    public void onSuccess(HttpContext context, GetAllTagsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.samsara.api.controllers.FleetController") FleetController

### Get singleton instance

The singleton instance of the ``` FleetController ``` class can be accessed from the API Client.

```java
FleetController fleet = client.getFleet();
```

### <a name="get_driver_document_types_by_org_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDriverDocumentTypesByOrgIdAsync") getDriverDocumentTypesByOrgIdAsync

> Fetch all of the document types.


```java
void getDriverDocumentTypesByOrgIdAsync(final APICallBack<List<DocumentType>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
fleet.getDriverDocumentTypesByOrgIdAsync(new APICallBack<List<DocumentType>>() {
    public void onSuccess(HttpContext context, List<DocumentType> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_locations_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getVehicleLocationsAsync") getVehicleLocationsAsync

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


```java
void getVehicleLocationsAsync(
        final String accessToken,
        final long vehicleId,
        final long startMs,
        final long endMs,
        final APICallBack<List<FleetVehicleLocation>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |


#### Example Usage

```java
String accessToken = "access_token";
long vehicleId = 18;
long startMs = 18;
long endMs = 18;
// Invoking the API call with sample inputs
fleet.getVehicleLocationsAsync(accessToken, vehicleId, startMs, endMs, new APICallBack<List<FleetVehicleLocation>>() {
    public void onSuccess(HttpContext context, List<FleetVehicleLocation> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_vehicle_dispatch_route_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createVehicleDispatchRouteAsync") createVehicleDispatchRouteAsync

> Create a new dispatch route for the vehicle with vehicle_id.


```java
void createVehicleDispatchRouteAsync(
        final DispatchRouteCreate createDispatchRouteParams,
        final String accessToken,
        final long vehicleId,
        final APICallBack<DispatchRoute> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |


#### Example Usage

```java
try {
    DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate();
    String accessToken = "access_token";
    long vehicleId = 18;
    // Invoking the API call with sample inputs
    fleet.createVehicleDispatchRouteAsync(createDispatchRouteParams, accessToken, vehicleId, new APICallBack<DispatchRoute>() {
        public void onSuccess(HttpContext context, DispatchRoute response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_vehicle_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDispatchRoutesByVehicleIdAsync") getDispatchRoutesByVehicleIdAsync

> Fetch all of the dispatch routes for a given vehicle.


```java
void getDispatchRoutesByVehicleIdAsync(
        final String accessToken,
        final long vehicleId,
        final Long endTime,
        final Long duration,
        final APICallBack<List<DispatchRoute>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```java
String accessToken = "access_token";
long vehicleId = 18;
Long endTime = 18;
Long duration = 18;
// Invoking the API call with sample inputs
fleet.getDispatchRoutesByVehicleIdAsync(accessToken, vehicleId, endTime, duration, new APICallBack<List<DispatchRoute>>() {
    public void onSuccess(HttpContext context, List<DispatchRoute> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="patch_fleet_vehicle_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.patchFleetVehicleAsync") patchFleetVehicleAsync

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


```java
void patchFleetVehicleAsync(
        final String accessToken,
        final String vehicleIdOrExternalId,
        final Data data,
        final APICallBack<FleetVehicleResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    String vehicleIdOrExternalId = "vehicle_id_or_external_id";
    Data data = new Data();
    // Invoking the API call with sample inputs
    fleet.patchFleetVehicleAsync(accessToken, vehicleIdOrExternalId, data, new APICallBack<FleetVehicleResponse>() {
        public void onSuccess(HttpContext context, FleetVehicleResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_safety_score_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getVehicleSafetyScoreAsync") getVehicleSafetyScoreAsync

> Fetch the safety score for the vehicle.


```java
void getVehicleSafetyScoreAsync(
        final String accessToken,
        final long startMs,
        final long endMs,
        final long vehicleId,
        final APICallBack<VehicleSafetyScoreResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| vehicleId |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```java
String accessToken = "access_token";
long startMs = 18;
long endMs = 18;
long vehicleId = 18;
// Invoking the API call with sample inputs
fleet.getVehicleSafetyScoreAsync(accessToken, startMs, endMs, vehicleId, new APICallBack<VehicleSafetyScoreResponse>() {
    public void onSuccess(HttpContext context, VehicleSafetyScoreResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_harsh_event_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getVehicleHarshEventAsync") getVehicleHarshEventAsync

> Fetch harsh event details for a vehicle.


```java
void getVehicleHarshEventAsync(
        final String accessToken,
        final long timestamp,
        final long vehicleId,
        final APICallBack<VehicleHarshEventResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicleId |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```java
String accessToken = "access_token";
long timestamp = 18;
long vehicleId = 18;
// Invoking the API call with sample inputs
fleet.getVehicleHarshEventAsync(accessToken, timestamp, vehicleId, new APICallBack<VehicleHarshEventResponse>() {
    public void onSuccess(HttpContext context, VehicleHarshEventResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicles_locations_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getVehiclesLocationsAsync") getVehiclesLocationsAsync

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


```java
void getVehiclesLocationsAsync(
        final String accessToken,
        final int startMs,
        final int endMs,
        final APICallBack<List<FleetVehiclesLocation>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |


#### Example Usage

```java
String accessToken = "access_token";
int startMs = 18;
int endMs = 18;
// Invoking the API call with sample inputs
fleet.getVehiclesLocationsAsync(accessToken, startMs, endMs, new APICallBack<List<FleetVehiclesLocation>>() {
    public void onSuccess(HttpContext context, List<FleetVehiclesLocation> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dvirs_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDvirsAsync") getDvirsAsync

> Get DVIRs for the org within provided time constraints


```java
void getDvirsAsync(
        final String accessToken,
        final int endMs,
        final int durationMs,
        final Integer groupId,
        final APICallBack<DvirListResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Required ```  | time in millis until the last dvir log. |
| durationMs |  ``` Required ```  | time in millis which corresponds to the duration before the end_ms. |
| groupId |  ``` Optional ```  | Group ID to query. |


#### Example Usage

```java
String accessToken = "access_token";
int endMs = 18;
int durationMs = 18;
Integer groupId = 18;
// Invoking the API call with sample inputs
fleet.getDvirsAsync(accessToken, endMs, durationMs, groupId, new APICallBack<DvirListResponse>() {
    public void onSuccess(HttpContext context, DvirListResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_fleet_vehicle_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getFleetVehicleAsync") getFleetVehicleAsync

> Gets a specific vehicle.


```java
void getFleetVehicleAsync(
        final String accessToken,
        final String vehicleIdOrExternalId,
        final APICallBack<FleetVehicleResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |


#### Example Usage

```java
String accessToken = "access_token";
String vehicleIdOrExternalId = "vehicle_id_or_external_id";
// Invoking the API call with sample inputs
fleet.getFleetVehicleAsync(accessToken, vehicleIdOrExternalId, new APICallBack<FleetVehicleResponse>() {
    public void onSuccess(HttpContext context, FleetVehicleResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_list_fleet_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createListFleetAsync") createListFleetAsync

> Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.


```java
void createListFleetAsync(
        final String accessToken,
        final GroupParam groupParam,
        final String startingAfter,
        final String endingBefore,
        final Long limit,
        final APICallBack<ListFleetResponse> callBack)
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

```java
try {
    String accessToken = "access_token";
    GroupParam groupParam = new GroupParam();
    String startingAfter = "startingAfter";
    String endingBefore = "endingBefore";
    Long limit = 18;
    // Invoking the API call with sample inputs
    fleet.createListFleetAsync(accessToken, groupParam, startingAfter, endingBefore, limit, new APICallBack<ListFleetResponse>() {
        public void onSuccess(HttpContext context, ListFleetResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_hos_daily_logs_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetDriversHosDailyLogsAsync") createGetFleetDriversHosDailyLogsAsync

> Get summarized daily HOS charts for a specified driver.


```java
void createGetFleetDriversHosDailyLogsAsync(
        final String accessToken,
        final long driverId,
        final HosLogsParam hosLogsParam,
        final APICallBack<DriverDailyLogResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with HOS logs. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    long driverId = 18;
    HosLogsParam hosLogsParam = new HosLogsParam();
    // Invoking the API call with sample inputs
    fleet.createGetFleetDriversHosDailyLogsAsync(accessToken, driverId, hosLogsParam, new APICallBack<DriverDailyLogResponse>() {
        public void onSuccess(HttpContext context, DriverDailyLogResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_document_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createDriverDocumentAsync") createDriverDocumentAsync

> Create a driver document for the given driver.


```java
void createDriverDocumentAsync(
        final DocumentCreate createDocumentParams,
        final String accessToken,
        final long driverId,
        final APICallBack<Document> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDocumentParams |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver for whom the document is created. |


#### Example Usage

```java
try {
    DocumentCreate createDocumentParams = new DocumentCreate();
    String accessToken = "access_token";
    long driverId = 18;
    // Invoking the API call with sample inputs
    fleet.createDriverDocumentAsync(createDocumentParams, accessToken, driverId, new APICallBack<Document>() {
        public void onSuccess(HttpContext context, Document response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_dispatch_route_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createDriverDispatchRouteAsync") createDriverDispatchRouteAsync

> Create a new dispatch route for the driver with driver_id.


```java
void createDriverDispatchRouteAsync(
        final DispatchRouteCreate createDispatchRouteParams,
        final String accessToken,
        final long driverId,
        final APICallBack<DispatchRoute> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |


#### Example Usage

```java
try {
    DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate();
    String accessToken = "access_token";
    long driverId = 18;
    // Invoking the API call with sample inputs
    fleet.createDriverDispatchRouteAsync(createDispatchRouteParams, accessToken, driverId, new APICallBack<DispatchRoute>() {
        public void onSuccess(HttpContext context, DispatchRoute response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_trips_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetTripsAsync") createGetFleetTripsAsync

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


```java
void createGetFleetTripsAsync(
        final String accessToken,
        final TripsParam tripsParam,
        final APICallBack<TripResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tripsParam |  ``` Required ```  | Group ID, vehicle ID and time range to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    TripsParam tripsParam = new TripsParam();
    // Invoking the API call with sample inputs
    fleet.createGetFleetTripsAsync(accessToken, tripsParam, new APICallBack<TripResponse>() {
        public void onSuccess(HttpContext context, TripResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_vehicles_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.updateVehiclesAsync") updateVehiclesAsync

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.


```java
void updateVehiclesAsync(
        final String accessToken,
        final VehicleUpdateParam vehicleUpdateParam,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleUpdateParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    VehicleUpdateParam vehicleUpdateParam = new VehicleUpdateParam();
    // Invoking the API call with sample inputs
    fleet.updateVehiclesAsync(accessToken, vehicleUpdateParam, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_maintenance_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetMaintenanceListAsync") createGetFleetMaintenanceListAsync

> Get list of the vehicles with any engine faults or check light data.


```java
void createGetFleetMaintenanceListAsync(
        final String accessToken,
        final GroupParam groupParam,
        final APICallBack<GetFleetMaintenanceListResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    GroupParam groupParam = new GroupParam();
    // Invoking the API call with sample inputs
    fleet.createGetFleetMaintenanceListAsync(accessToken, groupParam, new APICallBack<GetFleetMaintenanceListResponse>() {
        public void onSuccess(HttpContext context, GetFleetMaintenanceListResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_driver_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDispatchRoutesByDriverIdAsync") getDispatchRoutesByDriverIdAsync

> Fetch all of the dispatch routes for a given driver.


```java
void getDispatchRoutesByDriverIdAsync(
        final String accessToken,
        final long driverId,
        final Long endTime,
        final Long duration,
        final APICallBack<List<DispatchRoute>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```java
String accessToken = "access_token";
long driverId = 18;
Long endTime = 18;
Long duration = 18;
// Invoking the API call with sample inputs
fleet.getDispatchRoutesByDriverIdAsync(accessToken, driverId, endTime, duration, new APICallBack<List<DispatchRoute>>() {
    public void onSuccess(HttpContext context, List<DispatchRoute> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dvir_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createDvirAsync") createDvirAsync

> Create a new dvir, marking a vehicle or trailer safe or unsafe.


```java
void createDvirAsync(
        final String accessToken,
        final CreateDvirParam createDvirParam,
        final APICallBack<DvirBase> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDvirParam |  ``` Required ```  | DVIR creation body |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    CreateDvirParam createDvirParam = new CreateDvirParam();
    // Invoking the API call with sample inputs
    fleet.createDvirAsync(accessToken, createDvirParam, new APICallBack<DvirBase>() {
        public void onSuccess(HttpContext context, DvirBase response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_safety_score_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDriverSafetyScoreAsync") getDriverSafetyScoreAsync

> Fetch the safety score for the driver.


```java
void getDriverSafetyScoreAsync(
        final String accessToken,
        final long startMs,
        final long endMs,
        final long driverId,
        final APICallBack<DriverSafetyScoreResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| driverId |  ``` Required ```  | ID of the driver |


#### Example Usage

```java
String accessToken = "access_token";
long startMs = 109;
long endMs = 109;
long driverId = 109;
// Invoking the API call with sample inputs
fleet.getDriverSafetyScoreAsync(accessToken, startMs, endMs, driverId, new APICallBack<DriverSafetyScoreResponse>() {
    public void onSuccess(HttpContext context, DriverSafetyScoreResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_locations_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetLocationsAsync") createGetFleetLocationsAsync

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


```java
void createGetFleetLocationsAsync(
        final String accessToken,
        final GroupParam groupParam,
        final APICallBack<GetFleetLocationsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    GroupParam groupParam = new GroupParam();
    // Invoking the API call with sample inputs
    fleet.createGetFleetLocationsAsync(accessToken, groupParam, new APICallBack<GetFleetLocationsResponse>() {
        public void onSuccess(HttpContext context, GetFleetLocationsResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs_summary_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetHosLogsSummaryAsync") createGetFleetHosLogsSummaryAsync

> Get the current HOS status for all drivers in the group.


```java
void createGetFleetHosLogsSummaryAsync(
        final String accessToken,
        final HosLogsParam2 hosLogsParam,
        final APICallBack<HosLogsSummaryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    HosLogsParam2 hosLogsParam = new HosLogsParam2();
    // Invoking the API call with sample inputs
    fleet.createGetFleetHosLogsSummaryAsync(accessToken, hosLogsParam, new APICallBack<HosLogsSummaryResponse>() {
        public void onSuccess(HttpContext context, HosLogsSummaryResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetHosLogsAsync") createGetFleetHosLogsAsync

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


```java
void createGetFleetHosLogsAsync(
        final String accessToken,
        final HosLogsParam hosLogsParam,
        final APICallBack<HosLogsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    HosLogsParam hosLogsParam = new HosLogsParam();
    // Invoking the API call with sample inputs
    fleet.createGetFleetHosLogsAsync(accessToken, hosLogsParam, new APICallBack<HosLogsResponse>() {
        public void onSuccess(HttpContext context, HosLogsResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_authentication_logs_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetHosAuthenticationLogsAsync") createGetFleetHosAuthenticationLogsAsync

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


```java
void createGetFleetHosAuthenticationLogsAsync(
        final String accessToken,
        final HosAuthenticationLogsParam hosAuthenticationLogsParam,
        final APICallBack<HosAuthenticationLogsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosAuthenticationLogsParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    HosAuthenticationLogsParam hosAuthenticationLogsParam = new HosAuthenticationLogsParam();
    // Invoking the API call with sample inputs
    fleet.createGetFleetHosAuthenticationLogsAsync(accessToken, hosAuthenticationLogsParam, new APICallBack<HosAuthenticationLogsResponse>() {
        public void onSuccess(HttpContext context, HosAuthenticationLogsResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_summary_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetDriversSummaryAsync") createGetFleetDriversSummaryAsync

> Get the distance and time each driver in an organization has driven in a given time period.


```java
void createGetFleetDriversSummaryAsync(
        final String accessToken,
        final DriversSummaryParam driversSummaryParam,
        final Boolean snapToDayBounds,
        final APICallBack<DriversSummaryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driversSummaryParam |  ``` Required ```  | Org ID and time range to query. |
| snapToDayBounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    DriversSummaryParam driversSummaryParam = new DriversSummaryParam();
    Boolean snapToDayBounds = false;
    // Invoking the API call with sample inputs
    fleet.createGetFleetDriversSummaryAsync(accessToken, driversSummaryParam, snapToDayBounds, new APICallBack<DriversSummaryResponse>() {
        public void onSuccess(HttpContext context, DriversSummaryResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_stats_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getVehicleStatsAsync") getVehicleStatsAsync

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


```java
void getVehicleStatsAsync(
        final String accessToken,
        final int startMs,
        final int endMs,
        final SeriesEnum series,
        final String tagIds,
        final String startingAfter,
        final String endingBefore,
        final Long limit,
        final APICallBack<GetVehicleStatsResponse> callBack)
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

```java
String accessToken = "access_token";
int startMs = 109;
int endMs = 109;
SeriesEnum series = SeriesEnum.fromString("engineState");
String tagIds = "tagIds";
String startingAfter = "startingAfter";
String endingBefore = "endingBefore";
Long limit = 109;
// Invoking the API call with sample inputs
fleet.getVehicleStatsAsync(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, new APICallBack<GetVehicleStatsResponse>() {
    public void onSuccess(HttpContext context, GetVehicleStatsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_reactivate_driver_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.updateReactivateDriverByIdAsync") updateReactivateDriverByIdAsync

> Reactivate the inactive driver having id.


```java
void updateReactivateDriverByIdAsync(
        final ReactivateDriverParam reactivateDriverParam,
        final String accessToken,
        final String driverIdOrExternalId,
        final APICallBack<Driver> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivateDriverParam |  ``` Required ```  | Driver reactivation body |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```java
try {
    ReactivateDriverParam reactivateDriverParam = new ReactivateDriverParam();
    String accessToken = "access_token";
    String driverIdOrExternalId = "driver_id_or_external_id";
    // Invoking the API call with sample inputs
    fleet.updateReactivateDriverByIdAsync(reactivateDriverParam, accessToken, driverIdOrExternalId, new APICallBack<Driver>() {
        public void onSuccess(HttpContext context, Driver response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_documents_by_org_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDriverDocumentsByOrgIdAsync") getDriverDocumentsByOrgIdAsync

> Fetch all of the documents.


```java
void getDriverDocumentsByOrgIdAsync(
        final String accessToken,
        final Long endMs,
        final Long durationMs,
        final APICallBack<List<Document>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| durationMs |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |


#### Example Usage

```java
String accessToken = "access_token";
Long endMs = 109;
Long durationMs = 109;
// Invoking the API call with sample inputs
fleet.getDriverDocumentsByOrgIdAsync(accessToken, endMs, durationMs, new APICallBack<List<Document>>() {
    public void onSuccess(HttpContext context, List<Document> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_deactivate_driver_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.deleteDeactivateDriverAsync") deleteDeactivateDriverAsync

> Deactivate a driver with the given id.


```java
void deleteDeactivateDriverAsync(
        final String accessToken,
        final String driverIdOrExternalId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```java
String accessToken = "access_token";
String driverIdOrExternalId = "driver_id_or_external_id";
// Invoking the API call with sample inputs
fleet.deleteDeactivateDriverAsync(accessToken, driverIdOrExternalId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_route_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDispatchRouteHistoryAsync") getDispatchRouteHistoryAsync

> Fetch the history of a dispatch route.


```java
void getDispatchRouteHistoryAsync(
        final String accessToken,
        final long routeId,
        final Long startTime,
        final Long endTime,
        final APICallBack<DispatchRouteHistory> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the route with history. |
| startTime |  ``` Optional ```  | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. |
| endTime |  ``` Optional ```  | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. |


#### Example Usage

```java
String accessToken = "access_token";
long routeId = 109;
Long startTime = 109;
Long endTime = 109;
// Invoking the API call with sample inputs
fleet.getDispatchRouteHistoryAsync(accessToken, routeId, startTime, endTime, new APICallBack<DispatchRouteHistory>() {
    public void onSuccess(HttpContext context, DispatchRouteHistory response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_dispatch_route_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.updateDispatchRouteByIdAsync") updateDispatchRouteByIdAsync

> Update a dispatch route and its associated jobs.


```java
void updateDispatchRouteByIdAsync(
        final DispatchRoute updateDispatchRouteParams,
        final String accessToken,
        final long routeId,
        final APICallBack<DispatchRoute> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```java
try {
    DispatchRoute updateDispatchRouteParams = new DispatchRoute();
    String accessToken = "access_token";
    long routeId = 109;
    // Invoking the API call with sample inputs
    fleet.updateDispatchRouteByIdAsync(updateDispatchRouteParams, accessToken, routeId, new APICallBack<DispatchRoute>() {
        public void onSuccess(HttpContext context, DispatchRoute response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="fetch_all_route_job_updates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.fetchAllRouteJobUpdatesAsync") fetchAllRouteJobUpdatesAsync

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


```java
void fetchAllRouteJobUpdatesAsync(
        final String accessToken,
        final Long groupId,
        final String sequenceId,
        final String include,
        final APICallBack<AllRouteJobUpdates> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| sequenceId |  ``` Optional ```  | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. |
| include |  ``` Optional ```  | Optionally set include=route to include route object in response payload. |


#### Example Usage

```java
String accessToken = "access_token";
Long groupId = 109;
String sequenceId = "sequence_id";
String include = "include";
// Invoking the API call with sample inputs
fleet.fetchAllRouteJobUpdatesAsync(accessToken, groupId, sequenceId, include, new APICallBack<AllRouteJobUpdates>() {
    public void onSuccess(HttpContext context, AllRouteJobUpdates response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="fetch_all_dispatch_routes_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.fetchAllDispatchRoutesAsync") fetchAllDispatchRoutesAsync

> Fetch all of the dispatch routes for the group.


```java
void fetchAllDispatchRoutesAsync(
        final String accessToken,
        final Long groupId,
        final Long endTime,
        final Long duration,
        final APICallBack<List<DispatchRoute>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```java
String accessToken = "access_token";
Long groupId = 109;
Long endTime = 109;
Long duration = 109;
// Invoking the API call with sample inputs
fleet.fetchAllDispatchRoutesAsync(accessToken, groupId, endTime, duration, new APICallBack<List<DispatchRoute>>() {
    public void onSuccess(HttpContext context, List<DispatchRoute> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_reefer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getAssetReeferAsync") getAssetReeferAsync

> Fetch the reefer-specific stats of an asset.


```java
void getAssetReeferAsync(
        final String accessToken,
        final long assetId,
        final long startMs,
        final long endMs,
        final APICallBack<AssetReeferResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```java
String accessToken = "access_token";
long assetId = 109;
long startMs = 109;
long endMs = 109;
// Invoking the API call with sample inputs
fleet.getAssetReeferAsync(accessToken, assetId, startMs, endMs, new APICallBack<AssetReeferResponse>() {
    public void onSuccess(HttpContext context, AssetReeferResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_location_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getAssetLocationAsync") getAssetLocationAsync

> Fetch the historical locations for the asset.


```java
void getAssetLocationAsync(
        final String accessToken,
        final long assetId,
        final long startMs,
        final long endMs,
        final APICallBack<List<AssetLocationResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```java
String accessToken = "access_token";
long assetId = 109;
long startMs = 109;
long endMs = 109;
// Invoking the API call with sample inputs
fleet.getAssetLocationAsync(accessToken, assetId, startMs, endMs, new APICallBack<List<AssetLocationResponse>>() {
    public void onSuccess(HttpContext context, List<AssetLocationResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDriverByIdAsync") getDriverByIdAsync

> Fetch driver by id.


```java
void getDriverByIdAsync(
        final String accessToken,
        final String driverIdOrExternalId,
        final APICallBack<Driver> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```java
String accessToken = "access_token";
String driverIdOrExternalId = "driver_id_or_external_id";
// Invoking the API call with sample inputs
fleet.getDriverByIdAsync(accessToken, driverIdOrExternalId, new APICallBack<Driver>() {
    public void onSuccess(HttpContext context, Driver response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_deactivated_driver_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDeactivatedDriverByIdAsync") getDeactivatedDriverByIdAsync

> Fetch deactivated driver by id.


```java
void getDeactivatedDriverByIdAsync(
        final String accessToken,
        final String driverIdOrExternalId,
        final APICallBack<Driver> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```java
String accessToken = "access_token";
String driverIdOrExternalId = "driver_id_or_external_id";
// Invoking the API call with sample inputs
fleet.getDeactivatedDriverByIdAsync(accessToken, driverIdOrExternalId, new APICallBack<Driver>() {
    public void onSuccess(HttpContext context, Driver response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_deactivated_drivers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getAllDeactivatedDriversAsync") getAllDeactivatedDriversAsync

> Fetch all deactivated drivers for the group.


```java
void getAllDeactivatedDriversAsync(
        final String accessToken,
        final Long groupId,
        final APICallBack<List<Driver>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```java
String accessToken = "access_token";
Long groupId = 109;
// Invoking the API call with sample inputs
fleet.getAllDeactivatedDriversAsync(accessToken, groupId, new APICallBack<List<Driver>>() {
    public void onSuccess(HttpContext context, List<Driver> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createDriverAsync") createDriverAsync

> Create a new driver.


```java
void createDriverAsync(
        final String accessToken,
        final DriverForCreate createDriverParam,
        final APICallBack<Driver> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDriverParam |  ``` Required ```  | Driver creation body |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    DriverForCreate createDriverParam = new DriverForCreate();
    // Invoking the API call with sample inputs
    fleet.createDriverAsync(accessToken, createDriverParam, new APICallBack<Driver>() {
        public void onSuccess(HttpContext context, Driver response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createGetFleetDriversAsync") createGetFleetDriversAsync

> Get all the drivers for the specified group.


```java
void createGetFleetDriversAsync(
        final String accessToken,
        final GroupDriversParam groupDriversParam,
        final APICallBack<DriversResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupDriversParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    GroupDriversParam groupDriversParam = new GroupDriversParam();
    // Invoking the API call with sample inputs
    fleet.createGetFleetDriversAsync(accessToken, groupDriversParam, new APICallBack<DriversResponse>() {
        public void onSuccess(HttpContext context, DriversResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_dispatch_route_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.deleteDispatchRouteByIdAsync") deleteDispatchRouteByIdAsync

> Delete a dispatch route and its associated jobs.


```java
void deleteDispatchRouteByIdAsync(
        final String accessToken,
        final long routeId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```java
String accessToken = "access_token";
long routeId = 109;
// Invoking the API call with sample inputs
fleet.deleteDispatchRouteByIdAsync(accessToken, routeId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_route_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getDispatchRouteByIdAsync") getDispatchRouteByIdAsync

> Fetch a dispatch route by id.


```java
void getDispatchRouteByIdAsync(
        final String accessToken,
        final long routeId,
        final APICallBack<DispatchRoute> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```java
String accessToken = "access_token";
long routeId = 109;
// Invoking the API call with sample inputs
fleet.getDispatchRouteByIdAsync(accessToken, routeId, new APICallBack<DispatchRoute>() {
    public void onSuccess(HttpContext context, DispatchRoute response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dispatch_route_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.createDispatchRouteAsync") createDispatchRouteAsync

> Create a new dispatch route.


```java
void createDispatchRouteAsync(
        final String accessToken,
        final DispatchRouteCreate createDispatchRouteParams,
        final APICallBack<DispatchRoute> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    DispatchRouteCreate createDispatchRouteParams = new DispatchRouteCreate();
    // Invoking the API call with sample inputs
    fleet.createDispatchRouteAsync(accessToken, createDispatchRouteParams, new APICallBack<DispatchRoute>() {
        public void onSuccess(HttpContext context, DispatchRoute response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_asset_current_locations_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getAllAssetCurrentLocationsAsync") getAllAssetCurrentLocationsAsync

> Fetch current locations of all assets for the group.


```java
void getAllAssetCurrentLocationsAsync(
        final String accessToken,
        final APICallBack<GetAllAssetCurrentLocationsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```java
String accessToken = "access_token";
// Invoking the API call with sample inputs
fleet.getAllAssetCurrentLocationsAsync(accessToken, new APICallBack<GetAllAssetCurrentLocationsResponse>() {
    public void onSuccess(HttpContext context, GetAllAssetCurrentLocationsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_assets_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getAllAssetsAsync") getAllAssetsAsync

> Fetch all of the assets for the group.


```java
void getAllAssetsAsync(
        final String accessToken,
        final APICallBack<GetAllAssetsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```java
String accessToken = "access_token";
// Invoking the API call with sample inputs
fleet.getAllAssetsAsync(accessToken, new APICallBack<GetAllAssetsResponse>() {
    public void onSuccess(HttpContext context, GetAllAssetsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_fleet_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.addFleetAddressAsync") addFleetAddressAsync

> This method adds an address book entry to the specified group.


```java
void addFleetAddressAsync(
        final String accessToken,
        final AddressParam addressParam,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressParam |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    AddressParam addressParam = new AddressParam();
    // Invoking the API call with sample inputs
    fleet.addFleetAddressAsync(accessToken, addressParam, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_contact_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getOrganizationContactAsync") getOrganizationContactAsync

> Fetch a contact by its id.


```java
void getOrganizationContactAsync(
        final String accessToken,
        final long contactId,
        final APICallBack<Contact> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| contactId |  ``` Required ```  | ID of the contact |


#### Example Usage

```java
String accessToken = "access_token";
long contactId = 109;
// Invoking the API call with sample inputs
fleet.getOrganizationContactAsync(accessToken, contactId, new APICallBack<Contact>() {
    public void onSuccess(HttpContext context, Contact response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_contacts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.listContactsAsync") listContactsAsync

> Fetch all contacts for the organization.


```java
void listContactsAsync(
        final String accessToken,
        final APICallBack<List<Contact>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```java
String accessToken = "access_token";
// Invoking the API call with sample inputs
fleet.listContactsAsync(accessToken, new APICallBack<List<Contact>>() {
    public void onSuccess(HttpContext context, List<Contact> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_organization_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.deleteOrganizationAddressAsync") deleteOrganizationAddressAsync

> Delete an address.


```java
void deleteOrganizationAddressAsync(
        final String accessToken,
        final long addressId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```java
String accessToken = "access_token";
long addressId = 109;
// Invoking the API call with sample inputs
fleet.deleteOrganizationAddressAsync(accessToken, addressId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getOrganizationAddressAsync") getOrganizationAddressAsync

> Fetch an address by its id.


```java
void getOrganizationAddressAsync(
        final String accessToken,
        final long addressId,
        final APICallBack<Address> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```java
String accessToken = "access_token";
long addressId = 109;
// Invoking the API call with sample inputs
fleet.getOrganizationAddressAsync(accessToken, addressId, new APICallBack<Address>() {
    public void onSuccess(HttpContext context, Address response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_organization_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.updateOrganizationAddressAsync") updateOrganizationAddressAsync

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


```java
void updateOrganizationAddressAsync(
        final String accessToken,
        final Address1 address,
        final long addressId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| addressId |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    Address1 address = new Address1();
    long addressId = 109;
    // Invoking the API call with sample inputs
    fleet.updateOrganizationAddressAsync(accessToken, address, addressId, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_addresses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.getOrganizationAddressesAsync") getOrganizationAddressesAsync

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


```java
void getOrganizationAddressesAsync(
        final String accessToken,
        final APICallBack<List<Address>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```java
String accessToken = "access_token";
// Invoking the API call with sample inputs
fleet.getOrganizationAddressesAsync(accessToken, new APICallBack<List<Address>>() {
    public void onSuccess(HttpContext context, List<Address> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_organization_addresses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.FleetController.addOrganizationAddressesAsync") addOrganizationAddressesAsync

> Add one or more addresses to the organization


```java
void addOrganizationAddressesAsync(
        final String accessToken,
        final Addresses addresses,
        final APICallBack<List<Address>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    Addresses addresses = new Addresses();
    // Invoking the API call with sample inputs
    fleet.addOrganizationAddressesAsync(accessToken, addresses, new APICallBack<List<Address>>() {
        public void onSuccess(HttpContext context, List<Address> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.samsara.api.controllers.UsersController") UsersController

### Get singleton instance

The singleton instance of the ``` UsersController ``` class can be accessed from the API Client.

```java
UsersController users = client.getUsers();
```

### <a name="delete_user_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.UsersController.deleteUserByIdAsync") deleteUserByIdAsync

> Remove a user from the organization.


```java
void deleteUserByIdAsync(
        final String accessToken,
        final long userId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |


#### Example Usage

```java
String accessToken = "access_token";
long userId = 109;
// Invoking the API call with sample inputs
users.deleteUserByIdAsync(accessToken, userId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_user_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.UsersController.getUserByIdAsync") getUserByIdAsync

> Get a user.


```java
void getUserByIdAsync(
        final String accessToken,
        final long userId,
        final APICallBack<User> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |


#### Example Usage

```java
String accessToken = "access_token";
long userId = 201;
// Invoking the API call with sample inputs
users.getUserByIdAsync(accessToken, userId, new APICallBack<User>() {
    public void onSuccess(HttpContext context, User response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_users_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.UsersController.listUsersAsync") listUsersAsync

> List all users in the organization.


```java
void listUsersAsync(
        final String accessToken,
        final APICallBack<List<User>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```java
String accessToken = "access_token";
// Invoking the API call with sample inputs
users.listUsersAsync(accessToken, new APICallBack<List<User>>() {
    public void onSuccess(HttpContext context, List<User> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_user_roles_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.UsersController.listUserRolesAsync") listUserRolesAsync

> Get all roles in the organization.


```java
void listUserRolesAsync(
        final String accessToken,
        final APICallBack<List<UserRole>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```java
String accessToken = "access_token";
// Invoking the API call with sample inputs
users.listUserRolesAsync(accessToken, new APICallBack<List<UserRole>>() {
    public void onSuccess(HttpContext context, List<UserRole> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.samsara.api.controllers.IndustrialController") IndustrialController

### Get singleton instance

The singleton instance of the ``` IndustrialController ``` class can be accessed from the API Client.

```java
IndustrialController industrial = client.getIndustrial();
```

### <a name="get_data_input_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.IndustrialController.getDataInputAsync") getDataInputAsync

> Fetch datapoints from a given data input.


```java
void getDataInputAsync(
        final String accessToken,
        final long dataInputId,
        final Long startMs,
        final Long endMs,
        final APICallBack<DataInputHistoryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| dataInputId |  ``` Required ```  | ID of the data input |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```java
String accessToken = "access_token";
long dataInputId = 201;
Long startMs = 201;
Long endMs = 201;
// Invoking the API call with sample inputs
industrial.getDataInputAsync(accessToken, dataInputId, startMs, endMs, new APICallBack<DataInputHistoryResponse>() {
    public void onSuccess(HttpContext context, DataInputHistoryResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_data_inputs_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.IndustrialController.getAllDataInputsAsync") getAllDataInputsAsync

> Fetch all of the data inputs for a group.


```java
void getAllDataInputsAsync(
        final String accessToken,
        final Long groupId,
        final Long startMs,
        final Long endMs,
        final APICallBack<GetAllDataInputsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```java
String accessToken = "access_token";
Long groupId = 201;
Long startMs = 201;
Long endMs = 201;
// Invoking the API call with sample inputs
industrial.getAllDataInputsAsync(accessToken, groupId, startMs, endMs, new APICallBack<GetAllDataInputsResponse>() {
    public void onSuccess(HttpContext context, GetAllDataInputsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.IndustrialController.createGetMachinesAsync") createGetMachinesAsync

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


```java
void createGetMachinesAsync(
        final String accessToken,
        final GroupParam groupParam,
        final APICallBack<GetMachinesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    GroupParam groupParam = new GroupParam();
    // Invoking the API call with sample inputs
    industrial.createGetMachinesAsync(accessToken, groupParam, new APICallBack<GetMachinesResponse>() {
        public void onSuccess(HttpContext context, GetMachinesResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.IndustrialController.createGetMachinesHistoryAsync") createGetMachinesHistoryAsync

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group


```java
void createGetMachinesHistoryAsync(
        final String accessToken,
        final HistoryParam historyParam,
        final APICallBack<MachineHistoryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID and time range to query for events |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    HistoryParam historyParam = new HistoryParam();
    // Invoking the API call with sample inputs
    industrial.createGetMachinesHistoryAsync(accessToken, historyParam, new APICallBack<MachineHistoryResponse>() {
        public void onSuccess(HttpContext context, MachineHistoryResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.samsara.api.controllers.SensorsController") SensorsController

### Get singleton instance

The singleton instance of the ``` SensorsController ``` class can be accessed from the API Client.

```java
SensorsController sensors = client.getSensors();
```

### <a name="create_get_sensors_temperature_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.SensorsController.createGetSensorsTemperatureAsync") createGetSensorsTemperatureAsync

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


```java
void createGetSensorsTemperatureAsync(
        final String accessToken,
        final SensorParam sensorParam,
        final APICallBack<TemperatureResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    SensorParam sensorParam = new SensorParam();
    // Invoking the API call with sample inputs
    sensors.createGetSensorsTemperatureAsync(accessToken, sensorParam, new APICallBack<TemperatureResponse>() {
        public void onSuccess(HttpContext context, TemperatureResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.SensorsController.createGetSensorsAsync") createGetSensorsAsync

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


```java
void createGetSensorsAsync(
        final String accessToken,
        final GroupParam groupParam,
        final APICallBack<GetSensorsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    GroupParam groupParam = new GroupParam();
    // Invoking the API call with sample inputs
    sensors.createGetSensorsAsync(accessToken, groupParam, new APICallBack<GetSensorsResponse>() {
        public void onSuccess(HttpContext context, GetSensorsResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_humidity_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.SensorsController.createGetSensorsHumidityAsync") createGetSensorsHumidityAsync

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


```java
void createGetSensorsHumidityAsync(
        final String accessToken,
        final SensorParam sensorParam,
        final APICallBack<HumidityResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    SensorParam sensorParam = new SensorParam();
    // Invoking the API call with sample inputs
    sensors.createGetSensorsHumidityAsync(accessToken, sensorParam, new APICallBack<HumidityResponse>() {
        public void onSuccess(HttpContext context, HumidityResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.SensorsController.createGetSensorsHistoryAsync") createGetSensorsHistoryAsync

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


```java
void createGetSensorsHistoryAsync(
        final String accessToken,
        final HistoryParam1 historyParam,
        final APICallBack<SensorHistoryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    HistoryParam1 historyParam = new HistoryParam1();
    // Invoking the API call with sample inputs
    sensors.createGetSensorsHistoryAsync(accessToken, historyParam, new APICallBack<SensorHistoryResponse>() {
        public void onSuccess(HttpContext context, SensorHistoryResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_door_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.SensorsController.createGetSensorsDoorAsync") createGetSensorsDoorAsync

> Get door monitor status (closed / open) for requested sensors.


```java
void createGetSensorsDoorAsync(
        final String accessToken,
        final SensorParam sensorParam,
        final APICallBack<DoorResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    SensorParam sensorParam = new SensorParam();
    // Invoking the API call with sample inputs
    sensors.createGetSensorsDoorAsync(accessToken, sensorParam, new APICallBack<DoorResponse>() {
        public void onSuccess(HttpContext context, DoorResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_cargo_async"></a>![Method: ](https://apidocs.io/img/method.png "com.samsara.api.controllers.SensorsController.createGetSensorsCargoAsync") createGetSensorsCargoAsync

> Get cargo monitor status (empty / full) for requested sensors.


```java
void createGetSensorsCargoAsync(
        final String accessToken,
        final SensorParam sensorParam,
        final APICallBack<CargoResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```java
try {
    String accessToken = "access_token";
    SensorParam sensorParam = new SensorParam();
    // Invoking the API call with sample inputs
    sensors.createGetSensorsCargoAsync(accessToken, sensorParam, new APICallBack<CargoResponse>() {
        public void onSuccess(HttpContext context, CargoResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)



