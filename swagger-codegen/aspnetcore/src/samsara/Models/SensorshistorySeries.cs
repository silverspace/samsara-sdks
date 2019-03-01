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
    /// Sensor ID and field to query.
    /// </summary>
    [DataContract]
    public partial class SensorshistorySeries : IEquatable<SensorshistorySeries>
    { 
        /// <summary>
        /// Field to query.
        /// </summary>
        /// <value>Field to query.</value>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum FieldEnum
        {
            
            /// <summary>
            /// Enum AmbientTemperatureEnum for ambientTemperature
            /// </summary>
            [EnumMember(Value = "ambientTemperature")]
            AmbientTemperatureEnum = 1,
            
            /// <summary>
            /// Enum ProbeTemperatureEnum for probeTemperature
            /// </summary>
            [EnumMember(Value = "probeTemperature")]
            ProbeTemperatureEnum = 2,
            
            /// <summary>
            /// Enum CurrentLoop1RawEnum for currentLoop1Raw
            /// </summary>
            [EnumMember(Value = "currentLoop1Raw")]
            CurrentLoop1RawEnum = 3,
            
            /// <summary>
            /// Enum CurrentLoop1MappedEnum for currentLoop1Mapped
            /// </summary>
            [EnumMember(Value = "currentLoop1Mapped")]
            CurrentLoop1MappedEnum = 4,
            
            /// <summary>
            /// Enum CurrentLoop2RawEnum for currentLoop2Raw
            /// </summary>
            [EnumMember(Value = "currentLoop2Raw")]
            CurrentLoop2RawEnum = 5,
            
            /// <summary>
            /// Enum CurrentLoop2MappedEnum for currentLoop2Mapped
            /// </summary>
            [EnumMember(Value = "currentLoop2Mapped")]
            CurrentLoop2MappedEnum = 6,
            
            /// <summary>
            /// Enum PmPowerTotalEnum for pmPowerTotal
            /// </summary>
            [EnumMember(Value = "pmPowerTotal")]
            PmPowerTotalEnum = 7,
            
            /// <summary>
            /// Enum PmPhase1PowerEnum for pmPhase1Power
            /// </summary>
            [EnumMember(Value = "pmPhase1Power")]
            PmPhase1PowerEnum = 8,
            
            /// <summary>
            /// Enum PmPhase2PowerEnum for pmPhase2Power
            /// </summary>
            [EnumMember(Value = "pmPhase2Power")]
            PmPhase2PowerEnum = 9,
            
            /// <summary>
            /// Enum PmPhase3PowerEnum for pmPhase3Power
            /// </summary>
            [EnumMember(Value = "pmPhase3Power")]
            PmPhase3PowerEnum = 10,
            
            /// <summary>
            /// Enum PmPhase1PowerFactorEnum for pmPhase1PowerFactor
            /// </summary>
            [EnumMember(Value = "pmPhase1PowerFactor")]
            PmPhase1PowerFactorEnum = 11,
            
            /// <summary>
            /// Enum PmPhase2PowerFactorEnum for pmPhase2PowerFactor
            /// </summary>
            [EnumMember(Value = "pmPhase2PowerFactor")]
            PmPhase2PowerFactorEnum = 12,
            
            /// <summary>
            /// Enum PmPhase3PowerFactorEnum for pmPhase3PowerFactor
            /// </summary>
            [EnumMember(Value = "pmPhase3PowerFactor")]
            PmPhase3PowerFactorEnum = 13
        }

        /// <summary>
        /// Field to query.
        /// </summary>
        /// <value>Field to query.</value>
        [Required]
        [DataMember(Name="field")]
        public FieldEnum? Field { get; set; }

        /// <summary>
        /// Sensor ID to query.
        /// </summary>
        /// <value>Sensor ID to query.</value>
        [Required]
        [DataMember(Name="widgetId")]
        public long? WidgetId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SensorshistorySeries {\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  WidgetId: ").Append(WidgetId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SensorshistorySeries)obj);
        }

        /// <summary>
        /// Returns true if SensorshistorySeries instances are equal
        /// </summary>
        /// <param name="other">Instance of SensorshistorySeries to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SensorshistorySeries other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Field == other.Field ||
                    Field != null &&
                    Field.Equals(other.Field)
                ) && 
                (
                    WidgetId == other.WidgetId ||
                    WidgetId != null &&
                    WidgetId.Equals(other.WidgetId)
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
                    if (Field != null)
                    hashCode = hashCode * 59 + Field.GetHashCode();
                    if (WidgetId != null)
                    hashCode = hashCode * 59 + WidgetId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SensorshistorySeries left, SensorshistorySeries right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SensorshistorySeries left, SensorshistorySeries right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
