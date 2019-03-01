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


#include "OAIVehicleSafetyScoreResponse.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIVehicleSafetyScoreResponse::OAIVehicleSafetyScoreResponse(QString json) {
    this->init();
    this->fromJson(json);
}

OAIVehicleSafetyScoreResponse::OAIVehicleSafetyScoreResponse() {
    this->init();
}

OAIVehicleSafetyScoreResponse::~OAIVehicleSafetyScoreResponse() {

}

void
OAIVehicleSafetyScoreResponse::init() {
    m_crash_count_isSet = false;
    m_crash_count_isValid = false;
    m_harsh_accel_count_isSet = false;
    m_harsh_accel_count_isValid = false;
    m_harsh_braking_count_isSet = false;
    m_harsh_braking_count_isValid = false;
    m_harsh_events_isSet = false;
    m_harsh_events_isValid = false;
    m_harsh_turning_count_isSet = false;
    m_harsh_turning_count_isValid = false;
    m_safety_score_isSet = false;
    m_safety_score_isValid = false;
    m_safety_score_rank_isSet = false;
    m_safety_score_rank_isValid = false;
    m_time_over_speed_limit_ms_isSet = false;
    m_time_over_speed_limit_ms_isValid = false;
    m_total_distance_driven_meters_isSet = false;
    m_total_distance_driven_meters_isValid = false;
    m_total_harsh_event_count_isSet = false;
    m_total_harsh_event_count_isValid = false;
    m_total_time_driven_ms_isSet = false;
    m_total_time_driven_ms_isValid = false;
    m_vehicle_id_isSet = false;
    m_vehicle_id_isValid = false;
}

void
OAIVehicleSafetyScoreResponse::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIVehicleSafetyScoreResponse::fromJsonObject(QJsonObject json) {
    m_crash_count_isValid = ::OpenAPI::fromJsonValue(crash_count, json[QString("crashCount")]);
    
    m_harsh_accel_count_isValid = ::OpenAPI::fromJsonValue(harsh_accel_count, json[QString("harshAccelCount")]);
    
    m_harsh_braking_count_isValid = ::OpenAPI::fromJsonValue(harsh_braking_count, json[QString("harshBrakingCount")]);
    
    
    m_harsh_events_isValid = ::OpenAPI::fromJsonValue(harsh_events, json[QString("harshEvents")]);
    m_harsh_turning_count_isValid = ::OpenAPI::fromJsonValue(harsh_turning_count, json[QString("harshTurningCount")]);
    
    m_safety_score_isValid = ::OpenAPI::fromJsonValue(safety_score, json[QString("safetyScore")]);
    
    m_safety_score_rank_isValid = ::OpenAPI::fromJsonValue(safety_score_rank, json[QString("safetyScoreRank")]);
    
    m_time_over_speed_limit_ms_isValid = ::OpenAPI::fromJsonValue(time_over_speed_limit_ms, json[QString("timeOverSpeedLimitMs")]);
    
    m_total_distance_driven_meters_isValid = ::OpenAPI::fromJsonValue(total_distance_driven_meters, json[QString("totalDistanceDrivenMeters")]);
    
    m_total_harsh_event_count_isValid = ::OpenAPI::fromJsonValue(total_harsh_event_count, json[QString("totalHarshEventCount")]);
    
    m_total_time_driven_ms_isValid = ::OpenAPI::fromJsonValue(total_time_driven_ms, json[QString("totalTimeDrivenMs")]);
    
    m_vehicle_id_isValid = ::OpenAPI::fromJsonValue(vehicle_id, json[QString("vehicleId")]);
    
}

QString
OAIVehicleSafetyScoreResponse::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIVehicleSafetyScoreResponse::asJsonObject() const {
    QJsonObject obj;
	if(m_crash_count_isSet){
        obj.insert(QString("crashCount"), ::OpenAPI::toJsonValue(crash_count));
    }
	if(m_harsh_accel_count_isSet){
        obj.insert(QString("harshAccelCount"), ::OpenAPI::toJsonValue(harsh_accel_count));
    }
	if(m_harsh_braking_count_isSet){
        obj.insert(QString("harshBrakingCount"), ::OpenAPI::toJsonValue(harsh_braking_count));
    }
	
    if(harsh_events.size() > 0){
        obj.insert(QString("harshEvents"), ::OpenAPI::toJsonValue(harsh_events));
    } 
	if(m_harsh_turning_count_isSet){
        obj.insert(QString("harshTurningCount"), ::OpenAPI::toJsonValue(harsh_turning_count));
    }
	if(m_safety_score_isSet){
        obj.insert(QString("safetyScore"), ::OpenAPI::toJsonValue(safety_score));
    }
	if(m_safety_score_rank_isSet){
        obj.insert(QString("safetyScoreRank"), ::OpenAPI::toJsonValue(safety_score_rank));
    }
	if(m_time_over_speed_limit_ms_isSet){
        obj.insert(QString("timeOverSpeedLimitMs"), ::OpenAPI::toJsonValue(time_over_speed_limit_ms));
    }
	if(m_total_distance_driven_meters_isSet){
        obj.insert(QString("totalDistanceDrivenMeters"), ::OpenAPI::toJsonValue(total_distance_driven_meters));
    }
	if(m_total_harsh_event_count_isSet){
        obj.insert(QString("totalHarshEventCount"), ::OpenAPI::toJsonValue(total_harsh_event_count));
    }
	if(m_total_time_driven_ms_isSet){
        obj.insert(QString("totalTimeDrivenMs"), ::OpenAPI::toJsonValue(total_time_driven_ms));
    }
	if(m_vehicle_id_isSet){
        obj.insert(QString("vehicleId"), ::OpenAPI::toJsonValue(vehicle_id));
    }
    return obj;
}

qint32
OAIVehicleSafetyScoreResponse::getCrashCount() const {
    return crash_count;
}
void
OAIVehicleSafetyScoreResponse::setCrashCount(const qint32 &crash_count) {
    this->crash_count = crash_count;
    this->m_crash_count_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getHarshAccelCount() const {
    return harsh_accel_count;
}
void
OAIVehicleSafetyScoreResponse::setHarshAccelCount(const qint32 &harsh_accel_count) {
    this->harsh_accel_count = harsh_accel_count;
    this->m_harsh_accel_count_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getHarshBrakingCount() const {
    return harsh_braking_count;
}
void
OAIVehicleSafetyScoreResponse::setHarshBrakingCount(const qint32 &harsh_braking_count) {
    this->harsh_braking_count = harsh_braking_count;
    this->m_harsh_braking_count_isSet = true;
}

QList<OAISafetyReportHarshEvent>
OAIVehicleSafetyScoreResponse::getHarshEvents() const {
    return harsh_events;
}
void
OAIVehicleSafetyScoreResponse::setHarshEvents(const QList<OAISafetyReportHarshEvent> &harsh_events) {
    this->harsh_events = harsh_events;
    this->m_harsh_events_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getHarshTurningCount() const {
    return harsh_turning_count;
}
void
OAIVehicleSafetyScoreResponse::setHarshTurningCount(const qint32 &harsh_turning_count) {
    this->harsh_turning_count = harsh_turning_count;
    this->m_harsh_turning_count_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getSafetyScore() const {
    return safety_score;
}
void
OAIVehicleSafetyScoreResponse::setSafetyScore(const qint32 &safety_score) {
    this->safety_score = safety_score;
    this->m_safety_score_isSet = true;
}

QString
OAIVehicleSafetyScoreResponse::getSafetyScoreRank() const {
    return safety_score_rank;
}
void
OAIVehicleSafetyScoreResponse::setSafetyScoreRank(const QString &safety_score_rank) {
    this->safety_score_rank = safety_score_rank;
    this->m_safety_score_rank_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getTimeOverSpeedLimitMs() const {
    return time_over_speed_limit_ms;
}
void
OAIVehicleSafetyScoreResponse::setTimeOverSpeedLimitMs(const qint32 &time_over_speed_limit_ms) {
    this->time_over_speed_limit_ms = time_over_speed_limit_ms;
    this->m_time_over_speed_limit_ms_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getTotalDistanceDrivenMeters() const {
    return total_distance_driven_meters;
}
void
OAIVehicleSafetyScoreResponse::setTotalDistanceDrivenMeters(const qint32 &total_distance_driven_meters) {
    this->total_distance_driven_meters = total_distance_driven_meters;
    this->m_total_distance_driven_meters_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getTotalHarshEventCount() const {
    return total_harsh_event_count;
}
void
OAIVehicleSafetyScoreResponse::setTotalHarshEventCount(const qint32 &total_harsh_event_count) {
    this->total_harsh_event_count = total_harsh_event_count;
    this->m_total_harsh_event_count_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getTotalTimeDrivenMs() const {
    return total_time_driven_ms;
}
void
OAIVehicleSafetyScoreResponse::setTotalTimeDrivenMs(const qint32 &total_time_driven_ms) {
    this->total_time_driven_ms = total_time_driven_ms;
    this->m_total_time_driven_ms_isSet = true;
}

qint32
OAIVehicleSafetyScoreResponse::getVehicleId() const {
    return vehicle_id;
}
void
OAIVehicleSafetyScoreResponse::setVehicleId(const qint32 &vehicle_id) {
    this->vehicle_id = vehicle_id;
    this->m_vehicle_id_isSet = true;
}

bool
OAIVehicleSafetyScoreResponse::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_crash_count_isSet){ isObjectUpdated = true; break;}
    
        if(m_harsh_accel_count_isSet){ isObjectUpdated = true; break;}
    
        if(m_harsh_braking_count_isSet){ isObjectUpdated = true; break;}
    
        if(harsh_events.size() > 0){ isObjectUpdated = true; break;}
    
        if(m_harsh_turning_count_isSet){ isObjectUpdated = true; break;}
    
        if(m_safety_score_isSet){ isObjectUpdated = true; break;}
    
        if(m_safety_score_rank_isSet){ isObjectUpdated = true; break;}
    
        if(m_time_over_speed_limit_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_total_distance_driven_meters_isSet){ isObjectUpdated = true; break;}
    
        if(m_total_harsh_event_count_isSet){ isObjectUpdated = true; break;}
    
        if(m_total_time_driven_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_id_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIVehicleSafetyScoreResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

