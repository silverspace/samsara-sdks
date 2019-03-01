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
  public class Driver {
    /// <summary>
    /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    /// </summary>
    /// <value>Flag indicating this driver may use Adverse Weather exemptions in ELD logs.</value>
    [DataMember(Name="eldAdverseWeatherExemptionEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eldAdverseWeatherExemptionEnabled")]
    public bool? EldAdverseWeatherExemptionEnabled { get; set; }

    /// <summary>
    /// Flag indicating this driver may use Big Day excemptions in ELD logs.
    /// </summary>
    /// <value>Flag indicating this driver may use Big Day excemptions in ELD logs.</value>
    [DataMember(Name="eldBigDayExemptionEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eldBigDayExemptionEnabled")]
    public bool? EldBigDayExemptionEnabled { get; set; }

    /// <summary>
    /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    /// </summary>
    /// <value>0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.</value>
    [DataMember(Name="eldDayStartHour", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eldDayStartHour")]
    public int? EldDayStartHour { get; set; }

    /// <summary>
    /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
    /// </summary>
    /// <value>Flag indicating this driver is exempt from the Electronic Logging Mandate.</value>
    [DataMember(Name="eldExempt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eldExempt")]
    public bool? EldExempt { get; set; }

    /// <summary>
    /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    /// </summary>
    /// <value>Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).</value>
    [DataMember(Name="eldExemptReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eldExemptReason")]
    public string EldExemptReason { get; set; }

    /// <summary>
    /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    /// </summary>
    /// <value>Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.</value>
    [DataMember(Name="eldPcEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eldPcEnabled")]
    public bool? EldPcEnabled { get; set; }

    /// <summary>
    /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
    /// </summary>
    /// <value>Flag indicating this driver may select the Yard Move duty status in ELD logs.</value>
    [DataMember(Name="eldYmEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eldYmEnabled")]
    public bool? EldYmEnabled { get; set; }

    /// <summary>
    /// Dictionary of external IDs (string key-value pairs)
    /// </summary>
    /// <value>Dictionary of external IDs (string key-value pairs)</value>
    [DataMember(Name="externalIds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalIds")]
    public Dictionary<string, string> ExternalIds { get; set; }

    /// <summary>
    /// ID of the group if the organization has multiple groups (uncommon).
    /// </summary>
    /// <value>ID of the group if the organization has multiple groups (uncommon).</value>
    [DataMember(Name="groupId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "groupId")]
    public long? GroupId { get; set; }

    /// <summary>
    /// Driver's state issued license number.
    /// </summary>
    /// <value>Driver's state issued license number.</value>
    [DataMember(Name="licenseNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "licenseNumber")]
    public string LicenseNumber { get; set; }

    /// <summary>
    /// Abbreviation of state that issued driver's license.
    /// </summary>
    /// <value>Abbreviation of state that issued driver's license.</value>
    [DataMember(Name="licenseState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "licenseState")]
    public string LicenseState { get; set; }

    /// <summary>
    /// Driver's name.
    /// </summary>
    /// <value>Driver's name.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Notes about the driver.
    /// </summary>
    /// <value>Notes about the driver.</value>
    [DataMember(Name="notes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notes")]
    public string Notes { get; set; }

    /// <summary>
    /// Driver's phone number. Please include only digits, ex. 4157771234
    /// </summary>
    /// <value>Driver's phone number. Please include only digits, ex. 4157771234</value>
    [DataMember(Name="phone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "phone")]
    public string Phone { get; set; }

    /// <summary>
    /// Driver's login username into the driver app.
    /// </summary>
    /// <value>Driver's login username into the driver app.</value>
    [DataMember(Name="username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "username")]
    public string Username { get; set; }

    /// <summary>
    /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    /// </summary>
    /// <value>ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).</value>
    [DataMember(Name="vehicleId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleId")]
    public long? VehicleId { get; set; }

    /// <summary>
    /// ID of the driver.
    /// </summary>
    /// <value>ID of the driver.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public long? Id { get; set; }

    /// <summary>
    /// True if the driver account has been deactivated.
    /// </summary>
    /// <value>True if the driver account has been deactivated.</value>
    [DataMember(Name="isDeactivated", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isDeactivated")]
    public bool? IsDeactivated { get; set; }

    /// <summary>
    /// Gets or Sets Tags
    /// </summary>
    [DataMember(Name="tags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tags")]
    public List<TagMetadata> Tags { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Driver {\n");
      sb.Append("  EldAdverseWeatherExemptionEnabled: ").Append(EldAdverseWeatherExemptionEnabled).Append("\n");
      sb.Append("  EldBigDayExemptionEnabled: ").Append(EldBigDayExemptionEnabled).Append("\n");
      sb.Append("  EldDayStartHour: ").Append(EldDayStartHour).Append("\n");
      sb.Append("  EldExempt: ").Append(EldExempt).Append("\n");
      sb.Append("  EldExemptReason: ").Append(EldExemptReason).Append("\n");
      sb.Append("  EldPcEnabled: ").Append(EldPcEnabled).Append("\n");
      sb.Append("  EldYmEnabled: ").Append(EldYmEnabled).Append("\n");
      sb.Append("  ExternalIds: ").Append(ExternalIds).Append("\n");
      sb.Append("  GroupId: ").Append(GroupId).Append("\n");
      sb.Append("  LicenseNumber: ").Append(LicenseNumber).Append("\n");
      sb.Append("  LicenseState: ").Append(LicenseState).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Notes: ").Append(Notes).Append("\n");
      sb.Append("  Phone: ").Append(Phone).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
      sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  IsDeactivated: ").Append(IsDeactivated).Append("\n");
      sb.Append("  Tags: ").Append(Tags).Append("\n");
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
