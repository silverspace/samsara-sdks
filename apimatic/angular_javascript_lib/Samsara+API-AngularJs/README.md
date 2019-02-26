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

The generated SDK requires AngularJS framework to work. If you do not already have angular downloaded, please go ahead and do it from [here](https://angularjs.org/).
You will also need to download and link [angular-moment](https://cdnjs.cloudflare.com/ajax/libs/angular-moment/1.0.1/angular-moment.min.js) and [moment.js](https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.17.1/moment.min.js) with your project because the SDK internally uses moment.js.

## How to Use

The following section describes how to use the generated SDK in an existing/new project.

### 1. Configure Angular and Generated SDK
Perform the following steps to configure angular and the SDK:
+ Make a `scripts` folder inside the root folder of the project. If you already have a `scripts` folder, skip to the next step.
+ Move the `angular.min.js` file inside the scripts folder. 
+ Move the `SamsaraAPILib` folder inside the scripts folder.
+ If any of the Custom Types in your API have `Date`/`Datetime` type fields or any endpoint has `Date`/`Datetime` response, you will need to download angular-moment and moment.js. Move these 2 files into the `scripts` folder as well.

![folder-structure-image](https://apidocs.io/illustration/angularjs?step=folderStructure&workspaceFolder=Samsara%20API-Angular&projectName=SamsaraAPILib)

### 2. Open Project Folder
Open an IDE/Text Editor for JavaScript like Sublime Text. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.  
Click on `File` and select `Open Folder`

Select the folder of your SDK and click on `Select Folder` to open it up in Sublime Text. The folder will become visible in the bar on the left.

![open-folder-image](https://apidocs.io/illustration/angularjs?step=openFolder&workspaceFolder=Samsara%20API-Angular)

### 3. Create an Angular Application
Since Angular JS is used for client-side web development, in order to use the generated library, you will have to develop an application first.
If you already have an angular application, [skip to Step 6](#6-include-sdk-references-in-html-file). Otherwise, follow these steps to create one:

+ In the IDE, click on `File` and choose `New File` to create a new file.
+ Add the following starting code in the file:
```js
var app = angular.module('myApp', []);
app.controller('testController', function($scope) 
{

});
```
+ Save it with the name `app.js` in the `scripts` folder.


### 4. Create HTML File
Skip to the next step if you are working with an existing project and already have an html file. Otherwise follow the steps to create one:
+ Inside the IDE, right click on the project folder name and select the `New File` option to create a new test file.
+ Save it with an appropriate name such as `index.html` in the root of your project folder.
`index.html` should look like this:
```html
<!DOCTYPE html>
<html>
<head>
	<title>Angular Project</title>
	<script></script>
</head>

<body>
</body>

</html>
```

![initial-html-code-image](https://apidocs.io/illustration/angularjs?step=initialCode&workspaceFolder=Samsara%20API-Angular)

### 5. Including links to Angular in HTML file
Your HTML file needs to have a link to `angular.min.js` file to use Angular-JS. Add the link using `script` tags inside the `head` section of `index.html` like:
```html
<script src="scripts/angular.min.js" ></script>
```
If any of the Custom Types that you have defined have `Date`/`Datetime` type fields or any endpoint has `Date`/`Datetime` response, you will also need to link to angular-moment and moment.js like:
```html
<script src="scripts/angular.min.js" ></script>
<script src="scripts/moment.min.js" ></script>
<script src="scripts/angular-moment.min.js" ></script>
```

### 6. Include SDK references in HTML file
Import the reference to the generated SDK files inside your html file like:
```html
<head>
    ...
    <!-- Helper files -->
    <script src="scripts/SamsaraAPILib/Module.js"></script>
    <script src="scripts/SamsaraAPILib/Configuration.js"></script>
    <script src="scripts/SamsaraAPILib/ModelFactory.js"></script>
    <script src="scripts/SamsaraAPILib/ObjectMapper.js"></script>
    <script src="scripts/SamsaraAPILib/APIHelper.js"></script>
    <script src="scripts/SamsaraAPILib/Http/Client/HttpContext.js"></script>
    <script src="scripts/SamsaraAPILib/Http/Client/HttpClient.js"></script>
    <script src="scripts/SamsaraAPILib/Http/Request/HttpRequest.js"></script>
    <script src="scripts/SamsaraAPILib/Http/Response/HttpResponse.js"></script>

    <!-- API Controllers -->
    <script src="scripts/SamsaraAPILib/Controllers/BaseController.js"></script>
    <script src="scripts/SamsaraAPILib/Controllers/TagsController.js"></script>
    <script src="scripts/SamsaraAPILib/Controllers/FleetController.js"></script>
    <script src="scripts/SamsaraAPILib/Controllers/UsersController.js"></script>
    <script src="scripts/SamsaraAPILib/Controllers/IndustrialController.js"></script>
    <script src="scripts/SamsaraAPILib/Controllers/SensorsController.js"></script>


    <!-- Models -->
    <script src="scripts/SamsaraAPILib/Models/BaseModel.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Vibration.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Vertex.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleUpdateParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleStat.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TripsParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleInfo.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleDefect.js"></script>
    <script src="scripts/SamsaraAPILib/Models/ReactivateDriverParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Vehicle2.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Summary.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Sensor4.js"></script>
    <script src="scripts/SamsaraAPILib/Models/ReeferStats.js"></script>
    <script src="scripts/SamsaraAPILib/Models/NextDriverSignature.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DriverForCreate.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DispatchRouteCreate.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Trip.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DispatchRouteBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DispatchRoute.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DispatchJob.js"></script>
    <script src="scripts/SamsaraAPILib/Models/NameEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/ValueEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/MechanicOrAgentSignature.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HosLogsParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HosAuthenticationLogsParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TrailerDefect.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HistoryParam1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Tag1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Log.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Polygon.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Driver.js"></script>
    <script src="scripts/SamsaraAPILib/Models/FieldEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/PhotoValue.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Passenger.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Driver1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/NumberValueTypeMetadata.js"></script>
    <script src="scripts/SamsaraAPILib/Models/StartCoordinates.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HarshAccelSettingEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DiagnosticTroubleCode.js"></script>
    <script src="scripts/SamsaraAPILib/Models/J1939.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HosLogsParam2.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GroupParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/SetPoint.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Series1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GroupDriversParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Delete.js"></script>
    <script src="scripts/SamsaraAPILib/Models/SeriesEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/SensorParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetVehicleStatsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Day.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AuthorSignature.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Sensor5.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Sensor2.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AuthenticationLog.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Sensor1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetAllTagsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/SafeEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetAllDataInputsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/ReturnAirTemp.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetAllAssetsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Result.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetAllAssetCurrentLocationsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/PowerStatus.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetSensorsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Point.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetMachinesResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Machine1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetFleetMaintenanceListResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AssetLocationResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Alarm1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Location.js"></script>
    <script src="scripts/SamsaraAPILib/Models/ListFleetResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AddressParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Addresses1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/CreateDvirParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HistoryParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleSafetyScoreResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/GetFleetLocationsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Address1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Add.js"></script>
    <script src="scripts/SamsaraAPILib/Models/PrevJobStatusEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/JobUpdateObject.js"></script>
    <script src="scripts/SamsaraAPILib/Models/JobStatusEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/FillMissingEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleHarshEventResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Vehicle.js"></script>
    <script src="scripts/SamsaraAPILib/Models/FuelPercentage.js"></script>
    <script src="scripts/SamsaraAPILib/Models/UserBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/User.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TagUpdate.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TagCreate.js"></script>
    <script src="scripts/SamsaraAPILib/Models/FleetVehiclesLocation.js"></script>
    <script src="scripts/SamsaraAPILib/Models/CheckEngineLight1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/EngineHour.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Cable.js"></script>
    <script src="scripts/SamsaraAPILib/Models/EndCoordinates.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleLocation.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DriversSummaryParam.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Tag.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Pagination.js"></script>
    <script src="scripts/SamsaraAPILib/Models/FleetVehicleResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DiagnosticTroubleCode1.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DvirBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Data.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Circle.js"></script>
    <script src="scripts/SamsaraAPILib/Models/CheckEngineLight.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DriverSafetyScoreResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Addresses.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AuthTypeEnum.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Alarm.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AllRouteJobUpdates.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TripResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedVehicleBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedSensorBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedMachineBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedDriverBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedAssetBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedAddressBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/SensorHistoryResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/MachineHistoryResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HosLogsSummaryResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/FleetVehicleLocation.js"></script>
    <script src="scripts/SamsaraAPILib/Models/VehicleMaintenance.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DocumentType.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DocumentFieldCreate.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DocumentField.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HosLogsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HosAuthenticationLogsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/UserTagRole.js"></script>
    <script src="scripts/SamsaraAPILib/Models/UserRole.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DriverBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TemperatureResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DocumentCreate.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Document.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Contact.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DvirListResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DriversSummaryResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DriversResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedVehicle.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DriverDailyLogResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedSensor.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DispatchRouteHistory.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AssetCurrentLocationsResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedMachine.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedDriver.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedAsset.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TaggedAddress.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TagModify.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AssetCurrentLocation.js"></script>
    <script src="scripts/SamsaraAPILib/Models/TagMetadata.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Sensor.js"></script>
    <script src="scripts/SamsaraAPILib/Models/SafetyReportHarshEvent.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Machine.js"></script>
    <script src="scripts/SamsaraAPILib/Models/HumidityResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/EngineState.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Asset.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DoorResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DocumentFieldType.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DispatchJobCreate.js"></script>
    <script src="scripts/SamsaraAPILib/Models/Address.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DocumentBase.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DispatchRouteHistoricalEntry.js"></script>
    <script src="scripts/SamsaraAPILib/Models/DataInputHistoryResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/CargoResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AuxInput.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AuxInputSeries.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AssetReeferResponse.js"></script>
    <script src="scripts/SamsaraAPILib/Models/AddressGeofence.js"></script>

    ...
</head>
```
> The `Module.js` file should be imported before the other files. After `Module.js`, `Configuration.js` should be imported.
> The `ModelFactory.js` file is needed by `ObjectMapper.js` file. The `ObjectMapper` in turn, is needed by `BaseController.js`.

### 7. Including link to `app.js` in HTML file
Link your `app.js` file to your `index.html` file like:
```html
<head>
	...
	<script src="scripts/app.js"></script>
</head>
```
> The link to app.js needs to be included at the very end of the head tag, after the SDK references have been added

### 8. Initializing the Angular App
You need to initialize your app and the controller associated with your view inside your `index.html` file. Do so like:
+ Add ng-app directive to initialize your app inside the `body` tag.
```html
<body ng-app="myApp">
```
+ Add ng-controller directive to initialize your controller and bind it with your view (`index.html` file).
```html
...
<body ng-app="myApp">
	<div ng-controller="testController">
		...
	</div>
	...
</body>
...
```

### 9. Consuming the SDK 
In order to use the generated SDK's modules, controllers and factories, the project needs to be added as a dependency in your angular app's module. This will be done inside the `app.js` file.
Add the dependency like this:

```js
var app = angular.module('myApp', ['SamsaraAPILib']);
```
At this point, the SDK has been successfully included in your project. Further steps include using a service/factory from the generated SDK. To see working example of this, please head on [over here](#list-of-controllers) and choose any class to see its functions and example usage.  

### 10. Running The App
To run the app, simply open up the `index.html` file in a browser.

![app-running](https://apidocs.io/illustration/angularjs?step=appRunning)

## Initialization


The Angular Application can be initialized as following:
```JavaScript
var app = angular.module('myApp', [SamsaraAPILib]);
// now controllers/services can be created which import
// the factories provided by the sdk
```
### Authentication
In order to setup authentication and initialization of the Angular App, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accessToken | API Access Token |



```js
var app = angular.module('myApp', [SamsaraAPILib]);

app.run(function(Configuration) {
    // Configuration parameters and credentials
    Configuration.accessToken = 'accessToken'; // API Access Token
    
});
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

The singleton instance of the ``` TagsController ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, TagsController, Tag, GetAllTagsResponse){
	});
```

### <a name="delete_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.deleteTagById") deleteTagById

> Permanently deletes a tag.


```javascript
function deleteTagById(accessToken, tagId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TagsController){
        var accessToken = access_token;
        var tagId = 48;


		var result = TagsController.deleteTagById(accessToken, tagId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.getTagById") getTagById

> Fetch a tag by id.


```javascript
function getTagById(accessToken, tagId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TagsController, Tag){
        var accessToken = access_token;
        var tagId = 48;


		var result = TagsController.getTagById(accessToken, tagId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="modify_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.modifyTagById") modifyTagById

> Add or delete specific members from a tag, or modify the name of a tag.


```javascript
function modifyTagById(accessToken, tagId, tagModifyParams)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| tagModifyParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TagsController, Tag){
        var accessToken = access_token;
        var tagId = 48;
        var tagModifyParams = new TagModify({"key":"value"});


		var result = TagsController.modifyTagById(accessToken, tagId, tagModifyParams);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_tag"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.createTag") createTag

> Create a new tag for the group.


```javascript
function createTag(accessToken, tagCreateParams)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagCreateParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TagsController, Tag){
        var accessToken = access_token;
        var tagCreateParams = new TagCreate({"key":"value"});


		var result = TagsController.createTag(accessToken, tagCreateParams);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_tag_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.updateTagById") updateTagById

> Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.


```javascript
function updateTagById(accessToken, tagId, updateTagParams)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tagId |  ``` Required ```  | ID of the tag. |
| updateTagParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TagsController, Tag){
        var accessToken = access_token;
        var tagId = 48;
        var updateTagParams = new TagUpdate({"key":"value"});


		var result = TagsController.updateTagById(accessToken, tagId, updateTagParams);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_tags"></a>![Method: ](https://apidocs.io/img/method.png ".TagsController.getAllTags") getAllTags

> Fetch all of the tags for a group.


```javascript
function getAllTags(accessToken, groupId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```javascript


	app.controller("testController", function($scope, TagsController, GetAllTagsResponse){
        var accessToken = access_token;
        var groupId = 48;


		var result = TagsController.getAllTags(accessToken, groupId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="fleet_controller"></a>![Class: ](https://apidocs.io/img/class.png ".FleetController") FleetController

### Get singleton instance

The singleton instance of the ``` FleetController ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, FleetController, DocumentType, FleetVehicleLocation, DispatchRoute, FleetVehicleResponse, VehicleSafetyScoreResponse, VehicleHarshEventResponse, FleetVehiclesLocation, DvirListResponse, ListFleetResponse, DriverDailyLogResponse, Document, TripResponse, GetFleetMaintenanceListResponse, DvirBase, DriverSafetyScoreResponse, GetFleetLocationsResponse, HosLogsSummaryResponse, HosLogsResponse, HosAuthenticationLogsResponse, DriversSummaryResponse, GetVehicleStatsResponse, Driver, DispatchRouteHistory, AllRouteJobUpdates, AssetReeferResponse, AssetLocationResponse, DriversResponse, GetAllAssetCurrentLocationsResponse, GetAllAssetsResponse, Contact, Address){
	});
```

### <a name="get_driver_document_types_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverDocumentTypesByOrgId") getDriverDocumentTypesByOrgId

> Fetch all of the document types.


```javascript
function getDriverDocumentTypesByOrgId()
```

#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DocumentType){


		var result = FleetController.getDriverDocumentTypesByOrgId();
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleLocations") getVehicleLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.


```javascript
function getVehicleLocations(accessToken, vehicleId, startMs, endMs)
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


	app.controller("testController", function($scope, FleetController, FleetVehicleLocation){
        var accessToken = access_token;
        var vehicleId = 48;
        var startMs = 48;
        var endMs = 48;


		var result = FleetController.getVehicleLocations(accessToken, vehicleId, startMs, endMs);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_vehicle_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createVehicleDispatchRoute") createVehicleDispatchRoute

> Create a new dispatch route for the vehicle with vehicle_id.


```javascript
function createVehicleDispatchRoute(createDispatchRouteParams, accessToken, vehicleId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleId |  ``` Required ```  | ID of the vehicle with the associated routes. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var createDispatchRouteParams = new DispatchRouteCreate({"key":"value"});
        var accessToken = access_token;
        var vehicleId = 48;


		var result = FleetController.createVehicleDispatchRoute(createDispatchRouteParams, accessToken, vehicleId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_routes_by_vehicle_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRoutesByVehicleId") getDispatchRoutesByVehicleId

> Fetch all of the dispatch routes for a given vehicle.


```javascript
function getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)
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


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var accessToken = access_token;
        var vehicleId = 48;
        var endTime = 48;
        var duration = 48;


		var result = FleetController.getDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="patch_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.patchFleetVehicle") patchFleetVehicle

> Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.


```javascript
function patchFleetVehicle(accessToken, vehicleIdOrExternalId, data)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |
| data |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, FleetVehicleResponse){
        var accessToken = access_token;
        var vehicleIdOrExternalId = vehicle_id_or_external_id;
        var data = new Data({"key":"value"});


		var result = FleetController.patchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleSafetyScore") getVehicleSafetyScore

> Fetch the safety score for the vehicle.


```javascript
function getVehicleSafetyScore(accessToken, startMs, endMs, vehicleId)
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


	app.controller("testController", function($scope, FleetController, VehicleSafetyScoreResponse){
        var accessToken = access_token;
        var startMs = 48;
        var endMs = 48;
        var vehicleId = 48;


		var result = FleetController.getVehicleSafetyScore(accessToken, startMs, endMs, vehicleId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_harsh_event"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleHarshEvent") getVehicleHarshEvent

> Fetch harsh event details for a vehicle.


```javascript
function getVehicleHarshEvent(accessToken, timestamp, vehicleId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| timestamp |  ``` Required ```  | Timestamp in milliseconds representing the timestamp of a harsh event. |
| vehicleId |  ``` Required ```  | ID of the vehicle |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, VehicleHarshEventResponse){
        var accessToken = access_token;
        var timestamp = 48;
        var vehicleId = 48;


		var result = FleetController.getVehicleHarshEvent(accessToken, timestamp, vehicleId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicles_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehiclesLocations") getVehiclesLocations

> Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.


```javascript
function getVehiclesLocations(accessToken, startMs, endMs)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| startMs |  ``` Required ```  | Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) |
| endMs |  ``` Required ```  | Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, FleetVehiclesLocation){
        var accessToken = access_token;
        var startMs = 48;
        var endMs = 48;


		var result = FleetController.getVehiclesLocations(accessToken, startMs, endMs);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dvirs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDvirs") getDvirs

> Get DVIRs for the org within provided time constraints


```javascript
function getDvirs(accessToken, endMs, durationMs, groupId)
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


	app.controller("testController", function($scope, FleetController, DvirListResponse){
        var accessToken = access_token;
        var endMs = 48;
        var durationMs = 48;
        var groupId = 48;


		var result = FleetController.getDvirs(accessToken, endMs, durationMs, groupId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_fleet_vehicle"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getFleetVehicle") getFleetVehicle

> Gets a specific vehicle.


```javascript
function getFleetVehicle(accessToken, vehicleIdOrExternalId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleIdOrExternalId |  ``` Required ```  | ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, FleetVehicleResponse){
        var accessToken = access_token;
        var vehicleIdOrExternalId = vehicle_id_or_external_id;


		var result = FleetController.getFleetVehicle(accessToken, vehicleIdOrExternalId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_list_fleet"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createListFleet") createListFleet

> Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.


```javascript
function createListFleet(accessToken, groupParam, startingAfter, endingBefore, limit)
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


	app.controller("testController", function($scope, FleetController, ListFleetResponse){
        var accessToken = access_token;
        var groupParam = new GroupParam({"key":"value"});
        var startingAfter = 'startingAfter';
        var endingBefore = 'endingBefore';
        var limit = 48;


		var result = FleetController.createListFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers_hos_daily_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDriversHosDailyLogs") createGetFleetDriversHosDailyLogs

> Get summarized daily HOS charts for a specified driver.


```javascript
function createGetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with HOS logs. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DriverDailyLogResponse){
        var accessToken = access_token;
        var driverId = 48;
        var hosLogsParam = new HosLogsParam({"key":"value"});


		var result = FleetController.createGetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver_document"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriverDocument") createDriverDocument

> Create a driver document for the given driver.


```javascript
function createDriverDocument(createDocumentParams, accessToken, driverId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDocumentParams |  ``` Required ```  | To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver for whom the document is created. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Document){
        var createDocumentParams = new DocumentCreate({"key":"value"});
        var accessToken = access_token;
        var driverId = 48;


		var result = FleetController.createDriverDocument(createDocumentParams, accessToken, driverId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriverDispatchRoute") createDriverDispatchRoute

> Create a new dispatch route for the driver with driver_id.


```javascript
function createDriverDispatchRoute(createDispatchRouteParams, accessToken, driverId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverId |  ``` Required ```  | ID of the driver with the associated routes. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var createDispatchRouteParams = new DispatchRouteCreate({"key":"value"});
        var accessToken = access_token;
        var driverId = 48;


		var result = FleetController.createDriverDispatchRoute(createDispatchRouteParams, accessToken, driverId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_trips"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetTrips") createGetFleetTrips

> Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.


```javascript
function createGetFleetTrips(accessToken, tripsParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| tripsParam |  ``` Required ```  | Group ID, vehicle ID and time range to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, TripResponse){
        var accessToken = access_token;
        var tripsParam = new TripsParam({"key":"value"});


		var result = FleetController.createGetFleetTrips(accessToken, tripsParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_vehicles"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateVehicles") updateVehicles

> This method enables the mutation of metadata for vehicles in the Samsara Cloud.


```javascript
function updateVehicles(accessToken, vehicleUpdateParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| vehicleUpdateParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController){
        var accessToken = access_token;
        var vehicleUpdateParam = new VehicleUpdateParam({"key":"value"});


		var result = FleetController.updateVehicles(accessToken, vehicleUpdateParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_maintenance_list"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetMaintenanceList") createGetFleetMaintenanceList

> Get list of the vehicles with any engine faults or check light data.


```javascript
function createGetFleetMaintenanceList(accessToken, groupParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, GetFleetMaintenanceListResponse){
        var accessToken = access_token;
        var groupParam = new GroupParam({"key":"value"});


		var result = FleetController.createGetFleetMaintenanceList(accessToken, groupParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_routes_by_driver_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRoutesByDriverId") getDispatchRoutesByDriverId

> Fetch all of the dispatch routes for a given driver.


```javascript
function getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)
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


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var accessToken = access_token;
        var driverId = 48;
        var endTime = 48;
        var duration = 48;


		var result = FleetController.getDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_dvir"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDvir") createDvir

> Create a new dvir, marking a vehicle or trailer safe or unsafe.


```javascript
function createDvir(accessToken, createDvirParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDvirParam |  ``` Required ```  | DVIR creation body |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DvirBase){
        var accessToken = access_token;
        var createDvirParam = new CreateDvirParam({"key":"value"});


		var result = FleetController.createDvir(accessToken, createDvirParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_safety_score"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverSafetyScore") getDriverSafetyScore

> Fetch the safety score for the driver.


```javascript
function getDriverSafetyScore(accessToken, startMs, endMs, driverId)
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


	app.controller("testController", function($scope, FleetController, DriverSafetyScoreResponse){
        var accessToken = access_token;
        var startMs = 48;
        var endMs = 48;
        var driverId = 48;


		var result = FleetController.getDriverSafetyScore(accessToken, startMs, endMs, driverId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetLocations") createGetFleetLocations

> Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.


```javascript
function createGetFleetLocations(accessToken, groupParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, GetFleetLocationsResponse){
        var accessToken = access_token;
        var groupParam = new GroupParam({"key":"value"});


		var result = FleetController.createGetFleetLocations(accessToken, groupParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_logs_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosLogsSummary") createGetFleetHosLogsSummary

> Get the current HOS status for all drivers in the group.


```javascript
function createGetFleetHosLogsSummary(accessToken, hosLogsParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, HosLogsSummaryResponse){
        var accessToken = access_token;
        var hosLogsParam = new HosLogsParam2({"key":"value"});


		var result = FleetController.createGetFleetHosLogsSummary(accessToken, hosLogsParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosLogs") createGetFleetHosLogs

> Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.


```javascript
function createGetFleetHosLogs(accessToken, hosLogsParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, HosLogsResponse){
        var accessToken = access_token;
        var hosLogsParam = new HosLogsParam({"key":"value"});


		var result = FleetController.createGetFleetHosLogs(accessToken, hosLogsParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_hos_authentication_logs"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetHosAuthenticationLogs") createGetFleetHosAuthenticationLogs

> Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.


```javascript
function createGetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| hosAuthenticationLogsParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, HosAuthenticationLogsResponse){
        var accessToken = access_token;
        var hosAuthenticationLogsParam = new HosAuthenticationLogsParam({"key":"value"});


		var result = FleetController.createGetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers_summary"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDriversSummary") createGetFleetDriversSummary

> Get the distance and time each driver in an organization has driven in a given time period.


```javascript
function createGetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driversSummaryParam |  ``` Required ```  | Org ID and time range to query. |
| snapToDayBounds |  ``` Optional ```  | Snap query result to HOS day boundaries. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DriversSummaryResponse){
        var accessToken = access_token;
        var driversSummaryParam = new DriversSummaryParam({"key":"value"});
        var snapToDayBounds = false;


		var result = FleetController.createGetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_vehicle_stats"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getVehicleStats") getVehicleStats

> Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.


```javascript
function getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit)
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


	app.controller("testController", function($scope, FleetController, GetVehicleStatsResponse){
        var accessToken = access_token;
        var startMs = 48;
        var endMs = 48;
        var series = Object.keys(SeriesEnum)[0];
        var tagIds = 'tagIds';
        var startingAfter = 'startingAfter';
        var endingBefore = 'endingBefore';
        var limit = 6;


		var result = FleetController.getVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_reactivate_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateReactivateDriverById") updateReactivateDriverById

> Reactivate the inactive driver having id.


```javascript
function updateReactivateDriverById(reactivateDriverParam, accessToken, driverIdOrExternalId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| reactivateDriverParam |  ``` Required ```  | Driver reactivation body |
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Driver){
        var reactivateDriverParam = new ReactivateDriverParam({"key":"value"});
        var accessToken = access_token;
        var driverIdOrExternalId = driver_id_or_external_id;


		var result = FleetController.updateReactivateDriverById(reactivateDriverParam, accessToken, driverIdOrExternalId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_documents_by_org_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverDocumentsByOrgId") getDriverDocumentsByOrgId

> Fetch all of the documents.


```javascript
function getDriverDocumentsByOrgId(accessToken, endMs, durationMs)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| endMs |  ``` Optional ```  | Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. |
| durationMs |  ``` Optional ```  | Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Document){
        var accessToken = access_token;
        var endMs = 6;
        var durationMs = 6;


		var result = FleetController.getDriverDocumentsByOrgId(accessToken, endMs, durationMs);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_deactivate_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteDeactivateDriver") deleteDeactivateDriver

> Deactivate a driver with the given id.


```javascript
function deleteDeactivateDriver(accessToken, driverIdOrExternalId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController){
        var accessToken = access_token;
        var driverIdOrExternalId = driver_id_or_external_id;


		var result = FleetController.deleteDeactivateDriver(accessToken, driverIdOrExternalId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_route_history"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRouteHistory") getDispatchRouteHistory

> Fetch the history of a dispatch route.


```javascript
function getDispatchRouteHistory(accessToken, routeId, startTime, endTime)
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


	app.controller("testController", function($scope, FleetController, DispatchRouteHistory){
        var accessToken = access_token;
        var routeId = 6;
        var startTime = 6;
        var endTime = 6;


		var result = FleetController.getDispatchRouteHistory(accessToken, routeId, startTime, endTime);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateDispatchRouteById") updateDispatchRouteById

> Update a dispatch route and its associated jobs.


```javascript
function updateDispatchRouteById(updateDispatchRouteParams, accessToken, routeId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var updateDispatchRouteParams = new DispatchRoute({"key":"value"});
        var accessToken = access_token;
        var routeId = 6;


		var result = FleetController.updateDispatchRouteById(updateDispatchRouteParams, accessToken, routeId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="fetch_all_route_job_updates"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetchAllRouteJobUpdates") fetchAllRouteJobUpdates

> Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID


```javascript
function fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)
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


	app.controller("testController", function($scope, FleetController, AllRouteJobUpdates){
        var accessToken = access_token;
        var groupId = 6;
        var sequenceId = sequence_id;
        var include = 'include';


		var result = FleetController.fetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="fetch_all_dispatch_routes"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.fetchAllDispatchRoutes") fetchAllDispatchRoutes

> Fetch all of the dispatch routes for the group.


```javascript
function fetchAllDispatchRoutes(accessToken, groupId, endTime, duration)
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


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var accessToken = access_token;
        var groupId = 6;
        var endTime = 6;
        var duration = 6;


		var result = FleetController.fetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_asset_reefer"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAssetReefer") getAssetReefer

> Fetch the reefer-specific stats of an asset.


```javascript
function getAssetReefer(accessToken, assetId, startMs, endMs)
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


	app.controller("testController", function($scope, FleetController, AssetReeferResponse){
        var accessToken = access_token;
        var assetId = 6;
        var startMs = 6;
        var endMs = 6;


		var result = FleetController.getAssetReefer(accessToken, assetId, startMs, endMs);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_asset_location"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAssetLocation") getAssetLocation

> Fetch the historical locations for the asset.


```javascript
function getAssetLocation(accessToken, assetId, startMs, endMs)
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


	app.controller("testController", function($scope, FleetController, AssetLocationResponse){
        var accessToken = access_token;
        var assetId = 6;
        var startMs = 6;
        var endMs = 6;


		var result = FleetController.getAssetLocation(accessToken, assetId, startMs, endMs);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDriverById") getDriverById

> Fetch driver by id.


```javascript
function getDriverById(accessToken, driverIdOrExternalId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Driver){
        var accessToken = access_token;
        var driverIdOrExternalId = driver_id_or_external_id;


		var result = FleetController.getDriverById(accessToken, driverIdOrExternalId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_deactivated_driver_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDeactivatedDriverById") getDeactivatedDriverById

> Fetch deactivated driver by id.


```javascript
function getDeactivatedDriverById(accessToken, driverIdOrExternalId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| driverIdOrExternalId |  ``` Required ```  | ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Driver){
        var accessToken = access_token;
        var driverIdOrExternalId = driver_id_or_external_id;


		var result = FleetController.getDeactivatedDriverById(accessToken, driverIdOrExternalId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_deactivated_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllDeactivatedDrivers") getAllDeactivatedDrivers

> Fetch all deactivated drivers for the group.


```javascript
function getAllDeactivatedDrivers(accessToken, groupId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupId |  ``` Optional ```  | Optional group ID if the organization has multiple groups (uncommon). |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Driver){
        var accessToken = access_token;
        var groupId = 6;


		var result = FleetController.getAllDeactivatedDrivers(accessToken, groupId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_driver"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDriver") createDriver

> Create a new driver.


```javascript
function createDriver(accessToken, createDriverParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDriverParam |  ``` Required ```  | Driver creation body |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Driver){
        var accessToken = access_token;
        var createDriverParam = new DriverForCreate({"key":"value"});


		var result = FleetController.createDriver(accessToken, createDriverParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_fleet_drivers"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createGetFleetDrivers") createGetFleetDrivers

> Get all the drivers for the specified group.


```javascript
function createGetFleetDrivers(accessToken, groupDriversParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupDriversParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DriversResponse){
        var accessToken = access_token;
        var groupDriversParam = new GroupDriversParam({"key":"value"});


		var result = FleetController.createGetFleetDrivers(accessToken, groupDriversParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteDispatchRouteById") deleteDispatchRouteById

> Delete a dispatch route and its associated jobs.


```javascript
function deleteDispatchRouteById(accessToken, routeId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController){
        var accessToken = access_token;
        var routeId = 6;


		var result = FleetController.deleteDispatchRouteById(accessToken, routeId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_dispatch_route_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getDispatchRouteById") getDispatchRouteById

> Fetch a dispatch route by id.


```javascript
function getDispatchRouteById(accessToken, routeId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| routeId |  ``` Required ```  | ID of the dispatch route. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var accessToken = access_token;
        var routeId = 6;


		var result = FleetController.getDispatchRouteById(accessToken, routeId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_dispatch_route"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.createDispatchRoute") createDispatchRoute

> Create a new dispatch route.


```javascript
function createDispatchRoute(accessToken, createDispatchRouteParams)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| createDispatchRouteParams |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, DispatchRoute){
        var accessToken = access_token;
        var createDispatchRouteParams = new DispatchRouteCreate({"key":"value"});


		var result = FleetController.createDispatchRoute(accessToken, createDispatchRouteParams);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_asset_current_locations"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllAssetCurrentLocations") getAllAssetCurrentLocations

> Fetch current locations of all assets for the group.


```javascript
function getAllAssetCurrentLocations(accessToken)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, GetAllAssetCurrentLocationsResponse){
        var accessToken = access_token;


		var result = FleetController.getAllAssetCurrentLocations(accessToken);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_assets"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getAllAssets") getAllAssets

> Fetch all of the assets for the group.


```javascript
function getAllAssets(accessToken)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, GetAllAssetsResponse){
        var accessToken = access_token;


		var result = FleetController.getAllAssets(accessToken);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="add_fleet_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.addFleetAddress") addFleetAddress

> This method adds an address book entry to the specified group.


```javascript
function addFleetAddress(accessToken, addressParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressParam |  ``` Required ```  | TODO: Add a parameter description |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController){
        var accessToken = access_token;
        var addressParam = new AddressParam({"key":"value"});


		var result = FleetController.addFleetAddress(accessToken, addressParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_contact"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationContact") getOrganizationContact

> Fetch a contact by its id.


```javascript
function getOrganizationContact(accessToken, contactId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| contactId |  ``` Required ```  | ID of the contact |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Contact){
        var accessToken = access_token;
        var contactId = 6;


		var result = FleetController.getOrganizationContact(accessToken, contactId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_contacts"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.listContacts") listContacts

> Fetch all contacts for the organization.


```javascript
function listContacts(accessToken)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Contact){
        var accessToken = access_token;


		var result = FleetController.listContacts(accessToken);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="delete_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.deleteOrganizationAddress") deleteOrganizationAddress

> Delete an address.


```javascript
function deleteOrganizationAddress(accessToken, addressId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController){
        var accessToken = access_token;
        var addressId = 6;


		var result = FleetController.deleteOrganizationAddress(accessToken, addressId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationAddress") getOrganizationAddress

> Fetch an address by its id.


```javascript
function getOrganizationAddress(accessToken, addressId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Address){
        var accessToken = access_token;
        var addressId = 6;


		var result = FleetController.getOrganizationAddress(accessToken, addressId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="update_organization_address"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.updateOrganizationAddress") updateOrganizationAddress

> Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.


```javascript
function updateOrganizationAddress(accessToken, address, addressId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| address |  ``` Required ```  | Update parts of an address's value. If the geofence 'circle' or 'polygon' key is specified, the update will change the type of geofence accordingly. |
| addressId |  ``` Required ```  | ID of the address/geofence |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController){
        var accessToken = access_token;
        var address = new Address1({"key":"value"});
        var addressId = 6;


		var result = FleetController.updateOrganizationAddress(accessToken, address, addressId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.getOrganizationAddresses") getOrganizationAddresses

> Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.


```javascript
function getOrganizationAddresses(accessToken)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Address){
        var accessToken = access_token;


		var result = FleetController.getOrganizationAddresses(accessToken);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="add_organization_addresses"></a>![Method: ](https://apidocs.io/img/method.png ".FleetController.addOrganizationAddresses") addOrganizationAddresses

> Add one or more addresses to the organization


```javascript
function addOrganizationAddresses(accessToken, addresses)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| addresses |  ``` Required ```  | List of addresses/geofences to add. Geofences can be circular or a polygon. 
For each address, only one of 'circle' or 'polygon' should be provided. If both are provided, the geofence will be saved as a polygon. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, FleetController, Address){
        var accessToken = access_token;
        var addresses = new Addresses({"key":"value"});


		var result = FleetController.addOrganizationAddresses(accessToken, addresses);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png ".UsersController") UsersController

### Get singleton instance

The singleton instance of the ``` UsersController ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, UsersController, User, UserRole){
	});
```

### <a name="delete_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.deleteUserById") deleteUserById

> Remove a user from the organization.


```javascript
function deleteUserById(accessToken, userId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, UsersController){
        var accessToken = access_token;
        var userId = 6;


		var result = UsersController.deleteUserById(accessToken, userId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_user_by_id"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.getUserById") getUserById

> Get a user.


```javascript
function getUserById(accessToken, userId)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| userId |  ``` Required ```  | ID of the user. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, UsersController, User){
        var accessToken = access_token;
        var userId = 6;


		var result = UsersController.getUserById(accessToken, userId);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_users"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.listUsers") listUsers

> List all users in the organization.


```javascript
function listUsers(accessToken)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, UsersController, User){
        var accessToken = access_token;


		var result = UsersController.listUsers(accessToken);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="list_user_roles"></a>![Method: ](https://apidocs.io/img/method.png ".UsersController.listUserRoles") listUserRoles

> Get all roles in the organization.


```javascript
function listUserRoles(accessToken)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, UsersController, UserRole){
        var accessToken = access_token;


		var result = UsersController.listUserRoles(accessToken);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="industrial_controller"></a>![Class: ](https://apidocs.io/img/class.png ".IndustrialController") IndustrialController

### Get singleton instance

The singleton instance of the ``` IndustrialController ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, IndustrialController, DataInputHistoryResponse, GetAllDataInputsResponse, GetMachinesResponse, MachineHistoryResponse){
	});
```

### <a name="get_data_input"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.getDataInput") getDataInput

> Fetch datapoints from a given data input.


```javascript
function getDataInput(accessToken, dataInputId, startMs, endMs)
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


	app.controller("testController", function($scope, IndustrialController, DataInputHistoryResponse){
        var accessToken = access_token;
        var dataInputId = 6;
        var startMs = 6;
        var endMs = 6;


		var result = IndustrialController.getDataInput(accessToken, dataInputId, startMs, endMs);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="get_all_data_inputs"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.getAllDataInputs") getAllDataInputs

> Fetch all of the data inputs for a group.


```javascript
function getAllDataInputs(accessToken, groupId, startMs, endMs)
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


	app.controller("testController", function($scope, IndustrialController, GetAllDataInputsResponse){
        var accessToken = access_token;
        var groupId = 6;
        var startMs = 6;
        var endMs = 6;


		var result = IndustrialController.getAllDataInputs(accessToken, groupId, startMs, endMs);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_machines"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.createGetMachines") createGetMachines

> Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.


```javascript
function createGetMachines(accessToken, groupParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, IndustrialController, GetMachinesResponse){
        var accessToken = access_token;
        var groupParam = new GroupParam({"key":"value"});


		var result = IndustrialController.createGetMachines(accessToken, groupParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_machines_history"></a>![Method: ](https://apidocs.io/img/method.png ".IndustrialController.createGetMachinesHistory") createGetMachinesHistory

> Get historical data for machine objects. This method returns a set of historical data for all machines in a group


```javascript
function createGetMachinesHistory(accessToken, historyParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID and time range to query for events |



#### Example Usage

```javascript


	app.controller("testController", function($scope, IndustrialController, MachineHistoryResponse){
        var accessToken = access_token;
        var historyParam = new HistoryParam({"key":"value"});


		var result = IndustrialController.createGetMachinesHistory(accessToken, historyParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)

## <a name="sensors_controller"></a>![Class: ](https://apidocs.io/img/class.png ".SensorsController") SensorsController

### Get singleton instance

The singleton instance of the ``` SensorsController ``` class can be accessed via Dependency Injection.

```js
	app.controller("testController", function($scope, SensorsController, TemperatureResponse, GetSensorsResponse, HumidityResponse, SensorHistoryResponse, DoorResponse, CargoResponse){
	});
```

### <a name="create_get_sensors_temperature"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsTemperature") createGetSensorsTemperature

> Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.


```javascript
function createGetSensorsTemperature(accessToken, sensorParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, SensorsController, TemperatureResponse){
        var accessToken = access_token;
        var sensorParam = new SensorParam({"key":"value"});


		var result = SensorsController.createGetSensorsTemperature(accessToken, sensorParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensors") createGetSensors

> Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.


```javascript
function createGetSensors(accessToken, groupParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| groupParam |  ``` Required ```  | Group ID to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, SensorsController, GetSensorsResponse){
        var accessToken = access_token;
        var groupParam = new GroupParam({"key":"value"});


		var result = SensorsController.createGetSensors(accessToken, groupParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_humidity"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsHumidity") createGetSensorsHumidity

> Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.


```javascript
function createGetSensorsHumidity(accessToken, sensorParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, SensorsController, HumidityResponse){
        var accessToken = access_token;
        var sensorParam = new SensorParam({"key":"value"});


		var result = SensorsController.createGetSensorsHumidity(accessToken, sensorParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_history"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsHistory") createGetSensorsHistory

> Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.


```javascript
function createGetSensorsHistory(accessToken, historyParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| historyParam |  ``` Required ```  | Group ID, time range and resolution, and list of sensor ID, field pairs to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, SensorsController, SensorHistoryResponse){
        var accessToken = access_token;
        var historyParam = new HistoryParam1({"key":"value"});


		var result = SensorsController.createGetSensorsHistory(accessToken, historyParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_door"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsDoor") createGetSensorsDoor

> Get door monitor status (closed / open) for requested sensors.


```javascript
function createGetSensorsDoor(accessToken, sensorParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, SensorsController, DoorResponse){
        var accessToken = access_token;
        var sensorParam = new SensorParam({"key":"value"});


		var result = SensorsController.createGetSensorsDoor(accessToken, sensorParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




### <a name="create_get_sensors_cargo"></a>![Method: ](https://apidocs.io/img/method.png ".SensorsController.createGetSensorsCargo") createGetSensorsCargo

> Get cargo monitor status (empty / full) for requested sensors.


```javascript
function createGetSensorsCargo(accessToken, sensorParam)
```
#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accessToken |  ``` Required ```  | Samsara API access token. |
| sensorParam |  ``` Required ```  | Group ID and list of sensor IDs to query. |



#### Example Usage

```javascript


	app.controller("testController", function($scope, SensorsController, CargoResponse){
        var accessToken = access_token;
        var sensorParam = new SensorParam({"key":"value"});


		var result = SensorsController.createGetSensorsCargo(accessToken, sensorParam);
        //Function call returns a promise
        result.then(function(success){
			//success case
			//getting context of response
			console.log(success.getContext());
		},function(err){
			//failure case
		});

	});
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected error. |




[Back to List of Controllers](#list_of_controllers)



