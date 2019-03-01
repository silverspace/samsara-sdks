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
    /// Module processing requests of Assets domain.
    /// </summary>
    public sealed class AssetsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public AssetsModule(AssetsService service) : base("/v1")
        { 
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
        }
    }

    /// <summary>
    /// Service handling Assets requests.
    /// </summary>
    public interface AssetsService
    {
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
    }

    /// <summary>
    /// Abstraction of AssetsService.
    /// </summary>
    public abstract class AbstractAssetsService: AssetsService
    {
        public virtual InlineResponse2001 GetAllAssetCurrentLocations(NancyContext context, string accessToken, long? groupId)
        {
            return GetAllAssetCurrentLocations(accessToken, groupId);
        }

        public virtual InlineResponse200 GetAllAssets(NancyContext context, string accessToken, long? groupId)
        {
            return GetAllAssets(accessToken, groupId);
        }

        public virtual List<Object> GetAssetLocation(NancyContext context, string accessToken, long? assetId, long? startMs, long? endMs)
        {
            return GetAssetLocation(accessToken, assetId, startMs, endMs);
        }

        public virtual AssetReeferResponse GetAssetReefer(NancyContext context, string accessToken, long? assetId, long? startMs, long? endMs)
        {
            return GetAssetReefer(accessToken, assetId, startMs, endMs);
        }

        protected abstract InlineResponse2001 GetAllAssetCurrentLocations(string accessToken, long? groupId);

        protected abstract InlineResponse200 GetAllAssets(string accessToken, long? groupId);

        protected abstract List<Object> GetAssetLocation(string accessToken, long? assetId, long? startMs, long? endMs);

        protected abstract AssetReeferResponse GetAssetReefer(string accessToken, long? assetId, long? startMs, long? endMs);
    }

}
