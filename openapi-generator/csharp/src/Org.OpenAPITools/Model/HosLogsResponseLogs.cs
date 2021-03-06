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
    /// HosLogsResponseLogs
    /// </summary>
    [DataContract]
    public partial class HosLogsResponseLogs :  IEquatable<HosLogsResponseLogs>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HosLogsResponseLogs" /> class.
        /// </summary>
        /// <param name="locLng">Longitude at which the log was recorded..</param>
        /// <param name="logStartMs">The time at which the log/HOS status started in UNIX milliseconds..</param>
        /// <param name="driverId">ID of the driver..</param>
        /// <param name="statusType">The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;..</param>
        /// <param name="locCity">City in which the log was recorded..</param>
        /// <param name="groupId">ID of the group..</param>
        /// <param name="locName">Name of location at which the log was recorded..</param>
        /// <param name="locLat">Latitude at which the log was recorded..</param>
        /// <param name="remark">Remark associated with the log entry..</param>
        /// <param name="locState">State in which the log was recorded..</param>
        /// <param name="vehicleId">ID of the vehicle..</param>
        /// <param name="codriverIds">codriverIds.</param>
        public HosLogsResponseLogs(double? locLng = default(double?), long? logStartMs = default(long?), long? driverId = default(long?), string statusType = default(string), string locCity = default(string), long? groupId = default(long?), string locName = default(string), double? locLat = default(double?), string remark = default(string), string locState = default(string), long? vehicleId = default(long?), List<long?> codriverIds = default(List<long?>))
        {
            this.LocLng = locLng;
            this.LogStartMs = logStartMs;
            this.DriverId = driverId;
            this.StatusType = statusType;
            this.LocCity = locCity;
            this.GroupId = groupId;
            this.LocName = locName;
            this.LocLat = locLat;
            this.Remark = remark;
            this.LocState = locState;
            this.VehicleId = vehicleId;
            this.CodriverIds = codriverIds;
        }
        
        /// <summary>
        /// Longitude at which the log was recorded.
        /// </summary>
        /// <value>Longitude at which the log was recorded.</value>
        [DataMember(Name="locLng", EmitDefaultValue=false)]
        public double? LocLng { get; set; }

        /// <summary>
        /// The time at which the log/HOS status started in UNIX milliseconds.
        /// </summary>
        /// <value>The time at which the log/HOS status started in UNIX milliseconds.</value>
        [DataMember(Name="logStartMs", EmitDefaultValue=false)]
        public long? LogStartMs { get; set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        /// <value>ID of the driver.</value>
        [DataMember(Name="driverId", EmitDefaultValue=false)]
        public long? DriverId { get; set; }

        /// <summary>
        /// The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
        /// </summary>
        /// <value>The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.</value>
        [DataMember(Name="statusType", EmitDefaultValue=false)]
        public string StatusType { get; set; }

        /// <summary>
        /// City in which the log was recorded.
        /// </summary>
        /// <value>City in which the log was recorded.</value>
        [DataMember(Name="locCity", EmitDefaultValue=false)]
        public string LocCity { get; set; }

        /// <summary>
        /// ID of the group.
        /// </summary>
        /// <value>ID of the group.</value>
        [DataMember(Name="groupId", EmitDefaultValue=false)]
        public long? GroupId { get; set; }

        /// <summary>
        /// Name of location at which the log was recorded.
        /// </summary>
        /// <value>Name of location at which the log was recorded.</value>
        [DataMember(Name="locName", EmitDefaultValue=false)]
        public string LocName { get; set; }

        /// <summary>
        /// Latitude at which the log was recorded.
        /// </summary>
        /// <value>Latitude at which the log was recorded.</value>
        [DataMember(Name="locLat", EmitDefaultValue=false)]
        public double? LocLat { get; set; }

        /// <summary>
        /// Remark associated with the log entry.
        /// </summary>
        /// <value>Remark associated with the log entry.</value>
        [DataMember(Name="remark", EmitDefaultValue=false)]
        public string Remark { get; set; }

        /// <summary>
        /// State in which the log was recorded.
        /// </summary>
        /// <value>State in which the log was recorded.</value>
        [DataMember(Name="locState", EmitDefaultValue=false)]
        public string LocState { get; set; }

        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        /// <value>ID of the vehicle.</value>
        [DataMember(Name="vehicleId", EmitDefaultValue=false)]
        public long? VehicleId { get; set; }

        /// <summary>
        /// Gets or Sets CodriverIds
        /// </summary>
        [DataMember(Name="codriverIds", EmitDefaultValue=false)]
        public List<long?> CodriverIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HosLogsResponseLogs {\n");
            sb.Append("  LocLng: ").Append(LocLng).Append("\n");
            sb.Append("  LogStartMs: ").Append(LogStartMs).Append("\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  StatusType: ").Append(StatusType).Append("\n");
            sb.Append("  LocCity: ").Append(LocCity).Append("\n");
            sb.Append("  GroupId: ").Append(GroupId).Append("\n");
            sb.Append("  LocName: ").Append(LocName).Append("\n");
            sb.Append("  LocLat: ").Append(LocLat).Append("\n");
            sb.Append("  Remark: ").Append(Remark).Append("\n");
            sb.Append("  LocState: ").Append(LocState).Append("\n");
            sb.Append("  VehicleId: ").Append(VehicleId).Append("\n");
            sb.Append("  CodriverIds: ").Append(CodriverIds).Append("\n");
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
            return this.Equals(input as HosLogsResponseLogs);
        }

        /// <summary>
        /// Returns true if HosLogsResponseLogs instances are equal
        /// </summary>
        /// <param name="input">Instance of HosLogsResponseLogs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HosLogsResponseLogs input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.LocLng == input.LocLng ||
                    (this.LocLng != null &&
                    this.LocLng.Equals(input.LocLng))
                ) && 
                (
                    this.LogStartMs == input.LogStartMs ||
                    (this.LogStartMs != null &&
                    this.LogStartMs.Equals(input.LogStartMs))
                ) && 
                (
                    this.DriverId == input.DriverId ||
                    (this.DriverId != null &&
                    this.DriverId.Equals(input.DriverId))
                ) && 
                (
                    this.StatusType == input.StatusType ||
                    (this.StatusType != null &&
                    this.StatusType.Equals(input.StatusType))
                ) && 
                (
                    this.LocCity == input.LocCity ||
                    (this.LocCity != null &&
                    this.LocCity.Equals(input.LocCity))
                ) && 
                (
                    this.GroupId == input.GroupId ||
                    (this.GroupId != null &&
                    this.GroupId.Equals(input.GroupId))
                ) && 
                (
                    this.LocName == input.LocName ||
                    (this.LocName != null &&
                    this.LocName.Equals(input.LocName))
                ) && 
                (
                    this.LocLat == input.LocLat ||
                    (this.LocLat != null &&
                    this.LocLat.Equals(input.LocLat))
                ) && 
                (
                    this.Remark == input.Remark ||
                    (this.Remark != null &&
                    this.Remark.Equals(input.Remark))
                ) && 
                (
                    this.LocState == input.LocState ||
                    (this.LocState != null &&
                    this.LocState.Equals(input.LocState))
                ) && 
                (
                    this.VehicleId == input.VehicleId ||
                    (this.VehicleId != null &&
                    this.VehicleId.Equals(input.VehicleId))
                ) && 
                (
                    this.CodriverIds == input.CodriverIds ||
                    this.CodriverIds != null &&
                    this.CodriverIds.SequenceEqual(input.CodriverIds)
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
                if (this.LocLng != null)
                    hashCode = hashCode * 59 + this.LocLng.GetHashCode();
                if (this.LogStartMs != null)
                    hashCode = hashCode * 59 + this.LogStartMs.GetHashCode();
                if (this.DriverId != null)
                    hashCode = hashCode * 59 + this.DriverId.GetHashCode();
                if (this.StatusType != null)
                    hashCode = hashCode * 59 + this.StatusType.GetHashCode();
                if (this.LocCity != null)
                    hashCode = hashCode * 59 + this.LocCity.GetHashCode();
                if (this.GroupId != null)
                    hashCode = hashCode * 59 + this.GroupId.GetHashCode();
                if (this.LocName != null)
                    hashCode = hashCode * 59 + this.LocName.GetHashCode();
                if (this.LocLat != null)
                    hashCode = hashCode * 59 + this.LocLat.GetHashCode();
                if (this.Remark != null)
                    hashCode = hashCode * 59 + this.Remark.GetHashCode();
                if (this.LocState != null)
                    hashCode = hashCode * 59 + this.LocState.GetHashCode();
                if (this.VehicleId != null)
                    hashCode = hashCode * 59 + this.VehicleId.GetHashCode();
                if (this.CodriverIds != null)
                    hashCode = hashCode * 59 + this.CodriverIds.GetHashCode();
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
