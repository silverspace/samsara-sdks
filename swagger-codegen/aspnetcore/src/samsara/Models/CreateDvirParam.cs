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
    public partial class CreateDvirParam : IEquatable<CreateDvirParam>
    { 
        /// <summary>
        /// Only type 'mechanic' is currently accepted.
        /// </summary>
        /// <value>Only type 'mechanic' is currently accepted.</value>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum InspectionTypeEnum
        {
            
            /// <summary>
            /// Enum MechanicEnum for mechanic
            /// </summary>
            [EnumMember(Value = "mechanic")]
            MechanicEnum = 1
        }

        /// <summary>
        /// Only type &#39;mechanic&#39; is currently accepted.
        /// </summary>
        /// <value>Only type &#39;mechanic&#39; is currently accepted.</value>
        [Required]
        [DataMember(Name="inspectionType")]
        public InspectionTypeEnum? InspectionType { get; set; }

        /// <summary>
        /// Any notes from the mechanic.
        /// </summary>
        /// <value>Any notes from the mechanic.</value>
        [DataMember(Name="mechanicNotes")]
        public string MechanicNotes { get; set; }

        /// <summary>
        /// The current odometer of the vehicle.
        /// </summary>
        /// <value>The current odometer of the vehicle.</value>
        [DataMember(Name="odometerMiles")]
        public int? OdometerMiles { get; set; }

        /// <summary>
        /// Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
        /// </summary>
        /// <value>Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.</value>
        [DataMember(Name="previousDefectsCorrected")]
        public bool? PreviousDefectsCorrected { get; set; }

        /// <summary>
        /// Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
        /// </summary>
        /// <value>Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.</value>
        [DataMember(Name="previousDefectsIgnored")]
        public bool? PreviousDefectsIgnored { get; set; }

        /// <summary>
        /// Whether or not this vehicle or trailer is safe to drive.
        /// </summary>
        /// <value>Whether or not this vehicle or trailer is safe to drive.</value>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SafeEnum
        {
            
            /// <summary>
            /// Enum SafeEnum for safe
            /// </summary>
            [EnumMember(Value = "safe")]
            SafeEnum = 1,
            
            /// <summary>
            /// Enum UnsafeEnum for unsafe
            /// </summary>
            [EnumMember(Value = "unsafe")]
            UnsafeEnum = 2
        }

        /// <summary>
        /// Whether or not this vehicle or trailer is safe to drive.
        /// </summary>
        /// <value>Whether or not this vehicle or trailer is safe to drive.</value>
        [Required]
        [DataMember(Name="safe")]
        public SafeEnum? Safe { get; set; }

        /// <summary>
        /// Id of trailer being inspected. Either vehicleId or trailerId must be provided.
        /// </summary>
        /// <value>Id of trailer being inspected. Either vehicleId or trailerId must be provided.</value>
        [DataMember(Name="trailerId")]
        public int? TrailerId { get; set; }

        /// <summary>
        /// The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.
        /// </summary>
        /// <value>The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.</value>
        [Required]
        [DataMember(Name="userEmail")]
        public string UserEmail { get; set; }

        /// <summary>
        /// Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
        /// </summary>
        /// <value>Id of vehicle being inspected. Either vehicleId or trailerId must be provided.</value>
        [DataMember(Name="vehicleId")]
        public int? VehicleId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateDvirParam {\n");
            sb.Append("  InspectionType: ").Append(InspectionType).Append("\n");
            sb.Append("  MechanicNotes: ").Append(MechanicNotes).Append("\n");
            sb.Append("  OdometerMiles: ").Append(OdometerMiles).Append("\n");
            sb.Append("  PreviousDefectsCorrected: ").Append(PreviousDefectsCorrected).Append("\n");
            sb.Append("  PreviousDefectsIgnored: ").Append(PreviousDefectsIgnored).Append("\n");
            sb.Append("  Safe: ").Append(Safe).Append("\n");
            sb.Append("  TrailerId: ").Append(TrailerId).Append("\n");
            sb.Append("  UserEmail: ").Append(UserEmail).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateDvirParam)obj);
        }

        /// <summary>
        /// Returns true if CreateDvirParam instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateDvirParam to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateDvirParam other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    InspectionType == other.InspectionType ||
                    InspectionType != null &&
                    InspectionType.Equals(other.InspectionType)
                ) && 
                (
                    MechanicNotes == other.MechanicNotes ||
                    MechanicNotes != null &&
                    MechanicNotes.Equals(other.MechanicNotes)
                ) && 
                (
                    OdometerMiles == other.OdometerMiles ||
                    OdometerMiles != null &&
                    OdometerMiles.Equals(other.OdometerMiles)
                ) && 
                (
                    PreviousDefectsCorrected == other.PreviousDefectsCorrected ||
                    PreviousDefectsCorrected != null &&
                    PreviousDefectsCorrected.Equals(other.PreviousDefectsCorrected)
                ) && 
                (
                    PreviousDefectsIgnored == other.PreviousDefectsIgnored ||
                    PreviousDefectsIgnored != null &&
                    PreviousDefectsIgnored.Equals(other.PreviousDefectsIgnored)
                ) && 
                (
                    Safe == other.Safe ||
                    Safe != null &&
                    Safe.Equals(other.Safe)
                ) && 
                (
                    TrailerId == other.TrailerId ||
                    TrailerId != null &&
                    TrailerId.Equals(other.TrailerId)
                ) && 
                (
                    UserEmail == other.UserEmail ||
                    UserEmail != null &&
                    UserEmail.Equals(other.UserEmail)
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
                    if (InspectionType != null)
                    hashCode = hashCode * 59 + InspectionType.GetHashCode();
                    if (MechanicNotes != null)
                    hashCode = hashCode * 59 + MechanicNotes.GetHashCode();
                    if (OdometerMiles != null)
                    hashCode = hashCode * 59 + OdometerMiles.GetHashCode();
                    if (PreviousDefectsCorrected != null)
                    hashCode = hashCode * 59 + PreviousDefectsCorrected.GetHashCode();
                    if (PreviousDefectsIgnored != null)
                    hashCode = hashCode * 59 + PreviousDefectsIgnored.GetHashCode();
                    if (Safe != null)
                    hashCode = hashCode * 59 + Safe.GetHashCode();
                    if (TrailerId != null)
                    hashCode = hashCode * 59 + TrailerId.GetHashCode();
                    if (UserEmail != null)
                    hashCode = hashCode * 59 + UserEmail.GetHashCode();
                    if (VehicleId != null)
                    hashCode = hashCode * 59 + VehicleId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateDvirParam left, CreateDvirParam right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateDvirParam left, CreateDvirParam right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
