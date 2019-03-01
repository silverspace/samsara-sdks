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


#include "OAIHosLogsSummaryResponse_drivers.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIHosLogsSummaryResponse_drivers::OAIHosLogsSummaryResponse_drivers(QString json) {
    this->init();
    this->fromJson(json);
}

OAIHosLogsSummaryResponse_drivers::OAIHosLogsSummaryResponse_drivers() {
    this->init();
}

OAIHosLogsSummaryResponse_drivers::~OAIHosLogsSummaryResponse_drivers() {

}

void
OAIHosLogsSummaryResponse_drivers::init() {
    m_time_until_break_isSet = false;
    m_time_until_break_isValid = false;
    m_vehicle_name_isSet = false;
    m_vehicle_name_isValid = false;
    m_driving_in_violation_today_isSet = false;
    m_driving_in_violation_today_isValid = false;
    m_driver_id_isSet = false;
    m_driver_id_isValid = false;
    m_cycle_remaining_isSet = false;
    m_cycle_remaining_isValid = false;
    m_driver_name_isSet = false;
    m_driver_name_isValid = false;
    m_duty_status_isSet = false;
    m_duty_status_isValid = false;
    m_cycle_tomorrow_isSet = false;
    m_cycle_tomorrow_isValid = false;
    m_shift_drive_remaining_isSet = false;
    m_shift_drive_remaining_isValid = false;
    m_time_in_current_status_isSet = false;
    m_time_in_current_status_isValid = false;
    m_driving_in_violation_cycle_isSet = false;
    m_driving_in_violation_cycle_isValid = false;
    m_shift_remaining_isSet = false;
    m_shift_remaining_isValid = false;
}

void
OAIHosLogsSummaryResponse_drivers::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIHosLogsSummaryResponse_drivers::fromJsonObject(QJsonObject json) {
    m_time_until_break_isValid = ::OpenAPI::fromJsonValue(time_until_break, json[QString("timeUntilBreak")]);
    
    m_vehicle_name_isValid = ::OpenAPI::fromJsonValue(vehicle_name, json[QString("vehicleName")]);
    
    m_driving_in_violation_today_isValid = ::OpenAPI::fromJsonValue(driving_in_violation_today, json[QString("drivingInViolationToday")]);
    
    m_driver_id_isValid = ::OpenAPI::fromJsonValue(driver_id, json[QString("driverId")]);
    
    m_cycle_remaining_isValid = ::OpenAPI::fromJsonValue(cycle_remaining, json[QString("cycleRemaining")]);
    
    m_driver_name_isValid = ::OpenAPI::fromJsonValue(driver_name, json[QString("driverName")]);
    
    m_duty_status_isValid = ::OpenAPI::fromJsonValue(duty_status, json[QString("dutyStatus")]);
    
    m_cycle_tomorrow_isValid = ::OpenAPI::fromJsonValue(cycle_tomorrow, json[QString("cycleTomorrow")]);
    
    m_shift_drive_remaining_isValid = ::OpenAPI::fromJsonValue(shift_drive_remaining, json[QString("shiftDriveRemaining")]);
    
    m_time_in_current_status_isValid = ::OpenAPI::fromJsonValue(time_in_current_status, json[QString("timeInCurrentStatus")]);
    
    m_driving_in_violation_cycle_isValid = ::OpenAPI::fromJsonValue(driving_in_violation_cycle, json[QString("drivingInViolationCycle")]);
    
    m_shift_remaining_isValid = ::OpenAPI::fromJsonValue(shift_remaining, json[QString("shiftRemaining")]);
    
}

QString
OAIHosLogsSummaryResponse_drivers::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIHosLogsSummaryResponse_drivers::asJsonObject() const {
    QJsonObject obj;
	if(m_time_until_break_isSet){
        obj.insert(QString("timeUntilBreak"), ::OpenAPI::toJsonValue(time_until_break));
    }
	if(m_vehicle_name_isSet){
        obj.insert(QString("vehicleName"), ::OpenAPI::toJsonValue(vehicle_name));
    }
	if(m_driving_in_violation_today_isSet){
        obj.insert(QString("drivingInViolationToday"), ::OpenAPI::toJsonValue(driving_in_violation_today));
    }
	if(m_driver_id_isSet){
        obj.insert(QString("driverId"), ::OpenAPI::toJsonValue(driver_id));
    }
	if(m_cycle_remaining_isSet){
        obj.insert(QString("cycleRemaining"), ::OpenAPI::toJsonValue(cycle_remaining));
    }
	if(m_driver_name_isSet){
        obj.insert(QString("driverName"), ::OpenAPI::toJsonValue(driver_name));
    }
	if(m_duty_status_isSet){
        obj.insert(QString("dutyStatus"), ::OpenAPI::toJsonValue(duty_status));
    }
	if(m_cycle_tomorrow_isSet){
        obj.insert(QString("cycleTomorrow"), ::OpenAPI::toJsonValue(cycle_tomorrow));
    }
	if(m_shift_drive_remaining_isSet){
        obj.insert(QString("shiftDriveRemaining"), ::OpenAPI::toJsonValue(shift_drive_remaining));
    }
	if(m_time_in_current_status_isSet){
        obj.insert(QString("timeInCurrentStatus"), ::OpenAPI::toJsonValue(time_in_current_status));
    }
	if(m_driving_in_violation_cycle_isSet){
        obj.insert(QString("drivingInViolationCycle"), ::OpenAPI::toJsonValue(driving_in_violation_cycle));
    }
	if(m_shift_remaining_isSet){
        obj.insert(QString("shiftRemaining"), ::OpenAPI::toJsonValue(shift_remaining));
    }
    return obj;
}

qint64
OAIHosLogsSummaryResponse_drivers::getTimeUntilBreak() const {
    return time_until_break;
}
void
OAIHosLogsSummaryResponse_drivers::setTimeUntilBreak(const qint64 &time_until_break) {
    this->time_until_break = time_until_break;
    this->m_time_until_break_isSet = true;
}

QString
OAIHosLogsSummaryResponse_drivers::getVehicleName() const {
    return vehicle_name;
}
void
OAIHosLogsSummaryResponse_drivers::setVehicleName(const QString &vehicle_name) {
    this->vehicle_name = vehicle_name;
    this->m_vehicle_name_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getDrivingInViolationToday() const {
    return driving_in_violation_today;
}
void
OAIHosLogsSummaryResponse_drivers::setDrivingInViolationToday(const qint64 &driving_in_violation_today) {
    this->driving_in_violation_today = driving_in_violation_today;
    this->m_driving_in_violation_today_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getDriverId() const {
    return driver_id;
}
void
OAIHosLogsSummaryResponse_drivers::setDriverId(const qint64 &driver_id) {
    this->driver_id = driver_id;
    this->m_driver_id_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getCycleRemaining() const {
    return cycle_remaining;
}
void
OAIHosLogsSummaryResponse_drivers::setCycleRemaining(const qint64 &cycle_remaining) {
    this->cycle_remaining = cycle_remaining;
    this->m_cycle_remaining_isSet = true;
}

QString
OAIHosLogsSummaryResponse_drivers::getDriverName() const {
    return driver_name;
}
void
OAIHosLogsSummaryResponse_drivers::setDriverName(const QString &driver_name) {
    this->driver_name = driver_name;
    this->m_driver_name_isSet = true;
}

QString
OAIHosLogsSummaryResponse_drivers::getDutyStatus() const {
    return duty_status;
}
void
OAIHosLogsSummaryResponse_drivers::setDutyStatus(const QString &duty_status) {
    this->duty_status = duty_status;
    this->m_duty_status_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getCycleTomorrow() const {
    return cycle_tomorrow;
}
void
OAIHosLogsSummaryResponse_drivers::setCycleTomorrow(const qint64 &cycle_tomorrow) {
    this->cycle_tomorrow = cycle_tomorrow;
    this->m_cycle_tomorrow_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getShiftDriveRemaining() const {
    return shift_drive_remaining;
}
void
OAIHosLogsSummaryResponse_drivers::setShiftDriveRemaining(const qint64 &shift_drive_remaining) {
    this->shift_drive_remaining = shift_drive_remaining;
    this->m_shift_drive_remaining_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getTimeInCurrentStatus() const {
    return time_in_current_status;
}
void
OAIHosLogsSummaryResponse_drivers::setTimeInCurrentStatus(const qint64 &time_in_current_status) {
    this->time_in_current_status = time_in_current_status;
    this->m_time_in_current_status_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getDrivingInViolationCycle() const {
    return driving_in_violation_cycle;
}
void
OAIHosLogsSummaryResponse_drivers::setDrivingInViolationCycle(const qint64 &driving_in_violation_cycle) {
    this->driving_in_violation_cycle = driving_in_violation_cycle;
    this->m_driving_in_violation_cycle_isSet = true;
}

qint64
OAIHosLogsSummaryResponse_drivers::getShiftRemaining() const {
    return shift_remaining;
}
void
OAIHosLogsSummaryResponse_drivers::setShiftRemaining(const qint64 &shift_remaining) {
    this->shift_remaining = shift_remaining;
    this->m_shift_remaining_isSet = true;
}

bool
OAIHosLogsSummaryResponse_drivers::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_time_until_break_isSet){ isObjectUpdated = true; break;}
    
        if(m_vehicle_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_driving_in_violation_today_isSet){ isObjectUpdated = true; break;}
    
        if(m_driver_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_cycle_remaining_isSet){ isObjectUpdated = true; break;}
    
        if(m_driver_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_duty_status_isSet){ isObjectUpdated = true; break;}
    
        if(m_cycle_tomorrow_isSet){ isObjectUpdated = true; break;}
    
        if(m_shift_drive_remaining_isSet){ isObjectUpdated = true; break;}
    
        if(m_time_in_current_status_isSet){ isObjectUpdated = true; break;}
    
        if(m_driving_in_violation_cycle_isSet){ isObjectUpdated = true; break;}
    
        if(m_shift_remaining_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIHosLogsSummaryResponse_drivers::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

