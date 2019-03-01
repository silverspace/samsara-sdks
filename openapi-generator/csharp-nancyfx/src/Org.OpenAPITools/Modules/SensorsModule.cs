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
    /// Module processing requests of Sensors domain.
    /// </summary>
    public sealed class SensorsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public SensorsModule(SensorsService service) : base("/v1")
        { 
            Post["/sensors/list"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupParam = this.Bind<InlineObject23>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetSensors'");
                
                Preconditions.IsNotNull(groupParam, "Required parameter: 'groupParam' is missing at 'GetSensors'");
                
                return service.GetSensors(Context, accessToken, groupParam);
            };

            Post["/sensors/cargo"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var sensorParam = this.Bind<InlineObject19>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetSensorsCargo'");
                
                Preconditions.IsNotNull(sensorParam, "Required parameter: 'sensorParam' is missing at 'GetSensorsCargo'");
                
                return service.GetSensorsCargo(Context, accessToken, sensorParam);
            };

            Post["/sensors/door"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var sensorParam = this.Bind<InlineObject20>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetSensorsDoor'");
                
                Preconditions.IsNotNull(sensorParam, "Required parameter: 'sensorParam' is missing at 'GetSensorsDoor'");
                
                return service.GetSensorsDoor(Context, accessToken, sensorParam);
            };

            Post["/sensors/history"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var historyParam = this.Bind<InlineObject21>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetSensorsHistory'");
                
                Preconditions.IsNotNull(historyParam, "Required parameter: 'historyParam' is missing at 'GetSensorsHistory'");
                
                return service.GetSensorsHistory(Context, accessToken, historyParam);
            };

            Post["/sensors/humidity"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var sensorParam = this.Bind<InlineObject22>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetSensorsHumidity'");
                
                Preconditions.IsNotNull(sensorParam, "Required parameter: 'sensorParam' is missing at 'GetSensorsHumidity'");
                
                return service.GetSensorsHumidity(Context, accessToken, sensorParam);
            };

            Post["/sensors/temperature"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var sensorParam = this.Bind<InlineObject24>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetSensorsTemperature'");
                
                Preconditions.IsNotNull(sensorParam, "Required parameter: 'sensorParam' is missing at 'GetSensorsTemperature'");
                
                return service.GetSensorsTemperature(Context, accessToken, sensorParam);
            };
        }
    }

    /// <summary>
    /// Service handling Sensors requests.
    /// </summary>
    public interface SensorsService
    {
        /// <summary>
        /// Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2008</returns>
        InlineResponse2008 GetSensors(NancyContext context, string accessToken, InlineObject23 groupParam);

        /// <summary>
        /// Get cargo monitor status (empty / full) for requested sensors.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>CargoResponse</returns>
        CargoResponse GetSensorsCargo(NancyContext context, string accessToken, InlineObject19 sensorParam);

        /// <summary>
        /// Get door monitor status (closed / open) for requested sensors.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>DoorResponse</returns>
        DoorResponse GetSensorsDoor(NancyContext context, string accessToken, InlineObject20 sensorParam);

        /// <summary>
        /// Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>SensorHistoryResponse</returns>
        SensorHistoryResponse GetSensorsHistory(NancyContext context, string accessToken, InlineObject21 historyParam);

        /// <summary>
        /// Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>HumidityResponse</returns>
        HumidityResponse GetSensorsHumidity(NancyContext context, string accessToken, InlineObject22 sensorParam);

        /// <summary>
        /// Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="sensorParam"></param>
        /// <returns>TemperatureResponse</returns>
        TemperatureResponse GetSensorsTemperature(NancyContext context, string accessToken, InlineObject24 sensorParam);
    }

    /// <summary>
    /// Abstraction of SensorsService.
    /// </summary>
    public abstract class AbstractSensorsService: SensorsService
    {
        public virtual InlineResponse2008 GetSensors(NancyContext context, string accessToken, InlineObject23 groupParam)
        {
            return GetSensors(accessToken, groupParam);
        }

        public virtual CargoResponse GetSensorsCargo(NancyContext context, string accessToken, InlineObject19 sensorParam)
        {
            return GetSensorsCargo(accessToken, sensorParam);
        }

        public virtual DoorResponse GetSensorsDoor(NancyContext context, string accessToken, InlineObject20 sensorParam)
        {
            return GetSensorsDoor(accessToken, sensorParam);
        }

        public virtual SensorHistoryResponse GetSensorsHistory(NancyContext context, string accessToken, InlineObject21 historyParam)
        {
            return GetSensorsHistory(accessToken, historyParam);
        }

        public virtual HumidityResponse GetSensorsHumidity(NancyContext context, string accessToken, InlineObject22 sensorParam)
        {
            return GetSensorsHumidity(accessToken, sensorParam);
        }

        public virtual TemperatureResponse GetSensorsTemperature(NancyContext context, string accessToken, InlineObject24 sensorParam)
        {
            return GetSensorsTemperature(accessToken, sensorParam);
        }

        protected abstract InlineResponse2008 GetSensors(string accessToken, InlineObject23 groupParam);

        protected abstract CargoResponse GetSensorsCargo(string accessToken, InlineObject19 sensorParam);

        protected abstract DoorResponse GetSensorsDoor(string accessToken, InlineObject20 sensorParam);

        protected abstract SensorHistoryResponse GetSensorsHistory(string accessToken, InlineObject21 historyParam);

        protected abstract HumidityResponse GetSensorsHumidity(string accessToken, InlineObject22 sensorParam);

        protected abstract TemperatureResponse GetSensorsTemperature(string accessToken, InlineObject24 sensorParam);
    }

}
