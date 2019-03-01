<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class HosAuthenticationLogsResponseAuthenticationLogs
{
    /**
     * The log type - one of &#39;signin&#39; or &#39;signout&#39;
     * @DTA\Data(field="actionType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $action_type;
    /**
     * Address at which the log was recorded, if applicable.
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $address;
    /**
     * City in which the log was recorded, if applicable.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $city;
    /**
     * The time at which the event was recorded in UNIX milliseconds.
     * @DTA\Data(field="happenedAtMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $happened_at_ms;
    /**
     * Address name from the group address book at which the log was recorded, if applicable.
     * @DTA\Data(field="addressName", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $address_name;
    /**
     * State in which the log was recorded, if applicable.
     * @DTA\Data(field="state", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $state;
}
