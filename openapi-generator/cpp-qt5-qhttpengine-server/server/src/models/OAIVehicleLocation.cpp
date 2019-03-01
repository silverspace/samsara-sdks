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


#include "OAIVehicleLocation.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIVehicleLocation::OAIVehicleLocation(QString json) {
    this->init();
    this->fromJson(json);
}

OAIVehicleLocation::OAIVehicleLocation() {
    this->init();
}

OAIVehicleLocation::~OAIVehicleLocation() {

}

void
OAIVehicleLocation::init() {
    m_heading_isSet = false;
    m_heading_isValid = false;
    m_id_isSet = false;
    m_id_isValid = false;
    m_latitude_isSet = false;
    m_latitude_isValid = false;
    m_location_isSet = false;
    m_location_isValid = false;
    m_longitude_isSet = false;
    m_longitude_isValid = false;
    m_name_isSet = false;
    m_name_isValid = false;
    m_odometer_meters_isSet = false;
    m_odometer_meters_isValid = false;
    m_on_trip_isSet = false;
    m_on_trip_isValid = false;
    m_speed_isSet = false;
    m_speed_isValid = false;
    m_time_isSet = false;
    m_time_isValid = false;
    m_vin_isSet = false;
    m_vin_isValid = false;
}

void
OAIVehicleLocation::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIVehicleLocation::fromJsonObject(QJsonObject json) {
    m_heading_isValid = ::OpenAPI::fromJsonValue(heading, json[QString("heading")]);
    
    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    m_latitude_isValid = ::OpenAPI::fromJsonValue(latitude, json[QString("latitude")]);
    
    m_location_isValid = ::OpenAPI::fromJsonValue(location, json[QString("location")]);
    
    m_longitude_isValid = ::OpenAPI::fromJsonValue(longitude, json[QString("longitude")]);
    
    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    m_odometer_meters_isValid = ::OpenAPI::fromJsonValue(odometer_meters, json[QString("odometerMeters")]);
    
    m_on_trip_isValid = ::OpenAPI::fromJsonValue(on_trip, json[QString("onTrip")]);
    
    m_speed_isValid = ::OpenAPI::fromJsonValue(speed, json[QString("speed")]);
    
    m_time_isValid = ::OpenAPI::fromJsonValue(time, json[QString("time")]);
    
    m_vin_isValid = ::OpenAPI::fromJsonValue(vin, json[QString("vin")]);
    
}

QString
OAIVehicleLocation::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIVehicleLocation::asJsonObject() const {
    QJsonObject obj;
	if(m_heading_isSet){
        obj.insert(QString("heading"), ::OpenAPI::toJsonValue(heading));
    }
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(m_latitude_isSet){
        obj.insert(QString("latitude"), ::OpenAPI::toJsonValue(latitude));
    }
	if(m_location_isSet){
        obj.insert(QString("location"), ::OpenAPI::toJsonValue(location));
    }
	if(m_longitude_isSet){
        obj.insert(QString("longitude"), ::OpenAPI::toJsonValue(longitude));
    }
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_odometer_meters_isSet){
        obj.insert(QString("odometerMeters"), ::OpenAPI::toJsonValue(odometer_meters));
    }
	if(m_on_trip_isSet){
        obj.insert(QString("onTrip"), ::OpenAPI::toJsonValue(on_trip));
    }
	if(m_speed_isSet){
        obj.insert(QString("speed"), ::OpenAPI::toJsonValue(speed));
    }
	if(m_time_isSet){
        obj.insert(QString("time"), ::OpenAPI::toJsonValue(time));
    }
	if(m_vin_isSet){
        obj.insert(QString("vin"), ::OpenAPI::toJsonValue(vin));
    }
    return obj;
}

double
OAIVehicleLocation::getHeading() const {
    return heading;
}
void
OAIVehicleLocation::setHeading(const double &heading) {
    this->heading = heading;
    this->m_heading_isSet = true;
}

qint64
OAIVehicleLocation::getId() const {
    return id;
}
void
OAIVehicleLocation::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

double
OAIVehicleLocation::getLatitude() const {
    return latitude;
}
void
OAIVehicleLocation::setLatitude(const double &latitude) {
    this->latitude = latitude;
    this->m_latitude_isSet = true;
}

QString
OAIVehicleLocation::getLocation() const {
    return location;
}
void
OAIVehicleLocation::setLocation(const QString &location) {
    this->location = location;
    this->m_location_isSet = true;
}

double
OAIVehicleLocation::getLongitude() const {
    return longitude;
}
void
OAIVehicleLocation::setLongitude(const double &longitude) {
    this->longitude = longitude;
    this->m_longitude_isSet = true;
}

QString
OAIVehicleLocation::getName() const {
    return name;
}
void
OAIVehicleLocation::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

qint64
OAIVehicleLocation::getOdometerMeters() const {
    return odometer_meters;
}
void
OAIVehicleLocation::setOdometerMeters(const qint64 &odometer_meters) {
    this->odometer_meters = odometer_meters;
    this->m_odometer_meters_isSet = true;
}

bool
OAIVehicleLocation::isOnTrip() const {
    return on_trip;
}
void
OAIVehicleLocation::setOnTrip(const bool &on_trip) {
    this->on_trip = on_trip;
    this->m_on_trip_isSet = true;
}

double
OAIVehicleLocation::getSpeed() const {
    return speed;
}
void
OAIVehicleLocation::setSpeed(const double &speed) {
    this->speed = speed;
    this->m_speed_isSet = true;
}

qint32
OAIVehicleLocation::getTime() const {
    return time;
}
void
OAIVehicleLocation::setTime(const qint32 &time) {
    this->time = time;
    this->m_time_isSet = true;
}

QString
OAIVehicleLocation::getVin() const {
    return vin;
}
void
OAIVehicleLocation::setVin(const QString &vin) {
    this->vin = vin;
    this->m_vin_isSet = true;
}

bool
OAIVehicleLocation::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_heading_isSet){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_latitude_isSet){ isObjectUpdated = true; break;}
    
        if(m_location_isSet){ isObjectUpdated = true; break;}
    
        if(m_longitude_isSet){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_odometer_meters_isSet){ isObjectUpdated = true; break;}
    
        if(m_on_trip_isSet){ isObjectUpdated = true; break;}
    
        if(m_speed_isSet){ isObjectUpdated = true; break;}
    
        if(m_time_isSet){ isObjectUpdated = true; break;}
    
        if(m_vin_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIVehicleLocation::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && true;
}

}

