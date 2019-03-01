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


#include "OAITripResponse_trips.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAITripResponse_trips::OAITripResponse_trips(QString json) {
    this->init();
    this->fromJson(json);
}

OAITripResponse_trips::OAITripResponse_trips() {
    this->init();
}

OAITripResponse_trips::~OAITripResponse_trips() {

}

void
OAITripResponse_trips::init() {
    m_end_odometer_isSet = false;
    m_end_odometer_isValid = false;
    m_distance_meters_isSet = false;
    m_distance_meters_isValid = false;
    m_end_ms_isSet = false;
    m_end_ms_isValid = false;
    m_start_ms_isSet = false;
    m_start_ms_isValid = false;
    m_fuel_consumed_ml_isSet = false;
    m_fuel_consumed_ml_isValid = false;
    m_start_address_isSet = false;
    m_start_address_isValid = false;
    m_start_coordinates_isSet = false;
    m_start_coordinates_isValid = false;
    m_end_coordinates_isSet = false;
    m_end_coordinates_isValid = false;
    m_start_odometer_isSet = false;
    m_start_odometer_isValid = false;
    m_driver_id_isSet = false;
    m_driver_id_isValid = false;
    m_start_location_isSet = false;
    m_start_location_isValid = false;
    m_toll_meters_isSet = false;
    m_toll_meters_isValid = false;
    m_end_address_isSet = false;
    m_end_address_isValid = false;
    m_end_location_isSet = false;
    m_end_location_isValid = false;
}

void
OAITripResponse_trips::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAITripResponse_trips::fromJsonObject(QJsonObject json) {
    m_end_odometer_isValid = ::OpenAPI::fromJsonValue(end_odometer, json[QString("endOdometer")]);
    
    m_distance_meters_isValid = ::OpenAPI::fromJsonValue(distance_meters, json[QString("distanceMeters")]);
    
    m_end_ms_isValid = ::OpenAPI::fromJsonValue(end_ms, json[QString("endMs")]);
    
    m_start_ms_isValid = ::OpenAPI::fromJsonValue(start_ms, json[QString("startMs")]);
    
    m_fuel_consumed_ml_isValid = ::OpenAPI::fromJsonValue(fuel_consumed_ml, json[QString("fuelConsumedMl")]);
    
    m_start_address_isValid = ::OpenAPI::fromJsonValue(start_address, json[QString("startAddress")]);
    
    m_start_coordinates_isValid = ::OpenAPI::fromJsonValue(start_coordinates, json[QString("startCoordinates")]);
    
    m_end_coordinates_isValid = ::OpenAPI::fromJsonValue(end_coordinates, json[QString("endCoordinates")]);
    
    m_start_odometer_isValid = ::OpenAPI::fromJsonValue(start_odometer, json[QString("startOdometer")]);
    
    m_driver_id_isValid = ::OpenAPI::fromJsonValue(driver_id, json[QString("driverId")]);
    
    m_start_location_isValid = ::OpenAPI::fromJsonValue(start_location, json[QString("startLocation")]);
    
    m_toll_meters_isValid = ::OpenAPI::fromJsonValue(toll_meters, json[QString("tollMeters")]);
    
    m_end_address_isValid = ::OpenAPI::fromJsonValue(end_address, json[QString("endAddress")]);
    
    m_end_location_isValid = ::OpenAPI::fromJsonValue(end_location, json[QString("endLocation")]);
    
}

QString
OAITripResponse_trips::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAITripResponse_trips::asJsonObject() const {
    QJsonObject obj;
	if(m_end_odometer_isSet){
        obj.insert(QString("endOdometer"), ::OpenAPI::toJsonValue(end_odometer));
    }
	if(m_distance_meters_isSet){
        obj.insert(QString("distanceMeters"), ::OpenAPI::toJsonValue(distance_meters));
    }
	if(m_end_ms_isSet){
        obj.insert(QString("endMs"), ::OpenAPI::toJsonValue(end_ms));
    }
	if(m_start_ms_isSet){
        obj.insert(QString("startMs"), ::OpenAPI::toJsonValue(start_ms));
    }
	if(m_fuel_consumed_ml_isSet){
        obj.insert(QString("fuelConsumedMl"), ::OpenAPI::toJsonValue(fuel_consumed_ml));
    }
	if(m_start_address_isSet){
        obj.insert(QString("startAddress"), ::OpenAPI::toJsonValue(start_address));
    }
	if(start_coordinates.isSet()){
        obj.insert(QString("startCoordinates"), ::OpenAPI::toJsonValue(start_coordinates));
    }
	if(end_coordinates.isSet()){
        obj.insert(QString("endCoordinates"), ::OpenAPI::toJsonValue(end_coordinates));
    }
	if(m_start_odometer_isSet){
        obj.insert(QString("startOdometer"), ::OpenAPI::toJsonValue(start_odometer));
    }
	if(m_driver_id_isSet){
        obj.insert(QString("driverId"), ::OpenAPI::toJsonValue(driver_id));
    }
	if(m_start_location_isSet){
        obj.insert(QString("startLocation"), ::OpenAPI::toJsonValue(start_location));
    }
	if(m_toll_meters_isSet){
        obj.insert(QString("tollMeters"), ::OpenAPI::toJsonValue(toll_meters));
    }
	if(m_end_address_isSet){
        obj.insert(QString("endAddress"), ::OpenAPI::toJsonValue(end_address));
    }
	if(m_end_location_isSet){
        obj.insert(QString("endLocation"), ::OpenAPI::toJsonValue(end_location));
    }
    return obj;
}

qint32
OAITripResponse_trips::getEndOdometer() const {
    return end_odometer;
}
void
OAITripResponse_trips::setEndOdometer(const qint32 &end_odometer) {
    this->end_odometer = end_odometer;
    this->m_end_odometer_isSet = true;
}

qint32
OAITripResponse_trips::getDistanceMeters() const {
    return distance_meters;
}
void
OAITripResponse_trips::setDistanceMeters(const qint32 &distance_meters) {
    this->distance_meters = distance_meters;
    this->m_distance_meters_isSet = true;
}

qint32
OAITripResponse_trips::getEndMs() const {
    return end_ms;
}
void
OAITripResponse_trips::setEndMs(const qint32 &end_ms) {
    this->end_ms = end_ms;
    this->m_end_ms_isSet = true;
}

qint32
OAITripResponse_trips::getStartMs() const {
    return start_ms;
}
void
OAITripResponse_trips::setStartMs(const qint32 &start_ms) {
    this->start_ms = start_ms;
    this->m_start_ms_isSet = true;
}

qint32
OAITripResponse_trips::getFuelConsumedMl() const {
    return fuel_consumed_ml;
}
void
OAITripResponse_trips::setFuelConsumedMl(const qint32 &fuel_consumed_ml) {
    this->fuel_consumed_ml = fuel_consumed_ml;
    this->m_fuel_consumed_ml_isSet = true;
}

QString
OAITripResponse_trips::getStartAddress() const {
    return start_address;
}
void
OAITripResponse_trips::setStartAddress(const QString &start_address) {
    this->start_address = start_address;
    this->m_start_address_isSet = true;
}

OAITripResponse_startCoordinates
OAITripResponse_trips::getStartCoordinates() const {
    return start_coordinates;
}
void
OAITripResponse_trips::setStartCoordinates(const OAITripResponse_startCoordinates &start_coordinates) {
    this->start_coordinates = start_coordinates;
    this->m_start_coordinates_isSet = true;
}

OAITripResponse_endCoordinates
OAITripResponse_trips::getEndCoordinates() const {
    return end_coordinates;
}
void
OAITripResponse_trips::setEndCoordinates(const OAITripResponse_endCoordinates &end_coordinates) {
    this->end_coordinates = end_coordinates;
    this->m_end_coordinates_isSet = true;
}

qint32
OAITripResponse_trips::getStartOdometer() const {
    return start_odometer;
}
void
OAITripResponse_trips::setStartOdometer(const qint32 &start_odometer) {
    this->start_odometer = start_odometer;
    this->m_start_odometer_isSet = true;
}

qint32
OAITripResponse_trips::getDriverId() const {
    return driver_id;
}
void
OAITripResponse_trips::setDriverId(const qint32 &driver_id) {
    this->driver_id = driver_id;
    this->m_driver_id_isSet = true;
}

QString
OAITripResponse_trips::getStartLocation() const {
    return start_location;
}
void
OAITripResponse_trips::setStartLocation(const QString &start_location) {
    this->start_location = start_location;
    this->m_start_location_isSet = true;
}

qint32
OAITripResponse_trips::getTollMeters() const {
    return toll_meters;
}
void
OAITripResponse_trips::setTollMeters(const qint32 &toll_meters) {
    this->toll_meters = toll_meters;
    this->m_toll_meters_isSet = true;
}

QString
OAITripResponse_trips::getEndAddress() const {
    return end_address;
}
void
OAITripResponse_trips::setEndAddress(const QString &end_address) {
    this->end_address = end_address;
    this->m_end_address_isSet = true;
}

QString
OAITripResponse_trips::getEndLocation() const {
    return end_location;
}
void
OAITripResponse_trips::setEndLocation(const QString &end_location) {
    this->end_location = end_location;
    this->m_end_location_isSet = true;
}

bool
OAITripResponse_trips::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_end_odometer_isSet){ isObjectUpdated = true; break;}
    
        if(m_distance_meters_isSet){ isObjectUpdated = true; break;}
    
        if(m_end_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_ms_isSet){ isObjectUpdated = true; break;}
    
        if(m_fuel_consumed_ml_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_address_isSet){ isObjectUpdated = true; break;}
    
        if(start_coordinates.isSet()){ isObjectUpdated = true; break;}
    
        if(end_coordinates.isSet()){ isObjectUpdated = true; break;}
    
        if(m_start_odometer_isSet){ isObjectUpdated = true; break;}
    
        if(m_driver_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_start_location_isSet){ isObjectUpdated = true; break;}
    
        if(m_toll_meters_isSet){ isObjectUpdated = true; break;}
    
        if(m_end_address_isSet){ isObjectUpdated = true; break;}
    
        if(m_end_location_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAITripResponse_trips::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

