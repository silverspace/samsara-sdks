using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
  /// </summary>
  [DataContract]
  public class AddressGeofence {
    /// <summary>
    /// Gets or Sets Circle
    /// </summary>
    [DataMember(Name="circle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "circle")]
    public AddressGeofenceCircle Circle { get; set; }

    /// <summary>
    /// Gets or Sets Polygon
    /// </summary>
    [DataMember(Name="polygon", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "polygon")]
    public AddressGeofencePolygon Polygon { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AddressGeofence {\n");
      sb.Append("  Circle: ").Append(Circle).Append("\n");
      sb.Append("  Polygon: ").Append(Polygon).Append("\n");
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
