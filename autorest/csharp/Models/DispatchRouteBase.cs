// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    public partial class DispatchRouteBase
    {
        /// <summary>
        /// Initializes a new instance of the DispatchRouteBase class.
        /// </summary>
        public DispatchRouteBase()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DispatchRouteBase class.
        /// </summary>
        /// <param name="name">Descriptive name of this route.</param>
        /// <param name="scheduledEndMs">The time in Unix epoch milliseconds
        /// that the last job in the route is scheduled to end.</param>
        /// <param name="scheduledStartMs">The time in Unix epoch milliseconds
        /// that the route is scheduled to start.</param>
        /// <param name="actualEndMs">The time in Unix epoch milliseconds that
        /// the route actually ended.</param>
        /// <param name="actualStartMs">The time in Unix epoch milliseconds
        /// that the route actually started.</param>
        /// <param name="driverId">ID of the driver assigned to the dispatch
        /// route. Note that driver_id and vehicle_id are mutually exclusive.
        /// If neither is specified, then the route is unassigned.</param>
        /// <param name="groupId">ID of the group if the organization has
        /// multiple groups (optional).</param>
        /// <param name="scheduledMeters">The distance expected to be traveled
        /// for this route in meters.</param>
        /// <param name="startLocationAddress">The address of the route's
        /// starting location, as it would be recognized if provided to
        /// maps.google.com. Optional if a valid start location address ID is
        /// provided.</param>
        /// <param name="startLocationAddressId">ID of the start location
        /// associated with an address book entry. Optional if valid values are
        /// provided for start location address or latitude/longitude. If a
        /// valid start location address ID is provided,
        /// address/latitude/longitude will be used from the address book
        /// entry. Name of the address book entry will only be used if the
        /// start location name is not provided.</param>
        /// <param name="startLocationLat">Latitude of the start location in
        /// decimal degrees. Optional if a valid start location address ID is
        /// provided.</param>
        /// <param name="startLocationLng">Longitude of the start location in
        /// decimal degrees. Optional if a valid start location address ID is
        /// provided.</param>
        /// <param name="startLocationName">The name of the route's starting
        /// location. If provided, it will take precedence over the name of the
        /// address book entry.</param>
        /// <param name="trailerId">ID of the trailer assigned to the dispatch
        /// route. Note that trailers can only be assigned to routes that have
        /// a Vehicle or Driver assigned to them.</param>
        /// <param name="vehicleId">ID of the vehicle assigned to the dispatch
        /// route. Note that vehicle_id and driver_id are mutually exclusive.
        /// If neither is specified, then the route is unassigned.</param>
        public DispatchRouteBase(string name, long scheduledEndMs, long scheduledStartMs, long? actualEndMs = default(long?), long? actualStartMs = default(long?), long? driverId = default(long?), long? groupId = default(long?), long? scheduledMeters = default(long?), string startLocationAddress = default(string), long? startLocationAddressId = default(long?), double? startLocationLat = default(double?), double? startLocationLng = default(double?), string startLocationName = default(string), long? trailerId = default(long?), long? vehicleId = default(long?))
        {
            ActualEndMs = actualEndMs;
            ActualStartMs = actualStartMs;
            DriverId = driverId;
            GroupId = groupId;
            Name = name;
            ScheduledEndMs = scheduledEndMs;
            ScheduledMeters = scheduledMeters;
            ScheduledStartMs = scheduledStartMs;
            StartLocationAddress = startLocationAddress;
            StartLocationAddressId = startLocationAddressId;
            StartLocationLat = startLocationLat;
            StartLocationLng = startLocationLng;
            StartLocationName = startLocationName;
            TrailerId = trailerId;
            VehicleId = vehicleId;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the time in Unix epoch milliseconds that the route
        /// actually ended.
        /// </summary>
        [JsonProperty(PropertyName = "actual_end_ms")]
        public long? ActualEndMs { get; set; }

        /// <summary>
        /// Gets or sets the time in Unix epoch milliseconds that the route
        /// actually started.
        /// </summary>
        [JsonProperty(PropertyName = "actual_start_ms")]
        public long? ActualStartMs { get; set; }

        /// <summary>
        /// Gets or sets ID of the driver assigned to the dispatch route. Note
        /// that driver_id and vehicle_id are mutually exclusive. If neither is
        /// specified, then the route is unassigned.
        /// </summary>
        [JsonProperty(PropertyName = "driver_id")]
        public long? DriverId { get; set; }

        /// <summary>
        /// Gets or sets ID of the group if the organization has multiple
        /// groups (optional).
        /// </summary>
        [JsonProperty(PropertyName = "group_id")]
        public long? GroupId { get; set; }

        /// <summary>
        /// Gets or sets descriptive name of this route.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the time in Unix epoch milliseconds that the last job
        /// in the route is scheduled to end.
        /// </summary>
        [JsonProperty(PropertyName = "scheduled_end_ms")]
        public long ScheduledEndMs { get; set; }

        /// <summary>
        /// Gets or sets the distance expected to be traveled for this route in
        /// meters.
        /// </summary>
        [JsonProperty(PropertyName = "scheduled_meters")]
        public long? ScheduledMeters { get; set; }

        /// <summary>
        /// Gets or sets the time in Unix epoch milliseconds that the route is
        /// scheduled to start.
        /// </summary>
        [JsonProperty(PropertyName = "scheduled_start_ms")]
        public long ScheduledStartMs { get; set; }

        /// <summary>
        /// Gets or sets the address of the route's starting location, as it
        /// would be recognized if provided to maps.google.com. Optional if a
        /// valid start location address ID is provided.
        /// </summary>
        [JsonProperty(PropertyName = "start_location_address")]
        public string StartLocationAddress { get; set; }

        /// <summary>
        /// Gets or sets ID of the start location associated with an address
        /// book entry. Optional if valid values are provided for start
        /// location address or latitude/longitude. If a valid start location
        /// address ID is provided, address/latitude/longitude will be used
        /// from the address book entry. Name of the address book entry will
        /// only be used if the start location name is not provided.
        /// </summary>
        [JsonProperty(PropertyName = "start_location_address_id")]
        public long? StartLocationAddressId { get; set; }

        /// <summary>
        /// Gets or sets latitude of the start location in decimal degrees.
        /// Optional if a valid start location address ID is provided.
        /// </summary>
        [JsonProperty(PropertyName = "start_location_lat")]
        public double? StartLocationLat { get; set; }

        /// <summary>
        /// Gets or sets longitude of the start location in decimal degrees.
        /// Optional if a valid start location address ID is provided.
        /// </summary>
        [JsonProperty(PropertyName = "start_location_lng")]
        public double? StartLocationLng { get; set; }

        /// <summary>
        /// Gets or sets the name of the route's starting location. If
        /// provided, it will take precedence over the name of the address book
        /// entry.
        /// </summary>
        [JsonProperty(PropertyName = "start_location_name")]
        public string StartLocationName { get; set; }

        /// <summary>
        /// Gets or sets ID of the trailer assigned to the dispatch route. Note
        /// that trailers can only be assigned to routes that have a Vehicle or
        /// Driver assigned to them.
        /// </summary>
        [JsonProperty(PropertyName = "trailer_id")]
        public long? TrailerId { get; set; }

        /// <summary>
        /// Gets or sets ID of the vehicle assigned to the dispatch route. Note
        /// that vehicle_id and driver_id are mutually exclusive. If neither is
        /// specified, then the route is unassigned.
        /// </summary>
        [JsonProperty(PropertyName = "vehicle_id")]
        public long? VehicleId { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Name == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Name");
            }
        }
    }
}
