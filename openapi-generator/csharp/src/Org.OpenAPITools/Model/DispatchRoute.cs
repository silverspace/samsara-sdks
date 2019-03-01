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
    /// DispatchRoute
    /// </summary>
    [DataContract]
    public partial class DispatchRoute :  IEquatable<DispatchRoute>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DispatchRoute" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DispatchRoute() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DispatchRoute" /> class.
        /// </summary>
        /// <param name="actualEndMs">The time in Unix epoch milliseconds that the route actually ended..</param>
        /// <param name="actualStartMs">The time in Unix epoch milliseconds that the route actually started..</param>
        /// <param name="driverId">ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned..</param>
        /// <param name="groupId">ID of the group if the organization has multiple groups (optional)..</param>
        /// <param name="name">Descriptive name of this route. (required).</param>
        /// <param name="scheduledEndMs">The time in Unix epoch milliseconds that the last job in the route is scheduled to end. (required).</param>
        /// <param name="scheduledMeters">The distance expected to be traveled for this route in meters..</param>
        /// <param name="scheduledStartMs">The time in Unix epoch milliseconds that the route is scheduled to start. (required).</param>
        /// <param name="startLocationAddress">The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided..</param>
        /// <param name="startLocationAddressId">ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided..</param>
        /// <param name="startLocationLat">Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided..</param>
        /// <param name="startLocationLng">Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided..</param>
        /// <param name="startLocationName">The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry..</param>
        /// <param name="trailerId">ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them..</param>
        /// <param name="vehicleId">ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned..</param>
        /// <param name="dispatchJobs">The dispatch jobs associated with this route. (required).</param>
        /// <param name="id">ID of the Samsara dispatch route. (required).</param>
        public DispatchRoute(long? actualEndMs = default(long?), long? actualStartMs = default(long?), long? driverId = default(long?), long? groupId = default(long?), string name = default(string), long? scheduledEndMs = default(long?), long? scheduledMeters = default(long?), long? scheduledStartMs = default(long?), string startLocationAddress = default(string), long? startLocationAddressId = default(long?), double? startLocationLat = default(double?), double? startLocationLng = default(double?), string startLocationName = default(string), long? trailerId = default(long?), long? vehicleId = default(long?), List<DispatchJob> dispatchJobs = default(List<DispatchJob>), long? id = default(long?))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for DispatchRoute and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            // to ensure "scheduledEndMs" is required (not null)
            if (scheduledEndMs == null)
            {
                throw new InvalidDataException("scheduledEndMs is a required property for DispatchRoute and cannot be null");
            }
            else
            {
                this.ScheduledEndMs = scheduledEndMs;
            }
            // to ensure "scheduledStartMs" is required (not null)
            if (scheduledStartMs == null)
            {
                throw new InvalidDataException("scheduledStartMs is a required property for DispatchRoute and cannot be null");
            }
            else
            {
                this.ScheduledStartMs = scheduledStartMs;
            }
            // to ensure "dispatchJobs" is required (not null)
            if (dispatchJobs == null)
            {
                throw new InvalidDataException("dispatchJobs is a required property for DispatchRoute and cannot be null");
            }
            else
            {
                this.DispatchJobs = dispatchJobs;
            }
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for DispatchRoute and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            this.ActualEndMs = actualEndMs;
            this.ActualStartMs = actualStartMs;
            this.DriverId = driverId;
            this.GroupId = groupId;
            this.ScheduledMeters = scheduledMeters;
            this.StartLocationAddress = startLocationAddress;
            this.StartLocationAddressId = startLocationAddressId;
            this.StartLocationLat = startLocationLat;
            this.StartLocationLng = startLocationLng;
            this.StartLocationName = startLocationName;
            this.TrailerId = trailerId;
            this.VehicleId = vehicleId;
        }
        
        /// <summary>
        /// The time in Unix epoch milliseconds that the route actually ended.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the route actually ended.</value>
        [DataMember(Name="actual_end_ms", EmitDefaultValue=false)]
        public long? ActualEndMs { get; set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the route actually started.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the route actually started.</value>
        [DataMember(Name="actual_start_ms", EmitDefaultValue=false)]
        public long? ActualStartMs { get; set; }

        /// <summary>
        /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
        /// </summary>
        /// <value>ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.</value>
        [DataMember(Name="driver_id", EmitDefaultValue=false)]
        public long? DriverId { get; set; }

        /// <summary>
        /// ID of the group if the organization has multiple groups (optional).
        /// </summary>
        /// <value>ID of the group if the organization has multiple groups (optional).</value>
        [DataMember(Name="group_id", EmitDefaultValue=false)]
        public long? GroupId { get; set; }

        /// <summary>
        /// Descriptive name of this route.
        /// </summary>
        /// <value>Descriptive name of this route.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the last job in the route is scheduled to end.</value>
        [DataMember(Name="scheduled_end_ms", EmitDefaultValue=false)]
        public long? ScheduledEndMs { get; set; }

        /// <summary>
        /// The distance expected to be traveled for this route in meters.
        /// </summary>
        /// <value>The distance expected to be traveled for this route in meters.</value>
        [DataMember(Name="scheduled_meters", EmitDefaultValue=false)]
        public long? ScheduledMeters { get; set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the route is scheduled to start.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the route is scheduled to start.</value>
        [DataMember(Name="scheduled_start_ms", EmitDefaultValue=false)]
        public long? ScheduledStartMs { get; set; }

        /// <summary>
        /// The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
        /// </summary>
        /// <value>The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.</value>
        [DataMember(Name="start_location_address", EmitDefaultValue=false)]
        public string StartLocationAddress { get; set; }

        /// <summary>
        /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
        /// </summary>
        /// <value>ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.</value>
        [DataMember(Name="start_location_address_id", EmitDefaultValue=false)]
        public long? StartLocationAddressId { get; set; }

        /// <summary>
        /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
        /// </summary>
        /// <value>Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</value>
        [DataMember(Name="start_location_lat", EmitDefaultValue=false)]
        public double? StartLocationLat { get; set; }

        /// <summary>
        /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
        /// </summary>
        /// <value>Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.</value>
        [DataMember(Name="start_location_lng", EmitDefaultValue=false)]
        public double? StartLocationLng { get; set; }

        /// <summary>
        /// The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
        /// </summary>
        /// <value>The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.</value>
        [DataMember(Name="start_location_name", EmitDefaultValue=false)]
        public string StartLocationName { get; set; }

        /// <summary>
        /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
        /// </summary>
        /// <value>ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.</value>
        [DataMember(Name="trailer_id", EmitDefaultValue=false)]
        public long? TrailerId { get; set; }

        /// <summary>
        /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
        /// </summary>
        /// <value>ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.</value>
        [DataMember(Name="vehicle_id", EmitDefaultValue=false)]
        public long? VehicleId { get; set; }

        /// <summary>
        /// The dispatch jobs associated with this route.
        /// </summary>
        /// <value>The dispatch jobs associated with this route.</value>
        [DataMember(Name="dispatch_jobs", EmitDefaultValue=false)]
        public List<DispatchJob> DispatchJobs { get; set; }

        /// <summary>
        /// ID of the Samsara dispatch route.
        /// </summary>
        /// <value>ID of the Samsara dispatch route.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DispatchRoute {\n");
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
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as DispatchRoute);
        }

        /// <summary>
        /// Returns true if DispatchRoute instances are equal
        /// </summary>
        /// <param name="input">Instance of DispatchRoute to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DispatchRoute input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ActualEndMs == input.ActualEndMs ||
                    (this.ActualEndMs != null &&
                    this.ActualEndMs.Equals(input.ActualEndMs))
                ) && 
                (
                    this.ActualStartMs == input.ActualStartMs ||
                    (this.ActualStartMs != null &&
                    this.ActualStartMs.Equals(input.ActualStartMs))
                ) && 
                (
                    this.DriverId == input.DriverId ||
                    (this.DriverId != null &&
                    this.DriverId.Equals(input.DriverId))
                ) && 
                (
                    this.GroupId == input.GroupId ||
                    (this.GroupId != null &&
                    this.GroupId.Equals(input.GroupId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ScheduledEndMs == input.ScheduledEndMs ||
                    (this.ScheduledEndMs != null &&
                    this.ScheduledEndMs.Equals(input.ScheduledEndMs))
                ) && 
                (
                    this.ScheduledMeters == input.ScheduledMeters ||
                    (this.ScheduledMeters != null &&
                    this.ScheduledMeters.Equals(input.ScheduledMeters))
                ) && 
                (
                    this.ScheduledStartMs == input.ScheduledStartMs ||
                    (this.ScheduledStartMs != null &&
                    this.ScheduledStartMs.Equals(input.ScheduledStartMs))
                ) && 
                (
                    this.StartLocationAddress == input.StartLocationAddress ||
                    (this.StartLocationAddress != null &&
                    this.StartLocationAddress.Equals(input.StartLocationAddress))
                ) && 
                (
                    this.StartLocationAddressId == input.StartLocationAddressId ||
                    (this.StartLocationAddressId != null &&
                    this.StartLocationAddressId.Equals(input.StartLocationAddressId))
                ) && 
                (
                    this.StartLocationLat == input.StartLocationLat ||
                    (this.StartLocationLat != null &&
                    this.StartLocationLat.Equals(input.StartLocationLat))
                ) && 
                (
                    this.StartLocationLng == input.StartLocationLng ||
                    (this.StartLocationLng != null &&
                    this.StartLocationLng.Equals(input.StartLocationLng))
                ) && 
                (
                    this.StartLocationName == input.StartLocationName ||
                    (this.StartLocationName != null &&
                    this.StartLocationName.Equals(input.StartLocationName))
                ) && 
                (
                    this.TrailerId == input.TrailerId ||
                    (this.TrailerId != null &&
                    this.TrailerId.Equals(input.TrailerId))
                ) && 
                (
                    this.VehicleId == input.VehicleId ||
                    (this.VehicleId != null &&
                    this.VehicleId.Equals(input.VehicleId))
                ) && 
                (
                    this.DispatchJobs == input.DispatchJobs ||
                    this.DispatchJobs != null &&
                    this.DispatchJobs.SequenceEqual(input.DispatchJobs)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                if (this.ActualEndMs != null)
                    hashCode = hashCode * 59 + this.ActualEndMs.GetHashCode();
                if (this.ActualStartMs != null)
                    hashCode = hashCode * 59 + this.ActualStartMs.GetHashCode();
                if (this.DriverId != null)
                    hashCode = hashCode * 59 + this.DriverId.GetHashCode();
                if (this.GroupId != null)
                    hashCode = hashCode * 59 + this.GroupId.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ScheduledEndMs != null)
                    hashCode = hashCode * 59 + this.ScheduledEndMs.GetHashCode();
                if (this.ScheduledMeters != null)
                    hashCode = hashCode * 59 + this.ScheduledMeters.GetHashCode();
                if (this.ScheduledStartMs != null)
                    hashCode = hashCode * 59 + this.ScheduledStartMs.GetHashCode();
                if (this.StartLocationAddress != null)
                    hashCode = hashCode * 59 + this.StartLocationAddress.GetHashCode();
                if (this.StartLocationAddressId != null)
                    hashCode = hashCode * 59 + this.StartLocationAddressId.GetHashCode();
                if (this.StartLocationLat != null)
                    hashCode = hashCode * 59 + this.StartLocationLat.GetHashCode();
                if (this.StartLocationLng != null)
                    hashCode = hashCode * 59 + this.StartLocationLng.GetHashCode();
                if (this.StartLocationName != null)
                    hashCode = hashCode * 59 + this.StartLocationName.GetHashCode();
                if (this.TrailerId != null)
                    hashCode = hashCode * 59 + this.TrailerId.GetHashCode();
                if (this.VehicleId != null)
                    hashCode = hashCode * 59 + this.VehicleId.GetHashCode();
                if (this.DispatchJobs != null)
                    hashCode = hashCode * 59 + this.DispatchJobs.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
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
