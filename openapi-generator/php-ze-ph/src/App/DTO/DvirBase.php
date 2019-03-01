<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DvirBase
{
    /**
     * @DTA\Data(field="authorSignature", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DvirBaseAuthorSignature::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\DvirBaseAuthorSignature::class})
     * @var \App\DTO\DvirBaseAuthorSignature
     */
    public $author_signature;
    /**
     * Signifies if the defects on the vehicle corrected after the DVIR is done.
     * @DTA\Data(field="defectsCorrected", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $defects_corrected;
    /**
     * Signifies if the defects on this vehicle can be ignored.
     * @DTA\Data(field="defectsNeedNotBeCorrected", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $defects_need_not_be_corrected;
    /**
     * The id of this DVIR record.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Inspection type of the DVIR.
     * @DTA\Data(field="inspectionType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $inspection_type;
    /**
     * The mechanics notes on the DVIR.
     * @DTA\Data(field="mechanicNotes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $mechanic_notes;
    /**
     * @DTA\Data(field="mechanicOrAgentSignature", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DvirBaseMechanicOrAgentSignature::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\DvirBaseMechanicOrAgentSignature::class})
     * @var \App\DTO\DvirBaseMechanicOrAgentSignature
     */
    public $mechanic_or_agent_signature;
    /**
     * @DTA\Data(field="nextDriverSignature", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DvirBaseNextDriverSignature::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\DvirBaseNextDriverSignature::class})
     * @var \App\DTO\DvirBaseNextDriverSignature
     */
    public $next_driver_signature;
    /**
     * The odometer reading in miles for the vehicle when the DVIR was done.
     * @DTA\Data(field="odometerMiles", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $odometer_miles;
    /**
     * Timestamp of this DVIR in UNIX milliseconds.
     * @DTA\Data(field="timeMs", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time_ms;
    /**
     * Defects registered for the trailer which was part of the DVIR.
     * @DTA\Data(field="trailerDefects", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DvirBaseTrailerDefects::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DvirBaseTrailerDefects::class}}
     * }})
     * @var \App\DTO\DvirBaseTrailerDefects[]
     */
    public $trailer_defects;
    /**
     * The id of the trailer which was part of the DVIR.
     * @DTA\Data(field="trailerId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $trailer_id;
    /**
     * The name of the trailer which was part of the DVIR.
     * @DTA\Data(field="trailerName", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $trailer_name;
    /**
     * @DTA\Data(field="vehicle", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DvirBaseVehicle::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\DvirBaseVehicle::class})
     * @var \App\DTO\DvirBaseVehicle
     */
    public $vehicle;
    /**
     * The condition of vechile on which DVIR was done.
     * @DTA\Data(field="vehicleCondition", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $vehicle_condition;
    /**
     * Defects registered for the vehicle which was part of the DVIR.
     * @DTA\Data(field="vehicleDefects", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DvirBaseTrailerDefects::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DvirBaseTrailerDefects::class}}
     * }})
     * @var \App\DTO\DvirBaseTrailerDefects[]
     */
    public $vehicle_defects;
}
