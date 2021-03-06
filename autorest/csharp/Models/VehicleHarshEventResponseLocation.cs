// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class VehicleHarshEventResponseLocation
    {
        /// <summary>
        /// Initializes a new instance of the VehicleHarshEventResponseLocation
        /// class.
        /// </summary>
        public VehicleHarshEventResponseLocation()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the VehicleHarshEventResponseLocation
        /// class.
        /// </summary>
        /// <param name="address">Address of location where the harsh event
        /// occurred</param>
        /// <param name="latitude">Latitude of location where the harsh event
        /// occurred</param>
        /// <param name="longitude">Longitude of location where the harsh event
        /// occurred</param>
        public VehicleHarshEventResponseLocation(string address = default(string), string latitude = default(string), string longitude = default(string))
        {
            Address = address;
            Latitude = latitude;
            Longitude = longitude;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets address of location where the harsh event occurred
        /// </summary>
        [JsonProperty(PropertyName = "address")]
        public string Address { get; set; }

        /// <summary>
        /// Gets or sets latitude of location where the harsh event occurred
        /// </summary>
        [JsonProperty(PropertyName = "latitude")]
        public string Latitude { get; set; }

        /// <summary>
        /// Gets or sets longitude of location where the harsh event occurred
        /// </summary>
        [JsonProperty(PropertyName = "longitude")]
        public string Longitude { get; set; }

    }
}
