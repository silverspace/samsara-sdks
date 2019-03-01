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
pub struct DvirBase {
  #[serde(rename = "authorSignature")]
  author_signature: Option<::models::DvirBaseAuthorSignature>,
  /// Signifies if the defects on the vehicle corrected after the DVIR is done.
  #[serde(rename = "defectsCorrected")]
  defects_corrected: Option<bool>,
  /// Signifies if the defects on this vehicle can be ignored.
  #[serde(rename = "defectsNeedNotBeCorrected")]
  defects_need_not_be_corrected: Option<bool>,
  /// The id of this DVIR record.
  #[serde(rename = "id")]
  id: Option<i64>,
  /// Inspection type of the DVIR.
  #[serde(rename = "inspectionType")]
  inspection_type: Option<String>,
  /// The mechanics notes on the DVIR.
  #[serde(rename = "mechanicNotes")]
  mechanic_notes: Option<String>,
  #[serde(rename = "mechanicOrAgentSignature")]
  mechanic_or_agent_signature: Option<::models::DvirBaseMechanicOrAgentSignature>,
  #[serde(rename = "nextDriverSignature")]
  next_driver_signature: Option<::models::DvirBaseNextDriverSignature>,
  /// The odometer reading in miles for the vehicle when the DVIR was done.
  #[serde(rename = "odometerMiles")]
  odometer_miles: Option<i64>,
  /// Timestamp of this DVIR in UNIX milliseconds.
  #[serde(rename = "timeMs")]
  time_ms: Option<i64>,
  /// Defects registered for the trailer which was part of the DVIR.
  #[serde(rename = "trailerDefects")]
  trailer_defects: Option<Vec<::models::DvirBaseTrailerDefects>>,
  /// The id of the trailer which was part of the DVIR.
  #[serde(rename = "trailerId")]
  trailer_id: Option<i32>,
  /// The name of the trailer which was part of the DVIR.
  #[serde(rename = "trailerName")]
  trailer_name: Option<String>,
  #[serde(rename = "vehicle")]
  vehicle: Option<::models::DvirBaseVehicle>,
  /// The condition of vechile on which DVIR was done.
  #[serde(rename = "vehicleCondition")]
  vehicle_condition: Option<String>,
  /// Defects registered for the vehicle which was part of the DVIR.
  #[serde(rename = "vehicleDefects")]
  vehicle_defects: Option<Vec<::models::DvirBaseTrailerDefects>>
}

impl DvirBase {
  pub fn new() -> DvirBase {
    DvirBase {
      author_signature: None,
      defects_corrected: None,
      defects_need_not_be_corrected: None,
      id: None,
      inspection_type: None,
      mechanic_notes: None,
      mechanic_or_agent_signature: None,
      next_driver_signature: None,
      odometer_miles: None,
      time_ms: None,
      trailer_defects: None,
      trailer_id: None,
      trailer_name: None,
      vehicle: None,
      vehicle_condition: None,
      vehicle_defects: None
    }
  }

  pub fn set_author_signature(&mut self, author_signature: ::models::DvirBaseAuthorSignature) {
    self.author_signature = Some(author_signature);
  }

  pub fn with_author_signature(mut self, author_signature: ::models::DvirBaseAuthorSignature) -> DvirBase {
    self.author_signature = Some(author_signature);
    self
  }

  pub fn author_signature(&self) -> Option<&::models::DvirBaseAuthorSignature> {
    self.author_signature.as_ref()
  }

  pub fn reset_author_signature(&mut self) {
    self.author_signature = None;
  }

  pub fn set_defects_corrected(&mut self, defects_corrected: bool) {
    self.defects_corrected = Some(defects_corrected);
  }

  pub fn with_defects_corrected(mut self, defects_corrected: bool) -> DvirBase {
    self.defects_corrected = Some(defects_corrected);
    self
  }

  pub fn defects_corrected(&self) -> Option<&bool> {
    self.defects_corrected.as_ref()
  }

  pub fn reset_defects_corrected(&mut self) {
    self.defects_corrected = None;
  }

  pub fn set_defects_need_not_be_corrected(&mut self, defects_need_not_be_corrected: bool) {
    self.defects_need_not_be_corrected = Some(defects_need_not_be_corrected);
  }

  pub fn with_defects_need_not_be_corrected(mut self, defects_need_not_be_corrected: bool) -> DvirBase {
    self.defects_need_not_be_corrected = Some(defects_need_not_be_corrected);
    self
  }

  pub fn defects_need_not_be_corrected(&self) -> Option<&bool> {
    self.defects_need_not_be_corrected.as_ref()
  }

  pub fn reset_defects_need_not_be_corrected(&mut self) {
    self.defects_need_not_be_corrected = None;
  }

  pub fn set_id(&mut self, id: i64) {
    self.id = Some(id);
  }

  pub fn with_id(mut self, id: i64) -> DvirBase {
    self.id = Some(id);
    self
  }

  pub fn id(&self) -> Option<&i64> {
    self.id.as_ref()
  }

  pub fn reset_id(&mut self) {
    self.id = None;
  }

  pub fn set_inspection_type(&mut self, inspection_type: String) {
    self.inspection_type = Some(inspection_type);
  }

  pub fn with_inspection_type(mut self, inspection_type: String) -> DvirBase {
    self.inspection_type = Some(inspection_type);
    self
  }

  pub fn inspection_type(&self) -> Option<&String> {
    self.inspection_type.as_ref()
  }

  pub fn reset_inspection_type(&mut self) {
    self.inspection_type = None;
  }

  pub fn set_mechanic_notes(&mut self, mechanic_notes: String) {
    self.mechanic_notes = Some(mechanic_notes);
  }

  pub fn with_mechanic_notes(mut self, mechanic_notes: String) -> DvirBase {
    self.mechanic_notes = Some(mechanic_notes);
    self
  }

  pub fn mechanic_notes(&self) -> Option<&String> {
    self.mechanic_notes.as_ref()
  }

  pub fn reset_mechanic_notes(&mut self) {
    self.mechanic_notes = None;
  }

  pub fn set_mechanic_or_agent_signature(&mut self, mechanic_or_agent_signature: ::models::DvirBaseMechanicOrAgentSignature) {
    self.mechanic_or_agent_signature = Some(mechanic_or_agent_signature);
  }

  pub fn with_mechanic_or_agent_signature(mut self, mechanic_or_agent_signature: ::models::DvirBaseMechanicOrAgentSignature) -> DvirBase {
    self.mechanic_or_agent_signature = Some(mechanic_or_agent_signature);
    self
  }

  pub fn mechanic_or_agent_signature(&self) -> Option<&::models::DvirBaseMechanicOrAgentSignature> {
    self.mechanic_or_agent_signature.as_ref()
  }

  pub fn reset_mechanic_or_agent_signature(&mut self) {
    self.mechanic_or_agent_signature = None;
  }

  pub fn set_next_driver_signature(&mut self, next_driver_signature: ::models::DvirBaseNextDriverSignature) {
    self.next_driver_signature = Some(next_driver_signature);
  }

  pub fn with_next_driver_signature(mut self, next_driver_signature: ::models::DvirBaseNextDriverSignature) -> DvirBase {
    self.next_driver_signature = Some(next_driver_signature);
    self
  }

  pub fn next_driver_signature(&self) -> Option<&::models::DvirBaseNextDriverSignature> {
    self.next_driver_signature.as_ref()
  }

  pub fn reset_next_driver_signature(&mut self) {
    self.next_driver_signature = None;
  }

  pub fn set_odometer_miles(&mut self, odometer_miles: i64) {
    self.odometer_miles = Some(odometer_miles);
  }

  pub fn with_odometer_miles(mut self, odometer_miles: i64) -> DvirBase {
    self.odometer_miles = Some(odometer_miles);
    self
  }

  pub fn odometer_miles(&self) -> Option<&i64> {
    self.odometer_miles.as_ref()
  }

  pub fn reset_odometer_miles(&mut self) {
    self.odometer_miles = None;
  }

  pub fn set_time_ms(&mut self, time_ms: i64) {
    self.time_ms = Some(time_ms);
  }

  pub fn with_time_ms(mut self, time_ms: i64) -> DvirBase {
    self.time_ms = Some(time_ms);
    self
  }

  pub fn time_ms(&self) -> Option<&i64> {
    self.time_ms.as_ref()
  }

  pub fn reset_time_ms(&mut self) {
    self.time_ms = None;
  }

  pub fn set_trailer_defects(&mut self, trailer_defects: Vec<::models::DvirBaseTrailerDefects>) {
    self.trailer_defects = Some(trailer_defects);
  }

  pub fn with_trailer_defects(mut self, trailer_defects: Vec<::models::DvirBaseTrailerDefects>) -> DvirBase {
    self.trailer_defects = Some(trailer_defects);
    self
  }

  pub fn trailer_defects(&self) -> Option<&Vec<::models::DvirBaseTrailerDefects>> {
    self.trailer_defects.as_ref()
  }

  pub fn reset_trailer_defects(&mut self) {
    self.trailer_defects = None;
  }

  pub fn set_trailer_id(&mut self, trailer_id: i32) {
    self.trailer_id = Some(trailer_id);
  }

  pub fn with_trailer_id(mut self, trailer_id: i32) -> DvirBase {
    self.trailer_id = Some(trailer_id);
    self
  }

  pub fn trailer_id(&self) -> Option<&i32> {
    self.trailer_id.as_ref()
  }

  pub fn reset_trailer_id(&mut self) {
    self.trailer_id = None;
  }

  pub fn set_trailer_name(&mut self, trailer_name: String) {
    self.trailer_name = Some(trailer_name);
  }

  pub fn with_trailer_name(mut self, trailer_name: String) -> DvirBase {
    self.trailer_name = Some(trailer_name);
    self
  }

  pub fn trailer_name(&self) -> Option<&String> {
    self.trailer_name.as_ref()
  }

  pub fn reset_trailer_name(&mut self) {
    self.trailer_name = None;
  }

  pub fn set_vehicle(&mut self, vehicle: ::models::DvirBaseVehicle) {
    self.vehicle = Some(vehicle);
  }

  pub fn with_vehicle(mut self, vehicle: ::models::DvirBaseVehicle) -> DvirBase {
    self.vehicle = Some(vehicle);
    self
  }

  pub fn vehicle(&self) -> Option<&::models::DvirBaseVehicle> {
    self.vehicle.as_ref()
  }

  pub fn reset_vehicle(&mut self) {
    self.vehicle = None;
  }

  pub fn set_vehicle_condition(&mut self, vehicle_condition: String) {
    self.vehicle_condition = Some(vehicle_condition);
  }

  pub fn with_vehicle_condition(mut self, vehicle_condition: String) -> DvirBase {
    self.vehicle_condition = Some(vehicle_condition);
    self
  }

  pub fn vehicle_condition(&self) -> Option<&String> {
    self.vehicle_condition.as_ref()
  }

  pub fn reset_vehicle_condition(&mut self) {
    self.vehicle_condition = None;
  }

  pub fn set_vehicle_defects(&mut self, vehicle_defects: Vec<::models::DvirBaseTrailerDefects>) {
    self.vehicle_defects = Some(vehicle_defects);
  }

  pub fn with_vehicle_defects(mut self, vehicle_defects: Vec<::models::DvirBaseTrailerDefects>) -> DvirBase {
    self.vehicle_defects = Some(vehicle_defects);
    self
  }

  pub fn vehicle_defects(&self) -> Option<&Vec<::models::DvirBaseTrailerDefects>> {
    self.vehicle_defects.as_ref()
  }

  pub fn reset_vehicle_defects(&mut self) {
    self.vehicle_defects = None;
  }

}



