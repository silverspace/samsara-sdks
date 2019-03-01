<?php
/**
 * UserBase
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

/**
 * UserBase
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class UserBase
{
    
    /** @var string $authType The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.*/
    private $authType;
    
    /** @var string $email The email address of this user.*/
    private $email;
    
    /** @var string $name The first and last name of the user.*/
    private $name;
    
    /** @var string $organizationRoleId The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.*/
    private $organizationRoleId;
}