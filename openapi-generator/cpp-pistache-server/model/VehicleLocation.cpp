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


#include "VehicleLocation.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

VehicleLocation::VehicleLocation()
{
    m_Heading = 0.0;
    m_HeadingIsSet = false;
    m_Id = 0L;
    m_Latitude = 0.0;
    m_LatitudeIsSet = false;
    m_Location = "";
    m_LocationIsSet = false;
    m_Longitude = 0.0;
    m_LongitudeIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_OdometerMeters = 0L;
    m_OdometerMetersIsSet = false;
    m_OnTrip = false;
    m_OnTripIsSet = false;
    m_Speed = 0.0;
    m_SpeedIsSet = false;
    m_Time = 0;
    m_TimeIsSet = false;
    m_Vin = "";
    m_VinIsSet = false;
    
}

VehicleLocation::~VehicleLocation()
{
}

void VehicleLocation::validate()
{
    // TODO: implement validation
}

nlohmann::json VehicleLocation::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_HeadingIsSet)
    {
        val["heading"] = m_Heading;
    }
    val["id"] = m_Id;
    if(m_LatitudeIsSet)
    {
        val["latitude"] = m_Latitude;
    }
    if(m_LocationIsSet)
    {
        val["location"] = ModelBase::toJson(m_Location);
    }
    if(m_LongitudeIsSet)
    {
        val["longitude"] = m_Longitude;
    }
    if(m_NameIsSet)
    {
        val["name"] = ModelBase::toJson(m_Name);
    }
    if(m_OdometerMetersIsSet)
    {
        val["odometerMeters"] = m_OdometerMeters;
    }
    if(m_OnTripIsSet)
    {
        val["onTrip"] = m_OnTrip;
    }
    if(m_SpeedIsSet)
    {
        val["speed"] = m_Speed;
    }
    if(m_TimeIsSet)
    {
        val["time"] = m_Time;
    }
    if(m_VinIsSet)
    {
        val["vin"] = ModelBase::toJson(m_Vin);
    }
    

    return val;
}

void VehicleLocation::fromJson(const nlohmann::json& val)
{
    if(val.find("heading") != val.end())
    {
        setHeading(val.at("heading"));
    }
    setId(val.at("id"));
    if(val.find("latitude") != val.end())
    {
        setLatitude(val.at("latitude"));
    }
    if(val.find("location") != val.end())
    {
        setLocation(val.at("location"));
    }
    if(val.find("longitude") != val.end())
    {
        setLongitude(val.at("longitude"));
    }
    if(val.find("name") != val.end())
    {
        setName(val.at("name"));
    }
    if(val.find("odometerMeters") != val.end())
    {
        setOdometerMeters(val.at("odometerMeters"));
    }
    if(val.find("onTrip") != val.end())
    {
        setOnTrip(val.at("onTrip"));
    }
    if(val.find("speed") != val.end())
    {
        setSpeed(val.at("speed"));
    }
    if(val.find("time") != val.end())
    {
        setTime(val.at("time"));
    }
    if(val.find("vin") != val.end())
    {
        setVin(val.at("vin"));
    }
    
}


double VehicleLocation::getHeading() const
{
    return m_Heading;
}
void VehicleLocation::setHeading(double const value)
{
    m_Heading = value;
    m_HeadingIsSet = true;
}
bool VehicleLocation::headingIsSet() const
{
    return m_HeadingIsSet;
}
void VehicleLocation::unsetHeading()
{
    m_HeadingIsSet = false;
}
int64_t VehicleLocation::getId() const
{
    return m_Id;
}
void VehicleLocation::setId(int64_t const value)
{
    m_Id = value;
    
}
double VehicleLocation::getLatitude() const
{
    return m_Latitude;
}
void VehicleLocation::setLatitude(double const value)
{
    m_Latitude = value;
    m_LatitudeIsSet = true;
}
bool VehicleLocation::latitudeIsSet() const
{
    return m_LatitudeIsSet;
}
void VehicleLocation::unsetLatitude()
{
    m_LatitudeIsSet = false;
}
std::string VehicleLocation::getLocation() const
{
    return m_Location;
}
void VehicleLocation::setLocation(std::string const& value)
{
    m_Location = value;
    m_LocationIsSet = true;
}
bool VehicleLocation::locationIsSet() const
{
    return m_LocationIsSet;
}
void VehicleLocation::unsetLocation()
{
    m_LocationIsSet = false;
}
double VehicleLocation::getLongitude() const
{
    return m_Longitude;
}
void VehicleLocation::setLongitude(double const value)
{
    m_Longitude = value;
    m_LongitudeIsSet = true;
}
bool VehicleLocation::longitudeIsSet() const
{
    return m_LongitudeIsSet;
}
void VehicleLocation::unsetLongitude()
{
    m_LongitudeIsSet = false;
}
std::string VehicleLocation::getName() const
{
    return m_Name;
}
void VehicleLocation::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool VehicleLocation::nameIsSet() const
{
    return m_NameIsSet;
}
void VehicleLocation::unsetName()
{
    m_NameIsSet = false;
}
int64_t VehicleLocation::getOdometerMeters() const
{
    return m_OdometerMeters;
}
void VehicleLocation::setOdometerMeters(int64_t const value)
{
    m_OdometerMeters = value;
    m_OdometerMetersIsSet = true;
}
bool VehicleLocation::odometerMetersIsSet() const
{
    return m_OdometerMetersIsSet;
}
void VehicleLocation::unsetOdometerMeters()
{
    m_OdometerMetersIsSet = false;
}
bool VehicleLocation::isOnTrip() const
{
    return m_OnTrip;
}
void VehicleLocation::setOnTrip(bool const value)
{
    m_OnTrip = value;
    m_OnTripIsSet = true;
}
bool VehicleLocation::onTripIsSet() const
{
    return m_OnTripIsSet;
}
void VehicleLocation::unsetOnTrip()
{
    m_OnTripIsSet = false;
}
double VehicleLocation::getSpeed() const
{
    return m_Speed;
}
void VehicleLocation::setSpeed(double const value)
{
    m_Speed = value;
    m_SpeedIsSet = true;
}
bool VehicleLocation::speedIsSet() const
{
    return m_SpeedIsSet;
}
void VehicleLocation::unsetSpeed()
{
    m_SpeedIsSet = false;
}
int32_t VehicleLocation::getTime() const
{
    return m_Time;
}
void VehicleLocation::setTime(int32_t const value)
{
    m_Time = value;
    m_TimeIsSet = true;
}
bool VehicleLocation::timeIsSet() const
{
    return m_TimeIsSet;
}
void VehicleLocation::unsetTime()
{
    m_TimeIsSet = false;
}
std::string VehicleLocation::getVin() const
{
    return m_Vin;
}
void VehicleLocation::setVin(std::string const& value)
{
    m_Vin = value;
    m_VinIsSet = true;
}
bool VehicleLocation::vinIsSet() const
{
    return m_VinIsSet;
}
void VehicleLocation::unsetVin()
{
    m_VinIsSet = false;
}

}
}
}
}

