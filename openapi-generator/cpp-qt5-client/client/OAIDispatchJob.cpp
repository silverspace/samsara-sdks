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


#include "OAIDispatchJob.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIDispatchJob::OAIDispatchJob(QString json) {
    this->init();
    this->fromJson(json);
}

OAIDispatchJob::OAIDispatchJob() {
    this->init();
}

OAIDispatchJob::~OAIDispatchJob() {

}

void
OAIDispatchJob::init() {
    m_destination_address_isSet = false;
    m_destination_address_isValid = false;
    m_destination_address_id_isSet = false;
    m_destination_address_id_isValid = false;
    m_destination_lat_isSet = false;
    m_destination_lat_isValid = false;
    m_destination_lng_isSet = false;
    m_destination_lng_isValid = false;
    m_destination_name_isSet = false;
    m_destination_name_isValid = false;
    m_notes_isSet = false;
    m_notes_isValid = false;
    m_scheduled_arrival_time_ms_isSet = false;
    m_scheduled_arrival_time_ms_isValid = false;
    m_scheduled_departure_time_ms_isSet = false;
    m_scheduled_departure_time_ms_isValid = false;
    m_arrived_at_ms_isSet = false;
    m_arrived_at_ms_isValid = false;
    m_completed_at_ms_isSet = false;
    m_completed_at_ms_isValid = false;
    m_dispatch_route_id_isSet = false;
    m_dispatch_route_id_isValid = false;
    m_driver_id_isSet = false;
    m_driver_id_isValid = false;
    m_en_route_at_ms_isSet = false;
    m_en_route_at_ms_isValid = false;
    m_estimated_arrival_ms_isSet = false;
    m_estimated_arrival_ms_isValid = false;
    m_fleet_viewer_url_isSet = false;
    m_fleet_viewer_url_isValid = false;
    m_group_id_isSet = false;
    m_group_id_isValid = false;
    m_id_isSet = false;
    m_id_isValid = false;
    m_job_state_isSet = false;
    m_job_state_isValid = false;
    m_skipped_at_ms_isSet = false;
    m_skipped_at_ms_isValid = false;
    m_vehicle_id_isSet = false;
    m_vehicle_id_isValid = false;
}

void
OAIDispatchJob::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIDispatchJob::fromJsonObject(QJsonObject json) {
    m_destination_address_isValid = ::OpenAPI::fromJsonValue(destination_address, json[QString("destination_address")]);
    
    m_destination_address_id_isValid = ::OpenAPI::fromJsonValue(destination_address_id, json[QString("destination_address_id")]);
    
    m_destination_lat_isValid = ::OpenAPI::fromJsonValue(destination_lat, json[QString("destination_lat")]);
    
    m_destination_lng_isValid = ::OpenAPI::fromJsonValue(destination_lng, json[QString("destination_lng")]);
    
    m_destination_name_isValid = ::OpenAPI::fromJsonValue(destination_name, json[QString("destination_name")]);
    
    m_notes_isValid = ::OpenAPI::fromJsonValue(notes, json[QString("notes")]);
    
    m_scheduled_arrival_time_ms_isValid = ::OpenAPI::fromJsonValue(scheduled_arrival_time_ms, json[QString("scheduled_arrival_time_ms")]);
    
    m_scheduled_departure_time_ms_isValid = ::OpenAPI::fromJsonValue(scheduled_departure_time_ms, json[QString("scheduled_departure_time_ms")]);
    
    m_arrived_at_ms_isValid = ::OpenAPI::fromJsonValue(arrived_at_ms, json[QString("arrived_at_ms")]);
    
    m_completed_at_ms_isValid = ::OpenAPI::fromJsonValue(completed_at_ms, json[QString("completed_at_ms")]);
    
    m_dispatch_route_id_isValid = ::OpenAPI::fromJsonValue(dispatch_route_id, json[QString("dispatch_route_id")]);
    
    m_driver_id_isValid = ::OpenAPI::fromJsonValue(driver_id, json[QString("driver_id")]);
    
    m_en_route_at_ms_isValid = ::OpenAPI::fromJsonValue(en_route_at_ms, json[QString("en_route_at_ms")]);
    
    m_estimated_arrival_ms_isValid = ::OpenAPI::fromJsonValue(estimated_arrival_ms, json[QString("estimated_arrival_ms")]);
    
    m_fleet_viewer_url_isValid = ::OpenAPI::fromJsonValue(fleet_viewer_url, json[QString("fleet_viewer_url")]);
    
    m_group_id_isValid = ::OpenAPI::fromJsonValue(group_id, json[QString("group_id")]);
    
    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    m_job_state_isValid = ::OpenAPI::fromJsonValue(job_state, json[QString("job_state")]);
    
    m_skipped_at_ms_isValid = ::OpenAPI::fromJsonValue(skipped_at_ms, json[QString("skipped_at_ms")]);
    
    m_vehicle_id_isValid = ::OpenAPI::fromJsonValue(vehicle_id, json[QString("vehicle_id")]);
    
}

QString
OAIDispatchJob::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIDispatchJob::asJsonObject() const {
    QJsonObject obj;
	if(m_destination_address_isSet){
        obj.insert(QString("destination_address"), ::OpenAPI::toJsonValue(destination_address));
    }
	if(m_destination_address_id_isSet){
        obj.insert(QString("destination_address_id"), ::OpenAPI::toJsonValue(destination_address_id));
    }
	if(m_destination_lat_isSet){
        obj.insert(QString("destination_lat"), ::OpenAPI::toJsonValue(destination_lat));
    }
	if(m_destination_lng_isSet){
        obj.insert(QString("destination_lng"), ::OpenAPI::toJsonValue(destination_lng));
    }
	if(m_destination_name_isSet){
        obj.insert(QString("destination_name"), ::OpenAPI::toJsonValue(destination_name));
    }
	if(m_notes_isSet){
        obj.insert(QString("notes"), ::OpenAPI::toJsonValue(notes));
    }
	if(m_scheduled_arrival_time_ms_isSet){
        obj.insert(QString("scheduled_arrival_time_ms"), ::OpenAPI::toJsonValue(scheduled_arrival_time_ms));
    }
	if(m_scheduled_departure_time_ms_isSet){
        obj.insert(QString("scheduled_departure_time_ms"), ::OpenAPI::toJsonValue(scheduled_departure_time_ms));
    }
	if(m_arrived_at_ms_isSet){
        obj.insert(QString("arrived_at_ms"), ::OpenAPI::toJsonValue(arrived_at_ms));
    }
	if(m_completed_at_ms_isSet){
        obj.insert(QString("completed_at_ms"), ::OpenAPI::toJsonValue(completed_at_ms));
    }
	if(m_dispatch_route_id_isSet){
        obj.insert(QString("dispatch_route_id"), ::OpenAPI::toJsonValue(dispatch_route_id));
    }
	if(m_driver_id_isSet){
        obj.insert(QString("driver_id"), ::OpenAPI::toJsonValue(driver_id));
    }
	if(m_en_route_at_ms_isSet){
        obj.insert(QString("en_route_at_ms"), ::OpenAPI::toJsonValue(en_route_at_ms));
    }
	if(m_estimated_arrival_ms_isSet){
        obj.insert(QString("estimated_arrival_ms"), ::OpenAPI::toJsonValue(estimated_arrival_ms));
    }
	if(m_fleet_viewer_url_isSet){
        obj.insert(QString("fleet_viewer_url"), ::OpenAPI::toJsonValue(fleet_viewer_url));
    }
	if(m_group_id_isSet){
        obj.insert(QString("group_id"), ::OpenAPI::toJsonValue(group_id));
    }
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(job_state.isSet()){
        obj.insert(QString("job_state"), ::OpenAPI::toJsonValue(job_state));
    }
	if(m_skipped_at_ms_isSet){
        obj.insert(QString("skipped_at_ms"), ::OpenAPI::toJsonValue(skipped_at_ms));
    }
	if(m_vehicle_id_isSet){
        obj.insert(QString("vehicle_id"), ::OpenAPI::toJsonValue(vehicle_id));
    }
    return obj;
}

QString
OAIDispatchJob::getDestinationAddress() const {
    return destination_address;
}
void
OAIDispatchJob::setDestinationAddress(const QString &destination_address) {
    this->destination_address = destination_address;
    this->m_destination_address_isSet = true;
}

qint64
OAIDispatchJob::getDestinationAddressId() const {
    return destination_address_id;
}
void
OAIDispatchJob::setDestinationAddressId(const qint64 &destination_address_id) {
    this->destination_address_id = destination_address_id;
    this->m_destination_address_id_isSet = true;
}

double
OAIDispatchJob::getDestinationLat() const {
    return destination_lat;
}
void
OAIDispatchJob::setDestinationLat(const double &destination_lat) {
    this->destination_lat = destination_lat;
    this->m_destination_lat_isSet = true;
}

double
OAIDispatchJob::getDestinationLng() const {
    return destination_lng;
}
void
OAIDispatchJob::setDestinationLng(const double &destination_lng) {
    this->destination_lng = destination_lng;
    this->m_destination_lng_isSet = true;
}

QString
OAIDispatchJob::getDestinationName() const {
    return destination_name;
}
void
OAIDispatchJob::setDestinationName(const QString &destination_name) {
    this->destination_name = destination_name;
    this->m_destination_name_isSet = true;
}

QString
OAIDispatchJob::getNotes() const {
    return notes;
}
void
OAIDispatchJob::setNotes(const QString &notes) {
    this->notes = notes;
    this->m_notes_isSet = true;
}

qint64
OAIDispatchJob::getScheduledArrivalTimeMs() const {
    return scheduled_arrival_time_ms;
}
void
OAIDispatchJob::setScheduledArrivalTimeMs(const qint64 &scheduled_arrival_time_ms) {
    this->scheduled_arrival_time_ms = scheduled_arrival_time_ms;
    this->m_scheduled_arrival_time_ms_isSet = true;
}

qint64
OAIDispatchJob::getScheduledDepartureTimeMs() const {
    return scheduled_departure_time_ms;
}
void
OAIDispatchJob::setScheduledDepartureTimeMs(const qint64 &scheduled_departure_time_ms) {
    this->scheduled_departure_time_ms = scheduled_departure_time_ms;
    this->m_scheduled_departure_time_ms_isSet = true;
}

qint64
OAIDispatchJob::getArrivedAtMs() const {
    return arrived_at_ms;
}
void
OAIDispatchJob::setArrivedAtMs(const qint64 &arrived_at_ms) {
    this->arrived_at_ms = arrived_at_ms;
    this->m_arrived_at_ms_isSet = true;
}

qint64
OAIDispatchJob::getCompletedAtMs() const {
    return completed_at_ms;
}
void
OAIDispatchJob::setCompletedAtMs(const qint64 &completed_at_ms) {
    this->completed_at_ms = completed_at_ms;
    this->m_completed_at_ms_isSet = true;
}

qint64
OAIDispatchJob::getDispatchRouteId() const {
    return dispatch_route_id;
}
void
OAIDispatchJob::setDispatchRouteId(const qint64 &dispatch_route_id) {
    this->dispatch_route_id = dispatch_route_id;
    this->m_dispatch_route_id_isSet = true;
}

qint64
OAIDispatchJob::getDriverId() const {
    return driver_id;
}
void
OAIDispatchJob::setDriverId(const qint64 &driver_id) {
    this->driver_id = driver_id;
    this->m_driver_id_isSet = true;
}

qint64
OAIDispatchJob::getEnRouteAtMs() const {
    return en_route_at_ms;
}
void
OAIDispatchJob::setEnRouteAtMs(const qint64 &en_route_at_ms) {
    this->en_route_at_ms = en_route_at_ms;
    this->m_en_route_at_ms_isSet = true;
}

qint64
OAIDispatchJob::getEstimatedArrivalMs() const {
    return estimated_arrival_ms;
}
void
OAIDispatchJob::setEstimatedArrivalMs(const qint64 &estimated_arrival_ms) {
    this->estimated_arrival_ms = estimated_arrival_ms;
    this->m_estimated_arrival_ms_isSet = true;
}

QString
OAIDispatchJob::getFleetViewerUrl() const {
    return fleet_viewer_url;
}
void
OAIDispatchJob::setFleetViewerUrl(const QString &fleet_viewer_url) {
    this->fleet_viewer_url = fleet_viewer_url;
    this->m_fleet_viewer_url_isSet = true;
}

qint64
OAIDispatchJob::getGroupId() const {
    return group_id;
}
void
OAIDispatchJob::setGroupId(const qint64 &group_id) {
    this->group_id = group_id;
    this->m_group_id_isSet = true;
}

qint64
OAIDispatchJob::getId() const {
    return id;
}
void
OAIDispatchJob::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

OAIJobStatus
OAIDispatchJob::getJobState() const {
    return job_state;
}
void
OAIDispatchJob::setJobState(const OAIJobStatus &job_state) {
    this->job_state = job_state;
    this->m_job_state_isSet = true;
}

qint64
OAIDispatchJob::getSkippedAtMs() const {
    return skipped_at_ms;
}
void
OAIDispatchJob::setSkippedAtMs(const qint64 &skipped_at_ms) {
    this->skipped_at_ms = skipped_at_ms;
    this->m_skipped_at_ms_isSet = true;
}

qint64
OAIDispatchJob::getVehicleId() const {
    return vehicle_id;
}
void
OAIDispatchJob::setVehicleId(const qint64 &vehicle_id) {
    this->vehicle_id = vehicle_id;
    this->m_vehicle_id_isSet = true;
}

bool
OAIDispatchJob::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_destination_address_isSet){ isObjectUpdated = true; break;}
    
        if(m_destination_address_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_destination_lat_isSet){ isObjectUpdated = true; break;}
    
        if(m_destination_lng_isSet){ isObjectUpdated = true; break;}
    
        if(m_destination_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_notes_isSet){ isObjectUpdated = true; break;}
    
        if(m_scheduled_arrival_time_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_scheduled_departure_time_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_arrived_at_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_completed_at_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_dispatch_route_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_driver_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_en_route_at_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_estimated_arrival_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_fleet_viewer_url_isSet){ isObjectUpdated = true; break;}
    
        if(m_group_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(job_state.isSet()){ isObjectUpdated = true; break;}
    
        if(m_skipped_at_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_id_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIDispatchJob::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_scheduled_arrival_time_ms_isValid && m_dispatch_route_id_isValid && m_group_id_isValid && m_id_isValid && m_job_state_isValid && true;
}

}

