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
    /// Pagination
    /// </summary>
    [DataContract]
    public partial class Pagination :  IEquatable<Pagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Pagination" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Pagination() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Pagination" /> class.
        /// </summary>
        /// <param name="endCursor">Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter. (required).</param>
        /// <param name="hasNextPage">True if there are more pages of results after this response. (required).</param>
        /// <param name="hasPrevPage">True if there are more pages of results before this response. (required).</param>
        /// <param name="startCursor">Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter. (required).</param>
        public Pagination(string endCursor = default(string), bool? hasNextPage = default(bool?), bool? hasPrevPage = default(bool?), string startCursor = default(string))
        {
            // to ensure "endCursor" is required (not null)
            if (endCursor == null)
            {
                throw new InvalidDataException("endCursor is a required property for Pagination and cannot be null");
            }
            else
            {
                this.EndCursor = endCursor;
            }
            // to ensure "hasNextPage" is required (not null)
            if (hasNextPage == null)
            {
                throw new InvalidDataException("hasNextPage is a required property for Pagination and cannot be null");
            }
            else
            {
                this.HasNextPage = hasNextPage;
            }
            // to ensure "hasPrevPage" is required (not null)
            if (hasPrevPage == null)
            {
                throw new InvalidDataException("hasPrevPage is a required property for Pagination and cannot be null");
            }
            else
            {
                this.HasPrevPage = hasPrevPage;
            }
            // to ensure "startCursor" is required (not null)
            if (startCursor == null)
            {
                throw new InvalidDataException("startCursor is a required property for Pagination and cannot be null");
            }
            else
            {
                this.StartCursor = startCursor;
            }
        }
        
        /// <summary>
        /// Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.
        /// </summary>
        /// <value>Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.</value>
        [DataMember(Name="endCursor", EmitDefaultValue=false)]
        public string EndCursor { get; set; }

        /// <summary>
        /// True if there are more pages of results after this response.
        /// </summary>
        /// <value>True if there are more pages of results after this response.</value>
        [DataMember(Name="hasNextPage", EmitDefaultValue=false)]
        public bool? HasNextPage { get; set; }

        /// <summary>
        /// True if there are more pages of results before this response.
        /// </summary>
        /// <value>True if there are more pages of results before this response.</value>
        [DataMember(Name="hasPrevPage", EmitDefaultValue=false)]
        public bool? HasPrevPage { get; set; }

        /// <summary>
        /// Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.
        /// </summary>
        /// <value>Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.</value>
        [DataMember(Name="startCursor", EmitDefaultValue=false)]
        public string StartCursor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Pagination {\n");
            sb.Append("  EndCursor: ").Append(EndCursor).Append("\n");
            sb.Append("  HasNextPage: ").Append(HasNextPage).Append("\n");
            sb.Append("  HasPrevPage: ").Append(HasPrevPage).Append("\n");
            sb.Append("  StartCursor: ").Append(StartCursor).Append("\n");
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
            return this.Equals(input as Pagination);
        }

        /// <summary>
        /// Returns true if Pagination instances are equal
        /// </summary>
        /// <param name="input">Instance of Pagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Pagination input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EndCursor == input.EndCursor ||
                    (this.EndCursor != null &&
                    this.EndCursor.Equals(input.EndCursor))
                ) && 
                (
                    this.HasNextPage == input.HasNextPage ||
                    (this.HasNextPage != null &&
                    this.HasNextPage.Equals(input.HasNextPage))
                ) && 
                (
                    this.HasPrevPage == input.HasPrevPage ||
                    (this.HasPrevPage != null &&
                    this.HasPrevPage.Equals(input.HasPrevPage))
                ) && 
                (
                    this.StartCursor == input.StartCursor ||
                    (this.StartCursor != null &&
                    this.StartCursor.Equals(input.StartCursor))
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
                if (this.EndCursor != null)
                    hashCode = hashCode * 59 + this.EndCursor.GetHashCode();
                if (this.HasNextPage != null)
                    hashCode = hashCode * 59 + this.HasNextPage.GetHashCode();
                if (this.HasPrevPage != null)
                    hashCode = hashCode * 59 + this.HasPrevPage.GetHashCode();
                if (this.StartCursor != null)
                    hashCode = hashCode * 59 + this.StartCursor.GetHashCode();
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
