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
    /// DriversSummaryResponseSummaries
    /// </summary>
    [DataContract]
    public partial class DriversSummaryResponseSummaries :  IEquatable<DriversSummaryResponseSummaries>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DriversSummaryResponseSummaries" /> class.
        /// </summary>
        /// <param name="driverId">ID of the driver..</param>
        /// <param name="distanceMiles">Distance driven in miles, rounded to two decimal places..</param>
        /// <param name="driveMs">Duration in milliseconds that driver was driving during the requested time range.</param>
        /// <param name="activeMs">Duration in milliseconds that driver was on duty or driving during the requested time range.</param>
        /// <param name="driverUsername">Username of the driver..</param>
        /// <param name="groupId">Group of the driver..</param>
        /// <param name="driverName">Name of the driver..</param>
        /// <param name="onDutyMs">Duration in milliseconds that driver was on duty during the requested time range.</param>
        public DriversSummaryResponseSummaries(long driverId = default(long), double distanceMiles = default(double), long driveMs = default(long), long activeMs = default(long), string driverUsername = default(string), long groupId = default(long), string driverName = default(string), long onDutyMs = default(long))
        {
            this.DriverId = driverId;
            this.DistanceMiles = distanceMiles;
            this.DriveMs = driveMs;
            this.ActiveMs = activeMs;
            this.DriverUsername = driverUsername;
            this.GroupId = groupId;
            this.DriverName = driverName;
            this.OnDutyMs = onDutyMs;
        }
        
        /// <summary>
        /// ID of the driver.
        /// </summary>
        /// <value>ID of the driver.</value>
        [DataMember(Name="driverId", EmitDefaultValue=false)]
        public long DriverId { get; set; }

        /// <summary>
        /// Distance driven in miles, rounded to two decimal places.
        /// </summary>
        /// <value>Distance driven in miles, rounded to two decimal places.</value>
        [DataMember(Name="distanceMiles", EmitDefaultValue=false)]
        public double DistanceMiles { get; set; }

        /// <summary>
        /// Duration in milliseconds that driver was driving during the requested time range
        /// </summary>
        /// <value>Duration in milliseconds that driver was driving during the requested time range</value>
        [DataMember(Name="driveMs", EmitDefaultValue=false)]
        public long DriveMs { get; set; }

        /// <summary>
        /// Duration in milliseconds that driver was on duty or driving during the requested time range
        /// </summary>
        /// <value>Duration in milliseconds that driver was on duty or driving during the requested time range</value>
        [DataMember(Name="activeMs", EmitDefaultValue=false)]
        public long ActiveMs { get; set; }

        /// <summary>
        /// Username of the driver.
        /// </summary>
        /// <value>Username of the driver.</value>
        [DataMember(Name="driverUsername", EmitDefaultValue=false)]
        public string DriverUsername { get; set; }

        /// <summary>
        /// Group of the driver.
        /// </summary>
        /// <value>Group of the driver.</value>
        [DataMember(Name="groupId", EmitDefaultValue=false)]
        public long GroupId { get; set; }

        /// <summary>
        /// Name of the driver.
        /// </summary>
        /// <value>Name of the driver.</value>
        [DataMember(Name="driverName", EmitDefaultValue=false)]
        public string DriverName { get; set; }

        /// <summary>
        /// Duration in milliseconds that driver was on duty during the requested time range
        /// </summary>
        /// <value>Duration in milliseconds that driver was on duty during the requested time range</value>
        [DataMember(Name="onDutyMs", EmitDefaultValue=false)]
        public long OnDutyMs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DriversSummaryResponseSummaries {\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  DistanceMiles: ").Append(DistanceMiles).Append("\n");
            sb.Append("  DriveMs: ").Append(DriveMs).Append("\n");
            sb.Append("  ActiveMs: ").Append(ActiveMs).Append("\n");
            sb.Append("  DriverUsername: ").Append(DriverUsername).Append("\n");
            sb.Append("  GroupId: ").Append(GroupId).Append("\n");
            sb.Append("  DriverName: ").Append(DriverName).Append("\n");
            sb.Append("  OnDutyMs: ").Append(OnDutyMs).Append("\n");
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
            return this.Equals(input as DriversSummaryResponseSummaries);
        }

        /// <summary>
        /// Returns true if DriversSummaryResponseSummaries instances are equal
        /// </summary>
        /// <param name="input">Instance of DriversSummaryResponseSummaries to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DriversSummaryResponseSummaries input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DriverId == input.DriverId ||
                    (this.DriverId != null &&
                    this.DriverId.Equals(input.DriverId))
                ) && 
                (
                    this.DistanceMiles == input.DistanceMiles ||
                    (this.DistanceMiles != null &&
                    this.DistanceMiles.Equals(input.DistanceMiles))
                ) && 
                (
                    this.DriveMs == input.DriveMs ||
                    (this.DriveMs != null &&
                    this.DriveMs.Equals(input.DriveMs))
                ) && 
                (
                    this.ActiveMs == input.ActiveMs ||
                    (this.ActiveMs != null &&
                    this.ActiveMs.Equals(input.ActiveMs))
                ) && 
                (
                    this.DriverUsername == input.DriverUsername ||
                    (this.DriverUsername != null &&
                    this.DriverUsername.Equals(input.DriverUsername))
                ) && 
                (
                    this.GroupId == input.GroupId ||
                    (this.GroupId != null &&
                    this.GroupId.Equals(input.GroupId))
                ) && 
                (
                    this.DriverName == input.DriverName ||
                    (this.DriverName != null &&
                    this.DriverName.Equals(input.DriverName))
                ) && 
                (
                    this.OnDutyMs == input.OnDutyMs ||
                    (this.OnDutyMs != null &&
                    this.OnDutyMs.Equals(input.OnDutyMs))
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
                if (this.DriverId != null)
                    hashCode = hashCode * 59 + this.DriverId.GetHashCode();
                if (this.DistanceMiles != null)
                    hashCode = hashCode * 59 + this.DistanceMiles.GetHashCode();
                if (this.DriveMs != null)
                    hashCode = hashCode * 59 + this.DriveMs.GetHashCode();
                if (this.ActiveMs != null)
                    hashCode = hashCode * 59 + this.ActiveMs.GetHashCode();
                if (this.DriverUsername != null)
                    hashCode = hashCode * 59 + this.DriverUsername.GetHashCode();
                if (this.GroupId != null)
                    hashCode = hashCode * 59 + this.GroupId.GetHashCode();
                if (this.DriverName != null)
                    hashCode = hashCode * 59 + this.DriverName.GetHashCode();
                if (this.OnDutyMs != null)
                    hashCode = hashCode * 59 + this.OnDutyMs.GetHashCode();
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
