using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Contains the location, in latitude and longitude, of a vehicle.
  /// </summary>
  [DataContract]
  public class VehicleLocation {
    /// <summary>
    /// Heading in degrees.
    /// </summary>
    /// <value>Heading in degrees.</value>
    [DataMember(Name="heading", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "heading")]
    public double? Heading { get; set; }

    /// <summary>
    /// ID of the vehicle.
    /// </summary>
    /// <value>ID of the vehicle.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Latitude in decimal degrees.
    /// </summary>
    /// <value>Latitude in decimal degrees.</value>
    [DataMember(Name="latitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "latitude")]
    public double? Latitude { get; set; }

    /// <summary>
    /// Text representation of nearest identifiable location to (latitude, longitude) coordinates.
    /// </summary>
    /// <value>Text representation of nearest identifiable location to (latitude, longitude) coordinates.</value>
    [DataMember(Name="location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "location")]
    public string Location { get; set; }

    /// <summary>
    /// Longitude in decimal degrees.
    /// </summary>
    /// <value>Longitude in decimal degrees.</value>
    [DataMember(Name="longitude", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "longitude")]
    public double? Longitude { get; set; }

    /// <summary>
    /// Name of the vehicle.
    /// </summary>
    /// <value>Name of the vehicle.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The number of meters reported by the odometer.
    /// </summary>
    /// <value>The number of meters reported by the odometer.</value>
    [DataMember(Name="odometerMeters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "odometerMeters")]
    public long? OdometerMeters { get; set; }

    /// <summary>
    /// Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
    /// </summary>
    /// <value>Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.</value>
    [DataMember(Name="onTrip", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "onTrip")]
    public bool? OnTrip { get; set; }

    /// <summary>
    /// Speed in miles per hour.
    /// </summary>
    /// <value>Speed in miles per hour.</value>
    [DataMember(Name="speed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "speed")]
    public double? Speed { get; set; }

    /// <summary>
    /// The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
    /// </summary>
    /// <value>The time the reported location was logged, reported as a UNIX timestamp in milliseconds.</value>
    [DataMember(Name="time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "time")]
    public int? Time { get; set; }

    /// <summary>
    /// Vehicle Identification Number (VIN) of the vehicle.
    /// </summary>
    /// <value>Vehicle Identification Number (VIN) of the vehicle.</value>
    [DataMember(Name="vin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vin")]
    public string Vin { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleLocation {\n");
      sb.Append("  Heading: ").Append(Heading).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Latitude: ").Append(Latitude).Append("\n");
      sb.Append("  Location: ").Append(Location).Append("\n");
      sb.Append("  Longitude: ").Append(Longitude).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  OdometerMeters: ").Append(OdometerMeters).Append("\n");
      sb.Append("  OnTrip: ").Append(OnTrip).Append("\n");
      sb.Append("  Speed: ").Append(Speed).Append("\n");
      sb.Append("  Time: ").Append(Time).Append("\n");
      sb.Append("  Vin: ").Append(Vin).Append("\n");
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
