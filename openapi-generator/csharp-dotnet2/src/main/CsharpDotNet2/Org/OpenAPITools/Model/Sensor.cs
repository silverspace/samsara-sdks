using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Contains information about a sensor.
  /// </summary>
  [DataContract]
  public class Sensor {
    /// <summary>
    /// ID of the sensor.
    /// </summary>
    /// <value>ID of the sensor.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// MAC address of the sensor.
    /// </summary>
    /// <value>MAC address of the sensor.</value>
    [DataMember(Name="macAddress", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "macAddress")]
    public string MacAddress { get; set; }

    /// <summary>
    /// Name of the sensor.
    /// </summary>
    /// <value>Name of the sensor.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Sensor {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  MacAddress: ").Append(MacAddress).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
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
