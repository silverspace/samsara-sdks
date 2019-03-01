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
pub struct DriversSummaryResponseSummaries {
  /// Duration in milliseconds that driver was on duty or driving during the requested time range
  #[serde(rename = "activeMs")]
  active_ms: Option<i64>,
  /// Distance driven in miles, rounded to two decimal places.
  #[serde(rename = "distanceMiles")]
  distance_miles: Option<f64>,
  /// Duration in milliseconds that driver was driving during the requested time range
  #[serde(rename = "driveMs")]
  drive_ms: Option<i64>,
  /// ID of the driver.
  #[serde(rename = "driverId")]
  driver_id: Option<i64>,
  /// Name of the driver.
  #[serde(rename = "driverName")]
  driver_name: Option<String>,
  /// Username of the driver.
  #[serde(rename = "driverUsername")]
  driver_username: Option<String>,
  /// Group of the driver.
  #[serde(rename = "groupId")]
  group_id: Option<i64>,
  /// Duration in milliseconds that driver was on duty during the requested time range
  #[serde(rename = "onDutyMs")]
  on_duty_ms: Option<i64>
}

impl DriversSummaryResponseSummaries {
  pub fn new() -> DriversSummaryResponseSummaries {
    DriversSummaryResponseSummaries {
      active_ms: None,
      distance_miles: None,
      drive_ms: None,
      driver_id: None,
      driver_name: None,
      driver_username: None,
      group_id: None,
      on_duty_ms: None
    }
  }

  pub fn set_active_ms(&mut self, active_ms: i64) {
    self.active_ms = Some(active_ms);
  }

  pub fn with_active_ms(mut self, active_ms: i64) -> DriversSummaryResponseSummaries {
    self.active_ms = Some(active_ms);
    self
  }

  pub fn active_ms(&self) -> Option<&i64> {
    self.active_ms.as_ref()
  }

  pub fn reset_active_ms(&mut self) {
    self.active_ms = None;
  }

  pub fn set_distance_miles(&mut self, distance_miles: f64) {
    self.distance_miles = Some(distance_miles);
  }

  pub fn with_distance_miles(mut self, distance_miles: f64) -> DriversSummaryResponseSummaries {
    self.distance_miles = Some(distance_miles);
    self
  }

  pub fn distance_miles(&self) -> Option<&f64> {
    self.distance_miles.as_ref()
  }

  pub fn reset_distance_miles(&mut self) {
    self.distance_miles = None;
  }

  pub fn set_drive_ms(&mut self, drive_ms: i64) {
    self.drive_ms = Some(drive_ms);
  }

  pub fn with_drive_ms(mut self, drive_ms: i64) -> DriversSummaryResponseSummaries {
    self.drive_ms = Some(drive_ms);
    self
  }

  pub fn drive_ms(&self) -> Option<&i64> {
    self.drive_ms.as_ref()
  }

  pub fn reset_drive_ms(&mut self) {
    self.drive_ms = None;
  }

  pub fn set_driver_id(&mut self, driver_id: i64) {
    self.driver_id = Some(driver_id);
  }

  pub fn with_driver_id(mut self, driver_id: i64) -> DriversSummaryResponseSummaries {
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

  pub fn with_driver_name(mut self, driver_name: String) -> DriversSummaryResponseSummaries {
    self.driver_name = Some(driver_name);
    self
  }

  pub fn driver_name(&self) -> Option<&String> {
    self.driver_name.as_ref()
  }

  pub fn reset_driver_name(&mut self) {
    self.driver_name = None;
  }

  pub fn set_driver_username(&mut self, driver_username: String) {
    self.driver_username = Some(driver_username);
  }

  pub fn with_driver_username(mut self, driver_username: String) -> DriversSummaryResponseSummaries {
    self.driver_username = Some(driver_username);
    self
  }

  pub fn driver_username(&self) -> Option<&String> {
    self.driver_username.as_ref()
  }

  pub fn reset_driver_username(&mut self) {
    self.driver_username = None;
  }

  pub fn set_group_id(&mut self, group_id: i64) {
    self.group_id = Some(group_id);
  }

  pub fn with_group_id(mut self, group_id: i64) -> DriversSummaryResponseSummaries {
    self.group_id = Some(group_id);
    self
  }

  pub fn group_id(&self) -> Option<&i64> {
    self.group_id.as_ref()
  }

  pub fn reset_group_id(&mut self) {
    self.group_id = None;
  }

  pub fn set_on_duty_ms(&mut self, on_duty_ms: i64) {
    self.on_duty_ms = Some(on_duty_ms);
  }

  pub fn with_on_duty_ms(mut self, on_duty_ms: i64) -> DriversSummaryResponseSummaries {
    self.on_duty_ms = Some(on_duty_ms);
    self
  }

  pub fn on_duty_ms(&self) -> Option<&i64> {
    self.on_duty_ms.as_ref()
  }

  pub fn reset_on_duty_ms(&mut self) {
    self.on_duty_ms = None;
  }

}



