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
pub struct JobUpdateObject {
  /// Timestamp that this event was updated, represented as Unix milliseconds since epoch.
  #[serde(rename = "changed_at_ms")]
  changed_at_ms: Option<i64>,
  /// ID of the Samsara job.
  #[serde(rename = "job_id")]
  job_id: Option<i64>,
  #[serde(rename = "job_state")]
  job_state: Option<::models::JobStatus>,
  #[serde(rename = "prev_job_state")]
  prev_job_state: Option<::models::PrevJobStatus>,
  #[serde(rename = "route")]
  route: Option<::models::DispatchRoute>,
  /// ID of the Samsara dispatch route.
  #[serde(rename = "route_id")]
  route_id: Option<i64>
}

impl JobUpdateObject {
  pub fn new() -> JobUpdateObject {
    JobUpdateObject {
      changed_at_ms: None,
      job_id: None,
      job_state: None,
      prev_job_state: None,
      route: None,
      route_id: None
    }
  }

  pub fn set_changed_at_ms(&mut self, changed_at_ms: i64) {
    self.changed_at_ms = Some(changed_at_ms);
  }

  pub fn with_changed_at_ms(mut self, changed_at_ms: i64) -> JobUpdateObject {
    self.changed_at_ms = Some(changed_at_ms);
    self
  }

  pub fn changed_at_ms(&self) -> Option<&i64> {
    self.changed_at_ms.as_ref()
  }

  pub fn reset_changed_at_ms(&mut self) {
    self.changed_at_ms = None;
  }

  pub fn set_job_id(&mut self, job_id: i64) {
    self.job_id = Some(job_id);
  }

  pub fn with_job_id(mut self, job_id: i64) -> JobUpdateObject {
    self.job_id = Some(job_id);
    self
  }

  pub fn job_id(&self) -> Option<&i64> {
    self.job_id.as_ref()
  }

  pub fn reset_job_id(&mut self) {
    self.job_id = None;
  }

  pub fn set_job_state(&mut self, job_state: ::models::JobStatus) {
    self.job_state = Some(job_state);
  }

  pub fn with_job_state(mut self, job_state: ::models::JobStatus) -> JobUpdateObject {
    self.job_state = Some(job_state);
    self
  }

  pub fn job_state(&self) -> Option<&::models::JobStatus> {
    self.job_state.as_ref()
  }

  pub fn reset_job_state(&mut self) {
    self.job_state = None;
  }

  pub fn set_prev_job_state(&mut self, prev_job_state: ::models::PrevJobStatus) {
    self.prev_job_state = Some(prev_job_state);
  }

  pub fn with_prev_job_state(mut self, prev_job_state: ::models::PrevJobStatus) -> JobUpdateObject {
    self.prev_job_state = Some(prev_job_state);
    self
  }

  pub fn prev_job_state(&self) -> Option<&::models::PrevJobStatus> {
    self.prev_job_state.as_ref()
  }

  pub fn reset_prev_job_state(&mut self) {
    self.prev_job_state = None;
  }

  pub fn set_route(&mut self, route: ::models::DispatchRoute) {
    self.route = Some(route);
  }

  pub fn with_route(mut self, route: ::models::DispatchRoute) -> JobUpdateObject {
    self.route = Some(route);
    self
  }

  pub fn route(&self) -> Option<&::models::DispatchRoute> {
    self.route.as_ref()
  }

  pub fn reset_route(&mut self) {
    self.route = None;
  }

  pub fn set_route_id(&mut self, route_id: i64) {
    self.route_id = Some(route_id);
  }

  pub fn with_route_id(mut self, route_id: i64) -> JobUpdateObject {
    self.route_id = Some(route_id);
    self
  }

  pub fn route_id(&self) -> Option<&i64> {
    self.route_id.as_ref()
  }

  pub fn reset_route_id(&mut self) {
    self.route_id = None;
  }

}


