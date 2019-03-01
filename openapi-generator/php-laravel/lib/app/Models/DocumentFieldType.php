<?php
/**
 * DocumentFieldType
 */
namespace app\Models;

/**
 * DocumentFieldType
 */
class DocumentFieldType {

    /** @var string $label Descriptive name of this field type.*/
    private $label;

    /** @var \app\Models\DocumentFieldTypeNumberValueTypeMetadata $numberValueTypeMetadata */
    private $numberValueTypeMetadata;

    /** @var string $valueType The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.*/
    private $valueType;

}
