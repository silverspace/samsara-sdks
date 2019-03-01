using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class DispatchRouteBase {
    /// <summary>
    /// The time in Unix epoch milliseconds that the route actually ended.
    /// </summary>
    /// <value>The time in Unix epoch milliseconds that the route actually ended.</value>
    [DataMember(Name="actual_end_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "actual_end_ms")]
    public long? ActualEndMs { get; set; }

    /// <summary>
    /// The time in Unix epoch milliseconds that the route actually started.
    /// </summary>
    /// <value>The time in Unix epoch milliseconds that the route actually started.</value>
    [DataMember(Name="actual_start_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "actual_start_ms")]
    public long? ActualStartMs { get; set; }

    /// <summary>
    /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    /// </summary>
    /// <value>ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.</value>
    [DataMember(Name="driver_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driver_id")]
    public long? DriverId { get; set; }

    /// <summary>
    /// ID of the group if the organization has multiple groups (optional).
    /// </summary>
    /// <value>ID of the group if the organization has multiple groups (optional).</value>
    [DataMember(Name="group_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group_id")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Descriptive name of this route.
    /// </summary>
    /// <value>Descriptive name of this route.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    /// </summary>
    /// <value>The time in Unix epoch milliseconds that the last job in the route is scheduled to end.</value>
    [DataMember(Name="scheduled_end_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled_end_ms")]
    public long? ScheduledEndMs { get; set; }

    /// <summary>
    /// The distance expected to be traveled for this route in meters.
    /// </summary>
    /// <value>The distance expected to be traveled for this route in meters.</value>
    [DataMember(Name="scheduled_meters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled_meters")]
    public long? ScheduledMeters { get; set; }

    /// <summary>
    /// The time in Unix epoch milliseconds that the route is scheduled to start.
    /// </summary>
    /// <value>The time in Unix epoch milliseconds that the route is scheduled to start.</value>
    [DataMember(Name="scheduled_start_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled_start_ms")]
    public long? ScheduledStartMs { get; set; }

    /// <summary>
    /// The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    /// </summary>
    /// <value>The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.</value>
    [DataMember(Name="start_location_address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_location_address")]
    public string StartLocationAddress { get; set; }

    /// <summary>
    /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    /// </summary>
    /// <value>ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.</value>
    [DataMember(Name="start_location_address_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_location_address_id")]
    public long? StartLocationAddressId { get; set; }

    /// <summary>
    /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    /// </summary>
    /// <value>Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</value>
    [DataMember(Name="start_location_lat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_location_lat")]
    public double? StartLocationLat { get; set; }

    /// <summary>
    /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    /// </summary>
    /// <value>Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</value>
    [DataMember(Name="start_location_lng", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_location_lng")]
    public double? StartLocationLng { get; set; }

    /// <summary>
    /// The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
    /// </summary>
    /// <value>The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.</value>
    [DataMember(Name="start_location_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_location_name")]
    public string StartLocationName { get; set; }

    /// <summary>
    /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    /// </summary>
    /// <value>ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.</value>
    [DataMember(Name="trailer_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trailer_id")]
    public long? TrailerId { get; set; }

    /// <summary>
    /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    /// </summary>
    /// <value>ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.</value>
    [DataMember(Name="vehicle_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicle_id")]
    public long? VehicleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DispatchRouteBase {\n");
      sb.Append("  ActualEndMs: ").Append(ActualEndMs).Append("\n");
      sb.Append("  ActualStartMs: ").Append(ActualStartMs).Append("\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ScheduledEndMs: ").Append(ScheduledEndMs).Append("\n");
      sb.Append("  ScheduledMeters: ").Append(ScheduledMeters).Append("\n");
      sb.Append("  ScheduledStartMs: ").Append(ScheduledStartMs).Append("\n");
      sb.Append("  StartLocationAddress: ").Append(StartLocationAddress).Append("\n");
      sb.Append("  StartLocationAddressId: ").Append(StartLocationAddressId).Append("\n");
      sb.Append("  StartLocationLat: ").Append(StartLocationLat).Append("\n");
      sb.Append("  StartLocationLng: ").Append(StartLocationLng).Append("\n");
      sb.Append("  StartLocationName: ").Append(StartLocationName).Append("\n");
      sb.Append("  TrailerId: ").Append(TrailerId).Append("\n");
      sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
