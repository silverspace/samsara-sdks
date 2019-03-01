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
  public class HosAuthenticationLogsResponseAuthenticationLogs {
    /// <summary>
    /// The log type - one of 'signin' or 'signout'
    /// </summary>
    /// <value>The log type - one of 'signin' or 'signout'</value>
    [DataMember(Name="actionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "actionType")]
    public string ActionType { get; set; }

    /// <summary>
    /// Address at which the log was recorded, if applicable.
    /// </summary>
    /// <value>Address at which the log was recorded, if applicable.</value>
    [DataMember(Name="address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "address")]
    public string Address { get; set; }

    /// <summary>
    /// Address name from the group address book at which the log was recorded, if applicable.
    /// </summary>
    /// <value>Address name from the group address book at which the log was recorded, if applicable.</value>
    [DataMember(Name="addressName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addressName")]
    public string AddressName { get; set; }

    /// <summary>
    /// City in which the log was recorded, if applicable.
    /// </summary>
    /// <value>City in which the log was recorded, if applicable.</value>
    [DataMember(Name="city", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "city")]
    public string City { get; set; }

    /// <summary>
    /// The time at which the event was recorded in UNIX milliseconds.
    /// </summary>
    /// <value>The time at which the event was recorded in UNIX milliseconds.</value>
    [DataMember(Name="happenedAtMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "happenedAtMs")]
    public long? HappenedAtMs { get; set; }

    /// <summary>
    /// State in which the log was recorded, if applicable.
    /// </summary>
    /// <value>State in which the log was recorded, if applicable.</value>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public string State { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HosAuthenticationLogsResponseAuthenticationLogs {\n");
      sb.Append("  ActionType: ").Append(ActionType).Append("\n");
      sb.Append("  Address: ").Append(Address).Append("\n");
      sb.Append("  AddressName: ").Append(AddressName).Append("\n");
      sb.Append("  City: ").Append(City).Append("\n");
      sb.Append("  HappenedAtMs: ").Append(HappenedAtMs).Append("\n");
      sb.Append("  State: ").Append(State).Append("\n");
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
