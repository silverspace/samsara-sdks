// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class GetAllAssetCurrentLocationsOKResponse
    {
        /// <summary>
        /// Initializes a new instance of the
        /// GetAllAssetCurrentLocationsOKResponse class.
        /// </summary>
        public GetAllAssetCurrentLocationsOKResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// GetAllAssetCurrentLocationsOKResponse class.
        /// </summary>
        public GetAllAssetCurrentLocationsOKResponse(IList<AssetCurrentLocationsResponse> assets = default(IList<AssetCurrentLocationsResponse>))
        {
            Assets = assets;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "assets")]
        public IList<AssetCurrentLocationsResponse> Assets { get; set; }

    }
}