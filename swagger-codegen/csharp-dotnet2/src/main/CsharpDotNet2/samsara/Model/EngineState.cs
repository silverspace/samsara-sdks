using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// The state of the vehicle over time. State can be Running, Off, or Idle.
  /// </summary>
  [DataContract]
  public class EngineState {
    /// <summary>
    /// Timestamp in Unix epoch milliseconds.
    /// </summary>
    /// <value>Timestamp in Unix epoch milliseconds.</value>
    [DataMember(Name="timeMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeMs")]
    public decimal? TimeMs { get; set; }

    /// <summary>
    /// Gets or Sets Value
    /// </summary>
    [DataMember(Name="value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "value")]
    public string Value { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EngineState {\n");
      sb.Append("  TimeMs: ").Append(TimeMs).Append("\n");
      sb.Append("  Value: ").Append(Value).Append("\n");
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
