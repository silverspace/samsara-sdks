<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/v1/fleet/assets/locations', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getAllAssetCurrentLocations as a GET method ?');
            });


$app->GET('/v1/fleet/assets', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getAllAssets as a GET method ?');
            });


$app->GET('/v1/fleet/assets/{assetId}/locations', function(Application $app, Request $request, $asset_id) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getAssetLocation as a GET method ?');
            });


$app->GET('/v1/fleet/assets/{assetId}/reefer', function(Application $app, Request $request, $asset_id) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getAssetReefer as a GET method ?');
            });


$app->POST('/v1/fleet/drivers/create', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDriver as a POST method ?');
            });


$app->DELETE('/v1/fleet/drivers/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing deactivateDriver as a DELETE method ?');
            });


$app->GET('/v1/fleet/drivers/inactive', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getAllDeactivatedDrivers as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/inactive/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getDeactivatedDriverById as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getDriverById as a GET method ?');
            });


$app->PUT('/v1/fleet/drivers/inactive/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing reactivateDriverById as a PUT method ?');
            });


$app->POST('/v1/fleet/add_address', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing addFleetAddress as a POST method ?');
            });


$app->POST('/v1/addresses', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing addOrganizationAddresses as a POST method ?');
            });


$app->POST('/v1/fleet/dispatch/routes', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDispatchRoute as a POST method ?');
            });


$app->POST('/v1/fleet/drivers/create', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDriver as a POST method ?');
            });


$app->POST('/v1/fleet/drivers/{driverId}/dispatch/routes', function(Application $app, Request $request, $driver_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDriverDispatchRoute as a POST method ?');
            });


$app->POST('/v1/fleet/drivers/{driverId}/documents', function(Application $app, Request $request, $driver_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDriverDocument as a POST method ?');
            });


$app->POST('/v1/fleet/maintenance/dvirs', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDvir as a POST method ?');
            });


$app->POST('/v1/fleet/vehicles/{vehicleId}/dispatch/routes', function(Application $app, Request $request, $vehicle_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createVehicleDispatchRoute as a POST method ?');
            });


$app->DELETE('/v1/fleet/drivers/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing deactivateDriver as a DELETE method ?');
            });


$app->DELETE('/v1/fleet/dispatch/routes/{routeId}', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing deleteDispatchRouteById as a DELETE method ?');
            });


$app->DELETE('/v1/addresses/{addressId}', function(Application $app, Request $request, $addressId) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing deleteOrganizationAddress as a DELETE method ?');
            });


$app->GET('/v1/fleet/dispatch/routes', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            $end_time = $request->get('end_time');
            $duration = $request->get('duration');
            return new Response('How about implementing fetchAllDispatchRoutes as a GET method ?');
            });


$app->GET('/v1/fleet/dispatch/routes/job_updates', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            $sequence_id = $request->get('sequence_id');
            $include = $request->get('include');
            return new Response('How about implementing fetchAllRouteJobUpdates as a GET method ?');
            });


$app->GET('/v1/fleet/assets/locations', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getAllAssetCurrentLocations as a GET method ?');
            });


$app->GET('/v1/fleet/assets', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getAllAssets as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/inactive', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getAllDeactivatedDrivers as a GET method ?');
            });


$app->GET('/v1/fleet/assets/{assetId}/locations', function(Application $app, Request $request, $asset_id) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getAssetLocation as a GET method ?');
            });


$app->GET('/v1/fleet/assets/{assetId}/reefer', function(Application $app, Request $request, $asset_id) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getAssetReefer as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/inactive/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getDeactivatedDriverById as a GET method ?');
            });


$app->GET('/v1/fleet/dispatch/routes/{routeId}', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getDispatchRouteById as a GET method ?');
            });


$app->GET('/v1/fleet/dispatch/routes/{routeId}/history', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            $start_time = $request->get('start_time');
            $end_time = $request->get('end_time');
            return new Response('How about implementing getDispatchRouteHistory as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/{driverId}/dispatch/routes', function(Application $app, Request $request, $driver_id) {
            $access_token = $request->get('access_token');
            $end_time = $request->get('end_time');
            $duration = $request->get('duration');
            return new Response('How about implementing getDispatchRoutesByDriverId as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleId}/dispatch/routes', function(Application $app, Request $request, $vehicle_id) {
            $access_token = $request->get('access_token');
            $end_time = $request->get('end_time');
            $duration = $request->get('duration');
            return new Response('How about implementing getDispatchRoutesByVehicleId as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getDriverById as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/document_types', function(Application $app, Request $request) {
            return new Response('How about implementing getDriverDocumentTypesByOrgId as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/documents', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $end_ms = $request->get('end_ms');
            $duration_ms = $request->get('duration_ms');
            return new Response('How about implementing getDriverDocumentsByOrgId as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/{driverId}/safety/score', function(Application $app, Request $request, $driverId) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getDriverSafetyScore as a GET method ?');
            });


$app->GET('/v1/fleet/maintenance/dvirs', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $end_ms = $request->get('end_ms');
            $duration_ms = $request->get('duration_ms');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getDvirs as a GET method ?');
            });


$app->POST('/v1/fleet/drivers', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetDrivers as a POST method ?');
            });


$app->POST('/v1/fleet/drivers/{driverId}/hos_daily_logs', function(Application $app, Request $request, $driver_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetDriversHosDailyLogs as a POST method ?');
            });


$app->POST('/v1/fleet/drivers/summary', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $snap_to_day_bounds = $request->get('snap_to_day_bounds');
            return new Response('How about implementing getFleetDriversSummary as a POST method ?');
            });


$app->POST('/v1/fleet/hos_authentication_logs', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetHosAuthenticationLogs as a POST method ?');
            });


$app->POST('/v1/fleet/hos_logs', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetHosLogs as a POST method ?');
            });


$app->POST('/v1/fleet/hos_logs_summary', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetHosLogsSummary as a POST method ?');
            });


$app->POST('/v1/fleet/locations', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetLocations as a POST method ?');
            });


$app->POST('/v1/fleet/maintenance/list', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetMaintenanceList as a POST method ?');
            });


$app->POST('/v1/fleet/trips', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetTrips as a POST method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleIdOrExternalId}', function(Application $app, Request $request, $vehicle_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getFleetVehicle as a GET method ?');
            });


$app->GET('/v1/addresses/{addressId}', function(Application $app, Request $request, $addressId) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getOrganizationAddress as a GET method ?');
            });


$app->GET('/v1/addresses', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getOrganizationAddresses as a GET method ?');
            });


$app->GET('/v1/contacts/{contactId}', function(Application $app, Request $request, $contact_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getOrganizationContact as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleId}/safety/harsh_event', function(Application $app, Request $request, $vehicleId) {
            $access_token = $request->get('access_token');
            $timestamp = $request->get('timestamp');
            return new Response('How about implementing getVehicleHarshEvent as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleId}/locations', function(Application $app, Request $request, $vehicle_id) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getVehicleLocations as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleId}/safety/score', function(Application $app, Request $request, $vehicleId) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getVehicleSafetyScore as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/stats', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            $series = $request->get('series');
            $tag_ids = $request->get('tag_ids');
            $starting_after = $request->get('starting_after');
            $ending_before = $request->get('ending_before');
            $limit = $request->get('limit');
            return new Response('How about implementing getVehicleStats as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/locations', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getVehiclesLocations as a GET method ?');
            });


$app->GET('/v1/contacts', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing listContacts as a GET method ?');
            });


$app->POST('/v1/fleet/list', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $starting_after = $request->get('starting_after');
            $ending_before = $request->get('ending_before');
            $limit = $request->get('limit');
            return new Response('How about implementing listFleet as a POST method ?');
            });


$app->PATCH('/v1/fleet/vehicles/{vehicleIdOrExternalId}', function(Application $app, Request $request, $vehicle_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing patchFleetVehicle as a PATCH method ?');
            });


$app->PUT('/v1/fleet/drivers/inactive/{driverIdOrExternalId}', function(Application $app, Request $request, $driver_id_or_external_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing reactivateDriverById as a PUT method ?');
            });


$app->PUT('/v1/fleet/dispatch/routes/{routeId}', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing updateDispatchRouteById as a PUT method ?');
            });


$app->PATCH('/v1/addresses/{addressId}', function(Application $app, Request $request, $addressId) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing updateOrganizationAddress as a PATCH method ?');
            });


$app->POST('/v1/fleet/set_data', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing updateVehicles as a POST method ?');
            });


$app->GET('/v1/industrial/data', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getAllDataInputs as a GET method ?');
            });


$app->GET('/v1/industrial/data/{dataInputId}', function(Application $app, Request $request, $data_input_id) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getDataInput as a GET method ?');
            });


$app->POST('/v1/machines/list', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getMachines as a POST method ?');
            });


$app->POST('/v1/machines/history', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getMachinesHistory as a POST method ?');
            });


$app->POST('/v1/fleet/dispatch/routes', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDispatchRoute as a POST method ?');
            });


$app->POST('/v1/fleet/drivers/{driverId}/dispatch/routes', function(Application $app, Request $request, $driver_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createDriverDispatchRoute as a POST method ?');
            });


$app->POST('/v1/fleet/vehicles/{vehicleId}/dispatch/routes', function(Application $app, Request $request, $vehicle_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createVehicleDispatchRoute as a POST method ?');
            });


$app->DELETE('/v1/fleet/dispatch/routes/{routeId}', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing deleteDispatchRouteById as a DELETE method ?');
            });


$app->GET('/v1/fleet/dispatch/routes', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            $end_time = $request->get('end_time');
            $duration = $request->get('duration');
            return new Response('How about implementing fetchAllDispatchRoutes as a GET method ?');
            });


$app->GET('/v1/fleet/dispatch/routes/job_updates', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            $sequence_id = $request->get('sequence_id');
            $include = $request->get('include');
            return new Response('How about implementing fetchAllRouteJobUpdates as a GET method ?');
            });


$app->GET('/v1/fleet/dispatch/routes/{routeId}', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getDispatchRouteById as a GET method ?');
            });


$app->GET('/v1/fleet/dispatch/routes/{routeId}/history', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            $start_time = $request->get('start_time');
            $end_time = $request->get('end_time');
            return new Response('How about implementing getDispatchRouteHistory as a GET method ?');
            });


$app->GET('/v1/fleet/drivers/{driverId}/dispatch/routes', function(Application $app, Request $request, $driver_id) {
            $access_token = $request->get('access_token');
            $end_time = $request->get('end_time');
            $duration = $request->get('duration');
            return new Response('How about implementing getDispatchRoutesByDriverId as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleId}/dispatch/routes', function(Application $app, Request $request, $vehicle_id) {
            $access_token = $request->get('access_token');
            $end_time = $request->get('end_time');
            $duration = $request->get('duration');
            return new Response('How about implementing getDispatchRoutesByVehicleId as a GET method ?');
            });


$app->PUT('/v1/fleet/dispatch/routes/{routeId}', function(Application $app, Request $request, $route_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing updateDispatchRouteById as a PUT method ?');
            });


$app->GET('/v1/fleet/drivers/{driverId}/safety/score', function(Application $app, Request $request, $driverId) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getDriverSafetyScore as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleId}/safety/harsh_event', function(Application $app, Request $request, $vehicleId) {
            $access_token = $request->get('access_token');
            $timestamp = $request->get('timestamp');
            return new Response('How about implementing getVehicleHarshEvent as a GET method ?');
            });


$app->GET('/v1/fleet/vehicles/{vehicleId}/safety/score', function(Application $app, Request $request, $vehicleId) {
            $access_token = $request->get('access_token');
            $start_ms = $request->get('start_ms');
            $end_ms = $request->get('end_ms');
            return new Response('How about implementing getVehicleSafetyScore as a GET method ?');
            });


$app->POST('/v1/sensors/list', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getSensors as a POST method ?');
            });


$app->POST('/v1/sensors/cargo', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getSensorsCargo as a POST method ?');
            });


$app->POST('/v1/sensors/door', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getSensorsDoor as a POST method ?');
            });


$app->POST('/v1/sensors/history', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getSensorsHistory as a POST method ?');
            });


$app->POST('/v1/sensors/humidity', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getSensorsHumidity as a POST method ?');
            });


$app->POST('/v1/sensors/temperature', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getSensorsTemperature as a POST method ?');
            });


$app->POST('/v1/tags', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing createTag as a POST method ?');
            });


$app->DELETE('/v1/tags/{tagId}', function(Application $app, Request $request, $tag_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing deleteTagById as a DELETE method ?');
            });


$app->GET('/v1/tags', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            $group_id = $request->get('group_id');
            return new Response('How about implementing getAllTags as a GET method ?');
            });


$app->GET('/v1/tags/{tagId}', function(Application $app, Request $request, $tag_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getTagById as a GET method ?');
            });


$app->PATCH('/v1/tags/{tagId}', function(Application $app, Request $request, $tag_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing modifyTagById as a PATCH method ?');
            });


$app->PUT('/v1/tags/{tagId}', function(Application $app, Request $request, $tag_id) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing updateTagById as a PUT method ?');
            });


$app->DELETE('/v1/users/{userId}', function(Application $app, Request $request, $userId) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing deleteUserById as a DELETE method ?');
            });


$app->GET('/v1/users/{userId}', function(Application $app, Request $request, $userId) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing getUserById as a GET method ?');
            });


$app->GET('/v1/user_roles', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing listUserRoles as a GET method ?');
            });


$app->GET('/v1/users', function(Application $app, Request $request) {
            $access_token = $request->get('access_token');
            return new Response('How about implementing listUsers as a GET method ?');
            });


$app->run();
