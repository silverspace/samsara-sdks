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

#include "OAIRoutesApi.h"
#include "OAIHelpers.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIRoutesApi::OAIRoutesApi() {

}

OAIRoutesApi::~OAIRoutesApi() {

}

OAIRoutesApi::OAIRoutesApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
OAIRoutesApi::createDispatchRoute(const QString& access_token, const OAIDispatchRouteCreate& create_dispatch_route_params) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/dispatch/routes");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = create_dispatch_route_params.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::createDispatchRouteCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::createDispatchRouteCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDispatchRoute output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createDispatchRouteSignal(output);
        emit createDispatchRouteSignalFull(worker, output);
    } else {
        emit createDispatchRouteSignalE(output, error_type, error_str);
        emit createDispatchRouteSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::createDriverDispatchRoute(const QString& access_token, const qint64& driver_id, const OAIDispatchRouteCreate& create_dispatch_route_params) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/{driver_id}/dispatch/routes");
    QString driver_idPathParam("{"); 
    driver_idPathParam.append("driver_id").append("}");
    fullPath.replace(driver_idPathParam, ::OpenAPI::toStringValue(driver_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = create_dispatch_route_params.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::createDriverDispatchRouteCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::createDriverDispatchRouteCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDispatchRoute output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createDriverDispatchRouteSignal(output);
        emit createDriverDispatchRouteSignalFull(worker, output);
    } else {
        emit createDriverDispatchRouteSignalE(output, error_type, error_str);
        emit createDriverDispatchRouteSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::createVehicleDispatchRoute(const QString& access_token, const qint64& vehicle_id, const OAIDispatchRouteCreate& create_dispatch_route_params) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/{vehicle_id}/dispatch/routes");
    QString vehicle_idPathParam("{"); 
    vehicle_idPathParam.append("vehicle_id").append("}");
    fullPath.replace(vehicle_idPathParam, ::OpenAPI::toStringValue(vehicle_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = create_dispatch_route_params.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::createVehicleDispatchRouteCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::createVehicleDispatchRouteCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDispatchRoute output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createVehicleDispatchRouteSignal(output);
        emit createVehicleDispatchRouteSignalFull(worker, output);
    } else {
        emit createVehicleDispatchRouteSignalE(output, error_type, error_str);
        emit createVehicleDispatchRouteSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::deleteDispatchRouteById(const QString& access_token, const qint64& route_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/dispatch/routes/{route_id}");
    QString route_idPathParam("{"); 
    route_idPathParam.append("route_id").append("}");
    fullPath.replace(route_idPathParam, ::OpenAPI::toStringValue(route_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "DELETE");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::deleteDispatchRouteByIdCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::deleteDispatchRouteByIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit deleteDispatchRouteByIdSignal();
        emit deleteDispatchRouteByIdSignalFull(worker);
    } else {
        emit deleteDispatchRouteByIdSignalE(error_type, error_str);
        emit deleteDispatchRouteByIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::fetchAllDispatchRoutes(const QString& access_token, const qint64& group_id, const qint64& end_time, const qint64& duration) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/dispatch/routes");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("group_id"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(group_id)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("end_time"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_time)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("duration"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(duration)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::fetchAllDispatchRoutesCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::fetchAllDispatchRoutesCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIDispatchRoute> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIDispatchRoute val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit fetchAllDispatchRoutesSignal(output);
        emit fetchAllDispatchRoutesSignalFull(worker, output);
    } else {
        emit fetchAllDispatchRoutesSignalE(output, error_type, error_str);
        emit fetchAllDispatchRoutesSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::fetchAllRouteJobUpdates(const QString& access_token, const qint64& group_id, const QString& sequence_id, const QString& include) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/dispatch/routes/job_updates");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("group_id"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(group_id)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("sequence_id"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(sequence_id)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("include"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(include)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::fetchAllRouteJobUpdatesCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::fetchAllRouteJobUpdatesCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIAllRouteJobUpdates output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit fetchAllRouteJobUpdatesSignal(output);
        emit fetchAllRouteJobUpdatesSignalFull(worker, output);
    } else {
        emit fetchAllRouteJobUpdatesSignalE(output, error_type, error_str);
        emit fetchAllRouteJobUpdatesSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::getDispatchRouteById(const QString& access_token, const qint64& route_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/dispatch/routes/{route_id}");
    QString route_idPathParam("{"); 
    route_idPathParam.append("route_id").append("}");
    fullPath.replace(route_idPathParam, ::OpenAPI::toStringValue(route_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::getDispatchRouteByIdCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::getDispatchRouteByIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDispatchRoute output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDispatchRouteByIdSignal(output);
        emit getDispatchRouteByIdSignalFull(worker, output);
    } else {
        emit getDispatchRouteByIdSignalE(output, error_type, error_str);
        emit getDispatchRouteByIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::getDispatchRouteHistory(const QString& access_token, const qint64& route_id, const qint64& start_time, const qint64& end_time) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/dispatch/routes/{route_id}/history");
    QString route_idPathParam("{"); 
    route_idPathParam.append("route_id").append("}");
    fullPath.replace(route_idPathParam, ::OpenAPI::toStringValue(route_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("start_time"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_time)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("end_time"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_time)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::getDispatchRouteHistoryCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::getDispatchRouteHistoryCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDispatchRouteHistory output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDispatchRouteHistorySignal(output);
        emit getDispatchRouteHistorySignalFull(worker, output);
    } else {
        emit getDispatchRouteHistorySignalE(output, error_type, error_str);
        emit getDispatchRouteHistorySignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::getDispatchRoutesByDriverId(const QString& access_token, const qint64& driver_id, const qint64& end_time, const qint64& duration) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/{driver_id}/dispatch/routes");
    QString driver_idPathParam("{"); 
    driver_idPathParam.append("driver_id").append("}");
    fullPath.replace(driver_idPathParam, ::OpenAPI::toStringValue(driver_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("end_time"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_time)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("duration"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(duration)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::getDispatchRoutesByDriverIdCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::getDispatchRoutesByDriverIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIDispatchRoute> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIDispatchRoute val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDispatchRoutesByDriverIdSignal(output);
        emit getDispatchRoutesByDriverIdSignalFull(worker, output);
    } else {
        emit getDispatchRoutesByDriverIdSignalE(output, error_type, error_str);
        emit getDispatchRoutesByDriverIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::getDispatchRoutesByVehicleId(const QString& access_token, const qint64& vehicle_id, const qint64& end_time, const qint64& duration) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/{vehicle_id}/dispatch/routes");
    QString vehicle_idPathParam("{"); 
    vehicle_idPathParam.append("vehicle_id").append("}");
    fullPath.replace(vehicle_idPathParam, ::OpenAPI::toStringValue(vehicle_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("end_time"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_time)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("duration"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(duration)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::getDispatchRoutesByVehicleIdCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::getDispatchRoutesByVehicleIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIDispatchRoute> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIDispatchRoute val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDispatchRoutesByVehicleIdSignal(output);
        emit getDispatchRoutesByVehicleIdSignalFull(worker, output);
    } else {
        emit getDispatchRoutesByVehicleIdSignalE(output, error_type, error_str);
        emit getDispatchRoutesByVehicleIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIRoutesApi::updateDispatchRouteById(const QString& access_token, const qint64& route_id, const OAIDispatchRoute& update_dispatch_route_params) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/dispatch/routes/{route_id}");
    QString route_idPathParam("{"); 
    route_idPathParam.append("route_id").append("}");
    fullPath.replace(route_idPathParam, ::OpenAPI::toStringValue(route_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "PUT");

    
    QString output = update_dispatch_route_params.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIRoutesApi::updateDispatchRouteByIdCallback);

    worker->execute(&input);
}

void
OAIRoutesApi::updateDispatchRouteByIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDispatchRoute output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit updateDispatchRouteByIdSignal(output);
        emit updateDispatchRouteByIdSignalFull(worker, output);
    } else {
        emit updateDispatchRouteByIdSignalE(output, error_type, error_str);
        emit updateDispatchRouteByIdSignalEFull(worker, error_type, error_str);
    }
}


}
