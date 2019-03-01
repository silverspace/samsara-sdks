<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DvirBaseTrailerDefects
{
    /**
     * The comment describing the type of DVIR defect
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $comment;
    /**
     * The type of DVIR defect
     * @DTA\Data(field="defectType", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $defect_type;
}
