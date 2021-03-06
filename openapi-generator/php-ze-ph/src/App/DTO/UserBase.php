<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UserBase
{
    /**
     * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
     * @DTA\Data(field="authType")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $auth_type;
    /**
     * The email address of this user.
     * @DTA\Data(field="email")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $email;
    /**
     * The first and last name of the user.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
     * @DTA\Data(field="organizationRoleId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $organization_role_id;
}
