<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject2
{
    /**
     * The address of the entry to add, as it would be recognized if provided to maps.google.com.
     * @DTA\Data(field="address")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $address;
    /**
     * Group ID to query.
     * @DTA\Data(field="groupId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * Name of the location to add to the address book.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Radius in meters of the address (used for matching vehicle trip stops to this location).
     * @DTA\Data(field="radius")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $radius;
}
