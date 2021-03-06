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


#include "VehicleMaintenance_j1939_diagnosticTroubleCodes.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

VehicleMaintenance_j1939_diagnosticTroubleCodes::VehicleMaintenance_j1939_diagnosticTroubleCodes()
{
    m_SpnDescription = "";
    m_SpnDescriptionIsSet = false;
    m_FmiText = "";
    m_FmiTextIsSet = false;
    m_SpnId = 0;
    m_SpnIdIsSet = false;
    m_OccurrenceCount = 0;
    m_OccurrenceCountIsSet = false;
    m_TxId = 0;
    m_TxIdIsSet = false;
    m_FmiId = 0;
    m_FmiIdIsSet = false;
    
}

VehicleMaintenance_j1939_diagnosticTroubleCodes::~VehicleMaintenance_j1939_diagnosticTroubleCodes()
{
}

void VehicleMaintenance_j1939_diagnosticTroubleCodes::validate()
{
    // TODO: implement validation
}

nlohmann::json VehicleMaintenance_j1939_diagnosticTroubleCodes::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_SpnDescriptionIsSet)
    {
        val["spnDescription"] = ModelBase::toJson(m_SpnDescription);
    }
    if(m_FmiTextIsSet)
    {
        val["fmiText"] = ModelBase::toJson(m_FmiText);
    }
    if(m_SpnIdIsSet)
    {
        val["spnId"] = m_SpnId;
    }
    if(m_OccurrenceCountIsSet)
    {
        val["occurrenceCount"] = m_OccurrenceCount;
    }
    if(m_TxIdIsSet)
    {
        val["txId"] = m_TxId;
    }
    if(m_FmiIdIsSet)
    {
        val["fmiId"] = m_FmiId;
    }
    

    return val;
}

void VehicleMaintenance_j1939_diagnosticTroubleCodes::fromJson(const nlohmann::json& val)
{
    if(val.find("spnDescription") != val.end())
    {
        setSpnDescription(val.at("spnDescription"));
    }
    if(val.find("fmiText") != val.end())
    {
        setFmiText(val.at("fmiText"));
    }
    if(val.find("spnId") != val.end())
    {
        setSpnId(val.at("spnId"));
    }
    if(val.find("occurrenceCount") != val.end())
    {
        setOccurrenceCount(val.at("occurrenceCount"));
    }
    if(val.find("txId") != val.end())
    {
        setTxId(val.at("txId"));
    }
    if(val.find("fmiId") != val.end())
    {
        setFmiId(val.at("fmiId"));
    }
    
}


std::string VehicleMaintenance_j1939_diagnosticTroubleCodes::getSpnDescription() const
{
    return m_SpnDescription;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::setSpnDescription(std::string const& value)
{
    m_SpnDescription = value;
    m_SpnDescriptionIsSet = true;
}
bool VehicleMaintenance_j1939_diagnosticTroubleCodes::spnDescriptionIsSet() const
{
    return m_SpnDescriptionIsSet;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::unsetSpnDescription()
{
    m_SpnDescriptionIsSet = false;
}
std::string VehicleMaintenance_j1939_diagnosticTroubleCodes::getFmiText() const
{
    return m_FmiText;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::setFmiText(std::string const& value)
{
    m_FmiText = value;
    m_FmiTextIsSet = true;
}
bool VehicleMaintenance_j1939_diagnosticTroubleCodes::fmiTextIsSet() const
{
    return m_FmiTextIsSet;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::unsetFmiText()
{
    m_FmiTextIsSet = false;
}
int32_t VehicleMaintenance_j1939_diagnosticTroubleCodes::getSpnId() const
{
    return m_SpnId;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::setSpnId(int32_t const value)
{
    m_SpnId = value;
    m_SpnIdIsSet = true;
}
bool VehicleMaintenance_j1939_diagnosticTroubleCodes::spnIdIsSet() const
{
    return m_SpnIdIsSet;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::unsetSpnId()
{
    m_SpnIdIsSet = false;
}
int32_t VehicleMaintenance_j1939_diagnosticTroubleCodes::getOccurrenceCount() const
{
    return m_OccurrenceCount;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::setOccurrenceCount(int32_t const value)
{
    m_OccurrenceCount = value;
    m_OccurrenceCountIsSet = true;
}
bool VehicleMaintenance_j1939_diagnosticTroubleCodes::occurrenceCountIsSet() const
{
    return m_OccurrenceCountIsSet;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::unsetOccurrenceCount()
{
    m_OccurrenceCountIsSet = false;
}
int32_t VehicleMaintenance_j1939_diagnosticTroubleCodes::getTxId() const
{
    return m_TxId;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::setTxId(int32_t const value)
{
    m_TxId = value;
    m_TxIdIsSet = true;
}
bool VehicleMaintenance_j1939_diagnosticTroubleCodes::txIdIsSet() const
{
    return m_TxIdIsSet;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::unsetTxId()
{
    m_TxIdIsSet = false;
}
int32_t VehicleMaintenance_j1939_diagnosticTroubleCodes::getFmiId() const
{
    return m_FmiId;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::setFmiId(int32_t const value)
{
    m_FmiId = value;
    m_FmiIdIsSet = true;
}
bool VehicleMaintenance_j1939_diagnosticTroubleCodes::fmiIdIsSet() const
{
    return m_FmiIdIsSet;
}
void VehicleMaintenance_j1939_diagnosticTroubleCodes::unsetFmiId()
{
    m_FmiIdIsSet = false;
}

}
}
}
}

