// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class AssetCableItem
    {
        /// <summary>
        /// Initializes a new instance of the AssetCableItem class.
        /// </summary>
        public AssetCableItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AssetCableItem class.
        /// </summary>
        /// <param name="assetType">Asset type</param>
        public AssetCableItem(string assetType = default(string))
        {
            AssetType = assetType;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets asset type
        /// </summary>
        [JsonProperty(PropertyName = "assetType")]
        public string AssetType { get; set; }

    }
}