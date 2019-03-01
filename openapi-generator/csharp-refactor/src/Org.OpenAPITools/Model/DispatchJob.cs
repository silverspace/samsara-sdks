/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// DispatchJob
    /// </summary>
    [DataContract]
    public partial class DispatchJob :  IEquatable<DispatchJob>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DispatchJob" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DispatchJob() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DispatchJob" /> class.
        /// </summary>
        /// <param name="destinationAddress">The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided..</param>
        /// <param name="destinationAddressId">ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided..</param>
        /// <param name="destinationLat">Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided..</param>
        /// <param name="destinationLng">Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided..</param>
        /// <param name="destinationName">The name of the job destination. If provided, it will take precedence over the name of the address book entry..</param>
        /// <param name="notes">Notes regarding the details of this job..</param>
        /// <param name="scheduledArrivalTimeMs">The time at which the assigned driver is scheduled to arrive at the job destination. (required).</param>
        /// <param name="scheduledDepartureTimeMs">The time at which the assigned driver is scheduled to depart from the job destination..</param>
        /// <param name="arrivedAtMs">The time at which the driver arrived at the job destination..</param>
        /// <param name="completedAtMs">The time at which the job was marked complete (e.g. started driving to the next destination)..</param>
        /// <param name="dispatchRouteId">ID of the route that this job belongs to. (required).</param>
        /// <param name="driverId">ID of the driver assigned to the dispatch job..</param>
        /// <param name="enRouteAtMs">The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination)..</param>
        /// <param name="estimatedArrivalMs">The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs..</param>
        /// <param name="fleetViewerUrl">Fleet viewer url of the dispatch job..</param>
        /// <param name="groupId">groupId (required).</param>
        /// <param name="id">ID of the Samsara dispatch job. (required).</param>
        /// <param name="jobState">jobState (required).</param>
        /// <param name="skippedAtMs">The time at which the job was marked skipped..</param>
        /// <param name="vehicleId">ID of the vehicle used for the dispatch job..</param>
        public DispatchJob(string destinationAddress = default(string), long destinationAddressId = default(long), double destinationLat = default(double), double destinationLng = default(double), string destinationName = default(string), string notes = default(string), long scheduledArrivalTimeMs = default(long), long scheduledDepartureTimeMs = default(long), long arrivedAtMs = default(long), long completedAtMs = default(long), long dispatchRouteId = default(long), long driverId = default(long), long enRouteAtMs = default(long), long estimatedArrivalMs = default(long), string fleetViewerUrl = default(string), long groupId = default(long), long id = default(long), JobStatus jobState = default(JobStatus), long skippedAtMs = default(long), long vehicleId = default(long))
        {
            // to ensure "scheduledArrivalTimeMs" is required (not null)
            if (scheduledArrivalTimeMs == null)
            {
                throw new InvalidDataException("scheduledArrivalTimeMs is a required property for DispatchJob and cannot be null");
            }
            else
            {
                this.ScheduledArrivalTimeMs = scheduledArrivalTimeMs;
            }

            // to ensure "dispatchRouteId" is required (not null)
            if (dispatchRouteId == null)
            {
                throw new InvalidDataException("dispatchRouteId is a required property for DispatchJob and cannot be null");
            }
            else
            {
                this.DispatchRouteId = dispatchRouteId;
            }

            // to ensure "groupId" is required (not null)
            if (groupId == null)
            {
                throw new InvalidDataException("groupId is a required property for DispatchJob and cannot be null");
            }
            else
            {
                this.GroupId = groupId;
            }

            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for DispatchJob and cannot be null");
            }
            else
            {
                this.Id = id;
            }

            // to ensure "jobState" is required (not null)
            if (jobState == null)
            {
                throw new InvalidDataException("jobState is a required property for DispatchJob and cannot be null");
            }
            else
            {
                this.JobState = jobState;
            }

            this.DestinationAddress = destinationAddress;
            this.DestinationAddressId = destinationAddressId;
            this.DestinationLat = destinationLat;
            this.DestinationLng = destinationLng;
            this.DestinationName = destinationName;
            this.Notes = notes;
            this.ScheduledDepartureTimeMs = scheduledDepartureTimeMs;
            this.ArrivedAtMs = arrivedAtMs;
            this.CompletedAtMs = completedAtMs;
            this.DriverId = driverId;
            this.EnRouteAtMs = enRouteAtMs;
            this.EstimatedArrivalMs = estimatedArrivalMs;
            this.FleetViewerUrl = fleetViewerUrl;
            this.SkippedAtMs = skippedAtMs;
            this.VehicleId = vehicleId;
        }
        
        /// <summary>
        /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
        /// </summary>
        /// <value>The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.</value>
        [DataMember(Name="destination_address", EmitDefaultValue=false)]
        public string DestinationAddress { get; set; }

        /// <summary>
        /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
        /// </summary>
        /// <value>ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.</value>
        [DataMember(Name="destination_address_id", EmitDefaultValue=false)]
        public long DestinationAddressId { get; set; }

        /// <summary>
        /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        /// <value>Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</value>
        [DataMember(Name="destination_lat", EmitDefaultValue=false)]
        public double DestinationLat { get; set; }

        /// <summary>
        /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        /// <value>Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</value>
        [DataMember(Name="destination_lng", EmitDefaultValue=false)]
        public double DestinationLng { get; set; }

        /// <summary>
        /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
        /// </summary>
        /// <value>The name of the job destination. If provided, it will take precedence over the name of the address book entry.</value>
        [DataMember(Name="destination_name", EmitDefaultValue=false)]
        public string DestinationName { get; set; }

        /// <summary>
        /// Notes regarding the details of this job.
        /// </summary>
        /// <value>Notes regarding the details of this job.</value>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public string Notes { get; set; }

        /// <summary>
        /// The time at which the assigned driver is scheduled to arrive at the job destination.
        /// </summary>
        /// <value>The time at which the assigned driver is scheduled to arrive at the job destination.</value>
        [DataMember(Name="scheduled_arrival_time_ms", EmitDefaultValue=false)]
        public long ScheduledArrivalTimeMs { get; set; }

        /// <summary>
        /// The time at which the assigned driver is scheduled to depart from the job destination.
        /// </summary>
        /// <value>The time at which the assigned driver is scheduled to depart from the job destination.</value>
        [DataMember(Name="scheduled_departure_time_ms", EmitDefaultValue=false)]
        public long ScheduledDepartureTimeMs { get; set; }

        /// <summary>
        /// The time at which the driver arrived at the job destination.
        /// </summary>
        /// <value>The time at which the driver arrived at the job destination.</value>
        [DataMember(Name="arrived_at_ms", EmitDefaultValue=false)]
        public long ArrivedAtMs { get; set; }

        /// <summary>
        /// The time at which the job was marked complete (e.g. started driving to the next destination).
        /// </summary>
        /// <value>The time at which the job was marked complete (e.g. started driving to the next destination).</value>
        [DataMember(Name="completed_at_ms", EmitDefaultValue=false)]
        public long CompletedAtMs { get; set; }

        /// <summary>
        /// ID of the route that this job belongs to.
        /// </summary>
        /// <value>ID of the route that this job belongs to.</value>
        [DataMember(Name="dispatch_route_id", EmitDefaultValue=false)]
        public long DispatchRouteId { get; set; }

        /// <summary>
        /// ID of the driver assigned to the dispatch job.
        /// </summary>
        /// <value>ID of the driver assigned to the dispatch job.</value>
        [DataMember(Name="driver_id", EmitDefaultValue=false)]
        public long DriverId { get; set; }

        /// <summary>
        /// The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
        /// </summary>
        /// <value>The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).</value>
        [DataMember(Name="en_route_at_ms", EmitDefaultValue=false)]
        public long EnRouteAtMs { get; set; }

        /// <summary>
        /// The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
        /// </summary>
        /// <value>The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.</value>
        [DataMember(Name="estimated_arrival_ms", EmitDefaultValue=false)]
        public long EstimatedArrivalMs { get; set; }

        /// <summary>
        /// Fleet viewer url of the dispatch job.
        /// </summary>
        /// <value>Fleet viewer url of the dispatch job.</value>
        [DataMember(Name="fleet_viewer_url", EmitDefaultValue=false)]
        public string FleetViewerUrl { get; set; }

        /// <summary>
        /// Gets or Sets GroupId
        /// </summary>
        [DataMember(Name="group_id", EmitDefaultValue=false)]
        public long GroupId { get; set; }

        /// <summary>
        /// ID of the Samsara dispatch job.
        /// </summary>
        /// <value>ID of the Samsara dispatch job.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long Id { get; set; }

        /// <summary>
        /// Gets or Sets JobState
        /// </summary>
        [DataMember(Name="job_state", EmitDefaultValue=false)]
        public JobStatus JobState { get; set; }

        /// <summary>
        /// The time at which the job was marked skipped.
        /// </summary>
        /// <value>The time at which the job was marked skipped.</value>
        [DataMember(Name="skipped_at_ms", EmitDefaultValue=false)]
        public long SkippedAtMs { get; set; }

        /// <summary>
        /// ID of the vehicle used for the dispatch job.
        /// </summary>
        /// <value>ID of the vehicle used for the dispatch job.</value>
        [DataMember(Name="vehicle_id", EmitDefaultValue=false)]
        public long VehicleId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DispatchJob {\n");
            sb.Append("  DestinationAddress: ").Append(DestinationAddress).Append("\n");
            sb.Append("  DestinationAddressId: ").Append(DestinationAddressId).Append("\n");
            sb.Append("  DestinationLat: ").Append(DestinationLat).Append("\n");
            sb.Append("  DestinationLng: ").Append(DestinationLng).Append("\n");
            sb.Append("  DestinationName: ").Append(DestinationName).Append("\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
            sb.Append("  ScheduledArrivalTimeMs: ").Append(ScheduledArrivalTimeMs).Append("\n");
            sb.Append("  ScheduledDepartureTimeMs: ").Append(ScheduledDepartureTimeMs).Append("\n");
            sb.Append("  ArrivedAtMs: ").Append(ArrivedAtMs).Append("\n");
            sb.Append("  CompletedAtMs: ").Append(CompletedAtMs).Append("\n");
            sb.Append("  DispatchRouteId: ").Append(DispatchRouteId).Append("\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  EnRouteAtMs: ").Append(EnRouteAtMs).Append("\n");
            sb.Append("  EstimatedArrivalMs: ").Append(EstimatedArrivalMs).Append("\n");
            sb.Append("  FleetViewerUrl: ").Append(FleetViewerUrl).Append("\n");
            sb.Append("  GroupId: ").Append(GroupId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  JobState: ").Append(JobState).Append("\n");
            sb.Append("  SkippedAtMs: ").Append(SkippedAtMs).Append("\n");
            sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as DispatchJob);
        }

        /// <summary>
        /// Returns true if DispatchJob instances are equal
        /// </summary>
        /// <param name="input">Instance of DispatchJob to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DispatchJob input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DestinationAddress == input.DestinationAddress ||
                    (this.DestinationAddress != null &&
                    this.DestinationAddress.Equals(input.DestinationAddress))
                ) && 
                (
                    this.DestinationAddressId == input.DestinationAddressId ||
                    (this.DestinationAddressId != null &&
                    this.DestinationAddressId.Equals(input.DestinationAddressId))
                ) && 
                (
                    this.DestinationLat == input.DestinationLat ||
                    (this.DestinationLat != null &&
                    this.DestinationLat.Equals(input.DestinationLat))
                ) && 
                (
                    this.DestinationLng == input.DestinationLng ||
                    (this.DestinationLng != null &&
                    this.DestinationLng.Equals(input.DestinationLng))
                ) && 
                (
                    this.DestinationName == input.DestinationName ||
                    (this.DestinationName != null &&
                    this.DestinationName.Equals(input.DestinationName))
                ) && 
                (
                    this.Notes == input.Notes ||
                    (this.Notes != null &&
                    this.Notes.Equals(input.Notes))
                ) && 
                (
                    this.ScheduledArrivalTimeMs == input.ScheduledArrivalTimeMs ||
                    (this.ScheduledArrivalTimeMs != null &&
                    this.ScheduledArrivalTimeMs.Equals(input.ScheduledArrivalTimeMs))
                ) && 
                (
                    this.ScheduledDepartureTimeMs == input.ScheduledDepartureTimeMs ||
                    (this.ScheduledDepartureTimeMs != null &&
                    this.ScheduledDepartureTimeMs.Equals(input.ScheduledDepartureTimeMs))
                ) && 
                (
                    this.ArrivedAtMs == input.ArrivedAtMs ||
                    (this.ArrivedAtMs != null &&
                    this.ArrivedAtMs.Equals(input.ArrivedAtMs))
                ) && 
                (
                    this.CompletedAtMs == input.CompletedAtMs ||
                    (this.CompletedAtMs != null &&
                    this.CompletedAtMs.Equals(input.CompletedAtMs))
                ) && 
                (
                    this.DispatchRouteId == input.DispatchRouteId ||
                    (this.DispatchRouteId != null &&
                    this.DispatchRouteId.Equals(input.DispatchRouteId))
                ) && 
                (
                    this.DriverId == input.DriverId ||
                    (this.DriverId != null &&
                    this.DriverId.Equals(input.DriverId))
                ) && 
                (
                    this.EnRouteAtMs == input.EnRouteAtMs ||
                    (this.EnRouteAtMs != null &&
                    this.EnRouteAtMs.Equals(input.EnRouteAtMs))
                ) && 
                (
                    this.EstimatedArrivalMs == input.EstimatedArrivalMs ||
                    (this.EstimatedArrivalMs != null &&
                    this.EstimatedArrivalMs.Equals(input.EstimatedArrivalMs))
                ) && 
                (
                    this.FleetViewerUrl == input.FleetViewerUrl ||
                    (this.FleetViewerUrl != null &&
                    this.FleetViewerUrl.Equals(input.FleetViewerUrl))
                ) && 
                (
                    this.GroupId == input.GroupId ||
                    (this.GroupId != null &&
                    this.GroupId.Equals(input.GroupId))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.JobState == input.JobState ||
                    (this.JobState != null &&
                    this.JobState.Equals(input.JobState))
                ) && 
                (
                    this.SkippedAtMs == input.SkippedAtMs ||
                    (this.SkippedAtMs != null &&
                    this.SkippedAtMs.Equals(input.SkippedAtMs))
                ) && 
                (
                    this.VehicleId == input.VehicleId ||
                    (this.VehicleId != null &&
                    this.VehicleId.Equals(input.VehicleId))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.DestinationAddress != null)
                    hashCode = hashCode * 59 + this.DestinationAddress.GetHashCode();
                if (this.DestinationAddressId != null)
                    hashCode = hashCode * 59 + this.DestinationAddressId.GetHashCode();
                if (this.DestinationLat != null)
                    hashCode = hashCode * 59 + this.DestinationLat.GetHashCode();
                if (this.DestinationLng != null)
                    hashCode = hashCode * 59 + this.DestinationLng.GetHashCode();
                if (this.DestinationName != null)
                    hashCode = hashCode * 59 + this.DestinationName.GetHashCode();
                if (this.Notes != null)
                    hashCode = hashCode * 59 + this.Notes.GetHashCode();
                if (this.ScheduledArrivalTimeMs != null)
                    hashCode = hashCode * 59 + this.ScheduledArrivalTimeMs.GetHashCode();
                if (this.ScheduledDepartureTimeMs != null)
                    hashCode = hashCode * 59 + this.ScheduledDepartureTimeMs.GetHashCode();
                if (this.ArrivedAtMs != null)
                    hashCode = hashCode * 59 + this.ArrivedAtMs.GetHashCode();
                if (this.CompletedAtMs != null)
                    hashCode = hashCode * 59 + this.CompletedAtMs.GetHashCode();
                if (this.DispatchRouteId != null)
                    hashCode = hashCode * 59 + this.DispatchRouteId.GetHashCode();
                if (this.DriverId != null)
                    hashCode = hashCode * 59 + this.DriverId.GetHashCode();
                if (this.EnRouteAtMs != null)
                    hashCode = hashCode * 59 + this.EnRouteAtMs.GetHashCode();
                if (this.EstimatedArrivalMs != null)
                    hashCode = hashCode * 59 + this.EstimatedArrivalMs.GetHashCode();
                if (this.FleetViewerUrl != null)
                    hashCode = hashCode * 59 + this.FleetViewerUrl.GetHashCode();
                if (this.GroupId != null)
                    hashCode = hashCode * 59 + this.GroupId.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.JobState != null)
                    hashCode = hashCode * 59 + this.JobState.GetHashCode();
                if (this.SkippedAtMs != null)
                    hashCode = hashCode * 59 + this.SkippedAtMs.GetHashCode();
                if (this.VehicleId != null)
                    hashCode = hashCode * 59 + this.VehicleId.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
