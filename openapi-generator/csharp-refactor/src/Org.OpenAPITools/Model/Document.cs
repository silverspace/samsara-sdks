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
    /// Document
    /// </summary>
    [DataContract]
    public partial class Document :  IEquatable<Document>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Document" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Document() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Document" /> class.
        /// </summary>
        /// <param name="dispatchJobId">ID of the Samsara dispatch job for which the document is submitted.</param>
        /// <param name="notes">Notes submitted with this document..</param>
        /// <param name="documentType">Descriptive name of this type of document. (required).</param>
        /// <param name="driverCreatedAtMs">The time in Unix epoch milliseconds that the document is created. (required).</param>
        /// <param name="driverId">ID of the driver for whom the document is submitted (required).</param>
        /// <param name="fields">The fields associated with this document. (required).</param>
        /// <param name="vehicleId">VehicleID of the driver at document creation..</param>
        public Document(long dispatchJobId = default(long), string notes = default(string), string documentType = default(string), long driverCreatedAtMs = default(long), long driverId = default(long), List<DocumentField> fields = default(List<DocumentField>), long vehicleId = default(long))
        {
            // to ensure "documentType" is required (not null)
            if (documentType == null)
            {
                throw new InvalidDataException("documentType is a required property for Document and cannot be null");
            }
            else
            {
                this.DocumentType = documentType;
            }

            // to ensure "driverCreatedAtMs" is required (not null)
            if (driverCreatedAtMs == null)
            {
                throw new InvalidDataException("driverCreatedAtMs is a required property for Document and cannot be null");
            }
            else
            {
                this.DriverCreatedAtMs = driverCreatedAtMs;
            }

            // to ensure "driverId" is required (not null)
            if (driverId == null)
            {
                throw new InvalidDataException("driverId is a required property for Document and cannot be null");
            }
            else
            {
                this.DriverId = driverId;
            }

            // to ensure "fields" is required (not null)
            if (fields == null)
            {
                throw new InvalidDataException("fields is a required property for Document and cannot be null");
            }
            else
            {
                this.Fields = fields;
            }

            this.DispatchJobId = dispatchJobId;
            this.Notes = notes;
            this.VehicleId = vehicleId;
        }
        
        /// <summary>
        /// ID of the Samsara dispatch job for which the document is submitted
        /// </summary>
        /// <value>ID of the Samsara dispatch job for which the document is submitted</value>
        [DataMember(Name="dispatchJobId", EmitDefaultValue=false)]
        public long DispatchJobId { get; set; }

        /// <summary>
        /// Notes submitted with this document.
        /// </summary>
        /// <value>Notes submitted with this document.</value>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public string Notes { get; set; }

        /// <summary>
        /// Descriptive name of this type of document.
        /// </summary>
        /// <value>Descriptive name of this type of document.</value>
        [DataMember(Name="documentType", EmitDefaultValue=false)]
        public string DocumentType { get; set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the document is created.
        /// </summary>
        /// <value>The time in Unix epoch milliseconds that the document is created.</value>
        [DataMember(Name="driverCreatedAtMs", EmitDefaultValue=false)]
        public long DriverCreatedAtMs { get; set; }

        /// <summary>
        /// ID of the driver for whom the document is submitted
        /// </summary>
        /// <value>ID of the driver for whom the document is submitted</value>
        [DataMember(Name="driverId", EmitDefaultValue=false)]
        public long DriverId { get; set; }

        /// <summary>
        /// The fields associated with this document.
        /// </summary>
        /// <value>The fields associated with this document.</value>
        [DataMember(Name="fields", EmitDefaultValue=false)]
        public List<DocumentField> Fields { get; set; }

        /// <summary>
        /// VehicleID of the driver at document creation.
        /// </summary>
        /// <value>VehicleID of the driver at document creation.</value>
        [DataMember(Name="vehicleId", EmitDefaultValue=false)]
        public long VehicleId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Document {\n");
            sb.Append("  DispatchJobId: ").Append(DispatchJobId).Append("\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
            sb.Append("  DocumentType: ").Append(DocumentType).Append("\n");
            sb.Append("  DriverCreatedAtMs: ").Append(DriverCreatedAtMs).Append("\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
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
            return this.Equals(input as Document);
        }

        /// <summary>
        /// Returns true if Document instances are equal
        /// </summary>
        /// <param name="input">Instance of Document to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Document input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DispatchJobId == input.DispatchJobId ||
                    (this.DispatchJobId != null &&
                    this.DispatchJobId.Equals(input.DispatchJobId))
                ) && 
                (
                    this.Notes == input.Notes ||
                    (this.Notes != null &&
                    this.Notes.Equals(input.Notes))
                ) && 
                (
                    this.DocumentType == input.DocumentType ||
                    (this.DocumentType != null &&
                    this.DocumentType.Equals(input.DocumentType))
                ) && 
                (
                    this.DriverCreatedAtMs == input.DriverCreatedAtMs ||
                    (this.DriverCreatedAtMs != null &&
                    this.DriverCreatedAtMs.Equals(input.DriverCreatedAtMs))
                ) && 
                (
                    this.DriverId == input.DriverId ||
                    (this.DriverId != null &&
                    this.DriverId.Equals(input.DriverId))
                ) && 
                (
                    this.Fields == input.Fields ||
                    this.Fields != null &&
                    this.Fields.SequenceEqual(input.Fields)
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
                if (this.DispatchJobId != null)
                    hashCode = hashCode * 59 + this.DispatchJobId.GetHashCode();
                if (this.Notes != null)
                    hashCode = hashCode * 59 + this.Notes.GetHashCode();
                if (this.DocumentType != null)
                    hashCode = hashCode * 59 + this.DocumentType.GetHashCode();
                if (this.DriverCreatedAtMs != null)
                    hashCode = hashCode * 59 + this.DriverCreatedAtMs.GetHashCode();
                if (this.DriverId != null)
                    hashCode = hashCode * 59 + this.DriverId.GetHashCode();
                if (this.Fields != null)
                    hashCode = hashCode * 59 + this.Fields.GetHashCode();
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
