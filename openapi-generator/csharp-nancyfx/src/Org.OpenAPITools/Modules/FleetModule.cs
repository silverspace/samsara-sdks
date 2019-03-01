using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools.v1.Models;
using Org.OpenAPITools.v1.Utils;
using NodaTime;

namespace Org.OpenAPITools.v1.Modules
{ 
    /// <summary>
    /// Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2
    /// </summary>
    public enum GetVehicleStatsSeriesEnum
    {
        engineState = 1, 
        auxInput1 = 2, 
        auxInput2 = 3
    };


    /// <summary>
    /// Module processing requests of Fleet domain.
    /// </summary>
    public sealed class FleetModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public FleetModule(FleetService service) : base("/v1")
        { 
            Post["/fleet/add_address"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var addressParam = this.Bind<InlineObject2>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'AddFleetAddress'");
                
                Preconditions.IsNotNull(addressParam, "Required parameter: 'addressParam' is missing at 'AddFleetAddress'");
                
                service.AddFleetAddress(Context, accessToken, addressParam);
                return new Response { ContentType = "application/json"};
            };

            Post["/addresses"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var addresses = this.Bind<InlineObject>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'AddOrganizationAddresses'");
                
                Preconditions.IsNotNull(addresses, "Required parameter: 'addresses' is missing at 'AddOrganizationAddresses'");
                
                return service.AddOrganizationAddresses(Context, accessToken, addresses).ToArray();
            };

            Post["/fleet/dispatch/routes"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var createDispatchRouteParams = this.Bind<DispatchRouteCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateDispatchRoute'");
                
                Preconditions.IsNotNull(createDispatchRouteParams, "Required parameter: 'createDispatchRouteParams' is missing at 'CreateDispatchRoute'");
                
                return service.CreateDispatchRoute(Context, accessToken, createDispatchRouteParams);
            };

            Post["/fleet/drivers/create"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var createDriverParam = this.Bind<DriverForCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateDriver'");
                
                Preconditions.IsNotNull(createDriverParam, "Required parameter: 'createDriverParam' is missing at 'CreateDriver'");
                
                return service.CreateDriver(Context, accessToken, createDriverParam);
            };

            Post["/fleet/drivers/{driver_id}/dispatch/routes"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverId = Parameters.ValueOf<long?>(parameters, Context.Request, "driverId", ParameterType.Path);
                var createDispatchRouteParams = this.Bind<DispatchRouteCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateDriverDispatchRoute'");
                
                Preconditions.IsNotNull(driverId, "Required parameter: 'driverId' is missing at 'CreateDriverDispatchRoute'");
                
                Preconditions.IsNotNull(createDispatchRouteParams, "Required parameter: 'createDispatchRouteParams' is missing at 'CreateDriverDispatchRoute'");
                
                return service.CreateDriverDispatchRoute(Context, accessToken, driverId, createDispatchRouteParams);
            };

            Post["/fleet/drivers/{driver_id}/documents"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverId = Parameters.ValueOf<long?>(parameters, Context.Request, "driverId", ParameterType.Path);
                var createDocumentParams = this.Bind<DocumentCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateDriverDocument'");
                
                Preconditions.IsNotNull(driverId, "Required parameter: 'driverId' is missing at 'CreateDriverDocument'");
                
                Preconditions.IsNotNull(createDocumentParams, "Required parameter: 'createDocumentParams' is missing at 'CreateDriverDocument'");
                
                return service.CreateDriverDocument(Context, accessToken, driverId, createDocumentParams);
            };

            Post["/fleet/maintenance/dvirs"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var createDvirParam = this.Bind<InlineObject12>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateDvir'");
                
                Preconditions.IsNotNull(createDvirParam, "Required parameter: 'createDvirParam' is missing at 'CreateDvir'");
                
                return service.CreateDvir(Context, accessToken, createDvirParam);
            };

            Post["/fleet/vehicles/{vehicle_id}/dispatch/routes"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var vehicleId = Parameters.ValueOf<long?>(parameters, Context.Request, "vehicleId", ParameterType.Path);
                var createDispatchRouteParams = this.Bind<DispatchRouteCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateVehicleDispatchRoute'");
                
                Preconditions.IsNotNull(vehicleId, "Required parameter: 'vehicleId' is missing at 'CreateVehicleDispatchRoute'");
                
                Preconditions.IsNotNull(createDispatchRouteParams, "Required parameter: 'createDispatchRouteParams' is missing at 'CreateVehicleDispatchRoute'");
                
                return service.CreateVehicleDispatchRoute(Context, accessToken, vehicleId, createDispatchRouteParams);
            };

            Delete["/fleet/drivers/{driver_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "driverIdOrExternalId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'DeactivateDriver'");
                
                Preconditions.IsNotNull(driverIdOrExternalId, "Required parameter: 'driverIdOrExternalId' is missing at 'DeactivateDriver'");
                
                service.DeactivateDriver(Context, accessToken, driverIdOrExternalId);
                return new Response { ContentType = "application/json"};
            };

            Delete["/fleet/dispatch/routes/{route_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var routeId = Parameters.ValueOf<long?>(parameters, Context.Request, "routeId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'DeleteDispatchRouteById'");
                
                Preconditions.IsNotNull(routeId, "Required parameter: 'routeId' is missing at 'DeleteDispatchRouteById'");
                
                service.DeleteDispatchRouteById(Context, accessToken, routeId);
                return new Response { ContentType = "application/json"};
            };

            Delete["/addresses/{addressId}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var addressId = Parameters.ValueOf<long?>(parameters, Context.Request, "addressId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'DeleteOrganizationAddress'");
                
                Preconditions.IsNotNull(addressId, "Required parameter: 'addressId' is missing at 'DeleteOrganizationAddress'");
                
                service.DeleteOrganizationAddress(Context, accessToken, addressId);
                return new Response { ContentType = "application/json"};
            };

            Get["/fleet/dispatch/routes"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                var endTime = Parameters.ValueOf<long?>(parameters, Context.Request, "endTime", ParameterType.Query);
                var duration = Parameters.ValueOf<long?>(parameters, Context.Request, "duration", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'FetchAllDispatchRoutes'");
                
                return service.FetchAllDispatchRoutes(Context, accessToken, groupId, endTime, duration).ToArray();
            };

            Get["/fleet/dispatch/routes/job_updates"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                var sequenceId = Parameters.ValueOf<string>(parameters, Context.Request, "sequenceId", ParameterType.Query);
                var include = Parameters.ValueOf<string>(parameters, Context.Request, "include", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'FetchAllRouteJobUpdates'");
                
                return service.FetchAllRouteJobUpdates(Context, accessToken, groupId, sequenceId, include);
            };

            Get["/fleet/assets/locations"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAllAssetCurrentLocations'");
                
                return service.GetAllAssetCurrentLocations(Context, accessToken, groupId);
            };

            Get["/fleet/assets"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAllAssets'");
                
                return service.GetAllAssets(Context, accessToken, groupId);
            };

            Get["/fleet/drivers/inactive"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAllDeactivatedDrivers'");
                
                return service.GetAllDeactivatedDrivers(Context, accessToken, groupId).ToArray();
            };

            Get["/fleet/assets/{asset_id}/locations"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var assetId = Parameters.ValueOf<long?>(parameters, Context.Request, "assetId", ParameterType.Path);
                var startMs = Parameters.ValueOf<long?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAssetLocation'");
                
                Preconditions.IsNotNull(assetId, "Required parameter: 'assetId' is missing at 'GetAssetLocation'");
                
                Preconditions.IsNotNull(startMs, "Required parameter: 'startMs' is missing at 'GetAssetLocation'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetAssetLocation'");
                
                return service.GetAssetLocation(Context, accessToken, assetId, startMs, endMs).ToArray();
            };

            Get["/fleet/assets/{asset_id}/reefer"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var assetId = Parameters.ValueOf<long?>(parameters, Context.Request, "assetId", ParameterType.Path);
                var startMs = Parameters.ValueOf<long?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAssetReefer'");
                
                Preconditions.IsNotNull(assetId, "Required parameter: 'assetId' is missing at 'GetAssetReefer'");
                
                Preconditions.IsNotNull(startMs, "Required parameter: 'startMs' is missing at 'GetAssetReefer'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetAssetReefer'");
                
                return service.GetAssetReefer(Context, accessToken, assetId, startMs, endMs);
            };

            Get["/fleet/drivers/inactive/{driver_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "driverIdOrExternalId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDeactivatedDriverById'");
                
                Preconditions.IsNotNull(driverIdOrExternalId, "Required parameter: 'driverIdOrExternalId' is missing at 'GetDeactivatedDriverById'");
                
                return service.GetDeactivatedDriverById(Context, accessToken, driverIdOrExternalId);
            };

            Get["/fleet/dispatch/routes/{route_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var routeId = Parameters.ValueOf<long?>(parameters, Context.Request, "routeId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDispatchRouteById'");
                
                Preconditions.IsNotNull(routeId, "Required parameter: 'routeId' is missing at 'GetDispatchRouteById'");
                
                return service.GetDispatchRouteById(Context, accessToken, routeId);
            };

            Get["/fleet/dispatch/routes/{route_id}/history"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var routeId = Parameters.ValueOf<long?>(parameters, Context.Request, "routeId", ParameterType.Path);
                var startTime = Parameters.ValueOf<long?>(parameters, Context.Request, "startTime", ParameterType.Query);
                var endTime = Parameters.ValueOf<long?>(parameters, Context.Request, "endTime", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDispatchRouteHistory'");
                
                Preconditions.IsNotNull(routeId, "Required parameter: 'routeId' is missing at 'GetDispatchRouteHistory'");
                
                return service.GetDispatchRouteHistory(Context, accessToken, routeId, startTime, endTime);
            };

            Get["/fleet/drivers/{driver_id}/dispatch/routes"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverId = Parameters.ValueOf<long?>(parameters, Context.Request, "driverId", ParameterType.Path);
                var endTime = Parameters.ValueOf<long?>(parameters, Context.Request, "endTime", ParameterType.Query);
                var duration = Parameters.ValueOf<long?>(parameters, Context.Request, "duration", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDispatchRoutesByDriverId'");
                
                Preconditions.IsNotNull(driverId, "Required parameter: 'driverId' is missing at 'GetDispatchRoutesByDriverId'");
                
                return service.GetDispatchRoutesByDriverId(Context, accessToken, driverId, endTime, duration).ToArray();
            };

            Get["/fleet/vehicles/{vehicle_id}/dispatch/routes"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var vehicleId = Parameters.ValueOf<long?>(parameters, Context.Request, "vehicleId", ParameterType.Path);
                var endTime = Parameters.ValueOf<long?>(parameters, Context.Request, "endTime", ParameterType.Query);
                var duration = Parameters.ValueOf<long?>(parameters, Context.Request, "duration", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDispatchRoutesByVehicleId'");
                
                Preconditions.IsNotNull(vehicleId, "Required parameter: 'vehicleId' is missing at 'GetDispatchRoutesByVehicleId'");
                
                return service.GetDispatchRoutesByVehicleId(Context, accessToken, vehicleId, endTime, duration).ToArray();
            };

            Get["/fleet/drivers/{driver_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "driverIdOrExternalId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDriverById'");
                
                Preconditions.IsNotNull(driverIdOrExternalId, "Required parameter: 'driverIdOrExternalId' is missing at 'GetDriverById'");
                
                return service.GetDriverById(Context, accessToken, driverIdOrExternalId);
            };

            Get["/fleet/drivers/document_types"] = parameters =>
            {
                
                return service.GetDriverDocumentTypesByOrgId(Context).ToArray();
            };

            Get["/fleet/drivers/documents"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                var durationMs = Parameters.ValueOf<long?>(parameters, Context.Request, "durationMs", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDriverDocumentsByOrgId'");
                
                return service.GetDriverDocumentsByOrgId(Context, accessToken, endMs, durationMs).ToArray();
            };

            Get["/fleet/drivers/{driverId}/safety/score"] = parameters =>
            {
                var driverId = Parameters.ValueOf<long?>(parameters, Context.Request, "driverId", ParameterType.Path);
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var startMs = Parameters.ValueOf<long?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(driverId, "Required parameter: 'driverId' is missing at 'GetDriverSafetyScore'");
                
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDriverSafetyScore'");
                
                Preconditions.IsNotNull(startMs, "Required parameter: 'startMs' is missing at 'GetDriverSafetyScore'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetDriverSafetyScore'");
                
                return service.GetDriverSafetyScore(Context, driverId, accessToken, startMs, endMs);
            };

            Get["/fleet/maintenance/dvirs"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var endMs = Parameters.ValueOf<int?>(parameters, Context.Request, "endMs", ParameterType.Query);
                var durationMs = Parameters.ValueOf<int?>(parameters, Context.Request, "durationMs", ParameterType.Query);
                var groupId = Parameters.ValueOf<int?>(parameters, Context.Request, "groupId", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDvirs'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetDvirs'");
                
                Preconditions.IsNotNull(durationMs, "Required parameter: 'durationMs' is missing at 'GetDvirs'");
                
                return service.GetDvirs(Context, accessToken, endMs, durationMs, groupId);
            };

            Post["/fleet/drivers"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupDriversParam = this.Bind<InlineObject3>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetDrivers'");
                
                Preconditions.IsNotNull(groupDriversParam, "Required parameter: 'groupDriversParam' is missing at 'GetFleetDrivers'");
                
                return service.GetFleetDrivers(Context, accessToken, groupDriversParam);
            };

            Post["/fleet/drivers/{driver_id}/hos_daily_logs"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverId = Parameters.ValueOf<long?>(parameters, Context.Request, "driverId", ParameterType.Path);
                var hosLogsParam = this.Bind<InlineObject6>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetDriversHosDailyLogs'");
                
                Preconditions.IsNotNull(driverId, "Required parameter: 'driverId' is missing at 'GetFleetDriversHosDailyLogs'");
                
                Preconditions.IsNotNull(hosLogsParam, "Required parameter: 'hosLogsParam' is missing at 'GetFleetDriversHosDailyLogs'");
                
                return service.GetFleetDriversHosDailyLogs(Context, accessToken, driverId, hosLogsParam);
            };

            Post["/fleet/drivers/summary"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driversSummaryParam = this.Bind<InlineObject5>();var snapToDayBounds = Parameters.ValueOf<bool?>(parameters, Context.Request, "snapToDayBounds", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetDriversSummary'");
                
                Preconditions.IsNotNull(driversSummaryParam, "Required parameter: 'driversSummaryParam' is missing at 'GetFleetDriversSummary'");
                
                return service.GetFleetDriversSummary(Context, accessToken, driversSummaryParam, snapToDayBounds);
            };

            Post["/fleet/hos_authentication_logs"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var hosAuthenticationLogsParam = this.Bind<InlineObject7>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetHosAuthenticationLogs'");
                
                Preconditions.IsNotNull(hosAuthenticationLogsParam, "Required parameter: 'hosAuthenticationLogsParam' is missing at 'GetFleetHosAuthenticationLogs'");
                
                return service.GetFleetHosAuthenticationLogs(Context, accessToken, hosAuthenticationLogsParam);
            };

            Post["/fleet/hos_logs"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var hosLogsParam = this.Bind<InlineObject8>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetHosLogs'");
                
                Preconditions.IsNotNull(hosLogsParam, "Required parameter: 'hosLogsParam' is missing at 'GetFleetHosLogs'");
                
                return service.GetFleetHosLogs(Context, accessToken, hosLogsParam);
            };

            Post["/fleet/hos_logs_summary"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var hosLogsParam = this.Bind<InlineObject9>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetHosLogsSummary'");
                
                Preconditions.IsNotNull(hosLogsParam, "Required parameter: 'hosLogsParam' is missing at 'GetFleetHosLogsSummary'");
                
                return service.GetFleetHosLogsSummary(Context, accessToken, hosLogsParam);
            };

            Post["/fleet/locations"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupParam = this.Bind<InlineObject11>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetLocations'");
                
                Preconditions.IsNotNull(groupParam, "Required parameter: 'groupParam' is missing at 'GetFleetLocations'");
                
                return service.GetFleetLocations(Context, accessToken, groupParam);
            };

            Post["/fleet/maintenance/list"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupParam = this.Bind<InlineObject13>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetMaintenanceList'");
                
                Preconditions.IsNotNull(groupParam, "Required parameter: 'groupParam' is missing at 'GetFleetMaintenanceList'");
                
                return service.GetFleetMaintenanceList(Context, accessToken, groupParam);
            };

            Post["/fleet/trips"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var tripsParam = this.Bind<InlineObject15>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetTrips'");
                
                Preconditions.IsNotNull(tripsParam, "Required parameter: 'tripsParam' is missing at 'GetFleetTrips'");
                
                return service.GetFleetTrips(Context, accessToken, tripsParam);
            };

            Get["/fleet/vehicles/{vehicle_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var vehicleIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "vehicleIdOrExternalId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetFleetVehicle'");
                
                Preconditions.IsNotNull(vehicleIdOrExternalId, "Required parameter: 'vehicleIdOrExternalId' is missing at 'GetFleetVehicle'");
                
                return service.GetFleetVehicle(Context, accessToken, vehicleIdOrExternalId);
            };

            Get["/addresses/{addressId}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var addressId = Parameters.ValueOf<long?>(parameters, Context.Request, "addressId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetOrganizationAddress'");
                
                Preconditions.IsNotNull(addressId, "Required parameter: 'addressId' is missing at 'GetOrganizationAddress'");
                
                return service.GetOrganizationAddress(Context, accessToken, addressId);
            };

            Get["/addresses"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetOrganizationAddresses'");
                
                return service.GetOrganizationAddresses(Context, accessToken).ToArray();
            };

            Get["/contacts/{contact_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var contactId = Parameters.ValueOf<long?>(parameters, Context.Request, "contactId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetOrganizationContact'");
                
                Preconditions.IsNotNull(contactId, "Required parameter: 'contactId' is missing at 'GetOrganizationContact'");
                
                return service.GetOrganizationContact(Context, accessToken, contactId);
            };

            Get["/fleet/vehicles/{vehicleId}/safety/harsh_event"] = parameters =>
            {
                var vehicleId = Parameters.ValueOf<long?>(parameters, Context.Request, "vehicleId", ParameterType.Path);
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var timestamp = Parameters.ValueOf<long?>(parameters, Context.Request, "timestamp", ParameterType.Query);
                Preconditions.IsNotNull(vehicleId, "Required parameter: 'vehicleId' is missing at 'GetVehicleHarshEvent'");
                
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetVehicleHarshEvent'");
                
                Preconditions.IsNotNull(timestamp, "Required parameter: 'timestamp' is missing at 'GetVehicleHarshEvent'");
                
                return service.GetVehicleHarshEvent(Context, vehicleId, accessToken, timestamp);
            };

            Get["/fleet/vehicles/{vehicle_id}/locations"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var vehicleId = Parameters.ValueOf<long?>(parameters, Context.Request, "vehicleId", ParameterType.Path);
                var startMs = Parameters.ValueOf<long?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetVehicleLocations'");
                
                Preconditions.IsNotNull(vehicleId, "Required parameter: 'vehicleId' is missing at 'GetVehicleLocations'");
                
                Preconditions.IsNotNull(startMs, "Required parameter: 'startMs' is missing at 'GetVehicleLocations'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetVehicleLocations'");
                
                return service.GetVehicleLocations(Context, accessToken, vehicleId, startMs, endMs).ToArray();
            };

            Get["/fleet/vehicles/{vehicleId}/safety/score"] = parameters =>
            {
                var vehicleId = Parameters.ValueOf<long?>(parameters, Context.Request, "vehicleId", ParameterType.Path);
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var startMs = Parameters.ValueOf<long?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(vehicleId, "Required parameter: 'vehicleId' is missing at 'GetVehicleSafetyScore'");
                
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetVehicleSafetyScore'");
                
                Preconditions.IsNotNull(startMs, "Required parameter: 'startMs' is missing at 'GetVehicleSafetyScore'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetVehicleSafetyScore'");
                
                return service.GetVehicleSafetyScore(Context, vehicleId, accessToken, startMs, endMs);
            };

            Get["/fleet/vehicles/stats"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var startMs = Parameters.ValueOf<int?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<int?>(parameters, Context.Request, "endMs", ParameterType.Query);
                var series = Parameters.ValueOf<GetVehicleStatsSeriesEnum?>(parameters, Context.Request, "series", ParameterType.Query);
                var tagIds = Parameters.ValueOf<string>(parameters, Context.Request, "tagIds", ParameterType.Query);
                var startingAfter = Parameters.ValueOf<string>(parameters, Context.Request, "startingAfter", ParameterType.Query);
                var endingBefore = Parameters.ValueOf<string>(parameters, Context.Request, "endingBefore", ParameterType.Query);
                var limit = Parameters.ValueOf<long?>(parameters, Context.Request, "limit", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetVehicleStats'");
                
                Preconditions.IsNotNull(startMs, "Required parameter: 'startMs' is missing at 'GetVehicleStats'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetVehicleStats'");
                
                return service.GetVehicleStats(Context, accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
            };

            Get["/fleet/vehicles/locations"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var startMs = Parameters.ValueOf<int?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<int?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetVehiclesLocations'");
                
                Preconditions.IsNotNull(startMs, "Required parameter: 'startMs' is missing at 'GetVehiclesLocations'");
                
                Preconditions.IsNotNull(endMs, "Required parameter: 'endMs' is missing at 'GetVehiclesLocations'");
                
                return service.GetVehiclesLocations(Context, accessToken, startMs, endMs).ToArray();
            };

            Get["/contacts"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'ListContacts'");
                
                return service.ListContacts(Context, accessToken).ToArray();
            };

            Post["/fleet/list"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupParam = this.Bind<InlineObject10>();var startingAfter = Parameters.ValueOf<string>(parameters, Context.Request, "startingAfter", ParameterType.Query);
                var endingBefore = Parameters.ValueOf<string>(parameters, Context.Request, "endingBefore", ParameterType.Query);
                var limit = Parameters.ValueOf<long?>(parameters, Context.Request, "limit", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'ListFleet'");
                
                Preconditions.IsNotNull(groupParam, "Required parameter: 'groupParam' is missing at 'ListFleet'");
                
                return service.ListFleet(Context, accessToken, groupParam, startingAfter, endingBefore, limit);
            };

            Patch["/fleet/vehicles/{vehicle_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var vehicleIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "vehicleIdOrExternalId", ParameterType.Path);
                var data = this.Bind<InlineObject16>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'PatchFleetVehicle'");
                
                Preconditions.IsNotNull(vehicleIdOrExternalId, "Required parameter: 'vehicleIdOrExternalId' is missing at 'PatchFleetVehicle'");
                
                Preconditions.IsNotNull(data, "Required parameter: 'data' is missing at 'PatchFleetVehicle'");
                
                return service.PatchFleetVehicle(Context, accessToken, vehicleIdOrExternalId, data);
            };

            Put["/fleet/drivers/inactive/{driver_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "driverIdOrExternalId", ParameterType.Path);
                var reactivateDriverParam = this.Bind<InlineObject4>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'ReactivateDriverById'");
                
                Preconditions.IsNotNull(driverIdOrExternalId, "Required parameter: 'driverIdOrExternalId' is missing at 'ReactivateDriverById'");
                
                Preconditions.IsNotNull(reactivateDriverParam, "Required parameter: 'reactivateDriverParam' is missing at 'ReactivateDriverById'");
                
                return service.ReactivateDriverById(Context, accessToken, driverIdOrExternalId, reactivateDriverParam);
            };

            Put["/fleet/dispatch/routes/{route_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var routeId = Parameters.ValueOf<long?>(parameters, Context.Request, "routeId", ParameterType.Path);
                var updateDispatchRouteParams = this.Bind<DispatchRoute>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'UpdateDispatchRouteById'");
                
                Preconditions.IsNotNull(routeId, "Required parameter: 'routeId' is missing at 'UpdateDispatchRouteById'");
                
                Preconditions.IsNotNull(updateDispatchRouteParams, "Required parameter: 'updateDispatchRouteParams' is missing at 'UpdateDispatchRouteById'");
                
                return service.UpdateDispatchRouteById(Context, accessToken, routeId, updateDispatchRouteParams);
            };

            Patch["/addresses/{addressId}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var addressId = Parameters.ValueOf<long?>(parameters, Context.Request, "addressId", ParameterType.Path);
                var address = this.Bind<InlineObject1>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'UpdateOrganizationAddress'");
                
                Preconditions.IsNotNull(addressId, "Required parameter: 'addressId' is missing at 'UpdateOrganizationAddress'");
                
                Preconditions.IsNotNull(address, "Required parameter: 'address' is missing at 'UpdateOrganizationAddress'");
                
                service.UpdateOrganizationAddress(Context, accessToken, addressId, address);
                return new Response { ContentType = "application/json"};
            };

            Post["/fleet/set_data"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var vehicleUpdateParam = this.Bind<InlineObject14>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'UpdateVehicles'");
                
                Preconditions.IsNotNull(vehicleUpdateParam, "Required parameter: 'vehicleUpdateParam' is missing at 'UpdateVehicles'");
                
                service.UpdateVehicles(Context, accessToken, vehicleUpdateParam);
                return new Response { ContentType = "application/json"};
            };
        }
    }

    /// <summary>
    /// Service handling Fleet requests.
    /// </summary>
    public interface FleetService
    {
        /// <summary>
        /// This method adds an address book entry to the specified group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressParam"></param>
        /// <returns></returns>
        void AddFleetAddress(NancyContext context, string accessToken, InlineObject2 addressParam);

        /// <summary>
        /// Add one or more addresses to the organization
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addresses"></param>
        /// <returns>List&lt;Address&gt;</returns>
        List<Address> AddOrganizationAddresses(NancyContext context, string accessToken, InlineObject addresses);

        /// <summary>
        /// Create a new dispatch route.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDispatchRoute(NancyContext context, string accessToken, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// Create a new driver.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Driver</returns>
        Driver CreateDriver(NancyContext context, string accessToken, DriverForCreate createDriverParam);

        /// <summary>
        /// Create a new dispatch route for the driver with driver_id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDriverDispatchRoute(NancyContext context, string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// Create a driver document for the given driver.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver for whom the document is created.</param>
        /// <param name="createDocumentParams">To create a document for a given document type, the document type&#39;s uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
        /// <returns>Document</returns>
        Document CreateDriverDocument(NancyContext context, string accessToken, long? driverId, DocumentCreate createDocumentParams);

        /// <summary>
        /// Create a new dvir, marking a vehicle or trailer safe or unsafe.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDvirParam"></param>
        /// <returns>DvirBase</returns>
        DvirBase CreateDvir(NancyContext context, string accessToken, InlineObject12 createDvirParam);

        /// <summary>
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateVehicleDispatchRoute(NancyContext context, string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// Deactivate a driver with the given id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns></returns>
        void DeactivateDriver(NancyContext context, string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        void DeleteDispatchRouteById(NancyContext context, string accessToken, long? routeId);

        /// <summary>
        /// Delete an address.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns></returns>
        void DeleteOrganizationAddress(NancyContext context, string accessToken, long? addressId);

        /// <summary>
        /// Fetch all of the dispatch routes for the group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> FetchAllDispatchRoutes(NancyContext context, string accessToken, long? groupId, long? endTime, long? duration);

        /// <summary>
        /// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="sequenceId">Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)</param>
        /// <param name="include">Optionally set include&#x3D;route to include route object in response payload. (optional)</param>
        /// <returns>AllRouteJobUpdates</returns>
        AllRouteJobUpdates FetchAllRouteJobUpdates(NancyContext context, string accessToken, long? groupId, string sequenceId, string include);

        /// <summary>
        /// Fetch current locations of all assets for the group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse2001</returns>
        InlineResponse2001 GetAllAssetCurrentLocations(NancyContext context, string accessToken, long? groupId);

        /// <summary>
        /// Fetch all of the assets for the group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 GetAllAssets(NancyContext context, string accessToken, long? groupId);

        /// <summary>
        /// Fetch all deactivated drivers for the group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>List&lt;Driver&gt;</returns>
        List<Driver> GetAllDeactivatedDrivers(NancyContext context, string accessToken, long? groupId);

        /// <summary>
        /// Fetch the historical locations for the asset.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>List&lt;Object&gt;</returns>
        List<Object> GetAssetLocation(NancyContext context, string accessToken, long? assetId, long? startMs, long? endMs);

        /// <summary>
        /// Fetch the reefer-specific stats of an asset.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="assetId">ID of the asset</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>AssetReeferResponse</returns>
        AssetReeferResponse GetAssetReefer(NancyContext context, string accessToken, long? assetId, long? startMs, long? endMs);

        /// <summary>
        /// Fetch deactivated driver by id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDeactivatedDriverById(NancyContext context, string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// Fetch a dispatch route by id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute GetDispatchRouteById(NancyContext context, string accessToken, long? routeId);

        /// <summary>
        /// Fetch the history of a dispatch route.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the route with history.</param>
        /// <param name="startTime">Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)</param>
        /// <param name="endTime">Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)</param>
        /// <returns>DispatchRouteHistory</returns>
        DispatchRouteHistory GetDispatchRouteHistory(NancyContext context, string accessToken, long? routeId, long? startTime, long? endTime);

        /// <summary>
        /// Fetch all of the dispatch routes for a given driver.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByDriverId(NancyContext context, string accessToken, long? driverId, long? endTime, long? duration);

        /// <summary>
        /// Fetch all of the dispatch routes for a given vehicle.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="endTime">Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)</param>
        /// <param name="duration">Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;DispatchRoute&gt;</returns>
        List<DispatchRoute> GetDispatchRoutesByVehicleId(NancyContext context, string accessToken, long? vehicleId, long? endTime, long? duration);

        /// <summary>
        /// Fetch driver by id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDriverById(NancyContext context, string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// Fetch all of the document types.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>List&lt;DocumentType&gt;</returns>
        List<DocumentType> GetDriverDocumentTypesByOrgId(NancyContext context);

        /// <summary>
        /// Fetch all of the documents.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)</param>
        /// <param name="durationMs">Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)</param>
        /// <returns>List&lt;Document&gt;</returns>
        List<Document> GetDriverDocumentsByOrgId(NancyContext context, string accessToken, long? endMs, long? durationMs);

        /// <summary>
        /// Fetch the safety score for the driver.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="driverId">ID of the driver</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>DriverSafetyScoreResponse</returns>
        DriverSafetyScoreResponse GetDriverSafetyScore(NancyContext context, long? driverId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// Get DVIRs for the org within provided time constraints
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="endMs">time in millis until the last dvir log.</param>
        /// <param name="durationMs">time in millis which corresponds to the duration before the end_ms.</param>
        /// <param name="groupId">Group ID to query. (optional)</param>
        /// <returns>DvirListResponse</returns>
        DvirListResponse GetDvirs(NancyContext context, string accessToken, int? endMs, int? durationMs, int? groupId);

        /// <summary>
        /// Get all the drivers for the specified group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupDriversParam"></param>
        /// <returns>DriversResponse</returns>
        DriversResponse GetFleetDrivers(NancyContext context, string accessToken, InlineObject3 groupDriversParam);

        /// <summary>
        /// Get summarized daily HOS charts for a specified driver.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverId">ID of the driver with HOS logs.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>DriverDailyLogResponse</returns>
        DriverDailyLogResponse GetFleetDriversHosDailyLogs(NancyContext context, string accessToken, long? driverId, InlineObject6 hosLogsParam);

        /// <summary>
        /// Get the distance and time each driver in an organization has driven in a given time period.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driversSummaryParam"></param>
        /// <param name="snapToDayBounds">Snap query result to HOS day boundaries. (optional)</param>
        /// <returns>DriversSummaryResponse</returns>
        DriversSummaryResponse GetFleetDriversSummary(NancyContext context, string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds);

        /// <summary>
        /// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosAuthenticationLogsParam"></param>
        /// <returns>HosAuthenticationLogsResponse</returns>
        HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs(NancyContext context, string accessToken, InlineObject7 hosAuthenticationLogsParam);

        /// <summary>
        /// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>HosLogsResponse</returns>
        HosLogsResponse GetFleetHosLogs(NancyContext context, string accessToken, InlineObject8 hosLogsParam);

        /// <summary>
        /// Get the current HOS status for all drivers in the group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="hosLogsParam"></param>
        /// <returns>HosLogsSummaryResponse</returns>
        HosLogsSummaryResponse GetFleetHosLogsSummary(NancyContext context, string accessToken, InlineObject9 hosLogsParam);

        /// <summary>
        /// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2003</returns>
        InlineResponse2003 GetFleetLocations(NancyContext context, string accessToken, InlineObject11 groupParam);

        /// <summary>
        /// Get list of the vehicles with any engine faults or check light data.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2004</returns>
        InlineResponse2004 GetFleetMaintenanceList(NancyContext context, string accessToken, InlineObject13 groupParam);

        /// <summary>
        /// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="tripsParam"></param>
        /// <returns>TripResponse</returns>
        TripResponse GetFleetTrips(NancyContext context, string accessToken, InlineObject15 tripsParam);

        /// <summary>
        /// Gets a specific vehicle.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <returns>FleetVehicleResponse</returns>
        FleetVehicleResponse GetFleetVehicle(NancyContext context, string accessToken, string vehicleIdOrExternalId);

        /// <summary>
        /// Fetch an address by its id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <returns>Address</returns>
        Address GetOrganizationAddress(NancyContext context, string accessToken, long? addressId);

        /// <summary>
        /// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Address&gt;</returns>
        List<Address> GetOrganizationAddresses(NancyContext context, string accessToken);

        /// <summary>
        /// Fetch a contact by its id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="contactId">ID of the contact</param>
        /// <returns>Contact</returns>
        Contact GetOrganizationContact(NancyContext context, string accessToken, long? contactId);

        /// <summary>
        /// Fetch harsh event details for a vehicle.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        VehicleHarshEventResponse GetVehicleHarshEvent(NancyContext context, long? vehicleId, string accessToken, long? timestamp);

        /// <summary>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)</param>
        /// <returns>List&lt;FleetVehicleLocation&gt;</returns>
        List<FleetVehicleLocation> GetVehicleLocations(NancyContext context, string accessToken, long? vehicleId, long? startMs, long? endMs);

        /// <summary>
        /// Fetch the safety score for the vehicle.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.</param>
        /// <param name="endMs">Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.</param>
        /// <returns>VehicleSafetyScoreResponse</returns>
        VehicleSafetyScoreResponse GetVehicleSafetyScore(NancyContext context, long? vehicleId, string accessToken, long? startMs, long? endMs);

        /// <summary>
        /// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query.</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query.</param>
        /// <param name="series">Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series&#x3D;engineState,auxInput2 (optional)</param>
        /// <param name="tagIds">Comma-separated list of tag ids. Example: tagIds&#x3D;1,2,3 (optional)</param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>InlineResponse2005</returns>
        InlineResponse2005 GetVehicleStats(NancyContext context, string accessToken, int? startMs, int? endMs, GetVehicleStatsSeriesEnum? series, string tagIds, string startingAfter, string endingBefore, long? limit);

        /// <summary>
        /// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="startMs">Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)</param>
        /// <param name="endMs">Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)</param>
        /// <returns>List&lt;Object&gt;</returns>
        List<Object> GetVehiclesLocations(NancyContext context, string accessToken, int? startMs, int? endMs);

        /// <summary>
        /// Fetch all contacts for the organization.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <returns>List&lt;Contact&gt;</returns>
        List<Contact> ListContacts(NancyContext context, string accessToken);

        /// <summary>
        /// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <param name="startingAfter">Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;endingBefore&#39; parameter. (optional)</param>
        /// <param name="endingBefore">Pagination parameter indicating the cursor position to return results before. Used in conjunction with the &#39;limit&#39; parameter. Mutually exclusive with &#39;startingAfter&#39; parameter. (optional)</param>
        /// <param name="limit">Pagination parameter indicating the number of results to return in this request. Used in conjunction with either &#39;startingAfter&#39; or &#39;endingBefore&#39;. (optional)</param>
        /// <returns>InlineResponse2002</returns>
        InlineResponse2002 ListFleet(NancyContext context, string accessToken, InlineObject10 groupParam, string startingAfter, string endingBefore, long? limit);

        /// <summary>
        /// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleIdOrExternalId">ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.</param>
        /// <param name="data"></param>
        /// <returns>FleetVehicleResponse</returns>
        FleetVehicleResponse PatchFleetVehicle(NancyContext context, string accessToken, string vehicleIdOrExternalId, InlineObject16 data);

        /// <summary>
        /// Reactivate the inactive driver having id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Driver</returns>
        Driver ReactivateDriverById(NancyContext context, string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);

        /// <summary>
        /// Update a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute UpdateDispatchRouteById(NancyContext context, string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);

        /// <summary>
        /// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="addressId">ID of the address/geofence</param>
        /// <param name="address"></param>
        /// <returns></returns>
        void UpdateOrganizationAddress(NancyContext context, string accessToken, long? addressId, InlineObject1 address);

        /// <summary>
        /// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleUpdateParam"></param>
        /// <returns></returns>
        void UpdateVehicles(NancyContext context, string accessToken, InlineObject14 vehicleUpdateParam);
    }

    /// <summary>
    /// Abstraction of FleetService.
    /// </summary>
    public abstract class AbstractFleetService: FleetService
    {
        public virtual void AddFleetAddress(NancyContext context, string accessToken, InlineObject2 addressParam)
        {
            AddFleetAddress(accessToken, addressParam);
        }

        public virtual List<Address> AddOrganizationAddresses(NancyContext context, string accessToken, InlineObject addresses)
        {
            return AddOrganizationAddresses(accessToken, addresses);
        }

        public virtual DispatchRoute CreateDispatchRoute(NancyContext context, string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            return CreateDispatchRoute(accessToken, createDispatchRouteParams);
        }

        public virtual Driver CreateDriver(NancyContext context, string accessToken, DriverForCreate createDriverParam)
        {
            return CreateDriver(accessToken, createDriverParam);
        }

        public virtual DispatchRoute CreateDriverDispatchRoute(NancyContext context, string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            return CreateDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
        }

        public virtual Document CreateDriverDocument(NancyContext context, string accessToken, long? driverId, DocumentCreate createDocumentParams)
        {
            return CreateDriverDocument(accessToken, driverId, createDocumentParams);
        }

        public virtual DvirBase CreateDvir(NancyContext context, string accessToken, InlineObject12 createDvirParam)
        {
            return CreateDvir(accessToken, createDvirParam);
        }

        public virtual DispatchRoute CreateVehicleDispatchRoute(NancyContext context, string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            return CreateVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
        }

        public virtual void DeactivateDriver(NancyContext context, string accessToken, string driverIdOrExternalId)
        {
            DeactivateDriver(accessToken, driverIdOrExternalId);
        }

        public virtual void DeleteDispatchRouteById(NancyContext context, string accessToken, long? routeId)
        {
            DeleteDispatchRouteById(accessToken, routeId);
        }

        public virtual void DeleteOrganizationAddress(NancyContext context, string accessToken, long? addressId)
        {
            DeleteOrganizationAddress(accessToken, addressId);
        }

        public virtual List<DispatchRoute> FetchAllDispatchRoutes(NancyContext context, string accessToken, long? groupId, long? endTime, long? duration)
        {
            return FetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
        }

        public virtual AllRouteJobUpdates FetchAllRouteJobUpdates(NancyContext context, string accessToken, long? groupId, string sequenceId, string include)
        {
            return FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
        }

        public virtual InlineResponse2001 GetAllAssetCurrentLocations(NancyContext context, string accessToken, long? groupId)
        {
            return GetAllAssetCurrentLocations(accessToken, groupId);
        }

        public virtual InlineResponse200 GetAllAssets(NancyContext context, string accessToken, long? groupId)
        {
            return GetAllAssets(accessToken, groupId);
        }

        public virtual List<Driver> GetAllDeactivatedDrivers(NancyContext context, string accessToken, long? groupId)
        {
            return GetAllDeactivatedDrivers(accessToken, groupId);
        }

        public virtual List<Object> GetAssetLocation(NancyContext context, string accessToken, long? assetId, long? startMs, long? endMs)
        {
            return GetAssetLocation(accessToken, assetId, startMs, endMs);
        }

        public virtual AssetReeferResponse GetAssetReefer(NancyContext context, string accessToken, long? assetId, long? startMs, long? endMs)
        {
            return GetAssetReefer(accessToken, assetId, startMs, endMs);
        }

        public virtual Driver GetDeactivatedDriverById(NancyContext context, string accessToken, string driverIdOrExternalId)
        {
            return GetDeactivatedDriverById(accessToken, driverIdOrExternalId);
        }

        public virtual DispatchRoute GetDispatchRouteById(NancyContext context, string accessToken, long? routeId)
        {
            return GetDispatchRouteById(accessToken, routeId);
        }

        public virtual DispatchRouteHistory GetDispatchRouteHistory(NancyContext context, string accessToken, long? routeId, long? startTime, long? endTime)
        {
            return GetDispatchRouteHistory(accessToken, routeId, startTime, endTime);
        }

        public virtual List<DispatchRoute> GetDispatchRoutesByDriverId(NancyContext context, string accessToken, long? driverId, long? endTime, long? duration)
        {
            return GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration);
        }

        public virtual List<DispatchRoute> GetDispatchRoutesByVehicleId(NancyContext context, string accessToken, long? vehicleId, long? endTime, long? duration)
        {
            return GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration);
        }

        public virtual Driver GetDriverById(NancyContext context, string accessToken, string driverIdOrExternalId)
        {
            return GetDriverById(accessToken, driverIdOrExternalId);
        }

        public virtual List<DocumentType> GetDriverDocumentTypesByOrgId(NancyContext context)
        {
            return GetDriverDocumentTypesByOrgId();
        }

        public virtual List<Document> GetDriverDocumentsByOrgId(NancyContext context, string accessToken, long? endMs, long? durationMs)
        {
            return GetDriverDocumentsByOrgId(accessToken, endMs, durationMs);
        }

        public virtual DriverSafetyScoreResponse GetDriverSafetyScore(NancyContext context, long? driverId, string accessToken, long? startMs, long? endMs)
        {
            return GetDriverSafetyScore(driverId, accessToken, startMs, endMs);
        }

        public virtual DvirListResponse GetDvirs(NancyContext context, string accessToken, int? endMs, int? durationMs, int? groupId)
        {
            return GetDvirs(accessToken, endMs, durationMs, groupId);
        }

        public virtual DriversResponse GetFleetDrivers(NancyContext context, string accessToken, InlineObject3 groupDriversParam)
        {
            return GetFleetDrivers(accessToken, groupDriversParam);
        }

        public virtual DriverDailyLogResponse GetFleetDriversHosDailyLogs(NancyContext context, string accessToken, long? driverId, InlineObject6 hosLogsParam)
        {
            return GetFleetDriversHosDailyLogs(accessToken, driverId, hosLogsParam);
        }

        public virtual DriversSummaryResponse GetFleetDriversSummary(NancyContext context, string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds)
        {
            return GetFleetDriversSummary(accessToken, driversSummaryParam, snapToDayBounds);
        }

        public virtual HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs(NancyContext context, string accessToken, InlineObject7 hosAuthenticationLogsParam)
        {
            return GetFleetHosAuthenticationLogs(accessToken, hosAuthenticationLogsParam);
        }

        public virtual HosLogsResponse GetFleetHosLogs(NancyContext context, string accessToken, InlineObject8 hosLogsParam)
        {
            return GetFleetHosLogs(accessToken, hosLogsParam);
        }

        public virtual HosLogsSummaryResponse GetFleetHosLogsSummary(NancyContext context, string accessToken, InlineObject9 hosLogsParam)
        {
            return GetFleetHosLogsSummary(accessToken, hosLogsParam);
        }

        public virtual InlineResponse2003 GetFleetLocations(NancyContext context, string accessToken, InlineObject11 groupParam)
        {
            return GetFleetLocations(accessToken, groupParam);
        }

        public virtual InlineResponse2004 GetFleetMaintenanceList(NancyContext context, string accessToken, InlineObject13 groupParam)
        {
            return GetFleetMaintenanceList(accessToken, groupParam);
        }

        public virtual TripResponse GetFleetTrips(NancyContext context, string accessToken, InlineObject15 tripsParam)
        {
            return GetFleetTrips(accessToken, tripsParam);
        }

        public virtual FleetVehicleResponse GetFleetVehicle(NancyContext context, string accessToken, string vehicleIdOrExternalId)
        {
            return GetFleetVehicle(accessToken, vehicleIdOrExternalId);
        }

        public virtual Address GetOrganizationAddress(NancyContext context, string accessToken, long? addressId)
        {
            return GetOrganizationAddress(accessToken, addressId);
        }

        public virtual List<Address> GetOrganizationAddresses(NancyContext context, string accessToken)
        {
            return GetOrganizationAddresses(accessToken);
        }

        public virtual Contact GetOrganizationContact(NancyContext context, string accessToken, long? contactId)
        {
            return GetOrganizationContact(accessToken, contactId);
        }

        public virtual VehicleHarshEventResponse GetVehicleHarshEvent(NancyContext context, long? vehicleId, string accessToken, long? timestamp)
        {
            return GetVehicleHarshEvent(vehicleId, accessToken, timestamp);
        }

        public virtual List<FleetVehicleLocation> GetVehicleLocations(NancyContext context, string accessToken, long? vehicleId, long? startMs, long? endMs)
        {
            return GetVehicleLocations(accessToken, vehicleId, startMs, endMs);
        }

        public virtual VehicleSafetyScoreResponse GetVehicleSafetyScore(NancyContext context, long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
            return GetVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
        }

        public virtual InlineResponse2005 GetVehicleStats(NancyContext context, string accessToken, int? startMs, int? endMs, GetVehicleStatsSeriesEnum? series, string tagIds, string startingAfter, string endingBefore, long? limit)
        {
            return GetVehicleStats(accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit);
        }

        public virtual List<Object> GetVehiclesLocations(NancyContext context, string accessToken, int? startMs, int? endMs)
        {
            return GetVehiclesLocations(accessToken, startMs, endMs);
        }

        public virtual List<Contact> ListContacts(NancyContext context, string accessToken)
        {
            return ListContacts(accessToken);
        }

        public virtual InlineResponse2002 ListFleet(NancyContext context, string accessToken, InlineObject10 groupParam, string startingAfter, string endingBefore, long? limit)
        {
            return ListFleet(accessToken, groupParam, startingAfter, endingBefore, limit);
        }

        public virtual FleetVehicleResponse PatchFleetVehicle(NancyContext context, string accessToken, string vehicleIdOrExternalId, InlineObject16 data)
        {
            return PatchFleetVehicle(accessToken, vehicleIdOrExternalId, data);
        }

        public virtual Driver ReactivateDriverById(NancyContext context, string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            return ReactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
        }

        public virtual DispatchRoute UpdateDispatchRouteById(NancyContext context, string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
            return UpdateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
        }

        public virtual void UpdateOrganizationAddress(NancyContext context, string accessToken, long? addressId, InlineObject1 address)
        {
            UpdateOrganizationAddress(accessToken, addressId, address);
        }

        public virtual void UpdateVehicles(NancyContext context, string accessToken, InlineObject14 vehicleUpdateParam)
        {
            UpdateVehicles(accessToken, vehicleUpdateParam);
        }

        protected abstract void AddFleetAddress(string accessToken, InlineObject2 addressParam);

        protected abstract List<Address> AddOrganizationAddresses(string accessToken, InlineObject addresses);

        protected abstract DispatchRoute CreateDispatchRoute(string accessToken, DispatchRouteCreate createDispatchRouteParams);

        protected abstract Driver CreateDriver(string accessToken, DriverForCreate createDriverParam);

        protected abstract DispatchRoute CreateDriverDispatchRoute(string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);

        protected abstract Document CreateDriverDocument(string accessToken, long? driverId, DocumentCreate createDocumentParams);

        protected abstract DvirBase CreateDvir(string accessToken, InlineObject12 createDvirParam);

        protected abstract DispatchRoute CreateVehicleDispatchRoute(string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        protected abstract void DeactivateDriver(string accessToken, string driverIdOrExternalId);

        protected abstract void DeleteDispatchRouteById(string accessToken, long? routeId);

        protected abstract void DeleteOrganizationAddress(string accessToken, long? addressId);

        protected abstract List<DispatchRoute> FetchAllDispatchRoutes(string accessToken, long? groupId, long? endTime, long? duration);

        protected abstract AllRouteJobUpdates FetchAllRouteJobUpdates(string accessToken, long? groupId, string sequenceId, string include);

        protected abstract InlineResponse2001 GetAllAssetCurrentLocations(string accessToken, long? groupId);

        protected abstract InlineResponse200 GetAllAssets(string accessToken, long? groupId);

        protected abstract List<Driver> GetAllDeactivatedDrivers(string accessToken, long? groupId);

        protected abstract List<Object> GetAssetLocation(string accessToken, long? assetId, long? startMs, long? endMs);

        protected abstract AssetReeferResponse GetAssetReefer(string accessToken, long? assetId, long? startMs, long? endMs);

        protected abstract Driver GetDeactivatedDriverById(string accessToken, string driverIdOrExternalId);

        protected abstract DispatchRoute GetDispatchRouteById(string accessToken, long? routeId);

        protected abstract DispatchRouteHistory GetDispatchRouteHistory(string accessToken, long? routeId, long? startTime, long? endTime);

        protected abstract List<DispatchRoute> GetDispatchRoutesByDriverId(string accessToken, long? driverId, long? endTime, long? duration);

        protected abstract List<DispatchRoute> GetDispatchRoutesByVehicleId(string accessToken, long? vehicleId, long? endTime, long? duration);

        protected abstract Driver GetDriverById(string accessToken, string driverIdOrExternalId);

        protected abstract List<DocumentType> GetDriverDocumentTypesByOrgId();

        protected abstract List<Document> GetDriverDocumentsByOrgId(string accessToken, long? endMs, long? durationMs);

        protected abstract DriverSafetyScoreResponse GetDriverSafetyScore(long? driverId, string accessToken, long? startMs, long? endMs);

        protected abstract DvirListResponse GetDvirs(string accessToken, int? endMs, int? durationMs, int? groupId);

        protected abstract DriversResponse GetFleetDrivers(string accessToken, InlineObject3 groupDriversParam);

        protected abstract DriverDailyLogResponse GetFleetDriversHosDailyLogs(string accessToken, long? driverId, InlineObject6 hosLogsParam);

        protected abstract DriversSummaryResponse GetFleetDriversSummary(string accessToken, InlineObject5 driversSummaryParam, bool? snapToDayBounds);

        protected abstract HosAuthenticationLogsResponse GetFleetHosAuthenticationLogs(string accessToken, InlineObject7 hosAuthenticationLogsParam);

        protected abstract HosLogsResponse GetFleetHosLogs(string accessToken, InlineObject8 hosLogsParam);

        protected abstract HosLogsSummaryResponse GetFleetHosLogsSummary(string accessToken, InlineObject9 hosLogsParam);

        protected abstract InlineResponse2003 GetFleetLocations(string accessToken, InlineObject11 groupParam);

        protected abstract InlineResponse2004 GetFleetMaintenanceList(string accessToken, InlineObject13 groupParam);

        protected abstract TripResponse GetFleetTrips(string accessToken, InlineObject15 tripsParam);

        protected abstract FleetVehicleResponse GetFleetVehicle(string accessToken, string vehicleIdOrExternalId);

        protected abstract Address GetOrganizationAddress(string accessToken, long? addressId);

        protected abstract List<Address> GetOrganizationAddresses(string accessToken);

        protected abstract Contact GetOrganizationContact(string accessToken, long? contactId);

        protected abstract VehicleHarshEventResponse GetVehicleHarshEvent(long? vehicleId, string accessToken, long? timestamp);

        protected abstract List<FleetVehicleLocation> GetVehicleLocations(string accessToken, long? vehicleId, long? startMs, long? endMs);

        protected abstract VehicleSafetyScoreResponse GetVehicleSafetyScore(long? vehicleId, string accessToken, long? startMs, long? endMs);

        protected abstract InlineResponse2005 GetVehicleStats(string accessToken, int? startMs, int? endMs, GetVehicleStatsSeriesEnum? series, string tagIds, string startingAfter, string endingBefore, long? limit);

        protected abstract List<Object> GetVehiclesLocations(string accessToken, int? startMs, int? endMs);

        protected abstract List<Contact> ListContacts(string accessToken);

        protected abstract InlineResponse2002 ListFleet(string accessToken, InlineObject10 groupParam, string startingAfter, string endingBefore, long? limit);

        protected abstract FleetVehicleResponse PatchFleetVehicle(string accessToken, string vehicleIdOrExternalId, InlineObject16 data);

        protected abstract Driver ReactivateDriverById(string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);

        protected abstract DispatchRoute UpdateDispatchRouteById(string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);

        protected abstract void UpdateOrganizationAddress(string accessToken, long? addressId, InlineObject1 address);

        protected abstract void UpdateVehicles(string accessToken, InlineObject14 vehicleUpdateParam);
    }

}
