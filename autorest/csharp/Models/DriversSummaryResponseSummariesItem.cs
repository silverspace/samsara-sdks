// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class DriversSummaryResponseSummariesItem
    {
        /// <summary>
        /// Initializes a new instance of the
        /// DriversSummaryResponseSummariesItem class.
        /// </summary>
        public DriversSummaryResponseSummariesItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// DriversSummaryResponseSummariesItem class.
        /// </summary>
        /// <param name="activeMs">Duration in milliseconds that driver was on
        /// duty or driving during the requested time range</param>
        /// <param name="distanceMiles">Distance driven in miles, rounded to
        /// two decimal places.</param>
        /// <param name="driveMs">Duration in milliseconds that driver was
        /// driving during the requested time range</param>
        /// <param name="driverId">ID of the driver.</param>
        /// <param name="driverName">Name of the driver.</param>
        /// <param name="driverUsername">Username of the driver.</param>
        /// <param name="groupId">Group of the driver.</param>
        /// <param name="onDutyMs">Duration in milliseconds that driver was on
        /// duty during the requested time range</param>
        public DriversSummaryResponseSummariesItem(double? activeMs = default(double?), double? distanceMiles = default(double?), double? driveMs = default(double?), long? driverId = default(long?), string driverName = default(string), string driverUsername = default(string), long? groupId = default(long?), double? onDutyMs = default(double?))
        {
            ActiveMs = activeMs;
            DistanceMiles = distanceMiles;
            DriveMs = driveMs;
            DriverId = driverId;
            DriverName = driverName;
            DriverUsername = driverUsername;
            GroupId = groupId;
            OnDutyMs = onDutyMs;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets duration in milliseconds that driver was on duty or
        /// driving during the requested time range
        /// </summary>
        [JsonProperty(PropertyName = "activeMs")]
        public double? ActiveMs { get; set; }

        /// <summary>
        /// Gets or sets distance driven in miles, rounded to two decimal
        /// places.
        /// </summary>
        [JsonProperty(PropertyName = "distanceMiles")]
        public double? DistanceMiles { get; set; }

        /// <summary>
        /// Gets or sets duration in milliseconds that driver was driving
        /// during the requested time range
        /// </summary>
        [JsonProperty(PropertyName = "driveMs")]
        public double? DriveMs { get; set; }

        /// <summary>
        /// Gets or sets ID of the driver.
        /// </summary>
        [JsonProperty(PropertyName = "driverId")]
        public long? DriverId { get; set; }

        /// <summary>
        /// Gets or sets name of the driver.
        /// </summary>
        [JsonProperty(PropertyName = "driverName")]
        public string DriverName { get; set; }

        /// <summary>
        /// Gets or sets username of the driver.
        /// </summary>
        [JsonProperty(PropertyName = "driverUsername")]
        public string DriverUsername { get; set; }

        /// <summary>
        /// Gets or sets group of the driver.
        /// </summary>
        [JsonProperty(PropertyName = "groupId")]
        public long? GroupId { get; set; }

        /// <summary>
        /// Gets or sets duration in milliseconds that driver was on duty
        /// during the requested time range
        /// </summary>
        [JsonProperty(PropertyName = "onDutyMs")]
        public double? OnDutyMs { get; set; }

    }
}
