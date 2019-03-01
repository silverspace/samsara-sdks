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


#include "OAIDvirBase_nextDriverSignature.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIDvirBase_nextDriverSignature::OAIDvirBase_nextDriverSignature(QString json) {
    this->init();
    this->fromJson(json);
}

OAIDvirBase_nextDriverSignature::OAIDvirBase_nextDriverSignature() {
    this->init();
}

OAIDvirBase_nextDriverSignature::~OAIDvirBase_nextDriverSignature() {

}

void
OAIDvirBase_nextDriverSignature::init() {
    m_driver_id_isSet = false;
    m_driver_id_isValid = false;
    m_name_isSet = false;
    m_name_isValid = false;
    m_signed_at_isSet = false;
    m_signed_at_isValid = false;
    m_type_isSet = false;
    m_type_isValid = false;
    m_email_isSet = false;
    m_email_isValid = false;
    m_username_isSet = false;
    m_username_isValid = false;
}

void
OAIDvirBase_nextDriverSignature::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIDvirBase_nextDriverSignature::fromJsonObject(QJsonObject json) {
    m_driver_id_isValid = ::OpenAPI::fromJsonValue(driver_id, json[QString("driverId")]);
    
    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    m_signed_at_isValid = ::OpenAPI::fromJsonValue(signed_at, json[QString("signedAt")]);
    
    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    
    m_email_isValid = ::OpenAPI::fromJsonValue(email, json[QString("email")]);
    
    m_username_isValid = ::OpenAPI::fromJsonValue(username, json[QString("username")]);
    
}

QString
OAIDvirBase_nextDriverSignature::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIDvirBase_nextDriverSignature::asJsonObject() const {
    QJsonObject obj;
	if(m_driver_id_isSet){
        obj.insert(QString("driverId"), ::OpenAPI::toJsonValue(driver_id));
    }
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_signed_at_isSet){
        obj.insert(QString("signedAt"), ::OpenAPI::toJsonValue(signed_at));
    }
	if(m_type_isSet){
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
	if(m_email_isSet){
        obj.insert(QString("email"), ::OpenAPI::toJsonValue(email));
    }
	if(m_username_isSet){
        obj.insert(QString("username"), ::OpenAPI::toJsonValue(username));
    }
    return obj;
}

qint64
OAIDvirBase_nextDriverSignature::getDriverId() const {
    return driver_id;
}
void
OAIDvirBase_nextDriverSignature::setDriverId(const qint64 &driver_id) {
    this->driver_id = driver_id;
    this->m_driver_id_isSet = true;
}

QString
OAIDvirBase_nextDriverSignature::getName() const {
    return name;
}
void
OAIDvirBase_nextDriverSignature::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

qint64
OAIDvirBase_nextDriverSignature::getSignedAt() const {
    return signed_at;
}
void
OAIDvirBase_nextDriverSignature::setSignedAt(const qint64 &signed_at) {
    this->signed_at = signed_at;
    this->m_signed_at_isSet = true;
}

QString
OAIDvirBase_nextDriverSignature::getType() const {
    return type;
}
void
OAIDvirBase_nextDriverSignature::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

QString
OAIDvirBase_nextDriverSignature::getEmail() const {
    return email;
}
void
OAIDvirBase_nextDriverSignature::setEmail(const QString &email) {
    this->email = email;
    this->m_email_isSet = true;
}

QString
OAIDvirBase_nextDriverSignature::getUsername() const {
    return username;
}
void
OAIDvirBase_nextDriverSignature::setUsername(const QString &username) {
    this->username = username;
    this->m_username_isSet = true;
}

bool
OAIDvirBase_nextDriverSignature::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_driver_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_signed_at_isSet){ isObjectUpdated = true; break;}
    
        if(m_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_email_isSet){ isObjectUpdated = true; break;}
    
        if(m_username_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIDvirBase_nextDriverSignature::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

