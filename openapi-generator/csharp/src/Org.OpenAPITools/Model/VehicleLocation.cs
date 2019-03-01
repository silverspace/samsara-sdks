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
    /// Contains the location, in latitude and longitude, of a vehicle.
    /// </summary>
    [DataContract]
    public partial class VehicleLocation :  IEquatable<VehicleLocation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleLocation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VehicleLocation() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleLocation" /> class.
        /// </summary>
        /// <param name="heading">Heading in degrees..</param>
        /// <param name="id">ID of the vehicle. (required).</param>
        /// <param name="latitude">Latitude in decimal degrees..</param>
        /// <param name="location">Text representation of nearest identifiable location to (latitude, longitude) coordinates..</param>
        /// <param name="longitude">Longitude in decimal degrees..</param>
        /// <param name="name">Name of the vehicle..</param>
        /// <param name="odometerMeters">The number of meters reported by the odometer..</param>
        /// <param name="onTrip">Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint..</param>
        /// <param name="speed">Speed in miles per hour..</param>
        /// <param name="time">The time the reported location was logged, reported as a UNIX timestamp in milliseconds..</param>
        /// <param name="vin">Vehicle Identification Number (VIN) of the vehicle..</param>
        public VehicleLocation(double? heading = default(double?), long? id = default(long?), double? latitude = default(double?), string location = default(string), double? longitude = default(double?), string name = default(string), long? odometerMeters = default(long?), bool? onTrip = default(bool?), double? speed = default(double?), int? time = default(int?), string vin = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for VehicleLocation and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            this.Heading = heading;
            this.Latitude = latitude;
            this.Location = location;
            this.Longitude = longitude;
            this.Name = name;
            this.OdometerMeters = odometerMeters;
            this.OnTrip = onTrip;
            this.Speed = speed;
            this.Time = time;
            this.Vin = vin;
        }
        
        /// <summary>
        /// Heading in degrees.
        /// </summary>
        /// <value>Heading in degrees.</value>
        [DataMember(Name="heading", EmitDefaultValue=false)]
        public double? Heading { get; set; }

        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        /// <value>ID of the vehicle.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// Latitude in decimal degrees.
        /// </summary>
        /// <value>Latitude in decimal degrees.</value>
        [DataMember(Name="latitude", EmitDefaultValue=false)]
        public double? Latitude { get; set; }

        /// <summary>
        /// Text representation of nearest identifiable location to (latitude, longitude) coordinates.
        /// </summary>
        /// <value>Text representation of nearest identifiable location to (latitude, longitude) coordinates.</value>
        [DataMember(Name="location", EmitDefaultValue=false)]
        public string Location { get; set; }

        /// <summary>
        /// Longitude in decimal degrees.
        /// </summary>
        /// <value>Longitude in decimal degrees.</value>
        [DataMember(Name="longitude", EmitDefaultValue=false)]
        public double? Longitude { get; set; }

        /// <summary>
        /// Name of the vehicle.
        /// </summary>
        /// <value>Name of the vehicle.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The number of meters reported by the odometer.
        /// </summary>
        /// <value>The number of meters reported by the odometer.</value>
        [DataMember(Name="odometerMeters", EmitDefaultValue=false)]
        public long? OdometerMeters { get; set; }

        /// <summary>
        /// Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
        /// </summary>
        /// <value>Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.</value>
        [DataMember(Name="onTrip", EmitDefaultValue=false)]
        public bool? OnTrip { get; set; }

        /// <summary>
        /// Speed in miles per hour.
        /// </summary>
        /// <value>Speed in miles per hour.</value>
        [DataMember(Name="speed", EmitDefaultValue=false)]
        public double? Speed { get; set; }

        /// <summary>
        /// The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
        /// </summary>
        /// <value>The time the reported location was logged, reported as a UNIX timestamp in milliseconds.</value>
        [DataMember(Name="time", EmitDefaultValue=false)]
        public int? Time { get; set; }

        /// <summary>
        /// Vehicle Identification Number (VIN) of the vehicle.
        /// </summary>
        /// <value>Vehicle Identification Number (VIN) of the vehicle.</value>
        [DataMember(Name="vin", EmitDefaultValue=false)]
        public string Vin { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VehicleLocation {\n");
            sb.Append("  Heading: ").Append(Heading).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  OdometerMeters: ").Append(OdometerMeters).Append("\n");
            sb.Append("  OnTrip: ").Append(OnTrip).Append("\n");
            sb.Append("  Speed: ").Append(Speed).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Vin: ").Append(Vin).Append("\n");
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
            return this.Equals(input as VehicleLocation);
        }

        /// <summary>
        /// Returns true if VehicleLocation instances are equal
        /// </summary>
        /// <param name="input">Instance of VehicleLocation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VehicleLocation input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Heading == input.Heading ||
                    (this.Heading != null &&
                    this.Heading.Equals(input.Heading))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Latitude == input.Latitude ||
                    (this.Latitude != null &&
                    this.Latitude.Equals(input.Latitude))
                ) && 
                (
                    this.Location == input.Location ||
                    (this.Location != null &&
                    this.Location.Equals(input.Location))
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    (this.Longitude != null &&
                    this.Longitude.Equals(input.Longitude))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.OdometerMeters == input.OdometerMeters ||
                    (this.OdometerMeters != null &&
                    this.OdometerMeters.Equals(input.OdometerMeters))
                ) && 
                (
                    this.OnTrip == input.OnTrip ||
                    (this.OnTrip != null &&
                    this.OnTrip.Equals(input.OnTrip))
                ) && 
                (
                    this.Speed == input.Speed ||
                    (this.Speed != null &&
                    this.Speed.Equals(input.Speed))
                ) && 
                (
                    this.Time == input.Time ||
                    (this.Time != null &&
                    this.Time.Equals(input.Time))
                ) && 
                (
                    this.Vin == input.Vin ||
                    (this.Vin != null &&
                    this.Vin.Equals(input.Vin))
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
                if (this.Heading != null)
                    hashCode = hashCode * 59 + this.Heading.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Latitude != null)
                    hashCode = hashCode * 59 + this.Latitude.GetHashCode();
                if (this.Location != null)
                    hashCode = hashCode * 59 + this.Location.GetHashCode();
                if (this.Longitude != null)
                    hashCode = hashCode * 59 + this.Longitude.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.OdometerMeters != null)
                    hashCode = hashCode * 59 + this.OdometerMeters.GetHashCode();
                if (this.OnTrip != null)
                    hashCode = hashCode * 59 + this.OnTrip.GetHashCode();
                if (this.Speed != null)
                    hashCode = hashCode * 59 + this.Speed.GetHashCode();
                if (this.Time != null)
                    hashCode = hashCode * 59 + this.Time.GetHashCode();
                if (this.Vin != null)
                    hashCode = hashCode * 59 + this.Vin.GetHashCode();
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
