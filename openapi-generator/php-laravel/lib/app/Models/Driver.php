<?php
/**
 * Driver
 */
namespace app\Models;

/**
 * Driver
 */
class Driver {

    /** @var bool $eldAdverseWeatherExemptionEnabled Flag indicating this driver may use Adverse Weather exemptions in ELD logs.*/
    private $eldAdverseWeatherExemptionEnabled;

    /** @var bool $eldBigDayExemptionEnabled Flag indicating this driver may use Big Day excemptions in ELD logs.*/
    private $eldBigDayExemptionEnabled;

    /** @var int $eldDayStartHour 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.*/
    private $eldDayStartHour;

    /** @var bool $eldExempt Flag indicating this driver is exempt from the Electronic Logging Mandate.*/
    private $eldExempt;

    /** @var string $eldExemptReason Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).*/
    private $eldExemptReason;

    /** @var bool $eldPcEnabled Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.*/
    private $eldPcEnabled;

    /** @var bool $eldYmEnabled Flag indicating this driver may select the Yard Move duty status in ELD logs.*/
    private $eldYmEnabled;

    /** @var map[string,string] $externalIds Dictionary of external IDs (string key-value pairs)*/
    private $externalIds;

    /** @var int $groupId ID of the group if the organization has multiple groups (uncommon).*/
    private $groupId;

    /** @var string $licenseNumber Driver&#39;s state issued license number.*/
    private $licenseNumber;

    /** @var string $licenseState Abbreviation of state that issued driver&#39;s license.*/
    private $licenseState;

    /** @var string $name Driver&#39;s name.*/
    private $name;

    /** @var string $notes Notes about the driver.*/
    private $notes;

    /** @var string $phone Driver&#39;s phone number. Please include only digits, ex. 4157771234*/
    private $phone;

    /** @var string $username Driver&#39;s login username into the driver app.*/
    private $username;

    /** @var int $vehicleId ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).*/
    private $vehicleId;

    /** @var int $id ID of the driver.*/
    private $id;

    /** @var bool $isDeactivated True if the driver account has been deactivated.*/
    private $isDeactivated;

    /** @var \app\Models\TagMetadata[] $tags */
    private $tags;

}
