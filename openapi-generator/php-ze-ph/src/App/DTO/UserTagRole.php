<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UserTagRole
{
    /**
     * The name of the role the user has been granted on this tag.
     * @DTA\Data(field="role", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $role;
    /**
     * The id of the role the user has been granted on this tag.
     * @DTA\Data(field="roleId")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $role_id;
    /**
     * @DTA\Data(field="tag")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserTagRoleTag::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\UserTagRoleTag::class})
     * @var \App\DTO\UserTagRoleTag
     */
    public $tag;
}
