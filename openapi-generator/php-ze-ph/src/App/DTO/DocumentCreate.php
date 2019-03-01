<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DocumentCreate
{
    /**
     * ID of the Samsara dispatch job for which the document is submitted
     * @DTA\Data(field="dispatchJobId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $dispatch_job_id;
    /**
     * Notes submitted with this document.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $notes;
    /**
     * Universally unique identifier for the document type this document is being created for.
     * @DTA\Data(field="documentTypeUuid")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $document_type_uuid;
    /**
     * List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
     * @DTA\Data(field="fields")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DocumentField::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DocumentField::class}}
     * }})
     * @var \App\DTO\DocumentField[]
     */
    public $fields;
}
