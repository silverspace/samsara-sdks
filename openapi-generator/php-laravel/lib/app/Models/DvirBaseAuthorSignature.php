<?php
/**
 * DvirBaseAuthorSignature
 */
namespace app\Models;

/**
 * DvirBaseAuthorSignature
 */
class DvirBaseAuthorSignature {

    /** @var int $mechanicUserId ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.*/
    private $mechanicUserId;

    /** @var int $driverId ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.*/
    private $driverId;

    /** @var string $name The name of the driver or mechanic who signed the DVIR.*/
    private $name;

    /** @var int $signedAt The time in millis when the DVIR was signed*/
    private $signedAt;

    /** @var string $type Type corresponds to whether the signature corresponds to driver|mechanic.*/
    private $type;

    /** @var string $email Email of the  driver|mechanic who signed the DVIR.*/
    private $email;

    /** @var string $username Username of the  driver|mechanic who signed the DVIR.*/
    private $username;

}
