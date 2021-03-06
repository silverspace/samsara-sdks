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
    /// TripResponseTrips
    /// </summary>
    [DataContract]
    public partial class TripResponseTrips :  IEquatable<TripResponseTrips>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TripResponseTrips" /> class.
        /// </summary>
        /// <param name="endOdometer">Odometer reading at the end of the trip..</param>
        /// <param name="distanceMeters">Length of the trip in meters..</param>
        /// <param name="endMs">End of the trip in UNIX milliseconds..</param>
        /// <param name="startMs">Beginning of the trip in UNIX milliseconds..</param>
        /// <param name="fuelConsumedMl">Amount in milliliters of fuel consumed on this trip..</param>
        /// <param name="startAddress">Text representation of nearest identifiable location to the start (latitude, longitude) coordinates..</param>
        /// <param name="startCoordinates">startCoordinates.</param>
        /// <param name="endCoordinates">endCoordinates.</param>
        /// <param name="startOdometer">Odometer reading at the beginning of the trip..</param>
        /// <param name="driverId">ID of the driver..</param>
        /// <param name="startLocation">Geocoded street address of start (latitude, longitude) coordinates..</param>
        /// <param name="tollMeters">Length in meters trip spent on toll roads..</param>
        /// <param name="endAddress">Text representation of nearest identifiable location to the end (latitude, longitude) coordinates..</param>
        /// <param name="endLocation">Geocoded street address of start (latitude, longitude) coordinates..</param>
        public TripResponseTrips(int? endOdometer = default(int?), int? distanceMeters = default(int?), int? endMs = default(int?), int? startMs = default(int?), int? fuelConsumedMl = default(int?), string startAddress = default(string), TripResponseStartCoordinates startCoordinates = default(TripResponseStartCoordinates), TripResponseEndCoordinates endCoordinates = default(TripResponseEndCoordinates), int? startOdometer = default(int?), int? driverId = default(int?), string startLocation = default(string), int? tollMeters = default(int?), string endAddress = default(string), string endLocation = default(string))
        {
            this.EndOdometer = endOdometer;
            this.DistanceMeters = distanceMeters;
            this.EndMs = endMs;
            this.StartMs = startMs;
            this.FuelConsumedMl = fuelConsumedMl;
            this.StartAddress = startAddress;
            this.StartCoordinates = startCoordinates;
            this.EndCoordinates = endCoordinates;
            this.StartOdometer = startOdometer;
            this.DriverId = driverId;
            this.StartLocation = startLocation;
            this.TollMeters = tollMeters;
            this.EndAddress = endAddress;
            this.EndLocation = endLocation;
        }
        
        /// <summary>
        /// Odometer reading at the end of the trip.
        /// </summary>
        /// <value>Odometer reading at the end of the trip.</value>
        [DataMember(Name="endOdometer", EmitDefaultValue=false)]
        public int? EndOdometer { get; set; }

        /// <summary>
        /// Length of the trip in meters.
        /// </summary>
        /// <value>Length of the trip in meters.</value>
        [DataMember(Name="distanceMeters", EmitDefaultValue=false)]
        public int? DistanceMeters { get; set; }

        /// <summary>
        /// End of the trip in UNIX milliseconds.
        /// </summary>
        /// <value>End of the trip in UNIX milliseconds.</value>
        [DataMember(Name="endMs", EmitDefaultValue=false)]
        public int? EndMs { get; set; }

        /// <summary>
        /// Beginning of the trip in UNIX milliseconds.
        /// </summary>
        /// <value>Beginning of the trip in UNIX milliseconds.</value>
        [DataMember(Name="startMs", EmitDefaultValue=false)]
        public int? StartMs { get; set; }

        /// <summary>
        /// Amount in milliliters of fuel consumed on this trip.
        /// </summary>
        /// <value>Amount in milliliters of fuel consumed on this trip.</value>
        [DataMember(Name="fuelConsumedMl", EmitDefaultValue=false)]
        public int? FuelConsumedMl { get; set; }

        /// <summary>
        /// Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
        /// </summary>
        /// <value>Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.</value>
        [DataMember(Name="startAddress", EmitDefaultValue=false)]
        public string StartAddress { get; set; }

        /// <summary>
        /// Gets or Sets StartCoordinates
        /// </summary>
        [DataMember(Name="startCoordinates", EmitDefaultValue=false)]
        public TripResponseStartCoordinates StartCoordinates { get; set; }

        /// <summary>
        /// Gets or Sets EndCoordinates
        /// </summary>
        [DataMember(Name="endCoordinates", EmitDefaultValue=false)]
        public TripResponseEndCoordinates EndCoordinates { get; set; }

        /// <summary>
        /// Odometer reading at the beginning of the trip.
        /// </summary>
        /// <value>Odometer reading at the beginning of the trip.</value>
        [DataMember(Name="startOdometer", EmitDefaultValue=false)]
        public int? StartOdometer { get; set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        /// <value>ID of the driver.</value>
        [DataMember(Name="driverId", EmitDefaultValue=false)]
        public int? DriverId { get; set; }

        /// <summary>
        /// Geocoded street address of start (latitude, longitude) coordinates.
        /// </summary>
        /// <value>Geocoded street address of start (latitude, longitude) coordinates.</value>
        [DataMember(Name="startLocation", EmitDefaultValue=false)]
        public string StartLocation { get; set; }

        /// <summary>
        /// Length in meters trip spent on toll roads.
        /// </summary>
        /// <value>Length in meters trip spent on toll roads.</value>
        [DataMember(Name="tollMeters", EmitDefaultValue=false)]
        public int? TollMeters { get; set; }

        /// <summary>
        /// Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
        /// </summary>
        /// <value>Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.</value>
        [DataMember(Name="endAddress", EmitDefaultValue=false)]
        public string EndAddress { get; set; }

        /// <summary>
        /// Geocoded street address of start (latitude, longitude) coordinates.
        /// </summary>
        /// <value>Geocoded street address of start (latitude, longitude) coordinates.</value>
        [DataMember(Name="endLocation", EmitDefaultValue=false)]
        public string EndLocation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TripResponseTrips {\n");
            sb.Append("  EndOdometer: ").Append(EndOdometer).Append("\n");
            sb.Append("  DistanceMeters: ").Append(DistanceMeters).Append("\n");
            sb.Append("  EndMs: ").Append(EndMs).Append("\n");
            sb.Append("  StartMs: ").Append(StartMs).Append("\n");
            sb.Append("  FuelConsumedMl: ").Append(FuelConsumedMl).Append("\n");
            sb.Append("  StartAddress: ").Append(StartAddress).Append("\n");
            sb.Append("  StartCoordinates: ").Append(StartCoordinates).Append("\n");
            sb.Append("  EndCoordinates: ").Append(EndCoordinates).Append("\n");
            sb.Append("  StartOdometer: ").Append(StartOdometer).Append("\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  StartLocation: ").Append(StartLocation).Append("\n");
            sb.Append("  TollMeters: ").Append(TollMeters).Append("\n");
            sb.Append("  EndAddress: ").Append(EndAddress).Append("\n");
            sb.Append("  EndLocation: ").Append(EndLocation).Append("\n");
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
            return this.Equals(input as TripResponseTrips);
        }

        /// <summary>
        /// Returns true if TripResponseTrips instances are equal
        /// </summary>
        /// <param name="input">Instance of TripResponseTrips to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TripResponseTrips input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EndOdometer == input.EndOdometer ||
                    (this.EndOdometer != null &&
                    this.EndOdometer.Equals(input.EndOdometer))
                ) && 
                (
                    this.DistanceMeters == input.DistanceMeters ||
                    (this.DistanceMeters != null &&
                    this.DistanceMeters.Equals(input.DistanceMeters))
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
                    this.FuelConsumedMl == input.FuelConsumedMl ||
                    (this.FuelConsumedMl != null &&
                    this.FuelConsumedMl.Equals(input.FuelConsumedMl))
                ) && 
                (
                    this.StartAddress == input.StartAddress ||
                    (this.StartAddress != null &&
                    this.StartAddress.Equals(input.StartAddress))
                ) && 
                (
                    this.StartCoordinates == input.StartCoordinates ||
                    (this.StartCoordinates != null &&
                    this.StartCoordinates.Equals(input.StartCoordinates))
                ) && 
                (
                    this.EndCoordinates == input.EndCoordinates ||
                    (this.EndCoordinates != null &&
                    this.EndCoordinates.Equals(input.EndCoordinates))
                ) && 
                (
                    this.StartOdometer == input.StartOdometer ||
                    (this.StartOdometer != null &&
                    this.StartOdometer.Equals(input.StartOdometer))
                ) && 
                (
                    this.DriverId == input.DriverId ||
                    (this.DriverId != null &&
                    this.DriverId.Equals(input.DriverId))
                ) && 
                (
                    this.StartLocation == input.StartLocation ||
                    (this.StartLocation != null &&
                    this.StartLocation.Equals(input.StartLocation))
                ) && 
                (
                    this.TollMeters == input.TollMeters ||
                    (this.TollMeters != null &&
                    this.TollMeters.Equals(input.TollMeters))
                ) && 
                (
                    this.EndAddress == input.EndAddress ||
                    (this.EndAddress != null &&
                    this.EndAddress.Equals(input.EndAddress))
                ) && 
                (
                    this.EndLocation == input.EndLocation ||
                    (this.EndLocation != null &&
                    this.EndLocation.Equals(input.EndLocation))
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
                if (this.EndOdometer != null)
                    hashCode = hashCode * 59 + this.EndOdometer.GetHashCode();
                if (this.DistanceMeters != null)
                    hashCode = hashCode * 59 + this.DistanceMeters.GetHashCode();
                if (this.EndMs != null)
                    hashCode = hashCode * 59 + this.EndMs.GetHashCode();
                if (this.StartMs != null)
                    hashCode = hashCode * 59 + this.StartMs.GetHashCode();
                if (this.FuelConsumedMl != null)
                    hashCode = hashCode * 59 + this.FuelConsumedMl.GetHashCode();
                if (this.StartAddress != null)
                    hashCode = hashCode * 59 + this.StartAddress.GetHashCode();
                if (this.StartCoordinates != null)
                    hashCode = hashCode * 59 + this.StartCoordinates.GetHashCode();
                if (this.EndCoordinates != null)
                    hashCode = hashCode * 59 + this.EndCoordinates.GetHashCode();
                if (this.StartOdometer != null)
                    hashCode = hashCode * 59 + this.StartOdometer.GetHashCode();
                if (this.DriverId != null)
                    hashCode = hashCode * 59 + this.DriverId.GetHashCode();
                if (this.StartLocation != null)
                    hashCode = hashCode * 59 + this.StartLocation.GetHashCode();
                if (this.TollMeters != null)
                    hashCode = hashCode * 59 + this.TollMeters.GetHashCode();
                if (this.EndAddress != null)
                    hashCode = hashCode * 59 + this.EndAddress.GetHashCode();
                if (this.EndLocation != null)
                    hashCode = hashCode * 59 + this.EndLocation.GetHashCode();
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
