using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Specify devices, etc. that should be added to the tag.
  /// </summary>
  [DataContract]
  public class TagModifyAdd {
    /// <summary>
    /// The assets to be added to this tag.
    /// </summary>
    /// <value>The assets to be added to this tag.</value>
    [DataMember(Name="assets", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "assets")]
    public List<TaggedAssetBase> Assets { get; set; }

    /// <summary>
    /// The drivers to be added to this tag.
    /// </summary>
    /// <value>The drivers to be added to this tag.</value>
    [DataMember(Name="drivers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "drivers")]
    public List<TaggedDriverBase> Drivers { get; set; }

    /// <summary>
    /// The machines to be added to this tag.
    /// </summary>
    /// <value>The machines to be added to this tag.</value>
    [DataMember(Name="machines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "machines")]
    public List<TaggedMachineBase> Machines { get; set; }

    /// <summary>
    /// The sensors to be added to this tag.
    /// </summary>
    /// <value>The sensors to be added to this tag.</value>
    [DataMember(Name="sensors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sensors")]
    public List<TaggedSensorBase> Sensors { get; set; }

    /// <summary>
    /// The vehicles to be added to this tag.
    /// </summary>
    /// <value>The vehicles to be added to this tag.</value>
    [DataMember(Name="vehicles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicles")]
    public List<TaggedVehicleBase> Vehicles { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TagModifyAdd {\n");
      sb.Append("  Assets: ").Append(Assets).Append("\n");
      sb.Append("  Drivers: ").Append(Drivers).Append("\n");
      sb.Append("  Machines: ").Append(Machines).Append("\n");
      sb.Append("  Sensors: ").Append(Sensors).Append("\n");
      sb.Append("  Vehicles: ").Append(Vehicles).Append("\n");
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
