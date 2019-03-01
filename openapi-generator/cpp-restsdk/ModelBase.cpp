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

#include "ModelBase.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ModelBase::ModelBase()
{
}
ModelBase::~ModelBase()
{
}

web::json::value ModelBase::toJson( const utility::string_t& value )
{
    return web::json::value::string(value);
}
web::json::value ModelBase::toJson( const utility::datetime& value )
{
    return web::json::value::string(value.to_string(utility::datetime::ISO_8601));
}
web::json::value ModelBase::toJson( int32_t value )
{
    return web::json::value::number(value);
}
web::json::value ModelBase::toJson( int64_t value )
{
    return web::json::value::number(value);
}
web::json::value ModelBase::toJson( double value )
{
    return web::json::value::number(value);
} 
web::json::value ModelBase::toJson(bool value) {
    return web::json::value::boolean(value);
}

web::json::value ModelBase::toJson( std::shared_ptr<HttpContent> content )
{
    web::json::value value;
    value[utility::conversions::to_string_t("ContentDisposition")] = ModelBase::toJson(content->getContentDisposition());
    value[utility::conversions::to_string_t("ContentType")] = ModelBase::toJson(content->getContentType());
    value[utility::conversions::to_string_t("FileName")] = ModelBase::toJson(content->getFileName());
    value[utility::conversions::to_string_t("InputStream")] = web::json::value::string( ModelBase::toBase64(content->getData()) );
    return value;
}

std::shared_ptr<HttpContent> ModelBase::fileFromJson(const web::json::value& val)
{
    std::shared_ptr<HttpContent> content(new HttpContent);

    if(val.has_field(utility::conversions::to_string_t("ContentDisposition")))
    {
        content->setContentDisposition( ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("ContentDisposition"))) );
    }
    if(val.has_field(utility::conversions::to_string_t("ContentType")))
    {
        content->setContentType( ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("ContentType"))) );
    }
    if(val.has_field(utility::conversions::to_string_t("FileName")))
    {
        content->setFileName( ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("FileName"))) );
    }
    if(val.has_field(utility::conversions::to_string_t("InputStream")))
    {
        content->setData( ModelBase::fromBase64( ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("InputStream")))) );
    }

    return content;
}

web::json::value ModelBase::toJson( std::shared_ptr<ModelBase> content )
{
    return content.get() ? content->toJson() : web::json::value::null();
}

std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const utility::string_t& value, const utility::string_t& contentType)
{
    std::shared_ptr<HttpContent> content(new HttpContent);
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(value) ) ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const utility::datetime& value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(value.to_string(utility::datetime::ISO_8601) ) ) ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, std::shared_ptr<HttpContent> value )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( value->getContentDisposition() );
    content->setContentType( value->getContentType() );
    content->setData( value->getData() );
    content->setFileName( value->getFileName() );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const web::json::value& value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(value.serialize()) ) ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, int32_t value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
	std::stringstream* valueAsStringStream = new std::stringstream();
	(*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, int64_t value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
	std::stringstream* valueAsStringStream = new std::stringstream();
	(*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream) ) ;
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, double value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
	std::stringstream* valueAsStringStream = new std::stringstream();
	(*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream ) );
    return content;
}

// base64 encoding/decoding based on : https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/Base64#C.2B.2B
const static char Base64Chars[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
const static char Base64PadChar = '=';
utility::string_t ModelBase::toBase64( utility::string_t value )
{
    std::shared_ptr<std::istream> source( new std::stringstream( utility::conversions::to_utf8string(value) ) );
    return ModelBase::toBase64(source);
}
utility::string_t ModelBase::toBase64( std::shared_ptr<std::istream> value )
{
    value->seekg( 0, value->end );
    size_t length = value->tellg();
    value->seekg( 0, value->beg );
    utility::string_t base64;
    base64.reserve( ((length / 3) + (length % 3 > 0)) * 4 );
    char read[3] = { 0 };
    uint32_t temp;
    for ( size_t idx = 0; idx < length / 3; idx++ )
    {
        value->read( read, 3 );
        temp = (read[0]) << 16;
        temp += (read[1]) << 8;
        temp += (read[2]);
        base64.append( 1, Base64Chars[(temp & 0x00FC0000) >> 18] );
        base64.append( 1, Base64Chars[(temp & 0x0003F000) >> 12] );
        base64.append( 1, Base64Chars[(temp & 0x00000FC0) >> 6] );
        base64.append( 1, Base64Chars[(temp & 0x0000003F)] );
    }
    switch ( length % 3 )
    {
        case 1:
            value->read( read, 1 );
            temp = read[0] << 16;
            base64.append( 1, Base64Chars[(temp & 0x00FC0000) >> 18] );
            base64.append( 1, Base64Chars[(temp & 0x0003F000) >> 12] );
            base64.append( 2, Base64PadChar );
            break;
        case 2:
            value->read( read, 2 );
            temp = read[0] << 16;
            temp += read[1] << 8;
            base64.append( 1, Base64Chars[(temp & 0x00FC0000) >> 18] );
            base64.append( 1, Base64Chars[(temp & 0x0003F000) >> 12] );
            base64.append( 1, Base64Chars[(temp & 0x00000FC0) >> 6] );
            base64.append( 1, Base64PadChar );
            break;
    }
    return base64;
}


std::shared_ptr<std::istream> ModelBase::fromBase64( const utility::string_t& encoded )
{
    std::shared_ptr<std::stringstream> result(new std::stringstream);

    char outBuf[3] = { 0 };
    uint32_t temp = 0;

    utility::string_t::const_iterator cursor = encoded.begin();
    while ( cursor < encoded.end() )
    {
        for ( size_t quantumPosition = 0; quantumPosition < 4; quantumPosition++ )
        {
            temp <<= 6;
            if ( *cursor >= 0x41 && *cursor <= 0x5A )
            {
                temp |= *cursor - 0x41;
            }
            else if ( *cursor >= 0x61 && *cursor <= 0x7A )
            {
                temp |= *cursor - 0x47;
            }
            else if ( *cursor >= 0x30 && *cursor <= 0x39 )
            {
                temp |= *cursor + 0x04;
            }
            else if ( *cursor == 0x2B )
            {
                temp |= 0x3E; //change to 0x2D for URL alphabet
            }
            else if ( *cursor == 0x2F )
            {
                temp |= 0x3F; //change to 0x5F for URL alphabet
            }
            else if ( *cursor == Base64PadChar ) //pad
            {
                switch ( encoded.end() - cursor )
                {
                    case 1: //One pad character
                        outBuf[0] = (temp >> 16) & 0x000000FF;
                        outBuf[1] = (temp >> 8) & 0x000000FF;
                        result->write( outBuf, 2 );
                        return result;
                    case 2: //Two pad characters
                        outBuf[0] = (temp >> 10) & 0x000000FF;
                        result->write( outBuf, 1 );
                        return result;
                    default:
                        throw web::json::json_exception( utility::conversions::to_string_t( "Invalid Padding in Base 64!" ).c_str() );
                }
            }
            else
            {
                throw web::json::json_exception( utility::conversions::to_string_t( "Non-Valid Character in Base 64!" ).c_str() );
            }
            ++cursor;
        }

        outBuf[0] = (temp >> 16) & 0x000000FF;
        outBuf[1] = (temp >> 8) & 0x000000FF;
        outBuf[2] = (temp) & 0x000000FF;
        result->write( outBuf, 3 );
    }

    return result;
}

int64_t ModelBase::int64_tFromJson(const web::json::value& val)
{
    return val.as_number().to_int64();
}
int32_t ModelBase::int32_tFromJson(const web::json::value& val)
{
    return val.as_integer();
}
float ModelBase::floatFromJson(const web::json::value& val)
{
    return static_cast<float>(val.as_double());
}
utility::string_t ModelBase::stringFromJson(const web::json::value& val)
{
    return val.is_string() ? val.as_string() : utility::conversions::to_string_t("");
}

utility::datetime ModelBase::dateFromJson(const web::json::value& val)
{
    return utility::datetime::from_string(val.as_string(), utility::datetime::ISO_8601);
}
bool ModelBase::boolFromJson(const web::json::value& val)
{
    return val.as_bool();
}
double ModelBase::doubleFromJson(const web::json::value& val)
{
    return val.as_double();
}

int64_t ModelBase::int64_tFromHttpContent(std::shared_ptr<HttpContent> val)
{
    utility::string_t str = ModelBase::stringFromHttpContent(val);

    utility::stringstream_t ss(str);
    int64_t result = 0;
    ss >> result;
    return result;
}
int32_t ModelBase::int32_tFromHttpContent(std::shared_ptr<HttpContent> val)
{
    utility::string_t str = ModelBase::stringFromHttpContent(val);

    utility::stringstream_t ss(str);
    int32_t result = 0;
    ss >> result;
    return result;
}
float ModelBase::floatFromHttpContent(std::shared_ptr<HttpContent> val)
{
    utility::string_t str = ModelBase::stringFromHttpContent(val);

    utility::stringstream_t ss(str);
    float result = 0;
    ss >> result;
    return result;
}
utility::string_t ModelBase::stringFromHttpContent(std::shared_ptr<HttpContent> val)
{
    std::shared_ptr<std::istream> data = val->getData();
    data->seekg( 0, data->beg );

    std::string str((std::istreambuf_iterator<char>(*data.get())),
                 std::istreambuf_iterator<char>());

    return utility::conversions::to_string_t(str);
}
utility::datetime ModelBase::dateFromHttpContent(std::shared_ptr<HttpContent> val)
{
    utility::string_t str = ModelBase::stringFromHttpContent(val);
    return utility::datetime::from_string(str, utility::datetime::ISO_8601);
}

bool ModelBase::boolFromHttpContent(std::shared_ptr<HttpContent> val)
{
    utility::string_t str = ModelBase::stringFromHttpContent(val);

    utility::stringstream_t ss(str);
    bool result = false;
    ss >> result;
    return result;
}
double ModelBase::doubleFromHttpContent(std::shared_ptr<HttpContent> val)
{
    utility::string_t str = ModelBase::stringFromHttpContent(val);

    utility::stringstream_t ss(str);
    double result = 0.0;
    ss >> result;
    return result;
}

web::json::value ModelBase::valueFromHttpContent(std::shared_ptr<HttpContent> val)
{
    utility::string_t str = ModelBase::stringFromHttpContent(val);
    return web::json::value::parse(str);
}

}
}
}
}
