using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Basic information of an asset
  /// </summary>
  [DataContract]
  public class AssetCurrentLocationsResponse {
    /// <summary>
    /// The cable connected to the asset
    /// </summary>
    /// <value>The cable connected to the asset</value>
    [DataMember(Name="cable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cable")]
    public List<AssetCable> Cable { get; set; }

    /// <summary>
    /// Engine hours
    /// </summary>
    /// <value>Engine hours</value>
    [DataMember(Name="engineHours", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engineHours")]
    public int? EngineHours { get; set; }

    /// <summary>
    /// Asset ID
    /// </summary>
    /// <value>Asset ID</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Current location of an asset
    /// </summary>
    /// <value>Current location of an asset</value>
    [DataMember(Name="location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "location")]
    public List<AssetCurrentLocation> Location { get; set; }

    /// <summary>
    /// Asset name
    /// </summary>
    /// <value>Asset name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetCurrentLocationsResponse {\n");
      sb.Append("  Cable: ").Append(Cable).Append("\n");
      sb.Append("  EngineHours: ").Append(EngineHours).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Location: ").Append(Location).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
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
