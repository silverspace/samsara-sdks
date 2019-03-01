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


#include "OAIDriver.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIDriver::OAIDriver(QString json) {
    this->init();
    this->fromJson(json);
}

OAIDriver::OAIDriver() {
    this->init();
}

OAIDriver::~OAIDriver() {

}

void
OAIDriver::init() {
    m_eld_adverse_weather_exemption_enabled_isSet = false;
    m_eld_adverse_weather_exemption_enabled_isValid = false;
    m_eld_big_day_exemption_enabled_isSet = false;
    m_eld_big_day_exemption_enabled_isValid = false;
    m_eld_day_start_hour_isSet = false;
    m_eld_day_start_hour_isValid = false;
    m_eld_exempt_isSet = false;
    m_eld_exempt_isValid = false;
    m_eld_exempt_reason_isSet = false;
    m_eld_exempt_reason_isValid = false;
    m_eld_pc_enabled_isSet = false;
    m_eld_pc_enabled_isValid = false;
    m_eld_ym_enabled_isSet = false;
    m_eld_ym_enabled_isValid = false;
    m_external_ids_isSet = false;
    m_external_ids_isValid = false;
    m_group_id_isSet = false;
    m_group_id_isValid = false;
    m_license_number_isSet = false;
    m_license_number_isValid = false;
    m_license_state_isSet = false;
    m_license_state_isValid = false;
    m_name_isSet = false;
    m_name_isValid = false;
    m_notes_isSet = false;
    m_notes_isValid = false;
    m_phone_isSet = false;
    m_phone_isValid = false;
    m_username_isSet = false;
    m_username_isValid = false;
    m_vehicle_id_isSet = false;
    m_vehicle_id_isValid = false;
    m_id_isSet = false;
    m_id_isValid = false;
    m_is_deactivated_isSet = false;
    m_is_deactivated_isValid = false;
    m_tags_isSet = false;
    m_tags_isValid = false;
}

void
OAIDriver::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIDriver::fromJsonObject(QJsonObject json) {
    m_eld_adverse_weather_exemption_enabled_isValid = ::OpenAPI::fromJsonValue(eld_adverse_weather_exemption_enabled, json[QString("eldAdverseWeatherExemptionEnabled")]);
    
    m_eld_big_day_exemption_enabled_isValid = ::OpenAPI::fromJsonValue(eld_big_day_exemption_enabled, json[QString("eldBigDayExemptionEnabled")]);
    
    m_eld_day_start_hour_isValid = ::OpenAPI::fromJsonValue(eld_day_start_hour, json[QString("eldDayStartHour")]);
    
    m_eld_exempt_isValid = ::OpenAPI::fromJsonValue(eld_exempt, json[QString("eldExempt")]);
    
    m_eld_exempt_reason_isValid = ::OpenAPI::fromJsonValue(eld_exempt_reason, json[QString("eldExemptReason")]);
    
    m_eld_pc_enabled_isValid = ::OpenAPI::fromJsonValue(eld_pc_enabled, json[QString("eldPcEnabled")]);
    
    m_eld_ym_enabled_isValid = ::OpenAPI::fromJsonValue(eld_ym_enabled, json[QString("eldYmEnabled")]);
    
    
    m_external_ids_isValid = ::OpenAPI::fromJsonValue(external_ids, json[QString("externalIds")]);
    m_group_id_isValid = ::OpenAPI::fromJsonValue(group_id, json[QString("groupId")]);
    
    m_license_number_isValid = ::OpenAPI::fromJsonValue(license_number, json[QString("licenseNumber")]);
    
    m_license_state_isValid = ::OpenAPI::fromJsonValue(license_state, json[QString("licenseState")]);
    
    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    m_notes_isValid = ::OpenAPI::fromJsonValue(notes, json[QString("notes")]);
    
    m_phone_isValid = ::OpenAPI::fromJsonValue(phone, json[QString("phone")]);
    
    m_username_isValid = ::OpenAPI::fromJsonValue(username, json[QString("username")]);
    
    m_vehicle_id_isValid = ::OpenAPI::fromJsonValue(vehicle_id, json[QString("vehicleId")]);
    
    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    m_is_deactivated_isValid = ::OpenAPI::fromJsonValue(is_deactivated, json[QString("isDeactivated")]);
    
    
    m_tags_isValid = ::OpenAPI::fromJsonValue(tags, json[QString("tags")]);
}

QString
OAIDriver::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIDriver::asJsonObject() const {
    QJsonObject obj;
	if(m_eld_adverse_weather_exemption_enabled_isSet){
        obj.insert(QString("eldAdverseWeatherExemptionEnabled"), ::OpenAPI::toJsonValue(eld_adverse_weather_exemption_enabled));
    }
	if(m_eld_big_day_exemption_enabled_isSet){
        obj.insert(QString("eldBigDayExemptionEnabled"), ::OpenAPI::toJsonValue(eld_big_day_exemption_enabled));
    }
	if(m_eld_day_start_hour_isSet){
        obj.insert(QString("eldDayStartHour"), ::OpenAPI::toJsonValue(eld_day_start_hour));
    }
	if(m_eld_exempt_isSet){
        obj.insert(QString("eldExempt"), ::OpenAPI::toJsonValue(eld_exempt));
    }
	if(m_eld_exempt_reason_isSet){
        obj.insert(QString("eldExemptReason"), ::OpenAPI::toJsonValue(eld_exempt_reason));
    }
	if(m_eld_pc_enabled_isSet){
        obj.insert(QString("eldPcEnabled"), ::OpenAPI::toJsonValue(eld_pc_enabled));
    }
	if(m_eld_ym_enabled_isSet){
        obj.insert(QString("eldYmEnabled"), ::OpenAPI::toJsonValue(eld_ym_enabled));
    }
	
    if(external_ids.size() > 0){
        obj.insert(QString("externalIds"), ::OpenAPI::toJsonValue(external_ids));
    } 
	if(m_group_id_isSet){
        obj.insert(QString("groupId"), ::OpenAPI::toJsonValue(group_id));
    }
	if(m_license_number_isSet){
        obj.insert(QString("licenseNumber"), ::OpenAPI::toJsonValue(license_number));
    }
	if(m_license_state_isSet){
        obj.insert(QString("licenseState"), ::OpenAPI::toJsonValue(license_state));
    }
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_notes_isSet){
        obj.insert(QString("notes"), ::OpenAPI::toJsonValue(notes));
    }
	if(m_phone_isSet){
        obj.insert(QString("phone"), ::OpenAPI::toJsonValue(phone));
    }
	if(m_username_isSet){
        obj.insert(QString("username"), ::OpenAPI::toJsonValue(username));
    }
	if(m_vehicle_id_isSet){
        obj.insert(QString("vehicleId"), ::OpenAPI::toJsonValue(vehicle_id));
    }
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(m_is_deactivated_isSet){
        obj.insert(QString("isDeactivated"), ::OpenAPI::toJsonValue(is_deactivated));
    }
	
    if(tags.size() > 0){
        obj.insert(QString("tags"), ::OpenAPI::toJsonValue(tags));
    } 
    return obj;
}

bool
OAIDriver::isEldAdverseWeatherExemptionEnabled() const {
    return eld_adverse_weather_exemption_enabled;
}
void
OAIDriver::setEldAdverseWeatherExemptionEnabled(const bool &eld_adverse_weather_exemption_enabled) {
    this->eld_adverse_weather_exemption_enabled = eld_adverse_weather_exemption_enabled;
    this->m_eld_adverse_weather_exemption_enabled_isSet = true;
}

bool
OAIDriver::isEldBigDayExemptionEnabled() const {
    return eld_big_day_exemption_enabled;
}
void
OAIDriver::setEldBigDayExemptionEnabled(const bool &eld_big_day_exemption_enabled) {
    this->eld_big_day_exemption_enabled = eld_big_day_exemption_enabled;
    this->m_eld_big_day_exemption_enabled_isSet = true;
}

qint32
OAIDriver::getEldDayStartHour() const {
    return eld_day_start_hour;
}
void
OAIDriver::setEldDayStartHour(const qint32 &eld_day_start_hour) {
    this->eld_day_start_hour = eld_day_start_hour;
    this->m_eld_day_start_hour_isSet = true;
}

bool
OAIDriver::isEldExempt() const {
    return eld_exempt;
}
void
OAIDriver::setEldExempt(const bool &eld_exempt) {
    this->eld_exempt = eld_exempt;
    this->m_eld_exempt_isSet = true;
}

QString
OAIDriver::getEldExemptReason() const {
    return eld_exempt_reason;
}
void
OAIDriver::setEldExemptReason(const QString &eld_exempt_reason) {
    this->eld_exempt_reason = eld_exempt_reason;
    this->m_eld_exempt_reason_isSet = true;
}

bool
OAIDriver::isEldPcEnabled() const {
    return eld_pc_enabled;
}
void
OAIDriver::setEldPcEnabled(const bool &eld_pc_enabled) {
    this->eld_pc_enabled = eld_pc_enabled;
    this->m_eld_pc_enabled_isSet = true;
}

bool
OAIDriver::isEldYmEnabled() const {
    return eld_ym_enabled;
}
void
OAIDriver::setEldYmEnabled(const bool &eld_ym_enabled) {
    this->eld_ym_enabled = eld_ym_enabled;
    this->m_eld_ym_enabled_isSet = true;
}

QMap<QString, QString>
OAIDriver::getExternalIds() const {
    return external_ids;
}
void
OAIDriver::setExternalIds(const QMap<QString, QString> &external_ids) {
    this->external_ids = external_ids;
    this->m_external_ids_isSet = true;
}

qint64
OAIDriver::getGroupId() const {
    return group_id;
}
void
OAIDriver::setGroupId(const qint64 &group_id) {
    this->group_id = group_id;
    this->m_group_id_isSet = true;
}

QString
OAIDriver::getLicenseNumber() const {
    return license_number;
}
void
OAIDriver::setLicenseNumber(const QString &license_number) {
    this->license_number = license_number;
    this->m_license_number_isSet = true;
}

QString
OAIDriver::getLicenseState() const {
    return license_state;
}
void
OAIDriver::setLicenseState(const QString &license_state) {
    this->license_state = license_state;
    this->m_license_state_isSet = true;
}

QString
OAIDriver::getName() const {
    return name;
}
void
OAIDriver::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

QString
OAIDriver::getNotes() const {
    return notes;
}
void
OAIDriver::setNotes(const QString &notes) {
    this->notes = notes;
    this->m_notes_isSet = true;
}

QString
OAIDriver::getPhone() const {
    return phone;
}
void
OAIDriver::setPhone(const QString &phone) {
    this->phone = phone;
    this->m_phone_isSet = true;
}

QString
OAIDriver::getUsername() const {
    return username;
}
void
OAIDriver::setUsername(const QString &username) {
    this->username = username;
    this->m_username_isSet = true;
}

qint64
OAIDriver::getVehicleId() const {
    return vehicle_id;
}
void
OAIDriver::setVehicleId(const qint64 &vehicle_id) {
    this->vehicle_id = vehicle_id;
    this->m_vehicle_id_isSet = true;
}

qint64
OAIDriver::getId() const {
    return id;
}
void
OAIDriver::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool
OAIDriver::isIsDeactivated() const {
    return is_deactivated;
}
void
OAIDriver::setIsDeactivated(const bool &is_deactivated) {
    this->is_deactivated = is_deactivated;
    this->m_is_deactivated_isSet = true;
}

QList<OAITagMetadata>
OAIDriver::getTags() const {
    return tags;
}
void
OAIDriver::setTags(const QList<OAITagMetadata> &tags) {
    this->tags = tags;
    this->m_tags_isSet = true;
}

bool
OAIDriver::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_eld_adverse_weather_exemption_enabled_isSet){ isObjectUpdated = true; break;}
    
        if(m_eld_big_day_exemption_enabled_isSet){ isObjectUpdated = true; break;}
    
        if(m_eld_day_start_hour_isSet){ isObjectUpdated = true; break;}
    
        if(m_eld_exempt_isSet){ isObjectUpdated = true; break;}
    
        if(m_eld_exempt_reason_isSet){ isObjectUpdated = true; break;}
    
        if(m_eld_pc_enabled_isSet){ isObjectUpdated = true; break;}
    
        if(m_eld_ym_enabled_isSet){ isObjectUpdated = true; break;}
    
        if(external_ids.size() > 0){ isObjectUpdated = true; break;}
    
        if(m_group_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_license_number_isSet){ isObjectUpdated = true; break;}
    
        if(m_license_state_isSet){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_notes_isSet){ isObjectUpdated = true; break;}
    
        if(m_phone_isSet){ isObjectUpdated = true; break;}
    
        if(m_username_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_is_deactivated_isSet){ isObjectUpdated = true; break;}
    
        if(tags.size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIDriver::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_name_isValid && m_id_isValid && true;
}

}

