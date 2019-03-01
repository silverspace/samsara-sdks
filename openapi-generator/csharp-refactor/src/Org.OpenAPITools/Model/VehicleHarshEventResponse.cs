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
    /// Harsh event details for a vehicle
    /// </summary>
    [DataContract]
    public partial class VehicleHarshEventResponse :  IEquatable<VehicleHarshEventResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleHarshEventResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VehicleHarshEventResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleHarshEventResponse" /> class.
        /// </summary>
        /// <param name="downloadForwardVideoUrl">URL for downloading the forward facing video.</param>
        /// <param name="downloadInwardVideoUrl">URL for downloading the inward facing video.</param>
        /// <param name="downloadTrackedInwardVideoUrl">URL for downloading the tracked inward facing video.</param>
        /// <param name="harshEventType">Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] (required).</param>
        /// <param name="incidentReportUrl">URL of the associated incident report page (required).</param>
        /// <param name="isDistracted">Whether the driver was deemed distracted during this harsh event.</param>
        /// <param name="location">location.</param>
        public VehicleHarshEventResponse(string downloadForwardVideoUrl = default(string), string downloadInwardVideoUrl = default(string), string downloadTrackedInwardVideoUrl = default(string), string harshEventType = default(string), string incidentReportUrl = default(string), bool isDistracted = default(bool), VehicleHarshEventResponseLocation location = default(VehicleHarshEventResponseLocation))
        {
            // to ensure "harshEventType" is required (not null)
            if (harshEventType == null)
            {
                throw new InvalidDataException("harshEventType is a required property for VehicleHarshEventResponse and cannot be null");
            }
            else
            {
                this.HarshEventType = harshEventType;
            }

            // to ensure "incidentReportUrl" is required (not null)
            if (incidentReportUrl == null)
            {
                throw new InvalidDataException("incidentReportUrl is a required property for VehicleHarshEventResponse and cannot be null");
            }
            else
            {
                this.IncidentReportUrl = incidentReportUrl;
            }

            this.DownloadForwardVideoUrl = downloadForwardVideoUrl;
            this.DownloadInwardVideoUrl = downloadInwardVideoUrl;
            this.DownloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
            this.IsDistracted = isDistracted;
            this.Location = location;
        }
        
        /// <summary>
        /// URL for downloading the forward facing video
        /// </summary>
        /// <value>URL for downloading the forward facing video</value>
        [DataMember(Name="downloadForwardVideoUrl", EmitDefaultValue=false)]
        public string DownloadForwardVideoUrl { get; set; }

        /// <summary>
        /// URL for downloading the inward facing video
        /// </summary>
        /// <value>URL for downloading the inward facing video</value>
        [DataMember(Name="downloadInwardVideoUrl", EmitDefaultValue=false)]
        public string DownloadInwardVideoUrl { get; set; }

        /// <summary>
        /// URL for downloading the tracked inward facing video
        /// </summary>
        /// <value>URL for downloading the tracked inward facing video</value>
        [DataMember(Name="downloadTrackedInwardVideoUrl", EmitDefaultValue=false)]
        public string DownloadTrackedInwardVideoUrl { get; set; }

        /// <summary>
        /// Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
        /// </summary>
        /// <value>Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]</value>
        [DataMember(Name="harshEventType", EmitDefaultValue=false)]
        public string HarshEventType { get; set; }

        /// <summary>
        /// URL of the associated incident report page
        /// </summary>
        /// <value>URL of the associated incident report page</value>
        [DataMember(Name="incidentReportUrl", EmitDefaultValue=false)]
        public string IncidentReportUrl { get; set; }

        /// <summary>
        /// Whether the driver was deemed distracted during this harsh event
        /// </summary>
        /// <value>Whether the driver was deemed distracted during this harsh event</value>
        [DataMember(Name="isDistracted", EmitDefaultValue=false)]
        public bool IsDistracted { get; set; }

        /// <summary>
        /// Gets or Sets Location
        /// </summary>
        [DataMember(Name="location", EmitDefaultValue=false)]
        public VehicleHarshEventResponseLocation Location { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VehicleHarshEventResponse {\n");
            sb.Append("  DownloadForwardVideoUrl: ").Append(DownloadForwardVideoUrl).Append("\n");
            sb.Append("  DownloadInwardVideoUrl: ").Append(DownloadInwardVideoUrl).Append("\n");
            sb.Append("  DownloadTrackedInwardVideoUrl: ").Append(DownloadTrackedInwardVideoUrl).Append("\n");
            sb.Append("  HarshEventType: ").Append(HarshEventType).Append("\n");
            sb.Append("  IncidentReportUrl: ").Append(IncidentReportUrl).Append("\n");
            sb.Append("  IsDistracted: ").Append(IsDistracted).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
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
            return this.Equals(input as VehicleHarshEventResponse);
        }

        /// <summary>
        /// Returns true if VehicleHarshEventResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of VehicleHarshEventResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VehicleHarshEventResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DownloadForwardVideoUrl == input.DownloadForwardVideoUrl ||
                    (this.DownloadForwardVideoUrl != null &&
                    this.DownloadForwardVideoUrl.Equals(input.DownloadForwardVideoUrl))
                ) && 
                (
                    this.DownloadInwardVideoUrl == input.DownloadInwardVideoUrl ||
                    (this.DownloadInwardVideoUrl != null &&
                    this.DownloadInwardVideoUrl.Equals(input.DownloadInwardVideoUrl))
                ) && 
                (
                    this.DownloadTrackedInwardVideoUrl == input.DownloadTrackedInwardVideoUrl ||
                    (this.DownloadTrackedInwardVideoUrl != null &&
                    this.DownloadTrackedInwardVideoUrl.Equals(input.DownloadTrackedInwardVideoUrl))
                ) && 
                (
                    this.HarshEventType == input.HarshEventType ||
                    (this.HarshEventType != null &&
                    this.HarshEventType.Equals(input.HarshEventType))
                ) && 
                (
                    this.IncidentReportUrl == input.IncidentReportUrl ||
                    (this.IncidentReportUrl != null &&
                    this.IncidentReportUrl.Equals(input.IncidentReportUrl))
                ) && 
                (
                    this.IsDistracted == input.IsDistracted ||
                    (this.IsDistracted != null &&
                    this.IsDistracted.Equals(input.IsDistracted))
                ) && 
                (
                    this.Location == input.Location ||
                    (this.Location != null &&
                    this.Location.Equals(input.Location))
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
                if (this.DownloadForwardVideoUrl != null)
                    hashCode = hashCode * 59 + this.DownloadForwardVideoUrl.GetHashCode();
                if (this.DownloadInwardVideoUrl != null)
                    hashCode = hashCode * 59 + this.DownloadInwardVideoUrl.GetHashCode();
                if (this.DownloadTrackedInwardVideoUrl != null)
                    hashCode = hashCode * 59 + this.DownloadTrackedInwardVideoUrl.GetHashCode();
                if (this.HarshEventType != null)
                    hashCode = hashCode * 59 + this.HarshEventType.GetHashCode();
                if (this.IncidentReportUrl != null)
                    hashCode = hashCode * 59 + this.IncidentReportUrl.GetHashCode();
                if (this.IsDistracted != null)
                    hashCode = hashCode * 59 + this.IsDistracted.GetHashCode();
                if (this.Location != null)
                    hashCode = hashCode * 59 + this.Location.GetHashCode();
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
