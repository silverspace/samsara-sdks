<?php
/**
 * DocumentField
 */
namespace app\Models;

/**
 * DocumentField
 */
class DocumentField {

    /** @var double $numberValue Value of this field if this document field has valueType: ValueType_Number.*/
    private $numberValue;

    /** @var \app\Models\DocumentFieldCreatePhotoValue[] $photoValue Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.*/
    private $photoValue;

    /** @var string $stringValue Value of this field if this document field has valueType: ValueType_String.*/
    private $stringValue;

    /** @var string $valueType Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.*/
    private $valueType;

    /** @var string $label Descriptive name of this field.*/
    private $label;

    /** @var object $value DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.*/
    private $value;

}
