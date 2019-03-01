<?php
/**
 * AddressesAddresses
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
 * AddressesAddresses
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class AddressesAddresses
{
    
    /** @var string $notes Notes associated with an address.*/
    private $notes;
    
    /** @var string $formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com*/
    private $formattedAddress;
    
    /** @var \OpenAPIServer\Model\AddressGeofence $geofence */
    private $geofence;
    
    /** @var int[] $tagIds A list of tag IDs.*/
    private $tagIds;
    
    /** @var string $name The name of this address/geofence*/
    private $name;
    
    /** @var int[] $contactIds A list of IDs for contact book entries.*/
    private $contactIds;
}
