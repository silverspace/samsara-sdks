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
    /// DriverDailyLogResponseDays
    /// </summary>
    [DataContract]
    public partial class DriverDailyLogResponseDays :  IEquatable<DriverDailyLogResponseDays>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DriverDailyLogResponseDays" /> class.
        /// </summary>
        /// <param name="certifiedAtMs">Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0..</param>
        /// <param name="endMs">End of the HOS day, specified in milliseconds UNIX time..</param>
        /// <param name="startMs">End of the HOS day, specified in milliseconds UNIX time..</param>
        /// <param name="trailerIds">List of trailer ID&#39;s associated with the driver for the day..</param>
        /// <param name="activeHours">Hours spent on duty or driving, rounded to two decimal places..</param>
        /// <param name="distanceMiles">Distance driven in miles, rounded to two decimal places..</param>
        /// <param name="activeMs">Milliseconds spent on duty or driving..</param>
        /// <param name="certified">Whether this HOS day chart was certified by the driver..</param>
        /// <param name="vehicleIds">List of vehicle ID&#39;s associated with the driver for the day..</param>
        public DriverDailyLogResponseDays(long? certifiedAtMs = default(long?), int? endMs = default(int?), int? startMs = default(int?), Object trailerIds = default(Object), double? activeHours = default(double?), double? distanceMiles = default(double?), long? activeMs = default(long?), bool? certified = default(bool?), Object vehicleIds = default(Object))
        {
            this.CertifiedAtMs = certifiedAtMs;
            this.EndMs = endMs;
            this.StartMs = startMs;
            this.TrailerIds = trailerIds;
            this.ActiveHours = activeHours;
            this.DistanceMiles = distanceMiles;
            this.ActiveMs = activeMs;
            this.Certified = certified;
            this.VehicleIds = vehicleIds;
        }
        
        /// <summary>
        /// Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
        /// </summary>
        /// <value>Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.</value>
        [DataMember(Name="certifiedAtMs", EmitDefaultValue=false)]
        public long? CertifiedAtMs { get; set; }

        /// <summary>
        /// End of the HOS day, specified in milliseconds UNIX time.
        /// </summary>
        /// <value>End of the HOS day, specified in milliseconds UNIX time.</value>
        [DataMember(Name="endMs", EmitDefaultValue=false)]
        public int? EndMs { get; set; }

        /// <summary>
        /// End of the HOS day, specified in milliseconds UNIX time.
        /// </summary>
        /// <value>End of the HOS day, specified in milliseconds UNIX time.</value>
        [DataMember(Name="startMs", EmitDefaultValue=false)]
        public int? StartMs { get; set; }

        /// <summary>
        /// List of trailer ID&#39;s associated with the driver for the day.
        /// </summary>
        /// <value>List of trailer ID&#39;s associated with the driver for the day.</value>
        [DataMember(Name="trailerIds", EmitDefaultValue=false)]
        public Object TrailerIds { get; set; }

        /// <summary>
        /// Hours spent on duty or driving, rounded to two decimal places.
        /// </summary>
        /// <value>Hours spent on duty or driving, rounded to two decimal places.</value>
        [DataMember(Name="activeHours", EmitDefaultValue=false)]
        public double? ActiveHours { get; set; }

        /// <summary>
        /// Distance driven in miles, rounded to two decimal places.
        /// </summary>
        /// <value>Distance driven in miles, rounded to two decimal places.</value>
        [DataMember(Name="distanceMiles", EmitDefaultValue=false)]
        public double? DistanceMiles { get; set; }

        /// <summary>
        /// Milliseconds spent on duty or driving.
        /// </summary>
        /// <value>Milliseconds spent on duty or driving.</value>
        [DataMember(Name="activeMs", EmitDefaultValue=false)]
        public long? ActiveMs { get; set; }

        /// <summary>
        /// Whether this HOS day chart was certified by the driver.
        /// </summary>
        /// <value>Whether this HOS day chart was certified by the driver.</value>
        [DataMember(Name="certified", EmitDefaultValue=false)]
        public bool? Certified { get; set; }

        /// <summary>
        /// List of vehicle ID&#39;s associated with the driver for the day.
        /// </summary>
        /// <value>List of vehicle ID&#39;s associated with the driver for the day.</value>
        [DataMember(Name="vehicleIds", EmitDefaultValue=false)]
        public Object VehicleIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DriverDailyLogResponseDays {\n");
            sb.Append("  CertifiedAtMs: ").Append(CertifiedAtMs).Append("\n");
            sb.Append("  EndMs: ").Append(EndMs).Append("\n");
            sb.Append("  StartMs: ").Append(StartMs).Append("\n");
            sb.Append("  TrailerIds: ").Append(TrailerIds).Append("\n");
            sb.Append("  ActiveHours: ").Append(ActiveHours).Append("\n");
            sb.Append("  DistanceMiles: ").Append(DistanceMiles).Append("\n");
            sb.Append("  ActiveMs: ").Append(ActiveMs).Append("\n");
            sb.Append("  Certified: ").Append(Certified).Append("\n");
            sb.Append("  VehicleIds: ").Append(VehicleIds).Append("\n");
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
            return this.Equals(input as DriverDailyLogResponseDays);
        }

        /// <summary>
        /// Returns true if DriverDailyLogResponseDays instances are equal
        /// </summary>
        /// <param name="input">Instance of DriverDailyLogResponseDays to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DriverDailyLogResponseDays input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CertifiedAtMs == input.CertifiedAtMs ||
                    (this.CertifiedAtMs != null &&
                    this.CertifiedAtMs.Equals(input.CertifiedAtMs))
                ) && 
                (
                    this.EndMs == input.EndMs ||
                    (this.EndMs != null &&
                    this.EndMs.Equals(input.EndMs))
                ) && 
                (
                    this.StartMs == input.StartMs ||
                    (this.StartMs != null &&
                    this.StartMs.Equals(input.StartMs))
                ) && 
                (
                    this.TrailerIds == input.TrailerIds ||
                    (this.TrailerIds != null &&
                    this.TrailerIds.Equals(input.TrailerIds))
                ) && 
                (
                    this.ActiveHours == input.ActiveHours ||
                    (this.ActiveHours != null &&
                    this.ActiveHours.Equals(input.ActiveHours))
                ) && 
                (
                    this.DistanceMiles == input.DistanceMiles ||
                    (this.DistanceMiles != null &&
                    this.DistanceMiles.Equals(input.DistanceMiles))
                ) && 
                (
                    this.ActiveMs == input.ActiveMs ||
                    (this.ActiveMs != null &&
                    this.ActiveMs.Equals(input.ActiveMs))
                ) && 
                (
                    this.Certified == input.Certified ||
                    (this.Certified != null &&
                    this.Certified.Equals(input.Certified))
                ) && 
                (
                    this.VehicleIds == input.VehicleIds ||
                    (this.VehicleIds != null &&
                    this.VehicleIds.Equals(input.VehicleIds))
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
                if (this.CertifiedAtMs != null)
                    hashCode = hashCode * 59 + this.CertifiedAtMs.GetHashCode();
                if (this.EndMs != null)
                    hashCode = hashCode * 59 + this.EndMs.GetHashCode();
                if (this.StartMs != null)
                    hashCode = hashCode * 59 + this.StartMs.GetHashCode();
                if (this.TrailerIds != null)
                    hashCode = hashCode * 59 + this.TrailerIds.GetHashCode();
                if (this.ActiveHours != null)
                    hashCode = hashCode * 59 + this.ActiveHours.GetHashCode();
                if (this.DistanceMiles != null)
                    hashCode = hashCode * 59 + this.DistanceMiles.GetHashCode();
                if (this.ActiveMs != null)
                    hashCode = hashCode * 59 + this.ActiveMs.GetHashCode();
                if (this.Certified != null)
                    hashCode = hashCode * 59 + this.Certified.GetHashCode();
                if (this.VehicleIds != null)
                    hashCode = hashCode * 59 + this.VehicleIds.GetHashCode();
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
