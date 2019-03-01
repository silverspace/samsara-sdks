<?php
/**
 * InlineObject1
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the InlineObject1 model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class InlineObject1 
{
        /**
     * A list of IDs for contact book entries.
     *
     * @var int[]|null
     * @SerializedName("contactIds")
     * @Assert\All({
     *   @Assert\Type("int")
     * })
     * @Type("array<int>")
     */
    protected $contactIds;

    /**
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     *
     * @var string|null
     * @SerializedName("formattedAddress")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $formattedAddress;

    /**
     * @var OpenAPI\Server\Model\AddressGeofence|null
     * @SerializedName("geofence")
     * @Assert\Type("OpenAPI\Server\Model\AddressGeofence")
     * @Type("OpenAPI\Server\Model\AddressGeofence")
     */
    protected $geofence;

    /**
     * The name of this address/geofence
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * Notes associated with an address.
     *
     * @var string|null
     * @SerializedName("notes")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $notes;

    /**
     * A list of tag IDs.
     *
     * @var int[]|null
     * @SerializedName("tagIds")
     * @Assert\All({
     *   @Assert\Type("int")
     * })
     * @Type("array<int>")
     */
    protected $tagIds;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->contactIds = isset($data['contactIds']) ? $data['contactIds'] : null;
        $this->formattedAddress = isset($data['formattedAddress']) ? $data['formattedAddress'] : null;
        $this->geofence = isset($data['geofence']) ? $data['geofence'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->notes = isset($data['notes']) ? $data['notes'] : null;
        $this->tagIds = isset($data['tagIds']) ? $data['tagIds'] : null;
    }

    /**
     * Gets contactIds.
     *
     * @return int[]|null
     */
    public function getContactIds()
    {
        return $this->contactIds;
    }

    /**
     * Sets contactIds.
     *
     * @param int[]|null $contactIds  A list of IDs for contact book entries.
     *
     * @return $this
     */
    public function setContactIds(array $contactIds = null)
    {
        $this->contactIds = $contactIds;

        return $this;
    }

    /**
     * Gets formattedAddress.
     *
     * @return string|null
     */
    public function getFormattedAddress()
    {
        return $this->formattedAddress;
    }

    /**
     * Sets formattedAddress.
     *
     * @param string|null $formattedAddress  The full address associated with this address/geofence, as it might be recognized by maps.google.com
     *
     * @return $this
     */
    public function setFormattedAddress($formattedAddress = null)
    {
        $this->formattedAddress = $formattedAddress;

        return $this;
    }

    /**
     * Gets geofence.
     *
     * @return OpenAPI\Server\Model\AddressGeofence|null
     */
    public function getGeofence()
    {
        return $this->geofence;
    }

    /**
     * Sets geofence.
     *
     * @param OpenAPI\Server\Model\AddressGeofence|null $geofence
     *
     * @return $this
     */
    public function setGeofence(AddressGeofence $geofence = null)
    {
        $this->geofence = $geofence;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string|null $name  The name of this address/geofence
     *
     * @return $this
     */
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets notes.
     *
     * @return string|null
     */
    public function getNotes()
    {
        return $this->notes;
    }

    /**
     * Sets notes.
     *
     * @param string|null $notes  Notes associated with an address.
     *
     * @return $this
     */
    public function setNotes($notes = null)
    {
        $this->notes = $notes;

        return $this;
    }

    /**
     * Gets tagIds.
     *
     * @return int[]|null
     */
    public function getTagIds()
    {
        return $this->tagIds;
    }

    /**
     * Sets tagIds.
     *
     * @param int[]|null $tagIds  A list of tag IDs.
     *
     * @return $this
     */
    public function setTagIds(array $tagIds = null)
    {
        $this->tagIds = $tagIds;

        return $this;
    }
}


