<?php
/**
 * User
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
 * Class representing the User model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class User 
{
        /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     *
     * @var string
     * @SerializedName("authType")
     * @Assert\NotNull()
     * @Assert\Choice({ "default", "saml" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $authType;

    /**
     * The email address of this user.
     *
     * @var string
     * @SerializedName("email")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $email;

    /**
     * The first and last name of the user.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     *
     * @var string|null
     * @SerializedName("organizationRoleId")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $organizationRoleId;

    /**
     * The ID of the User record.
     *
     * @var int|null
     * @SerializedName("id")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $id;

    /**
     * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     *
     * @var string|null
     * @SerializedName("organizationRole")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $organizationRole;

    /**
     * The specific tags this user has access to. This will be blank for users that have full access to the organization.
     *
     * @var OpenAPI\Server\Model\UserTagRole[]|null
     * @SerializedName("tagRoles")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\UserTagRole")
     * })
     * @Type("array<OpenAPI\Server\Model\UserTagRole>")
     */
    protected $tagRoles;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->authType = isset($data['authType']) ? $data['authType'] : null;
        $this->email = isset($data['email']) ? $data['email'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->organizationRoleId = isset($data['organizationRoleId']) ? $data['organizationRoleId'] : null;
        $this->id = isset($data['id']) ? $data['id'] : null;
        $this->organizationRole = isset($data['organizationRole']) ? $data['organizationRole'] : null;
        $this->tagRoles = isset($data['tagRoles']) ? $data['tagRoles'] : null;
    }

    /**
     * Gets authType.
     *
     * @return string
     */
    public function getAuthType()
    {
        return $this->authType;
    }

    /**
     * Sets authType.
     *
     * @param string $authType  The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     *
     * @return $this
     */
    public function setAuthType($authType)
    {
        $this->authType = $authType;

        return $this;
    }

    /**
     * Gets email.
     *
     * @return string
     */
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * Sets email.
     *
     * @param string $email  The email address of this user.
     *
     * @return $this
     */
    public function setEmail($email)
    {
        $this->email = $email;

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
     * @param string|null $name  The first and last name of the user.
     *
     * @return $this
     */
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets organizationRoleId.
     *
     * @return string|null
     */
    public function getOrganizationRoleId()
    {
        return $this->organizationRoleId;
    }

    /**
     * Sets organizationRoleId.
     *
     * @param string|null $organizationRoleId  The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     *
     * @return $this
     */
    public function setOrganizationRoleId($organizationRoleId = null)
    {
        $this->organizationRoleId = $organizationRoleId;

        return $this;
    }

    /**
     * Gets id.
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     *
     * @param int|null $id  The ID of the User record.
     *
     * @return $this
     */
    public function setId($id = null)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets organizationRole.
     *
     * @return string|null
     */
    public function getOrganizationRole()
    {
        return $this->organizationRole;
    }

    /**
     * Sets organizationRole.
     *
     * @param string|null $organizationRole  The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     *
     * @return $this
     */
    public function setOrganizationRole($organizationRole = null)
    {
        $this->organizationRole = $organizationRole;

        return $this;
    }

    /**
     * Gets tagRoles.
     *
     * @return OpenAPI\Server\Model\UserTagRole[]|null
     */
    public function getTagRoles()
    {
        return $this->tagRoles;
    }

    /**
     * Sets tagRoles.
     *
     * @param OpenAPI\Server\Model\UserTagRole[]|null $tagRoles  The specific tags this user has access to. This will be blank for users that have full access to the organization.
     *
     * @return $this
     */
    public function setTagRoles(array $tagRoles = null)
    {
        $this->tagRoles = $tagRoles;

        return $this;
    }
}


