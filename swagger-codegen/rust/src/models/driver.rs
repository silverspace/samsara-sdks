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
pub struct Driver {
  /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  #[serde(rename = "eldAdverseWeatherExemptionEnabled")]
  eld_adverse_weather_exemption_enabled: Option<bool>,
  /// Flag indicating this driver may use Big Day excemptions in ELD logs.
  #[serde(rename = "eldBigDayExemptionEnabled")]
  eld_big_day_exemption_enabled: Option<bool>,
  /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  #[serde(rename = "eldDayStartHour")]
  eld_day_start_hour: Option<i32>,
  /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
  #[serde(rename = "eldExempt")]
  eld_exempt: Option<bool>,
  /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  #[serde(rename = "eldExemptReason")]
  eld_exempt_reason: Option<String>,
  /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  #[serde(rename = "eldPcEnabled")]
  eld_pc_enabled: Option<bool>,
  /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
  #[serde(rename = "eldYmEnabled")]
  eld_ym_enabled: Option<bool>,
  /// Dictionary of external IDs (string key-value pairs)
  #[serde(rename = "externalIds")]
  external_ids: Option<::std::collections::HashMap<String, String>>,
  /// ID of the group if the organization has multiple groups (uncommon).
  #[serde(rename = "groupId")]
  group_id: Option<i64>,
  /// Driver's state issued license number.
  #[serde(rename = "licenseNumber")]
  license_number: Option<String>,
  /// Abbreviation of state that issued driver's license.
  #[serde(rename = "licenseState")]
  license_state: Option<String>,
  /// Driver's name.
  #[serde(rename = "name")]
  name: String,
  /// Notes about the driver.
  #[serde(rename = "notes")]
  notes: Option<String>,
  /// Driver's phone number. Please include only digits, ex. 4157771234
  #[serde(rename = "phone")]
  phone: Option<String>,
  /// Driver's login username into the driver app.
  #[serde(rename = "username")]
  username: Option<String>,
  /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  #[serde(rename = "vehicleId")]
  vehicle_id: Option<i64>,
  /// ID of the vehicle that this driver is currently assigned to. Omitted if there is no current vehicle assignment for this driver.
  #[serde(rename = "currentVehicleId")]
  current_vehicle_id: Option<i64>
}

impl Driver {
  pub fn new(name: String) -> Driver {
    Driver {
      eld_adverse_weather_exemption_enabled: None,
      eld_big_day_exemption_enabled: None,
      eld_day_start_hour: None,
      eld_exempt: None,
      eld_exempt_reason: None,
      eld_pc_enabled: None,
      eld_ym_enabled: None,
      external_ids: None,
      group_id: None,
      license_number: None,
      license_state: None,
      name: name,
      notes: None,
      phone: None,
      username: None,
      vehicle_id: None,
      current_vehicle_id: None
    }
  }

  pub fn set_eld_adverse_weather_exemption_enabled(&mut self, eld_adverse_weather_exemption_enabled: bool) {
    self.eld_adverse_weather_exemption_enabled = Some(eld_adverse_weather_exemption_enabled);
  }

  pub fn with_eld_adverse_weather_exemption_enabled(mut self, eld_adverse_weather_exemption_enabled: bool) -> Driver {
    self.eld_adverse_weather_exemption_enabled = Some(eld_adverse_weather_exemption_enabled);
    self
  }

  pub fn eld_adverse_weather_exemption_enabled(&self) -> Option<&bool> {
    self.eld_adverse_weather_exemption_enabled.as_ref()
  }

  pub fn reset_eld_adverse_weather_exemption_enabled(&mut self) {
    self.eld_adverse_weather_exemption_enabled = None;
  }

  pub fn set_eld_big_day_exemption_enabled(&mut self, eld_big_day_exemption_enabled: bool) {
    self.eld_big_day_exemption_enabled = Some(eld_big_day_exemption_enabled);
  }

  pub fn with_eld_big_day_exemption_enabled(mut self, eld_big_day_exemption_enabled: bool) -> Driver {
    self.eld_big_day_exemption_enabled = Some(eld_big_day_exemption_enabled);
    self
  }

  pub fn eld_big_day_exemption_enabled(&self) -> Option<&bool> {
    self.eld_big_day_exemption_enabled.as_ref()
  }

  pub fn reset_eld_big_day_exemption_enabled(&mut self) {
    self.eld_big_day_exemption_enabled = None;
  }

  pub fn set_eld_day_start_hour(&mut self, eld_day_start_hour: i32) {
    self.eld_day_start_hour = Some(eld_day_start_hour);
  }

  pub fn with_eld_day_start_hour(mut self, eld_day_start_hour: i32) -> Driver {
    self.eld_day_start_hour = Some(eld_day_start_hour);
    self
  }

  pub fn eld_day_start_hour(&self) -> Option<&i32> {
    self.eld_day_start_hour.as_ref()
  }

  pub fn reset_eld_day_start_hour(&mut self) {
    self.eld_day_start_hour = None;
  }

  pub fn set_eld_exempt(&mut self, eld_exempt: bool) {
    self.eld_exempt = Some(eld_exempt);
  }

  pub fn with_eld_exempt(mut self, eld_exempt: bool) -> Driver {
    self.eld_exempt = Some(eld_exempt);
    self
  }

  pub fn eld_exempt(&self) -> Option<&bool> {
    self.eld_exempt.as_ref()
  }

  pub fn reset_eld_exempt(&mut self) {
    self.eld_exempt = None;
  }

  pub fn set_eld_exempt_reason(&mut self, eld_exempt_reason: String) {
    self.eld_exempt_reason = Some(eld_exempt_reason);
  }

  pub fn with_eld_exempt_reason(mut self, eld_exempt_reason: String) -> Driver {
    self.eld_exempt_reason = Some(eld_exempt_reason);
    self
  }

  pub fn eld_exempt_reason(&self) -> Option<&String> {
    self.eld_exempt_reason.as_ref()
  }

  pub fn reset_eld_exempt_reason(&mut self) {
    self.eld_exempt_reason = None;
  }

  pub fn set_eld_pc_enabled(&mut self, eld_pc_enabled: bool) {
    self.eld_pc_enabled = Some(eld_pc_enabled);
  }

  pub fn with_eld_pc_enabled(mut self, eld_pc_enabled: bool) -> Driver {
    self.eld_pc_enabled = Some(eld_pc_enabled);
    self
  }

  pub fn eld_pc_enabled(&self) -> Option<&bool> {
    self.eld_pc_enabled.as_ref()
  }

  pub fn reset_eld_pc_enabled(&mut self) {
    self.eld_pc_enabled = None;
  }

  pub fn set_eld_ym_enabled(&mut self, eld_ym_enabled: bool) {
    self.eld_ym_enabled = Some(eld_ym_enabled);
  }

  pub fn with_eld_ym_enabled(mut self, eld_ym_enabled: bool) -> Driver {
    self.eld_ym_enabled = Some(eld_ym_enabled);
    self
  }

  pub fn eld_ym_enabled(&self) -> Option<&bool> {
    self.eld_ym_enabled.as_ref()
  }

  pub fn reset_eld_ym_enabled(&mut self) {
    self.eld_ym_enabled = None;
  }

  pub fn set_external_ids(&mut self, external_ids: ::std::collections::HashMap<String, String>) {
    self.external_ids = Some(external_ids);
  }

  pub fn with_external_ids(mut self, external_ids: ::std::collections::HashMap<String, String>) -> Driver {
    self.external_ids = Some(external_ids);
    self
  }

  pub fn external_ids(&self) -> Option<&::std::collections::HashMap<String, String>> {
    self.external_ids.as_ref()
  }

  pub fn reset_external_ids(&mut self) {
    self.external_ids = None;
  }

  pub fn set_group_id(&mut self, group_id: i64) {
    self.group_id = Some(group_id);
  }

  pub fn with_group_id(mut self, group_id: i64) -> Driver {
    self.group_id = Some(group_id);
    self
  }

  pub fn group_id(&self) -> Option<&i64> {
    self.group_id.as_ref()
  }

  pub fn reset_group_id(&mut self) {
    self.group_id = None;
  }

  pub fn set_license_number(&mut self, license_number: String) {
    self.license_number = Some(license_number);
  }

  pub fn with_license_number(mut self, license_number: String) -> Driver {
    self.license_number = Some(license_number);
    self
  }

  pub fn license_number(&self) -> Option<&String> {
    self.license_number.as_ref()
  }

  pub fn reset_license_number(&mut self) {
    self.license_number = None;
  }

  pub fn set_license_state(&mut self, license_state: String) {
    self.license_state = Some(license_state);
  }

  pub fn with_license_state(mut self, license_state: String) -> Driver {
    self.license_state = Some(license_state);
    self
  }

  pub fn license_state(&self) -> Option<&String> {
    self.license_state.as_ref()
  }

  pub fn reset_license_state(&mut self) {
    self.license_state = None;
  }

  pub fn set_name(&mut self, name: String) {
    self.name = name;
  }

  pub fn with_name(mut self, name: String) -> Driver {
    self.name = name;
    self
  }

  pub fn name(&self) -> &String {
    &self.name
  }


  pub fn set_notes(&mut self, notes: String) {
    self.notes = Some(notes);
  }

  pub fn with_notes(mut self, notes: String) -> Driver {
    self.notes = Some(notes);
    self
  }

  pub fn notes(&self) -> Option<&String> {
    self.notes.as_ref()
  }

  pub fn reset_notes(&mut self) {
    self.notes = None;
  }

  pub fn set_phone(&mut self, phone: String) {
    self.phone = Some(phone);
  }

  pub fn with_phone(mut self, phone: String) -> Driver {
    self.phone = Some(phone);
    self
  }

  pub fn phone(&self) -> Option<&String> {
    self.phone.as_ref()
  }

  pub fn reset_phone(&mut self) {
    self.phone = None;
  }

  pub fn set_username(&mut self, username: String) {
    self.username = Some(username);
  }

  pub fn with_username(mut self, username: String) -> Driver {
    self.username = Some(username);
    self
  }

  pub fn username(&self) -> Option<&String> {
    self.username.as_ref()
  }

  pub fn reset_username(&mut self) {
    self.username = None;
  }

  pub fn set_vehicle_id(&mut self, vehicle_id: i64) {
    self.vehicle_id = Some(vehicle_id);
  }

  pub fn with_vehicle_id(mut self, vehicle_id: i64) -> Driver {
    self.vehicle_id = Some(vehicle_id);
    self
  }

  pub fn vehicle_id(&self) -> Option<&i64> {
    self.vehicle_id.as_ref()
  }

  pub fn reset_vehicle_id(&mut self) {
    self.vehicle_id = None;
  }

  pub fn set_current_vehicle_id(&mut self, current_vehicle_id: i64) {
    self.current_vehicle_id = Some(current_vehicle_id);
  }

  pub fn with_current_vehicle_id(mut self, current_vehicle_id: i64) -> Driver {
    self.current_vehicle_id = Some(current_vehicle_id);
    self
  }

  pub fn current_vehicle_id(&self) -> Option<&i64> {
    self.current_vehicle_id.as_ref()
  }

  pub fn reset_current_vehicle_id(&mut self) {
    self.current_vehicle_id = None;
  }

}



