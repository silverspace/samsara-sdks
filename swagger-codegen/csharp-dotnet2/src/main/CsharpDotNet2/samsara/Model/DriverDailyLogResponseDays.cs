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
  public class DriverDailyLogResponseDays {
    /// <summary>
    /// Hours spent on duty or driving, rounded to two decimal places.
    /// </summary>
    /// <value>Hours spent on duty or driving, rounded to two decimal places.</value>
    [DataMember(Name="activeHours", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "activeHours")]
    public double? ActiveHours { get; set; }

    /// <summary>
    /// Milliseconds spent on duty or driving.
    /// </summary>
    /// <value>Milliseconds spent on duty or driving.</value>
    [DataMember(Name="activeMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "activeMs")]
    public long? ActiveMs { get; set; }

    /// <summary>
    /// Whether this HOS day chart was certified by the driver.
    /// </summary>
    /// <value>Whether this HOS day chart was certified by the driver.</value>
    [DataMember(Name="certified", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "certified")]
    public bool? Certified { get; set; }

    /// <summary>
    /// Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
    /// </summary>
    /// <value>Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.</value>
    [DataMember(Name="certifiedAtMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "certifiedAtMs")]
    public long? CertifiedAtMs { get; set; }

    /// <summary>
    /// Distance driven in miles, rounded to two decimal places.
    /// </summary>
    /// <value>Distance driven in miles, rounded to two decimal places.</value>
    [DataMember(Name="distanceMiles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "distanceMiles")]
    public double? DistanceMiles { get; set; }

    /// <summary>
    /// End of the HOS day, specified in milliseconds UNIX time.
    /// </summary>
    /// <value>End of the HOS day, specified in milliseconds UNIX time.</value>
    [DataMember(Name="endMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endMs")]
    public int? EndMs { get; set; }

    /// <summary>
    /// End of the HOS day, specified in milliseconds UNIX time.
    /// </summary>
    /// <value>End of the HOS day, specified in milliseconds UNIX time.</value>
    [DataMember(Name="startMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startMs")]
    public int? StartMs { get; set; }

    /// <summary>
    /// List of trailer ID's associated with the driver for the day.
    /// </summary>
    /// <value>List of trailer ID's associated with the driver for the day.</value>
    [DataMember(Name="trailerIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trailerIds")]
    public Object TrailerIds { get; set; }

    /// <summary>
    /// List of vehicle ID's associated with the driver for the day.
    /// </summary>
    /// <value>List of vehicle ID's associated with the driver for the day.</value>
    [DataMember(Name="vehicleIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleIds")]
    public Object VehicleIds { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DriverDailyLogResponseDays {\n");
      sb.Append("  ActiveHours: ").Append(ActiveHours).Append("\n");
      sb.Append("  ActiveMs: ").Append(ActiveMs).Append("\n");
      sb.Append("  Certified: ").Append(Certified).Append("\n");
      sb.Append("  CertifiedAtMs: ").Append(CertifiedAtMs).Append("\n");
      sb.Append("  DistanceMiles: ").Append(DistanceMiles).Append("\n");
      sb.Append("  EndMs: ").Append(EndMs).Append("\n");
      sb.Append("  StartMs: ").Append(StartMs).Append("\n");
      sb.Append("  TrailerIds: ").Append(TrailerIds).Append("\n");
      sb.Append("  VehicleIds: ").Append(VehicleIds).Append("\n");
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
