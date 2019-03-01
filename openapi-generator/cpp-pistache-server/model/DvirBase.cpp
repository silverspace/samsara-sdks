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


#include "DvirBase.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

DvirBase::DvirBase()
{
    m_AuthorSignatureIsSet = false;
    m_DefectsCorrected = false;
    m_DefectsCorrectedIsSet = false;
    m_DefectsNeedNotBeCorrected = false;
    m_DefectsNeedNotBeCorrectedIsSet = false;
    m_Id = 0L;
    m_IdIsSet = false;
    m_InspectionType = "";
    m_InspectionTypeIsSet = false;
    m_MechanicNotes = "";
    m_MechanicNotesIsSet = false;
    m_MechanicOrAgentSignatureIsSet = false;
    m_NextDriverSignatureIsSet = false;
    m_OdometerMiles = 0L;
    m_OdometerMilesIsSet = false;
    m_TimeMs = 0L;
    m_TimeMsIsSet = false;
    m_TrailerDefectsIsSet = false;
    m_TrailerId = 0;
    m_TrailerIdIsSet = false;
    m_TrailerName = "";
    m_TrailerNameIsSet = false;
    m_VehicleIsSet = false;
    m_VehicleCondition = "";
    m_VehicleConditionIsSet = false;
    m_VehicleDefectsIsSet = false;
    
}

DvirBase::~DvirBase()
{
}

void DvirBase::validate()
{
    // TODO: implement validation
}

nlohmann::json DvirBase::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_AuthorSignatureIsSet)
    {
        val["authorSignature"] = ModelBase::toJson(m_AuthorSignature);
    }
    if(m_DefectsCorrectedIsSet)
    {
        val["defectsCorrected"] = m_DefectsCorrected;
    }
    if(m_DefectsNeedNotBeCorrectedIsSet)
    {
        val["defectsNeedNotBeCorrected"] = m_DefectsNeedNotBeCorrected;
    }
    if(m_IdIsSet)
    {
        val["id"] = m_Id;
    }
    if(m_InspectionTypeIsSet)
    {
        val["inspectionType"] = ModelBase::toJson(m_InspectionType);
    }
    if(m_MechanicNotesIsSet)
    {
        val["mechanicNotes"] = ModelBase::toJson(m_MechanicNotes);
    }
    if(m_MechanicOrAgentSignatureIsSet)
    {
        val["mechanicOrAgentSignature"] = ModelBase::toJson(m_MechanicOrAgentSignature);
    }
    if(m_NextDriverSignatureIsSet)
    {
        val["nextDriverSignature"] = ModelBase::toJson(m_NextDriverSignature);
    }
    if(m_OdometerMilesIsSet)
    {
        val["odometerMiles"] = m_OdometerMiles;
    }
    if(m_TimeMsIsSet)
    {
        val["timeMs"] = m_TimeMs;
    }
    {
        nlohmann::json jsonArray;
        for( const auto& item : m_TrailerDefects )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val["trailerDefects"] = jsonArray;
        } 
    }
    if(m_TrailerIdIsSet)
    {
        val["trailerId"] = m_TrailerId;
    }
    if(m_TrailerNameIsSet)
    {
        val["trailerName"] = ModelBase::toJson(m_TrailerName);
    }
    if(m_VehicleIsSet)
    {
        val["vehicle"] = ModelBase::toJson(m_Vehicle);
    }
    if(m_VehicleConditionIsSet)
    {
        val["vehicleCondition"] = ModelBase::toJson(m_VehicleCondition);
    }
    {
        nlohmann::json jsonArray;
        for( const auto& item : m_VehicleDefects )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val["vehicleDefects"] = jsonArray;
        } 
    }
    

    return val;
}

void DvirBase::fromJson(const nlohmann::json& val)
{
    if(val.find("authorSignature") != val.end())
    {
        if(!val["authorSignature"].is_null())
        {
            DvirBase_authorSignature newItem;
            newItem.fromJson(val["authorSignature"]);
            setAuthorSignature( newItem );
        }
        
    }
    if(val.find("defectsCorrected") != val.end())
    {
        setDefectsCorrected(val.at("defectsCorrected"));
    }
    if(val.find("defectsNeedNotBeCorrected") != val.end())
    {
        setDefectsNeedNotBeCorrected(val.at("defectsNeedNotBeCorrected"));
    }
    if(val.find("id") != val.end())
    {
        setId(val.at("id"));
    }
    if(val.find("inspectionType") != val.end())
    {
        setInspectionType(val.at("inspectionType"));
    }
    if(val.find("mechanicNotes") != val.end())
    {
        setMechanicNotes(val.at("mechanicNotes"));
    }
    if(val.find("mechanicOrAgentSignature") != val.end())
    {
        if(!val["mechanicOrAgentSignature"].is_null())
        {
            DvirBase_mechanicOrAgentSignature newItem;
            newItem.fromJson(val["mechanicOrAgentSignature"]);
            setMechanicOrAgentSignature( newItem );
        }
        
    }
    if(val.find("nextDriverSignature") != val.end())
    {
        if(!val["nextDriverSignature"].is_null())
        {
            DvirBase_nextDriverSignature newItem;
            newItem.fromJson(val["nextDriverSignature"]);
            setNextDriverSignature( newItem );
        }
        
    }
    if(val.find("odometerMiles") != val.end())
    {
        setOdometerMiles(val.at("odometerMiles"));
    }
    if(val.find("timeMs") != val.end())
    {
        setTimeMs(val.at("timeMs"));
    }
    {
        m_TrailerDefects.clear();
        if(val.find("trailerDefects") != val.end())
        {
            for( const auto& item : val["trailerDefects"] )
            {
                
                if(item.is_null())
                {
                    m_TrailerDefects.push_back( DvirBase_trailerDefects() );
                }
                else
                {
                    DvirBase_trailerDefects newItem;
                    newItem.fromJson(item);
                    m_TrailerDefects.push_back( newItem );
                }
                
            }
        }
    }
    if(val.find("trailerId") != val.end())
    {
        setTrailerId(val.at("trailerId"));
    }
    if(val.find("trailerName") != val.end())
    {
        setTrailerName(val.at("trailerName"));
    }
    if(val.find("vehicle") != val.end())
    {
        if(!val["vehicle"].is_null())
        {
            DvirBase_vehicle newItem;
            newItem.fromJson(val["vehicle"]);
            setVehicle( newItem );
        }
        
    }
    if(val.find("vehicleCondition") != val.end())
    {
        setVehicleCondition(val.at("vehicleCondition"));
    }
    {
        m_VehicleDefects.clear();
        if(val.find("vehicleDefects") != val.end())
        {
            for( const auto& item : val["vehicleDefects"] )
            {
                
                if(item.is_null())
                {
                    m_VehicleDefects.push_back( DvirBase_trailerDefects() );
                }
                else
                {
                    DvirBase_trailerDefects newItem;
                    newItem.fromJson(item);
                    m_VehicleDefects.push_back( newItem );
                }
                
            }
        }
    }
    
}


DvirBase_authorSignature DvirBase::getAuthorSignature() const
{
    return m_AuthorSignature;
}
void DvirBase::setAuthorSignature(DvirBase_authorSignature const& value)
{
    m_AuthorSignature = value;
    m_AuthorSignatureIsSet = true;
}
bool DvirBase::authorSignatureIsSet() const
{
    return m_AuthorSignatureIsSet;
}
void DvirBase::unsetAuthorSignature()
{
    m_AuthorSignatureIsSet = false;
}
bool DvirBase::isDefectsCorrected() const
{
    return m_DefectsCorrected;
}
void DvirBase::setDefectsCorrected(bool const value)
{
    m_DefectsCorrected = value;
    m_DefectsCorrectedIsSet = true;
}
bool DvirBase::defectsCorrectedIsSet() const
{
    return m_DefectsCorrectedIsSet;
}
void DvirBase::unsetDefectsCorrected()
{
    m_DefectsCorrectedIsSet = false;
}
bool DvirBase::isDefectsNeedNotBeCorrected() const
{
    return m_DefectsNeedNotBeCorrected;
}
void DvirBase::setDefectsNeedNotBeCorrected(bool const value)
{
    m_DefectsNeedNotBeCorrected = value;
    m_DefectsNeedNotBeCorrectedIsSet = true;
}
bool DvirBase::defectsNeedNotBeCorrectedIsSet() const
{
    return m_DefectsNeedNotBeCorrectedIsSet;
}
void DvirBase::unsetDefectsNeedNotBeCorrected()
{
    m_DefectsNeedNotBeCorrectedIsSet = false;
}
int64_t DvirBase::getId() const
{
    return m_Id;
}
void DvirBase::setId(int64_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool DvirBase::idIsSet() const
{
    return m_IdIsSet;
}
void DvirBase::unsetId()
{
    m_IdIsSet = false;
}
std::string DvirBase::getInspectionType() const
{
    return m_InspectionType;
}
void DvirBase::setInspectionType(std::string const& value)
{
    m_InspectionType = value;
    m_InspectionTypeIsSet = true;
}
bool DvirBase::inspectionTypeIsSet() const
{
    return m_InspectionTypeIsSet;
}
void DvirBase::unsetInspectionType()
{
    m_InspectionTypeIsSet = false;
}
std::string DvirBase::getMechanicNotes() const
{
    return m_MechanicNotes;
}
void DvirBase::setMechanicNotes(std::string const& value)
{
    m_MechanicNotes = value;
    m_MechanicNotesIsSet = true;
}
bool DvirBase::mechanicNotesIsSet() const
{
    return m_MechanicNotesIsSet;
}
void DvirBase::unsetMechanicNotes()
{
    m_MechanicNotesIsSet = false;
}
DvirBase_mechanicOrAgentSignature DvirBase::getMechanicOrAgentSignature() const
{
    return m_MechanicOrAgentSignature;
}
void DvirBase::setMechanicOrAgentSignature(DvirBase_mechanicOrAgentSignature const& value)
{
    m_MechanicOrAgentSignature = value;
    m_MechanicOrAgentSignatureIsSet = true;
}
bool DvirBase::mechanicOrAgentSignatureIsSet() const
{
    return m_MechanicOrAgentSignatureIsSet;
}
void DvirBase::unsetMechanicOrAgentSignature()
{
    m_MechanicOrAgentSignatureIsSet = false;
}
DvirBase_nextDriverSignature DvirBase::getNextDriverSignature() const
{
    return m_NextDriverSignature;
}
void DvirBase::setNextDriverSignature(DvirBase_nextDriverSignature const& value)
{
    m_NextDriverSignature = value;
    m_NextDriverSignatureIsSet = true;
}
bool DvirBase::nextDriverSignatureIsSet() const
{
    return m_NextDriverSignatureIsSet;
}
void DvirBase::unsetNextDriverSignature()
{
    m_NextDriverSignatureIsSet = false;
}
int64_t DvirBase::getOdometerMiles() const
{
    return m_OdometerMiles;
}
void DvirBase::setOdometerMiles(int64_t const value)
{
    m_OdometerMiles = value;
    m_OdometerMilesIsSet = true;
}
bool DvirBase::odometerMilesIsSet() const
{
    return m_OdometerMilesIsSet;
}
void DvirBase::unsetOdometerMiles()
{
    m_OdometerMilesIsSet = false;
}
int64_t DvirBase::getTimeMs() const
{
    return m_TimeMs;
}
void DvirBase::setTimeMs(int64_t const value)
{
    m_TimeMs = value;
    m_TimeMsIsSet = true;
}
bool DvirBase::timeMsIsSet() const
{
    return m_TimeMsIsSet;
}
void DvirBase::unsetTimeMs()
{
    m_TimeMsIsSet = false;
}
std::vector<DvirBase_trailerDefects>& DvirBase::getTrailerDefects()
{
    return m_TrailerDefects;
}
bool DvirBase::trailerDefectsIsSet() const
{
    return m_TrailerDefectsIsSet;
}
void DvirBase::unsetTrailerDefects()
{
    m_TrailerDefectsIsSet = false;
}
int32_t DvirBase::getTrailerId() const
{
    return m_TrailerId;
}
void DvirBase::setTrailerId(int32_t const value)
{
    m_TrailerId = value;
    m_TrailerIdIsSet = true;
}
bool DvirBase::trailerIdIsSet() const
{
    return m_TrailerIdIsSet;
}
void DvirBase::unsetTrailerId()
{
    m_TrailerIdIsSet = false;
}
std::string DvirBase::getTrailerName() const
{
    return m_TrailerName;
}
void DvirBase::setTrailerName(std::string const& value)
{
    m_TrailerName = value;
    m_TrailerNameIsSet = true;
}
bool DvirBase::trailerNameIsSet() const
{
    return m_TrailerNameIsSet;
}
void DvirBase::unsetTrailerName()
{
    m_TrailerNameIsSet = false;
}
DvirBase_vehicle DvirBase::getVehicle() const
{
    return m_Vehicle;
}
void DvirBase::setVehicle(DvirBase_vehicle const& value)
{
    m_Vehicle = value;
    m_VehicleIsSet = true;
}
bool DvirBase::vehicleIsSet() const
{
    return m_VehicleIsSet;
}
void DvirBase::unsetVehicle()
{
    m_VehicleIsSet = false;
}
std::string DvirBase::getVehicleCondition() const
{
    return m_VehicleCondition;
}
void DvirBase::setVehicleCondition(std::string const& value)
{
    m_VehicleCondition = value;
    m_VehicleConditionIsSet = true;
}
bool DvirBase::vehicleConditionIsSet() const
{
    return m_VehicleConditionIsSet;
}
void DvirBase::unsetVehicleCondition()
{
    m_VehicleConditionIsSet = false;
}
std::vector<DvirBase_trailerDefects>& DvirBase::getVehicleDefects()
{
    return m_VehicleDefects;
}
bool DvirBase::vehicleDefectsIsSet() const
{
    return m_VehicleDefectsIsSet;
}
void DvirBase::unsetVehicleDefects()
{
    m_VehicleDefectsIsSet = false;
}

}
}
}
}

