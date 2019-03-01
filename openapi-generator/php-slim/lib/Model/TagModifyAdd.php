<?php
/**
 * TagModifyAdd
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
 * TagModifyAdd
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class TagModifyAdd
{
    
    /** @var \OpenAPIServer\Model\TaggedAssetBase[] $assets The assets to be added to this tag.*/
    private $assets;
    
    /** @var \OpenAPIServer\Model\TaggedSensorBase[] $sensors The sensors to be added to this tag.*/
    private $sensors;
    
    /** @var \OpenAPIServer\Model\TaggedVehicleBase[] $vehicles The vehicles to be added to this tag.*/
    private $vehicles;
    
    /** @var \OpenAPIServer\Model\TaggedMachineBase[] $machines The machines to be added to this tag.*/
    private $machines;
    
    /** @var \OpenAPIServer\Model\TaggedDriverBase[] $drivers The drivers to be added to this tag.*/
    private $drivers;
}
