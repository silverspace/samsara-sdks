using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class AssetReeferResponseReeferStatsAlarms {
    /// <summary>
    /// ID of the alarm
    /// </summary>
    /// <value>ID of the alarm</value>
    [DataMember(Name="alarmCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alarmCode")]
    public long? AlarmCode { get; set; }

    /// <summary>
    /// Description of the alarm
    /// </summary>
    /// <value>Description of the alarm</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Recommended operator action
    /// </summary>
    /// <value>Recommended operator action</value>
    [DataMember(Name="operatorAction", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operatorAction")]
    public string OperatorAction { get; set; }

    /// <summary>
    /// Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
    /// </summary>
    /// <value>Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action</value>
    [DataMember(Name="severity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "severity")]
    public long? Severity { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetReeferResponseReeferStatsAlarms {\n");
      sb.Append("  AlarmCode: ").Append(AlarmCode).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  OperatorAction: ").Append(OperatorAction).Append("\n");
      sb.Append("  Severity: ").Append(Severity).Append("\n");
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
