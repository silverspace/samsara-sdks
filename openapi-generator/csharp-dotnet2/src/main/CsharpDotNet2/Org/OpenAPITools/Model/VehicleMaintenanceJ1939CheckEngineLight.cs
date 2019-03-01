using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// J1939 check engine lights.
  /// </summary>
  [DataContract]
  public class VehicleMaintenanceJ1939CheckEngineLight {
    /// <summary>
    /// Gets or Sets ProtectIsOn
    /// </summary>
    [DataMember(Name="protectIsOn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "protectIsOn")]
    public bool? ProtectIsOn { get; set; }

    /// <summary>
    /// Gets or Sets StopIsOn
    /// </summary>
    [DataMember(Name="stopIsOn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stopIsOn")]
    public bool? StopIsOn { get; set; }

    /// <summary>
    /// Gets or Sets WarningIsOn
    /// </summary>
    [DataMember(Name="warningIsOn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "warningIsOn")]
    public bool? WarningIsOn { get; set; }

    /// <summary>
    /// Gets or Sets EmissionsIsOn
    /// </summary>
    [DataMember(Name="emissionsIsOn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emissionsIsOn")]
    public bool? EmissionsIsOn { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleMaintenanceJ1939CheckEngineLight {\n");
      sb.Append("  ProtectIsOn: ").Append(ProtectIsOn).Append("\n");
      sb.Append("  StopIsOn: ").Append(StopIsOn).Append("\n");
      sb.Append("  WarningIsOn: ").Append(WarningIsOn).Append("\n");
      sb.Append("  EmissionsIsOn: ").Append(EmissionsIsOn).Append("\n");
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
