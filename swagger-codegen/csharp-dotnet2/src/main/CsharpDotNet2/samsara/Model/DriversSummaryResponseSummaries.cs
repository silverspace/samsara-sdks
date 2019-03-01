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
  public class DriversSummaryResponseSummaries {
    /// <summary>
    /// Duration in milliseconds that driver was on duty or driving during the requested time range
    /// </summary>
    /// <value>Duration in milliseconds that driver was on duty or driving during the requested time range</value>
    [DataMember(Name="activeMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "activeMs")]
    public long? ActiveMs { get; set; }

    /// <summary>
    /// Distance driven in miles, rounded to two decimal places.
    /// </summary>
    /// <value>Distance driven in miles, rounded to two decimal places.</value>
    [DataMember(Name="distanceMiles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "distanceMiles")]
    public double? DistanceMiles { get; set; }

    /// <summary>
    /// Duration in milliseconds that driver was driving during the requested time range
    /// </summary>
    /// <value>Duration in milliseconds that driver was driving during the requested time range</value>
    [DataMember(Name="driveMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driveMs")]
    public long? DriveMs { get; set; }

    /// <summary>
    /// ID of the driver.
    /// </summary>
    /// <value>ID of the driver.</value>
    [DataMember(Name="driverId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverId")]
    public long? DriverId { get; set; }

    /// <summary>
    /// Name of the driver.
    /// </summary>
    /// <value>Name of the driver.</value>
    [DataMember(Name="driverName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverName")]
    public string DriverName { get; set; }

    /// <summary>
    /// Username of the driver.
    /// </summary>
    /// <value>Username of the driver.</value>
    [DataMember(Name="driverUsername", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverUsername")]
    public string DriverUsername { get; set; }

    /// <summary>
    /// Group of the driver.
    /// </summary>
    /// <value>Group of the driver.</value>
    [DataMember(Name="groupId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupId")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Duration in milliseconds that driver was on duty during the requested time range
    /// </summary>
    /// <value>Duration in milliseconds that driver was on duty during the requested time range</value>
    [DataMember(Name="onDutyMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "onDutyMs")]
    public long? OnDutyMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DriversSummaryResponseSummaries {\n");
      sb.Append("  ActiveMs: ").Append(ActiveMs).Append("\n");
      sb.Append("  DistanceMiles: ").Append(DistanceMiles).Append("\n");
      sb.Append("  DriveMs: ").Append(DriveMs).Append("\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  DriverName: ").Append(DriverName).Append("\n");
      sb.Append("  DriverUsername: ").Append(DriverUsername).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  OnDutyMs: ").Append(OnDutyMs).Append("\n");
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
