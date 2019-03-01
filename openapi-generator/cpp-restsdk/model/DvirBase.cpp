/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.0.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "DvirBase.h"

namespace org {
namespace openapitools {
namespace client {
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
    m_InspectionType = utility::conversions::to_string_t("");
    m_InspectionTypeIsSet = false;
    m_MechanicNotes = utility::conversions::to_string_t("");
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
    m_TrailerName = utility::conversions::to_string_t("");
    m_TrailerNameIsSet = false;
    m_VehicleIsSet = false;
    m_VehicleCondition = utility::conversions::to_string_t("");
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

web::json::value DvirBase::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_AuthorSignatureIsSet)
    {
        val[utility::conversions::to_string_t("authorSignature")] = ModelBase::toJson(m_AuthorSignature);
    }
    if(m_DefectsCorrectedIsSet)
    {
        val[utility::conversions::to_string_t("defectsCorrected")] = ModelBase::toJson(m_DefectsCorrected);
    }
    if(m_DefectsNeedNotBeCorrectedIsSet)
    {
        val[utility::conversions::to_string_t("defectsNeedNotBeCorrected")] = ModelBase::toJson(m_DefectsNeedNotBeCorrected);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_InspectionTypeIsSet)
    {
        val[utility::conversions::to_string_t("inspectionType")] = ModelBase::toJson(m_InspectionType);
    }
    if(m_MechanicNotesIsSet)
    {
        val[utility::conversions::to_string_t("mechanicNotes")] = ModelBase::toJson(m_MechanicNotes);
    }
    if(m_MechanicOrAgentSignatureIsSet)
    {
        val[utility::conversions::to_string_t("mechanicOrAgentSignature")] = ModelBase::toJson(m_MechanicOrAgentSignature);
    }
    if(m_NextDriverSignatureIsSet)
    {
        val[utility::conversions::to_string_t("nextDriverSignature")] = ModelBase::toJson(m_NextDriverSignature);
    }
    if(m_OdometerMilesIsSet)
    {
        val[utility::conversions::to_string_t("odometerMiles")] = ModelBase::toJson(m_OdometerMiles);
    }
    if(m_TimeMsIsSet)
    {
        val[utility::conversions::to_string_t("timeMs")] = ModelBase::toJson(m_TimeMs);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_TrailerDefects )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("trailerDefects")] = web::json::value::array(jsonArray);
        }
    }
    if(m_TrailerIdIsSet)
    {
        val[utility::conversions::to_string_t("trailerId")] = ModelBase::toJson(m_TrailerId);
    }
    if(m_TrailerNameIsSet)
    {
        val[utility::conversions::to_string_t("trailerName")] = ModelBase::toJson(m_TrailerName);
    }
    if(m_VehicleIsSet)
    {
        val[utility::conversions::to_string_t("vehicle")] = ModelBase::toJson(m_Vehicle);
    }
    if(m_VehicleConditionIsSet)
    {
        val[utility::conversions::to_string_t("vehicleCondition")] = ModelBase::toJson(m_VehicleCondition);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_VehicleDefects )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("vehicleDefects")] = web::json::value::array(jsonArray);
        }
    }

    return val;
}

void DvirBase::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("authorSignature")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("authorSignature"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<DvirBase_authorSignature> newItem(new DvirBase_authorSignature());
            newItem->fromJson(fieldValue);
            setAuthorSignature( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("defectsCorrected")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("defectsCorrected"));
        if(!fieldValue.is_null())
        {
            setDefectsCorrected(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("defectsNeedNotBeCorrected")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("defectsNeedNotBeCorrected"));
        if(!fieldValue.is_null())
        {
            setDefectsNeedNotBeCorrected(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("id"));
        if(!fieldValue.is_null())
        {
            setId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("inspectionType")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("inspectionType"));
        if(!fieldValue.is_null())
        {
            setInspectionType(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("mechanicNotes")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("mechanicNotes"));
        if(!fieldValue.is_null())
        {
            setMechanicNotes(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("mechanicOrAgentSignature")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("mechanicOrAgentSignature"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<DvirBase_mechanicOrAgentSignature> newItem(new DvirBase_mechanicOrAgentSignature());
            newItem->fromJson(fieldValue);
            setMechanicOrAgentSignature( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("nextDriverSignature")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("nextDriverSignature"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<DvirBase_nextDriverSignature> newItem(new DvirBase_nextDriverSignature());
            newItem->fromJson(fieldValue);
            setNextDriverSignature( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("odometerMiles")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("odometerMiles"));
        if(!fieldValue.is_null())
        {
            setOdometerMiles(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("timeMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("timeMs"));
        if(!fieldValue.is_null())
        {
            setTimeMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    {
        m_TrailerDefects.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("trailerDefects")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("trailerDefects")).as_array() )
        {
            if(item.is_null())
            {
                m_TrailerDefects.push_back( std::shared_ptr<DvirBase_trailerDefects>(nullptr) );
            }
            else
            {
                std::shared_ptr<DvirBase_trailerDefects> newItem(new DvirBase_trailerDefects());
                newItem->fromJson(item);
                m_TrailerDefects.push_back( newItem );
            }
        }
        }
    }
    if(val.has_field(utility::conversions::to_string_t("trailerId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("trailerId"));
        if(!fieldValue.is_null())
        {
            setTrailerId(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("trailerName")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("trailerName"));
        if(!fieldValue.is_null())
        {
            setTrailerName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("vehicle")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("vehicle"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<DvirBase_vehicle> newItem(new DvirBase_vehicle());
            newItem->fromJson(fieldValue);
            setVehicle( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("vehicleCondition")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("vehicleCondition"));
        if(!fieldValue.is_null())
        {
            setVehicleCondition(ModelBase::stringFromJson(fieldValue));
        }
    }
    {
        m_VehicleDefects.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("vehicleDefects")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("vehicleDefects")).as_array() )
        {
            if(item.is_null())
            {
                m_VehicleDefects.push_back( std::shared_ptr<DvirBase_trailerDefects>(nullptr) );
            }
            else
            {
                std::shared_ptr<DvirBase_trailerDefects> newItem(new DvirBase_trailerDefects());
                newItem->fromJson(item);
                m_VehicleDefects.push_back( newItem );
            }
        }
        }
    }
}

void DvirBase::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_AuthorSignatureIsSet)
    {
        if (m_AuthorSignature.get())
        {
            m_AuthorSignature->toMultipart(multipart, utility::conversions::to_string_t("authorSignature."));
        }
    }
    if(m_DefectsCorrectedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("defectsCorrected"), m_DefectsCorrected));
    }
    if(m_DefectsNeedNotBeCorrectedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("defectsNeedNotBeCorrected"), m_DefectsNeedNotBeCorrected));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_InspectionTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("inspectionType"), m_InspectionType));
    }
    if(m_MechanicNotesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("mechanicNotes"), m_MechanicNotes));
    }
    if(m_MechanicOrAgentSignatureIsSet)
    {
        if (m_MechanicOrAgentSignature.get())
        {
            m_MechanicOrAgentSignature->toMultipart(multipart, utility::conversions::to_string_t("mechanicOrAgentSignature."));
        }
    }
    if(m_NextDriverSignatureIsSet)
    {
        if (m_NextDriverSignature.get())
        {
            m_NextDriverSignature->toMultipart(multipart, utility::conversions::to_string_t("nextDriverSignature."));
        }
    }
    if(m_OdometerMilesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("odometerMiles"), m_OdometerMiles));
    }
    if(m_TimeMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timeMs"), m_TimeMs));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_TrailerDefects )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("trailerDefects"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_TrailerIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("trailerId"), m_TrailerId));
    }
    if(m_TrailerNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("trailerName"), m_TrailerName));
    }
    if(m_VehicleIsSet)
    {
        if (m_Vehicle.get())
        {
            m_Vehicle->toMultipart(multipart, utility::conversions::to_string_t("vehicle."));
        }
    }
    if(m_VehicleConditionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicleCondition"), m_VehicleCondition));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_VehicleDefects )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicleDefects"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
}

void DvirBase::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("authorSignature")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("authorSignature")))
        {
            std::shared_ptr<DvirBase_authorSignature> newItem(new DvirBase_authorSignature());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("authorSignature."));
            setAuthorSignature( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("defectsCorrected")))
    {
        setDefectsCorrected(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("defectsCorrected"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("defectsNeedNotBeCorrected")))
    {
        setDefectsNeedNotBeCorrected(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("defectsNeedNotBeCorrected"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        setId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("inspectionType")))
    {
        setInspectionType(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("inspectionType"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("mechanicNotes")))
    {
        setMechanicNotes(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("mechanicNotes"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("mechanicOrAgentSignature")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("mechanicOrAgentSignature")))
        {
            std::shared_ptr<DvirBase_mechanicOrAgentSignature> newItem(new DvirBase_mechanicOrAgentSignature());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("mechanicOrAgentSignature."));
            setMechanicOrAgentSignature( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("nextDriverSignature")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("nextDriverSignature")))
        {
            std::shared_ptr<DvirBase_nextDriverSignature> newItem(new DvirBase_nextDriverSignature());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("nextDriverSignature."));
            setNextDriverSignature( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("odometerMiles")))
    {
        setOdometerMiles(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("odometerMiles"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("timeMs")))
    {
        setTimeMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("timeMs"))));
    }
    {
        m_TrailerDefects.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("trailerDefects")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("trailerDefects"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_TrailerDefects.push_back( std::shared_ptr<DvirBase_trailerDefects>(nullptr) );
            }
            else
            {
                std::shared_ptr<DvirBase_trailerDefects> newItem(new DvirBase_trailerDefects());
                newItem->fromJson(item);
                m_TrailerDefects.push_back( newItem );
            }
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("trailerId")))
    {
        setTrailerId(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("trailerId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("trailerName")))
    {
        setTrailerName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("trailerName"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("vehicle")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("vehicle")))
        {
            std::shared_ptr<DvirBase_vehicle> newItem(new DvirBase_vehicle());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("vehicle."));
            setVehicle( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("vehicleCondition")))
    {
        setVehicleCondition(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicleCondition"))));
    }
    {
        m_VehicleDefects.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("vehicleDefects")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicleDefects"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_VehicleDefects.push_back( std::shared_ptr<DvirBase_trailerDefects>(nullptr) );
            }
            else
            {
                std::shared_ptr<DvirBase_trailerDefects> newItem(new DvirBase_trailerDefects());
                newItem->fromJson(item);
                m_VehicleDefects.push_back( newItem );
            }
        }
        }
    }
}

std::shared_ptr<DvirBase_authorSignature> DvirBase::getAuthorSignature() const
{
    return m_AuthorSignature;
}

void DvirBase::setAuthorSignature(const std::shared_ptr<DvirBase_authorSignature>& value)
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

void DvirBase::setDefectsCorrected(bool value)
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

void DvirBase::setDefectsNeedNotBeCorrected(bool value)
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

void DvirBase::setId(int64_t value)
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

utility::string_t DvirBase::getInspectionType() const
{
    return m_InspectionType;
}

void DvirBase::setInspectionType(const utility::string_t& value)
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

utility::string_t DvirBase::getMechanicNotes() const
{
    return m_MechanicNotes;
}

void DvirBase::setMechanicNotes(const utility::string_t& value)
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

std::shared_ptr<DvirBase_mechanicOrAgentSignature> DvirBase::getMechanicOrAgentSignature() const
{
    return m_MechanicOrAgentSignature;
}

void DvirBase::setMechanicOrAgentSignature(const std::shared_ptr<DvirBase_mechanicOrAgentSignature>& value)
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

std::shared_ptr<DvirBase_nextDriverSignature> DvirBase::getNextDriverSignature() const
{
    return m_NextDriverSignature;
}

void DvirBase::setNextDriverSignature(const std::shared_ptr<DvirBase_nextDriverSignature>& value)
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

void DvirBase::setOdometerMiles(int64_t value)
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

void DvirBase::setTimeMs(int64_t value)
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

std::vector<std::shared_ptr<DvirBase_trailerDefects>>& DvirBase::getTrailerDefects()
{
    return m_TrailerDefects;
}

void DvirBase::setTrailerDefects(const std::vector<std::shared_ptr<DvirBase_trailerDefects>>& value)
{
    m_TrailerDefects = value;
    m_TrailerDefectsIsSet = true;
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

void DvirBase::setTrailerId(int32_t value)
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

utility::string_t DvirBase::getTrailerName() const
{
    return m_TrailerName;
}

void DvirBase::setTrailerName(const utility::string_t& value)
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

std::shared_ptr<DvirBase_vehicle> DvirBase::getVehicle() const
{
    return m_Vehicle;
}

void DvirBase::setVehicle(const std::shared_ptr<DvirBase_vehicle>& value)
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

utility::string_t DvirBase::getVehicleCondition() const
{
    return m_VehicleCondition;
}

void DvirBase::setVehicleCondition(const utility::string_t& value)
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

std::vector<std::shared_ptr<DvirBase_trailerDefects>>& DvirBase::getVehicleDefects()
{
    return m_VehicleDefects;
}

void DvirBase::setVehicleDefects(const std::vector<std::shared_ptr<DvirBase_trailerDefects>>& value)
{
    m_VehicleDefects = value;
    m_VehicleDefectsIsSet = true;
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

