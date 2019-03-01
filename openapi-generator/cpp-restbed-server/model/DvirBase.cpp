/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.0.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "DvirBase.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

DvirBase::DvirBase()
{
    m_DefectsCorrected = false;
    m_DefectsNeedNotBeCorrected = false;
    m_Id = 0L;
    m_InspectionType = "";
    m_MechanicNotes = "";
    m_OdometerMiles = 0L;
    m_TimeMs = 0L;
    m_TrailerId = 0;
    m_TrailerName = "";
    m_VehicleCondition = "";
    
}

DvirBase::~DvirBase()
{
}

std::string DvirBase::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("DefectsCorrected", m_DefectsCorrected);
	pt.put("DefectsNeedNotBeCorrected", m_DefectsNeedNotBeCorrected);
	pt.put("Id", m_Id);
	pt.put("InspectionType", m_InspectionType);
	pt.put("MechanicNotes", m_MechanicNotes);
	pt.put("OdometerMiles", m_OdometerMiles);
	pt.put("TimeMs", m_TimeMs);
	pt.put("TrailerId", m_TrailerId);
	pt.put("TrailerName", m_TrailerName);
	pt.put("VehicleCondition", m_VehicleCondition);
	write_json(ss, pt, false);
	return ss.str();
}

void DvirBase::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_DefectsCorrected = pt.get("DefectsCorrected", false);
	m_DefectsNeedNotBeCorrected = pt.get("DefectsNeedNotBeCorrected", false);
	m_Id = pt.get("Id", 0L);
	m_InspectionType = pt.get("InspectionType", "");
	m_MechanicNotes = pt.get("MechanicNotes", "");
	m_OdometerMiles = pt.get("OdometerMiles", 0L);
	m_TimeMs = pt.get("TimeMs", 0L);
	m_TrailerId = pt.get("TrailerId", 0);
	m_TrailerName = pt.get("TrailerName", "");
	m_VehicleCondition = pt.get("VehicleCondition", "");
}

std::shared_ptr<DvirBase_authorSignature> DvirBase::getAuthorSignature() const
{
    return m_AuthorSignature;
}
void DvirBase::setAuthorSignature(std::shared_ptr<DvirBase_authorSignature> value)
{
    m_AuthorSignature = value;
}
bool DvirBase::isDefectsCorrected() const
{
    return m_DefectsCorrected;
}
void DvirBase::setDefectsCorrected(bool value)
{
    m_DefectsCorrected = value;
}
bool DvirBase::isDefectsNeedNotBeCorrected() const
{
    return m_DefectsNeedNotBeCorrected;
}
void DvirBase::setDefectsNeedNotBeCorrected(bool value)
{
    m_DefectsNeedNotBeCorrected = value;
}
int64_t DvirBase::getId() const
{
    return m_Id;
}
void DvirBase::setId(int64_t value)
{
    m_Id = value;
}
std::string DvirBase::getInspectionType() const
{
    return m_InspectionType;
}
void DvirBase::setInspectionType(std::string value)
{
    m_InspectionType = value;
}
std::string DvirBase::getMechanicNotes() const
{
    return m_MechanicNotes;
}
void DvirBase::setMechanicNotes(std::string value)
{
    m_MechanicNotes = value;
}
std::shared_ptr<DvirBase_mechanicOrAgentSignature> DvirBase::getMechanicOrAgentSignature() const
{
    return m_MechanicOrAgentSignature;
}
void DvirBase::setMechanicOrAgentSignature(std::shared_ptr<DvirBase_mechanicOrAgentSignature> value)
{
    m_MechanicOrAgentSignature = value;
}
std::shared_ptr<DvirBase_nextDriverSignature> DvirBase::getNextDriverSignature() const
{
    return m_NextDriverSignature;
}
void DvirBase::setNextDriverSignature(std::shared_ptr<DvirBase_nextDriverSignature> value)
{
    m_NextDriverSignature = value;
}
int64_t DvirBase::getOdometerMiles() const
{
    return m_OdometerMiles;
}
void DvirBase::setOdometerMiles(int64_t value)
{
    m_OdometerMiles = value;
}
int64_t DvirBase::getTimeMs() const
{
    return m_TimeMs;
}
void DvirBase::setTimeMs(int64_t value)
{
    m_TimeMs = value;
}
std::vector<std::shared_ptr<DvirBase_trailerDefects>> DvirBase::getTrailerDefects() const
{
    return m_TrailerDefects;
}
void DvirBase::setTrailerDefects(std::vector<std::shared_ptr<DvirBase_trailerDefects>> value)
{
    m_TrailerDefects = value;
}
int32_t DvirBase::getTrailerId() const
{
    return m_TrailerId;
}
void DvirBase::setTrailerId(int32_t value)
{
    m_TrailerId = value;
}
std::string DvirBase::getTrailerName() const
{
    return m_TrailerName;
}
void DvirBase::setTrailerName(std::string value)
{
    m_TrailerName = value;
}
std::shared_ptr<DvirBase_vehicle> DvirBase::getVehicle() const
{
    return m_Vehicle;
}
void DvirBase::setVehicle(std::shared_ptr<DvirBase_vehicle> value)
{
    m_Vehicle = value;
}
std::string DvirBase::getVehicleCondition() const
{
    return m_VehicleCondition;
}
void DvirBase::setVehicleCondition(std::string value)
{
    m_VehicleCondition = value;
}
std::vector<std::shared_ptr<DvirBase_trailerDefects>> DvirBase::getVehicleDefects() const
{
    return m_VehicleDefects;
}
void DvirBase::setVehicleDefects(std::vector<std::shared_ptr<DvirBase_trailerDefects>> value)
{
    m_VehicleDefects = value;
}

}
}
}
}

