<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 */
class Address
{
    /**
     * @DTA\Data(field="contacts", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\Contact::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\Contact::class}}
     * }})
     * @var \App\DTO\Contact[]
     */
    public $contacts;
    /**
     * The full address associated with this address/geofence, as it might be recognized by maps.google.com
     * @DTA\Data(field="formattedAddress", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $formatted_address;
    /**
     * @DTA\Data(field="geofence", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AddressGeofence::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\AddressGeofence::class})
     * @var \App\DTO\AddressGeofence
     */
    public $geofence;
    /**
     * ID of the address
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * Name of the address or geofence
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * Notes associated with an address.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $notes;
    /**
     * @DTA\Data(field="tags", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\TagMetadata::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\TagMetadata::class}}
     * }})
     * @var \App\DTO\TagMetadata[]
     */
    public $tags;
}
