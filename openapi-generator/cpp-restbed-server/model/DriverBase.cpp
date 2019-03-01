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



#include "DriverBase.h"

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

DriverBase::DriverBase()
{
    m_EldAdverseWeatherExemptionEnabled = false;
    m_EldBigDayExemptionEnabled = false;
    m_EldDayStartHour = 0;
    m_EldExempt = false;
    m_EldExemptReason = "";
    m_EldPcEnabled = false;
    m_EldYmEnabled = false;
    m_GroupId = 0L;
    m_LicenseNumber = "";
    m_LicenseState = "";
    m_Name = "";
    m_Notes = "";
    m_Phone = "";
    m_Username = "";
    m_VehicleId = 0L;
    
}

DriverBase::~DriverBase()
{
}

std::string DriverBase::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("EldAdverseWeatherExemptionEnabled", m_EldAdverseWeatherExemptionEnabled);
	pt.put("EldBigDayExemptionEnabled", m_EldBigDayExemptionEnabled);
	pt.put("EldDayStartHour", m_EldDayStartHour);
	pt.put("EldExempt", m_EldExempt);
	pt.put("EldExemptReason", m_EldExemptReason);
	pt.put("EldPcEnabled", m_EldPcEnabled);
	pt.put("EldYmEnabled", m_EldYmEnabled);
	pt.put("GroupId", m_GroupId);
	pt.put("LicenseNumber", m_LicenseNumber);
	pt.put("LicenseState", m_LicenseState);
	pt.put("Name", m_Name);
	pt.put("Notes", m_Notes);
	pt.put("Phone", m_Phone);
	pt.put("Username", m_Username);
	pt.put("VehicleId", m_VehicleId);
	write_json(ss, pt, false);
	return ss.str();
}

void DriverBase::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_EldAdverseWeatherExemptionEnabled = pt.get("EldAdverseWeatherExemptionEnabled", false);
	m_EldBigDayExemptionEnabled = pt.get("EldBigDayExemptionEnabled", false);
	m_EldDayStartHour = pt.get("EldDayStartHour", 0);
	m_EldExempt = pt.get("EldExempt", false);
	m_EldExemptReason = pt.get("EldExemptReason", "");
	m_EldPcEnabled = pt.get("EldPcEnabled", false);
	m_EldYmEnabled = pt.get("EldYmEnabled", false);
	m_GroupId = pt.get("GroupId", 0L);
	m_LicenseNumber = pt.get("LicenseNumber", "");
	m_LicenseState = pt.get("LicenseState", "");
	m_Name = pt.get("Name", "");
	m_Notes = pt.get("Notes", "");
	m_Phone = pt.get("Phone", "");
	m_Username = pt.get("Username", "");
	m_VehicleId = pt.get("VehicleId", 0L);
}

bool DriverBase::isEldAdverseWeatherExemptionEnabled() const
{
    return m_EldAdverseWeatherExemptionEnabled;
}
void DriverBase::setEldAdverseWeatherExemptionEnabled(bool value)
{
    m_EldAdverseWeatherExemptionEnabled = value;
}
bool DriverBase::isEldBigDayExemptionEnabled() const
{
    return m_EldBigDayExemptionEnabled;
}
void DriverBase::setEldBigDayExemptionEnabled(bool value)
{
    m_EldBigDayExemptionEnabled = value;
}
int32_t DriverBase::getEldDayStartHour() const
{
    return m_EldDayStartHour;
}
void DriverBase::setEldDayStartHour(int32_t value)
{
    m_EldDayStartHour = value;
}
bool DriverBase::isEldExempt() const
{
    return m_EldExempt;
}
void DriverBase::setEldExempt(bool value)
{
    m_EldExempt = value;
}
std::string DriverBase::getEldExemptReason() const
{
    return m_EldExemptReason;
}
void DriverBase::setEldExemptReason(std::string value)
{
    m_EldExemptReason = value;
}
bool DriverBase::isEldPcEnabled() const
{
    return m_EldPcEnabled;
}
void DriverBase::setEldPcEnabled(bool value)
{
    m_EldPcEnabled = value;
}
bool DriverBase::isEldYmEnabled() const
{
    return m_EldYmEnabled;
}
void DriverBase::setEldYmEnabled(bool value)
{
    m_EldYmEnabled = value;
}
std::map<std::string, std::string> DriverBase::getExternalIds() const
{
    return m_ExternalIds;
}
void DriverBase::setExternalIds(std::map<std::string, std::string> value)
{
    m_ExternalIds = value;
}
int64_t DriverBase::getGroupId() const
{
    return m_GroupId;
}
void DriverBase::setGroupId(int64_t value)
{
    m_GroupId = value;
}
std::string DriverBase::getLicenseNumber() const
{
    return m_LicenseNumber;
}
void DriverBase::setLicenseNumber(std::string value)
{
    m_LicenseNumber = value;
}
std::string DriverBase::getLicenseState() const
{
    return m_LicenseState;
}
void DriverBase::setLicenseState(std::string value)
{
    m_LicenseState = value;
}
std::string DriverBase::getName() const
{
    return m_Name;
}
void DriverBase::setName(std::string value)
{
    m_Name = value;
}
std::string DriverBase::getNotes() const
{
    return m_Notes;
}
void DriverBase::setNotes(std::string value)
{
    m_Notes = value;
}
std::string DriverBase::getPhone() const
{
    return m_Phone;
}
void DriverBase::setPhone(std::string value)
{
    m_Phone = value;
}
std::string DriverBase::getUsername() const
{
    return m_Username;
}
void DriverBase::setUsername(std::string value)
{
    m_Username = value;
}
int64_t DriverBase::getVehicleId() const
{
    return m_VehicleId;
}
void DriverBase::setVehicleId(int64_t value)
{
    m_VehicleId = value;
}

}
}
}
}

