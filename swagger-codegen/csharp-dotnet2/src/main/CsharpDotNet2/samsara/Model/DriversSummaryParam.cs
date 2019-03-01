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
  public class DriversSummaryParam {
    /// <summary>
    /// End time (ms) of queried time period.
    /// </summary>
    /// <value>End time (ms) of queried time period.</value>
    [DataMember(Name="endMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endMs")]
    public long? EndMs { get; set; }

    /// <summary>
    /// Org ID to query.
    /// </summary>
    /// <value>Org ID to query.</value>
    [DataMember(Name="orgId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "orgId")]
    public long? OrgId { get; set; }

    /// <summary>
    /// Start time (ms) of queried time period.
    /// </summary>
    /// <value>Start time (ms) of queried time period.</value>
    [DataMember(Name="startMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startMs")]
    public long? StartMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DriversSummaryParam {\n");
      sb.Append("  EndMs: ").Append(EndMs).Append("\n");
      sb.Append("  OrgId: ").Append(OrgId).Append("\n");
      sb.Append("  StartMs: ").Append(StartMs).Append("\n");
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
