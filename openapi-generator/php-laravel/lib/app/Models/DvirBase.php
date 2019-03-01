<?php
/**
 * DvirBase
 */
namespace app\Models;

/**
 * DvirBase
 */
class DvirBase {

    /** @var \app\Models\DvirBaseAuthorSignature $authorSignature */
    private $authorSignature;

    /** @var bool $defectsCorrected Signifies if the defects on the vehicle corrected after the DVIR is done.*/
    private $defectsCorrected;

    /** @var bool $defectsNeedNotBeCorrected Signifies if the defects on this vehicle can be ignored.*/
    private $defectsNeedNotBeCorrected;

    /** @var int $id The id of this DVIR record.*/
    private $id;

    /** @var string $inspectionType Inspection type of the DVIR.*/
    private $inspectionType;

    /** @var string $mechanicNotes The mechanics notes on the DVIR.*/
    private $mechanicNotes;

    /** @var \app\Models\DvirBaseMechanicOrAgentSignature $mechanicOrAgentSignature */
    private $mechanicOrAgentSignature;

    /** @var \app\Models\DvirBaseNextDriverSignature $nextDriverSignature */
    private $nextDriverSignature;

    /** @var int $odometerMiles The odometer reading in miles for the vehicle when the DVIR was done.*/
    private $odometerMiles;

    /** @var int $timeMs Timestamp of this DVIR in UNIX milliseconds.*/
    private $timeMs;

    /** @var \app\Models\DvirBaseTrailerDefects[] $trailerDefects Defects registered for the trailer which was part of the DVIR.*/
    private $trailerDefects;

    /** @var int $trailerId The id of the trailer which was part of the DVIR.*/
    private $trailerId;

    /** @var string $trailerName The name of the trailer which was part of the DVIR.*/
    private $trailerName;

    /** @var \app\Models\DvirBaseVehicle $vehicle */
    private $vehicle;

    /** @var string $vehicleCondition The condition of vechile on which DVIR was done.*/
    private $vehicleCondition;

    /** @var \app\Models\DvirBaseTrailerDefects[] $vehicleDefects Defects registered for the vehicle which was part of the DVIR.*/
    private $vehicleDefects;

}
