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
pub struct HosLogsResponseLogs {
  #[serde(rename = "codriverIds")]
  codriver_ids: Option<Vec<i64>>,
  /// ID of the driver.
  #[serde(rename = "driverId")]
  driver_id: Option<i64>,
  /// ID of the group.
  #[serde(rename = "groupId")]
  group_id: Option<i64>,
  /// City in which the log was recorded.
  #[serde(rename = "locCity")]
  loc_city: Option<String>,
  /// Latitude at which the log was recorded.
  #[serde(rename = "locLat")]
  loc_lat: Option<f64>,
  /// Longitude at which the log was recorded.
  #[serde(rename = "locLng")]
  loc_lng: Option<f64>,
  /// Name of location at which the log was recorded.
  #[serde(rename = "locName")]
  loc_name: Option<String>,
  /// State in which the log was recorded.
  #[serde(rename = "locState")]
  loc_state: Option<String>,
  /// The time at which the log/HOS status started in UNIX milliseconds.
  #[serde(rename = "logStartMs")]
  log_start_ms: Option<i64>,
  /// Remark associated with the log entry.
  #[serde(rename = "remark")]
  remark: Option<String>,
  /// The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
  #[serde(rename = "statusType")]
  status_type: Option<String>,
  /// ID of the vehicle.
  #[serde(rename = "vehicleId")]
  vehicle_id: Option<i64>
}

impl HosLogsResponseLogs {
  pub fn new() -> HosLogsResponseLogs {
    HosLogsResponseLogs {
      codriver_ids: None,
      driver_id: None,
      group_id: None,
      loc_city: None,
      loc_lat: None,
      loc_lng: None,
      loc_name: None,
      loc_state: None,
      log_start_ms: None,
      remark: None,
      status_type: None,
      vehicle_id: None
    }
  }

  pub fn set_codriver_ids(&mut self, codriver_ids: Vec<i64>) {
    self.codriver_ids = Some(codriver_ids);
  }

  pub fn with_codriver_ids(mut self, codriver_ids: Vec<i64>) -> HosLogsResponseLogs {
    self.codriver_ids = Some(codriver_ids);
    self
  }

  pub fn codriver_ids(&self) -> Option<&Vec<i64>> {
    self.codriver_ids.as_ref()
  }

  pub fn reset_codriver_ids(&mut self) {
    self.codriver_ids = None;
  }

  pub fn set_driver_id(&mut self, driver_id: i64) {
    self.driver_id = Some(driver_id);
  }

  pub fn with_driver_id(mut self, driver_id: i64) -> HosLogsResponseLogs {
    self.driver_id = Some(driver_id);
    self
  }

  pub fn driver_id(&self) -> Option<&i64> {
    self.driver_id.as_ref()
  }

  pub fn reset_driver_id(&mut self) {
    self.driver_id = None;
  }

  pub fn set_group_id(&mut self, group_id: i64) {
    self.group_id = Some(group_id);
  }

  pub fn with_group_id(mut self, group_id: i64) -> HosLogsResponseLogs {
    self.group_id = Some(group_id);
    self
  }

  pub fn group_id(&self) -> Option<&i64> {
    self.group_id.as_ref()
  }

  pub fn reset_group_id(&mut self) {
    self.group_id = None;
  }

  pub fn set_loc_city(&mut self, loc_city: String) {
    self.loc_city = Some(loc_city);
  }

  pub fn with_loc_city(mut self, loc_city: String) -> HosLogsResponseLogs {
    self.loc_city = Some(loc_city);
    self
  }

  pub fn loc_city(&self) -> Option<&String> {
    self.loc_city.as_ref()
  }

  pub fn reset_loc_city(&mut self) {
    self.loc_city = None;
  }

  pub fn set_loc_lat(&mut self, loc_lat: f64) {
    self.loc_lat = Some(loc_lat);
  }

  pub fn with_loc_lat(mut self, loc_lat: f64) -> HosLogsResponseLogs {
    self.loc_lat = Some(loc_lat);
    self
  }

  pub fn loc_lat(&self) -> Option<&f64> {
    self.loc_lat.as_ref()
  }

  pub fn reset_loc_lat(&mut self) {
    self.loc_lat = None;
  }

  pub fn set_loc_lng(&mut self, loc_lng: f64) {
    self.loc_lng = Some(loc_lng);
  }

  pub fn with_loc_lng(mut self, loc_lng: f64) -> HosLogsResponseLogs {
    self.loc_lng = Some(loc_lng);
    self
  }

  pub fn loc_lng(&self) -> Option<&f64> {
    self.loc_lng.as_ref()
  }

  pub fn reset_loc_lng(&mut self) {
    self.loc_lng = None;
  }

  pub fn set_loc_name(&mut self, loc_name: String) {
    self.loc_name = Some(loc_name);
  }

  pub fn with_loc_name(mut self, loc_name: String) -> HosLogsResponseLogs {
    self.loc_name = Some(loc_name);
    self
  }

  pub fn loc_name(&self) -> Option<&String> {
    self.loc_name.as_ref()
  }

  pub fn reset_loc_name(&mut self) {
    self.loc_name = None;
  }

  pub fn set_loc_state(&mut self, loc_state: String) {
    self.loc_state = Some(loc_state);
  }

  pub fn with_loc_state(mut self, loc_state: String) -> HosLogsResponseLogs {
    self.loc_state = Some(loc_state);
    self
  }

  pub fn loc_state(&self) -> Option<&String> {
    self.loc_state.as_ref()
  }

  pub fn reset_loc_state(&mut self) {
    self.loc_state = None;
  }

  pub fn set_log_start_ms(&mut self, log_start_ms: i64) {
    self.log_start_ms = Some(log_start_ms);
  }

  pub fn with_log_start_ms(mut self, log_start_ms: i64) -> HosLogsResponseLogs {
    self.log_start_ms = Some(log_start_ms);
    self
  }

  pub fn log_start_ms(&self) -> Option<&i64> {
    self.log_start_ms.as_ref()
  }

  pub fn reset_log_start_ms(&mut self) {
    self.log_start_ms = None;
  }

  pub fn set_remark(&mut self, remark: String) {
    self.remark = Some(remark);
  }

  pub fn with_remark(mut self, remark: String) -> HosLogsResponseLogs {
    self.remark = Some(remark);
    self
  }

  pub fn remark(&self) -> Option<&String> {
    self.remark.as_ref()
  }

  pub fn reset_remark(&mut self) {
    self.remark = None;
  }

  pub fn set_status_type(&mut self, status_type: String) {
    self.status_type = Some(status_type);
  }

  pub fn with_status_type(mut self, status_type: String) -> HosLogsResponseLogs {
    self.status_type = Some(status_type);
    self
  }

  pub fn status_type(&self) -> Option<&String> {
    self.status_type.as_ref()
  }

  pub fn reset_status_type(&mut self) {
    self.status_type = None;
  }

  pub fn set_vehicle_id(&mut self, vehicle_id: i64) {
    self.vehicle_id = Some(vehicle_id);
  }

  pub fn with_vehicle_id(mut self, vehicle_id: i64) -> HosLogsResponseLogs {
    self.vehicle_id = Some(vehicle_id);
    self
  }

  pub fn vehicle_id(&self) -> Option<&i64> {
    self.vehicle_id.as_ref()
  }

  pub fn reset_vehicle_id(&mut self) {
    self.vehicle_id = None;
  }

}



