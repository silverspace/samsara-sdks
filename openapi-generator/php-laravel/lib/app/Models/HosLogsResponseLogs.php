<?php
/**
 * HosLogsResponseLogs
 */
namespace app\Models;

/**
 * HosLogsResponseLogs
 */
class HosLogsResponseLogs {

    /** @var double $locLng Longitude at which the log was recorded.*/
    private $locLng;

    /** @var int $logStartMs The time at which the log/HOS status started in UNIX milliseconds.*/
    private $logStartMs;

    /** @var int $driverId ID of the driver.*/
    private $driverId;

    /** @var string $statusType The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.*/
    private $statusType;

    /** @var string $locCity City in which the log was recorded.*/
    private $locCity;

    /** @var int $groupId ID of the group.*/
    private $groupId;

    /** @var string $locName Name of location at which the log was recorded.*/
    private $locName;

    /** @var double $locLat Latitude at which the log was recorded.*/
    private $locLat;

    /** @var string $remark Remark associated with the log entry.*/
    private $remark;

    /** @var string $locState State in which the log was recorded.*/
    private $locState;

    /** @var int $vehicleId ID of the vehicle.*/
    private $vehicleId;

    /** @var int[] $codriverIds */
    private $codriverIds;

}
