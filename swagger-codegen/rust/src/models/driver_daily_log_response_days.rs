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
pub struct DriverDailyLogResponseDays {
  /// Hours spent on duty or driving, rounded to two decimal places.
  #[serde(rename = "activeHours")]
  active_hours: Option<f64>,
  /// Milliseconds spent on duty or driving.
  #[serde(rename = "activeMs")]
  active_ms: Option<i64>,
  /// Whether this HOS day chart was certified by the driver.
  #[serde(rename = "certified")]
  certified: Option<bool>,
  /// Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
  #[serde(rename = "certifiedAtMs")]
  certified_at_ms: Option<i64>,
  /// Distance driven in miles, rounded to two decimal places.
  #[serde(rename = "distanceMiles")]
  distance_miles: Option<f64>,
  /// End of the HOS day, specified in milliseconds UNIX time.
  #[serde(rename = "endMs")]
  end_ms: Option<i32>,
  /// End of the HOS day, specified in milliseconds UNIX time.
  #[serde(rename = "startMs")]
  start_ms: Option<i32>,
  /// List of trailer ID's associated with the driver for the day.
  #[serde(rename = "trailerIds")]
  trailer_ids: Option<Value>,
  /// List of vehicle ID's associated with the driver for the day.
  #[serde(rename = "vehicleIds")]
  vehicle_ids: Option<Value>
}

impl DriverDailyLogResponseDays {
  pub fn new() -> DriverDailyLogResponseDays {
    DriverDailyLogResponseDays {
      active_hours: None,
      active_ms: None,
      certified: None,
      certified_at_ms: None,
      distance_miles: None,
      end_ms: None,
      start_ms: None,
      trailer_ids: None,
      vehicle_ids: None
    }
  }

  pub fn set_active_hours(&mut self, active_hours: f64) {
    self.active_hours = Some(active_hours);
  }

  pub fn with_active_hours(mut self, active_hours: f64) -> DriverDailyLogResponseDays {
    self.active_hours = Some(active_hours);
    self
  }

  pub fn active_hours(&self) -> Option<&f64> {
    self.active_hours.as_ref()
  }

  pub fn reset_active_hours(&mut self) {
    self.active_hours = None;
  }

  pub fn set_active_ms(&mut self, active_ms: i64) {
    self.active_ms = Some(active_ms);
  }

  pub fn with_active_ms(mut self, active_ms: i64) -> DriverDailyLogResponseDays {
    self.active_ms = Some(active_ms);
    self
  }

  pub fn active_ms(&self) -> Option<&i64> {
    self.active_ms.as_ref()
  }

  pub fn reset_active_ms(&mut self) {
    self.active_ms = None;
  }

  pub fn set_certified(&mut self, certified: bool) {
    self.certified = Some(certified);
  }

  pub fn with_certified(mut self, certified: bool) -> DriverDailyLogResponseDays {
    self.certified = Some(certified);
    self
  }

  pub fn certified(&self) -> Option<&bool> {
    self.certified.as_ref()
  }

  pub fn reset_certified(&mut self) {
    self.certified = None;
  }

  pub fn set_certified_at_ms(&mut self, certified_at_ms: i64) {
    self.certified_at_ms = Some(certified_at_ms);
  }

  pub fn with_certified_at_ms(mut self, certified_at_ms: i64) -> DriverDailyLogResponseDays {
    self.certified_at_ms = Some(certified_at_ms);
    self
  }

  pub fn certified_at_ms(&self) -> Option<&i64> {
    self.certified_at_ms.as_ref()
  }

  pub fn reset_certified_at_ms(&mut self) {
    self.certified_at_ms = None;
  }

  pub fn set_distance_miles(&mut self, distance_miles: f64) {
    self.distance_miles = Some(distance_miles);
  }

  pub fn with_distance_miles(mut self, distance_miles: f64) -> DriverDailyLogResponseDays {
    self.distance_miles = Some(distance_miles);
    self
  }

  pub fn distance_miles(&self) -> Option<&f64> {
    self.distance_miles.as_ref()
  }

  pub fn reset_distance_miles(&mut self) {
    self.distance_miles = None;
  }

  pub fn set_end_ms(&mut self, end_ms: i32) {
    self.end_ms = Some(end_ms);
  }

  pub fn with_end_ms(mut self, end_ms: i32) -> DriverDailyLogResponseDays {
    self.end_ms = Some(end_ms);
    self
  }

  pub fn end_ms(&self) -> Option<&i32> {
    self.end_ms.as_ref()
  }

  pub fn reset_end_ms(&mut self) {
    self.end_ms = None;
  }

  pub fn set_start_ms(&mut self, start_ms: i32) {
    self.start_ms = Some(start_ms);
  }

  pub fn with_start_ms(mut self, start_ms: i32) -> DriverDailyLogResponseDays {
    self.start_ms = Some(start_ms);
    self
  }

  pub fn start_ms(&self) -> Option<&i32> {
    self.start_ms.as_ref()
  }

  pub fn reset_start_ms(&mut self) {
    self.start_ms = None;
  }

  pub fn set_trailer_ids(&mut self, trailer_ids: Value) {
    self.trailer_ids = Some(trailer_ids);
  }

  pub fn with_trailer_ids(mut self, trailer_ids: Value) -> DriverDailyLogResponseDays {
    self.trailer_ids = Some(trailer_ids);
    self
  }

  pub fn trailer_ids(&self) -> Option<&Value> {
    self.trailer_ids.as_ref()
  }

  pub fn reset_trailer_ids(&mut self) {
    self.trailer_ids = None;
  }

  pub fn set_vehicle_ids(&mut self, vehicle_ids: Value) {
    self.vehicle_ids = Some(vehicle_ids);
  }

  pub fn with_vehicle_ids(mut self, vehicle_ids: Value) -> DriverDailyLogResponseDays {
    self.vehicle_ids = Some(vehicle_ids);
    self
  }

  pub fn vehicle_ids(&self) -> Option<&Value> {
    self.vehicle_ids.as_ref()
  }

  pub fn reset_vehicle_ids(&mut self) {
    self.vehicle_ids = None;
  }

}



