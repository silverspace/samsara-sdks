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
  public class InlineObject16 {
    /// <summary>
    /// Gets or Sets ExternalIds
    /// </summary>
    [DataMember(Name="externalIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalIds")]
    public Dictionary<string, string> ExternalIds { get; set; }

    /// <summary>
    /// Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
    /// </summary>
    /// <value>Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic</value>
    [DataMember(Name="harsh_accel_setting", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harsh_accel_setting")]
    public int? HarshAccelSetting { get; set; }

    /// <summary>
    /// Name
    /// </summary>
    /// <value>Name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InlineObject16 {\n");
      sb.Append("  ExternalIds: ").Append(ExternalIds).Append("\n");
      sb.Append("  HarshAccelSetting: ").Append(HarshAccelSetting).Append("\n");
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
