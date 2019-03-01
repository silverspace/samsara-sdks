<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject12
{
    /**
     * Only type &#39;mechanic&#39; is currently accepted.
     * @DTA\Data(field="inspectionType")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $inspection_type;
    /**
     * Any notes from the mechanic.
     * @DTA\Data(field="mechanicNotes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $mechanic_notes;
    /**
     * The current odometer of the vehicle.
     * @DTA\Data(field="odometerMiles", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $odometer_miles;
    /**
     * Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
     * @DTA\Data(field="previousDefectsCorrected", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $previous_defects_corrected;
    /**
     * Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
     * @DTA\Data(field="previousDefectsIgnored", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $previous_defects_ignored;
    /**
     * Whether or not this vehicle or trailer is safe to drive.
     * @DTA\Data(field="safe")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $safe;
    /**
     * Id of trailer being inspected. Either vehicleId or trailerId must be provided.
     * @DTA\Data(field="trailerId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $trailer_id;
    /**
     * The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.
     * @DTA\Data(field="userEmail")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $user_email;
    /**
     * Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
     * @DTA\Data(field="vehicleId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
}
