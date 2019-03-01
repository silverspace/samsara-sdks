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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIHelpers.h"
#include "OAIFleetApiRequest.h"

namespace OpenAPI {

OAIFleetApiRequest::OAIFleetApiRequest(QHttpEngine::Socket *s, OAIFleetApiHandler* hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIFleetApiRequest::~OAIFleetApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIFleetApiRequest::~OAIFleetApiRequest()";
}

QMap<QString, QString>
OAIFleetApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIFleetApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIFleetApiRequest::getRawSocket(){
    return socket;
}


void OAIFleetApiRequest::addFleetAddressRequest(){
    qDebug() << "/v1/fleet/add_address";
    connect(this, &OAIFleetApiRequest::addFleetAddress, handler, &OAIFleetApiHandler::addFleetAddress);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_2 address_param;
    ::OpenAPI::fromJsonValue(address_param, obj);
    

    emit addFleetAddress(access_token, address_param);
}


void OAIFleetApiRequest::addOrganizationAddressesRequest(){
    qDebug() << "/v1/addresses";
    connect(this, &OAIFleetApiRequest::addOrganizationAddresses, handler, &OAIFleetApiHandler::addOrganizationAddresses);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object addresses;
    ::OpenAPI::fromJsonValue(addresses, obj);
    

    emit addOrganizationAddresses(access_token, addresses);
}


void OAIFleetApiRequest::createDispatchRouteRequest(){
    qDebug() << "/v1/fleet/dispatch/routes";
    connect(this, &OAIFleetApiRequest::createDispatchRoute, handler, &OAIFleetApiHandler::createDispatchRoute);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIDispatchRouteCreate create_dispatch_route_params;
    ::OpenAPI::fromJsonValue(create_dispatch_route_params, obj);
    

    emit createDispatchRoute(access_token, create_dispatch_route_params);
}


void OAIFleetApiRequest::createDriverRequest(){
    qDebug() << "/v1/fleet/drivers/create";
    connect(this, &OAIFleetApiRequest::createDriver, handler, &OAIFleetApiHandler::createDriver);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIDriverForCreate create_driver_param;
    ::OpenAPI::fromJsonValue(create_driver_param, obj);
    

    emit createDriver(access_token, create_driver_param);
}


void OAIFleetApiRequest::createDriverDispatchRouteRequest(const QString& driver_idstr){
    qDebug() << "/v1/fleet/drivers/{driver_id}/dispatch/routes";
    connect(this, &OAIFleetApiRequest::createDriverDispatchRoute, handler, &OAIFleetApiHandler::createDriverDispatchRoute);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 driver_id;
    fromStringValue(driver_idstr, driver_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIDispatchRouteCreate create_dispatch_route_params;
    ::OpenAPI::fromJsonValue(create_dispatch_route_params, obj);
    

    emit createDriverDispatchRoute(access_token, driver_id, create_dispatch_route_params);
}


void OAIFleetApiRequest::createDriverDocumentRequest(const QString& driver_idstr){
    qDebug() << "/v1/fleet/drivers/{driver_id}/documents";
    connect(this, &OAIFleetApiRequest::createDriverDocument, handler, &OAIFleetApiHandler::createDriverDocument);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 driver_id;
    fromStringValue(driver_idstr, driver_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIDocumentCreate create_document_params;
    ::OpenAPI::fromJsonValue(create_document_params, obj);
    

    emit createDriverDocument(access_token, driver_id, create_document_params);
}


void OAIFleetApiRequest::createDvirRequest(){
    qDebug() << "/v1/fleet/maintenance/dvirs";
    connect(this, &OAIFleetApiRequest::createDvir, handler, &OAIFleetApiHandler::createDvir);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_12 create_dvir_param;
    ::OpenAPI::fromJsonValue(create_dvir_param, obj);
    

    emit createDvir(access_token, create_dvir_param);
}


void OAIFleetApiRequest::createVehicleDispatchRouteRequest(const QString& vehicle_idstr){
    qDebug() << "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes";
    connect(this, &OAIFleetApiRequest::createVehicleDispatchRoute, handler, &OAIFleetApiHandler::createVehicleDispatchRoute);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 vehicle_id;
    fromStringValue(vehicle_idstr, vehicle_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIDispatchRouteCreate create_dispatch_route_params;
    ::OpenAPI::fromJsonValue(create_dispatch_route_params, obj);
    

    emit createVehicleDispatchRoute(access_token, vehicle_id, create_dispatch_route_params);
}


void OAIFleetApiRequest::deactivateDriverRequest(const QString& driver_id_or_external_idstr){
    qDebug() << "/v1/fleet/drivers/{driver_id_or_external_id}";
    connect(this, &OAIFleetApiRequest::deactivateDriver, handler, &OAIFleetApiHandler::deactivateDriver);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    QString driver_id_or_external_id;
    fromStringValue(driver_id_or_external_idstr, driver_id_or_external_id);
    

    emit deactivateDriver(access_token, driver_id_or_external_id);
}


void OAIFleetApiRequest::deleteDispatchRouteByIdRequest(const QString& route_idstr){
    qDebug() << "/v1/fleet/dispatch/routes/{route_id}";
    connect(this, &OAIFleetApiRequest::deleteDispatchRouteById, handler, &OAIFleetApiHandler::deleteDispatchRouteById);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 route_id;
    fromStringValue(route_idstr, route_id);
    

    emit deleteDispatchRouteById(access_token, route_id);
}


void OAIFleetApiRequest::deleteOrganizationAddressRequest(const QString& address_idstr){
    qDebug() << "/v1/addresses/{addressId}";
    connect(this, &OAIFleetApiRequest::deleteOrganizationAddress, handler, &OAIFleetApiHandler::deleteOrganizationAddress);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 address_id;
    fromStringValue(address_idstr, address_id);
    

    emit deleteOrganizationAddress(access_token, address_id);
}


void OAIFleetApiRequest::fetchAllDispatchRoutesRequest(){
    qDebug() << "/v1/fleet/dispatch/routes";
    connect(this, &OAIFleetApiRequest::fetchAllDispatchRoutes, handler, &OAIFleetApiHandler::fetchAllDispatchRoutes);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 group_id;
    if(socket->queryString().keys().contains("group_id")){
        fromStringValue(socket->queryString().value("group_id"), group_id);
    }
    
    qint64 end_time;
    if(socket->queryString().keys().contains("end_time")){
        fromStringValue(socket->queryString().value("end_time"), end_time);
    }
    
    qint64 duration;
    if(socket->queryString().keys().contains("duration")){
        fromStringValue(socket->queryString().value("duration"), duration);
    }
    


    emit fetchAllDispatchRoutes(access_token, group_id, end_time, duration);
}


void OAIFleetApiRequest::fetchAllRouteJobUpdatesRequest(){
    qDebug() << "/v1/fleet/dispatch/routes/job_updates";
    connect(this, &OAIFleetApiRequest::fetchAllRouteJobUpdates, handler, &OAIFleetApiHandler::fetchAllRouteJobUpdates);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 group_id;
    if(socket->queryString().keys().contains("group_id")){
        fromStringValue(socket->queryString().value("group_id"), group_id);
    }
    
    QString sequence_id;
    if(socket->queryString().keys().contains("sequence_id")){
        fromStringValue(socket->queryString().value("sequence_id"), sequence_id);
    }
    
    QString include;
    if(socket->queryString().keys().contains("include")){
        fromStringValue(socket->queryString().value("include"), include);
    }
    


    emit fetchAllRouteJobUpdates(access_token, group_id, sequence_id, include);
}


void OAIFleetApiRequest::getAllAssetCurrentLocationsRequest(){
    qDebug() << "/v1/fleet/assets/locations";
    connect(this, &OAIFleetApiRequest::getAllAssetCurrentLocations, handler, &OAIFleetApiHandler::getAllAssetCurrentLocations);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 group_id;
    if(socket->queryString().keys().contains("group_id")){
        fromStringValue(socket->queryString().value("group_id"), group_id);
    }
    


    emit getAllAssetCurrentLocations(access_token, group_id);
}


void OAIFleetApiRequest::getAllAssetsRequest(){
    qDebug() << "/v1/fleet/assets";
    connect(this, &OAIFleetApiRequest::getAllAssets, handler, &OAIFleetApiHandler::getAllAssets);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 group_id;
    if(socket->queryString().keys().contains("group_id")){
        fromStringValue(socket->queryString().value("group_id"), group_id);
    }
    


    emit getAllAssets(access_token, group_id);
}


void OAIFleetApiRequest::getAllDeactivatedDriversRequest(){
    qDebug() << "/v1/fleet/drivers/inactive";
    connect(this, &OAIFleetApiRequest::getAllDeactivatedDrivers, handler, &OAIFleetApiHandler::getAllDeactivatedDrivers);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 group_id;
    if(socket->queryString().keys().contains("group_id")){
        fromStringValue(socket->queryString().value("group_id"), group_id);
    }
    


    emit getAllDeactivatedDrivers(access_token, group_id);
}


void OAIFleetApiRequest::getAssetLocationRequest(const QString& asset_idstr){
    qDebug() << "/v1/fleet/assets/{asset_id}/locations";
    connect(this, &OAIFleetApiRequest::getAssetLocation, handler, &OAIFleetApiHandler::getAssetLocation);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 start_ms;
    if(socket->queryString().keys().contains("start_ms")){
        fromStringValue(socket->queryString().value("start_ms"), start_ms);
    }
    
    qint64 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    qint64 asset_id;
    fromStringValue(asset_idstr, asset_id);
    

    emit getAssetLocation(access_token, asset_id, start_ms, end_ms);
}


void OAIFleetApiRequest::getAssetReeferRequest(const QString& asset_idstr){
    qDebug() << "/v1/fleet/assets/{asset_id}/reefer";
    connect(this, &OAIFleetApiRequest::getAssetReefer, handler, &OAIFleetApiHandler::getAssetReefer);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 start_ms;
    if(socket->queryString().keys().contains("start_ms")){
        fromStringValue(socket->queryString().value("start_ms"), start_ms);
    }
    
    qint64 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    qint64 asset_id;
    fromStringValue(asset_idstr, asset_id);
    

    emit getAssetReefer(access_token, asset_id, start_ms, end_ms);
}


void OAIFleetApiRequest::getDeactivatedDriverByIdRequest(const QString& driver_id_or_external_idstr){
    qDebug() << "/v1/fleet/drivers/inactive/{driver_id_or_external_id}";
    connect(this, &OAIFleetApiRequest::getDeactivatedDriverById, handler, &OAIFleetApiHandler::getDeactivatedDriverById);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    QString driver_id_or_external_id;
    fromStringValue(driver_id_or_external_idstr, driver_id_or_external_id);
    

    emit getDeactivatedDriverById(access_token, driver_id_or_external_id);
}


void OAIFleetApiRequest::getDispatchRouteByIdRequest(const QString& route_idstr){
    qDebug() << "/v1/fleet/dispatch/routes/{route_id}";
    connect(this, &OAIFleetApiRequest::getDispatchRouteById, handler, &OAIFleetApiHandler::getDispatchRouteById);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 route_id;
    fromStringValue(route_idstr, route_id);
    

    emit getDispatchRouteById(access_token, route_id);
}


void OAIFleetApiRequest::getDispatchRouteHistoryRequest(const QString& route_idstr){
    qDebug() << "/v1/fleet/dispatch/routes/{route_id}/history";
    connect(this, &OAIFleetApiRequest::getDispatchRouteHistory, handler, &OAIFleetApiHandler::getDispatchRouteHistory);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 start_time;
    if(socket->queryString().keys().contains("start_time")){
        fromStringValue(socket->queryString().value("start_time"), start_time);
    }
    
    qint64 end_time;
    if(socket->queryString().keys().contains("end_time")){
        fromStringValue(socket->queryString().value("end_time"), end_time);
    }
    
    qint64 route_id;
    fromStringValue(route_idstr, route_id);
    

    emit getDispatchRouteHistory(access_token, route_id, start_time, end_time);
}


void OAIFleetApiRequest::getDispatchRoutesByDriverIdRequest(const QString& driver_idstr){
    qDebug() << "/v1/fleet/drivers/{driver_id}/dispatch/routes";
    connect(this, &OAIFleetApiRequest::getDispatchRoutesByDriverId, handler, &OAIFleetApiHandler::getDispatchRoutesByDriverId);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 end_time;
    if(socket->queryString().keys().contains("end_time")){
        fromStringValue(socket->queryString().value("end_time"), end_time);
    }
    
    qint64 duration;
    if(socket->queryString().keys().contains("duration")){
        fromStringValue(socket->queryString().value("duration"), duration);
    }
    
    qint64 driver_id;
    fromStringValue(driver_idstr, driver_id);
    

    emit getDispatchRoutesByDriverId(access_token, driver_id, end_time, duration);
}


void OAIFleetApiRequest::getDispatchRoutesByVehicleIdRequest(const QString& vehicle_idstr){
    qDebug() << "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes";
    connect(this, &OAIFleetApiRequest::getDispatchRoutesByVehicleId, handler, &OAIFleetApiHandler::getDispatchRoutesByVehicleId);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 end_time;
    if(socket->queryString().keys().contains("end_time")){
        fromStringValue(socket->queryString().value("end_time"), end_time);
    }
    
    qint64 duration;
    if(socket->queryString().keys().contains("duration")){
        fromStringValue(socket->queryString().value("duration"), duration);
    }
    
    qint64 vehicle_id;
    fromStringValue(vehicle_idstr, vehicle_id);
    

    emit getDispatchRoutesByVehicleId(access_token, vehicle_id, end_time, duration);
}


void OAIFleetApiRequest::getDriverByIdRequest(const QString& driver_id_or_external_idstr){
    qDebug() << "/v1/fleet/drivers/{driver_id_or_external_id}";
    connect(this, &OAIFleetApiRequest::getDriverById, handler, &OAIFleetApiHandler::getDriverById);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    QString driver_id_or_external_id;
    fromStringValue(driver_id_or_external_idstr, driver_id_or_external_id);
    

    emit getDriverById(access_token, driver_id_or_external_id);
}


void OAIFleetApiRequest::getDriverDocumentTypesByOrgIdRequest(){
    qDebug() << "/v1/fleet/drivers/document_types";
    connect(this, &OAIFleetApiRequest::getDriverDocumentTypesByOrgId, handler, &OAIFleetApiHandler::getDriverDocumentTypesByOrgId);

    


    emit getDriverDocumentTypesByOrgId();
}


void OAIFleetApiRequest::getDriverDocumentsByOrgIdRequest(){
    qDebug() << "/v1/fleet/drivers/documents";
    connect(this, &OAIFleetApiRequest::getDriverDocumentsByOrgId, handler, &OAIFleetApiHandler::getDriverDocumentsByOrgId);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    qint64 duration_ms;
    if(socket->queryString().keys().contains("duration_ms")){
        fromStringValue(socket->queryString().value("duration_ms"), duration_ms);
    }
    


    emit getDriverDocumentsByOrgId(access_token, end_ms, duration_ms);
}


void OAIFleetApiRequest::getDriverSafetyScoreRequest(const QString& driver_idstr){
    qDebug() << "/v1/fleet/drivers/{driverId}/safety/score";
    connect(this, &OAIFleetApiRequest::getDriverSafetyScore, handler, &OAIFleetApiHandler::getDriverSafetyScore);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 start_ms;
    if(socket->queryString().keys().contains("start_ms")){
        fromStringValue(socket->queryString().value("start_ms"), start_ms);
    }
    
    qint64 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    qint64 driver_id;
    fromStringValue(driver_idstr, driver_id);
    

    emit getDriverSafetyScore(driver_id, access_token, start_ms, end_ms);
}


void OAIFleetApiRequest::getDvirsRequest(){
    qDebug() << "/v1/fleet/maintenance/dvirs";
    connect(this, &OAIFleetApiRequest::getDvirs, handler, &OAIFleetApiHandler::getDvirs);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint32 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    qint32 duration_ms;
    if(socket->queryString().keys().contains("duration_ms")){
        fromStringValue(socket->queryString().value("duration_ms"), duration_ms);
    }
    
    qint32 group_id;
    if(socket->queryString().keys().contains("group_id")){
        fromStringValue(socket->queryString().value("group_id"), group_id);
    }
    


    emit getDvirs(access_token, end_ms, duration_ms, group_id);
}


void OAIFleetApiRequest::getFleetDriversRequest(){
    qDebug() << "/v1/fleet/drivers";
    connect(this, &OAIFleetApiRequest::getFleetDrivers, handler, &OAIFleetApiHandler::getFleetDrivers);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_3 group_drivers_param;
    ::OpenAPI::fromJsonValue(group_drivers_param, obj);
    

    emit getFleetDrivers(access_token, group_drivers_param);
}


void OAIFleetApiRequest::getFleetDriversHosDailyLogsRequest(const QString& driver_idstr){
    qDebug() << "/v1/fleet/drivers/{driver_id}/hos_daily_logs";
    connect(this, &OAIFleetApiRequest::getFleetDriversHosDailyLogs, handler, &OAIFleetApiHandler::getFleetDriversHosDailyLogs);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 driver_id;
    fromStringValue(driver_idstr, driver_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_6 hos_logs_param;
    ::OpenAPI::fromJsonValue(hos_logs_param, obj);
    

    emit getFleetDriversHosDailyLogs(access_token, driver_id, hos_logs_param);
}


void OAIFleetApiRequest::getFleetDriversSummaryRequest(){
    qDebug() << "/v1/fleet/drivers/summary";
    connect(this, &OAIFleetApiRequest::getFleetDriversSummary, handler, &OAIFleetApiHandler::getFleetDriversSummary);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    bool snap_to_day_bounds;
    if(socket->queryString().keys().contains("snap_to_day_bounds")){
        fromStringValue(socket->queryString().value("snap_to_day_bounds"), snap_to_day_bounds);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_5 drivers_summary_param;
    ::OpenAPI::fromJsonValue(drivers_summary_param, obj);
    

    emit getFleetDriversSummary(access_token, drivers_summary_param, snap_to_day_bounds);
}


void OAIFleetApiRequest::getFleetHosAuthenticationLogsRequest(){
    qDebug() << "/v1/fleet/hos_authentication_logs";
    connect(this, &OAIFleetApiRequest::getFleetHosAuthenticationLogs, handler, &OAIFleetApiHandler::getFleetHosAuthenticationLogs);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_7 hos_authentication_logs_param;
    ::OpenAPI::fromJsonValue(hos_authentication_logs_param, obj);
    

    emit getFleetHosAuthenticationLogs(access_token, hos_authentication_logs_param);
}


void OAIFleetApiRequest::getFleetHosLogsRequest(){
    qDebug() << "/v1/fleet/hos_logs";
    connect(this, &OAIFleetApiRequest::getFleetHosLogs, handler, &OAIFleetApiHandler::getFleetHosLogs);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_8 hos_logs_param;
    ::OpenAPI::fromJsonValue(hos_logs_param, obj);
    

    emit getFleetHosLogs(access_token, hos_logs_param);
}


void OAIFleetApiRequest::getFleetHosLogsSummaryRequest(){
    qDebug() << "/v1/fleet/hos_logs_summary";
    connect(this, &OAIFleetApiRequest::getFleetHosLogsSummary, handler, &OAIFleetApiHandler::getFleetHosLogsSummary);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_9 hos_logs_param;
    ::OpenAPI::fromJsonValue(hos_logs_param, obj);
    

    emit getFleetHosLogsSummary(access_token, hos_logs_param);
}


void OAIFleetApiRequest::getFleetLocationsRequest(){
    qDebug() << "/v1/fleet/locations";
    connect(this, &OAIFleetApiRequest::getFleetLocations, handler, &OAIFleetApiHandler::getFleetLocations);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_11 group_param;
    ::OpenAPI::fromJsonValue(group_param, obj);
    

    emit getFleetLocations(access_token, group_param);
}


void OAIFleetApiRequest::getFleetMaintenanceListRequest(){
    qDebug() << "/v1/fleet/maintenance/list";
    connect(this, &OAIFleetApiRequest::getFleetMaintenanceList, handler, &OAIFleetApiHandler::getFleetMaintenanceList);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_13 group_param;
    ::OpenAPI::fromJsonValue(group_param, obj);
    

    emit getFleetMaintenanceList(access_token, group_param);
}


void OAIFleetApiRequest::getFleetTripsRequest(){
    qDebug() << "/v1/fleet/trips";
    connect(this, &OAIFleetApiRequest::getFleetTrips, handler, &OAIFleetApiHandler::getFleetTrips);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_15 trips_param;
    ::OpenAPI::fromJsonValue(trips_param, obj);
    

    emit getFleetTrips(access_token, trips_param);
}


void OAIFleetApiRequest::getFleetVehicleRequest(const QString& vehicle_id_or_external_idstr){
    qDebug() << "/v1/fleet/vehicles/{vehicle_id_or_external_id}";
    connect(this, &OAIFleetApiRequest::getFleetVehicle, handler, &OAIFleetApiHandler::getFleetVehicle);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    QString vehicle_id_or_external_id;
    fromStringValue(vehicle_id_or_external_idstr, vehicle_id_or_external_id);
    

    emit getFleetVehicle(access_token, vehicle_id_or_external_id);
}


void OAIFleetApiRequest::getOrganizationAddressRequest(const QString& address_idstr){
    qDebug() << "/v1/addresses/{addressId}";
    connect(this, &OAIFleetApiRequest::getOrganizationAddress, handler, &OAIFleetApiHandler::getOrganizationAddress);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 address_id;
    fromStringValue(address_idstr, address_id);
    

    emit getOrganizationAddress(access_token, address_id);
}


void OAIFleetApiRequest::getOrganizationAddressesRequest(){
    qDebug() << "/v1/addresses";
    connect(this, &OAIFleetApiRequest::getOrganizationAddresses, handler, &OAIFleetApiHandler::getOrganizationAddresses);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    


    emit getOrganizationAddresses(access_token);
}


void OAIFleetApiRequest::getOrganizationContactRequest(const QString& contact_idstr){
    qDebug() << "/v1/contacts/{contact_id}";
    connect(this, &OAIFleetApiRequest::getOrganizationContact, handler, &OAIFleetApiHandler::getOrganizationContact);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 contact_id;
    fromStringValue(contact_idstr, contact_id);
    

    emit getOrganizationContact(access_token, contact_id);
}


void OAIFleetApiRequest::getVehicleHarshEventRequest(const QString& vehicle_idstr){
    qDebug() << "/v1/fleet/vehicles/{vehicleId}/safety/harsh_event";
    connect(this, &OAIFleetApiRequest::getVehicleHarshEvent, handler, &OAIFleetApiHandler::getVehicleHarshEvent);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 timestamp;
    if(socket->queryString().keys().contains("timestamp")){
        fromStringValue(socket->queryString().value("timestamp"), timestamp);
    }
    
    qint64 vehicle_id;
    fromStringValue(vehicle_idstr, vehicle_id);
    

    emit getVehicleHarshEvent(vehicle_id, access_token, timestamp);
}


void OAIFleetApiRequest::getVehicleLocationsRequest(const QString& vehicle_idstr){
    qDebug() << "/v1/fleet/vehicles/{vehicle_id}/locations";
    connect(this, &OAIFleetApiRequest::getVehicleLocations, handler, &OAIFleetApiHandler::getVehicleLocations);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 start_ms;
    if(socket->queryString().keys().contains("start_ms")){
        fromStringValue(socket->queryString().value("start_ms"), start_ms);
    }
    
    qint64 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    qint64 vehicle_id;
    fromStringValue(vehicle_idstr, vehicle_id);
    

    emit getVehicleLocations(access_token, vehicle_id, start_ms, end_ms);
}


void OAIFleetApiRequest::getVehicleSafetyScoreRequest(const QString& vehicle_idstr){
    qDebug() << "/v1/fleet/vehicles/{vehicleId}/safety/score";
    connect(this, &OAIFleetApiRequest::getVehicleSafetyScore, handler, &OAIFleetApiHandler::getVehicleSafetyScore);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 start_ms;
    if(socket->queryString().keys().contains("start_ms")){
        fromStringValue(socket->queryString().value("start_ms"), start_ms);
    }
    
    qint64 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    qint64 vehicle_id;
    fromStringValue(vehicle_idstr, vehicle_id);
    

    emit getVehicleSafetyScore(vehicle_id, access_token, start_ms, end_ms);
}


void OAIFleetApiRequest::getVehicleStatsRequest(){
    qDebug() << "/v1/fleet/vehicles/stats";
    connect(this, &OAIFleetApiRequest::getVehicleStats, handler, &OAIFleetApiHandler::getVehicleStats);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint32 start_ms;
    if(socket->queryString().keys().contains("start_ms")){
        fromStringValue(socket->queryString().value("start_ms"), start_ms);
    }
    
    qint32 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    
    QString series;
    if(socket->queryString().keys().contains("series")){
        fromStringValue(socket->queryString().value("series"), series);
    }
    
    QString tag_ids;
    if(socket->queryString().keys().contains("tag_ids")){
        fromStringValue(socket->queryString().value("tag_ids"), tag_ids);
    }
    
    QString starting_after;
    if(socket->queryString().keys().contains("starting_after")){
        fromStringValue(socket->queryString().value("starting_after"), starting_after);
    }
    
    QString ending_before;
    if(socket->queryString().keys().contains("ending_before")){
        fromStringValue(socket->queryString().value("ending_before"), ending_before);
    }
    
    qint64 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    


    emit getVehicleStats(access_token, start_ms, end_ms, series, tag_ids, starting_after, ending_before, limit);
}


void OAIFleetApiRequest::getVehiclesLocationsRequest(){
    qDebug() << "/v1/fleet/vehicles/locations";
    connect(this, &OAIFleetApiRequest::getVehiclesLocations, handler, &OAIFleetApiHandler::getVehiclesLocations);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint32 start_ms;
    if(socket->queryString().keys().contains("start_ms")){
        fromStringValue(socket->queryString().value("start_ms"), start_ms);
    }
    
    qint32 end_ms;
    if(socket->queryString().keys().contains("end_ms")){
        fromStringValue(socket->queryString().value("end_ms"), end_ms);
    }
    


    emit getVehiclesLocations(access_token, start_ms, end_ms);
}


void OAIFleetApiRequest::listContactsRequest(){
    qDebug() << "/v1/contacts";
    connect(this, &OAIFleetApiRequest::listContacts, handler, &OAIFleetApiHandler::listContacts);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    


    emit listContacts(access_token);
}


void OAIFleetApiRequest::listFleetRequest(){
    qDebug() << "/v1/fleet/list";
    connect(this, &OAIFleetApiRequest::listFleet, handler, &OAIFleetApiHandler::listFleet);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    QString starting_after;
    if(socket->queryString().keys().contains("starting_after")){
        fromStringValue(socket->queryString().value("starting_after"), starting_after);
    }
    
    QString ending_before;
    if(socket->queryString().keys().contains("ending_before")){
        fromStringValue(socket->queryString().value("ending_before"), ending_before);
    }
    
    qint64 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_10 group_param;
    ::OpenAPI::fromJsonValue(group_param, obj);
    

    emit listFleet(access_token, group_param, starting_after, ending_before, limit);
}


void OAIFleetApiRequest::patchFleetVehicleRequest(const QString& vehicle_id_or_external_idstr){
    qDebug() << "/v1/fleet/vehicles/{vehicle_id_or_external_id}";
    connect(this, &OAIFleetApiRequest::patchFleetVehicle, handler, &OAIFleetApiHandler::patchFleetVehicle);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    QString vehicle_id_or_external_id;
    fromStringValue(vehicle_id_or_external_idstr, vehicle_id_or_external_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_16 data;
    ::OpenAPI::fromJsonValue(data, obj);
    

    emit patchFleetVehicle(access_token, vehicle_id_or_external_id, data);
}


void OAIFleetApiRequest::reactivateDriverByIdRequest(const QString& driver_id_or_external_idstr){
    qDebug() << "/v1/fleet/drivers/inactive/{driver_id_or_external_id}";
    connect(this, &OAIFleetApiRequest::reactivateDriverById, handler, &OAIFleetApiHandler::reactivateDriverById);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    QString driver_id_or_external_id;
    fromStringValue(driver_id_or_external_idstr, driver_id_or_external_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_4 reactivate_driver_param;
    ::OpenAPI::fromJsonValue(reactivate_driver_param, obj);
    

    emit reactivateDriverById(access_token, driver_id_or_external_id, reactivate_driver_param);
}


void OAIFleetApiRequest::updateDispatchRouteByIdRequest(const QString& route_idstr){
    qDebug() << "/v1/fleet/dispatch/routes/{route_id}";
    connect(this, &OAIFleetApiRequest::updateDispatchRouteById, handler, &OAIFleetApiHandler::updateDispatchRouteById);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 route_id;
    fromStringValue(route_idstr, route_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIDispatchRoute update_dispatch_route_params;
    ::OpenAPI::fromJsonValue(update_dispatch_route_params, obj);
    

    emit updateDispatchRouteById(access_token, route_id, update_dispatch_route_params);
}


void OAIFleetApiRequest::updateOrganizationAddressRequest(const QString& address_idstr){
    qDebug() << "/v1/addresses/{addressId}";
    connect(this, &OAIFleetApiRequest::updateOrganizationAddress, handler, &OAIFleetApiHandler::updateOrganizationAddress);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
    qint64 address_id;
    fromStringValue(address_idstr, address_id);
     
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_1 address;
    ::OpenAPI::fromJsonValue(address, obj);
    

    emit updateOrganizationAddress(access_token, address_id, address);
}


void OAIFleetApiRequest::updateVehiclesRequest(){
    qDebug() << "/v1/fleet/set_data";
    connect(this, &OAIFleetApiRequest::updateVehicles, handler, &OAIFleetApiHandler::updateVehicles);

    
    QString access_token;
    if(socket->queryString().keys().contains("access_token")){
        fromStringValue(socket->queryString().value("access_token"), access_token);
    }
    
 
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIInline_object_14 vehicle_update_param;
    ::OpenAPI::fromJsonValue(vehicle_update_param, obj);
    

    emit updateVehicles(access_token, vehicle_update_param);
}



void OAIFleetApiRequest::addFleetAddressResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::addOrganizationAddressesResponse(const QList<OAIAddress>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDispatchRouteResponse(const OAIDispatchRoute& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDriverResponse(const OAIDriver& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDriverDispatchRouteResponse(const OAIDispatchRoute& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDriverDocumentResponse(const OAIDocument& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDvirResponse(const OAIDvirBase& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createVehicleDispatchRouteResponse(const OAIDispatchRoute& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::deactivateDriverResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::deleteDispatchRouteByIdResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::deleteOrganizationAddressResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::fetchAllDispatchRoutesResponse(const QList<OAIDispatchRoute>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::fetchAllRouteJobUpdatesResponse(const OAIAllRouteJobUpdates& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAllAssetCurrentLocationsResponse(const OAIInline_response_200_1& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAllAssetsResponse(const OAIInline_response_200& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAllDeactivatedDriversResponse(const QList<OAIDriver>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAssetLocationResponse(const QList<OAIObject>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAssetReeferResponse(const OAIAssetReeferResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDeactivatedDriverByIdResponse(const OAIDriver& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRouteByIdResponse(const OAIDispatchRoute& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRouteHistoryResponse(const OAIDispatchRouteHistory& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRoutesByDriverIdResponse(const QList<OAIDispatchRoute>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRoutesByVehicleIdResponse(const QList<OAIDispatchRoute>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverByIdResponse(const OAIDriver& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverDocumentTypesByOrgIdResponse(const QList<OAIDocumentType>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverDocumentsByOrgIdResponse(const QList<OAIDocument>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverSafetyScoreResponse(const OAIDriverSafetyScoreResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDvirsResponse(const OAIDvirListResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetDriversResponse(const OAIDriversResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetDriversHosDailyLogsResponse(const OAIDriverDailyLogResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetDriversSummaryResponse(const OAIDriversSummaryResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetHosAuthenticationLogsResponse(const OAIHosAuthenticationLogsResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetHosLogsResponse(const OAIHosLogsResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetHosLogsSummaryResponse(const OAIHosLogsSummaryResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetLocationsResponse(const OAIInline_response_200_3& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetMaintenanceListResponse(const OAIInline_response_200_4& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetTripsResponse(const OAITripResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetVehicleResponse(const OAIFleetVehicleResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getOrganizationAddressResponse(const OAIAddress& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getOrganizationAddressesResponse(const QList<OAIAddress>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getOrganizationContactResponse(const OAIContact& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleHarshEventResponse(const OAIVehicleHarshEventResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleLocationsResponse(const QList<OAIFleetVehicleLocation>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleSafetyScoreResponse(const OAIVehicleSafetyScoreResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleStatsResponse(const OAIInline_response_200_5& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehiclesLocationsResponse(const QList<OAIObject>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::listContactsResponse(const QList<OAIContact>& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::listFleetResponse(const OAIInline_response_200_2& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::patchFleetVehicleResponse(const OAIFleetVehicleResponse& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::reactivateDriverByIdResponse(const OAIDriver& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::updateDispatchRouteByIdResponse(const OAIDispatchRoute& res){
    writeResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::updateOrganizationAddressResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::updateVehiclesResponse(){
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::OK);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIFleetApiRequest::addFleetAddressError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::addOrganizationAddressesError(const QList<OAIAddress>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDispatchRouteError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDriverError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDriverDispatchRouteError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDriverDocumentError(const OAIDocument& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createDvirError(const OAIDvirBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::createVehicleDispatchRouteError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::deactivateDriverError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::deleteDispatchRouteByIdError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::deleteOrganizationAddressError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::fetchAllDispatchRoutesError(const QList<OAIDispatchRoute>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::fetchAllRouteJobUpdatesError(const OAIAllRouteJobUpdates& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAllAssetCurrentLocationsError(const OAIInline_response_200_1& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAllAssetsError(const OAIInline_response_200& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAllDeactivatedDriversError(const QList<OAIDriver>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAssetLocationError(const QList<OAIObject>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getAssetReeferError(const OAIAssetReeferResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDeactivatedDriverByIdError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRouteByIdError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRouteHistoryError(const OAIDispatchRouteHistory& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRoutesByDriverIdError(const QList<OAIDispatchRoute>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDispatchRoutesByVehicleIdError(const QList<OAIDispatchRoute>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverByIdError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverDocumentTypesByOrgIdError(const QList<OAIDocumentType>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverDocumentsByOrgIdError(const QList<OAIDocument>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDriverSafetyScoreError(const OAIDriverSafetyScoreResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getDvirsError(const OAIDvirListResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetDriversError(const OAIDriversResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetDriversHosDailyLogsError(const OAIDriverDailyLogResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetDriversSummaryError(const OAIDriversSummaryResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetHosAuthenticationLogsError(const OAIHosAuthenticationLogsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetHosLogsError(const OAIHosLogsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetHosLogsSummaryError(const OAIHosLogsSummaryResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetLocationsError(const OAIInline_response_200_3& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetMaintenanceListError(const OAIInline_response_200_4& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetTripsError(const OAITripResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getFleetVehicleError(const OAIFleetVehicleResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getOrganizationAddressError(const OAIAddress& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getOrganizationAddressesError(const QList<OAIAddress>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getOrganizationContactError(const OAIContact& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleHarshEventError(const OAIVehicleHarshEventResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleLocationsError(const QList<OAIFleetVehicleLocation>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleSafetyScoreError(const OAIVehicleSafetyScoreResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehicleStatsError(const OAIInline_response_200_5& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::getVehiclesLocationsError(const QList<OAIObject>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::listContactsError(const QList<OAIContact>& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toArray());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::listFleetError(const OAIInline_response_200_2& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::patchFleetVehicleError(const OAIFleetVehicleResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::reactivateDriverByIdError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::updateDispatchRouteByIdError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::updateOrganizationAddressError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIFleetApiRequest::updateVehiclesError(QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    writeResponseHeaders();
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    socket->write(error_str.toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIFleetApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }    
}

void OAIFleetApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
