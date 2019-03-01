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
    /// 
    /// </summary>
    [DataContract]
    public partial class TagCreate : IEquatable<TagCreate>
    { 
        /// <summary>
        /// The assets that belong to this tag.
        /// </summary>
        /// <value>The assets that belong to this tag.</value>
        [DataMember(Name="assets")]
        public List<TaggedAssetBase> Assets { get; set; }

        /// <summary>
        /// The drivers that belong to this tag.
        /// </summary>
        /// <value>The drivers that belong to this tag.</value>
        [DataMember(Name="drivers")]
        public List<TaggedDriverBase> Drivers { get; set; }

        /// <summary>
        /// The machines that belong to this tag.
        /// </summary>
        /// <value>The machines that belong to this tag.</value>
        [DataMember(Name="machines")]
        public List<TaggedMachineBase> Machines { get; set; }

        /// <summary>
        /// Name of this tag.
        /// </summary>
        /// <value>Name of this tag.</value>
        [Required]
        [DataMember(Name="name")]
        public string Name { get; set; }

        /// <summary>
        /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
        /// </summary>
        /// <value>If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.</value>
        [DataMember(Name="parentTagId")]
        public long? ParentTagId { get; set; }

        /// <summary>
        /// The sensors that belong to this tag.
        /// </summary>
        /// <value>The sensors that belong to this tag.</value>
        [DataMember(Name="sensors")]
        public List<TaggedSensorBase> Sensors { get; set; }

        /// <summary>
        /// The vehicles that belong to this tag.
        /// </summary>
        /// <value>The vehicles that belong to this tag.</value>
        [DataMember(Name="vehicles")]
        public List<TaggedVehicleBase> Vehicles { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TagCreate {\n");
            sb.Append("  Assets: ").Append(Assets).Append("\n");
            sb.Append("  Drivers: ").Append(Drivers).Append("\n");
            sb.Append("  Machines: ").Append(Machines).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ParentTagId: ").Append(ParentTagId).Append("\n");
            sb.Append("  Sensors: ").Append(Sensors).Append("\n");
            sb.Append("  Vehicles: ").Append(Vehicles).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TagCreate)obj);
        }

        /// <summary>
        /// Returns true if TagCreate instances are equal
        /// </summary>
        /// <param name="other">Instance of TagCreate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TagCreate other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Assets == other.Assets ||
                    Assets != null &&
                    Assets.SequenceEqual(other.Assets)
                ) && 
                (
                    Drivers == other.Drivers ||
                    Drivers != null &&
                    Drivers.SequenceEqual(other.Drivers)
                ) && 
                (
                    Machines == other.Machines ||
                    Machines != null &&
                    Machines.SequenceEqual(other.Machines)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    ParentTagId == other.ParentTagId ||
                    ParentTagId != null &&
                    ParentTagId.Equals(other.ParentTagId)
                ) && 
                (
                    Sensors == other.Sensors ||
                    Sensors != null &&
                    Sensors.SequenceEqual(other.Sensors)
                ) && 
                (
                    Vehicles == other.Vehicles ||
                    Vehicles != null &&
                    Vehicles.SequenceEqual(other.Vehicles)
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
                    if (Assets != null)
                    hashCode = hashCode * 59 + Assets.GetHashCode();
                    if (Drivers != null)
                    hashCode = hashCode * 59 + Drivers.GetHashCode();
                    if (Machines != null)
                    hashCode = hashCode * 59 + Machines.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (ParentTagId != null)
                    hashCode = hashCode * 59 + ParentTagId.GetHashCode();
                    if (Sensors != null)
                    hashCode = hashCode * 59 + Sensors.GetHashCode();
                    if (Vehicles != null)
                    hashCode = hashCode * 59 + Vehicles.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TagCreate left, TagCreate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TagCreate left, TagCreate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
