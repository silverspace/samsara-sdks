using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// The next driver signature for the DVIR.
  /// </summary>
  [DataContract]
  public class DvirBaseNextDriverSignature {
    /// <summary>
    /// ID of the driver who signed the DVIR
    /// </summary>
    /// <value>ID of the driver who signed the DVIR</value>
    [DataMember(Name="driverId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverId")]
    public long? DriverId { get; set; }

    /// <summary>
    /// Email of the  driver who signed the next DVIR on this vehicle.
    /// </summary>
    /// <value>Email of the  driver who signed the next DVIR on this vehicle.</value>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public string Email { get; set; }

    /// <summary>
    /// The name of the driver who signed the next DVIR on this vehicle.
    /// </summary>
    /// <value>The name of the driver who signed the next DVIR on this vehicle.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The time in millis when the next driver signed the DVIR on this vehicle.
    /// </summary>
    /// <value>The time in millis when the next driver signed the DVIR on this vehicle.</value>
    [DataMember(Name="signedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "signedAt")]
    public long? SignedAt { get; set; }

    /// <summary>
    /// Type corresponds to driver.
    /// </summary>
    /// <value>Type corresponds to driver.</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Username of the  driver who signed the next DVIR on this vehicle.
    /// </summary>
    /// <value>Username of the  driver who signed the next DVIR on this vehicle.</value>
    [DataMember(Name="username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "username")]
    public string Username { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DvirBaseNextDriverSignature {\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  SignedAt: ").Append(SignedAt).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
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
