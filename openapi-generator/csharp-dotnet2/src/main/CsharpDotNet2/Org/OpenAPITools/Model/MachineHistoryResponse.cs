using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Contains the results for a machine history request
  /// </summary>
  [DataContract]
  public class MachineHistoryResponse {
    /// <summary>
    /// Gets or Sets Machines
    /// </summary>
    [DataMember(Name="machines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "machines")]
    public List<MachineHistoryResponseMachines> Machines { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MachineHistoryResponse {\n");
      sb.Append("  Machines: ").Append(Machines).Append("\n");
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
