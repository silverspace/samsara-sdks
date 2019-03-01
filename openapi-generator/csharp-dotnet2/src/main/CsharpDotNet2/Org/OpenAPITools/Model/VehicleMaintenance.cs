using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Contains any J1939/Passenger engine light warnings and engine faults.
  /// </summary>
  [DataContract]
  public class VehicleMaintenance {
    /// <summary>
    /// ID of the vehicle.
    /// </summary>
    /// <value>ID of the vehicle.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Gets or Sets J1939
    /// </summary>
    [DataMember(Name="j1939", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "j1939")]
    public VehicleMaintenanceJ1939 J1939 { get; set; }

    /// <summary>
    /// Gets or Sets Passenger
    /// </summary>
    [DataMember(Name="passenger", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passenger")]
    public VehicleMaintenancePassenger Passenger { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleMaintenance {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  J1939: ").Append(J1939).Append("\n");
      sb.Append("  Passenger: ").Append(Passenger).Append("\n");
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
