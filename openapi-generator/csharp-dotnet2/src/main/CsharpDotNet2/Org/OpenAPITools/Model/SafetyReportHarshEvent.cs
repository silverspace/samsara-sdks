using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// List of harsh events
  /// </summary>
  [DataContract]
  public class SafetyReportHarshEvent {
    /// <summary>
    /// Type of the harsh event
    /// </summary>
    /// <value>Type of the harsh event</value>
    [DataMember(Name="harshEventType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harshEventType")]
    public string HarshEventType { get; set; }

    /// <summary>
    /// Timestamp that the harsh event occurred in Unix milliseconds since epoch
    /// </summary>
    /// <value>Timestamp that the harsh event occurred in Unix milliseconds since epoch</value>
    [DataMember(Name="timestampMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timestampMs")]
    public int? TimestampMs { get; set; }

    /// <summary>
    /// Vehicle associated with the harsh event
    /// </summary>
    /// <value>Vehicle associated with the harsh event</value>
    [DataMember(Name="vehicleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleId")]
    public int? VehicleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SafetyReportHarshEvent {\n");
      sb.Append("  HarshEventType: ").Append(HarshEventType).Append("\n");
      sb.Append("  TimestampMs: ").Append(TimestampMs).Append("\n");
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
