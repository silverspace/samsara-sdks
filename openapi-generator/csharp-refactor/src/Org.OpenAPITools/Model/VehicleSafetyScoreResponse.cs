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
    /// Safety score details for a vehicle
    /// </summary>
    [DataContract]
    public partial class VehicleSafetyScoreResponse :  IEquatable<VehicleSafetyScoreResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleSafetyScoreResponse" /> class.
        /// </summary>
        /// <param name="crashCount">Crash event count.</param>
        /// <param name="harshAccelCount">Harsh acceleration event count.</param>
        /// <param name="harshBrakingCount">Harsh braking event count.</param>
        /// <param name="harshEvents">harshEvents.</param>
        /// <param name="harshTurningCount">Harsh turning event count.</param>
        /// <param name="safetyScore">Safety Score.</param>
        /// <param name="safetyScoreRank">Safety Score Rank.</param>
        /// <param name="timeOverSpeedLimitMs">Amount of time driven over the speed limit in milliseconds.</param>
        /// <param name="totalDistanceDrivenMeters">Total distance driven in meters.</param>
        /// <param name="totalHarshEventCount">Total harsh event count.</param>
        /// <param name="totalTimeDrivenMs">Amount of time driven in milliseconds.</param>
        /// <param name="vehicleId">Vehicle ID.</param>
        public VehicleSafetyScoreResponse(int crashCount = default(int), int harshAccelCount = default(int), int harshBrakingCount = default(int), List<SafetyReportHarshEvent> harshEvents = default(List<SafetyReportHarshEvent>), int harshTurningCount = default(int), int safetyScore = default(int), string safetyScoreRank = default(string), int timeOverSpeedLimitMs = default(int), int totalDistanceDrivenMeters = default(int), int totalHarshEventCount = default(int), int totalTimeDrivenMs = default(int), int vehicleId = default(int))
        {
            this.CrashCount = crashCount;
            this.HarshAccelCount = harshAccelCount;
            this.HarshBrakingCount = harshBrakingCount;
            this.HarshEvents = harshEvents;
            this.HarshTurningCount = harshTurningCount;
            this.SafetyScore = safetyScore;
            this.SafetyScoreRank = safetyScoreRank;
            this.TimeOverSpeedLimitMs = timeOverSpeedLimitMs;
            this.TotalDistanceDrivenMeters = totalDistanceDrivenMeters;
            this.TotalHarshEventCount = totalHarshEventCount;
            this.TotalTimeDrivenMs = totalTimeDrivenMs;
            this.VehicleId = vehicleId;
        }
        
        /// <summary>
        /// Crash event count
        /// </summary>
        /// <value>Crash event count</value>
        [DataMember(Name="crashCount", EmitDefaultValue=false)]
        public int CrashCount { get; set; }

        /// <summary>
        /// Harsh acceleration event count
        /// </summary>
        /// <value>Harsh acceleration event count</value>
        [DataMember(Name="harshAccelCount", EmitDefaultValue=false)]
        public int HarshAccelCount { get; set; }

        /// <summary>
        /// Harsh braking event count
        /// </summary>
        /// <value>Harsh braking event count</value>
        [DataMember(Name="harshBrakingCount", EmitDefaultValue=false)]
        public int HarshBrakingCount { get; set; }

        /// <summary>
        /// Gets or Sets HarshEvents
        /// </summary>
        [DataMember(Name="harshEvents", EmitDefaultValue=false)]
        public List<SafetyReportHarshEvent> HarshEvents { get; set; }

        /// <summary>
        /// Harsh turning event count
        /// </summary>
        /// <value>Harsh turning event count</value>
        [DataMember(Name="harshTurningCount", EmitDefaultValue=false)]
        public int HarshTurningCount { get; set; }

        /// <summary>
        /// Safety Score
        /// </summary>
        /// <value>Safety Score</value>
        [DataMember(Name="safetyScore", EmitDefaultValue=false)]
        public int SafetyScore { get; set; }

        /// <summary>
        /// Safety Score Rank
        /// </summary>
        /// <value>Safety Score Rank</value>
        [DataMember(Name="safetyScoreRank", EmitDefaultValue=false)]
        public string SafetyScoreRank { get; set; }

        /// <summary>
        /// Amount of time driven over the speed limit in milliseconds
        /// </summary>
        /// <value>Amount of time driven over the speed limit in milliseconds</value>
        [DataMember(Name="timeOverSpeedLimitMs", EmitDefaultValue=false)]
        public int TimeOverSpeedLimitMs { get; set; }

        /// <summary>
        /// Total distance driven in meters
        /// </summary>
        /// <value>Total distance driven in meters</value>
        [DataMember(Name="totalDistanceDrivenMeters", EmitDefaultValue=false)]
        public int TotalDistanceDrivenMeters { get; set; }

        /// <summary>
        /// Total harsh event count
        /// </summary>
        /// <value>Total harsh event count</value>
        [DataMember(Name="totalHarshEventCount", EmitDefaultValue=false)]
        public int TotalHarshEventCount { get; set; }

        /// <summary>
        /// Amount of time driven in milliseconds
        /// </summary>
        /// <value>Amount of time driven in milliseconds</value>
        [DataMember(Name="totalTimeDrivenMs", EmitDefaultValue=false)]
        public int TotalTimeDrivenMs { get; set; }

        /// <summary>
        /// Vehicle ID
        /// </summary>
        /// <value>Vehicle ID</value>
        [DataMember(Name="vehicleId", EmitDefaultValue=false)]
        public int VehicleId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VehicleSafetyScoreResponse {\n");
            sb.Append("  CrashCount: ").Append(CrashCount).Append("\n");
            sb.Append("  HarshAccelCount: ").Append(HarshAccelCount).Append("\n");
            sb.Append("  HarshBrakingCount: ").Append(HarshBrakingCount).Append("\n");
            sb.Append("  HarshEvents: ").Append(HarshEvents).Append("\n");
            sb.Append("  HarshTurningCount: ").Append(HarshTurningCount).Append("\n");
            sb.Append("  SafetyScore: ").Append(SafetyScore).Append("\n");
            sb.Append("  SafetyScoreRank: ").Append(SafetyScoreRank).Append("\n");
            sb.Append("  TimeOverSpeedLimitMs: ").Append(TimeOverSpeedLimitMs).Append("\n");
            sb.Append("  TotalDistanceDrivenMeters: ").Append(TotalDistanceDrivenMeters).Append("\n");
            sb.Append("  TotalHarshEventCount: ").Append(TotalHarshEventCount).Append("\n");
            sb.Append("  TotalTimeDrivenMs: ").Append(TotalTimeDrivenMs).Append("\n");
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
            return this.Equals(input as VehicleSafetyScoreResponse);
        }

        /// <summary>
        /// Returns true if VehicleSafetyScoreResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of VehicleSafetyScoreResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VehicleSafetyScoreResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CrashCount == input.CrashCount ||
                    (this.CrashCount != null &&
                    this.CrashCount.Equals(input.CrashCount))
                ) && 
                (
                    this.HarshAccelCount == input.HarshAccelCount ||
                    (this.HarshAccelCount != null &&
                    this.HarshAccelCount.Equals(input.HarshAccelCount))
                ) && 
                (
                    this.HarshBrakingCount == input.HarshBrakingCount ||
                    (this.HarshBrakingCount != null &&
                    this.HarshBrakingCount.Equals(input.HarshBrakingCount))
                ) && 
                (
                    this.HarshEvents == input.HarshEvents ||
                    this.HarshEvents != null &&
                    this.HarshEvents.SequenceEqual(input.HarshEvents)
                ) && 
                (
                    this.HarshTurningCount == input.HarshTurningCount ||
                    (this.HarshTurningCount != null &&
                    this.HarshTurningCount.Equals(input.HarshTurningCount))
                ) && 
                (
                    this.SafetyScore == input.SafetyScore ||
                    (this.SafetyScore != null &&
                    this.SafetyScore.Equals(input.SafetyScore))
                ) && 
                (
                    this.SafetyScoreRank == input.SafetyScoreRank ||
                    (this.SafetyScoreRank != null &&
                    this.SafetyScoreRank.Equals(input.SafetyScoreRank))
                ) && 
                (
                    this.TimeOverSpeedLimitMs == input.TimeOverSpeedLimitMs ||
                    (this.TimeOverSpeedLimitMs != null &&
                    this.TimeOverSpeedLimitMs.Equals(input.TimeOverSpeedLimitMs))
                ) && 
                (
                    this.TotalDistanceDrivenMeters == input.TotalDistanceDrivenMeters ||
                    (this.TotalDistanceDrivenMeters != null &&
                    this.TotalDistanceDrivenMeters.Equals(input.TotalDistanceDrivenMeters))
                ) && 
                (
                    this.TotalHarshEventCount == input.TotalHarshEventCount ||
                    (this.TotalHarshEventCount != null &&
                    this.TotalHarshEventCount.Equals(input.TotalHarshEventCount))
                ) && 
                (
                    this.TotalTimeDrivenMs == input.TotalTimeDrivenMs ||
                    (this.TotalTimeDrivenMs != null &&
                    this.TotalTimeDrivenMs.Equals(input.TotalTimeDrivenMs))
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
                if (this.CrashCount != null)
                    hashCode = hashCode * 59 + this.CrashCount.GetHashCode();
                if (this.HarshAccelCount != null)
                    hashCode = hashCode * 59 + this.HarshAccelCount.GetHashCode();
                if (this.HarshBrakingCount != null)
                    hashCode = hashCode * 59 + this.HarshBrakingCount.GetHashCode();
                if (this.HarshEvents != null)
                    hashCode = hashCode * 59 + this.HarshEvents.GetHashCode();
                if (this.HarshTurningCount != null)
                    hashCode = hashCode * 59 + this.HarshTurningCount.GetHashCode();
                if (this.SafetyScore != null)
                    hashCode = hashCode * 59 + this.SafetyScore.GetHashCode();
                if (this.SafetyScoreRank != null)
                    hashCode = hashCode * 59 + this.SafetyScoreRank.GetHashCode();
                if (this.TimeOverSpeedLimitMs != null)
                    hashCode = hashCode * 59 + this.TimeOverSpeedLimitMs.GetHashCode();
                if (this.TotalDistanceDrivenMeters != null)
                    hashCode = hashCode * 59 + this.TotalDistanceDrivenMeters.GetHashCode();
                if (this.TotalHarshEventCount != null)
                    hashCode = hashCode * 59 + this.TotalHarshEventCount.GetHashCode();
                if (this.TotalTimeDrivenMs != null)
                    hashCode = hashCode * 59 + this.TotalTimeDrivenMs.GetHashCode();
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
