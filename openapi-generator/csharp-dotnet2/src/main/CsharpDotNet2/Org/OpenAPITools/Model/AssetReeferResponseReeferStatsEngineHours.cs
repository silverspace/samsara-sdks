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
  public class AssetReeferResponseReeferStatsEngineHours {
    /// <summary>
    /// Engine hours of the reefer.
    /// </summary>
    /// <value>Engine hours of the reefer.</value>
    [DataMember(Name="engineHours", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engineHours")]
    public long? EngineHours { get; set; }

    /// <summary>
    /// Timestamp in Unix milliseconds since epoch.
    /// </summary>
    /// <value>Timestamp in Unix milliseconds since epoch.</value>
    [DataMember(Name="changedAtMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "changedAtMs")]
    public long? ChangedAtMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetReeferResponseReeferStatsEngineHours {\n");
      sb.Append("  EngineHours: ").Append(EngineHours).Append("\n");
      sb.Append("  ChangedAtMs: ").Append(ChangedAtMs).Append("\n");
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
