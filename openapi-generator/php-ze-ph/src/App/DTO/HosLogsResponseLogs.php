<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class HosLogsResponseLogs
{
    /**
     * Longitude at which the log was recorded.
     * @DTA\Data(field="locLng", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $loc_lng;
    /**
     * The time at which the log/HOS status started in UNIX milliseconds.
     * @DTA\Data(field="logStartMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $log_start_ms;
    /**
     * ID of the driver.
     * @DTA\Data(field="driverId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
     * @DTA\Data(field="statusType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $status_type;
    /**
     * City in which the log was recorded.
     * @DTA\Data(field="locCity", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $loc_city;
    /**
     * ID of the group.
     * @DTA\Data(field="groupId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * Name of location at which the log was recorded.
     * @DTA\Data(field="locName", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $loc_name;
    /**
     * Latitude at which the log was recorded.
     * @DTA\Data(field="locLat", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $loc_lat;
    /**
     * Remark associated with the log entry.
     * @DTA\Data(field="remark", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $remark;
    /**
     * State in which the log was recorded.
     * @DTA\Data(field="locState", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $loc_state;
    /**
     * ID of the vehicle.
     * @DTA\Data(field="vehicleId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
    /**
     * @DTA\Data(field="codriverIds", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"int"}}
     * }})
     * @var int[]
     */
    public $codriver_ids;
}
