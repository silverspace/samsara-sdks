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

    /// <summary>
    /// Basic information of an asset
    /// </summary>
    public partial class AssetCurrentLocationsResponse
    {
        /// <summary>
        /// Initializes a new instance of the AssetCurrentLocationsResponse
        /// class.
        /// </summary>
        public AssetCurrentLocationsResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the AssetCurrentLocationsResponse
        /// class.
        /// </summary>
        /// <param name="id">Asset ID</param>
        /// <param name="cable">The cable connected to the asset</param>
        /// <param name="engineHours">Engine hours</param>
        /// <param name="location">Current location of an asset</param>
        /// <param name="name">Asset name</param>
        public AssetCurrentLocationsResponse(long id, IList<AssetCurrentLocationsResponseCableItem> cable = default(IList<AssetCurrentLocationsResponseCableItem>), int? engineHours = default(int?), IList<AssetCurrentLocation> location = default(IList<AssetCurrentLocation>), string name = default(string))
        {
            Cable = cable;
            EngineHours = engineHours;
            Id = id;
            Location = location;
            Name = name;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the cable connected to the asset
        /// </summary>
        [JsonProperty(PropertyName = "cable")]
        public IList<AssetCurrentLocationsResponseCableItem> Cable { get; set; }

        /// <summary>
        /// Gets or sets engine hours
        /// </summary>
        [JsonProperty(PropertyName = "engineHours")]
        public int? EngineHours { get; set; }

        /// <summary>
        /// Gets or sets asset ID
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long Id { get; set; }

        /// <summary>
        /// Gets or sets current location of an asset
        /// </summary>
        [JsonProperty(PropertyName = "location")]
        public IList<AssetCurrentLocation> Location { get; set; }

        /// <summary>
        /// Gets or sets asset name
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
        }
    }
}