using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Contains the current humidity of a sensor.
  /// </summary>
  [DataContract]
  public class HumidityResponse {
    /// <summary>
    /// Gets or Sets GroupId
    /// </summary>
    [DataMember(Name="groupId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupId")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Gets or Sets Sensors
    /// </summary>
    [DataMember(Name="sensors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sensors")]
    public List<HumidityResponseSensors> Sensors { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HumidityResponse {\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  Sensors: ").Append(Sensors).Append("\n");
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
