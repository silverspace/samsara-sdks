using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Sensor ID and field to query.
  /// </summary>
  [DataContract]
  public class SensorshistorySeries {
    /// <summary>
    /// Field to query.
    /// </summary>
    /// <value>Field to query.</value>
    [DataMember(Name="field", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "field")]
    public string Field { get; set; }

    /// <summary>
    /// Sensor ID to query.
    /// </summary>
    /// <value>Sensor ID to query.</value>
    [DataMember(Name="widgetId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "widgetId")]
    public long? WidgetId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SensorshistorySeries {\n");
      sb.Append("  Field: ").Append(Field).Append("\n");
      sb.Append("  WidgetId: ").Append(WidgetId).Append("\n");
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
