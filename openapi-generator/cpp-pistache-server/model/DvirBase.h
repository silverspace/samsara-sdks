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
 * DvirBase.h
 *
 * 
 */

#ifndef DvirBase_H_
#define DvirBase_H_


#include "ModelBase.h"

#include "DvirBase_authorSignature.h"
#include "DvirBase_vehicle.h"
#include "DvirBase_mechanicOrAgentSignature.h"
#include <string>
#include "DvirBase_nextDriverSignature.h"
#include <vector>
#include "DvirBase_trailerDefects.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  DvirBase
    : public ModelBase
{
public:
    DvirBase();
    virtual ~DvirBase();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// DvirBase members

    /// <summary>
    /// 
    /// </summary>
    DvirBase_authorSignature getAuthorSignature() const;
    void setAuthorSignature(DvirBase_authorSignature const& value);
    bool authorSignatureIsSet() const;
    void unsetAuthorSignature();
    /// <summary>
    /// Signifies if the defects on the vehicle corrected after the DVIR is done.
    /// </summary>
    bool isDefectsCorrected() const;
    void setDefectsCorrected(bool const value);
    bool defectsCorrectedIsSet() const;
    void unsetDefectsCorrected();
    /// <summary>
    /// Signifies if the defects on this vehicle can be ignored.
    /// </summary>
    bool isDefectsNeedNotBeCorrected() const;
    void setDefectsNeedNotBeCorrected(bool const value);
    bool defectsNeedNotBeCorrectedIsSet() const;
    void unsetDefectsNeedNotBeCorrected();
    /// <summary>
    /// The id of this DVIR record.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t const value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Inspection type of the DVIR.
    /// </summary>
    std::string getInspectionType() const;
    void setInspectionType(std::string const& value);
    bool inspectionTypeIsSet() const;
    void unsetInspectionType();
    /// <summary>
    /// The mechanics notes on the DVIR.
    /// </summary>
    std::string getMechanicNotes() const;
    void setMechanicNotes(std::string const& value);
    bool mechanicNotesIsSet() const;
    void unsetMechanicNotes();
    /// <summary>
    /// 
    /// </summary>
    DvirBase_mechanicOrAgentSignature getMechanicOrAgentSignature() const;
    void setMechanicOrAgentSignature(DvirBase_mechanicOrAgentSignature const& value);
    bool mechanicOrAgentSignatureIsSet() const;
    void unsetMechanicOrAgentSignature();
    /// <summary>
    /// 
    /// </summary>
    DvirBase_nextDriverSignature getNextDriverSignature() const;
    void setNextDriverSignature(DvirBase_nextDriverSignature const& value);
    bool nextDriverSignatureIsSet() const;
    void unsetNextDriverSignature();
    /// <summary>
    /// The odometer reading in miles for the vehicle when the DVIR was done.
    /// </summary>
    int64_t getOdometerMiles() const;
    void setOdometerMiles(int64_t const value);
    bool odometerMilesIsSet() const;
    void unsetOdometerMiles();
    /// <summary>
    /// Timestamp of this DVIR in UNIX milliseconds.
    /// </summary>
    int64_t getTimeMs() const;
    void setTimeMs(int64_t const value);
    bool timeMsIsSet() const;
    void unsetTimeMs();
    /// <summary>
    /// Defects registered for the trailer which was part of the DVIR.
    /// </summary>
    std::vector<DvirBase_trailerDefects>& getTrailerDefects();
    bool trailerDefectsIsSet() const;
    void unsetTrailerDefects();
    /// <summary>
    /// The id of the trailer which was part of the DVIR.
    /// </summary>
    int32_t getTrailerId() const;
    void setTrailerId(int32_t const value);
    bool trailerIdIsSet() const;
    void unsetTrailerId();
    /// <summary>
    /// The name of the trailer which was part of the DVIR.
    /// </summary>
    std::string getTrailerName() const;
    void setTrailerName(std::string const& value);
    bool trailerNameIsSet() const;
    void unsetTrailerName();
    /// <summary>
    /// 
    /// </summary>
    DvirBase_vehicle getVehicle() const;
    void setVehicle(DvirBase_vehicle const& value);
    bool vehicleIsSet() const;
    void unsetVehicle();
    /// <summary>
    /// The condition of vechile on which DVIR was done.
    /// </summary>
    std::string getVehicleCondition() const;
    void setVehicleCondition(std::string const& value);
    bool vehicleConditionIsSet() const;
    void unsetVehicleCondition();
    /// <summary>
    /// Defects registered for the vehicle which was part of the DVIR.
    /// </summary>
    std::vector<DvirBase_trailerDefects>& getVehicleDefects();
    bool vehicleDefectsIsSet() const;
    void unsetVehicleDefects();

protected:
    DvirBase_authorSignature m_AuthorSignature;
    bool m_AuthorSignatureIsSet;
    bool m_DefectsCorrected;
    bool m_DefectsCorrectedIsSet;
    bool m_DefectsNeedNotBeCorrected;
    bool m_DefectsNeedNotBeCorrectedIsSet;
    int64_t m_Id;
    bool m_IdIsSet;
    std::string m_InspectionType;
    bool m_InspectionTypeIsSet;
    std::string m_MechanicNotes;
    bool m_MechanicNotesIsSet;
    DvirBase_mechanicOrAgentSignature m_MechanicOrAgentSignature;
    bool m_MechanicOrAgentSignatureIsSet;
    DvirBase_nextDriverSignature m_NextDriverSignature;
    bool m_NextDriverSignatureIsSet;
    int64_t m_OdometerMiles;
    bool m_OdometerMilesIsSet;
    int64_t m_TimeMs;
    bool m_TimeMsIsSet;
    std::vector<DvirBase_trailerDefects> m_TrailerDefects;
    bool m_TrailerDefectsIsSet;
    int32_t m_TrailerId;
    bool m_TrailerIdIsSet;
    std::string m_TrailerName;
    bool m_TrailerNameIsSet;
    DvirBase_vehicle m_Vehicle;
    bool m_VehicleIsSet;
    std::string m_VehicleCondition;
    bool m_VehicleConditionIsSet;
    std::vector<DvirBase_trailerDefects> m_VehicleDefects;
    bool m_VehicleDefectsIsSet;
};

}
}
}
}

#endif /* DvirBase_H_ */
