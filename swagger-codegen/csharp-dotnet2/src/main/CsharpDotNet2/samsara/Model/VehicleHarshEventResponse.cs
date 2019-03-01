using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Harsh event details for a vehicle
  /// </summary>
  [DataContract]
  public class VehicleHarshEventResponse {
    /// <summary>
    /// URL for downloading the forward facing video
    /// </summary>
    /// <value>URL for downloading the forward facing video</value>
    [DataMember(Name="downloadForwardVideoUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "downloadForwardVideoUrl")]
    public string DownloadForwardVideoUrl { get; set; }

    /// <summary>
    /// URL for downloading the inward facing video
    /// </summary>
    /// <value>URL for downloading the inward facing video</value>
    [DataMember(Name="downloadInwardVideoUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "downloadInwardVideoUrl")]
    public string DownloadInwardVideoUrl { get; set; }

    /// <summary>
    /// URL for downloading the tracked inward facing video
    /// </summary>
    /// <value>URL for downloading the tracked inward facing video</value>
    [DataMember(Name="downloadTrackedInwardVideoUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "downloadTrackedInwardVideoUrl")]
    public string DownloadTrackedInwardVideoUrl { get; set; }

    /// <summary>
    /// Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
    /// </summary>
    /// <value>Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]</value>
    [DataMember(Name="harshEventType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harshEventType")]
    public string HarshEventType { get; set; }

    /// <summary>
    /// URL of the associated incident report page
    /// </summary>
    /// <value>URL of the associated incident report page</value>
    [DataMember(Name="incidentReportUrl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "incidentReportUrl")]
    public string IncidentReportUrl { get; set; }

    /// <summary>
    /// Whether the driver was deemed distracted during this harsh event
    /// </summary>
    /// <value>Whether the driver was deemed distracted during this harsh event</value>
    [DataMember(Name="isDistracted", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isDistracted")]
    public bool? IsDistracted { get; set; }

    /// <summary>
    /// Gets or Sets Location
    /// </summary>
    [DataMember(Name="location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "location")]
    public VehicleHarshEventResponseLocation Location { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleHarshEventResponse {\n");
      sb.Append("  DownloadForwardVideoUrl: ").Append(DownloadForwardVideoUrl).Append("\n");
      sb.Append("  DownloadInwardVideoUrl: ").Append(DownloadInwardVideoUrl).Append("\n");
      sb.Append("  DownloadTrackedInwardVideoUrl: ").Append(DownloadTrackedInwardVideoUrl).Append("\n");
      sb.Append("  HarshEventType: ").Append(HarshEventType).Append("\n");
      sb.Append("  IncidentReportUrl: ").Append(IncidentReportUrl).Append("\n");
      sb.Append("  IsDistracted: ").Append(IsDistracted).Append("\n");
      sb.Append("  Location: ").Append(Location).Append("\n");
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
