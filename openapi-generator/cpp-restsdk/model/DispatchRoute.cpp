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



#include "DispatchRoute.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

DispatchRoute::DispatchRoute()
{
    m_Actual_end_ms = 0L;
    m_Actual_end_msIsSet = false;
    m_Actual_start_ms = 0L;
    m_Actual_start_msIsSet = false;
    m_Driver_id = 0L;
    m_Driver_idIsSet = false;
    m_Group_id = 0L;
    m_Group_idIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_Scheduled_end_ms = 0L;
    m_Scheduled_meters = 0L;
    m_Scheduled_metersIsSet = false;
    m_Scheduled_start_ms = 0L;
    m_Start_location_address = utility::conversions::to_string_t("");
    m_Start_location_addressIsSet = false;
    m_Start_location_address_id = 0L;
    m_Start_location_address_idIsSet = false;
    m_Start_location_lat = 0.0;
    m_Start_location_latIsSet = false;
    m_Start_location_lng = 0.0;
    m_Start_location_lngIsSet = false;
    m_Start_location_name = utility::conversions::to_string_t("");
    m_Start_location_nameIsSet = false;
    m_Trailer_id = 0L;
    m_Trailer_idIsSet = false;
    m_Vehicle_id = 0L;
    m_Vehicle_idIsSet = false;
    m_Id = 0L;
}

DispatchRoute::~DispatchRoute()
{
}

void DispatchRoute::validate()
{
    // TODO: implement validation
}

web::json::value DispatchRoute::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Actual_end_msIsSet)
    {
        val[utility::conversions::to_string_t("actual_end_ms")] = ModelBase::toJson(m_Actual_end_ms);
    }
    if(m_Actual_start_msIsSet)
    {
        val[utility::conversions::to_string_t("actual_start_ms")] = ModelBase::toJson(m_Actual_start_ms);
    }
    if(m_Driver_idIsSet)
    {
        val[utility::conversions::to_string_t("driver_id")] = ModelBase::toJson(m_Driver_id);
    }
    if(m_Group_idIsSet)
    {
        val[utility::conversions::to_string_t("group_id")] = ModelBase::toJson(m_Group_id);
    }
    val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    val[utility::conversions::to_string_t("scheduled_end_ms")] = ModelBase::toJson(m_Scheduled_end_ms);
    if(m_Scheduled_metersIsSet)
    {
        val[utility::conversions::to_string_t("scheduled_meters")] = ModelBase::toJson(m_Scheduled_meters);
    }
    val[utility::conversions::to_string_t("scheduled_start_ms")] = ModelBase::toJson(m_Scheduled_start_ms);
    if(m_Start_location_addressIsSet)
    {
        val[utility::conversions::to_string_t("start_location_address")] = ModelBase::toJson(m_Start_location_address);
    }
    if(m_Start_location_address_idIsSet)
    {
        val[utility::conversions::to_string_t("start_location_address_id")] = ModelBase::toJson(m_Start_location_address_id);
    }
    if(m_Start_location_latIsSet)
    {
        val[utility::conversions::to_string_t("start_location_lat")] = ModelBase::toJson(m_Start_location_lat);
    }
    if(m_Start_location_lngIsSet)
    {
        val[utility::conversions::to_string_t("start_location_lng")] = ModelBase::toJson(m_Start_location_lng);
    }
    if(m_Start_location_nameIsSet)
    {
        val[utility::conversions::to_string_t("start_location_name")] = ModelBase::toJson(m_Start_location_name);
    }
    if(m_Trailer_idIsSet)
    {
        val[utility::conversions::to_string_t("trailer_id")] = ModelBase::toJson(m_Trailer_id);
    }
    if(m_Vehicle_idIsSet)
    {
        val[utility::conversions::to_string_t("vehicle_id")] = ModelBase::toJson(m_Vehicle_id);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Dispatch_jobs )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[utility::conversions::to_string_t("dispatch_jobs")] = web::json::value::array(jsonArray);
    }
    val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);

    return val;
}

void DispatchRoute::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("actual_end_ms")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("actual_end_ms"));
        if(!fieldValue.is_null())
        {
            setActualEndMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("actual_start_ms")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("actual_start_ms"));
        if(!fieldValue.is_null())
        {
            setActualStartMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driver_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driver_id"));
        if(!fieldValue.is_null())
        {
            setDriverId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("group_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("group_id"));
        if(!fieldValue.is_null())
        {
            setGroupId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    setName(ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("name"))));
    setScheduledEndMs(ModelBase::int64_tFromJson(val.at(utility::conversions::to_string_t("scheduled_end_ms"))));
    if(val.has_field(utility::conversions::to_string_t("scheduled_meters")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("scheduled_meters"));
        if(!fieldValue.is_null())
        {
            setScheduledMeters(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    setScheduledStartMs(ModelBase::int64_tFromJson(val.at(utility::conversions::to_string_t("scheduled_start_ms"))));
    if(val.has_field(utility::conversions::to_string_t("start_location_address")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("start_location_address"));
        if(!fieldValue.is_null())
        {
            setStartLocationAddress(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("start_location_address_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("start_location_address_id"));
        if(!fieldValue.is_null())
        {
            setStartLocationAddressId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("start_location_lat")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("start_location_lat"));
        if(!fieldValue.is_null())
        {
            setStartLocationLat(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("start_location_lng")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("start_location_lng"));
        if(!fieldValue.is_null())
        {
            setStartLocationLng(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("start_location_name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("start_location_name"));
        if(!fieldValue.is_null())
        {
            setStartLocationName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("trailer_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("trailer_id"));
        if(!fieldValue.is_null())
        {
            setTrailerId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("vehicle_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("vehicle_id"));
        if(!fieldValue.is_null())
        {
            setVehicleId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    {
        m_Dispatch_jobs.clear();
        std::vector<web::json::value> jsonArray;
        for( auto& item : val.at(utility::conversions::to_string_t("dispatch_jobs")).as_array() )
        {
            if(item.is_null())
            {
                m_Dispatch_jobs.push_back( std::shared_ptr<DispatchJob>(nullptr) );
            }
            else
            {
                std::shared_ptr<DispatchJob> newItem(new DispatchJob());
                newItem->fromJson(item);
                m_Dispatch_jobs.push_back( newItem );
            }
        }
    }
    setId(ModelBase::int64_tFromJson(val.at(utility::conversions::to_string_t("id"))));
}

void DispatchRoute::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Actual_end_msIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("actual_end_ms"), m_Actual_end_ms));
    }
    if(m_Actual_start_msIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("actual_start_ms"), m_Actual_start_ms));
    }
    if(m_Driver_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driver_id"), m_Driver_id));
    }
    if(m_Group_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("group_id"), m_Group_id));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("scheduled_end_ms"), m_Scheduled_end_ms));
    if(m_Scheduled_metersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("scheduled_meters"), m_Scheduled_meters));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("scheduled_start_ms"), m_Scheduled_start_ms));
    if(m_Start_location_addressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("start_location_address"), m_Start_location_address));
    }
    if(m_Start_location_address_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("start_location_address_id"), m_Start_location_address_id));
    }
    if(m_Start_location_latIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("start_location_lat"), m_Start_location_lat));
    }
    if(m_Start_location_lngIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("start_location_lng"), m_Start_location_lng));
    }
    if(m_Start_location_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("start_location_name"), m_Start_location_name));
    }
    if(m_Trailer_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("trailer_id"), m_Trailer_id));
    }
    if(m_Vehicle_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicle_id"), m_Vehicle_id));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Dispatch_jobs )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("dispatch_jobs"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
            }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
}

void DispatchRoute::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("actual_end_ms")))
    {
        setActualEndMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("actual_end_ms"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("actual_start_ms")))
    {
        setActualStartMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("actual_start_ms"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driver_id")))
    {
        setDriverId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driver_id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("group_id")))
    {
        setGroupId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("group_id"))));
    }
    setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    setScheduledEndMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("scheduled_end_ms"))));
    if(multipart->hasContent(utility::conversions::to_string_t("scheduled_meters")))
    {
        setScheduledMeters(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("scheduled_meters"))));
    }
    setScheduledStartMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("scheduled_start_ms"))));
    if(multipart->hasContent(utility::conversions::to_string_t("start_location_address")))
    {
        setStartLocationAddress(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("start_location_address"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("start_location_address_id")))
    {
        setStartLocationAddressId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("start_location_address_id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("start_location_lat")))
    {
        setStartLocationLat(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("start_location_lat"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("start_location_lng")))
    {
        setStartLocationLng(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("start_location_lng"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("start_location_name")))
    {
        setStartLocationName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("start_location_name"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("trailer_id")))
    {
        setTrailerId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("trailer_id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("vehicle_id")))
    {
        setVehicleId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicle_id"))));
    }
    {
        m_Dispatch_jobs.clear();

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("dispatch_jobs"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Dispatch_jobs.push_back( std::shared_ptr<DispatchJob>(nullptr) );
            }
            else
            {
                std::shared_ptr<DispatchJob> newItem(new DispatchJob());
                newItem->fromJson(item);
                m_Dispatch_jobs.push_back( newItem );
            }
        }
    }
    setId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
}

int64_t DispatchRoute::getActualEndMs() const
{
    return m_Actual_end_ms;
}

void DispatchRoute::setActualEndMs(int64_t value)
{
    m_Actual_end_ms = value;
    m_Actual_end_msIsSet = true;
}

bool DispatchRoute::actualEndMsIsSet() const
{
    return m_Actual_end_msIsSet;
}

void DispatchRoute::unsetActual_end_ms()
{
    m_Actual_end_msIsSet = false;
}

int64_t DispatchRoute::getActualStartMs() const
{
    return m_Actual_start_ms;
}

void DispatchRoute::setActualStartMs(int64_t value)
{
    m_Actual_start_ms = value;
    m_Actual_start_msIsSet = true;
}

bool DispatchRoute::actualStartMsIsSet() const
{
    return m_Actual_start_msIsSet;
}

void DispatchRoute::unsetActual_start_ms()
{
    m_Actual_start_msIsSet = false;
}

int64_t DispatchRoute::getDriverId() const
{
    return m_Driver_id;
}

void DispatchRoute::setDriverId(int64_t value)
{
    m_Driver_id = value;
    m_Driver_idIsSet = true;
}

bool DispatchRoute::driverIdIsSet() const
{
    return m_Driver_idIsSet;
}

void DispatchRoute::unsetDriver_id()
{
    m_Driver_idIsSet = false;
}

int64_t DispatchRoute::getGroupId() const
{
    return m_Group_id;
}

void DispatchRoute::setGroupId(int64_t value)
{
    m_Group_id = value;
    m_Group_idIsSet = true;
}

bool DispatchRoute::groupIdIsSet() const
{
    return m_Group_idIsSet;
}

void DispatchRoute::unsetGroup_id()
{
    m_Group_idIsSet = false;
}

utility::string_t DispatchRoute::getName() const
{
    return m_Name;
}

void DispatchRoute::setName(const utility::string_t& value)
{
    m_Name = value;
    
}

int64_t DispatchRoute::getScheduledEndMs() const
{
    return m_Scheduled_end_ms;
}

void DispatchRoute::setScheduledEndMs(int64_t value)
{
    m_Scheduled_end_ms = value;
    
}

int64_t DispatchRoute::getScheduledMeters() const
{
    return m_Scheduled_meters;
}

void DispatchRoute::setScheduledMeters(int64_t value)
{
    m_Scheduled_meters = value;
    m_Scheduled_metersIsSet = true;
}

bool DispatchRoute::scheduledMetersIsSet() const
{
    return m_Scheduled_metersIsSet;
}

void DispatchRoute::unsetScheduled_meters()
{
    m_Scheduled_metersIsSet = false;
}

int64_t DispatchRoute::getScheduledStartMs() const
{
    return m_Scheduled_start_ms;
}

void DispatchRoute::setScheduledStartMs(int64_t value)
{
    m_Scheduled_start_ms = value;
    
}

utility::string_t DispatchRoute::getStartLocationAddress() const
{
    return m_Start_location_address;
}

void DispatchRoute::setStartLocationAddress(const utility::string_t& value)
{
    m_Start_location_address = value;
    m_Start_location_addressIsSet = true;
}

bool DispatchRoute::startLocationAddressIsSet() const
{
    return m_Start_location_addressIsSet;
}

void DispatchRoute::unsetStart_location_address()
{
    m_Start_location_addressIsSet = false;
}

int64_t DispatchRoute::getStartLocationAddressId() const
{
    return m_Start_location_address_id;
}

void DispatchRoute::setStartLocationAddressId(int64_t value)
{
    m_Start_location_address_id = value;
    m_Start_location_address_idIsSet = true;
}

bool DispatchRoute::startLocationAddressIdIsSet() const
{
    return m_Start_location_address_idIsSet;
}

void DispatchRoute::unsetStart_location_address_id()
{
    m_Start_location_address_idIsSet = false;
}

double DispatchRoute::getStartLocationLat() const
{
    return m_Start_location_lat;
}

void DispatchRoute::setStartLocationLat(double value)
{
    m_Start_location_lat = value;
    m_Start_location_latIsSet = true;
}

bool DispatchRoute::startLocationLatIsSet() const
{
    return m_Start_location_latIsSet;
}

void DispatchRoute::unsetStart_location_lat()
{
    m_Start_location_latIsSet = false;
}

double DispatchRoute::getStartLocationLng() const
{
    return m_Start_location_lng;
}

void DispatchRoute::setStartLocationLng(double value)
{
    m_Start_location_lng = value;
    m_Start_location_lngIsSet = true;
}

bool DispatchRoute::startLocationLngIsSet() const
{
    return m_Start_location_lngIsSet;
}

void DispatchRoute::unsetStart_location_lng()
{
    m_Start_location_lngIsSet = false;
}

utility::string_t DispatchRoute::getStartLocationName() const
{
    return m_Start_location_name;
}

void DispatchRoute::setStartLocationName(const utility::string_t& value)
{
    m_Start_location_name = value;
    m_Start_location_nameIsSet = true;
}

bool DispatchRoute::startLocationNameIsSet() const
{
    return m_Start_location_nameIsSet;
}

void DispatchRoute::unsetStart_location_name()
{
    m_Start_location_nameIsSet = false;
}

int64_t DispatchRoute::getTrailerId() const
{
    return m_Trailer_id;
}

void DispatchRoute::setTrailerId(int64_t value)
{
    m_Trailer_id = value;
    m_Trailer_idIsSet = true;
}

bool DispatchRoute::trailerIdIsSet() const
{
    return m_Trailer_idIsSet;
}

void DispatchRoute::unsetTrailer_id()
{
    m_Trailer_idIsSet = false;
}

int64_t DispatchRoute::getVehicleId() const
{
    return m_Vehicle_id;
}

void DispatchRoute::setVehicleId(int64_t value)
{
    m_Vehicle_id = value;
    m_Vehicle_idIsSet = true;
}

bool DispatchRoute::vehicleIdIsSet() const
{
    return m_Vehicle_idIsSet;
}

void DispatchRoute::unsetVehicle_id()
{
    m_Vehicle_idIsSet = false;
}

std::vector<std::shared_ptr<DispatchJob>>& DispatchRoute::getDispatchJobs()
{
    return m_Dispatch_jobs;
}

void DispatchRoute::setDispatchJobs(const std::vector<std::shared_ptr<DispatchJob>>& value)
{
    m_Dispatch_jobs = value;
    
}

int64_t DispatchRoute::getId() const
{
    return m_Id;
}

void DispatchRoute::setId(int64_t value)
{
    m_Id = value;
    
}

}
}
}
}

