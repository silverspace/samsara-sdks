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
pub struct TripResponseTrips {
  /// Length of the trip in meters.
  #[serde(rename = "distanceMeters")]
  distance_meters: Option<i32>,
  /// ID of the driver.
  #[serde(rename = "driverId")]
  driver_id: Option<i32>,
  /// Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
  #[serde(rename = "endAddress")]
  end_address: Option<String>,
  #[serde(rename = "endCoordinates")]
  end_coordinates: Option<::models::TripResponseEndCoordinates>,
  /// Geocoded street address of start (latitude, longitude) coordinates.
  #[serde(rename = "endLocation")]
  end_location: Option<String>,
  /// End of the trip in UNIX milliseconds.
  #[serde(rename = "endMs")]
  end_ms: Option<i32>,
  /// Odometer reading at the end of the trip.
  #[serde(rename = "endOdometer")]
  end_odometer: Option<i32>,
  /// Amount in milliliters of fuel consumed on this trip.
  #[serde(rename = "fuelConsumedMl")]
  fuel_consumed_ml: Option<i32>,
  /// Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
  #[serde(rename = "startAddress")]
  start_address: Option<String>,
  #[serde(rename = "startCoordinates")]
  start_coordinates: Option<::models::TripResponseStartCoordinates>,
  /// Geocoded street address of start (latitude, longitude) coordinates.
  #[serde(rename = "startLocation")]
  start_location: Option<String>,
  /// Beginning of the trip in UNIX milliseconds.
  #[serde(rename = "startMs")]
  start_ms: Option<i32>,
  /// Odometer reading at the beginning of the trip.
  #[serde(rename = "startOdometer")]
  start_odometer: Option<i32>,
  /// Length in meters trip spent on toll roads.
  #[serde(rename = "tollMeters")]
  toll_meters: Option<i32>
}

impl TripResponseTrips {
  pub fn new() -> TripResponseTrips {
    TripResponseTrips {
      distance_meters: None,
      driver_id: None,
      end_address: None,
      end_coordinates: None,
      end_location: None,
      end_ms: None,
      end_odometer: None,
      fuel_consumed_ml: None,
      start_address: None,
      start_coordinates: None,
      start_location: None,
      start_ms: None,
      start_odometer: None,
      toll_meters: None
    }
  }

  pub fn set_distance_meters(&mut self, distance_meters: i32) {
    self.distance_meters = Some(distance_meters);
  }

  pub fn with_distance_meters(mut self, distance_meters: i32) -> TripResponseTrips {
    self.distance_meters = Some(distance_meters);
    self
  }

  pub fn distance_meters(&self) -> Option<&i32> {
    self.distance_meters.as_ref()
  }

  pub fn reset_distance_meters(&mut self) {
    self.distance_meters = None;
  }

  pub fn set_driver_id(&mut self, driver_id: i32) {
    self.driver_id = Some(driver_id);
  }

  pub fn with_driver_id(mut self, driver_id: i32) -> TripResponseTrips {
    self.driver_id = Some(driver_id);
    self
  }

  pub fn driver_id(&self) -> Option<&i32> {
    self.driver_id.as_ref()
  }

  pub fn reset_driver_id(&mut self) {
    self.driver_id = None;
  }

  pub fn set_end_address(&mut self, end_address: String) {
    self.end_address = Some(end_address);
  }

  pub fn with_end_address(mut self, end_address: String) -> TripResponseTrips {
    self.end_address = Some(end_address);
    self
  }

  pub fn end_address(&self) -> Option<&String> {
    self.end_address.as_ref()
  }

  pub fn reset_end_address(&mut self) {
    self.end_address = None;
  }

  pub fn set_end_coordinates(&mut self, end_coordinates: ::models::TripResponseEndCoordinates) {
    self.end_coordinates = Some(end_coordinates);
  }

  pub fn with_end_coordinates(mut self, end_coordinates: ::models::TripResponseEndCoordinates) -> TripResponseTrips {
    self.end_coordinates = Some(end_coordinates);
    self
  }

  pub fn end_coordinates(&self) -> Option<&::models::TripResponseEndCoordinates> {
    self.end_coordinates.as_ref()
  }

  pub fn reset_end_coordinates(&mut self) {
    self.end_coordinates = None;
  }

  pub fn set_end_location(&mut self, end_location: String) {
    self.end_location = Some(end_location);
  }

  pub fn with_end_location(mut self, end_location: String) -> TripResponseTrips {
    self.end_location = Some(end_location);
    self
  }

  pub fn end_location(&self) -> Option<&String> {
    self.end_location.as_ref()
  }

  pub fn reset_end_location(&mut self) {
    self.end_location = None;
  }

  pub fn set_end_ms(&mut self, end_ms: i32) {
    self.end_ms = Some(end_ms);
  }

  pub fn with_end_ms(mut self, end_ms: i32) -> TripResponseTrips {
    self.end_ms = Some(end_ms);
    self
  }

  pub fn end_ms(&self) -> Option<&i32> {
    self.end_ms.as_ref()
  }

  pub fn reset_end_ms(&mut self) {
    self.end_ms = None;
  }

  pub fn set_end_odometer(&mut self, end_odometer: i32) {
    self.end_odometer = Some(end_odometer);
  }

  pub fn with_end_odometer(mut self, end_odometer: i32) -> TripResponseTrips {
    self.end_odometer = Some(end_odometer);
    self
  }

  pub fn end_odometer(&self) -> Option<&i32> {
    self.end_odometer.as_ref()
  }

  pub fn reset_end_odometer(&mut self) {
    self.end_odometer = None;
  }

  pub fn set_fuel_consumed_ml(&mut self, fuel_consumed_ml: i32) {
    self.fuel_consumed_ml = Some(fuel_consumed_ml);
  }

  pub fn with_fuel_consumed_ml(mut self, fuel_consumed_ml: i32) -> TripResponseTrips {
    self.fuel_consumed_ml = Some(fuel_consumed_ml);
    self
  }

  pub fn fuel_consumed_ml(&self) -> Option<&i32> {
    self.fuel_consumed_ml.as_ref()
  }

  pub fn reset_fuel_consumed_ml(&mut self) {
    self.fuel_consumed_ml = None;
  }

  pub fn set_start_address(&mut self, start_address: String) {
    self.start_address = Some(start_address);
  }

  pub fn with_start_address(mut self, start_address: String) -> TripResponseTrips {
    self.start_address = Some(start_address);
    self
  }

  pub fn start_address(&self) -> Option<&String> {
    self.start_address.as_ref()
  }

  pub fn reset_start_address(&mut self) {
    self.start_address = None;
  }

  pub fn set_start_coordinates(&mut self, start_coordinates: ::models::TripResponseStartCoordinates) {
    self.start_coordinates = Some(start_coordinates);
  }

  pub fn with_start_coordinates(mut self, start_coordinates: ::models::TripResponseStartCoordinates) -> TripResponseTrips {
    self.start_coordinates = Some(start_coordinates);
    self
  }

  pub fn start_coordinates(&self) -> Option<&::models::TripResponseStartCoordinates> {
    self.start_coordinates.as_ref()
  }

  pub fn reset_start_coordinates(&mut self) {
    self.start_coordinates = None;
  }

  pub fn set_start_location(&mut self, start_location: String) {
    self.start_location = Some(start_location);
  }

  pub fn with_start_location(mut self, start_location: String) -> TripResponseTrips {
    self.start_location = Some(start_location);
    self
  }

  pub fn start_location(&self) -> Option<&String> {
    self.start_location.as_ref()
  }

  pub fn reset_start_location(&mut self) {
    self.start_location = None;
  }

  pub fn set_start_ms(&mut self, start_ms: i32) {
    self.start_ms = Some(start_ms);
  }

  pub fn with_start_ms(mut self, start_ms: i32) -> TripResponseTrips {
    self.start_ms = Some(start_ms);
    self
  }

  pub fn start_ms(&self) -> Option<&i32> {
    self.start_ms.as_ref()
  }

  pub fn reset_start_ms(&mut self) {
    self.start_ms = None;
  }

  pub fn set_start_odometer(&mut self, start_odometer: i32) {
    self.start_odometer = Some(start_odometer);
  }

  pub fn with_start_odometer(mut self, start_odometer: i32) -> TripResponseTrips {
    self.start_odometer = Some(start_odometer);
    self
  }

  pub fn start_odometer(&self) -> Option<&i32> {
    self.start_odometer.as_ref()
  }

  pub fn reset_start_odometer(&mut self) {
    self.start_odometer = None;
  }

  pub fn set_toll_meters(&mut self, toll_meters: i32) {
    self.toll_meters = Some(toll_meters);
  }

  pub fn with_toll_meters(mut self, toll_meters: i32) -> TripResponseTrips {
    self.toll_meters = Some(toll_meters);
    self
  }

  pub fn toll_meters(&self) -> Option<&i32> {
    self.toll_meters.as_ref()
  }

  pub fn reset_toll_meters(&mut self) {
    self.toll_meters = None;
  }

}



