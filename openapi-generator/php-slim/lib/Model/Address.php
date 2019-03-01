<?php
/**
 * Address
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
 * Address
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class Address
{
    
    /** @var \OpenAPIServer\Model\Contact[] $contacts */
    private $contacts;
    
    /** @var string $formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com*/
    private $formattedAddress;
    
    /** @var \OpenAPIServer\Model\AddressGeofence $geofence */
    private $geofence;
    
    /** @var int $id ID of the address*/
    private $id;
    
    /** @var string $name Name of the address or geofence*/
    private $name;
    
    /** @var string $notes Notes associated with an address.*/
    private $notes;
    
    /** @var \OpenAPIServer\Model\TagMetadata[] $tags */
    private $tags;
}