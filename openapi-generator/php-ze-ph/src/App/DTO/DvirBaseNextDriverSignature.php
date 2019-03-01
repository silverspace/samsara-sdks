<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The next driver signature for the DVIR.
 */
class DvirBaseNextDriverSignature
{
    /**
     * ID of the driver who signed the DVIR
     * @DTA\Data(field="driverId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * The name of the driver who signed the next DVIR on this vehicle.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * The time in millis when the next driver signed the DVIR on this vehicle.
     * @DTA\Data(field="signedAt", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $signed_at;
    /**
     * Type corresponds to driver.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $type;
    /**
     * Email of the  driver who signed the next DVIR on this vehicle.
     * @DTA\Data(field="email", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $email;
    /**
     * Username of the  driver who signed the next DVIR on this vehicle.
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $username;
}
