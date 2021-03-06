<?php
/**
 * FleetVehicleResponse
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
 * FleetVehicleResponse
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class FleetVehicleResponse
{
    
    /** @var map[string,string] $externalIds */
    private $externalIds;
    
    /** @var string $harshAccelSetting Harsh event detection setting.*/
    private $harshAccelSetting;
    
    /** @var int $id ID of the vehicle.*/
    private $id;
    
    /** @var string $name Name of the vehicle.*/
    private $name;
    
    /** @var \OpenAPIServer\Model\FleetVehicleResponseVehicleInfo $vehicleInfo */
    private $vehicleInfo;
}
