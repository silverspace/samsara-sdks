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
  public class TagModify {
    /// <summary>
    /// Gets or Sets Add
    /// </summary>
    [DataMember(Name="add", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "add")]
    public TagModifyAdd Add { get; set; }

    /// <summary>
    /// Gets or Sets Delete
    /// </summary>
    [DataMember(Name="delete", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delete")]
    public TagModifyDelete Delete { get; set; }

    /// <summary>
    /// Updated name of this tag.
    /// </summary>
    /// <value>Updated name of this tag.</value>
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
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TagModify {\n");
      sb.Append("  Add: ").Append(Add).Append("\n");
      sb.Append("  Delete: ").Append(Delete).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ParentTagId: ").Append(ParentTagId).Append("\n");
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
