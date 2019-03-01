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
  public class HosLogsResponseLogs {
    /// <summary>
    /// Longitude at which the log was recorded.
    /// </summary>
    /// <value>Longitude at which the log was recorded.</value>
    [DataMember(Name="locLng", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locLng")]
    public double? LocLng { get; set; }

    /// <summary>
    /// The time at which the log/HOS status started in UNIX milliseconds.
    /// </summary>
    /// <value>The time at which the log/HOS status started in UNIX milliseconds.</value>
    [DataMember(Name="logStartMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "logStartMs")]
    public long? LogStartMs { get; set; }

    /// <summary>
    /// ID of the driver.
    /// </summary>
    /// <value>ID of the driver.</value>
    [DataMember(Name="driverId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverId")]
    public long? DriverId { get; set; }

    /// <summary>
    /// The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    /// </summary>
    /// <value>The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.</value>
    [DataMember(Name="statusType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "statusType")]
    public string StatusType { get; set; }

    /// <summary>
    /// City in which the log was recorded.
    /// </summary>
    /// <value>City in which the log was recorded.</value>
    [DataMember(Name="locCity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locCity")]
    public string LocCity { get; set; }

    /// <summary>
    /// ID of the group.
    /// </summary>
    /// <value>ID of the group.</value>
    [DataMember(Name="groupId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupId")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Name of location at which the log was recorded.
    /// </summary>
    /// <value>Name of location at which the log was recorded.</value>
    [DataMember(Name="locName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locName")]
    public string LocName { get; set; }

    /// <summary>
    /// Latitude at which the log was recorded.
    /// </summary>
    /// <value>Latitude at which the log was recorded.</value>
    [DataMember(Name="locLat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locLat")]
    public double? LocLat { get; set; }

    /// <summary>
    /// Remark associated with the log entry.
    /// </summary>
    /// <value>Remark associated with the log entry.</value>
    [DataMember(Name="remark", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "remark")]
    public string Remark { get; set; }

    /// <summary>
    /// State in which the log was recorded.
    /// </summary>
    /// <value>State in which the log was recorded.</value>
    [DataMember(Name="locState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locState")]
    public string LocState { get; set; }

    /// <summary>
    /// ID of the vehicle.
    /// </summary>
    /// <value>ID of the vehicle.</value>
    [DataMember(Name="vehicleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleId")]
    public long? VehicleId { get; set; }

    /// <summary>
    /// Gets or Sets CodriverIds
    /// </summary>
    [DataMember(Name="codriverIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "codriverIds")]
    public List<long?> CodriverIds { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HosLogsResponseLogs {\n");
      sb.Append("  LocLng: ").Append(LocLng).Append("\n");
      sb.Append("  LogStartMs: ").Append(LogStartMs).Append("\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  StatusType: ").Append(StatusType).Append("\n");
      sb.Append("  LocCity: ").Append(LocCity).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  LocName: ").Append(LocName).Append("\n");
      sb.Append("  LocLat: ").Append(LocLat).Append("\n");
      sb.Append("  Remark: ").Append(Remark).Append("\n");
      sb.Append("  LocState: ").Append(LocState).Append("\n");
      sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
      sb.Append("  CodriverIds: ").Append(CodriverIds).Append("\n");
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
