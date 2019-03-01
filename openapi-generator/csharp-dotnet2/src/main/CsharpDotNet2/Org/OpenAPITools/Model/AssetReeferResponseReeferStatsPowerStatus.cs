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
  public class AssetReeferResponseReeferStatsPowerStatus {
    /// <summary>
    /// Timestamp in Unix milliseconds since epoch.
    /// </summary>
    /// <value>Timestamp in Unix milliseconds since epoch.</value>
    [DataMember(Name="changedAtMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "changedAtMs")]
    public long? ChangedAtMs { get; set; }

    /// <summary>
    /// Power status of the reefer.
    /// </summary>
    /// <value>Power status of the reefer.</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public string Status { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetReeferResponseReeferStatsPowerStatus {\n");
      sb.Append("  ChangedAtMs: ").Append(ChangedAtMs).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
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
