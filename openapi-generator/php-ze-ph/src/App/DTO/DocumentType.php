<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DocumentType
{
    /**
     * The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
     * @DTA\Data(field="fieldTypes", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DocumentFieldType[]::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DocumentFieldType[]::class}}
     * }})
     * @var \App\DTO\array[]
     */
    public $field_types;
    /**
     * Name of the document type.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * ID for the organization this document belongs to.
     * @DTA\Data(field="orgId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $org_id;
    /**
     * Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
     * @DTA\Data(field="uuid")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $uuid;
}
