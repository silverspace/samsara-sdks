// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Contains the location and speed of a vehicle at a particular time
    /// </summary>
    public partial class FleetVehicleLocation
    {
        /// <summary>
        /// Initializes a new instance of the FleetVehicleLocation class.
        /// </summary>
        public FleetVehicleLocation()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the FleetVehicleLocation class.
        /// </summary>
        /// <param name="latitude">The latitude of the location in
        /// degrees.</param>
        /// <param name="location">The best effort (street,city,state) for the
        /// latitude and longitude.</param>
        /// <param name="longitude">The longitude of the location in
        /// degrees.</param>
        /// <param name="speedMilesPerHour">The speed calculated from GPS that
        /// the asset was traveling at in miles per hour.</param>
        /// <param name="timeMs">Time in Unix milliseconds since epoch when the
        /// asset was at the location.</param>
        public FleetVehicleLocation(double? latitude = default(double?), string location = default(string), double? longitude = default(double?), double? speedMilesPerHour = default(double?), double? timeMs = default(double?))
        {
            Latitude = latitude;
            Location = location;
            Longitude = longitude;
            SpeedMilesPerHour = speedMilesPerHour;
            TimeMs = timeMs;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the latitude of the location in degrees.
        /// </summary>
        [JsonProperty(PropertyName = "latitude")]
        public double? Latitude { get; set; }

        /// <summary>
        /// Gets or sets the best effort (street,city,state) for the latitude
        /// and longitude.
        /// </summary>
        [JsonProperty(PropertyName = "location")]
        public string Location { get; set; }

        /// <summary>
        /// Gets or sets the longitude of the location in degrees.
        /// </summary>
        [JsonProperty(PropertyName = "longitude")]
        public double? Longitude { get; set; }

        /// <summary>
        /// Gets or sets the speed calculated from GPS that the asset was
        /// traveling at in miles per hour.
        /// </summary>
        [JsonProperty(PropertyName = "speedMilesPerHour")]
        public double? SpeedMilesPerHour { get; set; }

        /// <summary>
        /// Gets or sets time in Unix milliseconds since epoch when the asset
        /// was at the location.
        /// </summary>
        [JsonProperty(PropertyName = "timeMs")]
        public double? TimeMs { get; set; }

    }
}
