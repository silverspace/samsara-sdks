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
pub struct DispatchRoute {
  /// The time in Unix epoch milliseconds that the route actually ended.
  #[serde(rename = "actual_end_ms")]
  actual_end_ms: Option<i64>,
  /// The time in Unix epoch milliseconds that the route actually started.
  #[serde(rename = "actual_start_ms")]
  actual_start_ms: Option<i64>,
  /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  #[serde(rename = "driver_id")]
  driver_id: Option<i64>,
  /// ID of the group if the organization has multiple groups (optional).
  #[serde(rename = "group_id")]
  group_id: Option<i64>,
  /// Descriptive name of this route.
  #[serde(rename = "name")]
  name: String,
  /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  #[serde(rename = "scheduled_end_ms")]
  scheduled_end_ms: i64,
  /// The distance expected to be traveled for this route in meters.
  #[serde(rename = "scheduled_meters")]
  scheduled_meters: Option<i64>,
  /// The time in Unix epoch milliseconds that the route is scheduled to start.
  #[serde(rename = "scheduled_start_ms")]
  scheduled_start_ms: i64,
  /// The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  #[serde(rename = "start_location_address")]
  start_location_address: Option<String>,
  /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  #[serde(rename = "start_location_address_id")]
  start_location_address_id: Option<i64>,
  /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  #[serde(rename = "start_location_lat")]
  start_location_lat: Option<f64>,
  /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  #[serde(rename = "start_location_lng")]
  start_location_lng: Option<f64>,
  /// The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
  #[serde(rename = "start_location_name")]
  start_location_name: Option<String>,
  /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  #[serde(rename = "trailer_id")]
  trailer_id: Option<i64>,
  /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  #[serde(rename = "vehicle_id")]
  vehicle_id: Option<i64>,
  /// The dispatch jobs associated with this route.
  #[serde(rename = "dispatch_jobs")]
  dispatch_jobs: Vec<::models::DispatchJob>,
  /// ID of the Samsara dispatch route.
  #[serde(rename = "id")]
  id: i64
}

impl DispatchRoute {
  pub fn new(name: String, scheduled_end_ms: i64, scheduled_start_ms: i64, dispatch_jobs: Vec<::models::DispatchJob>, id: i64) -> DispatchRoute {
    DispatchRoute {
      actual_end_ms: None,
      actual_start_ms: None,
      driver_id: None,
      group_id: None,
      name: name,
      scheduled_end_ms: scheduled_end_ms,
      scheduled_meters: None,
      scheduled_start_ms: scheduled_start_ms,
      start_location_address: None,
      start_location_address_id: None,
      start_location_lat: None,
      start_location_lng: None,
      start_location_name: None,
      trailer_id: None,
      vehicle_id: None,
      dispatch_jobs: dispatch_jobs,
      id: id
    }
  }

  pub fn set_actual_end_ms(&mut self, actual_end_ms: i64) {
    self.actual_end_ms = Some(actual_end_ms);
  }

  pub fn with_actual_end_ms(mut self, actual_end_ms: i64) -> DispatchRoute {
    self.actual_end_ms = Some(actual_end_ms);
    self
  }

  pub fn actual_end_ms(&self) -> Option<&i64> {
    self.actual_end_ms.as_ref()
  }

  pub fn reset_actual_end_ms(&mut self) {
    self.actual_end_ms = None;
  }

  pub fn set_actual_start_ms(&mut self, actual_start_ms: i64) {
    self.actual_start_ms = Some(actual_start_ms);
  }

  pub fn with_actual_start_ms(mut self, actual_start_ms: i64) -> DispatchRoute {
    self.actual_start_ms = Some(actual_start_ms);
    self
  }

  pub fn actual_start_ms(&self) -> Option<&i64> {
    self.actual_start_ms.as_ref()
  }

  pub fn reset_actual_start_ms(&mut self) {
    self.actual_start_ms = None;
  }

  pub fn set_driver_id(&mut self, driver_id: i64) {
    self.driver_id = Some(driver_id);
  }

  pub fn with_driver_id(mut self, driver_id: i64) -> DispatchRoute {
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

  pub fn with_group_id(mut self, group_id: i64) -> DispatchRoute {
    self.group_id = Some(group_id);
    self
  }

  pub fn group_id(&self) -> Option<&i64> {
    self.group_id.as_ref()
  }

  pub fn reset_group_id(&mut self) {
    self.group_id = None;
  }

  pub fn set_name(&mut self, name: String) {
    self.name = name;
  }

  pub fn with_name(mut self, name: String) -> DispatchRoute {
    self.name = name;
    self
  }

  pub fn name(&self) -> &String {
    &self.name
  }


  pub fn set_scheduled_end_ms(&mut self, scheduled_end_ms: i64) {
    self.scheduled_end_ms = scheduled_end_ms;
  }

  pub fn with_scheduled_end_ms(mut self, scheduled_end_ms: i64) -> DispatchRoute {
    self.scheduled_end_ms = scheduled_end_ms;
    self
  }

  pub fn scheduled_end_ms(&self) -> &i64 {
    &self.scheduled_end_ms
  }


  pub fn set_scheduled_meters(&mut self, scheduled_meters: i64) {
    self.scheduled_meters = Some(scheduled_meters);
  }

  pub fn with_scheduled_meters(mut self, scheduled_meters: i64) -> DispatchRoute {
    self.scheduled_meters = Some(scheduled_meters);
    self
  }

  pub fn scheduled_meters(&self) -> Option<&i64> {
    self.scheduled_meters.as_ref()
  }

  pub fn reset_scheduled_meters(&mut self) {
    self.scheduled_meters = None;
  }

  pub fn set_scheduled_start_ms(&mut self, scheduled_start_ms: i64) {
    self.scheduled_start_ms = scheduled_start_ms;
  }

  pub fn with_scheduled_start_ms(mut self, scheduled_start_ms: i64) -> DispatchRoute {
    self.scheduled_start_ms = scheduled_start_ms;
    self
  }

  pub fn scheduled_start_ms(&self) -> &i64 {
    &self.scheduled_start_ms
  }


  pub fn set_start_location_address(&mut self, start_location_address: String) {
    self.start_location_address = Some(start_location_address);
  }

  pub fn with_start_location_address(mut self, start_location_address: String) -> DispatchRoute {
    self.start_location_address = Some(start_location_address);
    self
  }

  pub fn start_location_address(&self) -> Option<&String> {
    self.start_location_address.as_ref()
  }

  pub fn reset_start_location_address(&mut self) {
    self.start_location_address = None;
  }

  pub fn set_start_location_address_id(&mut self, start_location_address_id: i64) {
    self.start_location_address_id = Some(start_location_address_id);
  }

  pub fn with_start_location_address_id(mut self, start_location_address_id: i64) -> DispatchRoute {
    self.start_location_address_id = Some(start_location_address_id);
    self
  }

  pub fn start_location_address_id(&self) -> Option<&i64> {
    self.start_location_address_id.as_ref()
  }

  pub fn reset_start_location_address_id(&mut self) {
    self.start_location_address_id = None;
  }

  pub fn set_start_location_lat(&mut self, start_location_lat: f64) {
    self.start_location_lat = Some(start_location_lat);
  }

  pub fn with_start_location_lat(mut self, start_location_lat: f64) -> DispatchRoute {
    self.start_location_lat = Some(start_location_lat);
    self
  }

  pub fn start_location_lat(&self) -> Option<&f64> {
    self.start_location_lat.as_ref()
  }

  pub fn reset_start_location_lat(&mut self) {
    self.start_location_lat = None;
  }

  pub fn set_start_location_lng(&mut self, start_location_lng: f64) {
    self.start_location_lng = Some(start_location_lng);
  }

  pub fn with_start_location_lng(mut self, start_location_lng: f64) -> DispatchRoute {
    self.start_location_lng = Some(start_location_lng);
    self
  }

  pub fn start_location_lng(&self) -> Option<&f64> {
    self.start_location_lng.as_ref()
  }

  pub fn reset_start_location_lng(&mut self) {
    self.start_location_lng = None;
  }

  pub fn set_start_location_name(&mut self, start_location_name: String) {
    self.start_location_name = Some(start_location_name);
  }

  pub fn with_start_location_name(mut self, start_location_name: String) -> DispatchRoute {
    self.start_location_name = Some(start_location_name);
    self
  }

  pub fn start_location_name(&self) -> Option<&String> {
    self.start_location_name.as_ref()
  }

  pub fn reset_start_location_name(&mut self) {
    self.start_location_name = None;
  }

  pub fn set_trailer_id(&mut self, trailer_id: i64) {
    self.trailer_id = Some(trailer_id);
  }

  pub fn with_trailer_id(mut self, trailer_id: i64) -> DispatchRoute {
    self.trailer_id = Some(trailer_id);
    self
  }

  pub fn trailer_id(&self) -> Option<&i64> {
    self.trailer_id.as_ref()
  }

  pub fn reset_trailer_id(&mut self) {
    self.trailer_id = None;
  }

  pub fn set_vehicle_id(&mut self, vehicle_id: i64) {
    self.vehicle_id = Some(vehicle_id);
  }

  pub fn with_vehicle_id(mut self, vehicle_id: i64) -> DispatchRoute {
    self.vehicle_id = Some(vehicle_id);
    self
  }

  pub fn vehicle_id(&self) -> Option<&i64> {
    self.vehicle_id.as_ref()
  }

  pub fn reset_vehicle_id(&mut self) {
    self.vehicle_id = None;
  }

  pub fn set_dispatch_jobs(&mut self, dispatch_jobs: Vec<::models::DispatchJob>) {
    self.dispatch_jobs = dispatch_jobs;
  }

  pub fn with_dispatch_jobs(mut self, dispatch_jobs: Vec<::models::DispatchJob>) -> DispatchRoute {
    self.dispatch_jobs = dispatch_jobs;
    self
  }

  pub fn dispatch_jobs(&self) -> &Vec<::models::DispatchJob> {
    &self.dispatch_jobs
  }


  pub fn set_id(&mut self, id: i64) {
    self.id = id;
  }

  pub fn with_id(mut self, id: i64) -> DispatchRoute {
    self.id = id;
    self
  }

  pub fn id(&self) -> &i64 {
    &self.id
  }


}



