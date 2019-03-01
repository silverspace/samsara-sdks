<?php
/**
 * InlineObject12
 */
namespace app\Models;

/**
 * InlineObject12
 */
class InlineObject12 {

    /** @var string $inspectionType Only type &#39;mechanic&#39; is currently accepted.*/
    private $inspectionType;

    /** @var string $mechanicNotes Any notes from the mechanic.*/
    private $mechanicNotes;

    /** @var int $odometerMiles The current odometer of the vehicle.*/
    private $odometerMiles;

    /** @var bool $previousDefectsCorrected Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.*/
    private $previousDefectsCorrected;

    /** @var bool $previousDefectsIgnored Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.*/
    private $previousDefectsIgnored;

    /** @var string $safe Whether or not this vehicle or trailer is safe to drive.*/
    private $safe;

    /** @var int $trailerId Id of trailer being inspected. Either vehicleId or trailerId must be provided.*/
    private $trailerId;

    /** @var string $userEmail The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.*/
    private $userEmail;

    /** @var int $vehicleId Id of vehicle being inspected. Either vehicleId or trailerId must be provided.*/
    private $vehicleId;

}
