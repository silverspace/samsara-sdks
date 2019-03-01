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


#include "OAIAssetReeferResponse.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIAssetReeferResponse::OAIAssetReeferResponse(QString json) {
    this->init();
    this->fromJson(json);
}

OAIAssetReeferResponse::OAIAssetReeferResponse() {
    this->init();
}

OAIAssetReeferResponse::~OAIAssetReeferResponse() {

}

void
OAIAssetReeferResponse::init() {
    m_asset_type_isSet = false;
    m_asset_type_isValid = false;
    m_id_isSet = false;
    m_id_isValid = false;
    m_name_isSet = false;
    m_name_isValid = false;
    m_reefer_stats_isSet = false;
    m_reefer_stats_isValid = false;
}

void
OAIAssetReeferResponse::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIAssetReeferResponse::fromJsonObject(QJsonObject json) {
    m_asset_type_isValid = ::OpenAPI::fromJsonValue(asset_type, json[QString("assetType")]);
    
    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    m_reefer_stats_isValid = ::OpenAPI::fromJsonValue(reefer_stats, json[QString("reeferStats")]);
    
}

QString
OAIAssetReeferResponse::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIAssetReeferResponse::asJsonObject() const {
    QJsonObject obj;
	if(m_asset_type_isSet){
        obj.insert(QString("assetType"), ::OpenAPI::toJsonValue(asset_type));
    }
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(reefer_stats.isSet()){
        obj.insert(QString("reeferStats"), ::OpenAPI::toJsonValue(reefer_stats));
    }
    return obj;
}

QString
OAIAssetReeferResponse::getAssetType() const {
    return asset_type;
}
void
OAIAssetReeferResponse::setAssetType(const QString &asset_type) {
    this->asset_type = asset_type;
    this->m_asset_type_isSet = true;
}

qint32
OAIAssetReeferResponse::getId() const {
    return id;
}
void
OAIAssetReeferResponse::setId(const qint32 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString
OAIAssetReeferResponse::getName() const {
    return name;
}
void
OAIAssetReeferResponse::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

OAIAssetReeferResponse_reeferStats
OAIAssetReeferResponse::getReeferStats() const {
    return reefer_stats;
}
void
OAIAssetReeferResponse::setReeferStats(const OAIAssetReeferResponse_reeferStats &reefer_stats) {
    this->reefer_stats = reefer_stats;
    this->m_reefer_stats_isSet = true;
}

bool
OAIAssetReeferResponse::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_asset_type_isSet){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(reefer_stats.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

bool
OAIAssetReeferResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

}

