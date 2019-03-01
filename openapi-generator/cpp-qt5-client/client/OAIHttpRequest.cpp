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

#include "OAIHttpRequest.h"
#include <QDateTime>
#include <QUrl>
#include <QFileInfo>
#include <QBuffer>
#include <QtGlobal>


namespace OpenAPI {

OAIHttpRequestInput::OAIHttpRequestInput() {
    initialize();
}

OAIHttpRequestInput::OAIHttpRequestInput(QString v_url_str, QString v_http_method) {
    initialize();
    url_str = v_url_str;
    http_method = v_http_method;
}

void OAIHttpRequestInput::initialize() {
    var_layout = NOT_SET;
    url_str = "";
    http_method = "GET";
}

void OAIHttpRequestInput::add_var(QString key, QString value) {
    vars[key] = value;
}

void OAIHttpRequestInput::add_file(QString variable_name, QString local_filename, QString request_filename, QString mime_type) {
    OAIHttpRequestInputFileElement file;
    file.variable_name = variable_name;
    file.local_filename = local_filename;
    file.request_filename = request_filename;
    file.mime_type = mime_type;
    files.append(file);
}


OAIHttpRequestWorker::OAIHttpRequestWorker(QObject *parent)
    : QObject(parent), manager(nullptr)
{
    qsrand(QDateTime::currentDateTime().toTime_t());

    manager = new QNetworkAccessManager(this);
    connect(manager, &QNetworkAccessManager::finished, this, &OAIHttpRequestWorker::on_manager_finished);
}

OAIHttpRequestWorker::~OAIHttpRequestWorker() {
}

QMap<QByteArray, QByteArray> OAIHttpRequestWorker::getResponseHeaders() const {
    return headers;
}

QString OAIHttpRequestWorker::http_attribute_encode(QString attribute_name, QString input) {
    // result structure follows RFC 5987
    bool need_utf_encoding = false;
    QString result = "";
    QByteArray input_c = input.toLocal8Bit();
    char c;
    for (int i = 0; i < input_c.length(); i++) {
        c = input_c.at(i);
        if (c == '\\' || c == '/' || c == '\0' || c < ' ' || c > '~') {
            // ignore and request utf-8 version
            need_utf_encoding = true;
        }
        else if (c == '"') {
            result += "\\\"";
        }
        else {
            result += c;
        }
    }

    if (result.length() == 0) {
        need_utf_encoding = true;
    }

    if (!need_utf_encoding) {
        // return simple version
        return QString("%1=\"%2\"").arg(attribute_name, result);
    }

    QString result_utf8 = "";
    for (int i = 0; i < input_c.length(); i++) {
        c = input_c.at(i);
        if (
            (c >= '0' && c <= '9')
            || (c >= 'A' && c <= 'Z')
            || (c >= 'a' && c <= 'z')
        ) {
            result_utf8 += c;
        }
        else {
            result_utf8 += "%" + QString::number(static_cast<unsigned char>(input_c.at(i)), 16).toUpper();
        }
    }

    // return enhanced version with UTF-8 support
    return QString("%1=\"%2\"; %1*=utf-8''%3").arg(attribute_name, result, result_utf8);
}

void OAIHttpRequestWorker::execute(OAIHttpRequestInput *input) {

    // reset variables

    QByteArray request_content = "";
    response = "";
    error_type = QNetworkReply::NoError;
    error_str = "";
    bool isFormData = false;


    // decide on the variable layout

    if (input->files.length() > 0) {
        input->var_layout = MULTIPART;
    }
    if (input->var_layout == NOT_SET) {
        input->var_layout = input->http_method == "GET" || input->http_method == "HEAD" ? ADDRESS : URL_ENCODED;
    }


    // prepare request content

    QString boundary = "";

    if (input->var_layout == ADDRESS || input->var_layout == URL_ENCODED) {
        // variable layout is ADDRESS or URL_ENCODED

        if (input->vars.count() > 0) {
            bool first = true;
            isFormData = true;
            foreach (QString key, input->vars.keys()) {
                if (!first) {
                    request_content.append("&");
                }
                first = false;

                request_content.append(QUrl::toPercentEncoding(key));
                request_content.append("=");
                request_content.append(QUrl::toPercentEncoding(input->vars.value(key)));
            }

            if (input->var_layout == ADDRESS) {
                input->url_str += "?" + request_content;
                request_content = "";
            }
        }
    }
    else {
        // variable layout is MULTIPART

        boundary = "__-----------------------"
            + QString::number(QDateTime::currentDateTime().toTime_t())
            + QString::number(qrand());
        QString boundary_delimiter = "--";
        QString new_line = "\r\n";

        // add variables
        foreach (QString key, input->vars.keys()) {
            // add boundary
            request_content.append(boundary_delimiter);
            request_content.append(boundary);
            request_content.append(new_line);

            // add header
            request_content.append("Content-Disposition: form-data; ");
            request_content.append(http_attribute_encode("name", key));
            request_content.append(new_line);
            request_content.append("Content-Type: text/plain");
            request_content.append(new_line);

            // add header to body splitter
            request_content.append(new_line);

            // add variable content
            request_content.append(input->vars.value(key));
            request_content.append(new_line);
        }

        // add files
        for (QList<OAIHttpRequestInputFileElement>::iterator file_info = input->files.begin(); file_info != input->files.end(); file_info++) {
            QFileInfo fi(file_info->local_filename);

            // ensure necessary variables are available
            if (
                file_info->local_filename == nullptr || file_info->local_filename.isEmpty()
                || file_info->variable_name == nullptr || file_info->variable_name.isEmpty()
                || !fi.exists() || !fi.isFile() || !fi.isReadable()
            ) {
                // silent abort for the current file
                continue;
            }

            QFile file(file_info->local_filename);
            if (!file.open(QIODevice::ReadOnly)) {
                // silent abort for the current file
                continue;
            }

            // ensure filename for the request
            if (file_info->request_filename == nullptr || file_info->request_filename.isEmpty()) {
                file_info->request_filename = fi.fileName();
                if (file_info->request_filename.isEmpty()) {
                    file_info->request_filename = "file";
                }
            }

            // add boundary
            request_content.append(boundary_delimiter);
            request_content.append(boundary);
            request_content.append(new_line);

            // add header
            request_content.append(QString("Content-Disposition: form-data; %1; %2").arg(
                http_attribute_encode("name", file_info->variable_name),
                http_attribute_encode("filename", file_info->request_filename)
            ));
            request_content.append(new_line);

            if (file_info->mime_type != nullptr && !file_info->mime_type.isEmpty()) {
                request_content.append("Content-Type: ");
                request_content.append(file_info->mime_type);
                request_content.append(new_line);
            }

            request_content.append("Content-Transfer-Encoding: binary");
            request_content.append(new_line);

            // add header to body splitter
            request_content.append(new_line);

            // add file content
            request_content.append(file.readAll());
            request_content.append(new_line);

            file.close();
        }

        // add end of body
        request_content.append(boundary_delimiter);
        request_content.append(boundary);
        request_content.append(boundary_delimiter);
    }

    if(input->request_body.size() > 0) {
        qDebug() << "got a request body";
        request_content.clear();
        request_content.append(input->request_body);
    }
    // prepare connection

    QNetworkRequest request = QNetworkRequest(QUrl(input->url_str));
    if (OAIHttpRequestWorker::sslDefaultConfiguration != nullptr) {
        request.setSslConfiguration(*OAIHttpRequestWorker::sslDefaultConfiguration);
    }
    request.setRawHeader("User-Agent", "OpenAPI-Generator/1.0.0/cpp-qt5");
    foreach(QString key, input->headers.keys()) {
        request.setRawHeader(key.toStdString().c_str(), input->headers.value(key).toStdString().c_str());
    }

    if (request_content.size() > 0 && !isFormData) {
        request.setHeader(QNetworkRequest::ContentTypeHeader, "application/json");
    }
    else if (input->var_layout == URL_ENCODED) {
        request.setHeader(QNetworkRequest::ContentTypeHeader, "application/x-www-form-urlencoded");
    }
    else if (input->var_layout == MULTIPART) {
        request.setHeader(QNetworkRequest::ContentTypeHeader, "multipart/form-data; boundary=" + boundary);
    }

    if (input->http_method == "GET") {
        manager->get(request);
    }
    else if (input->http_method == "POST") {
        manager->post(request, request_content);
    }
    else if (input->http_method == "PUT") {
        manager->put(request, request_content);
    }
    else if (input->http_method == "HEAD") {
        manager->head(request);
    }
    else if (input->http_method == "DELETE") {
        manager->deleteResource(request);
    }
    else {
#if (QT_VERSION >= 0x050800)
        manager->sendCustomRequest(request, input->http_method.toLatin1(), request_content);
#else
        QBuffer *buffer = new QBuffer;
        buffer->setData(request_content);
        buffer->open(QIODevice::ReadOnly);

        QNetworkReply* reply = manager->sendCustomRequest(request, input->http_method.toLatin1(), buffer);
        buffer->setParent(reply);
#endif
    }

}

void OAIHttpRequestWorker::on_manager_finished(QNetworkReply *reply) {
    error_type = reply->error();
    response = reply->readAll();
    error_str = reply->errorString();
    if(reply->rawHeaderPairs().count() > 0){
        for(const auto& item: reply->rawHeaderPairs()){
            headers.insert(item.first, item.second);
        }
    }
    reply->deleteLater();

    emit on_execution_finished(this);
}
QSslConfiguration* OAIHttpRequestWorker::sslDefaultConfiguration;


}
