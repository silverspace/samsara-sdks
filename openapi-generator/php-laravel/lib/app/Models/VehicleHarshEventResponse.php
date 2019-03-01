<?php
/**
 * VehicleHarshEventResponse
 */
namespace app\Models;

/**
 * VehicleHarshEventResponse
 */
class VehicleHarshEventResponse {

    /** @var string $downloadForwardVideoUrl URL for downloading the forward facing video*/
    private $downloadForwardVideoUrl;

    /** @var string $downloadInwardVideoUrl URL for downloading the inward facing video*/
    private $downloadInwardVideoUrl;

    /** @var string $downloadTrackedInwardVideoUrl URL for downloading the tracked inward facing video*/
    private $downloadTrackedInwardVideoUrl;

    /** @var string $harshEventType Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]*/
    private $harshEventType;

    /** @var string $incidentReportUrl URL of the associated incident report page*/
    private $incidentReportUrl;

    /** @var bool $isDistracted Whether the driver was deemed distracted during this harsh event*/
    private $isDistracted;

    /** @var \app\Models\VehicleHarshEventResponseLocation $location */
    private $location;

}
