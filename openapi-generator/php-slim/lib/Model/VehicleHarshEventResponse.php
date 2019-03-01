<?php
/**
 * VehicleHarshEventResponse
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

/**
 * VehicleHarshEventResponse
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class VehicleHarshEventResponse
{
    
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
    
    /** @var \OpenAPIServer\Model\VehicleHarshEventResponseLocation $location */
    private $location;
}
