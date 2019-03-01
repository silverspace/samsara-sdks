using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class HosLogsSummaryResponseDrivers {
    /// <summary>
    /// The amount of time (in ms) remaining until the driver cannot drive without a rest break.
    /// </summary>
    /// <value>The amount of time (in ms) remaining until the driver cannot drive without a rest break.</value>
    [DataMember(Name="timeUntilBreak", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeUntilBreak")]
    public long? TimeUntilBreak { get; set; }

    /// <summary>
    /// Name of the vehicle.
    /// </summary>
    /// <value>Name of the vehicle.</value>
    [DataMember(Name="vehicleName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleName")]
    public string VehicleName { get; set; }

    /// <summary>
    /// The amount of driving time in violation today (in ms).
    /// </summary>
    /// <value>The amount of driving time in violation today (in ms).</value>
    [DataMember(Name="drivingInViolationToday", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "drivingInViolationToday")]
    public long? DrivingInViolationToday { get; set; }

    /// <summary>
    /// ID of the driver.
    /// </summary>
    /// <value>ID of the driver.</value>
    [DataMember(Name="driverId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverId")]
    public long? DriverId { get; set; }

    /// <summary>
    /// The amount of remaining cycle time (in ms).
    /// </summary>
    /// <value>The amount of remaining cycle time (in ms).</value>
    [DataMember(Name="cycleRemaining", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cycleRemaining")]
    public long? CycleRemaining { get; set; }

    /// <summary>
    /// Name of the driver.
    /// </summary>
    /// <value>Name of the driver.</value>
    [DataMember(Name="driverName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "driverName")]
    public string DriverName { get; set; }

    /// <summary>
    /// The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
    /// </summary>
    /// <value>The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.</value>
    [DataMember(Name="dutyStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dutyStatus")]
    public string DutyStatus { get; set; }

    /// <summary>
    /// The amount of cycle time (in ms) available tomorrow.
    /// </summary>
    /// <value>The amount of cycle time (in ms) available tomorrow.</value>
    [DataMember(Name="cycleTomorrow", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cycleTomorrow")]
    public long? CycleTomorrow { get; set; }

    /// <summary>
    /// The amount of remaining shift drive time (in ms).
    /// </summary>
    /// <value>The amount of remaining shift drive time (in ms).</value>
    [DataMember(Name="shiftDriveRemaining", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shiftDriveRemaining")]
    public long? ShiftDriveRemaining { get; set; }

    /// <summary>
    /// The amount of time (in ms) that the driver has been in the current `dutyStatus`.
    /// </summary>
    /// <value>The amount of time (in ms) that the driver has been in the current `dutyStatus`.</value>
    [DataMember(Name="timeInCurrentStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeInCurrentStatus")]
    public long? TimeInCurrentStatus { get; set; }

    /// <summary>
    /// The amount of driving time in violation in this cycle (in ms).
    /// </summary>
    /// <value>The amount of driving time in violation in this cycle (in ms).</value>
    [DataMember(Name="drivingInViolationCycle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "drivingInViolationCycle")]
    public long? DrivingInViolationCycle { get; set; }

    /// <summary>
    /// The amount of remaining shift time (in ms).
    /// </summary>
    /// <value>The amount of remaining shift time (in ms).</value>
    [DataMember(Name="shiftRemaining", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shiftRemaining")]
    public long? ShiftRemaining { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HosLogsSummaryResponseDrivers {\n");
      sb.Append("  TimeUntilBreak: ").Append(TimeUntilBreak).Append("\n");
      sb.Append("  VehicleName: ").Append(VehicleName).Append("\n");
      sb.Append("  DrivingInViolationToday: ").Append(DrivingInViolationToday).Append("\n");
      sb.Append("  DriverId: ").Append(DriverId).Append("\n");
      sb.Append("  CycleRemaining: ").Append(CycleRemaining).Append("\n");
      sb.Append("  DriverName: ").Append(DriverName).Append("\n");
      sb.Append("  DutyStatus: ").Append(DutyStatus).Append("\n");
      sb.Append("  CycleTomorrow: ").Append(CycleTomorrow).Append("\n");
      sb.Append("  ShiftDriveRemaining: ").Append(ShiftDriveRemaining).Append("\n");
      sb.Append("  TimeInCurrentStatus: ").Append(TimeInCurrentStatus).Append("\n");
      sb.Append("  DrivingInViolationCycle: ").Append(DrivingInViolationCycle).Append("\n");
      sb.Append("  ShiftRemaining: ").Append(ShiftRemaining).Append("\n");
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
