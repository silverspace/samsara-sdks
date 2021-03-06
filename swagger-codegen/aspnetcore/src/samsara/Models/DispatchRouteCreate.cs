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
    public partial class DispatchRouteCreate : IEquatable<DispatchRouteCreate>
    { 
        /// <summary>
        /// The time in Unix epoch milliseconds that the route actually ended.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the route actually ended.</value>
        [DataMember(Name="actual_end_ms")]
        public long? ActualEndMs { get; set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the route actually started.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the route actually started.</value>
        [DataMember(Name="actual_start_ms")]
        public long? ActualStartMs { get; set; }

        /// <summary>
        /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
        /// </summary>
        /// <value>ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.</value>
        [DataMember(Name="driver_id")]
        public long? DriverId { get; set; }

        /// <summary>
        /// ID of the group if the organization has multiple groups (optional).
        /// </summary>
        /// <value>ID of the group if the organization has multiple groups (optional).</value>
        [DataMember(Name="group_id")]
        public long? GroupId { get; set; }

        /// <summary>
        /// Descriptive name of this route.
        /// </summary>
        /// <value>Descriptive name of this route.</value>
        [Required]
        [DataMember(Name="name")]
        public string Name { get; set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the last job in the route is scheduled to end.</value>
        [Required]
        [DataMember(Name="scheduled_end_ms")]
        public long? ScheduledEndMs { get; set; }

        /// <summary>
        /// The distance expected to be traveled for this route in meters.
        /// </summary>
        /// <value>The distance expected to be traveled for this route in meters.</value>
        [DataMember(Name="scheduled_meters")]
        public long? ScheduledMeters { get; set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the route is scheduled to start.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the route is scheduled to start.</value>
        [Required]
        [DataMember(Name="scheduled_start_ms")]
        public long? ScheduledStartMs { get; set; }

        /// <summary>
        /// The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
        /// </summary>
        /// <value>The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.</value>
        [DataMember(Name="start_location_address")]
        public string StartLocationAddress { get; set; }

        /// <summary>
        /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
        /// </summary>
        /// <value>ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.</value>
        [DataMember(Name="start_location_address_id")]
        public long? StartLocationAddressId { get; set; }

        /// <summary>
        /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
        /// </summary>
        /// <value>Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</value>
        [DataMember(Name="start_location_lat")]
        public double? StartLocationLat { get; set; }

        /// <summary>
        /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
        /// </summary>
        /// <value>Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</value>
        [DataMember(Name="start_location_lng")]
        public double? StartLocationLng { get; set; }

        /// <summary>
        /// The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
        /// </summary>
        /// <value>The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.</value>
        [DataMember(Name="start_location_name")]
        public string StartLocationName { get; set; }

        /// <summary>
        /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
        /// </summary>
        /// <value>ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.</value>
        [DataMember(Name="trailer_id")]
        public long? TrailerId { get; set; }

        /// <summary>
        /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
        /// </summary>
        /// <value>ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.</value>
        [DataMember(Name="vehicle_id")]
        public long? VehicleId { get; set; }

        /// <summary>
        /// The dispatch jobs to create for this route.
        /// </summary>
        /// <value>The dispatch jobs to create for this route.</value>
        [Required]
        [DataMember(Name="dispatch_jobs")]
        public List<DispatchJobCreate> DispatchJobs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DispatchRouteCreate {\n");
            sb.Append("  ActualEndMs: ").Append(ActualEndMs).Append("\n");
            sb.Append("  ActualStartMs: ").Append(ActualStartMs).Append("\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  GroupId: ").Append(GroupId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ScheduledEndMs: ").Append(ScheduledEndMs).Append("\n");
            sb.Append("  ScheduledMeters: ").Append(ScheduledMeters).Append("\n");
            sb.Append("  ScheduledStartMs: ").Append(ScheduledStartMs).Append("\n");
            sb.Append("  StartLocationAddress: ").Append(StartLocationAddress).Append("\n");
            sb.Append("  StartLocationAddressId: ").Append(StartLocationAddressId).Append("\n");
            sb.Append("  StartLocationLat: ").Append(StartLocationLat).Append("\n");
            sb.Append("  StartLocationLng: ").Append(StartLocationLng).Append("\n");
            sb.Append("  StartLocationName: ").Append(StartLocationName).Append("\n");
            sb.Append("  TrailerId: ").Append(TrailerId).Append("\n");
            sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
            sb.Append("  DispatchJobs: ").Append(DispatchJobs).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DispatchRouteCreate)obj);
        }

        /// <summary>
        /// Returns true if DispatchRouteCreate instances are equal
        /// </summary>
        /// <param name="other">Instance of DispatchRouteCreate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DispatchRouteCreate other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ActualEndMs == other.ActualEndMs ||
                    ActualEndMs != null &&
                    ActualEndMs.Equals(other.ActualEndMs)
                ) && 
                (
                    ActualStartMs == other.ActualStartMs ||
                    ActualStartMs != null &&
                    ActualStartMs.Equals(other.ActualStartMs)
                ) && 
                (
                    DriverId == other.DriverId ||
                    DriverId != null &&
                    DriverId.Equals(other.DriverId)
                ) && 
                (
                    GroupId == other.GroupId ||
                    GroupId != null &&
                    GroupId.Equals(other.GroupId)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    ScheduledEndMs == other.ScheduledEndMs ||
                    ScheduledEndMs != null &&
                    ScheduledEndMs.Equals(other.ScheduledEndMs)
                ) && 
                (
                    ScheduledMeters == other.ScheduledMeters ||
                    ScheduledMeters != null &&
                    ScheduledMeters.Equals(other.ScheduledMeters)
                ) && 
                (
                    ScheduledStartMs == other.ScheduledStartMs ||
                    ScheduledStartMs != null &&
                    ScheduledStartMs.Equals(other.ScheduledStartMs)
                ) && 
                (
                    StartLocationAddress == other.StartLocationAddress ||
                    StartLocationAddress != null &&
                    StartLocationAddress.Equals(other.StartLocationAddress)
                ) && 
                (
                    StartLocationAddressId == other.StartLocationAddressId ||
                    StartLocationAddressId != null &&
                    StartLocationAddressId.Equals(other.StartLocationAddressId)
                ) && 
                (
                    StartLocationLat == other.StartLocationLat ||
                    StartLocationLat != null &&
                    StartLocationLat.Equals(other.StartLocationLat)
                ) && 
                (
                    StartLocationLng == other.StartLocationLng ||
                    StartLocationLng != null &&
                    StartLocationLng.Equals(other.StartLocationLng)
                ) && 
                (
                    StartLocationName == other.StartLocationName ||
                    StartLocationName != null &&
                    StartLocationName.Equals(other.StartLocationName)
                ) && 
                (
                    TrailerId == other.TrailerId ||
                    TrailerId != null &&
                    TrailerId.Equals(other.TrailerId)
                ) && 
                (
                    VehicleId == other.VehicleId ||
                    VehicleId != null &&
                    VehicleId.Equals(other.VehicleId)
                ) && 
                (
                    DispatchJobs == other.DispatchJobs ||
                    DispatchJobs != null &&
                    DispatchJobs.SequenceEqual(other.DispatchJobs)
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
                    if (ActualEndMs != null)
                    hashCode = hashCode * 59 + ActualEndMs.GetHashCode();
                    if (ActualStartMs != null)
                    hashCode = hashCode * 59 + ActualStartMs.GetHashCode();
                    if (DriverId != null)
                    hashCode = hashCode * 59 + DriverId.GetHashCode();
                    if (GroupId != null)
                    hashCode = hashCode * 59 + GroupId.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (ScheduledEndMs != null)
                    hashCode = hashCode * 59 + ScheduledEndMs.GetHashCode();
                    if (ScheduledMeters != null)
                    hashCode = hashCode * 59 + ScheduledMeters.GetHashCode();
                    if (ScheduledStartMs != null)
                    hashCode = hashCode * 59 + ScheduledStartMs.GetHashCode();
                    if (StartLocationAddress != null)
                    hashCode = hashCode * 59 + StartLocationAddress.GetHashCode();
                    if (StartLocationAddressId != null)
                    hashCode = hashCode * 59 + StartLocationAddressId.GetHashCode();
                    if (StartLocationLat != null)
                    hashCode = hashCode * 59 + StartLocationLat.GetHashCode();
                    if (StartLocationLng != null)
                    hashCode = hashCode * 59 + StartLocationLng.GetHashCode();
                    if (StartLocationName != null)
                    hashCode = hashCode * 59 + StartLocationName.GetHashCode();
                    if (TrailerId != null)
                    hashCode = hashCode * 59 + TrailerId.GetHashCode();
                    if (VehicleId != null)
                    hashCode = hashCode * 59 + VehicleId.GetHashCode();
                    if (DispatchJobs != null)
                    hashCode = hashCode * 59 + DispatchJobs.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DispatchRouteCreate left, DispatchRouteCreate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DispatchRouteCreate left, DispatchRouteCreate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
