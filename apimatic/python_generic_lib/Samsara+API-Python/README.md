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


You must have Python ```2 >=2.7.9``` or Python ```3 >=3.4``` installed on your system to install and run this SDK. This SDK package depends on other Python packages like nose, jsonpickle etc. 
These dependencies are defined in the ```requirements.txt``` file that comes with the SDK.
To resolve these dependencies, you can use the PIP Dependency manager. Install it by following steps at [https://pip.pypa.io/en/stable/installing/](https://pip.pypa.io/en/stable/installing/).

Python and PIP executables should be defined in your PATH. Open command prompt and type ```pip --version```.
This should display the version of the PIP Dependency Manager installed if your installation was successful and the paths are properly defined.

* Using command line, navigate to the directory containing the generated files (including ```requirements.txt```) for the SDK.
* Run the command ```pip install -r requirements.txt```. This should install all the required dependencies.

![Building SDK - Step 1](https://apidocs.io/illustration/python?step=installDependencies&workspaceFolder=Samsara%20API-Python)


## How to Use

The following section explains how to use the Samsaraapi SDK package in a new project.

### 1. Open Project in an IDE

Open up a Python IDE like PyCharm. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

![Open project in PyCharm - Step 1](https://apidocs.io/illustration/python?step=pyCharm)

Click on ```Open``` in PyCharm to browse to your generated SDK directory and then click ```OK```.

![Open project in PyCharm - Step 2](https://apidocs.io/illustration/python?step=openProject0&workspaceFolder=Samsara%20API-Python)     

The project files will be displayed in the side bar as follows:

![Open project in PyCharm - Step 3](https://apidocs.io/illustration/python?step=openProject1&workspaceFolder=Samsara%20API-Python&projectName=samsaraapi)     

### 2. Add a new Test Project

Create a new directory by right clicking on the solution name as shown below:

![Add a new project in PyCharm - Step 1](https://apidocs.io/illustration/python?step=createDirectory&workspaceFolder=Samsara%20API-Python&projectName=samsaraapi)

Name the directory as "test"

![Add a new project in PyCharm - Step 2](https://apidocs.io/illustration/python?step=nameDirectory)
   
Add a python file to this project with the name "testsdk"

![Add a new project in PyCharm - Step 3](https://apidocs.io/illustration/python?step=createFile&workspaceFolder=Samsara%20API-Python&projectName=samsaraapi)

Name it "testsdk"

![Add a new project in PyCharm - Step 4](https://apidocs.io/illustration/python?step=nameFile)

In your python file you will be required to import the generated python library using the following code lines

```Python
from samsaraapi.samsaraapi_client import SamsaraapiClient
```

![Add a new project in PyCharm - Step 4](https://apidocs.io/illustration/python?step=projectFiles&workspaceFolder=Samsara%20API-Python&libraryName=samsaraapi.samsaraapi_client&projectName=samsaraapi&className=SamsaraapiClient)

After this you can write code to instantiate an API client object, get a controller object and  make API calls. Sample code is given in the subsequent sections.

### 3. Run the Test Project

To run the file within your test project, right click on your Python file inside your Test project and click on ```Run```

![Run Test Project - Step 1](https://apidocs.io/illustration/python?step=runProject&workspaceFolder=Samsara%20API-Python&libraryName=samsaraapi.samsaraapi_client&projectName=samsaraapi&className=SamsaraapiClient)


## How to Test

You can test the generated SDK and the server with automatically generated test
cases. unittest is used as the testing framework and nose is used as the test
runner. You can run the tests as follows:

  1. From terminal/cmd navigate to the root directory of the SDK.
  2. Invoke ```pip install -r test-requirements.txt```
  3. Invoke ```nosetests```

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| access_token | API Access Token |



API client can be initialized as following.

```python
# Configuration parameters and credentials
access_token = 'access_token' # API Access Token

client = SamsaraapiClient(access_token)
```



# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [TagsController](#tags_controller)
* [FleetController](#fleet_controller)
* [UsersController](#users_controller)
* [IndustrialController](#industrial_controller)
* [SensorsController](#sensors_controller)

## <a name="tags_controller"></a>![Class: ](https://apidocs.io/img/class.png ".TagsController") TagsController

### Get controller instance

An instance of the ``` TagsController ``` class can be accessed from the API Client.

```python
 tags_controller = client.tags
```

### <a name="delete_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.delete_tag_by_id") delete_tag_by_id

> Permanently deletes a tag.

```python
def delete_tag_by_id(self,
                         access_token,
                         tag_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```python
access_token = 'access_token'
tag_id = 195

tags_controller.delete_tag_by_id(access_token, tag_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.get_tag_by_id") get_tag_by_id

> Fetch a tag by id.

```python
def get_tag_by_id(self,
                      access_token,
                      tag_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```python
access_token = 'access_token'
tag_id = 195

result = tags_controller.get_tag_by_id(access_token, tag_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="modify_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.modify_tag_by_id") modify_tag_by_id

> Add or delete specific members from a tag, or modify the name of a tag.

```python
def modify_tag_by_id(self,
                         access_token,
                         tag_id,
                         tag_modify_params)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| tagModifyParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
tag_id = 195
tag_modify_params = TagModify()

result = tags_controller.modify_tag_by_id(access_token, tag_id, tag_modify_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_tag"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.create_tag") create_tag

> Create a new tag for the group.

```python
def create_tag(self,
                   access_token,
                   tag_create_params)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagCreateParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
tag_create_params = TagCreate()

result = tags_controller.create_tag(access_token, tag_create_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.update_tag_by_id") update_tag_by_id

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

```python
def update_tag_by_id(self,
                         access_token,
                         tag_id,
                         update_tag_params)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| updateTagParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
tag_id = 195
update_tag_params = TagUpdate()

result = tags_controller.update_tag_by_id(access_token, tag_id, update_tag_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_tags"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.get_all_tags") get_all_tags

> Fetch all of the tags for a group.

```python
def get_all_tags(self,
                     access_token,
                     group_id=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```python
access_token = 'access_token'
group_id = 195

result = tags_controller.get_all_tags(access_token, group_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_controller"></a>![Class: ](https://apidocs.io/img/class.png ".FleetController") FleetController

### Get controller instance

An instance of the ``` FleetController ``` class can be accessed from the API Client.

```python
 fleet_controller = client.fleet
```

### <a name="get_driver_document_types_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_driver_document_types_by_org_id") get_driver_document_types_by_org_id

> Fetch all of the document types.

```python
def get_driver_document_types_by_org_id(self)
```

#### Example Usage

```python

result = fleet_controller.get_driver_document_types_by_org_id()

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_locations") get_vehicle_locations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.

```python
def get_vehicle_locations(self,
                              access_token,
                              vehicle_id,
                              start_ms,
                              end_ms)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |



#### Example Usage

```python
access_token = 'access_token'
vehicle_id = 195
start_ms = 195
end_ms = 195

result = fleet_controller.get_vehicle_locations(access_token, vehicle_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_vehicle_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_vehicle_dispatch_route") create_vehicle_dispatch_route

> Create a new dispatch route for the vehicle with vehicle_id.

```python
def create_vehicle_dispatch_route(self,
                                      create_dispatch_route_params,
                                      access_token,
                                      vehicle_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |



#### Example Usage

```python
create_dispatch_route_params = DispatchRouteCreate()
access_token = 'access_token'
vehicle_id = 195

result = fleet_controller.create_vehicle_dispatch_route(create_dispatch_route_params, access_token, vehicle_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_routes_by_vehicle_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dispatch_routes_by_vehicle_id") get_dispatch_routes_by_vehicle_id

> Fetch all of the dispatch routes for a given vehicle.

```python
def get_dispatch_routes_by_vehicle_id(self,
                                          access_token,
                                          vehicle_id,
                                          end_time=None,
                                          duration=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```python
access_token = 'access_token'
vehicle_id = 153
end_time = 153
duration = 153

result = fleet_controller.get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, end_time, duration)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="patch_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.patch_fleet_vehicle") patch_fleet_vehicle

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.

```python
def patch_fleet_vehicle(self,
                            access_token,
                            vehicle_id_or_external_id,
                            data)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
vehicle_id_or_external_id = 'vehicle_id_or_external_id'
data = Data()

result = fleet_controller.patch_fleet_vehicle(access_token, vehicle_id_or_external_id, data)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_safety_score") get_vehicle_safety_score

> Fetch the safety score for the vehicle.

```python
def get_vehicle_safety_score(self,
                                 access_token,
                                 start_ms,
                                 end_ms,
                                 vehicle_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| vehicleId |  ``` Required ```  | ID of the vehicle |



#### Example Usage

```python
access_token = 'access_token'
start_ms = 153
end_ms = 153
vehicle_id = 153

result = fleet_controller.get_vehicle_safety_score(access_token, start_ms, end_ms, vehicle_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_harsh_event"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_harsh_event") get_vehicle_harsh_event

> Fetch harsh event details for a vehicle.

```python
def get_vehicle_harsh_event(self,
                                access_token,
                                timestamp,
                                vehicle_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicleId |  ``` Required ```  | ID of the vehicle |



#### Example Usage

```python
access_token = 'access_token'
timestamp = 153
vehicle_id = 153

result = fleet_controller.get_vehicle_harsh_event(access_token, timestamp, vehicle_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicles_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicles_locations") get_vehicles_locations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.

```python
def get_vehicles_locations(self,
                               access_token,
                               start_ms,
                               end_ms)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |



#### Example Usage

```python
access_token = 'access_token'
start_ms = 153
end_ms = 153

result = fleet_controller.get_vehicles_locations(access_token, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dvirs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dvirs") get_dvirs

> Get DVIRs for the org within provided time constraints

```python
def get_dvirs(self,
                  access_token,
                  end_ms,
                  duration_ms,
                  group_id=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Required ```  | time in millis until the last dvir log. |
| durationMs |  ``` Required ```  | time in millis which corresponds to the duration before the end_ms. |
| groupId |  ``` Optional ```  | Group ID to query. |



#### Example Usage

```python
access_token = 'access_token'
end_ms = 153
duration_ms = 153
group_id = 153

result = fleet_controller.get_dvirs(access_token, end_ms, duration_ms, group_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_fleet_vehicle") get_fleet_vehicle

> Gets a specific vehicle.

```python
def get_fleet_vehicle(self,
                          access_token,
                          vehicle_id_or_external_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |



#### Example Usage

```python
access_token = 'access_token'
vehicle_id_or_external_id = 'vehicle_id_or_external_id'

result = fleet_controller.get_fleet_vehicle(access_token, vehicle_id_or_external_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_list_fleet"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_list_fleet") create_list_fleet

> Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.

```python
def create_list_fleet(self,
                          access_token,
                          group_param,
                          starting_after=None,
                          ending_before=None,
                          limit=None)
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

```python
access_token = 'access_token'
group_param = GroupParam()
starting_after = 'startingAfter'
ending_before = 'endingBefore'
limit = 153

result = fleet_controller.create_list_fleet(access_token, group_param, starting_after, ending_before, limit)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers_hos_daily_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_drivers_hos_daily_logs") create_get_fleet_drivers_hos_daily_logs

> Get summarized daily HOS charts for a specified driver.

```python
def create_get_fleet_drivers_hos_daily_logs(self,
                                                access_token,
                                                driver_id,
                                                hos_logs_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with HOS logs. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
driver_id = 153
hos_logs_param = HosLogsParam()

result = fleet_controller.create_get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver_document"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_driver_document") create_driver_document

> Create a driver document for the given driver.

```python
def create_driver_document(self,
                               create_document_params,
                               access_token,
                               driver_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDocumentParams |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver for whom the document is created. |



#### Example Usage

```python
create_document_params = DocumentCreate()
access_token = 'access_token'
driver_id = 153

result = fleet_controller.create_driver_document(create_document_params, access_token, driver_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_driver_dispatch_route") create_driver_dispatch_route

> Create a new dispatch route for the driver with driver_id.

```python
def create_driver_dispatch_route(self,
                                     create_dispatch_route_params,
                                     access_token,
                                     driver_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |



#### Example Usage

```python
create_dispatch_route_params = DispatchRouteCreate()
access_token = 'access_token'
driver_id = 153

result = fleet_controller.create_driver_dispatch_route(create_dispatch_route_params, access_token, driver_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_trips"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_trips") create_get_fleet_trips

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.

```python
def create_get_fleet_trips(self,
                               access_token,
                               trips_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tripsParam |  ``` Required ```  | Group ID, vehicle ID and time range to query. |



#### Example Usage

```python
access_token = 'access_token'
trips_param = TripsParam()

result = fleet_controller.create_get_fleet_trips(access_token, trips_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_vehicles"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_vehicles") update_vehicles

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.

```python
def update_vehicles(self,
                        access_token,
                        vehicle_update_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleUpdateParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
vehicle_update_param = VehicleUpdateParam()

fleet_controller.update_vehicles(access_token, vehicle_update_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_maintenance_list"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_maintenance_list") create_get_fleet_maintenance_list

> Get list of the vehicles with any engine faults or check light data.

```python
def create_get_fleet_maintenance_list(self,
                                          access_token,
                                          group_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```python
access_token = 'access_token'
group_param = GroupParam()

result = fleet_controller.create_get_fleet_maintenance_list(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_routes_by_driver_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dispatch_routes_by_driver_id") get_dispatch_routes_by_driver_id

> Fetch all of the dispatch routes for a given driver.

```python
def get_dispatch_routes_by_driver_id(self,
                                         access_token,
                                         driver_id,
                                         end_time=None,
                                         duration=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```python
access_token = 'access_token'
driver_id = 153
end_time = 153
duration = 153

result = fleet_controller.get_dispatch_routes_by_driver_id(access_token, driver_id, end_time, duration)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_dvir"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_dvir") create_dvir

> Create a new dvir, marking a vehicle or trailer safe or unsafe.

```python
def create_dvir(self,
                    access_token,
                    create_dvir_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDvirParam |  ``` Required ```  | DVIR creation body |



#### Example Usage

```python
access_token = 'access_token'
create_dvir_param = CreateDvirParam()

result = fleet_controller.create_dvir(access_token, create_dvir_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_driver_safety_score") get_driver_safety_score

> Fetch the safety score for the driver.

```python
def get_driver_safety_score(self,
                                access_token,
                                start_ms,
                                end_ms,
                                driver_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| driverId |  ``` Required ```  | ID of the driver |



#### Example Usage

```python
access_token = 'access_token'
start_ms = 153
end_ms = 153
driver_id = 153

result = fleet_controller.get_driver_safety_score(access_token, start_ms, end_ms, driver_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_locations") create_get_fleet_locations

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.

```python
def create_get_fleet_locations(self,
                                   access_token,
                                   group_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```python
access_token = 'access_token'
group_param = GroupParam()

result = fleet_controller.create_get_fleet_locations(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_logs_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_hos_logs_summary") create_get_fleet_hos_logs_summary

> Get the current HOS status for all drivers in the group.

```python
def create_get_fleet_hos_logs_summary(self,
                                          access_token,
                                          hos_logs_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
hos_logs_param = HosLogsParam2()

result = fleet_controller.create_get_fleet_hos_logs_summary(access_token, hos_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_hos_logs") create_get_fleet_hos_logs

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.

```python
def create_get_fleet_hos_logs(self,
                                  access_token,
                                  hos_logs_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
hos_logs_param = HosLogsParam()

result = fleet_controller.create_get_fleet_hos_logs(access_token, hos_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_authentication_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_hos_authentication_logs") create_get_fleet_hos_authentication_logs

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.

```python
def create_get_fleet_hos_authentication_logs(self,
                                                 access_token,
                                                 hos_authentication_logs_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosAuthenticationLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
hos_authentication_logs_param = HosAuthenticationLogsParam()

result = fleet_controller.create_get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_drivers_summary") create_get_fleet_drivers_summary

> Get the distance and time each driver in an organization has driven in a given time period.

```python
def create_get_fleet_drivers_summary(self,
                                         access_token,
                                         drivers_summary_param,
                                         snap_to_day_bounds=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driversSummaryParam |  ``` Required ```  | Org ID and time range to query. |
| snapToDayBounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |



#### Example Usage

```python
access_token = 'access_token'
drivers_summary_param = DriversSummaryParam()
snap_to_day_bounds = True

result = fleet_controller.create_get_fleet_drivers_summary(access_token, drivers_summary_param, snap_to_day_bounds)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_stats"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_stats") get_vehicle_stats

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.

```python
def get_vehicle_stats(self,
                          access_token,
                          start_ms,
                          end_ms,
                          series=None,
                          tag_ids=None,
                          starting_after=None,
                          ending_before=None,
                          limit=None)
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

```python
access_token = 'access_token'
start_ms = 245
end_ms = 245
series = SeriesEnum.ENGINESTATE
tag_ids = 'tagIds'
starting_after = 'startingAfter'
ending_before = 'endingBefore'
limit = 245

result = fleet_controller.get_vehicle_stats(access_token, start_ms, end_ms, series, tag_ids, starting_after, ending_before, limit)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_reactivate_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_reactivate_driver_by_id") update_reactivate_driver_by_id

> Reactivate the inactive driver having id.

```python
def update_reactivate_driver_by_id(self,
                                       reactivate_driver_param,
                                       access_token,
                                       driver_id_or_external_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivateDriverParam |  ``` Required ```  | Driver reactivation body |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```python
reactivate_driver_param = ReactivateDriverParam()
access_token = 'access_token'
driver_id_or_external_id = 'driver_id_or_external_id'

result = fleet_controller.update_reactivate_driver_by_id(reactivate_driver_param, access_token, driver_id_or_external_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_documents_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_driver_documents_by_org_id") get_driver_documents_by_org_id

> Fetch all of the documents.

```python
def get_driver_documents_by_org_id(self,
                                       access_token,
                                       end_ms=None,
                                       duration_ms=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| durationMs |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |



#### Example Usage

```python
access_token = 'access_token'
end_ms = 245
duration_ms = 245

result = fleet_controller.get_driver_documents_by_org_id(access_token, end_ms, duration_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_deactivate_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.delete_deactivate_driver") delete_deactivate_driver

> Deactivate a driver with the given id.

```python
def delete_deactivate_driver(self,
                                 access_token,
                                 driver_id_or_external_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```python
access_token = 'access_token'
driver_id_or_external_id = 'driver_id_or_external_id'

fleet_controller.delete_deactivate_driver(access_token, driver_id_or_external_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_route_history"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dispatch_route_history") get_dispatch_route_history

> Fetch the history of a dispatch route.

```python
def get_dispatch_route_history(self,
                                   access_token,
                                   route_id,
                                   start_time=None,
                                   end_time=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the route with history. |
| startTime |  ``` Optional ```  | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. |
| endTime |  ``` Optional ```  | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. |



#### Example Usage

```python
access_token = 'access_token'
route_id = 245
start_time = 245
end_time = 245

result = fleet_controller.get_dispatch_route_history(access_token, route_id, start_time, end_time)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_dispatch_route_by_id") update_dispatch_route_by_id

> Update a dispatch route and its associated jobs.

```python
def update_dispatch_route_by_id(self,
                                    update_dispatch_route_params,
                                    access_token,
                                    route_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```python
update_dispatch_route_params = DispatchRoute()
access_token = 'access_token'
route_id = 245

result = fleet_controller.update_dispatch_route_by_id(update_dispatch_route_params, access_token, route_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="fetch_all_route_job_updates"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetch_all_route_job_updates") fetch_all_route_job_updates

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID

```python
def fetch_all_route_job_updates(self,
                                    access_token,
                                    group_id=None,
                                    sequence_id=None,
                                    include=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| sequenceId |  ``` Optional ```  | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. |
| include |  ``` Optional ```  | Optionally set include=route to include route object in response payload. |



#### Example Usage

```python
access_token = 'access_token'
group_id = 245
sequence_id = 'sequence_id'
include = 'include'

result = fleet_controller.fetch_all_route_job_updates(access_token, group_id, sequence_id, include)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="fetch_all_dispatch_routes"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetch_all_dispatch_routes") fetch_all_dispatch_routes

> Fetch all of the dispatch routes for the group.

```python
def fetch_all_dispatch_routes(self,
                                  access_token,
                                  group_id=None,
                                  end_time=None,
                                  duration=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| endTime |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |



#### Example Usage

```python
access_token = 'access_token'
group_id = 245
end_time = 245
duration = 245

result = fleet_controller.fetch_all_dispatch_routes(access_token, group_id, end_time, duration)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_asset_reefer"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_asset_reefer") get_asset_reefer

> Fetch the reefer-specific stats of an asset.

```python
def get_asset_reefer(self,
                         access_token,
                         asset_id,
                         start_ms,
                         end_ms)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |



#### Example Usage

```python
access_token = 'access_token'
asset_id = 245
start_ms = 245
end_ms = 245

result = fleet_controller.get_asset_reefer(access_token, asset_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_asset_location"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_asset_location") get_asset_location

> Fetch the historical locations for the asset.

```python
def get_asset_location(self,
                           access_token,
                           asset_id,
                           start_ms,
                           end_ms)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| assetId |  ``` Required ```  | ID of the asset |
| startMs |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| endMs |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |



#### Example Usage

```python
access_token = 'access_token'
asset_id = 245
start_ms = 245
end_ms = 245

result = fleet_controller.get_asset_location(access_token, asset_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_driver_by_id") get_driver_by_id

> Fetch driver by id.

```python
def get_driver_by_id(self,
                         access_token,
                         driver_id_or_external_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```python
access_token = 'access_token'
driver_id_or_external_id = 'driver_id_or_external_id'

result = fleet_controller.get_driver_by_id(access_token, driver_id_or_external_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_deactivated_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_deactivated_driver_by_id") get_deactivated_driver_by_id

> Fetch deactivated driver by id.

```python
def get_deactivated_driver_by_id(self,
                                     access_token,
                                     driver_id_or_external_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```python
access_token = 'access_token'
driver_id_or_external_id = 'driver_id_or_external_id'

result = fleet_controller.get_deactivated_driver_by_id(access_token, driver_id_or_external_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_deactivated_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_all_deactivated_drivers") get_all_deactivated_drivers

> Fetch all deactivated drivers for the group.

```python
def get_all_deactivated_drivers(self,
                                    access_token,
                                    group_id=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```python
access_token = 'access_token'
group_id = 81

result = fleet_controller.get_all_deactivated_drivers(access_token, group_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_driver") create_driver

> Create a new driver.

```python
def create_driver(self,
                      access_token,
                      create_driver_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDriverParam |  ``` Required ```  | Driver creation body |



#### Example Usage

```python
access_token = 'access_token'
create_driver_param = DriverForCreate()

result = fleet_controller.create_driver(access_token, create_driver_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_drivers") create_get_fleet_drivers

> Get all the drivers for the specified group.

```python
def create_get_fleet_drivers(self,
                                 access_token,
                                 group_drivers_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupDriversParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
group_drivers_param = GroupDriversParam()

result = fleet_controller.create_get_fleet_drivers(access_token, group_drivers_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.delete_dispatch_route_by_id") delete_dispatch_route_by_id

> Delete a dispatch route and its associated jobs.

```python
def delete_dispatch_route_by_id(self,
                                    access_token,
                                    route_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```python
access_token = 'access_token'
route_id = 81

fleet_controller.delete_dispatch_route_by_id(access_token, route_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dispatch_route_by_id") get_dispatch_route_by_id

> Fetch a dispatch route by id.

```python
def get_dispatch_route_by_id(self,
                                 access_token,
                                 route_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```python
access_token = 'access_token'
route_id = 81

result = fleet_controller.get_dispatch_route_by_id(access_token, route_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_dispatch_route") create_dispatch_route

> Create a new dispatch route.

```python
def create_dispatch_route(self,
                              access_token,
                              create_dispatch_route_params)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
create_dispatch_route_params = DispatchRouteCreate()

result = fleet_controller.create_dispatch_route(access_token, create_dispatch_route_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_asset_current_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_all_asset_current_locations") get_all_asset_current_locations

> Fetch current locations of all assets for the group.

```python
def get_all_asset_current_locations(self,
                                        access_token)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```python
access_token = 'access_token'

result = fleet_controller.get_all_asset_current_locations(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_assets"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_all_assets") get_all_assets

> Fetch all of the assets for the group.

```python
def get_all_assets(self,
                       access_token)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```python
access_token = 'access_token'

result = fleet_controller.get_all_assets(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="add_fleet_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.add_fleet_address") add_fleet_address

> This method adds an address book entry to the specified group.

```python
def add_fleet_address(self,
                          access_token,
                          address_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```python
access_token = 'access_token'
address_param = AddressParam()

fleet_controller.add_fleet_address(access_token, address_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_contact"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_organization_contact") get_organization_contact

> Fetch a contact by its id.

```python
def get_organization_contact(self,
                                 access_token,
                                 contact_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| contactId |  ``` Required ```  | ID of the contact |



#### Example Usage

```python
access_token = 'access_token'
contact_id = 81

result = fleet_controller.get_organization_contact(access_token, contact_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_contacts"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.list_contacts") list_contacts

> Fetch all contacts for the organization.

```python
def list_contacts(self,
                      access_token)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```python
access_token = 'access_token'

result = fleet_controller.list_contacts(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.delete_organization_address") delete_organization_address

> Delete an address.

```python
def delete_organization_address(self,
                                    access_token,
                                    address_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```python
access_token = 'access_token'
address_id = 81

fleet_controller.delete_organization_address(access_token, address_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_organization_address") get_organization_address

> Fetch an address by its id.

```python
def get_organization_address(self,
                                 access_token,
                                 address_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```python
access_token = 'access_token'
address_id = 81

result = fleet_controller.get_organization_address(access_token, address_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_organization_address") update_organization_address

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.

```python
def update_organization_address(self,
                                    access_token,
                                    address,
                                    address_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```python
access_token = 'access_token'
address = Address1()
address_id = 81

fleet_controller.update_organization_address(access_token, address, address_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_organization_addresses") get_organization_addresses

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.

```python
def get_organization_addresses(self,
                                   access_token)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```python
access_token = 'access_token'

result = fleet_controller.get_organization_addresses(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="add_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.add_organization_addresses") add_organization_addresses

> Add one or more addresses to the organization

```python
def add_organization_addresses(self,
                                   access_token,
                                   addresses)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |



#### Example Usage

```python
access_token = 'access_token'
addresses = Addresses()

result = fleet_controller.add_organization_addresses(access_token, addresses)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png ".UsersController") UsersController

### Get controller instance

An instance of the ``` UsersController ``` class can be accessed from the API Client.

```python
 users_controller = client.users
```

### <a name="delete_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.delete_user_by_id") delete_user_by_id

> Remove a user from the organization.

```python
def delete_user_by_id(self,
                          access_token,
                          user_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```python
access_token = 'access_token'
user_id = 39

users_controller.delete_user_by_id(access_token, user_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.get_user_by_id") get_user_by_id

> Get a user.

```python
def get_user_by_id(self,
                       access_token,
                       user_id)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```python
access_token = 'access_token'
user_id = 39

result = users_controller.get_user_by_id(access_token, user_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_users"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.list_users") list_users

> List all users in the organization.

```python
def list_users(self,
                   access_token)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```python
access_token = 'access_token'

result = users_controller.list_users(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_user_roles"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.list_user_roles") list_user_roles

> Get all roles in the organization.

```python
def list_user_roles(self,
                        access_token)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```python
access_token = 'access_token'

result = users_controller.list_user_roles(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_controller"></a>![Class: ](https://apidocs.io/img/class.png ".IndustrialController") IndustrialController

### Get controller instance

An instance of the ``` IndustrialController ``` class can be accessed from the API Client.

```python
 industrial_controller = client.industrial
```

### <a name="get_data_input"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.get_data_input") get_data_input

> Fetch datapoints from a given data input.

```python
def get_data_input(self,
                       access_token,
                       data_input_id,
                       start_ms=None,
                       end_ms=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| dataInputId |  ``` Required ```  | ID of the data input |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |



#### Example Usage

```python
access_token = 'access_token'
data_input_id = 39
start_ms = 39
end_ms = 39

result = industrial_controller.get_data_input(access_token, data_input_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_data_inputs"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.get_all_data_inputs") get_all_data_inputs

> Fetch all of the data inputs for a group.

```python
def get_all_data_inputs(self,
                            access_token,
                            group_id=None,
                            start_ms=None,
                            end_ms=None)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| startMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| endMs |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |



#### Example Usage

```python
access_token = 'access_token'
group_id = 39
start_ms = 39
end_ms = 39

result = industrial_controller.get_all_data_inputs(access_token, group_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_machines"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.create_get_machines") create_get_machines

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.

```python
def create_get_machines(self,
                            access_token,
                            group_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```python
access_token = 'access_token'
group_param = GroupParam()

result = industrial_controller.create_get_machines(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_machines_history"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.create_get_machines_history") create_get_machines_history

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group

```python
def create_get_machines_history(self,
                                    access_token,
                                    history_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID and time range to query for events |



#### Example Usage

```python
access_token = 'access_token'
history_param = HistoryParam()

result = industrial_controller.create_get_machines_history(access_token, history_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_controller"></a>![Class: ](https://apidocs.io/img/class.png ".SensorsController") SensorsController

### Get controller instance

An instance of the ``` SensorsController ``` class can be accessed from the API Client.

```python
 sensors_controller = client.sensors
```

### <a name="create_get_sensors_temperature"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_temperature") create_get_sensors_temperature

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.

```python
def create_get_sensors_temperature(self,
                                       access_token,
                                       sensor_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```python
access_token = 'access_token'
sensor_param = SensorParam()

result = sensors_controller.create_get_sensors_temperature(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors") create_get_sensors

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.

```python
def create_get_sensors(self,
                           access_token,
                           group_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```python
access_token = 'access_token'
group_param = GroupParam()

result = sensors_controller.create_get_sensors(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_humidity"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_humidity") create_get_sensors_humidity

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.

```python
def create_get_sensors_humidity(self,
                                    access_token,
                                    sensor_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```python
access_token = 'access_token'
sensor_param = SensorParam()

result = sensors_controller.create_get_sensors_humidity(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_history"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_history") create_get_sensors_history

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.

```python
def create_get_sensors_history(self,
                                   access_token,
                                   history_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |



#### Example Usage

```python
access_token = 'access_token'
history_param = HistoryParam1()

result = sensors_controller.create_get_sensors_history(access_token, history_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_door"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_door") create_get_sensors_door

> Get door monitor status (closed / open) for requested sensors.

```python
def create_get_sensors_door(self,
                                access_token,
                                sensor_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```python
access_token = 'access_token'
sensor_param = SensorParam()

result = sensors_controller.create_get_sensors_door(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_cargo"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_cargo") create_get_sensors_cargo

> Get cargo monitor status (empty / full) for requested sensors.

```python
def create_get_sensors_cargo(self,
                                 access_token,
                                 sensor_param)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```python
access_token = 'access_token'
sensor_param = SensorParam()

result = sensors_controller.create_get_sensors_cargo(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)



