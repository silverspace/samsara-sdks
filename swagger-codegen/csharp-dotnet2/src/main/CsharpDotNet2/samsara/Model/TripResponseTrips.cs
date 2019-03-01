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
  public class TripResponseTrips {
    /// <summary>
    /// Length of the trip in meters.
    /// </summary>
    /// <value>Length of the trip in meters.</value>
    [DataMember(Name="distanceMeters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "distanceMeters")]
    public int? DistanceMeters { get; set; }

    /// <summary>
    /// ID of the driver.
    /// </summary>
    /// <value>ID of the driver.</value>
    [DataMember(Name="driverId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverId")]
    public int? DriverId { get; set; }

    /// <summary>
    /// Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
    /// </summary>
    /// <value>Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.</value>
    [DataMember(Name="endAddress", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endAddress")]
    public string EndAddress { get; set; }

    /// <summary>
    /// Gets or Sets EndCoordinates
    /// </summary>
    [DataMember(Name="endCoordinates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endCoordinates")]
    public TripResponseEndCoordinates EndCoordinates { get; set; }

    /// <summary>
    /// Geocoded street address of start (latitude, longitude) coordinates.
    /// </summary>
    /// <value>Geocoded street address of start (latitude, longitude) coordinates.</value>
    [DataMember(Name="endLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endLocation")]
    public string EndLocation { get; set; }

    /// <summary>
    /// End of the trip in UNIX milliseconds.
    /// </summary>
    /// <value>End of the trip in UNIX milliseconds.</value>
    [DataMember(Name="endMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endMs")]
    public int? EndMs { get; set; }

    /// <summary>
    /// Odometer reading at the end of the trip.
    /// </summary>
    /// <value>Odometer reading at the end of the trip.</value>
    [DataMember(Name="endOdometer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endOdometer")]
    public int? EndOdometer { get; set; }

    /// <summary>
    /// Amount in milliliters of fuel consumed on this trip.
    /// </summary>
    /// <value>Amount in milliliters of fuel consumed on this trip.</value>
    [DataMember(Name="fuelConsumedMl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fuelConsumedMl")]
    public int? FuelConsumedMl { get; set; }

    /// <summary>
    /// Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
    /// </summary>
    /// <value>Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.</value>
    [DataMember(Name="startAddress", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startAddress")]
    public string StartAddress { get; set; }

    /// <summary>
    /// Gets or Sets StartCoordinates
    /// </summary>
    [DataMember(Name="startCoordinates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startCoordinates")]
    public TripResponseStartCoordinates StartCoordinates { get; set; }

    /// <summary>
    /// Geocoded street address of start (latitude, longitude) coordinates.
    /// </summary>
    /// <value>Geocoded street address of start (latitude, longitude) coordinates.</value>
    [DataMember(Name="startLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startLocation")]
    public string StartLocation { get; set; }

    /// <summary>
    /// Beginning of the trip in UNIX milliseconds.
    /// </summary>
    /// <value>Beginning of the trip in UNIX milliseconds.</value>
    [DataMember(Name="startMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startMs")]
    public int? StartMs { get; set; }

    /// <summary>
    /// Odometer reading at the beginning of the trip.
    /// </summary>
    /// <value>Odometer reading at the beginning of the trip.</value>
    [DataMember(Name="startOdometer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startOdometer")]
    public int? StartOdometer { get; set; }

    /// <summary>
    /// Length in meters trip spent on toll roads.
    /// </summary>
    /// <value>Length in meters trip spent on toll roads.</value>
    [DataMember(Name="tollMeters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tollMeters")]
    public int? TollMeters { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TripResponseTrips {\n");
      sb.Append("  DistanceMeters: ").Append(DistanceMeters).Append("\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  EndAddress: ").Append(EndAddress).Append("\n");
      sb.Append("  EndCoordinates: ").Append(EndCoordinates).Append("\n");
      sb.Append("  EndLocation: ").Append(EndLocation).Append("\n");
      sb.Append("  EndMs: ").Append(EndMs).Append("\n");
      sb.Append("  EndOdometer: ").Append(EndOdometer).Append("\n");
      sb.Append("  FuelConsumedMl: ").Append(FuelConsumedMl).Append("\n");
      sb.Append("  StartAddress: ").Append(StartAddress).Append("\n");
      sb.Append("  StartCoordinates: ").Append(StartCoordinates).Append("\n");
      sb.Append("  StartLocation: ").Append(StartLocation).Append("\n");
      sb.Append("  StartMs: ").Append(StartMs).Append("\n");
      sb.Append("  StartOdometer: ").Append(StartOdometer).Append("\n");
      sb.Append("  TollMeters: ").Append(TollMeters).Append("\n");
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
