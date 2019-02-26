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

This client library is a Ruby gem which can be compiled and used in your Ruby and Ruby on Rails project. This library requires a few gems from the RubyGems repository.

1. Open the command line interface or the terminal and navigate to the folder containing the source code.
2. Run ``` gem build samsara_api.gemspec ``` to build the gem.
3. Once built, the gem can be installed on the current work environment using ``` gem install samsara_api-1.0.0.gem ```

![Building Gem](https://apidocs.io/illustration/ruby?step=buildSDK&workspaceFolder=Samsara%20API-Ruby&workspaceName=Samsara%20API-Ruby&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

## How to Use

The following section explains how to use the SamsaraApi Ruby Gem in a new Rails project using RubyMine&trade;. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

### 1. Starting a new project

Close any existing projects in RubyMine&trade; by selecting ``` File -> Close Project ```. Next, click on ``` Create New Project ``` to create a new project from scratch.

![Create a new project in RubyMine](https://apidocs.io/illustration/ruby?step=createNewProject0&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

Next, provide ``` TestApp ``` as the project name, choose ``` Rails Application ``` as the project type, and click ``` OK ```.

![Create a new Rails Application in RubyMine - step 1](https://apidocs.io/illustration/ruby?step=createNewProject1&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

In the next dialog make sure that correct *Ruby SDK* is being used (minimum 2.0.0) and click ``` OK ```.

![Create a new Rails Application in RubyMine - step 2](https://apidocs.io/illustration/ruby?step=createNewProject2&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

This will create a new Rails Application project with an existing set of files and folder.

### 2. Add reference of the gem

In order to use the SamsaraApi gem in the new project we must add a gem reference. Locate the ```Gemfile``` in the *Project Explorer* window under the ``` TestApp ``` project node. The file contains references to all gems being used in the project. Here, add the reference to the library gem by adding the following line: ``` gem 'samsara_api', '~> 1.0.0' ```

![Add references of the Gemfile](https://apidocs.io/illustration/ruby?step=addReference&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

### 3. Adding a new Rails Controller

Once the ``` TestApp ``` project is created, a folder named ``` controllers ``` will be visible in the *Project Explorer* under the following path: ``` TestApp > app > controllers ```. Right click on this folder and select ``` New -> Run Rails Generator... ```.

![Run Rails Generator on Controllers Folder](https://apidocs.io/illustration/ruby?step=addCode0&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

Selecting the said option will popup a small window where the generator names are displayed. Here, select the ``` controller ``` template.

![Create a new Controller](https://apidocs.io/illustration/ruby?step=addCode1&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

Next, a popup window will ask you for a Controller name and included Actions. For controller name provide ``` Hello ``` and include an action named ``` Index ``` and click ``` OK ```.

![Add a new Controller](https://apidocs.io/illustration/ruby?step=addCode2&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

A new controller class anmed ``` HelloController ``` will be created in a file named ``` hello_controller.rb ``` containing a method named ``` Index ```. In this method, add code for initialization and a sample for its usage.

![Initialize the library](https://apidocs.io/illustration/ruby?step=addCode3&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0)

## How to Test

You can test the generated SDK and the server with automatically generated test
cases as follows:

  1. From terminal/cmd navigate to the root directory of the SDK.
  2. Invoke: `bundle exec rake`

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| access_token | API Access Token |



API client can be initialized as following.

```ruby
# Configuration parameters and credentials
access_token = 'access_token' # API Access Token

client = SamsaraApi::SamsaraApiClient.new(
  access_token: access_token
)
```

The added initlization code can be debugged by putting a breakpoint in the ``` Index ``` method and running the project in debug mode by selecting ``` Run -> Debug 'Development: TestApp' ```.

![Debug the TestApp](https://apidocs.io/illustration/ruby?step=addCode4&workspaceFolder=Samsara%20API-Ruby&workspaceName=SamsaraApi&projectName=samsara_api&gemName=samsara_api&gemVer=1.0.0&initLine=client%2520%253D%2520SamsaraApiClient.new%2528%2527access_token%2527%2529)



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

```ruby
tags_controller = client.tags
```

### <a name="delete_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.delete_tag_by_id") delete_tag_by_id

> Permanently deletes a tag.


```ruby
def delete_tag_by_id(access_token,
                         tag_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| tag_id |  ``` Required ```  | ID of the tag. |


#### Example Usage

```ruby
access_token = 'access_token'
tag_id = 21

tags_controller.delete_tag_by_id(access_token, tag_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.get_tag_by_id") get_tag_by_id

> Fetch a tag by id.


```ruby
def get_tag_by_id(access_token,
                      tag_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| tag_id |  ``` Required ```  | ID of the tag. |


#### Example Usage

```ruby
access_token = 'access_token'
tag_id = 21

result = tags_controller.get_tag_by_id(access_token, tag_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="modify_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.modify_tag_by_id") modify_tag_by_id

> Add or delete specific members from a tag, or modify the name of a tag.


```ruby
def modify_tag_by_id(access_token,
                         tag_id,
                         tag_modify_params); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| tag_id |  ``` Required ```  | ID of the tag. |
| tag_modify_params |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
tag_id = 21
tag_modify_params = TagModify.new

result = tags_controller.modify_tag_by_id(access_token, tag_id, tag_modify_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_tag"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.create_tag") create_tag

> Create a new tag for the group.


```ruby
def create_tag(access_token,
                   tag_create_params); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| tag_create_params |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
tag_create_params = TagCreate.new

result = tags_controller.create_tag(access_token, tag_create_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.update_tag_by_id") update_tag_by_id

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


```ruby
def update_tag_by_id(access_token,
                         tag_id,
                         update_tag_params); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| tag_id |  ``` Required ```  | ID of the tag. |
| update_tag_params |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
tag_id = 21
update_tag_params = TagUpdate.new

result = tags_controller.update_tag_by_id(access_token, tag_id, update_tag_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_tags"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.get_all_tags") get_all_tags

> Fetch all of the tags for a group.


```ruby
def get_all_tags(access_token,
                     group_id = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_id |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```ruby
access_token = 'access_token'
group_id = 21

result = tags_controller.get_all_tags(access_token, group_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_controller"></a>![Class: ](https://apidocs.io/img/class.png ".FleetController") FleetController

### Get singleton instance

The singleton instance of the ``` FleetController ``` class can be accessed from the API Client.

```ruby
fleet_controller = client.fleet
```

### <a name="get_driver_document_types_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_driver_document_types_by_org_id") get_driver_document_types_by_org_id

> Fetch all of the document types.


```ruby
def get_driver_document_types_by_org_id; end
```

#### Example Usage

```ruby

result = fleet_controller.get_driver_document_types_by_org_id()

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_locations") get_vehicle_locations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


```ruby
def get_vehicle_locations(access_token,
                              vehicle_id,
                              start_ms,
                              end_ms); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| vehicle_id |  ``` Required ```  | ID of the vehicle with the associated routes. |
| start_ms |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) |
| end_ms |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) |


#### Example Usage

```ruby
access_token = 'access_token'
vehicle_id = 21
start_ms = 21
end_ms = 21

result = fleet_controller.get_vehicle_locations(access_token, vehicle_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_vehicle_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_vehicle_dispatch_route") create_vehicle_dispatch_route

> Create a new dispatch route for the vehicle with vehicle_id.


```ruby
def create_vehicle_dispatch_route(create_dispatch_route_params,
                                      access_token,
                                      vehicle_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| create_dispatch_route_params |  ``` Required ```  | TODO: Add a parameter description |
| access_token |  ``` Required ```  | Samsara API access token. |
| vehicle_id |  ``` Required ```  | ID of the vehicle with the associated routes. |


#### Example Usage

```ruby
create_dispatch_route_params = DispatchRouteCreate.new
access_token = 'access_token'
vehicle_id = 21

result = fleet_controller.create_vehicle_dispatch_route(create_dispatch_route_params, access_token, vehicle_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_vehicle_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dispatch_routes_by_vehicle_id") get_dispatch_routes_by_vehicle_id

> Fetch all of the dispatch routes for a given vehicle.


```ruby
def get_dispatch_routes_by_vehicle_id(access_token,
                                          vehicle_id,
                                          end_time = nil,
                                          duration = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| vehicle_id |  ``` Required ```  | ID of the vehicle with the associated routes. |
| end_time |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```ruby
access_token = 'access_token'
vehicle_id = 21
end_time = 21
duration = 21

result = fleet_controller.get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, end_time, duration)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="patch_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.patch_fleet_vehicle") patch_fleet_vehicle

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


```ruby
def patch_fleet_vehicle(access_token,
                            vehicle_id_or_external_id,
                            data); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| vehicle_id_or_external_id |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
vehicle_id_or_external_id = 'vehicle_id_or_external_id'
data = Data.new

result = fleet_controller.patch_fleet_vehicle(access_token, vehicle_id_or_external_id, data)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_safety_score") get_vehicle_safety_score

> Fetch the safety score for the vehicle.


```ruby
def get_vehicle_safety_score(access_token,
                                 start_ms,
                                 end_ms,
                                 vehicle_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| start_ms |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| end_ms |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| vehicle_id |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```ruby
access_token = 'access_token'
start_ms = 21
end_ms = 21
vehicle_id = 21

result = fleet_controller.get_vehicle_safety_score(access_token, start_ms, end_ms, vehicle_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_harsh_event"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_harsh_event") get_vehicle_harsh_event

> Fetch harsh event details for a vehicle.


```ruby
def get_vehicle_harsh_event(access_token,
                                timestamp,
                                vehicle_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicle_id |  ``` Required ```  | ID of the vehicle |


#### Example Usage

```ruby
access_token = 'access_token'
timestamp = 21
vehicle_id = 21

result = fleet_controller.get_vehicle_harsh_event(access_token, timestamp, vehicle_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicles_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicles_locations") get_vehicles_locations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


```ruby
def get_vehicles_locations(access_token,
                               start_ms,
                               end_ms); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| start_ms |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| end_ms |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |


#### Example Usage

```ruby
access_token = 'access_token'
start_ms = 21
end_ms = 21

result = fleet_controller.get_vehicles_locations(access_token, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dvirs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dvirs") get_dvirs

> Get DVIRs for the org within provided time constraints


```ruby
def get_dvirs(access_token,
                  end_ms,
                  duration_ms,
                  group_id = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| end_ms |  ``` Required ```  | time in millis until the last dvir log. |
| duration_ms |  ``` Required ```  | time in millis which corresponds to the duration before the end_ms. |
| group_id |  ``` Optional ```  | Group ID to query. |


#### Example Usage

```ruby
access_token = 'access_token'
end_ms = 21
duration_ms = 21
group_id = 21

result = fleet_controller.get_dvirs(access_token, end_ms, duration_ms, group_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_fleet_vehicle") get_fleet_vehicle

> Gets a specific vehicle.


```ruby
def get_fleet_vehicle(access_token,
                          vehicle_id_or_external_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| vehicle_id_or_external_id |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |


#### Example Usage

```ruby
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


```ruby
def create_list_fleet(access_token,
                          group_param,
                          starting_after = nil,
                          ending_before = nil,
                          limit = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_param |  ``` Required ```  | Group ID to query. |
| starting_after |  ``` Optional ```  | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. |
| ending_before |  ``` Optional ```  | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. |
| limit |  ``` Optional ```  | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. |


#### Example Usage

```ruby
access_token = 'access_token'
group_param = GroupParam.new
starting_after = 'startingAfter'
ending_before = 'endingBefore'
limit = 21

result = fleet_controller.create_list_fleet(access_token, group_param, starting_after, ending_before, limit)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_hos_daily_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_drivers_hos_daily_logs") create_get_fleet_drivers_hos_daily_logs

> Get summarized daily HOS charts for a specified driver.


```ruby
def create_get_fleet_drivers_hos_daily_logs(access_token,
                                                driver_id,
                                                hos_logs_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id |  ``` Required ```  | ID of the driver with HOS logs. |
| hos_logs_param |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
driver_id = 21
hos_logs_param = HosLogsParam.new

result = fleet_controller.create_get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_document"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_driver_document") create_driver_document

> Create a driver document for the given driver.


```ruby
def create_driver_document(create_document_params,
                               access_token,
                               driver_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| create_document_params |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id |  ``` Required ```  | ID of the driver for whom the document is created. |


#### Example Usage

```ruby
create_document_params = DocumentCreate.new
access_token = 'access_token'
driver_id = 21

result = fleet_controller.create_driver_document(create_document_params, access_token, driver_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_driver_dispatch_route") create_driver_dispatch_route

> Create a new dispatch route for the driver with driver_id.


```ruby
def create_driver_dispatch_route(create_dispatch_route_params,
                                     access_token,
                                     driver_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| create_dispatch_route_params |  ``` Required ```  | TODO: Add a parameter description |
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id |  ``` Required ```  | ID of the driver with the associated routes. |


#### Example Usage

```ruby
create_dispatch_route_params = DispatchRouteCreate.new
access_token = 'access_token'
driver_id = 234

result = fleet_controller.create_driver_dispatch_route(create_dispatch_route_params, access_token, driver_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_trips"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_trips") create_get_fleet_trips

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


```ruby
def create_get_fleet_trips(access_token,
                               trips_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| trips_param |  ``` Required ```  | Group ID, vehicle ID and time range to query. |


#### Example Usage

```ruby
access_token = 'access_token'
trips_param = TripsParam.new

result = fleet_controller.create_get_fleet_trips(access_token, trips_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_vehicles"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_vehicles") update_vehicles

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.


```ruby
def update_vehicles(access_token,
                        vehicle_update_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| vehicle_update_param |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
vehicle_update_param = VehicleUpdateParam.new

fleet_controller.update_vehicles(access_token, vehicle_update_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_maintenance_list"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_maintenance_list") create_get_fleet_maintenance_list

> Get list of the vehicles with any engine faults or check light data.


```ruby
def create_get_fleet_maintenance_list(access_token,
                                          group_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_param |  ``` Required ```  | Group ID to query. |


#### Example Usage

```ruby
access_token = 'access_token'
group_param = GroupParam.new

result = fleet_controller.create_get_fleet_maintenance_list(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_routes_by_driver_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dispatch_routes_by_driver_id") get_dispatch_routes_by_driver_id

> Fetch all of the dispatch routes for a given driver.


```ruby
def get_dispatch_routes_by_driver_id(access_token,
                                         driver_id,
                                         end_time = nil,
                                         duration = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id |  ``` Required ```  | ID of the driver with the associated routes. |
| end_time |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```ruby
access_token = 'access_token'
driver_id = 234
end_time = 234
duration = 234

result = fleet_controller.get_dispatch_routes_by_driver_id(access_token, driver_id, end_time, duration)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dvir"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_dvir") create_dvir

> Create a new dvir, marking a vehicle or trailer safe or unsafe.


```ruby
def create_dvir(access_token,
                    create_dvir_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| create_dvir_param |  ``` Required ```  | DVIR creation body |


#### Example Usage

```ruby
access_token = 'access_token'
create_dvir_param = CreateDvirParam.new

result = fleet_controller.create_dvir(access_token, create_dvir_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_driver_safety_score") get_driver_safety_score

> Fetch the safety score for the driver.


```ruby
def get_driver_safety_score(access_token,
                                start_ms,
                                end_ms,
                                driver_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| start_ms |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| end_ms |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |
| driver_id |  ``` Required ```  | ID of the driver |


#### Example Usage

```ruby
access_token = 'access_token'
start_ms = 234
end_ms = 234
driver_id = 234

result = fleet_controller.get_driver_safety_score(access_token, start_ms, end_ms, driver_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_locations") create_get_fleet_locations

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


```ruby
def create_get_fleet_locations(access_token,
                                   group_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_param |  ``` Required ```  | Group ID to query. |


#### Example Usage

```ruby
access_token = 'access_token'
group_param = GroupParam.new

result = fleet_controller.create_get_fleet_locations(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_hos_logs_summary") create_get_fleet_hos_logs_summary

> Get the current HOS status for all drivers in the group.


```ruby
def create_get_fleet_hos_logs_summary(access_token,
                                          hos_logs_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| hos_logs_param |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
hos_logs_param = HosLogsParam2.new

result = fleet_controller.create_get_fleet_hos_logs_summary(access_token, hos_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_hos_logs") create_get_fleet_hos_logs

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


```ruby
def create_get_fleet_hos_logs(access_token,
                                  hos_logs_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| hos_logs_param |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
hos_logs_param = HosLogsParam.new

result = fleet_controller.create_get_fleet_hos_logs(access_token, hos_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_hos_authentication_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_hos_authentication_logs") create_get_fleet_hos_authentication_logs

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


```ruby
def create_get_fleet_hos_authentication_logs(access_token,
                                                 hos_authentication_logs_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| hos_authentication_logs_param |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
hos_authentication_logs_param = HosAuthenticationLogsParam.new

result = fleet_controller.create_get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_drivers_summary") create_get_fleet_drivers_summary

> Get the distance and time each driver in an organization has driven in a given time period.


```ruby
def create_get_fleet_drivers_summary(access_token,
                                         drivers_summary_param,
                                         snap_to_day_bounds = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| drivers_summary_param |  ``` Required ```  | Org ID and time range to query. |
| snap_to_day_bounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |


#### Example Usage

```ruby
access_token = 'access_token'
drivers_summary_param = DriversSummaryParam.new
snap_to_day_bounds = true

result = fleet_controller.create_get_fleet_drivers_summary(access_token, drivers_summary_param, snap_to_day_bounds)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_vehicle_stats"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_vehicle_stats") get_vehicle_stats

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


```ruby
def get_vehicle_stats(access_token,
                          start_ms,
                          end_ms,
                          series = nil,
                          tag_ids = nil,
                          starting_after = nil,
                          ending_before = nil,
                          limit = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| start_ms |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query. |
| end_ms |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query. |
| series |  ``` Optional ```  | Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 |
| tag_ids |  ``` Optional ```  | Comma-separated list of tag ids. Example: tagIds=1,2,3 |
| starting_after |  ``` Optional ```  | Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. |
| ending_before |  ``` Optional ```  | Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. |
| limit |  ``` Optional ```  | Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. |


#### Example Usage

```ruby
access_token = 'access_token'
start_ms = 234
end_ms = 234
series = SamsaraApi::SeriesEnum::ENGINESTATE
tag_ids = 'tagIds'
starting_after = 'startingAfter'
ending_before = 'endingBefore'
limit = 234

result = fleet_controller.get_vehicle_stats(access_token, start_ms, end_ms, series, tag_ids, starting_after, ending_before, limit)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_reactivate_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_reactivate_driver_by_id") update_reactivate_driver_by_id

> Reactivate the inactive driver having id.


```ruby
def update_reactivate_driver_by_id(reactivate_driver_param,
                                       access_token,
                                       driver_id_or_external_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivate_driver_param |  ``` Required ```  | Driver reactivation body |
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id_or_external_id |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```ruby
reactivate_driver_param = ReactivateDriverParam.new
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


```ruby
def get_driver_documents_by_org_id(access_token,
                                       end_ms = nil,
                                       duration_ms = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| end_ms |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| duration_ms |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |


#### Example Usage

```ruby
access_token = 'access_token'
end_ms = 234
duration_ms = 234

result = fleet_controller.get_driver_documents_by_org_id(access_token, end_ms, duration_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_deactivate_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.delete_deactivate_driver") delete_deactivate_driver

> Deactivate a driver with the given id.


```ruby
def delete_deactivate_driver(access_token,
                                 driver_id_or_external_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id_or_external_id |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```ruby
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


```ruby
def get_dispatch_route_history(access_token,
                                   route_id,
                                   start_time = nil,
                                   end_time = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| route_id |  ``` Required ```  | ID of the route with history. |
| start_time |  ``` Optional ```  | Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. |
| end_time |  ``` Optional ```  | Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. |


#### Example Usage

```ruby
access_token = 'access_token'
route_id = 234
start_time = 234
end_time = 234

result = fleet_controller.get_dispatch_route_history(access_token, route_id, start_time, end_time)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_dispatch_route_by_id") update_dispatch_route_by_id

> Update a dispatch route and its associated jobs.


```ruby
def update_dispatch_route_by_id(update_dispatch_route_params,
                                    access_token,
                                    route_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| update_dispatch_route_params |  ``` Required ```  | TODO: Add a parameter description |
| access_token |  ``` Required ```  | Samsara API access token. |
| route_id |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```ruby
update_dispatch_route_params = DispatchRoute.new
access_token = 'access_token'
route_id = 234

result = fleet_controller.update_dispatch_route_by_id(update_dispatch_route_params, access_token, route_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="fetch_all_route_job_updates"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetch_all_route_job_updates") fetch_all_route_job_updates

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


```ruby
def fetch_all_route_job_updates(access_token,
                                    group_id = nil,
                                    sequence_id = nil,
                                    include = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_id |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| sequence_id |  ``` Optional ```  | Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. |
| include |  ``` Optional ```  | Optionally set include=route to include route object in response payload. |


#### Example Usage

```ruby
access_token = 'access_token'
group_id = 234
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


```ruby
def fetch_all_dispatch_routes(access_token,
                                  group_id = nil,
                                  end_time = nil,
                                  duration = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_id |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| end_time |  ``` Optional ```  | Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. |
| duration |  ``` Optional ```  | Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. |


#### Example Usage

```ruby
access_token = 'access_token'
group_id = 234
end_time = 234
duration = 234

result = fleet_controller.fetch_all_dispatch_routes(access_token, group_id, end_time, duration)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_reefer"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_asset_reefer") get_asset_reefer

> Fetch the reefer-specific stats of an asset.


```ruby
def get_asset_reefer(access_token,
                         asset_id,
                         start_ms,
                         end_ms); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| asset_id |  ``` Required ```  | ID of the asset |
| start_ms |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| end_ms |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```ruby
access_token = 'access_token'
asset_id = 234
start_ms = 234
end_ms = 234

result = fleet_controller.get_asset_reefer(access_token, asset_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_asset_location"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_asset_location") get_asset_location

> Fetch the historical locations for the asset.


```ruby
def get_asset_location(access_token,
                           asset_id,
                           start_ms,
                           end_ms); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| asset_id |  ``` Required ```  | ID of the asset |
| start_ms |  ``` Required ```  | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. |
| end_ms |  ``` Required ```  | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. |


#### Example Usage

```ruby
access_token = 'access_token'
asset_id = 234
start_ms = 234
end_ms = 234

result = fleet_controller.get_asset_location(access_token, asset_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_driver_by_id") get_driver_by_id

> Fetch driver by id.


```ruby
def get_driver_by_id(access_token,
                         driver_id_or_external_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id_or_external_id |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```ruby
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


```ruby
def get_deactivated_driver_by_id(access_token,
                                     driver_id_or_external_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| driver_id_or_external_id |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |


#### Example Usage

```ruby
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


```ruby
def get_all_deactivated_drivers(access_token,
                                    group_id = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_id |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |


#### Example Usage

```ruby
access_token = 'access_token'
group_id = 234

result = fleet_controller.get_all_deactivated_drivers(access_token, group_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_driver") create_driver

> Create a new driver.


```ruby
def create_driver(access_token,
                      create_driver_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| create_driver_param |  ``` Required ```  | Driver creation body |


#### Example Usage

```ruby
access_token = 'access_token'
create_driver_param = DriverForCreate.new

result = fleet_controller.create_driver(access_token, create_driver_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_fleet_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_get_fleet_drivers") create_get_fleet_drivers

> Get all the drivers for the specified group.


```ruby
def create_get_fleet_drivers(access_token,
                                 group_drivers_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_drivers_param |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
group_drivers_param = GroupDriversParam.new

result = fleet_controller.create_get_fleet_drivers(access_token, group_drivers_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.delete_dispatch_route_by_id") delete_dispatch_route_by_id

> Delete a dispatch route and its associated jobs.


```ruby
def delete_dispatch_route_by_id(access_token,
                                    route_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| route_id |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```ruby
access_token = 'access_token'
route_id = 162

fleet_controller.delete_dispatch_route_by_id(access_token, route_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_dispatch_route_by_id") get_dispatch_route_by_id

> Fetch a dispatch route by id.


```ruby
def get_dispatch_route_by_id(access_token,
                                 route_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| route_id |  ``` Required ```  | ID of the dispatch route. |


#### Example Usage

```ruby
access_token = 'access_token'
route_id = 162

result = fleet_controller.get_dispatch_route_by_id(access_token, route_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.create_dispatch_route") create_dispatch_route

> Create a new dispatch route.


```ruby
def create_dispatch_route(access_token,
                              create_dispatch_route_params); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| create_dispatch_route_params |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
create_dispatch_route_params = DispatchRouteCreate.new

result = fleet_controller.create_dispatch_route(access_token, create_dispatch_route_params)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_asset_current_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_all_asset_current_locations") get_all_asset_current_locations

> Fetch current locations of all assets for the group.


```ruby
def get_all_asset_current_locations(access_token); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```ruby
access_token = 'access_token'

result = fleet_controller.get_all_asset_current_locations(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_assets"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_all_assets") get_all_assets

> Fetch all of the assets for the group.


```ruby
def get_all_assets(access_token); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```ruby
access_token = 'access_token'

result = fleet_controller.get_all_assets(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_fleet_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.add_fleet_address") add_fleet_address

> This method adds an address book entry to the specified group.


```ruby
def add_fleet_address(access_token,
                          address_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| address_param |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```ruby
access_token = 'access_token'
address_param = AddressParam.new

fleet_controller.add_fleet_address(access_token, address_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_contact"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_organization_contact") get_organization_contact

> Fetch a contact by its id.


```ruby
def get_organization_contact(access_token,
                                 contact_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| contact_id |  ``` Required ```  | ID of the contact |


#### Example Usage

```ruby
access_token = 'access_token'
contact_id = 162

result = fleet_controller.get_organization_contact(access_token, contact_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_contacts"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.list_contacts") list_contacts

> Fetch all contacts for the organization.


```ruby
def list_contacts(access_token); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```ruby
access_token = 'access_token'

result = fleet_controller.list_contacts(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="delete_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.delete_organization_address") delete_organization_address

> Delete an address.


```ruby
def delete_organization_address(access_token,
                                    address_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| address_id |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```ruby
access_token = 'access_token'
address_id = 162

fleet_controller.delete_organization_address(access_token, address_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_organization_address") get_organization_address

> Fetch an address by its id.


```ruby
def get_organization_address(access_token,
                                 address_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| address_id |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```ruby
access_token = 'access_token'
address_id = 162

result = fleet_controller.get_organization_address(access_token, address_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="update_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.update_organization_address") update_organization_address

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


```ruby
def update_organization_address(access_token,
                                    address,
                                    address_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| address_id |  ``` Required ```  | ID of the address/geofence |


#### Example Usage

```ruby
access_token = 'access_token'
address = Address1.new
address_id = 162

fleet_controller.update_organization_address(access_token, address, address_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.get_organization_addresses") get_organization_addresses

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


```ruby
def get_organization_addresses(access_token); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```ruby
access_token = 'access_token'

result = fleet_controller.get_organization_addresses(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="add_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.add_organization_addresses") add_organization_addresses

> Add one or more addresses to the organization


```ruby
def add_organization_addresses(access_token,
                                   addresses); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |


#### Example Usage

```ruby
access_token = 'access_token'
addresses = Addresses.new

result = fleet_controller.add_organization_addresses(access_token, addresses)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png ".UsersController") UsersController

### Get singleton instance

The singleton instance of the ``` UsersController ``` class can be accessed from the API Client.

```ruby
users_controller = client.users
```

### <a name="delete_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.delete_user_by_id") delete_user_by_id

> Remove a user from the organization.


```ruby
def delete_user_by_id(access_token,
                          user_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| user_id |  ``` Required ```  | ID of the user. |


#### Example Usage

```ruby
access_token = 'access_token'
user_id = 162

users_controller.delete_user_by_id(access_token, user_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.get_user_by_id") get_user_by_id

> Get a user.


```ruby
def get_user_by_id(access_token,
                       user_id); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| user_id |  ``` Required ```  | ID of the user. |


#### Example Usage

```ruby
access_token = 'access_token'
user_id = 162

result = users_controller.get_user_by_id(access_token, user_id)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_users"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.list_users") list_users

> List all users in the organization.


```ruby
def list_users(access_token); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```ruby
access_token = 'access_token'

result = users_controller.list_users(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="list_user_roles"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.list_user_roles") list_user_roles

> Get all roles in the organization.


```ruby
def list_user_roles(access_token); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |


#### Example Usage

```ruby
access_token = 'access_token'

result = users_controller.list_user_roles(access_token)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_controller"></a>![Class: ](https://apidocs.io/img/class.png ".IndustrialController") IndustrialController

### Get singleton instance

The singleton instance of the ``` IndustrialController ``` class can be accessed from the API Client.

```ruby
industrial_controller = client.industrial
```

### <a name="get_data_input"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.get_data_input") get_data_input

> Fetch datapoints from a given data input.


```ruby
def get_data_input(access_token,
                       data_input_id,
                       start_ms = nil,
                       end_ms = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| data_input_id |  ``` Required ```  | ID of the data input |
| start_ms |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| end_ms |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```ruby
access_token = 'access_token'
data_input_id = 162
start_ms = 162
end_ms = 162

result = industrial_controller.get_data_input(access_token, data_input_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="get_all_data_inputs"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.get_all_data_inputs") get_all_data_inputs

> Fetch all of the data inputs for a group.


```ruby
def get_all_data_inputs(access_token,
                            group_id = nil,
                            start_ms = nil,
                            end_ms = nil); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_id |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |
| start_ms |  ``` Optional ```  | Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. |
| end_ms |  ``` Optional ```  | Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. |


#### Example Usage

```ruby
access_token = 'access_token'
group_id = 162
start_ms = 162
end_ms = 162

result = industrial_controller.get_all_data_inputs(access_token, group_id, start_ms, end_ms)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.create_get_machines") create_get_machines

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


```ruby
def create_get_machines(access_token,
                            group_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_param |  ``` Required ```  | Group ID to query. |


#### Example Usage

```ruby
access_token = 'access_token'
group_param = GroupParam.new

result = industrial_controller.create_get_machines(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_machines_history"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.create_get_machines_history") create_get_machines_history

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group


```ruby
def create_get_machines_history(access_token,
                                    history_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| history_param |  ``` Required ```  | Group ID and time range to query for events |


#### Example Usage

```ruby
access_token = 'access_token'
history_param = HistoryParam.new

result = industrial_controller.create_get_machines_history(access_token, history_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_controller"></a>![Class: ](https://apidocs.io/img/class.png ".SensorsController") SensorsController

### Get singleton instance

The singleton instance of the ``` SensorsController ``` class can be accessed from the API Client.

```ruby
sensors_controller = client.sensors
```

### <a name="create_get_sensors_temperature"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_temperature") create_get_sensors_temperature

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


```ruby
def create_get_sensors_temperature(access_token,
                                       sensor_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| sensor_param |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```ruby
access_token = 'access_token'
sensor_param = SensorParam.new

result = sensors_controller.create_get_sensors_temperature(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors") create_get_sensors

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


```ruby
def create_get_sensors(access_token,
                           group_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| group_param |  ``` Required ```  | Group ID to query. |


#### Example Usage

```ruby
access_token = 'access_token'
group_param = GroupParam.new

result = sensors_controller.create_get_sensors(access_token, group_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_humidity"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_humidity") create_get_sensors_humidity

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


```ruby
def create_get_sensors_humidity(access_token,
                                    sensor_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| sensor_param |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```ruby
access_token = 'access_token'
sensor_param = SensorParam.new

result = sensors_controller.create_get_sensors_humidity(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_history"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_history") create_get_sensors_history

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


```ruby
def create_get_sensors_history(access_token,
                                   history_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| history_param |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |


#### Example Usage

```ruby
access_token = 'access_token'
history_param = HistoryParam1.new

result = sensors_controller.create_get_sensors_history(access_token, history_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_door"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_door") create_get_sensors_door

> Get door monitor status (closed / open) for requested sensors.


```ruby
def create_get_sensors_door(access_token,
                                sensor_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| sensor_param |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```ruby
access_token = 'access_token'
sensor_param = SensorParam.new

result = sensors_controller.create_get_sensors_door(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



### <a name="create_get_sensors_cargo"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.create_get_sensors_cargo") create_get_sensors_cargo

> Get cargo monitor status (empty / full) for requested sensors.


```ruby
def create_get_sensors_cargo(access_token,
                                 sensor_param); end
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| access_token |  ``` Required ```  | Samsara API access token. |
| sensor_param |  ``` Required ```  | Group ID and list of sensor IDs to query. |


#### Example Usage

```ruby
access_token = 'access_token'
sensor_param = SensorParam.new

result = sensors_controller.create_get_sensors_cargo(access_token, sensor_param)

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |



[Back to List of Controllers](#list_of_controllers)



