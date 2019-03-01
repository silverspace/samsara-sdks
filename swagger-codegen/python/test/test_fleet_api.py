# coding: utf-8

"""
    Samsara API

    # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import samsara
from samsara.api.fleet_api import FleetApi  # noqa: E501
from samsara.rest import ApiException


class TestFleetApi(unittest.TestCase):
    """FleetApi unit test stubs"""

    def setUp(self):
        self.api = samsara.api.fleet_api.FleetApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_fleet_address(self):
        """Test case for add_fleet_address

        /fleet/add_address  # noqa: E501
        """
        pass

    def test_add_organization_addresses(self):
        """Test case for add_organization_addresses

        /addresses  # noqa: E501
        """
        pass

    def test_create_dispatch_route(self):
        """Test case for create_dispatch_route

        /fleet/dispatch/routes  # noqa: E501
        """
        pass

    def test_create_driver(self):
        """Test case for create_driver

        /fleet/drivers/create  # noqa: E501
        """
        pass

    def test_create_driver_dispatch_route(self):
        """Test case for create_driver_dispatch_route

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes  # noqa: E501
        """
        pass

    def test_create_driver_document(self):
        """Test case for create_driver_document

        /fleet/drivers/{driver_id:[0-9]+}/documents  # noqa: E501
        """
        pass

    def test_create_dvir(self):
        """Test case for create_dvir

        /fleet/maintenance/dvirs  # noqa: E501
        """
        pass

    def test_create_vehicle_dispatch_route(self):
        """Test case for create_vehicle_dispatch_route

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes  # noqa: E501
        """
        pass

    def test_deactivate_driver(self):
        """Test case for deactivate_driver

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501
        """
        pass

    def test_delete_dispatch_route_by_id(self):
        """Test case for delete_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/  # noqa: E501
        """
        pass

    def test_delete_organization_address(self):
        """Test case for delete_organization_address

        /addresses/{addressId}  # noqa: E501
        """
        pass

    def test_fetch_all_dispatch_routes(self):
        """Test case for fetch_all_dispatch_routes

        /fleet/dispatch/routes  # noqa: E501
        """
        pass

    def test_fetch_all_route_job_updates(self):
        """Test case for fetch_all_route_job_updates

        /fleet/dispatch/routes/job_updates  # noqa: E501
        """
        pass

    def test_get_all_asset_current_locations(self):
        """Test case for get_all_asset_current_locations

        /fleet/assets/locations  # noqa: E501
        """
        pass

    def test_get_all_assets(self):
        """Test case for get_all_assets

        /fleet/assets  # noqa: E501
        """
        pass

    def test_get_all_deactivated_drivers(self):
        """Test case for get_all_deactivated_drivers

        /fleet/drivers/inactive  # noqa: E501
        """
        pass

    def test_get_asset_location(self):
        """Test case for get_asset_location

        /fleet/assets/{assetId:[0-9]+}/locations  # noqa: E501
        """
        pass

    def test_get_asset_reefer(self):
        """Test case for get_asset_reefer

        /fleet/assets/{assetId:[0-9]+}/reefer  # noqa: E501
        """
        pass

    def test_get_deactivated_driver_by_id(self):
        """Test case for get_deactivated_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501
        """
        pass

    def test_get_dispatch_route_by_id(self):
        """Test case for get_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}  # noqa: E501
        """
        pass

    def test_get_dispatch_route_history(self):
        """Test case for get_dispatch_route_history

        /fleet/dispatch/routes/{route_id:[0-9]+}/history  # noqa: E501
        """
        pass

    def test_get_dispatch_routes_by_driver_id(self):
        """Test case for get_dispatch_routes_by_driver_id

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes  # noqa: E501
        """
        pass

    def test_get_dispatch_routes_by_vehicle_id(self):
        """Test case for get_dispatch_routes_by_vehicle_id

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes  # noqa: E501
        """
        pass

    def test_get_driver_by_id(self):
        """Test case for get_driver_by_id

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501
        """
        pass

    def test_get_driver_document_types_by_org_id(self):
        """Test case for get_driver_document_types_by_org_id

        /fleet/drivers/document_types  # noqa: E501
        """
        pass

    def test_get_driver_documents_by_org_id(self):
        """Test case for get_driver_documents_by_org_id

        /fleet/drivers/documents  # noqa: E501
        """
        pass

    def test_get_driver_safety_score(self):
        """Test case for get_driver_safety_score

        /fleet/drivers/{driverId:[0-9]+}/safety/score  # noqa: E501
        """
        pass

    def test_get_dvirs(self):
        """Test case for get_dvirs

        /fleet/maintenance/dvirs  # noqa: E501
        """
        pass

    def test_get_fleet_drivers(self):
        """Test case for get_fleet_drivers

        /fleet/drivers  # noqa: E501
        """
        pass

    def test_get_fleet_drivers_hos_daily_logs(self):
        """Test case for get_fleet_drivers_hos_daily_logs

        /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs  # noqa: E501
        """
        pass

    def test_get_fleet_drivers_summary(self):
        """Test case for get_fleet_drivers_summary

        /fleet/drivers/summary  # noqa: E501
        """
        pass

    def test_get_fleet_hos_authentication_logs(self):
        """Test case for get_fleet_hos_authentication_logs

        /fleet/hos_authentication_logs  # noqa: E501
        """
        pass

    def test_get_fleet_hos_logs(self):
        """Test case for get_fleet_hos_logs

        /fleet/hos_logs  # noqa: E501
        """
        pass

    def test_get_fleet_hos_logs_summary(self):
        """Test case for get_fleet_hos_logs_summary

        /fleet/hos_logs_summary  # noqa: E501
        """
        pass

    def test_get_fleet_locations(self):
        """Test case for get_fleet_locations

        /fleet/locations  # noqa: E501
        """
        pass

    def test_get_fleet_maintenance_list(self):
        """Test case for get_fleet_maintenance_list

        /fleet/maintenance/list  # noqa: E501
        """
        pass

    def test_get_fleet_trips(self):
        """Test case for get_fleet_trips

        /fleet/trips  # noqa: E501
        """
        pass

    def test_get_fleet_vehicle(self):
        """Test case for get_fleet_vehicle

        /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501
        """
        pass

    def test_get_organization_address(self):
        """Test case for get_organization_address

        /addresses/{addressId}  # noqa: E501
        """
        pass

    def test_get_organization_addresses(self):
        """Test case for get_organization_addresses

        /addresses  # noqa: E501
        """
        pass

    def test_get_organization_contact(self):
        """Test case for get_organization_contact

        /contacts/{contact_id}  # noqa: E501
        """
        pass

    def test_get_vehicle_harsh_event(self):
        """Test case for get_vehicle_harsh_event

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event  # noqa: E501
        """
        pass

    def test_get_vehicle_locations(self):
        """Test case for get_vehicle_locations

        /fleet/vehicles/{vehicle_id:[0-9]+}/locations  # noqa: E501
        """
        pass

    def test_get_vehicle_safety_score(self):
        """Test case for get_vehicle_safety_score

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/score  # noqa: E501
        """
        pass

    def test_get_vehicle_stats(self):
        """Test case for get_vehicle_stats

        /fleet/vehicles/stats  # noqa: E501
        """
        pass

    def test_get_vehicles_locations(self):
        """Test case for get_vehicles_locations

        /fleet/vehicles/locations  # noqa: E501
        """
        pass

    def test_list_contacts(self):
        """Test case for list_contacts

        /contacts  # noqa: E501
        """
        pass

    def test_list_fleet(self):
        """Test case for list_fleet

        /fleet/list  # noqa: E501
        """
        pass

    def test_patch_fleet_vehicle(self):
        """Test case for patch_fleet_vehicle

        /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501
        """
        pass

    def test_reactivate_driver_by_id(self):
        """Test case for reactivate_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}  # noqa: E501
        """
        pass

    def test_update_dispatch_route_by_id(self):
        """Test case for update_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/  # noqa: E501
        """
        pass

    def test_update_organization_address(self):
        """Test case for update_organization_address

        /addresses/{addressId}  # noqa: E501
        """
        pass

    def test_update_vehicles(self):
        """Test case for update_vehicles

        /fleet/set_data  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
