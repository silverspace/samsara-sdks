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

#include "OAIFleetApiHandler.h"
#include "OAIFleetApiRequest.h"

namespace OpenAPI {

OAIFleetApiHandler::OAIFleetApiHandler(){

}

OAIFleetApiHandler::~OAIFleetApiHandler(){

}

void OAIFleetApiHandler::addFleetAddress(QString access_token, OAIInline_object_2 address_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(address_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->addFleetAddressResponse();
    }    
}
void OAIFleetApiHandler::addOrganizationAddresses(QString access_token, OAIInline_object addresses) {
    Q_UNUSED(access_token);
    Q_UNUSED(addresses);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIAddress> res;
        reqObj->addOrganizationAddressesResponse(res);
    }    
}
void OAIFleetApiHandler::createDispatchRoute(QString access_token, OAIDispatchRouteCreate create_dispatch_route_params) {
    Q_UNUSED(access_token);
    Q_UNUSED(create_dispatch_route_params);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDispatchRoute res;
        reqObj->createDispatchRouteResponse(res);
    }    
}
void OAIFleetApiHandler::createDriver(QString access_token, OAIDriverForCreate create_driver_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(create_driver_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriver res;
        reqObj->createDriverResponse(res);
    }    
}
void OAIFleetApiHandler::createDriverDispatchRoute(QString access_token, qint64 driver_id, OAIDispatchRouteCreate create_dispatch_route_params) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id);
    Q_UNUSED(create_dispatch_route_params);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDispatchRoute res;
        reqObj->createDriverDispatchRouteResponse(res);
    }    
}
void OAIFleetApiHandler::createDriverDocument(QString access_token, qint64 driver_id, OAIDocumentCreate create_document_params) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id);
    Q_UNUSED(create_document_params);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDocument res;
        reqObj->createDriverDocumentResponse(res);
    }    
}
void OAIFleetApiHandler::createDvir(QString access_token, OAIInline_object_12 create_dvir_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(create_dvir_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDvirBase res;
        reqObj->createDvirResponse(res);
    }    
}
void OAIFleetApiHandler::createVehicleDispatchRoute(QString access_token, qint64 vehicle_id, OAIDispatchRouteCreate create_dispatch_route_params) {
    Q_UNUSED(access_token);
    Q_UNUSED(vehicle_id);
    Q_UNUSED(create_dispatch_route_params);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDispatchRoute res;
        reqObj->createVehicleDispatchRouteResponse(res);
    }    
}
void OAIFleetApiHandler::deactivateDriver(QString access_token, QString driver_id_or_external_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id_or_external_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->deactivateDriverResponse();
    }    
}
void OAIFleetApiHandler::deleteDispatchRouteById(QString access_token, qint64 route_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(route_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->deleteDispatchRouteByIdResponse();
    }    
}
void OAIFleetApiHandler::deleteOrganizationAddress(QString access_token, qint64 address_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(address_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->deleteOrganizationAddressResponse();
    }    
}
void OAIFleetApiHandler::fetchAllDispatchRoutes(QString access_token, qint64 group_id, qint64 end_time, qint64 duration) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_id);
    Q_UNUSED(end_time);
    Q_UNUSED(duration);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIDispatchRoute> res;
        reqObj->fetchAllDispatchRoutesResponse(res);
    }    
}
void OAIFleetApiHandler::fetchAllRouteJobUpdates(QString access_token, qint64 group_id, QString sequence_id, QString include) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_id);
    Q_UNUSED(sequence_id);
    Q_UNUSED(include);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIAllRouteJobUpdates res;
        reqObj->fetchAllRouteJobUpdatesResponse(res);
    }    
}
void OAIFleetApiHandler::getAllAssetCurrentLocations(QString access_token, qint64 group_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInline_response_200_1 res;
        reqObj->getAllAssetCurrentLocationsResponse(res);
    }    
}
void OAIFleetApiHandler::getAllAssets(QString access_token, qint64 group_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInline_response_200 res;
        reqObj->getAllAssetsResponse(res);
    }    
}
void OAIFleetApiHandler::getAllDeactivatedDrivers(QString access_token, qint64 group_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIDriver> res;
        reqObj->getAllDeactivatedDriversResponse(res);
    }    
}
void OAIFleetApiHandler::getAssetLocation(QString access_token, qint64 asset_id, qint64 start_ms, qint64 end_ms) {
    Q_UNUSED(access_token);
    Q_UNUSED(asset_id);
    Q_UNUSED(start_ms);
    Q_UNUSED(end_ms);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIObject> res;
        reqObj->getAssetLocationResponse(res);
    }    
}
void OAIFleetApiHandler::getAssetReefer(QString access_token, qint64 asset_id, qint64 start_ms, qint64 end_ms) {
    Q_UNUSED(access_token);
    Q_UNUSED(asset_id);
    Q_UNUSED(start_ms);
    Q_UNUSED(end_ms);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIAssetReeferResponse res;
        reqObj->getAssetReeferResponse(res);
    }    
}
void OAIFleetApiHandler::getDeactivatedDriverById(QString access_token, QString driver_id_or_external_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id_or_external_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriver res;
        reqObj->getDeactivatedDriverByIdResponse(res);
    }    
}
void OAIFleetApiHandler::getDispatchRouteById(QString access_token, qint64 route_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(route_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDispatchRoute res;
        reqObj->getDispatchRouteByIdResponse(res);
    }    
}
void OAIFleetApiHandler::getDispatchRouteHistory(QString access_token, qint64 route_id, qint64 start_time, qint64 end_time) {
    Q_UNUSED(access_token);
    Q_UNUSED(route_id);
    Q_UNUSED(start_time);
    Q_UNUSED(end_time);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDispatchRouteHistory res;
        reqObj->getDispatchRouteHistoryResponse(res);
    }    
}
void OAIFleetApiHandler::getDispatchRoutesByDriverId(QString access_token, qint64 driver_id, qint64 end_time, qint64 duration) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id);
    Q_UNUSED(end_time);
    Q_UNUSED(duration);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIDispatchRoute> res;
        reqObj->getDispatchRoutesByDriverIdResponse(res);
    }    
}
void OAIFleetApiHandler::getDispatchRoutesByVehicleId(QString access_token, qint64 vehicle_id, qint64 end_time, qint64 duration) {
    Q_UNUSED(access_token);
    Q_UNUSED(vehicle_id);
    Q_UNUSED(end_time);
    Q_UNUSED(duration);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIDispatchRoute> res;
        reqObj->getDispatchRoutesByVehicleIdResponse(res);
    }    
}
void OAIFleetApiHandler::getDriverById(QString access_token, QString driver_id_or_external_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id_or_external_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriver res;
        reqObj->getDriverByIdResponse(res);
    }    
}
void OAIFleetApiHandler::getDriverDocumentTypesByOrgId() {
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIDocumentType> res;
        reqObj->getDriverDocumentTypesByOrgIdResponse(res);
    }    
}
void OAIFleetApiHandler::getDriverDocumentsByOrgId(QString access_token, qint64 end_ms, qint64 duration_ms) {
    Q_UNUSED(access_token);
    Q_UNUSED(end_ms);
    Q_UNUSED(duration_ms);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIDocument> res;
        reqObj->getDriverDocumentsByOrgIdResponse(res);
    }    
}
void OAIFleetApiHandler::getDriverSafetyScore(qint64 driver_id, QString access_token, qint64 start_ms, qint64 end_ms) {
    Q_UNUSED(driver_id);
    Q_UNUSED(access_token);
    Q_UNUSED(start_ms);
    Q_UNUSED(end_ms);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriverSafetyScoreResponse res;
        reqObj->getDriverSafetyScoreResponse(res);
    }    
}
void OAIFleetApiHandler::getDvirs(QString access_token, qint32 end_ms, qint32 duration_ms, qint32 group_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(end_ms);
    Q_UNUSED(duration_ms);
    Q_UNUSED(group_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDvirListResponse res;
        reqObj->getDvirsResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetDrivers(QString access_token, OAIInline_object_3 group_drivers_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_drivers_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriversResponse res;
        reqObj->getFleetDriversResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetDriversHosDailyLogs(QString access_token, qint64 driver_id, OAIInline_object_6 hos_logs_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id);
    Q_UNUSED(hos_logs_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriverDailyLogResponse res;
        reqObj->getFleetDriversHosDailyLogsResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetDriversSummary(QString access_token, OAIInline_object_5 drivers_summary_param, bool snap_to_day_bounds) {
    Q_UNUSED(access_token);
    Q_UNUSED(drivers_summary_param);
    Q_UNUSED(snap_to_day_bounds);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriversSummaryResponse res;
        reqObj->getFleetDriversSummaryResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetHosAuthenticationLogs(QString access_token, OAIInline_object_7 hos_authentication_logs_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(hos_authentication_logs_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIHosAuthenticationLogsResponse res;
        reqObj->getFleetHosAuthenticationLogsResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetHosLogs(QString access_token, OAIInline_object_8 hos_logs_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(hos_logs_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIHosLogsResponse res;
        reqObj->getFleetHosLogsResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetHosLogsSummary(QString access_token, OAIInline_object_9 hos_logs_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(hos_logs_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIHosLogsSummaryResponse res;
        reqObj->getFleetHosLogsSummaryResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetLocations(QString access_token, OAIInline_object_11 group_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInline_response_200_3 res;
        reqObj->getFleetLocationsResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetMaintenanceList(QString access_token, OAIInline_object_13 group_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInline_response_200_4 res;
        reqObj->getFleetMaintenanceListResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetTrips(QString access_token, OAIInline_object_15 trips_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(trips_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAITripResponse res;
        reqObj->getFleetTripsResponse(res);
    }    
}
void OAIFleetApiHandler::getFleetVehicle(QString access_token, QString vehicle_id_or_external_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(vehicle_id_or_external_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIFleetVehicleResponse res;
        reqObj->getFleetVehicleResponse(res);
    }    
}
void OAIFleetApiHandler::getOrganizationAddress(QString access_token, qint64 address_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(address_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIAddress res;
        reqObj->getOrganizationAddressResponse(res);
    }    
}
void OAIFleetApiHandler::getOrganizationAddresses(QString access_token) {
    Q_UNUSED(access_token);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIAddress> res;
        reqObj->getOrganizationAddressesResponse(res);
    }    
}
void OAIFleetApiHandler::getOrganizationContact(QString access_token, qint64 contact_id) {
    Q_UNUSED(access_token);
    Q_UNUSED(contact_id);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIContact res;
        reqObj->getOrganizationContactResponse(res);
    }    
}
void OAIFleetApiHandler::getVehicleHarshEvent(qint64 vehicle_id, QString access_token, qint64 timestamp) {
    Q_UNUSED(vehicle_id);
    Q_UNUSED(access_token);
    Q_UNUSED(timestamp);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIVehicleHarshEventResponse res;
        reqObj->getVehicleHarshEventResponse(res);
    }    
}
void OAIFleetApiHandler::getVehicleLocations(QString access_token, qint64 vehicle_id, qint64 start_ms, qint64 end_ms) {
    Q_UNUSED(access_token);
    Q_UNUSED(vehicle_id);
    Q_UNUSED(start_ms);
    Q_UNUSED(end_ms);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIFleetVehicleLocation> res;
        reqObj->getVehicleLocationsResponse(res);
    }    
}
void OAIFleetApiHandler::getVehicleSafetyScore(qint64 vehicle_id, QString access_token, qint64 start_ms, qint64 end_ms) {
    Q_UNUSED(vehicle_id);
    Q_UNUSED(access_token);
    Q_UNUSED(start_ms);
    Q_UNUSED(end_ms);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIVehicleSafetyScoreResponse res;
        reqObj->getVehicleSafetyScoreResponse(res);
    }    
}
void OAIFleetApiHandler::getVehicleStats(QString access_token, qint32 start_ms, qint32 end_ms, QString series, QString tag_ids, QString starting_after, QString ending_before, qint64 limit) {
    Q_UNUSED(access_token);
    Q_UNUSED(start_ms);
    Q_UNUSED(end_ms);
    Q_UNUSED(series);
    Q_UNUSED(tag_ids);
    Q_UNUSED(starting_after);
    Q_UNUSED(ending_before);
    Q_UNUSED(limit);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInline_response_200_5 res;
        reqObj->getVehicleStatsResponse(res);
    }    
}
void OAIFleetApiHandler::getVehiclesLocations(QString access_token, qint32 start_ms, qint32 end_ms) {
    Q_UNUSED(access_token);
    Q_UNUSED(start_ms);
    Q_UNUSED(end_ms);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIObject> res;
        reqObj->getVehiclesLocationsResponse(res);
    }    
}
void OAIFleetApiHandler::listContacts(QString access_token) {
    Q_UNUSED(access_token);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        QList<OAIContact> res;
        reqObj->listContactsResponse(res);
    }    
}
void OAIFleetApiHandler::listFleet(QString access_token, OAIInline_object_10 group_param, QString starting_after, QString ending_before, qint64 limit) {
    Q_UNUSED(access_token);
    Q_UNUSED(group_param);
    Q_UNUSED(starting_after);
    Q_UNUSED(ending_before);
    Q_UNUSED(limit);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInline_response_200_2 res;
        reqObj->listFleetResponse(res);
    }    
}
void OAIFleetApiHandler::patchFleetVehicle(QString access_token, QString vehicle_id_or_external_id, OAIInline_object_16 data) {
    Q_UNUSED(access_token);
    Q_UNUSED(vehicle_id_or_external_id);
    Q_UNUSED(data);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIFleetVehicleResponse res;
        reqObj->patchFleetVehicleResponse(res);
    }    
}
void OAIFleetApiHandler::reactivateDriverById(QString access_token, QString driver_id_or_external_id, OAIInline_object_4 reactivate_driver_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(driver_id_or_external_id);
    Q_UNUSED(reactivate_driver_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDriver res;
        reqObj->reactivateDriverByIdResponse(res);
    }    
}
void OAIFleetApiHandler::updateDispatchRouteById(QString access_token, qint64 route_id, OAIDispatchRoute update_dispatch_route_params) {
    Q_UNUSED(access_token);
    Q_UNUSED(route_id);
    Q_UNUSED(update_dispatch_route_params);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIDispatchRoute res;
        reqObj->updateDispatchRouteByIdResponse(res);
    }    
}
void OAIFleetApiHandler::updateOrganizationAddress(QString access_token, qint64 address_id, OAIInline_object_1 address) {
    Q_UNUSED(access_token);
    Q_UNUSED(address_id);
    Q_UNUSED(address);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->updateOrganizationAddressResponse();
    }    
}
void OAIFleetApiHandler::updateVehicles(QString access_token, OAIInline_object_14 vehicle_update_param) {
    Q_UNUSED(access_token);
    Q_UNUSED(vehicle_update_param);
    auto reqObj = qobject_cast<OAIFleetApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        
        reqObj->updateVehiclesResponse();
    }    
}


}
