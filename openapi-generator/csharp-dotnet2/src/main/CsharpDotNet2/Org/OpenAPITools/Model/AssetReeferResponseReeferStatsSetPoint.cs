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
  public class AssetReeferResponseReeferStatsSetPoint {
    /// <summary>
    /// Set point temperature in millidegree Celsius.
    /// </summary>
    /// <value>Set point temperature in millidegree Celsius.</value>
    [DataMember(Name="tempInMilliC", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tempInMilliC")]
    public long? TempInMilliC { get; set; }

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
      sb.Append("class AssetReeferResponseReeferStatsSetPoint {\n");
      sb.Append("  TempInMilliC: ").Append(TempInMilliC).Append("\n");
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
