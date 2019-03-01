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
  public class InlineResponse2005VehicleStats {
    /// <summary>
    /// Gets or Sets AuxInput1
    /// </summary>
    [DataMember(Name="auxInput1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auxInput1")]
    public AuxInputSeries AuxInput1 { get; set; }

    /// <summary>
    /// Gets or Sets AuxInput2
    /// </summary>
    [DataMember(Name="auxInput2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auxInput2")]
    public AuxInputSeries AuxInput2 { get; set; }

    /// <summary>
    /// Gets or Sets EngineState
    /// </summary>
    [DataMember(Name="engineState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engineState")]
    public List<EngineState> EngineState { get; set; }

    /// <summary>
    /// ID of the vehicle.
    /// </summary>
    /// <value>ID of the vehicle.</value>
    [DataMember(Name="vehicleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleId")]
    public long? VehicleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InlineResponse2005VehicleStats {\n");
      sb.Append("  AuxInput1: ").Append(AuxInput1).Append("\n");
      sb.Append("  AuxInput2: ").Append(AuxInput2).Append("\n");
      sb.Append("  EngineState: ").Append(EngineState).Append("\n");
      sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
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
