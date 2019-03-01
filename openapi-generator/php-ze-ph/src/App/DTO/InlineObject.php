<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject
{
    /**
     * @DTA\Data(field="addresses")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AddressesAddresses::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AddressesAddresses::class}}
     * }})
     * @var \App\DTO\AddressesAddresses[]
     */
    public $addresses;
}
