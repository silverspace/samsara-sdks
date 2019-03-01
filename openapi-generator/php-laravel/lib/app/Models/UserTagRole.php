<?php
/**
 * UserTagRole
 */
namespace app\Models;

/**
 * UserTagRole
 */
class UserTagRole {

    /** @var string $role The name of the role the user has been granted on this tag.*/
    private $role;

    /** @var string $roleId The id of the role the user has been granted on this tag.*/
    private $roleId;

    /** @var \app\Models\UserTagRoleTag $tag */
    private $tag;

}
