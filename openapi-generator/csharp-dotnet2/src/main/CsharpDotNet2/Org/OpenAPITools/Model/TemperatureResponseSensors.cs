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
  public class TemperatureResponseSensors {
    /// <summary>
    /// Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
    /// </summary>
    /// <value>Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.</value>
    [DataMember(Name="probeTemperature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "probeTemperature")]
    public int? ProbeTemperature { get; set; }

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
    /// Currently reported ambient temperature in millidegrees celsius.
    /// </summary>
    /// <value>Currently reported ambient temperature in millidegrees celsius.</value>
    [DataMember(Name="ambientTemperature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ambientTemperature")]
    public int? AmbientTemperature { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TemperatureResponseSensors {\n");
      sb.Append("  ProbeTemperature: ").Append(ProbeTemperature).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  AmbientTemperature: ").Append(AmbientTemperature).Append("\n");
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
