# NAME

WWW::SwaggerClient::Role - a Moose role for the Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

# VERSION

Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.PerlClientCodegen

## A note on Moose

This role is the only component of the library that uses Moose. See
WWW::SwaggerClient::ApiFactory for non-Moosey usage.

# SYNOPSIS

The Perl Swagger Codegen project builds a library of Perl modules to interact with
a web service defined by a OpenAPI Specification. See below for how to build the
library.

This module provides an interface to the generated library. All the classes,
objects, and methods (well, not quite \*all\*, see below) are flattened into this
role.

        package MyApp;
        use Moose;
        with 'WWW::SwaggerClient::Role';

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

The tokens will be placed in a L<WWW::SwaggerClient::Configuration> instance
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

        $self->api_factory('Pet'); # returns a WWW::SwaggerClient::PetApi instance

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

See the homepage `https://github.com/swagger-api/swagger-codegen` for full details.
But briefly, clone the git repository, build the codegen codebase, set up your build
config file, then run the API build script. You will need git, Java 7 or 8 and Apache
maven 3.0.3 or better already installed.

The config file should specify the project name for the generated library:

        {"moduleName":"WWW::MyProjectName"}

Your library files will be built under `WWW::MyProjectName`.

          $ git clone https://github.com/swagger-api/swagger-codegen.git
          $ cd swagger-codegen
          $ mvn package
          $ java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
    -i [URL or file path to JSON swagger API spec] \
    -l perl \
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

Additional documentation for each class and method may be provided by the Swagger
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
use WWW::SwaggerClient::AssetsApi;
use WWW::SwaggerClient::DriversApi;
use WWW::SwaggerClient::FleetApi;
use WWW::SwaggerClient::IndustrialApi;
use WWW::SwaggerClient::RoutesApi;
use WWW::SwaggerClient::SafetyApi;
use WWW::SwaggerClient::SensorsApi;
use WWW::SwaggerClient::TagsApi;
use WWW::SwaggerClient::UsersApi;

```

To load the models:
```perl
use WWW::SwaggerClient::Object::Address;
use WWW::SwaggerClient::Object::AddressGeofence;
use WWW::SwaggerClient::Object::AddressGeofenceCircle;
use WWW::SwaggerClient::Object::AddressGeofencePolygon;
use WWW::SwaggerClient::Object::AddressGeofencePolygonVertices;
use WWW::SwaggerClient::Object::AddressNotes;
use WWW::SwaggerClient::Object::AddressParam;
use WWW::SwaggerClient::Object::Addresses;
use WWW::SwaggerClient::Object::AddressesAddresses;
use WWW::SwaggerClient::Object::AllRouteJobUpdates;
use WWW::SwaggerClient::Object::Asset;
use WWW::SwaggerClient::Object::AssetCable;
use WWW::SwaggerClient::Object::AssetCurrentLocation;
use WWW::SwaggerClient::Object::AssetCurrentLocationsResponse;
use WWW::SwaggerClient::Object::AssetLocationResponse;
use WWW::SwaggerClient::Object::AssetLocationResponseInner;
use WWW::SwaggerClient::Object::AssetReeferResponse;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStats;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsAlarms;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsAlarms1;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsEngineHours;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsFuelPercentage;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsPowerStatus;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsReturnAirTemp;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsSetPoint;
use WWW::SwaggerClient::Object::AuxInput;
use WWW::SwaggerClient::Object::AuxInputSeries;
use WWW::SwaggerClient::Object::CargoResponse;
use WWW::SwaggerClient::Object::CargoResponseSensors;
use WWW::SwaggerClient::Object::Contact;
use WWW::SwaggerClient::Object::ContactIds;
use WWW::SwaggerClient::Object::CreateDvirParam;
use WWW::SwaggerClient::Object::CurrentDriver;
use WWW::SwaggerClient::Object::Data;
use WWW::SwaggerClient::Object::DataInputHistoryResponse;
use WWW::SwaggerClient::Object::DataInputHistoryResponsePoints;
use WWW::SwaggerClient::Object::DispatchJobCreate;
use WWW::SwaggerClient::Object::DispatchRouteBase;
use WWW::SwaggerClient::Object::DispatchRouteHistoricalEntry;
use WWW::SwaggerClient::Object::DispatchRouteHistory;
use WWW::SwaggerClient::Object::DispatchRoutes;
use WWW::SwaggerClient::Object::DocumentBase;
use WWW::SwaggerClient::Object::DocumentFieldCreate;
use WWW::SwaggerClient::Object::DocumentFieldCreatePhotoValue;
use WWW::SwaggerClient::Object::DocumentFieldType;
use WWW::SwaggerClient::Object::DocumentFieldTypeNumberValueTypeMetadata;
use WWW::SwaggerClient::Object::DocumentFieldTypes;
use WWW::SwaggerClient::Object::DocumentType;
use WWW::SwaggerClient::Object::DocumentTypes;
use WWW::SwaggerClient::Object::Documents;
use WWW::SwaggerClient::Object::DoorResponse;
use WWW::SwaggerClient::Object::DoorResponseSensors;
use WWW::SwaggerClient::Object::DriverBase;
use WWW::SwaggerClient::Object::DriverDailyLogResponse;
use WWW::SwaggerClient::Object::DriverDailyLogResponseDays;
use WWW::SwaggerClient::Object::DriverSafetyScoreResponse;
use WWW::SwaggerClient::Object::DriversResponse;
use WWW::SwaggerClient::Object::DriversSummaryParam;
use WWW::SwaggerClient::Object::DriversSummaryResponse;
use WWW::SwaggerClient::Object::DriversSummaryResponseSummaries;
use WWW::SwaggerClient::Object::DvirBase;
use WWW::SwaggerClient::Object::DvirBaseAuthorSignature;
use WWW::SwaggerClient::Object::DvirBaseMechanicOrAgentSignature;
use WWW::SwaggerClient::Object::DvirBaseNextDriverSignature;
use WWW::SwaggerClient::Object::DvirBaseTrailerDefects;
use WWW::SwaggerClient::Object::DvirBaseVehicle;
use WWW::SwaggerClient::Object::DvirListResponse;
use WWW::SwaggerClient::Object::EngineState;
use WWW::SwaggerClient::Object::ErrorResponse;
use WWW::SwaggerClient::Object::FleetVehicleLocation;
use WWW::SwaggerClient::Object::FleetVehicleLocations;
use WWW::SwaggerClient::Object::FleetVehicleResponse;
use WWW::SwaggerClient::Object::FleetVehicleResponseVehicleInfo;
use WWW::SwaggerClient::Object::FleetVehiclesLocations;
use WWW::SwaggerClient::Object::FleetVehiclesLocationsInner;
use WWW::SwaggerClient::Object::GroupDriversParam;
use WWW::SwaggerClient::Object::GroupParam;
use WWW::SwaggerClient::Object::HistoryParam;
use WWW::SwaggerClient::Object::HistoryParam1;
use WWW::SwaggerClient::Object::HosAuthenticationLogsParam;
use WWW::SwaggerClient::Object::HosAuthenticationLogsResponse;
use WWW::SwaggerClient::Object::HosAuthenticationLogsResponseAuthenticationLogs;
use WWW::SwaggerClient::Object::HosLogsParam;
use WWW::SwaggerClient::Object::HosLogsParam1;
use WWW::SwaggerClient::Object::HosLogsParam2;
use WWW::SwaggerClient::Object::HosLogsResponse;
use WWW::SwaggerClient::Object::HosLogsResponseLogs;
use WWW::SwaggerClient::Object::HosLogsSummaryResponse;
use WWW::SwaggerClient::Object::HosLogsSummaryResponseDrivers;
use WWW::SwaggerClient::Object::HumidityResponse;
use WWW::SwaggerClient::Object::HumidityResponseSensors;
use WWW::SwaggerClient::Object::InlineResponse200;
use WWW::SwaggerClient::Object::InlineResponse2001;
use WWW::SwaggerClient::Object::InlineResponse2002;
use WWW::SwaggerClient::Object::InlineResponse2003;
use WWW::SwaggerClient::Object::InlineResponse2004;
use WWW::SwaggerClient::Object::InlineResponse2005;
use WWW::SwaggerClient::Object::InlineResponse2005VehicleStats;
use WWW::SwaggerClient::Object::InlineResponse2006;
use WWW::SwaggerClient::Object::InlineResponse2007;
use WWW::SwaggerClient::Object::InlineResponse2008;
use WWW::SwaggerClient::Object::InlineResponse2009;
use WWW::SwaggerClient::Object::JobStatus;
use WWW::SwaggerClient::Object::JobUpdateObject;
use WWW::SwaggerClient::Object::Machine;
use WWW::SwaggerClient::Object::MachineHistoryResponse;
use WWW::SwaggerClient::Object::MachineHistoryResponseMachines;
use WWW::SwaggerClient::Object::MachineHistoryResponseVibrations;
use WWW::SwaggerClient::Object::Pagination;
use WWW::SwaggerClient::Object::PrevJobStatus;
use WWW::SwaggerClient::Object::ReactivateDriverParam;
use WWW::SwaggerClient::Object::SafetyReportHarshEvent;
use WWW::SwaggerClient::Object::Sensor;
use WWW::SwaggerClient::Object::SensorHistoryResponse;
use WWW::SwaggerClient::Object::SensorHistoryResponseResults;
use WWW::SwaggerClient::Object::SensorParam;
use WWW::SwaggerClient::Object::SensorshistorySeries;
use WWW::SwaggerClient::Object::Tag;
use WWW::SwaggerClient::Object::TagCreate;
use WWW::SwaggerClient::Object::TagIds;
use WWW::SwaggerClient::Object::TagMetadata;
use WWW::SwaggerClient::Object::TagModify;
use WWW::SwaggerClient::Object::TagModifyAdd;
use WWW::SwaggerClient::Object::TagModifyDelete;
use WWW::SwaggerClient::Object::TagUpdate;
use WWW::SwaggerClient::Object::TaggedAddressBase;
use WWW::SwaggerClient::Object::TaggedAssetBase;
use WWW::SwaggerClient::Object::TaggedDriverBase;
use WWW::SwaggerClient::Object::TaggedMachineBase;
use WWW::SwaggerClient::Object::TaggedSensorBase;
use WWW::SwaggerClient::Object::TaggedVehicleBase;
use WWW::SwaggerClient::Object::TemperatureResponse;
use WWW::SwaggerClient::Object::TemperatureResponseSensors;
use WWW::SwaggerClient::Object::TripResponse;
use WWW::SwaggerClient::Object::TripResponseEndCoordinates;
use WWW::SwaggerClient::Object::TripResponseStartCoordinates;
use WWW::SwaggerClient::Object::TripResponseTrips;
use WWW::SwaggerClient::Object::TripsParam;
use WWW::SwaggerClient::Object::UserBase;
use WWW::SwaggerClient::Object::UserRole;
use WWW::SwaggerClient::Object::UserTagRole;
use WWW::SwaggerClient::Object::UserTagRoleTag;
use WWW::SwaggerClient::Object::Vehicle;
use WWW::SwaggerClient::Object::VehicleHarshEventResponse;
use WWW::SwaggerClient::Object::VehicleHarshEventResponseLocation;
use WWW::SwaggerClient::Object::VehicleLocation;
use WWW::SwaggerClient::Object::VehicleMaintenance;
use WWW::SwaggerClient::Object::VehicleMaintenanceJ1939;
use WWW::SwaggerClient::Object::VehicleMaintenanceJ1939CheckEngineLight;
use WWW::SwaggerClient::Object::VehicleMaintenanceJ1939DiagnosticTroubleCodes;
use WWW::SwaggerClient::Object::VehicleMaintenancePassenger;
use WWW::SwaggerClient::Object::VehicleMaintenancePassengerCheckEngineLight;
use WWW::SwaggerClient::Object::VehicleMaintenancePassengerDiagnosticTroubleCodes;
use WWW::SwaggerClient::Object::VehicleSafetyScoreResponse;
use WWW::SwaggerClient::Object::VehicleUpdateParam;
use WWW::SwaggerClient::Object::DispatchJob;
use WWW::SwaggerClient::Object::DispatchRoute;
use WWW::SwaggerClient::Object::DispatchRouteCreate;
use WWW::SwaggerClient::Object::Document;
use WWW::SwaggerClient::Object::DocumentCreate;
use WWW::SwaggerClient::Object::DocumentField;
use WWW::SwaggerClient::Object::Driver;
use WWW::SwaggerClient::Object::DriverForCreate;
use WWW::SwaggerClient::Object::TaggedAddress;
use WWW::SwaggerClient::Object::TaggedAsset;
use WWW::SwaggerClient::Object::TaggedDriver;
use WWW::SwaggerClient::Object::TaggedMachine;
use WWW::SwaggerClient::Object::TaggedSensor;
use WWW::SwaggerClient::Object::TaggedVehicle;
use WWW::SwaggerClient::Object::User;

````

# GETTING STARTED
Put the Perl SDK under the 'lib' folder in your project directory, then run the following
```perl
#!/usr/bin/perl
use lib 'lib';
use strict;
use warnings;
# load the API package
use WWW::SwaggerClient::AssetsApi;
use WWW::SwaggerClient::DriversApi;
use WWW::SwaggerClient::FleetApi;
use WWW::SwaggerClient::IndustrialApi;
use WWW::SwaggerClient::RoutesApi;
use WWW::SwaggerClient::SafetyApi;
use WWW::SwaggerClient::SensorsApi;
use WWW::SwaggerClient::TagsApi;
use WWW::SwaggerClient::UsersApi;

# load the models
use WWW::SwaggerClient::Object::Address;
use WWW::SwaggerClient::Object::AddressGeofence;
use WWW::SwaggerClient::Object::AddressGeofenceCircle;
use WWW::SwaggerClient::Object::AddressGeofencePolygon;
use WWW::SwaggerClient::Object::AddressGeofencePolygonVertices;
use WWW::SwaggerClient::Object::AddressNotes;
use WWW::SwaggerClient::Object::AddressParam;
use WWW::SwaggerClient::Object::Addresses;
use WWW::SwaggerClient::Object::AddressesAddresses;
use WWW::SwaggerClient::Object::AllRouteJobUpdates;
use WWW::SwaggerClient::Object::Asset;
use WWW::SwaggerClient::Object::AssetCable;
use WWW::SwaggerClient::Object::AssetCurrentLocation;
use WWW::SwaggerClient::Object::AssetCurrentLocationsResponse;
use WWW::SwaggerClient::Object::AssetLocationResponse;
use WWW::SwaggerClient::Object::AssetLocationResponseInner;
use WWW::SwaggerClient::Object::AssetReeferResponse;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStats;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsAlarms;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsAlarms1;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsEngineHours;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsFuelPercentage;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsPowerStatus;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsReturnAirTemp;
use WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsSetPoint;
use WWW::SwaggerClient::Object::AuxInput;
use WWW::SwaggerClient::Object::AuxInputSeries;
use WWW::SwaggerClient::Object::CargoResponse;
use WWW::SwaggerClient::Object::CargoResponseSensors;
use WWW::SwaggerClient::Object::Contact;
use WWW::SwaggerClient::Object::ContactIds;
use WWW::SwaggerClient::Object::CreateDvirParam;
use WWW::SwaggerClient::Object::CurrentDriver;
use WWW::SwaggerClient::Object::Data;
use WWW::SwaggerClient::Object::DataInputHistoryResponse;
use WWW::SwaggerClient::Object::DataInputHistoryResponsePoints;
use WWW::SwaggerClient::Object::DispatchJobCreate;
use WWW::SwaggerClient::Object::DispatchRouteBase;
use WWW::SwaggerClient::Object::DispatchRouteHistoricalEntry;
use WWW::SwaggerClient::Object::DispatchRouteHistory;
use WWW::SwaggerClient::Object::DispatchRoutes;
use WWW::SwaggerClient::Object::DocumentBase;
use WWW::SwaggerClient::Object::DocumentFieldCreate;
use WWW::SwaggerClient::Object::DocumentFieldCreatePhotoValue;
use WWW::SwaggerClient::Object::DocumentFieldType;
use WWW::SwaggerClient::Object::DocumentFieldTypeNumberValueTypeMetadata;
use WWW::SwaggerClient::Object::DocumentFieldTypes;
use WWW::SwaggerClient::Object::DocumentType;
use WWW::SwaggerClient::Object::DocumentTypes;
use WWW::SwaggerClient::Object::Documents;
use WWW::SwaggerClient::Object::DoorResponse;
use WWW::SwaggerClient::Object::DoorResponseSensors;
use WWW::SwaggerClient::Object::DriverBase;
use WWW::SwaggerClient::Object::DriverDailyLogResponse;
use WWW::SwaggerClient::Object::DriverDailyLogResponseDays;
use WWW::SwaggerClient::Object::DriverSafetyScoreResponse;
use WWW::SwaggerClient::Object::DriversResponse;
use WWW::SwaggerClient::Object::DriversSummaryParam;
use WWW::SwaggerClient::Object::DriversSummaryResponse;
use WWW::SwaggerClient::Object::DriversSummaryResponseSummaries;
use WWW::SwaggerClient::Object::DvirBase;
use WWW::SwaggerClient::Object::DvirBaseAuthorSignature;
use WWW::SwaggerClient::Object::DvirBaseMechanicOrAgentSignature;
use WWW::SwaggerClient::Object::DvirBaseNextDriverSignature;
use WWW::SwaggerClient::Object::DvirBaseTrailerDefects;
use WWW::SwaggerClient::Object::DvirBaseVehicle;
use WWW::SwaggerClient::Object::DvirListResponse;
use WWW::SwaggerClient::Object::EngineState;
use WWW::SwaggerClient::Object::ErrorResponse;
use WWW::SwaggerClient::Object::FleetVehicleLocation;
use WWW::SwaggerClient::Object::FleetVehicleLocations;
use WWW::SwaggerClient::Object::FleetVehicleResponse;
use WWW::SwaggerClient::Object::FleetVehicleResponseVehicleInfo;
use WWW::SwaggerClient::Object::FleetVehiclesLocations;
use WWW::SwaggerClient::Object::FleetVehiclesLocationsInner;
use WWW::SwaggerClient::Object::GroupDriversParam;
use WWW::SwaggerClient::Object::GroupParam;
use WWW::SwaggerClient::Object::HistoryParam;
use WWW::SwaggerClient::Object::HistoryParam1;
use WWW::SwaggerClient::Object::HosAuthenticationLogsParam;
use WWW::SwaggerClient::Object::HosAuthenticationLogsResponse;
use WWW::SwaggerClient::Object::HosAuthenticationLogsResponseAuthenticationLogs;
use WWW::SwaggerClient::Object::HosLogsParam;
use WWW::SwaggerClient::Object::HosLogsParam1;
use WWW::SwaggerClient::Object::HosLogsParam2;
use WWW::SwaggerClient::Object::HosLogsResponse;
use WWW::SwaggerClient::Object::HosLogsResponseLogs;
use WWW::SwaggerClient::Object::HosLogsSummaryResponse;
use WWW::SwaggerClient::Object::HosLogsSummaryResponseDrivers;
use WWW::SwaggerClient::Object::HumidityResponse;
use WWW::SwaggerClient::Object::HumidityResponseSensors;
use WWW::SwaggerClient::Object::InlineResponse200;
use WWW::SwaggerClient::Object::InlineResponse2001;
use WWW::SwaggerClient::Object::InlineResponse2002;
use WWW::SwaggerClient::Object::InlineResponse2003;
use WWW::SwaggerClient::Object::InlineResponse2004;
use WWW::SwaggerClient::Object::InlineResponse2005;
use WWW::SwaggerClient::Object::InlineResponse2005VehicleStats;
use WWW::SwaggerClient::Object::InlineResponse2006;
use WWW::SwaggerClient::Object::InlineResponse2007;
use WWW::SwaggerClient::Object::InlineResponse2008;
use WWW::SwaggerClient::Object::InlineResponse2009;
use WWW::SwaggerClient::Object::JobStatus;
use WWW::SwaggerClient::Object::JobUpdateObject;
use WWW::SwaggerClient::Object::Machine;
use WWW::SwaggerClient::Object::MachineHistoryResponse;
use WWW::SwaggerClient::Object::MachineHistoryResponseMachines;
use WWW::SwaggerClient::Object::MachineHistoryResponseVibrations;
use WWW::SwaggerClient::Object::Pagination;
use WWW::SwaggerClient::Object::PrevJobStatus;
use WWW::SwaggerClient::Object::ReactivateDriverParam;
use WWW::SwaggerClient::Object::SafetyReportHarshEvent;
use WWW::SwaggerClient::Object::Sensor;
use WWW::SwaggerClient::Object::SensorHistoryResponse;
use WWW::SwaggerClient::Object::SensorHistoryResponseResults;
use WWW::SwaggerClient::Object::SensorParam;
use WWW::SwaggerClient::Object::SensorshistorySeries;
use WWW::SwaggerClient::Object::Tag;
use WWW::SwaggerClient::Object::TagCreate;
use WWW::SwaggerClient::Object::TagIds;
use WWW::SwaggerClient::Object::TagMetadata;
use WWW::SwaggerClient::Object::TagModify;
use WWW::SwaggerClient::Object::TagModifyAdd;
use WWW::SwaggerClient::Object::TagModifyDelete;
use WWW::SwaggerClient::Object::TagUpdate;
use WWW::SwaggerClient::Object::TaggedAddressBase;
use WWW::SwaggerClient::Object::TaggedAssetBase;
use WWW::SwaggerClient::Object::TaggedDriverBase;
use WWW::SwaggerClient::Object::TaggedMachineBase;
use WWW::SwaggerClient::Object::TaggedSensorBase;
use WWW::SwaggerClient::Object::TaggedVehicleBase;
use WWW::SwaggerClient::Object::TemperatureResponse;
use WWW::SwaggerClient::Object::TemperatureResponseSensors;
use WWW::SwaggerClient::Object::TripResponse;
use WWW::SwaggerClient::Object::TripResponseEndCoordinates;
use WWW::SwaggerClient::Object::TripResponseStartCoordinates;
use WWW::SwaggerClient::Object::TripResponseTrips;
use WWW::SwaggerClient::Object::TripsParam;
use WWW::SwaggerClient::Object::UserBase;
use WWW::SwaggerClient::Object::UserRole;
use WWW::SwaggerClient::Object::UserTagRole;
use WWW::SwaggerClient::Object::UserTagRoleTag;
use WWW::SwaggerClient::Object::Vehicle;
use WWW::SwaggerClient::Object::VehicleHarshEventResponse;
use WWW::SwaggerClient::Object::VehicleHarshEventResponseLocation;
use WWW::SwaggerClient::Object::VehicleLocation;
use WWW::SwaggerClient::Object::VehicleMaintenance;
use WWW::SwaggerClient::Object::VehicleMaintenanceJ1939;
use WWW::SwaggerClient::Object::VehicleMaintenanceJ1939CheckEngineLight;
use WWW::SwaggerClient::Object::VehicleMaintenanceJ1939DiagnosticTroubleCodes;
use WWW::SwaggerClient::Object::VehicleMaintenancePassenger;
use WWW::SwaggerClient::Object::VehicleMaintenancePassengerCheckEngineLight;
use WWW::SwaggerClient::Object::VehicleMaintenancePassengerDiagnosticTroubleCodes;
use WWW::SwaggerClient::Object::VehicleSafetyScoreResponse;
use WWW::SwaggerClient::Object::VehicleUpdateParam;
use WWW::SwaggerClient::Object::DispatchJob;
use WWW::SwaggerClient::Object::DispatchRoute;
use WWW::SwaggerClient::Object::DispatchRouteCreate;
use WWW::SwaggerClient::Object::Document;
use WWW::SwaggerClient::Object::DocumentCreate;
use WWW::SwaggerClient::Object::DocumentField;
use WWW::SwaggerClient::Object::Driver;
use WWW::SwaggerClient::Object::DriverForCreate;
use WWW::SwaggerClient::Object::TaggedAddress;
use WWW::SwaggerClient::Object::TaggedAsset;
use WWW::SwaggerClient::Object::TaggedDriver;
use WWW::SwaggerClient::Object::TaggedMachine;
use WWW::SwaggerClient::Object::TaggedSensor;
use WWW::SwaggerClient::Object::TaggedVehicle;
use WWW::SwaggerClient::Object::User;

# for displaying the API response data
use Data::Dumper;
use WWW::SwaggerClient::;

my $api_instance = WWW::SwaggerClient::->new(
);

my $access_token = 'access_token_example'; # string | Samsara API access token.
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
 - [WWW::SwaggerClient::Object::Address](docs/Address.md)
 - [WWW::SwaggerClient::Object::AddressGeofence](docs/AddressGeofence.md)
 - [WWW::SwaggerClient::Object::AddressGeofenceCircle](docs/AddressGeofenceCircle.md)
 - [WWW::SwaggerClient::Object::AddressGeofencePolygon](docs/AddressGeofencePolygon.md)
 - [WWW::SwaggerClient::Object::AddressGeofencePolygonVertices](docs/AddressGeofencePolygonVertices.md)
 - [WWW::SwaggerClient::Object::AddressNotes](docs/AddressNotes.md)
 - [WWW::SwaggerClient::Object::AddressParam](docs/AddressParam.md)
 - [WWW::SwaggerClient::Object::Addresses](docs/Addresses.md)
 - [WWW::SwaggerClient::Object::AddressesAddresses](docs/AddressesAddresses.md)
 - [WWW::SwaggerClient::Object::AllRouteJobUpdates](docs/AllRouteJobUpdates.md)
 - [WWW::SwaggerClient::Object::Asset](docs/Asset.md)
 - [WWW::SwaggerClient::Object::AssetCable](docs/AssetCable.md)
 - [WWW::SwaggerClient::Object::AssetCurrentLocation](docs/AssetCurrentLocation.md)
 - [WWW::SwaggerClient::Object::AssetCurrentLocationsResponse](docs/AssetCurrentLocationsResponse.md)
 - [WWW::SwaggerClient::Object::AssetLocationResponse](docs/AssetLocationResponse.md)
 - [WWW::SwaggerClient::Object::AssetLocationResponseInner](docs/AssetLocationResponseInner.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponse](docs/AssetReeferResponse.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStats](docs/AssetReeferResponseReeferStats.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsAlarms](docs/AssetReeferResponseReeferStatsAlarms.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsAlarms1](docs/AssetReeferResponseReeferStatsAlarms1.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsEngineHours](docs/AssetReeferResponseReeferStatsEngineHours.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsFuelPercentage](docs/AssetReeferResponseReeferStatsFuelPercentage.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsPowerStatus](docs/AssetReeferResponseReeferStatsPowerStatus.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsReturnAirTemp](docs/AssetReeferResponseReeferStatsReturnAirTemp.md)
 - [WWW::SwaggerClient::Object::AssetReeferResponseReeferStatsSetPoint](docs/AssetReeferResponseReeferStatsSetPoint.md)
 - [WWW::SwaggerClient::Object::AuxInput](docs/AuxInput.md)
 - [WWW::SwaggerClient::Object::AuxInputSeries](docs/AuxInputSeries.md)
 - [WWW::SwaggerClient::Object::CargoResponse](docs/CargoResponse.md)
 - [WWW::SwaggerClient::Object::CargoResponseSensors](docs/CargoResponseSensors.md)
 - [WWW::SwaggerClient::Object::Contact](docs/Contact.md)
 - [WWW::SwaggerClient::Object::ContactIds](docs/ContactIds.md)
 - [WWW::SwaggerClient::Object::CreateDvirParam](docs/CreateDvirParam.md)
 - [WWW::SwaggerClient::Object::CurrentDriver](docs/CurrentDriver.md)
 - [WWW::SwaggerClient::Object::Data](docs/Data.md)
 - [WWW::SwaggerClient::Object::DataInputHistoryResponse](docs/DataInputHistoryResponse.md)
 - [WWW::SwaggerClient::Object::DataInputHistoryResponsePoints](docs/DataInputHistoryResponsePoints.md)
 - [WWW::SwaggerClient::Object::DispatchJobCreate](docs/DispatchJobCreate.md)
 - [WWW::SwaggerClient::Object::DispatchRouteBase](docs/DispatchRouteBase.md)
 - [WWW::SwaggerClient::Object::DispatchRouteHistoricalEntry](docs/DispatchRouteHistoricalEntry.md)
 - [WWW::SwaggerClient::Object::DispatchRouteHistory](docs/DispatchRouteHistory.md)
 - [WWW::SwaggerClient::Object::DispatchRoutes](docs/DispatchRoutes.md)
 - [WWW::SwaggerClient::Object::DocumentBase](docs/DocumentBase.md)
 - [WWW::SwaggerClient::Object::DocumentFieldCreate](docs/DocumentFieldCreate.md)
 - [WWW::SwaggerClient::Object::DocumentFieldCreatePhotoValue](docs/DocumentFieldCreatePhotoValue.md)
 - [WWW::SwaggerClient::Object::DocumentFieldType](docs/DocumentFieldType.md)
 - [WWW::SwaggerClient::Object::DocumentFieldTypeNumberValueTypeMetadata](docs/DocumentFieldTypeNumberValueTypeMetadata.md)
 - [WWW::SwaggerClient::Object::DocumentFieldTypes](docs/DocumentFieldTypes.md)
 - [WWW::SwaggerClient::Object::DocumentType](docs/DocumentType.md)
 - [WWW::SwaggerClient::Object::DocumentTypes](docs/DocumentTypes.md)
 - [WWW::SwaggerClient::Object::Documents](docs/Documents.md)
 - [WWW::SwaggerClient::Object::DoorResponse](docs/DoorResponse.md)
 - [WWW::SwaggerClient::Object::DoorResponseSensors](docs/DoorResponseSensors.md)
 - [WWW::SwaggerClient::Object::DriverBase](docs/DriverBase.md)
 - [WWW::SwaggerClient::Object::DriverDailyLogResponse](docs/DriverDailyLogResponse.md)
 - [WWW::SwaggerClient::Object::DriverDailyLogResponseDays](docs/DriverDailyLogResponseDays.md)
 - [WWW::SwaggerClient::Object::DriverSafetyScoreResponse](docs/DriverSafetyScoreResponse.md)
 - [WWW::SwaggerClient::Object::DriversResponse](docs/DriversResponse.md)
 - [WWW::SwaggerClient::Object::DriversSummaryParam](docs/DriversSummaryParam.md)
 - [WWW::SwaggerClient::Object::DriversSummaryResponse](docs/DriversSummaryResponse.md)
 - [WWW::SwaggerClient::Object::DriversSummaryResponseSummaries](docs/DriversSummaryResponseSummaries.md)
 - [WWW::SwaggerClient::Object::DvirBase](docs/DvirBase.md)
 - [WWW::SwaggerClient::Object::DvirBaseAuthorSignature](docs/DvirBaseAuthorSignature.md)
 - [WWW::SwaggerClient::Object::DvirBaseMechanicOrAgentSignature](docs/DvirBaseMechanicOrAgentSignature.md)
 - [WWW::SwaggerClient::Object::DvirBaseNextDriverSignature](docs/DvirBaseNextDriverSignature.md)
 - [WWW::SwaggerClient::Object::DvirBaseTrailerDefects](docs/DvirBaseTrailerDefects.md)
 - [WWW::SwaggerClient::Object::DvirBaseVehicle](docs/DvirBaseVehicle.md)
 - [WWW::SwaggerClient::Object::DvirListResponse](docs/DvirListResponse.md)
 - [WWW::SwaggerClient::Object::EngineState](docs/EngineState.md)
 - [WWW::SwaggerClient::Object::ErrorResponse](docs/ErrorResponse.md)
 - [WWW::SwaggerClient::Object::FleetVehicleLocation](docs/FleetVehicleLocation.md)
 - [WWW::SwaggerClient::Object::FleetVehicleLocations](docs/FleetVehicleLocations.md)
 - [WWW::SwaggerClient::Object::FleetVehicleResponse](docs/FleetVehicleResponse.md)
 - [WWW::SwaggerClient::Object::FleetVehicleResponseVehicleInfo](docs/FleetVehicleResponseVehicleInfo.md)
 - [WWW::SwaggerClient::Object::FleetVehiclesLocations](docs/FleetVehiclesLocations.md)
 - [WWW::SwaggerClient::Object::FleetVehiclesLocationsInner](docs/FleetVehiclesLocationsInner.md)
 - [WWW::SwaggerClient::Object::GroupDriversParam](docs/GroupDriversParam.md)
 - [WWW::SwaggerClient::Object::GroupParam](docs/GroupParam.md)
 - [WWW::SwaggerClient::Object::HistoryParam](docs/HistoryParam.md)
 - [WWW::SwaggerClient::Object::HistoryParam1](docs/HistoryParam1.md)
 - [WWW::SwaggerClient::Object::HosAuthenticationLogsParam](docs/HosAuthenticationLogsParam.md)
 - [WWW::SwaggerClient::Object::HosAuthenticationLogsResponse](docs/HosAuthenticationLogsResponse.md)
 - [WWW::SwaggerClient::Object::HosAuthenticationLogsResponseAuthenticationLogs](docs/HosAuthenticationLogsResponseAuthenticationLogs.md)
 - [WWW::SwaggerClient::Object::HosLogsParam](docs/HosLogsParam.md)
 - [WWW::SwaggerClient::Object::HosLogsParam1](docs/HosLogsParam1.md)
 - [WWW::SwaggerClient::Object::HosLogsParam2](docs/HosLogsParam2.md)
 - [WWW::SwaggerClient::Object::HosLogsResponse](docs/HosLogsResponse.md)
 - [WWW::SwaggerClient::Object::HosLogsResponseLogs](docs/HosLogsResponseLogs.md)
 - [WWW::SwaggerClient::Object::HosLogsSummaryResponse](docs/HosLogsSummaryResponse.md)
 - [WWW::SwaggerClient::Object::HosLogsSummaryResponseDrivers](docs/HosLogsSummaryResponseDrivers.md)
 - [WWW::SwaggerClient::Object::HumidityResponse](docs/HumidityResponse.md)
 - [WWW::SwaggerClient::Object::HumidityResponseSensors](docs/HumidityResponseSensors.md)
 - [WWW::SwaggerClient::Object::InlineResponse200](docs/InlineResponse200.md)
 - [WWW::SwaggerClient::Object::InlineResponse2001](docs/InlineResponse2001.md)
 - [WWW::SwaggerClient::Object::InlineResponse2002](docs/InlineResponse2002.md)
 - [WWW::SwaggerClient::Object::InlineResponse2003](docs/InlineResponse2003.md)
 - [WWW::SwaggerClient::Object::InlineResponse2004](docs/InlineResponse2004.md)
 - [WWW::SwaggerClient::Object::InlineResponse2005](docs/InlineResponse2005.md)
 - [WWW::SwaggerClient::Object::InlineResponse2005VehicleStats](docs/InlineResponse2005VehicleStats.md)
 - [WWW::SwaggerClient::Object::InlineResponse2006](docs/InlineResponse2006.md)
 - [WWW::SwaggerClient::Object::InlineResponse2007](docs/InlineResponse2007.md)
 - [WWW::SwaggerClient::Object::InlineResponse2008](docs/InlineResponse2008.md)
 - [WWW::SwaggerClient::Object::InlineResponse2009](docs/InlineResponse2009.md)
 - [WWW::SwaggerClient::Object::JobStatus](docs/JobStatus.md)
 - [WWW::SwaggerClient::Object::JobUpdateObject](docs/JobUpdateObject.md)
 - [WWW::SwaggerClient::Object::Machine](docs/Machine.md)
 - [WWW::SwaggerClient::Object::MachineHistoryResponse](docs/MachineHistoryResponse.md)
 - [WWW::SwaggerClient::Object::MachineHistoryResponseMachines](docs/MachineHistoryResponseMachines.md)
 - [WWW::SwaggerClient::Object::MachineHistoryResponseVibrations](docs/MachineHistoryResponseVibrations.md)
 - [WWW::SwaggerClient::Object::Pagination](docs/Pagination.md)
 - [WWW::SwaggerClient::Object::PrevJobStatus](docs/PrevJobStatus.md)
 - [WWW::SwaggerClient::Object::ReactivateDriverParam](docs/ReactivateDriverParam.md)
 - [WWW::SwaggerClient::Object::SafetyReportHarshEvent](docs/SafetyReportHarshEvent.md)
 - [WWW::SwaggerClient::Object::Sensor](docs/Sensor.md)
 - [WWW::SwaggerClient::Object::SensorHistoryResponse](docs/SensorHistoryResponse.md)
 - [WWW::SwaggerClient::Object::SensorHistoryResponseResults](docs/SensorHistoryResponseResults.md)
 - [WWW::SwaggerClient::Object::SensorParam](docs/SensorParam.md)
 - [WWW::SwaggerClient::Object::SensorshistorySeries](docs/SensorshistorySeries.md)
 - [WWW::SwaggerClient::Object::Tag](docs/Tag.md)
 - [WWW::SwaggerClient::Object::TagCreate](docs/TagCreate.md)
 - [WWW::SwaggerClient::Object::TagIds](docs/TagIds.md)
 - [WWW::SwaggerClient::Object::TagMetadata](docs/TagMetadata.md)
 - [WWW::SwaggerClient::Object::TagModify](docs/TagModify.md)
 - [WWW::SwaggerClient::Object::TagModifyAdd](docs/TagModifyAdd.md)
 - [WWW::SwaggerClient::Object::TagModifyDelete](docs/TagModifyDelete.md)
 - [WWW::SwaggerClient::Object::TagUpdate](docs/TagUpdate.md)
 - [WWW::SwaggerClient::Object::TaggedAddressBase](docs/TaggedAddressBase.md)
 - [WWW::SwaggerClient::Object::TaggedAssetBase](docs/TaggedAssetBase.md)
 - [WWW::SwaggerClient::Object::TaggedDriverBase](docs/TaggedDriverBase.md)
 - [WWW::SwaggerClient::Object::TaggedMachineBase](docs/TaggedMachineBase.md)
 - [WWW::SwaggerClient::Object::TaggedSensorBase](docs/TaggedSensorBase.md)
 - [WWW::SwaggerClient::Object::TaggedVehicleBase](docs/TaggedVehicleBase.md)
 - [WWW::SwaggerClient::Object::TemperatureResponse](docs/TemperatureResponse.md)
 - [WWW::SwaggerClient::Object::TemperatureResponseSensors](docs/TemperatureResponseSensors.md)
 - [WWW::SwaggerClient::Object::TripResponse](docs/TripResponse.md)
 - [WWW::SwaggerClient::Object::TripResponseEndCoordinates](docs/TripResponseEndCoordinates.md)
 - [WWW::SwaggerClient::Object::TripResponseStartCoordinates](docs/TripResponseStartCoordinates.md)
 - [WWW::SwaggerClient::Object::TripResponseTrips](docs/TripResponseTrips.md)
 - [WWW::SwaggerClient::Object::TripsParam](docs/TripsParam.md)
 - [WWW::SwaggerClient::Object::UserBase](docs/UserBase.md)
 - [WWW::SwaggerClient::Object::UserRole](docs/UserRole.md)
 - [WWW::SwaggerClient::Object::UserTagRole](docs/UserTagRole.md)
 - [WWW::SwaggerClient::Object::UserTagRoleTag](docs/UserTagRoleTag.md)
 - [WWW::SwaggerClient::Object::Vehicle](docs/Vehicle.md)
 - [WWW::SwaggerClient::Object::VehicleHarshEventResponse](docs/VehicleHarshEventResponse.md)
 - [WWW::SwaggerClient::Object::VehicleHarshEventResponseLocation](docs/VehicleHarshEventResponseLocation.md)
 - [WWW::SwaggerClient::Object::VehicleLocation](docs/VehicleLocation.md)
 - [WWW::SwaggerClient::Object::VehicleMaintenance](docs/VehicleMaintenance.md)
 - [WWW::SwaggerClient::Object::VehicleMaintenanceJ1939](docs/VehicleMaintenanceJ1939.md)
 - [WWW::SwaggerClient::Object::VehicleMaintenanceJ1939CheckEngineLight](docs/VehicleMaintenanceJ1939CheckEngineLight.md)
 - [WWW::SwaggerClient::Object::VehicleMaintenanceJ1939DiagnosticTroubleCodes](docs/VehicleMaintenanceJ1939DiagnosticTroubleCodes.md)
 - [WWW::SwaggerClient::Object::VehicleMaintenancePassenger](docs/VehicleMaintenancePassenger.md)
 - [WWW::SwaggerClient::Object::VehicleMaintenancePassengerCheckEngineLight](docs/VehicleMaintenancePassengerCheckEngineLight.md)
 - [WWW::SwaggerClient::Object::VehicleMaintenancePassengerDiagnosticTroubleCodes](docs/VehicleMaintenancePassengerDiagnosticTroubleCodes.md)
 - [WWW::SwaggerClient::Object::VehicleSafetyScoreResponse](docs/VehicleSafetyScoreResponse.md)
 - [WWW::SwaggerClient::Object::VehicleUpdateParam](docs/VehicleUpdateParam.md)
 - [WWW::SwaggerClient::Object::DispatchJob](docs/DispatchJob.md)
 - [WWW::SwaggerClient::Object::DispatchRoute](docs/DispatchRoute.md)
 - [WWW::SwaggerClient::Object::DispatchRouteCreate](docs/DispatchRouteCreate.md)
 - [WWW::SwaggerClient::Object::Document](docs/Document.md)
 - [WWW::SwaggerClient::Object::DocumentCreate](docs/DocumentCreate.md)
 - [WWW::SwaggerClient::Object::DocumentField](docs/DocumentField.md)
 - [WWW::SwaggerClient::Object::Driver](docs/Driver.md)
 - [WWW::SwaggerClient::Object::DriverForCreate](docs/DriverForCreate.md)
 - [WWW::SwaggerClient::Object::TaggedAddress](docs/TaggedAddress.md)
 - [WWW::SwaggerClient::Object::TaggedAsset](docs/TaggedAsset.md)
 - [WWW::SwaggerClient::Object::TaggedDriver](docs/TaggedDriver.md)
 - [WWW::SwaggerClient::Object::TaggedMachine](docs/TaggedMachine.md)
 - [WWW::SwaggerClient::Object::TaggedSensor](docs/TaggedSensor.md)
 - [WWW::SwaggerClient::Object::TaggedVehicle](docs/TaggedVehicle.md)
 - [WWW::SwaggerClient::Object::User](docs/User.md)


# DOCUMENTATION FOR AUTHORIZATION
 All endpoints do not require authorization.

