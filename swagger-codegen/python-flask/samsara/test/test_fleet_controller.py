# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from samsara.models.address import Address  # noqa: E501
from samsara.models.address_param import AddressParam  # noqa: E501
from samsara.models.addresses import Addresses  # noqa: E501
from samsara.models.all_route_job_updates import AllRouteJobUpdates  # noqa: E501
from samsara.models.asset_location_response import AssetLocationResponse  # noqa: E501
from samsara.models.asset_reefer_response import AssetReeferResponse  # noqa: E501
from samsara.models.contact import Contact  # noqa: E501
from samsara.models.create_dvir_param import CreateDvirParam  # noqa: E501
from samsara.models.current_driver import CurrentDriver  # noqa: E501
from samsara.models.data import Data  # noqa: E501
from samsara.models.dispatch_route import DispatchRoute  # noqa: E501
from samsara.models.dispatch_route_create import DispatchRouteCreate  # noqa: E501
from samsara.models.dispatch_route_history import DispatchRouteHistory  # noqa: E501
from samsara.models.dispatch_routes import DispatchRoutes  # noqa: E501
from samsara.models.document import Document  # noqa: E501
from samsara.models.document_create import DocumentCreate  # noqa: E501
from samsara.models.document_types import DocumentTypes  # noqa: E501
from samsara.models.documents import Documents  # noqa: E501
from samsara.models.driver import Driver  # noqa: E501
from samsara.models.driver_daily_log_response import DriverDailyLogResponse  # noqa: E501
from samsara.models.driver_for_create import DriverForCreate  # noqa: E501
from samsara.models.driver_safety_score_response import DriverSafetyScoreResponse  # noqa: E501
from samsara.models.drivers_response import DriversResponse  # noqa: E501
from samsara.models.drivers_summary_param import DriversSummaryParam  # noqa: E501
from samsara.models.drivers_summary_response import DriversSummaryResponse  # noqa: E501
from samsara.models.dvir_base import DvirBase  # noqa: E501
from samsara.models.dvir_list_response import DvirListResponse  # noqa: E501
from samsara.models.error_response import ErrorResponse  # noqa: E501
from samsara.models.fleet_vehicle_locations import FleetVehicleLocations  # noqa: E501
from samsara.models.fleet_vehicle_response import FleetVehicleResponse  # noqa: E501
from samsara.models.fleet_vehicles_locations import FleetVehiclesLocations  # noqa: E501
from samsara.models.group_drivers_param import GroupDriversParam  # noqa: E501
from samsara.models.group_param import GroupParam  # noqa: E501
from samsara.models.hos_authentication_logs_param import HosAuthenticationLogsParam  # noqa: E501
from samsara.models.hos_authentication_logs_response import HosAuthenticationLogsResponse  # noqa: E501
from samsara.models.hos_logs_param import HosLogsParam  # noqa: E501
from samsara.models.hos_logs_param1 import HosLogsParam1  # noqa: E501
from samsara.models.hos_logs_param2 import HosLogsParam2  # noqa: E501
from samsara.models.hos_logs_response import HosLogsResponse  # noqa: E501
from samsara.models.hos_logs_summary_response import HosLogsSummaryResponse  # noqa: E501
from samsara.models.inline_response200 import InlineResponse200  # noqa: E501
from samsara.models.inline_response2001 import InlineResponse2001  # noqa: E501
from samsara.models.inline_response2002 import InlineResponse2002  # noqa: E501
from samsara.models.inline_response2003 import InlineResponse2003  # noqa: E501
from samsara.models.inline_response2004 import InlineResponse2004  # noqa: E501
from samsara.models.inline_response2005 import InlineResponse2005  # noqa: E501
from samsara.models.reactivate_driver_param import ReactivateDriverParam  # noqa: E501
from samsara.models.trip_response import TripResponse  # noqa: E501
from samsara.models.trips_param import TripsParam  # noqa: E501
from samsara.models.vehicle_harsh_event_response import VehicleHarshEventResponse  # noqa: E501
from samsara.models.vehicle_safety_score_response import VehicleSafetyScoreResponse  # noqa: E501
from samsara.models.vehicle_update_param import VehicleUpdateParam  # noqa: E501
from samsara.test import BaseTestCase


class TestFleetController(BaseTestCase):
    """FleetController integration test stubs"""

    def test_add_fleet_address(self):
        """Test case for add_fleet_address

        /fleet/add_address
        """
        addressParam = AddressParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/add_address',
            method='POST',
            data=json.dumps(addressParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_add_organization_addresses(self):
        """Test case for add_organization_addresses

        /addresses
        """
        addresses = Addresses()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/addresses',
            method='POST',
            data=json.dumps(addresses),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_dispatch_route(self):
        """Test case for create_dispatch_route

        /fleet/dispatch/routes
        """
        createDispatchRouteParams = DispatchRouteCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes',
            method='POST',
            data=json.dumps(createDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_driver(self):
        """Test case for create_driver

        /fleet/drivers/create
        """
        createDriverParam = DriverForCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/create',
            method='POST',
            data=json.dumps(createDriverParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_driver_dispatch_route(self):
        """Test case for create_driver_dispatch_route

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        """
        createDispatchRouteParams = DispatchRouteCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=789),
            method='POST',
            data=json.dumps(createDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_driver_document(self):
        """Test case for create_driver_document

        /fleet/drivers/{driver_id:[0-9]+}/documents
        """
        createDocumentParams = DocumentCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/documents'.format(driver_id=789),
            method='POST',
            data=json.dumps(createDocumentParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_dvir(self):
        """Test case for create_dvir

        /fleet/maintenance/dvirs
        """
        createDvirParam = CreateDvirParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/maintenance/dvirs',
            method='POST',
            data=json.dumps(createDvirParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_vehicle_dispatch_route(self):
        """Test case for create_vehicle_dispatch_route

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        """
        createDispatchRouteParams = DispatchRouteCreate()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=789),
            method='POST',
            data=json.dumps(createDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_deactivate_driver(self):
        """Test case for deactivate_driver

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='DELETE',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dispatch_route_by_id(self):
        """Test case for delete_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=789),
            method='DELETE',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_organization_address(self):
        """Test case for delete_organization_address

        /addresses/{addressId}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/addresses/{addressId}'.format(addressId=789),
            method='DELETE',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_all_dispatch_routes(self):
        """Test case for fetch_all_dispatch_routes

        /fleet/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789),
                        ('end_time', 789),
                        ('duration', 789)]
        response = self.client.open(
            '/v1/fleet/dispatch/routes',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fetch_all_route_job_updates(self):
        """Test case for fetch_all_route_job_updates

        /fleet/dispatch/routes/job_updates
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789),
                        ('sequence_id', 'sequence_id_example'),
                        ('include', 'include_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/job_updates',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_asset_current_locations(self):
        """Test case for get_all_asset_current_locations

        /fleet/assets/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789)]
        response = self.client.open(
            '/v1/fleet/assets/locations',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_assets(self):
        """Test case for get_all_assets

        /fleet/assets
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789)]
        response = self.client.open(
            '/v1/fleet/assets',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_deactivated_drivers(self):
        """Test case for get_all_deactivated_drivers

        /fleet/drivers/inactive
        """
        query_string = [('access_token', 'access_token_example'),
                        ('group_id', 789)]
        response = self.client.open(
            '/v1/fleet/drivers/inactive',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_asset_location(self):
        """Test case for get_asset_location

        /fleet/assets/{assetId:[0-9]+}/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/assets/{asset_id}/locations'.format(asset_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_asset_reefer(self):
        """Test case for get_asset_reefer

        /fleet/assets/{assetId:[0-9]+}/reefer
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/assets/{asset_id}/reefer'.format(asset_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_deactivated_driver_by_id(self):
        """Test case for get_deactivated_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_route_by_id(self):
        """Test case for get_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_route_history(self):
        """Test case for get_dispatch_route_history

        /fleet/dispatch/routes/{route_id:[0-9]+}/history
        """
        query_string = [('access_token', 'access_token_example'),
                        ('start_time', 789),
                        ('end_time', 789)]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}/history'.format(route_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_routes_by_driver_id(self):
        """Test case for get_dispatch_routes_by_driver_id

        /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_time', 789),
                        ('duration', 789)]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dispatch_routes_by_vehicle_id(self):
        """Test case for get_dispatch_routes_by_vehicle_id

        /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
        """
        query_string = [('access_token', 'access_token_example'),
                        ('end_time', 789),
                        ('duration', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_by_id(self):
        """Test case for get_driver_by_id

        /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_document_types_by_org_id(self):
        """Test case for get_driver_document_types_by_org_id

        /fleet/drivers/document_types
        """
        response = self.client.open(
            '/v1/fleet/drivers/document_types',
            method='GET',
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_documents_by_org_id(self):
        """Test case for get_driver_documents_by_org_id

        /fleet/drivers/documents
        """
        query_string = [('access_token', 'access_token_example'),
                        ('endMs', 789),
                        ('durationMs', 789)]
        response = self.client.open(
            '/v1/fleet/drivers/documents',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_driver_safety_score(self):
        """Test case for get_driver_safety_score

        /fleet/drivers/{driverId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/drivers/{driverId}/safety/score'.format(driverId=789),
            method='GET',
            content_type='application/json',
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
        response = self.client.open(
            '/v1/fleet/maintenance/dvirs',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_drivers(self):
        """Test case for get_fleet_drivers

        /fleet/drivers
        """
        groupDriversParam = GroupDriversParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers',
            method='POST',
            data=json.dumps(groupDriversParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_drivers_hos_daily_logs(self):
        """Test case for get_fleet_drivers_hos_daily_logs

        /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
        """
        hosLogsParam = HosLogsParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/{driver_id}/hos_daily_logs'.format(driver_id=789),
            method='POST',
            data=json.dumps(hosLogsParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_drivers_summary(self):
        """Test case for get_fleet_drivers_summary

        /fleet/drivers/summary
        """
        driversSummaryParam = DriversSummaryParam()
        query_string = [('access_token', 'access_token_example'),
                        ('snap_to_day_bounds', true)]
        response = self.client.open(
            '/v1/fleet/drivers/summary',
            method='POST',
            data=json.dumps(driversSummaryParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_hos_authentication_logs(self):
        """Test case for get_fleet_hos_authentication_logs

        /fleet/hos_authentication_logs
        """
        hosAuthenticationLogsParam = HosAuthenticationLogsParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/hos_authentication_logs',
            method='POST',
            data=json.dumps(hosAuthenticationLogsParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_hos_logs(self):
        """Test case for get_fleet_hos_logs

        /fleet/hos_logs
        """
        hosLogsParam = HosLogsParam1()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/hos_logs',
            method='POST',
            data=json.dumps(hosLogsParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_hos_logs_summary(self):
        """Test case for get_fleet_hos_logs_summary

        /fleet/hos_logs_summary
        """
        hosLogsParam = HosLogsParam2()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/hos_logs_summary',
            method='POST',
            data=json.dumps(hosLogsParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_locations(self):
        """Test case for get_fleet_locations

        /fleet/locations
        """
        groupParam = GroupParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/locations',
            method='POST',
            data=json.dumps(groupParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_maintenance_list(self):
        """Test case for get_fleet_maintenance_list

        /fleet/maintenance/list
        """
        groupParam = GroupParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/maintenance/list',
            method='POST',
            data=json.dumps(groupParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_trips(self):
        """Test case for get_fleet_trips

        /fleet/trips
        """
        tripsParam = TripsParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/trips',
            method='POST',
            data=json.dumps(tripsParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fleet_vehicle(self):
        """Test case for get_fleet_vehicle

        /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id_or_external_id}'.format(vehicle_id_or_external_id='vehicle_id_or_external_id_example'),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_organization_address(self):
        """Test case for get_organization_address

        /addresses/{addressId}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/addresses/{addressId}'.format(addressId=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_organization_addresses(self):
        """Test case for get_organization_addresses

        /addresses
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/addresses',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_organization_contact(self):
        """Test case for get_organization_contact

        /contacts/{contact_id}
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/contacts/{contact_id}'.format(contact_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_harsh_event(self):
        """Test case for get_vehicle_harsh_event

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
        """
        query_string = [('access_token', 'access_token_example'),
                        ('timestamp', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicleId}/safety/harsh_event'.format(vehicleId=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_locations(self):
        """Test case for get_vehicle_locations

        /fleet/vehicles/{vehicle_id:[0-9]+}/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id}/locations'.format(vehicle_id=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_safety_score(self):
        """Test case for get_vehicle_safety_score

        /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 789),
                        ('endMs', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicleId}/safety/score'.format(vehicleId=789),
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicle_stats(self):
        """Test case for get_vehicle_stats

        /fleet/vehicles/stats
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 56),
                        ('endMs', 56),
                        ('series', 'series_example'),
                        ('tagIds', 'tagIds_example'),
                        ('startingAfter', 'startingAfter_example'),
                        ('endingBefore', 'endingBefore_example'),
                        ('limit', 789)]
        response = self.client.open(
            '/v1/fleet/vehicles/stats',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vehicles_locations(self):
        """Test case for get_vehicles_locations

        /fleet/vehicles/locations
        """
        query_string = [('access_token', 'access_token_example'),
                        ('startMs', 56),
                        ('endMs', 56)]
        response = self.client.open(
            '/v1/fleet/vehicles/locations',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_contacts(self):
        """Test case for list_contacts

        /contacts
        """
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/contacts',
            method='GET',
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_fleet(self):
        """Test case for list_fleet

        /fleet/list
        """
        groupParam = GroupParam()
        query_string = [('access_token', 'access_token_example'),
                        ('startingAfter', 'startingAfter_example'),
                        ('endingBefore', 'endingBefore_example'),
                        ('limit', 789)]
        response = self.client.open(
            '/v1/fleet/list',
            method='POST',
            data=json.dumps(groupParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_fleet_vehicle(self):
        """Test case for patch_fleet_vehicle

        /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        data = Data()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/vehicles/{vehicle_id_or_external_id}'.format(vehicle_id_or_external_id='vehicle_id_or_external_id_example'),
            method='PATCH',
            data=json.dumps(data),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reactivate_driver_by_id(self):
        """Test case for reactivate_driver_by_id

        /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
        """
        reactivateDriverParam = ReactivateDriverParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
            method='PUT',
            data=json.dumps(reactivateDriverParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_dispatch_route_by_id(self):
        """Test case for update_dispatch_route_by_id

        /fleet/dispatch/routes/{route_id:[0-9]+}/
        """
        updateDispatchRouteParams = DispatchRoute()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/dispatch/routes/{route_id}'.format(route_id=789),
            method='PUT',
            data=json.dumps(updateDispatchRouteParams),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_organization_address(self):
        """Test case for update_organization_address

        /addresses/{addressId}
        """
        address = Address()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/addresses/{addressId}'.format(addressId=789),
            method='PATCH',
            data=json.dumps(address),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_vehicles(self):
        """Test case for update_vehicles

        /fleet/set_data
        """
        vehicleUpdateParam = VehicleUpdateParam()
        query_string = [('access_token', 'access_token_example')]
        response = self.client.open(
            '/v1/fleet/set_data',
            method='POST',
            data=json.dumps(vehicleUpdateParam),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
