<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Harsh event details for a vehicle
 */
class VehicleHarshEventResponse
{
    /**
     * URL for downloading the forward facing video
     * @DTA\Data(field="downloadForwardVideoUrl", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $download_forward_video_url;
    /**
     * URL for downloading the inward facing video
     * @DTA\Data(field="downloadInwardVideoUrl", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $download_inward_video_url;
    /**
     * URL for downloading the tracked inward facing video
     * @DTA\Data(field="downloadTrackedInwardVideoUrl", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $download_tracked_inward_video_url;
    /**
     * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
     * @DTA\Data(field="harshEventType")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $harsh_event_type;
    /**
     * URL of the associated incident report page
     * @DTA\Data(field="incidentReportUrl")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $incident_report_url;
    /**
     * Whether the driver was deemed distracted during this harsh event
     * @DTA\Data(field="isDistracted", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $is_distracted;
    /**
     * @DTA\Data(field="location", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VehicleHarshEventResponseLocation::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\VehicleHarshEventResponseLocation::class})
     * @var \App\DTO\VehicleHarshEventResponseLocation
     */
    public $location;
}
