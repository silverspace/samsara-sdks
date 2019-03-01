<?php
/**
 * Address
 */
namespace app\Models;

/**
 * Address
 */
class Address {

    /** @var \app\Models\Contact[] $contacts */
    private $contacts;

    /** @var string $formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com*/
    private $formattedAddress;

    /** @var \app\Models\AddressGeofence $geofence */
    private $geofence;

    /** @var int $id ID of the address*/
    private $id;

    /** @var string $name Name of the address or geofence*/
    private $name;

    /** @var string $notes Notes associated with an address.*/
    private $notes;

    /** @var \app\Models\TagMetadata[] $tags */
    private $tags;

}
