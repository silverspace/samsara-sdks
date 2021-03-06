<?php
/**
 * Asset
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
 * Asset
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class Asset
{
    
    /** @var string $assetSerialNumber Serial number of the host asset*/
    private $assetSerialNumber;
    
    /** @var \OpenAPIServer\Model\AssetCable[] $cable The cable connected to the asset*/
    private $cable;
    
    /** @var int $engineHours Engine hours*/
    private $engineHours;
    
    /** @var int $id Asset ID*/
    private $id;
    
    /** @var string $name Asset name*/
    private $name;
}
