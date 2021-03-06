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
pub struct DispatchJob {
  /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
  #[serde(rename = "destination_address")]
  destination_address: Option<String>,
  /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
  #[serde(rename = "destination_address_id")]
  destination_address_id: Option<i64>,
  /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  #[serde(rename = "destination_lat")]
  destination_lat: Option<f64>,
  /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  #[serde(rename = "destination_lng")]
  destination_lng: Option<f64>,
  /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
  #[serde(rename = "destination_name")]
  destination_name: Option<String>,
  /// Notes regarding the details of this job.
  #[serde(rename = "notes")]
  notes: Option<String>,
  /// The time at which the assigned driver is scheduled to arrive at the job destination.
  #[serde(rename = "scheduled_arrival_time_ms")]
  scheduled_arrival_time_ms: i64,
  /// The time at which the assigned driver is scheduled to depart from the job destination.
  #[serde(rename = "scheduled_departure_time_ms")]
  scheduled_departure_time_ms: Option<i64>,
  /// The time at which the driver arrived at the job destination.
  #[serde(rename = "arrived_at_ms")]
  arrived_at_ms: Option<i64>,
  /// The time at which the job was marked complete (e.g. started driving to the next destination).
  #[serde(rename = "completed_at_ms")]
  completed_at_ms: Option<i64>,
  /// ID of the route that this job belongs to.
  #[serde(rename = "dispatch_route_id")]
  dispatch_route_id: i64,
  /// ID of the driver assigned to the dispatch job.
  #[serde(rename = "driver_id")]
  driver_id: Option<i64>,
  /// The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
  #[serde(rename = "en_route_at_ms")]
  en_route_at_ms: Option<i64>,
  /// The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
  #[serde(rename = "estimated_arrival_ms")]
  estimated_arrival_ms: Option<i64>,
  /// Fleet viewer url of the dispatch job.
  #[serde(rename = "fleet_viewer_url")]
  fleet_viewer_url: Option<String>,
  #[serde(rename = "group_id")]
  group_id: i64,
  /// ID of the Samsara dispatch job.
  #[serde(rename = "id")]
  id: i64,
  #[serde(rename = "job_state")]
  job_state: ::models::JobStatus,
  /// The time at which the job was marked skipped.
  #[serde(rename = "skipped_at_ms")]
  skipped_at_ms: Option<i64>,
  /// ID of the vehicle used for the dispatch job.
  #[serde(rename = "vehicle_id")]
  vehicle_id: Option<i64>
}

impl DispatchJob {
  pub fn new(scheduled_arrival_time_ms: i64, dispatch_route_id: i64, group_id: i64, id: i64, job_state: ::models::JobStatus) -> DispatchJob {
    DispatchJob {
      destination_address: None,
      destination_address_id: None,
      destination_lat: None,
      destination_lng: None,
      destination_name: None,
      notes: None,
      scheduled_arrival_time_ms: scheduled_arrival_time_ms,
      scheduled_departure_time_ms: None,
      arrived_at_ms: None,
      completed_at_ms: None,
      dispatch_route_id: dispatch_route_id,
      driver_id: None,
      en_route_at_ms: None,
      estimated_arrival_ms: None,
      fleet_viewer_url: None,
      group_id: group_id,
      id: id,
      job_state: job_state,
      skipped_at_ms: None,
      vehicle_id: None
    }
  }

  pub fn set_destination_address(&mut self, destination_address: String) {
    self.destination_address = Some(destination_address);
  }

  pub fn with_destination_address(mut self, destination_address: String) -> DispatchJob {
    self.destination_address = Some(destination_address);
    self
  }

  pub fn destination_address(&self) -> Option<&String> {
    self.destination_address.as_ref()
  }

  pub fn reset_destination_address(&mut self) {
    self.destination_address = None;
  }

  pub fn set_destination_address_id(&mut self, destination_address_id: i64) {
    self.destination_address_id = Some(destination_address_id);
  }

  pub fn with_destination_address_id(mut self, destination_address_id: i64) -> DispatchJob {
    self.destination_address_id = Some(destination_address_id);
    self
  }

  pub fn destination_address_id(&self) -> Option<&i64> {
    self.destination_address_id.as_ref()
  }

  pub fn reset_destination_address_id(&mut self) {
    self.destination_address_id = None;
  }

  pub fn set_destination_lat(&mut self, destination_lat: f64) {
    self.destination_lat = Some(destination_lat);
  }

  pub fn with_destination_lat(mut self, destination_lat: f64) -> DispatchJob {
    self.destination_lat = Some(destination_lat);
    self
  }

  pub fn destination_lat(&self) -> Option<&f64> {
    self.destination_lat.as_ref()
  }

  pub fn reset_destination_lat(&mut self) {
    self.destination_lat = None;
  }

  pub fn set_destination_lng(&mut self, destination_lng: f64) {
    self.destination_lng = Some(destination_lng);
  }

  pub fn with_destination_lng(mut self, destination_lng: f64) -> DispatchJob {
    self.destination_lng = Some(destination_lng);
    self
  }

  pub fn destination_lng(&self) -> Option<&f64> {
    self.destination_lng.as_ref()
  }

  pub fn reset_destination_lng(&mut self) {
    self.destination_lng = None;
  }

  pub fn set_destination_name(&mut self, destination_name: String) {
    self.destination_name = Some(destination_name);
  }

  pub fn with_destination_name(mut self, destination_name: String) -> DispatchJob {
    self.destination_name = Some(destination_name);
    self
  }

  pub fn destination_name(&self) -> Option<&String> {
    self.destination_name.as_ref()
  }

  pub fn reset_destination_name(&mut self) {
    self.destination_name = None;
  }

  pub fn set_notes(&mut self, notes: String) {
    self.notes = Some(notes);
  }

  pub fn with_notes(mut self, notes: String) -> DispatchJob {
    self.notes = Some(notes);
    self
  }

  pub fn notes(&self) -> Option<&String> {
    self.notes.as_ref()
  }

  pub fn reset_notes(&mut self) {
    self.notes = None;
  }

  pub fn set_scheduled_arrival_time_ms(&mut self, scheduled_arrival_time_ms: i64) {
    self.scheduled_arrival_time_ms = scheduled_arrival_time_ms;
  }

  pub fn with_scheduled_arrival_time_ms(mut self, scheduled_arrival_time_ms: i64) -> DispatchJob {
    self.scheduled_arrival_time_ms = scheduled_arrival_time_ms;
    self
  }

  pub fn scheduled_arrival_time_ms(&self) -> &i64 {
    &self.scheduled_arrival_time_ms
  }


  pub fn set_scheduled_departure_time_ms(&mut self, scheduled_departure_time_ms: i64) {
    self.scheduled_departure_time_ms = Some(scheduled_departure_time_ms);
  }

  pub fn with_scheduled_departure_time_ms(mut self, scheduled_departure_time_ms: i64) -> DispatchJob {
    self.scheduled_departure_time_ms = Some(scheduled_departure_time_ms);
    self
  }

  pub fn scheduled_departure_time_ms(&self) -> Option<&i64> {
    self.scheduled_departure_time_ms.as_ref()
  }

  pub fn reset_scheduled_departure_time_ms(&mut self) {
    self.scheduled_departure_time_ms = None;
  }

  pub fn set_arrived_at_ms(&mut self, arrived_at_ms: i64) {
    self.arrived_at_ms = Some(arrived_at_ms);
  }

  pub fn with_arrived_at_ms(mut self, arrived_at_ms: i64) -> DispatchJob {
    self.arrived_at_ms = Some(arrived_at_ms);
    self
  }

  pub fn arrived_at_ms(&self) -> Option<&i64> {
    self.arrived_at_ms.as_ref()
  }

  pub fn reset_arrived_at_ms(&mut self) {
    self.arrived_at_ms = None;
  }

  pub fn set_completed_at_ms(&mut self, completed_at_ms: i64) {
    self.completed_at_ms = Some(completed_at_ms);
  }

  pub fn with_completed_at_ms(mut self, completed_at_ms: i64) -> DispatchJob {
    self.completed_at_ms = Some(completed_at_ms);
    self
  }

  pub fn completed_at_ms(&self) -> Option<&i64> {
    self.completed_at_ms.as_ref()
  }

  pub fn reset_completed_at_ms(&mut self) {
    self.completed_at_ms = None;
  }

  pub fn set_dispatch_route_id(&mut self, dispatch_route_id: i64) {
    self.dispatch_route_id = dispatch_route_id;
  }

  pub fn with_dispatch_route_id(mut self, dispatch_route_id: i64) -> DispatchJob {
    self.dispatch_route_id = dispatch_route_id;
    self
  }

  pub fn dispatch_route_id(&self) -> &i64 {
    &self.dispatch_route_id
  }


  pub fn set_driver_id(&mut self, driver_id: i64) {
    self.driver_id = Some(driver_id);
  }

  pub fn with_driver_id(mut self, driver_id: i64) -> DispatchJob {
    self.driver_id = Some(driver_id);
    self
  }

  pub fn driver_id(&self) -> Option<&i64> {
    self.driver_id.as_ref()
  }

  pub fn reset_driver_id(&mut self) {
    self.driver_id = None;
  }

  pub fn set_en_route_at_ms(&mut self, en_route_at_ms: i64) {
    self.en_route_at_ms = Some(en_route_at_ms);
  }

  pub fn with_en_route_at_ms(mut self, en_route_at_ms: i64) -> DispatchJob {
    self.en_route_at_ms = Some(en_route_at_ms);
    self
  }

  pub fn en_route_at_ms(&self) -> Option<&i64> {
    self.en_route_at_ms.as_ref()
  }

  pub fn reset_en_route_at_ms(&mut self) {
    self.en_route_at_ms = None;
  }

  pub fn set_estimated_arrival_ms(&mut self, estimated_arrival_ms: i64) {
    self.estimated_arrival_ms = Some(estimated_arrival_ms);
  }

  pub fn with_estimated_arrival_ms(mut self, estimated_arrival_ms: i64) -> DispatchJob {
    self.estimated_arrival_ms = Some(estimated_arrival_ms);
    self
  }

  pub fn estimated_arrival_ms(&self) -> Option<&i64> {
    self.estimated_arrival_ms.as_ref()
  }

  pub fn reset_estimated_arrival_ms(&mut self) {
    self.estimated_arrival_ms = None;
  }

  pub fn set_fleet_viewer_url(&mut self, fleet_viewer_url: String) {
    self.fleet_viewer_url = Some(fleet_viewer_url);
  }

  pub fn with_fleet_viewer_url(mut self, fleet_viewer_url: String) -> DispatchJob {
    self.fleet_viewer_url = Some(fleet_viewer_url);
    self
  }

  pub fn fleet_viewer_url(&self) -> Option<&String> {
    self.fleet_viewer_url.as_ref()
  }

  pub fn reset_fleet_viewer_url(&mut self) {
    self.fleet_viewer_url = None;
  }

  pub fn set_group_id(&mut self, group_id: i64) {
    self.group_id = group_id;
  }

  pub fn with_group_id(mut self, group_id: i64) -> DispatchJob {
    self.group_id = group_id;
    self
  }

  pub fn group_id(&self) -> &i64 {
    &self.group_id
  }


  pub fn set_id(&mut self, id: i64) {
    self.id = id;
  }

  pub fn with_id(mut self, id: i64) -> DispatchJob {
    self.id = id;
    self
  }

  pub fn id(&self) -> &i64 {
    &self.id
  }


  pub fn set_job_state(&mut self, job_state: ::models::JobStatus) {
    self.job_state = job_state;
  }

  pub fn with_job_state(mut self, job_state: ::models::JobStatus) -> DispatchJob {
    self.job_state = job_state;
    self
  }

  pub fn job_state(&self) -> &::models::JobStatus {
    &self.job_state
  }


  pub fn set_skipped_at_ms(&mut self, skipped_at_ms: i64) {
    self.skipped_at_ms = Some(skipped_at_ms);
  }

  pub fn with_skipped_at_ms(mut self, skipped_at_ms: i64) -> DispatchJob {
    self.skipped_at_ms = Some(skipped_at_ms);
    self
  }

  pub fn skipped_at_ms(&self) -> Option<&i64> {
    self.skipped_at_ms.as_ref()
  }

  pub fn reset_skipped_at_ms(&mut self) {
    self.skipped_at_ms = None;
  }

  pub fn set_vehicle_id(&mut self, vehicle_id: i64) {
    self.vehicle_id = Some(vehicle_id);
  }

  pub fn with_vehicle_id(mut self, vehicle_id: i64) -> DispatchJob {
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



