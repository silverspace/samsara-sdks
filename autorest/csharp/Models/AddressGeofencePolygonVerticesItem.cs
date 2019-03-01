// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class AddressGeofencePolygonVerticesItem
    {
        /// <summary>
        /// Initializes a new instance of the
        /// AddressGeofencePolygonVerticesItem class.
        /// </summary>
        public AddressGeofencePolygonVerticesItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// AddressGeofencePolygonVerticesItem class.
        /// </summary>
        /// <param name="latitude">The longitude of a geofence vertex</param>
        /// <param name="longitude">The longitude of a geofence vertex</param>
        public AddressGeofencePolygonVerticesItem(double? latitude = default(double?), double? longitude = default(double?))
        {
            Latitude = latitude;
            Longitude = longitude;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the longitude of a geofence vertex
        /// </summary>
        [JsonProperty(PropertyName = "latitude")]
        public double? Latitude { get; set; }

        /// <summary>
        /// Gets or sets the longitude of a geofence vertex
        /// </summary>
        [JsonProperty(PropertyName = "longitude")]
        public double? Longitude { get; set; }

    }
}
