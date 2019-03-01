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



#include "Tag.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

Tag::Tag()
{
    m_AddressesIsSet = false;
    m_AssetsIsSet = false;
    m_DriversIsSet = false;
    m_GroupId = 0L;
    m_GroupIdIsSet = false;
    m_Id = 0L;
    m_MachinesIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_ParentTagId = 0L;
    m_ParentTagIdIsSet = false;
    m_SensorsIsSet = false;
    m_VehiclesIsSet = false;
}

Tag::~Tag()
{
}

void Tag::validate()
{
    // TODO: implement validation
}

web::json::value Tag::toJson() const
{
    web::json::value val = web::json::value::object();

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Addresses )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("addresses")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Assets )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("assets")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Drivers )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("drivers")] = web::json::value::array(jsonArray);
        }
    }
    if(m_GroupIdIsSet)
    {
        val[utility::conversions::to_string_t("groupId")] = ModelBase::toJson(m_GroupId);
    }
    val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Machines )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("machines")] = web::json::value::array(jsonArray);
        }
    }
    val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    if(m_ParentTagIdIsSet)
    {
        val[utility::conversions::to_string_t("parentTagId")] = ModelBase::toJson(m_ParentTagId);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Sensors )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("sensors")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Vehicles )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("vehicles")] = web::json::value::array(jsonArray);
        }
    }

    return val;
}

void Tag::fromJson(const web::json::value& val)
{
    {
        m_Addresses.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("addresses")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("addresses")).as_array() )
        {
            if(item.is_null())
            {
                m_Addresses.push_back( std::shared_ptr<TaggedAddress>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedAddress> newItem(new TaggedAddress());
                newItem->fromJson(item);
                m_Addresses.push_back( newItem );
            }
        }
        }
    }
    {
        m_Assets.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("assets")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("assets")).as_array() )
        {
            if(item.is_null())
            {
                m_Assets.push_back( std::shared_ptr<TaggedAsset>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedAsset> newItem(new TaggedAsset());
                newItem->fromJson(item);
                m_Assets.push_back( newItem );
            }
        }
        }
    }
    {
        m_Drivers.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("drivers")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("drivers")).as_array() )
        {
            if(item.is_null())
            {
                m_Drivers.push_back( std::shared_ptr<TaggedDriver>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedDriver> newItem(new TaggedDriver());
                newItem->fromJson(item);
                m_Drivers.push_back( newItem );
            }
        }
        }
    }
    if(val.has_field(utility::conversions::to_string_t("groupId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("groupId"));
        if(!fieldValue.is_null())
        {
            setGroupId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    setId(ModelBase::int64_tFromJson(val.at(utility::conversions::to_string_t("id"))));
    {
        m_Machines.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("machines")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("machines")).as_array() )
        {
            if(item.is_null())
            {
                m_Machines.push_back( std::shared_ptr<TaggedMachine>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedMachine> newItem(new TaggedMachine());
                newItem->fromJson(item);
                m_Machines.push_back( newItem );
            }
        }
        }
    }
    setName(ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("name"))));
    if(val.has_field(utility::conversions::to_string_t("parentTagId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("parentTagId"));
        if(!fieldValue.is_null())
        {
            setParentTagId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    {
        m_Sensors.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("sensors")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("sensors")).as_array() )
        {
            if(item.is_null())
            {
                m_Sensors.push_back( std::shared_ptr<TaggedSensor>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedSensor> newItem(new TaggedSensor());
                newItem->fromJson(item);
                m_Sensors.push_back( newItem );
            }
        }
        }
    }
    {
        m_Vehicles.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("vehicles")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("vehicles")).as_array() )
        {
            if(item.is_null())
            {
                m_Vehicles.push_back( std::shared_ptr<TaggedVehicle>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedVehicle> newItem(new TaggedVehicle());
                newItem->fromJson(item);
                m_Vehicles.push_back( newItem );
            }
        }
        }
    }
}

void Tag::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Addresses )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("addresses"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Assets )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("assets"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Drivers )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("drivers"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_GroupIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("groupId"), m_GroupId));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Machines )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("machines"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    if(m_ParentTagIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("parentTagId"), m_ParentTagId));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Sensors )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("sensors"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Vehicles )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicles"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
}

void Tag::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        m_Addresses.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("addresses")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("addresses"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Addresses.push_back( std::shared_ptr<TaggedAddress>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedAddress> newItem(new TaggedAddress());
                newItem->fromJson(item);
                m_Addresses.push_back( newItem );
            }
        }
        }
    }
    {
        m_Assets.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("assets")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("assets"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Assets.push_back( std::shared_ptr<TaggedAsset>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedAsset> newItem(new TaggedAsset());
                newItem->fromJson(item);
                m_Assets.push_back( newItem );
            }
        }
        }
    }
    {
        m_Drivers.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("drivers")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("drivers"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Drivers.push_back( std::shared_ptr<TaggedDriver>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedDriver> newItem(new TaggedDriver());
                newItem->fromJson(item);
                m_Drivers.push_back( newItem );
            }
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("groupId")))
    {
        setGroupId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("groupId"))));
    }
    setId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
    {
        m_Machines.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("machines")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("machines"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Machines.push_back( std::shared_ptr<TaggedMachine>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedMachine> newItem(new TaggedMachine());
                newItem->fromJson(item);
                m_Machines.push_back( newItem );
            }
        }
        }
    }
    setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    if(multipart->hasContent(utility::conversions::to_string_t("parentTagId")))
    {
        setParentTagId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("parentTagId"))));
    }
    {
        m_Sensors.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("sensors")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("sensors"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Sensors.push_back( std::shared_ptr<TaggedSensor>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedSensor> newItem(new TaggedSensor());
                newItem->fromJson(item);
                m_Sensors.push_back( newItem );
            }
        }
        }
    }
    {
        m_Vehicles.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("vehicles")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicles"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Vehicles.push_back( std::shared_ptr<TaggedVehicle>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaggedVehicle> newItem(new TaggedVehicle());
                newItem->fromJson(item);
                m_Vehicles.push_back( newItem );
            }
        }
        }
    }
}

std::vector<std::shared_ptr<TaggedAddress>>& Tag::getAddresses()
{
    return m_Addresses;
}

void Tag::setAddresses(const std::vector<std::shared_ptr<TaggedAddress>>& value)
{
    m_Addresses = value;
    m_AddressesIsSet = true;
}

bool Tag::addressesIsSet() const
{
    return m_AddressesIsSet;
}

void Tag::unsetAddresses()
{
    m_AddressesIsSet = false;
}

std::vector<std::shared_ptr<TaggedAsset>>& Tag::getAssets()
{
    return m_Assets;
}

void Tag::setAssets(const std::vector<std::shared_ptr<TaggedAsset>>& value)
{
    m_Assets = value;
    m_AssetsIsSet = true;
}

bool Tag::assetsIsSet() const
{
    return m_AssetsIsSet;
}

void Tag::unsetAssets()
{
    m_AssetsIsSet = false;
}

std::vector<std::shared_ptr<TaggedDriver>>& Tag::getDrivers()
{
    return m_Drivers;
}

void Tag::setDrivers(const std::vector<std::shared_ptr<TaggedDriver>>& value)
{
    m_Drivers = value;
    m_DriversIsSet = true;
}

bool Tag::driversIsSet() const
{
    return m_DriversIsSet;
}

void Tag::unsetDrivers()
{
    m_DriversIsSet = false;
}

int64_t Tag::getGroupId() const
{
    return m_GroupId;
}

void Tag::setGroupId(int64_t value)
{
    m_GroupId = value;
    m_GroupIdIsSet = true;
}

bool Tag::groupIdIsSet() const
{
    return m_GroupIdIsSet;
}

void Tag::unsetGroupId()
{
    m_GroupIdIsSet = false;
}

int64_t Tag::getId() const
{
    return m_Id;
}

void Tag::setId(int64_t value)
{
    m_Id = value;
    
}

std::vector<std::shared_ptr<TaggedMachine>>& Tag::getMachines()
{
    return m_Machines;
}

void Tag::setMachines(const std::vector<std::shared_ptr<TaggedMachine>>& value)
{
    m_Machines = value;
    m_MachinesIsSet = true;
}

bool Tag::machinesIsSet() const
{
    return m_MachinesIsSet;
}

void Tag::unsetMachines()
{
    m_MachinesIsSet = false;
}

utility::string_t Tag::getName() const
{
    return m_Name;
}

void Tag::setName(const utility::string_t& value)
{
    m_Name = value;
    
}

int64_t Tag::getParentTagId() const
{
    return m_ParentTagId;
}

void Tag::setParentTagId(int64_t value)
{
    m_ParentTagId = value;
    m_ParentTagIdIsSet = true;
}

bool Tag::parentTagIdIsSet() const
{
    return m_ParentTagIdIsSet;
}

void Tag::unsetParentTagId()
{
    m_ParentTagIdIsSet = false;
}

std::vector<std::shared_ptr<TaggedSensor>>& Tag::getSensors()
{
    return m_Sensors;
}

void Tag::setSensors(const std::vector<std::shared_ptr<TaggedSensor>>& value)
{
    m_Sensors = value;
    m_SensorsIsSet = true;
}

bool Tag::sensorsIsSet() const
{
    return m_SensorsIsSet;
}

void Tag::unsetSensors()
{
    m_SensorsIsSet = false;
}

std::vector<std::shared_ptr<TaggedVehicle>>& Tag::getVehicles()
{
    return m_Vehicles;
}

void Tag::setVehicles(const std::vector<std::shared_ptr<TaggedVehicle>>& value)
{
    m_Vehicles = value;
    m_VehiclesIsSet = true;
}

bool Tag::vehiclesIsSet() const
{
    return m_VehiclesIsSet;
}

void Tag::unsetVehicles()
{
    m_VehiclesIsSet = false;
}

}
}
}
}

