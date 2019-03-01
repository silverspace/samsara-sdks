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


#include "OAIInline_object_12.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIInline_object_12::OAIInline_object_12(QString json) {
    this->init();
    this->fromJson(json);
}

OAIInline_object_12::OAIInline_object_12() {
    this->init();
}

OAIInline_object_12::~OAIInline_object_12() {

}

void
OAIInline_object_12::init() {
    m_inspection_type_isSet = false;
    m_inspection_type_isValid = false;
    m_mechanic_notes_isSet = false;
    m_mechanic_notes_isValid = false;
    m_odometer_miles_isSet = false;
    m_odometer_miles_isValid = false;
    m_previous_defects_corrected_isSet = false;
    m_previous_defects_corrected_isValid = false;
    m_previous_defects_ignored_isSet = false;
    m_previous_defects_ignored_isValid = false;
    m_safe_isSet = false;
    m_safe_isValid = false;
    m_trailer_id_isSet = false;
    m_trailer_id_isValid = false;
    m_user_email_isSet = false;
    m_user_email_isValid = false;
    m_vehicle_id_isSet = false;
    m_vehicle_id_isValid = false;
}

void
OAIInline_object_12::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIInline_object_12::fromJsonObject(QJsonObject json) {
    m_inspection_type_isValid = ::OpenAPI::fromJsonValue(inspection_type, json[QString("inspectionType")]);
    
    m_mechanic_notes_isValid = ::OpenAPI::fromJsonValue(mechanic_notes, json[QString("mechanicNotes")]);
    
    m_odometer_miles_isValid = ::OpenAPI::fromJsonValue(odometer_miles, json[QString("odometerMiles")]);
    
    m_previous_defects_corrected_isValid = ::OpenAPI::fromJsonValue(previous_defects_corrected, json[QString("previousDefectsCorrected")]);
    
    m_previous_defects_ignored_isValid = ::OpenAPI::fromJsonValue(previous_defects_ignored, json[QString("previousDefectsIgnored")]);
    
    m_safe_isValid = ::OpenAPI::fromJsonValue(safe, json[QString("safe")]);
    
    m_trailer_id_isValid = ::OpenAPI::fromJsonValue(trailer_id, json[QString("trailerId")]);
    
    m_user_email_isValid = ::OpenAPI::fromJsonValue(user_email, json[QString("userEmail")]);
    
    m_vehicle_id_isValid = ::OpenAPI::fromJsonValue(vehicle_id, json[QString("vehicleId")]);
    
}

QString
OAIInline_object_12::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIInline_object_12::asJsonObject() const {
    QJsonObject obj;
	if(m_inspection_type_isSet){
        obj.insert(QString("inspectionType"), ::OpenAPI::toJsonValue(inspection_type));
    }
	if(m_mechanic_notes_isSet){
        obj.insert(QString("mechanicNotes"), ::OpenAPI::toJsonValue(mechanic_notes));
    }
	if(m_odometer_miles_isSet){
        obj.insert(QString("odometerMiles"), ::OpenAPI::toJsonValue(odometer_miles));
    }
	if(m_previous_defects_corrected_isSet){
        obj.insert(QString("previousDefectsCorrected"), ::OpenAPI::toJsonValue(previous_defects_corrected));
    }
	if(m_previous_defects_ignored_isSet){
        obj.insert(QString("previousDefectsIgnored"), ::OpenAPI::toJsonValue(previous_defects_ignored));
    }
	if(m_safe_isSet){
        obj.insert(QString("safe"), ::OpenAPI::toJsonValue(safe));
    }
	if(m_trailer_id_isSet){
        obj.insert(QString("trailerId"), ::OpenAPI::toJsonValue(trailer_id));
    }
	if(m_user_email_isSet){
        obj.insert(QString("userEmail"), ::OpenAPI::toJsonValue(user_email));
    }
	if(m_vehicle_id_isSet){
        obj.insert(QString("vehicleId"), ::OpenAPI::toJsonValue(vehicle_id));
    }
    return obj;
}

QString
OAIInline_object_12::getInspectionType() const {
    return inspection_type;
}
void
OAIInline_object_12::setInspectionType(const QString &inspection_type) {
    this->inspection_type = inspection_type;
    this->m_inspection_type_isSet = true;
}

QString
OAIInline_object_12::getMechanicNotes() const {
    return mechanic_notes;
}
void
OAIInline_object_12::setMechanicNotes(const QString &mechanic_notes) {
    this->mechanic_notes = mechanic_notes;
    this->m_mechanic_notes_isSet = true;
}

qint32
OAIInline_object_12::getOdometerMiles() const {
    return odometer_miles;
}
void
OAIInline_object_12::setOdometerMiles(const qint32 &odometer_miles) {
    this->odometer_miles = odometer_miles;
    this->m_odometer_miles_isSet = true;
}

bool
OAIInline_object_12::isPreviousDefectsCorrected() const {
    return previous_defects_corrected;
}
void
OAIInline_object_12::setPreviousDefectsCorrected(const bool &previous_defects_corrected) {
    this->previous_defects_corrected = previous_defects_corrected;
    this->m_previous_defects_corrected_isSet = true;
}

bool
OAIInline_object_12::isPreviousDefectsIgnored() const {
    return previous_defects_ignored;
}
void
OAIInline_object_12::setPreviousDefectsIgnored(const bool &previous_defects_ignored) {
    this->previous_defects_ignored = previous_defects_ignored;
    this->m_previous_defects_ignored_isSet = true;
}

QString
OAIInline_object_12::getSafe() const {
    return safe;
}
void
OAIInline_object_12::setSafe(const QString &safe) {
    this->safe = safe;
    this->m_safe_isSet = true;
}

qint32
OAIInline_object_12::getTrailerId() const {
    return trailer_id;
}
void
OAIInline_object_12::setTrailerId(const qint32 &trailer_id) {
    this->trailer_id = trailer_id;
    this->m_trailer_id_isSet = true;
}

QString
OAIInline_object_12::getUserEmail() const {
    return user_email;
}
void
OAIInline_object_12::setUserEmail(const QString &user_email) {
    this->user_email = user_email;
    this->m_user_email_isSet = true;
}

qint32
OAIInline_object_12::getVehicleId() const {
    return vehicle_id;
}
void
OAIInline_object_12::setVehicleId(const qint32 &vehicle_id) {
    this->vehicle_id = vehicle_id;
    this->m_vehicle_id_isSet = true;
}

bool
OAIInline_object_12::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_inspection_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_mechanic_notes_isSet){ isObjectUpdated = true; break;}
    
        if(m_odometer_miles_isSet){ isObjectUpdated = true; break;}
    
        if(m_previous_defects_corrected_isSet){ isObjectUpdated = true; break;}
    
        if(m_previous_defects_ignored_isSet){ isObjectUpdated = true; break;}
    
        if(m_safe_isSet){ isObjectUpdated = true; break;}
    
        if(m_trailer_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_user_email_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_id_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIInline_object_12::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_inspection_type_isValid && m_safe_isValid && m_user_email_isValid && true;
}

}

