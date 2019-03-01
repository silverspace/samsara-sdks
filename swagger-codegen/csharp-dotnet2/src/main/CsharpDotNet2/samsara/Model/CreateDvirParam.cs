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
  public class CreateDvirParam {
    /// <summary>
    /// Only type 'mechanic' is currently accepted.
    /// </summary>
    /// <value>Only type 'mechanic' is currently accepted.</value>
    [DataMember(Name="inspectionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inspectionType")]
    public string InspectionType { get; set; }

    /// <summary>
    /// Any notes from the mechanic.
    /// </summary>
    /// <value>Any notes from the mechanic.</value>
    [DataMember(Name="mechanicNotes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mechanicNotes")]
    public string MechanicNotes { get; set; }

    /// <summary>
    /// The current odometer of the vehicle.
    /// </summary>
    /// <value>The current odometer of the vehicle.</value>
    [DataMember(Name="odometerMiles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "odometerMiles")]
    public int? OdometerMiles { get; set; }

    /// <summary>
    /// Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    /// </summary>
    /// <value>Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.</value>
    [DataMember(Name="previousDefectsCorrected", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "previousDefectsCorrected")]
    public bool? PreviousDefectsCorrected { get; set; }

    /// <summary>
    /// Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
    /// </summary>
    /// <value>Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.</value>
    [DataMember(Name="previousDefectsIgnored", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "previousDefectsIgnored")]
    public bool? PreviousDefectsIgnored { get; set; }

    /// <summary>
    /// Whether or not this vehicle or trailer is safe to drive.
    /// </summary>
    /// <value>Whether or not this vehicle or trailer is safe to drive.</value>
    [DataMember(Name="safe", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "safe")]
    public string Safe { get; set; }

    /// <summary>
    /// Id of trailer being inspected. Either vehicleId or trailerId must be provided.
    /// </summary>
    /// <value>Id of trailer being inspected. Either vehicleId or trailerId must be provided.</value>
    [DataMember(Name="trailerId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trailerId")]
    public int? TrailerId { get; set; }

    /// <summary>
    /// The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
    /// </summary>
    /// <value>The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.</value>
    [DataMember(Name="userEmail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userEmail")]
    public string UserEmail { get; set; }

    /// <summary>
    /// Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
    /// </summary>
    /// <value>Id of vehicle being inspected. Either vehicleId or trailerId must be provided.</value>
    [DataMember(Name="vehicleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleId")]
    public int? VehicleId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CreateDvirParam {\n");
      sb.Append("  InspectionType: ").Append(InspectionType).Append("\n");
      sb.Append("  MechanicNotes: ").Append(MechanicNotes).Append("\n");
      sb.Append("  OdometerMiles: ").Append(OdometerMiles).Append("\n");
      sb.Append("  PreviousDefectsCorrected: ").Append(PreviousDefectsCorrected).Append("\n");
      sb.Append("  PreviousDefectsIgnored: ").Append(PreviousDefectsIgnored).Append("\n");
      sb.Append("  Safe: ").Append(Safe).Append("\n");
      sb.Append("  TrailerId: ").Append(TrailerId).Append("\n");
      sb.Append("  UserEmail: ").Append(UserEmail).Append("\n");
      sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
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
