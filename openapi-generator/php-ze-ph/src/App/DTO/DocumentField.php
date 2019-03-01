<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DocumentField
{
    /**
     * Value of this field if this document field has valueType: ValueType_Number.
     * @DTA\Data(field="numberValue", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $number_value;
    /**
     * Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
     * @DTA\Data(field="photoValue", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DocumentFieldCreatePhotoValue::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DocumentFieldCreatePhotoValue::class}}
     * }})
     * @var \App\DTO\DocumentFieldCreatePhotoValue[]
     */
    public $photo_value;
    /**
     * Value of this field if this document field has valueType: ValueType_String.
     * @DTA\Data(field="stringValue", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $string_value;
    /**
     * Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
     * @DTA\Data(field="valueType")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $value_type;
    /**
     * Descriptive name of this field.
     * @DTA\Data(field="label")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $label;
    /**
     * DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":object::class})
     * @DTA\Validator(name="Dictionary", options={"type":object::class})
     * @var object
     */
    public $value;
}
