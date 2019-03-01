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



#include "HosLogsSummaryResponse_drivers.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

HosLogsSummaryResponse_drivers::HosLogsSummaryResponse_drivers()
{
    m_TimeUntilBreak = 0L;
    m_TimeUntilBreakIsSet = false;
    m_VehicleName = utility::conversions::to_string_t("");
    m_VehicleNameIsSet = false;
    m_DrivingInViolationToday = 0L;
    m_DrivingInViolationTodayIsSet = false;
    m_DriverId = 0L;
    m_DriverIdIsSet = false;
    m_CycleRemaining = 0L;
    m_CycleRemainingIsSet = false;
    m_DriverName = utility::conversions::to_string_t("");
    m_DriverNameIsSet = false;
    m_DutyStatus = utility::conversions::to_string_t("");
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

web::json::value HosLogsSummaryResponse_drivers::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_TimeUntilBreakIsSet)
    {
        val[utility::conversions::to_string_t("timeUntilBreak")] = ModelBase::toJson(m_TimeUntilBreak);
    }
    if(m_VehicleNameIsSet)
    {
        val[utility::conversions::to_string_t("vehicleName")] = ModelBase::toJson(m_VehicleName);
    }
    if(m_DrivingInViolationTodayIsSet)
    {
        val[utility::conversions::to_string_t("drivingInViolationToday")] = ModelBase::toJson(m_DrivingInViolationToday);
    }
    if(m_DriverIdIsSet)
    {
        val[utility::conversions::to_string_t("driverId")] = ModelBase::toJson(m_DriverId);
    }
    if(m_CycleRemainingIsSet)
    {
        val[utility::conversions::to_string_t("cycleRemaining")] = ModelBase::toJson(m_CycleRemaining);
    }
    if(m_DriverNameIsSet)
    {
        val[utility::conversions::to_string_t("driverName")] = ModelBase::toJson(m_DriverName);
    }
    if(m_DutyStatusIsSet)
    {
        val[utility::conversions::to_string_t("dutyStatus")] = ModelBase::toJson(m_DutyStatus);
    }
    if(m_CycleTomorrowIsSet)
    {
        val[utility::conversions::to_string_t("cycleTomorrow")] = ModelBase::toJson(m_CycleTomorrow);
    }
    if(m_ShiftDriveRemainingIsSet)
    {
        val[utility::conversions::to_string_t("shiftDriveRemaining")] = ModelBase::toJson(m_ShiftDriveRemaining);
    }
    if(m_TimeInCurrentStatusIsSet)
    {
        val[utility::conversions::to_string_t("timeInCurrentStatus")] = ModelBase::toJson(m_TimeInCurrentStatus);
    }
    if(m_DrivingInViolationCycleIsSet)
    {
        val[utility::conversions::to_string_t("drivingInViolationCycle")] = ModelBase::toJson(m_DrivingInViolationCycle);
    }
    if(m_ShiftRemainingIsSet)
    {
        val[utility::conversions::to_string_t("shiftRemaining")] = ModelBase::toJson(m_ShiftRemaining);
    }

    return val;
}

void HosLogsSummaryResponse_drivers::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("timeUntilBreak")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("timeUntilBreak"));
        if(!fieldValue.is_null())
        {
            setTimeUntilBreak(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("vehicleName")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("vehicleName"));
        if(!fieldValue.is_null())
        {
            setVehicleName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("drivingInViolationToday")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("drivingInViolationToday"));
        if(!fieldValue.is_null())
        {
            setDrivingInViolationToday(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driverId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driverId"));
        if(!fieldValue.is_null())
        {
            setDriverId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cycleRemaining")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("cycleRemaining"));
        if(!fieldValue.is_null())
        {
            setCycleRemaining(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driverName")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driverName"));
        if(!fieldValue.is_null())
        {
            setDriverName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("dutyStatus")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("dutyStatus"));
        if(!fieldValue.is_null())
        {
            setDutyStatus(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("cycleTomorrow")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("cycleTomorrow"));
        if(!fieldValue.is_null())
        {
            setCycleTomorrow(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("shiftDriveRemaining")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("shiftDriveRemaining"));
        if(!fieldValue.is_null())
        {
            setShiftDriveRemaining(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("timeInCurrentStatus")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("timeInCurrentStatus"));
        if(!fieldValue.is_null())
        {
            setTimeInCurrentStatus(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("drivingInViolationCycle")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("drivingInViolationCycle"));
        if(!fieldValue.is_null())
        {
            setDrivingInViolationCycle(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("shiftRemaining")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("shiftRemaining"));
        if(!fieldValue.is_null())
        {
            setShiftRemaining(ModelBase::int64_tFromJson(fieldValue));
        }
    }
}

void HosLogsSummaryResponse_drivers::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_TimeUntilBreakIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timeUntilBreak"), m_TimeUntilBreak));
    }
    if(m_VehicleNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicleName"), m_VehicleName));
    }
    if(m_DrivingInViolationTodayIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("drivingInViolationToday"), m_DrivingInViolationToday));
    }
    if(m_DriverIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driverId"), m_DriverId));
    }
    if(m_CycleRemainingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("cycleRemaining"), m_CycleRemaining));
    }
    if(m_DriverNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driverName"), m_DriverName));
    }
    if(m_DutyStatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("dutyStatus"), m_DutyStatus));
    }
    if(m_CycleTomorrowIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("cycleTomorrow"), m_CycleTomorrow));
    }
    if(m_ShiftDriveRemainingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("shiftDriveRemaining"), m_ShiftDriveRemaining));
    }
    if(m_TimeInCurrentStatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timeInCurrentStatus"), m_TimeInCurrentStatus));
    }
    if(m_DrivingInViolationCycleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("drivingInViolationCycle"), m_DrivingInViolationCycle));
    }
    if(m_ShiftRemainingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("shiftRemaining"), m_ShiftRemaining));
    }
}

void HosLogsSummaryResponse_drivers::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("timeUntilBreak")))
    {
        setTimeUntilBreak(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("timeUntilBreak"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("vehicleName")))
    {
        setVehicleName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicleName"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("drivingInViolationToday")))
    {
        setDrivingInViolationToday(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("drivingInViolationToday"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driverId")))
    {
        setDriverId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driverId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cycleRemaining")))
    {
        setCycleRemaining(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("cycleRemaining"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driverName")))
    {
        setDriverName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driverName"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("dutyStatus")))
    {
        setDutyStatus(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("dutyStatus"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("cycleTomorrow")))
    {
        setCycleTomorrow(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("cycleTomorrow"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("shiftDriveRemaining")))
    {
        setShiftDriveRemaining(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("shiftDriveRemaining"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("timeInCurrentStatus")))
    {
        setTimeInCurrentStatus(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("timeInCurrentStatus"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("drivingInViolationCycle")))
    {
        setDrivingInViolationCycle(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("drivingInViolationCycle"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("shiftRemaining")))
    {
        setShiftRemaining(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("shiftRemaining"))));
    }
}

int64_t HosLogsSummaryResponse_drivers::getTimeUntilBreak() const
{
    return m_TimeUntilBreak;
}

void HosLogsSummaryResponse_drivers::setTimeUntilBreak(int64_t value)
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

utility::string_t HosLogsSummaryResponse_drivers::getVehicleName() const
{
    return m_VehicleName;
}

void HosLogsSummaryResponse_drivers::setVehicleName(const utility::string_t& value)
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

void HosLogsSummaryResponse_drivers::setDrivingInViolationToday(int64_t value)
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

void HosLogsSummaryResponse_drivers::setDriverId(int64_t value)
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

void HosLogsSummaryResponse_drivers::setCycleRemaining(int64_t value)
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

utility::string_t HosLogsSummaryResponse_drivers::getDriverName() const
{
    return m_DriverName;
}

void HosLogsSummaryResponse_drivers::setDriverName(const utility::string_t& value)
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

utility::string_t HosLogsSummaryResponse_drivers::getDutyStatus() const
{
    return m_DutyStatus;
}

void HosLogsSummaryResponse_drivers::setDutyStatus(const utility::string_t& value)
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

void HosLogsSummaryResponse_drivers::setCycleTomorrow(int64_t value)
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

void HosLogsSummaryResponse_drivers::setShiftDriveRemaining(int64_t value)
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

void HosLogsSummaryResponse_drivers::setTimeInCurrentStatus(int64_t value)
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

void HosLogsSummaryResponse_drivers::setDrivingInViolationCycle(int64_t value)
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

void HosLogsSummaryResponse_drivers::setShiftRemaining(int64_t value)
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

