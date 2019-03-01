<?php
/**
 * Vehicle
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
 * Vehicle
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class Vehicle
{
    
    /** @var int $engineHours Total engine hours for the vehicle.*/
    private $engineHours;
    
    /** @var double $fuelLevelPercent The fuel level of the vehicle as a percentage. (0.0 to 1.0)*/
    private $fuelLevelPercent;
    
    /** @var int $id ID of the vehicle.*/
    private $id;
    
    /** @var string $name Name of the vehicle.*/
    private $name;
    
    /** @var string $note */
    private $note;
    
    /** @var int $odometerMeters The number of meters reported by the odometer.*/
    private $odometerMeters;
    
    /** @var string $vin Vehicle Identification Number.*/
    private $vin;
}
