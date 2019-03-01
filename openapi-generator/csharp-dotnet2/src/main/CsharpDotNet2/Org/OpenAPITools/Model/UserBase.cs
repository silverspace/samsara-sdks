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
  public class UserBase {
    /// <summary>
    /// The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
    /// </summary>
    /// <value>The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.</value>
    [DataMember(Name="authType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "authType")]
    public string AuthType { get; set; }

    /// <summary>
    /// The email address of this user.
    /// </summary>
    /// <value>The email address of this user.</value>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public string Email { get; set; }

    /// <summary>
    /// The first and last name of the user.
    /// </summary>
    /// <value>The first and last name of the user.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
    /// </summary>
    /// <value>The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.</value>
    [DataMember(Name="organizationRoleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "organizationRoleId")]
    public string OrganizationRoleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UserBase {\n");
      sb.Append("  AuthType: ").Append(AuthType).Append("\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  OrganizationRoleId: ").Append(OrganizationRoleId).Append("\n");
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
