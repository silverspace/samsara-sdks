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
  public class SensorHistoryResponseResults {
    /// <summary>
    /// List of datapoints, one for each requested (sensor, field) pair.
    /// </summary>
    /// <value>List of datapoints, one for each requested (sensor, field) pair.</value>
    [DataMember(Name="series", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "series")]
    public List<long?> Series { get; set; }

    /// <summary>
    /// Timestamp in UNIX milliseconds.
    /// </summary>
    /// <value>Timestamp in UNIX milliseconds.</value>
    [DataMember(Name="timeMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeMs")]
    public int? TimeMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SensorHistoryResponseResults {\n");
      sb.Append("  Series: ").Append(Series).Append("\n");
      sb.Append("  TimeMs: ").Append(TimeMs).Append("\n");
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
