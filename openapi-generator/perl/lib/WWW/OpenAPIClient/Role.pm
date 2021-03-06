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
package WWW::OpenAPIClient::Role;
use utf8;

use Moose::Role;
use namespace::autoclean;
use Class::Inspector;
use Log::Any qw($log);
use WWW::OpenAPIClient::ApiFactory;

has base_url => ( is => 'ro',
                  required => 0,
                  isa => 'Str',
                  documentation => 'Root of the server that requests are sent to',
                  );

has api_factory => ( is => 'ro',
                     isa => 'WWW::OpenAPIClient::ApiFactory',
                     builder => '_build_af',
                     lazy => 1,
                     documentation => 'Builds an instance of the endpoint API class',
                     );

has tokens => ( is => 'ro',
                isa => 'HashRef',
                required => 0,
                default => sub { {} },
                documentation => 'The auth tokens required by the application - basic, OAuth and/or API key(s)',
                );

has _cfg => ( is => 'ro',
              isa => 'WWW::OpenAPIClient::Configuration',
              default => sub { WWW::OpenAPIClient::Configuration->new() },
              );

has version_info => ( is => 'ro',
                      isa => 'HashRef',
                      default => sub { {
                          app_name => 'Samsara API',
                          app_version => '1.0.0',
                          generator_class => 'org.openapitools.codegen.languages.PerlClientCodegen',
                      } },
                      documentation => 'Information about the application version and the codegen codebase version'
                      );

sub BUILD {
    my $self = shift;

    $self->_cfg->accept_tokens( $self->tokens ) if keys %{$self->tokens};

    # ignore these symbols imported into API namespaces
    my %outsiders = map {$_ => 1} qw( croak );

    my %delegates;

    # collect the methods callable on each API
    foreach my $api_name ($self->api_factory->apis_available) {
        my $api_class = $self->api_factory->classname_for($api_name);
        my $methods = Class::Inspector->methods($api_class, 'expanded'); # not Moose, so use CI instead
        my @local_methods = grep {! /^_/} grep {! $outsiders{$_}} map {$_->[2]} grep {$_->[1] eq $api_class} @$methods;
        push( @{$delegates{$_}}, {api_name => $api_name, api_class => $api_class} ) for @local_methods;
    }

    # remove clashes
    foreach my $method (keys %delegates) {
        if ( @{$delegates{$method}} > 1 ) {
            my ($apis) = delete $delegates{$method};
        }
    }

    # build the flattened API
    foreach my $api_name ($self->api_factory->apis_available) {
        my $att_name = sprintf "%s_api", lc($api_name);
        my $api_class = $self->api_factory->classname_for($api_name);
        my @delegated = grep { $delegates{$_}->[0]->{api_name} eq $api_name } keys %delegates;
        $log->debugf("Adding API: '%s' handles %s", $att_name, join ', ', @delegated);
        $self->meta->add_attribute( $att_name => (
                                    is => 'ro',
                                    isa => $api_class,
                                    default => sub {$self->api_factory->get_api($api_name)},
                                    lazy => 1,
                                    handles => \@delegated,
                                    ) );
    }
}

sub _build_af {
    my $self = shift;
    my %args;
    $args{base_url} = $self->base_url if $self->base_url;
    return WWW::OpenAPIClient::ApiFactory->new(%args);
}

=head1 NAME

WWW::OpenAPIClient::Role - a Moose role for the Samsara API

=head2 Samsara API version: 1.0.0

=head1 VERSION

Automatically generated by the Perl OpenAPI Generator project:

=over 4
=item Build package: org.openapitools.codegen.languages.PerlClientCodegen

=item Codegen version:

=back

=head2 A note on Moose

This role is the only component of the library that uses Moose. See
WWW::OpenAPIClient::ApiFactory for non-Moosey usage.

=head1 SYNOPSIS

The Perl Generator in the OpenAPI Generator project builds a library of Perl modules to interact with
a web service defined by a OpenAPI Specification. See below for how to build the
library.

This module provides an interface to the generated library. All the classes,
objects, and methods (well, not quite *all*, see below) are flattened into this
role.

    package MyApp;
    use Moose;
    with 'WWW::OpenAPIClient::Role';

    package main;

    my $api = MyApp->new({ tokens => $tokens });

    my $pet = $api->get_pet_by_id(pet_id => $pet_id);

=head2 Structure of the library

The library consists of a set of API classes, one for each endpoint. These APIs
implement the method calls available on each endpoint.

Additionally, there is a set of "object" classes, which represent the objects
returned by and sent to the methods on the endpoints.

An API factory class is provided, which builds instances of each endpoint API.

This Moose role flattens all the methods from the endpoint APIs onto the consuming
class. It also provides methods to retrieve the endpoint API objects, and the API
factory object, should you need it.

For documentation of all these methods, see AUTOMATIC DOCUMENTATION below.

=head2 Configuring authentication

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

Note these are all optional, as are C<prefix> and C<in>, and depend on the API
you are accessing. Usually C<prefix> and C<in> will be determined by the code generator from
the spec and you will not need to set them at run time. If not, C<in> will
default to 'head' and C<prefix> to the empty string.

The tokens will be placed in a L<WWW::OpenAPIClient::Configuration> instance
as follows, but you don't need to know about this.

=over 4

=item C<$cfg-\>{username}>

String. The username for basic auth.

=item C<$cfg-\>{password}>

String. The password for basic auth.

=item C<$cfg-\>{api_key}>

Hashref. Keyed on the name of each key (there can be multiple tokens).

    $cfg->{api_key} = {
        secretKey => 'aaaabbbbccccdddd',
        anotherKey => '1111222233334444',
        };

=item C<$cfg->{api_key_prefix}>

Hashref. Keyed on the name of each key (there can be multiple tokens). Note not
all api keys require a prefix.

    $cfg->{api_key_prefix} = {
        secretKey => 'string',
        anotherKey => 'same or some other string',
        };

=item C<$config-\>{access_token}>

String. The OAuth access token.

=back

=head1 METHODS

=head2 C<base_url>

The generated code has the C<base_url> already set as a default value. This method
returns the current value of C<base_url>.

=head2 C<api_factory>

Returns an API factory object. You probably won't need to call this directly.

        $self->api_factory('Pet'); # returns a WWW::OpenAPIClient::PetApi instance

        $self->pet_api;            # the same

=head1 MISSING METHODS

Most of the methods on the API are delegated to individual endpoint API objects
(e.g. Pet API, Store API, User API etc). Where different endpoint APIs use the
same method name (e.g. C<new()>), these methods can't be delegated. So you need
to call C<$api-E<gt>pet_api-E<gt>new()>.

In principle, every API is susceptible to the presence of a few, random, undelegatable
method names. In practice, because of the way method names are constructed, it's
unlikely in general that any methods will be undelegatable, except for:

    new()
    class_documentation()
    method_documentation()

To call these methods, you need to get a handle on the relevant object, either
by calling C<$api-E<gt>foo_api> or by retrieving an object, e.g.
C<$api-E<gt>get_pet_by_id(pet_id =E<gt> $pet_id)>. They are class methods, so
you could also call them on class names.

=head1 BUILDING YOUR LIBRARY

See the homepage C<https://openapi-generator.tech> for full details.
But briefly, clone the git repository, build the codegen codebase, set up your build
config file, then run the API build script. You will need git, Java 7 or 8 and Apache
maven 3.0.3 or better already installed.

The config file should specify the project name for the generated library:

    {"moduleName":"WWW::MyProjectName"}

Your library files will be built under C<WWW::MyProjectName>.

    $ git clone https://github.com/openapitools/openapi-generator
    $ cd openapi-generator
    $ mvn package
    $ java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
  -i [URL or file path to JSON OpenAPI API spec] \
  -g perl \
  -c /path/to/config/file.json \
  -o /path/to/output/folder

Bang, all done. Run the C<autodoc> script in the C<bin> directory to see the API
you just built.

=head1 AUTOMATIC DOCUMENTATION

You can print out a summary of the generated API by running the included
C<autodoc> script in the C<bin> directory of your generated library. A few
output formats are supported:

    Usage: autodoc [OPTION]

  -w           wide format (default)
  -n           narrow format
  -p           POD format
  -H           HTML format
  -m           Markdown format
  -h           print this help message
  -c           your application class

The C<-c> option allows you to load and inspect your own application. A dummy
namespace is used if you don't supply your own class.

=head1 DOCUMENTATION FROM THE OpenAPI Spec

Additional documentation for each class and method may be provided by the OpenAPI
spec. If so, this is available via the C<class_documentation()> and
C<method_documentation()> methods on each generated object class, and the
C<method_documentation()> method on the endpoint API classes:

    my $cmdoc = $api->pet_api->method_documentation->{$method_name};

    my $odoc = $api->get_pet_by_id->(pet_id => $pet_id)->class_documentation;
    my $omdoc = $api->get_pet_by_id->(pet_id => $pet_id)->method_documentation->{method_name};

Each of these calls returns a hashref with various useful pieces of information.

=cut

1;
