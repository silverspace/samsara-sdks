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
  public class CargoResponseSensors {
    /// <summary>
    /// Flag indicating whether the current cargo is empty or loaded.
    /// </summary>
    /// <value>Flag indicating whether the current cargo is empty or loaded.</value>
    [DataMember(Name="cargoEmpty", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cargoEmpty")]
    public bool? CargoEmpty { get; set; }

    /// <summary>
    /// Name of the sensor.
    /// </summary>
    /// <value>Name of the sensor.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// ID of the sensor.
    /// </summary>
    /// <value>ID of the sensor.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CargoResponseSensors {\n");
      sb.Append("  CargoEmpty: ").Append(CargoEmpty).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
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
