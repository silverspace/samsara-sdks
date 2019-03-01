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
package WWW::SwaggerClient::Object::DvirBase;

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

use WWW::SwaggerClient::Object::DvirBaseAuthorSignature;
use WWW::SwaggerClient::Object::DvirBaseMechanicOrAgentSignature;
use WWW::SwaggerClient::Object::DvirBaseNextDriverSignature;
use WWW::SwaggerClient::Object::DvirBaseTrailerDefects;
use WWW::SwaggerClient::Object::DvirBaseVehicle;

use base ("Class::Accessor", "Class::Data::Inheritable");


#
#
#
# NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
# REF: https://github.com/swagger-api/swagger-codegen
#

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
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('swagger_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new object
sub new { 
    my ($class, %args) = @_; 

	my $self = bless {}, $class;
	
	foreach my $attribute (keys %{$class->attribute_map}) {
		my $args_key = $class->attribute_map->{$attribute};
		$self->$attribute( $args{ $args_key } );
	}
	
	return $self;
}  

# return perl hash
sub to_hash {
    return decode_json(JSON->new->convert_blessed->encode( shift ));
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

    # loop through attributes and use swagger_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->swagger_types} ) {
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
        my $_instance = eval "WWW::SwaggerClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'DvirBase',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'author_signature' => {
    	datatype => 'DvirBaseAuthorSignature',
    	base_name => 'authorSignature',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'defects_corrected' => {
    	datatype => 'boolean',
    	base_name => 'defectsCorrected',
    	description => 'Signifies if the defects on the vehicle corrected after the DVIR is done.',
    	format => '',
    	read_only => '',
    		},
    'defects_need_not_be_corrected' => {
    	datatype => 'boolean',
    	base_name => 'defectsNeedNotBeCorrected',
    	description => 'Signifies if the defects on this vehicle can be ignored.',
    	format => '',
    	read_only => '',
    		},
    'id' => {
    	datatype => 'int',
    	base_name => 'id',
    	description => 'The id of this DVIR record.',
    	format => '',
    	read_only => '',
    		},
    'inspection_type' => {
    	datatype => 'string',
    	base_name => 'inspectionType',
    	description => 'Inspection type of the DVIR.',
    	format => '',
    	read_only => '',
    		},
    'mechanic_notes' => {
    	datatype => 'string',
    	base_name => 'mechanicNotes',
    	description => 'The mechanics notes on the DVIR.',
    	format => '',
    	read_only => '',
    		},
    'mechanic_or_agent_signature' => {
    	datatype => 'DvirBaseMechanicOrAgentSignature',
    	base_name => 'mechanicOrAgentSignature',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'next_driver_signature' => {
    	datatype => 'DvirBaseNextDriverSignature',
    	base_name => 'nextDriverSignature',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'odometer_miles' => {
    	datatype => 'int',
    	base_name => 'odometerMiles',
    	description => 'The odometer reading in miles for the vehicle when the DVIR was done.',
    	format => '',
    	read_only => '',
    		},
    'time_ms' => {
    	datatype => 'int',
    	base_name => 'timeMs',
    	description => 'Timestamp of this DVIR in UNIX milliseconds.',
    	format => '',
    	read_only => '',
    		},
    'trailer_defects' => {
    	datatype => 'ARRAY[DvirBaseTrailerDefects]',
    	base_name => 'trailerDefects',
    	description => 'Defects registered for the trailer which was part of the DVIR.',
    	format => '',
    	read_only => '',
    		},
    'trailer_id' => {
    	datatype => 'int',
    	base_name => 'trailerId',
    	description => 'The id of the trailer which was part of the DVIR.',
    	format => '',
    	read_only => '',
    		},
    'trailer_name' => {
    	datatype => 'string',
    	base_name => 'trailerName',
    	description => 'The name of the trailer which was part of the DVIR.',
    	format => '',
    	read_only => '',
    		},
    'vehicle' => {
    	datatype => 'DvirBaseVehicle',
    	base_name => 'vehicle',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'vehicle_condition' => {
    	datatype => 'string',
    	base_name => 'vehicleCondition',
    	description => 'The condition of vechile on which DVIR was done.',
    	format => '',
    	read_only => '',
    		},
    'vehicle_defects' => {
    	datatype => 'ARRAY[DvirBaseTrailerDefects]',
    	base_name => 'vehicleDefects',
    	description => 'Defects registered for the vehicle which was part of the DVIR.',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'author_signature' => 'DvirBaseAuthorSignature',
    'defects_corrected' => 'boolean',
    'defects_need_not_be_corrected' => 'boolean',
    'id' => 'int',
    'inspection_type' => 'string',
    'mechanic_notes' => 'string',
    'mechanic_or_agent_signature' => 'DvirBaseMechanicOrAgentSignature',
    'next_driver_signature' => 'DvirBaseNextDriverSignature',
    'odometer_miles' => 'int',
    'time_ms' => 'int',
    'trailer_defects' => 'ARRAY[DvirBaseTrailerDefects]',
    'trailer_id' => 'int',
    'trailer_name' => 'string',
    'vehicle' => 'DvirBaseVehicle',
    'vehicle_condition' => 'string',
    'vehicle_defects' => 'ARRAY[DvirBaseTrailerDefects]'
} );

__PACKAGE__->attribute_map( {
    'author_signature' => 'authorSignature',
    'defects_corrected' => 'defectsCorrected',
    'defects_need_not_be_corrected' => 'defectsNeedNotBeCorrected',
    'id' => 'id',
    'inspection_type' => 'inspectionType',
    'mechanic_notes' => 'mechanicNotes',
    'mechanic_or_agent_signature' => 'mechanicOrAgentSignature',
    'next_driver_signature' => 'nextDriverSignature',
    'odometer_miles' => 'odometerMiles',
    'time_ms' => 'timeMs',
    'trailer_defects' => 'trailerDefects',
    'trailer_id' => 'trailerId',
    'trailer_name' => 'trailerName',
    'vehicle' => 'vehicle',
    'vehicle_condition' => 'vehicleCondition',
    'vehicle_defects' => 'vehicleDefects'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
