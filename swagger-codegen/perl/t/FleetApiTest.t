=begin comment

Samsara API

# Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by Swagger Codegen
# Please update the test cases below to test the API endpoints.
# Ref: https://github.com/swagger-api/swagger-codegen
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::SwaggerClient::FleetApi');

my $api = WWW::SwaggerClient::FleetApi->new();
isa_ok($api, 'WWW::SwaggerClient::FleetApi');

#
# add_fleet_address test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $address_param = undef; # replace NULL with a proper value
    my $result = $api->add_fleet_address(access_token => $access_token, address_param => $address_param);
}

#
# add_organization_addresses test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $addresses = undef; # replace NULL with a proper value
    my $result = $api->add_organization_addresses(access_token => $access_token, addresses => $addresses);
}

#
# create_dispatch_route test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $create_dispatch_route_params = undef; # replace NULL with a proper value
    my $result = $api->create_dispatch_route(access_token => $access_token, create_dispatch_route_params => $create_dispatch_route_params);
}

#
# create_driver test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $create_driver_param = undef; # replace NULL with a proper value
    my $result = $api->create_driver(access_token => $access_token, create_driver_param => $create_driver_param);
}

#
# create_driver_dispatch_route test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id = undef; # replace NULL with a proper value
    my $create_dispatch_route_params = undef; # replace NULL with a proper value
    my $result = $api->create_driver_dispatch_route(access_token => $access_token, driver_id => $driver_id, create_dispatch_route_params => $create_dispatch_route_params);
}

#
# create_driver_document test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id = undef; # replace NULL with a proper value
    my $create_document_params = undef; # replace NULL with a proper value
    my $result = $api->create_driver_document(access_token => $access_token, driver_id => $driver_id, create_document_params => $create_document_params);
}

#
# create_dvir test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $create_dvir_param = undef; # replace NULL with a proper value
    my $result = $api->create_dvir(access_token => $access_token, create_dvir_param => $create_dvir_param);
}

#
# create_vehicle_dispatch_route test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $vehicle_id = undef; # replace NULL with a proper value
    my $create_dispatch_route_params = undef; # replace NULL with a proper value
    my $result = $api->create_vehicle_dispatch_route(access_token => $access_token, vehicle_id => $vehicle_id, create_dispatch_route_params => $create_dispatch_route_params);
}

#
# deactivate_driver test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id_or_external_id = undef; # replace NULL with a proper value
    my $result = $api->deactivate_driver(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id);
}

#
# delete_dispatch_route_by_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $route_id = undef; # replace NULL with a proper value
    my $result = $api->delete_dispatch_route_by_id(access_token => $access_token, route_id => $route_id);
}

#
# delete_organization_address test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $address_id = undef; # replace NULL with a proper value
    my $result = $api->delete_organization_address(access_token => $access_token, address_id => $address_id);
}

#
# fetch_all_dispatch_routes test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_id = undef; # replace NULL with a proper value
    my $end_time = undef; # replace NULL with a proper value
    my $duration = undef; # replace NULL with a proper value
    my $result = $api->fetch_all_dispatch_routes(access_token => $access_token, group_id => $group_id, end_time => $end_time, duration => $duration);
}

#
# fetch_all_route_job_updates test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_id = undef; # replace NULL with a proper value
    my $sequence_id = undef; # replace NULL with a proper value
    my $include = undef; # replace NULL with a proper value
    my $result = $api->fetch_all_route_job_updates(access_token => $access_token, group_id => $group_id, sequence_id => $sequence_id, include => $include);
}

#
# get_all_asset_current_locations test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_id = undef; # replace NULL with a proper value
    my $result = $api->get_all_asset_current_locations(access_token => $access_token, group_id => $group_id);
}

#
# get_all_assets test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_id = undef; # replace NULL with a proper value
    my $result = $api->get_all_assets(access_token => $access_token, group_id => $group_id);
}

#
# get_all_deactivated_drivers test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_id = undef; # replace NULL with a proper value
    my $result = $api->get_all_deactivated_drivers(access_token => $access_token, group_id => $group_id);
}

#
# get_asset_location test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $asset_id = undef; # replace NULL with a proper value
    my $start_ms = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $result = $api->get_asset_location(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms);
}

#
# get_asset_reefer test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $asset_id = undef; # replace NULL with a proper value
    my $start_ms = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $result = $api->get_asset_reefer(access_token => $access_token, asset_id => $asset_id, start_ms => $start_ms, end_ms => $end_ms);
}

#
# get_deactivated_driver_by_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id_or_external_id = undef; # replace NULL with a proper value
    my $result = $api->get_deactivated_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id);
}

#
# get_dispatch_route_by_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $route_id = undef; # replace NULL with a proper value
    my $result = $api->get_dispatch_route_by_id(access_token => $access_token, route_id => $route_id);
}

#
# get_dispatch_route_history test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $route_id = undef; # replace NULL with a proper value
    my $start_time = undef; # replace NULL with a proper value
    my $end_time = undef; # replace NULL with a proper value
    my $result = $api->get_dispatch_route_history(access_token => $access_token, route_id => $route_id, start_time => $start_time, end_time => $end_time);
}

#
# get_dispatch_routes_by_driver_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id = undef; # replace NULL with a proper value
    my $end_time = undef; # replace NULL with a proper value
    my $duration = undef; # replace NULL with a proper value
    my $result = $api->get_dispatch_routes_by_driver_id(access_token => $access_token, driver_id => $driver_id, end_time => $end_time, duration => $duration);
}

#
# get_dispatch_routes_by_vehicle_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $vehicle_id = undef; # replace NULL with a proper value
    my $end_time = undef; # replace NULL with a proper value
    my $duration = undef; # replace NULL with a proper value
    my $result = $api->get_dispatch_routes_by_vehicle_id(access_token => $access_token, vehicle_id => $vehicle_id, end_time => $end_time, duration => $duration);
}

#
# get_driver_by_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id_or_external_id = undef; # replace NULL with a proper value
    my $result = $api->get_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id);
}

#
# get_driver_document_types_by_org_id test
#
{
    my $result = $api->get_driver_document_types_by_org_id();
}

#
# get_driver_documents_by_org_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $duration_ms = undef; # replace NULL with a proper value
    my $result = $api->get_driver_documents_by_org_id(access_token => $access_token, end_ms => $end_ms, duration_ms => $duration_ms);
}

#
# get_driver_safety_score test
#
{
    my $driver_id = undef; # replace NULL with a proper value
    my $access_token = undef; # replace NULL with a proper value
    my $start_ms = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $result = $api->get_driver_safety_score(driver_id => $driver_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
}

#
# get_dvirs test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $duration_ms = undef; # replace NULL with a proper value
    my $group_id = undef; # replace NULL with a proper value
    my $result = $api->get_dvirs(access_token => $access_token, end_ms => $end_ms, duration_ms => $duration_ms, group_id => $group_id);
}

#
# get_fleet_drivers test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_drivers_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_drivers(access_token => $access_token, group_drivers_param => $group_drivers_param);
}

#
# get_fleet_drivers_hos_daily_logs test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id = undef; # replace NULL with a proper value
    my $hos_logs_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_drivers_hos_daily_logs(access_token => $access_token, driver_id => $driver_id, hos_logs_param => $hos_logs_param);
}

#
# get_fleet_drivers_summary test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $drivers_summary_param = undef; # replace NULL with a proper value
    my $snap_to_day_bounds = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_drivers_summary(access_token => $access_token, drivers_summary_param => $drivers_summary_param, snap_to_day_bounds => $snap_to_day_bounds);
}

#
# get_fleet_hos_authentication_logs test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $hos_authentication_logs_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_hos_authentication_logs(access_token => $access_token, hos_authentication_logs_param => $hos_authentication_logs_param);
}

#
# get_fleet_hos_logs test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $hos_logs_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_hos_logs(access_token => $access_token, hos_logs_param => $hos_logs_param);
}

#
# get_fleet_hos_logs_summary test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $hos_logs_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_hos_logs_summary(access_token => $access_token, hos_logs_param => $hos_logs_param);
}

#
# get_fleet_locations test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_locations(access_token => $access_token, group_param => $group_param);
}

#
# get_fleet_maintenance_list test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_maintenance_list(access_token => $access_token, group_param => $group_param);
}

#
# get_fleet_trips test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $trips_param = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_trips(access_token => $access_token, trips_param => $trips_param);
}

#
# get_fleet_vehicle test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $vehicle_id_or_external_id = undef; # replace NULL with a proper value
    my $result = $api->get_fleet_vehicle(access_token => $access_token, vehicle_id_or_external_id => $vehicle_id_or_external_id);
}

#
# get_organization_address test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $address_id = undef; # replace NULL with a proper value
    my $result = $api->get_organization_address(access_token => $access_token, address_id => $address_id);
}

#
# get_organization_addresses test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $result = $api->get_organization_addresses(access_token => $access_token);
}

#
# get_organization_contact test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $contact_id = undef; # replace NULL with a proper value
    my $result = $api->get_organization_contact(access_token => $access_token, contact_id => $contact_id);
}

#
# get_vehicle_harsh_event test
#
{
    my $vehicle_id = undef; # replace NULL with a proper value
    my $access_token = undef; # replace NULL with a proper value
    my $timestamp = undef; # replace NULL with a proper value
    my $result = $api->get_vehicle_harsh_event(vehicle_id => $vehicle_id, access_token => $access_token, timestamp => $timestamp);
}

#
# get_vehicle_locations test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $vehicle_id = undef; # replace NULL with a proper value
    my $start_ms = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $result = $api->get_vehicle_locations(access_token => $access_token, vehicle_id => $vehicle_id, start_ms => $start_ms, end_ms => $end_ms);
}

#
# get_vehicle_safety_score test
#
{
    my $vehicle_id = undef; # replace NULL with a proper value
    my $access_token = undef; # replace NULL with a proper value
    my $start_ms = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $result = $api->get_vehicle_safety_score(vehicle_id => $vehicle_id, access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
}

#
# get_vehicle_stats test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $start_ms = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $series = undef; # replace NULL with a proper value
    my $tag_ids = undef; # replace NULL with a proper value
    my $starting_after = undef; # replace NULL with a proper value
    my $ending_before = undef; # replace NULL with a proper value
    my $limit = undef; # replace NULL with a proper value
    my $result = $api->get_vehicle_stats(access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms, series => $series, tag_ids => $tag_ids, starting_after => $starting_after, ending_before => $ending_before, limit => $limit);
}

#
# get_vehicles_locations test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $start_ms = undef; # replace NULL with a proper value
    my $end_ms = undef; # replace NULL with a proper value
    my $result = $api->get_vehicles_locations(access_token => $access_token, start_ms => $start_ms, end_ms => $end_ms);
}

#
# list_contacts test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $result = $api->list_contacts(access_token => $access_token);
}

#
# list_fleet test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $group_param = undef; # replace NULL with a proper value
    my $starting_after = undef; # replace NULL with a proper value
    my $ending_before = undef; # replace NULL with a proper value
    my $limit = undef; # replace NULL with a proper value
    my $result = $api->list_fleet(access_token => $access_token, group_param => $group_param, starting_after => $starting_after, ending_before => $ending_before, limit => $limit);
}

#
# patch_fleet_vehicle test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $vehicle_id_or_external_id = undef; # replace NULL with a proper value
    my $data = undef; # replace NULL with a proper value
    my $result = $api->patch_fleet_vehicle(access_token => $access_token, vehicle_id_or_external_id => $vehicle_id_or_external_id, data => $data);
}

#
# reactivate_driver_by_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $driver_id_or_external_id = undef; # replace NULL with a proper value
    my $reactivate_driver_param = undef; # replace NULL with a proper value
    my $result = $api->reactivate_driver_by_id(access_token => $access_token, driver_id_or_external_id => $driver_id_or_external_id, reactivate_driver_param => $reactivate_driver_param);
}

#
# update_dispatch_route_by_id test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $route_id = undef; # replace NULL with a proper value
    my $update_dispatch_route_params = undef; # replace NULL with a proper value
    my $result = $api->update_dispatch_route_by_id(access_token => $access_token, route_id => $route_id, update_dispatch_route_params => $update_dispatch_route_params);
}

#
# update_organization_address test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $address = undef; # replace NULL with a proper value
    my $address_id = undef; # replace NULL with a proper value
    my $result = $api->update_organization_address(access_token => $access_token, address => $address, address_id => $address_id);
}

#
# update_vehicles test
#
{
    my $access_token = undef; # replace NULL with a proper value
    my $vehicle_update_param = undef; # replace NULL with a proper value
    my $result = $api->update_vehicles(access_token => $access_token, vehicle_update_param => $vehicle_update_param);
}


1;
