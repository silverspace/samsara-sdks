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
  public class FleetVehicleResponseVehicleInfo {
    /// <summary>
    /// Year of the vehicle.
    /// </summary>
    /// <value>Year of the vehicle.</value>
    [DataMember(Name="year", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "year")]
    public long? Year { get; set; }

    /// <summary>
    /// Model of the Vehicle.
    /// </summary>
    /// <value>Model of the Vehicle.</value>
    [DataMember(Name="model", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "model")]
    public string Model { get; set; }

    /// <summary>
    /// Vehicle Identification Number.
    /// </summary>
    /// <value>Vehicle Identification Number.</value>
    [DataMember(Name="vin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vin")]
    public string Vin { get; set; }

    /// <summary>
    /// Make of the vehicle.
    /// </summary>
    /// <value>Make of the vehicle.</value>
    [DataMember(Name="make", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "make")]
    public string Make { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class FleetVehicleResponseVehicleInfo {\n");
      sb.Append("  Year: ").Append(Year).Append("\n");
      sb.Append("  Model: ").Append(Model).Append("\n");
      sb.Append("  Vin: ").Append(Vin).Append("\n");
      sb.Append("  Make: ").Append(Make).Append("\n");
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
