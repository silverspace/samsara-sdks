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



#include "Address.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

Address::Address()
{
    m_ContactsIsSet = false;
    m_FormattedAddress = utility::conversions::to_string_t("");
    m_FormattedAddressIsSet = false;
    m_GeofenceIsSet = false;
    m_Id = 0L;
    m_IdIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Notes = utility::conversions::to_string_t("");
    m_NotesIsSet = false;
    m_TagsIsSet = false;
}

Address::~Address()
{
}

void Address::validate()
{
    // TODO: implement validation
}

web::json::value Address::toJson() const
{
    web::json::value val = web::json::value::object();

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Contacts )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("contacts")] = web::json::value::array(jsonArray);
        }
    }
    if(m_FormattedAddressIsSet)
    {
        val[utility::conversions::to_string_t("formattedAddress")] = ModelBase::toJson(m_FormattedAddress);
    }
    if(m_GeofenceIsSet)
    {
        val[utility::conversions::to_string_t("geofence")] = ModelBase::toJson(m_Geofence);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }
    if(m_NotesIsSet)
    {
        val[utility::conversions::to_string_t("notes")] = ModelBase::toJson(m_Notes);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Tags )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("tags")] = web::json::value::array(jsonArray);
        }
    }

    return val;
}

void Address::fromJson(const web::json::value& val)
{
    {
        m_Contacts.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("contacts")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("contacts")).as_array() )
        {
            if(item.is_null())
            {
                m_Contacts.push_back( std::shared_ptr<Contact>(nullptr) );
            }
            else
            {
                std::shared_ptr<Contact> newItem(new Contact());
                newItem->fromJson(item);
                m_Contacts.push_back( newItem );
            }
        }
        }
    }
    if(val.has_field(utility::conversions::to_string_t("formattedAddress")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("formattedAddress"));
        if(!fieldValue.is_null())
        {
            setFormattedAddress(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("geofence")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("geofence"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AddressGeofence> newItem(new AddressGeofence());
            newItem->fromJson(fieldValue);
            setGeofence( newItem );
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
    if(val.has_field(utility::conversions::to_string_t("name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("name"));
        if(!fieldValue.is_null())
        {
            setName(ModelBase::stringFromJson(fieldValue));
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
    {
        m_Tags.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("tags")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("tags")).as_array() )
        {
            if(item.is_null())
            {
                m_Tags.push_back( std::shared_ptr<TagMetadata>(nullptr) );
            }
            else
            {
                std::shared_ptr<TagMetadata> newItem(new TagMetadata());
                newItem->fromJson(item);
                m_Tags.push_back( newItem );
            }
        }
        }
    }
}

void Address::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Contacts )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("contacts"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_FormattedAddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("formattedAddress"), m_FormattedAddress));
    }
    if(m_GeofenceIsSet)
    {
        if (m_Geofence.get())
        {
            m_Geofence->toMultipart(multipart, utility::conversions::to_string_t("geofence."));
        }
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    }
    if(m_NotesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("notes"), m_Notes));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Tags )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("tags"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
}

void Address::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        m_Contacts.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("contacts")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("contacts"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Contacts.push_back( std::shared_ptr<Contact>(nullptr) );
            }
            else
            {
                std::shared_ptr<Contact> newItem(new Contact());
                newItem->fromJson(item);
                m_Contacts.push_back( newItem );
            }
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("formattedAddress")))
    {
        setFormattedAddress(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("formattedAddress"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("geofence")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("geofence")))
        {
            std::shared_ptr<AddressGeofence> newItem(new AddressGeofence());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("geofence."));
            setGeofence( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        setId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("notes")))
    {
        setNotes(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("notes"))));
    }
    {
        m_Tags.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("tags")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("tags"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Tags.push_back( std::shared_ptr<TagMetadata>(nullptr) );
            }
            else
            {
                std::shared_ptr<TagMetadata> newItem(new TagMetadata());
                newItem->fromJson(item);
                m_Tags.push_back( newItem );
            }
        }
        }
    }
}

std::vector<std::shared_ptr<Contact>>& Address::getContacts()
{
    return m_Contacts;
}

void Address::setContacts(const std::vector<std::shared_ptr<Contact>>& value)
{
    m_Contacts = value;
    m_ContactsIsSet = true;
}

bool Address::contactsIsSet() const
{
    return m_ContactsIsSet;
}

void Address::unsetContacts()
{
    m_ContactsIsSet = false;
}

utility::string_t Address::getFormattedAddress() const
{
    return m_FormattedAddress;
}

void Address::setFormattedAddress(const utility::string_t& value)
{
    m_FormattedAddress = value;
    m_FormattedAddressIsSet = true;
}

bool Address::formattedAddressIsSet() const
{
    return m_FormattedAddressIsSet;
}

void Address::unsetFormattedAddress()
{
    m_FormattedAddressIsSet = false;
}

std::shared_ptr<AddressGeofence> Address::getGeofence() const
{
    return m_Geofence;
}

void Address::setGeofence(const std::shared_ptr<AddressGeofence>& value)
{
    m_Geofence = value;
    m_GeofenceIsSet = true;
}

bool Address::geofenceIsSet() const
{
    return m_GeofenceIsSet;
}

void Address::unsetGeofence()
{
    m_GeofenceIsSet = false;
}

int64_t Address::getId() const
{
    return m_Id;
}

void Address::setId(int64_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Address::idIsSet() const
{
    return m_IdIsSet;
}

void Address::unsetId()
{
    m_IdIsSet = false;
}

utility::string_t Address::getName() const
{
    return m_Name;
}

void Address::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool Address::nameIsSet() const
{
    return m_NameIsSet;
}

void Address::unsetName()
{
    m_NameIsSet = false;
}

utility::string_t Address::getNotes() const
{
    return m_Notes;
}

void Address::setNotes(const utility::string_t& value)
{
    m_Notes = value;
    m_NotesIsSet = true;
}

bool Address::notesIsSet() const
{
    return m_NotesIsSet;
}

void Address::unsetNotes()
{
    m_NotesIsSet = false;
}

std::vector<std::shared_ptr<TagMetadata>>& Address::getTags()
{
    return m_Tags;
}

void Address::setTags(const std::vector<std::shared_ptr<TagMetadata>>& value)
{
    m_Tags = value;
    m_TagsIsSet = true;
}

bool Address::tagsIsSet() const
{
    return m_TagsIsSet;
}

void Address::unsetTags()
{
    m_TagsIsSet = false;
}

}
}
}
}

