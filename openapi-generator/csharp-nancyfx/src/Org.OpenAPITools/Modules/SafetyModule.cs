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
    /// Module processing requests of Safety domain.
    /// </summary>
    public sealed class SafetyModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SafetyModule(SafetyService service) : base("/v1")
        { 
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
        }
    }

    /// <summary>
    /// Service handling Safety requests.
    /// </summary>
    public interface SafetyService
    {
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
        /// Fetch harsh event details for a vehicle.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="vehicleId">ID of the vehicle</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="timestamp">Timestamp in milliseconds representing the timestamp of a harsh event.</param>
        /// <returns>VehicleHarshEventResponse</returns>
        VehicleHarshEventResponse GetVehicleHarshEvent(NancyContext context, long? vehicleId, string accessToken, long? timestamp);

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
    }

    /// <summary>
    /// Abstraction of SafetyService.
    /// </summary>
    public abstract class AbstractSafetyService: SafetyService
    {
        public virtual DriverSafetyScoreResponse GetDriverSafetyScore(NancyContext context, long? driverId, string accessToken, long? startMs, long? endMs)
        {
            return GetDriverSafetyScore(driverId, accessToken, startMs, endMs);
        }

        public virtual VehicleHarshEventResponse GetVehicleHarshEvent(NancyContext context, long? vehicleId, string accessToken, long? timestamp)
        {
            return GetVehicleHarshEvent(vehicleId, accessToken, timestamp);
        }

        public virtual VehicleSafetyScoreResponse GetVehicleSafetyScore(NancyContext context, long? vehicleId, string accessToken, long? startMs, long? endMs)
        {
            return GetVehicleSafetyScore(vehicleId, accessToken, startMs, endMs);
        }

        protected abstract DriverSafetyScoreResponse GetDriverSafetyScore(long? driverId, string accessToken, long? startMs, long? endMs);

        protected abstract VehicleHarshEventResponse GetVehicleHarshEvent(long? vehicleId, string accessToken, long? timestamp);

        protected abstract VehicleSafetyScoreResponse GetVehicleSafetyScore(long? vehicleId, string accessToken, long? startMs, long? endMs);
    }

}
