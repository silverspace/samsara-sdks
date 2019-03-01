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
  public class DispatchJob {
    /// <summary>
    /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    /// </summary>
    /// <value>The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.</value>
    [DataMember(Name="destination_address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "destination_address")]
    public string DestinationAddress { get; set; }

    /// <summary>
    /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    /// </summary>
    /// <value>ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.</value>
    [DataMember(Name="destination_address_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "destination_address_id")]
    public long? DestinationAddressId { get; set; }

    /// <summary>
    /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    /// </summary>
    /// <value>Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</value>
    [DataMember(Name="destination_lat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "destination_lat")]
    public double? DestinationLat { get; set; }

    /// <summary>
    /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    /// </summary>
    /// <value>Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</value>
    [DataMember(Name="destination_lng", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "destination_lng")]
    public double? DestinationLng { get; set; }

    /// <summary>
    /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    /// </summary>
    /// <value>The name of the job destination. If provided, it will take precedence over the name of the address book entry.</value>
    [DataMember(Name="destination_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "destination_name")]
    public string DestinationName { get; set; }

    /// <summary>
    /// Notes regarding the details of this job.
    /// </summary>
    /// <value>Notes regarding the details of this job.</value>
    [DataMember(Name="notes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notes")]
    public string Notes { get; set; }

    /// <summary>
    /// The time at which the assigned driver is scheduled to arrive at the job destination.
    /// </summary>
    /// <value>The time at which the assigned driver is scheduled to arrive at the job destination.</value>
    [DataMember(Name="scheduled_arrival_time_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled_arrival_time_ms")]
    public long? ScheduledArrivalTimeMs { get; set; }

    /// <summary>
    /// The time at which the assigned driver is scheduled to depart from the job destination.
    /// </summary>
    /// <value>The time at which the assigned driver is scheduled to depart from the job destination.</value>
    [DataMember(Name="scheduled_departure_time_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled_departure_time_ms")]
    public long? ScheduledDepartureTimeMs { get; set; }

    /// <summary>
    /// The time at which the driver arrived at the job destination.
    /// </summary>
    /// <value>The time at which the driver arrived at the job destination.</value>
    [DataMember(Name="arrived_at_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "arrived_at_ms")]
    public long? ArrivedAtMs { get; set; }

    /// <summary>
    /// The time at which the job was marked complete (e.g. started driving to the next destination).
    /// </summary>
    /// <value>The time at which the job was marked complete (e.g. started driving to the next destination).</value>
    [DataMember(Name="completed_at_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "completed_at_ms")]
    public long? CompletedAtMs { get; set; }

    /// <summary>
    /// ID of the route that this job belongs to.
    /// </summary>
    /// <value>ID of the route that this job belongs to.</value>
    [DataMember(Name="dispatch_route_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dispatch_route_id")]
    public long? DispatchRouteId { get; set; }

    /// <summary>
    /// ID of the driver assigned to the dispatch job.
    /// </summary>
    /// <value>ID of the driver assigned to the dispatch job.</value>
    [DataMember(Name="driver_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driver_id")]
    public long? DriverId { get; set; }

    /// <summary>
    /// The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
    /// </summary>
    /// <value>The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).</value>
    [DataMember(Name="en_route_at_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "en_route_at_ms")]
    public long? EnRouteAtMs { get; set; }

    /// <summary>
    /// The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
    /// </summary>
    /// <value>The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.</value>
    [DataMember(Name="estimated_arrival_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "estimated_arrival_ms")]
    public long? EstimatedArrivalMs { get; set; }

    /// <summary>
    /// Fleet viewer url of the dispatch job.
    /// </summary>
    /// <value>Fleet viewer url of the dispatch job.</value>
    [DataMember(Name="fleet_viewer_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fleet_viewer_url")]
    public string FleetViewerUrl { get; set; }

    /// <summary>
    /// Gets or Sets GroupId
    /// </summary>
    [DataMember(Name="group_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group_id")]
    public long? GroupId { get; set; }

    /// <summary>
    /// ID of the Samsara dispatch job.
    /// </summary>
    /// <value>ID of the Samsara dispatch job.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Gets or Sets JobState
    /// </summary>
    [DataMember(Name="job_state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job_state")]
    public JobStatus JobState { get; set; }

    /// <summary>
    /// The time at which the job was marked skipped.
    /// </summary>
    /// <value>The time at which the job was marked skipped.</value>
    [DataMember(Name="skipped_at_ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "skipped_at_ms")]
    public long? SkippedAtMs { get; set; }

    /// <summary>
    /// ID of the vehicle used for the dispatch job.
    /// </summary>
    /// <value>ID of the vehicle used for the dispatch job.</value>
    [DataMember(Name="vehicle_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicle_id")]
    public long? VehicleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DispatchJob {\n");
      sb.Append("  DestinationAddress: ").Append(DestinationAddress).Append("\n");
      sb.Append("  DestinationAddressId: ").Append(DestinationAddressId).Append("\n");
      sb.Append("  DestinationLat: ").Append(DestinationLat).Append("\n");
      sb.Append("  DestinationLng: ").Append(DestinationLng).Append("\n");
      sb.Append("  DestinationName: ").Append(DestinationName).Append("\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
      sb.Append("  ScheduledArrivalTimeMs: ").Append(ScheduledArrivalTimeMs).Append("\n");
      sb.Append("  ScheduledDepartureTimeMs: ").Append(ScheduledDepartureTimeMs).Append("\n");
      sb.Append("  ArrivedAtMs: ").Append(ArrivedAtMs).Append("\n");
      sb.Append("  CompletedAtMs: ").Append(CompletedAtMs).Append("\n");
      sb.Append("  DispatchRouteId: ").Append(DispatchRouteId).Append("\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  EnRouteAtMs: ").Append(EnRouteAtMs).Append("\n");
      sb.Append("  EstimatedArrivalMs: ").Append(EstimatedArrivalMs).Append("\n");
      sb.Append("  FleetViewerUrl: ").Append(FleetViewerUrl).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  JobState: ").Append(JobState).Append("\n");
      sb.Append("  SkippedAtMs: ").Append(SkippedAtMs).Append("\n");
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
