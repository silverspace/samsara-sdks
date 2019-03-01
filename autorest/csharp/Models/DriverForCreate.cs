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

    public partial class DriverForCreate : DriverBase
    {
        /// <summary>
        /// Initializes a new instance of the DriverForCreate class.
        /// </summary>
        public DriverForCreate()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DriverForCreate class.
        /// </summary>
        /// <param name="name">Driver's name.</param>
        /// <param name="password">Driver's password for the driver
        /// app.</param>
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
        public DriverForCreate(string name, string password, bool? eldAdverseWeatherExemptionEnabled = default(bool?), bool? eldBigDayExemptionEnabled = default(bool?), int? eldDayStartHour = default(int?), bool? eldExempt = default(bool?), string eldExemptReason = default(string), bool? eldPcEnabled = default(bool?), bool? eldYmEnabled = default(bool?), IDictionary<string, string> externalIds = default(IDictionary<string, string>), long? groupId = default(long?), string licenseNumber = default(string), string licenseState = default(string), string notes = default(string), string phone = default(string), string username = default(string), long? vehicleId = default(long?), IList<double?> tagIds = default(IList<double?>))
            : base(name, eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled, eldDayStartHour, eldExempt, eldExemptReason, eldPcEnabled, eldYmEnabled, externalIds, groupId, licenseNumber, licenseState, notes, phone, username, vehicleId)
        {
            Password = password;
            TagIds = tagIds;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets driver's password for the driver app.
        /// </summary>
        [JsonProperty(PropertyName = "password")]
        public string Password { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "tagIds")]
        public IList<double?> TagIds { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public override void Validate()
        {
            base.Validate();
            if (Password == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Password");
            }
        }
    }
}
