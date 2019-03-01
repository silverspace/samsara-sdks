<?php
/**
 * DocumentCreate
 */
namespace app\Models;

/**
 * DocumentCreate
 */
class DocumentCreate {

    /** @var int $dispatchJobId ID of the Samsara dispatch job for which the document is submitted*/
    private $dispatchJobId;

    /** @var string $notes Notes submitted with this document.*/
    private $notes;

    /** @var string $documentTypeUuid Universally unique identifier for the document type this document is being created for.*/
    private $documentTypeUuid;

    /** @var \app\Models\DocumentField[] $fields List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.*/
    private $fields;

}
