using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// J1939 based data. Null if no data is available.
  /// </summary>
  [DataContract]
  public class VehicleMaintenanceJ1939 {
    /// <summary>
    /// Gets or Sets CheckEngineLight
    /// </summary>
    [DataMember(Name="checkEngineLight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "checkEngineLight")]
    public VehicleMaintenanceJ1939CheckEngineLight CheckEngineLight { get; set; }

    /// <summary>
    /// J1939 DTCs.
    /// </summary>
    /// <value>J1939 DTCs.</value>
    [DataMember(Name="diagnosticTroubleCodes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "diagnosticTroubleCodes")]
    public List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> DiagnosticTroubleCodes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleMaintenanceJ1939 {\n");
      sb.Append("  CheckEngineLight: ").Append(CheckEngineLight).Append("\n");
      sb.Append("  DiagnosticTroubleCodes: ").Append(DiagnosticTroubleCodes).Append("\n");
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
