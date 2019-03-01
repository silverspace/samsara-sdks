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


#include "OAIApiRouter.h"
#include "OAIAssetsApiRequest.h"
#include "OAIDriversApiRequest.h"
#include "OAIFleetApiRequest.h"
#include "OAIIndustrialApiRequest.h"
#include "OAIRoutesApiRequest.h"
#include "OAISafetyApiRequest.h"
#include "OAISensorsApiRequest.h"
#include "OAITagsApiRequest.h"
#include "OAIUsersApiRequest.h"


namespace OpenAPI {

OAIApiRouter::OAIApiRouter() {
    createApiHandlers();
}

OAIApiRouter::~OAIApiRouter(){
    
    delete OAIAssetsApiApiHandler;
    delete OAIDriversApiApiHandler;
    delete OAIFleetApiApiHandler;
    delete OAIIndustrialApiApiHandler;
    delete OAIRoutesApiApiHandler;
    delete OAISafetyApiApiHandler;
    delete OAISensorsApiApiHandler;
    delete OAITagsApiApiHandler;
    delete OAIUsersApiApiHandler;
}

void OAIApiRouter::createApiHandlers() { 
    OAIAssetsApiApiHandler = new OAIAssetsApiHandler();
    OAIDriversApiApiHandler = new OAIDriversApiHandler();
    OAIFleetApiApiHandler = new OAIFleetApiHandler();
    OAIIndustrialApiApiHandler = new OAIIndustrialApiHandler();
    OAIRoutesApiApiHandler = new OAIRoutesApiHandler();
    OAISafetyApiApiHandler = new OAISafetyApiHandler();
    OAISensorsApiApiHandler = new OAISensorsApiHandler();
    OAITagsApiApiHandler = new OAITagsApiHandler();
    OAIUsersApiApiHandler = new OAIUsersApiHandler();
}

void OAIApiRouter::setUpRoutes() {
    
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/assets/locations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIAssetsApiRequest(socket, OAIAssetsApiApiHandler);
            reqObj->getAllAssetCurrentLocationsRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/assets").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIAssetsApiRequest(socket, OAIAssetsApiApiHandler);
            reqObj->getAllAssetsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/drivers/create").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIDriversApiRequest(socket, OAIDriversApiApiHandler);
            reqObj->createDriverRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/inactive").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIDriversApiRequest(socket, OAIDriversApiApiHandler);
            reqObj->getAllDeactivatedDriversRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/add_address").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->addFleetAddressRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/addresses").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->addOrganizationAddressesRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/dispatch/routes").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->createDispatchRouteRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/drivers/create").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->createDriverRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/maintenance/dvirs").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->createDvirRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->fetchAllDispatchRoutesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes/job_updates").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->fetchAllRouteJobUpdatesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/assets/locations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getAllAssetCurrentLocationsRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/assets").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getAllAssetsRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/inactive").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getAllDeactivatedDriversRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/document_types").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getDriverDocumentTypesByOrgIdRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/documents").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getDriverDocumentsByOrgIdRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/maintenance/dvirs").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getDvirsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/drivers").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetDriversRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/drivers/summary").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetDriversSummaryRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/hos_authentication_logs").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetHosAuthenticationLogsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/hos_logs").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetHosLogsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/hos_logs_summary").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetHosLogsSummaryRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/locations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetLocationsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/maintenance/list").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetMaintenanceListRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/trips").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getFleetTripsRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/addresses").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getOrganizationAddressesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/stats").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getVehicleStatsRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/locations").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->getVehiclesLocationsRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/contacts").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->listContactsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/list").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->listFleetRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/set_data").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
            reqObj->updateVehiclesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/industrial/data").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIIndustrialApiRequest(socket, OAIIndustrialApiApiHandler);
            reqObj->getAllDataInputsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/machines/list").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIIndustrialApiRequest(socket, OAIIndustrialApiApiHandler);
            reqObj->getMachinesRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/machines/history").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIIndustrialApiRequest(socket, OAIIndustrialApiApiHandler);
            reqObj->getMachinesHistoryRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/fleet/dispatch/routes").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
            reqObj->createDispatchRouteRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
            reqObj->fetchAllDispatchRoutesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes/job_updates").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
            reqObj->fetchAllRouteJobUpdatesRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/sensors/list").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAISensorsApiRequest(socket, OAISensorsApiApiHandler);
            reqObj->getSensorsRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/sensors/cargo").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAISensorsApiRequest(socket, OAISensorsApiApiHandler);
            reqObj->getSensorsCargoRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/sensors/door").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAISensorsApiRequest(socket, OAISensorsApiApiHandler);
            reqObj->getSensorsDoorRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/sensors/history").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAISensorsApiRequest(socket, OAISensorsApiApiHandler);
            reqObj->getSensorsHistoryRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/sensors/humidity").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAISensorsApiRequest(socket, OAISensorsApiApiHandler);
            reqObj->getSensorsHumidityRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/sensors/temperature").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAISensorsApiRequest(socket, OAISensorsApiApiHandler);
            reqObj->getSensorsTemperatureRequest();
    });
    Routes.insert(QString("%1 %2").arg("POST").arg("/v1/tags").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAITagsApiRequest(socket, OAITagsApiApiHandler);
            reqObj->createTagRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/tags").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAITagsApiRequest(socket, OAITagsApiApiHandler);
            reqObj->getAllTagsRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/user_roles").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIUsersApiRequest(socket, OAIUsersApiApiHandler);
            reqObj->listUserRolesRequest();
    });
    Routes.insert(QString("%1 %2").arg("GET").arg("/v1/users").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIUsersApiRequest(socket, OAIUsersApiApiHandler);
            reqObj->listUsersRequest();
    });
}

void OAIApiRouter::processRequest(QHttpEngine::Socket *socket){
    if( handleRequest(socket) ){
        return;
    }
    if( handleRequestAndExtractPathParam(socket) ){
        return;
    }
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    if(socket->isOpen()){
        socket->writeHeaders();
        socket->close();
    }
}

bool OAIApiRouter::handleRequest(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    if ( Routes.contains(reqPath) ) {
        Routes.value(reqPath).operator()(socket);
        return true;
    }
    return false;
}

bool OAIApiRouter::handleRequestAndExtractPathParam(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/assets/{asset_id}/locations").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString asset_id = match.captured(QString("asset_id").toLower());
                auto reqObj = new OAIAssetsApiRequest(socket, OAIAssetsApiApiHandler);
                reqObj->getAssetLocationRequest(asset_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/assets/{asset_id}/reefer").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString asset_id = match.captured(QString("asset_id").toLower());
                auto reqObj = new OAIAssetsApiRequest(socket, OAIAssetsApiApiHandler);
                reqObj->getAssetReeferRequest(asset_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/fleet/drivers/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIDriversApiRequest(socket, OAIDriversApiApiHandler);
                reqObj->deactivateDriverRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/inactive/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIDriversApiRequest(socket, OAIDriversApiApiHandler);
                reqObj->getDeactivatedDriverByIdRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIDriversApiRequest(socket, OAIDriversApiApiHandler);
                reqObj->getDriverByIdRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PUT").arg("/v1/fleet/drivers/inactive/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIDriversApiRequest(socket, OAIDriversApiApiHandler);
                reqObj->reactivateDriverByIdRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("POST").arg("/v1/fleet/drivers/{driver_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id = match.captured(QString("driver_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->createDriverDispatchRouteRequest(driver_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("POST").arg("/v1/fleet/drivers/{driver_id}/documents").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id = match.captured(QString("driver_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->createDriverDocumentRequest(driver_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("POST").arg("/v1/fleet/vehicles/{vehicle_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicle_id = match.captured(QString("vehicle_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->createVehicleDispatchRouteRequest(vehicle_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/fleet/drivers/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->deactivateDriverRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/fleet/dispatch/routes/{route_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->deleteDispatchRouteByIdRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/addresses/{addressId}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString addressId = match.captured(QString("addressId").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->deleteOrganizationAddressRequest(addressId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/assets/{asset_id}/locations").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString asset_id = match.captured(QString("asset_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getAssetLocationRequest(asset_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/assets/{asset_id}/reefer").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString asset_id = match.captured(QString("asset_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getAssetReeferRequest(asset_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/inactive/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getDeactivatedDriverByIdRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes/{route_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getDispatchRouteByIdRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes/{route_id}/history").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getDispatchRouteHistoryRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/{driver_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id = match.captured(QString("driver_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getDispatchRoutesByDriverIdRequest(driver_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicle_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicle_id = match.captured(QString("vehicle_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getDispatchRoutesByVehicleIdRequest(vehicle_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getDriverByIdRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/{driverId}/safety/score").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driverId = match.captured(QString("driverId").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getDriverSafetyScoreRequest(driverId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("POST").arg("/v1/fleet/drivers/{driver_id}/hos_daily_logs").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id = match.captured(QString("driver_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getFleetDriversHosDailyLogsRequest(driver_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicle_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicle_id_or_external_id = match.captured(QString("vehicle_id_or_external_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getFleetVehicleRequest(vehicle_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/addresses/{addressId}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString addressId = match.captured(QString("addressId").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getOrganizationAddressRequest(addressId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/contacts/{contact_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString contact_id = match.captured(QString("contact_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getOrganizationContactRequest(contact_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicleId}/safety/harsh_event").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicleId = match.captured(QString("vehicleId").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getVehicleHarshEventRequest(vehicleId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicle_id}/locations").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicle_id = match.captured(QString("vehicle_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getVehicleLocationsRequest(vehicle_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicleId}/safety/score").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicleId = match.captured(QString("vehicleId").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->getVehicleSafetyScoreRequest(vehicleId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PATCH").arg("/v1/fleet/vehicles/{vehicle_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicle_id_or_external_id = match.captured(QString("vehicle_id_or_external_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->patchFleetVehicleRequest(vehicle_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PUT").arg("/v1/fleet/drivers/inactive/{driver_id_or_external_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id_or_external_id = match.captured(QString("driver_id_or_external_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->reactivateDriverByIdRequest(driver_id_or_external_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PUT").arg("/v1/fleet/dispatch/routes/{route_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->updateDispatchRouteByIdRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PATCH").arg("/v1/addresses/{addressId}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString addressId = match.captured(QString("addressId").toLower());
                auto reqObj = new OAIFleetApiRequest(socket, OAIFleetApiApiHandler);
                reqObj->updateOrganizationAddressRequest(addressId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/industrial/data/{data_input_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString data_input_id = match.captured(QString("data_input_id").toLower());
                auto reqObj = new OAIIndustrialApiRequest(socket, OAIIndustrialApiApiHandler);
                reqObj->getDataInputRequest(data_input_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("POST").arg("/v1/fleet/drivers/{driver_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id = match.captured(QString("driver_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->createDriverDispatchRouteRequest(driver_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("POST").arg("/v1/fleet/vehicles/{vehicle_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicle_id = match.captured(QString("vehicle_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->createVehicleDispatchRouteRequest(vehicle_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/fleet/dispatch/routes/{route_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->deleteDispatchRouteByIdRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes/{route_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->getDispatchRouteByIdRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/dispatch/routes/{route_id}/history").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->getDispatchRouteHistoryRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/{driver_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driver_id = match.captured(QString("driver_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->getDispatchRoutesByDriverIdRequest(driver_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicle_id}/dispatch/routes").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicle_id = match.captured(QString("vehicle_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->getDispatchRoutesByVehicleIdRequest(vehicle_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PUT").arg("/v1/fleet/dispatch/routes/{route_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString route_id = match.captured(QString("route_id").toLower());
                auto reqObj = new OAIRoutesApiRequest(socket, OAIRoutesApiApiHandler);
                reqObj->updateDispatchRouteByIdRequest(route_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/drivers/{driverId}/safety/score").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString driverId = match.captured(QString("driverId").toLower());
                auto reqObj = new OAISafetyApiRequest(socket, OAISafetyApiApiHandler);
                reqObj->getDriverSafetyScoreRequest(driverId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicleId}/safety/harsh_event").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicleId = match.captured(QString("vehicleId").toLower());
                auto reqObj = new OAISafetyApiRequest(socket, OAISafetyApiApiHandler);
                reqObj->getVehicleHarshEventRequest(vehicleId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/fleet/vehicles/{vehicleId}/safety/score").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString vehicleId = match.captured(QString("vehicleId").toLower());
                auto reqObj = new OAISafetyApiRequest(socket, OAISafetyApiApiHandler);
                reqObj->getVehicleSafetyScoreRequest(vehicleId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/tags/{tag_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString tag_id = match.captured(QString("tag_id").toLower());
                auto reqObj = new OAITagsApiRequest(socket, OAITagsApiApiHandler);
                reqObj->deleteTagByIdRequest(tag_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/tags/{tag_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString tag_id = match.captured(QString("tag_id").toLower());
                auto reqObj = new OAITagsApiRequest(socket, OAITagsApiApiHandler);
                reqObj->getTagByIdRequest(tag_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PATCH").arg("/v1/tags/{tag_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString tag_id = match.captured(QString("tag_id").toLower());
                auto reqObj = new OAITagsApiRequest(socket, OAITagsApiApiHandler);
                reqObj->modifyTagByIdRequest(tag_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("PUT").arg("/v1/tags/{tag_id}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString tag_id = match.captured(QString("tag_id").toLower());
                auto reqObj = new OAITagsApiRequest(socket, OAITagsApiApiHandler);
                reqObj->updateTagByIdRequest(tag_id);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("DELETE").arg("/v1/users/{userId}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString userId = match.captured(QString("userId").toLower());
                auto reqObj = new OAIUsersApiRequest(socket, OAIUsersApiApiHandler);
                reqObj->deleteUserByIdRequest(userId);
                return true;
            }
        }
    }
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/v1/users/{userId}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString userId = match.captured(QString("userId").toLower());
                auto reqObj = new OAIUsersApiRequest(socket, OAIUsersApiApiHandler);
                reqObj->getUserByIdRequest(userId);
                return true;
            }
        }
    }
    return false;
}

}
