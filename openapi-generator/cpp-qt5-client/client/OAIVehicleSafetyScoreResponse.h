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

/*
 * OAIVehicleSafetyScoreResponse.h
 *
 * Safety score details for a vehicle
 */

#ifndef OAIVehicleSafetyScoreResponse_H
#define OAIVehicleSafetyScoreResponse_H

#include <QJsonObject>


#include "OAISafetyReportHarshEvent.h"
#include <QList>
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIVehicleSafetyScoreResponse: public OAIObject {
public:
    OAIVehicleSafetyScoreResponse();
    OAIVehicleSafetyScoreResponse(QString json);
    ~OAIVehicleSafetyScoreResponse() override;

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getCrashCount() const;
    void setCrashCount(const qint32 &crash_count);

    qint32 getHarshAccelCount() const;
    void setHarshAccelCount(const qint32 &harsh_accel_count);

    qint32 getHarshBrakingCount() const;
    void setHarshBrakingCount(const qint32 &harsh_braking_count);

    QList<OAISafetyReportHarshEvent> getHarshEvents() const;
    void setHarshEvents(const QList<OAISafetyReportHarshEvent> &harsh_events);

    qint32 getHarshTurningCount() const;
    void setHarshTurningCount(const qint32 &harsh_turning_count);

    qint32 getSafetyScore() const;
    void setSafetyScore(const qint32 &safety_score);

    QString getSafetyScoreRank() const;
    void setSafetyScoreRank(const QString &safety_score_rank);

    qint32 getTimeOverSpeedLimitMs() const;
    void setTimeOverSpeedLimitMs(const qint32 &time_over_speed_limit_ms);

    qint32 getTotalDistanceDrivenMeters() const;
    void setTotalDistanceDrivenMeters(const qint32 &total_distance_driven_meters);

    qint32 getTotalHarshEventCount() const;
    void setTotalHarshEventCount(const qint32 &total_harsh_event_count);

    qint32 getTotalTimeDrivenMs() const;
    void setTotalTimeDrivenMs(const qint32 &total_time_driven_ms);

    qint32 getVehicleId() const;
    void setVehicleId(const qint32 &vehicle_id);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void init();
    qint32 crash_count;
    bool m_crash_count_isSet;
    bool m_crash_count_isValid;
    qint32 harsh_accel_count;
    bool m_harsh_accel_count_isSet;
    bool m_harsh_accel_count_isValid;
    qint32 harsh_braking_count;
    bool m_harsh_braking_count_isSet;
    bool m_harsh_braking_count_isValid;
    QList<OAISafetyReportHarshEvent> harsh_events;
    bool m_harsh_events_isSet;
    bool m_harsh_events_isValid;
    qint32 harsh_turning_count;
    bool m_harsh_turning_count_isSet;
    bool m_harsh_turning_count_isValid;
    qint32 safety_score;
    bool m_safety_score_isSet;
    bool m_safety_score_isValid;
    QString safety_score_rank;
    bool m_safety_score_rank_isSet;
    bool m_safety_score_rank_isValid;
    qint32 time_over_speed_limit_ms;
    bool m_time_over_speed_limit_ms_isSet;
    bool m_time_over_speed_limit_ms_isValid;
    qint32 total_distance_driven_meters;
    bool m_total_distance_driven_meters_isSet;
    bool m_total_distance_driven_meters_isValid;
    qint32 total_harsh_event_count;
    bool m_total_harsh_event_count_isSet;
    bool m_total_harsh_event_count_isValid;
    qint32 total_time_driven_ms;
    bool m_total_time_driven_ms_isSet;
    bool m_total_time_driven_ms_isValid;
    qint32 vehicle_id;
    bool m_vehicle_id_isSet;
    bool m_vehicle_id_isValid;
};

}

#endif // OAIVehicleSafetyScoreResponse_H