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


#include "DriverForCreate.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

DriverForCreate::DriverForCreate()
{
    m_EldAdverseWeatherExemptionEnabled = false;
    m_EldAdverseWeatherExemptionEnabledIsSet = false;
    m_EldBigDayExemptionEnabled = false;
    m_EldBigDayExemptionEnabledIsSet = false;
    m_EldDayStartHour = 0;
    m_EldDayStartHourIsSet = false;
    m_EldExempt = false;
    m_EldExemptIsSet = false;
    m_EldExemptReason = "";
    m_EldExemptReasonIsSet = false;
    m_EldPcEnabled = false;
    m_EldPcEnabledIsSet = false;
    m_EldYmEnabled = false;
    m_EldYmEnabledIsSet = false;
    m_ExternalIdsIsSet = false;
    m_GroupId = 0L;
    m_GroupIdIsSet = false;
    m_LicenseNumber = "";
    m_LicenseNumberIsSet = false;
    m_LicenseState = "";
    m_LicenseStateIsSet = false;
    m_Name = "";
    m_Notes = "";
    m_NotesIsSet = false;
    m_Phone = "";
    m_PhoneIsSet = false;
    m_Username = "";
    m_UsernameIsSet = false;
    m_VehicleId = 0L;
    m_VehicleIdIsSet = false;
    m_Password = "";
    m_TagIdsIsSet = false;
    
}

DriverForCreate::~DriverForCreate()
{
}

void DriverForCreate::validate()
{
    // TODO: implement validation
}

nlohmann::json DriverForCreate::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_EldAdverseWeatherExemptionEnabledIsSet)
    {
        val["eldAdverseWeatherExemptionEnabled"] = m_EldAdverseWeatherExemptionEnabled;
    }
    if(m_EldBigDayExemptionEnabledIsSet)
    {
        val["eldBigDayExemptionEnabled"] = m_EldBigDayExemptionEnabled;
    }
    if(m_EldDayStartHourIsSet)
    {
        val["eldDayStartHour"] = m_EldDayStartHour;
    }
    if(m_EldExemptIsSet)
    {
        val["eldExempt"] = m_EldExempt;
    }
    if(m_EldExemptReasonIsSet)
    {
        val["eldExemptReason"] = ModelBase::toJson(m_EldExemptReason);
    }
    if(m_EldPcEnabledIsSet)
    {
        val["eldPcEnabled"] = m_EldPcEnabled;
    }
    if(m_EldYmEnabledIsSet)
    {
        val["eldYmEnabled"] = m_EldYmEnabled;
    }
    {
        nlohmann::json jsonObj;
        for( const auto& item : m_ExternalIds )
        {    
            jsonObj[item.first] = ModelBase::toJson(item.second);   
        }
        
        if(jsonObj.size() > 0)
        {
            val["externalIds"] = jsonObj;
        } 
    }
    if(m_GroupIdIsSet)
    {
        val["groupId"] = m_GroupId;
    }
    if(m_LicenseNumberIsSet)
    {
        val["licenseNumber"] = ModelBase::toJson(m_LicenseNumber);
    }
    if(m_LicenseStateIsSet)
    {
        val["licenseState"] = ModelBase::toJson(m_LicenseState);
    }
    val["name"] = ModelBase::toJson(m_Name);
    if(m_NotesIsSet)
    {
        val["notes"] = ModelBase::toJson(m_Notes);
    }
    if(m_PhoneIsSet)
    {
        val["phone"] = ModelBase::toJson(m_Phone);
    }
    if(m_UsernameIsSet)
    {
        val["username"] = ModelBase::toJson(m_Username);
    }
    if(m_VehicleIdIsSet)
    {
        val["vehicleId"] = m_VehicleId;
    }
    val["password"] = ModelBase::toJson(m_Password);
    {
        nlohmann::json jsonArray;
        for( const auto& item : m_TagIds )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val["tagIds"] = jsonArray;
        } 
    }
    

    return val;
}

void DriverForCreate::fromJson(const nlohmann::json& val)
{
    if(val.find("eldAdverseWeatherExemptionEnabled") != val.end())
    {
        setEldAdverseWeatherExemptionEnabled(val.at("eldAdverseWeatherExemptionEnabled"));
    }
    if(val.find("eldBigDayExemptionEnabled") != val.end())
    {
        setEldBigDayExemptionEnabled(val.at("eldBigDayExemptionEnabled"));
    }
    if(val.find("eldDayStartHour") != val.end())
    {
        setEldDayStartHour(val.at("eldDayStartHour"));
    }
    if(val.find("eldExempt") != val.end())
    {
        setEldExempt(val.at("eldExempt"));
    }
    if(val.find("eldExemptReason") != val.end())
    {
        setEldExemptReason(val.at("eldExemptReason"));
    }
    if(val.find("eldPcEnabled") != val.end())
    {
        setEldPcEnabled(val.at("eldPcEnabled"));
    }
    if(val.find("eldYmEnabled") != val.end())
    {
        setEldYmEnabled(val.at("eldYmEnabled"));
    }
    {
        m_ExternalIds.clear();
        if(val.find("externalIds") != val.end())
        {
            if(val["externalIds"].is_object()) { 
                m_ExternalIds = MapHelper::fromJson<std::string>(val["externalIds"]);
                 
            }
        }
    }
    if(val.find("groupId") != val.end())
    {
        setGroupId(val.at("groupId"));
    }
    if(val.find("licenseNumber") != val.end())
    {
        setLicenseNumber(val.at("licenseNumber"));
    }
    if(val.find("licenseState") != val.end())
    {
        setLicenseState(val.at("licenseState"));
    }
    setName(val.at("name"));
    if(val.find("notes") != val.end())
    {
        setNotes(val.at("notes"));
    }
    if(val.find("phone") != val.end())
    {
        setPhone(val.at("phone"));
    }
    if(val.find("username") != val.end())
    {
        setUsername(val.at("username"));
    }
    if(val.find("vehicleId") != val.end())
    {
        setVehicleId(val.at("vehicleId"));
    }
    setPassword(val.at("password"));
    {
        m_TagIds.clear();
        if(val.find("tagIds") != val.end())
        {
            for( const auto& item : val["tagIds"] )
            {
                m_TagIds.push_back(item);
                
            }
        }
    }
    
}


bool DriverForCreate::isEldAdverseWeatherExemptionEnabled() const
{
    return m_EldAdverseWeatherExemptionEnabled;
}
void DriverForCreate::setEldAdverseWeatherExemptionEnabled(bool const value)
{
    m_EldAdverseWeatherExemptionEnabled = value;
    m_EldAdverseWeatherExemptionEnabledIsSet = true;
}
bool DriverForCreate::eldAdverseWeatherExemptionEnabledIsSet() const
{
    return m_EldAdverseWeatherExemptionEnabledIsSet;
}
void DriverForCreate::unsetEldAdverseWeatherExemptionEnabled()
{
    m_EldAdverseWeatherExemptionEnabledIsSet = false;
}
bool DriverForCreate::isEldBigDayExemptionEnabled() const
{
    return m_EldBigDayExemptionEnabled;
}
void DriverForCreate::setEldBigDayExemptionEnabled(bool const value)
{
    m_EldBigDayExemptionEnabled = value;
    m_EldBigDayExemptionEnabledIsSet = true;
}
bool DriverForCreate::eldBigDayExemptionEnabledIsSet() const
{
    return m_EldBigDayExemptionEnabledIsSet;
}
void DriverForCreate::unsetEldBigDayExemptionEnabled()
{
    m_EldBigDayExemptionEnabledIsSet = false;
}
int32_t DriverForCreate::getEldDayStartHour() const
{
    return m_EldDayStartHour;
}
void DriverForCreate::setEldDayStartHour(int32_t const value)
{
    m_EldDayStartHour = value;
    m_EldDayStartHourIsSet = true;
}
bool DriverForCreate::eldDayStartHourIsSet() const
{
    return m_EldDayStartHourIsSet;
}
void DriverForCreate::unsetEldDayStartHour()
{
    m_EldDayStartHourIsSet = false;
}
bool DriverForCreate::isEldExempt() const
{
    return m_EldExempt;
}
void DriverForCreate::setEldExempt(bool const value)
{
    m_EldExempt = value;
    m_EldExemptIsSet = true;
}
bool DriverForCreate::eldExemptIsSet() const
{
    return m_EldExemptIsSet;
}
void DriverForCreate::unsetEldExempt()
{
    m_EldExemptIsSet = false;
}
std::string DriverForCreate::getEldExemptReason() const
{
    return m_EldExemptReason;
}
void DriverForCreate::setEldExemptReason(std::string const& value)
{
    m_EldExemptReason = value;
    m_EldExemptReasonIsSet = true;
}
bool DriverForCreate::eldExemptReasonIsSet() const
{
    return m_EldExemptReasonIsSet;
}
void DriverForCreate::unsetEldExemptReason()
{
    m_EldExemptReasonIsSet = false;
}
bool DriverForCreate::isEldPcEnabled() const
{
    return m_EldPcEnabled;
}
void DriverForCreate::setEldPcEnabled(bool const value)
{
    m_EldPcEnabled = value;
    m_EldPcEnabledIsSet = true;
}
bool DriverForCreate::eldPcEnabledIsSet() const
{
    return m_EldPcEnabledIsSet;
}
void DriverForCreate::unsetEldPcEnabled()
{
    m_EldPcEnabledIsSet = false;
}
bool DriverForCreate::isEldYmEnabled() const
{
    return m_EldYmEnabled;
}
void DriverForCreate::setEldYmEnabled(bool const value)
{
    m_EldYmEnabled = value;
    m_EldYmEnabledIsSet = true;
}
bool DriverForCreate::eldYmEnabledIsSet() const
{
    return m_EldYmEnabledIsSet;
}
void DriverForCreate::unsetEldYmEnabled()
{
    m_EldYmEnabledIsSet = false;
}
std::map<std::string, std::string>& DriverForCreate::getExternalIds()
{
    return m_ExternalIds;
}
bool DriverForCreate::externalIdsIsSet() const
{
    return m_ExternalIdsIsSet;
}
void DriverForCreate::unsetExternalIds()
{
    m_ExternalIdsIsSet = false;
}
int64_t DriverForCreate::getGroupId() const
{
    return m_GroupId;
}
void DriverForCreate::setGroupId(int64_t const value)
{
    m_GroupId = value;
    m_GroupIdIsSet = true;
}
bool DriverForCreate::groupIdIsSet() const
{
    return m_GroupIdIsSet;
}
void DriverForCreate::unsetGroupId()
{
    m_GroupIdIsSet = false;
}
std::string DriverForCreate::getLicenseNumber() const
{
    return m_LicenseNumber;
}
void DriverForCreate::setLicenseNumber(std::string const& value)
{
    m_LicenseNumber = value;
    m_LicenseNumberIsSet = true;
}
bool DriverForCreate::licenseNumberIsSet() const
{
    return m_LicenseNumberIsSet;
}
void DriverForCreate::unsetLicenseNumber()
{
    m_LicenseNumberIsSet = false;
}
std::string DriverForCreate::getLicenseState() const
{
    return m_LicenseState;
}
void DriverForCreate::setLicenseState(std::string const& value)
{
    m_LicenseState = value;
    m_LicenseStateIsSet = true;
}
bool DriverForCreate::licenseStateIsSet() const
{
    return m_LicenseStateIsSet;
}
void DriverForCreate::unsetLicenseState()
{
    m_LicenseStateIsSet = false;
}
std::string DriverForCreate::getName() const
{
    return m_Name;
}
void DriverForCreate::setName(std::string const& value)
{
    m_Name = value;
    
}
std::string DriverForCreate::getNotes() const
{
    return m_Notes;
}
void DriverForCreate::setNotes(std::string const& value)
{
    m_Notes = value;
    m_NotesIsSet = true;
}
bool DriverForCreate::notesIsSet() const
{
    return m_NotesIsSet;
}
void DriverForCreate::unsetNotes()
{
    m_NotesIsSet = false;
}
std::string DriverForCreate::getPhone() const
{
    return m_Phone;
}
void DriverForCreate::setPhone(std::string const& value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}
bool DriverForCreate::phoneIsSet() const
{
    return m_PhoneIsSet;
}
void DriverForCreate::unsetPhone()
{
    m_PhoneIsSet = false;
}
std::string DriverForCreate::getUsername() const
{
    return m_Username;
}
void DriverForCreate::setUsername(std::string const& value)
{
    m_Username = value;
    m_UsernameIsSet = true;
}
bool DriverForCreate::usernameIsSet() const
{
    return m_UsernameIsSet;
}
void DriverForCreate::unsetUsername()
{
    m_UsernameIsSet = false;
}
int64_t DriverForCreate::getVehicleId() const
{
    return m_VehicleId;
}
void DriverForCreate::setVehicleId(int64_t const value)
{
    m_VehicleId = value;
    m_VehicleIdIsSet = true;
}
bool DriverForCreate::vehicleIdIsSet() const
{
    return m_VehicleIdIsSet;
}
void DriverForCreate::unsetVehicleId()
{
    m_VehicleIdIsSet = false;
}
std::string DriverForCreate::getPassword() const
{
    return m_Password;
}
void DriverForCreate::setPassword(std::string const& value)
{
    m_Password = value;
    
}
std::vector<int64_t>& DriverForCreate::getTagIds()
{
    return m_TagIds;
}
bool DriverForCreate::tagIdsIsSet() const
{
    return m_TagIdsIsSet;
}
void DriverForCreate::unsetTagIds()
{
    m_TagIdsIsSet = false;
}

}
}
}
}

