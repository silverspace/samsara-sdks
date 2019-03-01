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
    /// Module processing requests of Routes domain.
    /// </summary>
    public sealed class RoutesModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public RoutesModule(RoutesService service) : base("/v1")
        { 
            Post["/fleet/dispatch/routes"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var createDispatchRouteParams = this.Bind<DispatchRouteCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateDispatchRoute'");
                
                Preconditions.IsNotNull(createDispatchRouteParams, "Required parameter: 'createDispatchRouteParams' is missing at 'CreateDispatchRoute'");
                
                return service.CreateDispatchRoute(Context, accessToken, createDispatchRouteParams);
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

            Delete["/fleet/dispatch/routes/{route_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var routeId = Parameters.ValueOf<long?>(parameters, Context.Request, "routeId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'DeleteDispatchRouteById'");
                
                Preconditions.IsNotNull(routeId, "Required parameter: 'routeId' is missing at 'DeleteDispatchRouteById'");
                
                service.DeleteDispatchRouteById(Context, accessToken, routeId);
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
        }
    }

    /// <summary>
    /// Service handling Routes requests.
    /// </summary>
    public interface RoutesService
    {
        /// <summary>
        /// Create a new dispatch route.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateDispatchRoute(NancyContext context, string accessToken, DispatchRouteCreate createDispatchRouteParams);

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
        /// Create a new dispatch route for the vehicle with vehicle_id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="vehicleId">ID of the vehicle with the associated routes.</param>
        /// <param name="createDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute CreateVehicleDispatchRoute(NancyContext context, string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        /// <summary>
        /// Delete a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <returns></returns>
        void DeleteDispatchRouteById(NancyContext context, string accessToken, long? routeId);

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
        /// Update a dispatch route and its associated jobs.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="routeId">ID of the dispatch route.</param>
        /// <param name="updateDispatchRouteParams"></param>
        /// <returns>DispatchRoute</returns>
        DispatchRoute UpdateDispatchRouteById(NancyContext context, string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);
    }

    /// <summary>
    /// Abstraction of RoutesService.
    /// </summary>
    public abstract class AbstractRoutesService: RoutesService
    {
        public virtual DispatchRoute CreateDispatchRoute(NancyContext context, string accessToken, DispatchRouteCreate createDispatchRouteParams)
        {
            return CreateDispatchRoute(accessToken, createDispatchRouteParams);
        }

        public virtual DispatchRoute CreateDriverDispatchRoute(NancyContext context, string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams)
        {
            return CreateDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams);
        }

        public virtual DispatchRoute CreateVehicleDispatchRoute(NancyContext context, string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams)
        {
            return CreateVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams);
        }

        public virtual void DeleteDispatchRouteById(NancyContext context, string accessToken, long? routeId)
        {
            DeleteDispatchRouteById(accessToken, routeId);
        }

        public virtual List<DispatchRoute> FetchAllDispatchRoutes(NancyContext context, string accessToken, long? groupId, long? endTime, long? duration)
        {
            return FetchAllDispatchRoutes(accessToken, groupId, endTime, duration);
        }

        public virtual AllRouteJobUpdates FetchAllRouteJobUpdates(NancyContext context, string accessToken, long? groupId, string sequenceId, string include)
        {
            return FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include);
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

        public virtual DispatchRoute UpdateDispatchRouteById(NancyContext context, string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams)
        {
            return UpdateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams);
        }

        protected abstract DispatchRoute CreateDispatchRoute(string accessToken, DispatchRouteCreate createDispatchRouteParams);

        protected abstract DispatchRoute CreateDriverDispatchRoute(string accessToken, long? driverId, DispatchRouteCreate createDispatchRouteParams);

        protected abstract DispatchRoute CreateVehicleDispatchRoute(string accessToken, long? vehicleId, DispatchRouteCreate createDispatchRouteParams);

        protected abstract void DeleteDispatchRouteById(string accessToken, long? routeId);

        protected abstract List<DispatchRoute> FetchAllDispatchRoutes(string accessToken, long? groupId, long? endTime, long? duration);

        protected abstract AllRouteJobUpdates FetchAllRouteJobUpdates(string accessToken, long? groupId, string sequenceId, string include);

        protected abstract DispatchRoute GetDispatchRouteById(string accessToken, long? routeId);

        protected abstract DispatchRouteHistory GetDispatchRouteHistory(string accessToken, long? routeId, long? startTime, long? endTime);

        protected abstract List<DispatchRoute> GetDispatchRoutesByDriverId(string accessToken, long? driverId, long? endTime, long? duration);

        protected abstract List<DispatchRoute> GetDispatchRoutesByVehicleId(string accessToken, long? vehicleId, long? endTime, long? duration);

        protected abstract DispatchRoute UpdateDispatchRouteById(string accessToken, long? routeId, DispatchRoute updateDispatchRouteParams);
    }

}
