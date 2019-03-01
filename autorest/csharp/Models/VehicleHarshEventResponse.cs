// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Harsh event details for a vehicle
    /// </summary>
    public partial class VehicleHarshEventResponse
    {
        /// <summary>
        /// Initializes a new instance of the VehicleHarshEventResponse class.
        /// </summary>
        public VehicleHarshEventResponse()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the VehicleHarshEventResponse class.
        /// </summary>
        /// <param name="harshEventType">Type of the harsh event. One of:
        /// [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine,
        /// ROP Brake, YC Engine, YC Brake, Harsh Event]</param>
        /// <param name="incidentReportUrl">URL of the associated incident
        /// report page</param>
        /// <param name="downloadForwardVideoUrl">URL for downloading the
        /// forward facing video</param>
        /// <param name="downloadInwardVideoUrl">URL for downloading the inward
        /// facing video</param>
        /// <param name="downloadTrackedInwardVideoUrl">URL for downloading the
        /// tracked inward facing video</param>
        /// <param name="isDistracted">Whether the driver was deemed distracted
        /// during this harsh event</param>
        public VehicleHarshEventResponse(string harshEventType, string incidentReportUrl, string downloadForwardVideoUrl = default(string), string downloadInwardVideoUrl = default(string), string downloadTrackedInwardVideoUrl = default(string), bool? isDistracted = default(bool?), VehicleHarshEventResponseLocation location = default(VehicleHarshEventResponseLocation))
        {
            DownloadForwardVideoUrl = downloadForwardVideoUrl;
            DownloadInwardVideoUrl = downloadInwardVideoUrl;
            DownloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
            HarshEventType = harshEventType;
            IncidentReportUrl = incidentReportUrl;
            IsDistracted = isDistracted;
            Location = location;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets URL for downloading the forward facing video
        /// </summary>
        [JsonProperty(PropertyName = "downloadForwardVideoUrl")]
        public string DownloadForwardVideoUrl { get; set; }

        /// <summary>
        /// Gets or sets URL for downloading the inward facing video
        /// </summary>
        [JsonProperty(PropertyName = "downloadInwardVideoUrl")]
        public string DownloadInwardVideoUrl { get; set; }

        /// <summary>
        /// Gets or sets URL for downloading the tracked inward facing video
        /// </summary>
        [JsonProperty(PropertyName = "downloadTrackedInwardVideoUrl")]
        public string DownloadTrackedInwardVideoUrl { get; set; }

        /// <summary>
        /// Gets or sets type of the harsh event. One of: [Crash, Harsh
        /// Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC
        /// Engine, YC Brake, Harsh Event]
        /// </summary>
        [JsonProperty(PropertyName = "harshEventType")]
        public string HarshEventType { get; set; }

        /// <summary>
        /// Gets or sets URL of the associated incident report page
        /// </summary>
        [JsonProperty(PropertyName = "incidentReportUrl")]
        public string IncidentReportUrl { get; set; }

        /// <summary>
        /// Gets or sets whether the driver was deemed distracted during this
        /// harsh event
        /// </summary>
        [JsonProperty(PropertyName = "isDistracted")]
        public bool? IsDistracted { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "location")]
        public VehicleHarshEventResponseLocation Location { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (HarshEventType == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "HarshEventType");
            }
            if (IncidentReportUrl == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "IncidentReportUrl");
            }
        }
    }
}