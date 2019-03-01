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
  public class TagCreate {
    /// <summary>
    /// The assets that belong to this tag.
    /// </summary>
    /// <value>The assets that belong to this tag.</value>
    [DataMember(Name="assets", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "assets")]
    public List<TaggedAssetBase> Assets { get; set; }

    /// <summary>
    /// The drivers that belong to this tag.
    /// </summary>
    /// <value>The drivers that belong to this tag.</value>
    [DataMember(Name="drivers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "drivers")]
    public List<TaggedDriverBase> Drivers { get; set; }

    /// <summary>
    /// The machines that belong to this tag.
    /// </summary>
    /// <value>The machines that belong to this tag.</value>
    [DataMember(Name="machines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "machines")]
    public List<TaggedMachineBase> Machines { get; set; }

    /// <summary>
    /// Name of this tag.
    /// </summary>
    /// <value>Name of this tag.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
    /// </summary>
    /// <value>If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.</value>
    [DataMember(Name="parentTagId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parentTagId")]
    public long? ParentTagId { get; set; }

    /// <summary>
    /// The sensors that belong to this tag.
    /// </summary>
    /// <value>The sensors that belong to this tag.</value>
    [DataMember(Name="sensors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sensors")]
    public List<TaggedSensorBase> Sensors { get; set; }

    /// <summary>
    /// The vehicles that belong to this tag.
    /// </summary>
    /// <value>The vehicles that belong to this tag.</value>
    [DataMember(Name="vehicles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicles")]
    public List<TaggedVehicleBase> Vehicles { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TagCreate {\n");
      sb.Append("  Assets: ").Append(Assets).Append("\n");
      sb.Append("  Drivers: ").Append(Drivers).Append("\n");
      sb.Append("  Machines: ").Append(Machines).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ParentTagId: ").Append(ParentTagId).Append("\n");
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
