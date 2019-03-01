<?php
/**
 * HosAuthenticationLogsResponseAuthenticationLogs
 */
namespace app\Models;

/**
 * HosAuthenticationLogsResponseAuthenticationLogs
 */
class HosAuthenticationLogsResponseAuthenticationLogs {

    /** @var string $actionType The log type - one of &#39;signin&#39; or &#39;signout&#39;*/
    private $actionType;

    /** @var string $address Address at which the log was recorded, if applicable.*/
    private $address;

    /** @var string $city City in which the log was recorded, if applicable.*/
    private $city;

    /** @var int $happenedAtMs The time at which the event was recorded in UNIX milliseconds.*/
    private $happenedAtMs;

    /** @var string $addressName Address name from the group address book at which the log was recorded, if applicable.*/
    private $addressName;

    /** @var string $state State in which the log was recorded, if applicable.*/
    private $state;

}
