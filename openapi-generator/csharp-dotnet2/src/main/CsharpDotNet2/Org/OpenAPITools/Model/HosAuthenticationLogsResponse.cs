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
  public class HosAuthenticationLogsResponse {
    /// <summary>
    /// Gets or Sets AuthenticationLogs
    /// </summary>
    [DataMember(Name="authenticationLogs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "authenticationLogs")]
    public List<HosAuthenticationLogsResponseAuthenticationLogs> AuthenticationLogs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HosAuthenticationLogsResponse {\n");
      sb.Append("  AuthenticationLogs: ").Append(AuthenticationLogs).Append("\n");
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
