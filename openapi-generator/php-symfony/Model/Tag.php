<?php
/**
 * Tag
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
 * Class representing the Tag model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class Tag 
{
        /**
     * The addresses that belong to this tag.
     *
     * @var OpenAPI\Server\Model\TaggedAddress[]|null
     * @SerializedName("addresses")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TaggedAddress")
     * })
     * @Type("array<OpenAPI\Server\Model\TaggedAddress>")
     */
    protected $addresses;

    /**
     * The assets that belong to this tag.
     *
     * @var OpenAPI\Server\Model\TaggedAsset[]|null
     * @SerializedName("assets")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TaggedAsset")
     * })
     * @Type("array<OpenAPI\Server\Model\TaggedAsset>")
     */
    protected $assets;

    /**
     * The drivers that belong to this tag.
     *
     * @var OpenAPI\Server\Model\TaggedDriver[]|null
     * @SerializedName("drivers")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TaggedDriver")
     * })
     * @Type("array<OpenAPI\Server\Model\TaggedDriver>")
     */
    protected $drivers;

    /**
     * The GroupID that this tag belongs to.
     *
     * @var int|null
     * @SerializedName("groupId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $groupId;

    /**
     * The ID of this tag.
     *
     * @var int
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * The machines that belong to this tag.
     *
     * @var OpenAPI\Server\Model\TaggedMachine[]|null
     * @SerializedName("machines")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TaggedMachine")
     * })
     * @Type("array<OpenAPI\Server\Model\TaggedMachine>")
     */
    protected $machines;

    /**
     * Name of this tag.
     *
     * @var string
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
     *
     * @var int|null
     * @SerializedName("parentTagId")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $parentTagId;

    /**
     * The sensors that belong to this tag.
     *
     * @var OpenAPI\Server\Model\TaggedSensor[]|null
     * @SerializedName("sensors")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TaggedSensor")
     * })
     * @Type("array<OpenAPI\Server\Model\TaggedSensor>")
     */
    protected $sensors;

    /**
     * The vehicles that belong to this tag.
     *
     * @var OpenAPI\Server\Model\TaggedVehicle[]|null
     * @SerializedName("vehicles")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TaggedVehicle")
     * })
     * @Type("array<OpenAPI\Server\Model\TaggedVehicle>")
     */
    protected $vehicles;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->addresses = isset($data['addresses']) ? $data['addresses'] : null;
        $this->assets = isset($data['assets']) ? $data['assets'] : null;
        $this->drivers = isset($data['drivers']) ? $data['drivers'] : null;
        $this->groupId = isset($data['groupId']) ? $data['groupId'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->machines = isset($data['machines']) ? $data['machines'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->parentTagId = isset($data['parentTagId']) ? $data['parentTagId'] : null;
        $this->sensors = isset($data['sensors']) ? $data['sensors'] : null;
        $this->vehicles = isset($data['vehicles']) ? $data['vehicles'] : null;
    }

    /**
     * Gets addresses.
     *
     * @return OpenAPI\Server\Model\TaggedAddress[]|null
     */
    public function getAddresses()
    {
        return $this->addresses;
    }

    /**
     * Sets addresses.
     *
     * @param OpenAPI\Server\Model\TaggedAddress[]|null $addresses  The addresses that belong to this tag.
     *
     * @return $this
     */
    public function setAddresses(array $addresses = null)
    {
        $this->addresses = $addresses;

        return $this;
    }

    /**
     * Gets assets.
     *
     * @return OpenAPI\Server\Model\TaggedAsset[]|null
     */
    public function getAssets()
    {
        return $this->assets;
    }

    /**
     * Sets assets.
     *
     * @param OpenAPI\Server\Model\TaggedAsset[]|null $assets  The assets that belong to this tag.
     *
     * @return $this
     */
    public function setAssets(array $assets = null)
    {
        $this->assets = $assets;

        return $this;
    }

    /**
     * Gets drivers.
     *
     * @return OpenAPI\Server\Model\TaggedDriver[]|null
     */
    public function getDrivers()
    {
        return $this->drivers;
    }

    /**
     * Sets drivers.
     *
     * @param OpenAPI\Server\Model\TaggedDriver[]|null $drivers  The drivers that belong to this tag.
     *
     * @return $this
     */
    public function setDrivers(array $drivers = null)
    {
        $this->drivers = $drivers;

        return $this;
    }

    /**
     * Gets groupId.
     *
     * @return int|null
     */
    public function getGroupId()
    {
        return $this->groupId;
    }

    /**
     * Sets groupId.
     *
     * @param int|null $groupId  The GroupID that this tag belongs to.
     *
     * @return $this
     */
    public function setGroupId($groupId = null)
    {
        $this->groupId = $groupId;

        return $this;
    }

    /**
     * Gets id.
     *
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     *
     * @param int $id  The ID of this tag.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets machines.
     *
     * @return OpenAPI\Server\Model\TaggedMachine[]|null
     */
    public function getMachines()
    {
        return $this->machines;
    }

    /**
     * Sets machines.
     *
     * @param OpenAPI\Server\Model\TaggedMachine[]|null $machines  The machines that belong to this tag.
     *
     * @return $this
     */
    public function setMachines(array $machines = null)
    {
        $this->machines = $machines;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     *
     * @param string $name  Name of this tag.
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets parentTagId.
     *
     * @return int|null
     */
    public function getParentTagId()
    {
        return $this->parentTagId;
    }

    /**
     * Sets parentTagId.
     *
     * @param int|null $parentTagId  If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     *
     * @return $this
     */
    public function setParentTagId($parentTagId = null)
    {
        $this->parentTagId = $parentTagId;

        return $this;
    }

    /**
     * Gets sensors.
     *
     * @return OpenAPI\Server\Model\TaggedSensor[]|null
     */
    public function getSensors()
    {
        return $this->sensors;
    }

    /**
     * Sets sensors.
     *
     * @param OpenAPI\Server\Model\TaggedSensor[]|null $sensors  The sensors that belong to this tag.
     *
     * @return $this
     */
    public function setSensors(array $sensors = null)
    {
        $this->sensors = $sensors;

        return $this;
    }

    /**
     * Gets vehicles.
     *
     * @return OpenAPI\Server\Model\TaggedVehicle[]|null
     */
    public function getVehicles()
    {
        return $this->vehicles;
    }

    /**
     * Sets vehicles.
     *
     * @param OpenAPI\Server\Model\TaggedVehicle[]|null $vehicles  The vehicles that belong to this tag.
     *
     * @return $this
     */
    public function setVehicles(array $vehicles = null)
    {
        $this->vehicles = $vehicles;

        return $this;
    }
}


