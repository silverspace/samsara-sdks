<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DocumentBase
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
}
