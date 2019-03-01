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
    /// Contains the location, in latitude and longitude, of a vehicle.
    /// </summary>
    public partial class VehicleLocation
    {
        /// <summary>
        /// Initializes a new instance of the VehicleLocation class.
        /// </summary>
        public VehicleLocation()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the VehicleLocation class.
        /// </summary>
        /// <param name="id">ID of the vehicle.</param>
        /// <param name="heading">Heading in degrees.</param>
        /// <param name="latitude">Latitude in decimal degrees.</param>
        /// <param name="location">Text representation of nearest identifiable
        /// location to (latitude, longitude) coordinates.</param>
        /// <param name="longitude">Longitude in decimal degrees.</param>
        /// <param name="name">Name of the vehicle.</param>
        /// <param name="odometerMeters">The number of meters reported by the
        /// odometer.</param>
        /// <param name="onTrip">Whether or not a trip is currently in progress
        /// for this vehicle. More information available via /fleet/trips
        /// endpoint.</param>
        /// <param name="speed">Speed in miles per hour.</param>
        /// <param name="time">The time the reported location was logged,
        /// reported as a UNIX timestamp in milliseconds.</param>
        /// <param name="vin">Vehicle Identification Number (VIN) of the
        /// vehicle.</param>
        public VehicleLocation(long id, double? heading = default(double?), double? latitude = default(double?), string location = default(string), double? longitude = default(double?), string name = default(string), long? odometerMeters = default(long?), bool? onTrip = default(bool?), double? speed = default(double?), int? time = default(int?), string vin = default(string))
        {
            Heading = heading;
            Id = id;
            Latitude = latitude;
            Location = location;
            Longitude = longitude;
            Name = name;
            OdometerMeters = odometerMeters;
            OnTrip = onTrip;
            Speed = speed;
            Time = time;
            Vin = vin;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets heading in degrees.
        /// </summary>
        [JsonProperty(PropertyName = "heading")]
        public double? Heading { get; set; }

        /// <summary>
        /// Gets or sets ID of the vehicle.
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public long Id { get; set; }

        /// <summary>
        /// Gets or sets latitude in decimal degrees.
        /// </summary>
        [JsonProperty(PropertyName = "latitude")]
        public double? Latitude { get; set; }

        /// <summary>
        /// Gets or sets text representation of nearest identifiable location
        /// to (latitude, longitude) coordinates.
        /// </summary>
        [JsonProperty(PropertyName = "location")]
        public string Location { get; set; }

        /// <summary>
        /// Gets or sets longitude in decimal degrees.
        /// </summary>
        [JsonProperty(PropertyName = "longitude")]
        public double? Longitude { get; set; }

        /// <summary>
        /// Gets or sets name of the vehicle.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the number of meters reported by the odometer.
        /// </summary>
        [JsonProperty(PropertyName = "odometerMeters")]
        public long? OdometerMeters { get; set; }

        /// <summary>
        /// Gets or sets whether or not a trip is currently in progress for
        /// this vehicle. More information available via /fleet/trips endpoint.
        /// </summary>
        [JsonProperty(PropertyName = "onTrip")]
        public bool? OnTrip { get; set; }

        /// <summary>
        /// Gets or sets speed in miles per hour.
        /// </summary>
        [JsonProperty(PropertyName = "speed")]
        public double? Speed { get; set; }

        /// <summary>
        /// Gets or sets the time the reported location was logged, reported as
        /// a UNIX timestamp in milliseconds.
        /// </summary>
        [JsonProperty(PropertyName = "time")]
        public int? Time { get; set; }

        /// <summary>
        /// Gets or sets vehicle Identification Number (VIN) of the vehicle.
        /// </summary>
        [JsonProperty(PropertyName = "vin")]
        public string Vin { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Microsoft.Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            //Nothing to validate
        }
    }
}
