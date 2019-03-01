// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class DriverBase
    {
        /// <summary>
        /// Initializes a new instance of the DriverBase class.
        /// </summary>
        public DriverBase()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DriverBase class.
        /// </summary>
        /// <param name="name">Driver's name.</param>
        /// <param name="eldAdverseWeatherExemptionEnabled">Flag indicating
        /// this driver may use Adverse Weather exemptions in ELD logs.</param>
        /// <param name="eldBigDayExemptionEnabled">Flag indicating this driver
        /// may use Big Day excemptions in ELD logs.</param>
        /// <param name="eldDayStartHour">0 indicating midnight-to-midnight ELD
        /// driving hours, 12 to indicate noon-to-noon driving hours.</param>
        /// <param name="eldExempt">Flag indicating this driver is exempt from
        /// the Electronic Logging Mandate.</param>
        /// <param name="eldExemptReason">Reason that this driver is exempt
        /// from the Electronic Logging Mandate (see eldExempt).</param>
        /// <param name="eldPcEnabled">Flag indicating this driver may select
        /// the Personal Conveyance duty status in ELD logs.</param>
        /// <param name="eldYmEnabled">Flag indicating this driver may select
        /// the Yard Move duty status in ELD logs.</param>
        /// <param name="externalIds">Dictionary of external IDs (string
        /// key-value pairs)</param>
        /// <param name="groupId">ID of the group if the organization has
        /// multiple groups (uncommon).</param>
        /// <param name="licenseNumber">Driver's state issued license
        /// number.</param>
        /// <param name="licenseState">Abbreviation of state that issued
        /// driver's license.</param>
        /// <param name="notes">Notes about the driver.</param>
        /// <param name="phone">Driver's phone number. Please include only
        /// digits, ex. 4157771234</param>
        /// <param name="username">Driver's login username into the driver
        /// app.</param>
        /// <param name="vehicleId">ID of the vehicle assigned to the driver
        /// for static vehicle assignments. (uncommon).</param>
        public DriverBase(string name, bool? eldAdverseWeatherExemptionEnabled = default(bool?), bool? eldBigDayExemptionEnabled = default(bool?), int? eldDayStartHour = default(int?), bool? eldExempt = default(bool?), string eldExemptReason = default(string), bool? eldPcEnabled = default(bool?), bool? eldYmEnabled = default(bool?), IDictionary<string, string> externalIds = default(IDictionary<string, string>), long? groupId = default(long?), string licenseNumber = default(string), string licenseState = default(string), string notes = default(string), string phone = default(string), string username = default(string), long? vehicleId = default(long?))
        {
            EldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
            EldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
            EldDayStartHour = eldDayStartHour;
            EldExempt = eldExempt;
            EldExemptReason = eldExemptReason;
            EldPcEnabled = eldPcEnabled;
            EldYmEnabled = eldYmEnabled;
            ExternalIds = externalIds;
            GroupId = groupId;
            LicenseNumber = licenseNumber;
            LicenseState = licenseState;
            Name = name;
            Notes = notes;
            Phone = phone;
            Username = username;
            VehicleId = vehicleId;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets flag indicating this driver may use Adverse Weather
        /// exemptions in ELD logs.
        /// </summary>
        [JsonProperty(PropertyName = "eldAdverseWeatherExemptionEnabled")]
        public bool? EldAdverseWeatherExemptionEnabled { get; set; }

        /// <summary>
        /// Gets or sets flag indicating this driver may use Big Day
        /// excemptions in ELD logs.
        /// </summary>
        [JsonProperty(PropertyName = "eldBigDayExemptionEnabled")]
        public bool? EldBigDayExemptionEnabled { get; set; }

        /// <summary>
        /// Gets or sets 0 indicating midnight-to-midnight ELD driving hours,
        /// 12 to indicate noon-to-noon driving hours.
        /// </summary>
        [JsonProperty(PropertyName = "eldDayStartHour")]
        public int? EldDayStartHour { get; set; }

        /// <summary>
        /// Gets or sets flag indicating this driver is exempt from the
        /// Electronic Logging Mandate.
        /// </summary>
        [JsonProperty(PropertyName = "eldExempt")]
        public bool? EldExempt { get; set; }

        /// <summary>
        /// Gets or sets reason that this driver is exempt from the Electronic
        /// Logging Mandate (see eldExempt).
        /// </summary>
        [JsonProperty(PropertyName = "eldExemptReason")]
        public string EldExemptReason { get; set; }

        /// <summary>
        /// Gets or sets flag indicating this driver may select the Personal
        /// Conveyance duty status in ELD logs.
        /// </summary>
        [JsonProperty(PropertyName = "eldPcEnabled")]
        public bool? EldPcEnabled { get; set; }

        /// <summary>
        /// Gets or sets flag indicating this driver may select the Yard Move
        /// duty status in ELD logs.
        /// </summary>
        [JsonProperty(PropertyName = "eldYmEnabled")]
        public bool? EldYmEnabled { get; set; }

        /// <summary>
        /// Gets or sets dictionary of external IDs (string key-value pairs)
        /// </summary>
        [JsonProperty(PropertyName = "externalIds")]
        public IDictionary<string, string> ExternalIds { get; set; }

        /// <summary>
        /// Gets or sets ID of the group if the organization has multiple
        /// groups (uncommon).
        /// </summary>
        [JsonProperty(PropertyName = "groupId")]
        public long? GroupId { get; set; }

        /// <summary>
        /// Gets or sets driver's state issued license number.
        /// </summary>
        [JsonProperty(PropertyName = "licenseNumber")]
        public string LicenseNumber { get; set; }

        /// <summary>
        /// Gets or sets abbreviation of state that issued driver's license.
        /// </summary>
        [JsonProperty(PropertyName = "licenseState")]
        public string LicenseState { get; set; }

        /// <summary>
        /// Gets or sets driver's name.
        /// </summary>
        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets notes about the driver.
        /// </summary>
        [JsonProperty(PropertyName = "notes")]
        public string Notes { get; set; }

        /// <summary>
        /// Gets or sets driver's phone number. Please include only digits, ex.
        /// 4157771234
        /// </summary>
        [JsonProperty(PropertyName = "phone")]
        public string Phone { get; set; }

        /// <summary>
        /// Gets or sets driver's login username into the driver app.
        /// </summary>
        [JsonProperty(PropertyName = "username")]
        public string Username { get; set; }

        /// <summary>
        /// Gets or sets ID of the vehicle assigned to the driver for static
        /// vehicle assignments. (uncommon).
        /// </summary>
        [JsonProperty(PropertyName = "vehicleId")]
        public long? VehicleId { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Name == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Name");
            }
        }
    }
}