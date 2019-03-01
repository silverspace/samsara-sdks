/* 
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

/// VehicleHarshEventResponse : Harsh event details for a vehicle

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct VehicleHarshEventResponse {
  /// URL for downloading the forward facing video
  #[serde(rename = "downloadForwardVideoUrl")]
  download_forward_video_url: Option<String>,
  /// URL for downloading the inward facing video
  #[serde(rename = "downloadInwardVideoUrl")]
  download_inward_video_url: Option<String>,
  /// URL for downloading the tracked inward facing video
  #[serde(rename = "downloadTrackedInwardVideoUrl")]
  download_tracked_inward_video_url: Option<String>,
  /// Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
  #[serde(rename = "harshEventType")]
  harsh_event_type: String,
  /// URL of the associated incident report page
  #[serde(rename = "incidentReportUrl")]
  incident_report_url: String,
  /// Whether the driver was deemed distracted during this harsh event
  #[serde(rename = "isDistracted")]
  is_distracted: Option<bool>,
  #[serde(rename = "location")]
  location: Option<::models::VehicleHarshEventResponseLocation>
}

impl VehicleHarshEventResponse {
  /// Harsh event details for a vehicle
  pub fn new(harsh_event_type: String, incident_report_url: String) -> VehicleHarshEventResponse {
    VehicleHarshEventResponse {
      download_forward_video_url: None,
      download_inward_video_url: None,
      download_tracked_inward_video_url: None,
      harsh_event_type: harsh_event_type,
      incident_report_url: incident_report_url,
      is_distracted: None,
      location: None
    }
  }

  pub fn set_download_forward_video_url(&mut self, download_forward_video_url: String) {
    self.download_forward_video_url = Some(download_forward_video_url);
  }

  pub fn with_download_forward_video_url(mut self, download_forward_video_url: String) -> VehicleHarshEventResponse {
    self.download_forward_video_url = Some(download_forward_video_url);
    self
  }

  pub fn download_forward_video_url(&self) -> Option<&String> {
    self.download_forward_video_url.as_ref()
  }

  pub fn reset_download_forward_video_url(&mut self) {
    self.download_forward_video_url = None;
  }

  pub fn set_download_inward_video_url(&mut self, download_inward_video_url: String) {
    self.download_inward_video_url = Some(download_inward_video_url);
  }

  pub fn with_download_inward_video_url(mut self, download_inward_video_url: String) -> VehicleHarshEventResponse {
    self.download_inward_video_url = Some(download_inward_video_url);
    self
  }

  pub fn download_inward_video_url(&self) -> Option<&String> {
    self.download_inward_video_url.as_ref()
  }

  pub fn reset_download_inward_video_url(&mut self) {
    self.download_inward_video_url = None;
  }

  pub fn set_download_tracked_inward_video_url(&mut self, download_tracked_inward_video_url: String) {
    self.download_tracked_inward_video_url = Some(download_tracked_inward_video_url);
  }

  pub fn with_download_tracked_inward_video_url(mut self, download_tracked_inward_video_url: String) -> VehicleHarshEventResponse {
    self.download_tracked_inward_video_url = Some(download_tracked_inward_video_url);
    self
  }

  pub fn download_tracked_inward_video_url(&self) -> Option<&String> {
    self.download_tracked_inward_video_url.as_ref()
  }

  pub fn reset_download_tracked_inward_video_url(&mut self) {
    self.download_tracked_inward_video_url = None;
  }

  pub fn set_harsh_event_type(&mut self, harsh_event_type: String) {
    self.harsh_event_type = harsh_event_type;
  }

  pub fn with_harsh_event_type(mut self, harsh_event_type: String) -> VehicleHarshEventResponse {
    self.harsh_event_type = harsh_event_type;
    self
  }

  pub fn harsh_event_type(&self) -> &String {
    &self.harsh_event_type
  }


  pub fn set_incident_report_url(&mut self, incident_report_url: String) {
    self.incident_report_url = incident_report_url;
  }

  pub fn with_incident_report_url(mut self, incident_report_url: String) -> VehicleHarshEventResponse {
    self.incident_report_url = incident_report_url;
    self
  }

  pub fn incident_report_url(&self) -> &String {
    &self.incident_report_url
  }


  pub fn set_is_distracted(&mut self, is_distracted: bool) {
    self.is_distracted = Some(is_distracted);
  }

  pub fn with_is_distracted(mut self, is_distracted: bool) -> VehicleHarshEventResponse {
    self.is_distracted = Some(is_distracted);
    self
  }

  pub fn is_distracted(&self) -> Option<&bool> {
    self.is_distracted.as_ref()
  }

  pub fn reset_is_distracted(&mut self) {
    self.is_distracted = None;
  }

  pub fn set_location(&mut self, location: ::models::VehicleHarshEventResponseLocation) {
    self.location = Some(location);
  }

  pub fn with_location(mut self, location: ::models::VehicleHarshEventResponseLocation) -> VehicleHarshEventResponse {
    self.location = Some(location);
    self
  }

  pub fn location(&self) -> Option<&::models::VehicleHarshEventResponseLocation> {
    self.location.as_ref()
  }

  pub fn reset_location(&mut self) {
    self.location = None;
  }

}



