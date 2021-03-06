<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 * @todo Write general description for this model
 */
class User implements JsonSerializable
{
    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a
     * configured SAML integration.
     * @required
     * @var string $authType public property
     */
    public $authType;

    /**
     * The email address of this user.
     * @required
     * @var string $email public property
     */
    public $email;

    /**
     * The first and last name of the user.
     * @var string|null $name public property
     */
    public $name;

    /**
     * The id of the role the user is assigned to at the organization level. This will be blank for users
     * that only have access to specific tags.
     * @var string|null $organizationRoleId public property
     */
    public $organizationRoleId;

    /**
     * The ID of the User record.
     * @var integer|null $id public property
     */
    public $id;

    /**
     * The name of the role the user is assigned to at the organization level. This will be blank for users
     * that only have access to specific tags.
     * @var string|null $organizationRole public property
     */
    public $organizationRole;

    /**
     * The specific tags this user has access to. This will be blank for users that have full access to the
     * organization.
     * @var \SamsaraAPILib\Models\UserTagRole[]|null $tagRoles public property
     */
    public $tagRoles;

    /**
     * Constructor to set initial or default values of member properties
     * @param string  $authType           Initialization value for $this->authType
     * @param string  $email              Initialization value for $this->email
     * @param string  $name               Initialization value for $this->name
     * @param string  $organizationRoleId Initialization value for $this->organizationRoleId
     * @param integer $id                 Initialization value for $this->id
     * @param string  $organizationRole   Initialization value for $this->organizationRole
     * @param array   $tagRoles           Initialization value for $this->tagRoles
     */
    public function __construct()
    {
        if (7 == func_num_args()) {
            $this->authType           = func_get_arg(0);
            $this->email              = func_get_arg(1);
            $this->name               = func_get_arg(2);
            $this->organizationRoleId = func_get_arg(3);
            $this->id                 = func_get_arg(4);
            $this->organizationRole   = func_get_arg(5);
            $this->tagRoles           = func_get_arg(6);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['authType']           = $this->authType;
        $json['email']              = $this->email;
        $json['name']               = $this->name;
        $json['organizationRoleId'] = $this->organizationRoleId;
        $json['id']                 = $this->id;
        $json['organizationRole']   = $this->organizationRole;
        $json['tagRoles']           = $this->tagRoles;

        return $json;
    }
}
