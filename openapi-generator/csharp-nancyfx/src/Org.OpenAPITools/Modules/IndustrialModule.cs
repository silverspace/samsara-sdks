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
    /// Module processing requests of Industrial domain.
    /// </summary>
    public sealed class IndustrialModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public IndustrialModule(IndustrialService service) : base("/v1")
        { 
            Get["/industrial/data"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupId = Parameters.ValueOf<long?>(parameters, Context.Request, "groupId", ParameterType.Query);
                var startMs = Parameters.ValueOf<long?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetAllDataInputs'");
                
                return service.GetAllDataInputs(Context, accessToken, groupId, startMs, endMs);
            };

            Get["/industrial/data/{data_input_id}"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var dataInputId = Parameters.ValueOf<long?>(parameters, Context.Request, "dataInputId", ParameterType.Path);
                var startMs = Parameters.ValueOf<long?>(parameters, Context.Request, "startMs", ParameterType.Query);
                var endMs = Parameters.ValueOf<long?>(parameters, Context.Request, "endMs", ParameterType.Query);
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetDataInput'");
                
                Preconditions.IsNotNull(dataInputId, "Required parameter: 'dataInputId' is missing at 'GetDataInput'");
                
                return service.GetDataInput(Context, accessToken, dataInputId, startMs, endMs);
            };

            Post["/machines/list"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var groupParam = this.Bind<InlineObject18>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetMachines'");
                
                Preconditions.IsNotNull(groupParam, "Required parameter: 'groupParam' is missing at 'GetMachines'");
                
                return service.GetMachines(Context, accessToken, groupParam);
            };

            Post["/machines/history"] = parameters =>
            {
                var accessToken = Parameters.ValueOf<string>(parameters, Context.Request, "accessToken", ParameterType.Query);
                var historyParam = this.Bind<InlineObject17>();
                Preconditions.IsNotNull(accessToken, "Required parameter: 'accessToken' is missing at 'GetMachinesHistory'");
                
                Preconditions.IsNotNull(historyParam, "Required parameter: 'historyParam' is missing at 'GetMachinesHistory'");
                
                return service.GetMachinesHistory(Context, accessToken, historyParam);
            };
        }
    }

    /// <summary>
    /// Service handling Industrial requests.
    /// </summary>
    public interface IndustrialService
    {
        /// <summary>
        /// Fetch all of the data inputs for a group.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupId">Optional group ID if the organization has multiple groups (uncommon). (optional)</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>InlineResponse2006</returns>
        InlineResponse2006 GetAllDataInputs(NancyContext context, string accessToken, long? groupId, long? startMs, long? endMs);

        /// <summary>
        /// Fetch datapoints from a given data input.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="dataInputId">ID of the data input</param>
        /// <param name="startMs">Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)</param>
        /// <param name="endMs">Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)</param>
        /// <returns>DataInputHistoryResponse</returns>
        DataInputHistoryResponse GetDataInput(NancyContext context, string accessToken, long? dataInputId, long? startMs, long? endMs);

        /// <summary>
        /// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="groupParam"></param>
        /// <returns>InlineResponse2007</returns>
        InlineResponse2007 GetMachines(NancyContext context, string accessToken, InlineObject18 groupParam);

        /// <summary>
        /// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="accessToken">Samsara API access token.</param>
        /// <param name="historyParam"></param>
        /// <returns>MachineHistoryResponse</returns>
        MachineHistoryResponse GetMachinesHistory(NancyContext context, string accessToken, InlineObject17 historyParam);
    }

    /// <summary>
    /// Abstraction of IndustrialService.
    /// </summary>
    public abstract class AbstractIndustrialService: IndustrialService
    {
        public virtual InlineResponse2006 GetAllDataInputs(NancyContext context, string accessToken, long? groupId, long? startMs, long? endMs)
        {
            return GetAllDataInputs(accessToken, groupId, startMs, endMs);
        }

        public virtual DataInputHistoryResponse GetDataInput(NancyContext context, string accessToken, long? dataInputId, long? startMs, long? endMs)
        {
            return GetDataInput(accessToken, dataInputId, startMs, endMs);
        }

        public virtual InlineResponse2007 GetMachines(NancyContext context, string accessToken, InlineObject18 groupParam)
        {
            return GetMachines(accessToken, groupParam);
        }

        public virtual MachineHistoryResponse GetMachinesHistory(NancyContext context, string accessToken, InlineObject17 historyParam)
        {
            return GetMachinesHistory(accessToken, historyParam);
        }

        protected abstract InlineResponse2006 GetAllDataInputs(string accessToken, long? groupId, long? startMs, long? endMs);

        protected abstract DataInputHistoryResponse GetDataInput(string accessToken, long? dataInputId, long? startMs, long? endMs);

        protected abstract InlineResponse2007 GetMachines(string accessToken, InlineObject18 groupParam);

        protected abstract MachineHistoryResponse GetMachinesHistory(string accessToken, InlineObject17 historyParam);
    }

}
