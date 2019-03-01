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
 * OAIDvirBase.h
 *
 * 
 */

#ifndef OAIDvirBase_H
#define OAIDvirBase_H

#include <QJsonObject>


#include "OAIDvirBase_authorSignature.h"
#include "OAIDvirBase_mechanicOrAgentSignature.h"
#include "OAIDvirBase_nextDriverSignature.h"
#include "OAIDvirBase_trailerDefects.h"
#include "OAIDvirBase_vehicle.h"
#include <QList>
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIDvirBase: public OAIObject {
public:
    OAIDvirBase();
    OAIDvirBase(QString json);
    ~OAIDvirBase() override;

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIDvirBase_authorSignature getAuthorSignature() const;
    void setAuthorSignature(const OAIDvirBase_authorSignature &author_signature);

    bool isDefectsCorrected() const;
    void setDefectsCorrected(const bool &defects_corrected);

    bool isDefectsNeedNotBeCorrected() const;
    void setDefectsNeedNotBeCorrected(const bool &defects_need_not_be_corrected);

    qint64 getId() const;
    void setId(const qint64 &id);

    QString getInspectionType() const;
    void setInspectionType(const QString &inspection_type);

    QString getMechanicNotes() const;
    void setMechanicNotes(const QString &mechanic_notes);

    OAIDvirBase_mechanicOrAgentSignature getMechanicOrAgentSignature() const;
    void setMechanicOrAgentSignature(const OAIDvirBase_mechanicOrAgentSignature &mechanic_or_agent_signature);

    OAIDvirBase_nextDriverSignature getNextDriverSignature() const;
    void setNextDriverSignature(const OAIDvirBase_nextDriverSignature &next_driver_signature);

    qint64 getOdometerMiles() const;
    void setOdometerMiles(const qint64 &odometer_miles);

    qint64 getTimeMs() const;
    void setTimeMs(const qint64 &time_ms);

    QList<OAIDvirBase_trailerDefects> getTrailerDefects() const;
    void setTrailerDefects(const QList<OAIDvirBase_trailerDefects> &trailer_defects);

    qint32 getTrailerId() const;
    void setTrailerId(const qint32 &trailer_id);

    QString getTrailerName() const;
    void setTrailerName(const QString &trailer_name);

    OAIDvirBase_vehicle getVehicle() const;
    void setVehicle(const OAIDvirBase_vehicle &vehicle);

    QString getVehicleCondition() const;
    void setVehicleCondition(const QString &vehicle_condition);

    QList<OAIDvirBase_trailerDefects> getVehicleDefects() const;
    void setVehicleDefects(const QList<OAIDvirBase_trailerDefects> &vehicle_defects);

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void init();
    OAIDvirBase_authorSignature author_signature;
    bool m_author_signature_isSet;
    bool m_author_signature_isValid;
    bool defects_corrected;
    bool m_defects_corrected_isSet;
    bool m_defects_corrected_isValid;
    bool defects_need_not_be_corrected;
    bool m_defects_need_not_be_corrected_isSet;
    bool m_defects_need_not_be_corrected_isValid;
    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;
    QString inspection_type;
    bool m_inspection_type_isSet;
    bool m_inspection_type_isValid;
    QString mechanic_notes;
    bool m_mechanic_notes_isSet;
    bool m_mechanic_notes_isValid;
    OAIDvirBase_mechanicOrAgentSignature mechanic_or_agent_signature;
    bool m_mechanic_or_agent_signature_isSet;
    bool m_mechanic_or_agent_signature_isValid;
    OAIDvirBase_nextDriverSignature next_driver_signature;
    bool m_next_driver_signature_isSet;
    bool m_next_driver_signature_isValid;
    qint64 odometer_miles;
    bool m_odometer_miles_isSet;
    bool m_odometer_miles_isValid;
    qint64 time_ms;
    bool m_time_ms_isSet;
    bool m_time_ms_isValid;
    QList<OAIDvirBase_trailerDefects> trailer_defects;
    bool m_trailer_defects_isSet;
    bool m_trailer_defects_isValid;
    qint32 trailer_id;
    bool m_trailer_id_isSet;
    bool m_trailer_id_isValid;
    QString trailer_name;
    bool m_trailer_name_isSet;
    bool m_trailer_name_isValid;
    OAIDvirBase_vehicle vehicle;
    bool m_vehicle_isSet;
    bool m_vehicle_isValid;
    QString vehicle_condition;
    bool m_vehicle_condition_isSet;
    bool m_vehicle_condition_isValid;
    QList<OAIDvirBase_trailerDefects> vehicle_defects;
    bool m_vehicle_defects_isSet;
    bool m_vehicle_defects_isValid;
};

}

#endif // OAIDvirBase_H
