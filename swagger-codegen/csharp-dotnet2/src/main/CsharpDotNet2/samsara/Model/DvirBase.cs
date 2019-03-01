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
  public class DvirBase {
    /// <summary>
    /// Gets or Sets AuthorSignature
    /// </summary>
    [DataMember(Name="authorSignature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "authorSignature")]
    public DvirBaseAuthorSignature AuthorSignature { get; set; }

    /// <summary>
    /// Signifies if the defects on the vehicle corrected after the DVIR is done.
    /// </summary>
    /// <value>Signifies if the defects on the vehicle corrected after the DVIR is done.</value>
    [DataMember(Name="defectsCorrected", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defectsCorrected")]
    public bool? DefectsCorrected { get; set; }

    /// <summary>
    /// Signifies if the defects on this vehicle can be ignored.
    /// </summary>
    /// <value>Signifies if the defects on this vehicle can be ignored.</value>
    [DataMember(Name="defectsNeedNotBeCorrected", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defectsNeedNotBeCorrected")]
    public bool? DefectsNeedNotBeCorrected { get; set; }

    /// <summary>
    /// The id of this DVIR record.
    /// </summary>
    /// <value>The id of this DVIR record.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// Inspection type of the DVIR.
    /// </summary>
    /// <value>Inspection type of the DVIR.</value>
    [DataMember(Name="inspectionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inspectionType")]
    public string InspectionType { get; set; }

    /// <summary>
    /// The mechanics notes on the DVIR.
    /// </summary>
    /// <value>The mechanics notes on the DVIR.</value>
    [DataMember(Name="mechanicNotes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mechanicNotes")]
    public string MechanicNotes { get; set; }

    /// <summary>
    /// Gets or Sets MechanicOrAgentSignature
    /// </summary>
    [DataMember(Name="mechanicOrAgentSignature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mechanicOrAgentSignature")]
    public DvirBaseMechanicOrAgentSignature MechanicOrAgentSignature { get; set; }

    /// <summary>
    /// Gets or Sets NextDriverSignature
    /// </summary>
    [DataMember(Name="nextDriverSignature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nextDriverSignature")]
    public DvirBaseNextDriverSignature NextDriverSignature { get; set; }

    /// <summary>
    /// The odometer reading in miles for the vehicle when the DVIR was done.
    /// </summary>
    /// <value>The odometer reading in miles for the vehicle when the DVIR was done.</value>
    [DataMember(Name="odometerMiles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "odometerMiles")]
    public long? OdometerMiles { get; set; }

    /// <summary>
    /// Timestamp of this DVIR in UNIX milliseconds.
    /// </summary>
    /// <value>Timestamp of this DVIR in UNIX milliseconds.</value>
    [DataMember(Name="timeMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeMs")]
    public long? TimeMs { get; set; }

    /// <summary>
    /// Defects registered for the trailer which was part of the DVIR.
    /// </summary>
    /// <value>Defects registered for the trailer which was part of the DVIR.</value>
    [DataMember(Name="trailerDefects", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trailerDefects")]
    public List<DvirBaseTrailerDefects> TrailerDefects { get; set; }

    /// <summary>
    /// The id of the trailer which was part of the DVIR.
    /// </summary>
    /// <value>The id of the trailer which was part of the DVIR.</value>
    [DataMember(Name="trailerId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trailerId")]
    public int? TrailerId { get; set; }

    /// <summary>
    /// The name of the trailer which was part of the DVIR.
    /// </summary>
    /// <value>The name of the trailer which was part of the DVIR.</value>
    [DataMember(Name="trailerName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trailerName")]
    public string TrailerName { get; set; }

    /// <summary>
    /// Gets or Sets Vehicle
    /// </summary>
    [DataMember(Name="vehicle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicle")]
    public DvirBaseVehicle Vehicle { get; set; }

    /// <summary>
    /// The condition of vechile on which DVIR was done.
    /// </summary>
    /// <value>The condition of vechile on which DVIR was done.</value>
    [DataMember(Name="vehicleCondition", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleCondition")]
    public string VehicleCondition { get; set; }

    /// <summary>
    /// Defects registered for the vehicle which was part of the DVIR.
    /// </summary>
    /// <value>Defects registered for the vehicle which was part of the DVIR.</value>
    [DataMember(Name="vehicleDefects", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleDefects")]
    public List<DvirBaseTrailerDefects> VehicleDefects { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DvirBase {\n");
      sb.Append("  AuthorSignature: ").Append(AuthorSignature).Append("\n");
      sb.Append("  DefectsCorrected: ").Append(DefectsCorrected).Append("\n");
      sb.Append("  DefectsNeedNotBeCorrected: ").Append(DefectsNeedNotBeCorrected).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  InspectionType: ").Append(InspectionType).Append("\n");
      sb.Append("  MechanicNotes: ").Append(MechanicNotes).Append("\n");
      sb.Append("  MechanicOrAgentSignature: ").Append(MechanicOrAgentSignature).Append("\n");
      sb.Append("  NextDriverSignature: ").Append(NextDriverSignature).Append("\n");
      sb.Append("  OdometerMiles: ").Append(OdometerMiles).Append("\n");
      sb.Append("  TimeMs: ").Append(TimeMs).Append("\n");
      sb.Append("  TrailerDefects: ").Append(TrailerDefects).Append("\n");
      sb.Append("  TrailerId: ").Append(TrailerId).Append("\n");
      sb.Append("  TrailerName: ").Append(TrailerName).Append("\n");
      sb.Append("  Vehicle: ").Append(Vehicle).Append("\n");
      sb.Append("  VehicleCondition: ").Append(VehicleCondition).Append("\n");
      sb.Append("  VehicleDefects: ").Append(VehicleDefects).Append("\n");
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
