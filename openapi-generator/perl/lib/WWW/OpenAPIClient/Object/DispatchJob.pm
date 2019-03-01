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
package WWW::OpenAPIClient::Object::DispatchJob;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::DispatchJobCreate;
use WWW::OpenAPIClient::Object::JobStatus;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

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
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new { 
    my ($class, %args) = @_; 

    my $self = bless {}, $class;

    $self->init(%args);
    
    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[/i) { # array
            my $_subclass = substr($_type, 6, -1);
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);
        
    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'DispatchJob',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'destination_address' => {
        datatype => 'string',
        base_name => 'destination_address',
        description => 'The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.',
        format => '',
        read_only => '',
            },
    'destination_address_id' => {
        datatype => 'int',
        base_name => 'destination_address_id',
        description => 'ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.',
        format => '',
        read_only => '',
            },
    'destination_lat' => {
        datatype => 'double',
        base_name => 'destination_lat',
        description => 'Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.',
        format => '',
        read_only => '',
            },
    'destination_lng' => {
        datatype => 'double',
        base_name => 'destination_lng',
        description => 'Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.',
        format => '',
        read_only => '',
            },
    'destination_name' => {
        datatype => 'string',
        base_name => 'destination_name',
        description => 'The name of the job destination. If provided, it will take precedence over the name of the address book entry.',
        format => '',
        read_only => '',
            },
    'notes' => {
        datatype => 'string',
        base_name => 'notes',
        description => 'Notes regarding the details of this job.',
        format => '',
        read_only => '',
            },
    'scheduled_arrival_time_ms' => {
        datatype => 'int',
        base_name => 'scheduled_arrival_time_ms',
        description => 'The time at which the assigned driver is scheduled to arrive at the job destination.',
        format => '',
        read_only => '',
            },
    'scheduled_departure_time_ms' => {
        datatype => 'int',
        base_name => 'scheduled_departure_time_ms',
        description => 'The time at which the assigned driver is scheduled to depart from the job destination.',
        format => '',
        read_only => '',
            },
    'arrived_at_ms' => {
        datatype => 'int',
        base_name => 'arrived_at_ms',
        description => 'The time at which the driver arrived at the job destination.',
        format => '',
        read_only => '',
            },
    'completed_at_ms' => {
        datatype => 'int',
        base_name => 'completed_at_ms',
        description => 'The time at which the job was marked complete (e.g. started driving to the next destination).',
        format => '',
        read_only => '',
            },
    'dispatch_route_id' => {
        datatype => 'int',
        base_name => 'dispatch_route_id',
        description => 'ID of the route that this job belongs to.',
        format => '',
        read_only => '',
            },
    'driver_id' => {
        datatype => 'int',
        base_name => 'driver_id',
        description => 'ID of the driver assigned to the dispatch job.',
        format => '',
        read_only => '',
            },
    'en_route_at_ms' => {
        datatype => 'int',
        base_name => 'en_route_at_ms',
        description => 'The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).',
        format => '',
        read_only => '',
            },
    'estimated_arrival_ms' => {
        datatype => 'int',
        base_name => 'estimated_arrival_ms',
        description => 'The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.',
        format => '',
        read_only => '',
            },
    'fleet_viewer_url' => {
        datatype => 'string',
        base_name => 'fleet_viewer_url',
        description => 'Fleet viewer url of the dispatch job.',
        format => '',
        read_only => '',
            },
    'group_id' => {
        datatype => 'int',
        base_name => 'group_id',
        description => '',
        format => '',
        read_only => '',
            },
    'id' => {
        datatype => 'int',
        base_name => 'id',
        description => 'ID of the Samsara dispatch job.',
        format => '',
        read_only => '',
            },
    'job_state' => {
        datatype => 'JobStatus',
        base_name => 'job_state',
        description => '',
        format => '',
        read_only => '',
            },
    'skipped_at_ms' => {
        datatype => 'int',
        base_name => 'skipped_at_ms',
        description => 'The time at which the job was marked skipped.',
        format => '',
        read_only => '',
            },
    'vehicle_id' => {
        datatype => 'int',
        base_name => 'vehicle_id',
        description => 'ID of the vehicle used for the dispatch job.',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'destination_address' => 'string',
    'destination_address_id' => 'int',
    'destination_lat' => 'double',
    'destination_lng' => 'double',
    'destination_name' => 'string',
    'notes' => 'string',
    'scheduled_arrival_time_ms' => 'int',
    'scheduled_departure_time_ms' => 'int',
    'arrived_at_ms' => 'int',
    'completed_at_ms' => 'int',
    'dispatch_route_id' => 'int',
    'driver_id' => 'int',
    'en_route_at_ms' => 'int',
    'estimated_arrival_ms' => 'int',
    'fleet_viewer_url' => 'string',
    'group_id' => 'int',
    'id' => 'int',
    'job_state' => 'JobStatus',
    'skipped_at_ms' => 'int',
    'vehicle_id' => 'int'
} );

__PACKAGE__->attribute_map( {
    'destination_address' => 'destination_address',
    'destination_address_id' => 'destination_address_id',
    'destination_lat' => 'destination_lat',
    'destination_lng' => 'destination_lng',
    'destination_name' => 'destination_name',
    'notes' => 'notes',
    'scheduled_arrival_time_ms' => 'scheduled_arrival_time_ms',
    'scheduled_departure_time_ms' => 'scheduled_departure_time_ms',
    'arrived_at_ms' => 'arrived_at_ms',
    'completed_at_ms' => 'completed_at_ms',
    'dispatch_route_id' => 'dispatch_route_id',
    'driver_id' => 'driver_id',
    'en_route_at_ms' => 'en_route_at_ms',
    'estimated_arrival_ms' => 'estimated_arrival_ms',
    'fleet_viewer_url' => 'fleet_viewer_url',
    'group_id' => 'group_id',
    'id' => 'id',
    'job_state' => 'job_state',
    'skipped_at_ms' => 'skipped_at_ms',
    'vehicle_id' => 'vehicle_id'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
