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

#ifndef OAI_OAIFleetApiRequest_H
#define OAI_OAIFleetApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
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
#include "OAIFleetApiHandler.h"

namespace OpenAPI {

class OAIFleetApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIFleetApiRequest(QHttpEngine::Socket *s, OAIFleetApiHandler* handler);
    virtual ~OAIFleetApiRequest();

    void addFleetAddressRequest();
    void addOrganizationAddressesRequest();
    void createDispatchRouteRequest();
    void createDriverRequest();
    void createDriverDispatchRouteRequest(const QString& driver_id);
    void createDriverDocumentRequest(const QString& driver_id);
    void createDvirRequest();
    void createVehicleDispatchRouteRequest(const QString& vehicle_id);
    void deactivateDriverRequest(const QString& driver_id_or_external_id);
    void deleteDispatchRouteByIdRequest(const QString& route_id);
    void deleteOrganizationAddressRequest(const QString& address_id);
    void fetchAllDispatchRoutesRequest();
    void fetchAllRouteJobUpdatesRequest();
    void getAllAssetCurrentLocationsRequest();
    void getAllAssetsRequest();
    void getAllDeactivatedDriversRequest();
    void getAssetLocationRequest(const QString& asset_id);
    void getAssetReeferRequest(const QString& asset_id);
    void getDeactivatedDriverByIdRequest(const QString& driver_id_or_external_id);
    void getDispatchRouteByIdRequest(const QString& route_id);
    void getDispatchRouteHistoryRequest(const QString& route_id);
    void getDispatchRoutesByDriverIdRequest(const QString& driver_id);
    void getDispatchRoutesByVehicleIdRequest(const QString& vehicle_id);
    void getDriverByIdRequest(const QString& driver_id_or_external_id);
    void getDriverDocumentTypesByOrgIdRequest();
    void getDriverDocumentsByOrgIdRequest();
    void getDriverSafetyScoreRequest(const QString& driver_id);
    void getDvirsRequest();
    void getFleetDriversRequest();
    void getFleetDriversHosDailyLogsRequest(const QString& driver_id);
    void getFleetDriversSummaryRequest();
    void getFleetHosAuthenticationLogsRequest();
    void getFleetHosLogsRequest();
    void getFleetHosLogsSummaryRequest();
    void getFleetLocationsRequest();
    void getFleetMaintenanceListRequest();
    void getFleetTripsRequest();
    void getFleetVehicleRequest(const QString& vehicle_id_or_external_id);
    void getOrganizationAddressRequest(const QString& address_id);
    void getOrganizationAddressesRequest();
    void getOrganizationContactRequest(const QString& contact_id);
    void getVehicleHarshEventRequest(const QString& vehicle_id);
    void getVehicleLocationsRequest(const QString& vehicle_id);
    void getVehicleSafetyScoreRequest(const QString& vehicle_id);
    void getVehicleStatsRequest();
    void getVehiclesLocationsRequest();
    void listContactsRequest();
    void listFleetRequest();
    void patchFleetVehicleRequest(const QString& vehicle_id_or_external_id);
    void reactivateDriverByIdRequest(const QString& driver_id_or_external_id);
    void updateDispatchRouteByIdRequest(const QString& route_id);
    void updateOrganizationAddressRequest(const QString& address_id);
    void updateVehiclesRequest();
    

    void addFleetAddressResponse();
    void addOrganizationAddressesResponse(const QList<OAIAddress>& res);
    void createDispatchRouteResponse(const OAIDispatchRoute& res);
    void createDriverResponse(const OAIDriver& res);
    void createDriverDispatchRouteResponse(const OAIDispatchRoute& res);
    void createDriverDocumentResponse(const OAIDocument& res);
    void createDvirResponse(const OAIDvirBase& res);
    void createVehicleDispatchRouteResponse(const OAIDispatchRoute& res);
    void deactivateDriverResponse();
    void deleteDispatchRouteByIdResponse();
    void deleteOrganizationAddressResponse();
    void fetchAllDispatchRoutesResponse(const QList<OAIDispatchRoute>& res);
    void fetchAllRouteJobUpdatesResponse(const OAIAllRouteJobUpdates& res);
    void getAllAssetCurrentLocationsResponse(const OAIInline_response_200_1& res);
    void getAllAssetsResponse(const OAIInline_response_200& res);
    void getAllDeactivatedDriversResponse(const QList<OAIDriver>& res);
    void getAssetLocationResponse(const QList<OAIObject>& res);
    void getAssetReeferResponse(const OAIAssetReeferResponse& res);
    void getDeactivatedDriverByIdResponse(const OAIDriver& res);
    void getDispatchRouteByIdResponse(const OAIDispatchRoute& res);
    void getDispatchRouteHistoryResponse(const OAIDispatchRouteHistory& res);
    void getDispatchRoutesByDriverIdResponse(const QList<OAIDispatchRoute>& res);
    void getDispatchRoutesByVehicleIdResponse(const QList<OAIDispatchRoute>& res);
    void getDriverByIdResponse(const OAIDriver& res);
    void getDriverDocumentTypesByOrgIdResponse(const QList<OAIDocumentType>& res);
    void getDriverDocumentsByOrgIdResponse(const QList<OAIDocument>& res);
    void getDriverSafetyScoreResponse(const OAIDriverSafetyScoreResponse& res);
    void getDvirsResponse(const OAIDvirListResponse& res);
    void getFleetDriversResponse(const OAIDriversResponse& res);
    void getFleetDriversHosDailyLogsResponse(const OAIDriverDailyLogResponse& res);
    void getFleetDriversSummaryResponse(const OAIDriversSummaryResponse& res);
    void getFleetHosAuthenticationLogsResponse(const OAIHosAuthenticationLogsResponse& res);
    void getFleetHosLogsResponse(const OAIHosLogsResponse& res);
    void getFleetHosLogsSummaryResponse(const OAIHosLogsSummaryResponse& res);
    void getFleetLocationsResponse(const OAIInline_response_200_3& res);
    void getFleetMaintenanceListResponse(const OAIInline_response_200_4& res);
    void getFleetTripsResponse(const OAITripResponse& res);
    void getFleetVehicleResponse(const OAIFleetVehicleResponse& res);
    void getOrganizationAddressResponse(const OAIAddress& res);
    void getOrganizationAddressesResponse(const QList<OAIAddress>& res);
    void getOrganizationContactResponse(const OAIContact& res);
    void getVehicleHarshEventResponse(const OAIVehicleHarshEventResponse& res);
    void getVehicleLocationsResponse(const QList<OAIFleetVehicleLocation>& res);
    void getVehicleSafetyScoreResponse(const OAIVehicleSafetyScoreResponse& res);
    void getVehicleStatsResponse(const OAIInline_response_200_5& res);
    void getVehiclesLocationsResponse(const QList<OAIObject>& res);
    void listContactsResponse(const QList<OAIContact>& res);
    void listFleetResponse(const OAIInline_response_200_2& res);
    void patchFleetVehicleResponse(const OAIFleetVehicleResponse& res);
    void reactivateDriverByIdResponse(const OAIDriver& res);
    void updateDispatchRouteByIdResponse(const OAIDispatchRoute& res);
    void updateOrganizationAddressResponse();
    void updateVehiclesResponse();
    

    void addFleetAddressError(QNetworkReply::NetworkError error_type, QString& error_str);
    void addOrganizationAddressesError(const QList<OAIAddress>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDispatchRouteError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverDispatchRouteError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDriverDocumentError(const OAIDocument& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createDvirError(const OAIDvirBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createVehicleDispatchRouteError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void deactivateDriverError(QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteDispatchRouteByIdError(QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteOrganizationAddressError(QNetworkReply::NetworkError error_type, QString& error_str);
    void fetchAllDispatchRoutesError(const QList<OAIDispatchRoute>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void fetchAllRouteJobUpdatesError(const OAIAllRouteJobUpdates& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllAssetCurrentLocationsError(const OAIInline_response_200_1& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllAssetsError(const OAIInline_response_200& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAllDeactivatedDriversError(const QList<OAIDriver>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAssetLocationError(const QList<OAIObject>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getAssetReeferError(const OAIAssetReeferResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDeactivatedDriverByIdError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRouteByIdError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRouteHistoryError(const OAIDispatchRouteHistory& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRoutesByDriverIdError(const QList<OAIDispatchRoute>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDispatchRoutesByVehicleIdError(const QList<OAIDispatchRoute>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverByIdError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverDocumentTypesByOrgIdError(const QList<OAIDocumentType>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverDocumentsByOrgIdError(const QList<OAIDocument>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDriverSafetyScoreError(const OAIDriverSafetyScoreResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getDvirsError(const OAIDvirListResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversError(const OAIDriversResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversHosDailyLogsError(const OAIDriverDailyLogResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetDriversSummaryError(const OAIDriversSummaryResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosAuthenticationLogsError(const OAIHosAuthenticationLogsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosLogsError(const OAIHosLogsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetHosLogsSummaryError(const OAIHosLogsSummaryResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetLocationsError(const OAIInline_response_200_3& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetMaintenanceListError(const OAIInline_response_200_4& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetTripsError(const OAITripResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getFleetVehicleError(const OAIFleetVehicleResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationAddressError(const OAIAddress& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationAddressesError(const QList<OAIAddress>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOrganizationContactError(const OAIContact& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleHarshEventError(const OAIVehicleHarshEventResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleLocationsError(const QList<OAIFleetVehicleLocation>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleSafetyScoreError(const OAIVehicleSafetyScoreResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehicleStatsError(const OAIInline_response_200_5& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getVehiclesLocationsError(const QList<OAIObject>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void listContactsError(const QList<OAIContact>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void listFleetError(const OAIInline_response_200_2& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void patchFleetVehicleError(const OAIFleetVehicleResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void reactivateDriverByIdError(const OAIDriver& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateDispatchRouteByIdError(const OAIDispatchRoute& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateOrganizationAddressError(QNetworkReply::NetworkError error_type, QString& error_str);
    void updateVehiclesError(QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void addFleetAddress(QString access_token, OAIInline_object_2 address_param);
    void addOrganizationAddresses(QString access_token, OAIInline_object addresses);
    void createDispatchRoute(QString access_token, OAIDispatchRouteCreate create_dispatch_route_params);
    void createDriver(QString access_token, OAIDriverForCreate create_driver_param);
    void createDriverDispatchRoute(QString access_token, qint64 driver_id, OAIDispatchRouteCreate create_dispatch_route_params);
    void createDriverDocument(QString access_token, qint64 driver_id, OAIDocumentCreate create_document_params);
    void createDvir(QString access_token, OAIInline_object_12 create_dvir_param);
    void createVehicleDispatchRoute(QString access_token, qint64 vehicle_id, OAIDispatchRouteCreate create_dispatch_route_params);
    void deactivateDriver(QString access_token, QString driver_id_or_external_id);
    void deleteDispatchRouteById(QString access_token, qint64 route_id);
    void deleteOrganizationAddress(QString access_token, qint64 address_id);
    void fetchAllDispatchRoutes(QString access_token, qint64 group_id, qint64 end_time, qint64 duration);
    void fetchAllRouteJobUpdates(QString access_token, qint64 group_id, QString sequence_id, QString include);
    void getAllAssetCurrentLocations(QString access_token, qint64 group_id);
    void getAllAssets(QString access_token, qint64 group_id);
    void getAllDeactivatedDrivers(QString access_token, qint64 group_id);
    void getAssetLocation(QString access_token, qint64 asset_id, qint64 start_ms, qint64 end_ms);
    void getAssetReefer(QString access_token, qint64 asset_id, qint64 start_ms, qint64 end_ms);
    void getDeactivatedDriverById(QString access_token, QString driver_id_or_external_id);
    void getDispatchRouteById(QString access_token, qint64 route_id);
    void getDispatchRouteHistory(QString access_token, qint64 route_id, qint64 start_time, qint64 end_time);
    void getDispatchRoutesByDriverId(QString access_token, qint64 driver_id, qint64 end_time, qint64 duration);
    void getDispatchRoutesByVehicleId(QString access_token, qint64 vehicle_id, qint64 end_time, qint64 duration);
    void getDriverById(QString access_token, QString driver_id_or_external_id);
    void getDriverDocumentTypesByOrgId();
    void getDriverDocumentsByOrgId(QString access_token, qint64 end_ms, qint64 duration_ms);
    void getDriverSafetyScore(qint64 driver_id, QString access_token, qint64 start_ms, qint64 end_ms);
    void getDvirs(QString access_token, qint32 end_ms, qint32 duration_ms, qint32 group_id);
    void getFleetDrivers(QString access_token, OAIInline_object_3 group_drivers_param);
    void getFleetDriversHosDailyLogs(QString access_token, qint64 driver_id, OAIInline_object_6 hos_logs_param);
    void getFleetDriversSummary(QString access_token, OAIInline_object_5 drivers_summary_param, bool snap_to_day_bounds);
    void getFleetHosAuthenticationLogs(QString access_token, OAIInline_object_7 hos_authentication_logs_param);
    void getFleetHosLogs(QString access_token, OAIInline_object_8 hos_logs_param);
    void getFleetHosLogsSummary(QString access_token, OAIInline_object_9 hos_logs_param);
    void getFleetLocations(QString access_token, OAIInline_object_11 group_param);
    void getFleetMaintenanceList(QString access_token, OAIInline_object_13 group_param);
    void getFleetTrips(QString access_token, OAIInline_object_15 trips_param);
    void getFleetVehicle(QString access_token, QString vehicle_id_or_external_id);
    void getOrganizationAddress(QString access_token, qint64 address_id);
    void getOrganizationAddresses(QString access_token);
    void getOrganizationContact(QString access_token, qint64 contact_id);
    void getVehicleHarshEvent(qint64 vehicle_id, QString access_token, qint64 timestamp);
    void getVehicleLocations(QString access_token, qint64 vehicle_id, qint64 start_ms, qint64 end_ms);
    void getVehicleSafetyScore(qint64 vehicle_id, QString access_token, qint64 start_ms, qint64 end_ms);
    void getVehicleStats(QString access_token, qint32 start_ms, qint32 end_ms, QString series, QString tag_ids, QString starting_after, QString ending_before, qint64 limit);
    void getVehiclesLocations(QString access_token, qint32 start_ms, qint32 end_ms);
    void listContacts(QString access_token);
    void listFleet(QString access_token, OAIInline_object_10 group_param, QString starting_after, QString ending_before, qint64 limit);
    void patchFleetVehicle(QString access_token, QString vehicle_id_or_external_id, OAIInline_object_16 data);
    void reactivateDriverById(QString access_token, QString driver_id_or_external_id, OAIInline_object_4 reactivate_driver_param);
    void updateDispatchRouteById(QString access_token, qint64 route_id, OAIDispatchRoute update_dispatch_route_params);
    void updateOrganizationAddress(QString access_token, qint64 address_id, OAIInline_object_1 address);
    void updateVehicles(QString access_token, OAIInline_object_14 vehicle_update_param);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    OAIFleetApiHandler *handler;

    inline void writeResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
        socket->writeHeaders();
    }
};

}

#endif // OAI_OAIFleetApiRequest_H
