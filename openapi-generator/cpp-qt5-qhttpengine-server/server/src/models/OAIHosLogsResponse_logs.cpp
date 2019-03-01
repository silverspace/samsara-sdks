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


#include "OAIHosLogsResponse_logs.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIHosLogsResponse_logs::OAIHosLogsResponse_logs(QString json) {
    this->init();
    this->fromJson(json);
}

OAIHosLogsResponse_logs::OAIHosLogsResponse_logs() {
    this->init();
}

OAIHosLogsResponse_logs::~OAIHosLogsResponse_logs() {

}

void
OAIHosLogsResponse_logs::init() {
    m_loc_lng_isSet = false;
    m_loc_lng_isValid = false;
    m_log_start_ms_isSet = false;
    m_log_start_ms_isValid = false;
    m_driver_id_isSet = false;
    m_driver_id_isValid = false;
    m_status_type_isSet = false;
    m_status_type_isValid = false;
    m_loc_city_isSet = false;
    m_loc_city_isValid = false;
    m_group_id_isSet = false;
    m_group_id_isValid = false;
    m_loc_name_isSet = false;
    m_loc_name_isValid = false;
    m_loc_lat_isSet = false;
    m_loc_lat_isValid = false;
    m_remark_isSet = false;
    m_remark_isValid = false;
    m_loc_state_isSet = false;
    m_loc_state_isValid = false;
    m_vehicle_id_isSet = false;
    m_vehicle_id_isValid = false;
    m_codriver_ids_isSet = false;
    m_codriver_ids_isValid = false;
}

void
OAIHosLogsResponse_logs::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIHosLogsResponse_logs::fromJsonObject(QJsonObject json) {
    m_loc_lng_isValid = ::OpenAPI::fromJsonValue(loc_lng, json[QString("locLng")]);
    
    m_log_start_ms_isValid = ::OpenAPI::fromJsonValue(log_start_ms, json[QString("logStartMs")]);
    
    m_driver_id_isValid = ::OpenAPI::fromJsonValue(driver_id, json[QString("driverId")]);
    
    m_status_type_isValid = ::OpenAPI::fromJsonValue(status_type, json[QString("statusType")]);
    
    m_loc_city_isValid = ::OpenAPI::fromJsonValue(loc_city, json[QString("locCity")]);
    
    m_group_id_isValid = ::OpenAPI::fromJsonValue(group_id, json[QString("groupId")]);
    
    m_loc_name_isValid = ::OpenAPI::fromJsonValue(loc_name, json[QString("locName")]);
    
    m_loc_lat_isValid = ::OpenAPI::fromJsonValue(loc_lat, json[QString("locLat")]);
    
    m_remark_isValid = ::OpenAPI::fromJsonValue(remark, json[QString("remark")]);
    
    m_loc_state_isValid = ::OpenAPI::fromJsonValue(loc_state, json[QString("locState")]);
    
    m_vehicle_id_isValid = ::OpenAPI::fromJsonValue(vehicle_id, json[QString("vehicleId")]);
    
    
    m_codriver_ids_isValid = ::OpenAPI::fromJsonValue(codriver_ids, json[QString("codriverIds")]);
}

QString
OAIHosLogsResponse_logs::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIHosLogsResponse_logs::asJsonObject() const {
    QJsonObject obj;
	if(m_loc_lng_isSet){
        obj.insert(QString("locLng"), ::OpenAPI::toJsonValue(loc_lng));
    }
	if(m_log_start_ms_isSet){
        obj.insert(QString("logStartMs"), ::OpenAPI::toJsonValue(log_start_ms));
    }
	if(m_driver_id_isSet){
        obj.insert(QString("driverId"), ::OpenAPI::toJsonValue(driver_id));
    }
	if(m_status_type_isSet){
        obj.insert(QString("statusType"), ::OpenAPI::toJsonValue(status_type));
    }
	if(m_loc_city_isSet){
        obj.insert(QString("locCity"), ::OpenAPI::toJsonValue(loc_city));
    }
	if(m_group_id_isSet){
        obj.insert(QString("groupId"), ::OpenAPI::toJsonValue(group_id));
    }
	if(m_loc_name_isSet){
        obj.insert(QString("locName"), ::OpenAPI::toJsonValue(loc_name));
    }
	if(m_loc_lat_isSet){
        obj.insert(QString("locLat"), ::OpenAPI::toJsonValue(loc_lat));
    }
	if(m_remark_isSet){
        obj.insert(QString("remark"), ::OpenAPI::toJsonValue(remark));
    }
	if(m_loc_state_isSet){
        obj.insert(QString("locState"), ::OpenAPI::toJsonValue(loc_state));
    }
	if(m_vehicle_id_isSet){
        obj.insert(QString("vehicleId"), ::OpenAPI::toJsonValue(vehicle_id));
    }
	
    if(codriver_ids.size() > 0){
        obj.insert(QString("codriverIds"), ::OpenAPI::toJsonValue(codriver_ids));
    } 
    return obj;
}

double
OAIHosLogsResponse_logs::getLocLng() const {
    return loc_lng;
}
void
OAIHosLogsResponse_logs::setLocLng(const double &loc_lng) {
    this->loc_lng = loc_lng;
    this->m_loc_lng_isSet = true;
}

qint64
OAIHosLogsResponse_logs::getLogStartMs() const {
    return log_start_ms;
}
void
OAIHosLogsResponse_logs::setLogStartMs(const qint64 &log_start_ms) {
    this->log_start_ms = log_start_ms;
    this->m_log_start_ms_isSet = true;
}

qint64
OAIHosLogsResponse_logs::getDriverId() const {
    return driver_id;
}
void
OAIHosLogsResponse_logs::setDriverId(const qint64 &driver_id) {
    this->driver_id = driver_id;
    this->m_driver_id_isSet = true;
}

QString
OAIHosLogsResponse_logs::getStatusType() const {
    return status_type;
}
void
OAIHosLogsResponse_logs::setStatusType(const QString &status_type) {
    this->status_type = status_type;
    this->m_status_type_isSet = true;
}

QString
OAIHosLogsResponse_logs::getLocCity() const {
    return loc_city;
}
void
OAIHosLogsResponse_logs::setLocCity(const QString &loc_city) {
    this->loc_city = loc_city;
    this->m_loc_city_isSet = true;
}

qint64
OAIHosLogsResponse_logs::getGroupId() const {
    return group_id;
}
void
OAIHosLogsResponse_logs::setGroupId(const qint64 &group_id) {
    this->group_id = group_id;
    this->m_group_id_isSet = true;
}

QString
OAIHosLogsResponse_logs::getLocName() const {
    return loc_name;
}
void
OAIHosLogsResponse_logs::setLocName(const QString &loc_name) {
    this->loc_name = loc_name;
    this->m_loc_name_isSet = true;
}

double
OAIHosLogsResponse_logs::getLocLat() const {
    return loc_lat;
}
void
OAIHosLogsResponse_logs::setLocLat(const double &loc_lat) {
    this->loc_lat = loc_lat;
    this->m_loc_lat_isSet = true;
}

QString
OAIHosLogsResponse_logs::getRemark() const {
    return remark;
}
void
OAIHosLogsResponse_logs::setRemark(const QString &remark) {
    this->remark = remark;
    this->m_remark_isSet = true;
}

QString
OAIHosLogsResponse_logs::getLocState() const {
    return loc_state;
}
void
OAIHosLogsResponse_logs::setLocState(const QString &loc_state) {
    this->loc_state = loc_state;
    this->m_loc_state_isSet = true;
}

qint64
OAIHosLogsResponse_logs::getVehicleId() const {
    return vehicle_id;
}
void
OAIHosLogsResponse_logs::setVehicleId(const qint64 &vehicle_id) {
    this->vehicle_id = vehicle_id;
    this->m_vehicle_id_isSet = true;
}

QList<qint64>
OAIHosLogsResponse_logs::getCodriverIds() const {
    return codriver_ids;
}
void
OAIHosLogsResponse_logs::setCodriverIds(const QList<qint64> &codriver_ids) {
    this->codriver_ids = codriver_ids;
    this->m_codriver_ids_isSet = true;
}

bool
OAIHosLogsResponse_logs::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_loc_lng_isSet){ isObjectUpdated = true; break;}
    
        if(m_log_start_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_driver_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_status_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_loc_city_isSet){ isObjectUpdated = true; break;}
    
        if(m_group_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_loc_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_loc_lat_isSet){ isObjectUpdated = true; break;}
    
        if(m_remark_isSet){ isObjectUpdated = true; break;}
    
        if(m_loc_state_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_id_isSet){ isObjectUpdated = true; break;}
    
        if(codriver_ids.size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIHosLogsResponse_logs::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

