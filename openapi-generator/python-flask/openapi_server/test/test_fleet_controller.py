# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.address import Address  # noqa: E501
from openapi_server.models.all_route_job_updates import AllRouteJobUpdates  # noqa: E501
from openapi_server.models.asset_reefer_response import AssetReeferResponse  # noqa: E501
from openapi_server.models.contact import Contact  # noqa: E501
from openapi_server.models.dispatch_route import DispatchRoute  # noqa: E501
from openapi_server.models.dispatch_route_create import DispatchRouteCreate  # noqa: E501
from openapi_server.models.dispatch_route_history import DispatchRouteHistory  # noqa: E501
from openapi_server.models.document import Document  # noqa: E501
from openapi_server.models.document_create import DocumentCreate  # noqa: E501
from openapi_server.models.document_type import DocumentType  # noqa: E501
from openapi_server.models.driver import Driver  # noqa: E501
from openapi_server.models.driver_daily_log_response import DriverDailyLogResponse  # noqa: E501
from openapi_server.models.driver_for_create import DriverForCreate  # noqa: E501
from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from openapi_server.models.drivers_response import DriversResponse  # noqa: E501
from openapi_server.models.drivers_summary_response import DriversSummaryResponse  # noqa: E501
from openapi_server.models.dvir_base import DvirBase  # noqa: E501
from openapi_server.models.dvir_list_response import DvirListResponse  # noqa: E501
from openapi_server.models.fleet_vehicle_location import FleetVehicleLocation  # noqa: E501
from openapi_server.models.fleet_vehicle_response import FleetVehicleResponse  # noqa: E501
from openapi_server.models.hos_authentication_logs_response import HosAuthenticationLogsResponse  # noqa: E501
from openapi_server.models.hos_logs_response import HosLogsResponse  # noqa: E501
from openapi_server.models.hos_logs_summary_response import HosLogsSummaryResponse  # noqa: E501
from openapi_server.models.inline_object import InlineObject  # noqa: E501
from openapi_server.models.inline_object1 import InlineObject1  # noqa: E501
from openapi_server.models.inline_object10 import InlineObject10  # noqa: E501
from openapi_server.models.inline_object11 import InlineObject11  # noqa: E501
from openapi_server.models.inline_object12 import InlineObject12  # noqa: E501
from openapi_server.models.inline_object13 import InlineObject13  # noqa: E501
from openapi_server.models.inline_object14 import InlineObject14  # noqa: E501
from openapi_server.models.inline_object15 import InlineObject15  # noqa: E501
from openapi_server.models.inline_object16 import InlineObject16  # noqa: E501
from openapi_server.models.inline_object2 import InlineObject2  # noqa: E501
from openapi_server.models.inline_object3 import InlineObject3  # noqa: E501
from openapi_server.models.inline_object4 import InlineObject4  # noqa: E501
from openapi_server.models.inline_object5 import InlineObject5  # noqa: E501
from openapi_server.models.inline_object6 import InlineObject6  # noqa: E501
from openapi_server.models.inline_object7 import InlineObject7  # noqa: E501
from openapi_server.models.inline_object8 import InlineObject8  # noqa: E501
from openapi_server.models.inline_object9 import InlineObject9  # noqa: E501
from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from openapi_server.models.inline_response2002 import InlineResponse2002  # noqa: E501
from openapi_server.models.inline_response2003 import InlineResponse2003  # noqa: E501
from openapi_server.models.inline_response2004 import InlineResponse2004  # noqa: E501
from openapi_server.models.inline_response2005 import InlineResponse2005  # noqa: E501
from openapi_server.models.trip_response import TripResponse  # noqa: E501
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFleetController(BaseTestCase):
    """FleetController integration test stubs"""

    def test_add_fleet_address(self):
        """Test case for add_fleet_address

        /fleet/add_address
        """
        address_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/add_address',
            method='POST',
            headers=headers,
            data=json.dumps(address_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_organization_addresses(self):
        """Test case for add_organization_addresses

        /addresses
        """
        addresses = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/addresses',
            method='POST',
            headers=headers,
            data=json.dumps(addresses),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_dispatch_route(self):
        """Test case for create_dispatch_route

        /fleet/dispatch/routes
        """
        create_dispatch_route_params = null
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/dispatch/routes',
            method='POST',
            headers=headers,
            data=json.dumps(create_dispatch_route_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_driver(self):
        """Test case for create_driver

        /fleet/drivers/create
        """
        create_driver_param = null
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/create',
            method='POST',
            headers=headers,
            data=json.dumps(create_driver_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_driver_dispatch_route(self):
        """Test case for create_driver_dispatch_route

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        """
        create_dispatch_route_params = null
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(create_dispatch_route_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_driver_document(self):
        """Test case for create_driver_document

        /fleet/drivers/{driver_id:[0-9]+}/documents
        """
        create_document_params = null
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/documents'.format(driver_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(create_document_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_dvir(self):
        """Test case for create_dvir

        /fleet/maintenance/dvirs
        """
        create_dvir_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/maintenance/dvirs',
            method='POST',
            headers=headers,
            data=json.dumps(create_dvir_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_vehicle_dispatch_route(self):
        """Test case for create_vehicle_dispatch_route

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        """
        create_dispatch_route_params = null
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(create_dispatch_route_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deactivate_driver(self):
        """Test case for deactivate_driver

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dispatch_route_by_id(self):
        """Test case for delete_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_organization_address(self):
        """Test case for delete_organization_address

        /addresses/{addressId}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/addresses/{address_id}'.format(address_id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_all_dispatch_routes(self):
        """Test case for fetch_all_dispatch_routes

        /fleet/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 56),
                        ('end_time', 56),
                        ('duration', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/dispatch/routes',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_all_route_job_updates(self):
        """Test case for fetch_all_route_job_updates

        /fleet/dispatch/routes/job_updates
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 56),
                        ('sequence_id', 'sequence_id_example'),
                        ('include', 'include_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/dispatch/routes/job_updates',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_asset_current_locations(self):
        """Test case for get_all_asset_current_locations

        /fleet/assets/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/assets/locations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_assets(self):
        """Test case for get_all_assets

        /fleet/assets
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/assets',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_deactivated_drivers(self):
        """Test case for get_all_deactivated_drivers

        /fleet/drivers/inactive
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/inactive',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_asset_location(self):
        """Test case for get_asset_location

        /fleet/assets/{assetId:[0-9]+}/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/assets/{asset_id}/locations'.format(asset_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_asset_reefer(self):
        """Test case for get_asset_reefer

        /fleet/assets/{assetId:[0-9]+}/reefer
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/assets/{asset_id}/reefer'.format(asset_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_deactivated_driver_by_id(self):
        """Test case for get_deactivated_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_route_by_id(self):
        """Test case for get_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_route_history(self):
        """Test case for get_dispatch_route_history

        /fleet/dispatch/routes/{route_id:[0-9]+}/history
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_time', 56),
                        ('end_time', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}/history'.format(route_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_routes_by_driver_id(self):
        """Test case for get_dispatch_routes_by_driver_id

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_time', 56),
                        ('duration', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_routes_by_vehicle_id(self):
        """Test case for get_dispatch_routes_by_vehicle_id

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_time', 56),
                        ('duration', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_by_id(self):
        """Test case for get_driver_by_id

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_document_types_by_org_id(self):
        """Test case for get_driver_document_types_by_org_id

        /fleet/drivers/document_types
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/document_types',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_documents_by_org_id(self):
        """Test case for get_driver_documents_by_org_id

        /fleet/drivers/documents
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_ms', 56),
                        ('duration_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/documents',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_safety_score(self):
        """Test case for get_driver_safety_score

        /fleet/drivers/{driverId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/safety/score'.format(driver_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dvirs(self):
        """Test case for get_dvirs

        /fleet/maintenance/dvirs
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_ms', 56),
                        ('duration_ms', 56),
                        ('group_id', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/maintenance/dvirs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_drivers(self):
        """Test case for get_fleet_drivers

        /fleet/drivers
        """
        group_drivers_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers',
            method='POST',
            headers=headers,
            data=json.dumps(group_drivers_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_drivers_hos_daily_logs(self):
        """Test case for get_fleet_drivers_hos_daily_logs

        /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
        """
        hos_logs_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/hos_daily_logs'.format(driver_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(hos_logs_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_drivers_summary(self):
        """Test case for get_fleet_drivers_summary

        /fleet/drivers/summary
        """
        drivers_summary_param = {}
        query_string = [('access_token', 'access_token_example'),
                        ('snap_to_day_bounds', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/summary',
            method='POST',
            headers=headers,
            data=json.dumps(drivers_summary_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_hos_authentication_logs(self):
        """Test case for get_fleet_hos_authentication_logs

        /fleet/hos_authentication_logs
        """
        hos_authentication_logs_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/hos_authentication_logs',
            method='POST',
            headers=headers,
            data=json.dumps(hos_authentication_logs_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_hos_logs(self):
        """Test case for get_fleet_hos_logs

        /fleet/hos_logs
        """
        hos_logs_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/hos_logs',
            method='POST',
            headers=headers,
            data=json.dumps(hos_logs_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_hos_logs_summary(self):
        """Test case for get_fleet_hos_logs_summary

        /fleet/hos_logs_summary
        """
        hos_logs_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/hos_logs_summary',
            method='POST',
            headers=headers,
            data=json.dumps(hos_logs_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_locations(self):
        """Test case for get_fleet_locations

        /fleet/locations
        """
        group_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/locations',
            method='POST',
            headers=headers,
            data=json.dumps(group_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_maintenance_list(self):
        """Test case for get_fleet_maintenance_list

        /fleet/maintenance/list
        """
        group_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/maintenance/list',
            method='POST',
            headers=headers,
            data=json.dumps(group_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_trips(self):
        """Test case for get_fleet_trips

        /fleet/trips
        """
        trips_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/trips',
            method='POST',
            headers=headers,
            data=json.dumps(trips_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_vehicle(self):
        """Test case for get_fleet_vehicle

        /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id_or_external_id}'.format(vehicle_id_or_external_id='vehicle_id_or_external_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_organization_address(self):
        """Test case for get_organization_address

        /addresses/{addressId}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/addresses/{address_id}'.format(address_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_organization_addresses(self):
        """Test case for get_organization_addresses

        /addresses
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/addresses',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_organization_contact(self):
        """Test case for get_organization_contact

        /contacts/{contact_id}
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/contacts/{contact_id}'.format(contact_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_harsh_event(self):
        """Test case for get_vehicle_harsh_event

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        """
        query_string = [('access_token', 'access_token_example'),
                        ('timestamp', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/safety/harsh_event'.format(vehicle_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_locations(self):
        """Test case for get_vehicle_locations

        /fleet/vehicles/{vehicle_id:[0-9]+}/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/locations'.format(vehicle_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_safety_score(self):
        """Test case for get_vehicle_safety_score

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/safety/score'.format(vehicle_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_stats(self):
        """Test case for get_vehicle_stats

        /fleet/vehicles/stats
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56),
                        ('series', 'series_example'),
                        ('tag_ids', 'tag_ids_example'),
                        ('starting_after', 'starting_after_example'),
                        ('ending_before', 'ending_before_example'),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/stats',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicles_locations(self):
        """Test case for get_vehicles_locations

        /fleet/vehicles/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_ms', 56),
                        ('end_ms', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/locations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_contacts(self):
        """Test case for list_contacts

        /contacts
        """
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/v1/contacts',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_fleet(self):
        """Test case for list_fleet

        /fleet/list
        """
        group_param = {}
        query_string = [('access_token', 'access_token_example'),
                        ('starting_after', 'starting_after_example'),
                        ('ending_before', 'ending_before_example'),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/list',
            method='POST',
            headers=headers,
            data=json.dumps(group_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consummes. See https://github.com/zalando/connexion/pull/760")
    def test_patch_fleet_vehicle(self):
        """Test case for patch_fleet_vehicle

        /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        data = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id_or_external_id}'.format(vehicle_id_or_external_id='vehicle_id_or_external_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(data),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reactivate_driver_by_id(self):
        """Test case for reactivate_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        reactivate_driver_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(reactivate_driver_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_dispatch_route_by_id(self):
        """Test case for update_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/
        """
        update_dispatch_route_params = null
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_dispatch_route_params),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_organization_address(self):
        """Test case for update_organization_address

        /addresses/{addressId}
        """
        address = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/addresses/{address_id}'.format(address_id=56),
            method='PATCH',
            headers=headers,
            data=json.dumps(address),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_vehicles(self):
        """Test case for update_vehicles

        /fleet/set_data
        """
        vehicle_update_param = {}
        query_string = [('access_token', 'access_token_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/v1/fleet/set_data',
            method='POST',
            headers=headers,
            data=json.dumps(vehicle_update_param),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
