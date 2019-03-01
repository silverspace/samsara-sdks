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
    /// HosLogsSummaryResponseDrivers
    /// </summary>
    [DataContract]
    public partial class HosLogsSummaryResponseDrivers :  IEquatable<HosLogsSummaryResponseDrivers>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HosLogsSummaryResponseDrivers" /> class.
        /// </summary>
        /// <param name="timeUntilBreak">The amount of time (in ms) remaining until the driver cannot drive without a rest break..</param>
        /// <param name="vehicleName">Name of the vehicle..</param>
        /// <param name="drivingInViolationToday">The amount of driving time in violation today (in ms)..</param>
        /// <param name="driverId">ID of the driver..</param>
        /// <param name="cycleRemaining">The amount of remaining cycle time (in ms)..</param>
        /// <param name="driverName">Name of the driver..</param>
        /// <param name="dutyStatus">The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;..</param>
        /// <param name="cycleTomorrow">The amount of cycle time (in ms) available tomorrow..</param>
        /// <param name="shiftDriveRemaining">The amount of remaining shift drive time (in ms)..</param>
        /// <param name="timeInCurrentStatus">The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;..</param>
        /// <param name="drivingInViolationCycle">The amount of driving time in violation in this cycle (in ms)..</param>
        /// <param name="shiftRemaining">The amount of remaining shift time (in ms)..</param>
        public HosLogsSummaryResponseDrivers(long timeUntilBreak = default(long), string vehicleName = default(string), long drivingInViolationToday = default(long), long driverId = default(long), long cycleRemaining = default(long), string driverName = default(string), string dutyStatus = default(string), long cycleTomorrow = default(long), long shiftDriveRemaining = default(long), long timeInCurrentStatus = default(long), long drivingInViolationCycle = default(long), long shiftRemaining = default(long))
        {
            this.TimeUntilBreak = timeUntilBreak;
            this.VehicleName = vehicleName;
            this.DrivingInViolationToday = drivingInViolationToday;
            this.DriverId = driverId;
            this.CycleRemaining = cycleRemaining;
            this.DriverName = driverName;
            this.DutyStatus = dutyStatus;
            this.CycleTomorrow = cycleTomorrow;
            this.ShiftDriveRemaining = shiftDriveRemaining;
            this.TimeInCurrentStatus = timeInCurrentStatus;
            this.DrivingInViolationCycle = drivingInViolationCycle;
            this.ShiftRemaining = shiftRemaining;
        }
        
        /// <summary>
        /// The amount of time (in ms) remaining until the driver cannot drive without a rest break.
        /// </summary>
        /// <value>The amount of time (in ms) remaining until the driver cannot drive without a rest break.</value>
        [DataMember(Name="timeUntilBreak", EmitDefaultValue=false)]
        public long TimeUntilBreak { get; set; }

        /// <summary>
        /// Name of the vehicle.
        /// </summary>
        /// <value>Name of the vehicle.</value>
        [DataMember(Name="vehicleName", EmitDefaultValue=false)]
        public string VehicleName { get; set; }

        /// <summary>
        /// The amount of driving time in violation today (in ms).
        /// </summary>
        /// <value>The amount of driving time in violation today (in ms).</value>
        [DataMember(Name="drivingInViolationToday", EmitDefaultValue=false)]
        public long DrivingInViolationToday { get; set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        /// <value>ID of the driver.</value>
        [DataMember(Name="driverId", EmitDefaultValue=false)]
        public long DriverId { get; set; }

        /// <summary>
        /// The amount of remaining cycle time (in ms).
        /// </summary>
        /// <value>The amount of remaining cycle time (in ms).</value>
        [DataMember(Name="cycleRemaining", EmitDefaultValue=false)]
        public long CycleRemaining { get; set; }

        /// <summary>
        /// Name of the driver.
        /// </summary>
        /// <value>Name of the driver.</value>
        [DataMember(Name="driverName", EmitDefaultValue=false)]
        public string DriverName { get; set; }

        /// <summary>
        /// The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
        /// </summary>
        /// <value>The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.</value>
        [DataMember(Name="dutyStatus", EmitDefaultValue=false)]
        public string DutyStatus { get; set; }

        /// <summary>
        /// The amount of cycle time (in ms) available tomorrow.
        /// </summary>
        /// <value>The amount of cycle time (in ms) available tomorrow.</value>
        [DataMember(Name="cycleTomorrow", EmitDefaultValue=false)]
        public long CycleTomorrow { get; set; }

        /// <summary>
        /// The amount of remaining shift drive time (in ms).
        /// </summary>
        /// <value>The amount of remaining shift drive time (in ms).</value>
        [DataMember(Name="shiftDriveRemaining", EmitDefaultValue=false)]
        public long ShiftDriveRemaining { get; set; }

        /// <summary>
        /// The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
        /// </summary>
        /// <value>The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.</value>
        [DataMember(Name="timeInCurrentStatus", EmitDefaultValue=false)]
        public long TimeInCurrentStatus { get; set; }

        /// <summary>
        /// The amount of driving time in violation in this cycle (in ms).
        /// </summary>
        /// <value>The amount of driving time in violation in this cycle (in ms).</value>
        [DataMember(Name="drivingInViolationCycle", EmitDefaultValue=false)]
        public long DrivingInViolationCycle { get; set; }

        /// <summary>
        /// The amount of remaining shift time (in ms).
        /// </summary>
        /// <value>The amount of remaining shift time (in ms).</value>
        [DataMember(Name="shiftRemaining", EmitDefaultValue=false)]
        public long ShiftRemaining { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HosLogsSummaryResponseDrivers {\n");
            sb.Append("  TimeUntilBreak: ").Append(TimeUntilBreak).Append("\n");
            sb.Append("  VehicleName: ").Append(VehicleName).Append("\n");
            sb.Append("  DrivingInViolationToday: ").Append(DrivingInViolationToday).Append("\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  CycleRemaining: ").Append(CycleRemaining).Append("\n");
            sb.Append("  DriverName: ").Append(DriverName).Append("\n");
            sb.Append("  DutyStatus: ").Append(DutyStatus).Append("\n");
            sb.Append("  CycleTomorrow: ").Append(CycleTomorrow).Append("\n");
            sb.Append("  ShiftDriveRemaining: ").Append(ShiftDriveRemaining).Append("\n");
            sb.Append("  TimeInCurrentStatus: ").Append(TimeInCurrentStatus).Append("\n");
            sb.Append("  DrivingInViolationCycle: ").Append(DrivingInViolationCycle).Append("\n");
            sb.Append("  ShiftRemaining: ").Append(ShiftRemaining).Append("\n");
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
            return this.Equals(input as HosLogsSummaryResponseDrivers);
        }

        /// <summary>
        /// Returns true if HosLogsSummaryResponseDrivers instances are equal
        /// </summary>
        /// <param name="input">Instance of HosLogsSummaryResponseDrivers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HosLogsSummaryResponseDrivers input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TimeUntilBreak == input.TimeUntilBreak ||
                    (this.TimeUntilBreak != null &&
                    this.TimeUntilBreak.Equals(input.TimeUntilBreak))
                ) && 
                (
                    this.VehicleName == input.VehicleName ||
                    (this.VehicleName != null &&
                    this.VehicleName.Equals(input.VehicleName))
                ) && 
                (
                    this.DrivingInViolationToday == input.DrivingInViolationToday ||
                    (this.DrivingInViolationToday != null &&
                    this.DrivingInViolationToday.Equals(input.DrivingInViolationToday))
                ) && 
                (
                    this.DriverId == input.DriverId ||
                    (this.DriverId != null &&
                    this.DriverId.Equals(input.DriverId))
                ) && 
                (
                    this.CycleRemaining == input.CycleRemaining ||
                    (this.CycleRemaining != null &&
                    this.CycleRemaining.Equals(input.CycleRemaining))
                ) && 
                (
                    this.DriverName == input.DriverName ||
                    (this.DriverName != null &&
                    this.DriverName.Equals(input.DriverName))
                ) && 
                (
                    this.DutyStatus == input.DutyStatus ||
                    (this.DutyStatus != null &&
                    this.DutyStatus.Equals(input.DutyStatus))
                ) && 
                (
                    this.CycleTomorrow == input.CycleTomorrow ||
                    (this.CycleTomorrow != null &&
                    this.CycleTomorrow.Equals(input.CycleTomorrow))
                ) && 
                (
                    this.ShiftDriveRemaining == input.ShiftDriveRemaining ||
                    (this.ShiftDriveRemaining != null &&
                    this.ShiftDriveRemaining.Equals(input.ShiftDriveRemaining))
                ) && 
                (
                    this.TimeInCurrentStatus == input.TimeInCurrentStatus ||
                    (this.TimeInCurrentStatus != null &&
                    this.TimeInCurrentStatus.Equals(input.TimeInCurrentStatus))
                ) && 
                (
                    this.DrivingInViolationCycle == input.DrivingInViolationCycle ||
                    (this.DrivingInViolationCycle != null &&
                    this.DrivingInViolationCycle.Equals(input.DrivingInViolationCycle))
                ) && 
                (
                    this.ShiftRemaining == input.ShiftRemaining ||
                    (this.ShiftRemaining != null &&
                    this.ShiftRemaining.Equals(input.ShiftRemaining))
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
                if (this.TimeUntilBreak != null)
                    hashCode = hashCode * 59 + this.TimeUntilBreak.GetHashCode();
                if (this.VehicleName != null)
                    hashCode = hashCode * 59 + this.VehicleName.GetHashCode();
                if (this.DrivingInViolationToday != null)
                    hashCode = hashCode * 59 + this.DrivingInViolationToday.GetHashCode();
                if (this.DriverId != null)
                    hashCode = hashCode * 59 + this.DriverId.GetHashCode();
                if (this.CycleRemaining != null)
                    hashCode = hashCode * 59 + this.CycleRemaining.GetHashCode();
                if (this.DriverName != null)
                    hashCode = hashCode * 59 + this.DriverName.GetHashCode();
                if (this.DutyStatus != null)
                    hashCode = hashCode * 59 + this.DutyStatus.GetHashCode();
                if (this.CycleTomorrow != null)
                    hashCode = hashCode * 59 + this.CycleTomorrow.GetHashCode();
                if (this.ShiftDriveRemaining != null)
                    hashCode = hashCode * 59 + this.ShiftDriveRemaining.GetHashCode();
                if (this.TimeInCurrentStatus != null)
                    hashCode = hashCode * 59 + this.TimeInCurrentStatus.GetHashCode();
                if (this.DrivingInViolationCycle != null)
                    hashCode = hashCode * 59 + this.DrivingInViolationCycle.GetHashCode();
                if (this.ShiftRemaining != null)
                    hashCode = hashCode * 59 + this.ShiftRemaining.GetHashCode();
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
