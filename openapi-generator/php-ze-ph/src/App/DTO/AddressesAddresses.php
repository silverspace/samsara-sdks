<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AddressesAddresses
{
    /**
     * Notes associated with an address.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $notes;
    /**
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     * @DTA\Data(field="formattedAddress")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $formatted_address;
    /**
     * @DTA\Data(field="geofence")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AddressGeofence::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\AddressGeofence::class})
     * @var \App\DTO\AddressGeofence
     */
    public $geofence;
    /**
     * A list of tag IDs.
     * @DTA\Data(field="tagIds", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"int"}}
     * }})
     * @var int[]
     */
    public $tag_ids;
    /**
     * The name of this address/geofence
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * A list of IDs for contact book entries.
     * @DTA\Data(field="contactIds", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Type", "options":{"type":"int"}}
     * }})
     * @var int[]
     */
    public $contact_ids;
}
