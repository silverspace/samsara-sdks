<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
 */
class DocumentFieldTypeNumberValueTypeMetadata
{
    /**
     * Number of decimal places that values for this field type can have.
     * @DTA\Data(field="numDecimalPlaces", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $num_decimal_places;
}
