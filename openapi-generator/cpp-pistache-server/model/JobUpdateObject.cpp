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


#include "JobUpdateObject.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

JobUpdateObject::JobUpdateObject()
{
    m_Changed_at_ms = 0L;
    m_Changed_at_msIsSet = false;
    m_Job_id = 0L;
    m_Job_idIsSet = false;
    m_Job_stateIsSet = false;
    m_Prev_job_stateIsSet = false;
    m_RouteIsSet = false;
    m_Route_id = 0L;
    m_Route_idIsSet = false;
    
}

JobUpdateObject::~JobUpdateObject()
{
}

void JobUpdateObject::validate()
{
    // TODO: implement validation
}

nlohmann::json JobUpdateObject::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Changed_at_msIsSet)
    {
        val["changed_at_ms"] = m_Changed_at_ms;
    }
    if(m_Job_idIsSet)
    {
        val["job_id"] = m_Job_id;
    }
    if(m_Job_stateIsSet)
    {
        val["job_state"] = ModelBase::toJson(m_Job_state);
    }
    if(m_Prev_job_stateIsSet)
    {
        val["prev_job_state"] = ModelBase::toJson(m_Prev_job_state);
    }
    if(m_RouteIsSet)
    {
        val["route"] = ModelBase::toJson(m_Route);
    }
    if(m_Route_idIsSet)
    {
        val["route_id"] = m_Route_id;
    }
    

    return val;
}

void JobUpdateObject::fromJson(const nlohmann::json& val)
{
    if(val.find("changed_at_ms") != val.end())
    {
        setChangedAtMs(val.at("changed_at_ms"));
    }
    if(val.find("job_id") != val.end())
    {
        setJobId(val.at("job_id"));
    }
    if(val.find("job_state") != val.end())
    {
        if(!val["job_state"].is_null())
        {
            JobStatus newItem;
            newItem.fromJson(val["job_state"]);
            setJobState( newItem );
        }
        
    }
    if(val.find("prev_job_state") != val.end())
    {
        if(!val["prev_job_state"].is_null())
        {
            PrevJobStatus newItem;
            newItem.fromJson(val["prev_job_state"]);
            setPrevJobState( newItem );
        }
        
    }
    if(val.find("route") != val.end())
    {
        if(!val["route"].is_null())
        {
            DispatchRoute newItem;
            newItem.fromJson(val["route"]);
            setRoute( newItem );
        }
        
    }
    if(val.find("route_id") != val.end())
    {
        setRouteId(val.at("route_id"));
    }
    
}


int64_t JobUpdateObject::getChangedAtMs() const
{
    return m_Changed_at_ms;
}
void JobUpdateObject::setChangedAtMs(int64_t const value)
{
    m_Changed_at_ms = value;
    m_Changed_at_msIsSet = true;
}
bool JobUpdateObject::changedAtMsIsSet() const
{
    return m_Changed_at_msIsSet;
}
void JobUpdateObject::unsetChanged_at_ms()
{
    m_Changed_at_msIsSet = false;
}
int64_t JobUpdateObject::getJobId() const
{
    return m_Job_id;
}
void JobUpdateObject::setJobId(int64_t const value)
{
    m_Job_id = value;
    m_Job_idIsSet = true;
}
bool JobUpdateObject::jobIdIsSet() const
{
    return m_Job_idIsSet;
}
void JobUpdateObject::unsetJob_id()
{
    m_Job_idIsSet = false;
}
JobStatus JobUpdateObject::getJobState() const
{
    return m_Job_state;
}
void JobUpdateObject::setJobState(JobStatus const& value)
{
    m_Job_state = value;
    m_Job_stateIsSet = true;
}
bool JobUpdateObject::jobStateIsSet() const
{
    return m_Job_stateIsSet;
}
void JobUpdateObject::unsetJob_state()
{
    m_Job_stateIsSet = false;
}
PrevJobStatus JobUpdateObject::getPrevJobState() const
{
    return m_Prev_job_state;
}
void JobUpdateObject::setPrevJobState(PrevJobStatus const& value)
{
    m_Prev_job_state = value;
    m_Prev_job_stateIsSet = true;
}
bool JobUpdateObject::prevJobStateIsSet() const
{
    return m_Prev_job_stateIsSet;
}
void JobUpdateObject::unsetPrev_job_state()
{
    m_Prev_job_stateIsSet = false;
}
DispatchRoute JobUpdateObject::getRoute() const
{
    return m_Route;
}
void JobUpdateObject::setRoute(DispatchRoute const& value)
{
    m_Route = value;
    m_RouteIsSet = true;
}
bool JobUpdateObject::routeIsSet() const
{
    return m_RouteIsSet;
}
void JobUpdateObject::unsetRoute()
{
    m_RouteIsSet = false;
}
int64_t JobUpdateObject::getRouteId() const
{
    return m_Route_id;
}
void JobUpdateObject::setRouteId(int64_t const value)
{
    m_Route_id = value;
    m_Route_idIsSet = true;
}
bool JobUpdateObject::routeIdIsSet() const
{
    return m_Route_idIsSet;
}
void JobUpdateObject::unsetRoute_id()
{
    m_Route_idIsSet = false;
}

}
}
}
}

