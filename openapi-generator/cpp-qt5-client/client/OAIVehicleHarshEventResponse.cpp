/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIVehicleHarshEventResponse.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIVehicleHarshEventResponse::OAIVehicleHarshEventResponse(QString json) {
    this->init();
    this->fromJson(json);
}

OAIVehicleHarshEventResponse::OAIVehicleHarshEventResponse() {
    this->init();
}

OAIVehicleHarshEventResponse::~OAIVehicleHarshEventResponse() {

}

void
OAIVehicleHarshEventResponse::init() {
    m_download_forward_video_url_isSet = false;
    m_download_forward_video_url_isValid = false;
    m_download_inward_video_url_isSet = false;
    m_download_inward_video_url_isValid = false;
    m_download_tracked_inward_video_url_isSet = false;
    m_download_tracked_inward_video_url_isValid = false;
    m_harsh_event_type_isSet = false;
    m_harsh_event_type_isValid = false;
    m_incident_report_url_isSet = false;
    m_incident_report_url_isValid = false;
    m_is_distracted_isSet = false;
    m_is_distracted_isValid = false;
    m_location_isSet = false;
    m_location_isValid = false;
}

void
OAIVehicleHarshEventResponse::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIVehicleHarshEventResponse::fromJsonObject(QJsonObject json) {
    m_download_forward_video_url_isValid = ::OpenAPI::fromJsonValue(download_forward_video_url, json[QString("downloadForwardVideoUrl")]);
    
    m_download_inward_video_url_isValid = ::OpenAPI::fromJsonValue(download_inward_video_url, json[QString("downloadInwardVideoUrl")]);
    
    m_download_tracked_inward_video_url_isValid = ::OpenAPI::fromJsonValue(download_tracked_inward_video_url, json[QString("downloadTrackedInwardVideoUrl")]);
    
    m_harsh_event_type_isValid = ::OpenAPI::fromJsonValue(harsh_event_type, json[QString("harshEventType")]);
    
    m_incident_report_url_isValid = ::OpenAPI::fromJsonValue(incident_report_url, json[QString("incidentReportUrl")]);
    
    m_is_distracted_isValid = ::OpenAPI::fromJsonValue(is_distracted, json[QString("isDistracted")]);
    
    m_location_isValid = ::OpenAPI::fromJsonValue(location, json[QString("location")]);
    
}

QString
OAIVehicleHarshEventResponse::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIVehicleHarshEventResponse::asJsonObject() const {
    QJsonObject obj;
	if(m_download_forward_video_url_isSet){
        obj.insert(QString("downloadForwardVideoUrl"), ::OpenAPI::toJsonValue(download_forward_video_url));
    }
	if(m_download_inward_video_url_isSet){
        obj.insert(QString("downloadInwardVideoUrl"), ::OpenAPI::toJsonValue(download_inward_video_url));
    }
	if(m_download_tracked_inward_video_url_isSet){
        obj.insert(QString("downloadTrackedInwardVideoUrl"), ::OpenAPI::toJsonValue(download_tracked_inward_video_url));
    }
	if(m_harsh_event_type_isSet){
        obj.insert(QString("harshEventType"), ::OpenAPI::toJsonValue(harsh_event_type));
    }
	if(m_incident_report_url_isSet){
        obj.insert(QString("incidentReportUrl"), ::OpenAPI::toJsonValue(incident_report_url));
    }
	if(m_is_distracted_isSet){
        obj.insert(QString("isDistracted"), ::OpenAPI::toJsonValue(is_distracted));
    }
	if(location.isSet()){
        obj.insert(QString("location"), ::OpenAPI::toJsonValue(location));
    }
    return obj;
}

QString
OAIVehicleHarshEventResponse::getDownloadForwardVideoUrl() const {
    return download_forward_video_url;
}
void
OAIVehicleHarshEventResponse::setDownloadForwardVideoUrl(const QString &download_forward_video_url) {
    this->download_forward_video_url = download_forward_video_url;
    this->m_download_forward_video_url_isSet = true;
}

QString
OAIVehicleHarshEventResponse::getDownloadInwardVideoUrl() const {
    return download_inward_video_url;
}
void
OAIVehicleHarshEventResponse::setDownloadInwardVideoUrl(const QString &download_inward_video_url) {
    this->download_inward_video_url = download_inward_video_url;
    this->m_download_inward_video_url_isSet = true;
}

QString
OAIVehicleHarshEventResponse::getDownloadTrackedInwardVideoUrl() const {
    return download_tracked_inward_video_url;
}
void
OAIVehicleHarshEventResponse::setDownloadTrackedInwardVideoUrl(const QString &download_tracked_inward_video_url) {
    this->download_tracked_inward_video_url = download_tracked_inward_video_url;
    this->m_download_tracked_inward_video_url_isSet = true;
}

QString
OAIVehicleHarshEventResponse::getHarshEventType() const {
    return harsh_event_type;
}
void
OAIVehicleHarshEventResponse::setHarshEventType(const QString &harsh_event_type) {
    this->harsh_event_type = harsh_event_type;
    this->m_harsh_event_type_isSet = true;
}

QString
OAIVehicleHarshEventResponse::getIncidentReportUrl() const {
    return incident_report_url;
}
void
OAIVehicleHarshEventResponse::setIncidentReportUrl(const QString &incident_report_url) {
    this->incident_report_url = incident_report_url;
    this->m_incident_report_url_isSet = true;
}

bool
OAIVehicleHarshEventResponse::isIsDistracted() const {
    return is_distracted;
}
void
OAIVehicleHarshEventResponse::setIsDistracted(const bool &is_distracted) {
    this->is_distracted = is_distracted;
    this->m_is_distracted_isSet = true;
}

OAIVehicleHarshEventResponse_location
OAIVehicleHarshEventResponse::getLocation() const {
    return location;
}
void
OAIVehicleHarshEventResponse::setLocation(const OAIVehicleHarshEventResponse_location &location) {
    this->location = location;
    this->m_location_isSet = true;
}

bool
OAIVehicleHarshEventResponse::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_download_forward_video_url_isSet){ isObjectUpdated = true; break;}
    
        if(m_download_inward_video_url_isSet){ isObjectUpdated = true; break;}
    
        if(m_download_tracked_inward_video_url_isSet){ isObjectUpdated = true; break;}
    
        if(m_harsh_event_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_incident_report_url_isSet){ isObjectUpdated = true; break;}
    
        if(m_is_distracted_isSet){ isObjectUpdated = true; break;}
    
        if(location.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIVehicleHarshEventResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_harsh_event_type_isValid && m_incident_report_url_isValid && true;
}

}

