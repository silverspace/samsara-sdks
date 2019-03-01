<?php
/**
 * DocumentFieldCreate
 */
namespace app\Models;

/**
 * DocumentFieldCreate
 */
class DocumentFieldCreate {

    /** @var double $numberValue Value of this field if this document field has valueType: ValueType_Number.*/
    private $numberValue;

    /** @var \app\Models\DocumentFieldCreatePhotoValue[] $photoValue Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.*/
    private $photoValue;

    /** @var string $stringValue Value of this field if this document field has valueType: ValueType_String.*/
    private $stringValue;

    /** @var string $valueType Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.*/
    private $valueType;

}
