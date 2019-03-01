<?php
/**
 * DvirBaseNextDriverSignature
 */
namespace app\Models;

/**
 * DvirBaseNextDriverSignature
 */
class DvirBaseNextDriverSignature {

    /** @var int $driverId ID of the driver who signed the DVIR*/
    private $driverId;

    /** @var string $name The name of the driver who signed the next DVIR on this vehicle.*/
    private $name;

    /** @var int $signedAt The time in millis when the next driver signed the DVIR on this vehicle.*/
    private $signedAt;

    /** @var string $type Type corresponds to driver.*/
    private $type;

    /** @var string $email Email of the  driver who signed the next DVIR on this vehicle.*/
    private $email;

    /** @var string $username Username of the  driver who signed the next DVIR on this vehicle.*/
    private $username;

}
