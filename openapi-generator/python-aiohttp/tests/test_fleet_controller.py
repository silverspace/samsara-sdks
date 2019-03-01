# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.address import Address
from openapi_server.models.all_route_job_updates import AllRouteJobUpdates
from openapi_server.models.asset_reefer_response import AssetReeferResponse
from openapi_server.models.contact import Contact
from openapi_server.models.dispatch_route import DispatchRoute
from openapi_server.models.dispatch_route_create import DispatchRouteCreate
from openapi_server.models.dispatch_route_history import DispatchRouteHistory
from openapi_server.models.document import Document
from openapi_server.models.document_create import DocumentCreate
from openapi_server.models.document_type import DocumentType
from openapi_server.models.driver import Driver
from openapi_server.models.driver_daily_log_response import DriverDailyLogResponse
from openapi_server.models.driver_for_create import DriverForCreate
from openapi_server.models.driver_safety_score_response import DriverSafetyScoreResponse
from openapi_server.models.drivers_response import DriversResponse
from openapi_server.models.drivers_summary_response import DriversSummaryResponse
from openapi_server.models.dvir_base import DvirBase
from openapi_server.models.dvir_list_response import DvirListResponse
from openapi_server.models.fleet_vehicle_location import FleetVehicleLocation
from openapi_server.models.fleet_vehicle_response import FleetVehicleResponse
from openapi_server.models.hos_authentication_logs_response import HosAuthenticationLogsResponse
from openapi_server.models.hos_logs_response import HosLogsResponse
from openapi_server.models.hos_logs_summary_response import HosLogsSummaryResponse
from openapi_server.models.inline_object import InlineObject
from openapi_server.models.inline_object1 import InlineObject1
from openapi_server.models.inline_object10 import InlineObject10
from openapi_server.models.inline_object11 import InlineObject11
from openapi_server.models.inline_object12 import InlineObject12
from openapi_server.models.inline_object13 import InlineObject13
from openapi_server.models.inline_object14 import InlineObject14
from openapi_server.models.inline_object15 import InlineObject15
from openapi_server.models.inline_object16 import InlineObject16
from openapi_server.models.inline_object2 import InlineObject2
from openapi_server.models.inline_object3 import InlineObject3
from openapi_server.models.inline_object4 import InlineObject4
from openapi_server.models.inline_object5 import InlineObject5
from openapi_server.models.inline_object6 import InlineObject6
from openapi_server.models.inline_object7 import InlineObject7
from openapi_server.models.inline_object8 import InlineObject8
from openapi_server.models.inline_object9 import InlineObject9
from openapi_server.models.inline_response200 import InlineResponse200
from openapi_server.models.inline_response2001 import InlineResponse2001
from openapi_server.models.inline_response2002 import InlineResponse2002
from openapi_server.models.inline_response2003 import InlineResponse2003
from openapi_server.models.inline_response2004 import InlineResponse2004
from openapi_server.models.inline_response2005 import InlineResponse2005
from openapi_server.models.trip_response import TripResponse
from openapi_server.models.vehicle_harsh_event_response import VehicleHarshEventResponse
from openapi_server.models.vehicle_safety_score_response import VehicleSafetyScoreResponse


async def test_add_fleet_address(client):
    """Test case for add_fleet_address

    /fleet/add_address
    """
    address_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/add_address',
        headers=headers,
        json=address_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_add_organization_addresses(client):
    """Test case for add_organization_addresses

    /addresses
    """
    addresses = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/addresses',
        headers=headers,
        json=addresses,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_dispatch_route(client):
    """Test case for create_dispatch_route

    /fleet/dispatch/routes
    """
    create_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/dispatch/routes',
        headers=headers,
        json=create_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_driver(client):
    """Test case for create_driver

    /fleet/drivers/create
    """
    create_driver_param = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers/create',
        headers=headers,
        json=create_driver_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_driver_dispatch_route(client):
    """Test case for create_driver_dispatch_route

    /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    """
    create_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=56),
        headers=headers,
        json=create_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_driver_document(client):
    """Test case for create_driver_document

    /fleet/drivers/{driver_id:[0-9]+}/documents
    """
    create_document_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers/{driver_id}/documents'.format(driver_id=56),
        headers=headers,
        json=create_document_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_dvir(client):
    """Test case for create_dvir

    /fleet/maintenance/dvirs
    """
    create_dvir_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/maintenance/dvirs',
        headers=headers,
        json=create_dvir_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_create_vehicle_dispatch_route(client):
    """Test case for create_vehicle_dispatch_route

    /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    """
    create_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=56),
        headers=headers,
        json=create_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_deactivate_driver(client):
    """Test case for deactivate_driver

    /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_dispatch_route_by_id(client):
    """Test case for delete_dispatch_route_by_id

    /fleet/dispatch/routes/{route_id:[0-9]+}/
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_delete_organization_address(client):
    """Test case for delete_organization_address

    /addresses/{addressId}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/addresses/{address_id}'.format(address_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_fetch_all_dispatch_routes(client):
    """Test case for fetch_all_dispatch_routes

    /fleet/dispatch/routes
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56),
                    ('end_time', 56),
                    ('duration', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_fetch_all_route_job_updates(client):
    """Test case for fetch_all_route_job_updates

    /fleet/dispatch/routes/job_updates
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56),
                    ('sequence_id', 'sequence_id_example'),
                    ('include', 'include_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes/job_updates',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_asset_current_locations(client):
    """Test case for get_all_asset_current_locations

    /fleet/assets/locations
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets/locations',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_assets(client):
    """Test case for get_all_assets

    /fleet/assets
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_all_deactivated_drivers(client):
    """Test case for get_all_deactivated_drivers

    /fleet/drivers/inactive
    """
    params = [('access_token', 'access_token_example'),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/inactive',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_asset_location(client):
    """Test case for get_asset_location

    /fleet/assets/{assetId:[0-9]+}/locations
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets/{asset_id}/locations'.format(asset_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_asset_reefer(client):
    """Test case for get_asset_reefer

    /fleet/assets/{assetId:[0-9]+}/reefer
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/assets/{asset_id}/reefer'.format(asset_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_deactivated_driver_by_id(client):
    """Test case for get_deactivated_driver_by_id

    /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_route_by_id(client):
    """Test case for get_dispatch_route_by_id

    /fleet/dispatch/routes/{route_id:[0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_route_history(client):
    """Test case for get_dispatch_route_history

    /fleet/dispatch/routes/{route_id:[0-9]+}/history
    """
    params = [('access_token', 'access_token_example'),
                    ('start_time', 56),
                    ('end_time', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/dispatch/routes/{route_id}/history'.format(route_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_routes_by_driver_id(client):
    """Test case for get_dispatch_routes_by_driver_id

    /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    """
    params = [('access_token', 'access_token_example'),
                    ('end_time', 56),
                    ('duration', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/{driver_id}/dispatch/routes'.format(driver_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dispatch_routes_by_vehicle_id(client):
    """Test case for get_dispatch_routes_by_vehicle_id

    /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    """
    params = [('access_token', 'access_token_example'),
                    ('end_time', 56),
                    ('duration', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id}/dispatch/routes'.format(vehicle_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_driver_by_id(client):
    """Test case for get_driver_by_id

    /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_driver_document_types_by_org_id(client):
    """Test case for get_driver_document_types_by_org_id

    /fleet/drivers/document_types
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/document_types',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_driver_documents_by_org_id(client):
    """Test case for get_driver_documents_by_org_id

    /fleet/drivers/documents
    """
    params = [('access_token', 'access_token_example'),
                    ('end_ms', 56),
                    ('duration_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/documents',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_driver_safety_score(client):
    """Test case for get_driver_safety_score

    /fleet/drivers/{driverId:[0-9]+}/safety/score
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/drivers/{driver_id}/safety/score'.format(driver_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_dvirs(client):
    """Test case for get_dvirs

    /fleet/maintenance/dvirs
    """
    params = [('access_token', 'access_token_example'),
                    ('end_ms', 56),
                    ('duration_ms', 56),
                    ('group_id', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/maintenance/dvirs',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_drivers(client):
    """Test case for get_fleet_drivers

    /fleet/drivers
    """
    group_drivers_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers',
        headers=headers,
        json=group_drivers_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_drivers_hos_daily_logs(client):
    """Test case for get_fleet_drivers_hos_daily_logs

    /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    """
    hos_logs_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers/{driver_id}/hos_daily_logs'.format(driver_id=56),
        headers=headers,
        json=hos_logs_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_drivers_summary(client):
    """Test case for get_fleet_drivers_summary

    /fleet/drivers/summary
    """
    drivers_summary_param = {}
    params = [('access_token', 'access_token_example'),
                    ('snap_to_day_bounds', True)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/drivers/summary',
        headers=headers,
        json=drivers_summary_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_hos_authentication_logs(client):
    """Test case for get_fleet_hos_authentication_logs

    /fleet/hos_authentication_logs
    """
    hos_authentication_logs_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/hos_authentication_logs',
        headers=headers,
        json=hos_authentication_logs_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_hos_logs(client):
    """Test case for get_fleet_hos_logs

    /fleet/hos_logs
    """
    hos_logs_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/hos_logs',
        headers=headers,
        json=hos_logs_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_hos_logs_summary(client):
    """Test case for get_fleet_hos_logs_summary

    /fleet/hos_logs_summary
    """
    hos_logs_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/hos_logs_summary',
        headers=headers,
        json=hos_logs_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_locations(client):
    """Test case for get_fleet_locations

    /fleet/locations
    """
    group_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/locations',
        headers=headers,
        json=group_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_maintenance_list(client):
    """Test case for get_fleet_maintenance_list

    /fleet/maintenance/list
    """
    group_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/maintenance/list',
        headers=headers,
        json=group_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_trips(client):
    """Test case for get_fleet_trips

    /fleet/trips
    """
    trips_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/trips',
        headers=headers,
        json=trips_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_fleet_vehicle(client):
    """Test case for get_fleet_vehicle

    /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id_or_external_id}'.format(vehicle_id_or_external_id='vehicle_id_or_external_id_example'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_organization_address(client):
    """Test case for get_organization_address

    /addresses/{addressId}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/addresses/{address_id}'.format(address_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_organization_addresses(client):
    """Test case for get_organization_addresses

    /addresses
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/addresses',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_organization_contact(client):
    """Test case for get_organization_contact

    /contacts/{contact_id}
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/contacts/{contact_id}'.format(contact_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vehicle_harsh_event(client):
    """Test case for get_vehicle_harsh_event

    /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    """
    params = [('access_token', 'access_token_example'),
                    ('timestamp', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id}/safety/harsh_event'.format(vehicle_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vehicle_locations(client):
    """Test case for get_vehicle_locations

    /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id}/locations'.format(vehicle_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vehicle_safety_score(client):
    """Test case for get_vehicle_safety_score

    /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/{vehicle_id}/safety/score'.format(vehicle_id=56),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vehicle_stats(client):
    """Test case for get_vehicle_stats

    /fleet/vehicles/stats
    """
    params = [('access_token', 'access_token_example'),
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
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/stats',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_vehicles_locations(client):
    """Test case for get_vehicles_locations

    /fleet/vehicles/locations
    """
    params = [('access_token', 'access_token_example'),
                    ('start_ms', 56),
                    ('end_ms', 56)]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/fleet/vehicles/locations',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_list_contacts(client):
    """Test case for list_contacts

    /contacts
    """
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/v1/contacts',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_list_fleet(client):
    """Test case for list_fleet

    /fleet/list
    """
    group_param = {}
    params = [('access_token', 'access_token_example'),
                    ('starting_after', 'starting_after_example'),
                    ('ending_before', 'ending_before_example'),
                    ('limit', 56)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/list',
        headers=headers,
        json=group_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


@pytest.mark.skip("Connexion does not support multiple consummes. See https://github.com/zalando/connexion/pull/760")
async def test_patch_fleet_vehicle(client):
    """Test case for patch_fleet_vehicle

    /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    data = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/v1/fleet/vehicles/{vehicle_id_or_external_id}'.format(vehicle_id_or_external_id='vehicle_id_or_external_id_example'),
        headers=headers,
        json=data,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_reactivate_driver_by_id(client):
    """Test case for reactivate_driver_by_id

    /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    """
    reactivate_driver_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PUT',
        path='/v1/fleet/drivers/inactive/{driver_id_or_external_id}'.format(driver_id_or_external_id='driver_id_or_external_id_example'),
        headers=headers,
        json=reactivate_driver_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_dispatch_route_by_id(client):
    """Test case for update_dispatch_route_by_id

    /fleet/dispatch/routes/{route_id:[0-9]+}/
    """
    update_dispatch_route_params = null
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PUT',
        path='/v1/fleet/dispatch/routes/{route_id}'.format(route_id=56),
        headers=headers,
        json=update_dispatch_route_params,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_organization_address(client):
    """Test case for update_organization_address

    /addresses/{addressId}
    """
    address = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='PATCH',
        path='/v1/addresses/{address_id}'.format(address_id=56),
        headers=headers,
        json=address,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_update_vehicles(client):
    """Test case for update_vehicles

    /fleet/set_data
    """
    vehicle_update_param = {}
    params = [('access_token', 'access_token_example')]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
    }
    response = await client.request(
        method='POST',
        path='/v1/fleet/set_data',
        headers=headers,
        json=vehicle_update_param,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

