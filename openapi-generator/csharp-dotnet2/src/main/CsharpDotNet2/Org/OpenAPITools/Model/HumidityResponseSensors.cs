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
  public class HumidityResponseSensors {
    /// <summary>
    /// Name of the sensor.
    /// </summary>
    /// <value>Name of the sensor.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Currently reported relative humidity in percent, from 0-100.
    /// </summary>
    /// <value>Currently reported relative humidity in percent, from 0-100.</value>
    [DataMember(Name="humidity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "humidity")]
    public int? Humidity { get; set; }

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
      sb.Append("class HumidityResponseSensors {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Humidity: ").Append(Humidity).Append("\n");
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
