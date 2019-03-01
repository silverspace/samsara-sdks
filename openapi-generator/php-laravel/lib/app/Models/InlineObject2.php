<?php
/**
 * InlineObject2
 */
namespace app\Models;

/**
 * InlineObject2
 */
class InlineObject2 {

    /** @var string $address The address of the entry to add, as it would be recognized if provided to maps.google.com.*/
    private $address;

    /** @var int $groupId Group ID to query.*/
    private $groupId;

    /** @var string $name Name of the location to add to the address book.*/
    private $name;

    /** @var int $radius Radius in meters of the address (used for matching vehicle trip stops to this location).*/
    private $radius;

}
