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
package WWW::SwaggerClient::Object::DriverForCreate;

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

use WWW::SwaggerClient::Object::DriverBase;
use WWW::SwaggerClient::Object::TagIds;

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
                                  class => 'DriverForCreate',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'eld_adverse_weather_exemption_enabled' => {
    	datatype => 'boolean',
    	base_name => 'eldAdverseWeatherExemptionEnabled',
    	description => 'Flag indicating this driver may use Adverse Weather exemptions in ELD logs.',
    	format => '',
    	read_only => '',
    		},
    'eld_big_day_exemption_enabled' => {
    	datatype => 'boolean',
    	base_name => 'eldBigDayExemptionEnabled',
    	description => 'Flag indicating this driver may use Big Day excemptions in ELD logs.',
    	format => '',
    	read_only => '',
    		},
    'eld_day_start_hour' => {
    	datatype => 'int',
    	base_name => 'eldDayStartHour',
    	description => '0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.',
    	format => '',
    	read_only => '',
    		},
    'eld_exempt' => {
    	datatype => 'boolean',
    	base_name => 'eldExempt',
    	description => 'Flag indicating this driver is exempt from the Electronic Logging Mandate.',
    	format => '',
    	read_only => '',
    		},
    'eld_exempt_reason' => {
    	datatype => 'string',
    	base_name => 'eldExemptReason',
    	description => 'Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).',
    	format => '',
    	read_only => '',
    		},
    'eld_pc_enabled' => {
    	datatype => 'boolean',
    	base_name => 'eldPcEnabled',
    	description => 'Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.',
    	format => '',
    	read_only => '',
    		},
    'eld_ym_enabled' => {
    	datatype => 'boolean',
    	base_name => 'eldYmEnabled',
    	description => 'Flag indicating this driver may select the Yard Move duty status in ELD logs.',
    	format => '',
    	read_only => '',
    		},
    'external_ids' => {
    	datatype => 'HASH[string,string]',
    	base_name => 'externalIds',
    	description => 'Dictionary of external IDs (string key-value pairs)',
    	format => '',
    	read_only => '',
    		},
    'group_id' => {
    	datatype => 'int',
    	base_name => 'groupId',
    	description => 'ID of the group if the organization has multiple groups (uncommon).',
    	format => '',
    	read_only => '',
    		},
    'license_number' => {
    	datatype => 'string',
    	base_name => 'licenseNumber',
    	description => 'Driver&#39;s state issued license number.',
    	format => '',
    	read_only => '',
    		},
    'license_state' => {
    	datatype => 'string',
    	base_name => 'licenseState',
    	description => 'Abbreviation of state that issued driver&#39;s license.',
    	format => '',
    	read_only => '',
    		},
    'name' => {
    	datatype => 'string',
    	base_name => 'name',
    	description => 'Driver&#39;s name.',
    	format => '',
    	read_only => '',
    		},
    'notes' => {
    	datatype => 'string',
    	base_name => 'notes',
    	description => 'Notes about the driver.',
    	format => '',
    	read_only => '',
    		},
    'phone' => {
    	datatype => 'string',
    	base_name => 'phone',
    	description => 'Driver&#39;s phone number. Please include only digits, ex. 4157771234',
    	format => '',
    	read_only => '',
    		},
    'username' => {
    	datatype => 'string',
    	base_name => 'username',
    	description => 'Driver&#39;s login username into the driver app.',
    	format => '',
    	read_only => '',
    		},
    'vehicle_id' => {
    	datatype => 'int',
    	base_name => 'vehicleId',
    	description => 'ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).',
    	format => '',
    	read_only => '',
    		},
    'password' => {
    	datatype => 'string',
    	base_name => 'password',
    	description => 'Driver&#39;s password for the driver app.',
    	format => '',
    	read_only => '',
    		},
    'tag_ids' => {
    	datatype => 'TagIds',
    	base_name => 'tagIds',
    	description => '',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'eld_adverse_weather_exemption_enabled' => 'boolean',
    'eld_big_day_exemption_enabled' => 'boolean',
    'eld_day_start_hour' => 'int',
    'eld_exempt' => 'boolean',
    'eld_exempt_reason' => 'string',
    'eld_pc_enabled' => 'boolean',
    'eld_ym_enabled' => 'boolean',
    'external_ids' => 'HASH[string,string]',
    'group_id' => 'int',
    'license_number' => 'string',
    'license_state' => 'string',
    'name' => 'string',
    'notes' => 'string',
    'phone' => 'string',
    'username' => 'string',
    'vehicle_id' => 'int',
    'password' => 'string',
    'tag_ids' => 'TagIds'
} );

__PACKAGE__->attribute_map( {
    'eld_adverse_weather_exemption_enabled' => 'eldAdverseWeatherExemptionEnabled',
    'eld_big_day_exemption_enabled' => 'eldBigDayExemptionEnabled',
    'eld_day_start_hour' => 'eldDayStartHour',
    'eld_exempt' => 'eldExempt',
    'eld_exempt_reason' => 'eldExemptReason',
    'eld_pc_enabled' => 'eldPcEnabled',
    'eld_ym_enabled' => 'eldYmEnabled',
    'external_ids' => 'externalIds',
    'group_id' => 'groupId',
    'license_number' => 'licenseNumber',
    'license_state' => 'licenseState',
    'name' => 'name',
    'notes' => 'notes',
    'phone' => 'phone',
    'username' => 'username',
    'vehicle_id' => 'vehicleId',
    'password' => 'password',
    'tag_ids' => 'tagIds'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
