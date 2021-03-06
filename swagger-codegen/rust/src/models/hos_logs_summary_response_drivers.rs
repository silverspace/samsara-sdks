/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct HosLogsSummaryResponseDrivers {
  /// The amount of remaining cycle time (in ms).
  #[serde(rename = "cycleRemaining")]
  cycle_remaining: Option<i64>,
  /// The amount of cycle time (in ms) available tomorrow.
  #[serde(rename = "cycleTomorrow")]
  cycle_tomorrow: Option<i64>,
  /// ID of the driver.
  #[serde(rename = "driverId")]
  driver_id: Option<i64>,
  /// Name of the driver.
  #[serde(rename = "driverName")]
  driver_name: Option<String>,
  /// The amount of driving time in violation in this cycle (in ms).
  #[serde(rename = "drivingInViolationCycle")]
  driving_in_violation_cycle: Option<i64>,
  /// The amount of driving time in violation today (in ms).
  #[serde(rename = "drivingInViolationToday")]
  driving_in_violation_today: Option<i64>,
  /// The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
  #[serde(rename = "dutyStatus")]
  duty_status: Option<String>,
  /// The amount of remaining shift drive time (in ms).
  #[serde(rename = "shiftDriveRemaining")]
  shift_drive_remaining: Option<i64>,
  /// The amount of remaining shift time (in ms).
  #[serde(rename = "shiftRemaining")]
  shift_remaining: Option<i64>,
  /// The amount of time (in ms) that the driver has been in the current `dutyStatus`.
  #[serde(rename = "timeInCurrentStatus")]
  time_in_current_status: Option<i64>,
  /// The amount of time (in ms) remaining until the driver cannot drive without a rest break.
  #[serde(rename = "timeUntilBreak")]
  time_until_break: Option<i64>,
  /// Name of the vehicle.
  #[serde(rename = "vehicleName")]
  vehicle_name: Option<String>
}

impl HosLogsSummaryResponseDrivers {
  pub fn new() -> HosLogsSummaryResponseDrivers {
    HosLogsSummaryResponseDrivers {
      cycle_remaining: None,
      cycle_tomorrow: None,
      driver_id: None,
      driver_name: None,
      driving_in_violation_cycle: None,
      driving_in_violation_today: None,
      duty_status: None,
      shift_drive_remaining: None,
      shift_remaining: None,
      time_in_current_status: None,
      time_until_break: None,
      vehicle_name: None
    }
  }

  pub fn set_cycle_remaining(&mut self, cycle_remaining: i64) {
    self.cycle_remaining = Some(cycle_remaining);
  }

  pub fn with_cycle_remaining(mut self, cycle_remaining: i64) -> HosLogsSummaryResponseDrivers {
    self.cycle_remaining = Some(cycle_remaining);
    self
  }

  pub fn cycle_remaining(&self) -> Option<&i64> {
    self.cycle_remaining.as_ref()
  }

  pub fn reset_cycle_remaining(&mut self) {
    self.cycle_remaining = None;
  }

  pub fn set_cycle_tomorrow(&mut self, cycle_tomorrow: i64) {
    self.cycle_tomorrow = Some(cycle_tomorrow);
  }

  pub fn with_cycle_tomorrow(mut self, cycle_tomorrow: i64) -> HosLogsSummaryResponseDrivers {
    self.cycle_tomorrow = Some(cycle_tomorrow);
    self
  }

  pub fn cycle_tomorrow(&self) -> Option<&i64> {
    self.cycle_tomorrow.as_ref()
  }

  pub fn reset_cycle_tomorrow(&mut self) {
    self.cycle_tomorrow = None;
  }

  pub fn set_driver_id(&mut self, driver_id: i64) {
    self.driver_id = Some(driver_id);
  }

  pub fn with_driver_id(mut self, driver_id: i64) -> HosLogsSummaryResponseDrivers {
    self.driver_id = Some(driver_id);
    self
  }

  pub fn driver_id(&self) -> Option<&i64> {
    self.driver_id.as_ref()
  }

  pub fn reset_driver_id(&mut self) {
    self.driver_id = None;
  }

  pub fn set_driver_name(&mut self, driver_name: String) {
    self.driver_name = Some(driver_name);
  }

  pub fn with_driver_name(mut self, driver_name: String) -> HosLogsSummaryResponseDrivers {
    self.driver_name = Some(driver_name);
    self
  }

  pub fn driver_name(&self) -> Option<&String> {
    self.driver_name.as_ref()
  }

  pub fn reset_driver_name(&mut self) {
    self.driver_name = None;
  }

  pub fn set_driving_in_violation_cycle(&mut self, driving_in_violation_cycle: i64) {
    self.driving_in_violation_cycle = Some(driving_in_violation_cycle);
  }

  pub fn with_driving_in_violation_cycle(mut self, driving_in_violation_cycle: i64) -> HosLogsSummaryResponseDrivers {
    self.driving_in_violation_cycle = Some(driving_in_violation_cycle);
    self
  }

  pub fn driving_in_violation_cycle(&self) -> Option<&i64> {
    self.driving_in_violation_cycle.as_ref()
  }

  pub fn reset_driving_in_violation_cycle(&mut self) {
    self.driving_in_violation_cycle = None;
  }

  pub fn set_driving_in_violation_today(&mut self, driving_in_violation_today: i64) {
    self.driving_in_violation_today = Some(driving_in_violation_today);
  }

  pub fn with_driving_in_violation_today(mut self, driving_in_violation_today: i64) -> HosLogsSummaryResponseDrivers {
    self.driving_in_violation_today = Some(driving_in_violation_today);
    self
  }

  pub fn driving_in_violation_today(&self) -> Option<&i64> {
    self.driving_in_violation_today.as_ref()
  }

  pub fn reset_driving_in_violation_today(&mut self) {
    self.driving_in_violation_today = None;
  }

  pub fn set_duty_status(&mut self, duty_status: String) {
    self.duty_status = Some(duty_status);
  }

  pub fn with_duty_status(mut self, duty_status: String) -> HosLogsSummaryResponseDrivers {
    self.duty_status = Some(duty_status);
    self
  }

  pub fn duty_status(&self) -> Option<&String> {
    self.duty_status.as_ref()
  }

  pub fn reset_duty_status(&mut self) {
    self.duty_status = None;
  }

  pub fn set_shift_drive_remaining(&mut self, shift_drive_remaining: i64) {
    self.shift_drive_remaining = Some(shift_drive_remaining);
  }

  pub fn with_shift_drive_remaining(mut self, shift_drive_remaining: i64) -> HosLogsSummaryResponseDrivers {
    self.shift_drive_remaining = Some(shift_drive_remaining);
    self
  }

  pub fn shift_drive_remaining(&self) -> Option<&i64> {
    self.shift_drive_remaining.as_ref()
  }

  pub fn reset_shift_drive_remaining(&mut self) {
    self.shift_drive_remaining = None;
  }

  pub fn set_shift_remaining(&mut self, shift_remaining: i64) {
    self.shift_remaining = Some(shift_remaining);
  }

  pub fn with_shift_remaining(mut self, shift_remaining: i64) -> HosLogsSummaryResponseDrivers {
    self.shift_remaining = Some(shift_remaining);
    self
  }

  pub fn shift_remaining(&self) -> Option<&i64> {
    self.shift_remaining.as_ref()
  }

  pub fn reset_shift_remaining(&mut self) {
    self.shift_remaining = None;
  }

  pub fn set_time_in_current_status(&mut self, time_in_current_status: i64) {
    self.time_in_current_status = Some(time_in_current_status);
  }

  pub fn with_time_in_current_status(mut self, time_in_current_status: i64) -> HosLogsSummaryResponseDrivers {
    self.time_in_current_status = Some(time_in_current_status);
    self
  }

  pub fn time_in_current_status(&self) -> Option<&i64> {
    self.time_in_current_status.as_ref()
  }

  pub fn reset_time_in_current_status(&mut self) {
    self.time_in_current_status = None;
  }

  pub fn set_time_until_break(&mut self, time_until_break: i64) {
    self.time_until_break = Some(time_until_break);
  }

  pub fn with_time_until_break(mut self, time_until_break: i64) -> HosLogsSummaryResponseDrivers {
    self.time_until_break = Some(time_until_break);
    self
  }

  pub fn time_until_break(&self) -> Option<&i64> {
    self.time_until_break.as_ref()
  }

  pub fn reset_time_until_break(&mut self) {
    self.time_until_break = None;
  }

  pub fn set_vehicle_name(&mut self, vehicle_name: String) {
    self.vehicle_name = Some(vehicle_name);
  }

  pub fn with_vehicle_name(mut self, vehicle_name: String) -> HosLogsSummaryResponseDrivers {
    self.vehicle_name = Some(vehicle_name);
    self
  }

  pub fn vehicle_name(&self) -> Option<&String> {
    self.vehicle_name.as_ref()
  }

  pub fn reset_vehicle_name(&mut self) {
    self.vehicle_name = None;
  }

}



