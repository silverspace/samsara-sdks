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
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = samsara.Client.SwaggerDateConverter;

namespace samsara.Model
{
    /// <summary>
    /// DriverForCreate
    /// </summary>
    [DataContract]
    public partial class DriverForCreate :  IEquatable<DriverForCreate>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DriverForCreate" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DriverForCreate() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DriverForCreate" /> class.
        /// </summary>
        /// <param name="eldAdverseWeatherExemptionEnabled">Flag indicating this driver may use Adverse Weather exemptions in ELD logs..</param>
        /// <param name="eldBigDayExemptionEnabled">Flag indicating this driver may use Big Day excemptions in ELD logs..</param>
        /// <param name="eldDayStartHour">0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours..</param>
        /// <param name="eldExempt">Flag indicating this driver is exempt from the Electronic Logging Mandate..</param>
        /// <param name="eldExemptReason">Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt)..</param>
        /// <param name="eldPcEnabled">Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. (default to false).</param>
        /// <param name="eldYmEnabled">Flag indicating this driver may select the Yard Move duty status in ELD logs. (default to false).</param>
        /// <param name="externalIds">Dictionary of external IDs (string key-value pairs).</param>
        /// <param name="groupId">ID of the group if the organization has multiple groups (uncommon)..</param>
        /// <param name="licenseNumber">Driver&#39;s state issued license number..</param>
        /// <param name="licenseState">Abbreviation of state that issued driver&#39;s license..</param>
        /// <param name="name">Driver&#39;s name. (required).</param>
        /// <param name="notes">Notes about the driver..</param>
        /// <param name="phone">Driver&#39;s phone number. Please include only digits, ex. 4157771234.</param>
        /// <param name="username">Driver&#39;s login username into the driver app..</param>
        /// <param name="vehicleId">ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon)..</param>
        /// <param name="password">Driver&#39;s password for the driver app. (required).</param>
        /// <param name="tagIds">tagIds.</param>
        public DriverForCreate(bool? eldAdverseWeatherExemptionEnabled = default(bool?), bool? eldBigDayExemptionEnabled = default(bool?), int? eldDayStartHour = default(int?), bool? eldExempt = default(bool?), string eldExemptReason = default(string), bool? eldPcEnabled = false, bool? eldYmEnabled = false, Dictionary<string, string> externalIds = default(Dictionary<string, string>), long? groupId = default(long?), string licenseNumber = default(string), string licenseState = default(string), string name = default(string), string notes = default(string), string phone = default(string), string username = default(string), long? vehicleId = default(long?), string password = default(string), TagIds tagIds = default(TagIds))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for DriverForCreate and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            // to ensure "password" is required (not null)
            if (password == null)
            {
                throw new InvalidDataException("password is a required property for DriverForCreate and cannot be null");
            }
            else
            {
                this.Password = password;
            }
            this.EldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
            this.EldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
            this.EldDayStartHour = eldDayStartHour;
            this.EldExempt = eldExempt;
            this.EldExemptReason = eldExemptReason;
            // use default value if no "eldPcEnabled" provided
            if (eldPcEnabled == null)
            {
                this.EldPcEnabled = false;
            }
            else
            {
                this.EldPcEnabled = eldPcEnabled;
            }
            // use default value if no "eldYmEnabled" provided
            if (eldYmEnabled == null)
            {
                this.EldYmEnabled = false;
            }
            else
            {
                this.EldYmEnabled = eldYmEnabled;
            }
            this.ExternalIds = externalIds;
            this.GroupId = groupId;
            this.LicenseNumber = licenseNumber;
            this.LicenseState = licenseState;
            this.Notes = notes;
            this.Phone = phone;
            this.Username = username;
            this.VehicleId = vehicleId;
            this.TagIds = tagIds;
        }
        
        /// <summary>
        /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may use Adverse Weather exemptions in ELD logs.</value>
        [DataMember(Name="eldAdverseWeatherExemptionEnabled", EmitDefaultValue=false)]
        public bool? EldAdverseWeatherExemptionEnabled { get; set; }

        /// <summary>
        /// Flag indicating this driver may use Big Day excemptions in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may use Big Day excemptions in ELD logs.</value>
        [DataMember(Name="eldBigDayExemptionEnabled", EmitDefaultValue=false)]
        public bool? EldBigDayExemptionEnabled { get; set; }

        /// <summary>
        /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
        /// </summary>
        /// <value>0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.</value>
        [DataMember(Name="eldDayStartHour", EmitDefaultValue=false)]
        public int? EldDayStartHour { get; set; }

        /// <summary>
        /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
        /// </summary>
        /// <value>Flag indicating this driver is exempt from the Electronic Logging Mandate.</value>
        [DataMember(Name="eldExempt", EmitDefaultValue=false)]
        public bool? EldExempt { get; set; }

        /// <summary>
        /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
        /// </summary>
        /// <value>Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).</value>
        [DataMember(Name="eldExemptReason", EmitDefaultValue=false)]
        public string EldExemptReason { get; set; }

        /// <summary>
        /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.</value>
        [DataMember(Name="eldPcEnabled", EmitDefaultValue=false)]
        public bool? EldPcEnabled { get; set; }

        /// <summary>
        /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
        /// </summary>
        /// <value>Flag indicating this driver may select the Yard Move duty status in ELD logs.</value>
        [DataMember(Name="eldYmEnabled", EmitDefaultValue=false)]
        public bool? EldYmEnabled { get; set; }

        /// <summary>
        /// Dictionary of external IDs (string key-value pairs)
        /// </summary>
        /// <value>Dictionary of external IDs (string key-value pairs)</value>
        [DataMember(Name="externalIds", EmitDefaultValue=false)]
        public Dictionary<string, string> ExternalIds { get; set; }

        /// <summary>
        /// ID of the group if the organization has multiple groups (uncommon).
        /// </summary>
        /// <value>ID of the group if the organization has multiple groups (uncommon).</value>
        [DataMember(Name="groupId", EmitDefaultValue=false)]
        public long? GroupId { get; set; }

        /// <summary>
        /// Driver&#39;s state issued license number.
        /// </summary>
        /// <value>Driver&#39;s state issued license number.</value>
        [DataMember(Name="licenseNumber", EmitDefaultValue=false)]
        public string LicenseNumber { get; set; }

        /// <summary>
        /// Abbreviation of state that issued driver&#39;s license.
        /// </summary>
        /// <value>Abbreviation of state that issued driver&#39;s license.</value>
        [DataMember(Name="licenseState", EmitDefaultValue=false)]
        public string LicenseState { get; set; }

        /// <summary>
        /// Driver&#39;s name.
        /// </summary>
        /// <value>Driver&#39;s name.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Notes about the driver.
        /// </summary>
        /// <value>Notes about the driver.</value>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public string Notes { get; set; }

        /// <summary>
        /// Driver&#39;s phone number. Please include only digits, ex. 4157771234
        /// </summary>
        /// <value>Driver&#39;s phone number. Please include only digits, ex. 4157771234</value>
        [DataMember(Name="phone", EmitDefaultValue=false)]
        public string Phone { get; set; }

        /// <summary>
        /// Driver&#39;s login username into the driver app.
        /// </summary>
        /// <value>Driver&#39;s login username into the driver app.</value>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }

        /// <summary>
        /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
        /// </summary>
        /// <value>ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).</value>
        [DataMember(Name="vehicleId", EmitDefaultValue=false)]
        public long? VehicleId { get; set; }

        /// <summary>
        /// Driver&#39;s password for the driver app.
        /// </summary>
        /// <value>Driver&#39;s password for the driver app.</value>
        [DataMember(Name="password", EmitDefaultValue=false)]
        public string Password { get; set; }

        /// <summary>
        /// Gets or Sets TagIds
        /// </summary>
        [DataMember(Name="tagIds", EmitDefaultValue=false)]
        public TagIds TagIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DriverForCreate {\n");
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
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  TagIds: ").Append(TagIds).Append("\n");
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
            return this.Equals(input as DriverForCreate);
        }

        /// <summary>
        /// Returns true if DriverForCreate instances are equal
        /// </summary>
        /// <param name="input">Instance of DriverForCreate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DriverForCreate input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EldAdverseWeatherExemptionEnabled == input.EldAdverseWeatherExemptionEnabled ||
                    (this.EldAdverseWeatherExemptionEnabled != null &&
                    this.EldAdverseWeatherExemptionEnabled.Equals(input.EldAdverseWeatherExemptionEnabled))
                ) && 
                (
                    this.EldBigDayExemptionEnabled == input.EldBigDayExemptionEnabled ||
                    (this.EldBigDayExemptionEnabled != null &&
                    this.EldBigDayExemptionEnabled.Equals(input.EldBigDayExemptionEnabled))
                ) && 
                (
                    this.EldDayStartHour == input.EldDayStartHour ||
                    (this.EldDayStartHour != null &&
                    this.EldDayStartHour.Equals(input.EldDayStartHour))
                ) && 
                (
                    this.EldExempt == input.EldExempt ||
                    (this.EldExempt != null &&
                    this.EldExempt.Equals(input.EldExempt))
                ) && 
                (
                    this.EldExemptReason == input.EldExemptReason ||
                    (this.EldExemptReason != null &&
                    this.EldExemptReason.Equals(input.EldExemptReason))
                ) && 
                (
                    this.EldPcEnabled == input.EldPcEnabled ||
                    (this.EldPcEnabled != null &&
                    this.EldPcEnabled.Equals(input.EldPcEnabled))
                ) && 
                (
                    this.EldYmEnabled == input.EldYmEnabled ||
                    (this.EldYmEnabled != null &&
                    this.EldYmEnabled.Equals(input.EldYmEnabled))
                ) && 
                (
                    this.ExternalIds == input.ExternalIds ||
                    this.ExternalIds != null &&
                    this.ExternalIds.SequenceEqual(input.ExternalIds)
                ) && 
                (
                    this.GroupId == input.GroupId ||
                    (this.GroupId != null &&
                    this.GroupId.Equals(input.GroupId))
                ) && 
                (
                    this.LicenseNumber == input.LicenseNumber ||
                    (this.LicenseNumber != null &&
                    this.LicenseNumber.Equals(input.LicenseNumber))
                ) && 
                (
                    this.LicenseState == input.LicenseState ||
                    (this.LicenseState != null &&
                    this.LicenseState.Equals(input.LicenseState))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Notes == input.Notes ||
                    (this.Notes != null &&
                    this.Notes.Equals(input.Notes))
                ) && 
                (
                    this.Phone == input.Phone ||
                    (this.Phone != null &&
                    this.Phone.Equals(input.Phone))
                ) && 
                (
                    this.Username == input.Username ||
                    (this.Username != null &&
                    this.Username.Equals(input.Username))
                ) && 
                (
                    this.VehicleId == input.VehicleId ||
                    (this.VehicleId != null &&
                    this.VehicleId.Equals(input.VehicleId))
                ) && 
                (
                    this.Password == input.Password ||
                    (this.Password != null &&
                    this.Password.Equals(input.Password))
                ) && 
                (
                    this.TagIds == input.TagIds ||
                    (this.TagIds != null &&
                    this.TagIds.Equals(input.TagIds))
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
                if (this.EldAdverseWeatherExemptionEnabled != null)
                    hashCode = hashCode * 59 + this.EldAdverseWeatherExemptionEnabled.GetHashCode();
                if (this.EldBigDayExemptionEnabled != null)
                    hashCode = hashCode * 59 + this.EldBigDayExemptionEnabled.GetHashCode();
                if (this.EldDayStartHour != null)
                    hashCode = hashCode * 59 + this.EldDayStartHour.GetHashCode();
                if (this.EldExempt != null)
                    hashCode = hashCode * 59 + this.EldExempt.GetHashCode();
                if (this.EldExemptReason != null)
                    hashCode = hashCode * 59 + this.EldExemptReason.GetHashCode();
                if (this.EldPcEnabled != null)
                    hashCode = hashCode * 59 + this.EldPcEnabled.GetHashCode();
                if (this.EldYmEnabled != null)
                    hashCode = hashCode * 59 + this.EldYmEnabled.GetHashCode();
                if (this.ExternalIds != null)
                    hashCode = hashCode * 59 + this.ExternalIds.GetHashCode();
                if (this.GroupId != null)
                    hashCode = hashCode * 59 + this.GroupId.GetHashCode();
                if (this.LicenseNumber != null)
                    hashCode = hashCode * 59 + this.LicenseNumber.GetHashCode();
                if (this.LicenseState != null)
                    hashCode = hashCode * 59 + this.LicenseState.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Notes != null)
                    hashCode = hashCode * 59 + this.Notes.GetHashCode();
                if (this.Phone != null)
                    hashCode = hashCode * 59 + this.Phone.GetHashCode();
                if (this.Username != null)
                    hashCode = hashCode * 59 + this.Username.GetHashCode();
                if (this.VehicleId != null)
                    hashCode = hashCode * 59 + this.VehicleId.GetHashCode();
                if (this.Password != null)
                    hashCode = hashCode * 59 + this.Password.GetHashCode();
                if (this.TagIds != null)
                    hashCode = hashCode * 59 + this.TagIds.GetHashCode();
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
