using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Safety score details for a vehicle
  /// </summary>
  [DataContract]
  public class VehicleSafetyScoreResponse {
    /// <summary>
    /// Crash event count
    /// </summary>
    /// <value>Crash event count</value>
    [DataMember(Name="crashCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "crashCount")]
    public int? CrashCount { get; set; }

    /// <summary>
    /// Harsh acceleration event count
    /// </summary>
    /// <value>Harsh acceleration event count</value>
    [DataMember(Name="harshAccelCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harshAccelCount")]
    public int? HarshAccelCount { get; set; }

    /// <summary>
    /// Harsh braking event count
    /// </summary>
    /// <value>Harsh braking event count</value>
    [DataMember(Name="harshBrakingCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harshBrakingCount")]
    public int? HarshBrakingCount { get; set; }

    /// <summary>
    /// Gets or Sets HarshEvents
    /// </summary>
    [DataMember(Name="harshEvents", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harshEvents")]
    public List<SafetyReportHarshEvent> HarshEvents { get; set; }

    /// <summary>
    /// Harsh turning event count
    /// </summary>
    /// <value>Harsh turning event count</value>
    [DataMember(Name="harshTurningCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harshTurningCount")]
    public int? HarshTurningCount { get; set; }

    /// <summary>
    /// Safety Score
    /// </summary>
    /// <value>Safety Score</value>
    [DataMember(Name="safetyScore", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "safetyScore")]
    public int? SafetyScore { get; set; }

    /// <summary>
    /// Safety Score Rank
    /// </summary>
    /// <value>Safety Score Rank</value>
    [DataMember(Name="safetyScoreRank", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "safetyScoreRank")]
    public string SafetyScoreRank { get; set; }

    /// <summary>
    /// Amount of time driven over the speed limit in milliseconds
    /// </summary>
    /// <value>Amount of time driven over the speed limit in milliseconds</value>
    [DataMember(Name="timeOverSpeedLimitMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeOverSpeedLimitMs")]
    public int? TimeOverSpeedLimitMs { get; set; }

    /// <summary>
    /// Total distance driven in meters
    /// </summary>
    /// <value>Total distance driven in meters</value>
    [DataMember(Name="totalDistanceDrivenMeters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "totalDistanceDrivenMeters")]
    public int? TotalDistanceDrivenMeters { get; set; }

    /// <summary>
    /// Total harsh event count
    /// </summary>
    /// <value>Total harsh event count</value>
    [DataMember(Name="totalHarshEventCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "totalHarshEventCount")]
    public int? TotalHarshEventCount { get; set; }

    /// <summary>
    /// Amount of time driven in milliseconds
    /// </summary>
    /// <value>Amount of time driven in milliseconds</value>
    [DataMember(Name="totalTimeDrivenMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "totalTimeDrivenMs")]
    public int? TotalTimeDrivenMs { get; set; }

    /// <summary>
    /// Vehicle ID
    /// </summary>
    /// <value>Vehicle ID</value>
    [DataMember(Name="vehicleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleId")]
    public int? VehicleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleSafetyScoreResponse {\n");
      sb.Append("  CrashCount: ").Append(CrashCount).Append("\n");
      sb.Append("  HarshAccelCount: ").Append(HarshAccelCount).Append("\n");
      sb.Append("  HarshBrakingCount: ").Append(HarshBrakingCount).Append("\n");
      sb.Append("  HarshEvents: ").Append(HarshEvents).Append("\n");
      sb.Append("  HarshTurningCount: ").Append(HarshTurningCount).Append("\n");
      sb.Append("  SafetyScore: ").Append(SafetyScore).Append("\n");
      sb.Append("  SafetyScoreRank: ").Append(SafetyScoreRank).Append("\n");
      sb.Append("  TimeOverSpeedLimitMs: ").Append(TimeOverSpeedLimitMs).Append("\n");
      sb.Append("  TotalDistanceDrivenMeters: ").Append(TotalDistanceDrivenMeters).Append("\n");
      sb.Append("  TotalHarshEventCount: ").Append(TotalHarshEventCount).Append("\n");
      sb.Append("  TotalTimeDrivenMs: ").Append(TotalTimeDrivenMs).Append("\n");
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
