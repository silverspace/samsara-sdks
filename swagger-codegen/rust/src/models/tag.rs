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
pub struct Tag {
  /// The addresses that belong to this tag.
  #[serde(rename = "addresses")]
  addresses: Option<Vec<::models::TaggedAddress>>,
  /// The assets that belong to this tag.
  #[serde(rename = "assets")]
  assets: Option<Vec<::models::TaggedAsset>>,
  /// The drivers that belong to this tag.
  #[serde(rename = "drivers")]
  drivers: Option<Vec<::models::TaggedDriver>>,
  /// The GroupID that this tag belongs to.
  #[serde(rename = "groupId")]
  group_id: Option<i64>,
  /// The ID of this tag.
  #[serde(rename = "id")]
  id: i64,
  /// The machines that belong to this tag.
  #[serde(rename = "machines")]
  machines: Option<Vec<::models::TaggedMachine>>,
  /// Name of this tag.
  #[serde(rename = "name")]
  name: String,
  /// If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
  #[serde(rename = "parentTagId")]
  parent_tag_id: Option<i64>,
  /// The sensors that belong to this tag.
  #[serde(rename = "sensors")]
  sensors: Option<Vec<::models::TaggedSensor>>,
  /// The vehicles that belong to this tag.
  #[serde(rename = "vehicles")]
  vehicles: Option<Vec<::models::TaggedVehicle>>
}

impl Tag {
  pub fn new(id: i64, name: String) -> Tag {
    Tag {
      addresses: None,
      assets: None,
      drivers: None,
      group_id: None,
      id: id,
      machines: None,
      name: name,
      parent_tag_id: None,
      sensors: None,
      vehicles: None
    }
  }

  pub fn set_addresses(&mut self, addresses: Vec<::models::TaggedAddress>) {
    self.addresses = Some(addresses);
  }

  pub fn with_addresses(mut self, addresses: Vec<::models::TaggedAddress>) -> Tag {
    self.addresses = Some(addresses);
    self
  }

  pub fn addresses(&self) -> Option<&Vec<::models::TaggedAddress>> {
    self.addresses.as_ref()
  }

  pub fn reset_addresses(&mut self) {
    self.addresses = None;
  }

  pub fn set_assets(&mut self, assets: Vec<::models::TaggedAsset>) {
    self.assets = Some(assets);
  }

  pub fn with_assets(mut self, assets: Vec<::models::TaggedAsset>) -> Tag {
    self.assets = Some(assets);
    self
  }

  pub fn assets(&self) -> Option<&Vec<::models::TaggedAsset>> {
    self.assets.as_ref()
  }

  pub fn reset_assets(&mut self) {
    self.assets = None;
  }

  pub fn set_drivers(&mut self, drivers: Vec<::models::TaggedDriver>) {
    self.drivers = Some(drivers);
  }

  pub fn with_drivers(mut self, drivers: Vec<::models::TaggedDriver>) -> Tag {
    self.drivers = Some(drivers);
    self
  }

  pub fn drivers(&self) -> Option<&Vec<::models::TaggedDriver>> {
    self.drivers.as_ref()
  }

  pub fn reset_drivers(&mut self) {
    self.drivers = None;
  }

  pub fn set_group_id(&mut self, group_id: i64) {
    self.group_id = Some(group_id);
  }

  pub fn with_group_id(mut self, group_id: i64) -> Tag {
    self.group_id = Some(group_id);
    self
  }

  pub fn group_id(&self) -> Option<&i64> {
    self.group_id.as_ref()
  }

  pub fn reset_group_id(&mut self) {
    self.group_id = None;
  }

  pub fn set_id(&mut self, id: i64) {
    self.id = id;
  }

  pub fn with_id(mut self, id: i64) -> Tag {
    self.id = id;
    self
  }

  pub fn id(&self) -> &i64 {
    &self.id
  }


  pub fn set_machines(&mut self, machines: Vec<::models::TaggedMachine>) {
    self.machines = Some(machines);
  }

  pub fn with_machines(mut self, machines: Vec<::models::TaggedMachine>) -> Tag {
    self.machines = Some(machines);
    self
  }

  pub fn machines(&self) -> Option<&Vec<::models::TaggedMachine>> {
    self.machines.as_ref()
  }

  pub fn reset_machines(&mut self) {
    self.machines = None;
  }

  pub fn set_name(&mut self, name: String) {
    self.name = name;
  }

  pub fn with_name(mut self, name: String) -> Tag {
    self.name = name;
    self
  }

  pub fn name(&self) -> &String {
    &self.name
  }


  pub fn set_parent_tag_id(&mut self, parent_tag_id: i64) {
    self.parent_tag_id = Some(parent_tag_id);
  }

  pub fn with_parent_tag_id(mut self, parent_tag_id: i64) -> Tag {
    self.parent_tag_id = Some(parent_tag_id);
    self
  }

  pub fn parent_tag_id(&self) -> Option<&i64> {
    self.parent_tag_id.as_ref()
  }

  pub fn reset_parent_tag_id(&mut self) {
    self.parent_tag_id = None;
  }

  pub fn set_sensors(&mut self, sensors: Vec<::models::TaggedSensor>) {
    self.sensors = Some(sensors);
  }

  pub fn with_sensors(mut self, sensors: Vec<::models::TaggedSensor>) -> Tag {
    self.sensors = Some(sensors);
    self
  }

  pub fn sensors(&self) -> Option<&Vec<::models::TaggedSensor>> {
    self.sensors.as_ref()
  }

  pub fn reset_sensors(&mut self) {
    self.sensors = None;
  }

  pub fn set_vehicles(&mut self, vehicles: Vec<::models::TaggedVehicle>) {
    self.vehicles = Some(vehicles);
  }

  pub fn with_vehicles(mut self, vehicles: Vec<::models::TaggedVehicle>) -> Tag {
    self.vehicles = Some(vehicles);
    self
  }

  pub fn vehicles(&self) -> Option<&Vec<::models::TaggedVehicle>> {
    self.vehicles.as_ref()
  }

  pub fn reset_vehicles(&mut self) {
    self.vehicles = None;
  }

}



