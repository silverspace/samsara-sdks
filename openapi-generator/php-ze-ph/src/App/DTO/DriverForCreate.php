<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DriverForCreate
{
    /**
     * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
     * @DTA\Data(field="eldAdverseWeatherExemptionEnabled", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $eld_adverse_weather_exemption_enabled;
    /**
     * Flag indicating this driver may use Big Day excemptions in ELD logs.
     * @DTA\Data(field="eldBigDayExemptionEnabled", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $eld_big_day_exemption_enabled;
    /**
     * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
     * @DTA\Data(field="eldDayStartHour", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $eld_day_start_hour;
    /**
     * Flag indicating this driver is exempt from the Electronic Logging Mandate.
     * @DTA\Data(field="eldExempt", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $eld_exempt;
    /**
     * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
     * @DTA\Data(field="eldExemptReason", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $eld_exempt_reason;
    /**
     * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
     * @DTA\Data(field="eldPcEnabled", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $eld_pc_enabled;
    /**
     * Flag indicating this driver may select the Yard Move duty status in ELD logs.
     * @DTA\Data(field="eldYmEnabled", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $eld_ym_enabled;
    /**
     * Dictionary of external IDs (string key-value pairs)
     * @DTA\Data(field="externalIds", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"string"}}
     * }})
     * @var map[string,string]
     */
    public $external_ids;
    /**
     * ID of the group if the organization has multiple groups (uncommon).
     * @DTA\Data(field="groupId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * Driver&#39;s state issued license number.
     * @DTA\Data(field="licenseNumber", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $license_number;
    /**
     * Abbreviation of state that issued driver&#39;s license.
     * @DTA\Data(field="licenseState", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $license_state;
    /**
     * Driver&#39;s name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Notes about the driver.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $notes;
    /**
     * Driver&#39;s phone number. Please include only digits, ex. 4157771234
     * @DTA\Data(field="phone", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $phone;
    /**
     * Driver&#39;s login username into the driver app.
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $username;
    /**
     * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
     * @DTA\Data(field="vehicleId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
    /**
     * Driver&#39;s password for the driver app.
     * @DTA\Data(field="password")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $password;
    /**
     * A list of tag IDs.
     * @DTA\Data(field="tagIds", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"int"}}
     * }})
     * @var int[]
     */
    public $tag_ids;
}
