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
pub struct CreateDvirParam {
  /// Only type 'mechanic' is currently accepted.
  #[serde(rename = "inspectionType")]
  inspection_type: String,
  /// Any notes from the mechanic.
  #[serde(rename = "mechanicNotes")]
  mechanic_notes: Option<String>,
  /// The current odometer of the vehicle.
  #[serde(rename = "odometerMiles")]
  odometer_miles: Option<i32>,
  /// Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  #[serde(rename = "previousDefectsCorrected")]
  previous_defects_corrected: Option<bool>,
  /// Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  #[serde(rename = "previousDefectsIgnored")]
  previous_defects_ignored: Option<bool>,
  /// Whether or not this vehicle or trailer is safe to drive.
  #[serde(rename = "safe")]
  safe: String,
  /// Id of trailer being inspected. Either vehicleId or trailerId must be provided.
  #[serde(rename = "trailerId")]
  trailer_id: Option<i32>,
  /// The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
  #[serde(rename = "userEmail")]
  user_email: String,
  /// Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
  #[serde(rename = "vehicleId")]
  vehicle_id: Option<i32>
}

impl CreateDvirParam {
  pub fn new(inspection_type: String, safe: String, user_email: String) -> CreateDvirParam {
    CreateDvirParam {
      inspection_type: inspection_type,
      mechanic_notes: None,
      odometer_miles: None,
      previous_defects_corrected: None,
      previous_defects_ignored: None,
      safe: safe,
      trailer_id: None,
      user_email: user_email,
      vehicle_id: None
    }
  }

  pub fn set_inspection_type(&mut self, inspection_type: String) {
    self.inspection_type = inspection_type;
  }

  pub fn with_inspection_type(mut self, inspection_type: String) -> CreateDvirParam {
    self.inspection_type = inspection_type;
    self
  }

  pub fn inspection_type(&self) -> &String {
    &self.inspection_type
  }


  pub fn set_mechanic_notes(&mut self, mechanic_notes: String) {
    self.mechanic_notes = Some(mechanic_notes);
  }

  pub fn with_mechanic_notes(mut self, mechanic_notes: String) -> CreateDvirParam {
    self.mechanic_notes = Some(mechanic_notes);
    self
  }

  pub fn mechanic_notes(&self) -> Option<&String> {
    self.mechanic_notes.as_ref()
  }

  pub fn reset_mechanic_notes(&mut self) {
    self.mechanic_notes = None;
  }

  pub fn set_odometer_miles(&mut self, odometer_miles: i32) {
    self.odometer_miles = Some(odometer_miles);
  }

  pub fn with_odometer_miles(mut self, odometer_miles: i32) -> CreateDvirParam {
    self.odometer_miles = Some(odometer_miles);
    self
  }

  pub fn odometer_miles(&self) -> Option<&i32> {
    self.odometer_miles.as_ref()
  }

  pub fn reset_odometer_miles(&mut self) {
    self.odometer_miles = None;
  }

  pub fn set_previous_defects_corrected(&mut self, previous_defects_corrected: bool) {
    self.previous_defects_corrected = Some(previous_defects_corrected);
  }

  pub fn with_previous_defects_corrected(mut self, previous_defects_corrected: bool) -> CreateDvirParam {
    self.previous_defects_corrected = Some(previous_defects_corrected);
    self
  }

  pub fn previous_defects_corrected(&self) -> Option<&bool> {
    self.previous_defects_corrected.as_ref()
  }

  pub fn reset_previous_defects_corrected(&mut self) {
    self.previous_defects_corrected = None;
  }

  pub fn set_previous_defects_ignored(&mut self, previous_defects_ignored: bool) {
    self.previous_defects_ignored = Some(previous_defects_ignored);
  }

  pub fn with_previous_defects_ignored(mut self, previous_defects_ignored: bool) -> CreateDvirParam {
    self.previous_defects_ignored = Some(previous_defects_ignored);
    self
  }

  pub fn previous_defects_ignored(&self) -> Option<&bool> {
    self.previous_defects_ignored.as_ref()
  }

  pub fn reset_previous_defects_ignored(&mut self) {
    self.previous_defects_ignored = None;
  }

  pub fn set_safe(&mut self, safe: String) {
    self.safe = safe;
  }

  pub fn with_safe(mut self, safe: String) -> CreateDvirParam {
    self.safe = safe;
    self
  }

  pub fn safe(&self) -> &String {
    &self.safe
  }


  pub fn set_trailer_id(&mut self, trailer_id: i32) {
    self.trailer_id = Some(trailer_id);
  }

  pub fn with_trailer_id(mut self, trailer_id: i32) -> CreateDvirParam {
    self.trailer_id = Some(trailer_id);
    self
  }

  pub fn trailer_id(&self) -> Option<&i32> {
    self.trailer_id.as_ref()
  }

  pub fn reset_trailer_id(&mut self) {
    self.trailer_id = None;
  }

  pub fn set_user_email(&mut self, user_email: String) {
    self.user_email = user_email;
  }

  pub fn with_user_email(mut self, user_email: String) -> CreateDvirParam {
    self.user_email = user_email;
    self
  }

  pub fn user_email(&self) -> &String {
    &self.user_email
  }


  pub fn set_vehicle_id(&mut self, vehicle_id: i32) {
    self.vehicle_id = Some(vehicle_id);
  }

  pub fn with_vehicle_id(mut self, vehicle_id: i32) -> CreateDvirParam {
    self.vehicle_id = Some(vehicle_id);
    self
  }

  pub fn vehicle_id(&self) -> Option<&i32> {
    self.vehicle_id.as_ref()
  }

  pub fn reset_vehicle_id(&mut self) {
    self.vehicle_id = None;
  }

}



