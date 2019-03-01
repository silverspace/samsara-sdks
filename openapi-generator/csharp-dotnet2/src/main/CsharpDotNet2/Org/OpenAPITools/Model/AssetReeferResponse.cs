using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Reefer-specific asset details
  /// </summary>
  [DataContract]
  public class AssetReeferResponse {
    /// <summary>
    /// Asset type
    /// </summary>
    /// <value>Asset type</value>
    [DataMember(Name="assetType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "assetType")]
    public string AssetType { get; set; }

    /// <summary>
    /// Asset ID
    /// </summary>
    /// <value>Asset ID</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Asset name
    /// </summary>
    /// <value>Asset name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets ReeferStats
    /// </summary>
    [DataMember(Name="reeferStats", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reeferStats")]
    public AssetReeferResponseReeferStats ReeferStats { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetReeferResponse {\n");
      sb.Append("  AssetType: ").Append(AssetType).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ReeferStats: ").Append(ReeferStats).Append("\n");
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
