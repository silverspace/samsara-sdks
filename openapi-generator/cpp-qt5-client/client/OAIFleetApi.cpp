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

#include "OAIFleetApi.h"
#include "OAIHelpers.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIFleetApi::OAIFleetApi() {

}

OAIFleetApi::~OAIFleetApi() {

}

OAIFleetApi::OAIFleetApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
OAIFleetApi::addFleetAddress(const QString& access_token, const OAIInline_object_2& address_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/add_address");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = address_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::addFleetAddressCallback);

    worker->execute(&input);
}

void
OAIFleetApi::addFleetAddressCallback(OAIHttpRequestWorker * worker) {
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
        emit addFleetAddressSignal();
        emit addFleetAddressSignalFull(worker);
    } else {
        emit addFleetAddressSignalE(error_type, error_str);
        emit addFleetAddressSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::addOrganizationAddresses(const QString& access_token, const OAIInline_object& addresses) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/addresses");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = addresses.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::addOrganizationAddressesCallback);

    worker->execute(&input);
}

void
OAIFleetApi::addOrganizationAddressesCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIAddress> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIAddress val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit addOrganizationAddressesSignal(output);
        emit addOrganizationAddressesSignalFull(worker, output);
    } else {
        emit addOrganizationAddressesSignalE(output, error_type, error_str);
        emit addOrganizationAddressesSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::createDispatchRoute(const QString& access_token, const OAIDispatchRouteCreate& create_dispatch_route_params) {
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
            &OAIFleetApi::createDispatchRouteCallback);

    worker->execute(&input);
}

void
OAIFleetApi::createDispatchRouteCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::createDriver(const QString& access_token, const OAIDriverForCreate& create_driver_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/create");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = create_driver_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::createDriverCallback);

    worker->execute(&input);
}

void
OAIFleetApi::createDriverCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriver output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createDriverSignal(output);
        emit createDriverSignalFull(worker, output);
    } else {
        emit createDriverSignalE(output, error_type, error_str);
        emit createDriverSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::createDriverDispatchRoute(const QString& access_token, const qint64& driver_id, const OAIDispatchRouteCreate& create_dispatch_route_params) {
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
            &OAIFleetApi::createDriverDispatchRouteCallback);

    worker->execute(&input);
}

void
OAIFleetApi::createDriverDispatchRouteCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::createDriverDocument(const QString& access_token, const qint64& driver_id, const OAIDocumentCreate& create_document_params) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/{driver_id}/documents");
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

    
    QString output = create_document_params.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::createDriverDocumentCallback);

    worker->execute(&input);
}

void
OAIFleetApi::createDriverDocumentCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDocument output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createDriverDocumentSignal(output);
        emit createDriverDocumentSignalFull(worker, output);
    } else {
        emit createDriverDocumentSignalE(output, error_type, error_str);
        emit createDriverDocumentSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::createDvir(const QString& access_token, const OAIInline_object_12& create_dvir_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/maintenance/dvirs");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = create_dvir_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::createDvirCallback);

    worker->execute(&input);
}

void
OAIFleetApi::createDvirCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDvirBase output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit createDvirSignal(output);
        emit createDvirSignalFull(worker, output);
    } else {
        emit createDvirSignalE(output, error_type, error_str);
        emit createDvirSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::createVehicleDispatchRoute(const QString& access_token, const qint64& vehicle_id, const OAIDispatchRouteCreate& create_dispatch_route_params) {
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
            &OAIFleetApi::createVehicleDispatchRouteCallback);

    worker->execute(&input);
}

void
OAIFleetApi::createVehicleDispatchRouteCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::deactivateDriver(const QString& access_token, const QString& driver_id_or_external_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/{driver_id_or_external_id}");
    QString driver_id_or_external_idPathParam("{"); 
    driver_id_or_external_idPathParam.append("driver_id_or_external_id").append("}");
    fullPath.replace(driver_id_or_external_idPathParam, ::OpenAPI::toStringValue(driver_id_or_external_id));
    
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
            &OAIFleetApi::deactivateDriverCallback);

    worker->execute(&input);
}

void
OAIFleetApi::deactivateDriverCallback(OAIHttpRequestWorker * worker) {
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
        emit deactivateDriverSignal();
        emit deactivateDriverSignalFull(worker);
    } else {
        emit deactivateDriverSignalE(error_type, error_str);
        emit deactivateDriverSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::deleteDispatchRouteById(const QString& access_token, const qint64& route_id) {
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
            &OAIFleetApi::deleteDispatchRouteByIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::deleteDispatchRouteByIdCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::deleteOrganizationAddress(const QString& access_token, const qint64& address_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/addresses/{addressId}");
    QString address_idPathParam("{"); 
    address_idPathParam.append("addressId").append("}");
    fullPath.replace(address_idPathParam, ::OpenAPI::toStringValue(address_id));
    
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
            &OAIFleetApi::deleteOrganizationAddressCallback);

    worker->execute(&input);
}

void
OAIFleetApi::deleteOrganizationAddressCallback(OAIHttpRequestWorker * worker) {
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
        emit deleteOrganizationAddressSignal();
        emit deleteOrganizationAddressSignalFull(worker);
    } else {
        emit deleteOrganizationAddressSignalE(error_type, error_str);
        emit deleteOrganizationAddressSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::fetchAllDispatchRoutes(const QString& access_token, const qint64& group_id, const qint64& end_time, const qint64& duration) {
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
            &OAIFleetApi::fetchAllDispatchRoutesCallback);

    worker->execute(&input);
}

void
OAIFleetApi::fetchAllDispatchRoutesCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::fetchAllRouteJobUpdates(const QString& access_token, const qint64& group_id, const QString& sequence_id, const QString& include) {
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
            &OAIFleetApi::fetchAllRouteJobUpdatesCallback);

    worker->execute(&input);
}

void
OAIFleetApi::fetchAllRouteJobUpdatesCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::getAllAssetCurrentLocations(const QString& access_token, const qint64& group_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/assets/locations");
    
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
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getAllAssetCurrentLocationsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getAllAssetCurrentLocationsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIInline_response_200_1 output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getAllAssetCurrentLocationsSignal(output);
        emit getAllAssetCurrentLocationsSignalFull(worker, output);
    } else {
        emit getAllAssetCurrentLocationsSignalE(output, error_type, error_str);
        emit getAllAssetCurrentLocationsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getAllAssets(const QString& access_token, const qint64& group_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/assets");
    
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
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getAllAssetsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getAllAssetsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIInline_response_200 output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getAllAssetsSignal(output);
        emit getAllAssetsSignalFull(worker, output);
    } else {
        emit getAllAssetsSignalE(output, error_type, error_str);
        emit getAllAssetsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getAllDeactivatedDrivers(const QString& access_token, const qint64& group_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/inactive");
    
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
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getAllDeactivatedDriversCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getAllDeactivatedDriversCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIDriver> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIDriver val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getAllDeactivatedDriversSignal(output);
        emit getAllDeactivatedDriversSignalFull(worker, output);
    } else {
        emit getAllDeactivatedDriversSignalE(output, error_type, error_str);
        emit getAllDeactivatedDriversSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getAssetLocation(const QString& access_token, const qint64& asset_id, const qint64& start_ms, const qint64& end_ms) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/assets/{asset_id}/locations");
    QString asset_idPathParam("{"); 
    asset_idPathParam.append("asset_id").append("}");
    fullPath.replace(asset_idPathParam, ::OpenAPI::toStringValue(asset_id));
    
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
    fullPath.append(QUrl::toPercentEncoding("startMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getAssetLocationCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getAssetLocationCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIObject> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIObject val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getAssetLocationSignal(output);
        emit getAssetLocationSignalFull(worker, output);
    } else {
        emit getAssetLocationSignalE(output, error_type, error_str);
        emit getAssetLocationSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getAssetReefer(const QString& access_token, const qint64& asset_id, const qint64& start_ms, const qint64& end_ms) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/assets/{asset_id}/reefer");
    QString asset_idPathParam("{"); 
    asset_idPathParam.append("asset_id").append("}");
    fullPath.replace(asset_idPathParam, ::OpenAPI::toStringValue(asset_id));
    
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
    fullPath.append(QUrl::toPercentEncoding("startMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getAssetReeferCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getAssetReeferCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIAssetReeferResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getAssetReeferSignal(output);
        emit getAssetReeferSignalFull(worker, output);
    } else {
        emit getAssetReeferSignalE(output, error_type, error_str);
        emit getAssetReeferSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getDeactivatedDriverById(const QString& access_token, const QString& driver_id_or_external_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/inactive/{driver_id_or_external_id}");
    QString driver_id_or_external_idPathParam("{"); 
    driver_id_or_external_idPathParam.append("driver_id_or_external_id").append("}");
    fullPath.replace(driver_id_or_external_idPathParam, ::OpenAPI::toStringValue(driver_id_or_external_id));
    
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
            &OAIFleetApi::getDeactivatedDriverByIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDeactivatedDriverByIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriver output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDeactivatedDriverByIdSignal(output);
        emit getDeactivatedDriverByIdSignalFull(worker, output);
    } else {
        emit getDeactivatedDriverByIdSignalE(output, error_type, error_str);
        emit getDeactivatedDriverByIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getDispatchRouteById(const QString& access_token, const qint64& route_id) {
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
            &OAIFleetApi::getDispatchRouteByIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDispatchRouteByIdCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::getDispatchRouteHistory(const QString& access_token, const qint64& route_id, const qint64& start_time, const qint64& end_time) {
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
            &OAIFleetApi::getDispatchRouteHistoryCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDispatchRouteHistoryCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::getDispatchRoutesByDriverId(const QString& access_token, const qint64& driver_id, const qint64& end_time, const qint64& duration) {
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
            &OAIFleetApi::getDispatchRoutesByDriverIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDispatchRoutesByDriverIdCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::getDispatchRoutesByVehicleId(const QString& access_token, const qint64& vehicle_id, const qint64& end_time, const qint64& duration) {
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
            &OAIFleetApi::getDispatchRoutesByVehicleIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDispatchRoutesByVehicleIdCallback(OAIHttpRequestWorker * worker) {
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
OAIFleetApi::getDriverById(const QString& access_token, const QString& driver_id_or_external_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/{driver_id_or_external_id}");
    QString driver_id_or_external_idPathParam("{"); 
    driver_id_or_external_idPathParam.append("driver_id_or_external_id").append("}");
    fullPath.replace(driver_id_or_external_idPathParam, ::OpenAPI::toStringValue(driver_id_or_external_id));
    
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
            &OAIFleetApi::getDriverByIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDriverByIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriver output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDriverByIdSignal(output);
        emit getDriverByIdSignalFull(worker, output);
    } else {
        emit getDriverByIdSignalE(output, error_type, error_str);
        emit getDriverByIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getDriverDocumentTypesByOrgId() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/document_types");
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getDriverDocumentTypesByOrgIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDriverDocumentTypesByOrgIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIDocumentType> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIDocumentType val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDriverDocumentTypesByOrgIdSignal(output);
        emit getDriverDocumentTypesByOrgIdSignalFull(worker, output);
    } else {
        emit getDriverDocumentTypesByOrgIdSignalE(output, error_type, error_str);
        emit getDriverDocumentTypesByOrgIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getDriverDocumentsByOrgId(const QString& access_token, const qint64& end_ms, const qint64& duration_ms) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/documents");
    
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
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("durationMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(duration_ms)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getDriverDocumentsByOrgIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDriverDocumentsByOrgIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIDocument> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIDocument val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDriverDocumentsByOrgIdSignal(output);
        emit getDriverDocumentsByOrgIdSignalFull(worker, output);
    } else {
        emit getDriverDocumentsByOrgIdSignalE(output, error_type, error_str);
        emit getDriverDocumentsByOrgIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getDriverSafetyScore(const qint64& driver_id, const QString& access_token, const qint64& start_ms, const qint64& end_ms) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/{driverId}/safety/score");
    QString driver_idPathParam("{"); 
    driver_idPathParam.append("driverId").append("}");
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
    fullPath.append(QUrl::toPercentEncoding("startMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getDriverSafetyScoreCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDriverSafetyScoreCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriverSafetyScoreResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDriverSafetyScoreSignal(output);
        emit getDriverSafetyScoreSignalFull(worker, output);
    } else {
        emit getDriverSafetyScoreSignalE(output, error_type, error_str);
        emit getDriverSafetyScoreSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getDvirs(const QString& access_token, const qint32& end_ms, const qint32& duration_ms, const qint32& group_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/maintenance/dvirs");
    
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
    fullPath.append(QUrl::toPercentEncoding("end_ms"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("duration_ms"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(duration_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("group_id"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(group_id)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getDvirsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getDvirsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDvirListResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getDvirsSignal(output);
        emit getDvirsSignalFull(worker, output);
    } else {
        emit getDvirsSignalE(output, error_type, error_str);
        emit getDvirsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetDrivers(const QString& access_token, const OAIInline_object_3& group_drivers_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = group_drivers_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetDriversCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetDriversCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriversResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetDriversSignal(output);
        emit getFleetDriversSignalFull(worker, output);
    } else {
        emit getFleetDriversSignalE(output, error_type, error_str);
        emit getFleetDriversSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetDriversHosDailyLogs(const QString& access_token, const qint64& driver_id, const OAIInline_object_6& hos_logs_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/{driver_id}/hos_daily_logs");
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

    
    QString output = hos_logs_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetDriversHosDailyLogsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetDriversHosDailyLogsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriverDailyLogResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetDriversHosDailyLogsSignal(output);
        emit getFleetDriversHosDailyLogsSignalFull(worker, output);
    } else {
        emit getFleetDriversHosDailyLogsSignalE(output, error_type, error_str);
        emit getFleetDriversHosDailyLogsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetDriversSummary(const QString& access_token, const OAIInline_object_5& drivers_summary_param, const bool& snap_to_day_bounds) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/summary");
    
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
    fullPath.append(QUrl::toPercentEncoding("snap_to_day_bounds"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(snap_to_day_bounds)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = drivers_summary_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetDriversSummaryCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetDriversSummaryCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriversSummaryResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetDriversSummarySignal(output);
        emit getFleetDriversSummarySignalFull(worker, output);
    } else {
        emit getFleetDriversSummarySignalE(output, error_type, error_str);
        emit getFleetDriversSummarySignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetHosAuthenticationLogs(const QString& access_token, const OAIInline_object_7& hos_authentication_logs_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/hos_authentication_logs");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = hos_authentication_logs_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetHosAuthenticationLogsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetHosAuthenticationLogsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIHosAuthenticationLogsResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetHosAuthenticationLogsSignal(output);
        emit getFleetHosAuthenticationLogsSignalFull(worker, output);
    } else {
        emit getFleetHosAuthenticationLogsSignalE(output, error_type, error_str);
        emit getFleetHosAuthenticationLogsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetHosLogs(const QString& access_token, const OAIInline_object_8& hos_logs_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/hos_logs");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = hos_logs_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetHosLogsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetHosLogsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIHosLogsResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetHosLogsSignal(output);
        emit getFleetHosLogsSignalFull(worker, output);
    } else {
        emit getFleetHosLogsSignalE(output, error_type, error_str);
        emit getFleetHosLogsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetHosLogsSummary(const QString& access_token, const OAIInline_object_9& hos_logs_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/hos_logs_summary");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = hos_logs_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetHosLogsSummaryCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetHosLogsSummaryCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIHosLogsSummaryResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetHosLogsSummarySignal(output);
        emit getFleetHosLogsSummarySignalFull(worker, output);
    } else {
        emit getFleetHosLogsSummarySignalE(output, error_type, error_str);
        emit getFleetHosLogsSummarySignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetLocations(const QString& access_token, const OAIInline_object_11& group_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/locations");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = group_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetLocationsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetLocationsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIInline_response_200_3 output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetLocationsSignal(output);
        emit getFleetLocationsSignalFull(worker, output);
    } else {
        emit getFleetLocationsSignalE(output, error_type, error_str);
        emit getFleetLocationsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetMaintenanceList(const QString& access_token, const OAIInline_object_13& group_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/maintenance/list");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = group_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetMaintenanceListCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetMaintenanceListCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIInline_response_200_4 output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetMaintenanceListSignal(output);
        emit getFleetMaintenanceListSignalFull(worker, output);
    } else {
        emit getFleetMaintenanceListSignalE(output, error_type, error_str);
        emit getFleetMaintenanceListSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetTrips(const QString& access_token, const OAIInline_object_15& trips_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/trips");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = trips_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getFleetTripsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetTripsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAITripResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetTripsSignal(output);
        emit getFleetTripsSignalFull(worker, output);
    } else {
        emit getFleetTripsSignalE(output, error_type, error_str);
        emit getFleetTripsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getFleetVehicle(const QString& access_token, const QString& vehicle_id_or_external_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/{vehicle_id_or_external_id}");
    QString vehicle_id_or_external_idPathParam("{"); 
    vehicle_id_or_external_idPathParam.append("vehicle_id_or_external_id").append("}");
    fullPath.replace(vehicle_id_or_external_idPathParam, ::OpenAPI::toStringValue(vehicle_id_or_external_id));
    
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
            &OAIFleetApi::getFleetVehicleCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getFleetVehicleCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIFleetVehicleResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getFleetVehicleSignal(output);
        emit getFleetVehicleSignalFull(worker, output);
    } else {
        emit getFleetVehicleSignalE(output, error_type, error_str);
        emit getFleetVehicleSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getOrganizationAddress(const QString& access_token, const qint64& address_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/addresses/{addressId}");
    QString address_idPathParam("{"); 
    address_idPathParam.append("addressId").append("}");
    fullPath.replace(address_idPathParam, ::OpenAPI::toStringValue(address_id));
    
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
            &OAIFleetApi::getOrganizationAddressCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getOrganizationAddressCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIAddress output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getOrganizationAddressSignal(output);
        emit getOrganizationAddressSignalFull(worker, output);
    } else {
        emit getOrganizationAddressSignalE(output, error_type, error_str);
        emit getOrganizationAddressSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getOrganizationAddresses(const QString& access_token) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/addresses");
    
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
            &OAIFleetApi::getOrganizationAddressesCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getOrganizationAddressesCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIAddress> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIAddress val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getOrganizationAddressesSignal(output);
        emit getOrganizationAddressesSignalFull(worker, output);
    } else {
        emit getOrganizationAddressesSignalE(output, error_type, error_str);
        emit getOrganizationAddressesSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getOrganizationContact(const QString& access_token, const qint64& contact_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/contacts/{contact_id}");
    QString contact_idPathParam("{"); 
    contact_idPathParam.append("contact_id").append("}");
    fullPath.replace(contact_idPathParam, ::OpenAPI::toStringValue(contact_id));
    
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
            &OAIFleetApi::getOrganizationContactCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getOrganizationContactCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIContact output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getOrganizationContactSignal(output);
        emit getOrganizationContactSignalFull(worker, output);
    } else {
        emit getOrganizationContactSignalE(output, error_type, error_str);
        emit getOrganizationContactSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getVehicleHarshEvent(const qint64& vehicle_id, const QString& access_token, const qint64& timestamp) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/{vehicleId}/safety/harsh_event");
    QString vehicle_idPathParam("{"); 
    vehicle_idPathParam.append("vehicleId").append("}");
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
    fullPath.append(QUrl::toPercentEncoding("timestamp"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(timestamp)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getVehicleHarshEventCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getVehicleHarshEventCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIVehicleHarshEventResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getVehicleHarshEventSignal(output);
        emit getVehicleHarshEventSignalFull(worker, output);
    } else {
        emit getVehicleHarshEventSignalE(output, error_type, error_str);
        emit getVehicleHarshEventSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getVehicleLocations(const QString& access_token, const qint64& vehicle_id, const qint64& start_ms, const qint64& end_ms) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/{vehicle_id}/locations");
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
    fullPath.append(QUrl::toPercentEncoding("startMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getVehicleLocationsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getVehicleLocationsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIFleetVehicleLocation> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIFleetVehicleLocation val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getVehicleLocationsSignal(output);
        emit getVehicleLocationsSignalFull(worker, output);
    } else {
        emit getVehicleLocationsSignalE(output, error_type, error_str);
        emit getVehicleLocationsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getVehicleSafetyScore(const qint64& vehicle_id, const QString& access_token, const qint64& start_ms, const qint64& end_ms) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/{vehicleId}/safety/score");
    QString vehicle_idPathParam("{"); 
    vehicle_idPathParam.append("vehicleId").append("}");
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
    fullPath.append(QUrl::toPercentEncoding("startMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getVehicleSafetyScoreCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getVehicleSafetyScoreCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIVehicleSafetyScoreResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getVehicleSafetyScoreSignal(output);
        emit getVehicleSafetyScoreSignalFull(worker, output);
    } else {
        emit getVehicleSafetyScoreSignalE(output, error_type, error_str);
        emit getVehicleSafetyScoreSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getVehicleStats(const QString& access_token, const qint32& start_ms, const qint32& end_ms, const QString& series, const QString& tag_ids, const QString& starting_after, const QString& ending_before, const qint64& limit) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/stats");
    
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
    fullPath.append(QUrl::toPercentEncoding("startMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("series"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(series)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("tagIds"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(tag_ids)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("startingAfter"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(starting_after)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endingBefore"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(ending_before)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("limit"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(limit)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getVehicleStatsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getVehicleStatsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIInline_response_200_5 output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getVehicleStatsSignal(output);
        emit getVehicleStatsSignalFull(worker, output);
    } else {
        emit getVehicleStatsSignalE(output, error_type, error_str);
        emit getVehicleStatsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::getVehiclesLocations(const QString& access_token, const qint32& start_ms, const qint32& end_ms) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/locations");
    
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
    fullPath.append(QUrl::toPercentEncoding("startMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(start_ms)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endMs"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(end_ms)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::getVehiclesLocationsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::getVehiclesLocationsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIObject> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIObject val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getVehiclesLocationsSignal(output);
        emit getVehiclesLocationsSignalFull(worker, output);
    } else {
        emit getVehiclesLocationsSignalE(output, error_type, error_str);
        emit getVehiclesLocationsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::listContacts(const QString& access_token) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/contacts");
    
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
            &OAIFleetApi::listContactsCallback);

    worker->execute(&input);
}

void
OAIFleetApi::listContactsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    QList<OAIContact> output;
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach(QJsonValue obj, jsonArray) {
        OAIContact val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit listContactsSignal(output);
        emit listContactsSignalFull(worker, output);
    } else {
        emit listContactsSignalE(output, error_type, error_str);
        emit listContactsSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::listFleet(const QString& access_token, const OAIInline_object_10& group_param, const QString& starting_after, const QString& ending_before, const qint64& limit) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/list");
    
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
    fullPath.append(QUrl::toPercentEncoding("startingAfter"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(starting_after)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("endingBefore"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(ending_before)));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("limit"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(limit)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = group_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::listFleetCallback);

    worker->execute(&input);
}

void
OAIFleetApi::listFleetCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIInline_response_200_2 output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit listFleetSignal(output);
        emit listFleetSignalFull(worker, output);
    } else {
        emit listFleetSignalE(output, error_type, error_str);
        emit listFleetSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::patchFleetVehicle(const QString& access_token, const QString& vehicle_id_or_external_id, const OAIInline_object_16& data) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/vehicles/{vehicle_id_or_external_id}");
    QString vehicle_id_or_external_idPathParam("{"); 
    vehicle_id_or_external_idPathParam.append("vehicle_id_or_external_id").append("}");
    fullPath.replace(vehicle_id_or_external_idPathParam, ::OpenAPI::toStringValue(vehicle_id_or_external_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "PATCH");

    
    QString output = data.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::patchFleetVehicleCallback);

    worker->execute(&input);
}

void
OAIFleetApi::patchFleetVehicleCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIFleetVehicleResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit patchFleetVehicleSignal(output);
        emit patchFleetVehicleSignalFull(worker, output);
    } else {
        emit patchFleetVehicleSignalE(output, error_type, error_str);
        emit patchFleetVehicleSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::reactivateDriverById(const QString& access_token, const QString& driver_id_or_external_id, const OAIInline_object_4& reactivate_driver_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/drivers/inactive/{driver_id_or_external_id}");
    QString driver_id_or_external_idPathParam("{"); 
    driver_id_or_external_idPathParam.append("driver_id_or_external_id").append("}");
    fullPath.replace(driver_id_or_external_idPathParam, ::OpenAPI::toStringValue(driver_id_or_external_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "PUT");

    
    QString output = reactivate_driver_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::reactivateDriverByIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::reactivateDriverByIdCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }
    OAIDriver output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit reactivateDriverByIdSignal(output);
        emit reactivateDriverByIdSignalFull(worker, output);
    } else {
        emit reactivateDriverByIdSignalE(output, error_type, error_str);
        emit reactivateDriverByIdSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::updateDispatchRouteById(const QString& access_token, const qint64& route_id, const OAIDispatchRoute& update_dispatch_route_params) {
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
            &OAIFleetApi::updateDispatchRouteByIdCallback);

    worker->execute(&input);
}

void
OAIFleetApi::updateDispatchRouteByIdCallback(OAIHttpRequestWorker * worker) {
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

void
OAIFleetApi::updateOrganizationAddress(const QString& access_token, const qint64& address_id, const OAIInline_object_1& address) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/addresses/{addressId}");
    QString address_idPathParam("{"); 
    address_idPathParam.append("addressId").append("}");
    fullPath.replace(address_idPathParam, ::OpenAPI::toStringValue(address_id));
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "PATCH");

    
    QString output = address.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::updateOrganizationAddressCallback);

    worker->execute(&input);
}

void
OAIFleetApi::updateOrganizationAddressCallback(OAIHttpRequestWorker * worker) {
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
        emit updateOrganizationAddressSignal();
        emit updateOrganizationAddressSignalFull(worker);
    } else {
        emit updateOrganizationAddressSignalE(error_type, error_str);
        emit updateOrganizationAddressSignalEFull(worker, error_type, error_str);
    }
}

void
OAIFleetApi::updateVehicles(const QString& access_token, const OAIInline_object_14& vehicle_update_param) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/fleet/set_data");
    
    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("access_token"))
        .append("=")
        .append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(access_token)));
    
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");

    
    QString output = vehicle_update_param.asJson();
    input.request_body.append(output);
    

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIFleetApi::updateVehiclesCallback);

    worker->execute(&input);
}

void
OAIFleetApi::updateVehiclesCallback(OAIHttpRequestWorker * worker) {
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
        emit updateVehiclesSignal();
        emit updateVehiclesSignalFull(worker);
    } else {
        emit updateVehiclesSignalE(error_type, error_str);
        emit updateVehiclesSignalEFull(worker, error_type, error_str);
    }
}


}
