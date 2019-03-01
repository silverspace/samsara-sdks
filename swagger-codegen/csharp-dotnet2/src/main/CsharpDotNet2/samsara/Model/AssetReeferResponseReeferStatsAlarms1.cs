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
  public class AssetReeferResponseReeferStatsAlarms1 {
    /// <summary>
    /// Gets or Sets Alarms
    /// </summary>
    [DataMember(Name="alarms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alarms")]
    public List<AssetReeferResponseReeferStatsAlarms> Alarms { get; set; }

    /// <summary>
    /// Timestamp when the alarms were reported, in Unix milliseconds since epoch
    /// </summary>
    /// <value>Timestamp when the alarms were reported, in Unix milliseconds since epoch</value>
    [DataMember(Name="changedAtMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "changedAtMs")]
    public long? ChangedAtMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetReeferResponseReeferStatsAlarms1 {\n");
      sb.Append("  Alarms: ").Append(Alarms).Append("\n");
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
