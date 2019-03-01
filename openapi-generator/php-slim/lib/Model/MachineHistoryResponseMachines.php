<?php
/**
 * MachineHistoryResponseMachines
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
 * MachineHistoryResponseMachines
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class MachineHistoryResponseMachines
{
    
    /** @var string $name Machine name*/
    private $name;
    
    /** @var int $id Machine ID*/
    private $id;
    
    /** @var \OpenAPIServer\Model\MachineHistoryResponseVibrations[] $vibrations List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s*/
    private $vibrations;
}