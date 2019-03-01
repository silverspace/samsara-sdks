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
    /// DvirBase
    /// </summary>
    [DataContract]
    public partial class DvirBase :  IEquatable<DvirBase>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DvirBase" /> class.
        /// </summary>
        /// <param name="authorSignature">authorSignature.</param>
        /// <param name="defectsCorrected">Signifies if the defects on the vehicle corrected after the DVIR is done..</param>
        /// <param name="defectsNeedNotBeCorrected">Signifies if the defects on this vehicle can be ignored..</param>
        /// <param name="id">The id of this DVIR record..</param>
        /// <param name="inspectionType">Inspection type of the DVIR..</param>
        /// <param name="mechanicNotes">The mechanics notes on the DVIR..</param>
        /// <param name="mechanicOrAgentSignature">mechanicOrAgentSignature.</param>
        /// <param name="nextDriverSignature">nextDriverSignature.</param>
        /// <param name="odometerMiles">The odometer reading in miles for the vehicle when the DVIR was done..</param>
        /// <param name="timeMs">Timestamp of this DVIR in UNIX milliseconds..</param>
        /// <param name="trailerDefects">Defects registered for the trailer which was part of the DVIR..</param>
        /// <param name="trailerId">The id of the trailer which was part of the DVIR..</param>
        /// <param name="trailerName">The name of the trailer which was part of the DVIR..</param>
        /// <param name="vehicle">vehicle.</param>
        /// <param name="vehicleCondition">The condition of vechile on which DVIR was done..</param>
        /// <param name="vehicleDefects">Defects registered for the vehicle which was part of the DVIR..</param>
        public DvirBase(DvirBaseAuthorSignature authorSignature = default(DvirBaseAuthorSignature), bool? defectsCorrected = default(bool?), bool? defectsNeedNotBeCorrected = default(bool?), long? id = default(long?), string inspectionType = default(string), string mechanicNotes = default(string), DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = default(DvirBaseMechanicOrAgentSignature), DvirBaseNextDriverSignature nextDriverSignature = default(DvirBaseNextDriverSignature), long? odometerMiles = default(long?), long? timeMs = default(long?), List<DvirBaseTrailerDefects> trailerDefects = default(List<DvirBaseTrailerDefects>), int? trailerId = default(int?), string trailerName = default(string), DvirBaseVehicle vehicle = default(DvirBaseVehicle), string vehicleCondition = default(string), List<DvirBaseTrailerDefects> vehicleDefects = default(List<DvirBaseTrailerDefects>))
        {
            this.AuthorSignature = authorSignature;
            this.DefectsCorrected = defectsCorrected;
            this.DefectsNeedNotBeCorrected = defectsNeedNotBeCorrected;
            this.Id = id;
            this.InspectionType = inspectionType;
            this.MechanicNotes = mechanicNotes;
            this.MechanicOrAgentSignature = mechanicOrAgentSignature;
            this.NextDriverSignature = nextDriverSignature;
            this.OdometerMiles = odometerMiles;
            this.TimeMs = timeMs;
            this.TrailerDefects = trailerDefects;
            this.TrailerId = trailerId;
            this.TrailerName = trailerName;
            this.Vehicle = vehicle;
            this.VehicleCondition = vehicleCondition;
            this.VehicleDefects = vehicleDefects;
        }
        
        /// <summary>
        /// Gets or Sets AuthorSignature
        /// </summary>
        [DataMember(Name="authorSignature", EmitDefaultValue=false)]
        public DvirBaseAuthorSignature AuthorSignature { get; set; }

        /// <summary>
        /// Signifies if the defects on the vehicle corrected after the DVIR is done.
        /// </summary>
        /// <value>Signifies if the defects on the vehicle corrected after the DVIR is done.</value>
        [DataMember(Name="defectsCorrected", EmitDefaultValue=false)]
        public bool? DefectsCorrected { get; set; }

        /// <summary>
        /// Signifies if the defects on this vehicle can be ignored.
        /// </summary>
        /// <value>Signifies if the defects on this vehicle can be ignored.</value>
        [DataMember(Name="defectsNeedNotBeCorrected", EmitDefaultValue=false)]
        public bool? DefectsNeedNotBeCorrected { get; set; }

        /// <summary>
        /// The id of this DVIR record.
        /// </summary>
        /// <value>The id of this DVIR record.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// Inspection type of the DVIR.
        /// </summary>
        /// <value>Inspection type of the DVIR.</value>
        [DataMember(Name="inspectionType", EmitDefaultValue=false)]
        public string InspectionType { get; set; }

        /// <summary>
        /// The mechanics notes on the DVIR.
        /// </summary>
        /// <value>The mechanics notes on the DVIR.</value>
        [DataMember(Name="mechanicNotes", EmitDefaultValue=false)]
        public string MechanicNotes { get; set; }

        /// <summary>
        /// Gets or Sets MechanicOrAgentSignature
        /// </summary>
        [DataMember(Name="mechanicOrAgentSignature", EmitDefaultValue=false)]
        public DvirBaseMechanicOrAgentSignature MechanicOrAgentSignature { get; set; }

        /// <summary>
        /// Gets or Sets NextDriverSignature
        /// </summary>
        [DataMember(Name="nextDriverSignature", EmitDefaultValue=false)]
        public DvirBaseNextDriverSignature NextDriverSignature { get; set; }

        /// <summary>
        /// The odometer reading in miles for the vehicle when the DVIR was done.
        /// </summary>
        /// <value>The odometer reading in miles for the vehicle when the DVIR was done.</value>
        [DataMember(Name="odometerMiles", EmitDefaultValue=false)]
        public long? OdometerMiles { get; set; }

        /// <summary>
        /// Timestamp of this DVIR in UNIX milliseconds.
        /// </summary>
        /// <value>Timestamp of this DVIR in UNIX milliseconds.</value>
        [DataMember(Name="timeMs", EmitDefaultValue=false)]
        public long? TimeMs { get; set; }

        /// <summary>
        /// Defects registered for the trailer which was part of the DVIR.
        /// </summary>
        /// <value>Defects registered for the trailer which was part of the DVIR.</value>
        [DataMember(Name="trailerDefects", EmitDefaultValue=false)]
        public List<DvirBaseTrailerDefects> TrailerDefects { get; set; }

        /// <summary>
        /// The id of the trailer which was part of the DVIR.
        /// </summary>
        /// <value>The id of the trailer which was part of the DVIR.</value>
        [DataMember(Name="trailerId", EmitDefaultValue=false)]
        public int? TrailerId { get; set; }

        /// <summary>
        /// The name of the trailer which was part of the DVIR.
        /// </summary>
        /// <value>The name of the trailer which was part of the DVIR.</value>
        [DataMember(Name="trailerName", EmitDefaultValue=false)]
        public string TrailerName { get; set; }

        /// <summary>
        /// Gets or Sets Vehicle
        /// </summary>
        [DataMember(Name="vehicle", EmitDefaultValue=false)]
        public DvirBaseVehicle Vehicle { get; set; }

        /// <summary>
        /// The condition of vechile on which DVIR was done.
        /// </summary>
        /// <value>The condition of vechile on which DVIR was done.</value>
        [DataMember(Name="vehicleCondition", EmitDefaultValue=false)]
        public string VehicleCondition { get; set; }

        /// <summary>
        /// Defects registered for the vehicle which was part of the DVIR.
        /// </summary>
        /// <value>Defects registered for the vehicle which was part of the DVIR.</value>
        [DataMember(Name="vehicleDefects", EmitDefaultValue=false)]
        public List<DvirBaseTrailerDefects> VehicleDefects { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DvirBase {\n");
            sb.Append("  AuthorSignature: ").Append(AuthorSignature).Append("\n");
            sb.Append("  DefectsCorrected: ").Append(DefectsCorrected).Append("\n");
            sb.Append("  DefectsNeedNotBeCorrected: ").Append(DefectsNeedNotBeCorrected).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  InspectionType: ").Append(InspectionType).Append("\n");
            sb.Append("  MechanicNotes: ").Append(MechanicNotes).Append("\n");
            sb.Append("  MechanicOrAgentSignature: ").Append(MechanicOrAgentSignature).Append("\n");
            sb.Append("  NextDriverSignature: ").Append(NextDriverSignature).Append("\n");
            sb.Append("  OdometerMiles: ").Append(OdometerMiles).Append("\n");
            sb.Append("  TimeMs: ").Append(TimeMs).Append("\n");
            sb.Append("  TrailerDefects: ").Append(TrailerDefects).Append("\n");
            sb.Append("  TrailerId: ").Append(TrailerId).Append("\n");
            sb.Append("  TrailerName: ").Append(TrailerName).Append("\n");
            sb.Append("  Vehicle: ").Append(Vehicle).Append("\n");
            sb.Append("  VehicleCondition: ").Append(VehicleCondition).Append("\n");
            sb.Append("  VehicleDefects: ").Append(VehicleDefects).Append("\n");
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
            return this.Equals(input as DvirBase);
        }

        /// <summary>
        /// Returns true if DvirBase instances are equal
        /// </summary>
        /// <param name="input">Instance of DvirBase to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DvirBase input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AuthorSignature == input.AuthorSignature ||
                    (this.AuthorSignature != null &&
                    this.AuthorSignature.Equals(input.AuthorSignature))
                ) && 
                (
                    this.DefectsCorrected == input.DefectsCorrected ||
                    (this.DefectsCorrected != null &&
                    this.DefectsCorrected.Equals(input.DefectsCorrected))
                ) && 
                (
                    this.DefectsNeedNotBeCorrected == input.DefectsNeedNotBeCorrected ||
                    (this.DefectsNeedNotBeCorrected != null &&
                    this.DefectsNeedNotBeCorrected.Equals(input.DefectsNeedNotBeCorrected))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.InspectionType == input.InspectionType ||
                    (this.InspectionType != null &&
                    this.InspectionType.Equals(input.InspectionType))
                ) && 
                (
                    this.MechanicNotes == input.MechanicNotes ||
                    (this.MechanicNotes != null &&
                    this.MechanicNotes.Equals(input.MechanicNotes))
                ) && 
                (
                    this.MechanicOrAgentSignature == input.MechanicOrAgentSignature ||
                    (this.MechanicOrAgentSignature != null &&
                    this.MechanicOrAgentSignature.Equals(input.MechanicOrAgentSignature))
                ) && 
                (
                    this.NextDriverSignature == input.NextDriverSignature ||
                    (this.NextDriverSignature != null &&
                    this.NextDriverSignature.Equals(input.NextDriverSignature))
                ) && 
                (
                    this.OdometerMiles == input.OdometerMiles ||
                    (this.OdometerMiles != null &&
                    this.OdometerMiles.Equals(input.OdometerMiles))
                ) && 
                (
                    this.TimeMs == input.TimeMs ||
                    (this.TimeMs != null &&
                    this.TimeMs.Equals(input.TimeMs))
                ) && 
                (
                    this.TrailerDefects == input.TrailerDefects ||
                    this.TrailerDefects != null &&
                    this.TrailerDefects.SequenceEqual(input.TrailerDefects)
                ) && 
                (
                    this.TrailerId == input.TrailerId ||
                    (this.TrailerId != null &&
                    this.TrailerId.Equals(input.TrailerId))
                ) && 
                (
                    this.TrailerName == input.TrailerName ||
                    (this.TrailerName != null &&
                    this.TrailerName.Equals(input.TrailerName))
                ) && 
                (
                    this.Vehicle == input.Vehicle ||
                    (this.Vehicle != null &&
                    this.Vehicle.Equals(input.Vehicle))
                ) && 
                (
                    this.VehicleCondition == input.VehicleCondition ||
                    (this.VehicleCondition != null &&
                    this.VehicleCondition.Equals(input.VehicleCondition))
                ) && 
                (
                    this.VehicleDefects == input.VehicleDefects ||
                    this.VehicleDefects != null &&
                    this.VehicleDefects.SequenceEqual(input.VehicleDefects)
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
                if (this.AuthorSignature != null)
                    hashCode = hashCode * 59 + this.AuthorSignature.GetHashCode();
                if (this.DefectsCorrected != null)
                    hashCode = hashCode * 59 + this.DefectsCorrected.GetHashCode();
                if (this.DefectsNeedNotBeCorrected != null)
                    hashCode = hashCode * 59 + this.DefectsNeedNotBeCorrected.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.InspectionType != null)
                    hashCode = hashCode * 59 + this.InspectionType.GetHashCode();
                if (this.MechanicNotes != null)
                    hashCode = hashCode * 59 + this.MechanicNotes.GetHashCode();
                if (this.MechanicOrAgentSignature != null)
                    hashCode = hashCode * 59 + this.MechanicOrAgentSignature.GetHashCode();
                if (this.NextDriverSignature != null)
                    hashCode = hashCode * 59 + this.NextDriverSignature.GetHashCode();
                if (this.OdometerMiles != null)
                    hashCode = hashCode * 59 + this.OdometerMiles.GetHashCode();
                if (this.TimeMs != null)
                    hashCode = hashCode * 59 + this.TimeMs.GetHashCode();
                if (this.TrailerDefects != null)
                    hashCode = hashCode * 59 + this.TrailerDefects.GetHashCode();
                if (this.TrailerId != null)
                    hashCode = hashCode * 59 + this.TrailerId.GetHashCode();
                if (this.TrailerName != null)
                    hashCode = hashCode * 59 + this.TrailerName.GetHashCode();
                if (this.Vehicle != null)
                    hashCode = hashCode * 59 + this.Vehicle.GetHashCode();
                if (this.VehicleCondition != null)
                    hashCode = hashCode * 59 + this.VehicleCondition.GetHashCode();
                if (this.VehicleDefects != null)
                    hashCode = hashCode * 59 + this.VehicleDefects.GetHashCode();
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
