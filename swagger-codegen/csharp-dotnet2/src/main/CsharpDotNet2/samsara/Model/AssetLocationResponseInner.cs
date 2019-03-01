using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Model {

  /// <summary>
  /// Asset location details.
  /// </summary>
  [DataContract]
  public class AssetLocationResponseInner {
    /// <summary>
    /// The latitude of the location in degrees.
    /// </summary>
    /// <value>The latitude of the location in degrees.</value>
    [DataMember(Name="latitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "latitude")]
    public double? Latitude { get; set; }

    /// <summary>
    /// The best effort (street,city,state) for the latitude and longitude.
    /// </summary>
    /// <value>The best effort (street,city,state) for the latitude and longitude.</value>
    [DataMember(Name="location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "location")]
    public string Location { get; set; }

    /// <summary>
    /// The longitude of the location in degrees.
    /// </summary>
    /// <value>The longitude of the location in degrees.</value>
    [DataMember(Name="longitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "longitude")]
    public double? Longitude { get; set; }

    /// <summary>
    /// The speed calculated from GPS that the asset was traveling at in miles per hour.
    /// </summary>
    /// <value>The speed calculated from GPS that the asset was traveling at in miles per hour.</value>
    [DataMember(Name="speedMilesPerHour", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "speedMilesPerHour")]
    public double? SpeedMilesPerHour { get; set; }

    /// <summary>
    /// Time in Unix milliseconds since epoch when the asset was at the location.
    /// </summary>
    /// <value>Time in Unix milliseconds since epoch when the asset was at the location.</value>
    [DataMember(Name="time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "time")]
    public decimal? Time { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AssetLocationResponseInner {\n");
      sb.Append("  Latitude: ").Append(Latitude).Append("\n");
      sb.Append("  Location: ").Append(Location).Append("\n");
      sb.Append("  Longitude: ").Append(Longitude).Append("\n");
      sb.Append("  SpeedMilesPerHour: ").Append(SpeedMilesPerHour).Append("\n");
      sb.Append("  Time: ").Append(Time).Append("\n");
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
