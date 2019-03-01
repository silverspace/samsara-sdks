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


#include "OAITag.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAITag::OAITag(QString json) {
    this->init();
    this->fromJson(json);
}

OAITag::OAITag() {
    this->init();
}

OAITag::~OAITag() {

}

void
OAITag::init() {
    m_addresses_isSet = false;
    m_addresses_isValid = false;
    m_assets_isSet = false;
    m_assets_isValid = false;
    m_drivers_isSet = false;
    m_drivers_isValid = false;
    m_group_id_isSet = false;
    m_group_id_isValid = false;
    m_id_isSet = false;
    m_id_isValid = false;
    m_machines_isSet = false;
    m_machines_isValid = false;
    m_name_isSet = false;
    m_name_isValid = false;
    m_parent_tag_id_isSet = false;
    m_parent_tag_id_isValid = false;
    m_sensors_isSet = false;
    m_sensors_isValid = false;
    m_vehicles_isSet = false;
    m_vehicles_isValid = false;
}

void
OAITag::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAITag::fromJsonObject(QJsonObject json) {
    
    m_addresses_isValid = ::OpenAPI::fromJsonValue(addresses, json[QString("addresses")]);
    
    m_assets_isValid = ::OpenAPI::fromJsonValue(assets, json[QString("assets")]);
    
    m_drivers_isValid = ::OpenAPI::fromJsonValue(drivers, json[QString("drivers")]);
    m_group_id_isValid = ::OpenAPI::fromJsonValue(group_id, json[QString("groupId")]);
    
    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    
    m_machines_isValid = ::OpenAPI::fromJsonValue(machines, json[QString("machines")]);
    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    m_parent_tag_id_isValid = ::OpenAPI::fromJsonValue(parent_tag_id, json[QString("parentTagId")]);
    
    
    m_sensors_isValid = ::OpenAPI::fromJsonValue(sensors, json[QString("sensors")]);
    
    m_vehicles_isValid = ::OpenAPI::fromJsonValue(vehicles, json[QString("vehicles")]);
}

QString
OAITag::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAITag::asJsonObject() const {
    QJsonObject obj;
	
    if(addresses.size() > 0){
        obj.insert(QString("addresses"), ::OpenAPI::toJsonValue(addresses));
    } 
	
    if(assets.size() > 0){
        obj.insert(QString("assets"), ::OpenAPI::toJsonValue(assets));
    } 
	
    if(drivers.size() > 0){
        obj.insert(QString("drivers"), ::OpenAPI::toJsonValue(drivers));
    } 
	if(m_group_id_isSet){
        obj.insert(QString("groupId"), ::OpenAPI::toJsonValue(group_id));
    }
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	
    if(machines.size() > 0){
        obj.insert(QString("machines"), ::OpenAPI::toJsonValue(machines));
    } 
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_parent_tag_id_isSet){
        obj.insert(QString("parentTagId"), ::OpenAPI::toJsonValue(parent_tag_id));
    }
	
    if(sensors.size() > 0){
        obj.insert(QString("sensors"), ::OpenAPI::toJsonValue(sensors));
    } 
	
    if(vehicles.size() > 0){
        obj.insert(QString("vehicles"), ::OpenAPI::toJsonValue(vehicles));
    } 
    return obj;
}

QList<OAITaggedAddress>
OAITag::getAddresses() const {
    return addresses;
}
void
OAITag::setAddresses(const QList<OAITaggedAddress> &addresses) {
    this->addresses = addresses;
    this->m_addresses_isSet = true;
}

QList<OAITaggedAsset>
OAITag::getAssets() const {
    return assets;
}
void
OAITag::setAssets(const QList<OAITaggedAsset> &assets) {
    this->assets = assets;
    this->m_assets_isSet = true;
}

QList<OAITaggedDriver>
OAITag::getDrivers() const {
    return drivers;
}
void
OAITag::setDrivers(const QList<OAITaggedDriver> &drivers) {
    this->drivers = drivers;
    this->m_drivers_isSet = true;
}

qint64
OAITag::getGroupId() const {
    return group_id;
}
void
OAITag::setGroupId(const qint64 &group_id) {
    this->group_id = group_id;
    this->m_group_id_isSet = true;
}

qint64
OAITag::getId() const {
    return id;
}
void
OAITag::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

QList<OAITaggedMachine>
OAITag::getMachines() const {
    return machines;
}
void
OAITag::setMachines(const QList<OAITaggedMachine> &machines) {
    this->machines = machines;
    this->m_machines_isSet = true;
}

QString
OAITag::getName() const {
    return name;
}
void
OAITag::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

qint64
OAITag::getParentTagId() const {
    return parent_tag_id;
}
void
OAITag::setParentTagId(const qint64 &parent_tag_id) {
    this->parent_tag_id = parent_tag_id;
    this->m_parent_tag_id_isSet = true;
}

QList<OAITaggedSensor>
OAITag::getSensors() const {
    return sensors;
}
void
OAITag::setSensors(const QList<OAITaggedSensor> &sensors) {
    this->sensors = sensors;
    this->m_sensors_isSet = true;
}

QList<OAITaggedVehicle>
OAITag::getVehicles() const {
    return vehicles;
}
void
OAITag::setVehicles(const QList<OAITaggedVehicle> &vehicles) {
    this->vehicles = vehicles;
    this->m_vehicles_isSet = true;
}

bool
OAITag::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(addresses.size() > 0){ isObjectUpdated = true; break;}
    
        if(assets.size() > 0){ isObjectUpdated = true; break;}
    
        if(drivers.size() > 0){ isObjectUpdated = true; break;}
    
        if(m_group_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(machines.size() > 0){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_parent_tag_id_isSet){ isObjectUpdated = true; break;}
    
        if(sensors.size() > 0){ isObjectUpdated = true; break;}
    
        if(vehicles.size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAITag::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_name_isValid && true;
}

}

