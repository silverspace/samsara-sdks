<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The mechanic&#39;s or agent&#39;s signature for the DVIR.
 */
class DvirBaseMechanicOrAgentSignature
{
    /**
     * ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
     * @DTA\Data(field="mechanicUserId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $mechanic_user_id;
    /**
     * ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
     * @DTA\Data(field="driverId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * The name of the agent or mechanic who signed the DVIR.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * The time in millis when the DVIR was signed
     * @DTA\Data(field="signedAt", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $signed_at;
    /**
     * Type corresponds to whether the signature corresponds to driver|mechanic.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $type;
    /**
     * Email of the  agent|mechanic who signed the DVIR.
     * @DTA\Data(field="email", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $email;
    /**
     * Username of the  agent|mechanic who signed the DVIR.
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $username;
}
