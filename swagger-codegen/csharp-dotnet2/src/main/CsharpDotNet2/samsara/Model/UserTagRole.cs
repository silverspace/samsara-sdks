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
  public class UserTagRole {
    /// <summary>
    /// The name of the role the user has been granted on this tag.
    /// </summary>
    /// <value>The name of the role the user has been granted on this tag.</value>
    [DataMember(Name="role", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "role")]
    public string Role { get; set; }

    /// <summary>
    /// The id of the role the user has been granted on this tag.
    /// </summary>
    /// <value>The id of the role the user has been granted on this tag.</value>
    [DataMember(Name="roleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "roleId")]
    public string RoleId { get; set; }

    /// <summary>
    /// Gets or Sets Tag
    /// </summary>
    [DataMember(Name="tag", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tag")]
    public UserTagRoleTag Tag { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UserTagRole {\n");
      sb.Append("  Role: ").Append(Role).Append("\n");
      sb.Append("  RoleId: ").Append(RoleId).Append("\n");
      sb.Append("  Tag: ").Append(Tag).Append("\n");
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
