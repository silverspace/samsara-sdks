=begin comment

Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::AssetsApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

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
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
        returns => 'ARRAY[object]',
        };
}
# @return ARRAY[object]
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
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
    my $_response_object = $self->{api_client}->deserialize('ARRAY[object]', $response);
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
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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

1;
