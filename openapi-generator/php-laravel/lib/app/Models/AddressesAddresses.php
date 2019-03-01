<?php
/**
 * AddressesAddresses
 */
namespace app\Models;

/**
 * AddressesAddresses
 */
class AddressesAddresses {

    /** @var string $notes Notes associated with an address.*/
    private $notes;

    /** @var string $formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com*/
    private $formattedAddress;

    /** @var \app\Models\AddressGeofence $geofence */
    private $geofence;

    /** @var int[] $tagIds A list of tag IDs.*/
    private $tagIds;

    /** @var string $name The name of this address/geofence*/
    private $name;

    /** @var int[] $contactIds A list of IDs for contact book entries.*/
    private $contactIds;

}
