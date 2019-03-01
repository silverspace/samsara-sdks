using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Information about a circular geofence. This field is only populated if the geofence is a circle.
  /// </summary>
  [DataContract]
  public class AddressGeofenceCircle {
    /// <summary>
    /// The latitude of the center of the circular geofence
    /// </summary>
    /// <value>The latitude of the center of the circular geofence</value>
    [DataMember(Name="latitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "latitude")]
    public double? Latitude { get; set; }

    /// <summary>
    /// The longitude of the center of the circular geofence
    /// </summary>
    /// <value>The longitude of the center of the circular geofence</value>
    [DataMember(Name="longitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "longitude")]
    public double? Longitude { get; set; }

    /// <summary>
    /// The radius of the circular geofence
    /// </summary>
    /// <value>The radius of the circular geofence</value>
    [DataMember(Name="radiusMeters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "radiusMeters")]
    public long? RadiusMeters { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AddressGeofenceCircle {\n");
      sb.Append("  Latitude: ").Append(Latitude).Append("\n");
      sb.Append("  Longitude: ").Append(Longitude).Append("\n");
      sb.Append("  RadiusMeters: ").Append(RadiusMeters).Append("\n");
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
