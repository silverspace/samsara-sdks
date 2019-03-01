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

#ifndef OAI_OAIFleetApi_H
#define OAI_OAIFleetApi_H

#include "OAIHttpRequest.h"

#include "OAIAddress.h"
#include "OAIAllRouteJobUpdates.h"
#include "OAIAssetReeferResponse.h"
#include "OAIContact.h"
#include "OAIDispatchRoute.h"
#include "OAIDispatchRouteCreate.h"
#include "OAIDispatchRouteHistory.h"
#include "OAIDocument.h"
#include "OAIDocumentCreate.h"
#include "OAIDocumentType.h"
#include "OAIDriver.h"
#include "OAIDriverDailyLogResponse.h"
#include "OAIDriverForCreate.h"
#include "OAIDriverSafetyScoreResponse.h"
#include "OAIDriversResponse.h"
#include "OAIDriversSummaryResponse.h"
#include "OAIDvirBase.h"
#include "OAIDvirListResponse.h"
#include "OAIFleetVehicleLocation.h"
#include "OAIFleetVehicleResponse.h"
#include "OAIHosAuthenticationLogsResponse.h"
#include "OAIHosLogsResponse.h"
#include "OAIHosLogsSummaryResponse.h"
#include "OAIInline_object.h"
#include "OAIInline_object_1.h"
#include "OAIInline_object_10.h"
#include "OAIInline_object_11.h"
#include "OAIInline_object_12.h"
#include "OAIInline_object_13.h"
#include "OAIInline_object_14.h"
#include "OAIInline_object_15.h"
#include "OAIInline_object_16.h"
#include "OAIInline_object_2.h"
#include "OAIInline_object_3.h"
#include "OAIInline_object_4.h"
#include "OAIInline_object_5.h"
#include "OAIInline_object_6.h"
#include "OAIInline_object_7.h"
#include "OAIInline_object_8.h"
#include "OAIInline_object_9.h"
#include "OAIInline_response_200.h"
#include "OAIInline_response_200_1.h"
#include "OAIInline_response_200_2.h"
#include "OAIInline_response_200_3.h"
#include "OAIInline_response_200_4.h"
#include "OAIInline_response_200_5.h"
#include "OAIObject.h"
#include "OAITripResponse.h"
#include "OAIVehicleHarshEventResponse.h"
#include "OAIVehicleSafetyScoreResponse.h"
#include <QString>

#include <QObject>

namespace OpenAPI {

class OAIFleetApi: public QObject {
    Q_OBJECT

public:
    OAIFleetApi();
    OAIFleetApi(QString host, QString basePath);
    ~OAIFleetApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void addFleetAddress(const QString& access_token, const OAIInline_object_2& address_param);
    void addOrganizationAddresses(const QString& access_token, const OAIInline_object& addresses);
    void createDispatchRoute(const QString& access_token, const OAIDispatchRouteCreate& create_dispatch_route_params);
    void createDriver(const QString& access_token, const OAIDriverForCreate& create_driver_param);
    void createDriverDispatchRoute(const QString& access_token, const qint64& driver_id, const OAIDispatchRouteCreate& create_dispatch_route_params);
    void createDriverDocument(const QString& access_token, const qint64& driver_id, const OAIDocumentCreate& create_document_params);
    void createDvir(const QString& access_token, const OAIInline_object_12& create_dvir_param);
    void createVehicleDispatchRoute(const QString& access_token, const qint64& vehicle_id, const OAIDispatchRouteCreate& create_dispatch_route_params);
    void deactivateDriver(const QString& access_token, const QString& driver_id_or_external_id);
    void deleteDispatchRouteById(const QString& access_token, const qint64& route_id);
    void deleteOrganizationAddress(const QString& access_token, const qint64& address_id);
    void fetchAllDispatchRoutes(const QString& access_token, const qint64& group_id, const qint64& end_time, const qint64& duration);
    void fetchAllRouteJobUpdates(const QString& access_token, const qint64& group_id, const QString& sequence_id, const QString& include);
    void getAllAssetCurrentLocations(const QString& access_token, const qint64& group_id);
    void getAllAssets(const QString& access_token, const qint64& group_id);
    void getAllDeactivatedDrivers(const QString& access_token, const qint64& group_id);
    void getAssetLocation(const QString& access_token, const qint64& asset_id, const qint64& start_ms, const qint64& end_ms);
    void getAssetReefer(const QString& access_token, const qint64& asset_id, const qint64& start_ms, const qint64& end_ms);
    void getDeactivatedDriverById(const QString& access_token, const QString& driver_id_or_external_id);
    void getDispatchRouteById(const QString& access_token, const qint64& route_id);
    void getDispatchRouteHistory(const QString& access_token, const qint64& route_id, const qint64& start_time, const qint64& end_time);
    void getDispatchRoutesByDriverId(const QString& access_token, const qint64& driver_id, const qint64& end_time, const qint64& duration);
    void getDispatchRoutesByVehicleId(const QString& access_token, const qint64& vehicle_id, const qint64& end_time, const qint64& duration);
    void getDriverById(const QString& access_token, const QString& driver_id_or_external_id);
    void getDriverDocumentTypesByOrgId();
    void getDriverDocumentsByOrgId(const QString& access_token, const qint64& end_ms, const qint64& duration_ms);
    void getDriverSafetyScore(const qint64& driver_id, const QString& access_token, const qint64& start_ms, const qint64& end_ms);
    void getDvirs(const QString& access_token, const qint32& end_ms, const qint32& duration_ms, const qint32& group_id);
    void getFleetDrivers(const QString& access_token, const OAIInline_object_3& group_drivers_param);
    void getFleetDriversHosDailyLogs(const QString& access_token, const qint64& driver_id, const OAIInline_object_6& hos_logs_param);
    void getFleetDriversSummary(const QString& access_token, const OAIInline_object_5& drivers_summary_param, const bool& snap_to_day_bounds);
    void getFleetHosAuthenticationLogs(const QString& access_token, const OAIInline_object_7& hos_authentication_logs_param);
    void getFleetHosLogs(const QString& access_token, const OAIInline_object_8& hos_logs_param);
    void getFleetHosLogsSummary(const QString& access_token, const OAIInline_object_9& hos_logs_param);
    void getFleetLocations(const QString& access_token, const OAIInline_object_11& group_param);
    void getFleetMaintenanceList(const QString& access_token, const OAIInline_object_13& group_param);
    void getFleetTrips(const QString& access_token, const OAIInline_object_15& trips_param);
    void getFleetVehicle(const QString& access_token, const QString& vehicle_id_or_external_id);
    void getOrganizationAddress(const QString& access_token, const qint64& address_id);
    void getOrganizationAddresses(const QString& access_token);
    void getOrganizationContact(const QString& access_token, const qint64& contact_id);
    void getVehicleHarshEvent(const qint64& vehicle_id, const QString& access_token, const qint64& timestamp);
    void getVehicleLocations(const QString& access_token, const qint64& vehicle_id, const qint64& start_ms, const qint64& end_ms);
    void getVehicleSafetyScore(const qint64& vehicle_id, const QString& access_token, const qint64& start_ms, const qint64& end_ms);
    void getVehicleStats(const QString& access_token, const qint32& start_ms, const qint32& end_ms, const QString& series, const QString& tag_ids, const QString& starting_after, const QString& ending_before, const qint64& limit);
    void getVehiclesLocations(const QString& access_token, const qint32& start_ms, const qint32& end_ms);
    void listContacts(const QString& access_token);
    void listFleet(const QString& access_token, const OAIInline_object_10& group_param, const QString& starting_after, const QString& ending_before, const qint64& limit);
    void patchFleetVehicle(const QString& access_token, const QString& vehicle_id_or_external_id, const OAIInline_object_16& data);
    void reactivateDriverById(const QString& access_token, const QString& driver_id_or_external_id, const OAIInline_object_4& reactivate_driver_param);
    void updateDispatchRouteById(const QString& access_token, const qint64& route_id, const OAIDispatchRoute& update_dispatch_route_params);
    void updateOrganizationAddress(const QString& access_token, const qint64& address_id, const OAIInline_object_1& address);
    void updateVehicles(const QString& access_token, const OAIInline_object_14& vehicle_update_param);
    
private:
    void addFleetAddressCallback (OAIHttpRequestWorker * worker);
    void addOrganizationAddressesCallback (OAIHttpRequestWorker * worker);
    void createDispatchRouteCallback (OAIHttpRequestWorker * worker);
    void createDriverCallback (OAIHttpRequestWorker * worker);
    void createDriverDispatchRouteCallback (OAIHttpRequestWorker * worker);
    void createDriverDocumentCallback (OAIHttpRequestWorker * worker);
    void createDvirCallback (OAIHttpRequestWorker * worker);
    void createVehicleDispatchRouteCallback (OAIHttpRequestWorker * worker);
    void deactivateDriverCallback (OAIHttpRequestWorker * worker);
    void deleteDispatchRouteByIdCallback (OAIHttpRequestWorker * worker);
    void deleteOrganizationAddressCallback (OAIHttpRequestWorker * worker);
    void fetchAllDispatchRoutesCallback (OAIHttpRequestWorker * worker);
    void fetchAllRouteJobUpdatesCallback (OAIHttpRequestWorker * worker);
    void getAllAssetCurrentLocationsCallback (OAIHttpRequestWorker * worker);
    void getAllAssetsCallback (OAIHttpRequestWorker * worker);
    void getAllDeactivatedDriversCallback (OAIHttpRequestWorker * worker);
    void getAssetLocationCallback (OAIHttpRequestWorker * worker);
    void getAssetReeferCallback (OAIHttpRequestWorker * worker);
    void getDeactivatedDriverByIdCallback (OAIHttpRequestWorker * worker);
    void getDispatchRouteByIdCallback (OAIHttpRequestWorker * worker);
    void getDispatchRouteHistoryCallback (OAIHttpRequestWorker * worker);
    void getDispatchRoutesByDriverIdCallback (OAIHttpRequestWorker * worker);
    void getDispatchRoutesByVehicleIdCallback (OAIHttpRequestWorker * worker);
    void getDriverByIdCallback (OAIHttpRequestWorker * worker);
    void getDriverDocumentTypesByOrgIdCallback (OAIHttpRequestWorker * worker);
    void getDriverDocumentsByOrgIdCallback (OAIHttpRequestWorker * worker);
    void getDriverSafetyScoreCallback (OAIHttpRequestWorker * worker);
    void getDvirsCallback (OAIHttpRequestWorker * worker);
    void getFleetDriversCallback (OAIHttpRequestWorker * worker);
    void getFleetDriversHosDailyLogsCallback (OAIHttpRequestWorker * worker);
    void getFleetDriversSummaryCallback (OAIHttpRequestWorker * worker);
    void getFleetHosAuthenticationLogsCallback (OAIHttpRequestWorker * worker);
    void getFleetHosLogsCallback (OAIHttpRequestWorker * worker);
    void getFleetHosLogsSummaryCallback (OAIHttpRequestWorker * worker);
    void getFleetLocationsCallback (OAIHttpRequestWorker * worker);
    void getFleetMaintenanceListCallback (OAIHttpRequestWorker * worker);
    void getFleetTripsCallback (OAIHttpRequestWorker * worker);
    void getFleetVehicleCallback (OAIHttpRequestWorker * worker);
    void getOrganizationAddressCallback (OAIHttpRequestWorker * worker);
    void getOrganizationAddressesCallback (OAIHttpRequestWorker * worker);
    void getOrganizationContactCallback (OAIHttpRequestWorker * worker);
    void getVehicleHarshEventCallback (OAIHttpRequestWorker * worker);
    void getVehicleLocationsCallback (OAIHttpRequestWorker * worker);
    void getVehicleSafetyScoreCallback (OAIHttpRequestWorker * worker);
    void getVehicleStatsCallback (OAIHttpRequestWorker * worker);
    void getVehiclesLocationsCallback (OAIHttpRequestWorker * worker);
    void listContactsCallback (OAIHttpRequestWorker * worker);
    void listFleetCallback (OAIHttpRequestWorker * worker);
    void patchFleetVehicleCallback (OAIHttpRequestWorker * worker);
    void reactivateDriverByIdCallback (OAIHttpRequestWorker * worker);
    void updateDispatchRouteByIdCallback (OAIHttpRequestWorker * worker);
    void updateOrganizationAddressCallback (OAIHttpRequestWorker * worker);
    void updateVehiclesCallback (OAIHttpRequestWorker * worker);
    
signals:
    void addFleetAddressSignal();
    void addOrganizationAddressesSignal(QList<OAIAddress> summary);
    void createDispatchRouteSignal(OAIDispatchRoute summary);
    void createDriverSignal(OAIDriver summary);
    void createDriverDispatchRouteSignal(OAIDispatchRoute summary);
    void createDriverDocumentSignal(OAIDocument summary);
    void createDvirSignal(OAIDvirBase summary);
    void createVehicleDispatchRouteSignal(OAIDispatchRoute summary);
    void deactivateDriverSignal();
    void deleteDispatchRouteByIdSignal();
    void deleteOrganizationAddressSignal();
    void fetchAllDispatchRoutesSignal(QList<OAIDispatchRoute> summary);
    void fetchAllRouteJobUpdatesSignal(OAIAllRouteJobUpdates summary);
    void getAllAssetCurrentLocationsSignal(OAIInline_response_200_1 summary);
    void getAllAssetsSignal(OAIInline_response_200 summary);
    void getAllDeactivatedDriversSignal(QList<OAIDriver> summary);
    void getAssetLocationSignal(QList<OAIObject> summary);
    void getAssetReeferSignal(OAIAssetReeferResponse summary);
    void getDeactivatedDriverByIdSignal(OAIDriver summary);
    void getDispatchRouteByIdSignal(OAIDispatchRoute summary);
    void getDispatchRouteHistorySignal(OAIDispatchRouteHistory summary);
    void getDispatchRoutesByDriverIdSignal(QList<OAIDispatchRoute> summary);
    void getDispatchRoutesByVehicleIdSignal(QList<OAIDispatchRoute> summary);
    void getDriverByIdSignal(OAIDriver summary);
    void getDriverDocumentTypesByOrgIdSignal(QList<OAIDocumentType> summary);
    void getDriverDocumentsByOrgIdSignal(QList<OAIDocument> summary);
    void getDriverSafetyScoreSignal(OAIDriverSafetyScoreResponse summary);
    void getDvirsSignal(OAIDvirListResponse summary);
    void getFleetDriversSignal(OAIDriversResponse summary);
    void getFleetDriversHosDailyLogsSignal(OAIDriverDailyLogResponse summary);
    void getFleetDriversSummarySignal(OAIDriversSummaryResponse summary);
    void getFleetHosAuthenticationLogsSignal(OAIHosAuthenticationLogsResponse summary);
    void getFleetHosLogsSignal(OAIHosLogsResponse summary);
    void getFleetHosLogsSummarySignal(OAIHosLogsSummaryResponse summary);
    void getFleetLocationsSignal(OAIInline_response_200_3 summary);
    void getFleetMaintenanceListSignal(OAIInline_response_200_4 summary);
    void getFleetTripsSignal(OAITripResponse summary);
    void getFleetVehicleSignal(OAIFleetVehicleResponse summary);
    void getOrganizationAddressSignal(OAIAddress summary);
    void getOrganizationAddressesSignal(QList<OAIAddress> summary);
    void getOrganizationContactSignal(OAIContact summary);
    void getVehicleHarshEventSignal(OAIVehicleHarshEventResponse summary);
    void getVehicleLocationsSignal(QList<OAIFleetVehicleLocation> summary);
    void getVehicleSafetyScoreSignal(OAIVehicleSafetyScoreResponse summary);
    void getVehicleStatsSignal(OAIInline_response_200_5 summary);
    void getVehiclesLocationsSignal(QList<OAIObject> summary);
    void listContactsSignal(QList<OAIContact> summary);
    void listFleetSignal(OAIInline_response_200_2 summary);
    void patchFleetVehicleSignal(OAIFleetVehicleResponse summary);
    void reactivateDriverByIdSignal(OAIDriver summary);
    void updateDispatchRouteByIdSignal(OAIDispatchRoute summary);
    void updateOrganizationAddressSignal();
    void updateVehiclesSignal();
    
    void addFleetAddressSignalFull(OAIHttpRequestWorker* worker);
    void addOrganizationAddressesSignalFull(OAIHttpRequestWorker* worker, QList<OAIAddress> summary);
    void createDispatchRouteSignalFull(OAIHttpRequestWorker* worker, OAIDispatchRoute summary);
    void createDriverSignalFull(OAIHttpRequestWorker* worker, OAIDriver summary);
    void createDriverDispatchRouteSignalFull(OAIHttpRequestWorker* worker, OAIDispatchRoute summary);
    void createDriverDocumentSignalFull(OAIHttpRequestWorker* worker, OAIDocument summary);
    void createDvirSignalFull(OAIHttpRequestWorker* worker, OAIDvirBase summary);
    void createVehicleDispatchRouteSignalFull(OAIHttpRequestWorker* worker, OAIDispatchRoute summary);
    void deactivateDriverSignalFull(OAIHttpRequestWorker* worker);
    void deleteDispatchRouteByIdSignalFull(OAIHttpRequestWorker* worker);
    void deleteOrganizationAddressSignalFull(OAIHttpRequestWorker* worker);
    void fetchAllDispatchRoutesSignalFull(OAIHttpRequestWorker* worker, QList<OAIDispatchRoute> summary);
    void fetchAllRouteJobUpdatesSignalFull(OAIHttpRequestWorker* worker, OAIAllRouteJobUpdates summary);
    void getAllAssetCurrentLocationsSignalFull(OAIHttpRequestWorker* worker, OAIInline_response_200_1 summary);
    void getAllAssetsSignalFull(OAIHttpRequestWorker* worker, OAIInline_response_200 summary);
    void getAllDeactivatedDriversSignalFull(OAIHttpRequestWorker* worker, QList<OAIDriver> summary);
    void getAssetLocationSignalFull(OAIHttpRequestWorker* worker, QList<OAIObject> summary);
    void getAssetReeferSignalFull(OAIHttpRequestWorker* worker, OAIAssetReeferResponse summary);
    void getDeactivatedDriverByIdSignalFull(OAIHttpRequestWorker* worker, OAIDriver summary);
    void getDispatchRouteByIdSignalFull(OAIHttpRequestWorker* worker, OAIDispatchRoute summary);
    void getDispatchRouteHistorySignalFull(OAIHttpRequestWorker* worker, OAIDispatchRouteHistory summary);
    void getDispatchRoutesByDriverIdSignalFull(OAIHttpRequestWorker* worker, QList<OAIDispatchRoute> summary);
    void getDispatchRoutesByVehicleIdSignalFull(OAIHttpRequestWorker* worker, QList<OAIDispatchRoute> summary);
    void getDriverByIdSignalFull(OAIHttpRequestWorker* worker, OAIDriver summary);
    void getDriverDocumentTypesByOrgIdSignalFull(OAIHttpRequestWorker* worker, QList<OAIDocumentType> summary);
    void getDriverDocumentsByOrgIdSignalFull(OAIHttpRequestWorker* worker, QList<OAIDocument> summary);
    void getDriverSafetyScoreSignalFull(OAIHttpRequestWorker* worker, OAIDriverSafetyScoreResponse summary);
    void getDvirsSignalFull(OAIHttpRequestWorker* worker, OAIDvirListResponse summary);
    void getFleetDriversSignalFull(OAIHttpRequestWorker* worker, OAIDriversResponse summary);
    void getFleetDriversHosDailyLogsSignalFull(OAIHttpRequestWorker* worker, OAIDriverDailyLogResponse summary);
    void getFleetDriversSummarySignalFull(OAIHttpRequestWorker* worker, OAIDriversSummaryResponse summary);
    void getFleetHosAuthenticationLogsSignalFull(OAIHttpRequestWorker* worker, OAIHosAuthenticationLogsResponse summary);
    void getFleetHosLogsSignalFull(OAIHttpRequestWorker* worker, OAIHosLogsResponse summary);
    void getFleetHosLogsSummarySignalFull(OAIHttpRequestWorker* worker, OAIHosLogsSummaryResponse summary);
    void getFleetLocationsSignalFull(OAIHttpRequestWorker* worker, OAIInline_response_200_3 summary);
    void getFleetMaintenanceListSignalFull(OAIHttpRequestWorker* worker, OAIInline_response_200_4 summary);
    void getFleetTripsSignalFull(OAIHttpRequestWorker* worker, OAITripResponse summary);
    void getFleetVehicleSignalFull(OAIHttpRequestWorker* worker, OAIFleetVehicleResponse summary);
    void getOrganizationAddressSignalFull(OAIHttpRequestWorker* worker, OAIAddress summary);
    void getOrganizationAddressesSignalFull(OAIHttpRequestWorker* worker, QList<OAIAddress> summary);
    void getOrganizationContactSignalFull(OAIHttpRequestWorker* worker, OAIContact summary);
    void getVehicleHarshEventSignalFull(OAIHttpRequestWorker* worker, OAIVehicleHarshEventResponse summary);
    void getVehicleLocationsSignalFull(OAIHttpRequestWorker* worker, QList<OAIFleetVehicleLocation> summary);
    void getVehicleSafetyScoreSignalFull(OAIHttpRequestWorker* worker, OAIVehicleSafetyScoreResponse summary);
    void getVehicleStatsSignalFull(OAIHttpRequestWorker* worker, OAIInline_response_200_5 summary);
    void getVehiclesLocationsSignalFull(OAIHttpRequestWorker* worker, QList<OAIObject> summary);
    void listContactsSignalFull(OAIHttpRequestWorker* worker, QList<OAIContact> summary);
    void listFleetSignalFull(OAIHttpRequestWorker* worker, OAIInline_response_200_2 summary);
    void patchFleetVehicleSignalFull(OAIHttpRequestWorker* worker, OAIFleetVehicleResponse summary);
    void reactivateDriverByIdSignalFull(OAIHttpRequestWorker* worker, OAIDriver summary);
    void updateDispatchRouteByIdSignalFull(OAIHttpRequestWorker* worker, OAIDispatchRoute summary);
    void updateOrganizationAddressSignalFull(OAIHttpRequestWorker* worker);
    void updateVehiclesSignalFull(OAIHttpRequestWorker* worker);
    
    void addFleetAddressSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void addOrganizationAddressesSignalE(QList<OAIAddress> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDispatchRouteSignalE(OAIDispatchRoute summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverSignalE(OAIDriver summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverDispatchRouteSignalE(OAIDispatchRoute summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverDocumentSignalE(OAIDocument summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDvirSignalE(OAIDvirBase summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void createVehicleDispatchRouteSignalE(OAIDispatchRoute summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void deactivateDriverSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteDispatchRouteByIdSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteOrganizationAddressSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void fetchAllDispatchRoutesSignalE(QList<OAIDispatchRoute> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void fetchAllRouteJobUpdatesSignalE(OAIAllRouteJobUpdates summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllAssetCurrentLocationsSignalE(OAIInline_response_200_1 summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllAssetsSignalE(OAIInline_response_200 summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllDeactivatedDriversSignalE(QList<OAIDriver> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAssetLocationSignalE(QList<OAIObject> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAssetReeferSignalE(OAIAssetReeferResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDeactivatedDriverByIdSignalE(OAIDriver summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRouteByIdSignalE(OAIDispatchRoute summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRouteHistorySignalE(OAIDispatchRouteHistory summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRoutesByDriverIdSignalE(QList<OAIDispatchRoute> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRoutesByVehicleIdSignalE(QList<OAIDispatchRoute> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverByIdSignalE(OAIDriver summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverDocumentTypesByOrgIdSignalE(QList<OAIDocumentType> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverDocumentsByOrgIdSignalE(QList<OAIDocument> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverSafetyScoreSignalE(OAIDriverSafetyScoreResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDvirsSignalE(OAIDvirListResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversSignalE(OAIDriversResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversHosDailyLogsSignalE(OAIDriverDailyLogResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversSummarySignalE(OAIDriversSummaryResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosAuthenticationLogsSignalE(OAIHosAuthenticationLogsResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosLogsSignalE(OAIHosLogsResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosLogsSummarySignalE(OAIHosLogsSummaryResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetLocationsSignalE(OAIInline_response_200_3 summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetMaintenanceListSignalE(OAIInline_response_200_4 summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetTripsSignalE(OAITripResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetVehicleSignalE(OAIFleetVehicleResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationAddressSignalE(OAIAddress summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationAddressesSignalE(QList<OAIAddress> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationContactSignalE(OAIContact summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleHarshEventSignalE(OAIVehicleHarshEventResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleLocationsSignalE(QList<OAIFleetVehicleLocation> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleSafetyScoreSignalE(OAIVehicleSafetyScoreResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleStatsSignalE(OAIInline_response_200_5 summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehiclesLocationsSignalE(QList<OAIObject> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void listContactsSignalE(QList<OAIContact> summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void listFleetSignalE(OAIInline_response_200_2 summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void patchFleetVehicleSignalE(OAIFleetVehicleResponse summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void reactivateDriverByIdSignalE(OAIDriver summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateDispatchRouteByIdSignalE(OAIDispatchRoute summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateOrganizationAddressSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void updateVehiclesSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    
    void addFleetAddressSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void addOrganizationAddressesSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDispatchRouteSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverDispatchRouteSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverDocumentSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDvirSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void createVehicleDispatchRouteSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void deactivateDriverSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteDispatchRouteByIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteOrganizationAddressSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void fetchAllDispatchRoutesSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void fetchAllRouteJobUpdatesSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllAssetCurrentLocationsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllAssetsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllDeactivatedDriversSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAssetLocationSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAssetReeferSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDeactivatedDriverByIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRouteByIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRouteHistorySignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRoutesByDriverIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRoutesByVehicleIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverByIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverDocumentTypesByOrgIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverDocumentsByOrgIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverSafetyScoreSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDvirsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversHosDailyLogsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversSummarySignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosAuthenticationLogsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosLogsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosLogsSummarySignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetLocationsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetMaintenanceListSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetTripsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetVehicleSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationAddressSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationAddressesSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationContactSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleHarshEventSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleLocationsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleSafetyScoreSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleStatsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehiclesLocationsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void listContactsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void listFleetSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void patchFleetVehicleSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void reactivateDriverByIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateDispatchRouteByIdSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateOrganizationAddressSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateVehiclesSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
