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
    /// Module processing requests of Drivers domain.
    /// </summary>
    public sealed class DriversModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public DriversModule(DriversService service) : base("/v1")
        { 
            Post["/fleet/drivers/create"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var createDriverParam = this.Bind<DriverForCreate>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'CreateDriver'");
                
                Preconditions.IsNotNull(createDriverParam, "Required parameter: 'createDriverParam' is missing at 'CreateDriver'");
                
                return service.CreateDriver(Context, accessToken, createDriverParam);
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

            Get["/fleet/drivers/inactive"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAllDeactivatedDrivers'");
                
                return service.GetAllDeactivatedDrivers(Context, accessToken, groupId).ToArray();
            };

            Get["/fleet/drivers/inactive/{driver_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "driverIdOrExternalId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDeactivatedDriverById'");
                
                Preconditions.IsNotNull(driverIdOrExternalId, "Required parameter: 'driverIdOrExternalId' is missing at 'GetDeactivatedDriverById'");
                
                return service.GetDeactivatedDriverById(Context, accessToken, driverIdOrExternalId);
            };

            Get["/fleet/drivers/{driver_id_or_external_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var driverIdOrExternalId = Parameters.ValueOf<string>(parameters, Context.Request, "driverIdOrExternalId", ParameterType.Path);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDriverById'");
                
                Preconditions.IsNotNull(driverIdOrExternalId, "Required parameter: 'driverIdOrExternalId' is missing at 'GetDriverById'");
                
                return service.GetDriverById(Context, accessToken, driverIdOrExternalId);
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
        }
    }

    /// <summary>
    /// Service handling Drivers requests.
    /// </summary>
    public interface DriversService
    {
        /// <summary>
        /// Create a new driver.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="createDriverParam">Driver creation body</param>
        /// <returns>Driver</returns>
        Driver CreateDriver(NancyContext context, string accessToken, DriverForCreate createDriverParam);

        /// <summary>
        /// Deactivate a driver with the given id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns></returns>
        void DeactivateDriver(NancyContext context, string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// Fetch all deactivated drivers for the group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <returns>List&lt;Driver&gt;</returns>
        List<Driver> GetAllDeactivatedDrivers(NancyContext context, string accessToken, long? groupId);

        /// <summary>
        /// Fetch deactivated driver by id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDeactivatedDriverById(NancyContext context, string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// Fetch driver by id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <returns>Driver</returns>
        Driver GetDriverById(NancyContext context, string accessToken, string driverIdOrExternalId);

        /// <summary>
        /// Reactivate the inactive driver having id.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="driverIdOrExternalId">ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.</param>
        /// <param name="reactivateDriverParam"></param>
        /// <returns>Driver</returns>
        Driver ReactivateDriverById(NancyContext context, string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);
    }

    /// <summary>
    /// Abstraction of DriversService.
    /// </summary>
    public abstract class AbstractDriversService: DriversService
    {
        public virtual Driver CreateDriver(NancyContext context, string accessToken, DriverForCreate createDriverParam)
        {
            return CreateDriver(accessToken, createDriverParam);
        }

        public virtual void DeactivateDriver(NancyContext context, string accessToken, string driverIdOrExternalId)
        {
            DeactivateDriver(accessToken, driverIdOrExternalId);
        }

        public virtual List<Driver> GetAllDeactivatedDrivers(NancyContext context, string accessToken, long? groupId)
        {
            return GetAllDeactivatedDrivers(accessToken, groupId);
        }

        public virtual Driver GetDeactivatedDriverById(NancyContext context, string accessToken, string driverIdOrExternalId)
        {
            return GetDeactivatedDriverById(accessToken, driverIdOrExternalId);
        }

        public virtual Driver GetDriverById(NancyContext context, string accessToken, string driverIdOrExternalId)
        {
            return GetDriverById(accessToken, driverIdOrExternalId);
        }

        public virtual Driver ReactivateDriverById(NancyContext context, string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam)
        {
            return ReactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam);
        }

        protected abstract Driver CreateDriver(string accessToken, DriverForCreate createDriverParam);

        protected abstract void DeactivateDriver(string accessToken, string driverIdOrExternalId);

        protected abstract List<Driver> GetAllDeactivatedDrivers(string accessToken, long? groupId);

        protected abstract Driver GetDeactivatedDriverById(string accessToken, string driverIdOrExternalId);

        protected abstract Driver GetDriverById(string accessToken, string driverIdOrExternalId);

        protected abstract Driver ReactivateDriverById(string accessToken, string driverIdOrExternalId, InlineObject4 reactivateDriverParam);
    }

}
