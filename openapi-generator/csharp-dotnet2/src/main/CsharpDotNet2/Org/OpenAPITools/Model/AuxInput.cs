using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Digital value of an aux input.
  /// </summary>
  [DataContract]
  public class AuxInput {
    /// <summary>
    /// Timestamp in Unix epoch milliseconds.
    /// </summary>
    /// <value>Timestamp in Unix epoch milliseconds.</value>
    [DataMember(Name="timeMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeMs")]
    public Object TimeMs { get; set; }

    /// <summary>
    /// Boolean representing the digital value of the aux input.
    /// </summary>
    /// <value>Boolean representing the digital value of the aux input.</value>
    [DataMember(Name="value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "value")]
    public bool? Value { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AuxInput {\n");
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
