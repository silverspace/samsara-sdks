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

#include <QDebug>
#include "OAIHelpers.h"
#include "OAIObject.h"

namespace OpenAPI {


QString
toStringValue(const QString &value) {
    return value;
}

QString
toStringValue(const QDateTime &value){
    // ISO 8601
    return value.toString("yyyy-MM-ddTHH:mm:ss[Z|[+|-]HH:mm]");
}

QString
toStringValue(const QByteArray &value){
    return QString(value);
}

QString
toStringValue(const QDate &value){
    // ISO 8601
    return value.toString(Qt::DateFormat::ISODate);
}

QString
toStringValue(const qint32 &value) {
    return QString::number(value);
}

QString
toStringValue(const qint64 &value) {
    return QString::number(value);
}

QString
toStringValue(const bool &value) {
    return QString(value ? "true" : "false");
}

QString
toStringValue(const float &value){
    return QString::number(static_cast<double>(value));
}

QString
toStringValue(const double &value){
    return QString::number(value);
}

QJsonValue
toJsonValue(const QString &value){
    return  QJsonValue(value);
}

QJsonValue
toJsonValue(const QDateTime &value){
    return QJsonValue(value.toString(Qt::ISODate));
}

QJsonValue
toJsonValue(const QByteArray &value){
    return QJsonValue(QString(value.toBase64()));
}

QJsonValue
toJsonValue(const QDate &value){
    return QJsonValue(value.toString(Qt::ISODate));
}

QJsonValue
toJsonValue(const qint32 &value){
    return QJsonValue(value);
}

QJsonValue
toJsonValue(const qint64 &value){
    return QJsonValue(value);
}

QJsonValue
toJsonValue(const bool &value){
    return QJsonValue(value);
}

QJsonValue
toJsonValue(const float &value){
    return QJsonValue(static_cast<double>(value));
}

QJsonValue
toJsonValue(const double &value){
    return QJsonValue(value);
}

QJsonValue
toJsonValue(const OAIObject &value){
    return value.asJsonObject();
}

bool
fromStringValue(const QString &inStr, QString &value){
    value.clear();
    value.append(inStr);
    return !inStr.isEmpty();
}

bool
fromStringValue(const QString &inStr, QDateTime &value){
    if(inStr.isEmpty()){
        return false;
    }
    else{
        auto dateTime = QDateTime::fromString(inStr, "yyyy-MM-ddTHH:mm:ss[Z|[+|-]HH:mm]");
        if(dateTime.isValid()){
            value.setDate(dateTime.date());
            value.setTime(dateTime.time());
        }
        else{
            qDebug() << "DateTime is invalid";
        }
        return dateTime.isValid();
    }
}

bool
fromStringValue(const QString &inStr, QByteArray &value){
    if(inStr.isEmpty()){
        return false;
    }
    else{
        value.clear();
        value.append(inStr.toUtf8());
        return value.count() > 0;
    }
}

bool
fromStringValue(const QString &inStr, QDate &value){
    if(inStr.isEmpty()){
        return false;
    }
    else{
        auto date = QDate::fromString(inStr, Qt::DateFormat::ISODate);
        if(date.isValid()){
            value.setDate(date.year(), date.month(), date.day());
        }
        else{
            qDebug() << "Date is invalid";
        }
        return date.isValid();
    }
}

bool
fromStringValue(const QString &inStr, qint32 &value){
    bool ok = false;
    value = QVariant(inStr).toInt(&ok);
    return ok;
}

bool
fromStringValue(const QString &inStr, qint64 &value){
    bool ok = false;
    value = QVariant(inStr).toLongLong(&ok);
    return ok;
}

bool
fromStringValue(const QString &inStr, bool &value){
    value = QVariant(inStr).toBool();
    return ((inStr == "true") || (inStr == "false"));
}

bool
fromStringValue(const QString &inStr, float &value){
    bool ok = false;
    value = QVariant(inStr).toFloat(&ok);
    return ok;
}

bool
fromStringValue(const QString &inStr, double &value){
    bool ok = false;
    value = QVariant(inStr).toDouble(&ok);
    return ok;
}

bool
fromJsonValue(QString &value, const QJsonValue &jval){
    bool ok = true;
    if(!jval.isUndefined() && !jval.isNull()){
        if(jval.isString()){
            value = jval.toString();
        } else if(jval.isBool()) {
            value =  jval.toBool() ? "true" : "false";
        } else if(jval.isDouble()){
            value = QString::number(jval.toDouble());
        } else {
            ok = false;    
        }
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(QDateTime &value, const QJsonValue &jval){
    bool ok = true;    
    if(!jval.isUndefined() && !jval.isNull() && jval.isString()){
        value = QDateTime::fromString(jval.toString(), Qt::ISODate);
        ok = value.isValid();
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(QByteArray &value, const QJsonValue &jval){
    bool ok = true;
    if(!jval.isUndefined() && !jval.isNull() && jval.isString()) {
        value = QByteArray::fromBase64(QByteArray::fromStdString(jval.toString().toStdString()));
        ok = value.size() > 0 ;
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(QDate &value, const QJsonValue &jval){
    bool ok = true;    
    if(!jval.isUndefined() && !jval.isNull() && jval.isString()){
        value = QDate::fromString(jval.toString(), Qt::ISODate);
        ok = value.isValid();
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(qint32 &value, const QJsonValue &jval){
    bool ok = true;    
    if(!jval.isUndefined() && !jval.isNull() && !jval.isObject() && !jval.isArray()){
        value = jval.toInt();
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(qint64 &value, const QJsonValue &jval){
    bool ok = true;    
    if(!jval.isUndefined() && !jval.isNull() && !jval.isObject() && !jval.isArray()){
        value = jval.toVariant().toLongLong();
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(bool &value, const QJsonValue &jval){
    bool ok = true;    
    if(jval.isBool()){
        value = jval.toBool();
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(float &value, const QJsonValue &jval){
    bool ok = true;    
    if(jval.isDouble()){
        value = static_cast<float>(jval.toDouble());
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(double &value, const QJsonValue &jval){
    bool ok = true;    
    if(jval.isDouble()){
        value = jval.toDouble();
    } else {
        ok = false;
    }
    return ok;
}

bool
fromJsonValue(OAIObject  &value, const QJsonValue &jval){
    bool ok = true;    
    if(jval.isObject()){
        value.fromJsonObject(jval.toObject());
        ok = value.isValid();
    } else {
        ok = false;
    }
    return ok;
}

}
