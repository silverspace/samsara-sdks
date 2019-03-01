/*
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |- -- -- -- -- -- --|- -- -- -- -- -- -- -- -|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class Driver : IEquatable<Driver>
    { 
        /// <summary>
        /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may use Adverse Weather exemptions in ELD logs.</value>
        [DataMember(Name="eldAdverseWeatherExemptionEnabled")]
        public bool? EldAdverseWeatherExemptionEnabled { get; set; }

        /// <summary>
        /// Flag indicating this driver may use Big Day excemptions in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may use Big Day excemptions in ELD logs.</value>
        [DataMember(Name="eldBigDayExemptionEnabled")]
        public bool? EldBigDayExemptionEnabled { get; set; }

        /// <summary>
        /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
        /// </summary>
        /// <value>0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.</value>
        [DataMember(Name="eldDayStartHour")]
        public int? EldDayStartHour { get; set; }

        /// <summary>
        /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
        /// </summary>
        /// <value>Flag indicating this driver is exempt from the Electronic Logging Mandate.</value>
        [DataMember(Name="eldExempt")]
        public bool? EldExempt { get; set; }

        /// <summary>
        /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
        /// </summary>
        /// <value>Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).</value>
        [DataMember(Name="eldExemptReason")]
        public string EldExemptReason { get; set; }

        /// <summary>
        /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.</value>
        [DataMember(Name="eldPcEnabled")]
        public bool? EldPcEnabled { get; set; }

        /// <summary>
        /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may select the Yard Move duty status in ELD logs.</value>
        [DataMember(Name="eldYmEnabled")]
        public bool? EldYmEnabled { get; set; }

        /// <summary>
        /// Dictionary of external IDs (string key-value pairs)
        /// </summary>
        /// <value>Dictionary of external IDs (string key-value pairs)</value>
        [DataMember(Name="externalIds")]
        public Dictionary<string, string> ExternalIds { get; set; }

        /// <summary>
        /// ID of the group if the organization has multiple groups (uncommon).
        /// </summary>
        /// <value>ID of the group if the organization has multiple groups (uncommon).</value>
        [DataMember(Name="groupId")]
        public long? GroupId { get; set; }

        /// <summary>
        /// Driver&#39;s state issued license number.
        /// </summary>
        /// <value>Driver&#39;s state issued license number.</value>
        [DataMember(Name="licenseNumber")]
        public string LicenseNumber { get; set; }

        /// <summary>
        /// Abbreviation of state that issued driver&#39;s license.
        /// </summary>
        /// <value>Abbreviation of state that issued driver&#39;s license.</value>
        [DataMember(Name="licenseState")]
        public string LicenseState { get; set; }

        /// <summary>
        /// Driver&#39;s name.
        /// </summary>
        /// <value>Driver&#39;s name.</value>
        [Required]
        [DataMember(Name="name")]
        public string Name { get; set; }

        /// <summary>
        /// Notes about the driver.
        /// </summary>
        /// <value>Notes about the driver.</value>
        [DataMember(Name="notes")]
        public string Notes { get; set; }

        /// <summary>
        /// Driver&#39;s phone number. Please include only digits, ex. 4157771234
        /// </summary>
        /// <value>Driver&#39;s phone number. Please include only digits, ex. 4157771234</value>
        [DataMember(Name="phone")]
        public string Phone { get; set; }

        /// <summary>
        /// Driver&#39;s login username into the driver app.
        /// </summary>
        /// <value>Driver&#39;s login username into the driver app.</value>
        [DataMember(Name="username")]
        public string Username { get; set; }

        /// <summary>
        /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
        /// </summary>
        /// <value>ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).</value>
        [DataMember(Name="vehicleId")]
        public long? VehicleId { get; set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        /// <value>ID of the driver.</value>
        [Required]
        [DataMember(Name="id")]
        public long? Id { get; set; }

        /// <summary>
        /// True if the driver account has been deactivated.
        /// </summary>
        /// <value>True if the driver account has been deactivated.</value>
        [DataMember(Name="isDeactivated")]
        public bool? IsDeactivated { get; set; }

        /// <summary>
        /// Gets or Sets Tags
        /// </summary>
        [DataMember(Name="tags")]
        public List<TagMetadata> Tags { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
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
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((Driver)obj);
        }

        /// <summary>
        /// Returns true if Driver instances are equal
        /// </summary>
        /// <param name="other">Instance of Driver to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Driver other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EldAdverseWeatherExemptionEnabled == other.EldAdverseWeatherExemptionEnabled ||
                    EldAdverseWeatherExemptionEnabled != null &&
                    EldAdverseWeatherExemptionEnabled.Equals(other.EldAdverseWeatherExemptionEnabled)
                ) && 
                (
                    EldBigDayExemptionEnabled == other.EldBigDayExemptionEnabled ||
                    EldBigDayExemptionEnabled != null &&
                    EldBigDayExemptionEnabled.Equals(other.EldBigDayExemptionEnabled)
                ) && 
                (
                    EldDayStartHour == other.EldDayStartHour ||
                    EldDayStartHour != null &&
                    EldDayStartHour.Equals(other.EldDayStartHour)
                ) && 
                (
                    EldExempt == other.EldExempt ||
                    EldExempt != null &&
                    EldExempt.Equals(other.EldExempt)
                ) && 
                (
                    EldExemptReason == other.EldExemptReason ||
                    EldExemptReason != null &&
                    EldExemptReason.Equals(other.EldExemptReason)
                ) && 
                (
                    EldPcEnabled == other.EldPcEnabled ||
                    EldPcEnabled != null &&
                    EldPcEnabled.Equals(other.EldPcEnabled)
                ) && 
                (
                    EldYmEnabled == other.EldYmEnabled ||
                    EldYmEnabled != null &&
                    EldYmEnabled.Equals(other.EldYmEnabled)
                ) && 
                (
                    ExternalIds == other.ExternalIds ||
                    ExternalIds != null &&
                    ExternalIds.SequenceEqual(other.ExternalIds)
                ) && 
                (
                    GroupId == other.GroupId ||
                    GroupId != null &&
                    GroupId.Equals(other.GroupId)
                ) && 
                (
                    LicenseNumber == other.LicenseNumber ||
                    LicenseNumber != null &&
                    LicenseNumber.Equals(other.LicenseNumber)
                ) && 
                (
                    LicenseState == other.LicenseState ||
                    LicenseState != null &&
                    LicenseState.Equals(other.LicenseState)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Notes == other.Notes ||
                    Notes != null &&
                    Notes.Equals(other.Notes)
                ) && 
                (
                    Phone == other.Phone ||
                    Phone != null &&
                    Phone.Equals(other.Phone)
                ) && 
                (
                    Username == other.Username ||
                    Username != null &&
                    Username.Equals(other.Username)
                ) && 
                (
                    VehicleId == other.VehicleId ||
                    VehicleId != null &&
                    VehicleId.Equals(other.VehicleId)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    IsDeactivated == other.IsDeactivated ||
                    IsDeactivated != null &&
                    IsDeactivated.Equals(other.IsDeactivated)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    Tags.SequenceEqual(other.Tags)
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
                    if (EldAdverseWeatherExemptionEnabled != null)
                    hashCode = hashCode * 59 + EldAdverseWeatherExemptionEnabled.GetHashCode();
                    if (EldBigDayExemptionEnabled != null)
                    hashCode = hashCode * 59 + EldBigDayExemptionEnabled.GetHashCode();
                    if (EldDayStartHour != null)
                    hashCode = hashCode * 59 + EldDayStartHour.GetHashCode();
                    if (EldExempt != null)
                    hashCode = hashCode * 59 + EldExempt.GetHashCode();
                    if (EldExemptReason != null)
                    hashCode = hashCode * 59 + EldExemptReason.GetHashCode();
                    if (EldPcEnabled != null)
                    hashCode = hashCode * 59 + EldPcEnabled.GetHashCode();
                    if (EldYmEnabled != null)
                    hashCode = hashCode * 59 + EldYmEnabled.GetHashCode();
                    if (ExternalIds != null)
                    hashCode = hashCode * 59 + ExternalIds.GetHashCode();
                    if (GroupId != null)
                    hashCode = hashCode * 59 + GroupId.GetHashCode();
                    if (LicenseNumber != null)
                    hashCode = hashCode * 59 + LicenseNumber.GetHashCode();
                    if (LicenseState != null)
                    hashCode = hashCode * 59 + LicenseState.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Notes != null)
                    hashCode = hashCode * 59 + Notes.GetHashCode();
                    if (Phone != null)
                    hashCode = hashCode * 59 + Phone.GetHashCode();
                    if (Username != null)
                    hashCode = hashCode * 59 + Username.GetHashCode();
                    if (VehicleId != null)
                    hashCode = hashCode * 59 + VehicleId.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (IsDeactivated != null)
                    hashCode = hashCode * 59 + IsDeactivated.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Driver left, Driver right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Driver left, Driver right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
