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


#include "OAIDvirBase.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIDvirBase::OAIDvirBase(QString json) {
    this->init();
    this->fromJson(json);
}

OAIDvirBase::OAIDvirBase() {
    this->init();
}

OAIDvirBase::~OAIDvirBase() {

}

void
OAIDvirBase::init() {
    m_author_signature_isSet = false;
    m_author_signature_isValid = false;
    m_defects_corrected_isSet = false;
    m_defects_corrected_isValid = false;
    m_defects_need_not_be_corrected_isSet = false;
    m_defects_need_not_be_corrected_isValid = false;
    m_id_isSet = false;
    m_id_isValid = false;
    m_inspection_type_isSet = false;
    m_inspection_type_isValid = false;
    m_mechanic_notes_isSet = false;
    m_mechanic_notes_isValid = false;
    m_mechanic_or_agent_signature_isSet = false;
    m_mechanic_or_agent_signature_isValid = false;
    m_next_driver_signature_isSet = false;
    m_next_driver_signature_isValid = false;
    m_odometer_miles_isSet = false;
    m_odometer_miles_isValid = false;
    m_time_ms_isSet = false;
    m_time_ms_isValid = false;
    m_trailer_defects_isSet = false;
    m_trailer_defects_isValid = false;
    m_trailer_id_isSet = false;
    m_trailer_id_isValid = false;
    m_trailer_name_isSet = false;
    m_trailer_name_isValid = false;
    m_vehicle_isSet = false;
    m_vehicle_isValid = false;
    m_vehicle_condition_isSet = false;
    m_vehicle_condition_isValid = false;
    m_vehicle_defects_isSet = false;
    m_vehicle_defects_isValid = false;
}

void
OAIDvirBase::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIDvirBase::fromJsonObject(QJsonObject json) {
    m_author_signature_isValid = ::OpenAPI::fromJsonValue(author_signature, json[QString("authorSignature")]);
    
    m_defects_corrected_isValid = ::OpenAPI::fromJsonValue(defects_corrected, json[QString("defectsCorrected")]);
    
    m_defects_need_not_be_corrected_isValid = ::OpenAPI::fromJsonValue(defects_need_not_be_corrected, json[QString("defectsNeedNotBeCorrected")]);
    
    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    m_inspection_type_isValid = ::OpenAPI::fromJsonValue(inspection_type, json[QString("inspectionType")]);
    
    m_mechanic_notes_isValid = ::OpenAPI::fromJsonValue(mechanic_notes, json[QString("mechanicNotes")]);
    
    m_mechanic_or_agent_signature_isValid = ::OpenAPI::fromJsonValue(mechanic_or_agent_signature, json[QString("mechanicOrAgentSignature")]);
    
    m_next_driver_signature_isValid = ::OpenAPI::fromJsonValue(next_driver_signature, json[QString("nextDriverSignature")]);
    
    m_odometer_miles_isValid = ::OpenAPI::fromJsonValue(odometer_miles, json[QString("odometerMiles")]);
    
    m_time_ms_isValid = ::OpenAPI::fromJsonValue(time_ms, json[QString("timeMs")]);
    
    
    m_trailer_defects_isValid = ::OpenAPI::fromJsonValue(trailer_defects, json[QString("trailerDefects")]);
    m_trailer_id_isValid = ::OpenAPI::fromJsonValue(trailer_id, json[QString("trailerId")]);
    
    m_trailer_name_isValid = ::OpenAPI::fromJsonValue(trailer_name, json[QString("trailerName")]);
    
    m_vehicle_isValid = ::OpenAPI::fromJsonValue(vehicle, json[QString("vehicle")]);
    
    m_vehicle_condition_isValid = ::OpenAPI::fromJsonValue(vehicle_condition, json[QString("vehicleCondition")]);
    
    
    m_vehicle_defects_isValid = ::OpenAPI::fromJsonValue(vehicle_defects, json[QString("vehicleDefects")]);
}

QString
OAIDvirBase::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIDvirBase::asJsonObject() const {
    QJsonObject obj;
	if(author_signature.isSet()){
        obj.insert(QString("authorSignature"), ::OpenAPI::toJsonValue(author_signature));
    }
	if(m_defects_corrected_isSet){
        obj.insert(QString("defectsCorrected"), ::OpenAPI::toJsonValue(defects_corrected));
    }
	if(m_defects_need_not_be_corrected_isSet){
        obj.insert(QString("defectsNeedNotBeCorrected"), ::OpenAPI::toJsonValue(defects_need_not_be_corrected));
    }
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(m_inspection_type_isSet){
        obj.insert(QString("inspectionType"), ::OpenAPI::toJsonValue(inspection_type));
    }
	if(m_mechanic_notes_isSet){
        obj.insert(QString("mechanicNotes"), ::OpenAPI::toJsonValue(mechanic_notes));
    }
	if(mechanic_or_agent_signature.isSet()){
        obj.insert(QString("mechanicOrAgentSignature"), ::OpenAPI::toJsonValue(mechanic_or_agent_signature));
    }
	if(next_driver_signature.isSet()){
        obj.insert(QString("nextDriverSignature"), ::OpenAPI::toJsonValue(next_driver_signature));
    }
	if(m_odometer_miles_isSet){
        obj.insert(QString("odometerMiles"), ::OpenAPI::toJsonValue(odometer_miles));
    }
	if(m_time_ms_isSet){
        obj.insert(QString("timeMs"), ::OpenAPI::toJsonValue(time_ms));
    }
	
    if(trailer_defects.size() > 0){
        obj.insert(QString("trailerDefects"), ::OpenAPI::toJsonValue(trailer_defects));
    } 
	if(m_trailer_id_isSet){
        obj.insert(QString("trailerId"), ::OpenAPI::toJsonValue(trailer_id));
    }
	if(m_trailer_name_isSet){
        obj.insert(QString("trailerName"), ::OpenAPI::toJsonValue(trailer_name));
    }
	if(vehicle.isSet()){
        obj.insert(QString("vehicle"), ::OpenAPI::toJsonValue(vehicle));
    }
	if(m_vehicle_condition_isSet){
        obj.insert(QString("vehicleCondition"), ::OpenAPI::toJsonValue(vehicle_condition));
    }
	
    if(vehicle_defects.size() > 0){
        obj.insert(QString("vehicleDefects"), ::OpenAPI::toJsonValue(vehicle_defects));
    } 
    return obj;
}

OAIDvirBase_authorSignature
OAIDvirBase::getAuthorSignature() const {
    return author_signature;
}
void
OAIDvirBase::setAuthorSignature(const OAIDvirBase_authorSignature &author_signature) {
    this->author_signature = author_signature;
    this->m_author_signature_isSet = true;
}

bool
OAIDvirBase::isDefectsCorrected() const {
    return defects_corrected;
}
void
OAIDvirBase::setDefectsCorrected(const bool &defects_corrected) {
    this->defects_corrected = defects_corrected;
    this->m_defects_corrected_isSet = true;
}

bool
OAIDvirBase::isDefectsNeedNotBeCorrected() const {
    return defects_need_not_be_corrected;
}
void
OAIDvirBase::setDefectsNeedNotBeCorrected(const bool &defects_need_not_be_corrected) {
    this->defects_need_not_be_corrected = defects_need_not_be_corrected;
    this->m_defects_need_not_be_corrected_isSet = true;
}

qint64
OAIDvirBase::getId() const {
    return id;
}
void
OAIDvirBase::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString
OAIDvirBase::getInspectionType() const {
    return inspection_type;
}
void
OAIDvirBase::setInspectionType(const QString &inspection_type) {
    this->inspection_type = inspection_type;
    this->m_inspection_type_isSet = true;
}

QString
OAIDvirBase::getMechanicNotes() const {
    return mechanic_notes;
}
void
OAIDvirBase::setMechanicNotes(const QString &mechanic_notes) {
    this->mechanic_notes = mechanic_notes;
    this->m_mechanic_notes_isSet = true;
}

OAIDvirBase_mechanicOrAgentSignature
OAIDvirBase::getMechanicOrAgentSignature() const {
    return mechanic_or_agent_signature;
}
void
OAIDvirBase::setMechanicOrAgentSignature(const OAIDvirBase_mechanicOrAgentSignature &mechanic_or_agent_signature) {
    this->mechanic_or_agent_signature = mechanic_or_agent_signature;
    this->m_mechanic_or_agent_signature_isSet = true;
}

OAIDvirBase_nextDriverSignature
OAIDvirBase::getNextDriverSignature() const {
    return next_driver_signature;
}
void
OAIDvirBase::setNextDriverSignature(const OAIDvirBase_nextDriverSignature &next_driver_signature) {
    this->next_driver_signature = next_driver_signature;
    this->m_next_driver_signature_isSet = true;
}

qint64
OAIDvirBase::getOdometerMiles() const {
    return odometer_miles;
}
void
OAIDvirBase::setOdometerMiles(const qint64 &odometer_miles) {
    this->odometer_miles = odometer_miles;
    this->m_odometer_miles_isSet = true;
}

qint64
OAIDvirBase::getTimeMs() const {
    return time_ms;
}
void
OAIDvirBase::setTimeMs(const qint64 &time_ms) {
    this->time_ms = time_ms;
    this->m_time_ms_isSet = true;
}

QList<OAIDvirBase_trailerDefects>
OAIDvirBase::getTrailerDefects() const {
    return trailer_defects;
}
void
OAIDvirBase::setTrailerDefects(const QList<OAIDvirBase_trailerDefects> &trailer_defects) {
    this->trailer_defects = trailer_defects;
    this->m_trailer_defects_isSet = true;
}

qint32
OAIDvirBase::getTrailerId() const {
    return trailer_id;
}
void
OAIDvirBase::setTrailerId(const qint32 &trailer_id) {
    this->trailer_id = trailer_id;
    this->m_trailer_id_isSet = true;
}

QString
OAIDvirBase::getTrailerName() const {
    return trailer_name;
}
void
OAIDvirBase::setTrailerName(const QString &trailer_name) {
    this->trailer_name = trailer_name;
    this->m_trailer_name_isSet = true;
}

OAIDvirBase_vehicle
OAIDvirBase::getVehicle() const {
    return vehicle;
}
void
OAIDvirBase::setVehicle(const OAIDvirBase_vehicle &vehicle) {
    this->vehicle = vehicle;
    this->m_vehicle_isSet = true;
}

QString
OAIDvirBase::getVehicleCondition() const {
    return vehicle_condition;
}
void
OAIDvirBase::setVehicleCondition(const QString &vehicle_condition) {
    this->vehicle_condition = vehicle_condition;
    this->m_vehicle_condition_isSet = true;
}

QList<OAIDvirBase_trailerDefects>
OAIDvirBase::getVehicleDefects() const {
    return vehicle_defects;
}
void
OAIDvirBase::setVehicleDefects(const QList<OAIDvirBase_trailerDefects> &vehicle_defects) {
    this->vehicle_defects = vehicle_defects;
    this->m_vehicle_defects_isSet = true;
}

bool
OAIDvirBase::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(author_signature.isSet()){ isObjectUpdated = true; break;}
    
        if(m_defects_corrected_isSet){ isObjectUpdated = true; break;}
    
        if(m_defects_need_not_be_corrected_isSet){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_inspection_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_mechanic_notes_isSet){ isObjectUpdated = true; break;}
    
        if(mechanic_or_agent_signature.isSet()){ isObjectUpdated = true; break;}
    
        if(next_driver_signature.isSet()){ isObjectUpdated = true; break;}
    
        if(m_odometer_miles_isSet){ isObjectUpdated = true; break;}
    
        if(m_time_ms_isSet){ isObjectUpdated = true; break;}
    
        if(trailer_defects.size() > 0){ isObjectUpdated = true; break;}
    
        if(m_trailer_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_trailer_name_isSet){ isObjectUpdated = true; break;}
    
        if(vehicle.isSet()){ isObjectUpdated = true; break;}
    
        if(m_vehicle_condition_isSet){ isObjectUpdated = true; break;}
    
        if(vehicle_defects.size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIDvirBase::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

