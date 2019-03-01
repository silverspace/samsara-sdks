/*
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace samsara.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class DispatchJob : IEquatable<DispatchJob>
    { 
        /// <summary>
        /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
        /// </summary>
        /// <value>The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.</value>
        [DataMember(Name="destination_address")]
        public string DestinationAddress { get; set; }

        /// <summary>
        /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
        /// </summary>
        /// <value>ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.</value>
        [DataMember(Name="destination_address_id")]
        public long? DestinationAddressId { get; set; }

        /// <summary>
        /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        /// <value>Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</value>
        [DataMember(Name="destination_lat")]
        public double? DestinationLat { get; set; }

        /// <summary>
        /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        /// <value>Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.</value>
        [DataMember(Name="destination_lng")]
        public double? DestinationLng { get; set; }

        /// <summary>
        /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
        /// </summary>
        /// <value>The name of the job destination. If provided, it will take precedence over the name of the address book entry.</value>
        [DataMember(Name="destination_name")]
        public string DestinationName { get; set; }

        /// <summary>
        /// Notes regarding the details of this job.
        /// </summary>
        /// <value>Notes regarding the details of this job.</value>
        [DataMember(Name="notes")]
        public string Notes { get; set; }

        /// <summary>
        /// The time at which the assigned driver is scheduled to arrive at the job destination.
        /// </summary>
        /// <value>The time at which the assigned driver is scheduled to arrive at the job destination.</value>
        [Required]
        [DataMember(Name="scheduled_arrival_time_ms")]
        public long? ScheduledArrivalTimeMs { get; set; }

        /// <summary>
        /// The time at which the assigned driver is scheduled to depart from the job destination.
        /// </summary>
        /// <value>The time at which the assigned driver is scheduled to depart from the job destination.</value>
        [DataMember(Name="scheduled_departure_time_ms")]
        public long? ScheduledDepartureTimeMs { get; set; }

        /// <summary>
        /// The time at which the driver arrived at the job destination.
        /// </summary>
        /// <value>The time at which the driver arrived at the job destination.</value>
        [DataMember(Name="arrived_at_ms")]
        public long? ArrivedAtMs { get; set; }

        /// <summary>
        /// The time at which the job was marked complete (e.g. started driving to the next destination).
        /// </summary>
        /// <value>The time at which the job was marked complete (e.g. started driving to the next destination).</value>
        [DataMember(Name="completed_at_ms")]
        public long? CompletedAtMs { get; set; }

        /// <summary>
        /// ID of the route that this job belongs to.
        /// </summary>
        /// <value>ID of the route that this job belongs to.</value>
        [Required]
        [DataMember(Name="dispatch_route_id")]
        public long? DispatchRouteId { get; set; }

        /// <summary>
        /// ID of the driver assigned to the dispatch job.
        /// </summary>
        /// <value>ID of the driver assigned to the dispatch job.</value>
        [DataMember(Name="driver_id")]
        public long? DriverId { get; set; }

        /// <summary>
        /// The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
        /// </summary>
        /// <value>The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).</value>
        [DataMember(Name="en_route_at_ms")]
        public long? EnRouteAtMs { get; set; }

        /// <summary>
        /// The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
        /// </summary>
        /// <value>The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.</value>
        [DataMember(Name="estimated_arrival_ms")]
        public long? EstimatedArrivalMs { get; set; }

        /// <summary>
        /// Fleet viewer url of the dispatch job.
        /// </summary>
        /// <value>Fleet viewer url of the dispatch job.</value>
        [DataMember(Name="fleet_viewer_url")]
        public string FleetViewerUrl { get; set; }

        /// <summary>
        /// Gets or Sets GroupId
        /// </summary>
        [Required]
        [DataMember(Name="group_id")]
        public long? GroupId { get; set; }

        /// <summary>
        /// ID of the Samsara dispatch job.
        /// </summary>
        /// <value>ID of the Samsara dispatch job.</value>
        [Required]
        [DataMember(Name="id")]
        public long? Id { get; set; }

        /// <summary>
        /// Gets or Sets JobState
        /// </summary>
        [Required]
        [DataMember(Name="job_state")]
        public JobStatus JobState { get; set; }

        /// <summary>
        /// The time at which the job was marked skipped.
        /// </summary>
        /// <value>The time at which the job was marked skipped.</value>
        [DataMember(Name="skipped_at_ms")]
        public long? SkippedAtMs { get; set; }

        /// <summary>
        /// ID of the vehicle used for the dispatch job.
        /// </summary>
        /// <value>ID of the vehicle used for the dispatch job.</value>
        [DataMember(Name="vehicle_id")]
        public long? VehicleId { get; set; }

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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((DispatchJob)obj);
        }

        /// <summary>
        /// Returns true if DispatchJob instances are equal
        /// </summary>
        /// <param name="other">Instance of DispatchJob to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DispatchJob other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DestinationAddress == other.DestinationAddress ||
                    DestinationAddress != null &&
                    DestinationAddress.Equals(other.DestinationAddress)
                ) && 
                (
                    DestinationAddressId == other.DestinationAddressId ||
                    DestinationAddressId != null &&
                    DestinationAddressId.Equals(other.DestinationAddressId)
                ) && 
                (
                    DestinationLat == other.DestinationLat ||
                    DestinationLat != null &&
                    DestinationLat.Equals(other.DestinationLat)
                ) && 
                (
                    DestinationLng == other.DestinationLng ||
                    DestinationLng != null &&
                    DestinationLng.Equals(other.DestinationLng)
                ) && 
                (
                    DestinationName == other.DestinationName ||
                    DestinationName != null &&
                    DestinationName.Equals(other.DestinationName)
                ) && 
                (
                    Notes == other.Notes ||
                    Notes != null &&
                    Notes.Equals(other.Notes)
                ) && 
                (
                    ScheduledArrivalTimeMs == other.ScheduledArrivalTimeMs ||
                    ScheduledArrivalTimeMs != null &&
                    ScheduledArrivalTimeMs.Equals(other.ScheduledArrivalTimeMs)
                ) && 
                (
                    ScheduledDepartureTimeMs == other.ScheduledDepartureTimeMs ||
                    ScheduledDepartureTimeMs != null &&
                    ScheduledDepartureTimeMs.Equals(other.ScheduledDepartureTimeMs)
                ) && 
                (
                    ArrivedAtMs == other.ArrivedAtMs ||
                    ArrivedAtMs != null &&
                    ArrivedAtMs.Equals(other.ArrivedAtMs)
                ) && 
                (
                    CompletedAtMs == other.CompletedAtMs ||
                    CompletedAtMs != null &&
                    CompletedAtMs.Equals(other.CompletedAtMs)
                ) && 
                (
                    DispatchRouteId == other.DispatchRouteId ||
                    DispatchRouteId != null &&
                    DispatchRouteId.Equals(other.DispatchRouteId)
                ) && 
                (
                    DriverId == other.DriverId ||
                    DriverId != null &&
                    DriverId.Equals(other.DriverId)
                ) && 
                (
                    EnRouteAtMs == other.EnRouteAtMs ||
                    EnRouteAtMs != null &&
                    EnRouteAtMs.Equals(other.EnRouteAtMs)
                ) && 
                (
                    EstimatedArrivalMs == other.EstimatedArrivalMs ||
                    EstimatedArrivalMs != null &&
                    EstimatedArrivalMs.Equals(other.EstimatedArrivalMs)
                ) && 
                (
                    FleetViewerUrl == other.FleetViewerUrl ||
                    FleetViewerUrl != null &&
                    FleetViewerUrl.Equals(other.FleetViewerUrl)
                ) && 
                (
                    GroupId == other.GroupId ||
                    GroupId != null &&
                    GroupId.Equals(other.GroupId)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    JobState == other.JobState ||
                    JobState != null &&
                    JobState.Equals(other.JobState)
                ) && 
                (
                    SkippedAtMs == other.SkippedAtMs ||
                    SkippedAtMs != null &&
                    SkippedAtMs.Equals(other.SkippedAtMs)
                ) && 
                (
                    VehicleId == other.VehicleId ||
                    VehicleId != null &&
                    VehicleId.Equals(other.VehicleId)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (DestinationAddress != null)
                    hashCode = hashCode * 59 + DestinationAddress.GetHashCode();
                    if (DestinationAddressId != null)
                    hashCode = hashCode * 59 + DestinationAddressId.GetHashCode();
                    if (DestinationLat != null)
                    hashCode = hashCode * 59 + DestinationLat.GetHashCode();
                    if (DestinationLng != null)
                    hashCode = hashCode * 59 + DestinationLng.GetHashCode();
                    if (DestinationName != null)
                    hashCode = hashCode * 59 + DestinationName.GetHashCode();
                    if (Notes != null)
                    hashCode = hashCode * 59 + Notes.GetHashCode();
                    if (ScheduledArrivalTimeMs != null)
                    hashCode = hashCode * 59 + ScheduledArrivalTimeMs.GetHashCode();
                    if (ScheduledDepartureTimeMs != null)
                    hashCode = hashCode * 59 + ScheduledDepartureTimeMs.GetHashCode();
                    if (ArrivedAtMs != null)
                    hashCode = hashCode * 59 + ArrivedAtMs.GetHashCode();
                    if (CompletedAtMs != null)
                    hashCode = hashCode * 59 + CompletedAtMs.GetHashCode();
                    if (DispatchRouteId != null)
                    hashCode = hashCode * 59 + DispatchRouteId.GetHashCode();
                    if (DriverId != null)
                    hashCode = hashCode * 59 + DriverId.GetHashCode();
                    if (EnRouteAtMs != null)
                    hashCode = hashCode * 59 + EnRouteAtMs.GetHashCode();
                    if (EstimatedArrivalMs != null)
                    hashCode = hashCode * 59 + EstimatedArrivalMs.GetHashCode();
                    if (FleetViewerUrl != null)
                    hashCode = hashCode * 59 + FleetViewerUrl.GetHashCode();
                    if (GroupId != null)
                    hashCode = hashCode * 59 + GroupId.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (JobState != null)
                    hashCode = hashCode * 59 + JobState.GetHashCode();
                    if (SkippedAtMs != null)
                    hashCode = hashCode * 59 + SkippedAtMs.GetHashCode();
                    if (VehicleId != null)
                    hashCode = hashCode * 59 + VehicleId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DispatchJob left, DispatchJob right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DispatchJob left, DispatchJob right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
