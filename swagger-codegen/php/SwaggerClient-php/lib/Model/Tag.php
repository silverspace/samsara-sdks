<?php
/**
 * Tag
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Samsara API
 *
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.3-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * Tag Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Tag implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Tag';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'addresses' => '\Swagger\Client\Model\TaggedAddress[]',
        'assets' => '\Swagger\Client\Model\TaggedAsset[]',
        'drivers' => '\Swagger\Client\Model\TaggedDriver[]',
        'group_id' => 'int',
        'id' => 'int',
        'machines' => '\Swagger\Client\Model\TaggedMachine[]',
        'name' => 'string',
        'parent_tag_id' => 'int',
        'sensors' => '\Swagger\Client\Model\TaggedSensor[]',
        'vehicles' => '\Swagger\Client\Model\TaggedVehicle[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'addresses' => null,
        'assets' => null,
        'drivers' => null,
        'group_id' => 'int64',
        'id' => 'int64',
        'machines' => null,
        'name' => null,
        'parent_tag_id' => 'int64',
        'sensors' => null,
        'vehicles' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'addresses' => 'addresses',
        'assets' => 'assets',
        'drivers' => 'drivers',
        'group_id' => 'groupId',
        'id' => 'id',
        'machines' => 'machines',
        'name' => 'name',
        'parent_tag_id' => 'parentTagId',
        'sensors' => 'sensors',
        'vehicles' => 'vehicles'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'addresses' => 'setAddresses',
        'assets' => 'setAssets',
        'drivers' => 'setDrivers',
        'group_id' => 'setGroupId',
        'id' => 'setId',
        'machines' => 'setMachines',
        'name' => 'setName',
        'parent_tag_id' => 'setParentTagId',
        'sensors' => 'setSensors',
        'vehicles' => 'setVehicles'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'addresses' => 'getAddresses',
        'assets' => 'getAssets',
        'drivers' => 'getDrivers',
        'group_id' => 'getGroupId',
        'id' => 'getId',
        'machines' => 'getMachines',
        'name' => 'getName',
        'parent_tag_id' => 'getParentTagId',
        'sensors' => 'getSensors',
        'vehicles' => 'getVehicles'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['addresses'] = isset($data['addresses']) ? $data['addresses'] : null;
        $this->container['assets'] = isset($data['assets']) ? $data['assets'] : null;
        $this->container['drivers'] = isset($data['drivers']) ? $data['drivers'] : null;
        $this->container['group_id'] = isset($data['group_id']) ? $data['group_id'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['machines'] = isset($data['machines']) ? $data['machines'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['parent_tag_id'] = isset($data['parent_tag_id']) ? $data['parent_tag_id'] : null;
        $this->container['sensors'] = isset($data['sensors']) ? $data['sensors'] : null;
        $this->container['vehicles'] = isset($data['vehicles']) ? $data['vehicles'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets addresses
     *
     * @return \Swagger\Client\Model\TaggedAddress[]
     */
    public function getAddresses()
    {
        return $this->container['addresses'];
    }

    /**
     * Sets addresses
     *
     * @param \Swagger\Client\Model\TaggedAddress[] $addresses The addresses that belong to this tag.
     *
     * @return $this
     */
    public function setAddresses($addresses)
    {
        $this->container['addresses'] = $addresses;

        return $this;
    }

    /**
     * Gets assets
     *
     * @return \Swagger\Client\Model\TaggedAsset[]
     */
    public function getAssets()
    {
        return $this->container['assets'];
    }

    /**
     * Sets assets
     *
     * @param \Swagger\Client\Model\TaggedAsset[] $assets The assets that belong to this tag.
     *
     * @return $this
     */
    public function setAssets($assets)
    {
        $this->container['assets'] = $assets;

        return $this;
    }

    /**
     * Gets drivers
     *
     * @return \Swagger\Client\Model\TaggedDriver[]
     */
    public function getDrivers()
    {
        return $this->container['drivers'];
    }

    /**
     * Sets drivers
     *
     * @param \Swagger\Client\Model\TaggedDriver[] $drivers The drivers that belong to this tag.
     *
     * @return $this
     */
    public function setDrivers($drivers)
    {
        $this->container['drivers'] = $drivers;

        return $this;
    }

    /**
     * Gets group_id
     *
     * @return int
     */
    public function getGroupId()
    {
        return $this->container['group_id'];
    }

    /**
     * Sets group_id
     *
     * @param int $group_id The GroupID that this tag belongs to.
     *
     * @return $this
     */
    public function setGroupId($group_id)
    {
        $this->container['group_id'] = $group_id;

        return $this;
    }

    /**
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id The ID of this tag.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets machines
     *
     * @return \Swagger\Client\Model\TaggedMachine[]
     */
    public function getMachines()
    {
        return $this->container['machines'];
    }

    /**
     * Sets machines
     *
     * @param \Swagger\Client\Model\TaggedMachine[] $machines The machines that belong to this tag.
     *
     * @return $this
     */
    public function setMachines($machines)
    {
        $this->container['machines'] = $machines;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name Name of this tag.
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets parent_tag_id
     *
     * @return int
     */
    public function getParentTagId()
    {
        return $this->container['parent_tag_id'];
    }

    /**
     * Sets parent_tag_id
     *
     * @param int $parent_tag_id If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
     *
     * @return $this
     */
    public function setParentTagId($parent_tag_id)
    {
        $this->container['parent_tag_id'] = $parent_tag_id;

        return $this;
    }

    /**
     * Gets sensors
     *
     * @return \Swagger\Client\Model\TaggedSensor[]
     */
    public function getSensors()
    {
        return $this->container['sensors'];
    }

    /**
     * Sets sensors
     *
     * @param \Swagger\Client\Model\TaggedSensor[] $sensors The sensors that belong to this tag.
     *
     * @return $this
     */
    public function setSensors($sensors)
    {
        $this->container['sensors'] = $sensors;

        return $this;
    }

    /**
     * Gets vehicles
     *
     * @return \Swagger\Client\Model\TaggedVehicle[]
     */
    public function getVehicles()
    {
        return $this->container['vehicles'];
    }

    /**
     * Sets vehicles
     *
     * @param \Swagger\Client\Model\TaggedVehicle[] $vehicles The vehicles that belong to this tag.
     *
     * @return $this
     */
    public function setVehicles($vehicles)
    {
        $this->container['vehicles'] = $vehicles;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


