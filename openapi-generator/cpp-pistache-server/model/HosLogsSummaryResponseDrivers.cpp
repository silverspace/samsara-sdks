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


#include "HosLogsSummaryResponse_drivers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

HosLogsSummaryResponse_drivers::HosLogsSummaryResponse_drivers()
{
    m_TimeUntilBreak = 0L;
    m_TimeUntilBreakIsSet = false;
    m_VehicleName = "";
    m_VehicleNameIsSet = false;
    m_DrivingInViolationToday = 0L;
    m_DrivingInViolationTodayIsSet = false;
    m_DriverId = 0L;
    m_DriverIdIsSet = false;
    m_CycleRemaining = 0L;
    m_CycleRemainingIsSet = false;
    m_DriverName = "";
    m_DriverNameIsSet = false;
    m_DutyStatus = "";
    m_DutyStatusIsSet = false;
    m_CycleTomorrow = 0L;
    m_CycleTomorrowIsSet = false;
    m_ShiftDriveRemaining = 0L;
    m_ShiftDriveRemainingIsSet = false;
    m_TimeInCurrentStatus = 0L;
    m_TimeInCurrentStatusIsSet = false;
    m_DrivingInViolationCycle = 0L;
    m_DrivingInViolationCycleIsSet = false;
    m_ShiftRemaining = 0L;
    m_ShiftRemainingIsSet = false;
    
}

HosLogsSummaryResponse_drivers::~HosLogsSummaryResponse_drivers()
{
}

void HosLogsSummaryResponse_drivers::validate()
{
    // TODO: implement validation
}

nlohmann::json HosLogsSummaryResponse_drivers::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_TimeUntilBreakIsSet)
    {
        val["timeUntilBreak"] = m_TimeUntilBreak;
    }
    if(m_VehicleNameIsSet)
    {
        val["vehicleName"] = ModelBase::toJson(m_VehicleName);
    }
    if(m_DrivingInViolationTodayIsSet)
    {
        val["drivingInViolationToday"] = m_DrivingInViolationToday;
    }
    if(m_DriverIdIsSet)
    {
        val["driverId"] = m_DriverId;
    }
    if(m_CycleRemainingIsSet)
    {
        val["cycleRemaining"] = m_CycleRemaining;
    }
    if(m_DriverNameIsSet)
    {
        val["driverName"] = ModelBase::toJson(m_DriverName);
    }
    if(m_DutyStatusIsSet)
    {
        val["dutyStatus"] = ModelBase::toJson(m_DutyStatus);
    }
    if(m_CycleTomorrowIsSet)
    {
        val["cycleTomorrow"] = m_CycleTomorrow;
    }
    if(m_ShiftDriveRemainingIsSet)
    {
        val["shiftDriveRemaining"] = m_ShiftDriveRemaining;
    }
    if(m_TimeInCurrentStatusIsSet)
    {
        val["timeInCurrentStatus"] = m_TimeInCurrentStatus;
    }
    if(m_DrivingInViolationCycleIsSet)
    {
        val["drivingInViolationCycle"] = m_DrivingInViolationCycle;
    }
    if(m_ShiftRemainingIsSet)
    {
        val["shiftRemaining"] = m_ShiftRemaining;
    }
    

    return val;
}

void HosLogsSummaryResponse_drivers::fromJson(const nlohmann::json& val)
{
    if(val.find("timeUntilBreak") != val.end())
    {
        setTimeUntilBreak(val.at("timeUntilBreak"));
    }
    if(val.find("vehicleName") != val.end())
    {
        setVehicleName(val.at("vehicleName"));
    }
    if(val.find("drivingInViolationToday") != val.end())
    {
        setDrivingInViolationToday(val.at("drivingInViolationToday"));
    }
    if(val.find("driverId") != val.end())
    {
        setDriverId(val.at("driverId"));
    }
    if(val.find("cycleRemaining") != val.end())
    {
        setCycleRemaining(val.at("cycleRemaining"));
    }
    if(val.find("driverName") != val.end())
    {
        setDriverName(val.at("driverName"));
    }
    if(val.find("dutyStatus") != val.end())
    {
        setDutyStatus(val.at("dutyStatus"));
    }
    if(val.find("cycleTomorrow") != val.end())
    {
        setCycleTomorrow(val.at("cycleTomorrow"));
    }
    if(val.find("shiftDriveRemaining") != val.end())
    {
        setShiftDriveRemaining(val.at("shiftDriveRemaining"));
    }
    if(val.find("timeInCurrentStatus") != val.end())
    {
        setTimeInCurrentStatus(val.at("timeInCurrentStatus"));
    }
    if(val.find("drivingInViolationCycle") != val.end())
    {
        setDrivingInViolationCycle(val.at("drivingInViolationCycle"));
    }
    if(val.find("shiftRemaining") != val.end())
    {
        setShiftRemaining(val.at("shiftRemaining"));
    }
    
}


int64_t HosLogsSummaryResponse_drivers::getTimeUntilBreak() const
{
    return m_TimeUntilBreak;
}
void HosLogsSummaryResponse_drivers::setTimeUntilBreak(int64_t const value)
{
    m_TimeUntilBreak = value;
    m_TimeUntilBreakIsSet = true;
}
bool HosLogsSummaryResponse_drivers::timeUntilBreakIsSet() const
{
    return m_TimeUntilBreakIsSet;
}
void HosLogsSummaryResponse_drivers::unsetTimeUntilBreak()
{
    m_TimeUntilBreakIsSet = false;
}
std::string HosLogsSummaryResponse_drivers::getVehicleName() const
{
    return m_VehicleName;
}
void HosLogsSummaryResponse_drivers::setVehicleName(std::string const& value)
{
    m_VehicleName = value;
    m_VehicleNameIsSet = true;
}
bool HosLogsSummaryResponse_drivers::vehicleNameIsSet() const
{
    return m_VehicleNameIsSet;
}
void HosLogsSummaryResponse_drivers::unsetVehicleName()
{
    m_VehicleNameIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getDrivingInViolationToday() const
{
    return m_DrivingInViolationToday;
}
void HosLogsSummaryResponse_drivers::setDrivingInViolationToday(int64_t const value)
{
    m_DrivingInViolationToday = value;
    m_DrivingInViolationTodayIsSet = true;
}
bool HosLogsSummaryResponse_drivers::drivingInViolationTodayIsSet() const
{
    return m_DrivingInViolationTodayIsSet;
}
void HosLogsSummaryResponse_drivers::unsetDrivingInViolationToday()
{
    m_DrivingInViolationTodayIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getDriverId() const
{
    return m_DriverId;
}
void HosLogsSummaryResponse_drivers::setDriverId(int64_t const value)
{
    m_DriverId = value;
    m_DriverIdIsSet = true;
}
bool HosLogsSummaryResponse_drivers::driverIdIsSet() const
{
    return m_DriverIdIsSet;
}
void HosLogsSummaryResponse_drivers::unsetDriverId()
{
    m_DriverIdIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getCycleRemaining() const
{
    return m_CycleRemaining;
}
void HosLogsSummaryResponse_drivers::setCycleRemaining(int64_t const value)
{
    m_CycleRemaining = value;
    m_CycleRemainingIsSet = true;
}
bool HosLogsSummaryResponse_drivers::cycleRemainingIsSet() const
{
    return m_CycleRemainingIsSet;
}
void HosLogsSummaryResponse_drivers::unsetCycleRemaining()
{
    m_CycleRemainingIsSet = false;
}
std::string HosLogsSummaryResponse_drivers::getDriverName() const
{
    return m_DriverName;
}
void HosLogsSummaryResponse_drivers::setDriverName(std::string const& value)
{
    m_DriverName = value;
    m_DriverNameIsSet = true;
}
bool HosLogsSummaryResponse_drivers::driverNameIsSet() const
{
    return m_DriverNameIsSet;
}
void HosLogsSummaryResponse_drivers::unsetDriverName()
{
    m_DriverNameIsSet = false;
}
std::string HosLogsSummaryResponse_drivers::getDutyStatus() const
{
    return m_DutyStatus;
}
void HosLogsSummaryResponse_drivers::setDutyStatus(std::string const& value)
{
    m_DutyStatus = value;
    m_DutyStatusIsSet = true;
}
bool HosLogsSummaryResponse_drivers::dutyStatusIsSet() const
{
    return m_DutyStatusIsSet;
}
void HosLogsSummaryResponse_drivers::unsetDutyStatus()
{
    m_DutyStatusIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getCycleTomorrow() const
{
    return m_CycleTomorrow;
}
void HosLogsSummaryResponse_drivers::setCycleTomorrow(int64_t const value)
{
    m_CycleTomorrow = value;
    m_CycleTomorrowIsSet = true;
}
bool HosLogsSummaryResponse_drivers::cycleTomorrowIsSet() const
{
    return m_CycleTomorrowIsSet;
}
void HosLogsSummaryResponse_drivers::unsetCycleTomorrow()
{
    m_CycleTomorrowIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getShiftDriveRemaining() const
{
    return m_ShiftDriveRemaining;
}
void HosLogsSummaryResponse_drivers::setShiftDriveRemaining(int64_t const value)
{
    m_ShiftDriveRemaining = value;
    m_ShiftDriveRemainingIsSet = true;
}
bool HosLogsSummaryResponse_drivers::shiftDriveRemainingIsSet() const
{
    return m_ShiftDriveRemainingIsSet;
}
void HosLogsSummaryResponse_drivers::unsetShiftDriveRemaining()
{
    m_ShiftDriveRemainingIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getTimeInCurrentStatus() const
{
    return m_TimeInCurrentStatus;
}
void HosLogsSummaryResponse_drivers::setTimeInCurrentStatus(int64_t const value)
{
    m_TimeInCurrentStatus = value;
    m_TimeInCurrentStatusIsSet = true;
}
bool HosLogsSummaryResponse_drivers::timeInCurrentStatusIsSet() const
{
    return m_TimeInCurrentStatusIsSet;
}
void HosLogsSummaryResponse_drivers::unsetTimeInCurrentStatus()
{
    m_TimeInCurrentStatusIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getDrivingInViolationCycle() const
{
    return m_DrivingInViolationCycle;
}
void HosLogsSummaryResponse_drivers::setDrivingInViolationCycle(int64_t const value)
{
    m_DrivingInViolationCycle = value;
    m_DrivingInViolationCycleIsSet = true;
}
bool HosLogsSummaryResponse_drivers::drivingInViolationCycleIsSet() const
{
    return m_DrivingInViolationCycleIsSet;
}
void HosLogsSummaryResponse_drivers::unsetDrivingInViolationCycle()
{
    m_DrivingInViolationCycleIsSet = false;
}
int64_t HosLogsSummaryResponse_drivers::getShiftRemaining() const
{
    return m_ShiftRemaining;
}
void HosLogsSummaryResponse_drivers::setShiftRemaining(int64_t const value)
{
    m_ShiftRemaining = value;
    m_ShiftRemainingIsSet = true;
}
bool HosLogsSummaryResponse_drivers::shiftRemainingIsSet() const
{
    return m_ShiftRemainingIsSet;
}
void HosLogsSummaryResponse_drivers::unsetShiftRemaining()
{
    m_ShiftRemainingIsSet = false;
}

}
}
}
}

