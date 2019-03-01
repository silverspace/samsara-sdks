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
package WWW::SwaggerClient::SensorsApi;

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
# get_sensors
#
# /sensors/list
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
    __PACKAGE__->method_documentation->{ 'get_sensors' } = { 
    	summary => '/sensors/list',
        params => $params,
        returns => 'InlineResponse2008',
        };
}
# @return InlineResponse2008
#
sub get_sensors {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_sensors");
    }

    # verify the required parameter 'group_param' is set
    unless (exists $args{'group_param'}) {
      croak("Missing the required parameter 'group_param' when calling get_sensors");
    }

    # parse inputs
    my $_resource_path = '/sensors/list';

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
    my $_response_object = $self->{api_client}->deserialize('InlineResponse2008', $response);
    return $_response_object;
}

#
# get_sensors_cargo
#
# /sensors/cargo
# 
# @param string $access_token Samsara API access token. (required)
# @param SensorParam $sensor_param Group ID and list of sensor IDs to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'sensor_param' => {
        data_type => 'SensorParam',
        description => 'Group ID and list of sensor IDs to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_sensors_cargo' } = { 
    	summary => '/sensors/cargo',
        params => $params,
        returns => 'CargoResponse',
        };
}
# @return CargoResponse
#
sub get_sensors_cargo {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_sensors_cargo");
    }

    # verify the required parameter 'sensor_param' is set
    unless (exists $args{'sensor_param'}) {
      croak("Missing the required parameter 'sensor_param' when calling get_sensors_cargo");
    }

    # parse inputs
    my $_resource_path = '/sensors/cargo';

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
    if ( exists $args{'sensor_param'}) {
        $_body_data = $args{'sensor_param'};
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
    my $_response_object = $self->{api_client}->deserialize('CargoResponse', $response);
    return $_response_object;
}

#
# get_sensors_door
#
# /sensors/door
# 
# @param string $access_token Samsara API access token. (required)
# @param SensorParam $sensor_param Group ID and list of sensor IDs to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'sensor_param' => {
        data_type => 'SensorParam',
        description => 'Group ID and list of sensor IDs to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_sensors_door' } = { 
    	summary => '/sensors/door',
        params => $params,
        returns => 'DoorResponse',
        };
}
# @return DoorResponse
#
sub get_sensors_door {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_sensors_door");
    }

    # verify the required parameter 'sensor_param' is set
    unless (exists $args{'sensor_param'}) {
      croak("Missing the required parameter 'sensor_param' when calling get_sensors_door");
    }

    # parse inputs
    my $_resource_path = '/sensors/door';

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
    if ( exists $args{'sensor_param'}) {
        $_body_data = $args{'sensor_param'};
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
    my $_response_object = $self->{api_client}->deserialize('DoorResponse', $response);
    return $_response_object;
}

#
# get_sensors_history
#
# /sensors/history
# 
# @param string $access_token Samsara API access token. (required)
# @param HistoryParam1 $history_param Group ID, time range and resolution, and list of sensor ID, field pairs to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'history_param' => {
        data_type => 'HistoryParam1',
        description => 'Group ID, time range and resolution, and list of sensor ID, field pairs to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_sensors_history' } = { 
    	summary => '/sensors/history',
        params => $params,
        returns => 'SensorHistoryResponse',
        };
}
# @return SensorHistoryResponse
#
sub get_sensors_history {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_sensors_history");
    }

    # verify the required parameter 'history_param' is set
    unless (exists $args{'history_param'}) {
      croak("Missing the required parameter 'history_param' when calling get_sensors_history");
    }

    # parse inputs
    my $_resource_path = '/sensors/history';

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
    if ( exists $args{'history_param'}) {
        $_body_data = $args{'history_param'};
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
    my $_response_object = $self->{api_client}->deserialize('SensorHistoryResponse', $response);
    return $_response_object;
}

#
# get_sensors_humidity
#
# /sensors/humidity
# 
# @param string $access_token Samsara API access token. (required)
# @param SensorParam $sensor_param Group ID and list of sensor IDs to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'sensor_param' => {
        data_type => 'SensorParam',
        description => 'Group ID and list of sensor IDs to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_sensors_humidity' } = { 
    	summary => '/sensors/humidity',
        params => $params,
        returns => 'HumidityResponse',
        };
}
# @return HumidityResponse
#
sub get_sensors_humidity {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_sensors_humidity");
    }

    # verify the required parameter 'sensor_param' is set
    unless (exists $args{'sensor_param'}) {
      croak("Missing the required parameter 'sensor_param' when calling get_sensors_humidity");
    }

    # parse inputs
    my $_resource_path = '/sensors/humidity';

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
    if ( exists $args{'sensor_param'}) {
        $_body_data = $args{'sensor_param'};
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
    my $_response_object = $self->{api_client}->deserialize('HumidityResponse', $response);
    return $_response_object;
}

#
# get_sensors_temperature
#
# /sensors/temperature
# 
# @param string $access_token Samsara API access token. (required)
# @param SensorParam $sensor_param Group ID and list of sensor IDs to query. (required)
{
    my $params = {
    'access_token' => {
        data_type => 'string',
        description => 'Samsara API access token.',
        required => '1',
    },
    'sensor_param' => {
        data_type => 'SensorParam',
        description => 'Group ID and list of sensor IDs to query.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_sensors_temperature' } = { 
    	summary => '/sensors/temperature',
        params => $params,
        returns => 'TemperatureResponse',
        };
}
# @return TemperatureResponse
#
sub get_sensors_temperature {
    my ($self, %args) = @_;

    # verify the required parameter 'access_token' is set
    unless (exists $args{'access_token'}) {
      croak("Missing the required parameter 'access_token' when calling get_sensors_temperature");
    }

    # verify the required parameter 'sensor_param' is set
    unless (exists $args{'sensor_param'}) {
      croak("Missing the required parameter 'sensor_param' when calling get_sensors_temperature");
    }

    # parse inputs
    my $_resource_path = '/sensors/temperature';

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
    if ( exists $args{'sensor_param'}) {
        $_body_data = $args{'sensor_param'};
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
    my $_response_object = $self->{api_client}->deserialize('TemperatureResponse', $response);
    return $_response_object;
}

1;
