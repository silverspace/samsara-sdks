using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class DispatchJobCreate {
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
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DispatchJobCreate {\n");
      sb.Append("  DestinationAddress: ").Append(DestinationAddress).Append("\n");
      sb.Append("  DestinationAddressId: ").Append(DestinationAddressId).Append("\n");
      sb.Append("  DestinationLat: ").Append(DestinationLat).Append("\n");
      sb.Append("  DestinationLng: ").Append(DestinationLng).Append("\n");
      sb.Append("  DestinationName: ").Append(DestinationName).Append("\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
      sb.Append("  ScheduledArrivalTimeMs: ").Append(ScheduledArrivalTimeMs).Append("\n");
      sb.Append("  ScheduledDepartureTimeMs: ").Append(ScheduledDepartureTimeMs).Append("\n");
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
