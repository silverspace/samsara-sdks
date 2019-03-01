=begin comment

Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
package WWW::SwaggerClient::FleetApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::SwaggerClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::SwaggerClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# add_fleet_address
#
# /fleet/add_address
# 
# @param string $access_token Samsara API access token. (required)
# @param AddressParam $address_param  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'address_param' => {
        data_type => 'AddressParam',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'add_fleet_address' } = { 
    	summary => '/fleet/add_address',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub add_fleet_address {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling add_fleet_address");
    }

    # verify the required parameter 'address_param' is set
    unless (exists $args{'address_param'}) {
      croak("Missing the required parameter 'address_param' when calling add_fleet_address");
    }

    # parse inputs
    my $_resource_path = '/fleet/add_address';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'address_param'}) {
        $_body_data = $args{'address_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# add_organization_addresses
#
# /addresses
# 
# @param string $access_token Samsara API access token. (required)
# @param Addresses $addresses List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'addresses' => {
        data_type => 'Addresses',
        description => 'List of addresses/geofences to add. Geofences can be circular or a polygon.  For each address, only one of &#39;circle&#39; or &#39;polygon&#39; should be provided. If both are provided, the geofence will be saved as a polygon.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'add_organization_addresses' } = { 
    	summary => '/addresses',
        params => $params,
        returns => 'ARRAY[Address]',
        };
}
# @return ARRAY[Address]
#
sub add_organization_addresses {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling add_organization_addresses");
    }

    # verify the required parameter 'addresses' is set
    unless (exists $args{'addresses'}) {
      croak("Missing the required parameter 'addresses' when calling add_organization_addresses");
    }

    # parse inputs
    my $_resource_path = '/addresses';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'addresses'}) {
        $_body_data = $args{'addresses'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[Address]', $response);
    return $_response_object;
}

#
# create_dispatch_route
#
# /fleet/dispatch/routes
# 
# @param string $access_token Samsara API access token. (required)
# @param DispatchRouteCreate $create_dispatch_route_params  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'create_dispatch_route_params' => {
        data_type => 'DispatchRouteCreate',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_dispatch_route' } = { 
    	summary => '/fleet/dispatch/routes',
        params => $params,
        returns => 'DispatchRoute',
        };
}
# @return DispatchRoute
#
sub create_dispatch_route {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling create_dispatch_route");
    }

    # verify the required parameter 'create_dispatch_route_params' is set
    unless (exists $args{'create_dispatch_route_params'}) {
      croak("Missing the required parameter 'create_dispatch_route_params' when calling create_dispatch_route");
    }

    # parse inputs
    my $_resource_path = '/fleet/dispatch/routes';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'create_dispatch_route_params'}) {
        $_body_data = $args{'create_dispatch_route_params'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoute', $response);
    return $_response_object;
}

#
# create_driver
#
# /fleet/drivers/create
# 
# @param string $access_token Samsara API access token. (required)
# @param DriverForCreate $create_driver_param Driver creation body (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'create_driver_param' => {
        data_type => 'DriverForCreate',
        description => 'Driver creation body',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_driver' } = { 
    	summary => '/fleet/drivers/create',
        params => $params,
        returns => 'Driver',
        };
}
# @return Driver
#
sub create_driver {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling create_driver");
    }

    # verify the required parameter 'create_driver_param' is set
    unless (exists $args{'create_driver_param'}) {
      croak("Missing the required parameter 'create_driver_param' when calling create_driver");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/create';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'create_driver_param'}) {
        $_body_data = $args{'create_driver_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Driver', $response);
    return $_response_object;
}

#
# create_driver_dispatch_route
#
# /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
# 
# @param string $access_token Samsara API access token. (required)
# @param int $driver_id ID of the driver with the associated routes. (required)
# @param DispatchRouteCreate $create_dispatch_route_params  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id' => {
        data_type => 'int',
        description => 'ID of the driver with the associated routes.',
        required => '1',
    },
    'create_dispatch_route_params' => {
        data_type => 'DispatchRouteCreate',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_driver_dispatch_route' } = { 
    	summary => '/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes',
        params => $params,
        returns => 'DispatchRoute',
        };
}
# @return DispatchRoute
#
sub create_driver_dispatch_route {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling create_driver_dispatch_route");
    }

    # verify the required parameter 'driver_id' is set
    unless (exists $args{'driver_id'}) {
      croak("Missing the required parameter 'driver_id' when calling create_driver_dispatch_route");
    }

    # verify the required parameter 'create_dispatch_route_params' is set
    unless (exists $args{'create_dispatch_route_params'}) {
      croak("Missing the required parameter 'create_dispatch_route_params' when calling create_driver_dispatch_route");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/{driver_id}/dispatch/routes';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'driver_id'}) {
        my $_base_variable = "{" . "driver_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'create_dispatch_route_params'}) {
        $_body_data = $args{'create_dispatch_route_params'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoute', $response);
    return $_response_object;
}

#
# create_driver_document
#
# /fleet/drivers/{driver_id:[0-9]+}/documents
# 
# @param string $access_token Samsara API access token. (required)
# @param int $driver_id ID of the driver for whom the document is created. (required)
# @param DocumentCreate $create_document_params To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id' => {
        data_type => 'int',
        description => 'ID of the driver for whom the document is created.',
        required => '1',
    },
    'create_document_params' => {
        data_type => 'DocumentCreate',
        description => 'To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_driver_document' } = { 
    	summary => '/fleet/drivers/{driver_id:[0-9]+}/documents',
        params => $params,
        returns => 'Document',
        };
}
# @return Document
#
sub create_driver_document {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling create_driver_document");
    }

    # verify the required parameter 'driver_id' is set
    unless (exists $args{'driver_id'}) {
      croak("Missing the required parameter 'driver_id' when calling create_driver_document");
    }

    # verify the required parameter 'create_document_params' is set
    unless (exists $args{'create_document_params'}) {
      croak("Missing the required parameter 'create_document_params' when calling create_driver_document");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/{driver_id}/documents';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'driver_id'}) {
        my $_base_variable = "{" . "driver_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'create_document_params'}) {
        $_body_data = $args{'create_document_params'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Document', $response);
    return $_response_object;
}

#
# create_dvir
#
# /fleet/maintenance/dvirs
# 
# @param string $access_token Samsara API access token. (required)
# @param CreateDvirParam $create_dvir_param DVIR creation body (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'create_dvir_param' => {
        data_type => 'CreateDvirParam',
        description => 'DVIR creation body',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_dvir' } = { 
    	summary => '/fleet/maintenance/dvirs',
        params => $params,
        returns => 'DvirBase',
        };
}
# @return DvirBase
#
sub create_dvir {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling create_dvir");
    }

    # verify the required parameter 'create_dvir_param' is set
    unless (exists $args{'create_dvir_param'}) {
      croak("Missing the required parameter 'create_dvir_param' when calling create_dvir");
    }

    # parse inputs
    my $_resource_path = '/fleet/maintenance/dvirs';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'create_dvir_param'}) {
        $_body_data = $args{'create_dvir_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DvirBase', $response);
    return $_response_object;
}

#
# create_vehicle_dispatch_route
#
# /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
# 
# @param string $access_token Samsara API access token. (required)
# @param int $vehicle_id ID of the vehicle with the associated routes. (required)
# @param DispatchRouteCreate $create_dispatch_route_params  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'vehicle_id' => {
        data_type => 'int',
        description => 'ID of the vehicle with the associated routes.',
        required => '1',
    },
    'create_dispatch_route_params' => {
        data_type => 'DispatchRouteCreate',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_vehicle_dispatch_route' } = { 
    	summary => '/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes',
        params => $params,
        returns => 'DispatchRoute',
        };
}
# @return DispatchRoute
#
sub create_vehicle_dispatch_route {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling create_vehicle_dispatch_route");
    }

    # verify the required parameter 'vehicle_id' is set
    unless (exists $args{'vehicle_id'}) {
      croak("Missing the required parameter 'vehicle_id' when calling create_vehicle_dispatch_route");
    }

    # verify the required parameter 'create_dispatch_route_params' is set
    unless (exists $args{'create_dispatch_route_params'}) {
      croak("Missing the required parameter 'create_dispatch_route_params' when calling create_vehicle_dispatch_route");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/{vehicle_id}/dispatch/routes';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'vehicle_id'}) {
        my $_base_variable = "{" . "vehicle_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'vehicle_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'create_dispatch_route_params'}) {
        $_body_data = $args{'create_dispatch_route_params'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoute', $response);
    return $_response_object;
}

#
# deactivate_driver
#
# /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
# 
# @param string $access_token Samsara API access token. (required)
# @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id_or_external_id' => {
        data_type => 'string',
        description => 'ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'deactivate_driver' } = { 
    	summary => '/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub deactivate_driver {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling deactivate_driver");
    }

    # verify the required parameter 'driver_id_or_external_id' is set
    unless (exists $args{'driver_id_or_external_id'}) {
      croak("Missing the required parameter 'driver_id_or_external_id' when calling deactivate_driver");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/{driver_id_or_external_id}';

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'driver_id_or_external_id'}) {
        my $_base_variable = "{" . "driver_id_or_external_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id_or_external_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# delete_dispatch_route_by_id
#
# /fleet/dispatch/routes/{route_id:[0-9]+}/
# 
# @param string $access_token Samsara API access token. (required)
# @param int $route_id ID of the dispatch route. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'route_id' => {
        data_type => 'int',
        description => 'ID of the dispatch route.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_dispatch_route_by_id' } = { 
    	summary => '/fleet/dispatch/routes/{route_id:[0-9]+}/',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub delete_dispatch_route_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling delete_dispatch_route_by_id");
    }

    # verify the required parameter 'route_id' is set
    unless (exists $args{'route_id'}) {
      croak("Missing the required parameter 'route_id' when calling delete_dispatch_route_by_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/dispatch/routes/{route_id}';

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'route_id'}) {
        my $_base_variable = "{" . "route_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'route_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# delete_organization_address
#
# /addresses/{addressId}
# 
# @param string $access_token Samsara API access token. (required)
# @param int $address_id ID of the address/geofence (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'address_id' => {
        data_type => 'int',
        description => 'ID of the address/geofence',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_organization_address' } = { 
    	summary => '/addresses/{addressId}',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub delete_organization_address {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling delete_organization_address");
    }

    # verify the required parameter 'address_id' is set
    unless (exists $args{'address_id'}) {
      croak("Missing the required parameter 'address_id' when calling delete_organization_address");
    }

    # parse inputs
    my $_resource_path = '/addresses/{addressId}';

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'address_id'}) {
        my $_base_variable = "{" . "addressId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'address_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# fetch_all_dispatch_routes
#
# /fleet/dispatch/routes
# 
# @param string $access_token Samsara API access token. (required)
# @param int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
# @param int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
# @param int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_id' => {
        data_type => 'int',
        description => 'Optional group ID if the organization has multiple groups (uncommon).',
        required => '0',
    },
    'end_time' => {
        data_type => 'int',
        description => 'Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.',
        required => '0',
    },
    'duration' => {
        data_type => 'int',
        description => 'Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'fetch_all_dispatch_routes' } = { 
    	summary => '/fleet/dispatch/routes',
        params => $params,
        returns => 'DispatchRoutes',
        };
}
# @return DispatchRoutes
#
sub fetch_all_dispatch_routes {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling fetch_all_dispatch_routes");
    }

    # parse inputs
    my $_resource_path = '/fleet/dispatch/routes';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'group_id'}) {
        $query_params->{'group_id'} = $self->{api_client}->to_query_value($args{'group_id'});
    }

    # query params
    if ( exists $args{'end_time'}) {
        $query_params->{'end_time'} = $self->{api_client}->to_query_value($args{'end_time'});
    }

    # query params
    if ( exists $args{'duration'}) {
        $query_params->{'duration'} = $self->{api_client}->to_query_value($args{'duration'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoutes', $response);
    return $_response_object;
}

#
# fetch_all_route_job_updates
#
# /fleet/dispatch/routes/job_updates
# 
# @param string $access_token Samsara API access token. (required)
# @param int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
# @param string $sequence_id Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
# @param string $include Optionally set include&#x3D;route to include route object in response payload. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_id' => {
        data_type => 'int',
        description => 'Optional group ID if the organization has multiple groups (uncommon).',
        required => '0',
    },
    'sequence_id' => {
        data_type => 'string',
        description => 'Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.',
        required => '0',
    },
    'include' => {
        data_type => 'string',
        description => 'Optionally set include&#x3D;route to include route object in response payload.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'fetch_all_route_job_updates' } = { 
    	summary => '/fleet/dispatch/routes/job_updates',
        params => $params,
        returns => 'AllRouteJobUpdates',
        };
}
# @return AllRouteJobUpdates
#
sub fetch_all_route_job_updates {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling fetch_all_route_job_updates");
    }

    # parse inputs
    my $_resource_path = '/fleet/dispatch/routes/job_updates';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'group_id'}) {
        $query_params->{'group_id'} = $self->{api_client}->to_query_value($args{'group_id'});
    }

    # query params
    if ( exists $args{'sequence_id'}) {
        $query_params->{'sequence_id'} = $self->{api_client}->to_query_value($args{'sequence_id'});
    }

    # query params
    if ( exists $args{'include'}) {
        $query_params->{'include'} = $self->{api_client}->to_query_value($args{'include'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('AllRouteJobUpdates', $response);
    return $_response_object;
}

#
# get_all_asset_current_locations
#
# /fleet/assets/locations
# 
# @param string $access_token Samsara API access token. (required)
# @param int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_id' => {
        data_type => 'int',
        description => 'Optional group ID if the organization has multiple groups (uncommon).',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_all_asset_current_locations' } = { 
    	summary => '/fleet/assets/locations',
        params => $params,
        returns => 'InlineResponse2001',
        };
}
# @return InlineResponse2001
#
sub get_all_asset_current_locations {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_all_asset_current_locations");
    }

    # parse inputs
    my $_resource_path = '/fleet/assets/locations';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'group_id'}) {
        $query_params->{'group_id'} = $self->{api_client}->to_query_value($args{'group_id'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('InlineResponse2001', $response);
    return $_response_object;
}

#
# get_all_assets
#
# /fleet/assets
# 
# @param string $access_token Samsara API access token. (required)
# @param int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_id' => {
        data_type => 'int',
        description => 'Optional group ID if the organization has multiple groups (uncommon).',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_all_assets' } = { 
    	summary => '/fleet/assets',
        params => $params,
        returns => 'InlineResponse200',
        };
}
# @return InlineResponse200
#
sub get_all_assets {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_all_assets");
    }

    # parse inputs
    my $_resource_path = '/fleet/assets';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'group_id'}) {
        $query_params->{'group_id'} = $self->{api_client}->to_query_value($args{'group_id'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('InlineResponse200', $response);
    return $_response_object;
}

#
# get_all_deactivated_drivers
#
# /fleet/drivers/inactive
# 
# @param string $access_token Samsara API access token. (required)
# @param int $group_id Optional group ID if the organization has multiple groups (uncommon). (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_id' => {
        data_type => 'int',
        description => 'Optional group ID if the organization has multiple groups (uncommon).',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_all_deactivated_drivers' } = { 
    	summary => '/fleet/drivers/inactive',
        params => $params,
        returns => 'ARRAY[Driver]',
        };
}
# @return ARRAY[Driver]
#
sub get_all_deactivated_drivers {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_all_deactivated_drivers");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/inactive';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'group_id'}) {
        $query_params->{'group_id'} = $self->{api_client}->to_query_value($args{'group_id'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[Driver]', $response);
    return $_response_object;
}

#
# get_asset_location
#
# /fleet/assets/{assetId:[0-9]+}/locations
# 
# @param string $access_token Samsara API access token. (required)
# @param int $asset_id ID of the asset (required)
# @param int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
# @param int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'asset_id' => {
        data_type => 'int',
        description => 'ID of the asset',
        required => '1',
    },
    'start_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_asset_location' } = { 
    	summary => '/fleet/assets/{assetId:[0-9]+}/locations',
        params => $params,
        returns => 'AssetLocationResponse',
        };
}
# @return AssetLocationResponse
#
sub get_asset_location {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_asset_location");
    }

    # verify the required parameter 'asset_id' is set
    unless (exists $args{'asset_id'}) {
      croak("Missing the required parameter 'asset_id' when calling get_asset_location");
    }

    # verify the required parameter 'start_ms' is set
    unless (exists $args{'start_ms'}) {
      croak("Missing the required parameter 'start_ms' when calling get_asset_location");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_asset_location");
    }

    # parse inputs
    my $_resource_path = '/fleet/assets/{asset_id}/locations';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_ms'}) {
        $query_params->{'startMs'} = $self->{api_client}->to_query_value($args{'start_ms'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # path params
    if ( exists $args{'asset_id'}) {
        my $_base_variable = "{" . "asset_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'asset_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('AssetLocationResponse', $response);
    return $_response_object;
}

#
# get_asset_reefer
#
# /fleet/assets/{assetId:[0-9]+}/reefer
# 
# @param string $access_token Samsara API access token. (required)
# @param int $asset_id ID of the asset (required)
# @param int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
# @param int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'asset_id' => {
        data_type => 'int',
        description => 'ID of the asset',
        required => '1',
    },
    'start_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_asset_reefer' } = { 
    	summary => '/fleet/assets/{assetId:[0-9]+}/reefer',
        params => $params,
        returns => 'AssetReeferResponse',
        };
}
# @return AssetReeferResponse
#
sub get_asset_reefer {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_asset_reefer");
    }

    # verify the required parameter 'asset_id' is set
    unless (exists $args{'asset_id'}) {
      croak("Missing the required parameter 'asset_id' when calling get_asset_reefer");
    }

    # verify the required parameter 'start_ms' is set
    unless (exists $args{'start_ms'}) {
      croak("Missing the required parameter 'start_ms' when calling get_asset_reefer");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_asset_reefer");
    }

    # parse inputs
    my $_resource_path = '/fleet/assets/{asset_id}/reefer';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_ms'}) {
        $query_params->{'startMs'} = $self->{api_client}->to_query_value($args{'start_ms'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # path params
    if ( exists $args{'asset_id'}) {
        my $_base_variable = "{" . "asset_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'asset_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('AssetReeferResponse', $response);
    return $_response_object;
}

#
# get_deactivated_driver_by_id
#
# /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
# 
# @param string $access_token Samsara API access token. (required)
# @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id_or_external_id' => {
        data_type => 'string',
        description => 'ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_deactivated_driver_by_id' } = { 
    	summary => '/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}',
        params => $params,
        returns => 'Driver',
        };
}
# @return Driver
#
sub get_deactivated_driver_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_deactivated_driver_by_id");
    }

    # verify the required parameter 'driver_id_or_external_id' is set
    unless (exists $args{'driver_id_or_external_id'}) {
      croak("Missing the required parameter 'driver_id_or_external_id' when calling get_deactivated_driver_by_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/inactive/{driver_id_or_external_id}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'driver_id_or_external_id'}) {
        my $_base_variable = "{" . "driver_id_or_external_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id_or_external_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Driver', $response);
    return $_response_object;
}

#
# get_dispatch_route_by_id
#
# /fleet/dispatch/routes/{route_id:[0-9]+}
# 
# @param string $access_token Samsara API access token. (required)
# @param int $route_id ID of the dispatch route. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'route_id' => {
        data_type => 'int',
        description => 'ID of the dispatch route.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_dispatch_route_by_id' } = { 
    	summary => '/fleet/dispatch/routes/{route_id:[0-9]+}',
        params => $params,
        returns => 'DispatchRoute',
        };
}
# @return DispatchRoute
#
sub get_dispatch_route_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_dispatch_route_by_id");
    }

    # verify the required parameter 'route_id' is set
    unless (exists $args{'route_id'}) {
      croak("Missing the required parameter 'route_id' when calling get_dispatch_route_by_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/dispatch/routes/{route_id}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'route_id'}) {
        my $_base_variable = "{" . "route_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'route_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoute', $response);
    return $_response_object;
}

#
# get_dispatch_route_history
#
# /fleet/dispatch/routes/{route_id:[0-9]+}/history
# 
# @param string $access_token Samsara API access token. (required)
# @param int $route_id ID of the route with history. (required)
# @param int $start_time Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
# @param int $end_time Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'route_id' => {
        data_type => 'int',
        description => 'ID of the route with history.',
        required => '1',
    },
    'start_time' => {
        data_type => 'int',
        description => 'Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.',
        required => '0',
    },
    'end_time' => {
        data_type => 'int',
        description => 'Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_dispatch_route_history' } = { 
    	summary => '/fleet/dispatch/routes/{route_id:[0-9]+}/history',
        params => $params,
        returns => 'DispatchRouteHistory',
        };
}
# @return DispatchRouteHistory
#
sub get_dispatch_route_history {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_dispatch_route_history");
    }

    # verify the required parameter 'route_id' is set
    unless (exists $args{'route_id'}) {
      croak("Missing the required parameter 'route_id' when calling get_dispatch_route_history");
    }

    # parse inputs
    my $_resource_path = '/fleet/dispatch/routes/{route_id}/history';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_time'}) {
        $query_params->{'start_time'} = $self->{api_client}->to_query_value($args{'start_time'});
    }

    # query params
    if ( exists $args{'end_time'}) {
        $query_params->{'end_time'} = $self->{api_client}->to_query_value($args{'end_time'});
    }

    # path params
    if ( exists $args{'route_id'}) {
        my $_base_variable = "{" . "route_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'route_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRouteHistory', $response);
    return $_response_object;
}

#
# get_dispatch_routes_by_driver_id
#
# /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
# 
# @param string $access_token Samsara API access token. (required)
# @param int $driver_id ID of the driver with the associated routes. (required)
# @param int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
# @param int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id' => {
        data_type => 'int',
        description => 'ID of the driver with the associated routes.',
        required => '1',
    },
    'end_time' => {
        data_type => 'int',
        description => 'Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.',
        required => '0',
    },
    'duration' => {
        data_type => 'int',
        description => 'Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_dispatch_routes_by_driver_id' } = { 
    	summary => '/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes',
        params => $params,
        returns => 'DispatchRoutes',
        };
}
# @return DispatchRoutes
#
sub get_dispatch_routes_by_driver_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_dispatch_routes_by_driver_id");
    }

    # verify the required parameter 'driver_id' is set
    unless (exists $args{'driver_id'}) {
      croak("Missing the required parameter 'driver_id' when calling get_dispatch_routes_by_driver_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/{driver_id}/dispatch/routes';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'end_time'}) {
        $query_params->{'end_time'} = $self->{api_client}->to_query_value($args{'end_time'});
    }

    # query params
    if ( exists $args{'duration'}) {
        $query_params->{'duration'} = $self->{api_client}->to_query_value($args{'duration'});
    }

    # path params
    if ( exists $args{'driver_id'}) {
        my $_base_variable = "{" . "driver_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoutes', $response);
    return $_response_object;
}

#
# get_dispatch_routes_by_vehicle_id
#
# /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
# 
# @param string $access_token Samsara API access token. (required)
# @param int $vehicle_id ID of the vehicle with the associated routes. (required)
# @param int $end_time Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
# @param int $duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'vehicle_id' => {
        data_type => 'int',
        description => 'ID of the vehicle with the associated routes.',
        required => '1',
    },
    'end_time' => {
        data_type => 'int',
        description => 'Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.',
        required => '0',
    },
    'duration' => {
        data_type => 'int',
        description => 'Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_dispatch_routes_by_vehicle_id' } = { 
    	summary => '/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes',
        params => $params,
        returns => 'DispatchRoutes',
        };
}
# @return DispatchRoutes
#
sub get_dispatch_routes_by_vehicle_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_dispatch_routes_by_vehicle_id");
    }

    # verify the required parameter 'vehicle_id' is set
    unless (exists $args{'vehicle_id'}) {
      croak("Missing the required parameter 'vehicle_id' when calling get_dispatch_routes_by_vehicle_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/{vehicle_id}/dispatch/routes';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'end_time'}) {
        $query_params->{'end_time'} = $self->{api_client}->to_query_value($args{'end_time'});
    }

    # query params
    if ( exists $args{'duration'}) {
        $query_params->{'duration'} = $self->{api_client}->to_query_value($args{'duration'});
    }

    # path params
    if ( exists $args{'vehicle_id'}) {
        my $_base_variable = "{" . "vehicle_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'vehicle_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoutes', $response);
    return $_response_object;
}

#
# get_driver_by_id
#
# /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
# 
# @param string $access_token Samsara API access token. (required)
# @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id_or_external_id' => {
        data_type => 'string',
        description => 'ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_driver_by_id' } = { 
    	summary => '/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}',
        params => $params,
        returns => 'CurrentDriver',
        };
}
# @return CurrentDriver
#
sub get_driver_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_driver_by_id");
    }

    # verify the required parameter 'driver_id_or_external_id' is set
    unless (exists $args{'driver_id_or_external_id'}) {
      croak("Missing the required parameter 'driver_id_or_external_id' when calling get_driver_by_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/{driver_id_or_external_id}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'driver_id_or_external_id'}) {
        my $_base_variable = "{" . "driver_id_or_external_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id_or_external_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('CurrentDriver', $response);
    return $_response_object;
}

#
# get_driver_document_types_by_org_id
#
# /fleet/drivers/document_types
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'get_driver_document_types_by_org_id' } = { 
    	summary => '/fleet/drivers/document_types',
        params => $params,
        returns => 'DocumentTypes',
        };
}
# @return DocumentTypes
#
sub get_driver_document_types_by_org_id {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/fleet/drivers/document_types';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DocumentTypes', $response);
    return $_response_object;
}

#
# get_driver_documents_by_org_id
#
# /fleet/drivers/documents
# 
# @param string $access_token Samsara API access token. (required)
# @param int $end_ms Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
# @param int $duration_ms Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.',
        required => '0',
    },
    'duration_ms' => {
        data_type => 'int',
        description => 'Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_driver_documents_by_org_id' } = { 
    	summary => '/fleet/drivers/documents',
        params => $params,
        returns => 'Documents',
        };
}
# @return Documents
#
sub get_driver_documents_by_org_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_driver_documents_by_org_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/documents';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # query params
    if ( exists $args{'duration_ms'}) {
        $query_params->{'durationMs'} = $self->{api_client}->to_query_value($args{'duration_ms'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Documents', $response);
    return $_response_object;
}

#
# get_driver_safety_score
#
# /fleet/drivers/{driverId:[0-9]+}/safety/score
# 
# @param int $driver_id ID of the driver (required)
# @param string $access_token Samsara API access token. (required)
# @param int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
# @param int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
{
    my $params = {
    'driver_id' => {
        data_type => 'int',
        description => 'ID of the driver',
        required => '1',
    },
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'start_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_driver_safety_score' } = { 
    	summary => '/fleet/drivers/{driverId:[0-9]+}/safety/score',
        params => $params,
        returns => 'DriverSafetyScoreResponse',
        };
}
# @return DriverSafetyScoreResponse
#
sub get_driver_safety_score {
    my ($self, %args) = @_;

    # verify the required parameter 'driver_id' is set
    unless (exists $args{'driver_id'}) {
      croak("Missing the required parameter 'driver_id' when calling get_driver_safety_score");
    }

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_driver_safety_score");
    }

    # verify the required parameter 'start_ms' is set
    unless (exists $args{'start_ms'}) {
      croak("Missing the required parameter 'start_ms' when calling get_driver_safety_score");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_driver_safety_score");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/{driverId}/safety/score';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_ms'}) {
        $query_params->{'startMs'} = $self->{api_client}->to_query_value($args{'start_ms'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # path params
    if ( exists $args{'driver_id'}) {
        my $_base_variable = "{" . "driverId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DriverSafetyScoreResponse', $response);
    return $_response_object;
}

#
# get_dvirs
#
# /fleet/maintenance/dvirs
# 
# @param string $access_token Samsara API access token. (required)
# @param int $end_ms time in millis until the last dvir log. (required)
# @param int $duration_ms time in millis which corresponds to the duration before the end_ms. (required)
# @param int $group_id Group ID to query. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'time in millis until the last dvir log.',
        required => '1',
    },
    'duration_ms' => {
        data_type => 'int',
        description => 'time in millis which corresponds to the duration before the end_ms.',
        required => '1',
    },
    'group_id' => {
        data_type => 'int',
        description => 'Group ID to query.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_dvirs' } = { 
    	summary => '/fleet/maintenance/dvirs',
        params => $params,
        returns => 'DvirListResponse',
        };
}
# @return DvirListResponse
#
sub get_dvirs {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_dvirs");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_dvirs");
    }

    # verify the required parameter 'duration_ms' is set
    unless (exists $args{'duration_ms'}) {
      croak("Missing the required parameter 'duration_ms' when calling get_dvirs");
    }

    # parse inputs
    my $_resource_path = '/fleet/maintenance/dvirs';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'end_ms'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # query params
    if ( exists $args{'duration_ms'}) {
        $query_params->{'duration_ms'} = $self->{api_client}->to_query_value($args{'duration_ms'});
    }

    # query params
    if ( exists $args{'group_id'}) {
        $query_params->{'group_id'} = $self->{api_client}->to_query_value($args{'group_id'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DvirListResponse', $response);
    return $_response_object;
}

#
# get_fleet_drivers
#
# /fleet/drivers
# 
# @param string $access_token Samsara API access token. (required)
# @param GroupDriversParam $group_drivers_param  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_drivers_param' => {
        data_type => 'GroupDriversParam',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_drivers' } = { 
    	summary => '/fleet/drivers',
        params => $params,
        returns => 'DriversResponse',
        };
}
# @return DriversResponse
#
sub get_fleet_drivers {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_drivers");
    }

    # verify the required parameter 'group_drivers_param' is set
    unless (exists $args{'group_drivers_param'}) {
      croak("Missing the required parameter 'group_drivers_param' when calling get_fleet_drivers");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'group_drivers_param'}) {
        $_body_data = $args{'group_drivers_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DriversResponse', $response);
    return $_response_object;
}

#
# get_fleet_drivers_hos_daily_logs
#
# /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
# 
# @param string $access_token Samsara API access token. (required)
# @param int $driver_id ID of the driver with HOS logs. (required)
# @param HosLogsParam $hos_logs_param  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id' => {
        data_type => 'int',
        description => 'ID of the driver with HOS logs.',
        required => '1',
    },
    'hos_logs_param' => {
        data_type => 'HosLogsParam',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_drivers_hos_daily_logs' } = { 
    	summary => '/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs',
        params => $params,
        returns => 'DriverDailyLogResponse',
        };
}
# @return DriverDailyLogResponse
#
sub get_fleet_drivers_hos_daily_logs {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_drivers_hos_daily_logs");
    }

    # verify the required parameter 'driver_id' is set
    unless (exists $args{'driver_id'}) {
      croak("Missing the required parameter 'driver_id' when calling get_fleet_drivers_hos_daily_logs");
    }

    # verify the required parameter 'hos_logs_param' is set
    unless (exists $args{'hos_logs_param'}) {
      croak("Missing the required parameter 'hos_logs_param' when calling get_fleet_drivers_hos_daily_logs");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/{driver_id}/hos_daily_logs';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'driver_id'}) {
        my $_base_variable = "{" . "driver_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'hos_logs_param'}) {
        $_body_data = $args{'hos_logs_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DriverDailyLogResponse', $response);
    return $_response_object;
}

#
# get_fleet_drivers_summary
#
# /fleet/drivers/summary
# 
# @param string $access_token Samsara API access token. (required)
# @param DriversSummaryParam $drivers_summary_param Org ID and time range to query. (required)
# @param boolean $snap_to_day_bounds Snap query result to HOS day boundaries. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'drivers_summary_param' => {
        data_type => 'DriversSummaryParam',
        description => 'Org ID and time range to query.',
        required => '1',
    },
    'snap_to_day_bounds' => {
        data_type => 'boolean',
        description => 'Snap query result to HOS day boundaries.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_drivers_summary' } = { 
    	summary => '/fleet/drivers/summary',
        params => $params,
        returns => 'DriversSummaryResponse',
        };
}
# @return DriversSummaryResponse
#
sub get_fleet_drivers_summary {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_drivers_summary");
    }

    # verify the required parameter 'drivers_summary_param' is set
    unless (exists $args{'drivers_summary_param'}) {
      croak("Missing the required parameter 'drivers_summary_param' when calling get_fleet_drivers_summary");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/summary';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'snap_to_day_bounds'}) {
        $query_params->{'snap_to_day_bounds'} = $self->{api_client}->to_query_value($args{'snap_to_day_bounds'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'drivers_summary_param'}) {
        $_body_data = $args{'drivers_summary_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DriversSummaryResponse', $response);
    return $_response_object;
}

#
# get_fleet_hos_authentication_logs
#
# /fleet/hos_authentication_logs
# 
# @param string $access_token Samsara API access token. (required)
# @param HosAuthenticationLogsParam $hos_authentication_logs_param  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'hos_authentication_logs_param' => {
        data_type => 'HosAuthenticationLogsParam',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_hos_authentication_logs' } = { 
    	summary => '/fleet/hos_authentication_logs',
        params => $params,
        returns => 'HosAuthenticationLogsResponse',
        };
}
# @return HosAuthenticationLogsResponse
#
sub get_fleet_hos_authentication_logs {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_hos_authentication_logs");
    }

    # verify the required parameter 'hos_authentication_logs_param' is set
    unless (exists $args{'hos_authentication_logs_param'}) {
      croak("Missing the required parameter 'hos_authentication_logs_param' when calling get_fleet_hos_authentication_logs");
    }

    # parse inputs
    my $_resource_path = '/fleet/hos_authentication_logs';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'hos_authentication_logs_param'}) {
        $_body_data = $args{'hos_authentication_logs_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('HosAuthenticationLogsResponse', $response);
    return $_response_object;
}

#
# get_fleet_hos_logs
#
# /fleet/hos_logs
# 
# @param string $access_token Samsara API access token. (required)
# @param HosLogsParam1 $hos_logs_param  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'hos_logs_param' => {
        data_type => 'HosLogsParam1',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_hos_logs' } = { 
    	summary => '/fleet/hos_logs',
        params => $params,
        returns => 'HosLogsResponse',
        };
}
# @return HosLogsResponse
#
sub get_fleet_hos_logs {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_hos_logs");
    }

    # verify the required parameter 'hos_logs_param' is set
    unless (exists $args{'hos_logs_param'}) {
      croak("Missing the required parameter 'hos_logs_param' when calling get_fleet_hos_logs");
    }

    # parse inputs
    my $_resource_path = '/fleet/hos_logs';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'hos_logs_param'}) {
        $_body_data = $args{'hos_logs_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('HosLogsResponse', $response);
    return $_response_object;
}

#
# get_fleet_hos_logs_summary
#
# /fleet/hos_logs_summary
# 
# @param string $access_token Samsara API access token. (required)
# @param HosLogsParam2 $hos_logs_param  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'hos_logs_param' => {
        data_type => 'HosLogsParam2',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_hos_logs_summary' } = { 
    	summary => '/fleet/hos_logs_summary',
        params => $params,
        returns => 'HosLogsSummaryResponse',
        };
}
# @return HosLogsSummaryResponse
#
sub get_fleet_hos_logs_summary {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_hos_logs_summary");
    }

    # verify the required parameter 'hos_logs_param' is set
    unless (exists $args{'hos_logs_param'}) {
      croak("Missing the required parameter 'hos_logs_param' when calling get_fleet_hos_logs_summary");
    }

    # parse inputs
    my $_resource_path = '/fleet/hos_logs_summary';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'hos_logs_param'}) {
        $_body_data = $args{'hos_logs_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('HosLogsSummaryResponse', $response);
    return $_response_object;
}

#
# get_fleet_locations
#
# /fleet/locations
# 
# @param string $access_token Samsara API access token. (required)
# @param GroupParam $group_param Group ID to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_param' => {
        data_type => 'GroupParam',
        description => 'Group ID to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_locations' } = { 
    	summary => '/fleet/locations',
        params => $params,
        returns => 'InlineResponse2003',
        };
}
# @return InlineResponse2003
#
sub get_fleet_locations {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_locations");
    }

    # verify the required parameter 'group_param' is set
    unless (exists $args{'group_param'}) {
      croak("Missing the required parameter 'group_param' when calling get_fleet_locations");
    }

    # parse inputs
    my $_resource_path = '/fleet/locations';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'group_param'}) {
        $_body_data = $args{'group_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('InlineResponse2003', $response);
    return $_response_object;
}

#
# get_fleet_maintenance_list
#
# /fleet/maintenance/list
# 
# @param string $access_token Samsara API access token. (required)
# @param GroupParam $group_param Group ID to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_param' => {
        data_type => 'GroupParam',
        description => 'Group ID to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_maintenance_list' } = { 
    	summary => '/fleet/maintenance/list',
        params => $params,
        returns => 'InlineResponse2004',
        };
}
# @return InlineResponse2004
#
sub get_fleet_maintenance_list {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_maintenance_list");
    }

    # verify the required parameter 'group_param' is set
    unless (exists $args{'group_param'}) {
      croak("Missing the required parameter 'group_param' when calling get_fleet_maintenance_list");
    }

    # parse inputs
    my $_resource_path = '/fleet/maintenance/list';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'group_param'}) {
        $_body_data = $args{'group_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('InlineResponse2004', $response);
    return $_response_object;
}

#
# get_fleet_trips
#
# /fleet/trips
# 
# @param string $access_token Samsara API access token. (required)
# @param TripsParam $trips_param Group ID, vehicle ID and time range to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'trips_param' => {
        data_type => 'TripsParam',
        description => 'Group ID, vehicle ID and time range to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_trips' } = { 
    	summary => '/fleet/trips',
        params => $params,
        returns => 'TripResponse',
        };
}
# @return TripResponse
#
sub get_fleet_trips {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_trips");
    }

    # verify the required parameter 'trips_param' is set
    unless (exists $args{'trips_param'}) {
      croak("Missing the required parameter 'trips_param' when calling get_fleet_trips");
    }

    # parse inputs
    my $_resource_path = '/fleet/trips';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'trips_param'}) {
        $_body_data = $args{'trips_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('TripResponse', $response);
    return $_response_object;
}

#
# get_fleet_vehicle
#
# /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
# 
# @param string $access_token Samsara API access token. (required)
# @param string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'vehicle_id_or_external_id' => {
        data_type => 'string',
        description => 'ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_fleet_vehicle' } = { 
    	summary => '/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}',
        params => $params,
        returns => 'FleetVehicleResponse',
        };
}
# @return FleetVehicleResponse
#
sub get_fleet_vehicle {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_fleet_vehicle");
    }

    # verify the required parameter 'vehicle_id_or_external_id' is set
    unless (exists $args{'vehicle_id_or_external_id'}) {
      croak("Missing the required parameter 'vehicle_id_or_external_id' when calling get_fleet_vehicle");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/{vehicle_id_or_external_id}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'vehicle_id_or_external_id'}) {
        my $_base_variable = "{" . "vehicle_id_or_external_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'vehicle_id_or_external_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('FleetVehicleResponse', $response);
    return $_response_object;
}

#
# get_organization_address
#
# /addresses/{addressId}
# 
# @param string $access_token Samsara API access token. (required)
# @param int $address_id ID of the address/geofence (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'address_id' => {
        data_type => 'int',
        description => 'ID of the address/geofence',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_organization_address' } = { 
    	summary => '/addresses/{addressId}',
        params => $params,
        returns => 'Address',
        };
}
# @return Address
#
sub get_organization_address {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_organization_address");
    }

    # verify the required parameter 'address_id' is set
    unless (exists $args{'address_id'}) {
      croak("Missing the required parameter 'address_id' when calling get_organization_address");
    }

    # parse inputs
    my $_resource_path = '/addresses/{addressId}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'address_id'}) {
        my $_base_variable = "{" . "addressId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'address_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Address', $response);
    return $_response_object;
}

#
# get_organization_addresses
#
# /addresses
# 
# @param string $access_token Samsara API access token. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_organization_addresses' } = { 
    	summary => '/addresses',
        params => $params,
        returns => 'ARRAY[Address]',
        };
}
# @return ARRAY[Address]
#
sub get_organization_addresses {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_organization_addresses");
    }

    # parse inputs
    my $_resource_path = '/addresses';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[Address]', $response);
    return $_response_object;
}

#
# get_organization_contact
#
# /contacts/{contact_id}
# 
# @param string $access_token Samsara API access token. (required)
# @param int $contact_id ID of the contact (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'contact_id' => {
        data_type => 'int',
        description => 'ID of the contact',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_organization_contact' } = { 
    	summary => '/contacts/{contact_id}',
        params => $params,
        returns => 'Contact',
        };
}
# @return Contact
#
sub get_organization_contact {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_organization_contact");
    }

    # verify the required parameter 'contact_id' is set
    unless (exists $args{'contact_id'}) {
      croak("Missing the required parameter 'contact_id' when calling get_organization_contact");
    }

    # parse inputs
    my $_resource_path = '/contacts/{contact_id}';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'contact_id'}) {
        my $_base_variable = "{" . "contact_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'contact_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Contact', $response);
    return $_response_object;
}

#
# get_vehicle_harsh_event
#
# /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
# 
# @param int $vehicle_id ID of the vehicle (required)
# @param string $access_token Samsara API access token. (required)
# @param int $timestamp Timestamp in milliseconds representing the timestamp of a harsh event. (required)
{
    my $params = {
    'vehicle_id' => {
        data_type => 'int',
        description => 'ID of the vehicle',
        required => '1',
    },
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'timestamp' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the timestamp of a harsh event.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_vehicle_harsh_event' } = { 
    	summary => '/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event',
        params => $params,
        returns => 'VehicleHarshEventResponse',
        };
}
# @return VehicleHarshEventResponse
#
sub get_vehicle_harsh_event {
    my ($self, %args) = @_;

    # verify the required parameter 'vehicle_id' is set
    unless (exists $args{'vehicle_id'}) {
      croak("Missing the required parameter 'vehicle_id' when calling get_vehicle_harsh_event");
    }

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_vehicle_harsh_event");
    }

    # verify the required parameter 'timestamp' is set
    unless (exists $args{'timestamp'}) {
      croak("Missing the required parameter 'timestamp' when calling get_vehicle_harsh_event");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/{vehicleId}/safety/harsh_event';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'timestamp'}) {
        $query_params->{'timestamp'} = $self->{api_client}->to_query_value($args{'timestamp'});
    }

    # path params
    if ( exists $args{'vehicle_id'}) {
        my $_base_variable = "{" . "vehicleId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'vehicle_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('VehicleHarshEventResponse', $response);
    return $_response_object;
}

#
# get_vehicle_locations
#
# /fleet/vehicles/{vehicle_id:[0-9]+}/locations
# 
# @param string $access_token Samsara API access token. (required)
# @param int $vehicle_id ID of the vehicle with the associated routes. (required)
# @param int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) (required)
# @param int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'vehicle_id' => {
        data_type => 'int',
        description => 'ID of the vehicle with the associated routes.',
        required => '1',
    },
    'start_ms' => {
        data_type => 'int',
        description => 'Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_vehicle_locations' } = { 
    	summary => '/fleet/vehicles/{vehicle_id:[0-9]+}/locations',
        params => $params,
        returns => 'FleetVehicleLocations',
        };
}
# @return FleetVehicleLocations
#
sub get_vehicle_locations {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_vehicle_locations");
    }

    # verify the required parameter 'vehicle_id' is set
    unless (exists $args{'vehicle_id'}) {
      croak("Missing the required parameter 'vehicle_id' when calling get_vehicle_locations");
    }

    # verify the required parameter 'start_ms' is set
    unless (exists $args{'start_ms'}) {
      croak("Missing the required parameter 'start_ms' when calling get_vehicle_locations");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_vehicle_locations");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/{vehicle_id}/locations';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_ms'}) {
        $query_params->{'startMs'} = $self->{api_client}->to_query_value($args{'start_ms'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # path params
    if ( exists $args{'vehicle_id'}) {
        my $_base_variable = "{" . "vehicle_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'vehicle_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('FleetVehicleLocations', $response);
    return $_response_object;
}

#
# get_vehicle_safety_score
#
# /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
# 
# @param int $vehicle_id ID of the vehicle (required)
# @param string $access_token Samsara API access token. (required)
# @param int $start_ms Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. (required)
# @param int $end_ms Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. (required)
{
    my $params = {
    'vehicle_id' => {
        data_type => 'int',
        description => 'ID of the vehicle',
        required => '1',
    },
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'start_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_vehicle_safety_score' } = { 
    	summary => '/fleet/vehicles/{vehicleId:[0-9]+}/safety/score',
        params => $params,
        returns => 'VehicleSafetyScoreResponse',
        };
}
# @return VehicleSafetyScoreResponse
#
sub get_vehicle_safety_score {
    my ($self, %args) = @_;

    # verify the required parameter 'vehicle_id' is set
    unless (exists $args{'vehicle_id'}) {
      croak("Missing the required parameter 'vehicle_id' when calling get_vehicle_safety_score");
    }

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_vehicle_safety_score");
    }

    # verify the required parameter 'start_ms' is set
    unless (exists $args{'start_ms'}) {
      croak("Missing the required parameter 'start_ms' when calling get_vehicle_safety_score");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_vehicle_safety_score");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/{vehicleId}/safety/score';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_ms'}) {
        $query_params->{'startMs'} = $self->{api_client}->to_query_value($args{'start_ms'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # path params
    if ( exists $args{'vehicle_id'}) {
        my $_base_variable = "{" . "vehicleId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'vehicle_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('VehicleSafetyScoreResponse', $response);
    return $_response_object;
}

#
# get_vehicle_stats
#
# /fleet/vehicles/stats
# 
# @param string $access_token Samsara API access token. (required)
# @param int $start_ms Time in Unix epoch milliseconds for the start of the query. (required)
# @param int $end_ms Time in Unix epoch milliseconds for the end of the query. (required)
# @param string $series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)
# @param string $tag_ids Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)
# @param string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
# @param string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
# @param int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'start_ms' => {
        data_type => 'int',
        description => 'Time in Unix epoch milliseconds for the start of the query.',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Time in Unix epoch milliseconds for the end of the query.',
        required => '1',
    },
    'series' => {
        data_type => 'string',
        description => 'Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2',
        required => '0',
    },
    'tag_ids' => {
        data_type => 'string',
        description => 'Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3',
        required => '0',
    },
    'starting_after' => {
        data_type => 'string',
        description => 'Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.',
        required => '0',
    },
    'ending_before' => {
        data_type => 'string',
        description => 'Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.',
        required => '0',
    },
    'limit' => {
        data_type => 'int',
        description => 'Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_vehicle_stats' } = { 
    	summary => '/fleet/vehicles/stats',
        params => $params,
        returns => 'InlineResponse2005',
        };
}
# @return InlineResponse2005
#
sub get_vehicle_stats {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_vehicle_stats");
    }

    # verify the required parameter 'start_ms' is set
    unless (exists $args{'start_ms'}) {
      croak("Missing the required parameter 'start_ms' when calling get_vehicle_stats");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_vehicle_stats");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/stats';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_ms'}) {
        $query_params->{'startMs'} = $self->{api_client}->to_query_value($args{'start_ms'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    # query params
    if ( exists $args{'series'}) {
        $query_params->{'series'} = $self->{api_client}->to_query_value($args{'series'});
    }

    # query params
    if ( exists $args{'tag_ids'}) {
        $query_params->{'tagIds'} = $self->{api_client}->to_query_value($args{'tag_ids'});
    }

    # query params
    if ( exists $args{'starting_after'}) {
        $query_params->{'startingAfter'} = $self->{api_client}->to_query_value($args{'starting_after'});
    }

    # query params
    if ( exists $args{'ending_before'}) {
        $query_params->{'endingBefore'} = $self->{api_client}->to_query_value($args{'ending_before'});
    }

    # query params
    if ( exists $args{'limit'}) {
        $query_params->{'limit'} = $self->{api_client}->to_query_value($args{'limit'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('InlineResponse2005', $response);
    return $_response_object;
}

#
# get_vehicles_locations
#
# /fleet/vehicles/locations
# 
# @param string $access_token Samsara API access token. (required)
# @param int $start_ms Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) (required)
# @param int $end_ms Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'start_ms' => {
        data_type => 'int',
        description => 'Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)',
        required => '1',
    },
    'end_ms' => {
        data_type => 'int',
        description => 'Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_vehicles_locations' } = { 
    	summary => '/fleet/vehicles/locations',
        params => $params,
        returns => 'FleetVehiclesLocations',
        };
}
# @return FleetVehiclesLocations
#
sub get_vehicles_locations {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_vehicles_locations");
    }

    # verify the required parameter 'start_ms' is set
    unless (exists $args{'start_ms'}) {
      croak("Missing the required parameter 'start_ms' when calling get_vehicles_locations");
    }

    # verify the required parameter 'end_ms' is set
    unless (exists $args{'end_ms'}) {
      croak("Missing the required parameter 'end_ms' when calling get_vehicles_locations");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/locations';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'start_ms'}) {
        $query_params->{'startMs'} = $self->{api_client}->to_query_value($args{'start_ms'});
    }

    # query params
    if ( exists $args{'end_ms'}) {
        $query_params->{'endMs'} = $self->{api_client}->to_query_value($args{'end_ms'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('FleetVehiclesLocations', $response);
    return $_response_object;
}

#
# list_contacts
#
# /contacts
# 
# @param string $access_token Samsara API access token. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'list_contacts' } = { 
    	summary => '/contacts',
        params => $params,
        returns => 'ARRAY[Contact]',
        };
}
# @return ARRAY[Contact]
#
sub list_contacts {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling list_contacts");
    }

    # parse inputs
    my $_resource_path = '/contacts';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[Contact]', $response);
    return $_response_object;
}

#
# list_fleet
#
# /fleet/list
# 
# @param string $access_token Samsara API access token. (required)
# @param GroupParam $group_param Group ID to query. (required)
# @param string $starting_after Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)
# @param string $ending_before Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)
# @param int $limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'group_param' => {
        data_type => 'GroupParam',
        description => 'Group ID to query.',
        required => '1',
    },
    'starting_after' => {
        data_type => 'string',
        description => 'Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter.',
        required => '0',
    },
    'ending_before' => {
        data_type => 'string',
        description => 'Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter.',
        required => '0',
    },
    'limit' => {
        data_type => 'int',
        description => 'Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'list_fleet' } = { 
    	summary => '/fleet/list',
        params => $params,
        returns => 'InlineResponse2002',
        };
}
# @return InlineResponse2002
#
sub list_fleet {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling list_fleet");
    }

    # verify the required parameter 'group_param' is set
    unless (exists $args{'group_param'}) {
      croak("Missing the required parameter 'group_param' when calling list_fleet");
    }

    # parse inputs
    my $_resource_path = '/fleet/list';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # query params
    if ( exists $args{'starting_after'}) {
        $query_params->{'startingAfter'} = $self->{api_client}->to_query_value($args{'starting_after'});
    }

    # query params
    if ( exists $args{'ending_before'}) {
        $query_params->{'endingBefore'} = $self->{api_client}->to_query_value($args{'ending_before'});
    }

    # query params
    if ( exists $args{'limit'}) {
        $query_params->{'limit'} = $self->{api_client}->to_query_value($args{'limit'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'group_param'}) {
        $_body_data = $args{'group_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('InlineResponse2002', $response);
    return $_response_object;
}

#
# patch_fleet_vehicle
#
# /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
# 
# @param string $access_token Samsara API access token. (required)
# @param string $vehicle_id_or_external_id ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. (required)
# @param Data $data  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'vehicle_id_or_external_id' => {
        data_type => 'string',
        description => 'ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.',
        required => '1',
    },
    'data' => {
        data_type => 'Data',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'patch_fleet_vehicle' } = { 
    	summary => '/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}',
        params => $params,
        returns => 'FleetVehicleResponse',
        };
}
# @return FleetVehicleResponse
#
sub patch_fleet_vehicle {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling patch_fleet_vehicle");
    }

    # verify the required parameter 'vehicle_id_or_external_id' is set
    unless (exists $args{'vehicle_id_or_external_id'}) {
      croak("Missing the required parameter 'vehicle_id_or_external_id' when calling patch_fleet_vehicle");
    }

    # verify the required parameter 'data' is set
    unless (exists $args{'data'}) {
      croak("Missing the required parameter 'data' when calling patch_fleet_vehicle");
    }

    # parse inputs
    my $_resource_path = '/fleet/vehicles/{vehicle_id_or_external_id}';

    my $_method = 'PATCH';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json', 'application/merge-patch+json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'vehicle_id_or_external_id'}) {
        my $_base_variable = "{" . "vehicle_id_or_external_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'vehicle_id_or_external_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'data'}) {
        $_body_data = $args{'data'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('FleetVehicleResponse', $response);
    return $_response_object;
}

#
# reactivate_driver_by_id
#
# /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
# 
# @param string $access_token Samsara API access token. (required)
# @param string $driver_id_or_external_id ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. (required)
# @param ReactivateDriverParam $reactivate_driver_param Driver reactivation body (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'driver_id_or_external_id' => {
        data_type => 'string',
        description => 'ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.',
        required => '1',
    },
    'reactivate_driver_param' => {
        data_type => 'ReactivateDriverParam',
        description => 'Driver reactivation body',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'reactivate_driver_by_id' } = { 
    	summary => '/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}',
        params => $params,
        returns => 'CurrentDriver',
        };
}
# @return CurrentDriver
#
sub reactivate_driver_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling reactivate_driver_by_id");
    }

    # verify the required parameter 'driver_id_or_external_id' is set
    unless (exists $args{'driver_id_or_external_id'}) {
      croak("Missing the required parameter 'driver_id_or_external_id' when calling reactivate_driver_by_id");
    }

    # verify the required parameter 'reactivate_driver_param' is set
    unless (exists $args{'reactivate_driver_param'}) {
      croak("Missing the required parameter 'reactivate_driver_param' when calling reactivate_driver_by_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/drivers/inactive/{driver_id_or_external_id}';

    my $_method = 'PUT';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'driver_id_or_external_id'}) {
        my $_base_variable = "{" . "driver_id_or_external_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'driver_id_or_external_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'reactivate_driver_param'}) {
        $_body_data = $args{'reactivate_driver_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('CurrentDriver', $response);
    return $_response_object;
}

#
# update_dispatch_route_by_id
#
# /fleet/dispatch/routes/{route_id:[0-9]+}/
# 
# @param string $access_token Samsara API access token. (required)
# @param int $route_id ID of the dispatch route. (required)
# @param DispatchRoute $update_dispatch_route_params  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'route_id' => {
        data_type => 'int',
        description => 'ID of the dispatch route.',
        required => '1',
    },
    'update_dispatch_route_params' => {
        data_type => 'DispatchRoute',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_dispatch_route_by_id' } = { 
    	summary => '/fleet/dispatch/routes/{route_id:[0-9]+}/',
        params => $params,
        returns => 'DispatchRoute',
        };
}
# @return DispatchRoute
#
sub update_dispatch_route_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling update_dispatch_route_by_id");
    }

    # verify the required parameter 'route_id' is set
    unless (exists $args{'route_id'}) {
      croak("Missing the required parameter 'route_id' when calling update_dispatch_route_by_id");
    }

    # verify the required parameter 'update_dispatch_route_params' is set
    unless (exists $args{'update_dispatch_route_params'}) {
      croak("Missing the required parameter 'update_dispatch_route_params' when calling update_dispatch_route_by_id");
    }

    # parse inputs
    my $_resource_path = '/fleet/dispatch/routes/{route_id}';

    my $_method = 'PUT';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'route_id'}) {
        my $_base_variable = "{" . "route_id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'route_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'update_dispatch_route_params'}) {
        $_body_data = $args{'update_dispatch_route_params'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('DispatchRoute', $response);
    return $_response_object;
}

#
# update_organization_address
#
# /addresses/{addressId}
# 
# @param string $access_token Samsara API access token. (required)
# @param Address $address Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly. (required)
# @param int $address_id ID of the address/geofence (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'address' => {
        data_type => 'Address',
        description => 'Update parts of an address&#39;s value. If the geofence &#39;circle&#39; or &#39;polygon&#39; key is specified, the update will change the type of geofence accordingly.',
        required => '1',
    },
    'address_id' => {
        data_type => 'int',
        description => 'ID of the address/geofence',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_organization_address' } = { 
    	summary => '/addresses/{addressId}',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub update_organization_address {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling update_organization_address");
    }

    # verify the required parameter 'address' is set
    unless (exists $args{'address'}) {
      croak("Missing the required parameter 'address' when calling update_organization_address");
    }

    # verify the required parameter 'address_id' is set
    unless (exists $args{'address_id'}) {
      croak("Missing the required parameter 'address_id' when calling update_organization_address");
    }

    # parse inputs
    my $_resource_path = '/addresses/{addressId}';

    my $_method = 'PATCH';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    # path params
    if ( exists $args{'address_id'}) {
        my $_base_variable = "{" . "addressId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'address_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'address'}) {
        $_body_data = $args{'address'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# update_vehicles
#
# /fleet/set_data
# 
# @param string $access_token Samsara API access token. (required)
# @param VehicleUpdateParam $vehicle_update_param  (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'vehicle_update_param' => {
        data_type => 'VehicleUpdateParam',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_vehicles' } = { 
    	summary => '/fleet/set_data',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub update_vehicles {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling update_vehicles");
    }

    # verify the required parameter 'vehicle_update_param' is set
    unless (exists $args{'vehicle_update_param'}) {
      croak("Missing the required parameter 'vehicle_update_param' when calling update_vehicles");
    }

    # parse inputs
    my $_resource_path = '/fleet/set_data';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # query params
    if ( exists $args{'access_token'}) {
        $query_params->{'access_token'} = $self->{api_client}->to_query_value($args{'access_token'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'vehicle_update_param'}) {
        $_body_data = $args{'vehicle_update_param'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

1;
