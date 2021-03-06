// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class AssetReeferResponseReeferStatsPowerStatusItem
    {
        /// <summary>
        /// Initializes a new instance of the
        /// AssetReeferResponseReeferStatsPowerStatusItem class.
        /// </summary>
        public AssetReeferResponseReeferStatsPowerStatusItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// AssetReeferResponseReeferStatsPowerStatusItem class.
        /// </summary>
        /// <param name="changedAtMs">Timestamp in Unix milliseconds since
        /// epoch.</param>
        /// <param name="status">Power status of the reefer.</param>
        public AssetReeferResponseReeferStatsPowerStatusItem(long? changedAtMs = default(long?), string status = default(string))
        {
            ChangedAtMs = changedAtMs;
            Status = status;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets timestamp in Unix milliseconds since epoch.
        /// </summary>
        [JsonProperty(PropertyName = "changedAtMs")]
        public long? ChangedAtMs { get; set; }

        /// <summary>
        /// Gets or sets power status of the reefer.
        /// </summary>
        [JsonProperty(PropertyName = "status")]
        public string Status { get; set; }

    }
}
