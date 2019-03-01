using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A vehicle object as returned for fleet/vehicle
  /// </summary>
  [DataContract]
  public class FleetVehicleResponse {
    /// <summary>
    /// Gets or Sets ExternalIds
    /// </summary>
    [DataMember(Name="externalIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalIds")]
    public Dictionary<string, string> ExternalIds { get; set; }

    /// <summary>
    /// Harsh event detection setting.
    /// </summary>
    /// <value>Harsh event detection setting.</value>
    [DataMember(Name="harshAccelSetting", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "harshAccelSetting")]
    public string HarshAccelSetting { get; set; }

    /// <summary>
    /// ID of the vehicle.
    /// </summary>
    /// <value>ID of the vehicle.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Name of the vehicle.
    /// </summary>
    /// <value>Name of the vehicle.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets VehicleInfo
    /// </summary>
    [DataMember(Name="vehicleInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleInfo")]
    public FleetVehicleResponseVehicleInfo VehicleInfo { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class FleetVehicleResponse {\n");
      sb.Append("  ExternalIds: ").Append(ExternalIds).Append("\n");
      sb.Append("  HarshAccelSetting: ").Append(HarshAccelSetting).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  VehicleInfo: ").Append(VehicleInfo).Append("\n");
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
