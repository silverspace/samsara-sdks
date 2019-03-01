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
    /// User
    /// </summary>
    [DataContract]
    public partial class User :  IEquatable<User>, IValidatableObject
    {
        /// <summary>
        /// The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
        /// </summary>
        /// <value>The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AuthTypeEnum
        {
            /// <summary>
            /// Enum Default for value: default
            /// </summary>
            [EnumMember(Value = "default")]
            Default = 1,

            /// <summary>
            /// Enum Saml for value: saml
            /// </summary>
            [EnumMember(Value = "saml")]
            Saml = 2

        }

        /// <summary>
        /// The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
        /// </summary>
        /// <value>The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.</value>
        [DataMember(Name="authType", EmitDefaultValue=false)]
        public AuthTypeEnum AuthType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="User" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected User() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="User" /> class.
        /// </summary>
        /// <param name="authType">The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. (required).</param>
        /// <param name="email">The email address of this user. (required).</param>
        /// <param name="name">The first and last name of the user..</param>
        /// <param name="organizationRoleId">The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags..</param>
        /// <param name="id">The ID of the User record..</param>
        /// <param name="organizationRole">The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags..</param>
        /// <param name="tagRoles">The specific tags this user has access to. This will be blank for users that have full access to the organization..</param>
        public User(AuthTypeEnum authType = default(AuthTypeEnum), string email = default(string), string name = default(string), string organizationRoleId = default(string), long? id = default(long?), string organizationRole = default(string), List<UserTagRole> tagRoles = default(List<UserTagRole>))
        {
            // to ensure "authType" is required (not null)
            if (authType == null)
            {
                throw new InvalidDataException("authType is a required property for User and cannot be null");
            }
            else
            {
                this.AuthType = authType;
            }
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new InvalidDataException("email is a required property for User and cannot be null");
            }
            else
            {
                this.Email = email;
            }
            this.Name = name;
            this.OrganizationRoleId = organizationRoleId;
            this.Id = id;
            this.OrganizationRole = organizationRole;
            this.TagRoles = tagRoles;
        }
        

        /// <summary>
        /// The email address of this user.
        /// </summary>
        /// <value>The email address of this user.</value>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// The first and last name of the user.
        /// </summary>
        /// <value>The first and last name of the user.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
        /// </summary>
        /// <value>The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.</value>
        [DataMember(Name="organizationRoleId", EmitDefaultValue=false)]
        public string OrganizationRoleId { get; set; }

        /// <summary>
        /// The ID of the User record.
        /// </summary>
        /// <value>The ID of the User record.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
        /// </summary>
        /// <value>The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.</value>
        [DataMember(Name="organizationRole", EmitDefaultValue=false)]
        public string OrganizationRole { get; set; }

        /// <summary>
        /// The specific tags this user has access to. This will be blank for users that have full access to the organization.
        /// </summary>
        /// <value>The specific tags this user has access to. This will be blank for users that have full access to the organization.</value>
        [DataMember(Name="tagRoles", EmitDefaultValue=false)]
        public List<UserTagRole> TagRoles { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class User {\n");
            sb.Append("  AuthType: ").Append(AuthType).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  OrganizationRoleId: ").Append(OrganizationRoleId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  OrganizationRole: ").Append(OrganizationRole).Append("\n");
            sb.Append("  TagRoles: ").Append(TagRoles).Append("\n");
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
            return this.Equals(input as User);
        }

        /// <summary>
        /// Returns true if User instances are equal
        /// </summary>
        /// <param name="input">Instance of User to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(User input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AuthType == input.AuthType ||
                    (this.AuthType != null &&
                    this.AuthType.Equals(input.AuthType))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.OrganizationRoleId == input.OrganizationRoleId ||
                    (this.OrganizationRoleId != null &&
                    this.OrganizationRoleId.Equals(input.OrganizationRoleId))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.OrganizationRole == input.OrganizationRole ||
                    (this.OrganizationRole != null &&
                    this.OrganizationRole.Equals(input.OrganizationRole))
                ) && 
                (
                    this.TagRoles == input.TagRoles ||
                    this.TagRoles != null &&
                    this.TagRoles.SequenceEqual(input.TagRoles)
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
                if (this.AuthType != null)
                    hashCode = hashCode * 59 + this.AuthType.GetHashCode();
                if (this.Email != null)
                    hashCode = hashCode * 59 + this.Email.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.OrganizationRoleId != null)
                    hashCode = hashCode * 59 + this.OrganizationRoleId.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.OrganizationRole != null)
                    hashCode = hashCode * 59 + this.OrganizationRole.GetHashCode();
                if (this.TagRoles != null)
                    hashCode = hashCode * 59 + this.TagRoles.GetHashCode();
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
