using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Passenger vehicle check engine light.
  /// </summary>
  [DataContract]
  public class VehicleMaintenancePassengerCheckEngineLight {
    /// <summary>
    /// Gets or Sets IsOn
    /// </summary>
    [DataMember(Name="isOn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isOn")]
    public bool? IsOn { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleMaintenancePassengerCheckEngineLight {\n");
      sb.Append("  IsOn: ").Append(IsOn).Append("\n");
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
