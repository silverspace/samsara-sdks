<?php
/**
 * User
 */
namespace app\Models;

/**
 * User
 */
class User {

    /** @var string $authType The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.*/
    private $authType;

    /** @var string $email The email address of this user.*/
    private $email;

    /** @var string $name The first and last name of the user.*/
    private $name;

    /** @var string $organizationRoleId The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.*/
    private $organizationRoleId;

    /** @var int $id The ID of the User record.*/
    private $id;

    /** @var string $organizationRole The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.*/
    private $organizationRole;

    /** @var \app\Models\UserTagRole[] $tagRoles The specific tags this user has access to. This will be blank for users that have full access to the organization.*/
    private $tagRoles;

}
