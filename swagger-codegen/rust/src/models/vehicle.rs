/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

/// Vehicle : A vehicle object.

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct Vehicle {
  /// Total engine hours for the vehicle.
  #[serde(rename = "engineHours")]
  engine_hours: Option<i64>,
  /// The fuel level of the vehicle as a percentage. (0.0 to 1.0)
  #[serde(rename = "fuelLevelPercent")]
  fuel_level_percent: Option<f64>,
  /// ID of the vehicle.
  #[serde(rename = "id")]
  id: i64,
  /// Name of the vehicle.
  #[serde(rename = "name")]
  name: Option<String>,
  #[serde(rename = "note")]
  note: Option<String>,
  /// The number of meters reported by the odometer.
  #[serde(rename = "odometerMeters")]
  odometer_meters: Option<i64>,
  /// Vehicle Identification Number.
  #[serde(rename = "vin")]
  vin: Option<String>
}

impl Vehicle {
  /// A vehicle object.
  pub fn new(id: i64) -> Vehicle {
    Vehicle {
      engine_hours: None,
      fuel_level_percent: None,
      id: id,
      name: None,
      note: None,
      odometer_meters: None,
      vin: None
    }
  }

  pub fn set_engine_hours(&mut self, engine_hours: i64) {
    self.engine_hours = Some(engine_hours);
  }

  pub fn with_engine_hours(mut self, engine_hours: i64) -> Vehicle {
    self.engine_hours = Some(engine_hours);
    self
  }

  pub fn engine_hours(&self) -> Option<&i64> {
    self.engine_hours.as_ref()
  }

  pub fn reset_engine_hours(&mut self) {
    self.engine_hours = None;
  }

  pub fn set_fuel_level_percent(&mut self, fuel_level_percent: f64) {
    self.fuel_level_percent = Some(fuel_level_percent);
  }

  pub fn with_fuel_level_percent(mut self, fuel_level_percent: f64) -> Vehicle {
    self.fuel_level_percent = Some(fuel_level_percent);
    self
  }

  pub fn fuel_level_percent(&self) -> Option<&f64> {
    self.fuel_level_percent.as_ref()
  }

  pub fn reset_fuel_level_percent(&mut self) {
    self.fuel_level_percent = None;
  }

  pub fn set_id(&mut self, id: i64) {
    self.id = id;
  }

  pub fn with_id(mut self, id: i64) -> Vehicle {
    self.id = id;
    self
  }

  pub fn id(&self) -> &i64 {
    &self.id
  }


  pub fn set_name(&mut self, name: String) {
    self.name = Some(name);
  }

  pub fn with_name(mut self, name: String) -> Vehicle {
    self.name = Some(name);
    self
  }

  pub fn name(&self) -> Option<&String> {
    self.name.as_ref()
  }

  pub fn reset_name(&mut self) {
    self.name = None;
  }

  pub fn set_note(&mut self, note: String) {
    self.note = Some(note);
  }

  pub fn with_note(mut self, note: String) -> Vehicle {
    self.note = Some(note);
    self
  }

  pub fn note(&self) -> Option<&String> {
    self.note.as_ref()
  }

  pub fn reset_note(&mut self) {
    self.note = None;
  }

  pub fn set_odometer_meters(&mut self, odometer_meters: i64) {
    self.odometer_meters = Some(odometer_meters);
  }

  pub fn with_odometer_meters(mut self, odometer_meters: i64) -> Vehicle {
    self.odometer_meters = Some(odometer_meters);
    self
  }

  pub fn odometer_meters(&self) -> Option<&i64> {
    self.odometer_meters.as_ref()
  }

  pub fn reset_odometer_meters(&mut self) {
    self.odometer_meters = None;
  }

  pub fn set_vin(&mut self, vin: String) {
    self.vin = Some(vin);
  }

  pub fn with_vin(mut self, vin: String) -> Vehicle {
    self.vin = Some(vin);
    self
  }

  pub fn vin(&self) -> Option<&String> {
    self.vin.as_ref()
  }

  pub fn reset_vin(&mut self) {
    self.vin = None;
  }

}



