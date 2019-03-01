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
    public partial class HosLogsSummaryResponseDrivers : IEquatable<HosLogsSummaryResponseDrivers>
    { 
        /// <summary>
        /// The amount of remaining cycle time (in ms).
        /// </summary>
        /// <value>The amount of remaining cycle time (in ms).</value>
        [DataMember(Name="cycleRemaining")]
        public long? CycleRemaining { get; set; }

        /// <summary>
        /// The amount of cycle time (in ms) available tomorrow.
        /// </summary>
        /// <value>The amount of cycle time (in ms) available tomorrow.</value>
        [DataMember(Name="cycleTomorrow")]
        public long? CycleTomorrow { get; set; }

        /// <summary>
        /// ID of the driver.
        /// </summary>
        /// <value>ID of the driver.</value>
        [DataMember(Name="driverId")]
        public long? DriverId { get; set; }

        /// <summary>
        /// Name of the driver.
        /// </summary>
        /// <value>Name of the driver.</value>
        [DataMember(Name="driverName")]
        public string DriverName { get; set; }

        /// <summary>
        /// The amount of driving time in violation in this cycle (in ms).
        /// </summary>
        /// <value>The amount of driving time in violation in this cycle (in ms).</value>
        [DataMember(Name="drivingInViolationCycle")]
        public long? DrivingInViolationCycle { get; set; }

        /// <summary>
        /// The amount of driving time in violation today (in ms).
        /// </summary>
        /// <value>The amount of driving time in violation today (in ms).</value>
        [DataMember(Name="drivingInViolationToday")]
        public long? DrivingInViolationToday { get; set; }

        /// <summary>
        /// The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
        /// </summary>
        /// <value>The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.</value>
        [DataMember(Name="dutyStatus")]
        public string DutyStatus { get; set; }

        /// <summary>
        /// The amount of remaining shift drive time (in ms).
        /// </summary>
        /// <value>The amount of remaining shift drive time (in ms).</value>
        [DataMember(Name="shiftDriveRemaining")]
        public long? ShiftDriveRemaining { get; set; }

        /// <summary>
        /// The amount of remaining shift time (in ms).
        /// </summary>
        /// <value>The amount of remaining shift time (in ms).</value>
        [DataMember(Name="shiftRemaining")]
        public long? ShiftRemaining { get; set; }

        /// <summary>
        /// The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
        /// </summary>
        /// <value>The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.</value>
        [DataMember(Name="timeInCurrentStatus")]
        public long? TimeInCurrentStatus { get; set; }

        /// <summary>
        /// The amount of time (in ms) remaining until the driver cannot drive without a rest break.
        /// </summary>
        /// <value>The amount of time (in ms) remaining until the driver cannot drive without a rest break.</value>
        [DataMember(Name="timeUntilBreak")]
        public long? TimeUntilBreak { get; set; }

        /// <summary>
        /// Name of the vehicle.
        /// </summary>
        /// <value>Name of the vehicle.</value>
        [DataMember(Name="vehicleName")]
        public string VehicleName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HosLogsSummaryResponseDrivers {\n");
            sb.Append("  CycleRemaining: ").Append(CycleRemaining).Append("\n");
            sb.Append("  CycleTomorrow: ").Append(CycleTomorrow).Append("\n");
            sb.Append("  DriverId: ").Append(DriverId).Append("\n");
            sb.Append("  DriverName: ").Append(DriverName).Append("\n");
            sb.Append("  DrivingInViolationCycle: ").Append(DrivingInViolationCycle).Append("\n");
            sb.Append("  DrivingInViolationToday: ").Append(DrivingInViolationToday).Append("\n");
            sb.Append("  DutyStatus: ").Append(DutyStatus).Append("\n");
            sb.Append("  ShiftDriveRemaining: ").Append(ShiftDriveRemaining).Append("\n");
            sb.Append("  ShiftRemaining: ").Append(ShiftRemaining).Append("\n");
            sb.Append("  TimeInCurrentStatus: ").Append(TimeInCurrentStatus).Append("\n");
            sb.Append("  TimeUntilBreak: ").Append(TimeUntilBreak).Append("\n");
            sb.Append("  VehicleName: ").Append(VehicleName).Append("\n");
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
            return obj.GetType() == GetType() && Equals((HosLogsSummaryResponseDrivers)obj);
        }

        /// <summary>
        /// Returns true if HosLogsSummaryResponseDrivers instances are equal
        /// </summary>
        /// <param name="other">Instance of HosLogsSummaryResponseDrivers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HosLogsSummaryResponseDrivers other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CycleRemaining == other.CycleRemaining ||
                    CycleRemaining != null &&
                    CycleRemaining.Equals(other.CycleRemaining)
                ) && 
                (
                    CycleTomorrow == other.CycleTomorrow ||
                    CycleTomorrow != null &&
                    CycleTomorrow.Equals(other.CycleTomorrow)
                ) && 
                (
                    DriverId == other.DriverId ||
                    DriverId != null &&
                    DriverId.Equals(other.DriverId)
                ) && 
                (
                    DriverName == other.DriverName ||
                    DriverName != null &&
                    DriverName.Equals(other.DriverName)
                ) && 
                (
                    DrivingInViolationCycle == other.DrivingInViolationCycle ||
                    DrivingInViolationCycle != null &&
                    DrivingInViolationCycle.Equals(other.DrivingInViolationCycle)
                ) && 
                (
                    DrivingInViolationToday == other.DrivingInViolationToday ||
                    DrivingInViolationToday != null &&
                    DrivingInViolationToday.Equals(other.DrivingInViolationToday)
                ) && 
                (
                    DutyStatus == other.DutyStatus ||
                    DutyStatus != null &&
                    DutyStatus.Equals(other.DutyStatus)
                ) && 
                (
                    ShiftDriveRemaining == other.ShiftDriveRemaining ||
                    ShiftDriveRemaining != null &&
                    ShiftDriveRemaining.Equals(other.ShiftDriveRemaining)
                ) && 
                (
                    ShiftRemaining == other.ShiftRemaining ||
                    ShiftRemaining != null &&
                    ShiftRemaining.Equals(other.ShiftRemaining)
                ) && 
                (
                    TimeInCurrentStatus == other.TimeInCurrentStatus ||
                    TimeInCurrentStatus != null &&
                    TimeInCurrentStatus.Equals(other.TimeInCurrentStatus)
                ) && 
                (
                    TimeUntilBreak == other.TimeUntilBreak ||
                    TimeUntilBreak != null &&
                    TimeUntilBreak.Equals(other.TimeUntilBreak)
                ) && 
                (
                    VehicleName == other.VehicleName ||
                    VehicleName != null &&
                    VehicleName.Equals(other.VehicleName)
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
                    if (CycleRemaining != null)
                    hashCode = hashCode * 59 + CycleRemaining.GetHashCode();
                    if (CycleTomorrow != null)
                    hashCode = hashCode * 59 + CycleTomorrow.GetHashCode();
                    if (DriverId != null)
                    hashCode = hashCode * 59 + DriverId.GetHashCode();
                    if (DriverName != null)
                    hashCode = hashCode * 59 + DriverName.GetHashCode();
                    if (DrivingInViolationCycle != null)
                    hashCode = hashCode * 59 + DrivingInViolationCycle.GetHashCode();
                    if (DrivingInViolationToday != null)
                    hashCode = hashCode * 59 + DrivingInViolationToday.GetHashCode();
                    if (DutyStatus != null)
                    hashCode = hashCode * 59 + DutyStatus.GetHashCode();
                    if (ShiftDriveRemaining != null)
                    hashCode = hashCode * 59 + ShiftDriveRemaining.GetHashCode();
                    if (ShiftRemaining != null)
                    hashCode = hashCode * 59 + ShiftRemaining.GetHashCode();
                    if (TimeInCurrentStatus != null)
                    hashCode = hashCode * 59 + TimeInCurrentStatus.GetHashCode();
                    if (TimeUntilBreak != null)
                    hashCode = hashCode * 59 + TimeUntilBreak.GetHashCode();
                    if (VehicleName != null)
                    hashCode = hashCode * 59 + VehicleName.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(HosLogsSummaryResponseDrivers left, HosLogsSummaryResponseDrivers right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(HosLogsSummaryResponseDrivers left, HosLogsSummaryResponseDrivers right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
