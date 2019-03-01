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
  public class MachineHistoryResponseVibrations {
    /// <summary>
    /// Gets or Sets X
    /// </summary>
    [DataMember(Name="X", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "X")]
    public double? X { get; set; }

    /// <summary>
    /// Gets or Sets Y
    /// </summary>
    [DataMember(Name="Y", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Y")]
    public double? Y { get; set; }

    /// <summary>
    /// Gets or Sets Z
    /// </summary>
    [DataMember(Name="Z", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Z")]
    public double? Z { get; set; }

    /// <summary>
    /// Gets or Sets Time
    /// </summary>
    [DataMember(Name="time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "time")]
    public long? Time { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MachineHistoryResponseVibrations {\n");
      sb.Append("  X: ").Append(X).Append("\n");
      sb.Append("  Y: ").Append(Y).Append("\n");
      sb.Append("  Z: ").Append(Z).Append("\n");
      sb.Append("  Time: ").Append(Time).Append("\n");
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
