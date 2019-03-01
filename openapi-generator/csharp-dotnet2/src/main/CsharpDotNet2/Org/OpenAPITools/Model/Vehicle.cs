using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A vehicle object.
  /// </summary>
  [DataContract]
  public class Vehicle {
    /// <summary>
    /// Total engine hours for the vehicle.
    /// </summary>
    /// <value>Total engine hours for the vehicle.</value>
    [DataMember(Name="engineHours", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engineHours")]
    public long? EngineHours { get; set; }

    /// <summary>
    /// The fuel level of the vehicle as a percentage. (0.0 to 1.0)
    /// </summary>
    /// <value>The fuel level of the vehicle as a percentage. (0.0 to 1.0)</value>
    [DataMember(Name="fuelLevelPercent", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fuelLevelPercent")]
    public double? FuelLevelPercent { get; set; }

    /// <summary>
    /// ID of the vehicle.
    /// </summary>
    /// <value>ID of the vehicle.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Name of the vehicle.
    /// </summary>
    /// <value>Name of the vehicle.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Note
    /// </summary>
    [DataMember(Name="note", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "note")]
    public string Note { get; set; }

    /// <summary>
    /// The number of meters reported by the odometer.
    /// </summary>
    /// <value>The number of meters reported by the odometer.</value>
    [DataMember(Name="odometerMeters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "odometerMeters")]
    public long? OdometerMeters { get; set; }

    /// <summary>
    /// Vehicle Identification Number.
    /// </summary>
    /// <value>Vehicle Identification Number.</value>
    [DataMember(Name="vin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vin")]
    public string Vin { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Vehicle {\n");
      sb.Append("  EngineHours: ").Append(EngineHours).Append("\n");
      sb.Append("  FuelLevelPercent: ").Append(FuelLevelPercent).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Note: ").Append(Note).Append("\n");
      sb.Append("  OdometerMeters: ").Append(OdometerMeters).Append("\n");
      sb.Append("  Vin: ").Append(Vin).Append("\n");
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
