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


#include "OAIDriverDailyLogResponse_days.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIDriverDailyLogResponse_days::OAIDriverDailyLogResponse_days(QString json) {
    this->init();
    this->fromJson(json);
}

OAIDriverDailyLogResponse_days::OAIDriverDailyLogResponse_days() {
    this->init();
}

OAIDriverDailyLogResponse_days::~OAIDriverDailyLogResponse_days() {

}

void
OAIDriverDailyLogResponse_days::init() {
    m_certified_at_ms_isSet = false;
    m_certified_at_ms_isValid = false;
    m_end_ms_isSet = false;
    m_end_ms_isValid = false;
    m_start_ms_isSet = false;
    m_start_ms_isValid = false;
    m_trailer_ids_isSet = false;
    m_trailer_ids_isValid = false;
    m_active_hours_isSet = false;
    m_active_hours_isValid = false;
    m_distance_miles_isSet = false;
    m_distance_miles_isValid = false;
    m_active_ms_isSet = false;
    m_active_ms_isValid = false;
    m_certified_isSet = false;
    m_certified_isValid = false;
    m_vehicle_ids_isSet = false;
    m_vehicle_ids_isValid = false;
}

void
OAIDriverDailyLogResponse_days::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIDriverDailyLogResponse_days::fromJsonObject(QJsonObject json) {
    m_certified_at_ms_isValid = ::OpenAPI::fromJsonValue(certified_at_ms, json[QString("certifiedAtMs")]);
    
    m_end_ms_isValid = ::OpenAPI::fromJsonValue(end_ms, json[QString("endMs")]);
    
    m_start_ms_isValid = ::OpenAPI::fromJsonValue(start_ms, json[QString("startMs")]);
    
    m_trailer_ids_isValid = ::OpenAPI::fromJsonValue(trailer_ids, json[QString("trailerIds")]);
    
    m_active_hours_isValid = ::OpenAPI::fromJsonValue(active_hours, json[QString("activeHours")]);
    
    m_distance_miles_isValid = ::OpenAPI::fromJsonValue(distance_miles, json[QString("distanceMiles")]);
    
    m_active_ms_isValid = ::OpenAPI::fromJsonValue(active_ms, json[QString("activeMs")]);
    
    m_certified_isValid = ::OpenAPI::fromJsonValue(certified, json[QString("certified")]);
    
    m_vehicle_ids_isValid = ::OpenAPI::fromJsonValue(vehicle_ids, json[QString("vehicleIds")]);
    
}

QString
OAIDriverDailyLogResponse_days::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIDriverDailyLogResponse_days::asJsonObject() const {
    QJsonObject obj;
	if(m_certified_at_ms_isSet){
        obj.insert(QString("certifiedAtMs"), ::OpenAPI::toJsonValue(certified_at_ms));
    }
	if(m_end_ms_isSet){
        obj.insert(QString("endMs"), ::OpenAPI::toJsonValue(end_ms));
    }
	if(m_start_ms_isSet){
        obj.insert(QString("startMs"), ::OpenAPI::toJsonValue(start_ms));
    }
	if(m_trailer_ids_isSet){
        obj.insert(QString("trailerIds"), ::OpenAPI::toJsonValue(trailer_ids));
    }
	if(m_active_hours_isSet){
        obj.insert(QString("activeHours"), ::OpenAPI::toJsonValue(active_hours));
    }
	if(m_distance_miles_isSet){
        obj.insert(QString("distanceMiles"), ::OpenAPI::toJsonValue(distance_miles));
    }
	if(m_active_ms_isSet){
        obj.insert(QString("activeMs"), ::OpenAPI::toJsonValue(active_ms));
    }
	if(m_certified_isSet){
        obj.insert(QString("certified"), ::OpenAPI::toJsonValue(certified));
    }
	if(m_vehicle_ids_isSet){
        obj.insert(QString("vehicleIds"), ::OpenAPI::toJsonValue(vehicle_ids));
    }
    return obj;
}

qint64
OAIDriverDailyLogResponse_days::getCertifiedAtMs() const {
    return certified_at_ms;
}
void
OAIDriverDailyLogResponse_days::setCertifiedAtMs(const qint64 &certified_at_ms) {
    this->certified_at_ms = certified_at_ms;
    this->m_certified_at_ms_isSet = true;
}

qint32
OAIDriverDailyLogResponse_days::getEndMs() const {
    return end_ms;
}
void
OAIDriverDailyLogResponse_days::setEndMs(const qint32 &end_ms) {
    this->end_ms = end_ms;
    this->m_end_ms_isSet = true;
}

qint32
OAIDriverDailyLogResponse_days::getStartMs() const {
    return start_ms;
}
void
OAIDriverDailyLogResponse_days::setStartMs(const qint32 &start_ms) {
    this->start_ms = start_ms;
    this->m_start_ms_isSet = true;
}

OAIObject
OAIDriverDailyLogResponse_days::getTrailerIds() const {
    return trailer_ids;
}
void
OAIDriverDailyLogResponse_days::setTrailerIds(const OAIObject &trailer_ids) {
    this->trailer_ids = trailer_ids;
    this->m_trailer_ids_isSet = true;
}

double
OAIDriverDailyLogResponse_days::getActiveHours() const {
    return active_hours;
}
void
OAIDriverDailyLogResponse_days::setActiveHours(const double &active_hours) {
    this->active_hours = active_hours;
    this->m_active_hours_isSet = true;
}

double
OAIDriverDailyLogResponse_days::getDistanceMiles() const {
    return distance_miles;
}
void
OAIDriverDailyLogResponse_days::setDistanceMiles(const double &distance_miles) {
    this->distance_miles = distance_miles;
    this->m_distance_miles_isSet = true;
}

qint64
OAIDriverDailyLogResponse_days::getActiveMs() const {
    return active_ms;
}
void
OAIDriverDailyLogResponse_days::setActiveMs(const qint64 &active_ms) {
    this->active_ms = active_ms;
    this->m_active_ms_isSet = true;
}

bool
OAIDriverDailyLogResponse_days::isCertified() const {
    return certified;
}
void
OAIDriverDailyLogResponse_days::setCertified(const bool &certified) {
    this->certified = certified;
    this->m_certified_isSet = true;
}

OAIObject
OAIDriverDailyLogResponse_days::getVehicleIds() const {
    return vehicle_ids;
}
void
OAIDriverDailyLogResponse_days::setVehicleIds(const OAIObject &vehicle_ids) {
    this->vehicle_ids = vehicle_ids;
    this->m_vehicle_ids_isSet = true;
}

bool
OAIDriverDailyLogResponse_days::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_certified_at_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_end_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_trailer_ids_isSet){ isObjectUpdated = true; break;}
    
        if(m_active_hours_isSet){ isObjectUpdated = true; break;}
    
        if(m_distance_miles_isSet){ isObjectUpdated = true; break;}
    
        if(m_active_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_certified_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_ids_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIDriverDailyLogResponse_days::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

