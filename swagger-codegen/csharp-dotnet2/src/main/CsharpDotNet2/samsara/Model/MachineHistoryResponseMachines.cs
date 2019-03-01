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
  public class MachineHistoryResponseMachines {
    /// <summary>
    /// Machine ID
    /// </summary>
    /// <value>Machine ID</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Machine name
    /// </summary>
    /// <value>Machine name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
    /// </summary>
    /// <value>List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s</value>
    [DataMember(Name="vibrations", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vibrations")]
    public List<MachineHistoryResponseVibrations> Vibrations { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MachineHistoryResponseMachines {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Vibrations: ").Append(Vibrations).Append("\n");
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
