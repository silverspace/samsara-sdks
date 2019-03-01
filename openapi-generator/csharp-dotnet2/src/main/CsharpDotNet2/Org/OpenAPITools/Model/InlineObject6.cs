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
  public class InlineObject6 {
    /// <summary>
    /// Driver ID to query.
    /// </summary>
    /// <value>Driver ID to query.</value>
    [DataMember(Name="driverId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverId")]
    public long? DriverId { get; set; }

    /// <summary>
    /// End of the time range, specified in milliseconds UNIX time.
    /// </summary>
    /// <value>End of the time range, specified in milliseconds UNIX time.</value>
    [DataMember(Name="endMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endMs")]
    public int? EndMs { get; set; }

    /// <summary>
    /// Group ID to query.
    /// </summary>
    /// <value>Group ID to query.</value>
    [DataMember(Name="groupId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupId")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Beginning of the time range, specified in milliseconds UNIX time.
    /// </summary>
    /// <value>Beginning of the time range, specified in milliseconds UNIX time.</value>
    [DataMember(Name="startMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startMs")]
    public int? StartMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InlineObject6 {\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  EndMs: ").Append(EndMs).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
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
