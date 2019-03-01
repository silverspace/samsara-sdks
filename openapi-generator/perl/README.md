# NAME

WWW::OpenAPIClient::Role - a Moose role for the Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

# VERSION

Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PerlClientCodegen

## A note on Moose

This role is the only component of the library that uses Moose. See
WWW::OpenAPIClient::ApiFactory for non-Moosey usage.

# SYNOPSIS

The Perl Generator in the OpenAPI Generator project builds a library of Perl modules to interact with
a web service defined by a OpenAPI Specification. See below for how to build the
library.

This module provides an interface to the generated library. All the classes,
objects, and methods (well, not quite \*all\*, see below) are flattened into this
role.

        package MyApp;
        use Moose;
        with 'WWW::OpenAPIClient::Role';

        package main;

        my $api = MyApp->new({ tokens => $tokens });

        my $pet = $api->get_pet_by_id(pet_id => $pet_id);


## Structure of the library

The library consists of a set of API classes, one for each endpoint. These APIs
implement the method calls available on each endpoint.

Additionally, there is a set of "object" classes, which represent the objects
returned by and sent to the methods on the endpoints.

An API factory class is provided, which builds instances of each endpoint API.

This Moose role flattens all the methods from the endpoint APIs onto the consuming
class. It also provides methods to retrieve the endpoint API objects, and the API
factory object, should you need it.

For documentation of all these methods, see AUTOMATIC DOCUMENTATION below.

## Configuring authentication

In the normal case, the OpenAPI Spec will describe what parameters are
required and where to put them. You just need to supply the tokens.

    my $tokens = {
        # basic
        username => $username,
        password => $password,

        # oauth
        access_token => $oauth_token,

        # keys
        $some_key => { token => $token,
                       prefix => $prefix,
                       in => $in,             # 'head||query',
                       },

        $another => { token => $token,
                      prefix => $prefix,
                      in => $in,              # 'head||query',
                      },
        ...,

        };

        my $api = MyApp->new({ tokens => $tokens });

Note these are all optional, as are `prefix` and `in`, and depend on the API
you are accessing. Usually `prefix` and `in` will be determined by the code generator from
the spec and you will not need to set them at run time. If not, `in` will
default to 'head' and `prefix` to the empty string.

The tokens will be placed in a L<WWW::OpenAPIClient::Configuration> instance
as follows, but you don't need to know about this.

- `$cfg->{username}`

    String. The username for basic auth.

- `$cfg->{password}`

    String. The password for basic auth.

- `$cfg->{api_key}`

    Hashref. Keyed on the name of each key (there can be multiple tokens).

            $cfg->{api_key} = {
                    secretKey => 'aaaabbbbccccdddd',
                    anotherKey => '1111222233334444',
                    };

- `$cfg->{api_key_prefix}`

    Hashref. Keyed on the name of each key (there can be multiple tokens). Note not
    all api keys require a prefix.

            $cfg->{api_key_prefix} = {
                    secretKey => 'string',
                    anotherKey => 'same or some other string',
                    };

- `$cfg->{access_token}`

    String. The OAuth access token.

# METHODS

## `base_url`

The generated code has the `base_url` already set as a default value. This method
returns the current value of `base_url`.

## `api_factory`

Returns an API factory object. You probably won't need to call this directly.

        $self->api_factory('Pet'); # returns a WWW::OpenAPIClient::PetApi instance

        $self->pet_api;            # the same

# MISSING METHODS

Most of the methods on the API are delegated to individual endpoint API objects
(e.g. Pet API, Store API, User API etc). Where different endpoint APIs use the
same method name (e.g. `new()`), these methods can't be delegated. So you need
to call `$api->pet_api->new()`.

In principle, every API is susceptible to the presence of a few, random, undelegatable
method names. In practice, because of the way method names are constructed, it's
unlikely in general that any methods will be undelegatable, except for:

        new()
        class_documentation()
        method_documentation()

To call these methods, you need to get a handle on the relevant object, either
by calling `$api->foo_api` or by retrieving an object, e.g.
`$api->get_pet_by_id(pet_id => $pet_id)`. They are class methods, so
you could also call them on class names.

# BUILDING YOUR LIBRARY

See the homepage `https://openapi-generator.tech` for full details.
But briefly, clone the git repository, build the codegen codebase, set up your build
config file, then run the API build script. You will need git, Java 7 or 8 and Apache
maven 3.0.3 or better already installed.

The config file should specify the project name for the generated library:

        {"moduleName":"WWW::MyProjectName"}

Your library files will be built under `WWW::MyProjectName`.

          $ git clone https://github.com/openapitools/openapi-generator
          $ cd openapi-generator
          $ mvn package
          $ java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
    -i [URL or file path to JSON OpenAPI API spec] \
    -g perl \
    -c /path/to/config/file.json \
    -o /path/to/output/folder

Bang, all done. Run the `autodoc` script in the `bin` directory to see the API
you just built.

# AUTOMATIC DOCUMENTATION

You can print out a summary of the generated API by running the included
`autodoc` script in the `bin` directory of your generated library. A few
output formats are supported:

          Usage: autodoc [OPTION]

    -w           wide format (default)
    -n           narrow format
    -p           POD format
    -H           HTML format
    -m           Markdown format
    -h           print this help message
    -c           your application class


The `-c` option allows you to load and inspect your own application. A dummy
namespace is used if you don't supply your own class.

# DOCUMENTATION FROM THE OpenAPI Spec

Additional documentation for each class and method may be provided by the OpenAPI
spec. If so, this is available via the `class_documentation()` and
`method_documentation()` methods on each generated object class, and the
`method_documentation()` method on the endpoint API classes:

        my $cmdoc = $api->pet_api->method_documentation->{$method_name};

        my $odoc = $api->get_pet_by_id->(pet_id => $pet_id)->class_documentation;
        my $omdoc = $api->get_pet_by_id->(pet_id => $pet_id)->method_documentation->{method_name};


Each of these calls returns a hashref with various useful pieces of information.

# LOAD THE MODULES

To load the API packages:
```perl
use WWW::OpenAPIClient::AssetsApi;
use WWW::OpenAPIClient::DriversApi;
use WWW::OpenAPIClient::FleetApi;
use WWW::OpenAPIClient::IndustrialApi;
use WWW::OpenAPIClient::RoutesApi;
use WWW::OpenAPIClient::SafetyApi;
use WWW::OpenAPIClient::SensorsApi;
use WWW::OpenAPIClient::TagsApi;
use WWW::OpenAPIClient::UsersApi;

```

To load the models:
```perl
use WWW::OpenAPIClient::Object::Address;
use WWW::OpenAPIClient::Object::AddressGeofence;
use WWW::OpenAPIClient::Object::AddressGeofenceCircle;
use WWW::OpenAPIClient::Object::AddressGeofencePolygon;
use WWW::OpenAPIClient::Object::AddressGeofencePolygonVertices;
use WWW::OpenAPIClient::Object::AddressesAddresses;
use WWW::OpenAPIClient::Object::AllRouteJobUpdates;
use WWW::OpenAPIClient::Object::Asset;
use WWW::OpenAPIClient::Object::AssetCable;
use WWW::OpenAPIClient::Object::AssetCurrentLocation;
use WWW::OpenAPIClient::Object::AssetCurrentLocationsResponse;
use WWW::OpenAPIClient::Object::AssetReeferResponse;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStats;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsAlarms;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsAlarms1;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsEngineHours;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsFuelPercentage;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsPowerStatus;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsReturnAirTemp;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsSetPoint;
use WWW::OpenAPIClient::Object::AuxInput;
use WWW::OpenAPIClient::Object::AuxInputSeries;
use WWW::OpenAPIClient::Object::CargoResponse;
use WWW::OpenAPIClient::Object::CargoResponseSensors;
use WWW::OpenAPIClient::Object::Contact;
use WWW::OpenAPIClient::Object::CurrentDriver;
use WWW::OpenAPIClient::Object::DataInputHistoryResponse;
use WWW::OpenAPIClient::Object::DataInputHistoryResponsePoints;
use WWW::OpenAPIClient::Object::DispatchJob;
use WWW::OpenAPIClient::Object::DispatchJobCreate;
use WWW::OpenAPIClient::Object::DispatchRoute;
use WWW::OpenAPIClient::Object::DispatchRouteBase;
use WWW::OpenAPIClient::Object::DispatchRouteCreate;
use WWW::OpenAPIClient::Object::DispatchRouteHistoricalEntry;
use WWW::OpenAPIClient::Object::DispatchRouteHistory;
use WWW::OpenAPIClient::Object::Document;
use WWW::OpenAPIClient::Object::DocumentBase;
use WWW::OpenAPIClient::Object::DocumentCreate;
use WWW::OpenAPIClient::Object::DocumentField;
use WWW::OpenAPIClient::Object::DocumentFieldCreate;
use WWW::OpenAPIClient::Object::DocumentFieldCreatePhotoValue;
use WWW::OpenAPIClient::Object::DocumentFieldType;
use WWW::OpenAPIClient::Object::DocumentFieldTypeNumberValueTypeMetadata;
use WWW::OpenAPIClient::Object::DocumentType;
use WWW::OpenAPIClient::Object::DoorResponse;
use WWW::OpenAPIClient::Object::DoorResponseSensors;
use WWW::OpenAPIClient::Object::Driver;
use WWW::OpenAPIClient::Object::DriverBase;
use WWW::OpenAPIClient::Object::DriverDailyLogResponse;
use WWW::OpenAPIClient::Object::DriverDailyLogResponseDays;
use WWW::OpenAPIClient::Object::DriverForCreate;
use WWW::OpenAPIClient::Object::DriverSafetyScoreResponse;
use WWW::OpenAPIClient::Object::DriversResponse;
use WWW::OpenAPIClient::Object::DriversSummaryResponse;
use WWW::OpenAPIClient::Object::DriversSummaryResponseSummaries;
use WWW::OpenAPIClient::Object::DvirBase;
use WWW::OpenAPIClient::Object::DvirBaseAuthorSignature;
use WWW::OpenAPIClient::Object::DvirBaseMechanicOrAgentSignature;
use WWW::OpenAPIClient::Object::DvirBaseNextDriverSignature;
use WWW::OpenAPIClient::Object::DvirBaseTrailerDefects;
use WWW::OpenAPIClient::Object::DvirBaseVehicle;
use WWW::OpenAPIClient::Object::DvirListResponse;
use WWW::OpenAPIClient::Object::EngineState;
use WWW::OpenAPIClient::Object::FleetVehicleLocation;
use WWW::OpenAPIClient::Object::FleetVehicleResponse;
use WWW::OpenAPIClient::Object::FleetVehicleResponseVehicleInfo;
use WWW::OpenAPIClient::Object::HosAuthenticationLogsResponse;
use WWW::OpenAPIClient::Object::HosAuthenticationLogsResponseAuthenticationLogs;
use WWW::OpenAPIClient::Object::HosLogsResponse;
use WWW::OpenAPIClient::Object::HosLogsResponseLogs;
use WWW::OpenAPIClient::Object::HosLogsSummaryResponse;
use WWW::OpenAPIClient::Object::HosLogsSummaryResponseDrivers;
use WWW::OpenAPIClient::Object::HumidityResponse;
use WWW::OpenAPIClient::Object::HumidityResponseSensors;
use WWW::OpenAPIClient::Object::InlineObject;
use WWW::OpenAPIClient::Object::InlineObject1;
use WWW::OpenAPIClient::Object::InlineObject10;
use WWW::OpenAPIClient::Object::InlineObject11;
use WWW::OpenAPIClient::Object::InlineObject12;
use WWW::OpenAPIClient::Object::InlineObject13;
use WWW::OpenAPIClient::Object::InlineObject14;
use WWW::OpenAPIClient::Object::InlineObject15;
use WWW::OpenAPIClient::Object::InlineObject16;
use WWW::OpenAPIClient::Object::InlineObject17;
use WWW::OpenAPIClient::Object::InlineObject18;
use WWW::OpenAPIClient::Object::InlineObject19;
use WWW::OpenAPIClient::Object::InlineObject2;
use WWW::OpenAPIClient::Object::InlineObject20;
use WWW::OpenAPIClient::Object::InlineObject21;
use WWW::OpenAPIClient::Object::InlineObject22;
use WWW::OpenAPIClient::Object::InlineObject23;
use WWW::OpenAPIClient::Object::InlineObject24;
use WWW::OpenAPIClient::Object::InlineObject3;
use WWW::OpenAPIClient::Object::InlineObject4;
use WWW::OpenAPIClient::Object::InlineObject5;
use WWW::OpenAPIClient::Object::InlineObject6;
use WWW::OpenAPIClient::Object::InlineObject7;
use WWW::OpenAPIClient::Object::InlineObject8;
use WWW::OpenAPIClient::Object::InlineObject9;
use WWW::OpenAPIClient::Object::InlineResponse200;
use WWW::OpenAPIClient::Object::InlineResponse2001;
use WWW::OpenAPIClient::Object::InlineResponse2002;
use WWW::OpenAPIClient::Object::InlineResponse2003;
use WWW::OpenAPIClient::Object::InlineResponse2004;
use WWW::OpenAPIClient::Object::InlineResponse2005;
use WWW::OpenAPIClient::Object::InlineResponse2005VehicleStats;
use WWW::OpenAPIClient::Object::InlineResponse2006;
use WWW::OpenAPIClient::Object::InlineResponse2007;
use WWW::OpenAPIClient::Object::InlineResponse2008;
use WWW::OpenAPIClient::Object::InlineResponse2009;
use WWW::OpenAPIClient::Object::JobStatus;
use WWW::OpenAPIClient::Object::JobUpdateObject;
use WWW::OpenAPIClient::Object::Machine;
use WWW::OpenAPIClient::Object::MachineHistoryResponse;
use WWW::OpenAPIClient::Object::MachineHistoryResponseMachines;
use WWW::OpenAPIClient::Object::MachineHistoryResponseVibrations;
use WWW::OpenAPIClient::Object::Pagination;
use WWW::OpenAPIClient::Object::PrevJobStatus;
use WWW::OpenAPIClient::Object::SafetyReportHarshEvent;
use WWW::OpenAPIClient::Object::Sensor;
use WWW::OpenAPIClient::Object::SensorHistoryResponse;
use WWW::OpenAPIClient::Object::SensorHistoryResponseResults;
use WWW::OpenAPIClient::Object::SensorsHistorySeries;
use WWW::OpenAPIClient::Object::Tag;
use WWW::OpenAPIClient::Object::TagCreate;
use WWW::OpenAPIClient::Object::TagMetadata;
use WWW::OpenAPIClient::Object::TagModify;
use WWW::OpenAPIClient::Object::TagModifyAdd;
use WWW::OpenAPIClient::Object::TagModifyDelete;
use WWW::OpenAPIClient::Object::TagUpdate;
use WWW::OpenAPIClient::Object::TaggedAddress;
use WWW::OpenAPIClient::Object::TaggedAddressBase;
use WWW::OpenAPIClient::Object::TaggedAsset;
use WWW::OpenAPIClient::Object::TaggedAssetBase;
use WWW::OpenAPIClient::Object::TaggedDriver;
use WWW::OpenAPIClient::Object::TaggedDriverBase;
use WWW::OpenAPIClient::Object::TaggedMachine;
use WWW::OpenAPIClient::Object::TaggedMachineBase;
use WWW::OpenAPIClient::Object::TaggedSensor;
use WWW::OpenAPIClient::Object::TaggedSensorBase;
use WWW::OpenAPIClient::Object::TaggedVehicle;
use WWW::OpenAPIClient::Object::TaggedVehicleBase;
use WWW::OpenAPIClient::Object::TemperatureResponse;
use WWW::OpenAPIClient::Object::TemperatureResponseSensors;
use WWW::OpenAPIClient::Object::TripResponse;
use WWW::OpenAPIClient::Object::TripResponseEndCoordinates;
use WWW::OpenAPIClient::Object::TripResponseStartCoordinates;
use WWW::OpenAPIClient::Object::TripResponseTrips;
use WWW::OpenAPIClient::Object::User;
use WWW::OpenAPIClient::Object::UserBase;
use WWW::OpenAPIClient::Object::UserRole;
use WWW::OpenAPIClient::Object::UserTagRole;
use WWW::OpenAPIClient::Object::UserTagRoleTag;
use WWW::OpenAPIClient::Object::Vehicle;
use WWW::OpenAPIClient::Object::VehicleHarshEventResponse;
use WWW::OpenAPIClient::Object::VehicleHarshEventResponseLocation;
use WWW::OpenAPIClient::Object::VehicleLocation;
use WWW::OpenAPIClient::Object::VehicleMaintenance;
use WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939;
use WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939CheckEngineLight;
use WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939DiagnosticTroubleCodes;
use WWW::OpenAPIClient::Object::VehicleMaintenancePassenger;
use WWW::OpenAPIClient::Object::VehicleMaintenancePassengerCheckEngineLight;
use WWW::OpenAPIClient::Object::VehicleMaintenancePassengerDiagnosticTroubleCodes;
use WWW::OpenAPIClient::Object::VehicleSafetyScoreResponse;

````

# GETTING STARTED
Put the Perl SDK under the 'lib' folder in your project directory, then run the following
```perl
#!/usr/bin/perl
use lib 'lib';
use strict;
use warnings;
# load the API package
use WWW::OpenAPIClient::AssetsApi;
use WWW::OpenAPIClient::DriversApi;
use WWW::OpenAPIClient::FleetApi;
use WWW::OpenAPIClient::IndustrialApi;
use WWW::OpenAPIClient::RoutesApi;
use WWW::OpenAPIClient::SafetyApi;
use WWW::OpenAPIClient::SensorsApi;
use WWW::OpenAPIClient::TagsApi;
use WWW::OpenAPIClient::UsersApi;

# load the models
use WWW::OpenAPIClient::Object::Address;
use WWW::OpenAPIClient::Object::AddressGeofence;
use WWW::OpenAPIClient::Object::AddressGeofenceCircle;
use WWW::OpenAPIClient::Object::AddressGeofencePolygon;
use WWW::OpenAPIClient::Object::AddressGeofencePolygonVertices;
use WWW::OpenAPIClient::Object::AddressesAddresses;
use WWW::OpenAPIClient::Object::AllRouteJobUpdates;
use WWW::OpenAPIClient::Object::Asset;
use WWW::OpenAPIClient::Object::AssetCable;
use WWW::OpenAPIClient::Object::AssetCurrentLocation;
use WWW::OpenAPIClient::Object::AssetCurrentLocationsResponse;
use WWW::OpenAPIClient::Object::AssetReeferResponse;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStats;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsAlarms;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsAlarms1;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsEngineHours;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsFuelPercentage;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsPowerStatus;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsReturnAirTemp;
use WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsSetPoint;
use WWW::OpenAPIClient::Object::AuxInput;
use WWW::OpenAPIClient::Object::AuxInputSeries;
use WWW::OpenAPIClient::Object::CargoResponse;
use WWW::OpenAPIClient::Object::CargoResponseSensors;
use WWW::OpenAPIClient::Object::Contact;
use WWW::OpenAPIClient::Object::CurrentDriver;
use WWW::OpenAPIClient::Object::DataInputHistoryResponse;
use WWW::OpenAPIClient::Object::DataInputHistoryResponsePoints;
use WWW::OpenAPIClient::Object::DispatchJob;
use WWW::OpenAPIClient::Object::DispatchJobCreate;
use WWW::OpenAPIClient::Object::DispatchRoute;
use WWW::OpenAPIClient::Object::DispatchRouteBase;
use WWW::OpenAPIClient::Object::DispatchRouteCreate;
use WWW::OpenAPIClient::Object::DispatchRouteHistoricalEntry;
use WWW::OpenAPIClient::Object::DispatchRouteHistory;
use WWW::OpenAPIClient::Object::Document;
use WWW::OpenAPIClient::Object::DocumentBase;
use WWW::OpenAPIClient::Object::DocumentCreate;
use WWW::OpenAPIClient::Object::DocumentField;
use WWW::OpenAPIClient::Object::DocumentFieldCreate;
use WWW::OpenAPIClient::Object::DocumentFieldCreatePhotoValue;
use WWW::OpenAPIClient::Object::DocumentFieldType;
use WWW::OpenAPIClient::Object::DocumentFieldTypeNumberValueTypeMetadata;
use WWW::OpenAPIClient::Object::DocumentType;
use WWW::OpenAPIClient::Object::DoorResponse;
use WWW::OpenAPIClient::Object::DoorResponseSensors;
use WWW::OpenAPIClient::Object::Driver;
use WWW::OpenAPIClient::Object::DriverBase;
use WWW::OpenAPIClient::Object::DriverDailyLogResponse;
use WWW::OpenAPIClient::Object::DriverDailyLogResponseDays;
use WWW::OpenAPIClient::Object::DriverForCreate;
use WWW::OpenAPIClient::Object::DriverSafetyScoreResponse;
use WWW::OpenAPIClient::Object::DriversResponse;
use WWW::OpenAPIClient::Object::DriversSummaryResponse;
use WWW::OpenAPIClient::Object::DriversSummaryResponseSummaries;
use WWW::OpenAPIClient::Object::DvirBase;
use WWW::OpenAPIClient::Object::DvirBaseAuthorSignature;
use WWW::OpenAPIClient::Object::DvirBaseMechanicOrAgentSignature;
use WWW::OpenAPIClient::Object::DvirBaseNextDriverSignature;
use WWW::OpenAPIClient::Object::DvirBaseTrailerDefects;
use WWW::OpenAPIClient::Object::DvirBaseVehicle;
use WWW::OpenAPIClient::Object::DvirListResponse;
use WWW::OpenAPIClient::Object::EngineState;
use WWW::OpenAPIClient::Object::FleetVehicleLocation;
use WWW::OpenAPIClient::Object::FleetVehicleResponse;
use WWW::OpenAPIClient::Object::FleetVehicleResponseVehicleInfo;
use WWW::OpenAPIClient::Object::HosAuthenticationLogsResponse;
use WWW::OpenAPIClient::Object::HosAuthenticationLogsResponseAuthenticationLogs;
use WWW::OpenAPIClient::Object::HosLogsResponse;
use WWW::OpenAPIClient::Object::HosLogsResponseLogs;
use WWW::OpenAPIClient::Object::HosLogsSummaryResponse;
use WWW::OpenAPIClient::Object::HosLogsSummaryResponseDrivers;
use WWW::OpenAPIClient::Object::HumidityResponse;
use WWW::OpenAPIClient::Object::HumidityResponseSensors;
use WWW::OpenAPIClient::Object::InlineObject;
use WWW::OpenAPIClient::Object::InlineObject1;
use WWW::OpenAPIClient::Object::InlineObject10;
use WWW::OpenAPIClient::Object::InlineObject11;
use WWW::OpenAPIClient::Object::InlineObject12;
use WWW::OpenAPIClient::Object::InlineObject13;
use WWW::OpenAPIClient::Object::InlineObject14;
use WWW::OpenAPIClient::Object::InlineObject15;
use WWW::OpenAPIClient::Object::InlineObject16;
use WWW::OpenAPIClient::Object::InlineObject17;
use WWW::OpenAPIClient::Object::InlineObject18;
use WWW::OpenAPIClient::Object::InlineObject19;
use WWW::OpenAPIClient::Object::InlineObject2;
use WWW::OpenAPIClient::Object::InlineObject20;
use WWW::OpenAPIClient::Object::InlineObject21;
use WWW::OpenAPIClient::Object::InlineObject22;
use WWW::OpenAPIClient::Object::InlineObject23;
use WWW::OpenAPIClient::Object::InlineObject24;
use WWW::OpenAPIClient::Object::InlineObject3;
use WWW::OpenAPIClient::Object::InlineObject4;
use WWW::OpenAPIClient::Object::InlineObject5;
use WWW::OpenAPIClient::Object::InlineObject6;
use WWW::OpenAPIClient::Object::InlineObject7;
use WWW::OpenAPIClient::Object::InlineObject8;
use WWW::OpenAPIClient::Object::InlineObject9;
use WWW::OpenAPIClient::Object::InlineResponse200;
use WWW::OpenAPIClient::Object::InlineResponse2001;
use WWW::OpenAPIClient::Object::InlineResponse2002;
use WWW::OpenAPIClient::Object::InlineResponse2003;
use WWW::OpenAPIClient::Object::InlineResponse2004;
use WWW::OpenAPIClient::Object::InlineResponse2005;
use WWW::OpenAPIClient::Object::InlineResponse2005VehicleStats;
use WWW::OpenAPIClient::Object::InlineResponse2006;
use WWW::OpenAPIClient::Object::InlineResponse2007;
use WWW::OpenAPIClient::Object::InlineResponse2008;
use WWW::OpenAPIClient::Object::InlineResponse2009;
use WWW::OpenAPIClient::Object::JobStatus;
use WWW::OpenAPIClient::Object::JobUpdateObject;
use WWW::OpenAPIClient::Object::Machine;
use WWW::OpenAPIClient::Object::MachineHistoryResponse;
use WWW::OpenAPIClient::Object::MachineHistoryResponseMachines;
use WWW::OpenAPIClient::Object::MachineHistoryResponseVibrations;
use WWW::OpenAPIClient::Object::Pagination;
use WWW::OpenAPIClient::Object::PrevJobStatus;
use WWW::OpenAPIClient::Object::SafetyReportHarshEvent;
use WWW::OpenAPIClient::Object::Sensor;
use WWW::OpenAPIClient::Object::SensorHistoryResponse;
use WWW::OpenAPIClient::Object::SensorHistoryResponseResults;
use WWW::OpenAPIClient::Object::SensorsHistorySeries;
use WWW::OpenAPIClient::Object::Tag;
use WWW::OpenAPIClient::Object::TagCreate;
use WWW::OpenAPIClient::Object::TagMetadata;
use WWW::OpenAPIClient::Object::TagModify;
use WWW::OpenAPIClient::Object::TagModifyAdd;
use WWW::OpenAPIClient::Object::TagModifyDelete;
use WWW::OpenAPIClient::Object::TagUpdate;
use WWW::OpenAPIClient::Object::TaggedAddress;
use WWW::OpenAPIClient::Object::TaggedAddressBase;
use WWW::OpenAPIClient::Object::TaggedAsset;
use WWW::OpenAPIClient::Object::TaggedAssetBase;
use WWW::OpenAPIClient::Object::TaggedDriver;
use WWW::OpenAPIClient::Object::TaggedDriverBase;
use WWW::OpenAPIClient::Object::TaggedMachine;
use WWW::OpenAPIClient::Object::TaggedMachineBase;
use WWW::OpenAPIClient::Object::TaggedSensor;
use WWW::OpenAPIClient::Object::TaggedSensorBase;
use WWW::OpenAPIClient::Object::TaggedVehicle;
use WWW::OpenAPIClient::Object::TaggedVehicleBase;
use WWW::OpenAPIClient::Object::TemperatureResponse;
use WWW::OpenAPIClient::Object::TemperatureResponseSensors;
use WWW::OpenAPIClient::Object::TripResponse;
use WWW::OpenAPIClient::Object::TripResponseEndCoordinates;
use WWW::OpenAPIClient::Object::TripResponseStartCoordinates;
use WWW::OpenAPIClient::Object::TripResponseTrips;
use WWW::OpenAPIClient::Object::User;
use WWW::OpenAPIClient::Object::UserBase;
use WWW::OpenAPIClient::Object::UserRole;
use WWW::OpenAPIClient::Object::UserTagRole;
use WWW::OpenAPIClient::Object::UserTagRoleTag;
use WWW::OpenAPIClient::Object::Vehicle;
use WWW::OpenAPIClient::Object::VehicleHarshEventResponse;
use WWW::OpenAPIClient::Object::VehicleHarshEventResponseLocation;
use WWW::OpenAPIClient::Object::VehicleLocation;
use WWW::OpenAPIClient::Object::VehicleMaintenance;
use WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939;
use WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939CheckEngineLight;
use WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939DiagnosticTroubleCodes;
use WWW::OpenAPIClient::Object::VehicleMaintenancePassenger;
use WWW::OpenAPIClient::Object::VehicleMaintenancePassengerCheckEngineLight;
use WWW::OpenAPIClient::Object::VehicleMaintenancePassengerDiagnosticTroubleCodes;
use WWW::OpenAPIClient::Object::VehicleSafetyScoreResponse;

# for displaying the API response data
use Data::Dumper;
use WWW::OpenAPIClient::;

my $api_instance = WWW::OpenAPIClient::->new(
);

my $access_token = "access_token_example"; # string | Samsara API access token.
my $group_id = 789; # int | Optional group ID if the organization has multiple groups (uncommon).

eval {
    my $result = $api_instance->get_all_asset_current_locations(access_token => $access_token, group_id => $group_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AssetsApi->get_all_asset_current_locations: $@\n";
}

```

# DOCUMENTATION FOR API ENDPOINTS

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


# DOCUMENTATION FOR MODELS
 - [WWW::OpenAPIClient::Object::Address](docs/Address.md)
 - [WWW::OpenAPIClient::Object::AddressGeofence](docs/AddressGeofence.md)
 - [WWW::OpenAPIClient::Object::AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [WWW::OpenAPIClient::Object::AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [WWW::OpenAPIClient::Object::AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [WWW::OpenAPIClient::Object::AddressesAddresses](docs/AddressesAddresses.md)
 - [WWW::OpenAPIClient::Object::AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [WWW::OpenAPIClient::Object::Asset](docs/Asset.md)
 - [WWW::OpenAPIClient::Object::AssetCable](docs/AssetCable.md)
 - [WWW::OpenAPIClient::Object::AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [WWW::OpenAPIClient::Object::AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponse](docs/AssetReeferResponse.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [WWW::OpenAPIClient::Object::AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [WWW::OpenAPIClient::Object::AuxInput](docs/AuxInput.md)
 - [WWW::OpenAPIClient::Object::AuxInputSeries](docs/AuxInputSeries.md)
 - [WWW::OpenAPIClient::Object::CargoResponse](docs/CargoResponse.md)
 - [WWW::OpenAPIClient::Object::CargoResponseSensors](docs/CargoResponseSensors.md)
 - [WWW::OpenAPIClient::Object::Contact](docs/Contact.md)
 - [WWW::OpenAPIClient::Object::CurrentDriver](docs/CurrentDriver.md)
 - [WWW::OpenAPIClient::Object::DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [WWW::OpenAPIClient::Object::DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [WWW::OpenAPIClient::Object::DispatchJob](docs/DispatchJob.md)
 - [WWW::OpenAPIClient::Object::DispatchJobCreate](docs/DispatchJobCreate.md)
 - [WWW::OpenAPIClient::Object::DispatchRoute](docs/DispatchRoute.md)
 - [WWW::OpenAPIClient::Object::DispatchRouteBase](docs/DispatchRouteBase.md)
 - [WWW::OpenAPIClient::Object::DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [WWW::OpenAPIClient::Object::DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [WWW::OpenAPIClient::Object::DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [WWW::OpenAPIClient::Object::Document](docs/Document.md)
 - [WWW::OpenAPIClient::Object::DocumentBase](docs/DocumentBase.md)
 - [WWW::OpenAPIClient::Object::DocumentCreate](docs/DocumentCreate.md)
 - [WWW::OpenAPIClient::Object::DocumentField](docs/DocumentField.md)
 - [WWW::OpenAPIClient::Object::DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [WWW::OpenAPIClient::Object::DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [WWW::OpenAPIClient::Object::DocumentFieldType](docs/DocumentFieldType.md)
 - [WWW::OpenAPIClient::Object::DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [WWW::OpenAPIClient::Object::DocumentType](docs/DocumentType.md)
 - [WWW::OpenAPIClient::Object::DoorResponse](docs/DoorResponse.md)
 - [WWW::OpenAPIClient::Object::DoorResponseSensors](docs/DoorResponseSensors.md)
 - [WWW::OpenAPIClient::Object::Driver](docs/Driver.md)
 - [WWW::OpenAPIClient::Object::DriverBase](docs/DriverBase.md)
 - [WWW::OpenAPIClient::Object::DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [WWW::OpenAPIClient::Object::DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [WWW::OpenAPIClient::Object::DriverForCreate](docs/DriverForCreate.md)
 - [WWW::OpenAPIClient::Object::DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [WWW::OpenAPIClient::Object::DriversResponse](docs/DriversResponse.md)
 - [WWW::OpenAPIClient::Object::DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [WWW::OpenAPIClient::Object::DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [WWW::OpenAPIClient::Object::DvirBase](docs/DvirBase.md)
 - [WWW::OpenAPIClient::Object::DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [WWW::OpenAPIClient::Object::DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [WWW::OpenAPIClient::Object::DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [WWW::OpenAPIClient::Object::DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [WWW::OpenAPIClient::Object::DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [WWW::OpenAPIClient::Object::DvirListResponse](docs/DvirListResponse.md)
 - [WWW::OpenAPIClient::Object::EngineState](docs/EngineState.md)
 - [WWW::OpenAPIClient::Object::FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [WWW::OpenAPIClient::Object::FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [WWW::OpenAPIClient::Object::FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [WWW::OpenAPIClient::Object::HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [WWW::OpenAPIClient::Object::HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [WWW::OpenAPIClient::Object::HosLogsResponse](docs/HosLogsResponse.md)
 - [WWW::OpenAPIClient::Object::HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [WWW::OpenAPIClient::Object::HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [WWW::OpenAPIClient::Object::HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [WWW::OpenAPIClient::Object::HumidityResponse](docs/HumidityResponse.md)
 - [WWW::OpenAPIClient::Object::HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [WWW::OpenAPIClient::Object::InlineObject](docs/InlineObject.md)
 - [WWW::OpenAPIClient::Object::InlineObject1](docs/InlineObject1.md)
 - [WWW::OpenAPIClient::Object::InlineObject10](docs/InlineObject10.md)
 - [WWW::OpenAPIClient::Object::InlineObject11](docs/InlineObject11.md)
 - [WWW::OpenAPIClient::Object::InlineObject12](docs/InlineObject12.md)
 - [WWW::OpenAPIClient::Object::InlineObject13](docs/InlineObject13.md)
 - [WWW::OpenAPIClient::Object::InlineObject14](docs/InlineObject14.md)
 - [WWW::OpenAPIClient::Object::InlineObject15](docs/InlineObject15.md)
 - [WWW::OpenAPIClient::Object::InlineObject16](docs/InlineObject16.md)
 - [WWW::OpenAPIClient::Object::InlineObject17](docs/InlineObject17.md)
 - [WWW::OpenAPIClient::Object::InlineObject18](docs/InlineObject18.md)
 - [WWW::OpenAPIClient::Object::InlineObject19](docs/InlineObject19.md)
 - [WWW::OpenAPIClient::Object::InlineObject2](docs/InlineObject2.md)
 - [WWW::OpenAPIClient::Object::InlineObject20](docs/InlineObject20.md)
 - [WWW::OpenAPIClient::Object::InlineObject21](docs/InlineObject21.md)
 - [WWW::OpenAPIClient::Object::InlineObject22](docs/InlineObject22.md)
 - [WWW::OpenAPIClient::Object::InlineObject23](docs/InlineObject23.md)
 - [WWW::OpenAPIClient::Object::InlineObject24](docs/InlineObject24.md)
 - [WWW::OpenAPIClient::Object::InlineObject3](docs/InlineObject3.md)
 - [WWW::OpenAPIClient::Object::InlineObject4](docs/InlineObject4.md)
 - [WWW::OpenAPIClient::Object::InlineObject5](docs/InlineObject5.md)
 - [WWW::OpenAPIClient::Object::InlineObject6](docs/InlineObject6.md)
 - [WWW::OpenAPIClient::Object::InlineObject7](docs/InlineObject7.md)
 - [WWW::OpenAPIClient::Object::InlineObject8](docs/InlineObject8.md)
 - [WWW::OpenAPIClient::Object::InlineObject9](docs/InlineObject9.md)
 - [WWW::OpenAPIClient::Object::InlineResponse200](docs/InlineResponse200.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2001](docs/InlineResponse2001.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2002](docs/InlineResponse2002.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2003](docs/InlineResponse2003.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2004](docs/InlineResponse2004.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2005](docs/InlineResponse2005.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2006](docs/InlineResponse2006.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2007](docs/InlineResponse2007.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2008](docs/InlineResponse2008.md)
 - [WWW::OpenAPIClient::Object::InlineResponse2009](docs/InlineResponse2009.md)
 - [WWW::OpenAPIClient::Object::JobStatus](docs/JobStatus.md)
 - [WWW::OpenAPIClient::Object::JobUpdateObject](docs/JobUpdateObject.md)
 - [WWW::OpenAPIClient::Object::Machine](docs/Machine.md)
 - [WWW::OpenAPIClient::Object::MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [WWW::OpenAPIClient::Object::MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [WWW::OpenAPIClient::Object::MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [WWW::OpenAPIClient::Object::Pagination](docs/Pagination.md)
 - [WWW::OpenAPIClient::Object::PrevJobStatus](docs/PrevJobStatus.md)
 - [WWW::OpenAPIClient::Object::SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [WWW::OpenAPIClient::Object::Sensor](docs/Sensor.md)
 - [WWW::OpenAPIClient::Object::SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [WWW::OpenAPIClient::Object::SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [WWW::OpenAPIClient::Object::SensorsHistorySeries](docs/SensorsHistorySeries.md)
 - [WWW::OpenAPIClient::Object::Tag](docs/Tag.md)
 - [WWW::OpenAPIClient::Object::TagCreate](docs/TagCreate.md)
 - [WWW::OpenAPIClient::Object::TagMetadata](docs/TagMetadata.md)
 - [WWW::OpenAPIClient::Object::TagModify](docs/TagModify.md)
 - [WWW::OpenAPIClient::Object::TagModifyAdd](docs/TagModifyAdd.md)
 - [WWW::OpenAPIClient::Object::TagModifyDelete](docs/TagModifyDelete.md)
 - [WWW::OpenAPIClient::Object::TagUpdate](docs/TagUpdate.md)
 - [WWW::OpenAPIClient::Object::TaggedAddress](docs/TaggedAddress.md)
 - [WWW::OpenAPIClient::Object::TaggedAddressBase](docs/TaggedAddressBase.md)
 - [WWW::OpenAPIClient::Object::TaggedAsset](docs/TaggedAsset.md)
 - [WWW::OpenAPIClient::Object::TaggedAssetBase](docs/TaggedAssetBase.md)
 - [WWW::OpenAPIClient::Object::TaggedDriver](docs/TaggedDriver.md)
 - [WWW::OpenAPIClient::Object::TaggedDriverBase](docs/TaggedDriverBase.md)
 - [WWW::OpenAPIClient::Object::TaggedMachine](docs/TaggedMachine.md)
 - [WWW::OpenAPIClient::Object::TaggedMachineBase](docs/TaggedMachineBase.md)
 - [WWW::OpenAPIClient::Object::TaggedSensor](docs/TaggedSensor.md)
 - [WWW::OpenAPIClient::Object::TaggedSensorBase](docs/TaggedSensorBase.md)
 - [WWW::OpenAPIClient::Object::TaggedVehicle](docs/TaggedVehicle.md)
 - [WWW::OpenAPIClient::Object::TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [WWW::OpenAPIClient::Object::TemperatureResponse](docs/TemperatureResponse.md)
 - [WWW::OpenAPIClient::Object::TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [WWW::OpenAPIClient::Object::TripResponse](docs/TripResponse.md)
 - [WWW::OpenAPIClient::Object::TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [WWW::OpenAPIClient::Object::TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [WWW::OpenAPIClient::Object::TripResponseTrips](docs/TripResponseTrips.md)
 - [WWW::OpenAPIClient::Object::User](docs/User.md)
 - [WWW::OpenAPIClient::Object::UserBase](docs/UserBase.md)
 - [WWW::OpenAPIClient::Object::UserRole](docs/UserRole.md)
 - [WWW::OpenAPIClient::Object::UserTagRole](docs/UserTagRole.md)
 - [WWW::OpenAPIClient::Object::UserTagRoleTag](docs/UserTagRoleTag.md)
 - [WWW::OpenAPIClient::Object::Vehicle](docs/Vehicle.md)
 - [WWW::OpenAPIClient::Object::VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [WWW::OpenAPIClient::Object::VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [WWW::OpenAPIClient::Object::VehicleLocation](docs/VehicleLocation.md)
 - [WWW::OpenAPIClient::Object::VehicleMaintenance](docs/VehicleMaintenance.md)
 - [WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [WWW::OpenAPIClient::Object::VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [WWW::OpenAPIClient::Object::VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [WWW::OpenAPIClient::Object::VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [WWW::OpenAPIClient::Object::VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [WWW::OpenAPIClient::Object::VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)


# DOCUMENTATION FOR AUTHORIZATION
 All endpoints do not require authorization.

