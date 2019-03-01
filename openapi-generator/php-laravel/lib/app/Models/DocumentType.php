<?php
/**
 * DocumentType
 */
namespace app\Models;

/**
 * DocumentType
 */
class DocumentType {

    /** @var \app\Models\array[] $fieldTypes The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.*/
    private $fieldTypes;

    /** @var string $name Name of the document type.*/
    private $name;

    /** @var int $orgId ID for the organization this document belongs to.*/
    private $orgId;

    /** @var string $uuid Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.*/
    private $uuid;

}
