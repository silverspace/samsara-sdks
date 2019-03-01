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



#include "DispatchJobCreate.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

DispatchJobCreate::DispatchJobCreate()
{
    m_Destination_address = utility::conversions::to_string_t("");
    m_Destination_addressIsSet = false;
    m_Destination_address_id = 0L;
    m_Destination_address_idIsSet = false;
    m_Destination_lat = 0.0;
    m_Destination_latIsSet = false;
    m_Destination_lng = 0.0;
    m_Destination_lngIsSet = false;
    m_Destination_name = utility::conversions::to_string_t("");
    m_Destination_nameIsSet = false;
    m_Notes = utility::conversions::to_string_t("");
    m_NotesIsSet = false;
    m_Scheduled_arrival_time_ms = 0L;
    m_Scheduled_departure_time_ms = 0L;
    m_Scheduled_departure_time_msIsSet = false;
}

DispatchJobCreate::~DispatchJobCreate()
{
}

void DispatchJobCreate::validate()
{
    // TODO: implement validation
}

web::json::value DispatchJobCreate::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Destination_addressIsSet)
    {
        val[utility::conversions::to_string_t("destination_address")] = ModelBase::toJson(m_Destination_address);
    }
    if(m_Destination_address_idIsSet)
    {
        val[utility::conversions::to_string_t("destination_address_id")] = ModelBase::toJson(m_Destination_address_id);
    }
    if(m_Destination_latIsSet)
    {
        val[utility::conversions::to_string_t("destination_lat")] = ModelBase::toJson(m_Destination_lat);
    }
    if(m_Destination_lngIsSet)
    {
        val[utility::conversions::to_string_t("destination_lng")] = ModelBase::toJson(m_Destination_lng);
    }
    if(m_Destination_nameIsSet)
    {
        val[utility::conversions::to_string_t("destination_name")] = ModelBase::toJson(m_Destination_name);
    }
    if(m_NotesIsSet)
    {
        val[utility::conversions::to_string_t("notes")] = ModelBase::toJson(m_Notes);
    }
    val[utility::conversions::to_string_t("scheduled_arrival_time_ms")] = ModelBase::toJson(m_Scheduled_arrival_time_ms);
    if(m_Scheduled_departure_time_msIsSet)
    {
        val[utility::conversions::to_string_t("scheduled_departure_time_ms")] = ModelBase::toJson(m_Scheduled_departure_time_ms);
    }

    return val;
}

void DispatchJobCreate::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("destination_address")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("destination_address"));
        if(!fieldValue.is_null())
        {
            setDestinationAddress(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("destination_address_id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("destination_address_id"));
        if(!fieldValue.is_null())
        {
            setDestinationAddressId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("destination_lat")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("destination_lat"));
        if(!fieldValue.is_null())
        {
            setDestinationLat(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("destination_lng")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("destination_lng"));
        if(!fieldValue.is_null())
        {
            setDestinationLng(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("destination_name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("destination_name"));
        if(!fieldValue.is_null())
        {
            setDestinationName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("notes")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("notes"));
        if(!fieldValue.is_null())
        {
            setNotes(ModelBase::stringFromJson(fieldValue));
        }
    }
    setScheduledArrivalTimeMs(ModelBase::int64_tFromJson(val.at(utility::conversions::to_string_t("scheduled_arrival_time_ms"))));
    if(val.has_field(utility::conversions::to_string_t("scheduled_departure_time_ms")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("scheduled_departure_time_ms"));
        if(!fieldValue.is_null())
        {
            setScheduledDepartureTimeMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
}

void DispatchJobCreate::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Destination_addressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("destination_address"), m_Destination_address));
    }
    if(m_Destination_address_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("destination_address_id"), m_Destination_address_id));
    }
    if(m_Destination_latIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("destination_lat"), m_Destination_lat));
    }
    if(m_Destination_lngIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("destination_lng"), m_Destination_lng));
    }
    if(m_Destination_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("destination_name"), m_Destination_name));
    }
    if(m_NotesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("notes"), m_Notes));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("scheduled_arrival_time_ms"), m_Scheduled_arrival_time_ms));
    if(m_Scheduled_departure_time_msIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("scheduled_departure_time_ms"), m_Scheduled_departure_time_ms));
    }
}

void DispatchJobCreate::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("destination_address")))
    {
        setDestinationAddress(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("destination_address"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("destination_address_id")))
    {
        setDestinationAddressId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("destination_address_id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("destination_lat")))
    {
        setDestinationLat(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("destination_lat"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("destination_lng")))
    {
        setDestinationLng(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("destination_lng"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("destination_name")))
    {
        setDestinationName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("destination_name"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("notes")))
    {
        setNotes(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("notes"))));
    }
    setScheduledArrivalTimeMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("scheduled_arrival_time_ms"))));
    if(multipart->hasContent(utility::conversions::to_string_t("scheduled_departure_time_ms")))
    {
        setScheduledDepartureTimeMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("scheduled_departure_time_ms"))));
    }
}

utility::string_t DispatchJobCreate::getDestinationAddress() const
{
    return m_Destination_address;
}

void DispatchJobCreate::setDestinationAddress(const utility::string_t& value)
{
    m_Destination_address = value;
    m_Destination_addressIsSet = true;
}

bool DispatchJobCreate::destinationAddressIsSet() const
{
    return m_Destination_addressIsSet;
}

void DispatchJobCreate::unsetDestination_address()
{
    m_Destination_addressIsSet = false;
}

int64_t DispatchJobCreate::getDestinationAddressId() const
{
    return m_Destination_address_id;
}

void DispatchJobCreate::setDestinationAddressId(int64_t value)
{
    m_Destination_address_id = value;
    m_Destination_address_idIsSet = true;
}

bool DispatchJobCreate::destinationAddressIdIsSet() const
{
    return m_Destination_address_idIsSet;
}

void DispatchJobCreate::unsetDestination_address_id()
{
    m_Destination_address_idIsSet = false;
}

double DispatchJobCreate::getDestinationLat() const
{
    return m_Destination_lat;
}

void DispatchJobCreate::setDestinationLat(double value)
{
    m_Destination_lat = value;
    m_Destination_latIsSet = true;
}

bool DispatchJobCreate::destinationLatIsSet() const
{
    return m_Destination_latIsSet;
}

void DispatchJobCreate::unsetDestination_lat()
{
    m_Destination_latIsSet = false;
}

double DispatchJobCreate::getDestinationLng() const
{
    return m_Destination_lng;
}

void DispatchJobCreate::setDestinationLng(double value)
{
    m_Destination_lng = value;
    m_Destination_lngIsSet = true;
}

bool DispatchJobCreate::destinationLngIsSet() const
{
    return m_Destination_lngIsSet;
}

void DispatchJobCreate::unsetDestination_lng()
{
    m_Destination_lngIsSet = false;
}

utility::string_t DispatchJobCreate::getDestinationName() const
{
    return m_Destination_name;
}

void DispatchJobCreate::setDestinationName(const utility::string_t& value)
{
    m_Destination_name = value;
    m_Destination_nameIsSet = true;
}

bool DispatchJobCreate::destinationNameIsSet() const
{
    return m_Destination_nameIsSet;
}

void DispatchJobCreate::unsetDestination_name()
{
    m_Destination_nameIsSet = false;
}

utility::string_t DispatchJobCreate::getNotes() const
{
    return m_Notes;
}

void DispatchJobCreate::setNotes(const utility::string_t& value)
{
    m_Notes = value;
    m_NotesIsSet = true;
}

bool DispatchJobCreate::notesIsSet() const
{
    return m_NotesIsSet;
}

void DispatchJobCreate::unsetNotes()
{
    m_NotesIsSet = false;
}

int64_t DispatchJobCreate::getScheduledArrivalTimeMs() const
{
    return m_Scheduled_arrival_time_ms;
}

void DispatchJobCreate::setScheduledArrivalTimeMs(int64_t value)
{
    m_Scheduled_arrival_time_ms = value;
    
}

int64_t DispatchJobCreate::getScheduledDepartureTimeMs() const
{
    return m_Scheduled_departure_time_ms;
}

void DispatchJobCreate::setScheduledDepartureTimeMs(int64_t value)
{
    m_Scheduled_departure_time_ms = value;
    m_Scheduled_departure_time_msIsSet = true;
}

bool DispatchJobCreate::scheduledDepartureTimeMsIsSet() const
{
    return m_Scheduled_departure_time_msIsSet;
}

void DispatchJobCreate::unsetScheduled_departure_time_ms()
{
    m_Scheduled_departure_time_msIsSet = false;
}

}
}
}
}

