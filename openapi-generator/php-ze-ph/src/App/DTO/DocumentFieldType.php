<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DocumentFieldType
{
    /**
     * Descriptive name of this field type.
     * @DTA\Data(field="label")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $label;
    /**
     * @DTA\Data(field="numberValueTypeMetadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DocumentFieldTypeNumberValueTypeMetadata::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\DocumentFieldTypeNumberValueTypeMetadata::class})
     * @var \App\DTO\DocumentFieldTypeNumberValueTypeMetadata
     */
    public $number_value_type_metadata;
    /**
     * The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     * @DTA\Data(field="valueType")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $value_type;
}
