<?php
/**
 * DocumentBase
 */
namespace app\Models;

/**
 * DocumentBase
 */
class DocumentBase {

    /** @var int $dispatchJobId ID of the Samsara dispatch job for which the document is submitted*/
    private $dispatchJobId;

    /** @var string $notes Notes submitted with this document.*/
    private $notes;

}
