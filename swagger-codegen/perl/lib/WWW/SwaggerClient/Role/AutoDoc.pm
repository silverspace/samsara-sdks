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
package WWW::SwaggerClient::Role::AutoDoc;
use List::MoreUtils qw(uniq);

use Moose::Role;

sub autodoc {
	my ($self, $how) = @_;
	
	die "Unknown format '$how'" unless $how =~ /^(pod|wide|narrow)$/;
	
	$self->_printisa($how);
	$self->_printmethods($how);
	$self->_printattrs($how);
	print "\n";
}

sub _printisa {
	my ($self, $how) = @_;	
	my $meta = $self->meta;
	
	my $myclass = ref $self;
	
	my $super = join ', ', $meta->superclasses;
	my @roles = $meta->calculate_all_roles;
	#shift(@roles) if @roles > 1; # if > 1, the first is a composite, the rest are the roles

	my $isa =   join ', ', grep {$_ ne $myclass} $meta->linearized_isa;
	my $sub =   join ', ', $meta->subclasses;
	my $dsub =  join ', ', $meta->direct_subclasses;
	
    my $app_name = $self->version_info->{app_name};
    my $app_version = $self->version_info->{app_version};
    my $generated_date = $self->version_info->{generated_date};
    my $generator_class = $self->version_info->{generator_class};

    $~ = $how eq 'pod' ? 'INHERIT_POD' : 'INHERIT';
    write;
	
	my ($rolepkg, $role_reqs);
	
	foreach my $role (@roles) {
		$rolepkg = $role->{package} || next; # some are anonymous, or something
		next if $rolepkg eq 'WWW::SwaggerClient::Role::AutoDoc';
		$role_reqs = join ', ', keys %{$role->{required_methods}};
		$role_reqs ||= '';
		$~ = $how eq 'pod' ? 'ROLES_POD' : 'ROLES';
		write;
	}
	
	if ($how eq 'pod') {
		$~ = 'ROLES_POD_CLOSE';
		write;
	}
	
# ----- format specs -----
	format INHERIT = 

@* -
$myclass
                  ISA: @*
                       $isa
    Direct subclasses: @*
                       $dsub
       All subclasses: @*
                       $sub
                       
           Target API: @* @*
                       $app_name, $app_version
         Generated on: @*
                       $generated_date
      Generator class: @* 
                       $generator_class
                       
.
	format ROLES =   
             Composes: ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ~
                       $rolepkg
                       requires: ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ~
                                 $role_reqs
                                 ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ~~
                                 $role_reqs
.

	format INHERIT_POD =
=head1 NAME

@*
$myclass

=head1 VERSION

=head2 @* version: @*
       $app_name,  $app_version
       
Automatically generated by the Perl Swagger Codegen project: 

=over 4 

=item Build date: @*
                  $generated_date

=item Build package: @*
                     $generator_class

=item Codegen version: 


=back

=head1 INHERITANCE

=head2 Base class(es) 

@*
$isa

=head2 Direct subclasses

@*
$dsub
                   
=head2 All subclasses

@*
$sub

                
=head1 COMPOSITION

@* composes the following roles: 
$myclass 


.
	format ROLES_POD =
=head2 C<@*>
       $rolepkg
       
Requires:

@*
$role_reqs

.
	format ROLES_POD_CLOSE =


.
# ----- / format specs -----
}

sub _printmethods {
	my ($self, $how) = @_;
	
	if ($how eq 'narrow') {
		print <<HEAD;
METHODS
-------
HEAD
	}
	elsif ($how eq 'wide') {
		$~ = 'METHODHEAD';
		write;
	}
	elsif ($how eq 'pod') {
		$~ = 'METHODHEAD_POD';
		write;
	}
	else {
		die "Don't know how to print '$how'";
	}
	
	$self->_printmethod($_, $how) for uniq sort $self->meta->get_all_method_names; #$self->meta->get_method_list, 
	
	if ($how eq 'pod') {
		$~ = 'METHOD_POD_CLOSE';
		write;
	}


}

sub _printmethod {
	my ($self, $methodname, $how) = @_;
	return if $methodname =~ /^_/;
	return if $self->meta->has_attribute($methodname);
	my %internal = map {$_ => 1} qw(BUILD BUILDARGS meta can new DEMOLISHALL DESTROY 
		DOES isa BUILDALL does VERSION dump
		);
	return if $internal{$methodname};
	my $method = $self->meta->get_method($methodname) or return; # symbols imported into namespaces i.e. not known by Moose
	
	return if $method->original_package_name eq __PACKAGE__;
	
	my $delegate_to = '';
	my $via = '';
	my $on = '';
	my $doc = '';
	my $original_pkg = $method->original_package_name;
	if ($method->can('associated_attribute')) {
		$delegate_to = $method->delegate_to_method;
		my $aa = $method->associated_attribute;
		$on = $aa->{isa};
		$via = $aa->{name};
		$original_pkg = $on; 
		$doc = $original_pkg->method_documentation->{$delegate_to}->{summary};
	}
	else {
	    $doc = $method->documentation;
	}
	
	if ($how eq 'narrow') {
		$~ = 'METHOD_NARROW';
		write;
	}
	elsif ($how eq 'pod' and $delegate_to) {
		$~ = 'METHOD_POD_DELEGATED';
		write;
	}
	elsif ($how eq 'pod') {
		$~ = 'METHOD_POD';
		write;
	}
	else {
		$~ = 'METHOD';
		write;
	}
	
# ----- format specs -----
	format METHODHEAD =

METHODS
-------
Name                                                  delegates to                                             on                                      via
===========================================================================================================================================================================
.
	format METHOD = 
@<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< @<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<... @<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<... @<<<<<<<<<<<<<<<<...
$methodname,                                          $delegate_to,                                            $on,                                    $via
.

	format METHOD_NARROW =
@*
$methodname
    original pkg: @*
                  $original_pkg
    delegates to: @*
                  $delegate_to
              on: @*
                  $on
             via: @*
                  $via

.

	format METHODHEAD_POD = 

=head1 METHODS

.
	
	format METHOD_POD = 
	
=head2 C<@*()>
       $methodname

       Defined in: @*
            $original_pkg


.
	format METHOD_POD_DELEGATED = 

=head2 C<@*()>
       $methodname

       Defined in: @*
       	           $original_pkg
     Delegates to: @*()
                   $delegate_to
               On: @* 
                   $on
              Via: @*()
                   $via
              Doc: @*
                   $doc
          Same as: $self->@*->@*()
                     $via, $delegate_to

.
	format METHOD_POD_CLOSE =
	
.
# ----- / format specs -----
}

sub _printattrs {
	my ($self, $how) = @_;
	
	if ($how eq 'narrow') {
		print <<HEAD;
ATTRIBUTES
----------
HEAD
	}
	elsif ($how eq 'wide') {
		$~ = 'ATTRHEAD';
		write;
	}
	elsif ($how eq 'pod') {
		$~ = 'ATTRHEAD_POD';
		write;
	}
	else {
		die "Don't know how to print attributes '$how'";
	}
	
	$self->_printattr($_, $how) for sort $self->meta->get_attribute_list;
	
	if ($how eq 'pod') {
		$~ = 'ATTR_POD_CLOSE';
		write;
	}
}

sub _printattr {
	my ($self, $attrname, $how) = @_;
	return if $attrname =~ /^_/;
	my $attr = $self->meta->get_attribute($attrname) or die "No attr for $attrname";
	
	my $is;
	$is = 'rw' if $attr->get_read_method && $attr->get_write_method;
	$is = 'ro' if $attr->get_read_method && ! $attr->get_write_method;
	$is = 'wo' if $attr->get_write_method && ! $attr->get_read_method;
	$is = '--' if ! $attr->get_write_method && ! $attr->get_read_method;
	$is or die "No \$is for $attrname";
	
	my $tc = $attr->type_constraint || '';
	my $from = $attr->associated_class->name || '';
	my $reqd = $attr->is_required ? 'yes' : 'no';
	my $lazy = $attr->is_lazy ? 'yes' : 'no';
	my $has_doc = $attr->has_documentation ? 'yes' : 'no'; # *_api attributes will never have doc, but other attributes might have
	my $doc = $attr->documentation || '';
	my $handles = join ', ', sort @{$attr->handles || []};
	$handles ||= '';
	
	if ($how eq 'narrow') {
		$~ = 'ATTR_NARROW';
	}
	elsif ($how eq 'pod') {
		$~ = 'ATTR_POD';
	}
	else {
		$~ = 'ATTR';
	}

	write;

# ----- format specs -----
	format ATTRHEAD =

ATTRIBUTES
----------
Name                is isa                       reqd lazy doc handles
==============================================================================================================
.	
	format ATTR = 
@<<<<<<<<<<<<<<<<<  @< @<<<<<<<<<<<<<<<<<<<<<<<< @<<< @<<< @<< ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
$attrname,          $is, $tc,                    $reqd, $lazy, $has_doc, $handles
                                                               ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ~~
                                                               $handles
.

	format ATTR_NARROW = 
@*
$attrname
         is: @*
             $is
        isa: @*
             $tc
       reqd: @*
             $reqd
       lazy: @*
             $lazy
        doc: @*
             $doc
    handles: ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
             $handles
             ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ~~
             $handles

.
	format ATTRHEAD_POD =
=head1 ATTRIBUTES

.
	format ATTR_POD =

=head2 C<@*>
         $attrname

         is: @*
             $is
        isa: @*
             $tc
       reqd: @*
             $reqd
       lazy: @*
             $lazy
        doc: @*
             $doc
    handles: ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
             $handles
             ^<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ~~
             $handles

.
	format ATTR_POD_CLOSE = 


.
# ----- / format specs -----
}



1;
