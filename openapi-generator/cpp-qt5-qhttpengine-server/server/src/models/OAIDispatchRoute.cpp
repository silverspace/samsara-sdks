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


#include "OAIDispatchRoute.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIDispatchRoute::OAIDispatchRoute(QString json) {
    this->init();
    this->fromJson(json);
}

OAIDispatchRoute::OAIDispatchRoute() {
    this->init();
}

OAIDispatchRoute::~OAIDispatchRoute() {

}

void
OAIDispatchRoute::init() {
    m_actual_end_ms_isSet = false;
    m_actual_end_ms_isValid = false;
    m_actual_start_ms_isSet = false;
    m_actual_start_ms_isValid = false;
    m_driver_id_isSet = false;
    m_driver_id_isValid = false;
    m_group_id_isSet = false;
    m_group_id_isValid = false;
    m_name_isSet = false;
    m_name_isValid = false;
    m_scheduled_end_ms_isSet = false;
    m_scheduled_end_ms_isValid = false;
    m_scheduled_meters_isSet = false;
    m_scheduled_meters_isValid = false;
    m_scheduled_start_ms_isSet = false;
    m_scheduled_start_ms_isValid = false;
    m_start_location_address_isSet = false;
    m_start_location_address_isValid = false;
    m_start_location_address_id_isSet = false;
    m_start_location_address_id_isValid = false;
    m_start_location_lat_isSet = false;
    m_start_location_lat_isValid = false;
    m_start_location_lng_isSet = false;
    m_start_location_lng_isValid = false;
    m_start_location_name_isSet = false;
    m_start_location_name_isValid = false;
    m_trailer_id_isSet = false;
    m_trailer_id_isValid = false;
    m_vehicle_id_isSet = false;
    m_vehicle_id_isValid = false;
    m_dispatch_jobs_isSet = false;
    m_dispatch_jobs_isValid = false;
    m_id_isSet = false;
    m_id_isValid = false;
}

void
OAIDispatchRoute::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIDispatchRoute::fromJsonObject(QJsonObject json) {
    m_actual_end_ms_isValid = ::OpenAPI::fromJsonValue(actual_end_ms, json[QString("actual_end_ms")]);
    
    m_actual_start_ms_isValid = ::OpenAPI::fromJsonValue(actual_start_ms, json[QString("actual_start_ms")]);
    
    m_driver_id_isValid = ::OpenAPI::fromJsonValue(driver_id, json[QString("driver_id")]);
    
    m_group_id_isValid = ::OpenAPI::fromJsonValue(group_id, json[QString("group_id")]);
    
    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    m_scheduled_end_ms_isValid = ::OpenAPI::fromJsonValue(scheduled_end_ms, json[QString("scheduled_end_ms")]);
    
    m_scheduled_meters_isValid = ::OpenAPI::fromJsonValue(scheduled_meters, json[QString("scheduled_meters")]);
    
    m_scheduled_start_ms_isValid = ::OpenAPI::fromJsonValue(scheduled_start_ms, json[QString("scheduled_start_ms")]);
    
    m_start_location_address_isValid = ::OpenAPI::fromJsonValue(start_location_address, json[QString("start_location_address")]);
    
    m_start_location_address_id_isValid = ::OpenAPI::fromJsonValue(start_location_address_id, json[QString("start_location_address_id")]);
    
    m_start_location_lat_isValid = ::OpenAPI::fromJsonValue(start_location_lat, json[QString("start_location_lat")]);
    
    m_start_location_lng_isValid = ::OpenAPI::fromJsonValue(start_location_lng, json[QString("start_location_lng")]);
    
    m_start_location_name_isValid = ::OpenAPI::fromJsonValue(start_location_name, json[QString("start_location_name")]);
    
    m_trailer_id_isValid = ::OpenAPI::fromJsonValue(trailer_id, json[QString("trailer_id")]);
    
    m_vehicle_id_isValid = ::OpenAPI::fromJsonValue(vehicle_id, json[QString("vehicle_id")]);
    
    
    m_dispatch_jobs_isValid = ::OpenAPI::fromJsonValue(dispatch_jobs, json[QString("dispatch_jobs")]);
    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
}

QString
OAIDispatchRoute::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIDispatchRoute::asJsonObject() const {
    QJsonObject obj;
	if(m_actual_end_ms_isSet){
        obj.insert(QString("actual_end_ms"), ::OpenAPI::toJsonValue(actual_end_ms));
    }
	if(m_actual_start_ms_isSet){
        obj.insert(QString("actual_start_ms"), ::OpenAPI::toJsonValue(actual_start_ms));
    }
	if(m_driver_id_isSet){
        obj.insert(QString("driver_id"), ::OpenAPI::toJsonValue(driver_id));
    }
	if(m_group_id_isSet){
        obj.insert(QString("group_id"), ::OpenAPI::toJsonValue(group_id));
    }
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_scheduled_end_ms_isSet){
        obj.insert(QString("scheduled_end_ms"), ::OpenAPI::toJsonValue(scheduled_end_ms));
    }
	if(m_scheduled_meters_isSet){
        obj.insert(QString("scheduled_meters"), ::OpenAPI::toJsonValue(scheduled_meters));
    }
	if(m_scheduled_start_ms_isSet){
        obj.insert(QString("scheduled_start_ms"), ::OpenAPI::toJsonValue(scheduled_start_ms));
    }
	if(m_start_location_address_isSet){
        obj.insert(QString("start_location_address"), ::OpenAPI::toJsonValue(start_location_address));
    }
	if(m_start_location_address_id_isSet){
        obj.insert(QString("start_location_address_id"), ::OpenAPI::toJsonValue(start_location_address_id));
    }
	if(m_start_location_lat_isSet){
        obj.insert(QString("start_location_lat"), ::OpenAPI::toJsonValue(start_location_lat));
    }
	if(m_start_location_lng_isSet){
        obj.insert(QString("start_location_lng"), ::OpenAPI::toJsonValue(start_location_lng));
    }
	if(m_start_location_name_isSet){
        obj.insert(QString("start_location_name"), ::OpenAPI::toJsonValue(start_location_name));
    }
	if(m_trailer_id_isSet){
        obj.insert(QString("trailer_id"), ::OpenAPI::toJsonValue(trailer_id));
    }
	if(m_vehicle_id_isSet){
        obj.insert(QString("vehicle_id"), ::OpenAPI::toJsonValue(vehicle_id));
    }
	
    if(dispatch_jobs.size() > 0){
        obj.insert(QString("dispatch_jobs"), ::OpenAPI::toJsonValue(dispatch_jobs));
    } 
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    return obj;
}

qint64
OAIDispatchRoute::getActualEndMs() const {
    return actual_end_ms;
}
void
OAIDispatchRoute::setActualEndMs(const qint64 &actual_end_ms) {
    this->actual_end_ms = actual_end_ms;
    this->m_actual_end_ms_isSet = true;
}

qint64
OAIDispatchRoute::getActualStartMs() const {
    return actual_start_ms;
}
void
OAIDispatchRoute::setActualStartMs(const qint64 &actual_start_ms) {
    this->actual_start_ms = actual_start_ms;
    this->m_actual_start_ms_isSet = true;
}

qint64
OAIDispatchRoute::getDriverId() const {
    return driver_id;
}
void
OAIDispatchRoute::setDriverId(const qint64 &driver_id) {
    this->driver_id = driver_id;
    this->m_driver_id_isSet = true;
}

qint64
OAIDispatchRoute::getGroupId() const {
    return group_id;
}
void
OAIDispatchRoute::setGroupId(const qint64 &group_id) {
    this->group_id = group_id;
    this->m_group_id_isSet = true;
}

QString
OAIDispatchRoute::getName() const {
    return name;
}
void
OAIDispatchRoute::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

qint64
OAIDispatchRoute::getScheduledEndMs() const {
    return scheduled_end_ms;
}
void
OAIDispatchRoute::setScheduledEndMs(const qint64 &scheduled_end_ms) {
    this->scheduled_end_ms = scheduled_end_ms;
    this->m_scheduled_end_ms_isSet = true;
}

qint64
OAIDispatchRoute::getScheduledMeters() const {
    return scheduled_meters;
}
void
OAIDispatchRoute::setScheduledMeters(const qint64 &scheduled_meters) {
    this->scheduled_meters = scheduled_meters;
    this->m_scheduled_meters_isSet = true;
}

qint64
OAIDispatchRoute::getScheduledStartMs() const {
    return scheduled_start_ms;
}
void
OAIDispatchRoute::setScheduledStartMs(const qint64 &scheduled_start_ms) {
    this->scheduled_start_ms = scheduled_start_ms;
    this->m_scheduled_start_ms_isSet = true;
}

QString
OAIDispatchRoute::getStartLocationAddress() const {
    return start_location_address;
}
void
OAIDispatchRoute::setStartLocationAddress(const QString &start_location_address) {
    this->start_location_address = start_location_address;
    this->m_start_location_address_isSet = true;
}

qint64
OAIDispatchRoute::getStartLocationAddressId() const {
    return start_location_address_id;
}
void
OAIDispatchRoute::setStartLocationAddressId(const qint64 &start_location_address_id) {
    this->start_location_address_id = start_location_address_id;
    this->m_start_location_address_id_isSet = true;
}

double
OAIDispatchRoute::getStartLocationLat() const {
    return start_location_lat;
}
void
OAIDispatchRoute::setStartLocationLat(const double &start_location_lat) {
    this->start_location_lat = start_location_lat;
    this->m_start_location_lat_isSet = true;
}

double
OAIDispatchRoute::getStartLocationLng() const {
    return start_location_lng;
}
void
OAIDispatchRoute::setStartLocationLng(const double &start_location_lng) {
    this->start_location_lng = start_location_lng;
    this->m_start_location_lng_isSet = true;
}

QString
OAIDispatchRoute::getStartLocationName() const {
    return start_location_name;
}
void
OAIDispatchRoute::setStartLocationName(const QString &start_location_name) {
    this->start_location_name = start_location_name;
    this->m_start_location_name_isSet = true;
}

qint64
OAIDispatchRoute::getTrailerId() const {
    return trailer_id;
}
void
OAIDispatchRoute::setTrailerId(const qint64 &trailer_id) {
    this->trailer_id = trailer_id;
    this->m_trailer_id_isSet = true;
}

qint64
OAIDispatchRoute::getVehicleId() const {
    return vehicle_id;
}
void
OAIDispatchRoute::setVehicleId(const qint64 &vehicle_id) {
    this->vehicle_id = vehicle_id;
    this->m_vehicle_id_isSet = true;
}

QList<OAIDispatchJob>
OAIDispatchRoute::getDispatchJobs() const {
    return dispatch_jobs;
}
void
OAIDispatchRoute::setDispatchJobs(const QList<OAIDispatchJob> &dispatch_jobs) {
    this->dispatch_jobs = dispatch_jobs;
    this->m_dispatch_jobs_isSet = true;
}

qint64
OAIDispatchRoute::getId() const {
    return id;
}
void
OAIDispatchRoute::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool
OAIDispatchRoute::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_actual_end_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_actual_start_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_driver_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_group_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_scheduled_end_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_scheduled_meters_isSet){ isObjectUpdated = true; break;}
    
        if(m_scheduled_start_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_location_address_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_location_address_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_location_lat_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_location_lng_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_location_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_trailer_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_id_isSet){ isObjectUpdated = true; break;}
    
        if(dispatch_jobs.size() > 0){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIDispatchRoute::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_name_isValid && m_scheduled_end_ms_isValid && m_scheduled_start_ms_isValid && m_dispatch_jobs_isValid && m_id_isValid && true;
}

}

