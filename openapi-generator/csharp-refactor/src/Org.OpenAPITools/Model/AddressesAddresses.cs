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
    /// AddressesAddresses
    /// </summary>
    [DataContract]
    public partial class AddressesAddresses :  IEquatable<AddressesAddresses>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AddressesAddresses" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AddressesAddresses() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AddressesAddresses" /> class.
        /// </summary>
        /// <param name="notes">Notes associated with an address..</param>
        /// <param name="formattedAddress">The full address associated with this address/geofence, as it might be recognized by maps.google.com (required).</param>
        /// <param name="geofence">geofence (required).</param>
        /// <param name="tagIds">A list of tag IDs..</param>
        /// <param name="name">The name of this address/geofence (required).</param>
        /// <param name="contactIds">A list of IDs for contact book entries..</param>
        public AddressesAddresses(string notes = default(string), string formattedAddress = default(string), AddressGeofence geofence = default(AddressGeofence), List<long> tagIds = default(List<long>), string name = default(string), List<long> contactIds = default(List<long>))
        {
            // to ensure "formattedAddress" is required (not null)
            if (formattedAddress == null)
            {
                throw new InvalidDataException("formattedAddress is a required property for AddressesAddresses and cannot be null");
            }
            else
            {
                this.FormattedAddress = formattedAddress;
            }

            // to ensure "geofence" is required (not null)
            if (geofence == null)
            {
                throw new InvalidDataException("geofence is a required property for AddressesAddresses and cannot be null");
            }
            else
            {
                this.Geofence = geofence;
            }

            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for AddressesAddresses and cannot be null");
            }
            else
            {
                this.Name = name;
            }

            this.Notes = notes;
            this.TagIds = tagIds;
            this.ContactIds = contactIds;
        }
        
        /// <summary>
        /// Notes associated with an address.
        /// </summary>
        /// <value>Notes associated with an address.</value>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public string Notes { get; set; }

        /// <summary>
        /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
        /// </summary>
        /// <value>The full address associated with this address/geofence, as it might be recognized by maps.google.com</value>
        [DataMember(Name="formattedAddress", EmitDefaultValue=false)]
        public string FormattedAddress { get; set; }

        /// <summary>
        /// Gets or Sets Geofence
        /// </summary>
        [DataMember(Name="geofence", EmitDefaultValue=false)]
        public AddressGeofence Geofence { get; set; }

        /// <summary>
        /// A list of tag IDs.
        /// </summary>
        /// <value>A list of tag IDs.</value>
        [DataMember(Name="tagIds", EmitDefaultValue=false)]
        public List<long> TagIds { get; set; }

        /// <summary>
        /// The name of this address/geofence
        /// </summary>
        /// <value>The name of this address/geofence</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// A list of IDs for contact book entries.
        /// </summary>
        /// <value>A list of IDs for contact book entries.</value>
        [DataMember(Name="contactIds", EmitDefaultValue=false)]
        public List<long> ContactIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AddressesAddresses {\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
            sb.Append("  FormattedAddress: ").Append(FormattedAddress).Append("\n");
            sb.Append("  Geofence: ").Append(Geofence).Append("\n");
            sb.Append("  TagIds: ").Append(TagIds).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ContactIds: ").Append(ContactIds).Append("\n");
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
            return this.Equals(input as AddressesAddresses);
        }

        /// <summary>
        /// Returns true if AddressesAddresses instances are equal
        /// </summary>
        /// <param name="input">Instance of AddressesAddresses to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AddressesAddresses input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Notes == input.Notes ||
                    (this.Notes != null &&
                    this.Notes.Equals(input.Notes))
                ) && 
                (
                    this.FormattedAddress == input.FormattedAddress ||
                    (this.FormattedAddress != null &&
                    this.FormattedAddress.Equals(input.FormattedAddress))
                ) && 
                (
                    this.Geofence == input.Geofence ||
                    (this.Geofence != null &&
                    this.Geofence.Equals(input.Geofence))
                ) && 
                (
                    this.TagIds == input.TagIds ||
                    this.TagIds != null &&
                    this.TagIds.SequenceEqual(input.TagIds)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ContactIds == input.ContactIds ||
                    this.ContactIds != null &&
                    this.ContactIds.SequenceEqual(input.ContactIds)
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
                if (this.Notes != null)
                    hashCode = hashCode * 59 + this.Notes.GetHashCode();
                if (this.FormattedAddress != null)
                    hashCode = hashCode * 59 + this.FormattedAddress.GetHashCode();
                if (this.Geofence != null)
                    hashCode = hashCode * 59 + this.Geofence.GetHashCode();
                if (this.TagIds != null)
                    hashCode = hashCode * 59 + this.TagIds.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ContactIds != null)
                    hashCode = hashCode * 59 + this.ContactIds.GetHashCode();
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
