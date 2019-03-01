<?php
/**
 * InlineObject1
 */
namespace app\Models;

/**
 * InlineObject1
 */
class InlineObject1 {

    /** @var int[] $contactIds A list of IDs for contact book entries.*/
    private $contactIds;

    /** @var string $formattedAddress The full address associated with this address/geofence, as it might be recognized by maps.google.com*/
    private $formattedAddress;

    /** @var \app\Models\AddressGeofence $geofence */
    private $geofence;

    /** @var string $name The name of this address/geofence*/
    private $name;

    /** @var string $notes Notes associated with an address.*/
    private $notes;

    /** @var int[] $tagIds A list of tag IDs.*/
    private $tagIds;

}
